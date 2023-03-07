/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/combat/AutoCrystalPvP$MoveStateLogic;", "", "(Ljava/lang/String;I)V", "MovementUtil", "Baritone", "kisman.cc"})
final class hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field17617;
    public static final /* enum */ hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field17618;
    private static final hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field17619;
    private int Field17620;

    static {
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)1760979766 ^ (long)1760979767) << 1];
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray2 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-639825753 ^ (long)-639825753)] = Field17617 = new hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("MovementUtil", (int)((long)-1690254963 ^ (long)-1690254963));
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)1010427391L ^ 0x3C39E5FE] = Field17618 = new hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Baritone", (int)((long)-1033462945 ^ (long)-1033462946));
        Field17619 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    public static hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field17619.clone();
    }

    public static hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    private static String Method7652(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1222736460 ^ (long)1222736460);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1732264198 ^ (long)-1732264443);
            int n2 = (int)-2134737251L ^ 0x80C27E4E;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1293223501L ^ 0xB2EAC512 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

