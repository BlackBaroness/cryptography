package com.github.blackbaroness.cryptography.hashing.algorithm.blake2s;

import com.github.blackbaroness.cryptography.hashing.algorithm.BouncyCastleInitializer;
import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleDigestBasedAlgorithm;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Blake2s {

    static {
        BouncyCastleInitializer.init();
    }

    private final HashAlgorithm blake2s_128 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2s.Blake2s128::new);
    private final HashAlgorithm blake2s_160 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2s.Blake2s160::new);
    private final HashAlgorithm blake2s_224 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2s.Blake2s224::new);
    private final HashAlgorithm blake2s_256 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2s.Blake2s256::new);

    @Contract(pure = true)
    public @NotNull HashAlgorithm blake2s_128() {
        return blake2s_128;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm blake2s_160() {
        return blake2s_160;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm blake2s_224() {
        return blake2s_224;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm blake2s_256() {
        return blake2s_256;
    }
}
