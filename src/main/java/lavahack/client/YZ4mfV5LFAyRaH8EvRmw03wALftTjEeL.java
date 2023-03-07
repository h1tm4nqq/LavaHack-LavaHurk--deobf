/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/websockets/api/enums/Role;", "", "(Ljava/lang/String;I)V", "CLIENT", "SERVER", "kisman.cc"})
public final class YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL
extends Enum {
    public static final /* enum */ YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL Field11414;
    public static final /* enum */ YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL Field11415;
    private static final YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL[] Field11416;
    private String Field11417 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL[] yZ4mfV5LFAyRaH8EvRmw03wALftTjEeLArray = new YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL[(int)((long)69660027 ^ (long)69660026) << 1];
        YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL[] yZ4mfV5LFAyRaH8EvRmw03wALftTjEeLArray2 = yZ4mfV5LFAyRaH8EvRmw03wALftTjEeLArray;
        yZ4mfV5LFAyRaH8EvRmw03wALftTjEeLArray[(int)928435910L ^ 0x3756CEC6] = Field11414 = new YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL("CLIENT", (int)78837443L ^ 0x4B2F6C3);
        yZ4mfV5LFAyRaH8EvRmw03wALftTjEeLArray[(int)((long)-22522755 ^ (long)-22522756)] = Field11415 = new YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL("SERVER", (int)-525958737L ^ 0xE0A681AE);
        Field11416 = yZ4mfV5LFAyRaH8EvRmw03wALftTjEeLArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL() {
        void var2_-1;
        void var1_-1;
    }

    public static YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL[] values() {
        return (YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL[])Field11416.clone();
    }

    public static YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL valueOf(String string) {
        return Enum.valueOf(YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL.class, string);
    }

    private static String Method3390(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1074732898L ^ 0x400F1F62;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1308542277L ^ 0xB2013A44);
            int n2 = ((int)-1854597252L ^ 0x91751779) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)1017718287L ^ 0x3CA92E20) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

