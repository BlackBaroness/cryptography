package com.github.blackbaroness.cryptography.hashing.algorithm.crc;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.JacksumChecksumBasedAlgorithm;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Crc {

    private final HashAlgorithm crc8 = new CrcAlgorithm("crc-8");
    private final HashAlgorithm crc16 = new CrcAlgorithm("crc-16");
    private final HashAlgorithm crc24 = new CrcAlgorithm("crc-24");
    private final HashAlgorithm crc32 = new CrcAlgorithm("crc-32");
    private final HashAlgorithm crc64 = new CrcAlgorithm("crc-64");

    @Contract(pure = true)
    public @NotNull HashAlgorithm crc8() {
        return crc8;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm crc16() {
        return crc16;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm crc24() {
        return crc24;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm crc32() {
        return crc32;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm crc64() {
        return crc64;
    }

    @RequiredArgsConstructor
    private static class CrcAlgorithm extends JacksumChecksumBasedAlgorithm {

        private final String algorithm;

        @Override
        protected @NotNull String jacksumName() {
            return algorithm;
        }
    }
}
