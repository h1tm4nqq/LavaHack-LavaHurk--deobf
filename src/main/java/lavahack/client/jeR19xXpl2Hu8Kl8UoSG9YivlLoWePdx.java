//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
public class jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private int Field13399;

    public jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx() {
        super("SafeWalk", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
    }

    @Override
    public void Method45() {
        if (jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        double d = jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Math.floor(jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
        double d2 = jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Math.floor(jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos = new BlockPos(jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos2 = blockPos.down().north();
        BlockPos blockPos3 = blockPos.down().east();
        BlockPos blockPos4 = blockPos.down().south();
        BlockPos blockPos5 = blockPos.down().west();
        if (d >= 1.0 && this.Method4805(blockPos3) && jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX > 0.0) {
            jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        }
        if (d <= 0.0 && this.Method4805(blockPos5) && jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY < 0.0) {
            jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        }
        if (d2 >= 1.0 && this.Method4805(blockPos4) && jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ > 0.0) {
            jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        }
        if (d2 <= 0.0 && this.Method4805(blockPos2) && jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ < 0.0) {
            jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("doing things");
    }

    private boolean Method4805(BlockPos blockPos) {
        return jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)jeR19xXpl2Hu8Kl8UoSG9YivlLoWePdx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)632831841L ^ 0x25B83F61;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)167122129 ^ (long)167121966);
            int n2 = ((int)-278627018L ^ 0xEF647D57) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)16945180 ^ (long)16973475) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

