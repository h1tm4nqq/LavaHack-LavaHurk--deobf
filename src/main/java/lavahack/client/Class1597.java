/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/websockets/api/enums/HandshakeState;", "", "(Ljava/lang/String;I)V", "MATCHED", "NOT_MATCHED", "kisman.cc"})
public final class Class1597
extends Enum {
    public static final /* enum */ Class1597 Field15474;
    public static final /* enum */ Class1597 Field15475;
    private static final Class1597[] Field15476;
    private String Field15477 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1597[] class1597Array = new Class1597[2];
        Class1597[] class1597Array2 = class1597Array;
        class1597Array[0] = Field15474 = new Class1597("MATCHED", 0);
        class1597Array[1] = Field15475 = new Class1597("NOT_MATCHED", 1);
        Field15476 = class1597Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1597() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1597[] values() {
        return (bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE[])Field15476.clone();
    }

    public static Class1597 valueOf(String string) {
        return Enum.valueOf(Class1597.class, string);
    }

    private static String Method6255(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 189;
            cArray2[n] = (char)(cArray[n] ^ (0x3022 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

