package com.github.blackbaroness.cryptography.hashing.algorithm;

import com.github.blackbaroness.cryptography.util.LazyValue;
import net.jacksum.JacksumAPI;
import net.jacksum.algorithms.AbstractChecksum;
import org.apache.commons.lang3.concurrent.ConcurrentException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public abstract class JacksumHashingAlgorithm implements HashingAlgorithm {

    private final LazyValue<AbstractChecksum> jacksumHolder = new LazyValue<>(
            () -> JacksumAPI.getChecksumInstance(jacksumName())
    );

    @Contract(pure = true)
    protected @NotNull AbstractChecksum getChecksumInstance() {
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
