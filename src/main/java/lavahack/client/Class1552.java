/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/module/movement/MoveModifier$MotionLimiterNegativeYMode;", "", "(Ljava/lang/String;I)V", "None", "Value", "ReverseStep", "kisman.cc"})
final class Class1552
extends Enum {
    public static final /* enum */ Class1552 Field15239;
    public static final /* enum */ Class1552 Field15240;
    public static final /* enum */ Class1552 Field15241;
    private static final Class1552[] Field15242;
    private int Field15243;

    static {
        Class1552[] class1552Array = new Class1552[3];
        Class1552[] class1552Array2 = class1552Array;
        class1552Array[0] = Field15239 = new Class1552("None", 0);
        class1552Array[1] = Field15240 = new Class1552("Value", 1);
        class1552Array[2] = Field15241 = new Class1552("ReverseStep", 2);
        Field15242 = class1552Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1552() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1552[] values() {
        return (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV[])Field15242.clone();
    }

    public static Class1552 valueOf(String string) {
        return Enum.valueOf(Class1552.class, string);
    }

    private static String Method6125(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 226;
            cArray2[n] = (char)(cArray[n] ^ (0x163 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

