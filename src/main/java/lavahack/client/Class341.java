//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.math.BlockPos;

public class Class341 {
    private static final Minecraft Field9407;
    public static final double Field9408;
    public static final double Field9409;
    private String Field9410 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static int Method1678(double d, boolean bl) {
        double d2 = bl ? Double.longBitsToDouble((long)930751934 ^ 0x3FD1EB8529C27452L) : Double.longBitsToDouble((long)95062374 ^ 0x3FCB851EBDFB62E3L);
        return (int)(d / d2) + 1;
    }

    public static CPacketPlayer.Position[] Method1679(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4, double d, double d2, double d3, double d4, double d5, double d6) {
        if (n < 2) {
            return new CPacketPlayer.Position[]{new CPacketPlayer.Position(d4, d5, d6, bl)};
        }
        double d7 = d4 - d;
        double d8 = d5 - d2;
        double d9 = d6 - d3;
        double d10 = d7 / (double)n;
        double d11 = d8 / (double)n;
        double d12 = d9 / (double)n;
        CPacketPlayer.Position[] positionArray = new CPacketPlayer.Position[n];
        double d13 = d;
        double d14 = d2;
        double d15 = d3;
        int n2 = 0;
        while (true) {
            if (n2 >= n - 1) {
                positionArray[n - 1] = new CPacketPlayer.Position(d4, d5, d6, bl);
                return positionArray;
            }
            Material material = Class341.Field9407.world.getBlockState(new BlockPos(d13 += d10, d14 += d11, d15 += d12).down()).getMaterial();
            Material material2 = Class341.Field9407.world.getBlockState(new BlockPos(d13, d14, d15)).getMaterial();
            if (!(bl3 && material2.isSolid() || bl4 && material.isLiquid() || material.isReplaceable())) {
                boolean bl5 = material.isLiquid() || material.isReplaceable() || material2.isSolid();
                positionArray[n2] = new CPacketPlayer.Position(d13, d14, d15, bl2 ? bl5 : bl);
            }
            ++n2;
        }
    }

    static {
        Field9409 = 0.0;
        Field9408 = 0.0;
        Field9407 = Minecraft.getMinecraft();
    }
}

