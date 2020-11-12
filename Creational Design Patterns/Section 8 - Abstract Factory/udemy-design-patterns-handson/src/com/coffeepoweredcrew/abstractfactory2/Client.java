package com.coffeepoweredcrew.abstractfactory2;

import com.coffeepoweredcrew.abstractfactory2.aws.AwsResourceFactory;
import com.coffeepoweredcrew.abstractfactory2.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory resourceFactory) {
        this.factory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }
    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.large, 20480);
        i1.start();
        i1.stop();

        Client google = new Client(new GoogleResourceFactory());
        Instance i2 = google.createServer(Instance.Capacity.small, 16);
        i2.start();
        i2.stop();

    }

}
