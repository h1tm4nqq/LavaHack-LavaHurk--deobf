/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field13303 = new f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Box1", (int)1054297007L ^ 0x3ED74BAF);
    public static final /* enum */ f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field13304 = new f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Box2", (int)((long)2063146404 ^ (long)2063146405));
    public static final /* enum */ f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field13305 = new f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Model", ((int)-1115218945L ^ 0xBD871BFE) << 1);
    private static final f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field13306;
    private String Field13307 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field13306.clone();
    }

    public static f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)-60903714 ^ (long)-60903715)];
        f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)432986560L ^ 0x19CED9C0] = Field13303;
        f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)718753728 ^ (long)718753729)] = Field13304;
        f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-1655034183 ^ (long)-1655034184) << 1] = Field13305;
        Field13306 = f1aluHx5bxv7TlmkJp3srpREvLbP6yTl$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method4738(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1400777282 ^ (long)-1400777282);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1094340418L ^ 0xBEC5B041);
            int n2 = (int)((long)-1409157155 ^ (long)-1409157228);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1406509523 ^ (long)-1406513314) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

