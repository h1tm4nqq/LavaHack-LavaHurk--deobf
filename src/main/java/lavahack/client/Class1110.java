/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.uTNHNbOTD4Ge3sROsUtKSqCNUBWL02ML$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.uTNHNbOTD4Ge3sROsUtKSqCNUBWL02ML;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/module/Debug/ScreenShaders$Shader;", "", "(Ljava/lang/String;I)V", "RoundedRectAlpha", "RoundedRect", "Blur", "kisman.cc"})
final class Class1110
extends Enum {
    public static final /* enum */ Class1110 Field12996;
    public static final /* enum */ Class1110 Field12997;
    public static final /* enum */ Class1110 Field12998;
    private static final Class1110[] Field12999;
    private String Field13000 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1110[] class1110Array = new Class1110[3];
        Class1110[] class1110Array2 = class1110Array;
        class1110Array[0] = Field12996 = new Class1110("RoundedRectAlpha", 0);
        class1110Array[1] = Field12997 = new Class1110("RoundedRect", 1);
        class1110Array[2] = Field12998 = new Class1110("Blur", 2);
        Field12999 = class1110Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1110() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1110[] values() {
        return (uTNHNbOTD4Ge3sROsUtKSqCNUBWL02ML.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field12999.clone();
    }

    public static Class1110 valueOf(String string) {
        return Enum.valueOf(Class1110.class, string);
    }

    private static String Method4541(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 180;
            cArray2[n] = (char)(cArray[n] ^ (0x344 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

