/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/AntiCrystalAngles;", "", "(Ljava/lang/String;I)V", "SurroundBlocks", "UppedSurroundBlocks", "kisman.cc"})
public final class NocBeYWkcFqTxpnVpScPklEhyOPFu3IN
extends Enum {
    public static final /* enum */ NocBeYWkcFqTxpnVpScPklEhyOPFu3IN Field13272;
    public static final /* enum */ NocBeYWkcFqTxpnVpScPklEhyOPFu3IN Field13273;
    private static final NocBeYWkcFqTxpnVpScPklEhyOPFu3IN[] Field13274;
    private String Field13275 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        NocBeYWkcFqTxpnVpScPklEhyOPFu3IN[] nocBeYWkcFqTxpnVpScPklEhyOPFu3INArray = new NocBeYWkcFqTxpnVpScPklEhyOPFu3IN[(int)((long)1392397472 ^ (long)1392397473) << 1];
        NocBeYWkcFqTxpnVpScPklEhyOPFu3IN[] nocBeYWkcFqTxpnVpScPklEhyOPFu3INArray2 = nocBeYWkcFqTxpnVpScPklEhyOPFu3INArray;
        nocBeYWkcFqTxpnVpScPklEhyOPFu3INArray[(int)-1917449212L ^ 0x8DB60C04] = Field13272 = new NocBeYWkcFqTxpnVpScPklEhyOPFu3IN("SurroundBlocks", (int)((long)-842151414 ^ (long)-842151414));
        nocBeYWkcFqTxpnVpScPklEhyOPFu3INArray[(int)-663525586L ^ 0xD873672F] = Field13273 = new NocBeYWkcFqTxpnVpScPklEhyOPFu3IN("UppedSurroundBlocks", (int)((long)-1868061850 ^ (long)-1868061849));
        Field13274 = nocBeYWkcFqTxpnVpScPklEhyOPFu3INArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NocBeYWkcFqTxpnVpScPklEhyOPFu3IN() {
        void var2_-1;
        void var1_-1;
    }

    public static NocBeYWkcFqTxpnVpScPklEhyOPFu3IN[] values() {
        return (NocBeYWkcFqTxpnVpScPklEhyOPFu3IN[])Field13274.clone();
    }

    public static NocBeYWkcFqTxpnVpScPklEhyOPFu3IN valueOf(String string) {
        return Enum.valueOf(NocBeYWkcFqTxpnVpScPklEhyOPFu3IN.class, string);
    }

    private static String Method4696(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-778506203 ^ (long)-778506203);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1086768587 ^ (long)1086768436);
            int n2 = (int)((long)1076039349 ^ (long)1076039168);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-877548387 ^ (long)-877549762) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

