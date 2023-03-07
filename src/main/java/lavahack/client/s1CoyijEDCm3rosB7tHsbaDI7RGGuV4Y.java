/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/RotationModes;", "", "(Ljava/lang/String;I)V", "None", "Normal", "Silent", "kisman.cc"})
public final class s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y
extends Enum {
    public static final /* enum */ s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y Field9548;
    public static final /* enum */ s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y Field9549;
    public static final /* enum */ s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y Field9550;
    private static final s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y[] Field9551;
    private String Field9552 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y[] s1CoyijEDCm3rosB7tHsbaDI7RGGuV4YArray = new s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y[(int)((long)2074431534 ^ (long)2074431533)];
        s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y[] s1CoyijEDCm3rosB7tHsbaDI7RGGuV4YArray2 = s1CoyijEDCm3rosB7tHsbaDI7RGGuV4YArray;
        s1CoyijEDCm3rosB7tHsbaDI7RGGuV4YArray[(int)((long)1759577144 ^ (long)1759577144)] = Field9548 = new s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y("None", (int)-399179091L ^ 0xE83502AD);
        s1CoyijEDCm3rosB7tHsbaDI7RGGuV4YArray[(int)-1351807399L ^ 0xAF6D0E58] = Field9549 = new s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y("Normal", (int)((long)-1878618845 ^ (long)-1878618846));
        s1CoyijEDCm3rosB7tHsbaDI7RGGuV4YArray[(int)((long)-363894344 ^ (long)-363894343) << 1] = Field9550 = new s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y("Silent", (int)((long)2038216312 ^ (long)2038216313) << 1);
        Field9551 = s1CoyijEDCm3rosB7tHsbaDI7RGGuV4YArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y() {
        void var2_-1;
        void var1_-1;
    }

    public static s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y[] values() {
        return (s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y[])Field9551.clone();
    }

    public static s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y valueOf(String string) {
        return Enum.valueOf(s1CoyijEDCm3rosB7tHsbaDI7RGGuV4Y.class, string);
    }

    private static String Method1819(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-958415836 ^ (long)-958415836);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-278244147L ^ 0xEF6A5432);
            int n2 = ((int)1707761223L ^ 0x65CA5E3A) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1084772790L ^ 0x40A803F5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

