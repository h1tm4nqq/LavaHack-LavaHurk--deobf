/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8984 = new s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("LOAD", (int)-950399824L ^ 0xC75A0CB0, "Load");
    public static final /* enum */ s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8985 = new s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("UNLOAD", (int)((long)2006185639 ^ (long)2006185638), "Unload");
    public static final /* enum */ s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8986 = new s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("RELOAD", ((int)476141364L ^ 0x1C615735) << 1, "Reload");
    final String Field8987;
    private static final s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field8988;
    private String Field8989 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field8988.clone();
    }

    public static s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field8987 = var3_1;
    }

    static {
        s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-997756423 ^ (long)-997756422)];
        s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)753227902L ^ 0x2CE5587E] = Field8984;
        s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1252307958L ^ 0x4AA4B3F7] = Field8985;
        s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-478326212 ^ (long)-478326211) << 1] = Field8986;
        Field8988 = s6baTKOLM2oZfyAPNCJ19wTepVlUqMru$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method1281(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1934505927 ^ (long)-1934505927);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-205593405 ^ (long)-205593540);
            int n2 = (int)((long)1971571546 ^ (long)1971571475) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2114279898 ^ (long)-2114288841) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

