package com.github.blackbaroness.cryptography.hashing.algorithm.blake2b;

import com.github.blackbaroness.cryptography.hashing.algorithm.ResettableDigestBasedHashingAlgorithm;
import org.bouncycastle.jcajce.provider.digest.Blake2b;
import org.jetbrains.annotations.NotNull;

public class Blake2b_256 extends ResettableDigestBasedHashingAlgorithm<Blake2b.Blake2b256> {

    public Blake2b_256() {
        Blake2bInitializer.init();
    }

    @Override
    protected @NotNull Blake2b.Blake2b256 initDigest() {
        return new Blake2b.Blake2b256();
    }
}
