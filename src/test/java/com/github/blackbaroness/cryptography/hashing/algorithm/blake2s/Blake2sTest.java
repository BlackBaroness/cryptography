package com.github.blackbaroness.cryptography.hashing.algorithm.blake2s;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class Blake2sTest {

    private final Blake2s blake2s = new Blake2s();

    @Test
    void blake2s_128() {
        testSimpleHashing(blake2s.blake2s_128(), "testing", "b63cb3c2348f76ac64455e6a1fef3b3f");
    }

    @Test
    void blake2s_160() {
        testSimpleHashing(blake2s.blake2s_160(), "testing", "6acaa5f0179e86d0b8dc4c73bb19b5ba28f75193");
    }

    @Test
    void blake2s_224() {
        testSimpleHashing(blake2s.blake2s_224(), "testing", "7aa6dd6066c7152eef573e56b3b280428d54decc1539325ac8dd3c6b");
    }

    @Test
    void blake2s_256() {
        testSimpleHashing(blake2s.blake2s_256(), "testing", "e2c65a953f92e8843c99e7db0cddd03e0b27d701f033c349ce3ae525de190955");
    }
}