package com.github.blackbaroness.cryptography.hashing.algorithm.fcs;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleJacksumChecksumAlgorithm;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Fcs {

    private final HashAlgorithm fcs16 = new SimpleJacksumChecksumAlgorithm("fcs16");
    private final HashAlgorithm fcs32 = new SimpleJacksumChecksumAlgorithm("fcs32");

    @Contract(pure = true)
    public @NotNull HashAlgorithm fcs16() {
        return fcs16;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm fcs32() {
        return fcs32;
    }
}
