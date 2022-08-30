package com.github.blackbaroness.cryptography.hashing.algorithm.blake2b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("NewClassNamingConvention")
class Blake2b_160Test {

    @Test
    void test() {
        assertEquals(
                "29dd08796a3b9decb7295ddda81276a482622a2d",
                new Blake2b_160().hash("testing")
        );
    }
}