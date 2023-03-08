//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;

public class Class1886 extends Class42
{
    private final Class44 Field16697;
    private final Class44 Field16698;
    private final Class44 Field16699;
    private BlockPos Field16700;
    private boolean Field16701;
    private String Field16702 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1886() {
        super("TrapDoorBurrow", Class97.Field8338);
        this.Field16697 = new Class44("Fall Speed", this, 1.0, 1.0, Double.longBitsToDouble(4626322717216342016L), false);
        this.Field16698 = new Class44("Instant", this, false);
        this.Field16699 = new Class44("Instant Factor", this, Double.longBitsToDouble(4626322717216342016L), Double.longBitsToDouble((long)580933792 ^ 0x3FF19999BB39C13AL), Double.longBitsToDouble(4626322717216342016L), false).Method313(this.Field16698::Method365);
        this.Field16701 = false;
        Class1886.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field16697);
        Class1886.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field16698);
        Class1886.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field16699);
    }
    
    @Override
    public void Method38() {
        if (Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(this.Field16700).getBlock().equals(Blocks.TRAPDOOR)) {
            super.Method21(false);
            return;
        }
        this.Field16701 = false;
        Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = (Math.floor(Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)2080280069 ^ 0x3FE000007BFE8E05L) - Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) / Double.longBitsToDouble((long)1523143232 ^ 0x400000005AC95240L);
        Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = (Math.floor(Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble((long)350503821 ^ 0x3FE0000014E4438DL) - Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) / Double.longBitsToDouble(4611686018427387904L);
        this.Field16700 = Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition();
        if (Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
        }
    }
    
    @Override
    public void Method39() {
        Class394.Method1953();
    }
    
    @Override
    public void Method45() {
        if (Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field16698.Method365()) {
            Class394.Method1952(this.Field16699.Method368());
        }
        if (!Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(this.Field16700).getBlock().equals(Blocks.TRAPDOOR)) {
            final int method120 = Class9.Method120(Blocks.TRAPDOOR, 0, 9);
            final int currentItem = Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            if (method120 == -1) {
                Class1393.Method5504().Method1886("[TrapDoorBurrow] Cant found trap door in your hotbar");
                super.Method21(false);
                return;
            }
            Class9.Method110(method120, false);
            Method6995(this.Field16700, EnumHand.MAIN_HAND);
            Class9.Method110(currentItem, false);
        }
        else {
            final Vec3d add = new Vec3d((Vec3i)this.Field16700).add(new Vec3d(Double.longBitsToDouble((long)1433842807 ^ 0x3FE000005576B477L), 1.0, Double.longBitsToDouble((long)280455408 ^ 0x3FE0000010B768F0L)));
            if (!this.Field16701) {
                this.Method6994(add);
                Class1393.Method5503().Method1886("[TrapDoorBurrow] Done!");
                super.Method21(false);
                this.Field16701 = true;
            }
            else if (Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                this.Method6994(add);
                Class1393.Method5503().Method1886("[TrapDoorBurrow] Done!");
                super.Method21(false);
            }
            else {
                Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -this.Field16697.Method367();
            }
        }
    }
    
    protected void Method6994(final Vec3d vec3d) {
        Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = Float.intBitsToFloat(1119092736);
        Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Field16700, EnumFacing.UP, vec3d, EnumHand.MAIN_HAND);
    }
    
    public static boolean Method6995(final BlockPos blockPos, final EnumHand enumHand) {
        if (!Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return false;
        }
        if (Class1036.Method4215(blockPos) == null) {
            return false;
        }
        Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, Objects.requireNonNull(Class1036.Method4215(blockPos)).getOpposite(), enumHand, Float.intBitsToFloat(1056964608), 0.0f, Float.intBitsToFloat(1056964608)));
        Class1886.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketAnimation(enumHand));
        return true;
    }
    
    @Override
    public boolean Method51() {
        return false;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5A8C ^ 0x3F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
