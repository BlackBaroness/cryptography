package com.github.blackbaroness.cryptography.cipher;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface Cipher {

    @Contract(value = "_ -> new", pure = true)
    @NotNull String encode(@NotNull String value);

    @Contract(value = "_ -> new", pure = true)
    @NotNull String decode(@NotNull String encodedValue);
}
