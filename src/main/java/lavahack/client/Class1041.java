/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1041 {
    Field12586,
    Field12587,
    Field12588,
    Field12589;

    private int Field12591;

    private static String Method4251(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 207;
            cArray2[n] = (char)(cArray[n] ^ (0x542A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

