/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/Debug/FastFallTest$Logic;", "", "(Ljava/lang/String;I)V", "Position", "Motion", "kisman.cc"})
final class xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12087;
    public static final /* enum */ xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12088;
    private static final xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field12089;
    private String Field12090 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)1090388998 ^ (long)1090388999) << 1];
        xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray2 = xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
        xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-74082449 ^ (long)-74082449)] = Field12087 = new xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Position", (int)792739186L ^ 0x2F403D72);
        xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-922689168 ^ (long)-922689167)] = Field12088 = new xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Motion", (int)((long)1695415195 ^ (long)1695415194));
        Field12089 = xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    public static xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field12089.clone();
    }

    public static xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    private static String Method3948(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-756721211L ^ 0xD2E559C5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1659745121L ^ 0x9D124C60);
            int n2 = (int)((long)1621801305 ^ (long)1621801412);
            cArray2[n] = (char)(cArray[n] ^ ((int)931933537L ^ 0x378C1306 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

