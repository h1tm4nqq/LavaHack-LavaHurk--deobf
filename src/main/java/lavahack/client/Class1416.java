//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketUseEntity$Action
 *  net.minecraft.network.play.server.SPacketSoundEffect
 *  net.minecraft.network.play.server.SPacketSpawnObject
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.event.entity.living.LivingEvent$LivingUpdateEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import com.kisman.cc.util.Class886;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import java.util.function.Supplier;
import lavahack.client.Class10;
import lavahack.client.Class1041;
import lavahack.client.Class1048;
import lavahack.client.Class1082;
import lavahack.client.Class113;
import lavahack.client.Class1241;
import lavahack.client.Class1271;
import lavahack.client.Class1274;
import lavahack.client.Class1285;
import lavahack.client.Class1303;
import lavahack.client.Class1310;
import lavahack.client.Class1324;
import lavahack.client.Class135;
import lavahack.client.Class1381;
import lavahack.client.Class1404;
import lavahack.client.Class1515;
import lavahack.client.Class1539;
import lavahack.client.Class1621;
import lavahack.client.Class1663;
import lavahack.client.Class1664;
import lavahack.client.Class1678;
import lavahack.client.Class1727;
import lavahack.client.Class1769;
import lavahack.client.Class1772;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1955;
import lavahack.client.Class1996;
import lavahack.client.Class2012;
import lavahack.client.Class204;
import lavahack.client.Class2051;
import lavahack.client.Class2084;
import lavahack.client.Class2086;
import lavahack.client.Class2149;
import lavahack.client.Class2155;
import lavahack.client.Class2160;
import lavahack.client.Class246;
import lavahack.client.Class355;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class464;
import lavahack.client.Class467;
import lavahack.client.Class47;
import lavahack.client.Class478;
import lavahack.client.Class499;
import lavahack.client.Class511;
import lavahack.client.Class533;
import lavahack.client.Class544;
import lavahack.client.Class56;
import lavahack.client.Class618;
import lavahack.client.Class714;
import lavahack.client.Class721;
import lavahack.client.Class726;
import lavahack.client.Class805;
import lavahack.client.Class885;
import lavahack.client.Class9;
import lavahack.client.Class97;
import lavahack.client.Class984;
import lavahack.client.Class99;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.network.play.server.SPacketSpawnObject;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Class2012
@Class99
public class Class1416
extends Class42 {
    private final Class44 Field14423 = this.Method23(new Class44("Mode", (Class42)this, Class984.Field12207));
    private final Class1996 Field14424 = this.Method24(new Class1996(new Class44("Main", this)));
    private final Class1996 Field14425 = this.Method24(new Class1996(new Class44("Ranges", this)));
    private final Class1996 Field14426 = this.Method24(new Class1996(new Class44("Calc", this)));
    private final Class1996 Field14427 = this.Method24(new Class1996(new Class44("Helpers", this)));
    private final Class1996 Field14428 = this.Method24(new Class1996(new Class44("Place", this)));
    private final Class1996 Field14429 = this.Method24(new Class1996(new Class44("Break", this)));
    private final Class1996 Field14430 = this.Method24(new Class1996(new Class44("Delay", this)));
    private final Class1996 Field14431 = this.Method24(new Class1996(new Class44("Damage", this)));
    private final Class1996 Field14432 = this.Method24(new Class1996(new Class44("Thread", this)));
    private final Class1996 Field14433 = this.Method24(new Class1996(new Class44("Render", this)));
    private final Class1996 Field14434 = this.Method24(new Class1996(new Class44("Optimization", this)));
    private final Class1996 Field14435 = this.Method24(this.Field14434.Method7406(new Class1996(new Class44("Multi Thread", this))));
    private final Class1996 Field14436 = this.Method24(this.Field14435.Method7406(new Class1996(new Class44("Getters", this))));
    public final Class44 Field14437 = this.Method23(this.Field14436.Method7405(new Class44("MT Sphere Getter", (Class42)this, false).Method355("Sphere")));
    public final Class44 Field14438 = this.Method23(this.Field14436.Method7405(new Class44("MT Target Getter", (Class42)this, false).Method355("Target")));
    private final Class44 Field14439 = this.Method23(this.Field14436.Method7405(new Class44("MT Crystal Getter", (Class42)this, false).Method355("Break Pos")));
    private final Class44 Field14440 = this.Method23(this.Field14435.Method7405(new Class44("MT Extrapolation", (Class42)this, true).Method355("Extrapolation")));
    private final Class44 Field14441 = this.Method23(this.Field14435.Method7405(new Class44("MT CG Delay", (Class42)this, Double.longBitsToDouble((long)1801805673 ^ 0x402E00006B655F69L), 0.0, Double.longBitsToDouble(4636737291354636288L), Class467.Field9943).Method355("Delay")));
    private final Class44 Field14442 = this.Method23(this.Field14434.Method7405(new Class44("Wall Range Usage", (Class42)this, true)));
    private final Class1996 Field14443 = this.Method24(this.Field14424.Method7406(new Class1996(new Class44("Stages", this))));
    private final Class44 Field14444 = this.Method23(this.Field14443.Method7405(new Class44("Calc Stage", (Class42)this, Class1310.Field14028).Method355("Calc")));
    private final Class44 Field14445 = this.Method23(this.Field14443.Method7405(new Class44("Logic Stage", (Class42)this, Class1310.Field14028).Method355("Logic")));
    public final Class44 Field14446 = this.Method23(this.Field14424.Method7405(new Class44("Lag Protect", (Class42)this, false)));
    public final Class44 Field14447 = this.Method23(this.Field14425.Method7405(new Class44("Place Range", (Class42)this, Double.longBitsToDouble(4618441417868443648L), 0.0, Double.longBitsToDouble(4618441417868443648L), false).Method355("Place")));
    private final Class44 Field14448 = this.Method23(this.Field14425.Method7405(new Class44("Place Wall Range", (Class42)this, Double.longBitsToDouble(4616752568008179712L), 0.0, Double.longBitsToDouble((long)2045123838 ^ 0x4018000079E61CFEL), false).Method355("Place Wall")));
    private final Class44 Field14449 = this.Method23(this.Field14425.Method7405(new Class44("Break Range", (Class42)this, Double.longBitsToDouble(4618441417868443648L), 0.0, Double.longBitsToDouble(4618441417868443648L), false).Method355("Break")));
    private final Class44 Field14450 = this.Method23(this.Field14425.Method7405(new Class44("Break Wall Range", (Class42)this, Double.longBitsToDouble((long)1338944155 ^ 0x401200004FCEAA9BL), 0.0, Double.longBitsToDouble(4618441417868443648L), false).Method355("Break Wall")));
    public final Class44 Field14451 = this.Method23(this.Field14425.Method7405(new Class44("Target Range", (Class42)this, Double.longBitsToDouble(0x4022000000000000L), 0.0, Double.longBitsToDouble(0x4034000000000000L), false).Method355("Target")));
    private final Class44 Field14452 = this.Method23(this.Field14424.Method7405(new Class44("Logic", (Class42)this, Class1678.Field15814)));
    public final Class1303 Field14453 = new Class1303("Target Logic", (Class42)this, Class1727.Field15929).Method5304(this.Field14424).Method5303();
    public final Class44 Field14454 = this.Method23(this.Field14424.Method7405(new Class44("Terrain", (Class42)this, false)));
    private final Class44 Field14455 = this.Method23(this.Field14424.Method7405(new Class44("Switch", (Class42)this, Class113.Field8392)));
    private final Class44 Field14456 = this.Method23(this.Field14426.Method7405(new Class44("Fast Calc", (Class42)this, true)));
    private final Class44 Field14457 = this.Method23(this.Field14426.Method7405(new Class44("Heuristic", (Class42)this, Class1664.Field15749)));
    private final Class44 Field14458 = this.Method23(this.Field14426.Method7405(new Class44("Safety Balance", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4034000000000000L), false)));
    private final Class44 Field14459 = this.Method23(this.Field14426.Method7405(new Class44("Safety Scale", (Class42)this, 1.0, 0.0, 1.0, false)));
    private final Class1996 Field14460 = this.Method24(new Class1996(new Class44("Motion", this)));
    private final Class44 Field14461 = this.Method23(this.Field14460.Method7405(new Class44("Motion Crystal", (Class42)this, false).Method355("State")));
    private final Class44 Field14462 = this.Method23(this.Field14460.Method7405(new Class44("Motion Calc", (Class42)this, false).Method313(this.Field14461::Method365)).Method355("Calc"));
    private final Class44 Field14463 = this.Method23(this.Field14427.Method7405(new Class44("Timings", (Class42)this, Class1539.Field15185)));
    private final Class44 Field14464 = this.Method23(this.Field14427.Method7405(new Class44("Advanced Sequential", (Class42)this, false).Method355("Advaned Seq")));
    private final Class44 Field14465 = this.Method23(this.Field14424.Method7405(new Class44("Swing", (Class42)this, Class1241.Field13628)));
    private final Class44 Field14466 = this.Method23(this.Field14424.Method7405(new Class44("Swing Logic", (Class42)this, Class2084.Field17518).Method313(this::Method5664)));
    private final Class44 Field14467 = this.Method23(this.Field14427.Method7405(new Class44("Instant", (Class42)this, true)));
    private final Class44 Field14468 = this.Method23(this.Field14427.Method7405(new Class44("Instant Calc", (Class42)this, true).Method313(this.Field14467::Method365)));
    private final Class44 Field14469 = this.Method23(this.Field14427.Method7405(new Class44("Instant Rotate", (Class42)this, true).Method313(this.Field14467::Method365)));
    private final Class44 Field14470 = this.Method23(this.Field14427.Method7405(new Class44("Inhibit", (Class42)this, false)));
    private final Class44 Field14471 = this.Method23(this.Field14427.Method7405(new Class44("Sound", (Class42)this, false)));
    public final Class44 Field14472 = this.Method23(this.Field14427.Method7405(new Class44("Sync", (Class42)this, false)));
    private final Class44 Field14473 = this.Method23(this.Field14427.Method7405(new Class44("Sync Mode", (Class42)this, Class2149.Field17836).Method355("Sync")));
    private final Class44 Field14474 = this.Method23(this.Field14427.Method7405(new Class44("Rotate", (Class42)this, Class464.Field9926)));
    private final Class1303 Field14475 = new Class1303("Rotate Mode", (Class42)this, Class135.Field8498).Method5301(this::Method5663).Method5304(this.Field14427).Method5303();
    private final Class44 Field14476 = this.Method23(this.Field14427.Method7405(new Class44("Calc Dist Sort", (Class42)this, false)));
    private final Class246 Field14477 = ((Class246)new Class246(this).Method772(this.Field14427)).Method1330().Method1331();
    private final Class44 Field14478 = this.Method23(this.Field14477.Method1328().Method7405(new Class44("Damage Sync Place", (Class42)this, Class499.Field10076).Method355("Place")));
    private final Class44 Field14479 = this.Method23(this.Field14477.Method1328().Method7405(new Class44("Damage Sync Break", (Class42)this, Class499.Field10076).Method355("Break")));
    private final Class44 Field14480 = this.Method23(this.Field14477.Method1328().Method7405(new Class44("Damage Sync Self", (Class42)this, false).Method355("Self")));
    private final Class1996 Field14481 = this.Method24(this.Field14427.Method7406(new Class1996(new Class44("Extrapolation", this))));
    private final Class44 Field14482 = this.Method23(this.Field14481.Method7405(new Class44("Extrapolation State", (Class42)this, false).Method355("State")));
    private final Class44 Field14483 = this.Method23(this.Field14481.Method7405(new Class44("Extrapolation Self", (Class42)this, false).Method355("Self")));
    private final Class44 Field14484 = this.Method23(this.Field14481.Method7405(new Class44("Extrapolation Ticks", (Class42)this, 1.0, 1.0, Double.longBitsToDouble(0x4049000000000000L), true).Method355("Ticks")));
    private final Class44 Field14485 = this.Method23(this.Field14481.Method7405(new Class44("Extrapolation Out Of Blocks", (Class42)this, false).Method355("Out Of Blocks")));
    private final Class44 Field14486 = this.Method23(this.Field14481.Method7405(new Class44("Extrapolation Shrink", (Class42)this, false).Method355("Shrink")));
    private final Class44 Field14487 = this.Method23(this.Field14481.Method7405(new Class44("Extrapolation Render", (Class42)this, false).Method355("Render")));
    private final Class44 Field14488 = this.Method23(this.Field14428.Method7405(new Class44("Place", (Class42)this, true)));
    public final Class44 Field14489 = this.Method23(this.Field14428.Method7405(new Class44("Second Check", (Class42)this, false)));
    public final Class44 Field14490 = this.Method23(this.Field14428.Method7405(new Class44("Third Check", (Class42)this, false)));
    private final Class44 Field14491 = this.Method23(this.Field14428.Method7405(new Class44("Fourth Check", (Class42)this, false)));
    private final Class44 Field14492 = this.Method23(this.Field14428.Method7405(new Class44("Multi Place", (Class42)this, Class1772.Field16121).Method355("Multi")));
    public final Class44 Field14493 = this.Method23(this.Field14428.Method7405(new Class44("Fire Place", (Class42)this, false).Method355("Fire")));
    private final Class44 Field14494 = this.Method23(this.Field14428.Method7405(new Class44("Packet Place", (Class42)this, true).Method355("Packet")));
    private final Class44 Field14495 = this.Method23(this.Field14428.Method7405(new Class44("1.13+ Place", (Class42)this, false).Method355("1.13+")));
    private final Class44 Field14496 = this.Method23(this.Field14428.Method7405(new Class44("1.13 Entities", (Class42)this, false)));
    private final Class44 Field14497 = this.Method23(this.Field14428.Method7405(new Class44("Feet Replacer", (Class42)this, false)));
    private final Class1996 Field14498 = this.Method24(this.Field14428.Method7406(new Class1996(new Class44("Face", this))));
    private final Class44 Field14499 = this.Method23(this.Field14498.Method7405(new Class44("Face Place", (Class42)this, Class355.Field9479).Method355("Mode")));
    private final Class1996 Field14500 = this.Method24(this.Field14498.Method7406(new Class1996(new Class44("Triggers", this))));
    private final Class1996 Field14501 = this.Method24(this.Field14500.Method7406(new Class1996(new Class44("Armor", this))));
    private final Class44 Field14502 = this.Method23(this.Field14501.Method7405(new Class44("Armor Breaker State", (Class42)this, false).Method355("State")));
    public final Class44 Field14503 = this.Method23(this.Field14501.Method7405(new Class44("Armor Breaker", (Class42)this, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble(4636737291354636288L), Class467.Field9942).Method355("Value")));
    private final Class1996 Field14504 = this.Method24(this.Field14500.Method7406(new Class1996(new Class44("Damage", this))));
    private final Class44 Field14505 = this.Method23(this.Field14504.Method7405(new Class44("Min Damage State", (Class42)this, false).Method355("State")));
    private final Class44 Field14506 = this.Method23(this.Field14504.Method7405(new Class44("Min Face Place DMG", (Class42)this, Double.longBitsToDouble((long)741554647 ^ 0x401C00002C3339D7L), 1.0, Double.longBitsToDouble(4630404104378646528L), true).Method355("Min")));
    private final Class44 Field14507 = this.Method23(this.Field14428.Method7405(new Class44("Ray Trace", (Class42)this, false)));
    private final Class44 Field14508 = this.Method23(this.Field14429.Method7405(new Class44("Break", (Class42)this, true)));
    private final Class44 Field14509 = this.Method23(this.Field14429.Method7405(new Class44("Break Priority", (Class42)this, Class47.Field8132).Method355("Priority").Method313(this.Field14508::Method365)));
    private final Class44 Field14510 = this.Method23(this.Field14429.Method7405(new Class44("Friend", (Class42)this, Class10.Field7866).Method313(this.Field14508::Method365)));
    private final Class44 Field14511 = this.Method23(this.Field14429.Method7405(new Class44("Client Side", (Class42)this, Class1381.Field14258).Method313(this.Field14508::Method365)));
    private final Class44 Field14512 = this.Method23(this.Field14429.Method7405(new Class44("Client Side On", (Class42)this, Class1663.Field15744).Method313(this.Field14508::Method365)));
    private final Class44 Field14513 = this.Method23(this.Field14429.Method7405(new Class44("Manual Breaker", (Class42)this, false).Method355("Manual").Method313(this.Field14508::Method365)));
    private final Class44 Field14514 = this.Method23(this.Field14429.Method7405(new Class44("Remove After Attack", (Class42)this, false).Method313(this.Field14508::Method365)));
    private final Class44 Field14515 = this.Method23(this.Field14429.Method7405(new Class44("Anti Cev Breaker", (Class42)this, Class56.Field8174).Method355("Anti Cev Break").Method313(this.Field14508::Method365)));
    private final Class44 Field14516 = this.Method23(this.Field14429.Method7405(new Class44("Packet Break", (Class42)this, false).Method355("Packet").Method313(this.Field14508::Method365)));
    private final Class44 Field14517 = this.Method23(this.Field14430.Method7405(new Class44("Delay Mode", (Class42)this, Class1324.Field14066).Method355("Mode")));
    private final Class44 Field14518 = this.Method23(this.Field14430.Method7405(new Class44("Ping Smart Multi", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4008000000000000L), false)));
    private final Class1996 Field14519 = this.Method24(this.Field14430.Method7406(new Class1996(new Class44("Default", this))));
    private final Class44 Field14520 = this.Method23(this.Field14519.Method7405(new Class44("Place Delay", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)1492293898 ^ 0x409F400058F2990AL), Class467.Field9943).Method355("Place")));
    private final Class44 Field14521 = this.Method23(this.Field14519.Method7405(new Class44("Break Delay", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)730179817 ^ 0x409F40002B85A8E9L), Class467.Field9943).Method355("Break")));
    private final Class1996 Field14522 = this.Method24(this.Field14430.Method7406(new Class1996(new Class44("From To", this))));
    private final Class44 Field14523 = this.Method23(this.Field14522.Method7405(new Class44("From Place To Break Delay", (Class42)this, Double.longBitsToDouble((long)165996328 ^ 0x4049000009E4E728L), 0.0, Double.longBitsToDouble((long)1745749499 ^ 0x409F4000680E05FBL), Class467.Field9943).Method355("From P To B")));
    private final Class44 Field14524 = this.Method23(this.Field14522.Method7405(new Class44("From Place To Break Delay", (Class42)this, Double.longBitsToDouble(0x4049000000000000L), 0.0, Double.longBitsToDouble((long)1512545435 ^ 0x409F40005A279C9BL), Class467.Field9943).Method355("From B To P")));
    private final Class44 Field14525 = this.Method23(this.Field14430.Method7405(new Class44("Calc Delay", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4671226772094713856L), Class467.Field9943).Method355("Calc")));
    private final Class44 Field14526 = this.Method23(this.Field14430.Method7405(new Class44("Clear Delay", (Class42)this, Double.longBitsToDouble((long)1932355819 ^ 0x407F4000732D68EBL), 0.0, Double.longBitsToDouble(4656510908468559872L), Class467.Field9943).Method355("Clear")));
    private final Class1996 Field14527 = this.Method24(this.Field14430.Method7406(new Class1996(new Class44("Sequential", this))));
    private final Class44 Field14528 = this.Method23(this.Field14527.Method7405(new Class44("Sequential Break Delay", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4034000000000000L), true).Method355("Break")));
    private final Class44 Field14529 = this.Method23(this.Field14430.Method7405(new Class44("Multiplication", (Class42)this, 1.0, 1.0, Double.longBitsToDouble((long)286275506 ^ 0x40240000111037B2L), true).Method355("Multi")));
    public final Class44 Field14530 = this.Method23(this.Field14431.Method7405(new Class44("Min DMG", (Class42)this, Double.longBitsToDouble(4618441417868443648L), 0.0, Double.longBitsToDouble(4630404104378646528L), true).Method355("Min")));
    public final Class44 Field14531 = this.Method23(this.Field14431.Method7405(new Class44("Max Self DMG", (Class42)this, Double.longBitsToDouble((long)1418939140 ^ 0x4032000054934B04L), 0.0, Double.longBitsToDouble((long)1117540571 ^ 0x40428000429C50DBL), true).Method355("Max Self")));
    private final Class44 Field14532 = this.Method23(this.Field14431.Method7405(new Class44("Max Friend DMG", (Class42)this, Double.longBitsToDouble((long)1850541711 ^ 0x402400006E4D068FL), 0.0, Double.longBitsToDouble(4630404104378646528L), true).Method355("Max Friend")));
    public final Class44 Field14533 = this.Method23(this.Field14431.Method7405(new Class44("Lethal Mult", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)1828070173 ^ 0x401800006CF6231DL), false)));
    private final Class44 Field14534 = this.Method23(this.Field14431.Method7405(new Class44("No Suicide", (Class42)this, true)));
    public final Class44 Field14535 = this.Method23(this.Field14432.Method7405(new Class44("Thread Mode", (Class42)this, Class1041.Field12586).Method355("Mode")));
    public final Class44 Field14536 = this.Method23(this.Field14432.Method7405(new Class44("Thread Delay", (Class42)this, Double.longBitsToDouble(0x4049000000000000L), 1.0, Double.longBitsToDouble((long)367874217 ^ 0x408F400015ED50A9L), Class467.Field9943).Method355("Delay").Method313(this::Method5662)));
    public final Class44 Field14537 = this.Method23(this.Field14432.Method7405(new Class44("Thread Syns", (Class42)this, true).Method355("Sync").Method313(this::Method5661)));
    public final Class44 Field14538 = this.Method23(this.Field14432.Method7405(new Class44("Thread Syns Value", (Class42)this, Double.longBitsToDouble((long)982976691 ^ 0x408F40003A9708B3L), 1.0, Double.longBitsToDouble((long)982553255 ^ 0x40C388003A9092A7L), Class467.Field9943).Method355("Sync Delay").Method313(this::Method5660)));
    private final Class44 Field14539 = this.Method23(this.Field14432.Method7405(new Class44("Thread Packet Rots", (Class42)this, false).Method355("Rotations").Method313(this::Method5659)));
    private final Class44 Field14540 = this.Method23(this.Field14432.Method7405(new Class44("Thread Sound Player", (Class42)this, Double.longBitsToDouble((long)1636857095 ^ 0x4018000061907507L), 0.0, Double.longBitsToDouble(4622945017495814144L), true).Method355("Sound Player").Method313(this::Method5658)));
    private final Class44 Field14541 = this.Method23(this.Field14432.Method7405(new Class44("Thread Calc", (Class42)this, true).Method355("Calc").Method313(this::Method5657)));
    private final Class1515 Field14542 = new Class1515(this).Method6046(this.Field14433).Method6042().Method6043();
    private final Class44 Field14543 = this.Method23(this.Field14433.Method7405(new Class44("Text", (Class42)this, true)));
    public static Class1416 Field14544;
    public final List Field14545 = new ArrayList();
    private final Class650 Field14546 = new Class650();
    private final Class650 Field14547 = new Class650();
    private final Class650 Field14548 = new Class650();
    private final Class650 Field14549 = new Class650();
    private final Class650 Field14550 = new Class650();
    private final Class650 Field14551 = new Class650();
    private final Class650 Field14552 = new Class650();
    private final Class650 Field14553 = new Class650();
    private final Class650 Field14554 = new Class650();
    private ScheduledExecutorService Field14555;
    private final AtomicBoolean Field14556 = new AtomicBoolean(false);
    private final AtomicBoolean Field14557 = new AtomicBoolean(false);
    @Class1274
    public static EntityPlayer Field14558;
    private Thread Field14559;
    public Class204 Field14560 = new Class204(null, null, 0.0f, 0.0f, null, null, null);
    public Class204 Field14561;
    private Class885 Field14562 = new Class885(null, 0.0f, 0.0f, false);
    private Entity Field14563 = null;
    public boolean Field14564;
    private String Field14565 = this.Field14535.Method359();
    private boolean Field14566 = false;
    private BlockPos Field14567 = null;
    public final Supplier Field14568 = this::Method5656;
    private final Class1285 Field14569 = new Class1285(this.Field14441.Method395(), this.Field14440.Method397(), this.Field14484.Method392(), this.Field14485.Method397(), this.Field14486.Method397());
    private final Class2086 Field14570 = new Class2086(this.Field14477.Method1329(), this::Method5655, this::Method5654);
    private final Class511 Field14571 = new Class511(this.Field14441.Method395(), this.Field14439.Method397());
    private final Class714 Field14572 = new Class714();
    @Class1801
    private final Class618 Field14573 = new Class618(this::Method5652, new Predicate[0]);
    @Class1801
    private final Class618 Field14574 = new Class618(this::Method5651, new Predicate[0]);
    @Class1801
    private final Class618 Field14575 = new Class618(this::Method5650, new Predicate[0]);
    private String Field14576 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1416() {
        super("AutoRer", Class97.Field8338);
        super.Method44(Class1416::Method5653);
        Field14544 = this;
    }

    private void Method5587() {
        if (this.Field14551.Method2797(this.Field14526.Method369())) {
            this.Field14545.clear();
            this.Field14551.Method2801();
            this.Field14566 = true;
        }
        if (!this.Field14565.equalsIgnoreCase(this.Field14535.Method359())) {
            if (this.Field14555 != null) {
                this.Field14555.shutdown();
            }
            if (this.Field14559 != null) {
                this.Field14556.set(true);
            }
            this.Field14565 = this.Field14535.Method359();
        }
        if (Field14558 == null) {
            this.Field14560.Method1204(null);
            this.Field14562 = null;
            return;
        }
        this.Method5615();
        this.Method5635();
    }

    private void Method5588() {
        if (!this.Field14488.Method365()) return;
        if (!this.Method5598(false).Method2797(this.Method5599(false))) return;
        if (this.Field14560.Method1203() == null) {
            if (this.Field14456.Method365()) return;
        }
        if (this.Method5621()) return;
        if (this.Field14560.Method1203() == null) return;
        if (!this.Method5597(this.Field14560.Method1203()).getBlock().equals(Blocks.OBSIDIAN)) {
            if (!this.Method5597(this.Field14560.Method1203()).getBlock().equals(Blocks.BEDROCK)) return;
        }
        if (this.Field14472.Method365()) {
            if (this.Field14545.contains(this.Field14560)) return;
        }
        if (!((Boolean)this.Field14570.Method7623(this.Field14560.Method1207(), (Entity)Field14558).Method6307()).booleanValue()) {
            return;
        }
        this.Method5629(false, null);
    }

    private void Method5589() {
        if (this.Field14562 == null) return;
        if (this.Field14463.Method341() != Class1539.Field15185) {
            if (this.Field14562.Method3691().ticksExisted < this.Field14528.Method335()) return;
        }
        if (!((Boolean)this.Field14570.Method7624(this.Field14562.Method3695(), (Entity)Field14558).Method6307()).booleanValue()) {
            return;
        }
        this.Method5637();
    }

    private void Method5590() {
        Class1955.Field17021.Method6685().Method499();
        Field14558 = Class1955.Field17021.Method6685().Method496();
        if (this.Field14482.Method365()) {
            this.Field14569.Method5223();
        }
        if (this.Field14452.Method309("PlaceBreak")) {
            this.Method5588();
            this.Method5589();
            return;
        }
        this.Method5589();
        this.Method5588();
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1955.Field17021.Method6687();
        this.Method5591();
        if (!this.Field14535.Method309("None")) {
            this.Method5592();
        }
        Class1796.Field16242.Method706(this.Field14574);
        Class1796.Field16242.Method706(this.Field14575);
        Class1796.Field16242.Method706(this.Field14573);
    }

    private void Method5591() {
        this.Field14572.Method2988();
        this.Field14569.Method5222();
        this.Field14570.Method6394();
        this.Field14545.clear();
        this.Field14546.Method2801();
        this.Field14547.Method2801();
        this.Field14548.Method2801();
        this.Field14549.Method2801();
        this.Field14551.Method2801();
        this.Field14552.Method2801();
        this.Field14553.Method2801();
        Field14558 = null;
        this.Field14564 = false;
        this.Field14561 = null;
        this.Field14566 = true;
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field14574);
        Class1796.Field16242.Method711(this.Field14575);
        Class1796.Field16242.Method711(this.Field14573);
        if (this.Field14559 != null) {
            this.Field14556.set(false);
        }
        if (this.Field14555 != null) {
            this.Field14555.shutdown();
        }
        this.Method5591();
    }

    private void Method5592() {
        if (this.Field14535.Method309("While")) {
            this.Method5594();
            return;
        }
        if (this.Field14535.Method309("None")) return;
        this.Method5596(false);
    }

    private ScheduledExecutorService Method5593() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(Class533.Method2419(this), 0L, this.Field14536.Method369(), TimeUnit.MILLISECONDS);
        return scheduledExecutorService;
    }

    private void Method5594() {
        if (this.Field14559 != null && !this.Field14559.isInterrupted() && !this.Field14559.isAlive()) {
            if (!this.Field14554.Method2797(this.Field14538.Method369())) return;
            if (!this.Field14537.Method365()) return;
        }
        if (this.Field14559 == null) {
            this.Field14559 = this.Method5595();
        } else if (this.Field14554.Method2797(this.Field14538.Method369()) && !this.Field14556.get() && this.Field14537.Method365()) {
            this.Field14556.set(true);
            this.Field14554.Method2801();
            return;
        }
        if (this.Field14559 != null && (this.Field14559.isInterrupted() || !this.Field14559.isAlive())) {
            this.Field14559 = this.Method5595();
        }
        if (this.Field14559 == null) return;
        if (!this.Field14559.getState().equals((Object)Thread.State.NEW)) return;
        this.Field14559.start();
        this.Field14554.Method2801();
    }

    private Thread Method5595() {
        Thread thread = new Thread(Class533.Method2419(this));
        thread.setName("AutoReR-Thread-" + new AtomicLong(0L).getAndIncrement());
        return thread;
    }

    private void Method5596(boolean bl) {
        if (!(bl || this.Field14555 == null || this.Field14555.isTerminated() || this.Field14555.isShutdown())) {
            if (!this.Field14554.Method2797(this.Field14538.Method369())) return;
            if (!this.Field14537.Method365()) return;
        }
        if (this.Field14555 != null) {
            this.Field14555.shutdown();
        }
        this.Field14555 = this.Method5593();
        this.Field14554.Method2801();
    }

    @Override
    public void Method45() {
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isGamePaused) {
            return;
        }
        if (this.Field14444.Method341() == Class1310.Field14028) {
            this.Method5587();
        }
        if (this.Field14445.Method341() == Class1310.Field14028) {
            this.Method5590();
        }
        if (this.Field14565.equalsIgnoreCase(this.Field14535.Method359())) return;
        if (this.Field14555 != null) {
            this.Field14555.shutdown();
        }
        if (this.Field14559 != null) {
            this.Field14556.set(true);
        }
        this.Field14565 = this.Field14535.Method359();
    }

    private IBlockState Method5597(BlockPos blockPos) {
        return Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }

    private Class650 Method5598(boolean bl) {
        Class650 class650;
        if (bl) {
            if (this.Field14517.Method341() == Class1324.Field14066) {
                class650 = this.Field14547;
                return class650;
            }
            class650 = this.Field14548;
            return class650;
        }
        if (this.Field14517.Method341() == Class1324.Field14066) {
            class650 = this.Field14546;
            return class650;
        }
        class650 = this.Field14549;
        return class650;
    }

    private int Method5599(boolean bl) {
        int n;
        if (this.Field14518.Method335() == 0) {
            n = this.Method5600(bl);
            return n;
        }
        n = (int)((double)Class886.Method3700() * this.Field14518.Method367());
        return n;
    }

    private int Method5600(boolean bl) {
        int n;
        if (this.Field14517.Method341() == Class1324.Field14066) {
            if (bl) {
                n = this.Field14521.Method335();
                return n;
            }
            n = this.Field14520.Method335();
            return n;
        }
        if (bl) {
            n = this.Field14523.Method335();
            return n;
        }
        n = this.Field14524.Method335();
        return n;
    }

    public synchronized void Method20() {
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field14513.Method365()) {
            this.Method5601();
        }
        if (this.Field14456.Method365() && this.Field14550.Method2797(this.Field14525.Method369())) {
            this.Method5615();
            this.Field14550.Method2801();
        }
        if (this.Field14529.Method335() == 1) {
            this.Method5602(null, true);
            return;
        }
        int n = 0;
        while (n < this.Field14529.Method335()) {
            this.Method5602(null, true);
            ++n;
        }
    }

    private void Method5601() {
        RayTraceResult rayTraceResult = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver;
        if (!this.Field14553.Method2797(200L)) return;
        if (!Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.isKeyDown()) return;
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() == Items.GOLDEN_APPLE) return;
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() == Items.GOLDEN_APPLE) return;
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() == Items.BOW) return;
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() == Items.EXPERIENCE_BOTTLE) return;
        if (rayTraceResult == null) return;
        if (rayTraceResult.typeOfHit.equals((Object)RayTraceResult.Type.ENTITY) && rayTraceResult.entityHit instanceof EntityEnderCrystal) {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity(rayTraceResult.entityHit));
            this.Field14553.Method2801();
            return;
        }
        if (!rayTraceResult.typeOfHit.equals((Object)RayTraceResult.Type.BLOCK)) return;
        Iterator iterator = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(new BlockPos((double)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getX(), (double)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getY() + 1.0, (double)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getZ()))).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof EntityEnderCrystal)) continue;
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
            this.Field14553.Method2801();
        }
    }

    private void Method5602(Class478 class478, boolean bl) {
        if (this.Field14452.Method309("PlaceBreak")) {
            this.Method5623(class478, bl);
            this.Method5636();
            return;
        }
        this.Method5636();
        this.Method5623(class478, bl);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5603(LivingEvent.LivingUpdateEvent livingUpdateEvent) {
        if (this.Field14444.Method341() == Class1310.Field14027) {
            this.Method5587();
        }
        if (this.Field14445.Method341() != Class1310.Field14027) return;
        this.Method5590();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5604(RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field14444.Method341() == Class1310.Field14029) {
            this.Method5587();
        }
        if (this.Field14445.Method341() == Class1310.Field14029) {
            this.Method5590();
        }
        if (Field14558 != null && this.Field14482.Method365() && this.Field14487.Method365() && ((Class2051)Field14558).Method2145() != null) {
            this.Field14542.Method3804(((Class2051)Field14558).Method2145().getEntityBoundingBox());
        }
        if (this.Field14560.Method1203() == null) return;
        this.Field14572.Method3000(this.Field14542.Field15093.Method368(), this.Field14542.Field15094.Method368(), this.Field14542.Field15095.Method368(), this.Field14542, this.Field14560, this.Field14543.Method365());
    }

    private void Method5605(int n) {
        boolean bl = this.Field14469.Method365() && !this.Field14461.Method365() && (this.Field14474.Method309("Break") || this.Field14474.Method309("All"));
        Class2160 class2160 = new Class2160().Method7793();
        CPacketUseEntity cPacketUseEntity = new CPacketUseEntity();
        cPacketUseEntity.entityId = n;
        cPacketUseEntity.action = CPacketUseEntity.Action.ATTACK;
        Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)cPacketUseEntity);
        this.Field14547.Method2801();
        this.Field14552.Method2801();
    }

    private void Method5606(int n) {
        ((Class135)this.Field14475.Method341()).Method929().Method1726(((Class135)this.Field14475.Method341()).Method931().Method1726(new Object[]{n, Class1048.Field12640}), false);
    }

    private void Method5607(Class2160 class2160) {
        ((Class135)this.Field14475.Method341()).Method930().Method1726(class2160, true);
    }

    private BlockPos Method5608(int n, BlockPos blockPos) {
        if (this.Field14470.Method365()) {
            this.Field14563 = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(n);
        }
        if (this.Field14466.Method341() == Class2084.Field17518) {
            this.Method5643();
        }
        this.Method5605(n);
        if (this.Field14466.Method341() == Class2084.Field17519) {
            this.Method5643();
        }
        this.Field14566 = true;
        if (this.Field14473.Method341() != Class2149.Field17837) return blockPos;
        this.Method5598(false).Method2801();
        return blockPos;
    }

    private float Method5609(double d, double d2, double d3, EntityPlayer entityPlayer) {
        AxisAlignedBB axisAlignedBB = this.Field14482.Method365() && (entityPlayer != Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player || this.Field14483.Method365()) ? this.Field14569.Method5225(entityPlayer).getEntityBoundingBox() : entityPlayer.getEntityBoundingBox();
        return Class2155.Method7763((World)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, d, d2, d3, (Entity)entityPlayer, axisAlignedBB, 0, this.Field14454.Method365());
    }

    private float Method5610(BlockPos blockPos, EntityPlayer entityPlayer) {
        return this.Method5609(blockPos.getX(), blockPos.getY(), blockPos.getZ(), entityPlayer);
    }

    private boolean Method5611(EntityPlayer entityPlayer) {
        BlockPos blockPos = Class721.Method3015((Entity)entityPlayer);
        int n = 0;
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n2 = enumFacingArray.length;
        int n3 = 0;
        while (n3 < n2) {
            EnumFacing enumFacing = enumFacingArray[n3];
            if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.offset(enumFacing)).getBlock() != Blocks.AIR) {
                ++n;
            }
            ++n3;
        }
        return false;
    }

    public boolean Method5612(List list, BlockPos blockPos) {
        EntityPlayer entityPlayer;
        Iterator iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (Class726.Field11086.Method3042(entityPlayer = (EntityPlayer)iterator.next()) || entityPlayer == Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player || !this.Method5613(entityPlayer, blockPos));
        return true;
    }

    public boolean Method5613(EntityPlayer entityPlayer, BlockPos blockPos) {
        BlockPos blockPos2 = blockPos.up();
        if (!this.Method5618(blockPos, this.Field14489.Method365(), false, this.Method27(), this.Field14493.Method365(), this.Field14495.Method365(), this.Field14496.Method365())) {
            return false;
        }
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityPlayer.class, new AxisAlignedBB(blockPos2.offset(enumFacing))).contains(entityPlayer)) return true;
            if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityPlayer.class, new AxisAlignedBB(blockPos2.offset(enumFacing).offset(enumFacing))).contains(entityPlayer)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private boolean Method5614() {
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isCallingFromMinecraftThread()) return true;
        if (!this.Field14557.get()) return true;
        return false;
    }

    private void Method5615() {
        this.Method5619();
        if (this.Field14560.Method1203() == null && Class1082.Field12832.Method27()) {
            this.Field14560.Method1204(Class1082.Field12832.Method4368());
            return;
        }
        Class1082.Field12832.Method4370(false);
    }

    public boolean Method27() {
        if (this.Field14492.Method341() == Class1772.Field16121) return false;
        if (this.Field14492.Method341() == Class1772.Field16122) return true;
        if (!this.Method5616()) return false;
        return true;
    }

    public boolean Method28() {
        if (this.Field14499.Method341() == Class355.Field9479) return false;
        if (this.Field14499.Method341() == Class355.Field9480) return true;
        if (!this.Method5616()) return false;
        return true;
    }

    private boolean Method5616() {
        if (Field14558 == null) return false;
        if (Class1416.Field14558.moveForward != 0.0f) return true;
        if (Class1416.Field14558.moveStrafing == 0.0f) return false;
        return true;
    }

    public boolean Method5617(float f) {
        if (!this.Field14505.Method365()) return false;
        if (!(f <= (float)this.Field14506.Method335())) return false;
        return true;
    }

    public boolean Method29() {
        if (!this.Field14502.Method365()) return false;
        if (!Class9.Method137(Field14558, this.Field14503.Method335())) return false;
        return true;
    }

    private boolean Method5618(BlockPos blockPos, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        if (!Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.BEDROCK)) {
            if (!Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN)) return false;
        }
        if (!Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.AIR)) {
            if (!bl4) return false;
            if (!Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.FIRE)) {
                return false;
            }
        }
        if (!bl5 && !Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 2, 0)).getBlock().equals(Blocks.AIR)) {
            return false;
        }
        BlockPos blockPos2 = blockPos.add(0, 1, 0);
        if (!bl2) return true;
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB((double)blockPos2.getX(), (double)blockPos2.getY(), (double)blockPos2.getZ(), (double)(blockPos2.getX() + 1), (double)(blockPos2.getY() + (bl6 ? 0 : (bl ? 2 : 1))), (double)(blockPos2.getZ() + 1)), arg_0 -> Class1416.Method5649(bl3, arg_0)).size() == 0) return true;
        return false;
    }

    private void Method5619() {
        double d = Double.longBitsToDouble((long)1572681971 ^ 0x3FE000005DBD38F3L);
        double d2 = 0.0;
        BlockPos blockPos = null;
        List list = Class2155.Method7758(this.Field14447.Method368(), true, false);
        if (this.Field14476.Method365()) {
            Collections.sort(list);
            Collections.reverse(list);
        }
        int n = list.size();
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.Field14560 = new Class204((EntityLivingBase)Field14558, blockPos, (float)d2, (float)d, null, null, null);
                return;
            }
            BlockPos blockPos2 = (BlockPos)list.get(n2);
            if ((!this.Field14490.Method365() || this.Method5622(blockPos2)) && this.Method5618(blockPos2, this.Field14489.Method365(), true, this.Method27(), this.Field14493.Method365(), this.Field14495.Method365(), this.Field14496.Method365())) {
                float f = this.Method5609((double)blockPos2.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos2.getY() + 1, (double)blockPos2.getZ() + Double.longBitsToDouble(4602678819172646912L), Field14558);
                Class1621 class1621 = this.Field14570.Method7623(f, (Entity)Field14558);
                if (this.Field14478.Method341() == Class499.Field10078) {
                    f = ((Float)class1621.Method6308()).floatValue();
                }
                if (((Boolean)class1621.Method6307()).booleanValue() && (this.Method28() && (this.Method5617(f) || this.Method29()) || f > (float)this.Field14530.Method335() || (double)f * this.Field14533.Method367() > (double)(Field14558.getHealth() + Field14558.getAbsorptionAmount()))) {
                    float f2 = this.Method5609((double)blockPos2.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos2.getY() + 1, (double)blockPos2.getZ() + Double.longBitsToDouble(4602678819172646912L), (EntityPlayer)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                    Class1621 class16212 = this.Field14570.Method7623(f, (Entity)Field14558);
                    if (this.Field14478.Method341() == Class499.Field10078 && this.Field14480.Method365()) {
                        f2 = ((Float)class16212.Method6308()).floatValue();
                    }
                    if (((Boolean)class16212.Method6307()).booleanValue() && f2 <= (float)this.Field14531.Method335() && (f2 + 2.0f < Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() || !this.Field14534.Method365()) && f2 < f && d <= (double)(f = this.Method5620(f, f2))) {
                        d = f;
                        d2 = f2;
                        blockPos = blockPos2;
                    }
                }
            }
            ++n2;
        }
    }

    private float Method5620(float f, float f2) {
        switch (Class1769.Field16113[((Class1664)this.Field14457.Method341()).ordinal()]) {
            case 1: {
                return f;
            }
            case 2: {
                return f - f2;
            }
            case 3: {
                return f * this.Field14459.Method368() - this.Field14458.Method368();
            }
        }
        return f;
    }

    private boolean Method5621() {
        if (this.Field14473.Method341() != Class2149.Field17839) return false;
        if (this.Field14566) return false;
        return true;
    }

    public boolean Method5622(BlockPos blockPos) {
        double d = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble((long)1594660155 ^ 0x3FE000005F0C953BL), (double)blockPos.getY(), (double)blockPos.getZ() + Double.longBitsToDouble((long)425215601 ^ 0x3FE0000019584671L));
        double d2 = Class394.Method1917(blockPos) ? this.Field14447.Method367() : this.Field14448.Method367();
        if (!(d <= d2)) return false;
        return true;
    }

    private void Method5623(Class478 class478, boolean bl) {
        if (!this.Field14488.Method365()) return;
        if (!this.Method5598(false).Method2797(this.Method5599(false))) return;
        if (this.Field14560.Method1203() == null) {
            if (this.Field14456.Method365()) return;
        }
        if (this.Method5621()) {
            return;
        }
        if (!this.Field14456.Method365() || bl && this.Field14541.Method365()) {
            this.Method5615();
        }
        if (this.Field14560.Method1203() == null) return;
        if (!this.Method5597(this.Field14560.Method1203()).getBlock().equals(Blocks.OBSIDIAN)) {
            if (!this.Method5597(this.Field14560.Method1203()).getBlock().equals(Blocks.BEDROCK)) return;
        }
        if (this.Field14472.Method365()) {
            if (this.Field14545.contains(this.Field14560)) return;
        }
        if (!((Boolean)this.Field14570.Method7623(this.Field14560.Method1207(), (Entity)Field14558).Method6307()).booleanValue()) {
            return;
        }
        this.Method5629(bl, class478);
    }

    private void Method5624() {
        if (this.Field14512.Method341() != Class1663.Field15745) return;
        if (this.Field14563 == null) return;
        this.Method5642(this.Field14563);
    }

    private int[] Method5625(boolean bl) {
        int n = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        int n2 = Class9.Method116(Items.END_CRYSTAL, 0, 9);
        if (n2 == -1 && !bl) {
            return new int[]{n, 1};
        }
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL || bl) return new int[]{n, 0};
        String string = this.Field14455.Method359();
        int n3 = -1;
        switch (string.hashCode()) {
            case 2433880: {
                if (!string.equals("None")) return new int[]{n, 0};
                n3 = 0;
                return new int[]{n, 0};
            }
            case -1955878649: {
                if (!string.equals("Normal")) return new int[]{n, 0};
                n3 = 1;
                return new int[]{n, 0};
            }
            case -1818460043: {
                if (!string.equals("Silent")) return new int[]{n, 0};
                n3 = 2;
                return new int[]{n, 0};
            }
            case 79996329: {
                if (!string.equals("Smart")) return new int[]{n, 0};
                n3 = 3;
                return new int[]{n, 0};
            }
        }
        return new int[]{n, 0};
    }

    private void Method5626(int n) {
        if (n == -1) return;
        if (!this.Field14455.Method309(Class113.Field8394.name())) return;
        Class9.Method110(n, true);
    }

    private Class2160 Method5627(boolean bl, Class478 class478) {
        Class2160 class2160 = new Class2160().Method7793();
        if (!this.Field14474.Method309("Place")) {
            if (!this.Field14474.Method309("All")) return class2160;
        }
        float[] fArray = (float[])((Class135)this.Field14475.Method341()).Method932().Method1726(this.Field14560.Method1203());
        if (bl) {
            if (!this.Field14539.Method365()) return class2160;
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0], fArray[1], Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            return class2160;
        }
        if (!this.Field14461.Method365()) {
            ((Class135)this.Field14475.Method341()).Method929().Method1726(fArray, false);
            return class2160;
        }
        if (class478 == null) return class2160;
        class478.Method1734(fArray[0]);
        class478.Method1736(fArray[1]);
        return class2160;
    }

    private void Method5628(Class2160 class2160) {
        if (!this.Field14474.Method309("Place")) {
            if (!this.Field14474.Method309("All")) return;
        }
        this.Method5607(class2160);
    }

    private void Method5629(boolean bl, Class478 class478) {
        Class2160 class2160;
        this.Method5624();
        EnumHand enumHand = null;
        boolean bl2 = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem().equals(Items.END_CRYSTAL);
        int[] nArray = this.Method5625(bl2);
        if (nArray[1] == 1) return;
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() != Items.END_CRYSTAL && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.END_CRYSTAL) {
            return;
        }
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) {
            enumHand = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActiveHand();
        }
        EnumFacing enumFacing = EnumFacing.UP;
        if (this.Field14507.Method365()) {
            class2160 = null;
            class2160 = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(new Vec3d(Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), new Vec3d((double)this.Field14560.Method1203().getX() + Double.longBitsToDouble((long)962095817 ^ 0x3FE0000039586AC9L), (double)this.Field14560.Method1203().getY() - Double.longBitsToDouble((long)1064186200 ^ 0x3FE000003F6E3158L), (double)this.Field14560.Method1203().getZ() + Double.longBitsToDouble((long)351840406 ^ 0x3FE0000014F8A896L)));
            enumFacing = class2160 == null || ((RayTraceResult)class2160).sideHit == null ? EnumFacing.UP : ((RayTraceResult)class2160).sideHit;
        }
        class2160 = this.Method5627(bl, class478);
        this.Method5630(enumFacing, bl2);
        this.Method5628(class2160);
        this.Method5626(nArray[0]);
        if (enumHand == null) return;
        Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setActiveHand(enumHand);
    }

    private void Method5630(EnumFacing enumFacing, boolean bl) {
        if (this.Field14560.Method1203() == null) return;
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection == null) return;
        if (this.Field14466.Method341() == Class2084.Field17518) {
            this.Method5643();
        }
        if (this.Field14494.Method365() && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection != null) {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(this.Field14560.Method1203(), enumFacing, this.Method5631(bl), 0.0f, 0.0f, 0.0f));
        } else {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Field14560.Method1203(), enumFacing, new Vec3d(0.0, 0.0, 0.0), this.Method5631(bl));
        }
        if (this.Field14466.Method341() == Class2084.Field17519) {
            this.Method5643();
        }
        this.Field14566 = false;
        this.Method5598(false).Method2801();
    }

    private EnumHand Method5631(boolean bl) {
        EnumHand enumHand;
        if (bl) {
            enumHand = EnumHand.OFF_HAND;
            return enumHand;
        }
        enumHand = EnumHand.MAIN_HAND;
        return enumHand;
    }

    private Class885 Method5632() {
        Entity entity = null;
        if (!this.Field14515.Method309("None")) {
            BlockPos blockPos;
            if (this.Field14515.Method309("Cev") || this.Field14515.Method309("Both")) {
                for (Vec3i vec3i : Class1404.Field14352.Field14354) {
                    blockPos = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition().add(vec3i);
                    for (Entity entity2 : Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(blockPos))) {
                        if (!(entity2 instanceof EntityEnderCrystal)) continue;
                        entity = entity2;
                    }
                }
            }
            if (this.Field14515.Method309("Civ") || this.Field14515.Method309("Both")) {
                for (Vec3i vec3i : Class1404.Field14353.Field14354) {
                    blockPos = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition().add(vec3i);
                    for (Entity entity2 : Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(blockPos))) {
                        if (!(entity2 instanceof EntityEnderCrystal)) continue;
                        entity = entity2;
                    }
                }
            }
        }
        if (entity == null) return null;
        Class885 class885 = new Class885((EntityEnderCrystal)entity, 0.0f, 0.0f, true);
        return class885;
    }

    private Class885 Method5633() {
        if (Field14558 == null) {
            return null;
        }
        Entity entity = null;
        float f = Float.intBitsToFloat(0x3F000000);
        float f2 = Float.intBitsToFloat(0x3F000000);
        for (Entity entity2 : Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            if (!(entity2 instanceof EntityEnderCrystal) || this.Field14464.Method365() && this.Field14463.Method341() == Class1539.Field15184 && entity2.ticksExisted < this.Field14528.Method335()) continue;
            double d = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity2);
            double d2 = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.canEntityBeSeen(entity2) ? this.Field14449.Method367() : this.Field14450.Method367();
            if (!(d < d2)) continue;
            Class1271 class1271 = this.Method5644(entity2);
            float f3 = Class2155.Method7759((World)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity2.posX, entity2.posY, entity2.posZ, (Entity)Field14558, this.Field14454.Method365());
            Class1621 class1621 = this.Field14570.Method7623(f3, (Entity)Field14558);
            if (this.Field14479.Method341() == Class499.Field10078) {
                f3 = ((Float)class1621.Method6308()).floatValue();
            }
            if (class1271 != null && !this.Field14510.Method309(Class10.Field7864.name())) {
                if (this.Field14510.Method309(Class10.Field7866.name()) && class1271.Field13740) {
                    return null;
                }
                if (class1271.Field13741) {
                    return null;
                }
                if (class1271.Field13739 >= (double)this.Field14532.Method335()) {
                    return null;
                }
            }
            if (!((Boolean)class1621.Method6307()).booleanValue() || !(f3 > (float)this.Field14530.Method335()) && !((double)f3 * this.Field14533.Method367() > (double)(Field14558.getHealth() + Field14558.getAbsorptionAmount())) && !Class9.Method137(Field14558, this.Field14503.Method335())) continue;
            float f4 = Class2155.Method7759((World)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity2.posX, entity2.posY, entity2.posZ, (Entity)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14454.Method365());
            Class1621 class16212 = this.Field14570.Method7623(f3, (Entity)Field14558);
            if (this.Field14479.Method341() == Class499.Field10078 && this.Field14480.Method365()) {
                f4 = ((Float)class16212.Method6308()).floatValue();
            }
            if (!((Boolean)class16212.Method6307()).booleanValue() || !(f4 <= (float)this.Field14531.Method335()) || !(f4 + 2.0f <= Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) || !(f4 < f3) || !(f <= f3)) continue;
            f = f3;
            f2 = f4;
            entity = entity2;
        }
        if (entity == null) {
            return null;
        }
        Class885 class885 = new Class885((EntityEnderCrystal)entity, f2, f, false);
        return class885;
    }

    private boolean Method5634() {
        if (this.Field14473.Method341() != Class2149.Field17838) {
            if (this.Field14473.Method341() != Class2149.Field17839) return false;
        }
        if (!this.Field14566) return false;
        return true;
    }

    private boolean Method5635() {
        Class885 class885;
        if (!this.Field14508.Method365()) return true;
        if (!this.Method5598(true).Method2797(this.Method5599(true))) return true;
        if (this.Method5634()) {
            return true;
        }
        if (((Boolean)this.Field14571.Method2363().get()).booleanValue()) {
            AtomicReference atomicReference = new AtomicReference();
            AtomicReference atomicReference2 = new AtomicReference();
            this.Field14571.Method2361(() -> this.Method5647(atomicReference2));
            if (this.Field14509.Method309("Damage")) {
                atomicReference.set(atomicReference2.get());
            } else {
                this.Field14571.Method2361(() -> this.Method5645(atomicReference));
                atomicReference.set(this.Method5632());
                if (atomicReference.get() == null) {
                    atomicReference.set(atomicReference2.get());
                }
            }
            class885 = (Class885)atomicReference.get();
        } else {
            Class885 class8852;
            Class885 class8853 = this.Method5633();
            if (this.Field14509.Method309("Damage")) {
                class8852 = class8853;
            } else {
                class8852 = this.Method5632();
                if (class8852 == null) {
                    class8852 = class8853;
                }
            }
            class885 = class8852;
        }
        this.Field14562 = class885;
        return false;
    }

    private void Method5636() {
        if (this.Method5635()) {
            return;
        }
        if (this.Field14562 == null) return;
        if (this.Field14463.Method341() != Class1539.Field15185) {
            if (this.Field14562.Method3691().ticksExisted < this.Field14528.Method335()) return;
        }
        if (!((Boolean)this.Field14570.Method7624(this.Field14562.Method3695(), (Entity)Field14558).Method6307()).booleanValue()) {
            return;
        }
        this.Method5637();
    }

    private void Method5637() {
        Class2160 class2160 = this.Method5638();
        this.Method5639();
        this.Method5640(class2160);
        this.Method5641();
    }

    private Class2160 Method5638() {
        Class2160 class2160 = new Class2160().Method7793();
        if (!this.Field14474.Method309("Break")) {
            if (!this.Field14474.Method309("All")) return class2160;
        }
        this.Method5606(this.Field14562.Method3691().getEntityId());
        return class2160;
    }

    private void Method5639() {
        if (this.Field14562 == null) return;
        if (this.Field14562.Method3691() == null) return;
        if (this.Field14463.Method341() != Class1539.Field15185) {
            if (this.Field14562.Method3691().ticksExisted < this.Field14528.Method335()) return;
        }
        if (!((Boolean)this.Field14570.Method7624(this.Field14562.Method3695(), (Entity)Field14558).Method6307()).booleanValue()) {
            return;
        }
        this.Field14563 = this.Field14562.Method3691();
        if (this.Field14466.Method341() == Class2084.Field17518) {
            this.Method5643();
        }
        if (this.Field14516.Method365()) {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)this.Field14562.Method3691()));
        } else {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.attackEntity((EntityPlayer)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (Entity)this.Field14562.Method3691());
        }
        if (this.Field14466.Method341() == Class2084.Field17519) {
            this.Method5643();
        }
        if (this.Field14512.Method341() == Class1663.Field15744) {
            this.Method5642((Entity)this.Field14562.Method3691());
            if (this.Field14511.Method365()) {
                Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(this.Field14562.Method3691().entityId);
            }
        }
        this.Method5598(true).Method2801();
        this.Field14566 = true;
    }

    private void Method5640(Class2160 class2160) {
        if (!this.Field14474.Method309("Break")) {
            if (!this.Field14474.Method309("All")) return;
        }
        this.Method5607(class2160);
    }

    private void Method5641() {
        if (!this.Field14472.Method365()) return;
        BlockPos blockPos = null;
        int n = 0;
        while (true) {
            if (n >= this.Field14545.size()) {
                if (blockPos == null) return;
                this.Field14545.remove(Class204.Field8894.Method6018(this.Field14545, blockPos));
                return;
            }
            if (((Class204)this.Field14545.get(n)).Method1203() != null && this.Field14562.Method3691().getDistanceSq(((Class204)this.Field14545.get(n)).Method1203()) <= Double.longBitsToDouble(0x4022000000000000L)) {
                blockPos = ((Class204)this.Field14545.get(n)).Method1203();
            }
            ++n;
        }
    }

    private void Method5642(Entity entity) {
        if (this.Field14511.Method341() == Class1381.Field14259 || this.Field14511.Method341() == Class1381.Field14261) {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(entity.entityId);
            return;
        }
        if (this.Field14511.Method341() != Class1381.Field14260) {
            if (this.Field14511.Method341() != Class1381.Field14261) return;
        }
        entity.setDead();
    }

    private void Method5643() {
        if (this.Field14465.Method310(Class1241.Field13629)) {
            return;
        }
        if (this.Field14465.Method310(Class1241.Field13628)) {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketAnimation(this.Field14465.Method309(Class1241.Field13625.name()) ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND));
            return;
        }
        if (this.Field14465.Method310(Class1241.Field13627)) {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND);
            return;
        }
        Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(this.Field14465.Method310(Class1241.Field13625) ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND);
    }

    private Class1271 Method5644(Entity entity) {
        ArrayList<Class1271> arrayList = new ArrayList<Class1271>();
        for (EntityPlayer entityPlayer : Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities) {
            double d;
            if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == entityPlayer || !Class726.Field11086.Method3042(entityPlayer) || !((d = (double)Class2155.Method7759((World)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity.posX, entity.posY, entity.posZ, (Entity)Field14558, this.Field14454.Method365())) <= (double)this.Field14532.Method335()) && !(d * this.Field14533.Method367() >= (double)(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount()))) continue;
            arrayList.add(new Class1271(entityPlayer, d, d * this.Field14533.Method367() >= (double)(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount())));
        }
        Object object = null;
        double d = Double.longBitsToDouble(4602678819172646912L);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Class1271 class1271 = (Class1271)iterator.next();
            double d2 = Class2155.Method7759((World)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity.posX, entity.posY, entity.posZ, (Entity)Field14558, this.Field14454.Method365());
            if (!(d2 > d)) continue;
            d = d2;
            object = new Class1271(class1271.Field13738, d2);
        }
        return object;
    }

    private void Method5645(AtomicReference atomicReference) {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> this.Method5646(atomicReference));
    }

    private void Method5646(AtomicReference atomicReference) {
        atomicReference.set(this.Method5632());
    }

    private void Method5647(AtomicReference atomicReference) {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> this.Method5648(atomicReference));
    }

    private void Method5648(AtomicReference atomicReference) {
        atomicReference.set(this.Method5633());
    }

    private static boolean Method5649(boolean bl, Entity entity) {
        if (!(entity instanceof EntityEnderCrystal)) return true;
        if (bl) return true;
        return false;
    }

    private void Method5650(Class805 class805) {
        Object object;
        if (class805.Method982() instanceof CPacketPlayerTryUseItemOnBlock && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItem(((CPacketPlayerTryUseItemOnBlock)class805.Method982()).getHand()).getItem() == Items.END_CRYSTAL) {
            if (this.Field14491.Method365() && !this.Method5622(((CPacketPlayerTryUseItemOnBlock)class805.Method982()).getPos())) {
                class805.Method158();
                return;
            }
            object = Class1955.Field17021.Method6690(((CPacketPlayerTryUseItemOnBlock)class805.Method982()).getPos(), (EntityLivingBase)Field14558, this.Field14454.Method365());
            this.Field14545.add(object);
        }
        if (!(class805.Method982() instanceof CPacketUseEntity)) return;
        object = (CPacketUseEntity)class805.Method982();
        Entity entity = object.getEntityFromWorld((World)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
        if (!object.getAction().equals((Object)CPacketUseEntity.Action.ATTACK)) return;
        if (!(entity instanceof EntityEnderCrystal)) return;
        if (this.Field14497.Method365() && Field14558 != null && this.Method5611(Field14558) && this.Method5613(Field14558, entity.getPosition().down())) {
            this.Field14560.Method1204(entity.getPosition().down());
            this.Method5629(false, null);
        }
        if (!this.Field14514.Method365()) return;
        Objects.requireNonNull(entity).setDead();
        Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(object.entityId);
    }

    private void Method5651(Class544 class544) {
        SPacketSpawnObject sPacketSpawnObject;
        if (class544.Method982() instanceof SPacketSpawnObject && this.Field14467.Method365() && (sPacketSpawnObject = (SPacketSpawnObject)class544.Method982()).getType() == 51) {
            if (!(Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(sPacketSpawnObject.getEntityID()) instanceof EntityEnderCrystal)) {
                return;
            }
            BlockPos blockPos = null;
            Iterator iterator = this.Field14545.iterator();
            if (iterator.hasNext()) {
                Class204 class204 = (Class204)iterator.next();
                BlockPos blockPos2 = class204.Method1203();
                boolean bl = Class394.Method1917(blockPos2);
                if (!(Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos2.getX() + Double.longBitsToDouble((long)2140427329 ^ 0x3FE000007F945441L), (double)blockPos2.getY(), (double)blockPos2.getZ() + Double.longBitsToDouble((long)1381635067 ^ 0x3FE00000525A13FBL)) >= (bl ? this.Field14449.Method367() : this.Field14450.Method367()))) {
                    if (this.Field14468.Method365() && Field14558 != null) {
                        float f;
                        float f2 = Class2155.Method7761(blockPos2, (Entity)Field14558, this.Field14454.Method365());
                        if ((f2 > (float)this.Field14530.Method335() || (double)f2 * this.Field14533.Method367() > (double)(Field14558.getHealth() + Field14558.getAbsorptionAmount()) || Class9.Method137(Field14558, this.Field14503.Method335())) && (f = Class2155.Method7761(blockPos2, (Entity)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14454.Method365())) <= (float)this.Field14531.Method335() && f + 2.0f <= Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() && f < f2) {
                            blockPos = this.Method5608(sPacketSpawnObject.getEntityID(), blockPos2);
                        }
                    } else {
                        blockPos = this.Method5608(sPacketSpawnObject.getEntityID(), blockPos2);
                    }
                }
            }
            if (blockPos != null) {
                this.Field14545.remove(Class204.Field8894.Method6018(this.Field14545, blockPos));
            }
        }
        if (class544.Method982() instanceof SPacketSoundEffect && this.Field14512.Method341() == Class1663.Field15746 && this.Field14563 != null && (sPacketSpawnObject = (SPacketSoundEffect)class544.Method982()).getCategory() == SoundCategory.BLOCKS && sPacketSpawnObject.getSound() == SoundEvents.ENTITY_GENERIC_EXPLODE && this.Field14563.getDistance(sPacketSpawnObject.getX(), sPacketSpawnObject.getY(), sPacketSpawnObject.getZ()) <= Double.longBitsToDouble((long)903352325 ^ 0x4018000035D81005L)) {
            this.Method5642(this.Field14563);
        }
        if (!(class544.Method982() instanceof SPacketSoundEffect)) return;
        if (!this.Field14470.Method365() || this.Field14563 == null) {
            if (!this.Field14471.Method365()) return;
        }
        if ((sPacketSpawnObject = (SPacketSoundEffect)class544.Method982()).getCategory() == SoundCategory.BLOCKS && sPacketSpawnObject.getSound() == SoundEvents.ENTITY_GENERIC_EXPLODE && this.Field14563.getDistance(sPacketSpawnObject.getX(), sPacketSpawnObject.getY(), sPacketSpawnObject.getZ()) <= Double.longBitsToDouble((long)994887407 ^ 0x401800003B4CC6EFL)) {
            this.Field14563.setDead();
        }
        if (!this.Field14535.Method309(Class1041.Field12588.name())) return;
        if (!this.Method5614()) return;
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        double d = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(new BlockPos(sPacketSpawnObject.getX(), sPacketSpawnObject.getY(), sPacketSpawnObject.getZ()));
        double d2 = this.Field14540.Method335();
        return (void)(d2 * d2);
    }

    private void Method5652(Class478 class478) {
        if (!this.Field14461.Method365()) return;
        if (Field14558 == null) {
            return;
        }
        if (this.Field14462.Method365() && this.Field14456.Method365() && this.Field14550.Method2797(this.Field14525.Method369())) {
            this.Method5615();
            this.Field14550.Method2801();
        }
        if (this.Field14529.Method335() == 1) {
            this.Method5602(class478, false);
            return;
        }
        int n = 0;
        while (n < this.Field14529.Method335()) {
            this.Method5602(class478, false);
            ++n;
        }
    }

    private static String Method5653() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("[");
        if (Field14558 == null) {
            string = "no target no fun";
            return stringBuilder.append(string).append("]").toString();
        }
        string = Field14558.getName();
        return stringBuilder.append(string).append("]").toString();
    }

    private Boolean Method5654() {
        boolean bl;
        if (this.Field14479.Method341() != Class499.Field10076) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5655() {
        boolean bl;
        if (this.Field14478.Method341() != Class499.Field10076) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5656() {
        if (!this.Field14455.Method359().equals("Smart")) return false;
        if (this.Field14560.Method1201() != Field14558) return false;
        if (this.Field14560.Method1203() == null) return false;
        if (this.Field14560.Method1205() >= Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.TOTEM_OF_UNDYING) {
            return false;
        }
        if (!((double)this.Field14560.Method1207() * this.Field14533.Method367() >= (double)(Field14558.getHealth() + Field14558.getAbsorptionAmount()))) return false;
        return true;
    }

    private Boolean Method5657() {
        boolean bl;
        if (!this.Field14535.Method309("None")) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5658() {
        return this.Field14535.Method309("Sound");
    }

    private Boolean Method5659() {
        boolean bl;
        if (!this.Field14535.Method309(Class1041.Field12586.name()) && !this.Field14474.Method309(Class464.Field9926.name())) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5660() {
        boolean bl;
        if (!this.Field14535.Method309(Class1041.Field12586.name())) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5661() {
        boolean bl;
        if (!this.Field14535.Method309(Class1041.Field12586.name())) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5662() {
        boolean bl;
        if (!this.Field14535.Method309(Class1041.Field12586.name())) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5663() {
        boolean bl;
        if (!this.Field14474.Method309("None")) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5664() {
        boolean bl;
        if (this.Field14465.Method341() != Class1241.Field13629) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    static Minecraft Method5665() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method5666() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static AtomicBoolean Method5667(Class1416 class1416) {
        return class1416.Field14556;
    }

    static Class650 Method5668(Class1416 class1416) {
        return class1416.Field14554;
    }

    static Thread Method5669(Class1416 class1416) {
        return class1416.Field14559;
    }

    static AtomicBoolean Method5670(Class1416 class1416) {
        return class1416.Field14557;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 229;
            cArray2[n] = (char)(cArray[n] ^ (0x66D5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

