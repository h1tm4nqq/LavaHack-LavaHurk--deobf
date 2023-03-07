/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/combat/AutoCrystalPvP$AutoXPMode;", "", "(Ljava/lang/String;I)V", "Vanilla", "Silent", "kisman.cc"})
final class hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9329;
    public static final /* enum */ hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9330;
    private static final hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field9331;
    private String Field9332 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-1386793179L ^ 0xAD573724) << 1];
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray2 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)287210586 ^ (long)287210586)] = Field9329 = new hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Vanilla", (int)((long)-1268936928 ^ (long)-1268936928));
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-640934797 ^ (long)-640934798)] = Field9330 = new hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Silent", (int)((long)-1019569587 ^ (long)-1019569588));
        Field9331 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    public static hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field9331.clone();
    }

    public static hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    private static String Method1598(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)20551491 ^ (long)20551491);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1236450088L ^ 0xB64D4427);
            int n2 = (int)((long)-670520361 ^ (long)-670520364) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)2103539022L ^ 0x7D617313) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

