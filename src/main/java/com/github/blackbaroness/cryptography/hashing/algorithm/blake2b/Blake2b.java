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

    private final HashAlgorithm blake2b_160 = new Blake2bAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b160::new);
    private final HashAlgorithm blake2b_256 = new Blake2bAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b256::new);
    private final HashAlgorithm blake2b_384 = new Blake2bAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b384::new);
    private final HashAlgorithm blake2b_512 = new Blake2bAlgorithm<>(org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b512::new);

    @Contract(pure = true)
    public @NotNull HashAlgorithm v160() {
        return blake2b_160;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm v256() {
        return blake2b_256;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm v384() {
        return blake2b_384;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm v512() {
        return blake2b_512;
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
