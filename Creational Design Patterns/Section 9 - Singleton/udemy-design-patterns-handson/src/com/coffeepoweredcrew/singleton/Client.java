package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {

		// get hold of singleton instance like so
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry1 = EagerRegistry.getInstance();

		// same instance being used
		System.out.println(registry);
		System.out.println(registry1);
		System.out.println(registry == registry1);
		System.out.println("-------");

		LazyRegistryWithDCL registryWithDCL = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL registryWithDCL1 = LazyRegistryWithDCL.getInstance();

		System.out.println(registryWithDCL == registryWithDCL1);
		System.out.println("-------");

		// if we just make a reference the class is referenced but not yet loaded
		LazyRegistryIODH singleton;
		System.out.println("Done");

		LazyRegistryIODH.getInstance();
		System.out.println("Message in constructor is called here");

		// not called a second time, only created once
		LazyRegistryIODH.getInstance();
		System.out.println("Message in constructor not called here");

	}

}
