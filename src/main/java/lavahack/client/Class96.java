/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/event/events/client/friend/FriendEvent$Type;", "", "(Ljava/lang/String;I)V", "Add", "Remove", "kisman.cc"})
public final class Class96
extends Enum {
    public static final /* enum */ Class96 Field8334;
    public static final /* enum */ Class96 Field8335;
    private static final Class96[] Field8336;
    private String Field8337 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class96[] class96Array = new Class96[2];
        Class96[] class96Array2 = class96Array;
        class96Array[0] = Field8334 = new Class96("Add", 0);
        class96Array[1] = Field8335 = new Class96("Remove", 1);
        Field8336 = class96Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class96() {
        void var2_-1;
        void var1_-1;
    }

    public static Class96[] values() {
        return (ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field8336.clone();
    }

    public static Class96 valueOf(String string) {
        return Enum.valueOf(Class96.class, string);
    }

    private static String Method803(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 194;
            cArray2[n] = (char)(cArray[n] ^ (0x4DB7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

