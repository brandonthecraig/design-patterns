package com.coffeepoweredcrew.singleton;
/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {

    // constructor is private
    // only one instance so no one can create it
    // can't inherit because subclasses can't use a private constructor
    private EagerRegistry() {

    }

    // static final instance created
    private static final EagerRegistry INSTANCE = new EagerRegistry();

    // accessible from anyone through this
    public static EagerRegistry getInstance() {
        return INSTANCE;
    }

}