/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/PingBypassProtocol;", "", "(Ljava/lang/String;I)V", "Legacy", "New", "kisman.cc"})
public final class Class1963
extends Enum {
    public static final /* enum */ Class1963 Field17037;
    public static final /* enum */ Class1963 Field17038;
    private static final Class1963[] Field17039;
    private String Field17040 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1963[] class1963Array = new Class1963[2];
        Class1963[] class1963Array2 = class1963Array;
        class1963Array[0] = Field17037 = new Class1963("Legacy", 0);
        class1963Array[1] = Field17038 = new Class1963("New", 1);
        Field17039 = class1963Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1963() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1963[] values() {
        return (PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77[])Field17039.clone();
    }

    public static Class1963 valueOf(String string) {
        return Enum.valueOf(Class1963.class, string);
    }

    private static String Method7283(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 147;
            cArray2[n] = (char)(cArray[n] ^ (0x3B4A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

