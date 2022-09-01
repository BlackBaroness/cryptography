package com.github.blackbaroness.cryptography.hashing.algorithm;

import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
public class SimpleJacksumChecksumAlgorithm extends JacksumChecksumBasedAlgorithm {

    private final String algorithm;

    @Override
    protected @NotNull String jacksumName() {
        return algorithm;
    }
}
