/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/DevelopmentHelperSlotTypes;", "", "(Ljava/lang/String;I)V", "Index", "Number", "kisman.cc"})
public final class Class1928
extends Enum {
    public static final /* enum */ Class1928 Field16945;
    public static final /* enum */ Class1928 Field16946;
    private static final Class1928[] Field16947;
    private String Field16948 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1928[] class1928Array = new Class1928[2];
        Class1928[] class1928Array2 = class1928Array;
        class1928Array[0] = Field16945 = new Class1928("Index", 0);
        class1928Array[1] = Field16946 = new Class1928("Number", 1);
        Field16947 = class1928Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1928() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1928[] values() {
        return (MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI[])Field16947.clone();
    }

    public static Class1928 valueOf(String string) {
        return Enum.valueOf(Class1928.class, string);
    }

    private static String Method7177(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 169;
            cArray2[n] = (char)(cArray[n] ^ (0x1569 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

