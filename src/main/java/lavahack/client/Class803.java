/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/websockets/api/enums/Role;", "", "(Ljava/lang/String;I)V", "CLIENT", "SERVER", "kisman.cc"})
public final class Class803
extends Enum {
    public static final /* enum */ Class803 Field11414;
    public static final /* enum */ Class803 Field11415;
    private static final Class803[] Field11416;
    private String Field11417 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class803[] class803Array = new Class803[2];
        Class803[] class803Array2 = class803Array;
        class803Array[0] = Field11414 = new Class803("CLIENT", 0);
        class803Array[1] = Field11415 = new Class803("SERVER", 1);
        Field11416 = class803Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class803() {
        void var2_-1;
        void var1_-1;
    }

    public static Class803[] values() {
        return (YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL[])Field11416.clone();
    }

    public static Class803 valueOf(String string) {
        return Enum.valueOf(Class803.class, string);
    }

    private static String Method3390(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 20;
            cArray2[n] = (char)(cArray[n] ^ (0x20BC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

