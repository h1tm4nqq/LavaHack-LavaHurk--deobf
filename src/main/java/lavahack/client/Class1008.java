//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.concurrent.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.*;
import net.minecraft.network.*;
import net.minecraft.entity.player.*;
import net.minecraft.block.state.*;
import java.util.function.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.client.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.item.*;
import net.minecraft.block.*;
import net.minecraft.client.entity.*;
import java.io.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraft.network.play.server.*;
import net.minecraft.init.*;
import net.minecraft.client.*;

@Class2012
public class Class1008 extends Class42
{
    private final Class411 Field12329;
    private final Class44 Field12330;
    private final Class44 Field12331;
    private final Class1303 Field12332;
    private final Class44 Field12333;
    private final Class44 Field12334;
    private final Class44 Field12335;
    private final Class44 Field12336;
    private final Class44 Field12337;
    private final Class44 Field12338;
    private final Class44 Field12339;
    private final Class44 Field12340;
    private final Class1303 Field12341;
    private final Class44 Field12342;
    private final Class44 Field12343;
    private final Class44 Field12344;
    private final Class44 Field12345;
    private final Class44 Field12346;
    private final Class44 Field12347;
    private final Class1303 Field12348;
    private final Class44 Field12349;
    private final Class44 Field12350;
    private final Class44 Field12351;
    private final Class44 Field12352;
    private final Class44 Field12353;
    private final Class44 Field12354;
    private final Class44 Field12355;
    private final Class44 Field12356;
    private final Class44 Field12357;
    private final Class44 Field12358;
    private final Class1996 Field12359;
    private final Class44 Field12360;
    private final Class44 Field12361;
    private final Class44 Field12362;
    private final Class1996 Field12363;
    private final Class44 Field12364;
    private final Class44 Field12365;
    private final Class44 Field12366;
    private final Class44 Field12367;
    private final Class44 Field12368;
    private final Class44 Field12369;
    private final Class44 Field12370;
    private final Class44 Field12371;
    private final Class44 Field12372;
    private final Class44 Field12373;
    private final Class44 Field12374;
    private final Class1303 Field12375;
    public static Class1008 Field12376;
    private final Class650 Field12377;
    private double Field12378;
    private boolean Field12379;
    private Function Field12380;
    private final Queue Field12381;
    private int Field12382;
    private final Class618 Field12383;
    private final Class618 Field12384;
    private final Class618 Field12385;
    private final Class618 Field12386;
    private final Class618 Field12387;
    private String Field12388 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1008() {
        super("SurroundRewrite", Class97.Field8338, true);
        this.Field12329 = this.Method54();
        this.Field12330 = this.Method23(this.Field12329.Method1999().Method7405(new Class44("Event Mode", this, Class297.Field9292)));
        this.Field12331 = this.Method23(new Class44("Syncronized", this, false));
        this.Field12332 = this.Method25(new Class1303("Mode", this, Class1553.Field15244));
        this.Field12333 = this.Method23(new Class44("RangeCheck", this, false));
        this.Field12334 = this.Method23(new Class44("PlaceRange", this, Double.longBitsToDouble(4617878467915022336L), 1.0, Double.longBitsToDouble(4621819117588971520L), false).Method313(this.Field12333::Method365));
        this.Field12335 = this.Method23(new Class44("Safe Dynamic", this, false).Method313(this::Method4100));
        this.Field12336 = this.Method23(new Class44("Extension", this, false).Method313(this::Method4099));
        this.Field12337 = this.Method23(new Class44("AllEntities", this, false).Method313(this::Method4098));
        this.Field12338 = this.Method23(new Class44("Block", this, "Obsidian", Arrays.asList("Obsidian", "EnderChest")));
        this.Field12339 = this.Method23(new Class44("Smart Block", this, false));
        this.Field12340 = new Class44("Safe E Chest", this, false).Method313(this::Method4097);
        this.Field12341 = this.Method25(new Class1303("Switch", this, Class1896.Field16723));
        this.Field12342 = this.Method23(new Class44("SwitchWhen", this, Class1661.Field15734));
        this.Field12343 = this.Method23(new Class44("Center", this, false));
        this.Field12344 = this.Method23(new Class44("SmartCenter", this, false));
        this.Field12345 = this.Method23(new Class44("SmartHelping", this, false));
        this.Field12346 = this.Method23(new Class44("FightCA", this, false));
        this.Field12347 = this.Method23(new Class44("DetectSound", this).Method313(this.Field12346::Method365));
        this.Field12348 = this.Method25(new Class1303("DetectEntity", this, Class1858.Field16549).Method5301(this.Field12346::Method365));
        this.Field12349 = this.Method23(new Class44("OnEntityDestruction", this, false));
        this.Field12350 = this.Method23(new Class44("AntiCity", this, false));
        this.Field12351 = this.Method23(new Class44("ManipulateWorld", this, false));
        this.Field12352 = this.Method23(new Class44("PostReceive", this, false));
        this.Field12353 = this.Method23(new Class44("Toggle", this, Class1844.Field16502));
        this.Field12354 = this.Method23(new Class44("ToggleHeight", this, Double.longBitsToDouble(4600877379321698714L), 0.0, 1.0, false).Method313(this::Method4096));
        this.Field12355 = this.Method23(new Class44("Packet", this, false));
        this.Field12356 = this.Method23(new Class44("FeetBlocks", this, false));
        this.Field12357 = this.Method23(new Class44("HeightLimit", this, Double.longBitsToDouble((long)1510122399 ^ 0x407000005A02A39FL), 0.0, Double.longBitsToDouble((long)1734807809 ^ 0x4070000067671101L), true));
        this.Field12358 = this.Method23(new Class44("Down", this, false));
        this.Field12359 = this.Method24(new Class1996(new Class44("In Air", this)));
        this.Field12360 = this.Method23(this.Field12359.Method7405(new Class44("In Air", this, false).Method355("State")));
        this.Field12361 = this.Method23(this.Field12359.Method7405(new Class44("In Air Motion Stop", this, false).Method355("Motion Stop")));
        this.Field12362 = this.Method23(new Class44("BreakCrystals", this, false));
        this.Field12363 = this.Method24(new Class1996(new Class44("Crystal Breaker", this)));
        this.Field12364 = this.Method23(this.Field12363.Method7405(new Class44("CB Timings", this, Class713.Field11035).Method355("Timings")));
        this.Field12365 = this.Method23(this.Field12363.Method7405(new Class44("CB Sequential Delay", this, 1.0, 0.0, Double.longBitsToDouble((long)939392141 ^ 0x4024000037FDFC8DL), true).Method355("Sequential Delay")));
        this.Field12366 = this.Method23(this.Field12363.Method7405(new Class44("CbMode", this, "SurroundBlocks", Arrays.asList("SurroundBlocks", "Area")).Method355("Mode")));
        this.Field12367 = this.Method23(this.Field12363.Method7405(new Class44("CBRange", this, Double.longBitsToDouble((long)546358188 ^ 0x400800002090C3ACL), 1.0, Double.longBitsToDouble(4618441417868443648L), false).Method313(this::Method4095).Method355("Range")));
        this.Field12368 = this.Method23(this.Field12363.Method7405(new Class44("CBDelay", this, Double.longBitsToDouble((long)498491692 ^ 0x404E00001DB6612CL), 0.0, Double.longBitsToDouble(4647503709213818880L), true).Method355("Delay")));
        this.Field12369 = this.Method23(this.Field12363.Method7405(new Class44("CBRotate", this, false).Method355("Rotate")));
        this.Field12370 = this.Method23(this.Field12363.Method7405(new Class44("CBRotateMode", this, Class512.Field10160)).Method312(this.Field12369).Method355("Rotate Mode"));
        this.Field12371 = this.Method23(this.Field12363.Method7405(new Class44("CBPacket", this, false).Method355("Packet")));
        this.Field12372 = this.Method23(this.Field12363.Method7405(new Class44("ClientSide", this, false).Method355("Client Side")));
        this.Field12373 = this.Method23(this.Field12363.Method7405(new Class44("CbNoSuicide", this, true).Method355("No Suicide")));
        this.Field12374 = this.Method23(this.Field12363.Method7405(new Class44("CbTerrain", this, true).Method313(this.Field12373::Method365)));
        this.Field12375 = this.Method25(new Class1303("Rotate", this, Class135.Field8498));
        this.Field12377 = new Class650();
        this.Field12378 = Double.longBitsToDouble(-4616189618054758400L);
        this.Field12379 = false;
        this.Field12380 = Class1008::Method4094;
        this.Field12381 = new ConcurrentLinkedQueue();
        this.Field12382 = 0;
        this.Field12383 = new Class618(this::Method4091, new Predicate[0]);
        this.Field12384 = new Class618(this::Method4090, new Predicate[0]);
        this.Field12385 = new Class618(this::Method4089, new Predicate[0]);
        this.Field12386 = new Class618(this::Method4088, new Predicate[0]);
        this.Field12387 = new Class618(this::Method4087, new Predicate[0]);
        Class1008.Field12376 = this;
    }
    
