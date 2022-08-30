package com.github.blackbaroness.cryptography.hashing.algorithm.blake2b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("NewClassNamingConvention")
class Blake2b_256Test {

    @Test
    void test() {
        assertEquals(
                "99397ff32ae348b8b6536d5c213f343d7e9fdeaa10e8a23a9f90ab21a1658565",
                new Blake2b_256().hash("testing")
        );
    }
}