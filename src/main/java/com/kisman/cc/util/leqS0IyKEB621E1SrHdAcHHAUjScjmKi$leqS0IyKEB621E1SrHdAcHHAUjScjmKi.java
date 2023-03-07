/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package com.kisman.cc.util;

import com.kisman.cc.util.AccountData;
import com.kisman.cc.util.leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import kotlin.Metadata;
import lavahack.client.f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    final leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field17637;
    private String Field17638 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP.Method1453(this.Field17637).Method541("auth " + AccountData.Field8161.Method2220() + (((int)-1990806033L ^ 0x8956B5EE) << 5) + AccountData.Field8161.Method2222() + (((int)-605021762L ^ 0xDBF019BF) << 5) + AccountData.Field8161.Method2224());
    }

    leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        this.Field17637 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
    }

    private static String Method7655(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-545944211L ^ 0xDF758D6D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-758132084L ^ 0xD2CFD273);
            int n2 = (int)((long)428562346 ^ (long)428562347) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1858384613 ^ (long)1858374472) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

