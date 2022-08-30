package com.github.blackbaroness.cryptography.hashing.algorithm.blake2b;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.Security;

class Blake2bInitializer {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static void init() {
    }
}
