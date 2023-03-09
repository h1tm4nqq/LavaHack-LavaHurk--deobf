/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.mPNKUHesROKSVtFpAZyhLqRAupt8dodO
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.mPNKUHesROKSVtFpAZyhLqRAupt8dodO;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/websockets/api/enums/Opcode;", "", "(Ljava/lang/String;I)V", "CONTINUOUS", "TEXT", "BINARY", "PING", "PONG", "CLOSING", "kisman.cc"})
public final class Class927
extends Enum {
    public static final /* enum */ Class927 Field11926;
    public static final /* enum */ Class927 Field11927;
    public static final /* enum */ Class927 Field11928;
    public static final /* enum */ Class927 Field11929;
    public static final /* enum */ Class927 Field11930;
    public static final /* enum */ Class927 Field11931;
    private static final Class927[] Field11932;
    private String Field11933 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class927[] class927Array = new Class927[6];
        Class927[] class927Array2 = class927Array;
        class927Array[0] = Field11926 = new Class927("CONTINUOUS", 0);
        class927Array[1] = Field11927 = new Class927("TEXT", 1);
        class927Array[2] = Field11928 = new Class927("BINARY", 2);
        class927Array[3] = Field11929 = new Class927("PING", 3);
        class927Array[4] = Field11930 = new Class927("PONG", 4);
        class927Array[5] = Field11931 = new Class927("CLOSING", 5);
        Field11932 = class927Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class927() {
        void var2_-1;
        void var1_-1;
    }

    public static Class927[] values() {
        return (mPNKUHesROKSVtFpAZyhLqRAupt8dodO[])Field11932.clone();
    }

    public static Class927 valueOf(String string) {
        return Enum.valueOf(Class927.class, string);
    }

    private static String Method3847(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 38;
            cArray2[n] = (char)(cArray[n] ^ (0x2397 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

