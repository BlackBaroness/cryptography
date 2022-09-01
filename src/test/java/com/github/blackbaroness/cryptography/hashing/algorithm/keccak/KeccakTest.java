package com.github.blackbaroness.cryptography.hashing.algorithm.keccak;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class KeccakTest {

    private final Keccak keccak = new Keccak();

    @Test
    void keccak224() {
        testSimpleHashing(keccak.keccak224(), "test", "3be30a9ff64f34a5861116c5198987ad780165f8366e67aff4760b5e");
    }

    @Test
    void keccak256() {
        testSimpleHashing(keccak.keccak256(), "test", "9c22ff5f21f0b81b113e63f7db6da94fedef11b2119b4088b89664fb9a3cb658");
    }

    @Test
    void keccak288() {
        testSimpleHashing(keccak.keccak288(), "test", "546cafaf20237cb24661a98a1ba1b8fd040c69f96b4bbdb84fff6bd6abbe49c864a81e72");
    }

    @Test
    void keccak384() {
        testSimpleHashing(keccak.keccak384(), "test", "53d0ba137307d4c2f9b6674c83edbd58b70c0f4340133ed0adc6fba1d2478a6a03b7788229e775d2de8ae8c0759d0527");
    }

    @Test
    void keccak512() {
        testSimpleHashing(keccak.keccak512(), "test", "1e2e9fc2002b002d75198b7503210c05a1baac4560916a3c6d93bcce3a50d7f00fd395bf1647b9abb8d1afcc9c76c289b0c9383ba386a956da4b38934417789e");
    }
}