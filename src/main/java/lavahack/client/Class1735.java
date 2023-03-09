/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1735 {
    Field15960,
    Field15961,
    Field15962;

    private int Field15964;

    private static String Method6606(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 50;
            cArray2[n] = (char)(cArray[n] ^ (0x2AFE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

