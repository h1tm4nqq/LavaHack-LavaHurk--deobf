//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.client.renderer.DestroyBlockProgress
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1008;
import lavahack.client.Class1036;
import lavahack.client.Class1092;
import lavahack.client.Class1126;
import lavahack.client.Class1180;
import lavahack.client.Class1277;
import lavahack.client.Class1352;
import lavahack.client.Class1353;
import lavahack.client.Class1410;
import lavahack.client.Class1416;
import lavahack.client.Class1449;
import lavahack.client.Class146;
import lavahack.client.Class1513;
import lavahack.client.Class1515;
import lavahack.client.Class1543;
import lavahack.client.Class1611;
import lavahack.client.Class1647;
import lavahack.client.Class1677;
import lavahack.client.Class1746;
import lavahack.client.Class1793;
import lavahack.client.Class1796;
import lavahack.client.Class1870;
import lavahack.client.Class1887;
import lavahack.client.Class1902;
import lavahack.client.Class1913;
import lavahack.client.Class1914;
import lavahack.client.Class1923;
import lavahack.client.Class1956;
import lavahack.client.Class1974;
import lavahack.client.Class1996;
import lavahack.client.Class203;
import lavahack.client.Class2088;
import lavahack.client.Class2117;
import lavahack.client.Class223;
import lavahack.client.Class254;
import lavahack.client.Class380;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class473;
import lavahack.client.Class506;
import lavahack.client.Class525;
import lavahack.client.Class61;
import lavahack.client.Class618;
import lavahack.client.Class654;
import lavahack.client.Class690;
import lavahack.client.Class721;
import lavahack.client.Class746;
import lavahack.client.Class772;
import lavahack.client.Class828;
import lavahack.client.Class861;
import lavahack.client.Class894;
import lavahack.client.Class9;
import lavahack.client.Class913;
import lavahack.client.Class914;
import lavahack.client.Class926;
import lavahack.client.Class960;
import lavahack.client.Class97;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.renderer.DestroyBlockProgress;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Class1887
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0002J\u0010\u0010X\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020(H\u0002J\b\u0010Z\u001a\u00020UH\u0002J\b\u0010[\u001a\u00020UH\u0002J\b\u0010\\\u001a\u00020UH\u0002J\b\u0010]\u001a\u00020UH\u0002J\b\u0010^\u001a\u00020UH\u0002J\b\u0010_\u001a\u00020UH\u0002J\b\u0010`\u001a\u00020UH\u0002J\b\u0010a\u001a\u00020UH\u0002J\b\u0010b\u001a\u00020UH\u0002J\b\u0010c\u001a\u00020UH\u0002J\b\u0010d\u001a\u00020UH\u0002J\b\u0010e\u001a\u00020UH\u0002J\b\u0010f\u001a\u00020UH\u0002J\u0010\u0010g\u001a\u00020 2\u0006\u0010G\u001a\u00020HH\u0002J\"\u0010h\u001a\u0004\u0018\u00010(2\u0006\u0010G\u001a\u00020H2\u0006\u0010i\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u0010H\u0002J\b\u0010k\u001a\u00020UH\u0002J\b\u0010l\u001a\u00020UH\u0002J\b\u0010m\u001a\u00020UH\u0002J\b\u0010n\u001a\u00020UH\u0002J\b\u0010o\u001a\u00020UH\u0002J\u0010\u0010p\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020(H\u0002J\b\u0010q\u001a\u00020\u000bH\u0002J\n\u0010r\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010s\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020(H\u0002J\u0010\u0010t\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\u0010\u0010v\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020(H\u0002J\u0010\u0010w\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\u0010\u0010x\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\u0010\u0010y\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\u0018\u0010z\u001a\u00020U2\u0006\u0010Y\u001a\u00020(2\u0006\u0010{\u001a\u00020\u000bH\u0002J\u0018\u0010|\u001a\u00020U2\u0006\u0010Y\u001a\u00020(2\u0006\u0010{\u001a\u00020\u000bH\u0002J\b\u0010}\u001a\u00020\u000bH\u0002J\u0010\u0010~\u001a\u00020U2\u0006\u0010\u007f\u001a\u00020(H\u0002J\u0011\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\t\u0010\u0081\u0001\u001a\u00020\u000bH\u0002J\t\u0010\u0082\u0001\u001a\u00020\u000bH\u0002J\t\u0010\u0083\u0001\u001a\u00020UH\u0016J\t\u0010\u0084\u0001\u001a\u00020UH\u0016J\u0013\u0010\u0085\u0001\u001a\u00020U2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0007J\u001a\u0010\u0088\u0001\u001a\u00020U2\u0007\u0010\u0089\u0001\u001a\u00020 2\u0006\u0010G\u001a\u00020HH\u0002J\u0011\u0010\u008a\u0001\u001a\u00020U2\u0006\u0010Y\u001a\u00020(H\u0002J\t\u0010\u008b\u0001\u001a\u00020UH\u0002J\t\u0010\u008c\u0001\u001a\u00020UH\u0002J\t\u0010\u008d\u0001\u001a\u00020UH\u0002J\t\u0010\u008e\u0001\u001a\u00020\u000bH\u0002J\t\u0010\u008f\u0001\u001a\u00020UH\u0002J\t\u0010\u0090\u0001\u001a\u00020UH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010;\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010?\u001a\n \u0007*\u0004\u0018\u00010@0@X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020B0=X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010D\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010M\u001a\n \u0007*\u0004\u0018\u00010N0NX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0091\u0001"}, d2={"Lcom/kisman/cc/features/module/combat/Robot;", "Lcom/kisman/cc/features/module/Module;", "()V", "announceTimer", "Lcom/kisman/cc/util/TimerUtils;", "autoTrap", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "bowTicks", "", "cantStep", "", "crystalpvpccMode", "damagePerSecond", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "didChorus", "dpsMovingTrigger", "dropped", "enabledAura", "enabledFastExp", "enabledPacketMine", "enabledStep", "enabledTrap", "forcedHole", "handOnly", "hasMined", "healthMovingTrigger", "holeFiller", "holeOperation", "Lcom/kisman/cc/util/enums/RobotHoleOperation;", "holeTimer", "isEating", "isExping", "isMoving", "isSafe", "landed", "lastHole", "Lnet/minecraft/util/math/BlockPos;", "mineTimer", "minedPos", "mode", "", "needsOnGround", "needsUnSneak", "nextHole", "nextHoleRenderer", "Lcom/kisman/cc/util/render/pattern/SlideRendererPattern;", "nextHoleRendererPattern", "Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "packets", "preGappled", "prevChorus", "prevGapples", "prevHealth", "prevPosX", "prevPosZ", "range", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "renderers", "Lcom/kisman/cc/settings/types/SettingGroup;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "st", "strafing", "switchedPickaxe", "switchedToSword", "target", "Lnet/minecraft/entity/player/EntityPlayer;", "targetExpPercent", "targetObsidian", "targets", "Lcom/kisman/cc/util/entity/TargetFinder;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "totalDamagePerSecond1", "triggerMode", "value", "xt", "zt", "breakCrystal", "", "crystal", "Lnet/minecraft/entity/Entity;", "canEnter", "pos", "center", "disableAura", "disableFiller", "disableStep", "disableSurround", "disableTrap", "doEat", "doQuiver", "enableAura", "enableFiller", "enableStep", "enableSurround", "enableTrap", "getHoleOperation", "getNextHole", "force", "forceRadius", "handleChorus", "handleDamage", "handleEat", "handleMineEchest", "handleTower", "isAir", "isBeingCevBreakered", "isBeingRussianed", "isEchest", "isEnemyInSameHole", "player", "isObby", "isPlayerSafe", "isTowering", "isTrapped", "mineBlock", "obby", "mineBlockForEchest", "moveOutHole", "moveToNextHole", "pos1", "needsEffect", "needsMending", "needsObsidian", "onDisable", "onEnable", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "performHoleOperation", "operation", "placeEchest", "reset", "resetMovement", "setUseItemUnpressedIfNeeded", "stepState", "toggleSurround", "update", "kisman.cc"})
public final class Class1281
extends Class42 {
    private final Class44 Field13768 = this.Method23(new Class44("CrystalPvPcc Mode", (Class42)this, true).Method355("crystalpvp.cc"));
    private final Class44 Field13769 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)1605945235 ^ 0x406900005FB8C793L), 1.0, Double.longBitsToDouble(4641240890982006784L), true));
    private final Class44 Field13770 = this.Method23(new Class44("Health Moving Trigger", (Class42)this, Double.longBitsToDouble(4625619029774565376L), 1.0, Double.longBitsToDouble((long)1237389133 ^ 0x4042800049C10F4DL), false));
    private final Class44 Field13771 = this.Method23(new Class44("DPS Moving Trigger", (Class42)this, Double.longBitsToDouble((long)341755072 ^ 0x40240000145EC4C0L), 0.0, Double.longBitsToDouble((long)2133437267 ^ 0x404400007F29AB53L), false));
    private final Class44 Field13772 = this.Method23(new Class44("Strafing", (Class42)this, false));
    private final Class1996 Field13773 = this.Method24(new Class1996(new Class44("Renderers", this)));
    private final Class1515 Field13774;
    private final Class44 Field13775;
    private final Class44 Field13776;
    private final Class411 Field13777;
    private final Class61 Field13778;
    private final Class1352 Field13779;
    private EntityPlayer Field13780;
    private double Field13781;
    private double Field13782;
    private double Field13783;
    private double Field13784;
    private int Field13785;
    private int Field13786;
    private int Field13787;
    private int Field13788;
    private int Field13789;
    private int Field13790;
    private int Field13791;
    private int Field13792;
    private int Field13793;
    private boolean Field13794;
    private boolean Field13795;
    private boolean Field13796;
    private boolean Field13797;
    private boolean Field13798;
    private boolean Field13799;
    private boolean Field13800;
    private boolean Field13801;
    private boolean Field13802;
    private boolean Field13803;
    private boolean Field13804;
    private boolean Field13805;
    private boolean Field13806;
    private boolean Field13807;
    private boolean Field13808;
    private boolean Field13809;
    private boolean Field13810;
    private boolean Field13811;
    private boolean Field13812;
    private boolean Field13813;
    private boolean Field13814;
    private boolean Field13815;
    private String Field13816;
    private String Field13817;
    private final Class650 Field13818;
    private final Class650 Field13819;
    private final Class650 Field13820;
    private BlockPos Field13821;
    private BlockPos Field13822;
    private BlockPos Field13823;
    private final HashMap Field13824;
    private Class1277 Field13825;
    private final Class618 Field13826;
    private final Class618 Field13827;
    private String Field13828 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private final void Method5127() {
        int n;
        EntityPlayerSP entityPlayerSP = Class1281.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        this.Field13781 = entityPlayerSP.getHealth() + Class1281.Method5173().player.getAbsorptionAmount();
        this.Field13782 = 0.0;
        this.Field13783 = 0.0;
        this.Field13784 = 0.0;
        int n2 = Class1281.Method5173().player.inventory.mainInventory.stream().filter(Class1611.Field15517).mapToInt(Class473.Field9972).sum();
        EntityPlayerSP entityPlayerSP2 = Class1281.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (entityPlayerSP2.getHeldItemOffhand().getItem() == Items.GOLDEN_APPLE) {
            EntityPlayerSP entityPlayerSP3 = Class1281.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
            ItemStack itemStack = entityPlayerSP3.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.heldItemOffhand");
            n = itemStack.getCount();
        } else {
            n = 0;
        }
        this.Field13785 = n2 + n;
        this.Field13794 = false;
        this.Field13795 = false;
        this.Field13796 = false;
        this.Field13797 = false;
        this.Field13798 = false;
        this.Field13799 = false;
        this.Field13800 = false;
        this.Field13802 = false;
        this.Field13803 = false;
        this.Field13804 = false;
        this.Field13806 = false;
        this.Field13807 = false;
        this.Field13808 = false;
        this.Field13809 = false;
        this.Field13810 = false;
        this.Field13811 = false;
        this.Field13812 = false;
        this.Field13813 = false;
        this.Field13814 = false;
        this.Field13815 = false;
        this.Field13816 = "";
        this.Field13817 = "";
        this.Field13824.clear();
        this.Field13786 = 1;
        this.Field13787 = 11;
        this.Field13789 = 0;
        this.Field13790 = 0;
        this.Field13791 = 0;
        this.Field13792 = 0;
        this.Field13793 = 0;
        this.Field13818.Method2801();
        this.Field13819.Method2801();
        this.Field13820.Method2801();
        this.Field13821 = null;
        this.Field13822 = null;
        this.Field13823 = null;
        this.Field13778.Method498();
        this.Method5163();
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field13826);
        Class1796.Field16242.Method706(this.Field13827);
        if (Class1281.Method5173().player == null || Class1281.Method5173().world == null) {
            this.Method21(false);
            return;
        }
        Class1416 class1416 = Class1416.Field14544;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1416, (String)"AutoRer.instance");
        if (!class1416.Method35()) {
            Class1416 class14162 = Class1416.Field14544;
            Intrinsics.checkExpressionValueIsNotNull((Object)class14162, (String)"AutoRer.instance");
            class14162.Method21(true);
        }
        this.Method5127();
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field13826);
        Class1796.Field16242.Method711(this.Field13827);
        if (Class1281.Method5173().player == null) return;
        if (Class1281.Method5173().world == null) {
            return;
        }
        Class1416 class1416 = Class1416.Field14544;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1416, (String)"AutoRer.instance");
        if (class1416.Method35()) {
            Class1416 class14162 = Class1416.Field14544;
            Intrinsics.checkExpressionValueIsNotNull((Object)class14162, (String)"AutoRer.instance");
            class14162.Method21(false);
        }
        Class1281.Method5173().gameSettings.keyBindUseItem.pressed = false;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method5128(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        this.Field13779.Method2998(this.Field13823, this.Field13774);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void Method45() {
        block55: {
            block59: {
                block58: {
                    block57: {
                        block56: {
                            block54: {
                                block53: {
                                    if (Class1281.Method5173().player == null) return;
                                    if (Class1281.Method5173().world == null) {
                                        return;
                                    }
                                    Class1281.Method5173().player.rotationYaw = Float.intBitsToFloat(0x43340000);
                                    Class1281.Method5173().player.rotationPitch = 0.0f;
                                    v0 = this.Field13768;
                                    Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"crystalpvpccMode");
                                    if (v0.Method365()) {
                                        if (Class1281.Method5173().player.ticksExisted > 20 && Class1281.Method5173().player.posY >= (double)122) {
                                            v1 = Class1281.Method5173().player;
                                            Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"mc.player");
                                            if (Intrinsics.areEqual((Object)v1.getHeldItemOffhand().item, (Object)Items.AIR)) {
                                                Class1281.Method5173().player.sendChatMessage("/kit bot");
                                            }
                                            if (Class1281.Method5173().player.posZ > Double.longBitsToDouble(-4605606158930437734L)) {
                                                Class1281.Method5173().gameSettings.keyBindForward.pressed = true;
                                                return;
                                            }
                                            Class1281.Method5173().gameSettings.keyBindForward.pressed = false;
                                            if (Class1281.Method5173().player.collidedHorizontally) {
                                                this.Method5165();
                                            }
                                            Class1281.Method5173().gameSettings.keyBindRight.pressed = true;
                                            v2 = Class1281.Method5173().world;
                                            v3 = Class1281.Method5173().player;
                                            Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"mc.player");
                                            v4 = v2.getBlockState(v3.getPosition().down());
                                            Intrinsics.checkExpressionValueIsNotNull((Object)v4, (String)"mc.world.getBlockState(mc.player.position.down())");
                                            if (Intrinsics.areEqual((Object)v4.getBlock(), (Object)Blocks.AIR) == false) return;
                                            this.Field13812 = true;
                                            return;
                                        }
                                        if (this.Field13812) {
                                            this.Method5167();
                                            if (Class1281.Method5173().player.onGround) {
                                                this.Field13813 = true;
                                            }
                                        }
                                    } else {
                                        this.Field13813 = true;
                                    }
                                    if (this.Field13813) {
                                        if (Class1281.Method5173().player.onGround) {
                                            this.Method5154();
                                        }
                                        this.Method5163();
                                        this.Field13813 = false;
                                        this.Field13812 = false;
                                    }
                                    if (this.Field13810) {
                                        var1_1 = this.Field13792;
                                        this.Field13792 = var1_1 + 1;
                                        if (this.Field13792 >= 10) {
                                            Class1281.Method5173().gameSettings.keyBindSneak.pressed = false;
                                            this.Field13810 = false;
                                        }
                                    }
                                    v5 = Class1008.Field12376;
                                    Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"SurroundRewrite.instance");
                                    this.Field13815 = v5.Method35() != false && this.Field13825 != Class1277.Field13758;
                                    v6 = Class1281.Method5173().player;
                                    Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"mc.player");
                                    this.Field13795 = this.Method5169((EntityPlayer)v6);
                                    v7 = Class1281.Method5173().player;
                                    Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"mc.player");
                                    var1_2 = v7.getHealth() + Class1281.Method5173().player.absorptionAmount;
                                    this.Field13778.Method499();
                                    this.Field13780 = this.Field13778.Method496();
                                    this.Method5153();
                                    if (this.Field13794) {
                                        this.Method5129();
                                    }
                                    if (this.Field13780 == null) {
                                        this.Method5167();
                                        return;
                                    }
                                    v8 = Class1281.Method5173().player;
                                    v9 = this.Field13780;
                                    if (v9 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    if (v8.getDistance((Entity)v9) > (float)7) {
                                        this.Field13809 = false;
                                    }
                                    this.Method5138();
                                    this.Field13782 = this.Field13824.values().stream().mapToDouble(Class690.Field10911).sum();
                                    if (this.Field13802) {
                                        if (!this.Method5164() && !this.Field13815) {
                                            this.Method5165();
                                            this.Field13803 = true;
                                        }
                                    } else if (this.Field13803) {
                                        this.Method5166();
                                        this.Field13803 = false;
                                    }
                                    v10 = Class1281.Method5173().player;
                                    v11 = this.Field13780;
                                    if (v11 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    if (!(v10.getDistance((Entity)v11) < (float)10)) break block53;
                                    v12 = this.Field13780;
                                    if (v12 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    if (this.Method5169(v12)) break block53;
                                    v13 = var1_2;
                                    v14 = this.Field13770;
                                    Intrinsics.checkExpressionValueIsNotNull((Object)v14, (String)"healthMovingTrigger");
                                    if (v13 < v14.Method367()) ** GOTO lbl-1000
                                }
                                v15 = this.Field13771;
                                Intrinsics.checkExpressionValueIsNotNull((Object)v15, (String)"dpsMovingTrigger");
                                if (this.Field13782 > v15.Method367()) lbl-1000:
                                // 2 sources

                                {
                                    v16 = true;
                                } else {
                                    v16 = false;
                                }
                                var2_3 = v16;
                                v17 = this.Field13780;
                                if (v17 == null) {
                                    Intrinsics.throwNpe();
                                }
                                var3_4 = this.Method5170(v17);
                                if (!this.Field13795) break block54;
                                this.Field13814 = false;
                                this.Field13790 = 0;
                                this.Field13791 = 0;
                                v18 = this.Field13780;
                                if (v18 == null) {
                                    Intrinsics.throwNpe();
                                }
                                this.Field13825 = this.Method5152(v18);
                                v19 = Class1281.Method5173().player;
                                Intrinsics.checkExpressionValueIsNotNull((Object)v19, (String)"mc.player");
                                this.Field13822 = v19.getPosition();
                                v20 = this.Field13825;
                                if (v20 == null) {
                                    Intrinsics.throwNpe();
                                }
                                v21 = this.Field13780;
                                if (v21 == null) {
                                    Intrinsics.throwNpe();
                                }
                                this.Method5134(v20, v21);
                                var4_5 = "safe";
                                var5_9 = false;
                                System.out.println((Object)var4_5);
                                break block55;
                            }
                            var4_6 = "unsafe";
                            var5_10 = 0;
                            System.out.println((Object)var4_6);
                            if (this.Field13783 != 0.0 && this.Field13784 != 0.0) {
                                var4_7 = 0;
                                if (Class1281.Method5173().player.posX == this.Field13783) {
                                    var5_10 = this.Field13790;
                                    this.Field13790 = var5_10 + 1;
                                    ++var4_7;
                                }
                                if (Class1281.Method5173().player.posZ == this.Field13784) {
                                    var5_10 = this.Field13791;
                                    this.Field13791 = var5_10 + 1;
                                    ++var4_7;
                                }
                            }
                            this.Field13820.Method2801();
                            v22 = Class1180.Field13362.Method5347();
                            if (v22 == null) {
                                Intrinsics.throwNpe();
                            }
                            if (v22.Method35() && this.Field13801) {
                                this.Method5160();
                                this.Field13801 = false;
                            }
                            v23 = this.Field13776;
                            Intrinsics.checkExpressionValueIsNotNull((Object)v23, (String)"autoTrap");
                            if (!v23.Method365()) break block56;
                            v24 = Class1092.Field12889;
                            Intrinsics.checkExpressionValueIsNotNull((Object)v24, (String)"AutoTrap.instance");
                            if (!v24.Method35() || !this.Field13804) break block57;
                        }
                        this.Method5156();
                        this.Field13804 = false;
                    }
                    v25 = this.Field13775;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v25, (String)"holeFiller");
                    if (!v25.Method365()) break block58;
                    Intrinsics.checkExpressionValueIsNotNull(null, (String)"HoleFillerRewrite.instance");
                    if (!null.Method35()) break block59;
                }
                this.Method5158();
            }
            v26 = var1_2;
            v27 = this.Field13770;
            Intrinsics.checkExpressionValueIsNotNull((Object)v27, (String)"healthMovingTrigger");
            this.Field13811 = v26 <= v27.Method367();
            if (this.Field13823 == null) ** GOTO lbl-1000
            v28 = Class1281.Method5173().world;
            v29 = this.Field13823;
            if (v29 == null) {
                Intrinsics.throwNpe();
            }
            v30 = v28.getBlockState(v29);
            Intrinsics.checkExpressionValueIsNotNull((Object)v30, (String)"mc.world.getBlockState(nextHole!!)");
            if (Intrinsics.areEqual((Object)v30.getBlock(), (Object)Blocks.AIR) ^ true) {
                v31 = true;
            } else lbl-1000:
            // 2 sources

            {
                v31 = false;
            }
            var4_8 = v31;
            v32 = this.Field13780;
            if (v32 == null) {
                Intrinsics.throwNpe();
            }
            this.Field13823 = this.Method5133(v32, false, Double.longBitsToDouble(0x4024000000000000L));
            var5_11 = "next hole is " + (this.Field13823 == null ? "" : "non ") + "null";
            var6_12 = false;
            System.out.print((Object)var5_11);
            if (this.Field13814 || var3_4) {
                v33 = this.Field13780;
                if (v33 == null) {
                    Intrinsics.throwNpe();
                }
                if ((var5_11 = this.Method5133(v33, true, Double.longBitsToDouble(0x4024000000000000L))) != null) {
                    this.Field13823 = var5_11;
                    this.Field13814 = true;
                }
            }
            if (this.Field13823 != null) {
                v34 = Class1281.Method5173().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)v34, (String)"mc.player");
                if (Intrinsics.areEqual((Object)this.Field13823, (Object)v34.getPosition())) {
                    this.Method5163();
                    this.Method5167();
                } else {
                    v35 = this.Field13823;
                    if (v35 == null) {
                        Intrinsics.throwNpe();
                    }
                    this.Method5130(v35);
                }
            }
        }
        this.Field13783 = Class1281.Method5173().player.posX;
        this.Field13784 = Class1281.Method5173().player.posZ;
    }

    private final void Method5129() {
        int n;
        int n2;
        int n3 = Class1281.Method5173().player.inventory.mainInventory.stream().filter(Class380.Field9601).mapToInt(Class913.Field11872).sum();
        EntityPlayerSP entityPlayerSP = Class1281.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemOffhand().item, (Object)Items.GOLDEN_APPLE)) {
            EntityPlayerSP entityPlayerSP2 = Class1281.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            ItemStack itemStack = entityPlayerSP2.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.heldItemOffhand");
            n2 = itemStack.getCount();
        } else {
            n2 = 0;
        }
        int n4 = n3 + n2;
        int n5 = Class1281.Method5173().player.inventory.mainInventory.stream().filter(Class1793.Field16224).mapToInt(Class772.Field11269).sum();
        EntityPlayerSP entityPlayerSP3 = Class1281.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
        if (Intrinsics.areEqual((Object)entityPlayerSP3.getHeldItemOffhand().item, (Object)Items.CHORUS_FRUIT)) {
            EntityPlayerSP entityPlayerSP4 = Class1281.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
            ItemStack itemStack = entityPlayerSP4.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.heldItemOffhand");
            n = itemStack.getCount();
        } else {
            n = 0;
        }
        int n6 = n5 + n;
        if (n4 >= this.Field13785 && n6 >= this.Field13789) {
            EntityPlayerSP entityPlayerSP5 = Class1281.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP5, (String)"mc.player");
            if (!(Intrinsics.areEqual((Object)entityPlayerSP5.getHeldItemMainhand().item, (Object)Items.GOLDEN_APPLE) ^ true)) return;
            EntityPlayerSP entityPlayerSP6 = Class1281.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP6, (String)"mc.player");
            if (!(Intrinsics.areEqual((Object)entityPlayerSP6.getHeldItemMainhand().item, (Object)Items.CHORUS_FRUIT) ^ true)) return;
        }
        Class1281.Method5173().gameSettings.keyBindUseItem.pressed = false;
        this.Field13794 = false;
    }

    private final void Method5130(BlockPos blockPos) {
        BlockPos blockPos2;
        BlockPos blockPos3 = blockPos2 = blockPos.up();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos");
        BlockPos blockPos4 = new BlockPos(blockPos3.getX(), Class721.Method3016().getY(), blockPos2.getZ());
        Class44 class44 = this.Field13772;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"strafing");
        if (class44.Method365() && !(Class1281.Method5173().player.getDistanceSq(blockPos4) < (double)6) && !this.Field13811) {
            Class1126 class1126 = Class1126.Field13077;
            Intrinsics.checkExpressionValueIsNotNull((Object)class1126, (String)"Speed.instance");
            class1126.Method21(true);
        }
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos2).shrink(Double.longBitsToDouble((long)1013945946 ^ 0x3FE000003C6F965AL));
        if (Class1281.Method5173().player.getDistanceSq(blockPos4) < (double)4 && this.Method5164()) {
            this.Method5166();
        }
        if (Class1281.Method5173().player.posZ > axisAlignedBB.minZ + Double.longBitsToDouble((long)1346295453 ^ 0x3FC00000503ED69DL)) {
            Class1281.Method5173().gameSettings.keyBindForward.pressed = true;
            this.Field13802 = true;
        } else {
            Class1281.Method5173().gameSettings.keyBindForward.pressed = true;
        }
        if (Class1281.Method5173().player.posZ < axisAlignedBB.minZ - Double.longBitsToDouble(4593671619917905920L)) {
            Class1281.Method5173().gameSettings.keyBindBack.pressed = true;
            this.Field13802 = true;
        } else {
            Class1281.Method5173().gameSettings.keyBindBack.pressed = true;
        }
        if (Class1281.Method5173().player.posX > axisAlignedBB.minX + Double.longBitsToDouble(4593671619917905920L)) {
            Class1281.Method5173().gameSettings.keyBindLeft.pressed = true;
            this.Field13802 = true;
        } else {
            Class1281.Method5173().gameSettings.keyBindLeft.pressed = true;
        }
        if (Class1281.Method5173().player.posX < axisAlignedBB.minX - Double.longBitsToDouble(4593671619917905920L)) {
            Class1281.Method5173().gameSettings.keyBindRight.pressed = true;
            this.Field13802 = true;
            return;
        }
        Class1281.Method5173().gameSettings.keyBindRight.pressed = true;
    }

    private final boolean Method5131(BlockPos blockPos) {
        BlockPos blockPos2 = blockPos.up();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.up()");
        if (!this.Method5132(blockPos2)) return false;
        BlockPos blockPos3 = blockPos.up(2);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.up(2)");
        if (!this.Method5132(blockPos3)) return false;
        BlockPos blockPos4 = blockPos.up(3);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.up(3)");
        if (!this.Method5132(blockPos4)) return false;
        BlockPos blockPos5 = blockPos.up(4);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos.up(4)");
        if (!this.Method5132(blockPos5)) return false;
        return true;
    }

    private final boolean Method5132(BlockPos blockPos) {
        IBlockState iBlockState = Class1281.Method5173().world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
        return Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR);
    }

    private final BlockPos Method5133(EntityPlayer entityPlayer, boolean bl, double d) {
        Collection collection = ((TreeMap)Class223.Field8964.Method1273().keySet().stream().filter(new Class894(this, bl, d, entityPlayer)).collect(Collectors.toMap(new Class746(bl, entityPlayer), Class1974.Field17092, Class926.Field11924, Class1677.Field15812))).values();
        Intrinsics.checkExpressionValueIsNotNull(collection, (String)"HoleProcessor.holes.keys\u2026lockPos>()\n    })).values");
        return (BlockPos)CollectionsKt.firstOrNull((Iterable)collection);
    }

    private final void Method5134(Class1277 class1277, EntityPlayer entityPlayer) {
        BlockPos blockPos;
        block35: {
            block37: {
                block36: {
                    block34: {
                        block33: {
                            this.Method5161();
                            if (this.Field13796 && class1277 != Class1277.Field13755) {
                                Class1281.Method5173().gameSettings.keyBindUseItem.pressed = false;
                                this.Field13796 = false;
                            }
                            if (class1277 != Class1277.Field13758) {
                                this.Method5167();
                                if (this.Field13803) {
                                    this.Method5166();
                                }
                                if (Class1281.Method5173().player.onGround) {
                                    this.Method5154();
                                    this.Field13802 = false;
                                }
                            }
                            if (class1277 != Class1277.Field13757) {
                                this.Field13787 = 11;
                            }
                            if (class1277 != Class1277.Field13755) {
                                this.Field13788 = 50;
                            }
                            if (class1277 != Class1277.Field13754) break block33;
                            EntityPlayerSP entityPlayerSP = Class1281.Method5173().player;
                            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                            if (entityPlayerSP.getHeldItemMainhand().item instanceof ItemSword) break block34;
                        }
                        this.Field13807 = false;
                    }
                    if (class1277 == Class1277.Field13754) break block35;
                    if (this.Field13804) break block36;
                    Class44 class44 = this.Field13776;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"autoTrap");
                    if (class44.Method365()) break block37;
                }
                this.Method5156();
                this.Field13804 = false;
            }
            if (this.Field13801) {
                this.Method5160();
                this.Field13801 = false;
            }
        }
        Class44 class44 = this.Field13775;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"holeFiller");
        if (class44.Method365()) {
            this.Method5157();
        } else {
            this.Method5158();
        }
        if (this.Method5150()) {
            blockPos = new Class960(this);
            Class1281.Method5173().world.loadedEntityList.stream().filter(Class861.Field11635).forEach(new Class1956((Function1)blockPos));
        }
        if ((blockPos = this.Method5151()) != null) {
            Function1 function1 = new Class146(this);
            Class1281.Method5173().world.loadedEntityList.stream().filter(new Class506(blockPos)).forEach(new Class1956(function1));
        }
        switch (Class1543.Field15211[class1277.ordinal()]) {
            case 1: {
                if (this.Field13794) {
                    return;
                }
                int n = Class9.Method116(Items.EXPERIENCE_BOTTLE, 0, 9);
                if (n == -1) return;
                Class9.Method110(n, false);
                Class1281.Method5173().gameSettings.keyBindUseItem.pressed = true;
                Class1281.Method5173().player.rotationPitch = Float.intBitsToFloat(1119092736);
                this.Field13796 = true;
                this.Field13788 = 80;
                return;
            }
            case 2: {
                if (!this.Field13794) return;
                this.Method5146();
                return;
            }
            case 3: {
                int n = Class9.Method112(0, 9, false);
                if (n != -1 && !this.Field13807 && !this.Field13794) {
                    Class9.Method110(n, false);
                    if (!this.Field13801) {
                        this.Method5159();
                        this.Field13801 = true;
                    }
                    this.Field13807 = true;
                }
                Class44 class442 = this.Field13776;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"autoTrap");
                if (!class442.Method365()) return;
                if (!this.Method5168(entityPlayer)) return;
                if (this.Method5149(entityPlayer)) return;
                Class1092 class1092 = Class1092.Field12889;
                Intrinsics.checkExpressionValueIsNotNull((Object)class1092, (String)"AutoTrap.instance");
                if (class1092.Method35()) return;
                this.Method5155();
                this.Field13804 = true;
                return;
            }
            case 4: {
                this.Method5135();
                return;
            }
            case 5: {
                if (this.Field13820.Method2797(500L)) {
                    return;
                }
                EntityPlayerSP entityPlayerSP = Class1281.Method5173().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                float f = entityPlayerSP.getHealth() + Class1281.Method5173().player.absorptionAmount;
                if (!(f >= (float)20)) {
                    if (this.Field13794) return;
                    this.Method5144();
                    return;
                }
                if (this.Method5140() && !this.Method5141() && !this.Method5142() && !this.Method5143(entityPlayer)) {
                    this.Method5140();
                    this.Field13802 = true;
                    return;
                }
                Class44 class443 = this.Field13776;
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"autoTrap");
                if (class443.Method365() && this.Method5168(entityPlayer)) {
                    Class1092 class1092 = Class1092.Field12889;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class1092, (String)"AutoTrap.instance");
                    if (!class1092.Method35()) {
                        this.Method5155();
                        this.Field13804 = true;
                    }
                }
                this.Method5139();
                return;
            }
            case 6: {
                this.Method5136();
                return;
            }
        }
    }

    private final void Method5135() {
    }

    private final void Method5136() {
    }

    private final void Method5137(Entity entity) {
        Class1281.Method5173().player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
    }

    private final void Method5138() {
        double d = this.Field13824.values().stream().mapToDouble(Class1902.Field16754).sum();
        EntityPlayerSP entityPlayerSP = Class1281.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        float f = entityPlayerSP.getHealth() + Class1281.Method5173().player.absorptionAmount;
        if (this.Field13794) return;
        EntityPlayerSP entityPlayerSP2 = Class1281.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (this.Method5169((EntityPlayer)entityPlayerSP2) && !(d >= (double)10)) {
            int n = this.Field13795 ? (this.Method5150() ? 20 : 10) : 15;
            if (!(f < (float)n)) return;
        }
        this.Method5144();
    }

    private final void Method5139() {
        int n;
        if (this.Field13794) return;
        int n2 = Class9.Method116(Items.CHORUS_FRUIT, 0, 9);
        if (n2 == -1) return;
        Class1281.Method5173().player.inventory.currentItem = n2;
        Class1281.Method5173().gameSettings.keyBindUseItem.pressed = true;
        int n3 = Class1281.Method5173().player.inventory.mainInventory.stream().filter(Class1870.Field16587).mapToInt(Class1746.Field16016).sum();
        EntityPlayerSP entityPlayerSP = Class1281.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemOffhand().item, (Object)Items.CHORUS_FRUIT)) {
            EntityPlayerSP entityPlayerSP2 = Class1281.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            ItemStack itemStack = entityPlayerSP2.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.heldItemOffhand");
            n = itemStack.getCount();
        } else {
            n = 0;
        }
        this.Field13789 = n3 + n;
        this.Field13794 = true;
    }

    private final boolean Method5140() {
        BlockPos blockPos = Class721.Method3016().up();
        Class1513 class1513 = new Class1513(this);
        BlockPos blockPos2 = blockPos.down();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"lastHole.down()");
        if (!this.Method5131(blockPos2)) return false;
        BlockPos blockPos3 = blockPos;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"lastHole");
        boolean bl = class1513.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos3, EnumFacing.NORTH);
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = bl;
        boolean bl5 = false;
        if (bl4) {
            Class1281.Method5173().gameSettings.keyBindForward.pressed = true;
            return true;
        }
        bl = class1513.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, EnumFacing.EAST);
        bl2 = false;
        bl3 = false;
        bl4 = bl;
        bl5 = false;
        if (bl4) {
            Class1281.Method5173().gameSettings.keyBindRight.pressed = true;
            return true;
        }
        bl = class1513.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, EnumFacing.WEST);
        bl2 = false;
        bl3 = false;
        bl4 = bl;
        bl5 = false;
        if (bl4) {
            Class1281.Method5173().gameSettings.keyBindLeft.pressed = true;
            return true;
        }
        bl = class1513.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, EnumFacing.SOUTH);
        bl2 = false;
        bl3 = false;
        bl4 = bl;
        bl5 = false;
        if (!bl4) return false;
        Class1281.Method5173().gameSettings.keyBindBack.pressed = true;
        return true;
    }

    private final boolean Method5141() {
        if (Class9.Method120(Blocks.OBSIDIAN, 0, 9) != -1) return false;
        return true;
    }

    private final boolean Method5142() {
        if (Class9.Method116(Items.EXPERIENCE_BOTTLE, 0, 9) == -1) return false;
        if (!Class1281.Method5173().player.inventory.armorInventory.stream().filter(Class2088.Field17532).mapToInt(Class828.Field11526).anyMatch(new Class525(this))) return false;
        return true;
    }

    private final boolean Method5143(EntityPlayer entityPlayer) {
        return false;
    }

    private final void Method5144() {
        int n;
        int n2 = Class9.Method116(Items.GOLDEN_APPLE, 0, 9);
        if (n2 == -1) return;
        Class1281.Method5173().player.inventory.currentItem = n2;
        Class1281.Method5173().gameSettings.keyBindUseItem.pressed = true;
        int n3 = Class1281.Method5173().player.inventory.mainInventory.stream().filter(Class1353.Field14158).mapToInt(Class1647.Field15659).sum();
        EntityPlayerSP entityPlayerSP = Class1281.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemOffhand().item, (Object)Items.GOLDEN_APPLE)) {
            EntityPlayerSP entityPlayerSP2 = Class1281.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            ItemStack itemStack = entityPlayerSP2.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.heldItemOffhand");
            n = itemStack.getCount();
        } else {
            n = 0;
        }
        this.Field13785 = n3 + n;
        this.Field13794 = true;
    }

    private final void Method5145(BlockPos blockPos) {
        int n = Class9.Method120(Blocks.ENDER_CHEST, 0, 9);
        int n2 = Class1281.Method5173().player.inventory.currentItem;
        if (n == -1) return;
        Class1281.Method5173().player.inventory.currentItem = n;
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, false, false);
        Class1281.Method5173().player.inventory.currentItem = n2;
    }

    private final void Method5146() {
        BlockPos blockPos = Class721.Method3016().up();
        Class654 class654 = new Class654(this);
        Class1449 class1449 = new Class1449(this);
        BlockPos blockPos2 = blockPos;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
        if (class654.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos2)) return;
        class1449.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos);
    }

    private final void Method5147(BlockPos blockPos, boolean bl) {
        Class1923 class1923 = new Class1923(this);
        BlockPos blockPos2 = class1923.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, bl);
        if (blockPos2 == null) return;
        this.Method5148(blockPos2, bl);
    }

    private final void Method5148(BlockPos blockPos, boolean bl) {
        if (!this.Field13799) {
            PlayerControllerMP playerControllerMP = Class1281.Method5173().playerController;
            EntityPlayerSP entityPlayerSP = Class1281.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            playerControllerMP.onPlayerDamageBlock(blockPos, entityPlayerSP.getHorizontalFacing());
            this.Field13821 = blockPos;
            this.Field13818.Method2801();
            this.Field13787 = 48;
            this.Field13799 = true;
            return;
        }
        if (!this.Field13818.Method2797(bl ? 2000L : 1000L)) return;
        PlayerControllerMP playerControllerMP = Class1281.Method5173().playerController;
        BlockPos blockPos2 = this.Field13821;
        if (blockPos2 == null) {
            Intrinsics.throwNpe();
        }
        EntityPlayerSP entityPlayerSP = Class1281.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        playerControllerMP.onPlayerDamageBlock(blockPos2, entityPlayerSP.getHorizontalFacing());
        this.Field13799 = false;
    }

    private final boolean Method5149(EntityPlayer entityPlayer) {
        BlockPos blockPos = Class721.Method3015((Entity)entityPlayer);
        BlockPos blockPos2 = blockPos.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.north()");
        if (this.Method5132(blockPos2)) return false;
        BlockPos blockPos3 = blockPos.west();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.west()");
        if (this.Method5132(blockPos3)) return false;
        BlockPos blockPos4 = blockPos.east();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.east()");
        if (this.Method5132(blockPos4)) return false;
        BlockPos blockPos5 = blockPos.south();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos.south()");
        if (this.Method5132(blockPos5)) return false;
        BlockPos blockPos6 = blockPos.down();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos6, (String)"pos.down()");
        if (this.Method5132(blockPos6)) return false;
        BlockPos blockPos7 = blockPos.up(2);
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos7, (String)"pos.up(2)");
        if (this.Method5132(blockPos7)) return false;
        return true;
    }

    private final boolean Method5150() {
        List list = Class1281.Method5173().world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(Class721.Method3016().up().up().up()));
        Intrinsics.checkExpressionValueIsNotNull((Object)list, (String)"mc.world.getEntitiesWith\u2026sition().up().up().up()))");
        Collection collection = list;
        boolean bl = false;
        if (collection.isEmpty()) return false;
        return true;
    }

    private final BlockPos Method5151() {
        boolean bl;
        EntityPlayerSP entityPlayerSP = Class1281.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!this.Method5169((EntityPlayer)entityPlayerSP)) {
            return null;
        }
        Class914 class914 = new Class914(this);
        Map map = Class1281.Method5173().renderGlobal.damagedBlocks;
        Intrinsics.checkExpressionValueIsNotNull((Object)map, (String)"mc.renderGlobal.damagedBlocks");
        Map map2 = map;
        boolean bl2 = false;
        Iterator iterator = map2.entrySet().iterator();
        do {
            if (!iterator.hasNext()) {
                return null;
            }
            Map.Entry entry = iterator.next();
            Object v = entry.getValue();
            Intrinsics.checkExpressionValueIsNotNull(v, (String)"entry.value");
            map2 = ((DestroyBlockProgress)v).getPosition();
            BlockPos blockPos = map2.north();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"pos.north()");
            bl2 = class914.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos);
            boolean bl3 = false;
            boolean bl4 = false;
            bl = bl2;
            boolean bl5 = false;
            if (bl) {
                return map2.north();
            }
            BlockPos blockPos2 = map2.east();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.east()");
            bl2 = class914.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos2);
            bl3 = false;
            bl4 = false;
            bl = bl2;
            bl5 = false;
            if (bl) {
                return map2.east();
            }
            BlockPos blockPos3 = map2.south();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.south()");
            bl2 = class914.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos3);
            bl3 = false;
            bl4 = false;
            bl = bl2;
            bl5 = false;
            if (bl) {
                return map2.south();
            }
            BlockPos blockPos4 = map2.west();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.west()");
            bl2 = class914.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos4);
            bl3 = false;
            bl4 = false;
            bl = bl2;
            bl5 = false;
        } while (!bl);
        return map2.west();
    }

    private final Class1277 Method5152(EntityPlayer entityPlayer) {
        boolean bl = this.Method5168(entityPlayer);
        if (!bl) {
            if (this.Method5142()) {
                return Class1277.Field13755;
            }
            if (this.Method5141()) {
                return Class1277.Field13757;
            }
        } else {
            if (this.Method5141()) return Class1277.Field13758;
            if (this.Method5142()) return Class1277.Field13758;
            if (this.Method5143(entityPlayer)) {
                return Class1277.Field13758;
            }
            float f = Class1281.Method5173().player.getDistance((Entity)entityPlayer);
            PlayerControllerMP playerControllerMP = Class1281.Method5173().playerController;
            Intrinsics.checkExpressionValueIsNotNull((Object)playerControllerMP, (String)"mc.playerController");
            if (f < playerControllerMP.getBlockReachDistance()) {
                return Class1277.Field13754;
            }
        }
        if (this.Method5169(entityPlayer)) {
            float f = Class1281.Method5173().player.getDistance((Entity)entityPlayer);
            PlayerControllerMP playerControllerMP = Class1281.Method5173().playerController;
            Intrinsics.checkExpressionValueIsNotNull((Object)playerControllerMP, (String)"mc.playerController");
            if (f < playerControllerMP.getBlockReachDistance()) {
                return Class1277.Field13754;
            }
        }
        if (this.Method5169(entityPlayer)) {
            return Class1277.Field13758;
        }
        if (!this.Method5169(entityPlayer)) {
            float f = Class1281.Method5173().player.getDistance((Entity)entityPlayer);
            PlayerControllerMP playerControllerMP = Class1281.Method5173().playerController;
            Intrinsics.checkExpressionValueIsNotNull((Object)playerControllerMP, (String)"mc.playerController");
            if (f > playerControllerMP.getBlockReachDistance()) {
                return Class1277.Field13758;
            }
        }
        if (this.Method5169(entityPlayer)) return Class1277.Field13756;
        if (Class1416.Field14544.Field14560.Method1203() != null) return Class1277.Field13756;
        float f = Class1281.Method5173().player.getDistance((Entity)entityPlayer);
        PlayerControllerMP playerControllerMP = Class1281.Method5173().playerController;
        Intrinsics.checkExpressionValueIsNotNull((Object)playerControllerMP, (String)"mc.playerController");
        if (!(f < playerControllerMP.getBlockReachDistance())) return Class1277.Field13756;
        return Class1277.Field13754;
    }

    private final void Method5153() {
        EntityPlayerSP entityPlayerSP = Class1281.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        float f = entityPlayerSP.getHealth() + Class1281.Method5173().player.absorptionAmount;
        Object object = this.Field13824;
        boolean bl = false;
        for (Map.Entry entry : object.entrySet()) {
            if (((Number)entry.getKey()).longValue() >= System.currentTimeMillis()) continue;
            this.Field13824.remove(entry.getKey());
            return;
        }
        if ((double)f < this.Field13781) {
            Map.Entry entry;
            entry = this.Field13824;
            Long l = System.currentTimeMillis() + 1000L;
            object = this.Field13781 - (double)f;
            bl = false;
            entry.put(l, object);
        }
        this.Field13781 = f;
    }

    private final void Method5154() {
    }

    private final void Method5155() {
        Class1092 class1092 = Class1092.Field12889;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1092, (String)"AutoTrap.instance");
        class1092.Method21(true);
    }

    private final void Method5156() {
        Class1092 class1092 = Class1092.Field12889;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1092, (String)"AutoTrap.instance");
        class1092.Method21(false);
    }

    private final void Method5157() {
        Intrinsics.checkExpressionValueIsNotNull(null, (String)"HoleFillerRewrite.instance");
        ((Class42)null).Method21(true);
    }

    private final void Method5158() {
        Intrinsics.checkExpressionValueIsNotNull(null, (String)"HoleFillerRewrite.instance");
        ((Class42)null).Method21(false);
    }

    private final void Method5159() {
        Class1180 class1180 = Class1180.Field13362.Method5347();
        if (class1180 == null) {
            Intrinsics.throwNpe();
        }
        class1180.Method21(true);
    }

    private final void Method5160() {
        Class1180 class1180 = Class1180.Field13362.Method5347();
        if (class1180 == null) {
            Intrinsics.throwNpe();
        }
        class1180.Method21(false);
    }

    private final void Method5161() {
        Class1008 class1008 = Class1008.Field12376;
        if (class1008 == null) {
            Intrinsics.throwNpe();
        }
        class1008.Method21(true);
    }

    private final void Method5162() {
        Class1008 class1008 = Class1008.Field12376;
        if (class1008 == null) {
            Intrinsics.throwNpe();
        }
        class1008.Method21(false);
    }

    private final void Method5163() {
        Class1281.Method5173().player.setVelocity(0.0, Class1281.Method5173().player.motionY, 0.0);
        this.Method5166();
        if (!Class1281.Method5173().player.onGround) return;
        Class1008 class1008 = Class1008.Field12376;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1008, (String)"SurroundRewrite.instance");
        if (!class1008.Method35()) return;
        this.Method5167();
        Class1008 class10082 = Class1008.Field12376;
        Intrinsics.checkExpressionValueIsNotNull((Object)class10082, (String)"SurroundRewrite.instance");
        class10082.Method21(true);
    }

    private final boolean Method5164() {
        Class1913 class1913 = Class1913.Field16898.Method663();
        if (class1913 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class44 = class1913.Method7101();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"MoveModifier.instance!!.stepVal");
        return class44.Method365();
    }

    private final void Method5165() {
        Class1913 class1913 = Class1913.Field16898.Method663();
        if (class1913 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class44 = class1913.Method7101();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"MoveModifier.instance!!.stepVal");
        class44.Method366(true);
    }

    private final void Method5166() {
        Class1913 class1913 = Class1913.Field16898.Method663();
        if (class1913 == null) {
            Intrinsics.throwNpe();
        }
        Class44 class44 = class1913.Method7101();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"MoveModifier.instance!!.stepVal");
        class44.Method366(false);
    }

    private final void Method5167() {
        Class1281.Method5173().gameSettings.keyBindForward.pressed = false;
        Class1281.Method5173().gameSettings.keyBindBack.pressed = false;
        Class1281.Method5173().gameSettings.keyBindLeft.pressed = false;
        Class1281.Method5173().gameSettings.keyBindRight.pressed = false;
        Class1281.Method5173().gameSettings.keyBindSneak.pressed = false;
        Class1281.Method5173().gameSettings.keyBindJump.pressed = false;
    }

    private final boolean Method5168(EntityPlayer entityPlayer) {
        if (!this.Field13795) return false;
        if (!this.Method5169(entityPlayer)) return false;
        if (!(Class1281.Method5173().player.getDistance((Entity)entityPlayer) < 1.0f)) return false;
        return true;
    }

    private final boolean Method5169(EntityPlayer entityPlayer) {
        return Class1914.Method7129((Entity)entityPlayer, false, true);
    }

    private final boolean Method5170(EntityPlayer entityPlayer) {
        if (!(entityPlayer.posY - Class1281.Method5173().player.posY > (double)15)) return false;
        return true;
    }

    private final boolean Method5171(BlockPos blockPos) {
        IBlockState iBlockState = Class1281.Method5173().world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
        return Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.OBSIDIAN);
    }

    private final boolean Method5172(BlockPos blockPos) {
        IBlockState iBlockState = Class1281.Method5173().world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
        return Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.ENDER_CHEST);
    }

    public Class1281() {
        super("Robot", "crystalpvp.cc goes dead", Class97.Field8338);
        Class1515 class1515 = new Class1515(this);
        Class1996 class1996 = this.Field13773;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1996, (String)"renderers");
        this.Field13774 = class1515.Method6046(class1996).Method6042().Method6043();
        this.Field13775 = this.Method23(new Class44("Hole Filler", (Class42)this, true));
        this.Field13776 = this.Method23(new Class44("Auto Trap", (Class42)this, true));
        this.Field13777 = this.Method54();
        Class44 class44 = this.Field13769;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"range");
        Supplier supplier = class44.Method393();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier, (String)"range.supplierDouble");
        Class411 class411 = this.Field13777;
        Intrinsics.checkExpressionValueIsNotNull((Object)class411, (String)"threads");
        this.Field13778 = new Class61(supplier, class411);
        this.Field13779 = new Class1352();
        this.Field13786 = 1;
        this.Field13787 = 11;
        this.Field13816 = "";
        this.Field13817 = "";
        this.Field13818 = new Class650();
        this.Field13819 = new Class650();
        this.Field13820 = new Class650();
        this.Field13824 = new HashMap();
        super.Method44(new Class203(this));
        this.Field13826 = new Class618((Class254)Class2117.Field17635, new Predicate[0]);
        this.Field13827 = new Class618((Class254)new Class1410(this), new Predicate[0]);
    }

    public static final Minecraft Method5173() {
        return Class42.Field8052;
    }

    public static final void Method5174(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final boolean Method5175(Class1281 class1281, BlockPos blockPos) {
        return class1281.Method5131(blockPos);
    }

    public static final BlockPos Method5176(Class1281 class1281) {
        return class1281.Field13822;
    }

    public static final void Method5177(Class1281 class1281, BlockPos blockPos) {
        class1281.Field13822 = blockPos;
    }

    public static final void Method5178(Class1281 class1281, Entity entity) {
        class1281.Method5137(entity);
    }

    public static final boolean Method5179(Class1281 class1281, BlockPos blockPos) {
        return class1281.Method5132(blockPos);
    }

    public static final int Method5180(Class1281 class1281) {
        return class1281.Field13788;
    }

    public static final void Method5181(Class1281 class1281, int n) {
        class1281.Field13788 = n;
    }

    public static final boolean Method5182(Class1281 class1281, BlockPos blockPos) {
        return class1281.Method5172(blockPos);
    }

    public static final void Method5183(Class1281 class1281, BlockPos blockPos, boolean bl) {
        class1281.Method5147(blockPos, bl);
    }

    public static final void Method5184(Class1281 class1281, BlockPos blockPos) {
        class1281.Method5145(blockPos);
    }

    public static final boolean Method5185(Class1281 class1281, BlockPos blockPos) {
        return class1281.Method5171(blockPos);
    }

    public static final EntityPlayer Method5186(Class1281 class1281) {
        return class1281.Field13780;
    }

    public static final void Method5187(Class1281 class1281, EntityPlayer entityPlayer) {
        class1281.Field13780 = entityPlayer;
    }

    public static final Class1277 Method5188(Class1281 class1281) {
        return class1281.Field13825;
    }

    public static final void Method5189(Class1281 class1281, Class1277 class1277) {
        class1281.Field13825 = class1277;
    }

    public static final BlockPos Method5190(Class1281 class1281) {
        return class1281.Field13823;
    }

    public static final void Method5191(Class1281 class1281, BlockPos blockPos) {
        class1281.Field13823 = blockPos;
    }

    public static final boolean Method5192(Class1281 class1281) {
        return class1281.Field13810;
    }

    public static final void Method5193(Class1281 class1281, boolean bl) {
        class1281.Field13810 = bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 108;
            cArray2[n] = (char)(cArray[n] ^ (0x4F00 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

