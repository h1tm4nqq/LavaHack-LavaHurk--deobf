//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import lavahack.client.Class1036;
import lavahack.client.Class1124;
import lavahack.client.Class298;
import lavahack.client.Class42;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;

public class Class1742
extends Class42 {
    private int Field15986;

    public Class1742() {
        super("BurrowHelper", Class97.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        int n = Class9.Method127(Blocks.OBSIDIAN);
        if (n == -1) {
            return;
        }
        int n2 = Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        double d = Math.floor(Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
        double d2 = Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d3 = Math.floor(Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos = Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> Class1742.Method6623(d, d2, d3, arg_0)).min(Comparator.comparingDouble(Class1742::Method6622)).orElse(null);
        if (blockPos == null) {
            return;
        }
        if (Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos = blockPos.down()).getBlock().isReplaceable((IBlockAccess)Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, true, false);
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
        }
        if (Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos = blockPos.up()).getBlock().isReplaceable((IBlockAccess)Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, true, false);
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
        }
        if (Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos = blockPos.up()).getBlock().isReplaceable((IBlockAccess)Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, true, false);
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
        }
        List<Vec3d> list = Arrays.asList(new Vec3d(d + Double.longBitsToDouble(0x3FD3333333333333L), d2, d3 + Double.longBitsToDouble((long)1188100240 ^ 0x3FD3333375E3CBA3L)), new Vec3d(d + Double.longBitsToDouble(0x3FD3333333333333L), d2, d3 + Double.longBitsToDouble((long)1717020330 ^ 0x3FE3333355649599L)), new Vec3d(d + Double.longBitsToDouble((long)140622981 ^ 0x3FE333333B528FB6L), d2, d3 + Double.longBitsToDouble(0x3FD3333333333333L)), new Vec3d(d + Double.longBitsToDouble(0x3FE3333333333333L), d2, d3 + Double.longBitsToDouble(0x3FE3333333333333L)));
        Vec3d vec3d = list.stream().min(Comparator.comparingDouble(Class1742::Method6621)).orElse(null);
        Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(vec3d.x, vec3d.y, vec3d.z, Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(vec3d.x, vec3d.y, vec3d.z);
        Class298.Method1560(Class1742::Method20);
    }

    private static void Method20() {
        Class298.Method1561(60L);
        Class1124.Field13068.Method36();
    }

    private static double Method6621(Vec3d vec3d) {
        return Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(vec3d.x, vec3d.y, vec3d.z);
    }

    private static double Method6622(BlockPos blockPos) {
        return Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble((long)430517015 ^ 0x3FE0000019A92B17L), (double)blockPos.getY() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getZ() + Double.longBitsToDouble((long)1142730101 ^ 0x3FE00000441CAD75L));
    }

    private static BlockPos Method6623(double d, double d2, double d3, EnumFacing enumFacing) {
        return new BlockPos(d, d2, d3).offset(enumFacing);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 34;
            cArray2[n] = (char)(cArray[n] ^ (0x2452 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

