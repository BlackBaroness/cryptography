package com.github.blackbaroness.cryptography.util;

import lombok.experimental.UtilityClass;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

@UtilityClass
public class CipherUtils {

    @Contract(pure = true)
    public @Positive int ltn(@NotNull String s) {
        return Character.getNumericValue(s.charAt(0)) - 9;
    }

    @Contract(pure = true)
    public int parseIntOrThrow(
            @NotNull String value,
            @NotNull Function<NumberFormatException, ? extends RuntimeException> exceptionCreator
    ) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw exceptionCreator.apply(e);
        }
    }
}
