/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/DevelopmentHelperSlotTypes;", "", "(Ljava/lang/String;I)V", "Index", "Number", "kisman.cc"})
public final class MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI
extends Enum {
    public static final /* enum */ MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI Field16945;
    public static final /* enum */ MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI Field16946;
    private static final MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI[] Field16947;
    private String Field16948 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI[] mtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bIArray = new MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI[((int)1075766187L ^ 0x401EE3AA) << 1];
        MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI[] mtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bIArray2 = mtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bIArray;
        mtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bIArray[(int)864855511L ^ 0x338CA5D7] = Field16945 = new MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI("Index", (int)-345622788L ^ 0xEB6636FC);
        mtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bIArray[(int)1475609085L ^ 0x57F401FC] = Field16946 = new MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI("Number", (int)-642236343L ^ 0xD9B84048);
        Field16947 = mtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bIArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI() {
        void var2_-1;
        void var1_-1;
    }

    public static MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI[] values() {
        return (MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI[])Field16947.clone();
    }

    public static MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI valueOf(String string) {
        return Enum.valueOf(MtRGnZ0MQXYZVwcrh1IN1d8I8EVjc3bI.class, string);
    }

    private static String Method7177(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2026516767 ^ (long)-2026516767);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)367187043 ^ (long)367187100);
            int n2 = (int)((long)-1019389001 ^ (long)-1019389154);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1417866655 ^ (long)-1417869560) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

