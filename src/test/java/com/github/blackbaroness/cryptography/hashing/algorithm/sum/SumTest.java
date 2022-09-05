package com.github.blackbaroness.cryptography.hashing.algorithm.sum;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class SumTest {

    private final Sum sum = new Sum();

    @Test
    void sum8() {
        testSimpleHashing(sum.sum8(), "testing", "254");
    }

    @Test
    void sum16() {
        testSimpleHashing(sum.sum16(), "testing", "766");
    }

    @Test
    void sum24() {
        testSimpleHashing(sum.sum24(), "testing", "766");
    }

    @Test
    void sum32() {
        testSimpleHashing(sum.sum32(), "testing", "766");
    }
}