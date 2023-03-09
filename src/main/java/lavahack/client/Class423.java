//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import lavahack.client.Class1036;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Class423
extends Class42 {
    private int Field9774;
    private String Field9775 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class423() {
        super("TowerTest", Class97.Field8345);
    }

    @Override
    public void Method38() {
        if (Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field9774 = (int)Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
            Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        this.Field9774 = 0;
    }

    @Override
    public void Method45() {
        if (Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if ((int)Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY <= this.Field9774) {
            return;
        }
        BlockPos blockPos = new BlockPos(Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            Class1036.Method4208(new BlockPos(Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ).down(), EnumHand.MAIN_HAND, false, false);
        }
        if (Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            this.Field9774 = blockPos.getY();
            return;
        }
        Class423.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(-4624656385354214932L);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 43;
            cArray2[n] = (char)(cArray[n] ^ (0x75BB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

