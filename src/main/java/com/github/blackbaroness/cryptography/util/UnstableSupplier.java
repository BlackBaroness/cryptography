package com.github.blackbaroness.cryptography.util;

import org.jetbrains.annotations.Contract;

@FunctionalInterface
public interface UnstableSupplier<T> {
    @Contract(pure = true)
    T get() throws Throwable;
}
