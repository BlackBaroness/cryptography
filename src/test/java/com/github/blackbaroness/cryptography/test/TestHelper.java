package com.github.blackbaroness.cryptography.test;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.source.HashSources;
import org.jetbrains.annotations.NotNull;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class TestHelper {

    public static void testSimpleHashing(
            @NotNull HashAlgorithm algorithm, @NotNull String exampleString, @NotNull String expectedResult
    ) {
        assertEquals(expectedResult, algorithm.hash(HashSources.ofString(exampleString)).string());
    }
}
