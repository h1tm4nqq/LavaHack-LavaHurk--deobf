//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006'"}, d2={"Lcom/kisman/cc/features/hud/modules/InventoryHud;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "armor", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "colors", "Lcom/kisman/cc/settings/types/SettingGroup;", "elements", "fill", "fillColor", "hotbar", "insideOutline", "insideOutlineColor", "insideOutlineWidth", "inventory", "offhand", "offset1", "offset2", "offsets", "outlineColors", "outlineGroup", "outlineWidth", "outsideOutline", "outsideOutlineColor", "outsideOutlineWidth", "scale", "slots", "xcarry", "drawSlot", "", "stack", "Lnet/minecraft/item/ItemStack;", "x", "", "y", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class GAJ3lf3AUChqibjjPEGD18dFdQzxIHft
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8923 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0x57B82132655E952L ^ 0x3A9B82132655E952L), Double.longBitsToDouble((long)647980881 ^ 0x40000000269F6751L), ((int)1410374061L ^ 0x541099AD) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8924 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offsets", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8925;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8926;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8927;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8928;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8929;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8930;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8931;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8932;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8933;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8934;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8935;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8936;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8937;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8938;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8939;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8940;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8941;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8942;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8943;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8944;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8945;
    private String Field8946 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * Unable to fully structure code
     */
    @SubscribeEvent
    @SubscribeEvent
    public final void Method1248(@NotNull @NotNull RenderGameOverlayEvent.Text var1_1) {
        block18: {
            block19: {
                Intrinsics.checkParameterIsNotNull((Object)var1_1, (String)"event");
                var2_2 = (int)this.Method267();
                var4_4 = var3_3 = (int)this.Method268();
                var5_5 = 0.0;
                v0 = this.Field8944;
                Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"armor");
                if (v0.Method365()) {
                    v1 = this.Field8925;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"offset1");
                    v2 = v1.Method335();
                } else {
                    v2 = (int)-180807043L ^ -180807043;
                }
                var7_6 = var2_2 + v2;
                v3 = this.Field8941;
                Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"inventory");
                if (v3.Method365()) {
                    var9_8 = GAJ3lf3AUChqibjjPEGD18dFdQzxIHft.Method1250().player.inventory.mainInventory.size();
                    for (var8_7 = (int)-743285933L ^ -743285926; var8_7 < var9_8; ++var8_7) {
                        v4 = var7_6 + ((int)764227331L ^ 764227330);
                        v5 = var8_7 % (int)((long)2050164920 ^ (long)2050164913);
                        v6 = this.Field8926;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"offset2");
                        var10_9 = v4 + v5 * v6.Method335();
                        v7 = var3_3 + ((int)-2119139765L ^ -2119139766);
                        v8 = var8_7 / (int)((long)1238422811 ^ (long)1238422802) - (int)((long)582344283 ^ (long)582344282);
                        v9 = this.Field8926;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"offset2");
                        var11_10 = v7 + v8 * v9.Method335();
                        if (var4_4 < var11_10) {
                            var4_4 = var11_10;
                        }
                        v10 = GAJ3lf3AUChqibjjPEGD18dFdQzxIHft.Method1250().player.inventory.mainInventory.get(var8_7);
                        Intrinsics.checkExpressionValueIsNotNull((Object)v10, (String)"mc.player.inventory.mainInventory[item]");
                        this.Method1249((ItemStack)v10, var10_9, var11_10);
                    }
                    v11 = this.Field8925;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v11, (String)"offset1");
                    var5_5 += (double)v11.Method335() * Double.longBitsToDouble((long)119726260 ^ 4613937818360799412L);
                }
                v12 = this.Field8942;
                Intrinsics.checkExpressionValueIsNotNull((Object)v12, (String)"hotbar");
                if (v12.Method365()) {
                    v13 = this.Field8941;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v13, (String)"inventory");
                    if (v13.Method365()) {
                        v14 = this.Field8925;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v14, (String)"offset1");
                        v15 = v14.Method335() * (int)((long)-1503690018 ^ (long)-1503690019);
                    } else {
                        v15 = (int)((long)-114514538 ^ (long)-114514538);
                    }
                    var8_7 = var3_3 + v15 + ((int)-331123445L ^ -331123446);
                    var9_8 = (int)1348216341L ^ 1348216341;
                    var10_9 = (int)1193094293L ^ 1193094300;
                    while (true) {
                        v16 = var7_6 + (int)((long)1892032717 ^ (long)1892032716);
                        v17 = this.Field8926;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v17, (String)"offset2");
                        var11_10 = v16 + var9_8 * v17.Method335();
                        v18 = GAJ3lf3AUChqibjjPEGD18dFdQzxIHft.Method1250().player.inventory.mainInventory.get(var9_8);
                        Intrinsics.checkExpressionValueIsNotNull((Object)v18, (String)"mc.player.inventory.mainInventory[item]");
                        this.Method1249((ItemStack)v18, var11_10, var8_7);
                        ++var9_8;
                    }
                }
                v19 = this.Field8944;
                Intrinsics.checkExpressionValueIsNotNull((Object)v19, (String)"armor");
                if (v19.Method365()) {
                    var8_7 = var2_2 + (int)((long)-1091560453 ^ (long)-1091560454);
                    var10_9 = GAJ3lf3AUChqibjjPEGD18dFdQzxIHft.Method1250().player.inventory.armorInventory.size();
                    for (var9_8 = (int)((long)-1462522020 ^ (long)-1462522020); var9_8 < var10_9; ++var9_8) {
                        v20 = var3_3 + (int)((long)1310820990 ^ (long)1310820991);
                        v21 = this.Field8926;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v21, (String)"offset2");
                        var11_10 = v20 + var9_8 * v21.Method335();
                        v22 = GAJ3lf3AUChqibjjPEGD18dFdQzxIHft.Method1250().player.inventory.armorInventory.get(var9_8);
                        Intrinsics.checkExpressionValueIsNotNull((Object)v22, (String)"mc.player.inventory.armorInventory[item]");
                        this.Method1249((ItemStack)v22, var8_7, var11_10);
                    }
                    v23 = this.Field8925;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v23, (String)"offset1");
                    var5_5 = (double)v23.Method335() * Double.longBitsToDouble(4785748418838304677L ^ 178566000038287269L);
                }
                v24 = this.Field8943;
                Intrinsics.checkExpressionValueIsNotNull((Object)v24, (String)"xcarry");
                if (v24.Method365()) break block18;
                v25 = this.Field8945;
                Intrinsics.checkExpressionValueIsNotNull((Object)v25, (String)"offhand");
                if (!v25.Method365()) break block19;
                v26 = this.Field8941;
                Intrinsics.checkExpressionValueIsNotNull((Object)v26, (String)"inventory");
                if (v26.Method365()) ** GOTO lbl-1000
                v27 = this.Field8942;
                Intrinsics.checkExpressionValueIsNotNull((Object)v27, (String)"hotbar");
                if (v27.Method365()) lbl-1000:
                // 2 sources

                {
                    v28 = this.Field8925;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v28, (String)"offset1");
                    v29 = v28.Method335() * ((int)1417886338L ^ 1417886347);
                } else {
                    v29 = (int)((long)1612733425 ^ (long)1612733425);
                }
                var8_7 = var7_6 + v29;
                v30 = this.Field8943;
                Intrinsics.checkExpressionValueIsNotNull((Object)v30, (String)"xcarry");
                if (v30.Method365()) {
                    v31 = this.Field8925;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v31, (String)"offset1");
                    v32 = v31.Method335() * ((int)((long)546793760 ^ (long)546793761) << 1);
                } else {
                    v32 = (int)899434241L ^ 899434241;
                }
                var9_8 = var3_3 + v32 + (int)((long)1167718537 ^ (long)1167718536);
                v33 = GAJ3lf3AUChqibjjPEGD18dFdQzxIHft.Method1250().player.inventory.offHandInventory.get((int)((long)908882223 ^ (long)908882223));
                Intrinsics.checkExpressionValueIsNotNull((Object)v33, (String)"mc.player.inventory.offHandInventory[0]");
                this.Method1249((ItemStack)v33, var8_7, var9_8);
            }
            this.Method274(var5_5);
            this.Method273(Double.longBitsToDouble((long)547380294 ^ 4636737291902016582L));
            return;
        }
        var8_7 = (int)-1197277141L ^ -1197277142;
        var9_8 = (int)((long)878984982 ^ (long)878984979);
        while (true) {
            v34 = this.Field8941;
            Intrinsics.checkExpressionValueIsNotNull((Object)v34, (String)"inventory");
            if (v34.Method365()) ** GOTO lbl-1000
            v35 = this.Field8942;
            Intrinsics.checkExpressionValueIsNotNull((Object)v35, (String)"hotbar");
            if (v35.Method365()) lbl-1000:
            // 2 sources

            {
                v36 = this.Field8925;
                Intrinsics.checkExpressionValueIsNotNull((Object)v36, (String)"offset1");
                v37 = v36.Method335() * ((int)1429346867L ^ 1429346874);
            } else {
                v37 = (int)-1087530874L ^ -1087530874;
            }
            (int)((long)807517500 ^ (long)807517501) << 1;
            ((int)1393975515L ^ 1393975514) << 2;
            var10_9 = var7_6 + v37 + (int)((long)2019012346 ^ (long)2019012346);
            ((int)2146955510L ^ 0x7FF7F0F7) << 1;
            var11_10 = var3_3 + (int)((long)-880355118 ^ (long)-880355117) + (int)((long)-793021129 ^ (long)-793021129);
            v38 = GAJ3lf3AUChqibjjPEGD18dFdQzxIHft.Method1250().player.inventoryContainer;
            Intrinsics.checkExpressionValueIsNotNull((Object)v38, (String)"mc.player.inventoryContainer");
            v39 = v38.getInventory().get(var8_7);
            Intrinsics.checkExpressionValueIsNotNull((Object)v39, (String)"mc.player.inventoryContainer.inventory[item]");
            this.Method1249((ItemStack)v39, var10_9, var11_10);
            ++var8_7;
        }
    }

    private final void Method1249(ItemStack itemStack, int n, int n2) {
        GlStateManager.pushMatrix();
        GlStateManager.enableDepth();
        RenderHelper.enableGUIStandardItemLighting();
        GAJ3lf3AUChqibjjPEGD18dFdQzxIHft.Method1250().getRenderItem().renderItemAndEffectIntoGUI(itemStack, n, n2);
        GAJ3lf3AUChqibjjPEGD18dFdQzxIHft.Method1250().getRenderItem().renderItemOverlays(GAJ3lf3AUChqibjjPEGD18dFdQzxIHft.Method1250().fontRenderer, itemStack, n, n2);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableDepth();
        GlStateManager.popMatrix();
    }

    public GAJ3lf3AUChqibjjPEGD18dFdQzxIHft() {
        super("InventoryHud", "Shows your inventory", ((int)253027690L ^ 0xF14E56B) != 0);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offset 1", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xFC2692FC607D2D69L ^ 0xBC1292FC607D2D69L), Double.longBitsToDouble(0x7F70EB1D12A8F885L ^ 0x3F40EB1D12A8F885L), Double.longBitsToDouble(0x2EDC6E3C875919EEL ^ 0x6EE56E3C875919EEL), (boolean)((long)1629317421 ^ (long)1629317420)).Method355("1");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Offset 1\", this\u202625.0, true).setTitle(\"1\")");
        this.Field8925 = this.Method23(this.Field8924.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offset 2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x8D15064CEC94832CL ^ 0xCD27064CEC94832CL), Double.longBitsToDouble(0xC07B0208D11B32C3L ^ 0x804B0208D11B32C3L), Double.longBitsToDouble(0x3D101CD1C7AD2B90L ^ 0x7D241CD1C7AD2B90L), ((int)1701102606L ^ 0x6564C40F) != 0).Method355("2");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Offset 2\", this\u202620.0, true).setTitle(\"2\")");
        this.Field8926 = this.Method23(this.Field8924.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        this.Field8927 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline Width", this)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inside Outline Width", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)220199676 ^ 0x3FB9999994866366L), Double.longBitsToDouble((long)1296999192 ^ 0x401400004D4EA318L), ((int)1998568655L ^ 0x771FBCCF) != 0).Method355("Inside");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Inside Outline \u2026false).setTitle(\"Inside\")");
        this.Field8928 = this.Method23(this.Method23(this.Field8927.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside Outline Width", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0xA8E61E2914021E84L ^ 0x975F87B08D9B871EL), Double.longBitsToDouble(0xA604D10CF3418393L ^ 0xE610D10CF3418393L), ((int)-1214915629L ^ 0xB795DBD3) != 0).Method355("Outside");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"Setting(\"Outside Outline\u2026alse).setTitle(\"Outside\")");
        this.Field8929 = this.Method23(this.Method23(this.Field8927.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5)));
        this.Field8930 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Elements", this)));
        this.Field8931 = this.Method24(this.Field8930.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline", this))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inside Outline", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-2051205007L ^ 0x85BD1870) != 0).Method355("Inside");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"Setting(\"Inside Outline\"\u2026 true).setTitle(\"Inside\")");
        this.Field8932 = this.Method23(this.Field8931.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside Outline", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1463858847 ^ (long)-1463858847)).Method355("Outside");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"Setting(\"Outside Outline\u2026alse).setTitle(\"Outside\")");
        this.Field8933 = this.Method23(this.Field8931.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7));
        this.Field8934 = this.Method23(this.Field8930.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fill", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)357602096L ^ 0x15509330) != 0)));
        this.Field8935 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Colors", this)));
        this.Field8936 = this.Method24(this.Field8935.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Elements", this))));
        this.Field8937 = this.Method23(this.Field8936.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inside Outline", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Inside", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)2073017638L ^ 0x7B8FBDD9, (int)((long)1640736649 ^ (long)1640736630), (int)((long)1218592444 ^ (long)1218592323), (int)((long)-425956237 ^ (long)-425956228) << 3))));
        this.Field8938 = this.Method23(this.Field8936.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside Outline", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Outside", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-887961660 ^ (long)-887961797), (int)((long)-536219433 ^ (long)-536219608), (int)((long)1199818330 ^ (long)1199818405), ((int)-1621346771L ^ 0x9F5C3622) << 3))));
        this.Field8939 = this.Method23(this.Field8935.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fill Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Fill", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)2023636543 ^ (long)2023636672), (int)-1893557685L ^ 0x8F229AB4, (int)879164489L ^ 0x3466FCB6, (int)((long)840107114 ^ (long)840107109) << 3))));
        this.Field8940 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slots", this)));
        this.Field8941 = this.Method23(this.Field8940.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inventory", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-737463472 ^ (long)-737463471))));
        this.Field8942 = this.Method23(this.Field8940.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hotbar", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)387592364L ^ 0x171A30AC) != 0)));
        this.Field8943 = this.Method23(this.Field8940.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("XCarry", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-538237922 ^ (long)-538237922))));
        this.Field8944 = this.Method23(this.Field8940.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Armor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-77523217 ^ (long)-77523217))));
        this.Field8945 = this.Method23(this.Field8940.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offhand", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1587265369L ^ 0x5E9BBF59) != 0)));
    }

    public static final Minecraft Method1250() {
        return qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2.Field13656;
    }

    public static final void Method1251(Minecraft minecraft) {
        qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2.Field13656 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1278024642L ^ 0x4C2D1BC2;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1765592636L ^ 0x693CCEC3);
            int n2 = ((int)-400994394L ^ 0xE8194F91) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)2066601246L ^ 0x7B2DD54D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

