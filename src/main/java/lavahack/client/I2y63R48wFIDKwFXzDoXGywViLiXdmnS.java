/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/SprintModes;", "", "(Ljava/lang/String;I)V", "None", "Rage", "Legit", "kisman.cc"})
public final class I2y63R48wFIDKwFXzDoXGywViLiXdmnS
extends Enum {
    public static final /* enum */ I2y63R48wFIDKwFXzDoXGywViLiXdmnS Field11275;
    public static final /* enum */ I2y63R48wFIDKwFXzDoXGywViLiXdmnS Field11276;
    public static final /* enum */ I2y63R48wFIDKwFXzDoXGywViLiXdmnS Field11277;
    private static final I2y63R48wFIDKwFXzDoXGywViLiXdmnS[] Field11278;
    private String Field11279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        I2y63R48wFIDKwFXzDoXGywViLiXdmnS[] i2y63R48wFIDKwFXzDoXGywViLiXdmnSArray = new I2y63R48wFIDKwFXzDoXGywViLiXdmnS[(int)1339667439L ^ 0x4FD9B3EC];
        I2y63R48wFIDKwFXzDoXGywViLiXdmnS[] i2y63R48wFIDKwFXzDoXGywViLiXdmnSArray2 = i2y63R48wFIDKwFXzDoXGywViLiXdmnSArray;
        i2y63R48wFIDKwFXzDoXGywViLiXdmnSArray[(int)214363935L ^ 0xCC6EF1F] = Field11275 = new I2y63R48wFIDKwFXzDoXGywViLiXdmnS("None", (int)1069797589L ^ 0x3FC3D0D5);
        i2y63R48wFIDKwFXzDoXGywViLiXdmnSArray[(int)-1563334096L ^ 0xA2D16A31] = Field11276 = new I2y63R48wFIDKwFXzDoXGywViLiXdmnS("Rage", (int)464230567L ^ 0x1BAB98A6);
        i2y63R48wFIDKwFXzDoXGywViLiXdmnSArray[(int)((long)843410019 ^ (long)843410018) << 1] = Field11277 = new I2y63R48wFIDKwFXzDoXGywViLiXdmnS("Legit", ((int)-1668252004L ^ 0x9C907E9D) << 1);
        Field11278 = i2y63R48wFIDKwFXzDoXGywViLiXdmnSArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private I2y63R48wFIDKwFXzDoXGywViLiXdmnS() {
        void var2_-1;
        void var1_-1;
    }

    public static I2y63R48wFIDKwFXzDoXGywViLiXdmnS[] values() {
        return (I2y63R48wFIDKwFXzDoXGywViLiXdmnS[])Field11278.clone();
    }

    public static I2y63R48wFIDKwFXzDoXGywViLiXdmnS valueOf(String string) {
        return Enum.valueOf(I2y63R48wFIDKwFXzDoXGywViLiXdmnS.class, string);
    }

    private static String Method3227(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-314368025 ^ (long)-314368025);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1250357694L ^ 0x4A86F141);
            int n2 = (int)1547292833L ^ 0x5C39D002;
            cArray2[n] = (char)(cArray[n] ^ ((int)775962473L ^ 0x2E404D10 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

