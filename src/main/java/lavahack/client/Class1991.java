/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/SwingHands;", "", "(Ljava/lang/String;I)V", "MainHand", "OffHand", "PacketSwing", "kisman.cc"})
public final class Class1991
extends Enum {
    public static final /* enum */ Class1991 Field17156;
    public static final /* enum */ Class1991 Field17157;
    public static final /* enum */ Class1991 Field17158;
    private static final Class1991[] Field17159;
    private int Field17160;

    static {
        Class1991[] class1991Array = new Class1991[3];
        Class1991[] class1991Array2 = class1991Array;
        class1991Array[0] = Field17156 = new Class1991("MainHand", 0);
        class1991Array[1] = Field17157 = new Class1991("OffHand", 1);
        class1991Array[2] = Field17158 = new Class1991("PacketSwing", 2);
        Field17159 = class1991Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1991() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1991[] values() {
        return (KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF[])Field17159.clone();
    }

    public static Class1991 valueOf(String string) {
        return Enum.valueOf(Class1991.class, string);
    }

    private static String Method7394(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 243;
            cArray2[n] = (char)(cArray[n] ^ (0x60CA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

