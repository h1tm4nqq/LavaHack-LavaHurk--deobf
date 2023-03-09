/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/util/enums/RobotHoleOperation;", "", "(Ljava/lang/String;I)V", "Sword", "Exp", "Await", "MineEchest", "RunOut", "Quiver", "CounterTower", "City", "kisman.cc"})
public final class Class1277
extends Enum {
    public static final /* enum */ Class1277 Field13754;
    public static final /* enum */ Class1277 Field13755;
    public static final /* enum */ Class1277 Field13756;
    public static final /* enum */ Class1277 Field13757;
    public static final /* enum */ Class1277 Field13758;
    public static final /* enum */ Class1277 Field13759;
    public static final /* enum */ Class1277 Field13760;
    public static final /* enum */ Class1277 Field13761;
    private static final Class1277[] Field13762;
    private String Field13763 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1277[] class1277Array = new Class1277[8];
        Class1277[] class1277Array2 = class1277Array;
        class1277Array[0] = Field13754 = new Class1277("Sword", 0);
        class1277Array[1] = Field13755 = new Class1277("Exp", 1);
        class1277Array[2] = Field13756 = new Class1277("Await", 2);
        class1277Array[3] = Field13757 = new Class1277("MineEchest", 3);
        class1277Array[4] = Field13758 = new Class1277("RunOut", 4);
        class1277Array[5] = Field13759 = new Class1277("Quiver", 5);
        class1277Array[6] = Field13760 = new Class1277("CounterTower", 6);
        class1277Array[7] = Field13761 = new Class1277("City", 7);
        Field13762 = class1277Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1277() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1277[] values() {
        return (NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03[])Field13762.clone();
    }

    public static Class1277 valueOf(String string) {
        return Enum.valueOf(Class1277.class, string);
    }

    private static String Method5114(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 21;
            cArray2[n] = (char)(cArray[n] ^ (0x46F5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

