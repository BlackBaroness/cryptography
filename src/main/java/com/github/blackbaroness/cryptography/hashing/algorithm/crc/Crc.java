package com.github.blackbaroness.cryptography.hashing.algorithm.crc;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleJacksumChecksumAlgorithm;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Crc {

    private final HashAlgorithm crc8 = new SimpleJacksumChecksumAlgorithm("crc-8");
    private final HashAlgorithm crc16 = new SimpleJacksumChecksumAlgorithm("crc-16");
    private final HashAlgorithm crc24 = new SimpleJacksumChecksumAlgorithm("crc-24");
    private final HashAlgorithm crc32 = new SimpleJacksumChecksumAlgorithm("crc-32");
    private final HashAlgorithm crc64 = new SimpleJacksumChecksumAlgorithm("crc-64");

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
}
