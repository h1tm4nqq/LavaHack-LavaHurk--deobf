/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/AutoRerTargetFinderLogic;", "", "(Ljava/lang/String;I)V", "Distance", "Health", "Damage", "kisman.cc"})
public final class H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb
extends Enum {
    public static final /* enum */ H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb Field15929;
    public static final /* enum */ H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb Field15930;
    public static final /* enum */ H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb Field15931;
    private static final H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb[] Field15932;
    private String Field15933 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb[] h8tTkhMasfwgvtiH0P7I7CTYG91Bc2kbArray = new H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb[(int)1384109585L ^ 0x527FD612];
        H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb[] h8tTkhMasfwgvtiH0P7I7CTYG91Bc2kbArray2 = h8tTkhMasfwgvtiH0P7I7CTYG91Bc2kbArray;
        h8tTkhMasfwgvtiH0P7I7CTYG91Bc2kbArray[(int)((long)-1506891937 ^ (long)-1506891937)] = Field15929 = new H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb("Distance", (int)-181599469L ^ 0xF52D0313);
        h8tTkhMasfwgvtiH0P7I7CTYG91Bc2kbArray[(int)32026069L ^ 0x1E8ADD4] = Field15930 = new H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb("Health", (int)100593373L ^ 0x5FEEEDC);
        h8tTkhMasfwgvtiH0P7I7CTYG91Bc2kbArray[((int)-295188902L ^ 0xEE67C65B) << 1] = Field15931 = new H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb("Damage", ((int)1918264005L ^ 0x725662C4) << 1);
        Field15932 = h8tTkhMasfwgvtiH0P7I7CTYG91Bc2kbArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb() {
        void var2_-1;
        void var1_-1;
    }

    public static H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb[] values() {
        return (H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb[])Field15932.clone();
    }

    public static H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb valueOf(String string) {
        return Enum.valueOf(H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb.class, string);
    }

    private static String Method6598(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-719960087 ^ (long)-719960087);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)672849929L ^ 0x281AE0F6);
            int n2 = (int)((long)-1916266174 ^ (long)-1916266041);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2124787031 ^ (long)2124789124) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

