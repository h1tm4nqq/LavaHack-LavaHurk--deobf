/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import java.util.function.Predicate;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM;
import lavahack.client.Class410;

enum Class557 {
    Field10369(class410 -> {
        if (class410 == Class410.Field9697) return false;
        return true;
    }),
    Field10370(class410 -> {
        if (class410 != Class410.Field9697) return false;
        return true;
    }),
    Field10371((Predicate<AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$static$2(Class410), (Llavahack/client/AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;)Z)());

    private final Predicate Field10372;
    private String Field10374 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class557() {
        void var3_1;
        this.Field10372 = var3_1;
    }

    public boolean Method2468(Class410 class410) {
        return this.Field10372.test(class410);
    }

    private static String Method2471(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 203;
            cArray2[n] = (char)(cArray[n] ^ (0x2473 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