    @SubscribeEvent(priority = EventPriority.HIGH)
    @SubscribeEvent(priority = EventPriority.HIGH)
    public void Method4054(final TickEvent tickEvent) {
        if (this.Field12330.Method341() != Class297.Field9293) {
            return;
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
        }
        else {
            this.Method4055();
        }
    }
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field12383);
        Class1796.Field16242.Method706(this.Field12384);
        Class1796.Field16242.Method706(this.Field12385);
        Class1796.Field16242.Method706(this.Field12386);
        Class1796.Field16242.Method706(this.Field12387);
        this.Field12377.Method2801();
        if (Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field12378 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        if (this.Field12343.Method365() && !this.Method4063()) {
            this.Method21(false);
        }
        this.Field12382 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted;
    }
    
    @Override
    public void Method45() {
        if (Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field12330.Method341() != Class297.Field9292) {
            return;
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
        }
        else {
            this.Method4055();
        }
        this.Field12382 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted;
    }
    
    private void Method4055() {
        this.Field12329.Method2005(this::Method4057);
    }
    
    private synchronized void Method4056() {
        this.Field12329.Method2005(this::Method4057);
    }
    
    private void Method4057() {
        if (Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final double posY = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        final boolean b = !Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround;
        if (this.Field12360.Method365() && this.Field12361.Method365()) {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward = 0.0f;
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing = 0.0f;
        }
        if (this.Field12353.Method341() == Class1844.Field16502) {}
        if ((this.Field12353.Method341() == Class1844.Field16503 && posY > this.Field12378) || (this.Field12353.Method341() == Class1844.Field16504 && posY - this.Field12354.Method367() > this.Field12378) || (this.Field12353.Method341() == Class1844.Field16505 && posY - this.Field12354.Method367() > this.Field12378)) {
            this.Method22();
            return;
        }
        if (this.Field12362.Method365()) {
            this.Method4058(((Class1553)this.Field12332.Method341()).Method6126());
        }
        final int method4070 = this.Method4070();
        if (method4070 == -1) {
            return;
        }
        final int currentItem = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        ((Class1896)this.Field12341.Method341()).Method7027(method4070, false, Class1661.Field15735);
        this.Method4065(((Class1553)this.Field12332.Method341()).Method6126());
        ((Class1896)this.Field12341.Method341()).Method7027(currentItem, true, Class1661.Field15735);
        this.Field12378 = posY;
        if (this.Field12353.Method341() == Class1844.Field16506) {
            this.Method22();
        }
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field12383);
        Class1796.Field16242.Method711(this.Field12384);
        Class1796.Field16242.Method711(this.Field12385);
        Class1796.Field16242.Method711(this.Field12386);
        Class1796.Field16242.Method711(this.Field12387);
        this.Field12378 = Double.longBitsToDouble((long)727514944 ^ 0xBFF000002B5CFF40L);
        this.Field12380 = Class1008::Method4093;
        this.Field12377.Method2801();
        this.Field12381.clear();
    }
    
    private void Method4058(final List list) {
        if (!this.Field12377.Method2797((long)this.Field12368.Method335())) {
            return;
        }
        final float[] array = { Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch };
        final HashSet<EntityEnderCrystal> set = new HashSet<EntityEnderCrystal>(64);
        if (this.Field12366.Method359().equals("Area")) {
            final double method367 = this.Field12367.Method367();
            for (final EntityEnderCrystal entityEnderCrystal : Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)EntityEnderCrystal.class, new AxisAlignedBB(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - method367, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - method367, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - method367, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + method367, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + method367, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + method367))) {
                if (!this.Method4059(entityEnderCrystal)) {
                    return;
                }
                this.Method4060(entityEnderCrystal, array);
            }
            return;
        }
        final Iterator<BlockPos> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            for (final EntityEnderCrystal entityEnderCrystal2 : Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)EntityEnderCrystal.class, new AxisAlignedBB((BlockPos)iterator2.next()))) {
                if (!set.contains(entityEnderCrystal2)) {
                    if (!this.Method4059(entityEnderCrystal2)) {
                        continue;
                    }
                    this.Method4060(entityEnderCrystal2, array);
                    set.add(entityEnderCrystal2);
                }
            }
        }
    }
    
    private boolean Method4059(final EntityEnderCrystal entityEnderCrystal) {
        return (!this.Field12364.Method309("Sequential") || entityEnderCrystal.ticksExisted >= this.Field12365.Method335()) && (!this.Field12373.Method365() || Class2155.Method7759((World)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ, (Entity)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field12374.Method365()) < Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount());
    }
    
    private void Method4060(final EntityEnderCrystal entityEnderCrystal, final float[] array) {
        if (this.Field12369.Method365()) {
            this.Method4061(Class1568.Method6179((Entity)entityEnderCrystal));
        }
        if (this.Field12371.Method365()) {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)entityEnderCrystal));
        }
        else {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.attackEntity((EntityPlayer)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (Entity)entityEnderCrystal);
        }
        Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
        if (this.Field12372.Method365()) {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(entityEnderCrystal.entityId);
        }
        if (this.Field12369.Method365()) {
            this.Method4061(array);
        }
    }
    
    private void Method4061(final float[] array) {
        if (this.Field12370.Method341() == Class512.Field10160 || this.Field12370.Method341() == Class512.Field10161) {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(array[0], array[1], Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        }
        if (this.Field12370.Method341() == Class512.Field10159 || this.Field12370.Method341() == Class512.Field10161) {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = array[0];
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = array[1];
        }
    }
    
    private BlockPos Method4062(final BlockPos blockPos) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        if (this.Field12380.apply(blockPos.north().down()).getMaterial().isSolid()) {
            list.add(blockPos.north());
        }
        if (this.Field12380.apply(blockPos.east().down()).getMaterial().isSolid()) {
            list.add(blockPos.east());
        }
        if (this.Field12380.apply(blockPos.south().down()).getMaterial().isSolid()) {
            list.add(blockPos.south());
        }
        if (this.Field12380.apply(blockPos.west().down()).getMaterial().isSolid()) {
            list.add(blockPos.west());
        }
        return list.stream().min(Comparator.comparingDouble((ToDoubleFunction<? super BlockPos>)Class1008::Method4092)).orElse(null);
    }
    
    private boolean Method4063() {
        if (!this.Field12344.Method365()) {
            this.Method4064(new BlockPos(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
            return true;
        }
        BlockPos method4062 = new BlockPos(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (this.Method4081(method4062)) {
            method4062 = this.Method4062(method4062);
        }
        if (method4062 == null) {
            return false;
        }
        this.Method4064(method4062);
        return true;
    }
    
    private void Method4064(final BlockPos blockPos) {
        final Vec3d vec3d = new Vec3d(blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
        Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(vec3d.x, vec3d.y, vec3d.z, true));
        Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(vec3d.x, vec3d.y, vec3d.z);
    }
    
    private void Method4065(final List list) {
        final int method4070 = this.Method4070();
        if (method4070 == -1) {
            return;
        }
        final int currentItem = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (this.Field12341.Method341() == Class1896.Field16720) {
            final Item getItem = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(currentItem).getItem();
            if (!(getItem instanceof ItemBlock)) {
                return;
            }
            if (((ItemBlock)getItem).getBlock() != this.Method4071()) {
                return;
            }
        }
        for (final BlockPos blockPos : list) {
            if (blockPos.getY() > this.Field12357.Method335()) {
                continue;
            }
            if (!this.Method4081(blockPos)) {
                continue;
            }
            if (this.Method4069(blockPos)) {
                continue;
            }
            if (this.Field12333.Method365() && Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos) > this.Field12334.Method367()) {
                continue;
            }
            ((Class1896)this.Field12341.Method341()).Method7027(method4070, false, Class1661.Field15734);
            Class1036.Method4209(blockPos, EnumHand.MAIN_HAND, (Class135)this.Field12375.Method341(), this.Field12355.Method365());
            ((Class1896)this.Field12341.Method341()).Method7027(currentItem, true, Class1661.Field15734);
        }
    }
    
    private void Method4066(final Class544 class544) {
        if (!this.Field12350.Method365()) {
            return;
        }
        if (!(class544.Method982() instanceof SPacketBlockChange)) {
            return;
        }
        final SPacketBlockChange sPacketBlockChange = (SPacketBlockChange)class544.Method982();
        final BlockPos getBlockPosition = sPacketBlockChange.getBlockPosition();
        if (!sPacketBlockChange.getBlockState().getBlock().isReplaceable((IBlockAccess)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, getBlockPosition)) {
            return;
        }
        final List method6126 = ((Class1553)this.Field12332.Method341()).Method6126();
        if (!method6126.contains(getBlockPosition)) {
            return;
        }
        if (this.Field12351.Method365()) {
            this.Field12380 = Class1008::Method4086;
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
        }
        else {
            this.Method4055();
        }
        this.Field12380 = Class1008::Method4085;
    }
    
    private boolean Method4067(final Vec3d vec3d, final List list) {
        final Iterator<BlockPos> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (new AxisAlignedBB((BlockPos)iterator.next()).contains(vec3d)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean Method4068(final AxisAlignedBB axisAlignedBB, final List list) {
        final Iterator<BlockPos> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (new AxisAlignedBB((BlockPos)iterator.next()).intersects(axisAlignedBB)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean Method4069(final BlockPos blockPos) {
        for (final Entity entity : Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
            if (!(entity instanceof EntityItem)) {
                if (entity instanceof EntityXPOrb) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    private int Method4070() {
        final int method127 = Class9.Method127(Blocks.OBSIDIAN);
        final int method128 = Class9.Method127(Blocks.ENDER_CHEST);
        if (this.Field12338.Method309("Obsidian")) {
            this.Field12379 = (this.Field12339.Method365() && method127 == -1);
            return method127;
        }
        this.Field12379 = (!this.Field12339.Method365() && method128 != 1);
        return method127;
    }
    
    private Block Method4071() {
        if (this.Field12338.Method359().equals("Obsidian")) {
            return Blocks.OBSIDIAN;
        }
        return Blocks.ENDER_CHEST;
    }
    
    private List Method4072() {
        if (this.Field12336.Method365()) {
            return this.Method4074();
        }
        return this.Method4073();
    }
    
    private List Method4073() {
        final List method4078 = this.Method4078((Entity)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>(16);
        if (this.Field12356.Method365()) {
            list.addAll((Collection<?>)this.Method4079((Entity)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, -1));
        }
        for (final BlockPos blockPos : method4078) {
            list.addAll((Collection<?>)this.Method4075(blockPos));
            list.add(blockPos);
        }
        return list;
    }
    
    private List Method4074() {
        final List method4073 = this.Method4073();
        List<EntityPlayerSP> getEntitiesWithinAABB = new ArrayList<EntityPlayerSP>();
        final Serializable s = this.Field12337.Method365() ? Entity.class : EntityPlayer.class;
        for (final BlockPos blockPos : method4073) {
            final List getEntitiesWithinAABB2 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)s, new AxisAlignedBB(blockPos));
            if (getEntitiesWithinAABB.isEmpty()) {
                getEntitiesWithinAABB = (List<EntityPlayerSP>)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)EntityPlayer.class, new AxisAlignedBB(blockPos.down()));
            }
            getEntitiesWithinAABB.addAll(getEntitiesWithinAABB2);
        }
        final ArrayList list = new ArrayList(method4073);
        for (final Entity entity : getEntitiesWithinAABB) {
            if (entity.equals((Object)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
                continue;
            }
            final List method4074 = this.Method4078(entity, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
            final ArrayList<BlockPos> list2 = new ArrayList<BlockPos>(16);
            if (this.Field12356.Method365()) {
                list2.addAll((Collection<?>)this.Method4079(entity, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, -1));
            }
            for (final BlockPos blockPos2 : method4074) {
                list2.addAll((Collection<?>)this.Method4075(blockPos2));
                list2.add(blockPos2);
            }
            final ArrayList list3 = new ArrayList<EntityPlayerSP>(getEntitiesWithinAABB);
            list3.add(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            final ArrayList<Object> list4 = new ArrayList<Object>();
            final Iterator<EntityPlayerSP> iterator4 = (Iterator<EntityPlayerSP>)list3.iterator();
            while (iterator4.hasNext()) {
                final List method4075 = this.Method4079((Entity)iterator4.next(), Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, 0);
                for (final BlockPos blockPos3 : list2) {
                    if (method4075.contains(blockPos3)) {
                        list4.add(blockPos3);
                    }
                }
            }
            list2.removeAll(list4);
            list.addAll((Collection)list2);
        }
        return list;
    }
    
    private List Method4075(final BlockPos blockPos) {
        if (this.Field12345.Method365() && !Class1036.Method4213(blockPos).isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.singletonList(blockPos.down());
    }
    
    private List Method4076() {
        final List method4077 = this.Method4077(0);
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>(16);
        for (final BlockPos blockPos : method4077) {
            final BlockPos north = blockPos.north();
            final BlockPos east = blockPos.east();
            final BlockPos south = blockPos.south();
            final BlockPos west = blockPos.west();
            if (!method4077.contains(north)) {
                list.add(north);
            }
            if (!method4077.contains(east)) {
                list.add(east);
            }
            if (!method4077.contains(south)) {
                list.add(south);
            }
            if (!method4077.contains(west)) {
                list.add(west);
            }
            if (this.Field12335.Method365() || (this.Field12340.Method365() && this.Field12379)) {
                final BlockPos west2 = blockPos.north().west();
                final BlockPos east2 = blockPos.north().east();
                final BlockPos east3 = blockPos.south().east();
                final BlockPos west3 = blockPos.south().west();
                if (!method4077.contains(west2)) {
                    list.add(west2);
                }
                if (!method4077.contains(east2)) {
                    list.add(east2);
                }
                if (!method4077.contains(east3)) {
                    list.add(east3);
                }
                if (method4077.contains(west3)) {
                    continue;
                }
                list.add(west3);
            }
        }
        return list;
    }
    
    private List Method4077(final int n) {
        final ArrayList list = new ArrayList(16);
        final Vec3d vec3d = new Vec3d(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)186990098 ^ 0x3FD3333338160D21L), Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(4599075939470750515L));
        final Vec3d vec3d2 = new Vec3d(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble(4599075939470750515L), Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(4599075939470750515L));
        final Vec3d vec3d3 = new Vec3d(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble(4599075939470750515L), Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble((long)489767483 ^ 0x3FD333332E027108L));
        final Vec3d vec3d4 = new Vec3d(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble(4599075939470750515L), Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble((long)928587478 ^ 0x3FD33333046A2DE5L));
        this.Method4080(vec3d, list);
        this.Method4080(vec3d2, list);
        this.Method4080(vec3d3, list);
        this.Method4080(vec3d4, list);
        return list;
    }
    
    private List Method4078(final Entity entity, final double n) {
        final List method4079 = this.Method4079(entity, n, 0);
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>(16);
        for (final BlockPos blockPos : method4079) {
            final BlockPos north = blockPos.north();
            final BlockPos east = blockPos.east();
            final BlockPos south = blockPos.south();
            final BlockPos west = blockPos.west();
            if (!method4079.contains(north)) {
                list.add(north);
            }
            if (!method4079.contains(east)) {
                list.add(east);
            }
            if (!method4079.contains(south)) {
                list.add(south);
            }
            if (!method4079.contains(west)) {
                list.add(west);
            }
            if (this.Field12335.Method365() || (this.Field12340.Method365() && this.Field12379)) {
                final BlockPos west2 = blockPos.north().west();
                final BlockPos east2 = blockPos.north().east();
                final BlockPos east3 = blockPos.south().east();
                final BlockPos west3 = blockPos.south().west();
                if (!method4079.contains(west2)) {
                    list.add(west2);
                }
                if (!method4079.contains(east2)) {
                    list.add(east2);
                }
                if (!method4079.contains(east3)) {
                    list.add(east3);
                }
                if (method4079.contains(west3)) {
                    continue;
                }
                list.add(west3);
            }
        }
        return list;
    }
    
    public List Method4079(final Entity entity, final double n, final int n2) {
        final ArrayList list = new ArrayList(16);
        final AxisAlignedBB getEntityBoundingBox = entity.getEntityBoundingBox();
        final double n3 = (getEntityBoundingBox.maxX - getEntityBoundingBox.minX) / Double.longBitsToDouble(4611686018427387904L);
        final double n4 = (getEntityBoundingBox.maxZ - getEntityBoundingBox.minZ) / Double.longBitsToDouble((long)228445347 ^ 0x400000000D9DCCA3L);
        final Vec3d vec3d = new Vec3d(entity.posX + n3, n + n2, entity.posZ + n4);
        final Vec3d vec3d2 = new Vec3d(entity.posX + n3, n + n2, entity.posZ - n4);
        final Vec3d vec3d3 = new Vec3d(entity.posX - n3, n + n2, entity.posZ + n4);
        final Vec3d vec3d4 = new Vec3d(entity.posX - n3, n + n2, entity.posZ - n4);
        this.Method4080(vec3d, list);
        this.Method4080(vec3d2, list);
        this.Method4080(vec3d3, list);
        this.Method4080(vec3d4, list);
        return list;
    }
    
    private void Method4080(final Vec3d vec3d, final List list) {
        final BlockPos blockPos = new BlockPos(vec3d);
        if (this.Method4081(blockPos) && !list.contains(blockPos)) {
            list.add(blockPos);
        }
    }
    
    private boolean Method4081(final BlockPos blockPos) {
        return blockPos != null && Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null && this.Field12380.apply(blockPos).getMaterial().isReplaceable();
    }
    
    private List Method4082() {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>(16);
        list.addAll((Collection<?>)Class1553.Field15244.Method6126());
        for (final Class671 class671 : this.Method4083(new BlockPos(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ).up())) {
            final BlockPos method2856 = class671.Method2856();
            final BlockPos up = method2856.up();
            final BlockPos offset = method2856.offset(class671.Method2857());
            if (this.Method4084(up) == Blocks.AIR) {
                list.add(method2856);
            }
            else {
                if (this.Method4084(offset) != Blocks.AIR) {
                    continue;
                }
                list.add(method2856);
            }
        }
        return list;
    }
    
    private List Method4083(final BlockPos blockPos) {
        final ArrayList<Class671> list = new ArrayList<Class671>(16);
        list.add(new Class671(blockPos.north(), EnumFacing.NORTH));
        list.add(new Class671(blockPos.east(), EnumFacing.EAST));
        list.add(new Class671(blockPos.south(), EnumFacing.SOUTH));
        list.add(new Class671(blockPos.west(), EnumFacing.WEST));
        return list;
    }
    
    private Block Method4084(final BlockPos blockPos) {
        return this.Field12380.apply(blockPos).getBlock();
    }
    
    private static IBlockState Method4085(final BlockPos blockPos) {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }
    
    private static IBlockState Method4086(final List list, final BlockPos blockPos) {
        if (!list.contains(blockPos)) {
            return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
        }
        return Blocks.AIR.getDefaultState();
    }
    
    private void Method4087(final Class603 class603) {
        if (!this.Field12349.Method365()) {
            return;
        }
        if (!(class603.Method982() instanceof SPacketDestroyEntities)) {
            return;
        }
        final int[] getEntityIDs = ((SPacketDestroyEntities)class603.Method982()).getEntityIDs();
        for (int length = getEntityIDs.length, i = 0; i < length; ++i) {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(getEntityIDs[i]);
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
        }
        else {
            this.Method4055();
        }
    }
    
    private void Method4088(final Class603 class603) {
        if (!this.Field12352.Method365()) {
            return;
        }
        this.Method4066(new Class544(class603.Method982()));
    }
    
    private void Method4089(final Class544 class544) {
        if (this.Field12352.Method365()) {
            return;
        }
        this.Method4066(class544);
    }
    
    private void Method4090(final Class125 class125) {
        if (!this.Field12346.Method365()) {
            return;
        }
        if (this.Field12348.Method341() == Class1858.Field16549) {
            return;
        }
        final Class1858 class126 = (Class1858)this.Field12348.Method341();
        final Entity method855 = class125.Method855();
        if (!this.Method4068(method855.getEntityBoundingBox(), ((Class1553)this.Field12332.Method341()).Method6126())) {
            return;
        }
        if (class126 == Class1858.Field16551 || class126 == Class1858.Field16549) {
            method855.setDead();
        }
        if (class126 == Class1858.Field16550 || class126 == Class1858.Field16552) {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntity(method855);
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
        }
        else {
            this.Method4055();
        }
    }
    
    private void Method4091(final Class544 class544) {
        if (!this.Field12346.Method365()) {
            return;
        }
        if (!this.Field12347.Method365()) {
            return;
        }
        if (!(class544.Method982() instanceof SPacketSoundEffect)) {
            return;
        }
        final SPacketSoundEffect sPacketSoundEffect = (SPacketSoundEffect)class544.Method982();
        if (sPacketSoundEffect.getSound() != SoundEvents.ENTITY_GENERIC_EXPLODE) {
            return;
        }
        if (!this.Method4067(new Vec3d(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ()), ((Class1553)this.Field12332.Method341()).Method6126())) {
            return;
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
        }
        else {
            this.Method4055();
        }
    }
    
    private static double Method4092(final BlockPos blockPos) {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getY(), blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
    }
    
    private static IBlockState Method4093(final BlockPos blockPos) {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }
    
    private static IBlockState Method4094(final BlockPos blockPos) {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }
    
    private Boolean Method4095() {
        return this.Field12366.Method359().equals("Area");
    }
    
    private Boolean Method4096() {
        return this.Field12353.Method341() == Class1844.Field16504 || this.Field12353.Method341() == Class1844.Field16505;
    }
    
    private Boolean Method4097() {
        return this.Field12332.Method341() == Class1553.Field15251;
    }
    
    private Boolean Method4098() {
        return this.Field12336.Method365() && this.Field12336.Method311();
    }
    
    private Boolean Method4099() {
        return this.Field12332.Method341() == Class1553.Field15251;
    }
    
    private Boolean Method4100() {
        return this.Field12332.Method341() == Class1553.Field15251;
    }
    
    static List Method4101(final Class1008 class1008) {
        return class1008.Method4072();
    }
    
    static List Method4102(final Class1008 class1008) {
        return class1008.Method4082();
    }
    
    static Class44 Method4103(final Class1008 class1008) {
        return class1008.Field12356;
    }
    
    static Minecraft Method4104() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method4105() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Class44 Method4106(final Class1008 class1008) {
        return class1008.Field12358;
    }
    
    static Minecraft Method4107() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method4108() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method4109() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Class44 Method4110(final Class1008 class1008) {
        return class1008.Field12345;
    }
    
    static Class44 Method4111(final Class1008 class1008) {
        return class1008.Field12342;
    }
    
    static Minecraft Method4112() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method4113() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method4114() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method4115() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method4116() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method4117() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method4118() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method4119() {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x29FF ^ 0x7F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
