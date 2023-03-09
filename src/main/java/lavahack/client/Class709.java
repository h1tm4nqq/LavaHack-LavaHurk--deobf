//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

public class Class709
extends Class42 {
    private final Class44 Field11022 = this.Method23(new Class44("Heigth", (Class42)this, 1.0, 1.0, Double.longBitsToDouble((long)1589989901 ^ 0x403400005EC5520DL), false));
    private String Field11023 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class709() {
        super("WaterLeave", "WaterLeave", Class97.Field8344);
    }

    @Override
    public void Method38() {
        if (Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        boolean bl = false;
        if (Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Double.longBitsToDouble((long)2035365071 ^ 0x3FEE66661F3752A9L), Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Blocks.WATER) {
            Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field11022.Method367();
            Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = true;
            bl = true;
        }
        if (Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWater() || Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInLava()) {
            Class709.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = true;
            bl = true;
        }
        super.Method21(false);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 30;
            cArray2[n] = (char)(cArray[n] ^ (0x74A4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

