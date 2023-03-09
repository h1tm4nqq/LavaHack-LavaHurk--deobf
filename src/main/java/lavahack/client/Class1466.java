/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/player/AutoEat$Swap;", "", "(Ljava/lang/String;I)V", "Normal", "Click", "kisman.cc"})
final class Class1466
extends Enum {
    public static final /* enum */ Class1466 Field14850;
    public static final /* enum */ Class1466 Field14851;
    private static final Class1466[] Field14852;
    private String Field14853 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1466[] class1466Array = new Class1466[2];
        Class1466[] class1466Array2 = class1466Array;
        class1466Array[0] = Field14850 = new Class1466("Normal", 0);
        class1466Array[1] = Field14851 = new Class1466("Click", 1);
        Field14852 = class1466Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1466() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1466[] values() {
        return (nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field14852.clone();
    }

    public static Class1466 valueOf(String string) {
        return Enum.valueOf(Class1466.class, string);
    }

    private static String Method5899(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 33;
            cArray2[n] = (char)(cArray[n] ^ (0x3F8C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

