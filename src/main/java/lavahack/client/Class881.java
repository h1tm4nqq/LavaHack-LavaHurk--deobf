/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public class Class881
extends Exception {
    private String Field11710 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class881(String string) {
        super(String.format("Unsupported format: %s", string));
    }

    private static String Method3680(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 21;
            cArray2[n] = (char)(cArray[n] ^ (0x5E21 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

