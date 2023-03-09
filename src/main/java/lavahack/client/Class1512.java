/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1512 {
    Field15076,
    Field15077;

    private int Field15079;

    private static String Method6041(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 75;
            cArray2[n] = (char)(cArray[n] ^ (0x2398 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

