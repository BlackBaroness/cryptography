package com.github.blackbaroness.cryptography.hashing.source.impl;

import com.github.blackbaroness.cryptography.hashing.source.HashSource;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public class FileHashSource implements HashSource {

    private final File file;

    public FileHashSource(@NotNull File file) {
        this.file = file;
    }

    @Override
    public byte @NotNull [] bytes() {
        try {
            return FileUtils.readFileToByteArray(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
