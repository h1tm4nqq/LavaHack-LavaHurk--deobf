/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/enums/RectSides;", "", "(Ljava/lang/String;I)V", "Top", "Bottom", "Right", "Left", "Companion", "kisman.cc"})
public final class xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j
extends Enum {
    public static final /* enum */ xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j Field14825;
    public static final /* enum */ xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j Field14826;
    public static final /* enum */ xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j Field14827;
    public static final /* enum */ xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j Field14828;
    private static final xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j[] Field14829;
    public static final xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14830;
    private String Field14831 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j[] xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0jArray = new xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j[((int)-2055269965L ^ 0x857F11B2) << 2];
        xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j[] xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0jArray2 = xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0jArray;
        xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0jArray[(int)((long)-1359696397 ^ (long)-1359696397)] = Field14825 = new xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j("Top", (int)1667031953L ^ 0x635CE391);
        xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0jArray[(int)1267170110L ^ 0x4B877B3F] = Field14826 = new xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j("Bottom", (int)771200617L ^ 0x2DF79668);
        xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0jArray[(int)((long)943706078 ^ (long)943706079) << 1] = Field14827 = new xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j("Right", ((int)-835171973L ^ 0xCE38497A) << 1);
        xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0jArray[(int)((long)1851998647 ^ (long)1851998644)] = Field14828 = new xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j("Left", (int)-1255195998L ^ 0xB52F3AA1);
        Field14829 = xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0jArray;
        Field14830 = new xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j() {
        void var2_-1;
        void var1_-1;
    }

    public static xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j[] values() {
        return (xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j[])Field14829.clone();
    }

    public static xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j valueOf(String string) {
        return Enum.valueOf(xElW5Wg3fxBU9mf3B18MQ2NUAeh70W0j.class, string);
    }

    private static String Method5818(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1453663262 ^ (long)1453663262);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1354792039 ^ (long)-1354792090);
            int n2 = (int)-5755022L ^ 0xFFA82F11;
            cArray2[n] = (char)(cArray[n] ^ (((int)1501104528L ^ 0x5979091D) << 6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

