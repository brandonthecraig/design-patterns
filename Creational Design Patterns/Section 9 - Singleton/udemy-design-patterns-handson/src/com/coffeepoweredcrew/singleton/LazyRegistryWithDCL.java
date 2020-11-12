package com.coffeepoweredcrew.singleton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL() {

    }

    // not final as it's being instantiated later
    // volatile is there tell java not to use a cached version of this reference
    private static volatile LazyRegistryWithDCL INSTANCE;

    public static LazyRegistryWithDCL getInstance() {

        // this gets hairy because two threads could be calling this and checking it at the same time
        if(INSTANCE == null) {
            // locking down the class as something that we need to synchronize across threads
            synchronized (LazyRegistryWithDCL.class) {
                // this is here again to check if another thread has hit this point and has been kept waiting
                // double check locking (DCL!)
                // blerg this is lame
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }

        return INSTANCE;
    }

 
}
