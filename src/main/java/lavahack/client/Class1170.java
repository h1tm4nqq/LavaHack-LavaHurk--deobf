/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.NocBeYWkcFqTxpnVpScPklEhyOPFu3IN
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.NocBeYWkcFqTxpnVpScPklEhyOPFu3IN;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/AntiCrystalAngles;", "", "(Ljava/lang/String;I)V", "SurroundBlocks", "UppedSurroundBlocks", "kisman.cc"})
public final class Class1170
extends Enum {
    public static final /* enum */ Class1170 Field13272;
    public static final /* enum */ Class1170 Field13273;
    private static final Class1170[] Field13274;
    private String Field13275 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1170[] class1170Array = new Class1170[2];
        Class1170[] class1170Array2 = class1170Array;
        class1170Array[0] = Field13272 = new Class1170("SurroundBlocks", 0);
        class1170Array[1] = Field13273 = new Class1170("UppedSurroundBlocks", 1);
        Field13274 = class1170Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1170() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1170[] values() {
        return (NocBeYWkcFqTxpnVpScPklEhyOPFu3IN[])Field13274.clone();
    }

    public static Class1170 valueOf(String string) {
        return Enum.valueOf(Class1170.class, string);
    }

    private static String Method4696(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 181;
            cArray2[n] = (char)(cArray[n] ^ (0x1746 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

