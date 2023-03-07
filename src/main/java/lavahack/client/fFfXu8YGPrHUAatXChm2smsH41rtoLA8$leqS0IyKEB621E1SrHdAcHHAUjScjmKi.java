//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 */
package lavahack.client;

import lavahack.client.fFfXu8YGPrHUAatXChm2smsH41rtoLA8;
import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;
import net.minecraft.init.Blocks;

public final class fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10609 = new fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Obsidian", (int)((long)-1657102420 ^ (long)-1657102420), fFfXu8YGPrHUAatXChm2smsH41rtoLA8.Method5340().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> Blocks.OBSIDIAN));
    public static final /* enum */ fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10610 = new fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("EnderChest", (int)-1909048203L ^ 0x8E363C74, fFfXu8YGPrHUAatXChm2smsH41rtoLA8.Method5340().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> Blocks.ENDER_CHEST));
    private final hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Field10611;
    private static final fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field10612;
    private String Field10613 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field10612.clone();
    }

    public static fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field10611 = var3_1;
    }

    public hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Method2630() {
        return this.Field10611;
    }

    static {
        fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-1267285149L ^ 0xB476C362) << 1];
        fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)72500191L ^ 0x45243DF] = Field10609;
        fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1761920445L ^ 0x6904C5BC] = Field10610;
        Field10612 = fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2633(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1345871879L ^ 0xAFC79FF9;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1536748681 ^ (long)1536748662);
            int n2 = (int)-1126049730L ^ 0xBCE1D8D3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-472961808 ^ (long)-472960171) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

