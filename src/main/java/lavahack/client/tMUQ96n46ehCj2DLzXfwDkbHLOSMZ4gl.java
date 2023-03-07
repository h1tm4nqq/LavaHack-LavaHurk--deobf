/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/SwitchModes;", "", "(Ljava/lang/String;I)V", "None", "Normal", "Silent", "kisman.cc"})
public final class tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl
extends Enum {
    public static final /* enum */ tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl Field14037;
    public static final /* enum */ tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl Field14038;
    public static final /* enum */ tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl Field14039;
    private static final tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl[] Field14040;
    private String Field14041 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl[] tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4glArray = new tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl[(int)((long)-1626847848 ^ (long)-1626847845)];
        tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl[] tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4glArray2 = tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4glArray;
        tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4glArray[(int)((long)113437363 ^ (long)113437363)] = Field14037 = new tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl("None", (int)-1007491144L ^ 0xC3F2E7B8);
        tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4glArray[(int)53228161L ^ 0x32C3280] = Field14038 = new tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl("Normal", (int)((long)500341920 ^ (long)500341921));
        tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4glArray[((int)1994112488L ^ 0x76DBBDE9) << 1] = Field14039 = new tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl("Silent", (int)((long)1666282338 ^ (long)1666282339) << 1);
        Field14040 = tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4glArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl() {
        void var2_-1;
        void var1_-1;
    }

    public static tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl[] values() {
        return (tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl[])Field14040.clone();
    }

    public static tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl valueOf(String string) {
        return Enum.valueOf(tMUQ96n46ehCj2DLzXfwDkbHLOSMZ4gl.class, string);
    }

    private static String Method5346(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1239218615L ^ 0x49DCF9B7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1370232260L ^ 0x51AC153B);
            int n2 = (int)((long)-9228652 ^ (long)-9228663) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)224193812L ^ 0xD5CCFA3) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

