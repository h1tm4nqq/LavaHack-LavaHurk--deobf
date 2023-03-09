/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.loader.l6yKOMt7SVcyIzts9W2dZyllrA36dUBL
 */
package lavahack.loader;

import kotlin.Metadata;
import lavahack.loader.l6yKOMt7SVcyIzts9W2dZyllrA36dUBL;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/loader/websockets/api/enums/HandshakeState;", "", "(Ljava/lang/String;I)V", "MATCHED", "NOT_MATCHED", "kisman.cc"})
public final class Class1550
extends Enum {
    public static final /* enum */ Class1550 Field15233;
    public static final /* enum */ Class1550 Field15234;
    private static final Class1550[] Field15235;
    private String Field15236 = "TheKisDevs & LavaHack Development owns you";

    static {
        Class1550[] class1550Array = new Class1550[2];
        Class1550[] class1550Array2 = class1550Array;
        class1550Array[0] = Field15233 = new Class1550("MATCHED", 0);
        class1550Array[1] = Field15234 = new Class1550("NOT_MATCHED", 1);
        Field15235 = class1550Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1550() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1550[] values() {
        return (l6yKOMt7SVcyIzts9W2dZyllrA36dUBL[])Field15235.clone();
    }

    public static Class1550 valueOf(String string) {
        return Enum.valueOf(Class1550.class, string);
    }

    private static String Method6121(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 97;
            cArray2[n] = (char)(cArray[n] ^ (0x5DB6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

