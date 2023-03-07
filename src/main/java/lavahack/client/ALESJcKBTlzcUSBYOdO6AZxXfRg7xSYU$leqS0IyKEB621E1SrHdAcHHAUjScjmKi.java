/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/event/events/client/friend/FriendEvent$Type;", "", "(Ljava/lang/String;I)V", "Add", "Remove", "kisman.cc"})
public final class ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8334;
    public static final /* enum */ ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8335;
    private static final ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field8336;
    private String Field8337 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-1095205790L ^ 0xBEB87C63) << 1];
        ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray2 = aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
        aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)213915488 ^ (long)213915488)] = Field8334 = new ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Add", (int)((long)1868784918 ^ (long)1868784918));
        aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-236773117 ^ (long)-236773118)] = Field8335 = new ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Remove", (int)((long)1847652153 ^ (long)1847652152));
        Field8336 = aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    public static ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field8336.clone();
    }

    public static ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    private static String Method803(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1133152316L ^ 0xBC7577C4;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1428356726L ^ 0x5522FE89);
            int n2 = (int)((long)-1823176718 ^ (long)-1823176813) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1453072422L ^ 0x569C6D91 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

