package com.github.blackbaroness.cryptography.hashing.algorithm.xor;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class Xor8Test {

    @Test
    void test() {
        testSimpleHashing(new Xor8(), "testing", "118");
    }
}