package com.github.blackbaroness.cryptography.hashing.algorithm.blake2b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("NewClassNamingConvention")
class Blake2b_384Test {

    @Test
    void test() {
        assertEquals(
                "65a6119247ca481f3f52ae8a55d81d54c342268bfce908639e74768c4b56f9337e76ae04958cbefb4b9fe0da86c8a32b",
                new Blake2b_384().hash("testing")
        );
    }
}