package com.github.blackbaroness.cryptography.hashing.algorithm.elf;

import com.github.blackbaroness.cryptography.hashing.algorithm.JacksumChecksumBasedAlgorithm;
import org.jetbrains.annotations.NotNull;

public class Elf32 extends JacksumChecksumBasedAlgorithm {

    @Override
    protected @NotNull String jacksumName() {
        return "ELF-32";
    }
}
