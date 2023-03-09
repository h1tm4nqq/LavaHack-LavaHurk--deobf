/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.util.regex.Pattern;
import lavahack.loader.Class919;

public class Class924
implements Class919 {
    private static final Pattern Field11918 = Pattern.compile(" ");
    private static final Pattern Field11919 = Pattern.compile(",");
    private final String Field11920;
    private String Field11921 = "TheKisDevs & LavaHack Development owns you";

    public Class924(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        this.Field11920 = string;
    }

    @Override
    public boolean Method3832(String string) {
        String[] stringArray;
        if ("".equals(this.Field11920)) {
            return true;
        }
        String string2 = Field11918.matcher(string).replaceAll("");
        String[] stringArray2 = stringArray = Field11919.split(string2);
        int n = stringArray2.length;
        int n2 = 0;
        while (n2 < n) {
            String string3 = stringArray2[n2];
            if (this.Field11920.equals(string3)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    @Override
    public String Method3833() {
        return this.Field11920;
    }

    @Override
    public Class919 Method3834() {
        return new Class924(this.Method3833());
    }

    @Override
    public String toString() {
        return this.Method3833();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) return false;
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Class924 class924 = (Class924)object;
        return this.Field11920.equals(class924.Field11920);
    }

    public int hashCode() {
        return this.Field11920.hashCode();
    }

    private static String Method3845(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 171;
            cArray2[n] = (char)(cArray[n] ^ (0x1190 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

