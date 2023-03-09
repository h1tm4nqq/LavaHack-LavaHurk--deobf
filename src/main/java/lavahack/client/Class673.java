/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/websockets/api/enums/CloseHandshakeType;", "", "(Ljava/lang/String;I)V", "NONE", "ONEWAY", "TWOWAY", "kisman.cc"})
public final class Class673
extends Enum {
    public static final /* enum */ Class673 Field10859;
    public static final /* enum */ Class673 Field10860;
    public static final /* enum */ Class673 Field10861;
    private static final Class673[] Field10862;
    private int Field10863;

    static {
        Class673[] class673Array = new Class673[3];
        Class673[] class673Array2 = class673Array;
        class673Array[0] = Field10859 = new Class673("NONE", 0);
        class673Array[1] = Field10860 = new Class673("ONEWAY", 1);
        class673Array[2] = Field10861 = new Class673("TWOWAY", 2);
        Field10862 = class673Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class673() {
        void var2_-1;
        void var1_-1;
    }

    public static Class673[] values() {
        return (kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF[])Field10862.clone();
    }

    public static Class673 valueOf(String string) {
        return Enum.valueOf(Class673.class, string);
    }

    private static String Method2858(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 134;
            cArray2[n] = (char)(cArray[n] ^ (0x5C35 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

