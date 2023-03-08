//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import com.kisman.cc.util.*;
import net.minecraft.network.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.*;
import net.minecraft.network.play.client.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import com.mojang.authlib.*;
import net.minecraft.client.entity.*;
import net.minecraft.potion.*;
import net.minecraft.client.multiplayer.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import java.util.function.*;
import net.minecraft.network.play.server.*;
import java.util.*;

@Class99
public class Class1308 extends Class42
{
    private final Class1303 Field13973;
    private final Class44 Field13974;
    private final Class1303 Field13975;
    private final Class44 Field13976;
    private final Class44 Field13977;
    private final Class44 Field13978;
    private final Class44 Field13979;
    private final Class44 Field13980;
    private final Class44 Field13981;
    private final Class44 Field13982;
    private final Class44 Field13983;
    private final Class1303 Field13984;
    private final Class1303 Field13985;
    private final Class1303 Field13986;
    private final Class44 Field13987;
    private final Class44 Field13988;
    private final Class44 Field13989;
    private final Class44 Field13990;
    private final Class44 Field13991;
    private final Class44 Field13992;
    private final Class44 Field13993;
    private final Class44 Field13994;
    private final Class44 Field13995;
    private final Class44 Field13996;
    private final Class44 Field13997;
    private final Class44 Field13998;
    private final Class44 Field13999;
    private final Class44 Field14000;
    private final Class44 Field14001;
    private final Class1303 Field14002;
    private final Class44 Field14003;
    private final Class44 Field14004;
    private final Class44 Field14005;
    private final Class44 Field14006;
    private final Class44 Field14007;
    private final Class44 Field14008;
    private final Class44 Field14009;
    private final Class44 Field14010;
    private final Class44 Field14011;
    private final Class44 Field14012;
    private final Class1612 Field14013;
    @Class873
    public static Class1308 Field14014;
    private Thread Field14015;
    private final Class650 Field14016;
    private final Class650 Field14017;
    private final Class650 Field14018;
    @Class1274
    public EntityPlayer Field14019;
    private final List Field14020;
    private final Map Field14021;
    private BlockPos Field14022;
    @Class1801
    private final Class618 Field14023;
    private int Field14024;
    
