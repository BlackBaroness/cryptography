package com.github.blackbaroness.cryptography.hashing.source.impl;

import com.github.blackbaroness.cryptography.hashing.source.HashSource;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathHashSource implements HashSource {

    private final Path path;

    public PathHashSource(@NotNull Path path) {
        this.path = path;
    }

    @Override
    public byte @NotNull [] bytes() {
        try {
            return Files.readAllBytes(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
