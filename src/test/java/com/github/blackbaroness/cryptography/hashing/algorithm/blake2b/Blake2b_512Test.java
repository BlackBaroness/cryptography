package com.github.blackbaroness.cryptography.hashing.algorithm.blake2b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("NewClassNamingConvention")
class Blake2b_512Test {

    @Test
    void test() {
        assertEquals(
                "ebe9280817d5223a6f8ac5934680784aac5c48533779e9d9a01819da920a7937bc1c3c5ba9e6099567c4e74a3abc57e07d2c77797dbb78fed1dbcfb8cd503c29",
                new Blake2b_512().hash("testing")
        );
    }
}