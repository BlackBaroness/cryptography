package com.github.blackbaroness.cryptography.hashing.algorithm.has;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class HasTest {

    @Test
    void test() {
        testSimpleHashing(new Has(), "testing", "066982e01a25afa4530536c4f5edc651b939c826");
    }

}