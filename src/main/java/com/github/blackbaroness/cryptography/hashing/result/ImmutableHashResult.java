package com.github.blackbaroness.cryptography.hashing.result;

import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
public class ImmutableHashResult implements HashResult {

    private final byte[] bytes;
    private final String string;

    @Override
    public byte @NotNull [] bytes() {
        return bytes;
    }

    @Override
    public @NotNull String string() {
        return string;
    }
}
