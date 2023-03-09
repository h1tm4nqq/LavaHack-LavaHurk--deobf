/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/util/enums/KillAuraWeapons;", "", "(Ljava/lang/String;I)V", "None", "Sword", "Axe", "Both", "kisman.cc"})
public final class Class1144
extends Enum {
    public static final /* enum */ Class1144 Field13166;
    public static final /* enum */ Class1144 Field13167;
    public static final /* enum */ Class1144 Field13168;
    public static final /* enum */ Class1144 Field13169;
    private static final Class1144[] Field13170;
    private String Field13171 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1144[] class1144Array = new Class1144[4];
        Class1144[] class1144Array2 = class1144Array;
        class1144Array[0] = Field13166 = new Class1144("None", 0);
        class1144Array[1] = Field13167 = new Class1144("Sword", 1);
        class1144Array[2] = Field13168 = new Class1144("Axe", 2);
        class1144Array[3] = Field13169 = new Class1144("Both", 3);
        Field13170 = class1144Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1144() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1144[] values() {
        return (Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i[])Field13170.clone();
    }

    public static Class1144 valueOf(String string) {
        return Enum.valueOf(Class1144.class, string);
    }

    private static String Method4632(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 140;
            cArray2[n] = (char)(cArray[n] ^ (0x4694 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

