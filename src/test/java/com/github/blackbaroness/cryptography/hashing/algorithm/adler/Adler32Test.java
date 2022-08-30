package com.github.blackbaroness.cryptography.hashing.algorithm.adler;

import com.github.blackbaroness.cryptography.hashing.source.HashSources;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Adler32Test {

    @Test
    void test() {
        assertEquals(
                "203293439",
                new Adler32().hash(HashSources.ofString("testing")).string()
        );
    }
}