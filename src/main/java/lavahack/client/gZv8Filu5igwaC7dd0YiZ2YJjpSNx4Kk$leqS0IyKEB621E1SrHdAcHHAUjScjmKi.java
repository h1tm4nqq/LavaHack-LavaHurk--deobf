/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14293 = new gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Chat", (int)-1848272482L ^ 0x91D5999E);
    public static final /* enum */ gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14294 = new gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Display", (int)-1880104552L ^ 0x8FEFE199);
    private static final gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field14295;
    private String Field14296 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field14295.clone();
    }

    public static gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-112766781L ^ 0xF94750C2) << 1];
        gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)195858064L ^ 0xBAC8E90] = Field14293;
        gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1173728231 ^ (long)-1173728232)] = Field14294;
        Field14295 = gZv8Filu5igwaC7dd0YiZ2YJjpSNx4Kk$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method5496(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)274078908 ^ (long)274078908);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)737286991L ^ 0x2BF21BB0);
            int n2 = (int)((long)-1614744469 ^ (long)-1614744464) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)1493393445L ^ 0x59036690) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

