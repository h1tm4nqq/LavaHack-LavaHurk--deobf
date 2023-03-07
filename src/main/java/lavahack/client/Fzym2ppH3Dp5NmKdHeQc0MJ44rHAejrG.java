/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/RotationLogic;", "", "(Ljava/lang/String;I)V", "Default", "WellMore", "kisman.cc"})
public final class Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG
extends Enum {
    public static final /* enum */ Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG Field12640;
    public static final /* enum */ Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG Field12641;
    private static final Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG[] Field12642;
    private String Field12643 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG[] fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrGArray = new Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG[(int)((long)1625010339 ^ (long)1625010338) << 1];
        Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG[] fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrGArray2 = fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrGArray;
        fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrGArray[(int)1918709164L ^ 0x725D2DAC] = Field12640 = new Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG("Default", (int)660504049L ^ 0x275E7DF1);
        fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrGArray[(int)((long)1888222131 ^ (long)1888222130)] = Field12641 = new Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG("WellMore", (int)1528334698L ^ 0x5B18896B);
        Field12642 = fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrGArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG() {
        void var2_-1;
        void var1_-1;
    }

    public static Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG[] values() {
        return (Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG[])Field12642.clone();
    }

    public static Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG valueOf(String string) {
        return Enum.valueOf(Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG.class, string);
    }

    private static String Method4286(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-336079009 ^ (long)-336079009);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-181518718L ^ 0xF52E3E7D);
            int n2 = ((int)-1640297739L ^ 0x9E3B0AEA) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1259246546 ^ (long)1259241987) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

