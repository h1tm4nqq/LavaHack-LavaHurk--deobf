/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/combat/AutoCrystalPvP$MoveStateLogic;", "", "(Ljava/lang/String;I)V", "MovementUtil", "Baritone", "kisman.cc"})
final class Class2115
extends Enum {
    public static final /* enum */ Class2115 Field17617;
    public static final /* enum */ Class2115 Field17618;
    private static final Class2115[] Field17619;
    private int Field17620;

    static {
        Class2115[] class2115Array = new Class2115[2];
        Class2115[] class2115Array2 = class2115Array;
        class2115Array[0] = Field17617 = new Class2115("MovementUtil", 0);
        class2115Array[1] = Field17618 = new Class2115("Baritone", 1);
        Field17619 = class2115Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class2115() {
        void var2_-1;
        void var1_-1;
    }

    public static Class2115[] values() {
        return (hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field17619.clone();
    }

    public static Class2115 valueOf(String string) {
        return Enum.valueOf(Class2115.class, string);
    }

    private static String Method7652(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 211;
            cArray2[n] = (char)(cArray[n] ^ (0x3CA1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

