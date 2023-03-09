/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/features/module/movement/speed/util/Motion;", "", "(Ljava/lang/String;I)V", "X", "Z", "mX", "mZ", "kisman.cc"})
public final class Class562
extends Enum {
    public static final /* enum */ Class562 Field10392;
    public static final /* enum */ Class562 Field10393;
    public static final /* enum */ Class562 Field10394;
    public static final /* enum */ Class562 Field10395;
    private static final Class562[] Field10396;
    private String Field10397 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class562[] class562Array = new Class562[4];
        Class562[] class562Array2 = class562Array;
        class562Array[0] = Field10392 = new Class562("X", 0);
        class562Array[1] = Field10393 = new Class562("Z", 1);
        class562Array[2] = Field10394 = new Class562("mX", 2);
        class562Array[3] = Field10395 = new Class562("mZ", 3);
        Field10396 = class562Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class562() {
        void var2_-1;
        void var1_-1;
    }

    public static Class562[] values() {
        return (sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt[])Field10396.clone();
    }

    public static Class562 valueOf(String string) {
        return Enum.valueOf(Class562.class, string);
    }

    private static String Method2479(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 68;
            cArray2[n] = (char)(cArray[n] ^ (0x7A02 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

