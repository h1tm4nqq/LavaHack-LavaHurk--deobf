/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.n3ZtgZxSSwDbWCMM9okOMbPKPncqimzh
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.n3ZtgZxSSwDbWCMM9okOMbPKPncqimzh;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u00a8\u0006\u0019"}, d2={"Lcom/kisman/cc/util/enums/ShaderModes;", "", "(Ljava/lang/String;I)V", "AQUA", "RED", "SMOKE", "FLOW", "ITEMGLOW", "PURPLE", "GRADIENT", "UNU", "GLOW", "OUTLINE", "BlueFlames", "CodeX", "Crazy", "Golden", "HideF", "HotShit", "Kfc", "Sheldon", "Smoky", "SNOW", "Techno", "Circle", "kisman.cc"})
public final class Class1671
extends Enum {
    public static final /* enum */ Class1671 Field15778;
    public static final /* enum */ Class1671 Field15779;
    public static final /* enum */ Class1671 Field15780;
    public static final /* enum */ Class1671 Field15781;
    public static final /* enum */ Class1671 Field15782;
    public static final /* enum */ Class1671 Field15783;
    public static final /* enum */ Class1671 Field15784;
    public static final /* enum */ Class1671 Field15785;
    public static final /* enum */ Class1671 Field15786;
    public static final /* enum */ Class1671 Field15787;
    public static final /* enum */ Class1671 Field15788;
    public static final /* enum */ Class1671 Field15789;
    public static final /* enum */ Class1671 Field15790;
    public static final /* enum */ Class1671 Field15791;
    public static final /* enum */ Class1671 Field15792;
    public static final /* enum */ Class1671 Field15793;
    public static final /* enum */ Class1671 Field15794;
    public static final /* enum */ Class1671 Field15795;
    public static final /* enum */ Class1671 Field15796;
    public static final /* enum */ Class1671 Field15797;
    public static final /* enum */ Class1671 Field15798;
    public static final /* enum */ Class1671 Field15799;
    private static final Class1671[] Field15800;
    private int Field15801;

    static {
        Class1671[] class1671Array = new Class1671[22];
        Class1671[] class1671Array2 = class1671Array;
        class1671Array[0] = Field15778 = new Class1671("AQUA", 0);
        class1671Array[1] = Field15779 = new Class1671("RED", 1);
        class1671Array[2] = Field15780 = new Class1671("SMOKE", 2);
        class1671Array[3] = Field15781 = new Class1671("FLOW", 3);
        class1671Array[4] = Field15782 = new Class1671("ITEMGLOW", 4);
        class1671Array[5] = Field15783 = new Class1671("PURPLE", 5);
        class1671Array[6] = Field15784 = new Class1671("GRADIENT", 6);
        class1671Array[7] = Field15785 = new Class1671("UNU", 7);
        class1671Array[8] = Field15786 = new Class1671("GLOW", 8);
        class1671Array[9] = Field15787 = new Class1671("OUTLINE", 9);
        class1671Array[10] = Field15788 = new Class1671("BlueFlames", 10);
        class1671Array[11] = Field15789 = new Class1671("CodeX", 11);
        class1671Array[12] = Field15790 = new Class1671("Crazy", 12);
        class1671Array[13] = Field15791 = new Class1671("Golden", 13);
        class1671Array[14] = Field15792 = new Class1671("HideF", 14);
        class1671Array[15] = Field15793 = new Class1671("HotShit", 15);
        class1671Array[16] = Field15794 = new Class1671("Kfc", 16);
        class1671Array[17] = Field15795 = new Class1671("Sheldon", 17);
        class1671Array[18] = Field15796 = new Class1671("Smoky", 18);
        class1671Array[19] = Field15797 = new Class1671("SNOW", 19);
        class1671Array[20] = Field15798 = new Class1671("Techno", 20);
        class1671Array[21] = Field15799 = new Class1671("Circle", 21);
        Field15800 = class1671Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1671() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1671[] values() {
        return (n3ZtgZxSSwDbWCMM9okOMbPKPncqimzh[])Field15800.clone();
    }

    public static Class1671 valueOf(String string) {
        return Enum.valueOf(Class1671.class, string);
    }

    private static String Method6448(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 237;
            cArray2[n] = (char)(cArray[n] ^ (0x3E46 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

