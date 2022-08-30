package com.github.blackbaroness.cryptography.hashing.algorithm.adler;

import com.github.blackbaroness.cryptography.hashing.algorithm.JacksumHashAlgorithm;
import org.jetbrains.annotations.NotNull;

public class Adler32 extends JacksumHashAlgorithm {

    @Override
    protected @NotNull String jacksumName() {
        return "adler32";
    }
}
