/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/websockets/api/enums/HandshakeState;", "", "(Ljava/lang/String;I)V", "MATCHED", "NOT_MATCHED", "kisman.cc"})
public final class bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE
extends Enum {
    public static final /* enum */ bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE Field15474;
    public static final /* enum */ bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE Field15475;
    private static final bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE[] Field15476;
    private String Field15477 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE[] bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOEArray = new bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE[((int)1008833559L ^ 0x3C219416) << 1];
        bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE[] bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOEArray2 = bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOEArray;
        bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOEArray[(int)((long)942921238 ^ (long)942921238)] = Field15474 = new bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE("MATCHED", (int)((long)-144140707 ^ (long)-144140707));
        bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOEArray[(int)((long)-746700826 ^ (long)-746700825)] = Field15475 = new bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE("NOT_MATCHED", (int)((long)1995320935 ^ (long)1995320934));
        Field15476 = bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOEArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE() {
        void var2_-1;
        void var1_-1;
    }

    public static bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE[] values() {
        return (bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE[])Field15476.clone();
    }

    public static bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE valueOf(String string) {
        return Enum.valueOf(bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE.class, string);
    }

    private static String Method6255(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1051480586L ^ 0x3EAC520A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1620255128 ^ (long)-1620255081);
            int n2 = (int)((long)1730749027 ^ (long)1730749150);
            cArray2[n] = (char)(cArray[n] ^ (((int)66160169L ^ 0x3F19E38) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

