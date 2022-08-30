package com.github.blackbaroness.cryptography.hashing.algorithm.adler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Adler32Test {

    @Test
    void test() {
        assertEquals("203293439", new Adler32().hash("testing"));
    }
}