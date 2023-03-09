/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/hud/modules/arraylist/ElementTypes;", "", "(Ljava/lang/String;I)V", "Module", "HudModule", "CheckBox", "kisman.cc"})
public final class Class698
extends Enum {
    public static final /* enum */ Class698 Field10958;
    public static final /* enum */ Class698 Field10959;
    public static final /* enum */ Class698 Field10960;
    private static final Class698[] Field10961;
    private String Field10962 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class698[] class698Array = new Class698[3];
        Class698[] class698Array2 = class698Array;
        class698Array[0] = Field10958 = new Class698("Module", 0);
        class698Array[1] = Field10959 = new Class698("HudModule", 1);
        class698Array[2] = Field10960 = new Class698("CheckBox", 2);
        Field10961 = class698Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class698() {
        void var2_-1;
        void var1_-1;
    }

    public static Class698[] values() {
        return (dg5OHbm3yUiGmafjnpcPxa6M7wdMIoMj[])Field10961.clone();
    }

    public static Class698 valueOf(String string) {
        return Enum.valueOf(Class698.class, string);
    }

    private static String Method2921(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 218;
            cArray2[n] = (char)(cArray[n] ^ (0x4A87 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

