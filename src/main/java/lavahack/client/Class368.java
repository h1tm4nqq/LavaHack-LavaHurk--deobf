/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/RotationModes;", "", "(Ljava/lang/String;I)V", "None", "Normal", "Silent", "kisman.cc"})
public final class Class368
extends Enum {
    public static final /* enum */ Class368 Field9548;
    public static final /* enum */ Class368 Field9549;
    public static final /* enum */ Class368 Field9550;
    private static final Class368[] Field9551;
    private String Field9552 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class368[] class368Array = new Class368[3];
        Class368[] class368Array2 = class368Array;
        class368Array[0] = Field9548 = new Class368("None", 0);
        class368Array[1] = Field9549 = new Class368("Normal", 1);
        class368Array[2] = Field9550 = new Class368("Silent", 2);
        Field9551 = class368Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class368() {
        void var2_-1;
        void var1_-1;
    }

    public static Class368[] values() {
        return (s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y[])Field9551.clone();
    }

    public static Class368 valueOf(String string) {
        return Enum.valueOf(Class368.class, string);
    }

    private static String Method1819(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 250;
            cArray2[n] = (char)(cArray[n] ^ (0x5243 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

