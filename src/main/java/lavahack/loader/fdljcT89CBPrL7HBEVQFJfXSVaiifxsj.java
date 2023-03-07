/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.util.regex.Pattern;
import lavahack.loader.iDprz50yBrPJ6StAk1hDYgq1aL04tvSb;

public class fdljcT89CBPrL7HBEVQFJfXSVaiifxsj
implements iDprz50yBrPJ6StAk1hDYgq1aL04tvSb {
    private static final Pattern Field11918 = Pattern.compile(" ");
    private static final Pattern Field11919 = Pattern.compile(",");
    private final String Field11920;
    private String Field11921 = "TheKisDevs & LavaHack Development owns you";

    public fdljcT89CBPrL7HBEVQFJfXSVaiifxsj(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        this.Field11920 = string;
    }

    @Override
    public boolean Method3832(String string) {
        String[] stringArray;
        if ("".equals(this.Field11920)) {
            return ((int)-1320449978L ^ 0xB14B8847) != 0;
        }
        String string2 = Field11918.matcher(string).replaceAll("");
        String[] stringArray2 = stringArray = Field11919.split(string2);
        int n = stringArray2.length;
        int n2 = (int)((long)1445440750 ^ (long)1445440750);
        while (n2 < n) {
            String string3 = stringArray2[n2];
            if (this.Field11920.equals(string3)) {
                return (int)((long)-2140190966 ^ (long)-2140190965) != 0;
            }
            ++n2;
        }
        return ((int)926801818L ^ 0x373DDF9A) != 0;
    }

    @Override
    public String Method3833() {
        return this.Field11920;
    }

    @Override
    public iDprz50yBrPJ6StAk1hDYgq1aL04tvSb Method3834() {
        return new fdljcT89CBPrL7HBEVQFJfXSVaiifxsj(this.Method3833());
    }

    @Override
    public String toString() {
        return this.Method3833();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return (int)((long)-242384269 ^ (long)-242384270) != 0;
        }
        if (object == null) return ((int)-2128336274L ^ 0x81242A6E) != 0;
        if (this.getClass() != object.getClass()) {
            return ((int)-2128336274L ^ 0x81242A6E) != 0;
        }
        fdljcT89CBPrL7HBEVQFJfXSVaiifxsj fdljcT89CBPrL7HBEVQFJfXSVaiifxsj2 = (fdljcT89CBPrL7HBEVQFJfXSVaiifxsj)object;
        return this.Field11920.equals(fdljcT89CBPrL7HBEVQFJfXSVaiifxsj2.Field11920);
    }

    public int hashCode() {
        return this.Field11920.hashCode();
    }

    private static String Method3845(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)924849319L ^ 0x372014A7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)783509190 ^ (long)783509049);
            int n2 = (int)987326154L ^ 0x3AD96661;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1568600344L ^ 0xA2810FF1) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

