package com.github.blackbaroness.cryptography.hashing.algorithm.whirlpool;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class WhirlpoolTest {

    private final Whirlpool whirlpool = new Whirlpool();

    @Test
    void whirlpool0() {
        testSimpleHashing(whirlpool.whirlpool0(), "testing", "0339ea099964726f0883edf3b59d133ef03fb83ffa1c6d25203b374bde9403626fd3b0e0e27e3d4bccc41daf86b42e7b0b20c8033794c2c4b709a3ef846982dd");
    }

    @Test
    void whirlpool1() {
        testSimpleHashing(whirlpool.whirlpool1(), "testing", "64cb43c8f22232e3b0e238912607a68883bea46146c4cc31402bf53bf0999a15fbd3e141046ba191049ea8715aff89bbbffe0732308510a4f4605a6fe0f2bfd2");
    }

    @Test
    void whirlpool() {
        testSimpleHashing(whirlpool.whirlpool2(), "testing", "3619bfe523bfdd5ad2f0ac60d4c2160a46405ab98bce43356de7165157fbb90098891201b1de661ce57f9db6ad514e529c7e5cd88943e79b37fd501b4c23d0bc");
    }
}