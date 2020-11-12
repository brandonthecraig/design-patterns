package com.coffeepoweredcrew.singleton;

/**
 * (Ref. Google I/O 2k8 Joshua Bloch)
 * Since Java 1.5 using enum we can create a singleton. It handles serialization using java's in-built
 * mechanism and still ensure single instance
 */
public enum RegistryEnum {

    // singleton in an Enum solves some problems
    // can't extend enums so no subclasses
    // handles serialization and deserialization issues
    // this is a thing that people can use although it's kind of dumb because nobody really serializes and deserializes singletons
    // extra fluff, just stick with LazyIODH if you want to keep it simple
    INSTANCE;

    public void getConfiguration() {

    }

}