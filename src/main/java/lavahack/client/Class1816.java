/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/module/Debug/PacketMineProviderTest$Mode;", "", "(Ljava/lang/String;I)V", "PacketMineProvider", "PlayerDamageBlock", "LeftClick", "kisman.cc"})
final class Class1816
extends Enum {
    public static final /* enum */ Class1816 Field16346;
    public static final /* enum */ Class1816 Field16347;
    public static final /* enum */ Class1816 Field16348;
    private static final Class1816[] Field16349;
    private String Field16350 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1816[] class1816Array = new Class1816[3];
        Class1816[] class1816Array2 = class1816Array;
        class1816Array[0] = Field16346 = new Class1816("PacketMineProvider", 0);
        class1816Array[1] = Field16347 = new Class1816("PlayerDamageBlock", 1);
        class1816Array[2] = Field16348 = new Class1816("LeftClick", 2);
        Field16349 = class1816Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1816() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1816[] values() {
        return (EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field16349.clone();
    }

    public static Class1816 valueOf(String string) {
        return Enum.valueOf(Class1816.class, string);
    }

    private static String Method6841(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 10;
            cArray2[n] = (char)(cArray[n] ^ (0xADC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

