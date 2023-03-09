/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.FQGluRny6jPN3LQwvrRntRbWB1463erf
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.FQGluRny6jPN3LQwvrRntRbWB1463erf;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/Orientations;", "", "(Ljava/lang/String;I)V", "Left", "Right", "kisman.cc"})
public final class Class676
extends Enum {
    public static final /* enum */ Class676 Field10872;
    public static final /* enum */ Class676 Field10873;
    private static final Class676[] Field10874;
    private String Field10875 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class676[] class676Array = new Class676[2];
        Class676[] class676Array2 = class676Array;
        class676Array[0] = Field10872 = new Class676("Left", 0);
        class676Array[1] = Field10873 = new Class676("Right", 1);
        Field10874 = class676Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class676() {
        void var2_-1;
        void var1_-1;
    }

    public static Class676[] values() {
        return (FQGluRny6jPN3LQwvrRntRbWB1463erf[])Field10874.clone();
    }

    public static Class676 valueOf(String string) {
        return Enum.valueOf(Class676.class, string);
    }

    private static String Method2861(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 23;
            cArray2[n] = (char)(cArray[n] ^ (0x4B17 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