    public Class1308() {
        super("Kys+", Class97.Field8338, true);
        this.Field13973 = new Class1303("Safety", (Class42)this, (Enum)Class807.Field11442).Method5303();
        this.Field13974 = this.Method23(new Class44("SafetyBalance", this, Double.longBitsToDouble(4611686018427387904L), 0.0, Double.longBitsToDouble(4621819117588971520L), false));
        this.Field13975 = new Class1303("TargetMode", (Class42)this, (Enum)Class310.Field9318).Method5303();
        this.Field13976 = this.Method23(new Class44("TargetRange", this, Double.longBitsToDouble((long)497238144 ^ 0x402800001DA34080L), 1.0, Double.longBitsToDouble((long)1971954024 ^ 0x403000007589A168L), false));
        this.Field13977 = this.Method23(new Class44("PopFocus", this, false));
        this.Field13978 = this.Method23(new Class44("PopFocusTimeOut", this, Double.longBitsToDouble(4629137466983448576L), 0.0, Double.longBitsToDouble(4638144666238189568L), true));
        this.Field13979 = this.Method23(new Class44("Predict", this, false));
        this.Field13980 = this.Method23(new Class44("PredictTicks", this, Double.longBitsToDouble((long)340109512 ^ 0x400000001445A8C8L), 0.0, Double.longBitsToDouble((long)1315049511 ^ 0x403400004E621027L), true));
        this.Field13981 = this.Method23(new Class44("Rotate", this, false));
        this.Field13982 = this.Method23(new Class44("YawStep", this, Double.longBitsToDouble(4632937379169042432L), 1.0, Double.longBitsToDouble((long)212867646 ^ 0x406680000CB01A3EL), true));
        this.Field13983 = this.Method23(new Class44("Swing", this, true));
        this.Field13984 = new Class1303("SwingingHand", (Class42)this, (Enum)Class1587.Field15419).Method5303();
        this.Field13985 = new Class1303("Timings", (Class42)this, (Enum)Class2077.Field17498).Method5303();
        this.Field13986 = new Class1303("Logic", (Class42)this, (Enum)Class1852.Field16533).Method5303();
        this.Field13987 = this.Method23(new Class44("PlaceSpeed", this, Double.longBitsToDouble(4626322717216342016L), 0.0, Double.longBitsToDouble(4626322717216342016L), false));
        this.Field13988 = this.Method23(new Class44("PacketPlace", this, true));
        this.Field13989 = this.Method23(new Class44("Raytrace", this, false));
        this.Field13990 = this.Method23(new Class44("StrictFacing", this, false));
        this.Field13991 = this.Method23(new Class44("AntiStuck", this, false));
        this.Field13992 = this.Method23(new Class44("NoPlaceSuicide", this, true));
        this.Field13993 = this.Method23(new Class44("BreakSpeed", this, Double.longBitsToDouble(4625872357253604966L), 0.0, Double.longBitsToDouble((long)853595302 ^ 0x4034000032E0D4A6L), false));
        this.Field13994 = this.Method23(new Class44("Inhibit", this, false));
        this.Field13995 = this.Method23(new Class44("InhibitTimeOut", this, Double.longBitsToDouble(4629137466983448576L), 1.0, Double.longBitsToDouble((long)331737499 ^ 0x404E000013C5E99BL), true));
        this.Field13996 = this.Method23(new Class44("PacketBreak", this, true));
        this.Field13997 = this.Method23(new Class44("BreakRaytrace", this, true));
        this.Field13998 = this.Method23(new Class44("NoBreakSuicide", this, true));
        this.Field13999 = this.Method23(new Class44("Instant", this, false));
        this.Field14000 = this.Method23(new Class44("InstantPacket", this, true));
        this.Field14001 = this.Method23(new Class44("InstantSync", this, false));
        this.Field14002 = new Class1303("Sync", (Class42)this, (Enum)Class727.Field11090).Method5303();
        this.Field14003 = this.Method23(new Class44("PlaceRange", this, Double.longBitsToDouble((long)1410434638 ^ 0x401400005411864EL), 0.0, Double.longBitsToDouble(4618441417868443648L), false));
        this.Field14004 = this.Method23(new Class44("PlaceWallRange", this, Double.longBitsToDouble((long)1021976508 ^ 0x400800003CEA1FBCL), 0.0, Double.longBitsToDouble(4618441417868443648L), false));
        this.Field14005 = this.Method23(new Class44("BreakRange", this, Double.longBitsToDouble((long)806154494 ^ 0x40140000300CF0FEL), 0.0, Double.longBitsToDouble(4618441417868443648L), false));
        this.Field14006 = this.Method23(new Class44("BreakWallRange", this, Double.longBitsToDouble(4613937818241073152L), 0.0, Double.longBitsToDouble(4618441417868443648L), false));
        this.Field14007 = this.Method23(new Class44("FirePlace", this, false));
        this.Field14008 = this.Method23(new Class44("Terrain", this, false));
        this.Field14009 = this.Method23(new Class44("MinPlaceDamage", this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble(4630263366890291200L), false));
        this.Field14010 = this.Method23(new Class44("MaxSelfPlace", this, Double.longBitsToDouble((long)1350222190 ^ 0x40200000507AC16EL), 0.0, Double.longBitsToDouble(4630263366890291200L), false));
        this.Field14011 = this.Method23(new Class44("MinBreakDamage", this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble((long)1860335545 ^ 0x404200006EE277B9L), false));
        this.Field14012 = this.Method23(new Class44("MaxSelfBreak", this, Double.longBitsToDouble((long)1499678005 ^ 0x4020000059634535L), 0.0, Double.longBitsToDouble((long)202010014 ^ 0x404200000C0A6D9EL), false));
        this.Field14013 = new Class1612(this).Method3788().Method3789();
        this.Field14015 = null;
        this.Field14016 = new Class650();
        this.Field14017 = new Class650();
        this.Field14018 = new Class650();
        this.Field14019 = null;
        this.Field14020 = new Vector();
        this.Field14021 = new ConcurrentHashMap();
        this.Field14022 = null;
        this.Field14023 = new Class618(this::Method5335, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method21(false);
            return;
        }
        this.Field14016.Method2801();
        this.Field14017.Method2801();
        this.Field14018.Method2801();
        this.Method5319();
        this.Method5308();
        Class1796.Field16242.Method705(this);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710(this);
        this.Field14015.interrupt();
        this.Field14015 = null;
        this.Field14016.Method2801();
        this.Field14017.Method2801();
        this.Field14018.Method2801();
        this.Field14019 = null;
        this.Field14021.clear();
        this.Field14022 = null;
    }
    
