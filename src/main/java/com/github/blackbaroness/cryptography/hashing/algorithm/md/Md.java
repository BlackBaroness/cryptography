package com.github.blackbaroness.cryptography.hashing.algorithm.md;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.JacksumHashAlgorithm;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Md {

    private final HashAlgorithm v2 = new MdAlgorithm("md2");
    private final HashAlgorithm v4 = new MdAlgorithm("md4");
    private final HashAlgorithm v5 = new MdAlgorithm("md5");

    @Contract(pure = true)
    public @NotNull HashAlgorithm v2() {
        return v2;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm v4() {
        return v4;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm v5() {
        return v5;
    }

    @RequiredArgsConstructor
    private static class MdAlgorithm extends JacksumHashAlgorithm {

        private final String algorithm;

        @Override
        protected @NotNull String jacksumName() {
            return algorithm;
        }
    }
}
