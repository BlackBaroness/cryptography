package com.github.blackbaroness.cryptography.hashing.algorithm.sm3;

import com.github.blackbaroness.cryptography.test.TestHelper;
import org.junit.jupiter.api.Test;

class Sm3Test {

    @Test
    void test() {
        TestHelper.testSimpleHashing(new Sm3(), "testing", "4e14b71330132c92655bef624a43e1294f9159373f5a7407956b05bf95405dcf");
    }
}