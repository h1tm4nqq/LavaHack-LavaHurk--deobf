/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.loader.pkFsFgiZykGBET8wx0XXygS5258qy2Bd
 */
package lavahack.loader;

import kotlin.Metadata;
import lavahack.loader.pkFsFgiZykGBET8wx0XXygS5258qy2Bd;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/loader/websockets/api/enums/CloseHandshakeType;", "", "(Ljava/lang/String;I)V", "NONE", "ONEWAY", "TWOWAY", "kisman.cc"})
public final class Class1159
extends Enum {
    public static final /* enum */ Class1159 Field13228;
    public static final /* enum */ Class1159 Field13229;
    public static final /* enum */ Class1159 Field13230;
    private static final Class1159[] Field13231;
    private String Field13232 = "TheKisDevs & LavaHack Development owns you";

    static {
        Class1159[] class1159Array = new Class1159[3];
        Class1159[] class1159Array2 = class1159Array;
        class1159Array[0] = Field13228 = new Class1159("NONE", 0);
        class1159Array[1] = Field13229 = new Class1159("ONEWAY", 1);
        class1159Array[2] = Field13230 = new Class1159("TWOWAY", 2);
        Field13231 = class1159Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1159() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1159[] values() {
        return (pkFsFgiZykGBET8wx0XXygS5258qy2Bd[])Field13231.clone();
    }

    public static Class1159 valueOf(String string) {
        return Enum.valueOf(Class1159.class, string);
    }

    private static String Method4680(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 156;
            cArray2[n] = (char)(cArray[n] ^ (0x770E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

