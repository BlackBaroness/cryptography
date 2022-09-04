package com.github.blackbaroness.cryptography.hashing.algorithm.skein;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class SkeinTest {

    private final Skein skein = new Skein();

    @Test
    void skein256_128() {
        testSimpleHashing(skein.skein256_128(), "testing", "52cbcb7ca2c7193717253f1988c146a1");
    }

    @Test
    void skein256_160() {
        testSimpleHashing(skein.skein256_160(), "testing", "9d5c131ec7eb28d483cfb8a12f90b2754d12b1fb");
    }

    @Test
    void skein256_224() {
        testSimpleHashing(skein.skein256_224(), "testing", "df295f71a350aa141776d3f7df2ab30c68e24a932b54b87f618eb609");
    }

    @Test
    void skein256_256() {
        testSimpleHashing(skein.skein256_256(), "testing", "e02348353cc3d62234a1caabd7e981482c5790c7b155c458760be03c5dcbf576");
    }

    @Test
    void skein512_128() {
        testSimpleHashing(skein.skein512_128(), "testing", "4eb0f0755eb80bed9fd093b3e2846461");
    }

    @Test
    void skein512_160() {
        testSimpleHashing(skein.skein512_160(), "testing", "3ab4d64058d5266b2901262be8ad78a125bfc841");
    }

    @Test
    void skein512_224() {
        testSimpleHashing(skein.skein512_224(), "testing", "11b388faf18a00633098d779f582dbdb47937f5fb6e36b3e6da99be3");
    }

    @Test
    void skein512_256() {
        testSimpleHashing(skein.skein512_256(), "testing", "701dd01b1da2d5cb34e4419746db06563166e61012ad6aa4b2e6f5b870657d8b");
    }

    @Test
    void skein512_384() {
        testSimpleHashing(skein.skein512_384(), "testing", "3a686ff37c3efe54c426e720682590958337ec94bdaf4d237361432cb89a1311b2250814eb17397bdb196e04df90f384");
    }

    @Test
    void skein512_512() {
        testSimpleHashing(skein.skein512_512(), "testing", "6bb105369b2c717e0baf0d4cdc1d6d0b7d981a284095ad18cd1ce24b80dcaffaf14022d5773cdb3374d1e945bd62e70da06c67eb521af5f2b578093015e47814");
    }

    @Test
    void skein1024_384() {
        testSimpleHashing(skein.skein1024_384(), "testing", "2a336a9b63982db1b8716a66df73c0875d1e7636783b185c9b3bc39a7cc5588ef863abacc9902cb701b5d79505753d9d");
    }

    @Test
    void skein1024_512() {
        testSimpleHashing(skein.skein1024_512(), "testing", "49a57a3916acd8e84894b690212f93308abebd2f6a61d4cca28c046b943b996e1a9b78c48bfb3af8e4fd8e5d93b038e49369cb33ceceb4e557790c11feb3e001");
    }

    @Test
    void skein1024_1024() {
        testSimpleHashing(skein.skein1024_1024(), "testing", "4e0282f3cb5f4d0dd15cc8a69ba7577c3b9932019873b97d1563afd59ce853ac75edcd71c6545a16c29982860e097ebdcf0df107b96be4e91f39378b0375c8c91f2f85e180e0f809a516016f1c78ba16812f2b185f183cbfd25e120e1eb53ae35cfb26a33d2b7b62acb8f63052def70163ac2583be907e713e231b22498f3ba6");
    }
}