    @Override
    public void Method45() {
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method21(false);
            return;
        }
        Class298.Method1560(this::Method5338);
    }
    
    private void Method5308() {
        (this.Field14015 = new Thread(this::Method5337)).start();
    }
    
    private void Method5309(final Class1852 class1852, final boolean b) throws InterruptedException {
        if (class1852 == Class1852.Field16532) {
            if (this.Field13985.Method341() == Class2077.Field17499) {
                if (!b) {
                    Class298.Method1561(Math.round(Double.longBitsToDouble(4652007308841189376L) - Double.longBitsToDouble((long)397524082 ^ 0x4049000017B1BC72L) * this.Field13987.Method367()));
                }
                this.Method5311(false);
                Class298.Method1561(Math.round(Double.longBitsToDouble((long)1048896347 ^ 0x408F40003E84E35BL) - Double.longBitsToDouble((long)1962826449 ^ 0x4049000074FE5AD1L) * this.Field13993.Method367()));
                this.Method5310(false);
                return;
            }
            this.Method5311(true);
            this.Method5310(true);
        }
        else {
            if (this.Field13985.Method341() == Class2077.Field17499) {
                if (!b) {
                    Class298.Method1561(Math.round(Double.longBitsToDouble((long)1974387358 ^ 0x408F400075AEC29EL) - Double.longBitsToDouble((long)1894271406 ^ 0x4049000070E849AEL) * this.Field13993.Method367()));
                }
                this.Method5310(false);
                Class298.Method1561(Math.round(Double.longBitsToDouble((long)1141696444 ^ 0x408F4000440CE7BCL) - Double.longBitsToDouble((long)1351288872 ^ 0x40490000508B0828L) * this.Field13987.Method367()));
                this.Method5311(false);
                return;
            }
            this.Method5310(true);
            this.Method5311(true);
        }
    }
    
    private void Method5310(final boolean b) {
        if (b && !this.Field14017.Method2797(Math.round(Double.longBitsToDouble((long)419740390 ^ 0x408F40001904BAE6L) - Double.longBitsToDouble((long)1315442283 ^ 0x404900004E680E6BL) * this.Field13993.Method367()))) {
            return;
        }
        final Class999 method5320 = this.Method5320();
        if (method5320 == null) {
            return;
        }
        this.Method5314(method5320.Method4036());
        this.Field14021.put(method5320.Method4036(), System.currentTimeMillis());
        if (this.Field14002.Method341() == Class727.Field11089) {
            this.Method5318(method5320.Method4036());
        }
        if (b) {
            this.Field14017.Method2801();
        }
    }
    
    private void Method5311(final boolean b) {
        if (b && !this.Field14016.Method2797(Math.round(Double.longBitsToDouble(4652007308841189376L) - Double.longBitsToDouble(4632233691727265792L) * this.Field13987.Method367()))) {
            return;
        }
        final Class1651 method5321 = this.Method5321();
        if (method5321 == null) {
            this.Field14022 = null;
            return;
        }
        this.Field14022 = method5321.Method6401();
        this.Method5312(method5321.Method6401());
        this.Field14020.add(method5321);
        if (b) {
            this.Field14016.Method2801();
        }
    }
    
    private void Method5312(final BlockPos blockPos) {
        final RayTraceResult rayTraceBlocks = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(Class1036.Method4206(), new Vec3d(blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos.getY() + Double.longBitsToDouble(4602678819172646912L), blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L)));
        final EnumFacing enumFacing = (rayTraceBlocks == null) ? (this.Field13990.Method365() ? EnumFacing.UP : EnumFacing.DOWN) : (this.Field13989.Method365() ? rayTraceBlocks.sideHit : (this.Field13990.Method365() ? EnumFacing.UP : EnumFacing.DOWN));
        final float[] array = { Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch };
        final float[] method4300 = Class1055.Method4300(blockPos);
        if (this.Field13981.Method365()) {
            this.Method5316(method4300, array);
        }
        if (this.Field13988.Method365()) {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, this.Method5313(), 0.0f, 0.0f, 0.0f));
        }
        else {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos, enumFacing, new Vec3d(0.0, 0.0, 0.0), this.Method5313());
        }
        if (this.Field13981.Method365()) {
            this.Method5316(array, method4300);
        }
    }
    
    public EnumHand Method5313() {
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL) {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
            return EnumHand.MAIN_HAND;
        }
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL) {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
            return EnumHand.OFF_HAND;
        }
        return null;
    }
    
    private void Method5314(final EntityEnderCrystal entityEnderCrystal) {
        final float[] array = { Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch };
        final float[] method4299 = Class1055.Method4299((Entity)entityEnderCrystal);
        if (this.Field13981.Method365()) {
            this.Method5316(method4299, array);
        }
        if (this.Field13996.Method365()) {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)entityEnderCrystal));
        }
        else {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.attackEntity((EntityPlayer)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (Entity)entityEnderCrystal);
        }
        this.Method5315();
        if (this.Field13981.Method365()) {
            this.Method5316(array, method4299);
        }
    }
    
    private void Method5315() {
        int n;
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.HASTE)) {
            n = 6 - (1 + Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActivePotionEffect(MobEffects.HASTE).getAmplifier());
        }
        else {
            n = (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.MINING_FATIGUE) ? (6 + (1 + Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActivePotionEffect(MobEffects.MINING_FATIGUE).getAmplifier()) * 2) : 6);
        }
        if (this.Field13983.Method365() && (!Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSwingInProgress || Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgressInt >= n / 2 || Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgressInt < 0)) {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgressInt = -1;
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSwingInProgress = true;
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingingHand = ((Class1587)this.Field13984.Method341()).Method6229();
            if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.world instanceof WorldServer) {
                ((WorldServer)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.world).getEntityTracker().sendToTracking((Entity)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (Packet)new SPacketAnimation((Entity)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (((Class1587)this.Field13984.Method341()).Method6229() == EnumHand.OFF_HAND) ? 3 : 0));
            }
        }
        Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketAnimation(((Class1587)this.Field13984.Method341()).Method6229()));
    }
    
    private void Method5316(final float[] array, final float[] array2) {
        if (this.Field13982.Method335() >= 360) {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(array[0], array[1], Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedYaw = array[0];
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedPitch = array[1];
            return;
        }
        final float wrapDegrees = MathHelper.wrapDegrees(array2[0] - array[0]);
        final float wrapDegrees2 = MathHelper.wrapDegrees(array[0] - array2[0]);
        if (wrapDegrees < wrapDegrees2) {
            final float n = Math.abs(wrapDegrees) / this.Field13982.Method368();
            float n2 = 0.0f;
            for (int n3 = 0; n2 >= Math.abs(wrapDegrees); n2 += n, ++n3) {
                Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(array[0] - n3 * n, array[1], Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            }
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedYaw = array[0];
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedPitch = array[1];
            return;
        }
        final float n4 = Math.abs(wrapDegrees2) / this.Field13982.Method368();
        float n5 = 0.0f;
        for (int n6 = 0; n5 >= Math.abs(wrapDegrees2); n5 += n4, ++n6) {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(array[0] + n6 * n4, array[1], Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        }
        Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedYaw = array[0];
        Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedPitch = array[1];
    }
    
    private void Method5317(final int entityId) {
        final Entity getEntityByID = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(entityId);
        if (getEntityByID instanceof EntityEnderCrystal) {
            this.Field14021.put(getEntityByID, System.currentTimeMillis());
        }
        if (this.Field14000.Method365() || !(getEntityByID instanceof EntityEnderCrystal)) {
            final CPacketUseEntity cPacketUseEntity = new CPacketUseEntity();
            cPacketUseEntity.entityId = entityId;
            cPacketUseEntity.action = CPacketUseEntity$Action.ATTACK;
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)cPacketUseEntity);
            this.Method5315();
            return;
        }
        this.Method5314((EntityEnderCrystal)getEntityByID);
        if (this.Field14001.Method365()) {
            this.Method5318((EntityEnderCrystal)getEntityByID);
        }
    }
    
    private void Method5318(final EntityEnderCrystal entityEnderCrystal) {
        entityEnderCrystal.setDead();
        Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(Class1308::Method5334);
    }
    
    private void Method5319() {
        this.Field14019 = this.Method5323();
        if (this.Field13979.Method365()) {
            this.Field14019 = Method5329(this.Field14019, this.Field13980.Method335());
        }
    }
    
    private Class999 Method5320() {
        if (this.Field14019 == null) {
            return null;
        }
        Class999 method4039 = new Class999(null, Double.longBitsToDouble((long)1307899945 ^ 0xBFF000004DF4F829L), Double.longBitsToDouble((long)1910717184 ^ 0xBFF0000071E33B00L));
        for (final Entity entity : Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            if (!(entity instanceof EntityEnderCrystal)) {
                continue;
            }
            final EntityEnderCrystal entityEnderCrystal = (EntityEnderCrystal)entity;
            if (!this.Method5328((Entity)entityEnderCrystal, this.Field14005.Method367(), this.Field14006.Method367())) {
                continue;
            }
            if (this.Field13997.Method365() && !Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.canEntityBeSeen((Entity)entityEnderCrystal)) {
                continue;
            }
            if (this.Field13994.Method365() && this.Field14021.containsKey(entityEnderCrystal)) {
                continue;
            }
            final double n = Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ, (Entity)this.Field14019, this.Field14008.Method365());
            final double n2 = Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ, (Entity)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14008.Method365());
            if (this.Field13998.Method365() && n2 >= Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) {
                continue;
            }
            final double method4040 = this.Method5322(n, n2);
            if (method4040 < this.Field14011.Method367()) {
                continue;
            }
            if (n2 > this.Field14012.Method367()) {
                continue;
            }
            method4039 = method4039.Method4039(new Class999(entityEnderCrystal, method4040, n2));
        }
        return (method4039.Method4037() < 0.0) ? null : method4039;
    }
    
    private Class1651 Method5321() {
        Class1651 method6404 = new Class1651(BlockPos.ORIGIN, Double.longBitsToDouble((long)308410921 ^ 0xBFF000001261FA29L), Double.longBitsToDouble(-4616189618054758400L));
        for (final BlockPos blockPos : Class2155.Method7758(this.Field14003.Method368(), true, false)) {
            if (this.Method5327(blockPos, this.Field14003.Method367(), this.Field14004.Method367())) {
                if (!Class2155.Method7755(blockPos, true, true, false, this.Field14007.Method365())) {
                    continue;
                }
                if (this.Field13989.Method365() && !Class394.Method1917(blockPos)) {
                    continue;
                }
                final double n = Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos.getX() + Double.longBitsToDouble((long)2114228470 ^ 0x3FE000007E0490F6L), blockPos.getY() + 1, blockPos.getZ() + Double.longBitsToDouble((long)240512014 ^ 0x3FE000000E55EC0EL), (Entity)this.Field14019, this.Field14008.Method365());
                final double n2 = Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos.getX() + Double.longBitsToDouble((long)766968331 ^ 0x3FE000002DB7020BL), blockPos.getY() + 1, blockPos.getZ() + Double.longBitsToDouble((long)2022764637 ^ 0x3FE000007890F05DL), (Entity)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14008.Method365());
                if (this.Field13991.Method365() && !Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)EntityEnderCrystal.class, new AxisAlignedBB((double)(blockPos.getX() - 1), blockPos.getY() - Double.longBitsToDouble(4602678819172646912L), (double)(blockPos.getZ() - 1), (double)(blockPos.getX() + 2), (double)(blockPos.getY() + 1), (double)(blockPos.getZ() + 2))).isEmpty()) {
                    continue;
                }
                if (this.Field13992.Method365() && n2 >= Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() - Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) {
                    continue;
                }
                final double method6405 = this.Method5322(n, n2);
                if (method6405 < this.Field14009.Method367()) {
                    continue;
                }
                if (n2 > this.Field14010.Method367()) {
                    continue;
                }
                method6404 = method6404.Method6404(new Class1651(blockPos, method6405, n2));
            }
        }
        return (Class1651.Method6405(method6404) < 0.0) ? null : method6404;
    }
    
    private double Method5322(final double n, final double n2) {
        switch (Class1156.Field13218[((Class807)this.Field13973.Method341()).ordinal()]) {
            case 1: {
                return n;
            }
            case 2: {
                return n - n2;
            }
            case 3: {
                return n + this.Field13974.Method367() * Double.longBitsToDouble((long)157535746 ^ 0x3FE000000963CE02L) - (n2 + this.Field13974.Method367());
            }
            default: {
                return n;
            }
        }
    }
    
    private EntityPlayer Method5323() {
        EntityPlayer entityPlayer = null;
        final double longBitsToDouble = Double.longBitsToDouble(4630263366890291200L);
        double longBitsToDouble2 = Double.longBitsToDouble((long)1487056093 ^ 0x3FE0000058A2ACDDL);
        double n = this.Field13976.Method367() + 1.0;
        for (final EntityPlayer entityPlayer2 : Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities) {
            if (this.Method5325(entityPlayer2, this.Field13976.Method367())) {
                continue;
            }
            final double n2 = entityPlayer2.getHealth() + entityPlayer2.getAbsorptionAmount();
            final double n3 = this.Method5326(entityPlayer2);
            final double n4 = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer2);
            if (this.Field13975.Method341() == Class310.Field9318 && n4 < n) {
                entityPlayer = entityPlayer2;
                n = n4;
            }
            else if (this.Field13975.Method341() == Class310.Field9319 && n2 < longBitsToDouble) {
                entityPlayer = entityPlayer2;
                n = n2;
            }
            else {
                if (this.Field13975.Method341() != Class310.Field9320 || n3 <= longBitsToDouble2) {
                    continue;
                }
                entityPlayer = entityPlayer2;
                longBitsToDouble2 = n3;
            }
        }
        return entityPlayer;
    }
    
    private AxisAlignedBB Method5324(final double n) {
        return new AxisAlignedBB(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - n, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - n, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - n, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + n, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + n);
    }
    
    private boolean Method5325(final EntityPlayer entityPlayer, final double n) {
        return Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) > n || entityPlayer.equals((Object)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) || entityPlayer.getHealth() <= 0.0f || entityPlayer.isDead || Class726.Field11086.Method3043(entityPlayer.getName());
    }
    
    private float Method5326(final EntityPlayer entityPlayer) {
        float a = Float.intBitsToFloat(1056964608);
        for (final BlockPos blockPos : Class2155.Method7758(this.Field14003.Method368(), true, false)) {
            if (this.Method5327(blockPos, this.Field14003.Method367(), this.Field14004.Method367()) && Class2155.Method7755(blockPos, true, true, false, this.Field14007.Method365())) {
                a = Math.max(a, Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos.getY() + 1, blockPos.getZ() + Double.longBitsToDouble((long)629478382 ^ 0x3FE00000258513EEL), (Entity)entityPlayer, this.Field14008.Method365()));
            }
        }
        return a;
    }
    
    private boolean Method5327(final BlockPos blockPos, final double n, final double n2) {
        return Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos.getY() + Double.longBitsToDouble((long)1420108837 ^ 0x3FE0000054A52425L), blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L)) <= (Class394.Method1917(blockPos) ? n : n2);
    }
    
    private boolean Method5328(final Entity entity, final double n, final double n2) {
        return Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity) <= (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.canEntityBeSeen(entity) ? n : n2);
    }
    
    private static EntityPlayer Method5329(final EntityPlayer entityPlayer, final int n) {
        final AxisAlignedBB getEntityBoundingBox = entityPlayer.getEntityBoundingBox();
        double posX = entityPlayer.posX;
        double posY = entityPlayer.posY;
        double posZ = entityPlayer.posZ;
        double motionX = entityPlayer.motionX;
        double motionY = entityPlayer.motionY;
        double motionZ = entityPlayer.motionZ;
        for (int i = 0; i < n; ++i) {
            posX += motionX;
            posZ += motionZ;
            posY += motionY;
            getEntityBoundingBox.offset(motionX, motionY, motionZ);
            if (Method5331(getEntityBoundingBox, new Vec3d(posX, posY, posZ), motionX, motionY, motionZ)) {
                posX -= motionX;
                posY -= motionY;
                posZ -= motionZ;
                getEntityBoundingBox.offset(-motionX, -motionY, -motionZ);
            }
            else if (Method5330(getEntityBoundingBox, new Vec3d(posX, posY, posZ), motionX, motionY, motionZ)) {
                posX -= motionX;
                posY -= motionY;
                posZ -= motionZ;
                getEntityBoundingBox.offset(-motionX, -motionY, -motionZ);
            }
            else {
                motionX += Double.longBitsToDouble((long)1483607087 ^ 0x3FE99999C1F795B5L);
                motionZ += Double.longBitsToDouble((long)1067008454 ^ 0x3FE99999A600D85CL);
                motionY *= ((motionY < 0.0) ? Double.longBitsToDouble((long)1835445181 ^ 0x3FF266660B00CDDBL) : Double.longBitsToDouble(4604480259023595110L));
            }
        }
        final EntityOtherPlayerMP entityOtherPlayerMP = new EntityOtherPlayerMP((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new GameProfile(entityPlayer.getUniqueID(), entityPlayer.getName()));
        entityOtherPlayerMP.setPosition(posX, posY, posZ);
        entityOtherPlayerMP.inventory.copyInventory(entityPlayer.inventory);
        entityOtherPlayerMP.setHealth(entityPlayer.getHealth());
        entityOtherPlayerMP.prevPosX = entityPlayer.prevPosX;
        entityOtherPlayerMP.prevPosY = entityPlayer.prevPosY;
        entityOtherPlayerMP.prevPosZ = entityPlayer.prevPosZ;
        final Iterator<PotionEffect> iterator = (Iterator<PotionEffect>)entityPlayer.getActivePotionEffects().iterator();
        while (iterator.hasNext()) {
            entityOtherPlayerMP.addPotionEffect((PotionEffect)iterator.next());
        }
        return (EntityPlayer)entityOtherPlayerMP;
    }
    
    private static boolean Method5330(final AxisAlignedBB axisAlignedBB, final Vec3d vec3d, final double n, final double n2, final double n3) {
        return (Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), vec3d) | Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vec3d) | Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), vec3d) | Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vec3d)) & n2 * n2 > n * n + n3 * n3;
    }
    
    private static boolean Method5331(final AxisAlignedBB axisAlignedBB, final Vec3d vec3d, final double n, final double n2, final double n3) {
        return (Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ), vec3d) | Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ), vec3d) | Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ), vec3d) | Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ), vec3d) | Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), vec3d) | Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vec3d) | Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), vec3d) | Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vec3d)) & n * n + n3 * n3 > n2 * n2;
    }
    
    private static boolean Method5332(final WorldClient worldClient, final Vec3d vec3d, final Vec3d vec3d2) {
        final RayTraceResult rayTraceBlocks = worldClient.rayTraceBlocks(vec3d, vec3d2, false, true, false);
        return rayTraceBlocks == null || worldClient.getBlockState(rayTraceBlocks.getBlockPos()).getBlock() != Blocks.AIR;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method5333(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (this.Field14022 == null) {
            return;
        }
        this.Field14013.Method3805(this.Field14022);
    }
    
    private static void Method5334(final EntityEnderCrystal entityEnderCrystal) {
        Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntity((Entity)entityEnderCrystal);
        Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityDangerously((Entity)entityEnderCrystal);
    }
    
    private void Method5335(final Class544 class544) {
        if (class544.Method982() instanceof SPacketSoundEffect) {
            final SPacketSoundEffect sPacketSoundEffect = (SPacketSoundEffect)class544.Method982();
            if (sPacketSoundEffect.getCategory() == SoundCategory.BLOCKS && sPacketSoundEffect.getSound() == SoundEvents.ENTITY_GENERIC_EXPLODE) {
                final HashSet<EntityEnderCrystal> set = new HashSet<EntityEnderCrystal>();
                this.Field14021.forEach(this::Method5336);
                final Iterator<Object> iterator = set.iterator();
                while (iterator.hasNext()) {
                    this.Field14021.remove(iterator.next());
                }
            }
        }
        if (class544.Method982() instanceof SPacketExplosion) {
            final SPacketExplosion sPacketExplosion = (SPacketExplosion)class544.Method982();
            for (final EntityEnderCrystal entityEnderCrystal : Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)EntityEnderCrystal.class, new AxisAlignedBB(new BlockPos(sPacketExplosion.getX(), sPacketExplosion.getY(), sPacketExplosion.getZ())))) {
                this.Field14021.remove(entityEnderCrystal);
                if (this.Field14002.Method341() == Class727.Field11090) {
                    this.Method5318(entityEnderCrystal);
                }
            }
        }
        if (class544.Method982() instanceof SPacketDestroyEntities) {
            final int[] getEntityIDs = ((SPacketDestroyEntities)class544.Method982()).getEntityIDs();
            for (int length = getEntityIDs.length, i = 0; i < length; ++i) {
                final Entity getEntityByID = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(getEntityIDs[i]);
                if (!(getEntityByID instanceof EntityEnderCrystal)) {
                    return;
                }
                final EntityEnderCrystal entityEnderCrystal2 = (EntityEnderCrystal)getEntityByID;
                this.Field14021.remove(entityEnderCrystal2);
                if (this.Field14002.Method341() == Class727.Field11090) {
                    this.Method5318(entityEnderCrystal2);
                }
            }
        }
        if (class544.Method982() instanceof SPacketEntityStatus) {
            final SPacketEntityStatus sPacketEntityStatus = (SPacketEntityStatus)class544.Method982();
            if (sPacketEntityStatus.getOpCode() == 35 && sPacketEntityStatus.getEntity((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world) instanceof EntityPlayer && this.Field13977.Method365() && Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(sPacketEntityStatus.getEntity((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world)) <= this.Field13976.Method367()) {
                this.Field14019 = (EntityPlayer)sPacketEntityStatus.getEntity((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
                this.Field14018.Method2801();
            }
        }
        if (class544.Method982() instanceof SPacketSpawnObject && this.Field13999.Method365()) {
            final SPacketSpawnObject sPacketSpawnObject = (SPacketSpawnObject)class544.Method982();
            if (sPacketSpawnObject.getType() != 51) {
                return;
            }
            if (!this.Method5327(new BlockPos(sPacketSpawnObject.getX(), sPacketSpawnObject.getY(), sPacketSpawnObject.getZ()), this.Field14005.Method367(), this.Field14006.Method367())) {
                return;
            }
            if (this.Field13997.Method365() && Class394.Method1917(new BlockPos(sPacketSpawnObject.getX(), sPacketSpawnObject.getY(), sPacketSpawnObject.getZ()))) {
                return;
            }
            final double n = Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, sPacketSpawnObject.getX(), sPacketSpawnObject.getY(), sPacketSpawnObject.getZ(), (Entity)this.Field14019, this.Field14008.Method365());
            final double n2 = Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, sPacketSpawnObject.getX(), sPacketSpawnObject.getY(), sPacketSpawnObject.getZ(), (Entity)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14008.Method365());
            if (this.Field13998.Method365() && n2 >= Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) {
                return;
            }
            if (this.Method5322(n, n2) < this.Field14011.Method367()) {
                return;
            }
            if (n2 > this.Field14012.Method367()) {
                return;
            }
            this.Method5317(sPacketSpawnObject.getEntityID());
        }
    }
    
    private void Method5336(final SPacketSoundEffect sPacketSoundEffect, final Set set, final EntityEnderCrystal entityEnderCrystal, final Long n) {
        if (entityEnderCrystal.getDistance(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ()) >= Double.longBitsToDouble(4618441417868443648L)) {
            return;
        }
        set.add(entityEnderCrystal);
        if (this.Field14002.Method341() == Class727.Field11090) {
            this.Method5318(entityEnderCrystal);
        }
    }
    
    private void Method5337(final AtomicBoolean atomicBoolean) {
        while (!Thread.currentThread().isInterrupted()) {
            if (this.Method5313() == null) {
                atomicBoolean.set(true);
            }
            else {
                this.Method5309((Class1852)this.Field13986.Method341(), atomicBoolean.get());
                atomicBoolean.set(false);
            }
        }
    }
    
    private void Method5338() {
        this.Field14021.forEach(this::Method5339);
        if (this.Field13977.Method365() && !this.Field14018.Method2797(this.Field13978.Method335() * 50L)) {
            return;
        }
        this.Method5319();
    }
    
    private void Method5339(final long n, final EntityEnderCrystal entityEnderCrystal, final Long n2) {
        if (System.currentTimeMillis() - n2 >= n) {
            this.Field14021.remove(entityEnderCrystal);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x43EC ^ 0x82));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
