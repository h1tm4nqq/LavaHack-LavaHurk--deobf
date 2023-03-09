/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/misc/SkyBlockFeatures$HyperionExploitLogic;", "", "(Ljava/lang/String;I)V", "Instant", "Manual", "kisman.cc"})
public final class Class1881
extends Enum {
    public static final /* enum */ Class1881 Field16673;
    public static final /* enum */ Class1881 Field16674;
    private static final Class1881[] Field16675;
    private String Field16676 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1881[] class1881Array = new Class1881[2];
        Class1881[] class1881Array2 = class1881Array;
        class1881Array[0] = Field16673 = new Class1881("Instant", 0);
        class1881Array[1] = Field16674 = new Class1881("Manual", 1);
        Field16675 = class1881Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1881() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1881[] values() {
        return (HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field16675.clone();
    }

    public static Class1881 valueOf(String string) {
        return Enum.valueOf(Class1881.class, string);
    }

    private static String Method6976(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 14;
            cArray2[n] = (char)(cArray[n] ^ (0x66EE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

