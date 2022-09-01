package com.github.blackbaroness.cryptography.hashing.algorithm.whirlpool;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleJacksumChecksumAlgorithm;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Whirlpool {

    private final HashAlgorithm whirlpool0 = new SimpleJacksumChecksumAlgorithm("whirlpool0");
    private final HashAlgorithm whirlpool1 = new SimpleJacksumChecksumAlgorithm("whirlpool1");
    private final HashAlgorithm whirlpool2 = new SimpleJacksumChecksumAlgorithm("whirlpool2");

    @Contract(pure = true)
    public @NotNull HashAlgorithm whirlpool0() {
        return whirlpool0;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm whirlpool1() {
        return whirlpool1;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm whirlpool2() {
        return whirlpool2;
    }
}
