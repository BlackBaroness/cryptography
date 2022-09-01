package com.github.blackbaroness.cryptography.hashing.algorithm;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.Security;

public class BouncyCastleInitializer {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static void init() {
    }
}
