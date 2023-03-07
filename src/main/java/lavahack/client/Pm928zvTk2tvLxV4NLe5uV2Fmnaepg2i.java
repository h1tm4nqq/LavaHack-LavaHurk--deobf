/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/util/enums/KillAuraWeapons;", "", "(Ljava/lang/String;I)V", "None", "Sword", "Axe", "Both", "kisman.cc"})
public final class Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i
extends Enum {
    public static final /* enum */ Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i Field13166;
    public static final /* enum */ Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i Field13167;
    public static final /* enum */ Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i Field13168;
    public static final /* enum */ Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i Field13169;
    private static final Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i[] Field13170;
    private String Field13171 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i[] pm928zvTk2tvLxV4NLe5uV2Fmnaepg2iArray = new Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i[(int)((long)1117252397 ^ (long)1117252396) << 2];
        Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i[] pm928zvTk2tvLxV4NLe5uV2Fmnaepg2iArray2 = pm928zvTk2tvLxV4NLe5uV2Fmnaepg2iArray;
        pm928zvTk2tvLxV4NLe5uV2Fmnaepg2iArray[(int)1951590631L ^ 0x7452E8E7] = Field13166 = new Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i("None", (int)((long)1415929018 ^ (long)1415929018));
        pm928zvTk2tvLxV4NLe5uV2Fmnaepg2iArray[(int)2118139915L ^ 0x7E40400A] = Field13167 = new Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i("Sword", (int)1054585028L ^ 0x3EDBB0C5);
        pm928zvTk2tvLxV4NLe5uV2Fmnaepg2iArray[(int)((long)-1794289473 ^ (long)-1794289474) << 1] = Field13168 = new Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i("Axe", (int)((long)1232677865 ^ (long)1232677864) << 1);
        pm928zvTk2tvLxV4NLe5uV2Fmnaepg2iArray[(int)-1114427190L ^ 0xBD9330C9] = Field13169 = new Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i("Both", (int)879668226L ^ 0x346EAC01);
        Field13170 = pm928zvTk2tvLxV4NLe5uV2Fmnaepg2iArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i() {
        void var2_-1;
        void var1_-1;
    }

    public static Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i[] values() {
        return (Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i[])Field13170.clone();
    }

    public static Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i valueOf(String string) {
        return Enum.valueOf(Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i.class, string);
    }

    private static String Method4632(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1132499655L ^ 0xBC7F6D39;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-918084431 ^ (long)-918084530);
            int n2 = (int)((long)936126897 ^ (long)936126866) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1033914143 ^ (long)1033918138) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

