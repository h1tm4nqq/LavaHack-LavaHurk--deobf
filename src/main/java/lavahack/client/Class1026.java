/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1026 {
    Field12512,
    Field12513;

    private String Field12515 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method4166(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 25;
            cArray2[n] = (char)(cArray[n] ^ (0x1CAB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

