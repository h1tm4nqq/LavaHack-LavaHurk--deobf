/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/player/AutoEat$Mode;", "", "(Ljava/lang/String;I)V", "Hunger", "Saturation", "kisman.cc"})
final class Class1689
extends Enum {
    public static final /* enum */ Class1689 Field15843;
    public static final /* enum */ Class1689 Field15844;
    private static final Class1689[] Field15845;
    private int Field15846;

    static {
        Class1689[] class1689Array = new Class1689[2];
        Class1689[] class1689Array2 = class1689Array;
        class1689Array[0] = Field15843 = new Class1689("Hunger", 0);
        class1689Array[1] = Field15844 = new Class1689("Saturation", 1);
        Field15845 = class1689Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1689() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1689[] values() {
        return (nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field15845.clone();
    }

    public static Class1689 valueOf(String string) {
        return Enum.valueOf(Class1689.class, string);
    }

    private static String Method6493(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 144;
            cArray2[n] = (char)(cArray[n] ^ (0xB5E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

