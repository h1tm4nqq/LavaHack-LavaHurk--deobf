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
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.Class1008;
import lavahack.client.Class1036;
import lavahack.client.Class1212;
import lavahack.client.Class1303;
import lavahack.client.Class1390;
import lavahack.client.Class1592;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class613;
import lavahack.client.Class711;
import lavahack.client.Class721;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1124
extends Class42 {
    private final Class44 Field13045 = this.Method23(new Class44("Mode", (Class42)this, Class1212.Field13496));
    private final Class44 Field13046 = this.Method23(new Class44("Reconfig Corner Clip", (Class42)this, false).Method313(this::Method4584));
    private final Class44 Field13047 = this.Method23(new Class44("Clips Count", (Class42)this, 1.0, 1.0, Double.longBitsToDouble(0x4014000000000000L), true).Method313(this::Method4583));
    private final Class1303 Field13048 = new Class1303("Direction", (Class42)this, Class1592.Field15448).Method5301(this::Method4582).Method5303();
    private final Class44 Field13049 = this.Method23(new Class44("Place Helping Blocks", (Class42)this, false).Method313(this::Method4581));
    private final Class44 Field13050 = this.Method23(new Class44("Place Delay", (Class42)this, Double.longBitsToDouble((long)402127733 ^ 0x4059000017F7FB75L), 0.0, Double.longBitsToDouble((long)857959220 ^ 0x408F400033236B34L), Class467.Field9943));
    private final Class44 Field13051 = this.Method23(new Class44("Offset", (Class42)this, Double.longBitsToDouble(4619567317775286272L), Double.longBitsToDouble(-4597049319638433792L), Double.longBitsToDouble(0x4034000000000000L), false));
    private final Class44 Field13052 = this.Method23(new Class44("SmartOffset", (Class42)this, false));
    private final Class44 Field13053 = this.Method23(new Class44("Block", (Class42)this, Class613.Field10609));
    private final Class1303 Field13054 = new Class1303("Switch", (Class42)this, Class711.Field11028).Method5303();
    private final Class44 Field13055 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field13056 = this.Method23(new Class44("Packet", (Class42)this, false));
    private final Class44 Field13057 = this.Method23(new Class44("Center", (Class42)this, false).Method313(this::Method4580));
    private final Class44 Field13058 = this.Method23(new Class44("FloorY", (Class42)this, false).Method313(this.Field13057::Method365));
    private final Class44 Field13059 = this.Method23(new Class44("NoPushOutBlock", (Class42)this, false));
    private final Class44 Field13060 = this.Method23(new Class44("Smart", (Class42)this, false));
    private final Class44 Field13061 = this.Method23(new Class44("SmartRange", (Class42)this, Double.longBitsToDouble((long)216187651 ^ 0x400800000CE2C303L), 1.0, Double.longBitsToDouble(0x4020000000000000L), false).Method313(this.Field13060::Method365));
    private final Class44 Field13062 = this.Method23(new Class44("SmartOnGround", (Class42)this, false));
    public final Class44 Field13063 = this.Method23(new Class44("KeepOn", (Class42)this, false));
    private final Class44 Field13064 = this.Method23(new Class44("Dynamic", (Class42)this, false));
    private final Class44 Field13065 = this.Method23(new Class44("Down", (Class42)this, false));
    private final Class44 Field13066 = this.Method23(new Class44("SetBack", (Class42)this, false));
    private final Class44 Field13067 = this.Method23(new Class44("Place Upper Block", (Class42)this, false));
    public static Class1124 Field13068;
    private BlockPos Field13069 = null;
    private Class1390 Field13070 = Class1390.Field14299;
    private int Field13071 = 0;
    private final ArrayList Field13072 = new ArrayList();
    private final ArrayList Field13073 = new ArrayList();
    private final Class650 Field13074 = new Class650();
    private String Field13075 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1124() {
        super("Burrow", Class97.Field8338);
        Field13068 = this;
    }

    private void Method20() {
        null.Field17808.Method370(1.0);
        null.Field17809.Method366(true);
        this.Field13046.Method366(false);
    }

    private int Method4569() {
        return Class9.Method127((Block)((Class613)this.Field13053.Method341()).Method2630().Method1726(new Object[0]));
    }

    private void Method4570(int n, boolean bl) {
        ((Class711)this.Field13054.Method341()).Method2972().Method1726(n, bl);
    }

    private boolean Method4571(BlockPos blockPos) {
        if (!Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable()) {
            return false;
        }
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity.equals((Object)Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) || entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return false;
        }
        return true;
    }

    private void Method4572() {
        double d = Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(4602678819172646912L);
        double d2 = this.Field13058.Method365() ? Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) : Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d3 = Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble((long)1051112749 ^ 0x3FE000003EA6B52DL);
        boolean bl = (double)((long)d2) != d2 || Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(d, d2, d3).down()).getMaterial().isReplaceable();
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        NetHandlerPlayClient netHandlerPlayClient = Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection;
        if (this.Field13062.Method365()) {
        }
        netHandlerPlayClient.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, true));
    }

    private void Method4573() {
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4601237667055665185L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4604959441848497896L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4607188435515049016L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4607930508405681519L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble((long)989785871 ^ 0x3FF2A86215CA4260L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }

    private void Method4574(BlockPos blockPos, int n) {
        if (Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock() != Blocks.AIR) return;
        int n2 = Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method4570(n, false);
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field13055.Method365(), this.Field13056.Method365());
        this.Method4570(n2, true);
    }

    private double Method4575() {
        if (!this.Field13052.Method365()) return this.Field13051.Method367();
        if (this.Field13051.Method367() < Double.longBitsToDouble(0x4000000000000000L)) {
            return this.Field13051.Method367();
        }
        int n = 0;
        while ((double)n <= Math.ceil(this.Field13051.Method367())) {
            BlockPos blockPos = new BlockPos(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)95891559 ^ 0x3FD3333336840354L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble((long)696715266 ^ 0x4000000029870802L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(0x3FD3333333333333L));
            BlockPos blockPos2 = new BlockPos(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)1671314356 ^ 0x3FD3333350AD0887L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble((long)1193356339 ^ 0x4000000047212C33L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble((long)1562435804 ^ 0x3FD333336E13D3EFL));
            BlockPos blockPos3 = new BlockPos(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)777983741 ^ 0x3FD333331D6C25CEL), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble((long)849627922 ^ 0x4000000032A44B12L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble((long)2119160385 ^ 0x3FD333334D7CE172L));
            BlockPos blockPos4 = new BlockPos(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)1540313886 ^ 0x3FD3333368FC602DL), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble(0x4000000000000000L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble((long)2103472144 ^ 0x3FD333334E534323L));
            boolean bl = !Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable();
            boolean bl2 = !Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getMaterial().isReplaceable();
            boolean bl3 = !Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos3).getMaterial().isReplaceable();
            boolean bl4 = !Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos4).getMaterial().isReplaceable();
            ++n;
        }
        return this.Field13051.Method367();
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method21(false);
            return;
        }
        this.Field13069 = new BlockPos(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (this.Field13057.Method365() && this.Field13045.Method341() == Class1212.Field13495) {
            this.Method4572();
        }
        if (this.Field13045.Method341() != Class1212.Field13495) {
            this.Method20();
        }
        this.Field13070 = Class1390.Field14299;
        this.Field13071 = 0;
    }

    private void Method4576() {
        int n = this.Method4569();
        if (n == -1) {
            if (this.Field13063.Method365()) return;
            this.Method22();
            return;
        }
        if (!this.Method4571(this.Field13069)) {
            if (this.Field13063.Method365()) return;
            this.Method22();
            return;
        }
        if (this.Field13060.Method365() && Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.stream().noneMatch(this::Method4579)) {
            return;
        }
        this.Method4573();
        if (this.Field13064.Method365()) {
            int n2 = Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            this.Method4570(n, false);
            for (BlockPos blockPos : Class1008.Field12376.Method4079((Entity)Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field13069.getY(), 0)) {
                Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field13055.Method365(), this.Field13056.Method365());
                if (!this.Field13067.Method365()) continue;
                Class1036.Method4208(blockPos.up(), EnumHand.MAIN_HAND, this.Field13055.Method365(), this.Field13056.Method365());
            }
            this.Method4570(n2, true);
        } else {
            this.Method4574(this.Field13069, n);
            if (this.Field13067.Method365()) {
                this.Method4574(this.Field13069.up(), n);
            }
        }
        if (this.Field13065.Method365() && this.Field13066.Method365()) {
            Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - 1.0), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        }
        if (!vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isSingleplayer()) {
            Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Double.longBitsToDouble((long)278152274 ^ 0x3FF2A8623FA0E93DL), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
            double d = this.Method4575();
            if (this.Field13065.Method365()) {
                Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - (this.Field13066.Method365() ? d : d + 1.0), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
            } else {
                Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
            }
        }
        if (this.Field13063.Method365()) {
            return;
        }
        this.Method22();
    }

    private void Method4577() {
        if (this.Field13070 == Class1390.Field14299) {
            double d = Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
            double d2 = this.Field13058.Method365() ? Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) : Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
            double d3 = Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
            if (this.Field13048.Method341() == Class1592.Field15448) {
                d += 1.0 - Class721.Method3019();
                d3 += 1.0 - Class721.Method3019();
            } else if (this.Field13048.Method341() == Class1592.Field15449) {
                d += Class721.Method3019();
                d3 += Class721.Method3019();
            } else if (this.Field13048.Method341() == Class1592.Field15450) {
                d += 1.0 - Class721.Method3019();
                d3 += Class721.Method3019();
            } else if (this.Field13048.Method341() == Class1592.Field15451) {
                d += Class721.Method3019();
                d3 += 1.0 - Class721.Method3019();
            }
            boolean bl = (double)((long)d2) != d2 || Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(d, d2, d3).down()).getMaterial().isReplaceable();
            Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            NetHandlerPlayClient netHandlerPlayClient = Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection;
            if (this.Field13062.Method365()) {
            }
            netHandlerPlayClient.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, true));
            this.Field13070 = this.Field13049.Method365() ? Class1390.Field14300 : Class1390.Field14302;
            return;
        }
        if (this.Field13070 == Class1390.Field14300) {
            BlockPos blockPos = this.Field13069.offset(((Class1592)this.Field13048.Method341()).Method6249());
            BlockPos blockPos2 = this.Field13069.offset(((Class1592)this.Field13048.Method341()).Method6250());
            BlockPos blockPos3 = blockPos.up();
            BlockPos blockPos4 = blockPos2.up();
            this.Field13072.clear();
            this.Field13072.add(blockPos);
            this.Field13072.add(blockPos2);
            this.Field13072.add(blockPos3);
            this.Field13072.add(blockPos4);
            this.Field13073.clear();
            this.Field13074.Method2801();
            this.Field13070 = Class1390.Field14301;
            return;
        }
        if (this.Field13070 == Class1390.Field14301) {
            BlockPos blockPos;
            int n = this.Method4569();
            if (!this.Field13074.Method2797(this.Field13050.Method335())) {
                return;
            }
            this.Field13074.Method2801();
            Iterator iterator = this.Field13072.iterator();
            do {
                if (iterator.hasNext()) continue;
                this.Field13070 = Class1390.Field14302;
                return;
            } while (this.Field13073.contains(blockPos = (BlockPos)iterator.next()));
            this.Method4574(blockPos, n);
            this.Field13073.add(blockPos);
            return;
        }
        if (this.Field13070 == Class1390.Field14302) {
            if (((Class42)null).Method35()) return;
            ((Class42)null).Method36();
            ++this.Field13071;
            if (this.Field13071 != this.Field13047.Method335()) return;
            this.Field13070 = Class1390.Field14303;
            return;
        }
        if (this.Field13070 != Class1390.Field14303) return;
        this.Method4576();
        this.Field13070 = Class1390.Field14299;
    }

    @Override
    public void Method45() {
        if (Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field13045.Method341() == Class1212.Field13495) {
            this.Method4576();
            return;
        }
        this.Method4577();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4578(PlayerSPPushOutOfBlocksEvent playerSPPushOutOfBlocksEvent) {
        if (!this.Field13059.Method365()) return;
        playerSPPushOutOfBlocksEvent.setCanceled(true);
    }

    private boolean Method4579(EntityPlayer entityPlayer) {
        if (!((double)Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) <= this.Field13061.Method367())) return false;
        return true;
    }

    private Boolean Method4580() {
        boolean bl;
        if (this.Field13045.Method341() == Class1212.Field13495) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method4581() {
        boolean bl;
        if (this.Field13045.Method341() != Class1212.Field13495) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method4582() {
        boolean bl;
        if (this.Field13045.Method341() != Class1212.Field13495) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method4583() {
        boolean bl;
        if (this.Field13045.Method341() != Class1212.Field13495) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method4584() {
        boolean bl;
        if (this.Field13045.Method341() != Class1212.Field13495) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 65;
            cArray2[n] = (char)(cArray[n] ^ (0x42CC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

