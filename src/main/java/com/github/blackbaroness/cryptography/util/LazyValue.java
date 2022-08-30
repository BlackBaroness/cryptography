package com.github.blackbaroness.cryptography.util;

import org.apache.commons.lang3.concurrent.ConcurrentException;
import org.apache.commons.lang3.concurrent.LazyInitializer;
import org.jetbrains.annotations.Contract;

public class LazyValue<T> {

    private final LazyInitializer<T> lazyInitializer;

    public LazyValue(Initializer<T> initializer) {
        lazyInitializer = new LazyInitializer<T>() {
            @Override
            protected T initialize() throws ConcurrentException {
                try {
                    return initializer.get();
                } catch (Throwable e) {
                    throw new ConcurrentException(e);
                }
            }
        };
    }

    @Contract(pure = true)
    public T get() throws ConcurrentException {
        return lazyInitializer.get();
    }

    @FunctionalInterface
    public interface Initializer<V> {
        V get() throws Throwable;
    }
}
