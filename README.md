[![Maintainability](https://api.codeclimate.com/v1/badges/440f3b75ec8f41c25ea8/maintainability)](https://codeclimate.com/github/BlackBaroness/cryptography/maintainability)

⚡ Easy to use and high-performance encoding and hashing library,
mainly powered on [jacksum](https://github.com/jonelo/jacksum).

**Requires Java 11 or higher.**

### Supported hashes:

- Adler32
- Blake2b (160, 256, 384, 512)
- CRC (8, 16, 24, 32, 64)
- MD (2, 4, 5)
- SHA (0, 1, 224, 256, 384, 512)
- Tiger (Tiger, Tiger2, 128, 180)

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