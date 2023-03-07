/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/hud/modules/arraylist/ElementTypes;", "", "(Ljava/lang/String;I)V", "Module", "HudModule", "CheckBox", "kisman.cc"})
public final class dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj
extends Enum {
    public static final /* enum */ dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj Field10958;
    public static final /* enum */ dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj Field10959;
    public static final /* enum */ dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj Field10960;
    private static final dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj[] Field10961;
    private String Field10962 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj[] dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMjArray = new dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj[(int)((long)103038283 ^ (long)103038280)];
        dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj[] dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMjArray2 = dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMjArray;
        dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMjArray[(int)((long)-1178708567 ^ (long)-1178708567)] = Field10958 = new dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj("Module", (int)((long)-913142187 ^ (long)-913142187));
        dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMjArray[(int)((long)-546130713 ^ (long)-546130714)] = Field10959 = new dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj("HudModule", (int)735829909L ^ 0x2BDBDF94);
        dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMjArray[((int)-580846145L ^ 0xDD60FDBE) << 1] = Field10960 = new dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj("CheckBox", (int)((long)292637574 ^ (long)292637575) << 1);
        Field10961 = dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMjArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj() {
        void var2_-1;
        void var1_-1;
    }

    public static dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj[] values() {
        return (dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj[])Field10961.clone();
    }

    public static dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj valueOf(String string) {
        return Enum.valueOf(dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj.class, string);
    }

    private static String Method2921(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)112294231L ^ 0x6B17957;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)213328788 ^ (long)213328747);
            int n2 = (int)((long)-652943837 ^ (long)-652943794) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1535611347 ^ (long)1535630164) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

