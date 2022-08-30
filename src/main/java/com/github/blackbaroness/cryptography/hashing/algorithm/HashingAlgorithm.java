package com.github.blackbaroness.cryptography.hashing.algorithm;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface HashingAlgorithm {

    @Contract(value = "_ -> new", pure = true)
    @NotNull String hash(@NotNull String input);
}
