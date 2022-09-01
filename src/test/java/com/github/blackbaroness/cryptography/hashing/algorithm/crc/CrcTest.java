package com.github.blackbaroness.cryptography.hashing.algorithm.crc;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class CrcTest {

    private final Crc crc = new Crc();

    @Test
    void crc8() {
        testSimpleHashing(crc.crc8(), "test", "185");
    }

    @Test
    void crc16() {
        testSimpleHashing(crc.crc16(), "test", "63534");
    }

    @Test
    void crc24() {
        testSimpleHashing(crc.crc24(), "test", "16281296");
    }

    @Test
    void crc32() {
        testSimpleHashing(crc.crc32(), "test", "3632233996");
    }

    @Test
    void crc64() {
        testSimpleHashing(crc.crc64(), "test", "47838d37c0000000");
    }
}