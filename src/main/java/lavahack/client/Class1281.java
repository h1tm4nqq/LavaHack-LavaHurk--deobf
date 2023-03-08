//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.entity.player.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import net.minecraft.block.state.*;
import net.minecraft.util.math.*;
import java.util.stream.*;
import kotlin.collections.*;
import net.minecraft.item.*;
import kotlin.jvm.functions.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import java.util.function.*;
import net.minecraft.util.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.renderer.*;
import java.util.*;
import net.minecraft.client.*;

@Class1887
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0002J\u0010\u0010X\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020(H\u0002J\b\u0010Z\u001a\u00020UH\u0002J\b\u0010[\u001a\u00020UH\u0002J\b\u0010\\\u001a\u00020UH\u0002J\b\u0010]\u001a\u00020UH\u0002J\b\u0010^\u001a\u00020UH\u0002J\b\u0010_\u001a\u00020UH\u0002J\b\u0010`\u001a\u00020UH\u0002J\b\u0010a\u001a\u00020UH\u0002J\b\u0010b\u001a\u00020UH\u0002J\b\u0010c\u001a\u00020UH\u0002J\b\u0010d\u001a\u00020UH\u0002J\b\u0010e\u001a\u00020UH\u0002J\b\u0010f\u001a\u00020UH\u0002J\u0010\u0010g\u001a\u00020 2\u0006\u0010G\u001a\u00020HH\u0002J\"\u0010h\u001a\u0004\u0018\u00010(2\u0006\u0010G\u001a\u00020H2\u0006\u0010i\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u0010H\u0002J\b\u0010k\u001a\u00020UH\u0002J\b\u0010l\u001a\u00020UH\u0002J\b\u0010m\u001a\u00020UH\u0002J\b\u0010n\u001a\u00020UH\u0002J\b\u0010o\u001a\u00020UH\u0002J\u0010\u0010p\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020(H\u0002J\b\u0010q\u001a\u00020\u000bH\u0002J\n\u0010r\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010s\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020(H\u0002J\u0010\u0010t\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\u0010\u0010v\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020(H\u0002J\u0010\u0010w\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\u0010\u0010x\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\u0010\u0010y\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\u0018\u0010z\u001a\u00020U2\u0006\u0010Y\u001a\u00020(2\u0006\u0010{\u001a\u00020\u000bH\u0002J\u0018\u0010|\u001a\u00020U2\u0006\u0010Y\u001a\u00020(2\u0006\u0010{\u001a\u00020\u000bH\u0002J\b\u0010}\u001a\u00020\u000bH\u0002J\u0010\u0010~\u001a\u00020U2\u0006\u0010\u007f\u001a\u00020(H\u0002J\u0011\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\t\u0010\u0081\u0001\u001a\u00020\u000bH\u0002J\t\u0010\u0082\u0001\u001a\u00020\u000bH\u0002J\t\u0010\u0083\u0001\u001a\u00020UH\u0016J\t\u0010\u0084\u0001\u001a\u00020UH\u0016J\u0013\u0010\u0085\u0001\u001a\u00020U2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0007J\u001a\u0010\u0088\u0001\u001a\u00020U2\u0007\u0010\u0089\u0001\u001a\u00020 2\u0006\u0010G\u001a\u00020HH\u0002J\u0011\u0010\u008a\u0001\u001a\u00020U2\u0006\u0010Y\u001a\u00020(H\u0002J\t\u0010\u008b\u0001\u001a\u00020UH\u0002J\t\u0010\u008c\u0001\u001a\u00020UH\u0002J\t\u0010\u008d\u0001\u001a\u00020UH\u0002J\t\u0010\u008e\u0001\u001a\u00020\u000bH\u0002J\t\u0010\u008f\u0001\u001a\u00020UH\u0002J\t\u0010\u0090\u0001\u001a\u00020UH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010(X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010(X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0010X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0010X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0010X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010;\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010?\u001a\n \u0007*\u0004\u0018\u00010@0@X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020B0=X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010D\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010M\u001a\n \u0007*\u0004\u0018\u00010N0NX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0010X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020,X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u0091\u0001" }, d2 = { "Lcom/kisman/cc/features/module/combat/Robot;", "Lcom/kisman/cc/features/module/Module;", "()V", "announceTimer", "Lcom/kisman/cc/util/TimerUtils;", "autoTrap", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "bowTicks", "", "cantStep", "", "crystalpvpccMode", "damagePerSecond", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "didChorus", "dpsMovingTrigger", "dropped", "enabledAura", "enabledFastExp", "enabledPacketMine", "enabledStep", "enabledTrap", "forcedHole", "handOnly", "hasMined", "healthMovingTrigger", "holeFiller", "holeOperation", "Lcom/kisman/cc/util/enums/RobotHoleOperation;", "holeTimer", "isEating", "isExping", "isMoving", "isSafe", "landed", "lastHole", "Lnet/minecraft/util/math/BlockPos;", "mineTimer", "minedPos", "mode", "", "needsOnGround", "needsUnSneak", "nextHole", "nextHoleRenderer", "Lcom/kisman/cc/util/render/pattern/SlideRendererPattern;", "nextHoleRendererPattern", "Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "packets", "preGappled", "prevChorus", "prevGapples", "prevHealth", "prevPosX", "prevPosZ", "range", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "renderers", "Lcom/kisman/cc/settings/types/SettingGroup;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "st", "strafing", "switchedPickaxe", "switchedToSword", "target", "Lnet/minecraft/entity/player/EntityPlayer;", "targetExpPercent", "targetObsidian", "targets", "Lcom/kisman/cc/util/entity/TargetFinder;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "totalDamagePerSecond1", "triggerMode", "value", "xt", "zt", "breakCrystal", "", "crystal", "Lnet/minecraft/entity/Entity;", "canEnter", "pos", "center", "disableAura", "disableFiller", "disableStep", "disableSurround", "disableTrap", "doEat", "doQuiver", "enableAura", "enableFiller", "enableStep", "enableSurround", "enableTrap", "getHoleOperation", "getNextHole", "force", "forceRadius", "handleChorus", "handleDamage", "handleEat", "handleMineEchest", "handleTower", "isAir", "isBeingCevBreakered", "isBeingRussianed", "isEchest", "isEnemyInSameHole", "player", "isObby", "isPlayerSafe", "isTowering", "isTrapped", "mineBlock", "obby", "mineBlockForEchest", "moveOutHole", "moveToNextHole", "pos1", "needsEffect", "needsMending", "needsObsidian", "onDisable", "onEnable", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "performHoleOperation", "operation", "placeEchest", "reset", "resetMovement", "setUseItemUnpressedIfNeeded", "stepState", "toggleSurround", "update", "kisman.cc" })
public final class Class1281 extends Class42
{
    private final Class44 Field13768;
    private final Class44 Field13769;
    private final Class44 Field13770;
    private final Class44 Field13771;
    private final Class44 Field13772;
    private final Class1996 Field13773;
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
        final EntityPlayerSP player = Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        this.Field13781 = player.getHealth() + Method5173().player.getAbsorptionAmount();
        this.Field13782 = 0.0;
        this.Field13783 = 0.0;
        this.Field13784 = 0.0;
        final int sum = Method5173().player.inventory.mainInventory.stream().filter(Class1611.Field15517).mapToInt(Class473.Field9972).sum();
        final EntityPlayerSP player2 = Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
        int getCount;
        if (player2.getHeldItemOffhand().getItem() == Items.GOLDEN_APPLE) {
            final EntityPlayerSP player3 = Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
            final ItemStack getHeldItemOffhand = player3.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)getHeldItemOffhand, "mc.player.heldItemOffhand");
            getCount = getHeldItemOffhand.getCount();
        }
        else {
            getCount = 0;
        }
        this.Field13785 = sum + getCount;
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
        if (Method5173().player == null || Method5173().world == null) {
            this.Method21(false);
            return;
        }
        final Class1416 field14544 = Class1416.Field14544;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14544, "AutoRer.instance");
        if (!field14544.Method35()) {
            final Class1416 field14545 = Class1416.Field14544;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14545, "AutoRer.instance");
            field14545.Method21(true);
        }
        this.Method5127();
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field13826);
        Class1796.Field16242.Method711(this.Field13827);
        if (Method5173().player == null || Method5173().world == null) {
            return;
        }
        final Class1416 field14544 = Class1416.Field14544;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14544, "AutoRer.instance");
        if (field14544.Method35()) {
            final Class1416 field14545 = Class1416.Field14544;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14545, "AutoRer.instance");
            field14545.Method21(false);
        }
        Method5173().gameSettings.keyBindUseItem.pressed = false;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method5128(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
        this.Field13779.Method2998(this.Field13823, this.Field13774);
    }
    
    @Override
    public void Method45() {
        if (Method5173().player == null || Method5173().world == null) {
            return;
        }
        Method5173().player.rotationYaw = Float.intBitsToFloat(1127481344);
        Method5173().player.rotationPitch = 0.0f;
        final Class44 field13768 = this.Field13768;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13768, "crystalpvpccMode");
        if (field13768.Method365()) {
            if (Method5173().player.ticksExisted > 20 && Method5173().player.posY >= 122) {
                final EntityPlayerSP player = Method5173().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                if (Intrinsics.areEqual((Object)player.getHeldItemOffhand().item, (Object)Items.AIR)) {
                    Method5173().player.sendChatMessage("/kit bot");
                }
                if (Method5173().player.posZ > Double.longBitsToDouble(-4605606158930437734L)) {
                    Method5173().gameSettings.keyBindForward.pressed = true;
                }
                else {
                    Method5173().gameSettings.keyBindForward.pressed = false;
                    if (Method5173().player.collidedHorizontally) {
                        this.Method5165();
                    }
                    Method5173().gameSettings.keyBindRight.pressed = true;
                    final WorldClient world = Method5173().world;
                    final EntityPlayerSP player2 = Method5173().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                    final IBlockState getBlockState = world.getBlockState(player2.getPosition().down());
                    Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(mc.player.position.down())");
                    if (Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR)) {
                        this.Field13812 = true;
                    }
                }
                return;
            }
            if (this.Field13812) {
                this.Method5167();
                if (Method5173().player.onGround) {
                    this.Field13813 = true;
                }
            }
        }
        else {
            this.Field13813 = true;
        }
        if (this.Field13813) {
            if (Method5173().player.onGround) {
                this.Method5154();
            }
            this.Method5163();
            this.Field13813 = false;
            this.Field13812 = false;
        }
        if (this.Field13810) {
            this.Field13792++;
            if (this.Field13792 >= 10) {
                Method5173().gameSettings.keyBindSneak.pressed = false;
                this.Field13810 = false;
            }
        }
        final Class1008 field13769 = Class1008.Field12376;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13769, "SurroundRewrite.instance");
        this.Field13815 = (field13769.Method35() && this.Field13825 != Class1277.Field13758);
        final EntityPlayerSP player3 = Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
        this.Field13795 = this.Method5169((EntityPlayer)player3);
        final EntityPlayerSP player4 = Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player4, "mc.player");
        final float n = player4.getHealth() + Method5173().player.absorptionAmount;
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
        final EntityPlayerSP player5 = Method5173().player;
        final EntityPlayer field13770 = this.Field13780;
        if (field13770 == null) {
            Intrinsics.throwNpe();
        }
        if (player5.getDistance((Entity)field13770) > 7) {
            this.Field13809 = false;
        }
        this.Method5138();
        this.Field13782 = this.Field13824.values().stream().mapToDouble(Class690.Field10911).sum();
        if (this.Field13802) {
            if (!this.Method5164() && !this.Field13815) {
                this.Method5165();
                this.Field13803 = true;
            }
        }
        else if (this.Field13803) {
            this.Method5166();
            this.Field13803 = false;
        }
        final EntityPlayerSP player6 = Method5173().player;
        final EntityPlayer field13771 = this.Field13780;
        if (field13771 == null) {
            Intrinsics.throwNpe();
        }
        Label_0719: {
            if (player6.getDistance((Entity)field13771) < 10) {
                final EntityPlayer field13772 = this.Field13780;
                if (field13772 == null) {
                    Intrinsics.throwNpe();
                }
                if (!this.Method5169(field13772)) {
                    final double n2 = n;
                    final Class44 field13773 = this.Field13770;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field13773, "healthMovingTrigger");
                    if (n2 < field13773.Method367()) {
                        break Label_0719;
                    }
                }
            }
            final double field13774 = this.Field13782;
            final Class44 field13775 = this.Field13771;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13775, "dpsMovingTrigger");
            if (field13774 > field13775.Method367()) {}
        }
        final EntityPlayer field13776 = this.Field13780;
        if (field13776 == null) {
            Intrinsics.throwNpe();
        }
        final boolean method5170 = this.Method5170(field13776);
        if (this.Field13795) {
            this.Field13814 = false;
            this.Field13790 = 0;
            this.Field13791 = 0;
            final EntityPlayer field13777 = this.Field13780;
            if (field13777 == null) {
                Intrinsics.throwNpe();
            }
            this.Field13825 = this.Method5152(field13777);
            final EntityPlayerSP player7 = Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player7, "mc.player");
            this.Field13822 = player7.getPosition();
            final Class1277 field13778 = this.Field13825;
            if (field13778 == null) {
                Intrinsics.throwNpe();
            }
            final EntityPlayer field13779 = this.Field13780;
            if (field13779 == null) {
                Intrinsics.throwNpe();
            }
            this.Method5134(field13778, field13779);
            System.out.println((Object)"safe");
        }
        else {
            System.out.println((Object)"unsafe");
            if (this.Field13783 != 0.0 && this.Field13784 != 0.0) {
                int n3 = 0;
                if (Method5173().player.posX == this.Field13783) {
                    this.Field13790++;
                    ++n3;
                }
                if (Method5173().player.posZ == this.Field13784) {
                    this.Field13791++;
                    ++n3;
                }
            }
            this.Field13820.Method2801();
            final Class1180 method5171 = Class1180.Field13362.Method5347();
            if (method5171 == null) {
                Intrinsics.throwNpe();
            }
            if (method5171.Method35() && this.Field13801) {
                this.Method5160();
                this.Field13801 = false;
            }
            final Class44 field13780 = this.Field13776;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13780, "autoTrap");
            Label_1047: {
                if (field13780.Method365()) {
                    final Class1092 field13781 = Class1092.Field12889;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field13781, "AutoTrap.instance");
                    if (!field13781.Method35() || !this.Field13804) {
                        break Label_1047;
                    }
                }
                this.Method5156();
                this.Field13804 = false;
            }
            final Class44 field13782 = this.Field13775;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13782, "holeFiller");
            Label_1082: {
                if (field13782.Method365()) {
                    final Class1043 class1043 = null;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class1043, "HoleFillerRewrite.instance");
                    if (!class1043.Method35()) {
                        break Label_1082;
                    }
                }
                this.Method5158();
            }
            final double n4 = n;
            final Class44 field13783 = this.Field13770;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13783, "healthMovingTrigger");
            this.Field13811 = (n4 <= field13783.Method367());
            final boolean field13784 = this.Field13811;
            if (this.Field13823 != null) {
                final WorldClient world2 = Method5173().world;
                final BlockPos field13785 = this.Field13823;
                if (field13785 == null) {
                    Intrinsics.throwNpe();
                }
                final IBlockState getBlockState2 = world2.getBlockState(field13785);
                Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState2, "mc.world.getBlockState(nextHole!!)");
                if (Intrinsics.areEqual((Object)getBlockState2.getBlock(), (Object)Blocks.AIR) ^ true) {}
            }
            final EntityPlayer field13786 = this.Field13780;
            if (field13786 == null) {
                Intrinsics.throwNpe();
            }
            this.Field13823 = this.Method5133(field13786, false, Double.longBitsToDouble(4621819117588971520L));
            System.out.print((Object)("next hole is " + ((this.Field13823 == null) ? "" : "non ") + "null"));
            if (this.Field13814 || method5170) {
                final EntityPlayer field13787 = this.Field13780;
                if (field13787 == null) {
                    Intrinsics.throwNpe();
                }
                final BlockPos method5172 = this.Method5133(field13787, true, Double.longBitsToDouble(4621819117588971520L));
                if (method5172 != null) {
                    this.Field13823 = method5172;
                    this.Field13814 = true;
                }
            }
            if (this.Field13823 != null) {
                final BlockPos field13788 = this.Field13823;
                final EntityPlayerSP player8 = Method5173().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player8, "mc.player");
                if (Intrinsics.areEqual((Object)field13788, (Object)player8.getPosition())) {
                    this.Method5163();
                    this.Method5167();
                }
                else {
                    final BlockPos field13789 = this.Field13823;
                    if (field13789 == null) {
                        Intrinsics.throwNpe();
                    }
                    this.Method5130(field13789);
                }
            }
        }
        this.Field13783 = Method5173().player.posX;
        this.Field13784 = Method5173().player.posZ;
    }
    
    private final void Method5129() {
        final int sum = Method5173().player.inventory.mainInventory.stream().filter(Class380.Field9601).mapToInt(Class913.Field11872).sum();
        final EntityPlayerSP player = Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        int getCount;
        if (Intrinsics.areEqual((Object)player.getHeldItemOffhand().item, (Object)Items.GOLDEN_APPLE)) {
            final EntityPlayerSP player2 = Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            final ItemStack getHeldItemOffhand = player2.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)getHeldItemOffhand, "mc.player.heldItemOffhand");
            getCount = getHeldItemOffhand.getCount();
        }
        else {
            getCount = 0;
        }
        final int n = sum + getCount;
        final int sum2 = Method5173().player.inventory.mainInventory.stream().filter(Class1793.Field16224).mapToInt(Class772.Field11269).sum();
        final EntityPlayerSP player3 = Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
        int getCount2;
        if (Intrinsics.areEqual((Object)player3.getHeldItemOffhand().item, (Object)Items.CHORUS_FRUIT)) {
            final EntityPlayerSP player4 = Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player4, "mc.player");
            final ItemStack getHeldItemOffhand2 = player4.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)getHeldItemOffhand2, "mc.player.heldItemOffhand");
            getCount2 = getHeldItemOffhand2.getCount();
        }
        else {
            getCount2 = 0;
        }
        final int n2 = sum2 + getCount2;
        if (n >= this.Field13785 && n2 >= this.Field13789) {
            final EntityPlayerSP player5 = Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player5, "mc.player");
            if (!(Intrinsics.areEqual((Object)player5.getHeldItemMainhand().item, (Object)Items.GOLDEN_APPLE) ^ true)) {
                return;
            }
            final EntityPlayerSP player6 = Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player6, "mc.player");
            if (!(Intrinsics.areEqual((Object)player6.getHeldItemMainhand().item, (Object)Items.CHORUS_FRUIT) ^ true)) {
                return;
            }
        }
        Method5173().gameSettings.keyBindUseItem.pressed = false;
        this.Field13794 = false;
    }
    
    private final void Method5130(final BlockPos blockPos) {
        final BlockPos up;
        final BlockPos blockPos2 = up = blockPos.up();
        Intrinsics.checkExpressionValueIsNotNull((Object)up, "pos");
        final BlockPos blockPos3 = new BlockPos(up.getX(), Class721.Method3016().getY(), blockPos2.getZ());
        final Class44 field13772 = this.Field13772;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13772, "strafing");
        if (field13772.Method365() && Method5173().player.getDistanceSq(blockPos3) >= 6 && !this.Field13811) {
            final Class1126 field13773 = Class1126.Field13077;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13773, "Speed.instance");
            field13773.Method21(true);
        }
        final AxisAlignedBB shrink = new AxisAlignedBB(blockPos2).shrink(Double.longBitsToDouble((long)1013945946 ^ 0x3FE000003C6F965AL));
        if (Method5173().player.getDistanceSq(blockPos3) < 4 && this.Method5164()) {
            this.Method5166();
        }
        if (Method5173().player.posZ > shrink.minZ + Double.longBitsToDouble((long)1346295453 ^ 0x3FC00000503ED69DL)) {
            Method5173().gameSettings.keyBindForward.pressed = true;
            this.Field13802 = true;
        }
        else {
            Method5173().gameSettings.keyBindForward.pressed = true;
        }
        if (Method5173().player.posZ < shrink.minZ - Double.longBitsToDouble(4593671619917905920L)) {
            Method5173().gameSettings.keyBindBack.pressed = true;
            this.Field13802 = true;
        }
        else {
            Method5173().gameSettings.keyBindBack.pressed = true;
        }
        if (Method5173().player.posX > shrink.minX + Double.longBitsToDouble(4593671619917905920L)) {
            Method5173().gameSettings.keyBindLeft.pressed = true;
            this.Field13802 = true;
        }
        else {
            Method5173().gameSettings.keyBindLeft.pressed = true;
        }
        if (Method5173().player.posX < shrink.minX - Double.longBitsToDouble(4593671619917905920L)) {
            Method5173().gameSettings.keyBindRight.pressed = true;
            this.Field13802 = true;
        }
        else {
            Method5173().gameSettings.keyBindRight.pressed = true;
        }
    }
    
    private final boolean Method5131(final BlockPos blockPos) {
        final BlockPos up = blockPos.up();
        Intrinsics.checkExpressionValueIsNotNull((Object)up, "pos.up()");
        if (this.Method5132(up)) {
            final BlockPos up = blockPos.up(2);
            Intrinsics.checkExpressionValueIsNotNull((Object)up, "pos.up(2)");
            if (this.Method5132(up)) {
                final BlockPos up2 = blockPos.up(3);
                Intrinsics.checkExpressionValueIsNotNull((Object)up2, "pos.up(3)");
                if (this.Method5132(up2)) {
                    final BlockPos up3 = blockPos.up(4);
                    Intrinsics.checkExpressionValueIsNotNull((Object)up3, "pos.up(4)");
                    if (this.Method5132(up3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private final boolean Method5132(final BlockPos blockPos) {
        final IBlockState getBlockState = Method5173().world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(pos)");
        return Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR);
    }
    
    private final BlockPos Method5133(final EntityPlayer entityPlayer, final boolean b, final double n) {
        final Collection values = ((TreeMap)Class223.Field8964.Method1273().keySet().stream().filter(new Class894(this, b, n, entityPlayer)).collect(Collectors.toMap((Function<? super Object, ?>)new Class746(b, entityPlayer), (Function<? super Object, ?>)Class1974.Field17092, (BinaryOperator<Object>)Class926.Field11924, (Supplier<TreeMap>)Class1677.Field15812))).values();
        Intrinsics.checkExpressionValueIsNotNull((Object)values, "HoleProcessor.holes.keys\u2026lockPos>()\n    })).values");
        return (BlockPos)CollectionsKt.firstOrNull((Iterable)values);
    }
    
    private final void Method5134(final Class1277 class1277, final EntityPlayer entityPlayer) {
        this.Method5161();
        if (this.Field13796 && class1277 != Class1277.Field13755) {
            Method5173().gameSettings.keyBindUseItem.pressed = false;
            this.Field13796 = false;
        }
        if (class1277 != Class1277.Field13758) {
            this.Method5167();
            if (this.Field13803) {
                this.Method5166();
            }
            if (Method5173().player.onGround) {
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
        Label_0141: {
            if (class1277 == Class1277.Field13754) {
                final EntityPlayerSP player = Method5173().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                if (player.getHeldItemMainhand().item instanceof ItemSword) {
                    break Label_0141;
                }
            }
            this.Field13807 = false;
        }
        if (class1277 != Class1277.Field13754) {
            Label_0181: {
                if (!this.Field13804) {
                    final Class44 field13776 = this.Field13776;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field13776, "autoTrap");
                    if (field13776.Method365()) {
                        break Label_0181;
                    }
                }
                this.Method5156();
                this.Field13804 = false;
            }
            if (this.Field13801) {
                this.Method5160();
                this.Field13801 = false;
            }
        }
        final Class44 field13777 = this.Field13775;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13777, "holeFiller");
        if (field13777.Method365()) {
            this.Method5157();
        }
        else {
            this.Method5158();
        }
        if (this.Method5150()) {
            Method5173().world.loadedEntityList.stream().filter(Class861.Field11635).forEach(new Class1956((Function1)new Class960(this)));
        }
        final BlockPos method5151 = this.Method5151();
        if (method5151 != null) {
            Method5173().world.loadedEntityList.stream().filter(new Class506(method5151)).forEach(new Class1956((Function1)new Class146(this)));
        }
        switch (Class1543.Field15211[class1277.ordinal()]) {
            case 1: {
                if (this.Field13794) {
                    return;
                }
                final int method5152 = Class9.Method116(Items.EXPERIENCE_BOTTLE, 0, 9);
                if (method5152 != -1) {
                    Class9.Method110(method5152, false);
                    Method5173().gameSettings.keyBindUseItem.pressed = true;
                    Method5173().player.rotationPitch = Float.intBitsToFloat(1119092736);
                    this.Field13796 = true;
                    this.Field13788 = 80;
                    break;
                }
                break;
            }
            case 2: {
                if (this.Field13794) {
                    this.Method5146();
                    break;
                }
                break;
            }
            case 3: {
                final int method5153 = Class9.Method112(0, 9, false);
                if (method5153 != -1 && !this.Field13807 && !this.Field13794) {
                    Class9.Method110(method5153, false);
                    if (!this.Field13801) {
                        this.Method5159();
                        this.Field13801 = true;
                    }
                    this.Field13807 = true;
                }
                final Class44 field13778 = this.Field13776;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13778, "autoTrap");
                if (!field13778.Method365() || !this.Method5168(entityPlayer) || this.Method5149(entityPlayer)) {
                    break;
                }
                final Class1092 field13779 = Class1092.Field12889;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13779, "AutoTrap.instance");
                if (!field13779.Method35()) {
                    this.Method5155();
                    this.Field13804 = true;
                    break;
                }
                break;
            }
            case 4: {
                this.Method5135();
                break;
            }
            case 5: {
                if (this.Field13820.Method2797(500L)) {
                    return;
                }
                final EntityPlayerSP player2 = Method5173().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                if (player2.getHealth() + Method5173().player.absorptionAmount < 20) {
                    if (!this.Field13794) {
                        this.Method5144();
                    }
                    break;
                }
                if (this.Method5140() && !this.Method5141() && !this.Method5142() && !this.Method5143(entityPlayer)) {
                    this.Method5140();
                    this.Field13802 = true;
                    break;
                }
                final Class44 field13780 = this.Field13776;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13780, "autoTrap");
                if (field13780.Method365() && this.Method5168(entityPlayer)) {
                    final Class1092 field13781 = Class1092.Field12889;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field13781, "AutoTrap.instance");
                    if (!field13781.Method35()) {
                        this.Method5155();
                        this.Field13804 = true;
                    }
                }
                this.Method5139();
                break;
            }
            case 6: {
                this.Method5136();
                break;
            }
        }
    }
    
    private final void Method5135() {
    }
    
    private final void Method5136() {
    }
    
    private final void Method5137(final Entity entity) {
        Method5173().player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
    }
    
    private final void Method5138() {
        final double sum = this.Field13824.values().stream().mapToDouble(Class1902.Field16754).sum();
        final EntityPlayerSP player = Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        final float n = player.getHealth() + Method5173().player.absorptionAmount;
        if (!this.Field13794) {
            final EntityPlayerSP player2 = Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            if (!this.Method5169((EntityPlayer)player2) || sum >= 10 || n < (this.Field13795 ? (this.Method5150() ? 20 : 10) : 15)) {
                this.Method5144();
            }
        }
    }
    
    private final void Method5139() {
        if (!this.Field13794) {
            final int method116 = Class9.Method116(Items.CHORUS_FRUIT, 0, 9);
            if (method116 != -1) {
                Method5173().player.inventory.currentItem = method116;
                Method5173().gameSettings.keyBindUseItem.pressed = true;
                final int sum = Method5173().player.inventory.mainInventory.stream().filter(Class1870.Field16587).mapToInt(Class1746.Field16016).sum();
                final EntityPlayerSP player = Method5173().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                int getCount;
                if (Intrinsics.areEqual((Object)player.getHeldItemOffhand().item, (Object)Items.CHORUS_FRUIT)) {
                    final EntityPlayerSP player2 = Method5173().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                    final ItemStack getHeldItemOffhand = player2.getHeldItemOffhand();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getHeldItemOffhand, "mc.player.heldItemOffhand");
                    getCount = getHeldItemOffhand.getCount();
                }
                else {
                    getCount = 0;
                }
                this.Field13789 = sum + getCount;
                this.Field13794 = true;
            }
        }
    }
    
    private final boolean Method5140() {
        final BlockPos up = Class721.Method3016().up();
        final Class1513 class1513 = new Class1513(this);
        final BlockPos down = up.down();
        Intrinsics.checkExpressionValueIsNotNull((Object)down, "lastHole.down()");
        if (this.Method5131(down)) {
            final Class1513 class1514 = class1513;
            final BlockPos blockPos = up;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, "lastHole");
            if (class1514.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, EnumFacing.NORTH)) {
                return Method5173().gameSettings.keyBindForward.pressed = true;
            }
            if (class1513.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(up, EnumFacing.EAST)) {
                return Method5173().gameSettings.keyBindRight.pressed = true;
            }
            if (class1513.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(up, EnumFacing.WEST)) {
                return Method5173().gameSettings.keyBindLeft.pressed = true;
            }
            if (class1513.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(up, EnumFacing.SOUTH)) {
                return Method5173().gameSettings.keyBindBack.pressed = true;
            }
        }
        return false;
    }
    
    private final boolean Method5141() {
        return Class9.Method120(Blocks.OBSIDIAN, 0, 9) == -1;
    }
    
    private final boolean Method5142() {
        return Class9.Method116(Items.EXPERIENCE_BOTTLE, 0, 9) != -1 && Method5173().player.inventory.armorInventory.stream().filter(Class2088.Field17532).mapToInt(Class828.Field11526).anyMatch(new Class525(this));
    }
    
    private final boolean Method5143(final EntityPlayer entityPlayer) {
        return false;
    }
    
    private final void Method5144() {
        final int method116 = Class9.Method116(Items.GOLDEN_APPLE, 0, 9);
        if (method116 != -1) {
            Method5173().player.inventory.currentItem = method116;
            Method5173().gameSettings.keyBindUseItem.pressed = true;
            final int sum = Method5173().player.inventory.mainInventory.stream().filter(Class1353.Field14158).mapToInt(Class1647.Field15659).sum();
            final EntityPlayerSP player = Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            int getCount;
            if (Intrinsics.areEqual((Object)player.getHeldItemOffhand().item, (Object)Items.GOLDEN_APPLE)) {
                final EntityPlayerSP player2 = Method5173().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                final ItemStack getHeldItemOffhand = player2.getHeldItemOffhand();
                Intrinsics.checkExpressionValueIsNotNull((Object)getHeldItemOffhand, "mc.player.heldItemOffhand");
                getCount = getHeldItemOffhand.getCount();
            }
            else {
                getCount = 0;
            }
            this.Field13785 = sum + getCount;
            this.Field13794 = true;
        }
    }
    
    private final void Method5145(final BlockPos blockPos) {
        final int method120 = Class9.Method120(Blocks.ENDER_CHEST, 0, 9);
        final int currentItem = Method5173().player.inventory.currentItem;
        if (method120 != -1) {
            Method5173().player.inventory.currentItem = method120;
            Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, false, false);
            Method5173().player.inventory.currentItem = currentItem;
        }
    }
    
    private final void Method5146() {
        final BlockPos up = Class721.Method3016().up();
        final Class654 class654 = new Class654(this);
        final Class1449 class655 = new Class1449(this);
        final Class654 class656 = class654;
        final BlockPos blockPos = up;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, "pos");
        if (!class656.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos)) {
            class655.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(up);
        }
    }
    
    private final void Method5147(final BlockPos blockPos, final boolean b) {
        final BlockPos leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new Class1923(this).leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, b);
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi != null) {
            this.Method5148(leqS0IyKEB621E1SrHdAcHHAUjScjmKi, b);
        }
    }
    
    private final void Method5148(final BlockPos field13821, final boolean b) {
        if (this.Field13799) {
            if (this.Field13818.Method2797(b ? 2000L : 1000L)) {
                final PlayerControllerMP playerController = Method5173().playerController;
                final BlockPos field13822 = this.Field13821;
                if (field13822 == null) {
                    Intrinsics.throwNpe();
                }
                final EntityPlayerSP player = Method5173().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                playerController.onPlayerDamageBlock(field13822, player.getHorizontalFacing());
                this.Field13799 = false;
            }
        }
        else {
            final PlayerControllerMP playerController2 = Method5173().playerController;
            final EntityPlayerSP player2 = Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            playerController2.onPlayerDamageBlock(field13821, player2.getHorizontalFacing());
            this.Field13821 = field13821;
            this.Field13818.Method2801();
            this.Field13787 = 48;
            this.Field13799 = true;
        }
    }
    
    private final boolean Method5149(final EntityPlayer entityPlayer) {
        final BlockPos method3015 = Class721.Method3015((Entity)entityPlayer);
        final BlockPos north = method3015.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)north, "pos.north()");
        if (!this.Method5132(north)) {
            final BlockPos west = method3015.west();
            Intrinsics.checkExpressionValueIsNotNull((Object)west, "pos.west()");
            if (!this.Method5132(west)) {
                final BlockPos east = method3015.east();
                Intrinsics.checkExpressionValueIsNotNull((Object)east, "pos.east()");
                if (!this.Method5132(east)) {
                    final BlockPos south = method3015.south();
                    Intrinsics.checkExpressionValueIsNotNull((Object)south, "pos.south()");
                    if (!this.Method5132(south)) {
                        final BlockPos down = method3015.down();
                        Intrinsics.checkExpressionValueIsNotNull((Object)down, "pos.down()");
                        if (!this.Method5132(down)) {
                            final BlockPos up = method3015.up(2);
                            Intrinsics.checkExpressionValueIsNotNull((Object)up, "pos.up(2)");
                            if (!this.Method5132(up)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private final boolean Method5150() {
        final List getEntitiesWithinAABBExcludingEntity = Method5173().world.getEntitiesWithinAABBExcludingEntity((Entity)null, new AxisAlignedBB(Class721.Method3016().up().up().up()));
        Intrinsics.checkExpressionValueIsNotNull((Object)getEntitiesWithinAABBExcludingEntity, "mc.world.getEntitiesWith\u2026sition().up().up().up()))");
        return !getEntitiesWithinAABBExcludingEntity.isEmpty();
    }
    
    private final BlockPos Method5151() {
        final EntityPlayerSP player = Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        BlockPos blockPos;
        if (!this.Method5169((EntityPlayer)player)) {
            blockPos = null;
        }
        else {
            final Class914 class914 = new Class914(this);
            final Map damagedBlocks = Method5173().renderGlobal.damagedBlocks;
            Intrinsics.checkExpressionValueIsNotNull((Object)damagedBlocks, "mc.renderGlobal.damagedBlocks");
            final Iterator<Map.Entry<K, Object>> iterator = damagedBlocks.entrySet().iterator();
            while (iterator.hasNext()) {
                final Object value = iterator.next().getValue();
                Intrinsics.checkExpressionValueIsNotNull(value, "entry.value");
                final BlockPos getPosition = ((DestroyBlockProgress)value).getPosition();
                final Class914 class915 = class914;
                final BlockPos north = getPosition.north();
                Intrinsics.checkExpressionValueIsNotNull((Object)north, "pos.north()");
                if (class915.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(north)) {
                    return getPosition.north();
                }
                final Class914 class916 = class914;
                final BlockPos east = getPosition.east();
                Intrinsics.checkExpressionValueIsNotNull((Object)east, "pos.east()");
                if (class916.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(east)) {
                    return getPosition.east();
                }
                final Class914 class917 = class914;
                final BlockPos south = getPosition.south();
                Intrinsics.checkExpressionValueIsNotNull((Object)south, "pos.south()");
                if (class917.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(south)) {
                    return getPosition.south();
                }
                final Class914 class918 = class914;
                final BlockPos west = getPosition.west();
                Intrinsics.checkExpressionValueIsNotNull((Object)west, "pos.west()");
                if (class918.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(west)) {
                    return getPosition.west();
                }
            }
            blockPos = null;
        }
        return blockPos;
    }
    
    private final Class1277 Method5152(final EntityPlayer entityPlayer) {
        if (!this.Method5168(entityPlayer)) {
            if (this.Method5142()) {
                return Class1277.Field13755;
            }
            if (this.Method5141()) {
                return Class1277.Field13757;
            }
        }
        else {
            if (this.Method5141() || this.Method5142() || this.Method5143(entityPlayer)) {
                return Class1277.Field13758;
            }
            final float getDistance = Method5173().player.getDistance((Entity)entityPlayer);
            final PlayerControllerMP playerController = Method5173().playerController;
            Intrinsics.checkExpressionValueIsNotNull((Object)playerController, "mc.playerController");
            if (getDistance < playerController.getBlockReachDistance()) {
                return Class1277.Field13754;
            }
        }
        if (this.Method5169(entityPlayer)) {
            final float getDistance2 = Method5173().player.getDistance((Entity)entityPlayer);
            final PlayerControllerMP playerController2 = Method5173().playerController;
            Intrinsics.checkExpressionValueIsNotNull((Object)playerController2, "mc.playerController");
            if (getDistance2 < playerController2.getBlockReachDistance()) {
                return Class1277.Field13754;
            }
        }
        if (this.Method5169(entityPlayer)) {
            return Class1277.Field13758;
        }
        if (!this.Method5169(entityPlayer)) {
            final float getDistance3 = Method5173().player.getDistance((Entity)entityPlayer);
            final PlayerControllerMP playerController3 = Method5173().playerController;
            Intrinsics.checkExpressionValueIsNotNull((Object)playerController3, "mc.playerController");
            if (getDistance3 > playerController3.getBlockReachDistance()) {
                return Class1277.Field13758;
            }
        }
        if (!this.Method5169(entityPlayer) && Class1416.Field14544.Field14560.Method1203() == null) {
            final float getDistance4 = Method5173().player.getDistance((Entity)entityPlayer);
            final PlayerControllerMP playerController4 = Method5173().playerController;
            Intrinsics.checkExpressionValueIsNotNull((Object)playerController4, "mc.playerController");
            if (getDistance4 < playerController4.getBlockReachDistance()) {
                return Class1277.Field13754;
            }
        }
        return Class1277.Field13756;
    }
    
    private final void Method5153() {
        final EntityPlayerSP player = Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        final float n = player.getHealth() + Method5173().player.absorptionAmount;
        for (final Map.Entry<Number, V> entry : this.Field13824.entrySet()) {
            if (entry.getKey().longValue() < System.currentTimeMillis()) {
                this.Field13824.remove(entry.getKey());
                return;
            }
        }
        if (n < this.Field13781) {
            this.Field13824.put(System.currentTimeMillis() + 1000L, this.Field13781 - n);
        }
        this.Field13781 = n;
    }
    
    private final void Method5154() {
    }
    
    private final void Method5155() {
        final Class1092 field12889 = Class1092.Field12889;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12889, "AutoTrap.instance");
        field12889.Method21(true);
    }
    
    private final void Method5156() {
        final Class1092 field12889 = Class1092.Field12889;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12889, "AutoTrap.instance");
        field12889.Method21(false);
    }
    
    private final void Method5157() {
        final Class1043 class1043 = null;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1043, "HoleFillerRewrite.instance");
        class1043.Method21(true);
    }
    
    private final void Method5158() {
        final Class1043 class1043 = null;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1043, "HoleFillerRewrite.instance");
        class1043.Method21(false);
    }
    
    private final void Method5159() {
        final Class1180 method5347 = Class1180.Field13362.Method5347();
        if (method5347 == null) {
            Intrinsics.throwNpe();
        }
        method5347.Method21(true);
    }
    
    private final void Method5160() {
        final Class1180 method5347 = Class1180.Field13362.Method5347();
        if (method5347 == null) {
            Intrinsics.throwNpe();
        }
        method5347.Method21(false);
    }
    
    private final void Method5161() {
        final Class1008 field12376 = Class1008.Field12376;
        if (field12376 == null) {
            Intrinsics.throwNpe();
        }
        field12376.Method21(true);
    }
    
    private final void Method5162() {
        final Class1008 field12376 = Class1008.Field12376;
        if (field12376 == null) {
            Intrinsics.throwNpe();
        }
        field12376.Method21(false);
    }
    
    private final void Method5163() {
        Method5173().player.setVelocity(0.0, Method5173().player.motionY, 0.0);
        this.Method5166();
        if (Method5173().player.onGround) {
            final Class1008 field12376 = Class1008.Field12376;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12376, "SurroundRewrite.instance");
            if (field12376.Method35()) {
                this.Method5167();
                final Class1008 field12377 = Class1008.Field12376;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12377, "SurroundRewrite.instance");
                field12377.Method21(true);
            }
        }
    }
    
    private final boolean Method5164() {
        final Class1913 method663 = Class1913.Field16898.Method663();
        if (method663 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 method664 = method663.Method7101();
        Intrinsics.checkExpressionValueIsNotNull((Object)method664, "MoveModifier.instance!!.stepVal");
        return method664.Method365();
    }
    
    private final void Method5165() {
        final Class1913 method663 = Class1913.Field16898.Method663();
        if (method663 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 method664 = method663.Method7101();
        Intrinsics.checkExpressionValueIsNotNull((Object)method664, "MoveModifier.instance!!.stepVal");
        method664.Method366(true);
    }
    
    private final void Method5166() {
        final Class1913 method663 = Class1913.Field16898.Method663();
        if (method663 == null) {
            Intrinsics.throwNpe();
        }
        final Class44 method664 = method663.Method7101();
        Intrinsics.checkExpressionValueIsNotNull((Object)method664, "MoveModifier.instance!!.stepVal");
        method664.Method366(false);
    }
    
    private final void Method5167() {
        Method5173().gameSettings.keyBindForward.pressed = false;
        Method5173().gameSettings.keyBindBack.pressed = false;
        Method5173().gameSettings.keyBindLeft.pressed = false;
        Method5173().gameSettings.keyBindRight.pressed = false;
        Method5173().gameSettings.keyBindSneak.pressed = false;
        Method5173().gameSettings.keyBindJump.pressed = false;
    }
    
    private final boolean Method5168(final EntityPlayer entityPlayer) {
        return this.Field13795 && this.Method5169(entityPlayer) && Method5173().player.getDistance((Entity)entityPlayer) < 1.0f;
    }
    
    private final boolean Method5169(final EntityPlayer entityPlayer) {
        return Class1914.Method7129((Entity)entityPlayer, false, true);
    }
    
    private final boolean Method5170(final EntityPlayer entityPlayer) {
        return entityPlayer.posY - Method5173().player.posY > 15;
    }
    
    private final boolean Method5171(final BlockPos blockPos) {
        final IBlockState getBlockState = Method5173().world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(pos)");
        return Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.OBSIDIAN);
    }
    
    private final boolean Method5172(final BlockPos blockPos) {
        final IBlockState getBlockState = Method5173().world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(pos)");
        return Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.ENDER_CHEST);
    }
    
    public Class1281() {
        super("Robot", "crystalpvp.cc goes dead", Class97.Field8338);
        this.Field13768 = this.Method23(new Class44("CrystalPvPcc Mode", this, true).Method355("crystalpvp.cc"));
        this.Field13769 = this.Method23(new Class44("Range", this, Double.longBitsToDouble((long)1605945235 ^ 0x406900005FB8C793L), 1.0, Double.longBitsToDouble(4641240890982006784L), true));
        this.Field13770 = this.Method23(new Class44("Health Moving Trigger", this, Double.longBitsToDouble(4625619029774565376L), 1.0, Double.longBitsToDouble((long)1237389133 ^ 0x4042800049C10F4DL), false));
        this.Field13771 = this.Method23(new Class44("DPS Moving Trigger", this, Double.longBitsToDouble((long)341755072 ^ 0x40240000145EC4C0L), 0.0, Double.longBitsToDouble((long)2133437267 ^ 0x404400007F29AB53L), false));
        this.Field13772 = this.Method23(new Class44("Strafing", this, false));
        this.Field13773 = this.Method24(new Class1996(new Class44("Renderers", this)));
        final Class1515 class1515 = new Class1515(this);
        final Class1996 field13773 = this.Field13773;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13773, "renderers");
        this.Field13774 = class1515.Method6046(field13773).Method6042().Method6043();
        this.Field13775 = this.Method23(new Class44("Hole Filler", this, true));
        this.Field13776 = this.Method23(new Class44("Auto Trap", this, true));
        this.Field13777 = this.Method54();
        final Class44 field13774 = this.Field13769;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13774, "range");
        final Supplier method393 = field13774.Method393();
        Intrinsics.checkExpressionValueIsNotNull((Object)method393, "range.supplierDouble");
        final Class411 field13775 = this.Field13777;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13775, "threads");
        this.Field13778 = new Class61(method393, field13775);
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
        this.Field13826 = new Class618(Class2117.Field17635, new Predicate[0]);
        this.Field13827 = new Class618(new Class1410(this), new Predicate[0]);
    }
    
    public static final Minecraft Method5173() {
        return Class42.Field8052;
    }
    
    public static final void Method5174(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final boolean Method5175(final Class1281 class1281, final BlockPos blockPos) {
        return class1281.Method5131(blockPos);
    }
    
    public static final BlockPos Method5176(final Class1281 class1281) {
        return class1281.Field13822;
    }
    
    public static final void Method5177(final Class1281 class1281, final BlockPos field13822) {
        class1281.Field13822 = field13822;
    }
    
    public static final void Method5178(final Class1281 class1281, final Entity entity) {
        class1281.Method5137(entity);
    }
    
    public static final boolean Method5179(final Class1281 class1281, final BlockPos blockPos) {
        return class1281.Method5132(blockPos);
    }
    
    public static final int Method5180(final Class1281 class1281) {
        return class1281.Field13788;
    }
    
    public static final void Method5181(final Class1281 class1281, final int field13788) {
        class1281.Field13788 = field13788;
    }
    
    public static final boolean Method5182(final Class1281 class1281, final BlockPos blockPos) {
        return class1281.Method5172(blockPos);
    }
    
    public static final void Method5183(final Class1281 class1281, final BlockPos blockPos, final boolean b) {
        class1281.Method5147(blockPos, b);
    }
    
    public static final void Method5184(final Class1281 class1281, final BlockPos blockPos) {
        class1281.Method5145(blockPos);
    }
    
    public static final boolean Method5185(final Class1281 class1281, final BlockPos blockPos) {
        return class1281.Method5171(blockPos);
    }
    
    public static final EntityPlayer Method5186(final Class1281 class1281) {
        return class1281.Field13780;
    }
    
    public static final void Method5187(final Class1281 class1281, final EntityPlayer field13780) {
        class1281.Field13780 = field13780;
    }
    
    public static final Class1277 Method5188(final Class1281 class1281) {
        return class1281.Field13825;
    }
    
    public static final void Method5189(final Class1281 class1281, final Class1277 field13825) {
        class1281.Field13825 = field13825;
    }
    
    public static final BlockPos Method5190(final Class1281 class1281) {
        return class1281.Field13823;
    }
    
    public static final void Method5191(final Class1281 class1281, final BlockPos field13823) {
        class1281.Field13823 = field13823;
    }
    
    public static final boolean Method5192(final Class1281 class1281) {
        return class1281.Field13810;
    }
    
    public static final void Method5193(final Class1281 class1281, final boolean field13810) {
        class1281.Field13810 = field13810;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4F00 ^ 0x6C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
