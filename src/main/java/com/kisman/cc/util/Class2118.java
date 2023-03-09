/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package com.kisman.cc.util;

import com.kisman.cc.util.AccountData;
import com.kisman.cc.util.Class76;
import kotlin.Metadata;
import lavahack.client.Class273;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class2118
implements Runnable {
    final Class76 Field17637;
    private String Field17638 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        Class273.Method1453(this.Field17637).Method541("auth " + AccountData.Field8161.Method2220() + ' ' + AccountData.Field8161.Method2222() + ' ' + AccountData.Field8161.Method2224());
    }

    Class2118(Class76 class76) {
        this.Field17637 = class76;
    }

    private static String Method7655(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 4;
            cArray2[n] = (char)(cArray[n] ^ (0x735A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

