package com.github.blackbaroness.cryptography.hashing.algorithm;

import net.jacksum.JacksumAPI;
import net.jacksum.algorithms.AbstractChecksum;
import org.apache.commons.lang3.concurrent.ConcurrentException;
import org.apache.commons.lang3.concurrent.LazyInitializer;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.security.NoSuchAlgorithmException;

public abstract class JacksumHashingAlgorithm implements HashingAlgorithm {

    private final LazyInitializer<AbstractChecksum> jacksumHolder = new LazyInitializer<AbstractChecksum>() {
        @Override
        protected AbstractChecksum initialize() throws ConcurrentException {
            try {
                return JacksumAPI.getChecksumInstance(jacksumName());
            } catch (NoSuchAlgorithmException e) {
                throw new ConcurrentException(e);
            }
        }
    };

    @Contract(pure = true)
    protected @NotNull AbstractChecksum getChecksumInstance() throws RuntimeException {
        try {
            return jacksumHolder.get();
        } catch (ConcurrentException e) {
            throw new RuntimeException(e);
        }
    }

    @Contract(value = "-> new", pure = true)
    protected abstract @NotNull String jacksumName();

    @Override
    public @NotNull String hash(@NotNull String input) {
        AbstractChecksum checksum = getChecksumInstance();
        checksum.update(input.getBytes());
        final String valueFormatted = checksum.getValueFormatted();
        checksum.reset();
        return valueFormatted;
    }
}
