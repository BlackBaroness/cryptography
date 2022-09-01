package com.github.blackbaroness.cryptography.hashing.algorithm.adler;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class Adler32Test {

    @Test
    void test() {
        testSimpleHashing(new Adler32(), "testing", "203293439");
    }
}