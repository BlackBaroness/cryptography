package com.github.blackbaroness.cryptography.hashing.algorithm.adler;

import com.github.blackbaroness.cryptography.hashing.algorithm.HashAlgorithm;
import com.github.blackbaroness.cryptography.hashing.algorithm.md.Md;
import com.github.blackbaroness.cryptography.hashing.source.HashSources;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Adler32Test {

    @Test
    void test() {
        assertEquals(
                "203293439",
                new Adler32().hash(HashSources.ofString("testing")).string()
        );

        HashAlgorithm algorithm = new Md().md5();
        ExecutorService threadPool = Executors.newFixedThreadPool(15);
        IntStream.range(0, 100)
                .mapToObj(i -> HashSources.ofString(String.valueOf(i)))
                .map(hashSource -> (Runnable) () -> System.out.println(algorithm.hash(hashSource).string()))
                .forEach(threadPool::submit);
    }
}