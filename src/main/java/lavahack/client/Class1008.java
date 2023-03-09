//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.server.SPacketBlockChange
 *  net.minecraft.network.play.server.SPacketDestroyEntities
 *  net.minecraft.network.play.server.SPacketSoundEffect
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.eventhandler.EventPriority
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Function;
import java.util.function.Predicate;
import lavahack.client.Class1036;
import lavahack.client.Class125;
import lavahack.client.Class1303;
import lavahack.client.Class135;
import lavahack.client.Class1553;
import lavahack.client.Class1568;
import lavahack.client.Class1661;
import lavahack.client.Class1796;
import lavahack.client.Class1844;
import lavahack.client.Class1858;
import lavahack.client.Class1896;
import lavahack.client.Class1996;
import lavahack.client.Class2012;
import lavahack.client.Class2155;
import lavahack.client.Class297;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class512;
import lavahack.client.Class544;
import lavahack.client.Class603;
import lavahack.client.Class618;
import lavahack.client.Class671;
import lavahack.client.Class713;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.network.play.server.SPacketDestroyEntities;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Class2012
public class Class1008
extends Class42 {
    private final Class411 Field12329 = this.Method54();
    private final Class44 Field12330 = this.Method23(this.Field12329.Method1999().Method7405(new Class44("Event Mode", (Class42)this, Class297.Field9292)));
    private final Class44 Field12331 = this.Method23(new Class44("Syncronized", (Class42)this, false));
    private final Class1303 Field12332 = this.Method25(new Class1303("Mode", (Class42)this, Class1553.Field15244));
    private final Class44 Field12333 = this.Method23(new Class44("RangeCheck", (Class42)this, false));
    private final Class44 Field12334 = this.Method23(new Class44("PlaceRange", (Class42)this, Double.longBitsToDouble(4617878467915022336L), 1.0, Double.longBitsToDouble(0x4024000000000000L), false).Method313(this.Field12333::Method365));
    private final Class44 Field12335 = this.Method23(new Class44("Safe Dynamic", (Class42)this, false).Method313(this::Method4100));
    private final Class44 Field12336 = this.Method23(new Class44("Extension", (Class42)this, false).Method313(this::Method4099));
    private final Class44 Field12337 = this.Method23(new Class44("AllEntities", (Class42)this, false).Method313(this::Method4098));
    private final Class44 Field12338 = this.Method23(new Class44("Block", (Class42)this, "Obsidian", Arrays.asList("Obsidian", "EnderChest")));
    private final Class44 Field12339 = this.Method23(new Class44("Smart Block", (Class42)this, false));
    private final Class44 Field12340 = new Class44("Safe E Chest", (Class42)this, false).Method313(this::Method4097);
    private final Class1303 Field12341 = this.Method25(new Class1303("Switch", (Class42)this, Class1896.Field16723));
    private final Class44 Field12342 = this.Method23(new Class44("SwitchWhen", (Class42)this, Class1661.Field15734));
    private final Class44 Field12343 = this.Method23(new Class44("Center", (Class42)this, false));
    private final Class44 Field12344 = this.Method23(new Class44("SmartCenter", (Class42)this, false));
    private final Class44 Field12345 = this.Method23(new Class44("SmartHelping", (Class42)this, false));
    private final Class44 Field12346 = this.Method23(new Class44("FightCA", (Class42)this, false));
    private final Class44 Field12347 = this.Method23(new Class44("DetectSound", this).Method313(this.Field12346::Method365));
    private final Class1303 Field12348 = this.Method25(new Class1303("DetectEntity", (Class42)this, Class1858.Field16549).Method5301(this.Field12346::Method365));
    private final Class44 Field12349 = this.Method23(new Class44("OnEntityDestruction", (Class42)this, false));
    private final Class44 Field12350 = this.Method23(new Class44("AntiCity", (Class42)this, false));
    private final Class44 Field12351 = this.Method23(new Class44("ManipulateWorld", (Class42)this, false));
    private final Class44 Field12352 = this.Method23(new Class44("PostReceive", (Class42)this, false));
    private final Class44 Field12353 = this.Method23(new Class44("Toggle", (Class42)this, Class1844.Field16502));
    private final Class44 Field12354 = this.Method23(new Class44("ToggleHeight", (Class42)this, Double.longBitsToDouble(4600877379321698714L), 0.0, 1.0, false).Method313(this::Method4096));
    private final Class44 Field12355 = this.Method23(new Class44("Packet", (Class42)this, false));
    private final Class44 Field12356 = this.Method23(new Class44("FeetBlocks", (Class42)this, false));
    private final Class44 Field12357 = this.Method23(new Class44("HeightLimit", (Class42)this, Double.longBitsToDouble((long)1510122399 ^ 0x407000005A02A39FL), 0.0, Double.longBitsToDouble((long)1734807809 ^ 0x4070000067671101L), true));
    private final Class44 Field12358 = this.Method23(new Class44("Down", (Class42)this, false));
    private final Class1996 Field12359 = this.Method24(new Class1996(new Class44("In Air", this)));
    private final Class44 Field12360 = this.Method23(this.Field12359.Method7405(new Class44("In Air", (Class42)this, false).Method355("State")));
    private final Class44 Field12361 = this.Method23(this.Field12359.Method7405(new Class44("In Air Motion Stop", (Class42)this, false).Method355("Motion Stop")));
    private final Class44 Field12362 = this.Method23(new Class44("BreakCrystals", (Class42)this, false));
    private final Class1996 Field12363 = this.Method24(new Class1996(new Class44("Crystal Breaker", this)));
    private final Class44 Field12364 = this.Method23(this.Field12363.Method7405(new Class44("CB Timings", (Class42)this, Class713.Field11035).Method355("Timings")));
    private final Class44 Field12365 = this.Method23(this.Field12363.Method7405(new Class44("CB Sequential Delay", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)939392141 ^ 0x4024000037FDFC8DL), true).Method355("Sequential Delay")));
    private final Class44 Field12366 = this.Method23(this.Field12363.Method7405(new Class44("CbMode", (Class42)this, "SurroundBlocks", Arrays.asList("SurroundBlocks", "Area")).Method355("Mode")));
    private final Class44 Field12367 = this.Method23(this.Field12363.Method7405(new Class44("CBRange", (Class42)this, Double.longBitsToDouble((long)546358188 ^ 0x400800002090C3ACL), 1.0, Double.longBitsToDouble(4618441417868443648L), false).Method313(this::Method4095).Method355("Range")));
    private final Class44 Field12368 = this.Method23(this.Field12363.Method7405(new Class44("CBDelay", (Class42)this, Double.longBitsToDouble((long)498491692 ^ 0x404E00001DB6612CL), 0.0, Double.longBitsToDouble(4647503709213818880L), true).Method355("Delay")));
    private final Class44 Field12369 = this.Method23(this.Field12363.Method7405(new Class44("CBRotate", (Class42)this, false).Method355("Rotate")));
    private final Class44 Field12370 = this.Method23(this.Field12363.Method7405(new Class44("CBRotateMode", (Class42)this, Class512.Field10160)).Method312(this.Field12369).Method355("Rotate Mode"));
    private final Class44 Field12371 = this.Method23(this.Field12363.Method7405(new Class44("CBPacket", (Class42)this, false).Method355("Packet")));
    private final Class44 Field12372 = this.Method23(this.Field12363.Method7405(new Class44("ClientSide", (Class42)this, false).Method355("Client Side")));
    private final Class44 Field12373 = this.Method23(this.Field12363.Method7405(new Class44("CbNoSuicide", (Class42)this, true).Method355("No Suicide")));
    private final Class44 Field12374 = this.Method23(this.Field12363.Method7405(new Class44("CbTerrain", (Class42)this, true).Method313(this.Field12373::Method365)));
    private final Class1303 Field12375 = this.Method25(new Class1303("Rotate", (Class42)this, Class135.Field8498));
    public static Class1008 Field12376;
    private final Class650 Field12377 = new Class650();
    private double Field12378 = Double.longBitsToDouble(-4616189618054758400L);
    private boolean Field12379 = false;
    private Function Field12380 = Class1008::Method4094;
    private final Queue Field12381 = new ConcurrentLinkedQueue();
    private int Field12382 = 0;
    private final Class618 Field12383 = new Class618(this::Method4091, new Predicate[0]);
    private final Class618 Field12384 = new Class618(this::Method4090, new Predicate[0]);
    private final Class618 Field12385 = new Class618(this::Method4089, new Predicate[0]);
    private final Class618 Field12386 = new Class618(this::Method4088, new Predicate[0]);
    private final Class618 Field12387 = new Class618(this::Method4087, new Predicate[0]);
    private String Field12388 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1008() {
        super("SurroundRewrite", Class97.Field8338, true);
        Field12376 = this;
    }

    @SubscribeEvent(priority=EventPriority.HIGH)
    @SubscribeEvent(priority=EventPriority.HIGH)
    public void Method4054(TickEvent tickEvent) {
        if (this.Field12330.Method341() != Class297.Field9293) {
            return;
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
            return;
        }
        this.Method4055();
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
        if (Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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
        if (Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field12330.Method341() != Class297.Field9292) {
            return;
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
        } else {
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

    /*
     * Exception decompiling
     */
    private void Method4057() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at the.bytecode.club.bytecodeviewer.decompilers.impl.CFRDecompiler.decompileToZip(CFRDecompiler.java:306)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.decompileSaveAll(ResourceDecompiling.java:262)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.lambda$decompileSaveAll$0(ResourceDecompiling.java:127)
         *     at java.base/java.lang.Thread.run(Thread.java:833)
         */
        throw new IllegalStateException("Decompilation failed");
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

    private void Method4058(List list) {
        if (!this.Field12377.Method2797(this.Field12368.Method335())) {
            return;
        }
        float[] fArray = new float[]{Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch};
        HashSet<EntityEnderCrystal> hashSet = new HashSet<EntityEnderCrystal>(64);
        if (this.Field12366.Method359().equals("Area")) {
            double d = this.Field12367.Method367();
            double d2 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - d;
            double d3 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - d;
            double d4 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - d;
            double d5 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d;
            double d6 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d;
            double d7 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d;
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(d2, d3, d4, d5, d6, d7);
            Iterator iterator = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityEnderCrystal.class, axisAlignedBB).iterator();
            while (iterator.hasNext()) {
                EntityEnderCrystal entityEnderCrystal = (EntityEnderCrystal)iterator.next();
                if (!this.Method4059(entityEnderCrystal)) {
                    return;
                }
                this.Method4060(entityEnderCrystal, fArray);
            }
            return;
        }
        Iterator iterator = list.iterator();
        block1: while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            Iterator iterator2 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityEnderCrystal.class, new AxisAlignedBB(blockPos)).iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block1;
                EntityEnderCrystal entityEnderCrystal = (EntityEnderCrystal)iterator2.next();
                if (hashSet.contains(entityEnderCrystal) || !this.Method4059(entityEnderCrystal)) continue;
                this.Method4060(entityEnderCrystal, fArray);
                hashSet.add(entityEnderCrystal);
            }
            break;
        }
        return;
    }

    private boolean Method4059(EntityEnderCrystal entityEnderCrystal) {
        if (this.Field12364.Method309("Sequential") && entityEnderCrystal.ticksExisted < this.Field12365.Method335()) {
            return false;
        }
        if (!this.Field12373.Method365()) {
            return true;
        }
        float f = Class2155.Method7759((World)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ, (Entity)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field12374.Method365());
        if (!(f < Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount())) return false;
        return true;
    }

    private void Method4060(EntityEnderCrystal entityEnderCrystal, float[] fArray) {
        if (this.Field12369.Method365()) {
            float[] fArray2 = Class1568.Method6179((Entity)entityEnderCrystal);
            this.Method4061(fArray2);
        }
        if (this.Field12371.Method365()) {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)entityEnderCrystal));
        } else {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.attackEntity((EntityPlayer)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (Entity)entityEnderCrystal);
        }
        Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
        if (this.Field12372.Method365()) {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(entityEnderCrystal.entityId);
        }
        if (!this.Field12369.Method365()) return;
        this.Method4061(fArray);
    }

    private void Method4061(float[] fArray) {
        if (this.Field12370.Method341() == Class512.Field10160 || this.Field12370.Method341() == Class512.Field10161) {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0], fArray[1], Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        }
        if (this.Field12370.Method341() != Class512.Field10159) {
            if (this.Field12370.Method341() != Class512.Field10161) return;
        }
        Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray[0];
        Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray[1];
    }

    private BlockPos Method4062(BlockPos blockPos) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        if (((IBlockState)this.Field12380.apply(blockPos.north().down())).getMaterial().isSolid()) {
            arrayList.add(blockPos.north());
        }
        if (((IBlockState)this.Field12380.apply(blockPos.east().down())).getMaterial().isSolid()) {
            arrayList.add(blockPos.east());
        }
        if (((IBlockState)this.Field12380.apply(blockPos.south().down())).getMaterial().isSolid()) {
            arrayList.add(blockPos.south());
        }
        if (!((IBlockState)this.Field12380.apply(blockPos.west().down())).getMaterial().isSolid()) return arrayList.stream().min(Comparator.comparingDouble(Class1008::Method4092)).orElse(null);
        arrayList.add(blockPos.west());
        return arrayList.stream().min(Comparator.comparingDouble(Class1008::Method4092)).orElse(null);
    }

    private boolean Method4063() {
        if (!this.Field12344.Method365()) {
            this.Method4064(new BlockPos(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
            return true;
        }
        BlockPos blockPos = new BlockPos(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (this.Method4081(blockPos)) {
            blockPos = this.Method4062(blockPos);
        }
        if (blockPos == null) {
            return false;
        }
        this.Method4064(blockPos);
        return true;
    }

    private void Method4064(BlockPos blockPos) {
        Vec3d vec3d = new Vec3d((double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
        Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(vec3d.x, vec3d.y, vec3d.z, true));
        Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(vec3d.x, vec3d.y, vec3d.z);
    }

    private void Method4065(List list) {
        Item item;
        ItemStack itemStack;
        int n = this.Method4070();
        if (n == -1) {
            return;
        }
        int n2 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (this.Field12341.Method341() == Class1896.Field16720) {
            Block block;
            itemStack = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n2);
            item = itemStack.getItem();
            if (!(item instanceof ItemBlock)) {
                return;
            }
            Block block2 = ((ItemBlock)item).getBlock();
            if (block2 != (block = this.Method4071())) {
                return;
            }
        }
        itemStack = list.iterator();
        while (itemStack.hasNext()) {
            item = (BlockPos)itemStack.next();
            if (item.getY() > this.Field12357.Method335() || !this.Method4081((BlockPos)item) || this.Method4069((BlockPos)item) || this.Field12333.Method365() && Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((BlockPos)item) > this.Field12334.Method367()) continue;
            ((Class1896)this.Field12341.Method341()).Method7027(n, false, Class1661.Field15734);
            Class1036.Method4209((BlockPos)item, EnumHand.MAIN_HAND, (Class135)this.Field12375.Method341(), this.Field12355.Method365());
            ((Class1896)this.Field12341.Method341()).Method7027(n2, true, Class1661.Field15734);
        }
    }

    private void Method4066(Class544 class544) {
        if (!this.Field12350.Method365()) {
            return;
        }
        if (!(class544.Method982() instanceof SPacketBlockChange)) {
            return;
        }
        SPacketBlockChange sPacketBlockChange = (SPacketBlockChange)class544.Method982();
        BlockPos blockPos = sPacketBlockChange.getBlockPosition();
        if (!sPacketBlockChange.getBlockState().getBlock().isReplaceable((IBlockAccess)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return;
        }
        List list = ((Class1553)this.Field12332.Method341()).Method6126();
        if (!list.contains(blockPos)) {
            return;
        }
        if (this.Field12351.Method365()) {
            this.Field12380 = arg_0 -> Class1008.Method4086(list, arg_0);
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
        } else {
            this.Method4055();
        }
        this.Field12380 = Class1008::Method4085;
    }

    private boolean Method4067(Vec3d vec3d, List list) {
        BlockPos blockPos;
        Iterator iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (!new AxisAlignedBB(blockPos = (BlockPos)iterator.next()).contains(vec3d));
        return true;
    }

    private boolean Method4068(AxisAlignedBB axisAlignedBB, List list) {
        BlockPos blockPos;
        Iterator iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (!new AxisAlignedBB(blockPos = (BlockPos)iterator.next()).intersects(axisAlignedBB));
        return true;
    }

    private boolean Method4069(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return true;
        }
        return false;
    }

    private int Method4070() {
        int n = Class9.Method127(Blocks.OBSIDIAN);
        int n2 = Class9.Method127(Blocks.ENDER_CHEST);
        if (this.Field12338.Method309("Obsidian")) {
            this.Field12379 = this.Field12339.Method365() && n == -1;
            return n;
        }
        this.Field12379 = !this.Field12339.Method365() && n2 != 1;
        return n;
    }

    private Block Method4071() {
        if (!this.Field12338.Method359().equals("Obsidian")) return Blocks.ENDER_CHEST;
        return Blocks.OBSIDIAN;
    }

    private List Method4072() {
        if (!this.Field12336.Method365()) return this.Method4073();
        return this.Method4074();
    }

    private List Method4073() {
        List list = this.Method4078((Entity)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(16);
        if (this.Field12356.Method365()) {
            arrayList.addAll(this.Method4079((Entity)Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, -1));
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            List list2 = this.Method4075(blockPos);
            arrayList.addAll(list2);
            arrayList.add(blockPos);
        }
        return arrayList;
    }

    private List Method4074() {
        List list;
        Object object2;
        List list2 = this.Method4073();
        List list3 = new ArrayList();
        Class clazz = this.Field12337.Method365() ? Entity.class : EntityPlayer.class;
        for (Object object2 : list2) {
            list = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(clazz, new AxisAlignedBB((BlockPos)object2));
            if (list3.isEmpty()) {
                list3 = Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityPlayer.class, new AxisAlignedBB(object2.down()));
            }
            list3.addAll(list);
        }
        ArrayList arrayList = new ArrayList(list2);
        object2 = list3.iterator();
        while (object2.hasNext()) {
            Object object3;
            Object object42;
            list = (Entity)object2.next();
            if (list.equals(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) continue;
            List list4 = this.Method4078((Entity)list, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
            ArrayList<BlockPos> arrayList2 = new ArrayList<BlockPos>(16);
            if (this.Field12356.Method365()) {
                arrayList2.addAll(this.Method4079((Entity)list, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, -1));
            }
            for (Object object42 : list4) {
                object3 = this.Method4075((BlockPos)object42);
                arrayList2.addAll((Collection<BlockPos>)object3);
                arrayList2.add((BlockPos)object42);
            }
            ArrayList arrayList3 = new ArrayList(list3);
            arrayList3.add(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            object42 = new ArrayList();
            object3 = arrayList3.iterator();
            while (object3.hasNext()) {
                Entity entity = (Entity)object3.next();
                List list5 = this.Method4079(entity, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, 0);
                for (BlockPos blockPos : arrayList2) {
                    if (!list5.contains(blockPos)) continue;
                    object42.add(blockPos);
                }
            }
            arrayList2.removeAll((Collection<?>)object42);
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    private List Method4075(BlockPos blockPos) {
        if (!this.Field12345.Method365()) return Collections.singletonList(blockPos.down());
        if (Class1036.Method4213(blockPos).isEmpty()) return Collections.singletonList(blockPos.down());
        return Collections.emptyList();
    }

    private List Method4076() {
        List list = this.Method4077(0);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(16);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            BlockPos blockPos2 = blockPos.north();
            BlockPos blockPos3 = blockPos.east();
            BlockPos blockPos4 = blockPos.south();
            BlockPos blockPos5 = blockPos.west();
            if (!list.contains(blockPos2)) {
                arrayList.add(blockPos2);
            }
            if (!list.contains(blockPos3)) {
                arrayList.add(blockPos3);
            }
            if (!list.contains(blockPos4)) {
                arrayList.add(blockPos4);
            }
            if (!list.contains(blockPos5)) {
                arrayList.add(blockPos5);
            }
            if (!this.Field12335.Method365() && (!this.Field12340.Method365() || !this.Field12379)) continue;
            BlockPos blockPos6 = blockPos.north().west();
            BlockPos blockPos7 = blockPos.north().east();
            BlockPos blockPos8 = blockPos.south().east();
            BlockPos blockPos9 = blockPos.south().west();
            if (!list.contains(blockPos6)) {
                arrayList.add(blockPos6);
            }
            if (!list.contains(blockPos7)) {
                arrayList.add(blockPos7);
            }
            if (!list.contains(blockPos8)) {
                arrayList.add(blockPos8);
            }
            if (list.contains(blockPos9)) continue;
            arrayList.add(blockPos9);
        }
        return arrayList;
    }

    private List Method4077(int n) {
        ArrayList arrayList = new ArrayList(16);
        Vec3d vec3d = new Vec3d(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)186990098 ^ 0x3FD3333338160D21L), Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(0x3FD3333333333333L));
        Vec3d vec3d2 = new Vec3d(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble(0x3FD3333333333333L), Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(0x3FD3333333333333L));
        Vec3d vec3d3 = new Vec3d(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble(0x3FD3333333333333L), Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble((long)489767483 ^ 0x3FD333332E027108L));
        Vec3d vec3d4 = new Vec3d(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble(0x3FD3333333333333L), Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble((long)928587478 ^ 0x3FD33333046A2DE5L));
        this.Method4080(vec3d, arrayList);
        this.Method4080(vec3d2, arrayList);
        this.Method4080(vec3d3, arrayList);
        this.Method4080(vec3d4, arrayList);
        return arrayList;
    }

    private List Method4078(Entity entity, double d) {
        List list = this.Method4079(entity, d, 0);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(16);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            BlockPos blockPos2 = blockPos.north();
            BlockPos blockPos3 = blockPos.east();
            BlockPos blockPos4 = blockPos.south();
            BlockPos blockPos5 = blockPos.west();
            if (!list.contains(blockPos2)) {
                arrayList.add(blockPos2);
            }
            if (!list.contains(blockPos3)) {
                arrayList.add(blockPos3);
            }
            if (!list.contains(blockPos4)) {
                arrayList.add(blockPos4);
            }
            if (!list.contains(blockPos5)) {
                arrayList.add(blockPos5);
            }
            if (!this.Field12335.Method365() && (!this.Field12340.Method365() || !this.Field12379)) continue;
            BlockPos blockPos6 = blockPos.north().west();
            BlockPos blockPos7 = blockPos.north().east();
            BlockPos blockPos8 = blockPos.south().east();
            BlockPos blockPos9 = blockPos.south().west();
            if (!list.contains(blockPos6)) {
                arrayList.add(blockPos6);
            }
            if (!list.contains(blockPos7)) {
                arrayList.add(blockPos7);
            }
            if (!list.contains(blockPos8)) {
                arrayList.add(blockPos8);
            }
            if (list.contains(blockPos9)) continue;
            arrayList.add(blockPos9);
        }
        return arrayList;
    }

    public List Method4079(Entity entity, double d, int n) {
        ArrayList arrayList = new ArrayList(16);
        AxisAlignedBB axisAlignedBB = entity.getEntityBoundingBox();
        double d2 = (axisAlignedBB.maxX - axisAlignedBB.minX) / Double.longBitsToDouble(0x4000000000000000L);
        double d3 = (axisAlignedBB.maxZ - axisAlignedBB.minZ) / Double.longBitsToDouble((long)228445347 ^ 0x400000000D9DCCA3L);
        Vec3d vec3d = new Vec3d(entity.posX + d2, d + (double)n, entity.posZ + d3);
        Vec3d vec3d2 = new Vec3d(entity.posX + d2, d + (double)n, entity.posZ - d3);
        Vec3d vec3d3 = new Vec3d(entity.posX - d2, d + (double)n, entity.posZ + d3);
        Vec3d vec3d4 = new Vec3d(entity.posX - d2, d + (double)n, entity.posZ - d3);
        this.Method4080(vec3d, arrayList);
        this.Method4080(vec3d2, arrayList);
        this.Method4080(vec3d3, arrayList);
        this.Method4080(vec3d4, arrayList);
        return arrayList;
    }

    private void Method4080(Vec3d vec3d, List list) {
        BlockPos blockPos = new BlockPos(vec3d);
        if (!this.Method4081(blockPos)) return;
        if (list.contains(blockPos)) return;
        list.add(blockPos);
    }

    private boolean Method4081(BlockPos blockPos) {
        if (blockPos == null) return false;
        if (Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return false;
        if (!((IBlockState)this.Field12380.apply(blockPos)).getMaterial().isReplaceable()) return false;
        return true;
    }

    private List Method4082() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(16);
        arrayList.addAll(Class1553.Field15244.Method6126());
        BlockPos blockPos = new BlockPos(Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        List list = this.Method4083(blockPos.up());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Class671 class671 = (Class671)iterator.next();
            BlockPos blockPos2 = class671.Method2856();
            BlockPos blockPos3 = blockPos2.up();
            BlockPos blockPos4 = blockPos2.offset(class671.Method2857());
            if (this.Method4084(blockPos3) == Blocks.AIR) {
                arrayList.add(blockPos2);
                continue;
            }
            if (this.Method4084(blockPos4) != Blocks.AIR) continue;
            arrayList.add(blockPos2);
        }
        return arrayList;
    }

    private List Method4083(BlockPos blockPos) {
        ArrayList<Class671> arrayList = new ArrayList<Class671>(16);
        arrayList.add(new Class671(blockPos.north(), EnumFacing.NORTH));
        arrayList.add(new Class671(blockPos.east(), EnumFacing.EAST));
        arrayList.add(new Class671(blockPos.south(), EnumFacing.SOUTH));
        arrayList.add(new Class671(blockPos.west(), EnumFacing.WEST));
        return arrayList;
    }

    private Block Method4084(BlockPos blockPos) {
        return ((IBlockState)this.Field12380.apply(blockPos)).getBlock();
    }

    private static IBlockState Method4085(BlockPos blockPos) {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }

    private static IBlockState Method4086(List list, BlockPos blockPos) {
        if (list.contains(blockPos)) return Blocks.AIR.getDefaultState();
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }

    private void Method4087(Class603 class603) {
        if (!this.Field12349.Method365()) {
            return;
        }
        if (!(class603.Method982() instanceof SPacketDestroyEntities)) {
            return;
        }
        SPacketDestroyEntities sPacketDestroyEntities = (SPacketDestroyEntities)class603.Method982();
        for (int n : sPacketDestroyEntities.getEntityIDs()) {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(n);
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
            return;
        }
        this.Method4055();
    }

    private void Method4088(Class603 class603) {
        if (!this.Field12352.Method365()) {
            return;
        }
        this.Method4066(new Class544(class603.Method982()));
    }

    private void Method4089(Class544 class544) {
        if (this.Field12352.Method365()) {
            return;
        }
        this.Method4066(class544);
    }

    private void Method4090(Class125 class125) {
        if (!this.Field12346.Method365()) {
            return;
        }
        if (this.Field12348.Method341() == Class1858.Field16549) {
            return;
        }
        Class1858 class1858 = (Class1858)this.Field12348.Method341();
        Entity entity = class125.Method855();
        List list = ((Class1553)this.Field12332.Method341()).Method6126();
        if (!this.Method4068(entity.getEntityBoundingBox(), list)) {
            return;
        }
        if (class1858 == Class1858.Field16551 || class1858 == Class1858.Field16549) {
            entity.setDead();
        }
        if (class1858 == Class1858.Field16550 || class1858 == Class1858.Field16552) {
            Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntity(entity);
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
            return;
        }
        this.Method4055();
    }

    private void Method4091(Class544 class544) {
        List list;
        if (!this.Field12346.Method365()) {
            return;
        }
        if (!this.Field12347.Method365()) {
            return;
        }
        if (!(class544.Method982() instanceof SPacketSoundEffect)) {
            return;
        }
        SPacketSoundEffect sPacketSoundEffect = (SPacketSoundEffect)class544.Method982();
        if (sPacketSoundEffect.getSound() != SoundEvents.ENTITY_GENERIC_EXPLODE) {
            return;
        }
        Vec3d vec3d = new Vec3d(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ());
        if (!this.Method4067(vec3d, list = ((Class1553)this.Field12332.Method341()).Method6126())) {
            return;
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
            return;
        }
        this.Method4055();
    }

    private static double Method4092(BlockPos blockPos) {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getY(), (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
    }

    private static IBlockState Method4093(BlockPos blockPos) {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }

    private static IBlockState Method4094(BlockPos blockPos) {
        return Class1008.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }

    private Boolean Method4095() {
        return this.Field12366.Method359().equals("Area");
    }

    private Boolean Method4096() {
        boolean bl;
        if (this.Field12353.Method341() != Class1844.Field16504 && this.Field12353.Method341() != Class1844.Field16505) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
    }

    private Boolean Method4097() {
        boolean bl;
        if (this.Field12332.Method341() == Class1553.Field15251) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method4098() {
        boolean bl;
        if (this.Field12336.Method365() && this.Field12336.Method311()) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method4099() {
        boolean bl;
        if (this.Field12332.Method341() == Class1553.Field15251) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method4100() {
        boolean bl;
        if (this.Field12332.Method341() == Class1553.Field15251) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    static List Method4101(Class1008 class1008) {
        return class1008.Method4072();
    }

    static List Method4102(Class1008 class1008) {
        return class1008.Method4082();
    }

    static Class44 Method4103(Class1008 class1008) {
        return class1008.Field12356;
    }

    static Minecraft Method4104() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4105() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Class44 Method4106(Class1008 class1008) {
        return class1008.Field12358;
    }

    static Minecraft Method4107() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4108() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4109() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Class44 Method4110(Class1008 class1008) {
        return class1008.Field12345;
    }

    static Class44 Method4111(Class1008 class1008) {
        return class1008.Field12342;
    }

    static Minecraft Method4112() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4113() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4114() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4115() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4116() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4117() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4118() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4119() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 127;
            cArray2[n] = (char)(cArray[n] ^ (0x29FF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

