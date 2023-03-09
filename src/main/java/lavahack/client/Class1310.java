/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1310 {
    Field14027,
    Field14028,
    Field14029;

    private int Field14031;

    private static String Method5341(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 246;
            cArray2[n] = (char)(cArray[n] ^ (0x6406 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

