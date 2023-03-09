//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$MouseInputEvent
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1049;
import lavahack.client.Class1612;
import lavahack.client.Class1796;
import lavahack.client.Class1881;
import lavahack.client.Class1907;
import lavahack.client.Class1996;
import lavahack.client.Class2095;
import lavahack.client.Class254;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Mouse;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020#H\u0016J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010+\u001a\u00020#2\u0006\u0010)\u001a\u00020,H\u0007J\b\u0010-\u001a\u00020#H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2={"Lcom/kisman/cc/features/module/misc/SkyBlockFeatures;", "Lcom/kisman/cc/features/module/Module;", "()V", "crackedStoneBricks", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "crackedStoneBricksRenderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "crackedStoneBricksRendererGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "esp", "flag1", "", "heAOTDSlot", "heAOTESlot", "heDelay", "heLogic", "heManualDelay", "hyperionExploit", "hyperionExploitG", "hyperionExploitManualState", "", "hyperionExploitManualTimer", "Lcom/kisman/cc/util/TimerUtils;", "hyperionExploitTimer", "lever", "leverRenderer", "leverRendererGroup", "renderBlock", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventRenderBlock;", "toRender", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/BlockPos;", "doHyperionExploit", "", "fixSlot", "slot", "onDisable", "onEnable", "onMouseInput", "event", "Lnet/minecraftforge/fml/common/gameevent/InputEvent$MouseInputEvent;", "onRenderWorld", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "update", "HyperionExploitLogic", "kisman.cc"})
public final class Class1224
extends Class42 {
    private final Class1996 Field13543 = this.Method24(new Class1996(new Class44("EPS", this)));
    private final Class1996 Field13544 = this.Method24(new Class1996(new Class44("Hyperion Exploit", this)));
    private final Class44 Field13545 = this.Method23(this.Field13543.Method7405(new Class44("Lever", (Class42)this, false)));
    private final Class1996 Field13546 = this.Method24(this.Field13543.Method7406(new Class1996(new Class44("Renderer", this))));
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
        Class44 class44 = this.Field13551;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"hyperionExploit");
        if (!class44.Method365()) {
            Class44 class442 = this.Field13554;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"heDelay");
            if (this.Field13558.Method2797(class442.Method369())) {
                this.Field13558.Method2801();
            }
        }
        Class44 class443 = this.Field13556;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"heManualDelay");
        if (!this.Field13559.Method2797(class443.Method369())) return;
        this.Field13559.Method2801();
        Class44 class444 = this.Field13551;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"hyperionExploit");
        if (!class444.Method365()) return;
        if (Class1224.Method4926().player == null) return;
        if (Class1224.Method4926().world == null) return;
        if (!this.Field13561) return;
        InventoryPlayer inventoryPlayer = Class1224.Method4926().player.inventory;
        Class44 class445 = this.Field13553;
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"heAOTDSlot");
        inventoryPlayer.currentItem = this.Method4925(class445.Method335());
        Class1224.Method4926().playerController.processRightClick((EntityPlayer)Class1224.Method4926().player, (World)Class1224.Method4926().world, EnumHand.MAIN_HAND);
        InventoryPlayer inventoryPlayer2 = Class1224.Method4926().player.inventory;
        Class44 class446 = this.Field13552;
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"heAOTESlot");
        inventoryPlayer2.currentItem = this.Method4925(class446.Method335());
        this.Field13561 = false;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4922(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        Iterator iterator = new ArrayList(this.Field13557).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field13557.clear();
                return;
            }
            BlockPos blockPos = (BlockPos)iterator.next();
            IBlockState iBlockState = Class1224.Method4926().world.getBlockState(blockPos);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
            Block block = iBlockState.getBlock();
            if (!Intrinsics.areEqual((Object)block, (Object)Blocks.LEVER)) continue;
            Class44 class44 = this.Field13545;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"lever");
            if (!class44.Method365()) continue;
            BlockPos blockPos2 = blockPos;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
            this.Field13547.Method3805(blockPos2);
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4923(@NotNull @NotNull InputEvent.MouseInputEvent mouseInputEvent) {
        Intrinsics.checkParameterIsNotNull((Object)mouseInputEvent, (String)"event");
        if (Class1224.Method4926().player == null) return;
        if (Class1224.Method4926().world == null) return;
        Class44 class44 = this.Field13551;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"hyperionExploit");
        if (!class44.Method365()) return;
        if (!Mouse.isCreated()) return;
        if (!Mouse.getEventButtonState()) return;
        int n = Mouse.getEventButton();
        if (n != 1) return;
        this.Method4924();
    }

    private final void Method4924() {
        Class44 class44 = this.Field13555;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"heLogic");
        Enum enum_ = class44.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.misc.SkyBlockFeatures.HyperionExploitLogic");
        }
        switch (Class2095.Field17551[((Class1881)enum_).ordinal()]) {
            case 1: {
                InventoryPlayer inventoryPlayer = Class1224.Method4926().player.inventory;
                Class44 class442 = this.Field13553;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"heAOTDSlot");
                inventoryPlayer.currentItem = this.Method4925(class442.Method335());
                Class1224.Method4926().playerController.processRightClick((EntityPlayer)Class1224.Method4926().player, (World)Class1224.Method4926().world, EnumHand.MAIN_HAND);
                InventoryPlayer inventoryPlayer2 = Class1224.Method4926().player.inventory;
                Class44 class443 = this.Field13552;
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"heAOTESlot");
                inventoryPlayer2.currentItem = this.Method4925(class443.Method335());
                return;
            }
            case 2: {
                if (this.Field13561) return;
                this.Field13561 = true;
                return;
            }
        }
    }

    private final int Method4925(int n) {
        return n - 1;
    }

    public Class1224() {
        super("SkyBlockFeatures", "Legit features for Hypixel SkyBlock...", Class97.Field8343);
        Class1612 class1612 = new Class1612(this);
        Class1996 class1996 = this.Field13546;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1996, (String)"leverRendererGroup");
        this.Field13547 = ((Class1612)class1612.Method772(class1996)).Method3788().Method3789();
        this.Field13548 = this.Method23(this.Field13543.Method7405(new Class44("Cracked Stone Bricks", (Class42)this, false)));
        this.Field13549 = this.Method24(this.Field13543.Method7406(new Class1996(new Class44("Renderer", this))));
        Class1612 class16122 = new Class1612(this);
        Class1996 class19962 = this.Field13546;
        Intrinsics.checkExpressionValueIsNotNull((Object)class19962, (String)"leverRendererGroup");
        this.Field13550 = ((Class1612)class16122.Method772(class19962)).Method3788().Method3789();
        this.Field13551 = this.Method23(this.Field13544.Method7405(new Class44("Hyperion Exploit", (Class42)this, false)));
        this.Field13552 = this.Method23(this.Field13544.Method7405(new Class44("HE AOTE Slot", (Class42)this, Double.longBitsToDouble(0x4008000000000000L), 1.0, Double.longBitsToDouble((long)1207369722 ^ 0x4022000047F6FFFAL), true)));
        this.Field13553 = this.Method23(this.Field13544.Method7405(new Class44("HE AOTD Slot", (Class42)this, 1.0, 1.0, Double.longBitsToDouble(0x4022000000000000L), true)));
        this.Field13554 = this.Method23(this.Field13544.Method7405(new Class44("HE Delay", (Class42)this, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943)));
        this.Field13555 = this.Method23(this.Field13544.Method7405(new Class44("HE Logic", (Class42)this, Class1881.Field16674)));
        Class44 class44 = new Class44("HE Manual Delay", (Class42)this, Double.longBitsToDouble(0x4049000000000000L), 0.0, Double.longBitsToDouble((long)1391842848 ^ 0x408F400052F5D620L), Class467.Field9943).Method313(new Class1049(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"HE Manual Delay\u2026rionExploitLogic.Manual }");
        this.Field13556 = this.Method23(this.Field13544.Method7405(class44));
        this.Field13557 = new ArrayList();
        this.Field13558 = new Class650();
        this.Field13559 = new Class650();
        this.Field13562 = new Class618((Class254)new Class1907(this), new Predicate[0]);
    }

    public static final Minecraft Method4926() {
        return Class42.Field8052;
    }

    public static final void Method4927(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method4928(Class1224 class1224) {
        return class1224.Field13555;
    }

    public static final Class44 Method4929(Class1224 class1224) {
        return class1224.Field13545;
    }

    public static final ArrayList Method4930(Class1224 class1224) {
        return class1224.Field13557;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 122;
            cArray2[n] = (char)(cArray[n] ^ (0x7ED4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

