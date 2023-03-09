/*
 * Decompiled with CFR 0.152.
 */
package com.kisman.cc.event;

public enum Class1273 {
    Field13746,
    Field13747,
    Field13748;

    private String Field13750 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method5107(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 225;
            cArray2[n] = (char)(cArray[n] ^ (0x4570 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

