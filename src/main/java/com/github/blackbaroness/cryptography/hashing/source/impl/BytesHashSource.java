package com.github.blackbaroness.cryptography.hashing.source.impl;

import com.github.blackbaroness.cryptography.hashing.source.HashSource;
import org.jetbrains.annotations.NotNull;

public class BytesHashSource implements HashSource {

    private final byte[] bytes;

    public BytesHashSource(byte @NotNull [] bytes) {
        this.bytes = bytes;
    }

    @Override
    public byte @NotNull [] bytes() {
        return bytes;
    }
}
