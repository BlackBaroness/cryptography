package com.github.blackbaroness.cryptography.hashing.source;

import com.github.blackbaroness.cryptography.hashing.source.impl.BytesHashSource;
import com.github.blackbaroness.cryptography.hashing.source.impl.FileHashSource;
import com.github.blackbaroness.cryptography.hashing.source.impl.PathHashSource;
import com.github.blackbaroness.cryptography.hashing.source.impl.StringHashSource;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.file.Path;

@UtilityClass
public class HashSources {

    @Contract(value = "_ -> new", pure = true)
    public @NotNull HashSource ofString(@NotNull String string) {
        return new StringHashSource(string);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull HashSource ofPath(@NotNull Path path) {
        return new PathHashSource(path);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull HashSource ofFile(@NotNull File file) {
        return new FileHashSource(file);
    }

    @Contract(value = "_ -> new", pure = true)
    public @NotNull HashSource ofBytes(byte @NotNull [] bytes) {
        return new BytesHashSource(bytes);
    }
}
