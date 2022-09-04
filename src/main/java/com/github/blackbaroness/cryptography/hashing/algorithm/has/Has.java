package com.github.blackbaroness.cryptography.hashing.algorithm.has;

import com.github.blackbaroness.cryptography.hashing.algorithm.JacksumChecksumBasedAlgorithm;
import org.jetbrains.annotations.NotNull;

public class Has extends JacksumChecksumBasedAlgorithm {

    @Override
    protected @NotNull String jacksumName() {
        return "HAS-160";
    }
}
