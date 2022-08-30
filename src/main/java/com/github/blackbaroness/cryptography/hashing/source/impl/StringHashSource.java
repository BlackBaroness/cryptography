package com.github.blackbaroness.cryptography.hashing.source.impl;

import com.github.blackbaroness.cryptography.hashing.source.HashSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.charset.Charset;

public class StringHashSource implements HashSource {

    private final String string;
    private final Charset charset;

    public StringHashSource(@NotNull String string) {
        this(string, null);
    }

    public StringHashSource(@NotNull String string, @Nullable Charset charset) {
        this.string = string;
        this.charset = charset;
    }

    @Override
    public byte @NotNull [] bytes() {
        return charset == null ? string.getBytes() : string.getBytes(charset);
    }
}
