/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class1413 {
    public static final String Field14418 = "minecraft";
    private int Field14419;

    private static String Method5582(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 19;
            cArray2[n] = (char)(cArray[n] ^ (0x6390 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

