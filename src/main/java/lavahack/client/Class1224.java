//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import java.util.*;
import net.minecraft.block.state.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import kotlin.*;
import java.util.function.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001.B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020#H\u0016J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010+\u001a\u00020#2\u0006\u0010)\u001a\u00020,H\u0007J\b\u0010-\u001a\u00020#H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D?\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004?\u0006\u0002\n\u0000?\u0006/" }, d2 = { "Lcom/kisman/cc/features/module/misc/SkyBlockFeatures;", "Lcom/kisman/cc/features/module/Module;", "()V", "crackedStoneBricks", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "crackedStoneBricksRenderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "crackedStoneBricksRendererGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "esp", "flag1", "", "heAOTDSlot", "heAOTESlot", "heDelay", "heLogic", "heManualDelay", "hyperionExploit", "hyperionExploitG", "hyperionExploitManualState", "", "hyperionExploitManualTimer", "Lcom/kisman/cc/util/TimerUtils;", "hyperionExploitTimer", "lever", "leverRenderer", "leverRendererGroup", "renderBlock", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventRenderBlock;", "toRender", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/BlockPos;", "doHyperionExploit", "", "fixSlot", "slot", "onDisable", "onEnable", "onMouseInput", "event", "Lnet/minecraftforge/fml/common/gameevent/InputEvent$MouseInputEvent;", "onRenderWorld", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "update", "HyperionExploitLogic", "kisman.cc" })
public final class Class1224 extends Class42
{
    private final Class1996 Field13543;
    private final Class1996 Field13544;
    private final Class44 Field13545;
    private final Class1996 Field13546;
    private final Class1612 Field13547;
    private final Class44 Field13548;
    private final Class1996 Field13549;
    private final Class1612 Field13550;
    private final Class44 Field13551;
    private final Class44 Field13552;
    private final Class44 Field13553;
    private final Class44 Field13554;
    private final Class44 Field13555;
    private final Class44 Field13556;
    private final ArrayList Field13557;
    private final Class650 Field13558;
    private final Class650 Field13559;
    private final int Field13560 = 0;
    private boolean Field13561;
    private final Class618 Field13562;
    private int Field13563;
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field13562);
        this.Field13558.Method2801();
        this.Field13559.Method2801();
        this.Field13557.clear();
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field13562);
    }
    
    @Override
    public void Method45() {
        final Class44 field13551 = this.Field13551;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13551, "hyperionExploit");
        if (!field13551.Method365()) {
            final Class650 field13552 = this.Field13558;
            final Class44 field13553 = this.Field13554;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13553, "heDelay");
            if (field13552.Method2797(field13553.Method369())) {
                this.Field13558.Method2801();
            }
        }
        final Class650 field13554 = this.Field13559;
        final Class44 field13555 = this.Field13556;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13555, "heManualDelay");
        if (field13554.Method2797(field13555.Method369())) {
            this.Field13559.Method2801();
            final Class44 field13556 = this.Field13551;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13556, "hyperionExploit");
            if (field13556.Method365() && Method4926().player != null && Method4926().world != null && this.Field13561) {
                final InventoryPlayer inventory = Method4926().player.inventory;
                final Class44 field13557 = this.Field13553;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13557, "heAOTDSlot");
                inventory.currentItem = this.Method4925(field13557.Method335());
                Method4926().playerController.processRightClick((EntityPlayer)Method4926().player, (World)Method4926().world, EnumHand.MAIN_HAND);
                final InventoryPlayer inventory2 = Method4926().player.inventory;
                final Class44 field13558 = this.Field13552;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13558, "heAOTESlot");
                inventory2.currentItem = this.Method4925(field13558.Method335());
                this.Field13561 = false;
            }
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method4922(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
        for (final BlockPos blockPos : new ArrayList<BlockPos>(this.Field13557)) {
            final IBlockState getBlockState = Method4926().world.getBlockState(blockPos);
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(pos)");
            if (Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.LEVER)) {
                final Class44 field13545 = this.Field13545;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13545, "lever");
                if (!field13545.Method365()) {
                    continue;
                }
                final Class1612 field13546 = this.Field13547;
                final BlockPos blockPos2 = blockPos;
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, "pos");
                field13546.Method3805(blockPos2);
            }
        }
        this.Field13557.clear();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method4923(@NotNull @NotNull final InputEvent$MouseInputEvent inputEvent$MouseInputEvent) {
        Intrinsics.checkParameterIsNotNull((Object)inputEvent$MouseInputEvent, "event");
        if (Method4926().player != null && Method4926().world != null) {
            final Class44 field13551 = this.Field13551;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13551, "hyperionExploit");
            if (field13551.Method365() && Mouse.isCreated() && Mouse.getEventButtonState() && Mouse.getEventButton() == 1) {
                this.Method4924();
            }
        }
    }
    
    private final void Method4924() {
        final Class44 field13555 = this.Field13555;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13555, "heLogic");
        final Enum method341 = field13555.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.misc.SkyBlockFeatures.HyperionExploitLogic");
        }
        switch (Class2095.Field17551[((Class1881)method341).ordinal()]) {
            case 1: {
                final InventoryPlayer inventory = Method4926().player.inventory;
                final Class44 field13556 = this.Field13553;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13556, "heAOTDSlot");
                inventory.currentItem = this.Method4925(field13556.Method335());
                Method4926().playerController.processRightClick((EntityPlayer)Method4926().player, (World)Method4926().world, EnumHand.MAIN_HAND);
                final InventoryPlayer inventory2 = Method4926().player.inventory;
                final Class44 field13557 = this.Field13552;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13557, "heAOTESlot");
                inventory2.currentItem = this.Method4925(field13557.Method335());
                break;
            }
            case 2: {
                if (!this.Field13561) {
                    this.Field13561 = true;
                    break;
                }
                break;
            }
        }
    }
    
    private final int Method4925(final int n) {
        return n - 1;
    }
    
    public Class1224() {
        super("SkyBlockFeatures", "Legit features for Hypixel SkyBlock...", Class97.Field8343);
        this.Field13543 = this.Method24(new Class1996(new Class44("EPS", this)));
        this.Field13544 = this.Method24(new Class1996(new Class44("Hyperion Exploit", this)));
        this.Field13545 = this.Method23(this.Field13543.Method7405(new Class44("Lever", this, false)));
        this.Field13546 = this.Method24(this.Field13543.Method7406(new Class1996(new Class44("Renderer", this))));
        final Class1612 class1612 = new Class1612(this);
        final Class1996 field13546 = this.Field13546;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13546, "leverRendererGroup");
        this.Field13547 = ((Class1612)class1612.Method772(field13546)).Method3788().Method3789();
        this.Field13548 = this.Method23(this.Field13543.Method7405(new Class44("Cracked Stone Bricks", this, false)));
        this.Field13549 = this.Method24(this.Field13543.Method7406(new Class1996(new Class44("Renderer", this))));
        final Class1612 class1613 = new Class1612(this);
        final Class1996 field13547 = this.Field13546;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13547, "leverRendererGroup");
        this.Field13550 = ((Class1612)class1613.Method772(field13547)).Method3788().Method3789();
        this.Field13551 = this.Method23(this.Field13544.Method7405(new Class44("Hyperion Exploit", this, false)));
        this.Field13552 = this.Method23(this.Field13544.Method7405(new Class44("HE AOTE Slot", this, Double.longBitsToDouble(4613937818241073152L), 1.0, Double.longBitsToDouble((long)1207369722 ^ 0x4022000047F6FFFAL), true)));
        this.Field13553 = this.Method23(this.Field13544.Method7405(new Class44("HE AOTD Slot", this, 1.0, 1.0, Double.longBitsToDouble(4621256167635550208L), true)));
        this.Field13554 = this.Method23(this.Field13544.Method7405(new Class44("HE Delay", this, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943)));
        this.Field13555 = this.Method23(this.Field13544.Method7405(new Class44("HE Logic", this, Class1881.Field16674)));
        final Class1996 field13548 = this.Field13544;
        final Class44 method313 = new Class44("HE Manual Delay", this, Double.longBitsToDouble(4632233691727265792L), 0.0, Double.longBitsToDouble((long)1391842848 ^ 0x408F400052F5D620L), Class467.Field9943).Method313((Supplier)new Class1049(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method313, "Setting(\"HE Manual Delay\u2026rionExploitLogic.Manual }");
        this.Field13556 = this.Method23(field13548.Method7405(method313));
        this.Field13557 = new ArrayList();
        this.Field13558 = new Class650();
        this.Field13559 = new Class650();
        this.Field13562 = new Class618(new Class1907(this), new Predicate[0]);
    }
    
    public static final Minecraft Method4926() {
        return Class42.Field8052;
    }
    
    public static final void Method4927(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method4928(final Class1224 class1224) {
        return class1224.Field13555;
    }
    
    public static final Class44 Method4929(final Class1224 class1224) {
        return class1224.Field13545;
    }
    
    public static final ArrayList Method4930(final Class1224 class1224) {
        return class1224.Field13557;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7ED4 ^ 0x7A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
