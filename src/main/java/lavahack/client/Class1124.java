//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import java.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.client.network.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import java.util.function.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.player.*;

public class Class1124 extends Class42
{
    private final Class44 Field13045;
    private final Class44 Field13046;
    private final Class44 Field13047;
    private final Class1303 Field13048;
    private final Class44 Field13049;
    private final Class44 Field13050;
    private final Class44 Field13051;
    private final Class44 Field13052;
    private final Class44 Field13053;
    private final Class1303 Field13054;
    private final Class44 Field13055;
    private final Class44 Field13056;
    private final Class44 Field13057;
    private final Class44 Field13058;
    private final Class44 Field13059;
    private final Class44 Field13060;
    private final Class44 Field13061;
    private final Class44 Field13062;
    public final Class44 Field13063;
    private final Class44 Field13064;
    private final Class44 Field13065;
    private final Class44 Field13066;
    private final Class44 Field13067;
    public static Class1124 Field13068;
    private BlockPos Field13069;
    private Class1390 Field13070;
    private int Field13071;
    private final ArrayList Field13072;
    private final ArrayList Field13073;
    private final Class650 Field13074;
    private String Field13075 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1124() {
        super("Burrow", Class97.Field8338);
        this.Field13045 = this.Method23(new Class44("Mode", this, Class1212.Field13496));
        this.Field13046 = this.Method23(new Class44("Reconfig Corner Clip", this, false).Method313(this::Method4584));
        this.Field13047 = this.Method23(new Class44("Clips Count", this, 1.0, 1.0, Double.longBitsToDouble(4617315517961601024L), true).Method313(this::Method4583));
        this.Field13048 = new Class1303("Direction", this, Class1592.Field15448).Method5301(this::Method4582).Method5303();
        this.Field13049 = this.Method23(new Class44("Place Helping Blocks", this, false).Method313(this::Method4581));
        this.Field13050 = this.Method23(new Class44("Place Delay", this, Double.longBitsToDouble((long)402127733 ^ 0x4059000017F7FB75L), 0.0, Double.longBitsToDouble((long)857959220 ^ 0x408F400033236B34L), Class467.Field9943));
        this.Field13051 = this.Method23(new Class44("Offset", this, Double.longBitsToDouble(4619567317775286272L), Double.longBitsToDouble(-4597049319638433792L), Double.longBitsToDouble(4626322717216342016L), false));
        this.Field13052 = this.Method23(new Class44("SmartOffset", this, false));
        this.Field13053 = this.Method23(new Class44("Block", this, Class613.Field10609));
        this.Field13054 = new Class1303("Switch", this, Class711.Field11028).Method5303();
        this.Field13055 = this.Method23(new Class44("Rotate", this, false));
        this.Field13056 = this.Method23(new Class44("Packet", this, false));
        this.Field13057 = this.Method23(new Class44("Center", this, false).Method313(this::Method4580));
        this.Field13058 = this.Method23(new Class44("FloorY", this, false).Method313(this.Field13057::Method365));
        this.Field13059 = this.Method23(new Class44("NoPushOutBlock", this, false));
        this.Field13060 = this.Method23(new Class44("Smart", this, false));
        this.Field13061 = this.Method23(new Class44("SmartRange", this, Double.longBitsToDouble((long)216187651 ^ 0x400800000CE2C303L), 1.0, Double.longBitsToDouble(4620693217682128896L), false).Method313(this.Field13060::Method365));
        this.Field13062 = this.Method23(new Class44("SmartOnGround", this, false));
        this.Field13063 = this.Method23(new Class44("KeepOn", this, false));
        this.Field13064 = this.Method23(new Class44("Dynamic", this, false));
        this.Field13065 = this.Method23(new Class44("Down", this, false));
        this.Field13066 = this.Method23(new Class44("SetBack", this, false));
        this.Field13067 = this.Method23(new Class44("Place Upper Block", this, false));
        this.Field13069 = null;
        this.Field13070 = Class1390.Field14299;
        this.Field13071 = 0;
        this.Field13072 = new ArrayList();
        this.Field13073 = new ArrayList();
        this.Field13074 = new Class650();
        Class1124.Field13068 = this;
    }
    
    private void Method20() {
        null.Field17808.Method370(1.0);
        null.Field17809.Method366(true);
        this.Field13046.Method366(false);
    }
    
    private int Method4569() {
        return Class9.Method127((Block)((Class613)this.Field13053.Method341()).Method2630().Method1726(new Object[0]));
    }
    
