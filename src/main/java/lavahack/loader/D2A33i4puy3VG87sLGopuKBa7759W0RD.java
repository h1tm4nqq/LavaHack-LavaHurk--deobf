/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.loader;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/loader/websockets/api/enums/Opcode;", "", "(Ljava/lang/String;I)V", "CONTINUOUS", "TEXT", "BINARY", "PING", "PONG", "CLOSING", "kisman.cc"})
public final class D2A33i4puy3VG87sLGopuKBa7759W0RD
extends Enum {
    public static final /* enum */ D2A33i4puy3VG87sLGopuKBa7759W0RD Field16033;
    public static final /* enum */ D2A33i4puy3VG87sLGopuKBa7759W0RD Field16034;
    public static final /* enum */ D2A33i4puy3VG87sLGopuKBa7759W0RD Field16035;
    public static final /* enum */ D2A33i4puy3VG87sLGopuKBa7759W0RD Field16036;
    public static final /* enum */ D2A33i4puy3VG87sLGopuKBa7759W0RD Field16037;
    public static final /* enum */ D2A33i4puy3VG87sLGopuKBa7759W0RD Field16038;
    private static final D2A33i4puy3VG87sLGopuKBa7759W0RD[] Field16039;
    private String Field16040 = "TheKisDevs & LavaHack Development owns you";

    static {
        D2A33i4puy3VG87sLGopuKBa7759W0RD[] d2A33i4puy3VG87sLGopuKBa7759W0RDArray = new D2A33i4puy3VG87sLGopuKBa7759W0RD[((int)-2071165837L ^ 0x848C8470) << 1];
        D2A33i4puy3VG87sLGopuKBa7759W0RD[] d2A33i4puy3VG87sLGopuKBa7759W0RDArray2 = d2A33i4puy3VG87sLGopuKBa7759W0RDArray;
        d2A33i4puy3VG87sLGopuKBa7759W0RDArray[(int)((long)-294170428 ^ (long)-294170428)] = Field16033 = new D2A33i4puy3VG87sLGopuKBa7759W0RD("CONTINUOUS", (int)-816135469L ^ 0xCF5AC2D3);
        d2A33i4puy3VG87sLGopuKBa7759W0RDArray[(int)((long)1598109347 ^ (long)1598109346)] = Field16034 = new D2A33i4puy3VG87sLGopuKBa7759W0RD("TEXT", (int)-1347117863L ^ 0xAFB49CD8);
        d2A33i4puy3VG87sLGopuKBa7759W0RDArray[((int)-1699437449L ^ 0x9AB4A476) << 1] = Field16035 = new D2A33i4puy3VG87sLGopuKBa7759W0RD("BINARY", ((int)-1684615723L ^ 0x9B96CDD4) << 1);
        d2A33i4puy3VG87sLGopuKBa7759W0RDArray[(int)595220753L ^ 0x237A5912] = Field16036 = new D2A33i4puy3VG87sLGopuKBa7759W0RD("PING", (int)-38469279L ^ 0xFDB50162);
        d2A33i4puy3VG87sLGopuKBa7759W0RDArray[((int)2108486164L ^ 0x7DACF215) << 2] = Field16037 = new D2A33i4puy3VG87sLGopuKBa7759W0RD("PONG", ((int)222328346L ^ 0xD40761B) << 2);
        d2A33i4puy3VG87sLGopuKBa7759W0RDArray[(int)((long)404840040 ^ (long)404840045)] = Field16038 = new D2A33i4puy3VG87sLGopuKBa7759W0RD("CLOSING", (int)-1409999569L ^ 0xABF51D2A);
        Field16039 = d2A33i4puy3VG87sLGopuKBa7759W0RDArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private D2A33i4puy3VG87sLGopuKBa7759W0RD() {
        void var2_-1;
        void var1_-1;
    }

    public static D2A33i4puy3VG87sLGopuKBa7759W0RD[] values() {
        return (D2A33i4puy3VG87sLGopuKBa7759W0RD[])Field16039.clone();
    }

    public static D2A33i4puy3VG87sLGopuKBa7759W0RD valueOf(String string) {
        return Enum.valueOf(D2A33i4puy3VG87sLGopuKBa7759W0RD.class, string);
    }

    private static String Method6680(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1682895538L ^ 0x9BB10D4E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-508128125L ^ 0xE1B6947C);
            int n2 = (int)1069191288L ^ 0x3FBA90DF;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1584081904 ^ (long)1584083277) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

