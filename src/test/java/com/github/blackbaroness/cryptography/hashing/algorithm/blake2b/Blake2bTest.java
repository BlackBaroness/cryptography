package com.github.blackbaroness.cryptography.hashing.algorithm.blake2b;

import com.github.blackbaroness.cryptography.hashing.source.HashSources;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Blake2bTest {

    private final Blake2b blake2b = new Blake2b();

    @Test
    void v160() {
        assertEquals(
                "29dd08796a3b9decb7295ddda81276a482622a2d",
                blake2b.v160().hash(HashSources.ofString("testing")).string()
        );
    }

    @Test
    void v256() {
        assertEquals(
                "99397ff32ae348b8b6536d5c213f343d7e9fdeaa10e8a23a9f90ab21a1658565",
                blake2b.v256().hash(HashSources.ofString("testing")).string()
        );
    }

    @Test
    void v384() {
        assertEquals(
                "65a6119247ca481f3f52ae8a55d81d54c342268bfce908639e74768c4b56f9337e76ae04958cbefb4b9fe0da86c8a32b",
                blake2b.v384().hash(HashSources.ofString("testing")).string()
        );
    }

    @Test
    void v512() {
        assertEquals(
                "ebe9280817d5223a6f8ac5934680784aac5c48533779e9d9a01819da920a7937bc1c3c5ba9e6099567c4e74a3abc57e07d2c77797dbb78fed1dbcfb8cd503c29",
                blake2b.v512().hash(HashSources.ofString("testing")).string()
        );
    }
}