/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/module/movement/MoveModifier$AutoWalkMode;", "", "(Ljava/lang/String;I)V", "None", "Stupid", "Smart", "kisman.cc"})
final class Class1972
extends Enum {
    public static final /* enum */ Class1972 Field17077;
    public static final /* enum */ Class1972 Field17078;
    public static final /* enum */ Class1972 Field17079;
    private static final Class1972[] Field17080;
    private String Field17081 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1972[] class1972Array = new Class1972[3];
        Class1972[] class1972Array2 = class1972Array;
        class1972Array[0] = Field17077 = new Class1972("None", 0);
        class1972Array[1] = Field17078 = new Class1972("Stupid", 1);
        class1972Array[2] = Field17079 = new Class1972("Smart", 2);
        Field17080 = class1972Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1972() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1972[] values() {
        return (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field17080.clone();
    }

    public static Class1972 valueOf(String string) {
        return Enum.valueOf(Class1972.class, string);
    }

    private static String Method7304(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 209;
            cArray2[n] = (char)(cArray[n] ^ (0x5561 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

