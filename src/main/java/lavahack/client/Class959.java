/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/Debug/FastFallTest$Logic;", "", "(Ljava/lang/String;I)V", "Position", "Motion", "kisman.cc"})
final class Class959
extends Enum {
    public static final /* enum */ Class959 Field12087;
    public static final /* enum */ Class959 Field12088;
    private static final Class959[] Field12089;
    private String Field12090 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class959[] class959Array = new Class959[2];
        Class959[] class959Array2 = class959Array;
        class959Array[0] = Field12087 = new Class959("Position", 0);
        class959Array[1] = Field12088 = new Class959("Motion", 1);
        Field12089 = class959Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class959() {
        void var2_-1;
        void var1_-1;
    }

    public static Class959[] values() {
        return (xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field12089.clone();
    }

    public static Class959 valueOf(String string) {
        return Enum.valueOf(Class959.class, string);
    }

    private static String Method3948(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 157;
            cArray2[n] = (char)(cArray[n] ^ (0x3E67 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

