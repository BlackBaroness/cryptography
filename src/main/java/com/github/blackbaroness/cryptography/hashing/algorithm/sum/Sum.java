package com.github.blackbaroness.cryptography.hashing.algorithm.sum;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleJacksumChecksumAlgorithm;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Sum {

    private final HashAlgorithm sum8 = new SimpleJacksumChecksumAlgorithm("sum8");
    private final HashAlgorithm sum16 = new SimpleJacksumChecksumAlgorithm("sum16");
    private final HashAlgorithm sum24 = new SimpleJacksumChecksumAlgorithm("sum24");
    private final HashAlgorithm sum32 = new SimpleJacksumChecksumAlgorithm("sum32");

    @Contract(pure = true)
    public @NotNull HashAlgorithm sum8() {
        return sum8;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm sum16() {
        return sum16;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm sum24() {
        return sum24;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm sum32() {
        return sum32;
    }
}
