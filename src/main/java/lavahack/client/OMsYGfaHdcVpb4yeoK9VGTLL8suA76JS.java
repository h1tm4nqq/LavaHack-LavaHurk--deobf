//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class OMsYGfaHdcVpb4yeoK9VGTLL8suA76JS
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17178 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Jumps", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xA2F5EDD775A4CBE2L ^ 0xE2FDEDD775A4CBE2L), Double.longBitsToDouble((long)1713642386 ^ 0x4008000066241B92L), Double.longBitsToDouble(0x1F5E527A88E75574L ^ 0x5F17527A88E75574L), (boolean)((long)175297085 ^ (long)175297084)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17179 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("JumpTimer", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xF34871A4EA80BD56L ^ 0xB34071A4EA80BD56L), 1.0, Double.longBitsToDouble(0xC3141ECDD479E5D7L ^ 0x839B5ECDD479E5D7L), (boolean)((long)-1365805630 ^ (long)-1365805629)));
    private int Field17180;
    private String Field17181 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public OMsYGfaHdcVpb4yeoK9VGTLL8suA76JS() {
        super("SelfDamage", "SelfDamage", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    @Override
    public void Method38() {
        this.Field17180 = (int)-1477876499L ^ 0xA7E964ED;
    }

    @Override
    public void Method39() {
        OMsYGfaHdcVpb4yeoK9VGTLL8suA76JS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = 1.0f;
    }

    @Override
    public void Method45() {
        if (OMsYGfaHdcVpb4yeoK9VGTLL8suA76JS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (OMsYGfaHdcVpb4yeoK9VGTLL8suA76JS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if ((double)this.Field17180 < this.Field17178.Method367()) {
            OMsYGfaHdcVpb4yeoK9VGTLL8suA76JS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = this.Field17179.Method368();
            OMsYGfaHdcVpb4yeoK9VGTLL8suA76JS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = (int)-1839736467L ^ 0x9257D96D;
        }
        if (!OMsYGfaHdcVpb4yeoK9VGTLL8suA76JS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
        if ((double)this.Field17180 < this.Field17178.Method367()) {
            OMsYGfaHdcVpb4yeoK9VGTLL8suA76JS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            this.Field17180 += (int)-1861171634L ^ 0x9110C64F;
            return;
        }
        OMsYGfaHdcVpb4yeoK9VGTLL8suA76JS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = 1.0f;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1652095671L ^ 0x6278FAB7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-594783884 ^ (long)-594783861);
            int n2 = (int)((long)104993131 ^ (long)104993128) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-794679523 ^ (long)-794677216) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

