package com.github.blackbaroness.cryptography.hashing.algorithm.tiger;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleJacksumChecksumAlgorithm;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Tiger {

    private final HashAlgorithm tiger = new SimpleJacksumChecksumAlgorithm("Tiger");
    private final HashAlgorithm tiger2 = new SimpleJacksumChecksumAlgorithm("Tiger2");
    private final HashAlgorithm tiger128 = new SimpleJacksumChecksumAlgorithm("Tiger-128");
    private final HashAlgorithm tiger160 = new SimpleJacksumChecksumAlgorithm("Tiger-160");

    @Contract(pure = true)
    public @NotNull HashAlgorithm tiger() {
        return tiger;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm tiger2() {
        return tiger2;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm tiger128() {
        return tiger128;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm tiger160() {
        return tiger160;
    }
}
