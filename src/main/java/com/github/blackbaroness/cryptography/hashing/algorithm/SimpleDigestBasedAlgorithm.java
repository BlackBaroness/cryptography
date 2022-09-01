package com.github.blackbaroness.cryptography.hashing.algorithm;

import com.github.blackbaroness.cryptography.util.UnstableSupplier;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.security.MessageDigest;

@RequiredArgsConstructor
public class SimpleDigestBasedAlgorithm<T extends MessageDigest> extends DigestBasedHashAlgorithm<T> {

    private final UnstableSupplier<T> unstableSupplier;

    @Override
    protected @NotNull T createDigest() throws Throwable {
        return unstableSupplier.get();
    }
}