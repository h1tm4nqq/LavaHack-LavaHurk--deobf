/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.mHbkRHZKusDv305PoVrIANUx3CcrHj9E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.mHbkRHZKusDv305PoVrIANUx3CcrHj9E;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/util/enums/SoftBlocks$ElementType;", "", "(Ljava/lang/String;I)V", "Item", "Items", "Block", "Blocks", "kisman.cc"})
public final class Class1949
extends Enum {
    public static final /* enum */ Class1949 Field17004;
    public static final /* enum */ Class1949 Field17005;
    public static final /* enum */ Class1949 Field17006;
    public static final /* enum */ Class1949 Field17007;
    private static final Class1949[] Field17008;
    private String Field17009 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1949[] class1949Array = new Class1949[4];
        Class1949[] class1949Array2 = class1949Array;
        class1949Array[0] = Field17004 = new Class1949("Item", 0);
        class1949Array[1] = Field17005 = new Class1949("Items", 1);
        class1949Array[2] = Field17006 = new Class1949("Block", 2);
        class1949Array[3] = Field17007 = new Class1949("Blocks", 3);
        Field17008 = class1949Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1949() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1949[] values() {
        return (mHbkRHZKusDv305PoVrIANUx3CcrHj9E.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field17008.clone();
    }

    public static Class1949 valueOf(String string) {
        return Enum.valueOf(Class1949.class, string);
    }

    private static String Method7235(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 62;
            cArray2[n] = (char)(cArray[n] ^ (0x1A6D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

