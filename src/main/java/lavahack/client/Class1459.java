/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class2066;
import lavahack.client.xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/enums/RectSides;", "", "(Ljava/lang/String;I)V", "Top", "Bottom", "Right", "Left", "Companion", "kisman.cc"})
public final class Class1459
extends Enum {
    public static final /* enum */ Class1459 Field14825;
    public static final /* enum */ Class1459 Field14826;
    public static final /* enum */ Class1459 Field14827;
    public static final /* enum */ Class1459 Field14828;
    private static final Class1459[] Field14829;
    public static final Class2066 Field14830;
    private String Field14831 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1459[] class1459Array = new Class1459[4];
        Class1459[] class1459Array2 = class1459Array;
        class1459Array[0] = Field14825 = new Class1459("Top", 0);
        class1459Array[1] = Field14826 = new Class1459("Bottom", 1);
        class1459Array[2] = Field14827 = new Class1459("Right", 2);
        class1459Array[3] = Field14828 = new Class1459("Left", 3);
        Field14829 = class1459Array;
        Field14830 = new Class2066(null);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1459() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1459[] values() {
        return (xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j[])Field14829.clone();
    }

    public static Class1459 valueOf(String string) {
        return Enum.valueOf(Class1459.class, string);
    }

    private static String Method5818(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 99;
            cArray2[n] = (char)(cArray[n] ^ (0x2340 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

