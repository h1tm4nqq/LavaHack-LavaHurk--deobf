/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class923 {
    Field11900,
    Field11901,
    Field11902,
    Field11903,
    Field11904,
    Field11905,
    Field11906,
    Field11907,
    Field11908,
    Field11909,
    Field11910,
    Field11911,
    Field11912,
    Field11913,
    Field11914,
    Field11915;

    private int Field11917;

    private static String Method3844(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 176;
            cArray2[n] = (char)(cArray[n] ^ (0x1F4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

