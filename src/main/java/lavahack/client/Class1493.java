/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.xVk847rc3gahDuDDNKNmNoHUF7beNjai;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/combat/CityBoss$MineMode;", "", "(Ljava/lang/String;I)V", "Client", "PacketMine", "kisman.cc"})
public final class Class1493
extends Enum {
    public static final /* enum */ Class1493 Field14981;
    public static final /* enum */ Class1493 Field14982;
    private static final Class1493[] Field14983;
    private int Field14984;

    static {
        Class1493[] class1493Array = new Class1493[2];
        Class1493[] class1493Array2 = class1493Array;
        class1493Array[0] = Field14981 = new Class1493("Client", 0);
        class1493Array[1] = Field14982 = new Class1493("PacketMine", 1);
        Field14983 = class1493Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1493() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1493[] values() {
        return (xVk847rc3gahDuDDNKNmNoHUF7beNjai.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field14983.clone();
    }

    public static Class1493 valueOf(String string) {
        return Enum.valueOf(Class1493.class, string);
    }

    private static String Method5973(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 18;
            cArray2[n] = (char)(cArray[n] ^ (0x58B6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

