package com.github.blackbaroness.cryptography.hashing.algorithm.kupyna;

import com.github.blackbaroness.cryptography.hashing.algorithm.BouncyCastleInitializer;
import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.SimpleDigestBasedAlgorithm;
import org.bouncycastle.jcajce.provider.digest.DSTU7564;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Kupyna {

    static {
        BouncyCastleInitializer.init();
    }

    private final HashAlgorithm kupyna256 = new SimpleDigestBasedAlgorithm<>(DSTU7564.Digest256::new);
    private final HashAlgorithm kupyna384 = new SimpleDigestBasedAlgorithm<>(DSTU7564.Digest384::new);
    private final HashAlgorithm kupyna512 = new SimpleDigestBasedAlgorithm<>(DSTU7564.Digest512::new);

    @Contract(pure = true)
    public @NotNull HashAlgorithm kupyna256() {
        return kupyna256;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm kupyna384() {
        return kupyna384;
    }

    @Contract(pure = true)
    public @NotNull HashAlgorithm kupyna512() {
        return kupyna512;
    }
}
