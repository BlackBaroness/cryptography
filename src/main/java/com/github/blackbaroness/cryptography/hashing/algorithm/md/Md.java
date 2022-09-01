package com.github.blackbaroness.cryptography.hashing.algorithm.md;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleJacksumChecksumAlgorithm;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Md {

    private final HashAlgorithm md2 = new SimpleJacksumChecksumAlgorithm("md2");
    private final HashAlgorithm md4 = new SimpleJacksumChecksumAlgorithm("md4");
    private final HashAlgorithm md5 = new SimpleJacksumChecksumAlgorithm("md5");

    @Contract(pure = true)
    public @NotNull HashAlgorithm md2() {
        return md2;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm md4() {
        return md4;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm md5() {
        return md5;
    }
}
