package com.github.blackbaroness.cryptography.hashing.algorithm.md;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.JacksumChecksumBasedAlgorithm;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Md {

    private final HashAlgorithm md2 = new MdAlgorithm("md2");
    private final HashAlgorithm md4 = new MdAlgorithm("md4");
    private final HashAlgorithm md5 = new MdAlgorithm("md5");

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

    @RequiredArgsConstructor
    private static class MdAlgorithm extends JacksumChecksumBasedAlgorithm {

        private final String algorithm;

        @Override
        protected @NotNull String jacksumName() {
            return algorithm;
        }
    }
}
