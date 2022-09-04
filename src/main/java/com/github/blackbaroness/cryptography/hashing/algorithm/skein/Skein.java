package com.github.blackbaroness.cryptography.hashing.algorithm.skein;

import com.github.blackbaroness.cryptography.hashing.algorithm.BouncyCastleInitializer;
import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleDigestBasedAlgorithm;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Skein {

    static {
        BouncyCastleInitializer.init();
    }

    private final HashAlgorithm skein256_128 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_256_128::new);
    private final HashAlgorithm skein256_160 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_256_160::new);
    private final HashAlgorithm skein256_224 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_256_224::new);
    private final HashAlgorithm skein256_256 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_256_256::new);

    private final HashAlgorithm skein512_128 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_512_128::new);
    private final HashAlgorithm skein512_160 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_512_160::new);
    private final HashAlgorithm skein512_224 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_512_224::new);
    private final HashAlgorithm skein512_256 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_512_256::new);
    private final HashAlgorithm skein512_384 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_512_384::new);
    private final HashAlgorithm skein512_512 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_512_512::new);

    private final HashAlgorithm skein1024_384 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_1024_384::new);
    private final HashAlgorithm skein1024_512 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_1024_512::new);
    private final HashAlgorithm skein1024_1024 = new SimpleDigestBasedAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Skein.Digest_1024_1024::new);

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein256_128() {
        return skein256_128;
    }

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein256_160() {
        return skein256_160;
    }

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein256_224() {
        return skein256_224;
    }

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein256_256() {
        return skein256_256;
    }

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein512_128() {
        return skein512_128;
    }

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein512_160() {
        return skein512_160;
    }

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein512_224() {
        return skein512_224;
    }

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein512_256() {
        return skein512_256;
    }

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein512_384() {
        return skein512_384;
    }

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein512_512() {
        return skein512_512;
    }

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein1024_384() {
        return skein1024_384;
    }

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein1024_512() {
        return skein1024_512;
    }

    @Contract(pure = true)
    @NotNull
    public HashAlgorithm skein1024_1024() {
        return skein1024_1024;
    }
}
