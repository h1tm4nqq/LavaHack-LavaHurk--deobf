/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.ADIF586Nr0L3HddvBETPsOnmnXQkvbXn
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.ADIF586Nr0L3HddvBETPsOnmnXQkvbXn;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/minecraft/FormatterType;", "", "(Ljava/lang/String;I)V", "Color", "Style", "kisman.cc"})
public final class Class372
extends Enum {
    public static final /* enum */ Class372 Field9559;
    public static final /* enum */ Class372 Field9560;
    private static final Class372[] Field9561;
    private String Field9562 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class372[] class372Array = new Class372[2];
        Class372[] class372Array2 = class372Array;
        class372Array[0] = Field9559 = new Class372("Color", 0);
        class372Array[1] = Field9560 = new Class372("Style", 1);
        Field9561 = class372Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class372() {
        void var2_-1;
        void var1_-1;
    }

    public static Class372[] values() {
        return (ADIF586Nr0L3HddvBETPsOnmnXQkvbXn[])Field9561.clone();
    }

    public static Class372 valueOf(String string) {
        return Enum.valueOf(Class372.class, string);
    }

    private static String Method1823(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 211;
            cArray2[n] = (char)(cArray[n] ^ (0x3612 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

