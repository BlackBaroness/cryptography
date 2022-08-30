package com.github.blackbaroness.cryptography.hashing.algorithm;

import com.github.blackbaroness.cryptography.hashing.result.HashResult;
import com.github.blackbaroness.cryptography.hashing.result.ImmutableHashResult;
import com.github.blackbaroness.cryptography.hashing.source.HashSource;
import com.github.blackbaroness.cryptography.util.ThreadLocalUtil;
import net.jacksum.JacksumAPI;
import net.jacksum.algorithms.AbstractChecksum;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public abstract class JacksumHashAlgorithm implements HashAlgorithm {

    private final ThreadLocal<AbstractChecksum> jacksumHolder = ThreadLocalUtil.withInitial(
            () -> JacksumAPI.getChecksumInstance(jacksumName().toLowerCase())
    );

    @Contract(value = "-> new", pure = true)
    protected abstract @NotNull String jacksumName();

    @Override
    public @NotNull HashResult hash(@NotNull HashSource input) {
        AbstractChecksum checksum = jacksumHolder.get();
        checksum.update(input.bytes());

        final byte[] bytesResult = checksum.getByteArray();
        final String stringResult = checksum.getValueFormatted();

        checksum.reset();
        return new ImmutableHashResult(bytesResult, stringResult);
    }
}
