package com.github.blackbaroness.cryptography.hashing.algorithm;

import com.github.blackbaroness.cryptography.util.LazyValue;
import org.bouncycastle.util.encoders.Hex;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.security.MessageDigest;

public abstract class ResettableDigestBasedHashingAlgorithm<T extends MessageDigest> implements HashingAlgorithm {

    private final LazyValue<T> digestHolder = new LazyValue<>(this::initDigest);

    @Override
    public @NotNull String hash(@NotNull String input) {
        String result;
        try {
            T messageDigest = digestHolder.get();
            result = Hex.toHexString(messageDigest.digest(input.getBytes()));
            messageDigest.reset();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return result;
    }


    @Contract(value = "-> new", pure = true)
    protected abstract @NotNull T initDigest() throws Throwable;
}
