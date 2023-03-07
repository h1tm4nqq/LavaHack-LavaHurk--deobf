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
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
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
public class HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15284 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offset", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xC0FF4FB63B37DFA7L ^ 0x80E34FB63B37DFA7L), Double.longBitsToDouble(0x5BE14324CD927AC7L ^ 0x9BD54324CD927AC7L), Double.longBitsToDouble((long)1075492929 ^ 0x40340000401AB841L), (boolean)((long)65449893 ^ (long)65449893));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15285 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SmartOffset", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1408488068L ^ 0xAC0C2D7C) != 0);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15286 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Block", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10609);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15287 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15288 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1932124043 ^ (long)-1932124043));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15289 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-498248647 ^ (long)-498248647));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15290 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Center", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1895744041 ^ (long)-1895744041));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15291 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FloorY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1336566107L ^ 0x4FAA615B) != 0).Method313(this.Field15290::Method365);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15292 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SmartOnGround", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1596154683 ^ (long)-1596154683));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15293 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("KeepOn", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)590697767L ^ 0x23355527) != 0);
    private BlockPos Field15294 = null;
    private String Field15295 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU() {
        super("Burrow", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
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
        return lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127((Block)((fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field15286.Method341()).Method2630().Method1726(new Object[(int)278716101L ^ 0x109CDEC5]));
    }

    private void Method6156(int n, boolean bl) {
        Object[] objectArray = new Object[((int)-758315101L ^ 0xD2CD07A2) << 1];
        objectArray[(int)((long)-1932500341 ^ (long)-1932500341)] = n;
        objectArray[(int)-559697142L ^ 0xDEA3B30B] = bl;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field15287.Method341()).Method2972().Method1726(objectArray);
    }

    private boolean Method6157(BlockPos blockPos) {
        if (!HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable()) {
            return (int)((long)330185032 ^ (long)330185032) != 0;
        }
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity.equals((Object)HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) || entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return ((int)-43842777L ^ 0xFD630327) != 0;
        }
        return ((int)-1420913852L ^ 0xAB4E9345) != 0;
    }

    private void Method6158() {
        double d = Math.floor(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)1100543050 ^ 0x3FE000004198F44AL);
        double d2 = this.Field15291.Method365() ? Math.floor(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) : HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d3 = Math.floor(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble((long)1209744320 ^ 0x3FE00000481B3BC0L);
        int n = (double)((long)d2) != d2 || HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(d, d2, d3).down()).getMaterial().isReplaceable() ? (int)360795967L ^ 0x15814F3E : (int)2133214455L ^ 0x7F2644F7;
        HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        NetHandlerPlayClient netHandlerPlayClient = HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection;
        if (this.Field15292.Method365()) {
        }
        netHandlerPlayClient.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, (boolean)((long)930687227 ^ (long)930687226)));
    }

    private void Method6159() {
        HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(0x61AFDDDCF3223BE7L ^ 0x5E753C9B53223BC6L), HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, (boolean)((long)1541979264 ^ (long)1541979265)));
        HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(0x4C9EBE1AC799BADDL ^ 0x7376A42C1FEC4C35L), HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, ((int)-1770178248L ^ 0x967D3939) != 0));
        HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(0xD6E96C7210159CE0L ^ 0xE919690AF03C18D8L), HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, ((int)764984970L ^ 0x2D98BE8B) != 0));
        HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(0x2EF16AE875E83C1CL ^ 0x1103C28A5ADC9173L), HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, ((int)807274650L ^ 0x301E089B) != 0));
    }

    private void Method6160(BlockPos blockPos, int n) {
        int n2 = HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method6156(n, (boolean)((long)-501028127 ^ (long)-501028127));
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field15288.Method365(), this.Field15289.Method365());
        this.Method6156(n2, ((int)-1982636197L ^ 0x89D35F5A) != 0);
    }

    private double Method6161() {
        if (!this.Field15285.Method365()) return this.Field15284.Method367();
        if (this.Field15284.Method367() < Double.longBitsToDouble(0x5FD05BE3307A5EDAL ^ 0x1FD05BE3307A5EDAL)) {
            return this.Field15284.Method367();
        }
        int n = (int)138411284L ^ 0x83FFD14;
        while ((double)n <= Math.ceil(this.Field15284.Method367())) {
            BlockPos blockPos = new BlockPos(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble(0xF0545C92BD844CD0L ^ 0xCF876FA18EB77FE3L), HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble(0x7C0A9DEF54F5A0EEL ^ 0x3C0A9DEF54F5A0EEL), HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(0x8EB0A8E68A57E868L ^ 0xB1639BD5B964DB5BL));
            BlockPos blockPos2 = new BlockPos(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)743338930 ^ 0x3FD333331F7D4081L), HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble(0x167610F567076B3AL ^ 0x567610F567076B3AL), HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(0xD4CF5D293553CFF4L ^ 0xEB1C6E1A0660FCC7L));
            BlockPos blockPos3 = new BlockPos(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)886409322 ^ 0x3FD3333307E6BB59L), HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble((long)386632469 ^ 0x40000000170B8B15L), HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble((long)468747026 ^ 0x3FD3333328C3B021L));
            BlockPos blockPos4 = new BlockPos(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)105032344 ^ 0x3FD33333357199ABL), HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble(0x5B84A0982D5A9A59L ^ 0x1B84A0982D5A9A59L), HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(0x67E13AE3DC1D37BDL ^ 0x583209D0EF2E048EL));
            int n2 = !HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable() ? (int)-1104451665L ^ 0xBE2B67AE : (int)((long)1488014420 ^ (long)1488014420);
            int n3 = !HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getMaterial().isReplaceable() ? (int)-2142868329L ^ 0x80466C96 : (int)((long)1955988743 ^ (long)1955988743);
            int n4 = !HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos3).getMaterial().isReplaceable() ? (int)((long)332624829 ^ (long)332624828) : (int)((long)1074344957 ^ (long)1074344957);
            int n5 = !HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos4).getMaterial().isReplaceable() ? (int)((long)1200736351 ^ (long)1200736350) : (int)1833670674L ^ 0x6D4B9812;
            ++n;
        }
        return this.Field15284.Method367();
    }

    @Override
    public void Method38() {
        this.Field15294 = new BlockPos(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (!this.Field15290.Method365()) return;
        this.Method6158();
    }

    @Override
    public void Method45() {
        if (HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = this.Method6155();
        if (n == (int)((long)1036688032 ^ (long)-1036688033)) {
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
        HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d, HqIuMtJAF4V2AkQZNx2olvsakbUl6xIU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, ((int)-643298185L ^ 0xD9A80C77) != 0));
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
        int n = (int)((long)1471755465 ^ (long)1471755465);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1699155880 ^ (long)1699155799);
            int n2 = (int)((long)-362835515 ^ (long)-362835576);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1889691488L ^ 0x8F5D8287 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

