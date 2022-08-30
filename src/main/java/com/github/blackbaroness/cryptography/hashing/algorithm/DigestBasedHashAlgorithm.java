package com.github.blackbaroness.cryptography.hashing.algorithm;

import com.github.blackbaroness.cryptography.hashing.result.HashResult;
import com.github.blackbaroness.cryptography.hashing.result.ImmutableHashResult;
import com.github.blackbaroness.cryptography.hashing.source.HashSource;
import com.github.blackbaroness.cryptography.util.ThreadLocalUtil;
import org.bouncycastle.util.encoders.Hex;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.security.MessageDigest;

public abstract class DigestBasedHashAlgorithm<T extends MessageDigest> implements HashAlgorithm {

    private final ThreadLocal<T> digestHolder = ThreadLocalUtil.withInitial(this::createDigest);

    @Override
    public @NotNull HashResult hash(@NotNull HashSource input) {
        try {
            T messageDigest = digestHolder.get();
            final byte[] digest = messageDigest.digest(input.bytes());
            messageDigest.reset();
            return new ImmutableHashResult(digest, Hex.toHexString(digest));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @Contract(value = "-> new", pure = true)
    protected abstract @NotNull T createDigest() throws Throwable;
}
