/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.g8jTvcUlgGLqqDPccwxFmeywlQlS99ad
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.g8jTvcUlgGLqqDPccwxFmeywlQlS99ad;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/GlowModes;", "", "(Ljava/lang/String;I)V", "Default", "Shader", "kisman.cc"})
public final class Class55
extends Enum {
    public static final /* enum */ Class55 Field8170;
    public static final /* enum */ Class55 Field8171;
    private static final Class55[] Field8172;
    private String Field8173 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class55[] class55Array = new Class55[2];
        Class55[] class55Array2 = class55Array;
        class55Array[0] = Field8170 = new Class55("Default", 0);
        class55Array[1] = Field8171 = new Class55("Shader", 1);
        Field8172 = class55Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class55() {
        void var2_-1;
        void var1_-1;
    }

    public static Class55[] values() {
        return (g8jTvcUlgGLqqDPccwxFmeywlQlS99ad[])Field8172.clone();
    }

    public static Class55 valueOf(String string) {
        return Enum.valueOf(Class55.class, string);
    }

    private static String Method486(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 126;
            cArray2[n] = (char)(cArray[n] ^ (0x5FF8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

