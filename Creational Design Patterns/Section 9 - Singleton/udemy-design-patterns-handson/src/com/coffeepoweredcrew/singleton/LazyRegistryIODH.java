package com.coffeepoweredcrew.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {

    // say we dont want to handle synchronization

    private LazyRegistryIODH() {
        System.out.println("In LazyRegistryIODH singleton");
    }

    private static class RegistryHolder {
        // by not declaring the static variable in the main class you are ensuring that the class loader won't load this until
        // someone calls the inner class
        // pretty high level stuff bro
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();

    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }

}
