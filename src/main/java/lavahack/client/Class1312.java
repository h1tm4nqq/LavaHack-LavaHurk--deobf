/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/SwitchModes;", "", "(Ljava/lang/String;I)V", "None", "Normal", "Silent", "kisman.cc"})
public final class Class1312
extends Enum {
    public static final /* enum */ Class1312 Field14037;
    public static final /* enum */ Class1312 Field14038;
    public static final /* enum */ Class1312 Field14039;
    private static final Class1312[] Field14040;
    private String Field14041 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1312[] class1312Array = new Class1312[3];
        Class1312[] class1312Array2 = class1312Array;
        class1312Array[0] = Field14037 = new Class1312("None", 0);
        class1312Array[1] = Field14038 = new Class1312("Normal", 1);
        class1312Array[2] = Field14039 = new Class1312("Silent", 2);
        Field14040 = class1312Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1312() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1312[] values() {
        return (tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl[])Field14040.clone();
    }

    public static Class1312 valueOf(String string) {
        return Enum.valueOf(Class1312.class, string);
    }

    private static String Method5346(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 232;
            cArray2[n] = (char)(cArray[n] ^ (0x456E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

