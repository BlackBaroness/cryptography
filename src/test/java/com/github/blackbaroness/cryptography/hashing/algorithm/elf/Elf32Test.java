package com.github.blackbaroness.cryptography.hashing.algorithm.elf;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class Elf32Test {

    @Test
    void test() {
        testSimpleHashing(new Elf32(), "testing", "181055543");
    }
}