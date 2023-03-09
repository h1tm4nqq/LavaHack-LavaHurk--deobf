/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/enums/BurrowStages;", "", "(Ljava/lang/String;I)V", "Centering", "PreparePlacing", "Placing", "Clipping", "Burrowing", "kisman.cc"})
public final class Class1390
extends Enum {
    public static final /* enum */ Class1390 Field14299;
    public static final /* enum */ Class1390 Field14300;
    public static final /* enum */ Class1390 Field14301;
    public static final /* enum */ Class1390 Field14302;
    public static final /* enum */ Class1390 Field14303;
    private static final Class1390[] Field14304;
    private String Field14305 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1390[] class1390Array = new Class1390[5];
        Class1390[] class1390Array2 = class1390Array;
        class1390Array[0] = Field14299 = new Class1390("Centering", 0);
        class1390Array[1] = Field14300 = new Class1390("PreparePlacing", 1);
        class1390Array[2] = Field14301 = new Class1390("Placing", 2);
        class1390Array[3] = Field14302 = new Class1390("Clipping", 3);
        class1390Array[4] = Field14303 = new Class1390("Burrowing", 4);
        Field14304 = class1390Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1390() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1390[] values() {
        return (IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5[])Field14304.clone();
    }

    public static Class1390 valueOf(String string) {
        return Enum.valueOf(Class1390.class, string);
    }

    private static String Method5498(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 29;
            cArray2[n] = (char)(cArray[n] ^ (0x5AEB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

