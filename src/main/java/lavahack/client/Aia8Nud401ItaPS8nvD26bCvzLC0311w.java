/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.regex.Pattern;
import lavahack.client.dLtfcAfLpVozije9AO0FW8DO22lwsDHm;

public class Aia8Nud401ItaPS8nvD26bCvzLC0311w
implements dLtfcAfLpVozije9AO0FW8DO22lwsDHm {
    private static final Pattern Field8840 = Pattern.compile(" ");
    private static final Pattern Field8841 = Pattern.compile(",");
    private final String Field8842;
    private String Field8843 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Aia8Nud401ItaPS8nvD26bCvzLC0311w(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        this.Field8842 = string;
    }

    @Override
    public boolean Method1144(String string) {
        String[] stringArray;
        if ("".equals(this.Field8842)) {
            return (int)((long)-455345151 ^ (long)-455345152) != 0;
        }
        String string2 = Field8840.matcher(string).replaceAll("");
        String[] stringArray2 = stringArray = Field8841.split(string2);
        int n = stringArray2.length;
        int n2 = (int)((long)-1320684100 ^ (long)-1320684100);
        while (n2 < n) {
            String string3 = stringArray2[n2];
            if (this.Field8842.equals(string3)) {
                return (int)((long)-2012039798 ^ (long)-2012039797) != 0;
            }
            ++n2;
        }
        return (int)((long)2038928750 ^ (long)2038928750) != 0;
    }

    @Override
    public String Method1145() {
        return this.Field8842;
    }

    @Override
    public dLtfcAfLpVozije9AO0FW8DO22lwsDHm Method1146() {
        return new Aia8Nud401ItaPS8nvD26bCvzLC0311w(this.Method1145());
    }

    @Override
    public String toString() {
        return this.Method1145();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return (int)((long)-297028072 ^ (long)-297028071) != 0;
        }
        if (object == null) return (int)((long)2094023449 ^ (long)2094023449) != 0;
        if (this.getClass() != object.getClass()) {
            return (int)((long)2094023449 ^ (long)2094023449) != 0;
        }
        Aia8Nud401ItaPS8nvD26bCvzLC0311w aia8Nud401ItaPS8nvD26bCvzLC0311w = (Aia8Nud401ItaPS8nvD26bCvzLC0311w)object;
        return this.Field8842.equals(aia8Nud401ItaPS8nvD26bCvzLC0311w.Field8842);
    }

    public int hashCode() {
        return this.Field8842.hashCode();
    }

    private static String Method1147(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-402773131L ^ 0xE7FE2B75;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1478095970L ^ 0x5819F49D);
            int n2 = ((int)-306797736L ^ 0xEDB6A35D) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1780269838 ^ (long)1780273039) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

