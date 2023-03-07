/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/Orientations;", "", "(Ljava/lang/String;I)V", "Left", "Right", "kisman.cc"})
public final class FQGluRny6jPN3LQwvrRntRbWB1463erf
extends Enum {
    public static final /* enum */ FQGluRny6jPN3LQwvrRntRbWB1463erf Field10872;
    public static final /* enum */ FQGluRny6jPN3LQwvrRntRbWB1463erf Field10873;
    private static final FQGluRny6jPN3LQwvrRntRbWB1463erf[] Field10874;
    private String Field10875 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        FQGluRny6jPN3LQwvrRntRbWB1463erf[] fQGluRny6jPN3LQwvrRntRbWB1463erfArray = new FQGluRny6jPN3LQwvrRntRbWB1463erf[((int)-1975767072L ^ 0x8A3C2FE1) << 1];
        FQGluRny6jPN3LQwvrRntRbWB1463erf[] fQGluRny6jPN3LQwvrRntRbWB1463erfArray2 = fQGluRny6jPN3LQwvrRntRbWB1463erfArray;
        fQGluRny6jPN3LQwvrRntRbWB1463erfArray[(int)((long)1082198903 ^ (long)1082198903)] = Field10872 = new FQGluRny6jPN3LQwvrRntRbWB1463erf("Left", (int)((long)-1891790470 ^ (long)-1891790470));
        fQGluRny6jPN3LQwvrRntRbWB1463erfArray[(int)831731184L ^ 0x319335F1] = Field10873 = new FQGluRny6jPN3LQwvrRntRbWB1463erf("Right", (int)1917895079L ^ 0x7250C1A6);
        Field10874 = fQGluRny6jPN3LQwvrRntRbWB1463erfArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FQGluRny6jPN3LQwvrRntRbWB1463erf() {
        void var2_-1;
        void var1_-1;
    }

    public static FQGluRny6jPN3LQwvrRntRbWB1463erf[] values() {
        return (FQGluRny6jPN3LQwvrRntRbWB1463erf[])Field10874.clone();
    }

    public static FQGluRny6jPN3LQwvrRntRbWB1463erf valueOf(String string) {
        return Enum.valueOf(FQGluRny6jPN3LQwvrRntRbWB1463erf.class, string);
    }

    private static String Method2861(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1814448524 ^ (long)1814448524);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)879808079 ^ (long)879808176);
            int n2 = (int)((long)1810671088 ^ (long)1810671079);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1279234237 ^ (long)1279253418) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

