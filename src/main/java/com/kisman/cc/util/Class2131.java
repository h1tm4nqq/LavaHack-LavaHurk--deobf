/*
 * Decompiled with CFR 0.152.
 */
package com.kisman.cc.util;

public class Class2131 {
    private String Field17692 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static CharSequence Method7669(CharSequence[] charSequenceArray, int n, int n2) {
        StringBuilder stringBuilder = new StringBuilder(charSequenceArray.length * 8);
        int n3 = Math.min(charSequenceArray.length, n2);
        int n4 = n;
        while (n4 < n3) {
            stringBuilder.append(charSequenceArray[n4]);
            if (n4 < n3 - 1) {
                stringBuilder.append(' ');
            }
            ++n4;
        }
        return stringBuilder;
    }
}

