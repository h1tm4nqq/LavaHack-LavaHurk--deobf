/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.loader.D2A33i4puy3VG87sLGopuKBa7759W0RD
 */
package lavahack.loader;

import kotlin.Metadata;
import lavahack.loader.D2A33i4puy3VG87sLGopuKBa7759W0RD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/loader/websockets/api/enums/Opcode;", "", "(Ljava/lang/String;I)V", "CONTINUOUS", "TEXT", "BINARY", "PING", "PONG", "CLOSING", "kisman.cc"})
public final class Class1753
extends Enum {
    public static final /* enum */ Class1753 Field16033;
    public static final /* enum */ Class1753 Field16034;
    public static final /* enum */ Class1753 Field16035;
    public static final /* enum */ Class1753 Field16036;
    public static final /* enum */ Class1753 Field16037;
    public static final /* enum */ Class1753 Field16038;
    private static final Class1753[] Field16039;
    private String Field16040 = "TheKisDevs & LavaHack Development owns you";

    static {
        Class1753[] class1753Array = new Class1753[6];
        Class1753[] class1753Array2 = class1753Array;
        class1753Array[0] = Field16033 = new Class1753("CONTINUOUS", 0);
        class1753Array[1] = Field16034 = new Class1753("TEXT", 1);
        class1753Array[2] = Field16035 = new Class1753("BINARY", 2);
        class1753Array[3] = Field16036 = new Class1753("PING", 3);
        class1753Array[4] = Field16037 = new Class1753("PONG", 4);
        class1753Array[5] = Field16038 = new Class1753("CLOSING", 5);
        Field16039 = class1753Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1753() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1753[] values() {
        return (D2A33i4puy3VG87sLGopuKBa7759W0RD[])Field16039.clone();
    }

    public static Class1753 valueOf(String string) {
        return Enum.valueOf(Class1753.class, string);
    }

    private static String Method6680(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 167;
            cArray2[n] = (char)(cArray[n] ^ (0x6AF4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

