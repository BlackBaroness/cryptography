[![Maintainability](https://api.codeclimate.com/v1/badges/440f3b75ec8f41c25ea8/maintainability)](https://codeclimate.com/github/BlackBaroness/cryptography/maintainability)

⚡ Easy to use and high-performance encoding and hashing library.

**Requires Java 11 or higher.**

## Import

<details>
  <summary>Maven</summary>

Add this to your `pom.xml`:

```xml

<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

```xml

<dependency>
    <groupId>com.github.BlackBaroness</groupId>
    <artifactId>cryptography</artifactId>
    <version>master-SNAPSHOT</version>
</dependency>
```

</details>

<details>
  <summary>Gradle</summary>

Add this to your `build.gradle`:

```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

```gradle
dependencies {
    implementation 'com.github.BlackBaroness:cryptography:master-SNAPSHOT'
}
```

</details>

## Supported hash functions:

| Family                                                                     | Implementations                                                                                                                                                                          |
|----------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| MD                                                                         | [MD2](https://en.wikipedia.org/wiki/MD2_(hash_function)), [MD4](https://en.wikipedia.org/wiki/MD4), [MD5](https://en.wikipedia.org/wiki/MD5)                                             |
| [SHA](https://en.wikipedia.org/wiki/SHA-1)                                 | SHA-0, SHA-1, SHA-224, SHA-256, SHA-384, SHA-512                                                                                                                                         |
| [BLAKE2b](https://en.wikipedia.org/wiki/BLAKE_(hash_function))             | BLAKE2b-160, BLAKE2b-256, BLAKE2b-384, BLAKE2b-512                                                                                                                                       |
| [BLAKE2s](https://en.wikipedia.org/wiki/BLAKE_(hash_function))             | BLAKE2s-128, BLAKE2s-160, BLAKE2s-224, BLAKE2s-256                                                                                                                                       |
| [CRC](https://en.wikipedia.org/wiki/Cyclic_redundancy_check)               | CRC-8, CRC-16, CRC-24, CRC-32, CRC-64                                                                                                                                                    |
| [Keccak (SHA-3)](https://en.wikipedia.org/wiki/SHA-3)                      | Keccak-224, Keccak-256, Keccak-288, Keccak-384, Keccak-512                                                                                                                               |
| [RIPEMD](https://en.wikipedia.org/wiki/RIPEMD)                             | RIPEMD-128, RIPEMD-160, RIPEMD-256, RIPEMD-320                                                                                                                                           |
| [Skein](https://en.wikipedia.org/wiki/Skein_(hash_function))               | Skein256-128, Skein256-160, Skein256-224, Skein256-256, Skein512-128, Skein512-160, Skein512-224, Skein512-256, Skein512-384, Skein512-512, Skein1024-384, Skein1024-512, Skein1024-1024 |
| [Tiger](https://en.wikipedia.org/wiki/Tiger_(hash_function))               | Tiger, Tiger2, Tiger-128, Tiger-180                                                                                                                                                      |
| [Whirlpool](https://en.wikipedia.org/wiki/Whirlpool_(hash_function))       | Whirlpool-0, Whirlpool-1, Whirlpool-2                                                                                                                                                    |
| [Adler32](https://en.wikipedia.org/wiki/Adler-32)                          | Adler32                                                                                                                                                                                  |
| [HAS-160](https://en.wikipedia.org/wiki/HAS-160)                           | HAS-160                                                                                                                                                                                  |
| [Kupyna (DSTU7564)](https://en.wikipedia.org/wiki/Kupyna)                  | Kupyna-256, Kupyna-384, Kupyna-512                                                                                                                                                       |
| [SM3](https://en.wikipedia.org/wiki/SM3_(hash_function))                   | SM3                                                                                                                                                                                      |
| sum                                                                        | sum8, sum16, sum24, sum32                                                                                                                                                                |
| [Xor8](https://en.wikipedia.org/wiki/Longitudinal_redundancy_check)        | Xor8                                                                                                                                                                                     |
| FCS                                                                        | FCS-16, FCS-32                                                                                                                                                                           |
| [ELF (Unix)](https://en.wikipedia.org/wiki/Executable_and_Linkable_Format) | ELF-32                                                                                                                                                                                   |

## Usage

Documantation available on [wiki](https://github.com/BlackBaroness/cryptography/wiki).

## Dependencies

We use dependencies:

- [Bouncy Castle](https://www.bouncycastle.org/) - hashing, encoding etc;
- [Jonelo Jacksum](https://github.com/jonelo/jacksum) - hashing, encoding etc;
- [Apache Commons IO](https://commons.apache.org/proper/commons-io/) - file reading;

In addition, we use:

- [JUnit 5](https://junit.org/junit5/) - unit testing;
- [Jetbrains Annotations](https://www.jetbrains.com/help/idea/annotating-source-code.html) - better code
  documentation via annotations;
- [Checker Framework](https://checkerframework.org/) - something like the point above, but much more powerful;
- [Lombok](https://projectlombok.org/) - syntactic sugar and less boilerplate code; 