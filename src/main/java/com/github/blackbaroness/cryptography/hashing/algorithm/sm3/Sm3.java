package com.github.blackbaroness.cryptography.hashing.algorithm.sm3;

import com.github.blackbaroness.cryptography.hashing.algorithm.DigestBasedHashAlgorithm;
import org.bouncycastle.jcajce.provider.digest.SM3;
import org.jetbrains.annotations.NotNull;

public class Sm3 extends DigestBasedHashAlgorithm<SM3.Digest> {

    @Override
    protected @NotNull SM3.Digest createDigest() {
        return new SM3.Digest();
    }
}
