/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/settings/util/EntityESPRendererPattern$SettingTypes;", "", "(Ljava/lang/String;I)V", "Mode", "Box1Color", "CubicPattern", "kisman.cc"})
public final class Class2007
extends Enum {
    public static final /* enum */ Class2007 Field17206;
    public static final /* enum */ Class2007 Field17207;
    public static final /* enum */ Class2007 Field17208;
    private static final Class2007[] Field17209;
    private int Field17210;

    static {
        Class2007[] class2007Array = new Class2007[3];
        Class2007[] class2007Array2 = class2007Array;
        class2007Array[0] = Field17206 = new Class2007("Mode", 0);
        class2007Array[1] = Field17207 = new Class2007("Box1Color", 1);
        class2007Array[2] = Field17208 = new Class2007("CubicPattern", 2);
        Field17209 = class2007Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class2007() {
        void var2_-1;
        void var1_-1;
    }

    public static Class2007[] values() {
        return (XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field17209.clone();
    }

    public static Class2007 valueOf(String string) {
        return Enum.valueOf(Class2007.class, string);
    }

    private static String Method7455(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 63;
            cArray2[n] = (char)(cArray[n] ^ (0x52EA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

