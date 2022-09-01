package com.github.blackbaroness.cryptography.hashing.algorithm.tiger;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.JacksumChecksumBasedAlgorithm;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Tiger {

    private final HashAlgorithm tiger = new TigerAlgorithm("Tiger");
    private final HashAlgorithm tiger2 = new TigerAlgorithm("Tiger2");
    private final HashAlgorithm tiger128 = new TigerAlgorithm("Tiger-128");
    private final HashAlgorithm tiger160 = new TigerAlgorithm("Tiger-160");

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

    @RequiredArgsConstructor
    private static class TigerAlgorithm extends JacksumChecksumBasedAlgorithm {

        private final String algorithm;

        @Override
        protected @NotNull String jacksumName() {
            return algorithm;
        }
    }
}
