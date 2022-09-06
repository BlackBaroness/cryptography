package com.github.blackbaroness.cryptography.cipher;

import com.github.blackbaroness.cryptography.util.CipherUtils;
import org.jetbrains.annotations.NotNull;

public class A1z26 implements Cipher {

    @Override
    public @NotNull String encode(@NotNull String value) {
        StringBuilder resultBuilder = new StringBuilder();
        String[] split = value.split("\\s");
        for (int i = 0; i < split.length; i++) {
            String temp = split[i];
            if (!temp.equals("")) {
                String[] c2 = temp.split("(?!^)");
                for (int j = 0; j < c2.length; j++) {
                    if (j == c2.length - 1) resultBuilder.append(CipherUtils.ltn((c2[j])));
                    else resultBuilder.append(CipherUtils.ltn(c2[j])).append("-");
                }
            }

            if (i != split.length - 1) resultBuilder.append(" ");
        }
        return resultBuilder.toString();
    }

    @Override
    public @NotNull String decode(@NotNull String encodedValue) {
        final String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        final StringBuilder resultBuilder = new StringBuilder();
        final String[] split = encodedValue.split("\\s");
        for (int i = 0; i < split.length; i++) {
            String string = split[i];
            if (!string.equals("")) {
                String[] codes = string.split("-");
                for (String code : codes) {
                    int intCode = CipherUtils.parseIntOrThrow(code, e -> new IllegalArgumentException("Invalid code"));
                    resultBuilder.append(alphabet[intCode - 1]);
                }
            }

            if (i != split.length - 1) resultBuilder.append(" ");
        }
        return resultBuilder.toString();
    }
}
