/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.teHGsWNMfak8q0vZAzzUvn920xzQ8my5
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.teHGsWNMfak8q0vZAzzUvn920xzQ8my5;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/Rotations;", "", "(Ljava/lang/String;I)V", "Client", "Packet", "kisman.cc"})
public final class Class949
extends Enum {
    public static final /* enum */ Class949 Field12046;
    public static final /* enum */ Class949 Field12047;
    private static final Class949[] Field12048;
    private String Field12049 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class949[] class949Array = new Class949[2];
        Class949[] class949Array2 = class949Array;
        class949Array[0] = Field12046 = new Class949("Client", 0);
        class949Array[1] = Field12047 = new Class949("Packet", 1);
        Field12048 = class949Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class949() {
        void var2_-1;
        void var1_-1;
    }

    public static Class949[] values() {
        return (teHGsWNMfak8q0vZAzzUvn920xzQ8my5[])Field12048.clone();
    }

    public static Class949 valueOf(String string) {
        return Enum.valueOf(Class949.class, string);
    }

    private static String Method3913(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 72;
            cArray2[n] = (char)(cArray[n] ^ (0x4A84 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

