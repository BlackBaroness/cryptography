package com.github.blackbaroness.cryptography.hashing.algorithm.xor;

import com.github.blackbaroness.cryptography.hashing.algorithm.JacksumChecksumBasedAlgorithm;
import org.jetbrains.annotations.NotNull;

public class Xor8 extends JacksumChecksumBasedAlgorithm {

    @Override
    protected @NotNull String jacksumName() {
        return "xor8";
    }
}
