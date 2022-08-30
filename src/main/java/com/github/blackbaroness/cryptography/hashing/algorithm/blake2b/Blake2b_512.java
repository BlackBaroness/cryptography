package com.github.blackbaroness.cryptography.hashing.algorithm.blake2b;

import com.github.blackbaroness.cryptography.hashing.algorithm.ResettableDigestBasedHashingAlgorithm;
import org.bouncycastle.jcajce.provider.digest.Blake2b;
import org.jetbrains.annotations.NotNull;

public class Blake2b_512 extends ResettableDigestBasedHashingAlgorithm<Blake2b.Blake2b512> {

    public Blake2b_512() {
        Blake2bInitializer.init();
    }

    @Override
    protected @NotNull Blake2b.Blake2b512 initDigest() {
        return new Blake2b.Blake2b512();
    }
}
