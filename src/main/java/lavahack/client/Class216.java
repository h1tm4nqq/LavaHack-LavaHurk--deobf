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

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1249;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006'"}, d2={"Lcom/kisman/cc/features/hud/modules/InventoryHud;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "armor", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "colors", "Lcom/kisman/cc/settings/types/SettingGroup;", "elements", "fill", "fillColor", "hotbar", "insideOutline", "insideOutlineColor", "insideOutlineWidth", "inventory", "offhand", "offset1", "offset2", "offsets", "outlineColors", "outlineGroup", "outlineWidth", "outsideOutline", "outsideOutlineColor", "outsideOutlineWidth", "scale", "slots", "xcarry", "drawSlot", "", "stack", "Lnet/minecraft/item/ItemStack;", "x", "", "y", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class Class216
extends Class1249 {
    private final Class44 Field8923 = this.Method23(new Class44("Scale", (Class42)this, 1.0, Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)647980881 ^ 0x40000000269F6751L), false));
    private final Class1996 Field8924 = this.Method24(new Class1996(new Class44("Offsets", this)));
    private final Class44 Field8925;
    private final Class44 Field8926;
    private final Class1996 Field8927;
    private final Class44 Field8928;
    private final Class44 Field8929;
    private final Class1996 Field8930;
    private final Class1996 Field8931;
    private final Class44 Field8932;
    private final Class44 Field8933;
    private final Class44 Field8934;
    private final Class1996 Field8935;
    private final Class1996 Field8936;
    private final Class44 Field8937;
    private final Class44 Field8938;
    private final Class44 Field8939;
    private final Class1996 Field8940;
    private final Class44 Field8941;
    private final Class44 Field8942;
    private final Class44 Field8943;
    private final Class44 Field8944;
    private final Class44 Field8945;
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
                    v2 = 0;
                }
                var7_6 = var2_2 + v2;
                v3 = this.Field8941;
                Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"inventory");
                if (v3.Method365()) {
                    var9_8 = Class216.Method1250().player.inventory.mainInventory.size();
                    for (var8_7 = 9; var8_7 < var9_8; ++var8_7) {
                        v4 = this.Field8926;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v4, (String)"offset2");
                        var10_9 = var7_6 + 1 + var8_7 % 9 * v4.Method335();
                        v5 = var8_7 / 9 - 1;
                        v6 = this.Field8926;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"offset2");
                        var11_10 = var3_3 + 1 + v5 * v6.Method335();
                        if (var4_4 < var11_10) {
                            var4_4 = var11_10;
                        }
                        v7 = Class216.Method1250().player.inventory.mainInventory.get(var8_7);
                        Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"mc.player.inventory.mainInventory[item]");
                        this.Method1249((ItemStack)v7, var10_9, var11_10);
                    }
                    v8 = this.Field8925;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v8, (String)"offset1");
                    var5_5 += (double)v8.Method335() * Double.longBitsToDouble((long)119726260 ^ 4613937818360799412L);
                }
                v9 = this.Field8942;
                Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"hotbar");
                if (v9.Method365()) {
                    v10 = this.Field8941;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v10, (String)"inventory");
                    if (v10.Method365()) {
                        v11 = this.Field8925;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v11, (String)"offset1");
                        v12 = v11.Method335() * 3;
                    } else {
                        v12 = 0;
                    }
                    var8_7 = var3_3 + v12 + 1;
                    var9_8 = 0;
                    var10_9 = 9;
                    while (true) {
                        v13 = this.Field8926;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v13, (String)"offset2");
                        var11_10 = var7_6 + 1 + var9_8 * v13.Method335();
                        v14 = Class216.Method1250().player.inventory.mainInventory.get(var9_8);
                        Intrinsics.checkExpressionValueIsNotNull((Object)v14, (String)"mc.player.inventory.mainInventory[item]");
                        this.Method1249((ItemStack)v14, var11_10, var8_7);
                        ++var9_8;
                    }
                }
                v15 = this.Field8944;
                Intrinsics.checkExpressionValueIsNotNull((Object)v15, (String)"armor");
                if (v15.Method365()) {
                    var8_7 = var2_2 + 1;
                    var10_9 = Class216.Method1250().player.inventory.armorInventory.size();
                    for (var9_8 = 0; var9_8 < var10_9; ++var9_8) {
                        v16 = this.Field8926;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v16, (String)"offset2");
                        var11_10 = var3_3 + 1 + var9_8 * v16.Method335();
                        v17 = Class216.Method1250().player.inventory.armorInventory.get(var9_8);
                        Intrinsics.checkExpressionValueIsNotNull((Object)v17, (String)"mc.player.inventory.armorInventory[item]");
                        this.Method1249((ItemStack)v17, var8_7, var11_10);
                    }
                    v18 = this.Field8925;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v18, (String)"offset1");
                    var5_5 = (double)v18.Method335() * Double.longBitsToDouble(0x4010000000000000L);
                }
                v19 = this.Field8943;
                Intrinsics.checkExpressionValueIsNotNull((Object)v19, (String)"xcarry");
                if (v19.Method365()) break block18;
                v20 = this.Field8945;
                Intrinsics.checkExpressionValueIsNotNull((Object)v20, (String)"offhand");
                if (!v20.Method365()) break block19;
                v21 = this.Field8941;
                Intrinsics.checkExpressionValueIsNotNull((Object)v21, (String)"inventory");
                if (v21.Method365()) ** GOTO lbl-1000
                v22 = this.Field8942;
                Intrinsics.checkExpressionValueIsNotNull((Object)v22, (String)"hotbar");
                if (v22.Method365()) lbl-1000:
                // 2 sources

                {
                    v23 = this.Field8925;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v23, (String)"offset1");
                    v24 = v23.Method335() * 9;
                } else {
                    v24 = 0;
                }
                var8_7 = var7_6 + v24;
                v25 = this.Field8943;
                Intrinsics.checkExpressionValueIsNotNull((Object)v25, (String)"xcarry");
                if (v25.Method365()) {
                    v26 = this.Field8925;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v26, (String)"offset1");
                    v27 = v26.Method335() * 2;
                } else {
                    v27 = 0;
                }
                var9_8 = var3_3 + v27 + 1;
                v28 = Class216.Method1250().player.inventory.offHandInventory.get(0);
                Intrinsics.checkExpressionValueIsNotNull((Object)v28, (String)"mc.player.inventory.offHandInventory[0]");
                this.Method1249((ItemStack)v28, var8_7, var9_8);
            }
            this.Method274(var5_5);
            this.Method273(Double.longBitsToDouble((long)547380294 ^ 4636737291902016582L));
            return;
        }
        var8_7 = 1;
        var9_8 = 5;
        while (true) {
            v29 = this.Field8941;
            Intrinsics.checkExpressionValueIsNotNull((Object)v29, (String)"inventory");
            if (v29.Method365()) ** GOTO lbl-1000
            v30 = this.Field8942;
            Intrinsics.checkExpressionValueIsNotNull((Object)v30, (String)"hotbar");
            if (v30.Method365()) lbl-1000:
            // 2 sources

            {
                v31 = this.Field8925;
                Intrinsics.checkExpressionValueIsNotNull((Object)v31, (String)"offset1");
                v32 = v31.Method335() * 9;
            } else {
                v32 = 0;
            }
            var10_9 = var7_6 + v32 + 0;
            var11_10 = var3_3 + 1 + 0;
            v33 = Class216.Method1250().player.inventoryContainer;
            Intrinsics.checkExpressionValueIsNotNull((Object)v33, (String)"mc.player.inventoryContainer");
            v34 = v33.getInventory().get(var8_7);
            Intrinsics.checkExpressionValueIsNotNull((Object)v34, (String)"mc.player.inventoryContainer.inventory[item]");
            this.Method1249((ItemStack)v34, var10_9, var11_10);
            ++var8_7;
        }
    }

    private final void Method1249(ItemStack itemStack, int n, int n2) {
        GlStateManager.pushMatrix();
        GlStateManager.enableDepth();
        RenderHelper.enableGUIStandardItemLighting();
        Class216.Method1250().getRenderItem().renderItemAndEffectIntoGUI(itemStack, n, n2);
        Class216.Method1250().getRenderItem().renderItemOverlays(Class216.Method1250().fontRenderer, itemStack, n, n2);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableDepth();
        GlStateManager.popMatrix();
    }

    public Class216() {
        super("InventoryHud", "Shows your inventory", true);
        Class44 class44 = new Class44("Offset 1", (Class42)this, Double.longBitsToDouble(0x4034000000000000L), Double.longBitsToDouble(0x4030000000000000L), Double.longBitsToDouble(4627730092099895296L), true).Method355("1");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Offset 1\", this\u202625.0, true).setTitle(\"1\")");
        this.Field8925 = this.Method23(this.Field8924.Method7405(class44));
        Class44 class442 = new Class44("Offset 2", (Class42)this, Double.longBitsToDouble(4625759767262920704L), Double.longBitsToDouble(0x4030000000000000L), Double.longBitsToDouble(0x4034000000000000L), true).Method355("2");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Offset 2\", this\u202620.0, true).setTitle(\"2\")");
        this.Field8926 = this.Method23(this.Field8924.Method7405(class442));
        this.Field8927 = this.Method24(new Class1996(new Class44("Outline Width", this)));
        Class44 class443 = new Class44("Inside Outline Width", (Class42)this, 1.0, Double.longBitsToDouble((long)220199676 ^ 0x3FB9999994866366L), Double.longBitsToDouble((long)1296999192 ^ 0x401400004D4EA318L), false).Method355("Inside");
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Inside Outline \u2026false).setTitle(\"Inside\")");
        this.Field8928 = this.Method23(this.Method23(this.Field8927.Method7405(class443)));
        Class44 class444 = new Class44("Outside Outline Width", (Class42)this, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(0x4014000000000000L), false).Method355("Outside");
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"Setting(\"Outside Outline\u2026alse).setTitle(\"Outside\")");
        this.Field8929 = this.Method23(this.Method23(this.Field8927.Method7405(class444)));
        this.Field8930 = this.Method24(new Class1996(new Class44("Elements", this)));
        this.Field8931 = this.Method24(this.Field8930.Method7406(new Class1996(new Class44("Outline", this))));
        Class44 class445 = new Class44("Inside Outline", (Class42)this, true).Method355("Inside");
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"Setting(\"Inside Outline\"\u2026 true).setTitle(\"Inside\")");
        this.Field8932 = this.Method23(this.Field8931.Method7405(class445));
        Class44 class446 = new Class44("Outside Outline", (Class42)this, false).Method355("Outside");
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"Setting(\"Outside Outline\u2026alse).setTitle(\"Outside\")");
        this.Field8933 = this.Method23(this.Field8931.Method7405(class446));
        this.Field8934 = this.Method23(this.Field8930.Method7405(new Class44("Fill", (Class42)this, false)));
        this.Field8935 = this.Method24(new Class1996(new Class44("Colors", this)));
        this.Field8936 = this.Method24(this.Field8935.Method7406(new Class1996(new Class44("Elements", this))));
        this.Field8937 = this.Method23(this.Field8936.Method7405(new Class44("Inside Outline", (Class42)this, "Inside", new Class2027(255, 255, 255, 120))));
        this.Field8938 = this.Method23(this.Field8936.Method7405(new Class44("Outside Outline", (Class42)this, "Outside", new Class2027(255, 255, 255, 120))));
        this.Field8939 = this.Method23(this.Field8935.Method7405(new Class44("Fill Color", (Class42)this, "Fill", new Class2027(255, 255, 255, 120))));
        this.Field8940 = this.Method24(new Class1996(new Class44("Slots", this)));
        this.Field8941 = this.Method23(this.Field8940.Method7405(new Class44("Inventory", (Class42)this, true)));
        this.Field8942 = this.Method23(this.Field8940.Method7405(new Class44("Hotbar", (Class42)this, false)));
        this.Field8943 = this.Method23(this.Field8940.Method7405(new Class44("XCarry", (Class42)this, false)));
        this.Field8944 = this.Method23(this.Field8940.Method7405(new Class44("Armor", (Class42)this, false)));
        this.Field8945 = this.Method23(this.Field8940.Method7405(new Class44("Offhand", (Class42)this, false)));
    }

    public static final Minecraft Method1250() {
        return Class1249.Field13656;
    }

    public static final void Method1251(Minecraft minecraft) {
        Class1249.Field13656 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 220;
            cArray2[n] = (char)(cArray[n] ^ (0x53 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

