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

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.l6zfjie4iysIZDCbAqAFk8ptjnKrIO20;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
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
public final class HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13543 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("EPS", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13544 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hyperion Exploit", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13545 = this.Method23(this.Field13543.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Lever", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)558280223 ^ (long)558280223))));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13546 = this.Method24(this.Field13543.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Renderer", this))));
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field13547;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13548;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13549;
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field13550;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13551;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13552;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13553;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13554;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13555;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13556;
    private final ArrayList Field13557;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field13558;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field13559;
    private final int Field13560 = 0;
    private boolean Field13561;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field13562;
    private int Field13563;

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field13562);
        this.Field13558.Method2801();
        this.Field13559.Method2801();
        this.Field13557.clear();
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field13562);
    }

    @Override
    public void Method45() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field13551;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"hyperionExploit");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field13554;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"heDelay");
            if (this.Field13558.Method2797(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method369())) {
                this.Field13558.Method2801();
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field13556;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"heManualDelay");
        if (!this.Field13559.Method2797(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method369())) return;
        this.Field13559.Method2801();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field13551;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"hyperionExploit");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) return;
        if (HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().player == null) return;
        if (HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().world == null) return;
        if (!this.Field13561) return;
        InventoryPlayer inventoryPlayer = HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().player.inventory;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field13553;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"heAOTDSlot");
        inventoryPlayer.currentItem = this.Method4925(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method335());
        HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().playerController.processRightClick((EntityPlayer)HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().player, (World)HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().world, EnumHand.MAIN_HAND);
        InventoryPlayer inventoryPlayer2 = HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().player.inventory;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field13552;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"heAOTESlot");
        inventoryPlayer2.currentItem = this.Method4925(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method335());
        this.Field13561 = (int)-2004620692L ^ 0x8883EA6C;
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
            IBlockState iBlockState = HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().world.getBlockState(blockPos);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
            Block block = iBlockState.getBlock();
            if (!Intrinsics.areEqual((Object)block, (Object)Blocks.LEVER)) continue;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field13545;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"lever");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) continue;
            BlockPos blockPos2 = blockPos;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
            this.Field13547.Method3805(blockPos2);
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4923(@NotNull @NotNull InputEvent.MouseInputEvent mouseInputEvent) {
        Intrinsics.checkParameterIsNotNull((Object)mouseInputEvent, (String)"event");
        if (HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().player == null) return;
        if (HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().world == null) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field13551;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"hyperionExploit");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        if (!Mouse.isCreated()) return;
        if (!Mouse.getEventButtonState()) return;
        int n = Mouse.getEventButton();
        if (n != (int)((long)-1495751007 ^ (long)-1495751008)) return;
        this.Method4924();
    }

    private final void Method4924() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field13555;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"heLogic");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.misc.SkyBlockFeatures.HyperionExploitLogic");
        }
        switch (l6zfjie4iysIZDCbAqAFk8ptjnKrIO20.Field17551[((HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)enum_).ordinal()]) {
            case 1: {
                InventoryPlayer inventoryPlayer = HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().player.inventory;
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field13553;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"heAOTDSlot");
                inventoryPlayer.currentItem = this.Method4925(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335());
                HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().playerController.processRightClick((EntityPlayer)HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().player, (World)HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().world, EnumHand.MAIN_HAND);
                InventoryPlayer inventoryPlayer2 = HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().player.inventory;
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field13552;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"heAOTESlot");
                inventoryPlayer2.currentItem = this.Method4925(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method335());
                return;
            }
            case 2: {
                if (this.Field13561) return;
                this.Field13561 = (int)((long)-2078785006 ^ (long)-2078785005);
                return;
            }
        }
    }

    private final int Method4925(int n) {
        return n - ((int)-72778248L ^ 0xFBA97DF9);
    }

    public HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6() {
        super("SkyBlockFeatures", "Legit features for Hypixel SkyBlock...", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK = new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this);
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = this.Field13546;
        Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, (String)"leverRendererGroup");
        this.Field13547 = ((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2)).Method3788().Method3789();
        this.Field13548 = this.Method23(this.Field13543.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Cracked Stone Bricks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1118169130L ^ 0xBD5A17D6) != 0)));
        this.Field13549 = this.Method24(this.Field13543.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Renderer", this))));
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK2 = new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this);
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3 = this.Field13546;
        Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3, (String)"leverRendererGroup");
        this.Field13550 = ((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK2.Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3)).Method3788().Method3789();
        this.Field13551 = this.Method23(this.Field13544.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hyperion Exploit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-2080358865L ^ 0x84003E2F) != 0)));
        this.Field13552 = this.Method23(this.Field13544.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HE AOTE Slot", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x2D5AAE3B4C707623L ^ 0x6D52AE3B4C707623L), 1.0, Double.longBitsToDouble((long)1207369722 ^ 0x4022000047F6FFFAL), ((int)-1478796948L ^ 0xA7DB596D) != 0)));
        this.Field13553 = this.Method23(this.Field13544.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HE AOTD Slot", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble(0xB1F91986357F48B6L ^ 0xF1DB1986357F48B6L), (boolean)((long)1244397422 ^ (long)1244397423))));
        this.Field13554 = this.Method23(this.Field13544.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HE Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x4012478F20153DBDL ^ 0x4B478F20153DBDL), 0.0, Double.longBitsToDouble(0x9B08C752414F42DFL ^ 0xDB878752414F42DFL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943)));
        this.Field13555 = this.Method23(this.Field13544.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HE Logic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16674)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HE Manual Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xA7A76F22B6AB0AC5L ^ 0xE7EE6F22B6AB0AC5L), 0.0, Double.longBitsToDouble((long)1391842848 ^ 0x408F400052F5D620L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method313(new HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"HE Manual Delay\u2026rionExploitLogic.Manual }");
        this.Field13556 = this.Method23(this.Field13544.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        this.Field13557 = new ArrayList();
        this.Field13558 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field13559 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field13562 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(this), new Predicate[(int)1112258374L ^ 0x424BB746]);
    }

    public static final Minecraft Method4926() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4927(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4928(HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6 hsjWk9hXiCkuTOLzk6rPbVmU1luUitS6) {
        return hsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Field13555;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4929(HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6 hsjWk9hXiCkuTOLzk6rPbVmU1luUitS6) {
        return hsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Field13545;
    }

    public static final ArrayList Method4930(HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6 hsjWk9hXiCkuTOLzk6rPbVmU1luUitS6) {
        return hsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Field13557;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2003836172L ^ 0x77701D0C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-946541028L ^ 0xC794EEE3);
            int n2 = ((int)-415524545L ^ 0xE73B9902) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1312372823 ^ (long)-1312368612) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

