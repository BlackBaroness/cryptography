package com.github.blackbaroness.cryptography.hashing.algorithm.tiger;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class TigerTest {

    private final Tiger tiger = new Tiger();

    @Test
    void tiger() {
        testSimpleHashing(tiger.tiger(), "testing", "1f5fa5df7393dbe3ce6f3e24272cd272245298d843a5311d");
    }

    @Test
    void tiger2() {
        testSimpleHashing(tiger.tiger2(), "testing", "a87b6f460ac838dbb0e7923ce62f76294f1f99ddef8192b6");
    }

    @Test
    void tiger128() {
        testSimpleHashing(tiger.tiger128(), "testing", "1f5fa5df7393dbe3ce6f3e24272cd272");
    }

    @Test
    void tiger160() {
        testSimpleHashing(tiger.tiger160(), "testing", "1f5fa5df7393dbe3ce6f3e24272cd272245298d8");
    }
}