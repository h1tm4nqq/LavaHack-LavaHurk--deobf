/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/BoxRenderModes;", "", "(Ljava/lang/String;I)V", "Filled", "Outline", "Both", "kisman.cc"})
public final class Class1246
extends Enum {
    public static final /* enum */ Class1246 Field13643;
    public static final /* enum */ Class1246 Field13644;
    public static final /* enum */ Class1246 Field13645;
    private static final Class1246[] Field13646;
    private int Field13647;

    static {
        Class1246[] class1246Array = new Class1246[3];
        Class1246[] class1246Array2 = class1246Array;
        class1246Array[0] = Field13643 = new Class1246("Filled", 0);
        class1246Array[1] = Field13644 = new Class1246("Outline", 1);
        class1246Array[2] = Field13645 = new Class1246("Both", 2);
        Field13646 = class1246Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1246() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1246[] values() {
        return (cdqy6rDItOpkxgOPyMP0k8hjRZVGKSkO[])Field13646.clone();
    }

    public static Class1246 valueOf(String string) {
        return Enum.valueOf(Class1246.class, string);
    }

    private static String Method5011(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 94;
            cArray2[n] = (char)(cArray[n] ^ (0x1283 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

