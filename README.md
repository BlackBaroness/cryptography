[![Maintainability](https://api.codeclimate.com/v1/badges/440f3b75ec8f41c25ea8/maintainability)](https://codeclimate.com/github/BlackBaroness/cryptography/maintainability)

⚡ Easy to use and high-performance encoding and hashing library,
mainly powered on [jacksum](https://github.com/jonelo/jacksum).

**Requires Java 11 or higher.**

### Supported hashes:

| Family            | Implementations                                                                                                                                                                          |
|-------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Adler32           | Adler32                                                                                                                                                                                  |
| BLAKE2b           | BLAKE2b-160, BLAKE2b-256, BLAKE2b-384, BLAKE2b-512                                                                                                                                       |
| CRC               | CRC-8, CRC-16, CRC-24, CRC-32, CRC-64                                                                                                                                                    |
| HAS-160           | HAS-160                                                                                                                                                                                  |
| Keccak (SHA-3)    | Keccak-224, Keccak-256, Keccak-288, Keccak-384, Keccak-512                                                                                                                               |
| Kupyna (DSTU7564) | Kupyna-256, Kupyna-384, Kupyna-512                                                                                                                                                       |
| MD                | MD2, MD4, MD5                                                                                                                                                                            |
| RIPEMD            | RIPEMD-128, RIPEMD-160, RIPEMD-256, RIPEMD-320                                                                                                                                           |
| SHA               | SHA-0, SHA-1, SHA-224, SHA-256, SHA-384, SHA-512                                                                                                                                         |
| Skein             | Skein256-128, Skein256-160, Skein256-224, Skein256-256, Skein512-128, Skein512-160, Skein512-224, Skein512-256, Skein512-384, Skein512-512, Skein1024-384, Skein1024-512, Skein1024-1024 |
| Tiger             | Tiger, Tiger2, Tiger-128, Tiger-180                                                                                                                                                      |
| Whirlpool         | Whirlpool-0, Whirlpool-1, Whirlpool-2                                                                                                                                                    |

### Import

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

### Usage

Documantation available on [wiki](https://github.com/BlackBaroness/cryptography/wiki).

### Dependencies

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