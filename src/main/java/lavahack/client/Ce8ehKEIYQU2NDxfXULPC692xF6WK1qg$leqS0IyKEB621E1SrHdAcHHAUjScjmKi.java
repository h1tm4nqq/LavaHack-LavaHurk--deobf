/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/exploit/BowExploit$Mode;", "", "(Ljava/lang/String;I)V", "Default", "Rewrite", "kisman.cc"})
public final class Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16521;
    public static final /* enum */ Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16522;
    private static final Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field16523;
    private String Field16524 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-1468320922 ^ (long)-1468320921) << 1];
        Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray2 = ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
        ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-701465471L ^ 0xD6307C81] = Field16521 = new Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Default", (int)((long)710745863 ^ (long)710745863));
        ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1783844679L ^ 0x6A534F46] = Field16522 = new Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Rewrite", (int)((long)310349644 ^ (long)310349645));
        Field16523 = ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    public static Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field16523.clone();
    }

    public static Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    private static String Method6942(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)424274912 ^ (long)424274912);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-396970921L ^ 0xE856B4A8);
            int n2 = (int)((long)340260142 ^ (long)340260143) << 5;
            cArray2[n] = (char)(cArray[n] ^ (((int)1649744935L ^ 0x62551CEE) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

