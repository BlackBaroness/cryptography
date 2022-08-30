package com.github.blackbaroness.cryptography.hashing.algorithm.crc;

import com.github.blackbaroness.cryptography.hashing.source.HashSources;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CrcTest {

    private final Crc crc = new Crc();

    @Test
    void v8() {
        assertEquals("185", crc.v8().hash(HashSources.ofString("test")).string());
    }

    @Test
    void v16() {
        assertEquals("63534", crc.v16().hash(HashSources.ofString("test")).string());
    }

    @Test
    void v24() {
        assertEquals("16281296", crc.v24().hash(HashSources.ofString("test")).string());
    }

    @Test
    void v32() {
        assertEquals("3632233996", crc.v32().hash(HashSources.ofString("test")).string());
    }

    @Test
    void v64() {
        assertEquals("47838d37c0000000", crc.v64().hash(HashSources.ofString("test")).string());
    }
}