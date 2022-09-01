⚡ Easy to use and high-performance encoding and hashing library,
mainly powered on [jacksum](https://github.com/jonelo/jacksum).

**Requires Java version 11 or higher.**

### Supported hashes:

- Adler32
- Blake2b (160, 256, 384, 512)
- CRC (8, 16, 24, 32, 64)
- MD (2, 4, 5)
- SHA (0, 1, 224, 256, 384, 512)

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