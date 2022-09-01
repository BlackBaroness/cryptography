package com.github.blackbaroness.cryptography.hashing.algorithm.keccak;

import com.github.blackbaroness.cryptography.hashing.algorithm.BouncyCastleInitializer;
import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleDigestBasedAlgorithm;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Keccak {

    static {
        BouncyCastleInitializer.init();
    }

    private final HashAlgorithm keccak224 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Keccak.Digest224::new);
    private final HashAlgorithm keccak256 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Keccak.Digest256::new);
    private final HashAlgorithm keccak288 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Keccak.Digest288::new);
    private final HashAlgorithm keccak384 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Keccak.Digest384::new);
    private final HashAlgorithm keccak512 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Keccak.Digest512::new);

    @Contract(pure = true)
    public @NotNull HashAlgorithm keccak224() {
        return keccak224;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm keccak256() {
        return keccak256;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm keccak288() {
        return keccak288;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm keccak384() {
        return keccak384;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm keccak512() {
        return keccak512;
    }
}
