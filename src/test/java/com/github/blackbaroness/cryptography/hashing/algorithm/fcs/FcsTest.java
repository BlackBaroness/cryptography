package com.github.blackbaroness.cryptography.hashing.algorithm.fcs;

import com.github.blackbaroness.cryptography.test.TestHelper;
import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;
import static org.junit.jupiter.api.Assertions.*;

class FcsTest {

    private final Fcs fcs = new Fcs();

    @Test
    void fcs16() {
        testSimpleHashing(fcs.fcs16(), "testing", "12357");
    }

    @Test
    void fcs32() {
        testSimpleHashing(fcs.fcs32(), "testing", "3908262406");
    }
}