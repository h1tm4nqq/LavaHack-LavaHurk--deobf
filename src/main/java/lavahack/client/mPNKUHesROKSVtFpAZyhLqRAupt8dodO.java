/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/websockets/api/enums/Opcode;", "", "(Ljava/lang/String;I)V", "CONTINUOUS", "TEXT", "BINARY", "PING", "PONG", "CLOSING", "kisman.cc"})
public final class mPNKUHesROKSVtFpAZyhLqRAupt8dodO
extends Enum {
    public static final /* enum */ mPNKUHesROKSVtFpAZyhLqRAupt8dodO Field11926;
    public static final /* enum */ mPNKUHesROKSVtFpAZyhLqRAupt8dodO Field11927;
    public static final /* enum */ mPNKUHesROKSVtFpAZyhLqRAupt8dodO Field11928;
    public static final /* enum */ mPNKUHesROKSVtFpAZyhLqRAupt8dodO Field11929;
    public static final /* enum */ mPNKUHesROKSVtFpAZyhLqRAupt8dodO Field11930;
    public static final /* enum */ mPNKUHesROKSVtFpAZyhLqRAupt8dodO Field11931;
    private static final mPNKUHesROKSVtFpAZyhLqRAupt8dodO[] Field11932;
    private String Field11933 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        mPNKUHesROKSVtFpAZyhLqRAupt8dodO[] mPNKUHesROKSVtFpAZyhLqRAupt8dodOArray = new mPNKUHesROKSVtFpAZyhLqRAupt8dodO[((int)-1936973452L ^ 0x8C8C2177) << 1];
        mPNKUHesROKSVtFpAZyhLqRAupt8dodO[] mPNKUHesROKSVtFpAZyhLqRAupt8dodOArray2 = mPNKUHesROKSVtFpAZyhLqRAupt8dodOArray;
        mPNKUHesROKSVtFpAZyhLqRAupt8dodOArray[(int)-1274240948L ^ 0xB40CA04C] = Field11926 = new mPNKUHesROKSVtFpAZyhLqRAupt8dodO("CONTINUOUS", (int)218679760L ^ 0xD08C9D0);
        mPNKUHesROKSVtFpAZyhLqRAupt8dodOArray[(int)((long)-1290216840 ^ (long)-1290216839)] = Field11927 = new mPNKUHesROKSVtFpAZyhLqRAupt8dodO("TEXT", (int)((long)1661520178 ^ (long)1661520179));
        mPNKUHesROKSVtFpAZyhLqRAupt8dodOArray[((int)-259287167L ^ 0xF08B9780) << 1] = Field11928 = new mPNKUHesROKSVtFpAZyhLqRAupt8dodO("BINARY", (int)((long)-1666674211 ^ (long)-1666674212) << 1);
        mPNKUHesROKSVtFpAZyhLqRAupt8dodOArray[(int)((long)-465545222 ^ (long)-465545223)] = Field11929 = new mPNKUHesROKSVtFpAZyhLqRAupt8dodO("PING", (int)1771244794L ^ 0x69930CF9);
        mPNKUHesROKSVtFpAZyhLqRAupt8dodOArray[(int)((long)-319155749 ^ (long)-319155750) << 2] = Field11930 = new mPNKUHesROKSVtFpAZyhLqRAupt8dodO("PONG", ((int)-2064458421L ^ 0x84F2DD4A) << 2);
        mPNKUHesROKSVtFpAZyhLqRAupt8dodOArray[(int)((long)-2105932284 ^ (long)-2105932287)] = Field11931 = new mPNKUHesROKSVtFpAZyhLqRAupt8dodO("CLOSING", (int)((long)499393954 ^ (long)499393959));
        Field11932 = mPNKUHesROKSVtFpAZyhLqRAupt8dodOArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private mPNKUHesROKSVtFpAZyhLqRAupt8dodO() {
        void var2_-1;
        void var1_-1;
    }

    public static mPNKUHesROKSVtFpAZyhLqRAupt8dodO[] values() {
        return (mPNKUHesROKSVtFpAZyhLqRAupt8dodO[])Field11932.clone();
    }

    public static mPNKUHesROKSVtFpAZyhLqRAupt8dodO valueOf(String string) {
        return Enum.valueOf(mPNKUHesROKSVtFpAZyhLqRAupt8dodO.class, string);
    }

    private static String Method3847(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2057739568 ^ (long)-2057739568);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1718263887L ^ 0x666AA0B0);
            int n2 = (int)((long)-564689494 ^ (long)-564689479) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)417582329L ^ 0x18E3EF6E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

