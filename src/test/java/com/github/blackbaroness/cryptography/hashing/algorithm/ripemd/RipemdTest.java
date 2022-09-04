package com.github.blackbaroness.cryptography.hashing.algorithm.ripemd;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class RipemdTest {

    private final Ripemd ripemd = new Ripemd();

    @Test
    void ripemd128() {
        testSimpleHashing(ripemd.ripemd128(), "testing", "03399a40f1ec2330fffcfcf6986e7091");
    }

    @Test
    void ripemd160() {
        testSimpleHashing(ripemd.ripemd160(), "testing", "b89ba156b40bed29a5965684b7d244c49a3a769b");
    }

    @Test
    void ripemd256() {
        testSimpleHashing(ripemd.ripemd256(), "testing", "bb6ce43d9d2a06d4cedb28a5e674e033546f79eec9b7aa045cfde5e98ebaf7f8");
    }

    @Test
    void ripemd320() {
        testSimpleHashing(ripemd.ripemd320(), "testing", "bbca34636981e96d41dffa9be4b345f75def4a2dd97f266219baa60da1ae58e106b3b72aab1d6ad5");
    }
}