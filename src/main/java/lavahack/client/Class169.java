/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/enums/ChromaColorTypes;", "", "(Ljava/lang/String;I)V", "Rainbow", "Astolfo", "Pulsive", "Fade", "Static", "kisman.cc"})
public final class Class169
extends Enum {
    public static final /* enum */ Class169 Field8718;
    public static final /* enum */ Class169 Field8719;
    public static final /* enum */ Class169 Field8720;
    public static final /* enum */ Class169 Field8721;
    public static final /* enum */ Class169 Field8722;
    private static final Class169[] Field8723;
    private String Field8724 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class169[] class169Array = new Class169[5];
        Class169[] class169Array2 = class169Array;
        class169Array[0] = Field8718 = new Class169("Rainbow", 0);
        class169Array[1] = Field8719 = new Class169("Astolfo", 1);
        class169Array[2] = Field8720 = new Class169("Pulsive", 2);
        class169Array[3] = Field8721 = new Class169("Fade", 3);
        class169Array[4] = Field8722 = new Class169("Static", 4);
        Field8723 = class169Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class169() {
        void var2_-1;
        void var1_-1;
    }

    public static Class169[] values() {
        return (m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs[])Field8723.clone();
    }

    public static Class169 valueOf(String string) {
        return Enum.valueOf(Class169.class, string);
    }

    private static String Method1069(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 181;
            cArray2[n] = (char)(cArray[n] ^ (0x6D18 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

