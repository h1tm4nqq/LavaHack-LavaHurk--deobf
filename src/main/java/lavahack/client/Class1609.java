/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/websockets/api/enums/ReadyState;", "", "(Ljava/lang/String;I)V", "NOT_YET_CONNECTED", "OPEN", "CLOSING", "CLOSED", "kisman.cc"})
public final class Class1609
extends Enum {
    public static final /* enum */ Class1609 Field15509;
    public static final /* enum */ Class1609 Field15510;
    public static final /* enum */ Class1609 Field15511;
    public static final /* enum */ Class1609 Field15512;
    private static final Class1609[] Field15513;
    private String Field15514 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1609[] class1609Array = new Class1609[4];
        Class1609[] class1609Array2 = class1609Array;
        class1609Array[0] = Field15509 = new Class1609("NOT_YET_CONNECTED", 0);
        class1609Array[1] = Field15510 = new Class1609("OPEN", 1);
        class1609Array[2] = Field15511 = new Class1609("CLOSING", 2);
        class1609Array[3] = Field15512 = new Class1609("CLOSED", 3);
        Field15513 = class1609Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1609() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1609[] values() {
        return (U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU[])Field15513.clone();
    }

    public static Class1609 valueOf(String string) {
        return Enum.valueOf(Class1609.class, string);
    }

    private static String Method6277(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 85;
            cArray2[n] = (char)(cArray[n] ^ (0x2C5D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

