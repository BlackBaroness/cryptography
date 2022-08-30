package com.github.blackbaroness.cryptography.hashing.algorithm.md;

import com.github.blackbaroness.cryptography.hashing.source.HashSources;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MdTest {

    private final Md md = new Md();

    @Test
    void v2() {
        assertEquals("fc134df10d6ecafceb5c75861d01b41f", md.v2().hash(HashSources.ofString("testing")).string());
    }

    @Test
    void v4() {
        assertEquals("0c2be0003f0debdcf644525bdaf6e45d", md.v4().hash(HashSources.ofString("testing")).string());
    }

    @Test
    void v5() {
        assertEquals("ae2b1fca515949e5d54fb22b8ed95575", md.v5().hash(HashSources.ofString("testing")).string());
    }
}