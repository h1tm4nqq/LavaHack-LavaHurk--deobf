/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.Cpuf5YTb4p01NgITadVqfnoSbQfZr5q4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Cpuf5YTb4p01NgITadVqfnoSbQfZr5q4;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/websockets/data/SocketMessage$Type;", "", "(Ljava/lang/String;I)V", "Text", "File", "Bytes", "kisman.cc"})
public final class Class734
extends Enum {
    public static final /* enum */ Class734 Field11110;
    public static final /* enum */ Class734 Field11111;
    public static final /* enum */ Class734 Field11112;
    private static final Class734[] Field11113;
    private String Field11114 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class734[] class734Array = new Class734[3];
        Class734[] class734Array2 = class734Array;
        class734Array[0] = Field11110 = new Class734("Text", 0);
        class734Array[1] = Field11111 = new Class734("File", 1);
        class734Array[2] = Field11112 = new Class734("Bytes", 2);
        Field11113 = class734Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class734() {
        void var2_-1;
        void var1_-1;
    }

    public static Class734[] values() {
        return (Cpuf5YTb4p01NgITadVqfnoSbQfZr5q4.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field11113.clone();
    }

    public static Class734 valueOf(String string) {
        return Enum.valueOf(Class734.class, string);
    }

    private static String Method3060(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 191;
            cArray2[n] = (char)(cArray[n] ^ (0xB13 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

