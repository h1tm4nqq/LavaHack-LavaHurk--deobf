/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.I2y63R48wFIDKwFXzDoXGywViLiXdmnS
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.I2y63R48wFIDKwFXzDoXGywViLiXdmnS;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/SprintModes;", "", "(Ljava/lang/String;I)V", "None", "Rage", "Legit", "kisman.cc"})
public final class Class774
extends Enum {
    public static final /* enum */ Class774 Field11275;
    public static final /* enum */ Class774 Field11276;
    public static final /* enum */ Class774 Field11277;
    private static final Class774[] Field11278;
    private String Field11279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class774[] class774Array = new Class774[3];
        Class774[] class774Array2 = class774Array;
        class774Array[0] = Field11275 = new Class774("None", 0);
        class774Array[1] = Field11276 = new Class774("Rage", 1);
        class774Array[2] = Field11277 = new Class774("Legit", 2);
        Field11278 = class774Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class774() {
        void var2_-1;
        void var1_-1;
    }

    public static Class774[] values() {
        return (I2y63R48wFIDKwFXzDoXGywViLiXdmnS[])Field11278.clone();
    }

    public static Class774 valueOf(String string) {
        return Enum.valueOf(Class774.class, string);
    }

    private static String Method3227(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 163;
            cArray2[n] = (char)(cArray[n] ^ (0x7279 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

