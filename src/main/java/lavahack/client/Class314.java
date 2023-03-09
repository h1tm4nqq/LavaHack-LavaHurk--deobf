/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/combat/AutoCrystalPvP$AutoXPMode;", "", "(Ljava/lang/String;I)V", "Vanilla", "Silent", "kisman.cc"})
final class Class314
extends Enum {
    public static final /* enum */ Class314 Field9329;
    public static final /* enum */ Class314 Field9330;
    private static final Class314[] Field9331;
    private String Field9332 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class314[] class314Array = new Class314[2];
        Class314[] class314Array2 = class314Array;
        class314Array[0] = Field9329 = new Class314("Vanilla", 0);
        class314Array[1] = Field9330 = new Class314("Silent", 1);
        Field9331 = class314Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class314() {
        void var2_-1;
        void var1_-1;
    }

    public static Class314[] values() {
        return (hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field9331.clone();
    }

    public static Class314 valueOf(String string) {
        return Enum.valueOf(Class314.class, string);
    }

    private static String Method1598(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 24;
            cArray2[n] = (char)(cArray[n] ^ (0xCBA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

