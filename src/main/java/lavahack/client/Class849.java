/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/module/player/RotateModifier$RotationLockLogic;", "", "(Ljava/lang/String;I)V", "None", "Normal", "FreeLook", "kisman.cc"})
final class Class849
extends Enum {
    public static final /* enum */ Class849 Field11587;
    public static final /* enum */ Class849 Field11588;
    public static final /* enum */ Class849 Field11589;
    private static final Class849[] Field11590;
    private String Field11591 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class849[] class849Array = new Class849[3];
        Class849[] class849Array2 = class849Array;
        class849Array[0] = Field11587 = new Class849("None", 0);
        class849Array[1] = Field11588 = new Class849("Normal", 1);
        class849Array[2] = Field11589 = new Class849("FreeLook", 2);
        Field11590 = class849Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class849() {
        void var2_-1;
        void var1_-1;
    }

    public static Class849[] values() {
        return (KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field11590.clone();
    }

    public static Class849 valueOf(String string) {
        return Enum.valueOf(Class849.class, string);
    }

    private static String Method3586(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 4;
            cArray2[n] = (char)(cArray[n] ^ (0x69EB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

