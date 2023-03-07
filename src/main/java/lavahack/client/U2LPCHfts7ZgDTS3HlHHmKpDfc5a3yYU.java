/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/websockets/api/enums/ReadyState;", "", "(Ljava/lang/String;I)V", "NOT_YET_CONNECTED", "OPEN", "CLOSING", "CLOSED", "kisman.cc"})
public final class U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU
extends Enum {
    public static final /* enum */ U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU Field15509;
    public static final /* enum */ U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU Field15510;
    public static final /* enum */ U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU Field15511;
    public static final /* enum */ U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU Field15512;
    private static final U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU[] Field15513;
    private String Field15514 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU[] u2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYUArray = new U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU[(int)((long)-1973469351 ^ (long)-1973469352) << 2];
        U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU[] u2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYUArray2 = u2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYUArray;
        u2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYUArray[(int)((long)-167870006 ^ (long)-167870006)] = Field15509 = new U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU("NOT_YET_CONNECTED", (int)789423614L ^ 0x2F0DA5FE);
        u2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYUArray[(int)621776600L ^ 0x250F8ED9] = Field15510 = new U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU("OPEN", (int)2842508L ^ 0x2B5F8D);
        u2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYUArray[((int)-547754883L ^ 0xDF59EC7C) << 1] = Field15511 = new U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU("CLOSING", (int)((long)-422886136 ^ (long)-422886135) << 1);
        u2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYUArray[(int)((long)-543312146 ^ (long)-543312147)] = Field15512 = new U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU("CLOSED", (int)-2124769209L ^ 0x815A9844);
        Field15513 = u2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYUArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU() {
        void var2_-1;
        void var1_-1;
    }

    public static U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU[] values() {
        return (U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU[])Field15513.clone();
    }

    public static U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU valueOf(String string) {
        return Enum.valueOf(U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.class, string);
    }

    private static String Method6277(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-523333077L ^ 0xE0CE922B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)66199763 ^ (long)66199596);
            int n2 = (int)((long)-1691018221 ^ (long)-1691018170);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-606294535 ^ (long)-606305884) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

