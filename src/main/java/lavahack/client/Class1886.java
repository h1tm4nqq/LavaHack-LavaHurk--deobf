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
import lavahack.client.Class1036;
import lavahack.client.Class1393;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class9;
import lavahack.client.Class97;
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

public class Class1886
extends Class42 {
    private final Class44 Field16697 = new Class44("Fall Speed", (Class42)this, 1.0, 1.0, Double.longBitsToDouble(0x4034000000000000L), false);
    private final Class44 Field16698 = new Class44("Instant", (Class42)this, false);
    private final Class44 Field16699 = new Class44("Instant Factor", (Class42)this, Double.longBitsToDouble(0x4034000000000000L), Double.longBitsToDouble((long)580933792 ^ 0x3FF19999BB39C13AL), Double.longBitsToDouble(0x4034000000000000L), false).Method313(this.Field16698::Method365);
    private BlockPos Field16700;
    private boolean Field16701 = false;
    private String Field16702 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1886() {
        super("TrapDoorBurrow", Class97.Field8338);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field16697);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field16698);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field16699);
    }

    @Override
    public void Method38() {
        if (Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null && !Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(this.Field16700).getBlock().equals(Blocks.TRAPDOOR)) {
            this.Field16701 = false;
            Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = (Math.floor(Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)2080280069 ^ 0x3FE000007BFE8E05L) - Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) / Double.longBitsToDouble((long)1523143232 ^ 0x400000005AC95240L);
            Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = (Math.floor(Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble((long)350503821 ^ 0x3FE0000014E4438DL) - Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) / Double.longBitsToDouble(0x4000000000000000L);
            this.Field16700 = Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition();
            if (!Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
            Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            return;
        }
        super.Method21(false);
    }

    @Override
    public void Method39() {
        Class394.Method1953();
    }

    @Override
    public void Method45() {
        if (Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field16698.Method365()) {
            Class394.Method1952(this.Field16699.Method368());
        }
        if (!Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(this.Field16700).getBlock().equals(Blocks.TRAPDOOR)) {
            int n = Class9.Method120(Blocks.TRAPDOOR, 0, 9);
            int n2 = Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            if (n == -1) {
                Class1393.Method5504().Method1886("[TrapDoorBurrow] Cant found trap door in your hotbar");
                super.Method21(false);
                return;
            }
            Class9.Method110(n, false);
            Class1886.Method6995(this.Field16700, EnumHand.MAIN_HAND);
            Class9.Method110(n2, false);
            return;
        }
        Vec3d vec3d = new Vec3d((Vec3i)this.Field16700).add(new Vec3d(Double.longBitsToDouble((long)1433842807 ^ 0x3FE000005576B477L), 1.0, Double.longBitsToDouble((long)280455408 ^ 0x3FE0000010B768F0L)));
        if (!this.Field16701) {
            this.Method6994(vec3d);
            Class1393.Method5503().Method1886("[TrapDoorBurrow] Done!");
            super.Method21(false);
            this.Field16701 = true;
            return;
        }
        if (Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            this.Method6994(vec3d);
            Class1393.Method5503().Method1886("[TrapDoorBurrow] Done!");
            super.Method21(false);
            return;
        }
        Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -this.Field16697.Method367();
    }

    protected void Method6994(Vec3d vec3d) {
        Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = Float.intBitsToFloat(1119092736);
        Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Field16700, EnumFacing.UP, vec3d, EnumHand.MAIN_HAND);
    }

    public static boolean Method6995(BlockPos blockPos, EnumHand enumHand) {
        if (!Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return false;
        }
        if (Class1036.Method4215(blockPos) == null) {
            return false;
        }
        Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, Objects.requireNonNull(Class1036.Method4215(blockPos)).getOpposite(), enumHand, Float.intBitsToFloat(0x3F000000), 0.0f, Float.intBitsToFloat(0x3F000000)));
        Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketAnimation(enumHand));
        return true;
    }

    @Override
    public boolean Method51() {
        return false;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 63;
            cArray2[n] = (char)(cArray[n] ^ (0x5A8C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

