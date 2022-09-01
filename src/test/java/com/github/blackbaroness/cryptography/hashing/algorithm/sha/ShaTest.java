package com.github.blackbaroness.cryptography.hashing.algorithm.sha;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class ShaTest {

    private final Sha sha = new Sha();

    @Test
    void sha0() {
        testSimpleHashing(sha.sha0(), "testing", "d793d072b6d24ed501d6c9938691f161129d5de4");
    }

    @Test
    void sha1() {
        testSimpleHashing(sha.sha1(), "testing", "dc724af18fbdd4e59189f5fe768a5f8311527050");
    }

    @Test
    void sha224() {
        testSimpleHashing(sha.sha224(), "testing", "9e8965af89bd98c015512f1eb17ae07f48494da2d9a06a8f9659f749");
    }

    @Test
    void sha256() {
        testSimpleHashing(sha.sha256(), "testing", "cf80cd8aed482d5d1527d7dc72fceff84e6326592848447d2dc0b0e87dfc9a90");
    }

    @Test
    void sha384() {
        testSimpleHashing(sha.sha384(), "testing", "cf4811d74fd40504674fc3273f824fa42f755b9660a2e902b57f1df74873db1a91a037bcee65f1a88ecd1ef57ff254c9");
    }

    @Test
    void sha512() {
        testSimpleHashing(sha.sha512(), "testing", "521b9ccefbcd14d179e7a1bb877752870a6d620938b28a66a107eac6e6805b9d0989f45b5730508041aa5e710847d439ea74cd312c9355f1f2dae08d40e41d50");
    }
}