    private void Method4570(final int i, final boolean b) {
        ((Class711)this.Field13054.Method341()).Method2972().Method1726(i, b);
    }
    
    private boolean Method4571(final BlockPos blockPos) {
        if (!Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable()) {
            return false;
        }
        for (final Entity entity : Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
            if (!entity.equals((Object)Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && !(entity instanceof EntityItem)) {
                if (entity instanceof EntityXPOrb) {
                    continue;
                }
                return false;
            }
        }
        return true;
    }
    
    private void Method4572() {
        final double n = Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(4602678819172646912L);
        final double n2 = this.Field13058.Method365() ? Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) : Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        final double n3 = Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble((long)1051112749 ^ 0x3FE000003EA6B52DL);
        if ((long)n2 != n2 || Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(n, n2, n3).down()).getMaterial().isReplaceable()) {}
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        final NetHandlerPlayClient connection = Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection;
        final double n4 = n;
        final double n5 = n2;
        final double n6 = n3;
        if (this.Field13062.Method365()) {}
        connection.sendPacket((Packet)new CPacketPlayer$Position(n4, n5, n6, true));
    }
    
    private void Method4573() {
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4601237667055665185L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4604959441848497896L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4607188435515049016L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4607930508405681519L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble((long)989785871 ^ 0x3FF2A86215CA4260L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }
    
    private void Method4574(final BlockPos blockPos, final int n) {
        if (Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock() == Blocks.AIR) {
            final int currentItem = Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            this.Method4570(n, false);
            Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field13055.Method365(), this.Field13056.Method365());
            this.Method4570(currentItem, true);
        }
    }
    
    private double Method4575() {
        if (!this.Field13052.Method365() || this.Field13051.Method367() < Double.longBitsToDouble(4611686018427387904L)) {
            return this.Field13051.Method367();
        }
        for (int n = 0; n <= Math.ceil(this.Field13051.Method367()); ++n) {
            final BlockPos blockPos = new BlockPos(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)95891559 ^ 0x3FD3333336840354L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n + Double.longBitsToDouble((long)696715266 ^ 0x4000000029870802L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(4599075939470750515L));
            final BlockPos blockPos2 = new BlockPos(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)1671314356 ^ 0x3FD3333350AD0887L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n + Double.longBitsToDouble((long)1193356339 ^ 0x4000000047212C33L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble((long)1562435804 ^ 0x3FD333336E13D3EFL));
            final BlockPos blockPos3 = new BlockPos(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)777983741 ^ 0x3FD333331D6C25CEL), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n + Double.longBitsToDouble((long)849627922 ^ 0x4000000032A44B12L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble((long)2119160385 ^ 0x3FD333334D7CE172L));
            final BlockPos blockPos4 = new BlockPos(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)1540313886 ^ 0x3FD3333368FC602DL), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n + Double.longBitsToDouble(4611686018427387904L), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble((long)2103472144 ^ 0x3FD333334E534323L));
            final boolean b = !Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable();
            final boolean b2 = !Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getMaterial().isReplaceable();
            final boolean b3 = !Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos3).getMaterial().isReplaceable();
            final boolean b4 = !Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos4).getMaterial().isReplaceable();
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
        final int method4569 = this.Method4569();
        if (method4569 == -1) {
            if (!this.Field13063.Method365()) {
                this.Method22();
            }
            return;
        }
        if (!this.Method4571(this.Field13069)) {
            if (!this.Field13063.Method365()) {
                this.Method22();
            }
            return;
        }
        if (this.Field13060.Method365() && Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.stream().noneMatch(this::Method4579)) {
            return;
        }
        this.Method4573();
        if (this.Field13064.Method365()) {
            final int currentItem = Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            this.Method4570(method4569, false);
            for (final BlockPos blockPos : Class1008.Field12376.Method4079((Entity)Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (double)this.Field13069.getY(), 0)) {
                Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field13055.Method365(), this.Field13056.Method365());
                if (this.Field13067.Method365()) {
                    Class1036.Method4208(blockPos.up(), EnumHand.MAIN_HAND, this.Field13055.Method365(), this.Field13056.Method365());
                }
            }
            this.Method4570(currentItem, true);
        }
        else {
            this.Method4574(this.Field13069, method4569);
            if (this.Field13067.Method365()) {
                this.Method4574(this.Field13069.up(), method4569);
            }
        }
        if (this.Field13065.Method365() && this.Field13066.Method365()) {
            Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - 1.0), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        }
        if (!Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isSingleplayer()) {
            Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Double.longBitsToDouble((long)278152274 ^ 0x3FF2A8623FA0E93DL), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
            final double method4570 = this.Method4575();
            if (this.Field13065.Method365()) {
                Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - (this.Field13066.Method365() ? method4570 : (method4570 + 1.0)), Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
            }
            else {
                Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + method4570, Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
            }
        }
        if (this.Field13063.Method365()) {
            return;
        }
        this.Method22();
    }
    
    private void Method4577() {
        if (this.Field13070 == Class1390.Field14299) {
            double floor = Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
            final double n = this.Field13058.Method365() ? Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) : Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
            double floor2 = Math.floor(Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
            if (this.Field13048.Method341() == Class1592.Field15448) {
                floor += 1.0 - Class721.Method3019();
                floor2 += 1.0 - Class721.Method3019();
            }
            else if (this.Field13048.Method341() == Class1592.Field15449) {
                floor += Class721.Method3019();
                floor2 += Class721.Method3019();
            }
            else if (this.Field13048.Method341() == Class1592.Field15450) {
                floor += 1.0 - Class721.Method3019();
                floor2 += Class721.Method3019();
            }
            else if (this.Field13048.Method341() == Class1592.Field15451) {
                floor += Class721.Method3019();
                floor2 += 1.0 - Class721.Method3019();
            }
            if ((long)n != n || Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(floor, n, floor2).down()).getMaterial().isReplaceable()) {}
            Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            final NetHandlerPlayClient connection = Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection;
            final double n2 = floor;
            final double n3 = n;
            final double n4 = floor2;
            if (this.Field13062.Method365()) {}
            connection.sendPacket((Packet)new CPacketPlayer$Position(n2, n3, n4, true));
            this.Field13070 = (this.Field13049.Method365() ? Class1390.Field14300 : Class1390.Field14302);
        }
        else if (this.Field13070 == Class1390.Field14300) {
            final BlockPos offset = this.Field13069.offset(((Class1592)this.Field13048.Method341()).Method6249());
            final BlockPos offset2 = this.Field13069.offset(((Class1592)this.Field13048.Method341()).Method6250());
            final BlockPos up = offset.up();
            final BlockPos up2 = offset2.up();
            this.Field13072.clear();
            this.Field13072.add(offset);
            this.Field13072.add(offset2);
            this.Field13072.add(up);
            this.Field13072.add(up2);
            this.Field13073.clear();
            this.Field13074.Method2801();
            this.Field13070 = Class1390.Field14301;
        }
        else if (this.Field13070 == Class1390.Field14301) {
            final int method4569 = this.Method4569();
            if (!this.Field13074.Method2797((long)this.Field13050.Method335())) {
                return;
            }
            this.Field13074.Method2801();
            for (final BlockPos blockPos : this.Field13072) {
                if (this.Field13073.contains(blockPos)) {
                    continue;
                }
                this.Method4574(blockPos, method4569);
                this.Field13073.add(blockPos);
                return;
            }
            this.Field13070 = Class1390.Field14302;
        }
        else if (this.Field13070 == Class1390.Field14302) {
            if (!null.Method35()) {
                null.Method36();
                ++this.Field13071;
                if (this.Field13071 == this.Field13047.Method335()) {
                    this.Field13070 = Class1390.Field14303;
                }
            }
        }
        else if (this.Field13070 == Class1390.Field14303) {
            this.Method4576();
            this.Field13070 = Class1390.Field14299;
        }
    }
    
    @Override
    public void Method45() {
        if (Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field13045.Method341() == Class1212.Field13495) {
            this.Method4576();
        }
        else {
            this.Method4577();
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method4578(final PlayerSPPushOutOfBlocksEvent playerSPPushOutOfBlocksEvent) {
        if (this.Field13059.Method365()) {
            playerSPPushOutOfBlocksEvent.setCanceled(true);
        }
    }
    
    private boolean Method4579(final EntityPlayer entityPlayer) {
        return Class1124.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) <= this.Field13061.Method367();
    }
    
    private Boolean Method4580() {
        return this.Field13045.Method341() == Class1212.Field13495;
    }
    
    private Boolean Method4581() {
        return this.Field13045.Method341() != Class1212.Field13495;
    }
    
    private Boolean Method4582() {
        return this.Field13045.Method341() != Class1212.Field13495;
    }
    
    private Boolean Method4583() {
        return this.Field13045.Method341() != Class1212.Field13495;
    }
    
    private Boolean Method4584() {
        return this.Field13045.Method341() != Class1212.Field13495;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x42CC ^ 0x41));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
