/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/FadeLogic;", "", "(Ljava/lang/String;I)V", "Time", "Distance", "kisman.cc"})
public final class Class1480
extends Enum {
    public static final /* enum */ Class1480 Field14901;
    public static final /* enum */ Class1480 Field14902;
    private static final Class1480[] Field14903;
    private String Field14904 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1480[] class1480Array = new Class1480[2];
        Class1480[] class1480Array2 = class1480Array;
        class1480Array[0] = Field14901 = new Class1480("Time", 0);
        class1480Array[1] = Field14902 = new Class1480("Distance", 1);
        Field14903 = class1480Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1480() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1480[] values() {
        return (hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7[])Field14903.clone();
    }

    public static Class1480 valueOf(String string) {
        return Enum.valueOf(Class1480.class, string);
    }

    private static String Method5922(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 38;
            cArray2[n] = (char)(cArray[n] ^ (0x4665 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

