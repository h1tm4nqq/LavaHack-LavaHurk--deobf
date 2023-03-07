//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class CqbF4zRMptOxU9a9mRsX9dwEhiPulijo
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16152 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Height", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x5FECEB32BD8EFCE3L ^ 0x1FF8EB32BD8EFCE3L), 0.0, Double.longBitsToDouble((long)177267981 ^ 0x402400000A90E50DL), (boolean)((long)1876657693 ^ (long)1876657693)));
    private String Field16153 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public CqbF4zRMptOxU9a9mRsX9dwEhiPulijo() {
        super("WebLeave", "f", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        if (CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + 1.0, CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Block.getBlockById((int)((int)((long)-1390279772 ^ (long)-1390279765) << 1))) {
            CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field16152.Method367();
            return;
        }
        if (CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Block.getBlockById((int)((int)((long)237373533 ^ (long)237373522) << 1))) {
            CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
            CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            CqbF4zRMptOxU9a9mRsX9dwEhiPulijo.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field16152.Method367();
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("Web not found!");
        super.Method21(((int)-476893438L ^ 0xE3932F02) != 0);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)560926477L ^ 0x216F0F0D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1711821451 ^ (long)1711821428);
            int n2 = (int)((long)336220680 ^ (long)336220699) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1389030386 ^ (long)-1389015923) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

