package com.github.blackbaroness.cryptography.hashing.source;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface HashSource {

    @Contract(pure = true)
    byte @NotNull [] bytes();
}
