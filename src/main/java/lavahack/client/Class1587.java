/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import lavahack.client.Class1308;
import net.minecraft.util.EnumHand;

enum Class1587 {
    Field15419(EnumHand.MAIN_HAND),
    Field15420(EnumHand.OFF_HAND),
    Field15421(null);

    private final EnumHand Field15422;
    private String Field15424 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1587() {
        void var3_1;
        this.Field15422 = var3_1;
    }

    public EnumHand Method6229() {
        EnumHand enumHand;
        if (this.Field15422 == null) {
            enumHand = ((Class1308)null).Method5313();
            return enumHand;
        }
        enumHand = this.Field15422;
        return enumHand;
    }

    private static String Method6230(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 44;
            cArray2[n] = (char)(cArray[n] ^ (0x35B6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

