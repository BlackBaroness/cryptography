package com.github.blackbaroness.cryptography.hashing.result;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public interface HashResult {

    @Contract(pure = true)
    byte @NotNull [] bytes();

    @Contract(pure = true)
    @NotNull String string();

    @Contract(pure = true)
    default boolean same(@NotNull HashResult hashResult) {
        return Arrays.equals(bytes(), hashResult.bytes());
    }
}
