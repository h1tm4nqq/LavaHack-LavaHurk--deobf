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
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.euqf1JFTGTMHHa42QPC0LPkhINLctBkD;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;

public class kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private int Field15986;

    public kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM() {
        super("BurrowHelper", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
        if (n == (int)((long)1438921393 ^ (long)-1438921394)) {
            return;
        }
        int n2 = kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        double d = Math.floor(kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
        double d2 = kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d3 = Math.floor(kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos = Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.Method6623(d, d2, d3, arg_0)).min(Comparator.comparingDouble(kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM::Method6622)).orElse(null);
        if (blockPos == null) {
            return;
        }
        if (kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos = blockPos.down()).getBlock().isReplaceable((IBlockAccess)kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
            kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, (boolean)((long)877004651 ^ (long)877004650), (boolean)((long)1375652167 ^ (long)1375652167));
            kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
            kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
        }
        if (kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos = blockPos.up()).getBlock().isReplaceable((IBlockAccess)kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
            kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, ((int)-1037136641L ^ 0xC22E8CFE) != 0, ((int)-436518043L ^ 0xE5FB4365) != 0);
            kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
            kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
        }
        if (kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos = blockPos.up()).getBlock().isReplaceable((IBlockAccess)kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
            kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, (boolean)((long)-372851020 ^ (long)-372851019), (boolean)((long)1438845488 ^ (long)1438845488));
            kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
            kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
        }
        Vec3d[] vec3dArray = new Vec3d[(int)((long)2002628324 ^ (long)2002628325) << 2];
        vec3dArray[(int)2125083083L ^ 0x7EAA31CB] = new Vec3d(d + Double.longBitsToDouble(0x23025135C2CBE788L ^ 0x1CD16206F1F8D4BBL), d2, d3 + Double.longBitsToDouble((long)1188100240 ^ 0x3FD3333375E3CBA3L));
        vec3dArray[(int)((long)2003984515 ^ (long)2003984514)] = new Vec3d(d + Double.longBitsToDouble(0xB7C358B560D79DB5L ^ 0x88106B8653E4AE86L), d2, d3 + Double.longBitsToDouble((long)1717020330 ^ 0x3FE3333355649599L));
        vec3dArray[(int)((long)-1214175917 ^ (long)-1214175918) << 1] = new Vec3d(d + Double.longBitsToDouble((long)140622981 ^ 0x3FE333333B528FB6L), d2, d3 + Double.longBitsToDouble(0x95FF7AC566F4208CL ^ 0xAA2C49F655C713BFL));
        vec3dArray[(int)((long)1575875064 ^ (long)1575875067)] = new Vec3d(d + Double.longBitsToDouble(0x7F00DC22CDD12723L ^ 0x40E3EF11FEE21410L), d2, d3 + Double.longBitsToDouble(0xBC263FF24803FDBL ^ 0x342150CC17B30CE8L));
        List<Vec3d> list = Arrays.asList(vec3dArray);
        Vec3d vec3d = list.stream().min(Comparator.comparingDouble(kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM::Method6621)).orElse(null);
        kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(vec3d.x, vec3d.y, vec3d.z, kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(vec3d.x, vec3d.y, vec3d.z);
        v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2.Method1560(kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM::Method20);
    }

    private static void Method20() {
        v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2.Method1561(0x1080E5BCL & 0x11C0A3CL);
        euqf1JFTGTMHHa42QPC0LPkhINLctBkD.Field13068.Method36();
    }

    private static double Method6621(Vec3d vec3d) {
        return kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(vec3d.x, vec3d.y, vec3d.z);
    }

    private static double Method6622(BlockPos blockPos) {
        return kRz26TDcTsR9N5yYWojpPQ4XV7kIw8rM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble((long)430517015 ^ 0x3FE0000019A92B17L), (double)blockPos.getY() + Double.longBitsToDouble(0x20E65A2154FCE160L ^ 0x1F065A2154FCE160L), (double)blockPos.getZ() + Double.longBitsToDouble((long)1142730101 ^ 0x3FE00000441CAD75L));
    }

    private static BlockPos Method6623(double d, double d2, double d3, EnumFacing enumFacing) {
        return new BlockPos(d, d2, d3).offset(enumFacing);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)274922044 ^ (long)274922044);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)570906042 ^ (long)570905925);
            int n2 = (int)((long)-1058247475 ^ (long)-1058247460) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1704183974L ^ 0x9A6C2573) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

