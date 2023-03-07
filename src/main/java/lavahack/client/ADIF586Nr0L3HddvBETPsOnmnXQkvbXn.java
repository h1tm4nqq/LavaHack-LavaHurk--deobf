/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/minecraft/FormatterType;", "", "(Ljava/lang/String;I)V", "Color", "Style", "kisman.cc"})
public final class ADIF586Nr0L3HddvBETPsOnmnXQkvbXn
extends Enum {
    public static final /* enum */ ADIF586Nr0L3HddvBETPsOnmnXQkvbXn Field9559;
    public static final /* enum */ ADIF586Nr0L3HddvBETPsOnmnXQkvbXn Field9560;
    private static final ADIF586Nr0L3HddvBETPsOnmnXQkvbXn[] Field9561;
    private String Field9562 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        ADIF586Nr0L3HddvBETPsOnmnXQkvbXn[] aDIF586Nr0L3HddvBETPsOnmnXQkvbXnArray = new ADIF586Nr0L3HddvBETPsOnmnXQkvbXn[(int)((long)381948102 ^ (long)381948103) << 1];
        ADIF586Nr0L3HddvBETPsOnmnXQkvbXn[] aDIF586Nr0L3HddvBETPsOnmnXQkvbXnArray2 = aDIF586Nr0L3HddvBETPsOnmnXQkvbXnArray;
        aDIF586Nr0L3HddvBETPsOnmnXQkvbXnArray[(int)-262152784L ^ 0xF05FDDB0] = Field9559 = new ADIF586Nr0L3HddvBETPsOnmnXQkvbXn("Color", (int)-1569540608L ^ 0xA272B600);
        aDIF586Nr0L3HddvBETPsOnmnXQkvbXnArray[(int)((long)986499381 ^ (long)986499380)] = Field9560 = new ADIF586Nr0L3HddvBETPsOnmnXQkvbXn("Style", (int)((long)-2019987917 ^ (long)-2019987918));
        Field9561 = aDIF586Nr0L3HddvBETPsOnmnXQkvbXnArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ADIF586Nr0L3HddvBETPsOnmnXQkvbXn() {
        void var2_-1;
        void var1_-1;
    }

    public static ADIF586Nr0L3HddvBETPsOnmnXQkvbXn[] values() {
        return (ADIF586Nr0L3HddvBETPsOnmnXQkvbXn[])Field9561.clone();
    }

    public static ADIF586Nr0L3HddvBETPsOnmnXQkvbXn valueOf(String string) {
        return Enum.valueOf(ADIF586Nr0L3HddvBETPsOnmnXQkvbXn.class, string);
    }

    private static String Method1823(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1889663370 ^ (long)-1889663370);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-918427126L ^ 0xC941EAF5);
            int n2 = (int)-830605349L ^ 0xCE7DF708;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)518523101 ^ (long)518525908) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

