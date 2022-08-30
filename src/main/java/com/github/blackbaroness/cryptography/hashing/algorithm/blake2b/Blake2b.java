package com.github.blackbaroness.cryptography.hashing.algorithm.blake2b;

import com.github.blackbaroness.cryptography.hashing.algorithm.DigestBasedHashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.util.UnstableSupplier;
import lombok.RequiredArgsConstructor;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.security.MessageDigest;
import java.security.Security;

public class Blake2b {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    private final HashAlgorithm _160 = new Blake2bAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b160::new);
    private final HashAlgorithm _256 = new Blake2bAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b256::new);
    private final HashAlgorithm _384 = new Blake2bAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b384::new);
    private final HashAlgorithm _512 = new Blake2bAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b512::new);

    @Contract(pure = true)
    public @NotNull HashAlgorithm _160() {
        return _160;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm _256() {
        return _256;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm _384() {
        return _384;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm _512() {
        return _512;
    }

    @RequiredArgsConstructor
    private static class Blake2bAlgorithm<T extends MessageDigest> extends DigestBasedHashAlgorithm<T> {

        private final UnstableSupplier<T> unstableSupplier;

        @Override
        protected @NotNull T createDigest() throws Throwable {
            return unstableSupplier.get();
        }
    }
}
