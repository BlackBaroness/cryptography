package com.github.blackbaroness.cryptography.hashing.algorithm.crc;

import com.github.blackbaroness.cryptography.hashing.source.HashSources;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CrcTest {

    private final Crc crc = new Crc();

    @Test
    void crc8() {
        assertEquals("185", crc.crc8().hash(HashSources.ofString("test")).string());
    }

    @Test
    void crc16() {
        assertEquals("63534", crc.crc16().hash(HashSources.ofString("test")).string());
    }

    @Test
    void crc24() {
        assertEquals("16281296", crc.crc24().hash(HashSources.ofString("test")).string());
    }

    @Test
    void crc32() {
        assertEquals("3632233996", crc.crc32().hash(HashSources.ofString("test")).string());
    }

    @Test
    void crc64() {
        assertEquals("47838d37c0000000", crc.crc64().hash(HashSources.ofString("test")).string());
    }
}