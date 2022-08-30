package com.github.blackbaroness.cryptography.hashing.algorithm.adler;

import com.github.blackbaroness.cryptography.hashing.algorithm.JacksumHashingAlgorithm;
import org.jetbrains.annotations.NotNull;

public class Adler32 extends JacksumHashingAlgorithm {

    @Override
    protected @NotNull String jacksumName() {
        return "adler32";
    }
}
