package com.github.blackbaroness.cryptography.cipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class A1z26Test {

    private final A1z26 a1z26 = new A1z26();

    @Test
    void encode() {
        assertEquals("19-15-13-5 5-24-1-13-16-12-5 20-5-24-20", a1z26.encode("some example text"));
    }

    @Test
    void decode() {
        assertEquals("some example text", a1z26.decode("19-15-13-5 5-24-1-13-16-12-5 20-5-24-20"));
    }
}