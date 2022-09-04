package com.github.blackbaroness.cryptography.hashing.algorithm.kupyna;

import org.junit.jupiter.api.Test;

import static com.github.blackbaroness.cryptography.test.TestHelper.testSimpleHashing;

class KupynaTest {

    private final Kupyna kupyna = new Kupyna();

    @Test
    void kupyna256() {
        testSimpleHashing(kupyna.kupyna256(), "testing", "6ae5d8e72118431e5c51ed6d2e73ad35aa01b82cf6a404f4d2c4edcba418fc2d");
    }

    @Test
    void kupyna384() {
        testSimpleHashing(kupyna.kupyna384(), "testing", "6f6309d2a9b053c1fb345eb7cf02170be95e4dec5c40f90bf301907e52e2010b669a6b95aa88cc8cf34955d385cf5a91");
    }

    @Test
    void kupyna512() {
        testSimpleHashing(kupyna.kupyna512(), "testing", "81858a9fcc2891435f26e4478b8689906f6309d2a9b053c1fb345eb7cf02170be95e4dec5c40f90bf301907e52e2010b669a6b95aa88cc8cf34955d385cf5a91");
    }
}