//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.internal.*;
import org.lwjgl.input.*;
import net.minecraft.client.entity.*;
import kotlin.*;
import net.minecraft.item.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.*;

@Class1887
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\u0005?\u0006\u0002\u0010\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\"\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0011H\u0002J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0014H\u0002J\u0018\u0010(\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006*" }, d2 = { "Lcom/kisman/cc/features/module/combat/HandRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "hotbarFirst", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "mainhandLowHPMode", "mainhandLowHPVal", "mainhandMode", "mainhandRightClickMode", "mainhandSlot", "offhandLowHPMode", "offhandLowHPVal", "offhandMode", "offhandRightClickMode", "offhandRightClickNoUsefulItems", "offhandSlot", "", "usageUpdateController", "canBeSwitched", "", "offhand", "right", "lowHP", "doHandRewrite", "", "doSwitch", "findItem", "get", "Lnet/minecraft/item/ItemStack;", "slot", "getItem", "Lnet/minecraft/item/Item;", "itemCheck", "switch", "slotOfItem", "slotToSwitch", "Lcom/kisman/cc/util/enums/HandRewriteSlotMappings;", "update", "usefulItemsCheck", "windowClick", "Modes", "kisman.cc" })
public final class Class1573 extends Class42
{
    private final Class44 Field15329;
    private final Class44 Field15330;
    private final Class44 Field15331;
    private final Class44 Field15332;
    private final Class44 Field15333;
    private final Class44 Field15334;
    private final Class44 Field15335;
    private final Class44 Field15336;
    private final Class44 Field15337;
    private final Class44 Field15338;
    private final Class44 Field15339;
    private final Class44 Field15340;
    private final int Field15341 = 45;
    private int Field15342;
    
    @Override
    public void Method45() {
        if (Method6211().player == null || Method6211().world == null || Method6211().playerController == null) {
            return;
        }
        final Class44 field15329 = this.Field15329;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15329, "mainhandMode");
        if (field15329.Method341() != Class1912.Field16825 && this.Method6201(false, false, false)) {
            final boolean b = false;
            final boolean b2 = Mouse.isButtonDown(1) && Method6211().currentScreen == null && this.Method6201(false, true, false);
            final EntityPlayerSP player = Method6211().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            final float n = player.getHealth() + Method6211().player.absorptionAmount;
            final Class44 field15330 = this.Field15333;
            Intrinsics.checkExpressionValueIsNotNull((Object)field15330, "mainhandLowHPVal");
            boolean b3 = false;
            Label_0167: {
                if (n < field15330.Method335()) {
                    final Class44 field15331 = this.Field15332;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field15331, "mainhandLowHPMode");
                    if (field15331.Method341() != Class1912.Field16825 && this.Method6201(false, false, true)) {
                        b3 = true;
                        break Label_0167;
                    }
                }
                b3 = false;
            }
            this.Method6202(b, b2, b3);
        }
        final Class44 field15332 = this.Field15334;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15332, "offhandMode");
        if (field15332.Method341() != Class1912.Field16825 && this.Method6201(true, false, false)) {
            final boolean b4 = true;
            boolean b5 = false;
            Label_0255: {
                if (Mouse.isButtonDown(1) && Method6211().currentScreen == null) {
                    final Class44 field15333 = this.Field15336;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field15333, "offhandRightClickNoUsefulItems");
                    if ((!field15333.Method365() || !this.Method27()) && this.Method6201(true, true, false)) {
                        b5 = true;
                        break Label_0255;
                    }
                }
                b5 = false;
            }
            final EntityPlayerSP player2 = Method6211().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            final float n2 = player2.getHealth() + Method6211().player.absorptionAmount;
            final Class44 field15334 = this.Field15338;
            Intrinsics.checkExpressionValueIsNotNull((Object)field15334, "offhandLowHPVal");
            boolean b6 = false;
            Label_0332: {
                if (n2 < field15334.Method335()) {
                    final Class44 field15335 = this.Field15337;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field15335, "offhandLowHPMode");
                    if (field15335.Method341() != Class1912.Field16825 && this.Method6201(true, false, true)) {
                        b6 = true;
                        break Label_0332;
                    }
                }
                b6 = false;
            }
            this.Method6202(b4, b5, b6);
        }
    }
    
    private final boolean Method6201(final boolean b, final boolean b2, final boolean b3) {
        return this.Method6204(b, b2, b3) != -1;
    }
    
    private final boolean Method27() {
        final EntityPlayerSP player = Method6211().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        if (!(player.getHeldItemMainhand().item instanceof ItemFood)) {
            final EntityPlayerSP player2 = Method6211().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            if (!(player2.getHeldItemMainhand().item instanceof ItemPotion)) {
                final EntityPlayerSP player3 = Method6211().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
                if (!(player3.getHeldItemMainhand().item instanceof ItemBucketMilk)) {
                    final EntityPlayerSP player4 = Method6211().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player4, "mc.player");
                    if (!(player4.getHeldItemMainhand().item instanceof ItemExpBottle)) {
                        final EntityPlayerSP player5 = Method6211().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player5, "mc.player");
                        if (!(player5.getHeldItemMainhand().item instanceof ItemBow)) {
                            final EntityPlayerSP player6 = Method6211().player;
                            Intrinsics.checkExpressionValueIsNotNull((Object)player6, "mc.player");
                            if (!(player6.getHeldItemMainhand().item instanceof ItemEnderPearl)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    private final void Method6202(final boolean b, final boolean b2, final boolean b3) {
        if (this.Method6206(b, b2, b3)) {
            this.Method6205(b, b2, b3);
        }
    }
    
    private final Item Method6203(final boolean b, final boolean b2, final boolean b3) {
        Item item;
        if (b) {
            Enum enum2;
            Enum enum1;
            if (b2) {
                final Class44 field15335 = this.Field15335;
                Intrinsics.checkExpressionValueIsNotNull((Object)field15335, "offhandRightClickMode");
                enum1 = (enum2 = field15335.Method341());
            }
            else if (b3) {
                final Class44 field15336 = this.Field15337;
                Intrinsics.checkExpressionValueIsNotNull((Object)field15336, "offhandLowHPMode");
                enum1 = (enum2 = field15336.Method341());
            }
            else {
                final Class44 field15337 = this.Field15334;
                Intrinsics.checkExpressionValueIsNotNull((Object)field15337, "offhandMode");
                enum1 = (enum2 = field15337.Method341());
            }
            if (enum2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.combat.HandRewrite.Modes");
            }
            item = ((Class1912)enum1).Method7099();
        }
        else {
            Enum enum4;
            Enum enum3;
            if (b2) {
                final Class44 field15338 = this.Field15331;
                Intrinsics.checkExpressionValueIsNotNull((Object)field15338, "mainhandRightClickMode");
                enum3 = (enum4 = field15338.Method341());
            }
            else if (b3) {
                final Class44 field15339 = this.Field15332;
                Intrinsics.checkExpressionValueIsNotNull((Object)field15339, "mainhandLowHPMode");
                enum3 = (enum4 = field15339.Method341());
            }
            else {
                final Class44 field15340 = this.Field15329;
                Intrinsics.checkExpressionValueIsNotNull((Object)field15340, "mainhandMode");
                enum3 = (enum4 = field15340.Method341());
            }
            if (enum4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.combat.HandRewrite.Modes");
            }
            item = ((Class1912)enum3).Method7099();
        }
        return item;
    }
    
    private final int Method6204(final boolean b, final boolean b2, final boolean b3) {
        final Class44 field15340 = this.Field15340;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15340, "hotbarFirst");
        if (field15340.Method365()) {
            final Container inventoryContainer = Method6211().player.inventoryContainer;
            Intrinsics.checkExpressionValueIsNotNull((Object)inventoryContainer, "mc.player.inventoryContainer");
            for (int i = inventoryContainer.getInventory().size() - 1; i >= 1; --i) {
                if (i != 5 && i != 6 && i != 7) {
                    if (i != 8) {
                        final Container inventoryContainer2 = Method6211().player.inventoryContainer;
                        Intrinsics.checkExpressionValueIsNotNull((Object)inventoryContainer2, "mc.player.inventoryContainer");
                        final Object value = inventoryContainer2.getInventory().get(i);
                        Intrinsics.checkExpressionValueIsNotNull(value, "mc.player.inventoryContainer.inventory[i]");
                        final ItemStack itemStack = (ItemStack)value;
                        if (!itemStack.isEmpty) {
                            if (Intrinsics.areEqual((Object)itemStack.item, (Object)this.Method6203(b, b2, b3))) {
                                return i;
                            }
                        }
                    }
                }
            }
        }
        else {
            int j = 0;
            final Container inventoryContainer3 = Method6211().player.inventoryContainer;
            Intrinsics.checkExpressionValueIsNotNull((Object)inventoryContainer3, "mc.player.inventoryContainer");
            while (j < inventoryContainer3.getInventory().size()) {
                final Container inventoryContainer4 = Method6211().player.inventoryContainer;
                Intrinsics.checkExpressionValueIsNotNull((Object)inventoryContainer4, "mc.player.inventoryContainer");
                final Object value2 = inventoryContainer4.getInventory().get(j);
                Intrinsics.checkExpressionValueIsNotNull(value2, "mc.player.inventoryContainer.inventory[i]");
                final ItemStack itemStack2 = (ItemStack)value2;
                if (!itemStack2.isEmpty) {
                    if (Intrinsics.areEqual((Object)itemStack2.item, (Object)this.Method6203(b, b2, b3))) {
                        return j;
                    }
                }
                ++j;
            }
        }
        return -1;
    }
    
    private final void Method6205(final boolean b, final boolean b2, final boolean b3) {
        if (b) {
            this.Method6208(this.Method6204(b, b2, b3));
        }
        else {
            final int method6204 = this.Method6204(b, b2, b3);
            final Class2005 field12661 = Class1051.Field12661;
            final Class44 field12662 = this.Field15330;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12662, "mainhandSlot");
            this.Method6209(method6204, field12661.Method7454(field12662.Method335()));
        }
        final Class1740 method6205 = Class1393.Method5505();
        final StringBuilder append = new StringBuilder().append(b ? "Offhand" : " Mainhand").append(" now has a ");
        String str;
        if (b) {
            if (b3) {
                final Class44 field12663 = this.Field15337;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12663, "offhandLowHPMode");
                str = field12663.Method341().name();
            }
            else if (b2) {
                final Class44 field12664 = this.Field15335;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12664, "offhandRightClickMode");
                str = field12664.Method341().name();
            }
            else {
                final Class44 field12665 = this.Field15334;
                Intrinsics.checkExpressionValueIsNotNull((Object)field12665, "offhandMode");
                str = field12665.Method341().name();
            }
        }
        else if (b3) {
            final Class44 field12666 = this.Field15332;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12666, "mainhandLowHPMode");
            str = field12666.Method341().name();
        }
        else if (b2) {
            final Class44 field12667 = this.Field15331;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12667, "mainhandRightClickMode");
            str = field12667.Method341().name();
        }
        else {
            final Class44 field12668 = this.Field15329;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12668, "mainhandMode");
            str = field12668.Method341().name();
        }
        method6205.Method1886(append.append(str).toString());
    }
    
    private final boolean Method6206(final boolean b, final boolean b2, final boolean b3) {
        Item item;
        if (b) {
            final EntityPlayerSP player = Method6211().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            item = player.getHeldItemMainhand().item;
        }
        else {
            final Class2005 field12661 = Class1051.Field12661;
            final Class44 field12662 = this.Field15330;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12662, "mainhandSlot");
            item = this.Method6207(field12661.Method7454(field12662.Method335()).Method4290()).item;
        }
        return Intrinsics.areEqual((Object)item, (Object)this.Method6203(b, b2, b3)) ^ true;
    }
    
    private final ItemStack Method6207(final int n) {
        final Container inventoryContainer = Method6211().player.inventoryContainer;
        Intrinsics.checkExpressionValueIsNotNull((Object)inventoryContainer, "mc.player.inventoryContainer");
        final Object value = inventoryContainer.getInventory().get(n);
        Intrinsics.checkExpressionValueIsNotNull(value, "mc.player.inventoryContainer.inventory[slot]");
        return (ItemStack)value;
    }
    
    private final void Method6208(final int n) {
        this.Method6210(n, false);
        this.Method6210(n, true);
        this.Method6210(n, false);
        final Class44 field15339 = this.Field15339;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15339, "usageUpdateController");
        if (field15339.Method365()) {
            Method6211().playerController.updateController();
        }
    }
    
    private final void Method6209(final int n, final Class1051 class1051) {
        this.Method6210(n, false);
        this.Method6210(class1051.Method4290(), false);
        this.Method6210(n, false);
        final Class44 field15339 = this.Field15339;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15339, "usageUpdateController");
        if (field15339.Method365()) {
            Method6211().playerController.updateController();
        }
    }
    
    private final void Method6210(final int n, final boolean b) {
        Method6211().playerController.windowClick(Method6211().player.inventoryContainer.windowId, b ? this.Field15341 : n, 0, ClickType.PICKUP, (EntityPlayer)Method6211().player);
    }
    
    public Class1573() {
        super("HandRewrite", "Need to update btw, dont use mainhand feature", Class97.Field8338);
        this.Field15329 = this.Method23(new Class44("Mainhand Mode", this, Class1912.Field16825));
        this.Field15330 = this.Method23(new Class44("Mainhand Slot", this, 1.0, 1.0, Double.longBitsToDouble((long)1819707370 ^ 0x402200006C7687EAL), true));
        this.Field15331 = this.Method23(new Class44("Mainhand Right Click Mode", this, Class1912.Field16825));
        this.Field15332 = this.Method23(new Class44("Mainhand Low HP Mode", this, Class1912.Field16825));
        this.Field15333 = this.Method23(new Class44("Mainhand Low HP Val", this, Double.longBitsToDouble(4621819117588971520L), 1.0, Double.longBitsToDouble(4630263366890291200L), true));
        this.Field15334 = this.Method23(new Class44("Offhand Mode", this, Class1912.Field16825));
        this.Field15335 = this.Method23(new Class44("Offhand Right Click Mode", this, Class1912.Field16825));
        this.Field15336 = this.Method23(new Class44("Offhand Right Click No Useful Items", this, true));
        this.Field15337 = this.Method23(new Class44("Offhand Low HP Mode", this, Class1912.Field16825));
        this.Field15338 = this.Method23(new Class44("Offhand Low HP Val", this, Double.longBitsToDouble(4621819117588971520L), 1.0, Double.longBitsToDouble((long)111834406 ^ 0x4042000006AA7526L), true));
        this.Field15339 = this.Method23(new Class44("Usage UpdateController", this, true));
        this.Field15340 = this.Method23(new Class44("Hotbar First", this, false));
    }
    
    public static final Minecraft Method6211() {
        return Class42.Field8052;
    }
    
    public static final void Method6212(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x33C0 ^ 0xED));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
