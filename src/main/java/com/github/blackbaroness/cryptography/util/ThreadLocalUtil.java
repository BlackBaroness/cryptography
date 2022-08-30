package com.github.blackbaroness.cryptography.util;

import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@UtilityClass
public class ThreadLocalUtil {

    @Contract(value = "_ -> new", pure = true)
    public @NotNull <T> ThreadLocal<T> withInitial(@NotNull UnstableSupplier<T> supplier) {
        return ThreadLocal.withInitial(() -> {
            try {
                return supplier.get();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        });
    }
}
