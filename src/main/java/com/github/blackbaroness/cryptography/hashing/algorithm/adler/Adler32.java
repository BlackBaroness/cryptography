package com.github.blackbaroness.cryptography.hashing.algorithm.adler;

import com.github.blackbaroness.cryptography.hashing.algorithm.JacksumChecksumBasedAlgorithm;
import org.jetbrains.annotations.NotNull;

public class Adler32 extends JacksumChecksumBasedAlgorithm {

    @Override
    protected @NotNull String jacksumName() {
        return "adler32";
    }
}
