package com.github.blackbaroness.cryptography.hashing.algorithm.crc;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.JacksumHashAlgorithm;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Crc {

    private final HashAlgorithm v8 = new CrcAlgorithm("crc-8");
    private final HashAlgorithm v16 = new CrcAlgorithm("crc-16");
    private final HashAlgorithm v24 = new CrcAlgorithm("crc-24");
    private final HashAlgorithm v32 = new CrcAlgorithm("crc-32");
    private final HashAlgorithm v64 = new CrcAlgorithm("crc-64");

    @Contract(pure = true)
    public @NotNull HashAlgorithm v8() {
        return v8;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm v16() {
        return v16;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm v24() {
        return v24;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm v32() {
        return v32;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm v64() {
        return v64;
    }

    @RequiredArgsConstructor
    private static class CrcAlgorithm extends JacksumHashAlgorithm {

        private final String algorithm;

        @Override
        protected @NotNull String jacksumName() {
            return algorithm;
        }
    }
}
