package com.github.blackbaroness.cryptography.hashing.algorithm.ripemd;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleJacksumChecksumAlgorithm;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Ripemd {

    private final HashAlgorithm ripemd128 = new SimpleJacksumChecksumAlgorithm("ripemd-128");
    private final HashAlgorithm ripemd160 = new SimpleJacksumChecksumAlgorithm("ripemd-160");
    private final HashAlgorithm ripemd256 = new SimpleJacksumChecksumAlgorithm("ripemd-256");
    private final HashAlgorithm ripemd320 = new SimpleJacksumChecksumAlgorithm("ripemd-320");

    @Contract(pure = true)
    public HashAlgorithm ripemd128() {
        return ripemd128;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm ripemd160() {
        return ripemd160;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm ripemd256() {
        return ripemd256;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm ripemd320() {
        return ripemd320;
    }
}
