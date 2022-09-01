package com.github.blackbaroness.cryptography.hashing.algorithm.blake2b;

import com.github.blackbaroness.cryptography.hashing.algorithm.BouncyCastleInitializer;
import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleDigestBasedAlgorithm;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Blake2b {

    static {
        BouncyCastleInitializer.init();
    }

    private final HashAlgorithm blake2b_160 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b160::new);
    private final HashAlgorithm blake2b_256 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b256::new);
    private final HashAlgorithm blake2b_384 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b384::new);
    private final HashAlgorithm blake2b_512 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b512::new);

    @Contract(pure = true)
    public @NotNull HashAlgorithm blake2b_160() {
        return blake2b_160;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm blake2b_256() {
        return blake2b_256;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm blake2b_384() {
        return blake2b_384;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm blake2b_512() {
        return blake2b_512;
    }
}
