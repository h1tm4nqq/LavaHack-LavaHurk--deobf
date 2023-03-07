/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/SurroundSupportModes;", "", "(Ljava/lang/String;I)V", "None", "Dynamic", "Static", "kisman.cc"})
public final class mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM
extends Enum {
    public static final /* enum */ mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM Field11610;
    public static final /* enum */ mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM Field11611;
    public static final /* enum */ mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM Field11612;
    private static final mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM[] Field11613;
    private String Field11614 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM[] mmsxuY3EZVqKin1NWG1fEhjMcbE5sICMArray = new mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM[(int)((long)-1326631808 ^ (long)-1326631805)];
        mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM[] mmsxuY3EZVqKin1NWG1fEhjMcbE5sICMArray2 = mmsxuY3EZVqKin1NWG1fEhjMcbE5sICMArray;
        mmsxuY3EZVqKin1NWG1fEhjMcbE5sICMArray[(int)1798705139L ^ 0x6B360FF3] = Field11610 = new mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM("None", (int)((long)-2142016183 ^ (long)-2142016183));
        mmsxuY3EZVqKin1NWG1fEhjMcbE5sICMArray[(int)2014544417L ^ 0x78138220] = Field11611 = new mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM("Dynamic", (int)((long)1428968868 ^ (long)1428968869));
        mmsxuY3EZVqKin1NWG1fEhjMcbE5sICMArray[((int)-1952621291L ^ 0x8B9D5D14) << 1] = Field11612 = new mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM("Static", ((int)799478117L ^ 0x2FA71164) << 1);
        Field11613 = mmsxuY3EZVqKin1NWG1fEhjMcbE5sICMArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM() {
        void var2_-1;
        void var1_-1;
    }

    public static mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM[] values() {
        return (mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM[])Field11613.clone();
    }

    public static mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM valueOf(String string) {
        return Enum.valueOf(mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM.class, string);
    }

    private static String Method3604(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-814714364 ^ (long)-814714364);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-951374948L ^ 0xC74B2B63);
            int n2 = (int)((long)-8025654 ^ (long)-8025743);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1555818490 ^ (long)-1555821743) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

