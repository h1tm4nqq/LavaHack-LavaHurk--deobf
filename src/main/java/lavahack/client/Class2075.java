/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.abbi5WXwBhAC2jwfVuZJg478P13czAOh
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class261;
import lavahack.client.abbi5WXwBhAC2jwfVuZJg478P13czAOh;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/enums/GradientModes;", "", "(Ljava/lang/String;I)V", "None", "Rainbow", "Astolfo", "Pulsive", "Companion", "kisman.cc"})
public final class Class2075
extends Enum {
    public static final /* enum */ Class2075 Field17489;
    public static final /* enum */ Class2075 Field17490;
    public static final /* enum */ Class2075 Field17491;
    public static final /* enum */ Class2075 Field17492;
    private static final Class2075[] Field17493;
    public static final Class261 Field17494;
    private String Field17495 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class2075[] class2075Array = new Class2075[4];
        Class2075[] class2075Array2 = class2075Array;
        class2075Array[0] = Field17489 = new Class2075("None", 0);
        class2075Array[1] = Field17490 = new Class2075("Rainbow", 1);
        class2075Array[2] = Field17491 = new Class2075("Astolfo", 2);
        class2075Array[3] = Field17492 = new Class2075("Pulsive", 3);
        Field17493 = class2075Array;
        Field17494 = new Class261(null);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class2075() {
        void var2_-1;
        void var1_-1;
    }

    public static Class2075[] values() {
        return (abbi5WXwBhAC2jwfVuZJg478P13czAOh[])Field17493.clone();
    }

    public static Class2075 valueOf(String string) {
        return Enum.valueOf(Class2075.class, string);
    }

    private static String Method7617(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 187;
            cArray2[n] = (char)(cArray[n] ^ (0x43F6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

