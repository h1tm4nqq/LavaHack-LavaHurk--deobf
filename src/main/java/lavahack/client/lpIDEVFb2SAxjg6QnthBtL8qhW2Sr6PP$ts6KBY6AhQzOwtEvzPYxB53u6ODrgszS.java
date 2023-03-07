/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import lavahack.client.lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP;
import net.minecraft.util.EnumHand;

final class lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
extends Enum {
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field15419 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("MainHand", (int)-1941265385L ^ 0x8C4AA417, EnumHand.MAIN_HAND);
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field15420 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("OffHand", (int)((long)-843271873 ^ (long)-843271874), EnumHand.OFF_HAND);
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field15421 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("CurrentHand", ((int)2128343851L ^ 0x7EDBF32A) << 1, null);
    private final EnumHand Field15422;
    private static final lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[] Field15423;
    private String Field15424 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[] values() {
        return (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[])Field15423.clone();
    }

    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS valueOf(String string) {
        return Enum.valueOf(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field15422 = var3_1;
    }

    public EnumHand Method6229() {
        EnumHand enumHand;
        if (this.Field15422 == null) {
            enumHand = ((lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP)null).Method5313();
            return enumHand;
        }
        enumHand = this.Field15422;
        return enumHand;
    }

    static {
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[] lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[(int)((long)-2017594244 ^ (long)-2017594241)];
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray[(int)36513657L ^ 0x22D2779] = Field15419;
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray[(int)-101374089L ^ 0xF9F52776] = Field15420;
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray[((int)-1837629289L ^ 0x92780096) << 1] = Field15421;
        Field15423 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray;
    }

    private static String Method6230(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1916345177 ^ (long)-1916345177);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2056558575 ^ (long)2056558352);
            int n2 = ((int)-1579088700L ^ 0xA1E104CF) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-712138227L ^ 0xD58DB8D6) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

