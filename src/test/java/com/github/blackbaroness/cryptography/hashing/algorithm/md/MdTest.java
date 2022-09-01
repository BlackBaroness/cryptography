package com.github.blackbaroness.cryptography.hashing.algorithm.md;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class MdTest {

    private final Md md = new Md();

    @Test
    void md2() {
        testSimpleHashing(md.md2(), "testing", "fc134df10d6ecafceb5c75861d01b41f");
    }

    @Test
    void md4() {
        testSimpleHashing(md.md4(), "testing", "0c2be0003f0debdcf644525bdaf6e45d");
    }

    @Test
    void md5() {
        testSimpleHashing(md.md5(), "testing", "ae2b1fca515949e5d54fb22b8ed95575");
    }
}