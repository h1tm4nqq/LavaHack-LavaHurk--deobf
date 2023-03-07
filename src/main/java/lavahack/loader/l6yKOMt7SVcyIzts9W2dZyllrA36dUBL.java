/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.loader;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/loader/websockets/api/enums/HandshakeState;", "", "(Ljava/lang/String;I)V", "MATCHED", "NOT_MATCHED", "kisman.cc"})
public final class l6yKOMt7SVcyIzts9W2dZyllrA36dUBL
extends Enum {
    public static final /* enum */ l6yKOMt7SVcyIzts9W2dZyllrA36dUBL Field15233;
    public static final /* enum */ l6yKOMt7SVcyIzts9W2dZyllrA36dUBL Field15234;
    private static final l6yKOMt7SVcyIzts9W2dZyllrA36dUBL[] Field15235;
    private String Field15236 = "TheKisDevs & LavaHack Development owns you";

    static {
        l6yKOMt7SVcyIzts9W2dZyllrA36dUBL[] l6yKOMt7SVcyIzts9W2dZyllrA36dUBLArray = new l6yKOMt7SVcyIzts9W2dZyllrA36dUBL[(int)((long)-1260138951 ^ (long)-1260138952) << 1];
        l6yKOMt7SVcyIzts9W2dZyllrA36dUBL[] l6yKOMt7SVcyIzts9W2dZyllrA36dUBLArray2 = l6yKOMt7SVcyIzts9W2dZyllrA36dUBLArray;
        l6yKOMt7SVcyIzts9W2dZyllrA36dUBLArray[(int)((long)348540200 ^ (long)348540200)] = Field15233 = new l6yKOMt7SVcyIzts9W2dZyllrA36dUBL("MATCHED", (int)1275163043L ^ 0x4C0171A3);
        l6yKOMt7SVcyIzts9W2dZyllrA36dUBLArray[(int)-1183832769L ^ 0xB970253E] = Field15234 = new l6yKOMt7SVcyIzts9W2dZyllrA36dUBL("NOT_MATCHED", (int)((long)807670147 ^ (long)807670146));
        Field15235 = l6yKOMt7SVcyIzts9W2dZyllrA36dUBLArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private l6yKOMt7SVcyIzts9W2dZyllrA36dUBL() {
        void var2_-1;
        void var1_-1;
    }

    public static l6yKOMt7SVcyIzts9W2dZyllrA36dUBL[] values() {
        return (l6yKOMt7SVcyIzts9W2dZyllrA36dUBL[])Field15235.clone();
    }

    public static l6yKOMt7SVcyIzts9W2dZyllrA36dUBL valueOf(String string) {
        return Enum.valueOf(l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.class, string);
    }

    private static String Method6121(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1239192337L ^ 0x49DC9311;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1208000287L ^ 0xB7FF601E);
            int n2 = (int)266728808L ^ 0xFE5F509;
            cArray2[n] = (char)(cArray[n] ^ (((int)1615271626L ^ 0x60473811) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

