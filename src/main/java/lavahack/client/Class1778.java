//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class Class1778
extends Class42 {
    private final Class44 Field16152 = this.Method23(new Class44("Height", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble((long)177267981 ^ 0x402400000A90E50DL), false));
    private String Field16153 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1778() {
        super("WebLeave", "f", Class97.Field8344);
    }

    @Override
    public void Method38() {
        if (Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + 1.0, Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Block.getBlockById((int)30)) {
            Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field16152.Method367();
            return;
        }
        if (Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Block.getBlockById((int)30)) {
            Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
            Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class1778.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field16152.Method367();
            return;
        }
        Class1393.Method5504().Method1886("Web not found!");
        super.Method21(false);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 76;
            cArray2[n] = (char)(cArray[n] ^ (0x5883 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

