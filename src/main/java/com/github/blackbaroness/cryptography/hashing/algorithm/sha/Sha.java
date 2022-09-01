package com.github.blackbaroness.cryptography.hashing.algorithm.sha;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleJacksumChecksumAlgorithm;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Sha {

    private final HashAlgorithm sha0 = new SimpleJacksumChecksumAlgorithm("SHA-0");
    private final HashAlgorithm sha1 = new SimpleJacksumChecksumAlgorithm("SHA-1");
    private final HashAlgorithm sha224 = new SimpleJacksumChecksumAlgorithm("SHA-224");
    private final HashAlgorithm sha256 = new SimpleJacksumChecksumAlgorithm("SHA-256");
    private final HashAlgorithm sha384 = new SimpleJacksumChecksumAlgorithm("SHA-384");
    private final HashAlgorithm sha512 = new SimpleJacksumChecksumAlgorithm("SHA-512");

    @Contract(pure = true)
    public @NotNull HashAlgorithm sha0() {
        return sha0;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm sha1() {
        return sha1;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm sha224() {
        return sha224;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm sha256() {
        return sha256;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm sha384() {
        return sha384;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm sha512() {
        return sha512;
    }
}
