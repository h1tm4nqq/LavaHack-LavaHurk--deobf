/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/util/enums/SearchGuiItemsNameModes;", "", "(Ljava/lang/String;I)V", "None", "FullName", "ToolTip", "Both", "kisman.cc"})
public final class La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh
extends Enum {
    public static final /* enum */ La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh Field16538;
    public static final /* enum */ La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh Field16539;
    public static final /* enum */ La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh Field16540;
    public static final /* enum */ La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh Field16541;
    private static final La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh[] Field16542;
    private int Field16543;

    static {
        La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh[] la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAhArray = new La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh[(int)((long)-973800804 ^ (long)-973800803) << 2];
        La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh[] la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAhArray2 = la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAhArray;
        la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAhArray[(int)((long)1827919524 ^ (long)1827919524)] = Field16538 = new La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh("None", (int)((long)-110313400 ^ (long)-110313400));
        la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAhArray[(int)((long)-1062084546 ^ (long)-1062084545)] = Field16539 = new La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh("FullName", (int)((long)-1618092313 ^ (long)-1618092314));
        la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAhArray[(int)((long)-2142581671 ^ (long)-2142581672) << 1] = Field16540 = new La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh("ToolTip", ((int)-1058896570L ^ 0xC0E28547) << 1);
        la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAhArray[(int)((long)-630387687 ^ (long)-630387686)] = Field16541 = new La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh("Both", (int)255561967L ^ 0xF3B90EC);
        Field16542 = la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAhArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh() {
        void var2_-1;
        void var1_-1;
    }

    public static La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh[] values() {
        return (La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh[])Field16542.clone();
    }

    public static La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh valueOf(String string) {
        return Enum.valueOf(La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh.class, string);
    }

    private static String Method6948(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)943704356L ^ 0x383FC924;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1392332321L ^ 0x52FD4EDE);
            int n2 = (int)393690517L ^ 0x17773DE0;
            cArray2[n] = (char)(cArray[n] ^ (((int)1169674417L ^ 0x45B7C9B0) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

