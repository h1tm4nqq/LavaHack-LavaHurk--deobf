//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import java.util.Objects;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.IBlockAccess;

public class O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16697 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fall Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble(0x166E3983E61063E4L ^ 0x565A3983E61063E4L), (boolean)((long)1931282816 ^ (long)1931282816));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16698 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-942820617L ^ 0xC7CDB2F7) != 0);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16699 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant Factor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x26ED21C04291AD84L ^ 0x66D921C04291AD84L), Double.longBitsToDouble((long)580933792 ^ 0x3FF19999BB39C13AL), Double.longBitsToDouble(0x52317E9FCB5C9E7BL ^ 0x12057E9FCB5C9E7BL), (boolean)((long)-85004200 ^ (long)-85004200)).Method313(this.Field16698::Method365);
    private BlockPos Field16700;
    private boolean Field16701 = (int)((long)1779888025 ^ (long)1779888025);
    private String Field16702 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h() {
        super("TrapDoorBurrow", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field16697);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field16698);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field16699);
    }

    @Override
    public void Method38() {
        if (O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null && !O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(this.Field16700).getBlock().equals(Blocks.TRAPDOOR)) {
            this.Field16701 = (int)2052937002L ^ 0x7A5D552A;
            O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = (Math.floor(O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)2080280069 ^ 0x3FE000007BFE8E05L) - O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) / Double.longBitsToDouble((long)1523143232 ^ 0x400000005AC95240L);
            O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = (Math.floor(O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble((long)350503821 ^ 0x3FE0000014E4438DL) - O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) / Double.longBitsToDouble(0x9ED63869162CC0B1L ^ 0xDED63869162CC0B1L);
            this.Field16700 = O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition();
            if (!O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
            O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            return;
        }
        super.Method21((boolean)((long)-1119021412 ^ (long)-1119021412));
    }

    @Override
    public void Method39() {
        EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
    }

    @Override
    public void Method45() {
        if (O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field16698.Method365()) {
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(this.Field16699.Method368());
        }
        if (!O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(this.Field16700).getBlock().equals(Blocks.TRAPDOOR)) {
            int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.TRAPDOOR, (int)1519654273L ^ 0x5A941581, (int)1312907033L ^ 0x4E415F10);
            int n2 = O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            if (n == (int)((long)-1666786072 ^ (long)1666786071)) {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("[TrapDoorBurrow] Cant found trap door in your hotbar");
                super.Method21((boolean)((long)1922431066 ^ (long)1922431066));
                return;
            }
            lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(n, ((int)1037336544L ^ 0x3DD47FE0) != 0);
            O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.Method6995(this.Field16700, EnumHand.MAIN_HAND);
            lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(n2, ((int)1133937027L ^ 0x43968183) != 0);
            return;
        }
        Vec3d vec3d = new Vec3d((Vec3i)this.Field16700).add(new Vec3d(Double.longBitsToDouble((long)1433842807 ^ 0x3FE000005576B477L), 1.0, Double.longBitsToDouble((long)280455408 ^ 0x3FE0000010B768F0L)));
        if (!this.Field16701) {
            this.Method6994(vec3d);
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("[TrapDoorBurrow] Done!");
            super.Method21((boolean)((long)1442228549 ^ (long)1442228549));
            this.Field16701 = (int)-344360336L ^ 0xEB797A71;
            return;
        }
        if (O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            this.Method6994(vec3d);
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("[TrapDoorBurrow] Done!");
            super.Method21(((int)-1155440909L ^ 0xBB215EF3) != 0);
            return;
        }
        O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -this.Field16697.Method367();
    }

    protected void Method6994(Vec3d vec3d) {
        O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = Float.intBitsToFloat((int)((long)951962070 ^ (long)2047461846));
        O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Field16700, EnumFacing.UP, vec3d, EnumHand.MAIN_HAND);
    }

    public static boolean Method6995(BlockPos blockPos, EnumHand enumHand) {
        if (!O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return (int)((long)975127026 ^ (long)975127026) != 0;
        }
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4215(blockPos) == null) {
            return ((int)1882517737L ^ 0x7034F0E9) != 0;
        }
        O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, Objects.requireNonNull(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4215(blockPos)).getOpposite(), enumHand, Float.intBitsToFloat(0x5C8366D ^ 0x3AC8366D), 0.0f, Float.intBitsToFloat((int)((long)1307637673 ^ (long)1928394665))));
        O7GFSrJAEBlXtocXIarDQmTDdRXQoY0h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketAnimation(enumHand));
        return (int)((long)-12213688 ^ (long)-12213687) != 0;
    }

    @Override
    public boolean Method51() {
        return ((int)-1300363013L ^ 0xB27E08FB) != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2140764931 ^ (long)2140764931);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1151709913L ^ 0xBB5A4DD8);
            int n2 = (int)((long)-413080486 ^ (long)-413080475);
            cArray2[n] = (char)(cArray[n] ^ (((int)620503254L ^ 0x24FC3675) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

