package com.github.blackbaroness.cryptography.hashing.algorithm.sha;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.JacksumHashAlgorithm;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Sha {

    private final HashAlgorithm sha0 = new ShaAlgorithm("SHA-0");
    private final HashAlgorithm sha1 = new ShaAlgorithm("SHA-1");
    private final HashAlgorithm sha224 = new ShaAlgorithm("SHA-224");
    private final HashAlgorithm sha256 = new ShaAlgorithm("SHA-256");
    private final HashAlgorithm sha384 = new ShaAlgorithm("SHA-384");
    private final HashAlgorithm sha512 = new ShaAlgorithm("SHA-512");

    @Contract(pure = true)
    public@NotNull HashAlgorithm v0() {
        return sha0;
    }
    @Contract(pure = true)
    public@NotNull HashAlgorithm v1() {
        return sha1;
    }
    @Contract(pure = true)
    public@NotNull HashAlgorithm v224() {
        return sha224;
    }
    @Contract(pure = true)
    public@NotNull HashAlgorithm v256() {
        return sha256;
    }
    @Contract(pure = true)
    public@NotNull HashAlgorithm v384() {
        return sha384;
    }
    @Contract(pure = true)
    public@NotNull HashAlgorithm v512() {
        return sha512;
    }

    @RequiredArgsConstructor
    private static class ShaAlgorithm extends JacksumHashAlgorithm {

        private final String algorithm;

        @Override
        protected @NotNull String jacksumName() {
            return algorithm;
        }
    }
}
