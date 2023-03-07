//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

public class CIQt60MD6SOHlMXeZg79011NE3n7W7cr
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11022 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Heigth", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble((long)1589989901 ^ 0x403400005EC5520DL), ((int)154783902L ^ 0x939D09E) != 0));
    private String Field11023 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public CIQt60MD6SOHlMXeZg79011NE3n7W7cr() {
        super("WaterLeave", "WaterLeave", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        if (CIQt60MD6SOHlMXeZg79011NE3n7W7cr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (CIQt60MD6SOHlMXeZg79011NE3n7W7cr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = (int)19209948L ^ 0x1251EDC;
        if (CIQt60MD6SOHlMXeZg79011NE3n7W7cr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(CIQt60MD6SOHlMXeZg79011NE3n7W7cr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, CIQt60MD6SOHlMXeZg79011NE3n7W7cr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Double.longBitsToDouble((long)2035365071 ^ 0x3FEE66661F3752A9L), CIQt60MD6SOHlMXeZg79011NE3n7W7cr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Blocks.WATER) {
            CIQt60MD6SOHlMXeZg79011NE3n7W7cr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field11022.Method367();
            CIQt60MD6SOHlMXeZg79011NE3n7W7cr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = (int)((long)122209498 ^ (long)122209499);
            n = (int)-1838399523L ^ 0x926C3FDC;
        }
        if (CIQt60MD6SOHlMXeZg79011NE3n7W7cr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWater() || CIQt60MD6SOHlMXeZg79011NE3n7W7cr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInLava()) {
            CIQt60MD6SOHlMXeZg79011NE3n7W7cr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = (int)-1361963559L ^ 0xAED215D8;
            n = (int)((long)1035914790 ^ (long)1035914791);
        }
        super.Method21((boolean)((long)753775841 ^ (long)753775841));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1575501774L ^ 0xA217C032;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1923545176 ^ (long)-1923545257);
            int n2 = (int)((long)671414290 ^ (long)671414301) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1203404697L ^ 0x47BA62B0) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

