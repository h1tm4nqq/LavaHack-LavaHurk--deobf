/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.wfq6g7eP125PNHmXSJva2wZAtBH7JgUG
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.wfq6g7eP125PNHmXSJva2wZAtBH7JgUG;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/util/enums/EntityESPModes;", "", "(Ljava/lang/String;I)V", "None", "Glow", "Box1", "Cubic", "kisman.cc"})
public final class Class1745
extends Enum {
    public static final /* enum */ Class1745 Field16010;
    public static final /* enum */ Class1745 Field16011;
    public static final /* enum */ Class1745 Field16012;
    public static final /* enum */ Class1745 Field16013;
    private static final Class1745[] Field16014;
    private String Field16015 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1745[] class1745Array = new Class1745[4];
        Class1745[] class1745Array2 = class1745Array;
        class1745Array[0] = Field16010 = new Class1745("None", 0);
        class1745Array[1] = Field16011 = new Class1745("Glow", 1);
        class1745Array[2] = Field16012 = new Class1745("Box1", 2);
        class1745Array[3] = Field16013 = new Class1745("Cubic", 3);
        Field16014 = class1745Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1745() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1745[] values() {
        return (wfq6g7eP125PNHmXSJva2wZAtBH7JgUG[])Field16014.clone();
    }

    public static Class1745 valueOf(String string) {
        return Enum.valueOf(Class1745.class, string);
    }

    private static String Method6666(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 90;
            cArray2[n] = (char)(cArray[n] ^ (0x6714 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

