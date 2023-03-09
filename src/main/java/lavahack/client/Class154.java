/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class154 {
    Field8596,
    Field8597,
    Field8598,
    Field8599,
    Field8600,
    Field8601,
    Field8602,
    Field8603,
    Field8604,
    Field8605,
    Field8606,
    Field8607;

    private int Field8609;

    private static String Method1002(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 147;
            cArray2[n] = (char)(cArray[n] ^ (0x522F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

