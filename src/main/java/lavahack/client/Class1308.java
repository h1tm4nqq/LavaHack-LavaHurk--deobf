//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.init.MobEffects
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketUseEntity$Action
 *  net.minecraft.network.play.server.SPacketAnimation
 *  net.minecraft.network.play.server.SPacketDestroyEntities
 *  net.minecraft.network.play.server.SPacketEntityStatus
 *  net.minecraft.network.play.server.SPacketExplosion
 *  net.minecraft.network.play.server.SPacketSoundEffect
 *  net.minecraft.network.play.server.SPacketSpawnObject
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class1055;
import com.kisman.cc.util.Class650;
import com.mojang.authlib.GameProfile;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import lavahack.client.Class1036;
import lavahack.client.Class1156;
import lavahack.client.Class1274;
import lavahack.client.Class1303;
import lavahack.client.Class1587;
import lavahack.client.Class1612;
import lavahack.client.Class1651;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1852;
import lavahack.client.Class2077;
import lavahack.client.Class2155;
import lavahack.client.Class298;
import lavahack.client.Class310;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class726;
import lavahack.client.Class727;
import lavahack.client.Class807;
import lavahack.client.Class873;
import lavahack.client.Class97;
import lavahack.client.Class99;
import lavahack.client.Class999;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.server.SPacketAnimation;
import net.minecraft.network.play.server.SPacketDestroyEntities;
import net.minecraft.network.play.server.SPacketEntityStatus;
import net.minecraft.network.play.server.SPacketExplosion;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.network.play.server.SPacketSpawnObject;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Class99
public class Class1308
extends Class42 {
    private final Class1303 Field13973 = new Class1303("Safety", (Class42)this, Class807.Field11442).Method5303();
    private final Class44 Field13974 = this.Method23(new Class44("SafetyBalance", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 0.0, Double.longBitsToDouble(0x4024000000000000L), false));
    private final Class1303 Field13975 = new Class1303("TargetMode", (Class42)this, Class310.Field9318).Method5303();
    private final Class44 Field13976 = this.Method23(new Class44("TargetRange", (Class42)this, Double.longBitsToDouble((long)497238144 ^ 0x402800001DA34080L), 1.0, Double.longBitsToDouble((long)1971954024 ^ 0x403000007589A168L), false));
    private final Class44 Field13977 = this.Method23(new Class44("PopFocus", (Class42)this, false));
    private final Class44 Field13978 = this.Method23(new Class44("PopFocusTimeOut", (Class42)this, Double.longBitsToDouble(4629137466983448576L), 0.0, Double.longBitsToDouble(4638144666238189568L), true));
    private final Class44 Field13979 = this.Method23(new Class44("Predict", (Class42)this, false));
    private final Class44 Field13980 = this.Method23(new Class44("PredictTicks", (Class42)this, Double.longBitsToDouble((long)340109512 ^ 0x400000001445A8C8L), 0.0, Double.longBitsToDouble((long)1315049511 ^ 0x403400004E621027L), true));
    private final Class44 Field13981 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field13982 = this.Method23(new Class44("YawStep", (Class42)this, Double.longBitsToDouble(4632937379169042432L), 1.0, Double.longBitsToDouble((long)212867646 ^ 0x406680000CB01A3EL), true));
    private final Class44 Field13983 = this.Method23(new Class44("Swing", (Class42)this, true));
    private final Class1303 Field13984 = new Class1303("SwingingHand", (Class42)this, Class1587.Field15419).Method5303();
    private final Class1303 Field13985 = new Class1303("Timings", (Class42)this, Class2077.Field17498).Method5303();
    private final Class1303 Field13986 = new Class1303("Logic", (Class42)this, Class1852.Field16533).Method5303();
    private final Class44 Field13987 = this.Method23(new Class44("PlaceSpeed", (Class42)this, Double.longBitsToDouble(0x4034000000000000L), 0.0, Double.longBitsToDouble(0x4034000000000000L), false));
    private final Class44 Field13988 = this.Method23(new Class44("PacketPlace", (Class42)this, true));
    private final Class44 Field13989 = this.Method23(new Class44("Raytrace", (Class42)this, false));
    private final Class44 Field13990 = this.Method23(new Class44("StrictFacing", (Class42)this, false));
    private final Class44 Field13991 = this.Method23(new Class44("AntiStuck", (Class42)this, false));
    private final Class44 Field13992 = this.Method23(new Class44("NoPlaceSuicide", (Class42)this, true));
    private final Class44 Field13993 = this.Method23(new Class44("BreakSpeed", (Class42)this, Double.longBitsToDouble(4625872357253604966L), 0.0, Double.longBitsToDouble((long)853595302 ^ 0x4034000032E0D4A6L), false));
    private final Class44 Field13994 = this.Method23(new Class44("Inhibit", (Class42)this, false));
    private final Class44 Field13995 = this.Method23(new Class44("InhibitTimeOut", (Class42)this, Double.longBitsToDouble(4629137466983448576L), 1.0, Double.longBitsToDouble((long)331737499 ^ 0x404E000013C5E99BL), true));
    private final Class44 Field13996 = this.Method23(new Class44("PacketBreak", (Class42)this, true));
    private final Class44 Field13997 = this.Method23(new Class44("BreakRaytrace", (Class42)this, true));
    private final Class44 Field13998 = this.Method23(new Class44("NoBreakSuicide", (Class42)this, true));
    private final Class44 Field13999 = this.Method23(new Class44("Instant", (Class42)this, false));
    private final Class44 Field14000 = this.Method23(new Class44("InstantPacket", (Class42)this, true));
    private final Class44 Field14001 = this.Method23(new Class44("InstantSync", (Class42)this, false));
    private final Class1303 Field14002 = new Class1303("Sync", (Class42)this, Class727.Field11090).Method5303();
    private final Class44 Field14003 = this.Method23(new Class44("PlaceRange", (Class42)this, Double.longBitsToDouble((long)1410434638 ^ 0x401400005411864EL), 0.0, Double.longBitsToDouble(4618441417868443648L), false));
    private final Class44 Field14004 = this.Method23(new Class44("PlaceWallRange", (Class42)this, Double.longBitsToDouble((long)1021976508 ^ 0x400800003CEA1FBCL), 0.0, Double.longBitsToDouble(4618441417868443648L), false));
    private final Class44 Field14005 = this.Method23(new Class44("BreakRange", (Class42)this, Double.longBitsToDouble((long)806154494 ^ 0x40140000300CF0FEL), 0.0, Double.longBitsToDouble(4618441417868443648L), false));
    private final Class44 Field14006 = this.Method23(new Class44("BreakWallRange", (Class42)this, Double.longBitsToDouble(0x4008000000000000L), 0.0, Double.longBitsToDouble(4618441417868443648L), false));
    private final Class44 Field14007 = this.Method23(new Class44("FirePlace", (Class42)this, false));
    private final Class44 Field14008 = this.Method23(new Class44("Terrain", (Class42)this, false));
    private final Class44 Field14009 = this.Method23(new Class44("MinPlaceDamage", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble(0x4042000000000000L), false));
    private final Class44 Field14010 = this.Method23(new Class44("MaxSelfPlace", (Class42)this, Double.longBitsToDouble((long)1350222190 ^ 0x40200000507AC16EL), 0.0, Double.longBitsToDouble(0x4042000000000000L), false));
    private final Class44 Field14011 = this.Method23(new Class44("MinBreakDamage", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble((long)1860335545 ^ 0x404200006EE277B9L), false));
    private final Class44 Field14012 = this.Method23(new Class44("MaxSelfBreak", (Class42)this, Double.longBitsToDouble((long)1499678005 ^ 0x4020000059634535L), 0.0, Double.longBitsToDouble((long)202010014 ^ 0x404200000C0A6D9EL), false));
    private final Class1612 Field14013 = new Class1612(this).Method3788().Method3789();
    @Class873
    public static Class1308 Field14014;
    private Thread Field14015 = null;
    private final Class650 Field14016 = new Class650();
    private final Class650 Field14017 = new Class650();
    private final Class650 Field14018 = new Class650();
    @Class1274
    public EntityPlayer Field14019 = null;
    private final List Field14020 = new Vector();
    private final Map Field14021 = new ConcurrentHashMap();
    private BlockPos Field14022 = null;
    @Class1801
    private final Class618 Field14023 = new Class618(this::Method5335, new Predicate[0]);
    private int Field14024;

    public Class1308() {
        super("Kys+", Class97.Field8338, true);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field14016.Method2801();
            this.Field14017.Method2801();
            this.Field14018.Method2801();
            this.Method5319();
            this.Method5308();
            Class1796.Field16242.Method705(this);
            return;
        }
        this.Method21(false);
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
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            Class298.Method1560(this::Method5338);
            return;
        }
        this.Method21(false);
    }

    private void Method5308() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.Field14015 = new Thread(() -> this.Method5337(atomicBoolean));
        this.Field14015.start();
    }

    private void Method5309(Class1852 class1852, boolean bl) throws InterruptedException {
        if (class1852 == Class1852.Field16532) {
            if (this.Field13985.Method341() != Class2077.Field17499) {
                this.Method5311(true);
                this.Method5310(true);
                return;
            }
            if (!bl) {
                Class298.Method1561(Math.round(Double.longBitsToDouble(4652007308841189376L) - Double.longBitsToDouble((long)397524082 ^ 0x4049000017B1BC72L) * this.Field13987.Method367()));
            }
            this.Method5311(false);
            Class298.Method1561(Math.round(Double.longBitsToDouble((long)1048896347 ^ 0x408F40003E84E35BL) - Double.longBitsToDouble((long)1962826449 ^ 0x4049000074FE5AD1L) * this.Field13993.Method367()));
            this.Method5310(false);
            return;
        }
        if (this.Field13985.Method341() != Class2077.Field17499) {
            this.Method5310(true);
            this.Method5311(true);
            return;
        }
        if (!bl) {
            Class298.Method1561(Math.round(Double.longBitsToDouble((long)1974387358 ^ 0x408F400075AEC29EL) - Double.longBitsToDouble((long)1894271406 ^ 0x4049000070E849AEL) * this.Field13993.Method367()));
        }
        this.Method5310(false);
        Class298.Method1561(Math.round(Double.longBitsToDouble((long)1141696444 ^ 0x408F4000440CE7BCL) - Double.longBitsToDouble((long)1351288872 ^ 0x40490000508B0828L) * this.Field13987.Method367()));
        this.Method5311(false);
    }

    private void Method5310(boolean bl) {
        if (bl && !this.Field14017.Method2797(Math.round(Double.longBitsToDouble((long)419740390 ^ 0x408F40001904BAE6L) - Double.longBitsToDouble((long)1315442283 ^ 0x404900004E680E6BL) * this.Field13993.Method367()))) {
            return;
        }
        Class999 class999 = this.Method5320();
        if (class999 == null) {
            return;
        }
        this.Method5314(class999.Method4036());
        this.Field14021.put(class999.Method4036(), System.currentTimeMillis());
        if (this.Field14002.Method341() == Class727.Field11089) {
            this.Method5318(class999.Method4036());
        }
        if (!bl) return;
        this.Field14017.Method2801();
    }

    private void Method5311(boolean bl) {
        if (bl && !this.Field14016.Method2797(Math.round(Double.longBitsToDouble(4652007308841189376L) - Double.longBitsToDouble(0x4049000000000000L) * this.Field13987.Method367()))) {
            return;
        }
        Class1651 class1651 = this.Method5321();
        if (class1651 == null) {
            this.Field14022 = null;
            return;
        }
        this.Field14022 = class1651.Method6401();
        this.Method5312(class1651.Method6401());
        this.Field14020.add(class1651);
        if (!bl) return;
        this.Field14016.Method2801();
    }

    private void Method5312(BlockPos blockPos) {
        RayTraceResult rayTraceResult = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(Class1036.Method4206(), new Vec3d((double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getY() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L)));
        EnumFacing enumFacing = rayTraceResult == null ? (this.Field13990.Method365() ? EnumFacing.UP : EnumFacing.DOWN) : (this.Field13989.Method365() ? rayTraceResult.sideHit : (this.Field13990.Method365() ? EnumFacing.UP : EnumFacing.DOWN));
        float[] fArray = new float[]{Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch};
        float[] fArray2 = Class1055.Method4300(blockPos);
        if (this.Field13981.Method365()) {
            this.Method5316(fArray2, fArray);
        }
        if (this.Field13988.Method365()) {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, this.Method5313(), 0.0f, 0.0f, 0.0f));
        } else {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos, enumFacing, new Vec3d(0.0, 0.0, 0.0), this.Method5313());
        }
        if (!this.Field13981.Method365()) return;
        this.Method5316(fArray, fArray2);
    }

    public EnumHand Method5313() {
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL) {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
            return EnumHand.MAIN_HAND;
        }
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.END_CRYSTAL) return null;
        Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
        return EnumHand.OFF_HAND;
    }

    private void Method5314(EntityEnderCrystal entityEnderCrystal) {
        float[] fArray = new float[]{Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch};
        float[] fArray2 = Class1055.Method4299((Entity)entityEnderCrystal);
        if (this.Field13981.Method365()) {
            this.Method5316(fArray2, fArray);
        }
        if (this.Field13996.Method365()) {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)entityEnderCrystal));
        } else {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.attackEntity((EntityPlayer)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (Entity)entityEnderCrystal);
        }
        this.Method5315();
        if (!this.Field13981.Method365()) return;
        this.Method5316(fArray, fArray2);
    }

    private void Method5315() {
        int n;
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.HASTE)) {
            n = 6 - (1 + Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActivePotionEffect(MobEffects.HASTE).getAmplifier());
        } else {
            int n2 = n = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.MINING_FATIGUE) ? 6 + (1 + Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActivePotionEffect(MobEffects.MINING_FATIGUE).getAmplifier()) * 2 : 6;
        }
        if (this.Field13983.Method365() && (!Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSwingInProgress || Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgressInt >= n / 2 || Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgressInt < 0)) {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgressInt = -1;
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSwingInProgress = true;
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingingHand = ((Class1587)this.Field13984.Method341()).Method6229();
            if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.world instanceof WorldServer) {
                ((WorldServer)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.world).getEntityTracker().sendToTracking((Entity)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (Packet)new SPacketAnimation((Entity)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, ((Class1587)this.Field13984.Method341()).Method6229() == EnumHand.OFF_HAND ? 3 : 0));
            }
        }
        Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketAnimation(((Class1587)this.Field13984.Method341()).Method6229()));
    }

    private void Method5316(float[] fArray, float[] fArray2) {
        float f;
        if (this.Field13982.Method335() >= 360) {
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0], fArray[1], Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedYaw = fArray[0];
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedPitch = fArray[1];
            return;
        }
        float f2 = MathHelper.wrapDegrees((float)(fArray2[0] - fArray[0]));
        if (f2 < (f = MathHelper.wrapDegrees((float)(fArray[0] - fArray2[0])))) {
            float f3 = Math.abs(f2) / this.Field13982.Method368();
            float f4 = 0.0f;
            int n = 0;
            while (true) {
                if (f4 < Math.abs(f2)) {
                    Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedYaw = fArray[0];
                    Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedPitch = fArray[1];
                    return;
                }
                Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0] - (float)n * f3, fArray[1], Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
                f4 += f3;
                ++n;
            }
        }
        float f5 = Math.abs(f) / this.Field13982.Method368();
        float f6 = 0.0f;
        int n = 0;
        while (true) {
            if (f6 < Math.abs(f)) {
                Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedYaw = fArray[0];
                Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedPitch = fArray[1];
                return;
            }
            Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0] + (float)n * f5, fArray[1], Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            f6 += f5;
            ++n;
        }
    }

    private void Method5317(int n) {
        Entity entity = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(n);
        if (entity instanceof EntityEnderCrystal) {
            this.Field14021.put((EntityEnderCrystal)entity, System.currentTimeMillis());
        }
        if (!this.Field14000.Method365() && entity instanceof EntityEnderCrystal) {
            this.Method5314((EntityEnderCrystal)entity);
            if (!this.Field14001.Method365()) return;
            this.Method5318((EntityEnderCrystal)entity);
            return;
        }
        CPacketUseEntity cPacketUseEntity = new CPacketUseEntity();
        cPacketUseEntity.entityId = n;
        cPacketUseEntity.action = CPacketUseEntity.Action.ATTACK;
        Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)cPacketUseEntity);
        this.Method5315();
    }

    private void Method5318(EntityEnderCrystal entityEnderCrystal) {
        entityEnderCrystal.setDead();
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> Class1308.Method5334(entityEnderCrystal));
    }

    private void Method5319() {
        this.Field14019 = this.Method5323();
        if (!this.Field13979.Method365()) return;
        this.Field14019 = Class1308.Method5329(this.Field14019, this.Field13980.Method335());
    }

    private Class999 Method5320() {
        if (this.Field14019 == null) {
            return null;
        }
        Class999 class999 = new Class999(null, Double.longBitsToDouble((long)1307899945 ^ 0xBFF000004DF4F829L), Double.longBitsToDouble((long)1910717184 ^ 0xBFF0000071E33B00L));
        for (Entity entity : Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            EntityEnderCrystal entityEnderCrystal;
            if (!(entity instanceof EntityEnderCrystal) || !this.Method5328((Entity)(entityEnderCrystal = (EntityEnderCrystal)entity), this.Field14005.Method367(), this.Field14006.Method367()) || this.Field13997.Method365() && !Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.canEntityBeSeen((Entity)entityEnderCrystal) || this.Field13994.Method365() && this.Field14021.containsKey(entityEnderCrystal)) continue;
            double d = Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ, (Entity)this.Field14019, this.Field14008.Method365());
            double d2 = Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ, (Entity)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14008.Method365());
            if (this.Field13998.Method365() && d2 >= (double)(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) || (d = this.Method5322(d, d2)) < this.Field14011.Method367() || d2 > this.Field14012.Method367()) continue;
            Class999 class9992 = new Class999(entityEnderCrystal, d, d2);
            class999 = class999.Method4039(class9992);
        }
        if (class999.Method4037() < 0.0) {
            return null;
        }
        Class999 class9993 = class999;
        return class9993;
    }

    private Class1651 Method5321() {
        Class1651 class1651 = new Class1651(BlockPos.ORIGIN, Double.longBitsToDouble((long)308410921 ^ 0xBFF000001261FA29L), Double.longBitsToDouble(-4616189618054758400L));
        for (BlockPos blockPos : Class2155.Method7758(this.Field14003.Method368(), true, false)) {
            Class1651 class16512;
            if (!this.Method5327(blockPos, this.Field14003.Method367(), this.Field14004.Method367()) || !Class2155.Method7755(blockPos, true, true, false, this.Field14007.Method365()) || this.Field13989.Method365() && !Class394.Method1917(blockPos)) continue;
            double d = Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (double)blockPos.getX() + Double.longBitsToDouble((long)2114228470 ^ 0x3FE000007E0490F6L), blockPos.getY() + 1, (double)blockPos.getZ() + Double.longBitsToDouble((long)240512014 ^ 0x3FE000000E55EC0EL), (Entity)this.Field14019, this.Field14008.Method365());
            double d2 = Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (double)blockPos.getX() + Double.longBitsToDouble((long)766968331 ^ 0x3FE000002DB7020BL), blockPos.getY() + 1, (double)blockPos.getZ() + Double.longBitsToDouble((long)2022764637 ^ 0x3FE000007890F05DL), (Entity)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14008.Method365());
            if (this.Field13991.Method365() && !Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityEnderCrystal.class, (AxisAlignedBB)(class16512 = new AxisAlignedBB((double)(blockPos.getX() - 1), (double)blockPos.getY() - Double.longBitsToDouble(4602678819172646912L), (double)(blockPos.getZ() - 1), (double)(blockPos.getX() + 2), (double)(blockPos.getY() + 1), (double)(blockPos.getZ() + 2)))).isEmpty() || this.Field13992.Method365() && d2 >= (double)(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() - Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) || (d = this.Method5322(d, d2)) < this.Field14009.Method367() || d2 > this.Field14010.Method367()) continue;
            class16512 = new Class1651(blockPos, d, d2);
            class1651 = class1651.Method6404(class16512);
        }
        if (Class1651.Method6405(class1651) < 0.0) {
            return null;
        }
        Class1651 class16513 = class1651;
        return class16513;
    }

    private double Method5322(double d, double d2) {
        switch (Class1156.Field13218[((Class807)this.Field13973.Method341()).ordinal()]) {
            case 1: {
                return d;
            }
            case 2: {
                return d - d2;
            }
            case 3: {
                return d + this.Field13974.Method367() * Double.longBitsToDouble((long)157535746 ^ 0x3FE000000963CE02L) - (d2 + this.Field13974.Method367());
            }
        }
        return d;
    }

    private EntityPlayer Method5323() {
        EntityPlayer entityPlayer = null;
        double d = Double.longBitsToDouble(0x4042000000000000L);
        double d2 = Double.longBitsToDouble((long)1487056093 ^ 0x3FE0000058A2ACDDL);
        double d3 = this.Field13976.Method367() + 1.0;
        Iterator iterator = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer2 = (EntityPlayer)iterator.next();
            if (this.Method5325(entityPlayer2, this.Field13976.Method367())) continue;
            double d4 = entityPlayer2.getHealth() + entityPlayer2.getAbsorptionAmount();
            double d5 = this.Method5326(entityPlayer2);
            double d6 = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer2);
            if (this.Field13975.Method341() == Class310.Field9318 && d6 < d3) {
                entityPlayer = entityPlayer2;
                d3 = d6;
                continue;
            }
            if (this.Field13975.Method341() == Class310.Field9319 && d4 < d) {
                entityPlayer = entityPlayer2;
                d3 = d4;
                continue;
            }
            if (this.Field13975.Method341() != Class310.Field9320 || !(d5 > d2)) continue;
            entityPlayer = entityPlayer2;
            d2 = d5;
        }
        return entityPlayer;
    }

    private AxisAlignedBB Method5324(double d) {
        return new AxisAlignedBB(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - d, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - d, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - d, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d, Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d);
    }

    private boolean Method5325(EntityPlayer entityPlayer, double d) {
        if ((double)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) > d) return true;
        if (entityPlayer.equals((Object)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) return true;
        if (entityPlayer.getHealth() <= 0.0f) return true;
        if (entityPlayer.isDead) return true;
        if (Class726.Field11086.Method3043(entityPlayer.getName())) return true;
        return false;
    }

    private float Method5326(EntityPlayer entityPlayer) {
        float f = Float.intBitsToFloat(0x3F000000);
        Iterator iterator = Class2155.Method7758(this.Field14003.Method368(), true, false).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (!this.Method5327(blockPos, this.Field14003.Method367(), this.Field14004.Method367()) || !Class2155.Method7755(blockPos, true, true, false, this.Field14007.Method365())) continue;
            f = Math.max(f, Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos.getY() + 1, (double)blockPos.getZ() + Double.longBitsToDouble((long)629478382 ^ 0x3FE00000258513EEL), (Entity)entityPlayer, this.Field14008.Method365()));
        }
        return f;
    }

    private boolean Method5327(BlockPos blockPos, double d, double d2) {
        double d3 = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getY() + Double.longBitsToDouble((long)1420108837 ^ 0x3FE0000054A52425L), (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
        double d4 = Class394.Method1917(blockPos) ? d : d2;
        if (!(d3 <= d4)) return false;
        return true;
    }

    private boolean Method5328(Entity entity, double d, double d2) {
        double d3 = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity);
        double d4 = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.canEntityBeSeen(entity) ? d : d2;
        if (!(d3 <= d4)) return false;
        return true;
    }

    private static EntityPlayer Method5329(EntityPlayer entityPlayer, int n) {
        AxisAlignedBB axisAlignedBB = entityPlayer.getEntityBoundingBox();
        double d = entityPlayer.posX;
        double d2 = entityPlayer.posY;
        double d3 = entityPlayer.posZ;
        double d4 = entityPlayer.motionX;
        double d5 = entityPlayer.motionY;
        double d6 = entityPlayer.motionZ;
        boolean bl = true;
        boolean bl2 = true;
        for (int i = 0; i < n; ++i) {
            axisAlignedBB.offset(d4, d5, d6);
            if (Class1308.Method5331(axisAlignedBB, new Vec3d(d += d4, d2 += d5, d3 += d6), d4, d5, d6)) {
                d -= d4;
                d2 -= d5;
                d3 -= d6;
                axisAlignedBB.offset(-d4, -d5, -d6);
                bl2 = false;
                continue;
            }
            if (Class1308.Method5330(axisAlignedBB, new Vec3d(d, d2, d3), d4, d5, d6)) {
                d -= d4;
                d2 -= d5;
                d3 -= d6;
                axisAlignedBB.offset(-d4, -d5, -d6);
                bl = false;
                continue;
            }
            d4 += Double.longBitsToDouble((long)1483607087 ^ 0x3FE99999C1F795B5L);
            d6 += Double.longBitsToDouble((long)1067008454 ^ 0x3FE99999A600D85CL);
            d5 *= d5 < 0.0 ? Double.longBitsToDouble((long)1835445181 ^ 0x3FF266660B00CDDBL) : Double.longBitsToDouble(4604480259023595110L);
        }
        EntityOtherPlayerMP entityOtherPlayerMP = new EntityOtherPlayerMP((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new GameProfile(entityPlayer.getUniqueID(), entityPlayer.getName()));
        entityOtherPlayerMP.setPosition(d, d2, d3);
        entityOtherPlayerMP.inventory.copyInventory(entityPlayer.inventory);
        entityOtherPlayerMP.setHealth(entityPlayer.getHealth());
        entityOtherPlayerMP.prevPosX = entityPlayer.prevPosX;
        entityOtherPlayerMP.prevPosY = entityPlayer.prevPosY;
        entityOtherPlayerMP.prevPosZ = entityPlayer.prevPosZ;
        Iterator iterator = entityPlayer.getActivePotionEffects().iterator();
        while (iterator.hasNext()) {
            PotionEffect potionEffect = (PotionEffect)iterator.next();
            entityOtherPlayerMP.addPotionEffect(potionEffect);
        }
        return entityOtherPlayerMP;
    }

    private static boolean Method5330(AxisAlignedBB axisAlignedBB, Vec3d vec3d, double d, double d2, double d3) {
        boolean bl;
        boolean bl2 = Class1308.Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), vec3d);
        bl2 |= Class1308.Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vec3d);
        bl2 |= Class1308.Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), vec3d);
        bl2 |= Class1308.Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vec3d);
        if (d2 * d2 > d * d + d3 * d3) {
            bl = true;
            return bl2 &= bl;
        }
        bl = false;
        return bl2 &= bl;
    }

    private static boolean Method5331(AxisAlignedBB axisAlignedBB, Vec3d vec3d, double d, double d2, double d3) {
        boolean bl;
        boolean bl2 = Class1308.Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ), vec3d);
        bl2 |= Class1308.Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ), vec3d);
        bl2 |= Class1308.Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ), vec3d);
        bl2 |= Class1308.Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ), vec3d);
        bl2 |= Class1308.Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), vec3d);
        bl2 |= Class1308.Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vec3d);
        bl2 |= Class1308.Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), vec3d);
        bl2 |= Class1308.Method5332(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vec3d);
        if (d * d + d3 * d3 > d2 * d2) {
            bl = true;
            return bl2 &= bl;
        }
        bl = false;
        return bl2 &= bl;
    }

    private static boolean Method5332(WorldClient worldClient, Vec3d vec3d, Vec3d vec3d2) {
        RayTraceResult rayTraceResult = worldClient.rayTraceBlocks(vec3d, vec3d2, false, true, false);
        if (rayTraceResult == null) {
            return true;
        }
        if (worldClient.getBlockState(rayTraceResult.getBlockPos()).getBlock() == Blocks.AIR) return false;
        return true;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5333(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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

    private static void Method5334(EntityEnderCrystal entityEnderCrystal) {
        Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntity((Entity)entityEnderCrystal);
        Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityDangerously((Entity)entityEnderCrystal);
    }

    private void Method5335(Class544 class544) {
        SPacketSoundEffect sPacketSoundEffect;
        if (class544.Method982() instanceof SPacketSoundEffect && (sPacketSoundEffect = (SPacketSoundEffect)class544.Method982()).getCategory() == SoundCategory.BLOCKS && sPacketSoundEffect.getSound() == SoundEvents.ENTITY_GENERIC_EXPLODE) {
            Object object = new HashSet();
            this.Field14021.forEach((arg_0, arg_1) -> this.Method5336(sPacketSoundEffect, (Set)object, arg_0, arg_1));
            EntityEnderCrystal entityEnderCrystal = object.iterator();
            while (entityEnderCrystal.hasNext()) {
                EntityEnderCrystal entityEnderCrystal2 = (EntityEnderCrystal)entityEnderCrystal.next();
                this.Field14021.remove(entityEnderCrystal2);
            }
        }
        if (class544.Method982() instanceof SPacketExplosion) {
            sPacketSoundEffect = (SPacketExplosion)class544.Method982();
            for (EntityEnderCrystal entityEnderCrystal : Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityEnderCrystal.class, new AxisAlignedBB(new BlockPos(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ())))) {
                this.Field14021.remove(entityEnderCrystal);
                if (this.Field14002.Method341() != Class727.Field11090) continue;
                this.Method5318(entityEnderCrystal);
            }
        }
        if (class544.Method982() instanceof SPacketDestroyEntities) {
            sPacketSoundEffect = (SPacketDestroyEntities)class544.Method982();
            for (int n : sPacketSoundEffect.getEntityIDs()) {
                Entity entity = Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(n);
                if (!(entity instanceof EntityEnderCrystal)) {
                    return;
                }
                EntityEnderCrystal entityEnderCrystal = (EntityEnderCrystal)entity;
                this.Field14021.remove(entityEnderCrystal);
                if (this.Field14002.Method341() != Class727.Field11090) continue;
                this.Method5318(entityEnderCrystal);
            }
        }
        if (class544.Method982() instanceof SPacketEntityStatus && (sPacketSoundEffect = (SPacketEntityStatus)class544.Method982()).getOpCode() == 35 && sPacketSoundEffect.getEntity((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world) instanceof EntityPlayer && this.Field13977.Method365() && (double)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(sPacketSoundEffect.getEntity((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world)) <= this.Field13976.Method367()) {
            this.Field14019 = (EntityPlayer)sPacketSoundEffect.getEntity((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
            this.Field14018.Method2801();
        }
        if (!(class544.Method982() instanceof SPacketSpawnObject)) return;
        if (!this.Field13999.Method365()) return;
        sPacketSoundEffect = (SPacketSpawnObject)class544.Method982();
        if (sPacketSoundEffect.getType() != 51) {
            return;
        }
        if (!this.Method5327(new BlockPos(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ()), this.Field14005.Method367(), this.Field14006.Method367())) {
            return;
        }
        if (this.Field13997.Method365() && Class394.Method1917(new BlockPos(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ()))) {
            return;
        }
        double d = Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ(), (Entity)this.Field14019, this.Field14008.Method365());
        double d2 = Class2155.Method7759((World)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ(), (Entity)Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14008.Method365());
        if (this.Field13998.Method365() && d2 >= (double)(Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1308.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount())) {
            return;
        }
        if ((d = this.Method5322(d, d2)) < this.Field14011.Method367()) {
            return;
        }
        if (d2 > this.Field14012.Method367()) {
            return;
        }
        this.Method5317(sPacketSoundEffect.getEntityID());
    }

    private void Method5336(SPacketSoundEffect sPacketSoundEffect, Set set, EntityEnderCrystal entityEnderCrystal, Long l) {
        if (entityEnderCrystal.getDistance(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ()) >= Double.longBitsToDouble(4618441417868443648L)) {
            return;
        }
        set.add(entityEnderCrystal);
        if (this.Field14002.Method341() != Class727.Field11090) return;
        this.Method5318(entityEnderCrystal);
    }

    private void Method5337(AtomicBoolean atomicBoolean) {
        while (!Thread.currentThread().isInterrupted()) {
            if (this.Method5313() == null) {
                atomicBoolean.set(true);
                continue;
            }
            this.Method5309((Class1852)this.Field13986.Method341(), atomicBoolean.get());
            atomicBoolean.set(false);
        }
    }

    private void Method5338() {
        long l = (long)this.Field13995.Method335() * 50L;
        this.Field14021.forEach((arg_0, arg_1) -> this.Method5339(l, arg_0, arg_1));
        if (this.Field13977.Method365() && !this.Field14018.Method2797((long)this.Field13978.Method335() * 50L)) {
            return;
        }
        this.Method5319();
    }

    private void Method5339(long l, EntityEnderCrystal entityEnderCrystal, Long l2) {
        if (System.currentTimeMillis() - l2 < l) return;
        this.Field14021.remove(entityEnderCrystal);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 130;
            cArray2[n] = (char)(cArray[n] ^ (0x43EC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

