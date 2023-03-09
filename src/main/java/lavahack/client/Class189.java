/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.regex.Pattern;
import lavahack.client.Class1234;

public class Class189
implements Class1234 {
    private static final Pattern Field8840 = Pattern.compile(" ");
    private static final Pattern Field8841 = Pattern.compile(",");
    private final String Field8842;
    private String Field8843 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class189(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        this.Field8842 = string;
    }

    @Override
    public boolean Method1144(String string) {
        String[] stringArray;
        if ("".equals(this.Field8842)) {
            return true;
        }
        String string2 = Field8840.matcher(string).replaceAll("");
        String[] stringArray2 = stringArray = Field8841.split(string2);
        int n = stringArray2.length;
        int n2 = 0;
        while (n2 < n) {
            String string3 = stringArray2[n2];
            if (this.Field8842.equals(string3)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    @Override
    public String Method1145() {
        return this.Field8842;
    }

    @Override
    public Class1234 Method1146() {
        return new Class189(this.Method1145());
    }

    @Override
    public String toString() {
        return this.Method1145();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) return false;
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Class189 class189 = (Class189)object;
        return this.Field8842.equals(class189.Field8842);
    }

    public int hashCode() {
        return this.Field8842.hashCode();
    }

    private static String Method1147(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 80;
            cArray2[n] = (char)(cArray[n] ^ (0x3204 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

