//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import lavahack.client.Class1393;
import lavahack.client.Class1887;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

@Class1887
public class Class1192
extends Class42 {
    private int Field13399;

    public Class1192() {
        super("SafeWalk", Class97.Field8340);
    }

    @Override
    public void Method45() {
        if (Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        double d = Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Math.floor(Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
        double d2 = Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Math.floor(Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos = new BlockPos(Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos2 = blockPos.down().north();
        BlockPos blockPos3 = blockPos.down().east();
        BlockPos blockPos4 = blockPos.down().south();
        BlockPos blockPos5 = blockPos.down().west();
        if (d >= 1.0 && this.Method4805(blockPos3) && Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX > 0.0) {
            Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        }
        if (d <= 0.0 && this.Method4805(blockPos5) && Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY < 0.0) {
            Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        }
        if (d2 >= 1.0 && this.Method4805(blockPos4) && Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ > 0.0) {
            Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        }
        if (d2 <= 0.0 && this.Method4805(blockPos2) && Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ < 0.0) {
            Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        }
        Class1393.Method5505().Method1886("doing things");
    }

    private boolean Method4805(BlockPos blockPos) {
        return Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1192.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 194;
            cArray2[n] = (char)(cArray[n] ^ (0x6EBF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

