package com.github.blackbaroness.cryptography.hashing.algorithm;

import com.github.blackbaroness.cryptography.hashing.result.HashResult;
import com.github.blackbaroness.cryptography.hashing.source.HashSource;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface HashAlgorithm {

    @Contract(value = "_ -> new", pure = true)
    @NotNull HashResult hash(@NotNull HashSource input);
}
