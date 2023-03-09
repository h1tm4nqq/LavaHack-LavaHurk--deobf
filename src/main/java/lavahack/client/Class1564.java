//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.Class1036;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class613;
import lavahack.client.Class711;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

@Deprecated
public class Class1564
extends Class42 {
    private final Class44 Field15284 = new Class44("Offset", (Class42)this, Double.longBitsToDouble(4619567317775286272L), Double.longBitsToDouble(-4597049319638433792L), Double.longBitsToDouble((long)1075492929 ^ 0x40340000401AB841L), false);
    private final Class44 Field15285 = new Class44("SmartOffset", (Class42)this, false);
    private final Class44 Field15286 = new Class44("Block", (Class42)this, Class613.Field10609);
    private final Class44 Field15287 = new Class44("Switch", (Class42)this, Class711.Field11028);
    private final Class44 Field15288 = new Class44("Rotate", (Class42)this, false);
    private final Class44 Field15289 = new Class44("Packet", (Class42)this, false);
    private final Class44 Field15290 = new Class44("Center", (Class42)this, false);
    private final Class44 Field15291 = new Class44("FloorY", (Class42)this, false).Method313(this.Field15290::Method365);
    private final Class44 Field15292 = new Class44("SmartOnGround", (Class42)this, false);
    private final Class44 Field15293 = new Class44("KeepOn", (Class42)this, false);
    private BlockPos Field15294 = null;
    private String Field15295 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1564() {
        super("Burrow", Class97.Field8338);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15284);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15285);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15286);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15287);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15288);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15289);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15290);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15291);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15292);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15293);
    }

    private int Method6155() {
        return Class9.Method127((Block)((Class613)this.Field15286.Method341()).Method2630().Method1726(new Object[0]));
    }

    private void Method6156(int n, boolean bl) {
        ((Class711)this.Field15287.Method341()).Method2972().Method1726(n, bl);
    }

    private boolean Method6157(BlockPos blockPos) {
        if (!Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable()) {
            return false;
        }
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity.equals((Object)Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) || entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return false;
        }
        return true;
    }

    private void Method6158() {
        double d = Math.floor(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)1100543050 ^ 0x3FE000004198F44AL);
        double d2 = this.Field15291.Method365() ? Math.floor(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) : Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d3 = Math.floor(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble((long)1209744320 ^ 0x3FE00000481B3BC0L);
        boolean bl = (double)((long)d2) != d2 || Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(d, d2, d3).down()).getMaterial().isReplaceable();
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        NetHandlerPlayClient netHandlerPlayClient = Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection;
        if (this.Field15292.Method365()) {
        }
        netHandlerPlayClient.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, true));
    }

    private void Method6159() {
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4601237667055665185L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4604959441848497896L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4607188435515049016L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4607930508405681519L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
    }

    private void Method6160(BlockPos blockPos, int n) {
        int n2 = Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method6156(n, false);
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field15288.Method365(), this.Field15289.Method365());
        this.Method6156(n2, true);
    }

    private double Method6161() {
        if (!this.Field15285.Method365()) return this.Field15284.Method367();
        if (this.Field15284.Method367() < Double.longBitsToDouble(0x4000000000000000L)) {
            return this.Field15284.Method367();
        }
        int n = 0;
        while ((double)n <= Math.ceil(this.Field15284.Method367())) {
            BlockPos blockPos = new BlockPos(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble(0x3FD3333333333333L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble(0x4000000000000000L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(0x3FD3333333333333L));
            BlockPos blockPos2 = new BlockPos(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)743338930 ^ 0x3FD333331F7D4081L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble(0x4000000000000000L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(0x3FD3333333333333L));
            BlockPos blockPos3 = new BlockPos(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)886409322 ^ 0x3FD3333307E6BB59L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble((long)386632469 ^ 0x40000000170B8B15L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble((long)468747026 ^ 0x3FD3333328C3B021L));
            BlockPos blockPos4 = new BlockPos(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)105032344 ^ 0x3FD33333357199ABL), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble(0x4000000000000000L), Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(0x3FD3333333333333L));
            boolean bl = !Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable();
            boolean bl2 = !Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getMaterial().isReplaceable();
            boolean bl3 = !Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos3).getMaterial().isReplaceable();
            boolean bl4 = !Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos4).getMaterial().isReplaceable();
            ++n;
        }
        return this.Field15284.Method367();
    }

    @Override
    public void Method38() {
        this.Field15294 = new BlockPos(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (!this.Field15290.Method365()) return;
        this.Method6158();
    }

    @Override
    public void Method45() {
        if (Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = this.Method6155();
        if (n == -1) {
            if (this.Field15293.Method365()) return;
            this.Method22();
            return;
        }
        if (!this.Method6157(this.Field15294)) {
            if (this.Field15293.Method365()) return;
            this.Method22();
            return;
        }
        this.Method6159();
        this.Method6160(this.Field15294, n);
        double d = this.Method6161();
        Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d, Class1564.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
        if (this.Field15293.Method365()) {
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        this.Field15294 = null;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 77;
            cArray2[n] = (char)(cArray[n] ^ (0x1A27 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

