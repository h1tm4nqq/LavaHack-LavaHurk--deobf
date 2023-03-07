/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/FadeLogic;", "", "(Ljava/lang/String;I)V", "Time", "Distance", "kisman.cc"})
public final class hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7
extends Enum {
    public static final /* enum */ hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7 Field14901;
    public static final /* enum */ hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7 Field14902;
    private static final hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7[] Field14903;
    private String Field14904 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7[] hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7Array = new hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7[((int)2019402729L ^ 0x785DA3E8) << 1];
        hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7[] hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7Array2 = hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7Array;
        hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7Array[(int)((long)-1406515260 ^ (long)-1406515260)] = Field14901 = new hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7("Time", (int)-699201302L ^ 0xD65308EA);
        hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7Array[(int)((long)1692666429 ^ (long)1692666428)] = Field14902 = new hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7("Distance", (int)-1734490390L ^ 0x989DC6EB);
        Field14903 = hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7() {
        void var2_-1;
        void var1_-1;
    }

    public static hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7[] values() {
        return (hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7[])Field14903.clone();
    }

    public static hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7 valueOf(String string) {
        return Enum.valueOf(hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7.class, string);
    }

    private static String Method5922(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1955739510 ^ (long)1955739510);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)563730439 ^ (long)563730680);
            int n2 = ((int)-912243971L ^ 0xC9A042EE) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)167253508 ^ (long)167268449) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

