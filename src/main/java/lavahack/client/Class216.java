//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.item.*;
import net.minecraft.inventory.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.renderer.*;
import com.kisman.cc.util.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006'" }, d2 = { "Lcom/kisman/cc/features/hud/modules/InventoryHud;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "armor", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "colors", "Lcom/kisman/cc/settings/types/SettingGroup;", "elements", "fill", "fillColor", "hotbar", "insideOutline", "insideOutlineColor", "insideOutlineWidth", "inventory", "offhand", "offset1", "offset2", "offsets", "outlineColors", "outlineGroup", "outlineWidth", "outsideOutline", "outsideOutlineColor", "outsideOutlineWidth", "scale", "slots", "xcarry", "drawSlot", "", "stack", "Lnet/minecraft/item/ItemStack;", "x", "", "y", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc" })
public final class Class216 extends Class1249
{
    private final Class44 Field8923;
    private final Class1996 Field8924;
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
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method1248(@NotNull @NotNull final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        Intrinsics.checkParameterIsNotNull((Object)renderGameOverlayEvent$Text, "event");
        final int n = (int)this.Method267();
        int n3;
        final int n2 = n3 = (int)this.Method268();
        double n4 = 0.0;
        final int n5 = n;
        final Class44 field8944 = this.Field8944;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8944, "armor");
        int method335;
        if (field8944.Method365()) {
            final Class44 field8945 = this.Field8925;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8945, "offset1");
            method335 = field8945.Method335();
        }
        else {
            method335 = 0;
        }
        final int n6 = n5 + method335;
        final Class44 field8946 = this.Field8941;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8946, "inventory");
        if (field8946.Method365()) {
            for (int i = 9; i < Method1250().player.inventory.mainInventory.size(); ++i) {
                final int n7 = n6 + 1;
                final int n8 = i % 9;
                final Class44 field8947 = this.Field8926;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8947, "offset2");
                final int n9 = n7 + n8 * field8947.Method335();
                final int n10 = n2 + 1;
                final int n11 = i / 9 - 1;
                final Class44 field8948 = this.Field8926;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8948, "offset2");
                final int n12 = n10 + n11 * field8948.Method335();
                if (n3 < n12) {
                    n3 = n12;
                }
                final Object value = Method1250().player.inventory.mainInventory.get(i);
                Intrinsics.checkExpressionValueIsNotNull(value, "mc.player.inventory.mainInventory[item]");
                this.Method1249((ItemStack)value, n9, n12);
            }
            final double n13 = n4;
            final Class44 field8949 = this.Field8925;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8949, "offset1");
            n4 = n13 + field8949.Method335() * Double.longBitsToDouble((long)119726260 ^ 0x400800000722E0B4L);
        }
        final Class44 field8950 = this.Field8942;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8950, "hotbar");
        if (field8950.Method365()) {
            final int n14 = n2;
            final Class44 field8951 = this.Field8941;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8951, "inventory");
            int n15;
            if (field8951.Method365()) {
                final Class44 field8952 = this.Field8925;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8952, "offset1");
                n15 = field8952.Method335() * 3;
            }
            else {
                n15 = 0;
            }
            final int n16 = n14 + n15 + 1;
            int n17 = 0;
            while (true) {
                final int n18 = n6 + 1;
                final int n19 = n17;
                final Class44 field8953 = this.Field8926;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8953, "offset2");
                final int n20 = n18 + n19 * field8953.Method335();
                final Object value2 = Method1250().player.inventory.mainInventory.get(n17);
                Intrinsics.checkExpressionValueIsNotNull(value2, "mc.player.inventory.mainInventory[item]");
                this.Method1249((ItemStack)value2, n20, n16);
                ++n17;
            }
        }
        else {
            final Class44 field8954 = this.Field8944;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8954, "armor");
            if (field8954.Method365()) {
                final int n21 = n + 1;
                for (int j = 0; j < Method1250().player.inventory.armorInventory.size(); ++j) {
                    final int n22 = n2 + 1;
                    final int n23 = j;
                    final Class44 field8955 = this.Field8926;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field8955, "offset2");
                    final int n24 = n22 + n23 * field8955.Method335();
                    final Object value3 = Method1250().player.inventory.armorInventory.get(j);
                    Intrinsics.checkExpressionValueIsNotNull(value3, "mc.player.inventory.armorInventory[item]");
                    this.Method1249((ItemStack)value3, n21, n24);
                }
                final Class44 field8956 = this.Field8925;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8956, "offset1");
                n4 = field8956.Method335() * Double.longBitsToDouble(4616189618054758400L);
            }
            final Class44 field8957 = this.Field8943;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8957, "xcarry");
            if (!field8957.Method365()) {
                final Class44 field8958 = this.Field8945;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8958, "offhand");
                if (field8958.Method365()) {
                    final int n25 = n6;
                    final Class44 field8959 = this.Field8941;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field8959, "inventory");
                    int n26 = 0;
                    Label_0731: {
                        if (!field8959.Method365()) {
                            final Class44 field8960 = this.Field8942;
                            Intrinsics.checkExpressionValueIsNotNull((Object)field8960, "hotbar");
                            if (!field8960.Method365()) {
                                n26 = 0;
                                break Label_0731;
                            }
                        }
                        final Class44 field8961 = this.Field8925;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field8961, "offset1");
                        n26 = field8961.Method335() * 9;
                    }
                    final int n27 = n25 + n26;
                    final int n28 = n2;
                    final Class44 field8962 = this.Field8943;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field8962, "xcarry");
                    int n29;
                    if (field8962.Method365()) {
                        final Class44 field8963 = this.Field8925;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field8963, "offset1");
                        n29 = field8963.Method335() * 2;
                    }
                    else {
                        n29 = 0;
                    }
                    final int n30 = n28 + n29 + 1;
                    final Object value4 = Method1250().player.inventory.offHandInventory.get(0);
                    Intrinsics.checkExpressionValueIsNotNull(value4, "mc.player.inventory.offHandInventory[0]");
                    this.Method1249((ItemStack)value4, n27, n30);
                }
                this.Method274(n4);
                this.Method273(Double.longBitsToDouble((long)547380294 ^ 0x4059000020A05C46L));
                return;
            }
            int n31 = 1;
            while (true) {
                final int n32 = n6;
                final Class44 field8964 = this.Field8941;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8964, "inventory");
                int n33 = 0;
                Label_0585: {
                    if (!field8964.Method365()) {
                        final Class44 field8965 = this.Field8942;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field8965, "hotbar");
                        if (!field8965.Method365()) {
                            n33 = 0;
                            break Label_0585;
                        }
                    }
                    final Class44 field8966 = this.Field8925;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field8966, "offset1");
                    n33 = field8966.Method335() * 9;
                }
                final int n34 = n32 + n33 + 0;
                final int n35 = n2 + 1 + 0;
                final Container inventoryContainer = Method1250().player.inventoryContainer;
                Intrinsics.checkExpressionValueIsNotNull((Object)inventoryContainer, "mc.player.inventoryContainer");
                final Object value5 = inventoryContainer.getInventory().get(n31);
                Intrinsics.checkExpressionValueIsNotNull(value5, "mc.player.inventoryContainer.inventory[item]");
                this.Method1249((ItemStack)value5, n34, n35);
                ++n31;
            }
        }
    }
    
    private final void Method1249(final ItemStack itemStack, final int n, final int n2) {
        GlStateManager.pushMatrix();
        GlStateManager.enableDepth();
        RenderHelper.enableGUIStandardItemLighting();
        Method1250().getRenderItem().renderItemAndEffectIntoGUI(itemStack, n, n2);
        Method1250().getRenderItem().renderItemOverlays(Method1250().fontRenderer, itemStack, n, n2);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableDepth();
        GlStateManager.popMatrix();
    }
    
    public Class216() {
        super("InventoryHud", "Shows your inventory", true);
        this.Field8923 = this.Method23(new Class44("Scale", (Class42)this, 1.0, Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)647980881 ^ 0x40000000269F6751L), false));
        this.Field8924 = this.Method24(new Class1996(new Class44("Offsets", (Class42)this)));
        final Class1996 field8924 = this.Field8924;
        final Class44 method355 = new Class44("Offset 1", (Class42)this, Double.longBitsToDouble(4626322717216342016L), Double.longBitsToDouble(4625196817309499392L), Double.longBitsToDouble(4627730092099895296L), true).Method355("1");
        Intrinsics.checkExpressionValueIsNotNull((Object)method355, "Setting(\"Offset 1\", this\u202625.0, true).setTitle(\"1\")");
        this.Field8925 = this.Method23(field8924.Method7405(method355));
        final Class1996 field8925 = this.Field8924;
        final Class44 method356 = new Class44("Offset 2", (Class42)this, Double.longBitsToDouble(4625759767262920704L), Double.longBitsToDouble(4625196817309499392L), Double.longBitsToDouble(4626322717216342016L), true).Method355("2");
        Intrinsics.checkExpressionValueIsNotNull((Object)method356, "Setting(\"Offset 2\", this\u202620.0, true).setTitle(\"2\")");
        this.Field8926 = this.Method23(field8925.Method7405(method356));
        this.Field8927 = this.Method24(new Class1996(new Class44("Outline Width", (Class42)this)));
        final Class1996 field8926 = this.Field8927;
        final Class44 method357 = new Class44("Inside Outline Width", (Class42)this, 1.0, Double.longBitsToDouble((long)220199676 ^ 0x3FB9999994866366L), Double.longBitsToDouble((long)1296999192 ^ 0x401400004D4EA318L), false).Method355("Inside");
        Intrinsics.checkExpressionValueIsNotNull((Object)method357, "Setting(\"Inside Outline \u2026false).setTitle(\"Inside\")");
        this.Field8928 = this.Method23(this.Method23(field8926.Method7405(method357)));
        final Class1996 field8927 = this.Field8927;
        final Class44 method358 = new Class44("Outside Outline Width", (Class42)this, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4617315517961601024L), false).Method355("Outside");
        Intrinsics.checkExpressionValueIsNotNull((Object)method358, "Setting(\"Outside Outline\u2026alse).setTitle(\"Outside\")");
        this.Field8929 = this.Method23(this.Method23(field8927.Method7405(method358)));
        this.Field8930 = this.Method24(new Class1996(new Class44("Elements", (Class42)this)));
        this.Field8931 = this.Method24(this.Field8930.Method7406(new Class1996(new Class44("Outline", (Class42)this))));
        final Class1996 field8928 = this.Field8931;
        final Class44 method359 = new Class44("Inside Outline", (Class42)this, true).Method355("Inside");
        Intrinsics.checkExpressionValueIsNotNull((Object)method359, "Setting(\"Inside Outline\"\u2026 true).setTitle(\"Inside\")");
        this.Field8932 = this.Method23(field8928.Method7405(method359));
        final Class1996 field8929 = this.Field8931;
        final Class44 method360 = new Class44("Outside Outline", (Class42)this, false).Method355("Outside");
        Intrinsics.checkExpressionValueIsNotNull((Object)method360, "Setting(\"Outside Outline\u2026alse).setTitle(\"Outside\")");
        this.Field8933 = this.Method23(field8929.Method7405(method360));
        this.Field8934 = this.Method23(this.Field8930.Method7405(new Class44("Fill", (Class42)this, false)));
        this.Field8935 = this.Method24(new Class1996(new Class44("Colors", (Class42)this)));
        this.Field8936 = this.Method24(this.Field8935.Method7406(new Class1996(new Class44("Elements", (Class42)this))));
        this.Field8937 = this.Method23(this.Field8936.Method7405(new Class44("Inside Outline", (Class42)this, "Inside", new Class2027(255, 255, 255, 120))));
        this.Field8938 = this.Method23(this.Field8936.Method7405(new Class44("Outside Outline", (Class42)this, "Outside", new Class2027(255, 255, 255, 120))));
        this.Field8939 = this.Method23(this.Field8935.Method7405(new Class44("Fill Color", (Class42)this, "Fill", new Class2027(255, 255, 255, 120))));
        this.Field8940 = this.Method24(new Class1996(new Class44("Slots", (Class42)this)));
        this.Field8941 = this.Method23(this.Field8940.Method7405(new Class44("Inventory", (Class42)this, true)));
        this.Field8942 = this.Method23(this.Field8940.Method7405(new Class44("Hotbar", (Class42)this, false)));
        this.Field8943 = this.Method23(this.Field8940.Method7405(new Class44("XCarry", (Class42)this, false)));
        this.Field8944 = this.Method23(this.Field8940.Method7405(new Class44("Armor", (Class42)this, false)));
        this.Field8945 = this.Method23(this.Field8940.Method7405(new Class44("Offhand", (Class42)this, false)));
    }
    
    public static final Minecraft Method1250() {
        return Class1249.Field13656;
    }
    
    public static final void Method1251(final Minecraft field13656) {
        Class1249.Field13656 = field13656;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x53 ^ 0xDC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
