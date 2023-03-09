//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.inventory.Container
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemBucketMilk
 *  net.minecraft.item.ItemEnderPearl
 *  net.minecraft.item.ItemExpBottle
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemPotion
 *  net.minecraft.item.ItemStack
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1051;
import lavahack.client.Class1393;
import lavahack.client.Class1740;
import lavahack.client.Class1887;
import lavahack.client.Class1912;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemExpBottle;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Mouse;

@Class1887
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\"\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0011H\u0002J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0014H\u0002J\u0018\u0010(\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2={"Lcom/kisman/cc/features/module/combat/HandRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "hotbarFirst", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "mainhandLowHPMode", "mainhandLowHPVal", "mainhandMode", "mainhandRightClickMode", "mainhandSlot", "offhandLowHPMode", "offhandLowHPVal", "offhandMode", "offhandRightClickMode", "offhandRightClickNoUsefulItems", "offhandSlot", "", "usageUpdateController", "canBeSwitched", "", "offhand", "right", "lowHP", "doHandRewrite", "", "doSwitch", "findItem", "get", "Lnet/minecraft/item/ItemStack;", "slot", "getItem", "Lnet/minecraft/item/Item;", "itemCheck", "switch", "slotOfItem", "slotToSwitch", "Lcom/kisman/cc/util/enums/HandRewriteSlotMappings;", "update", "usefulItemsCheck", "windowClick", "Modes", "kisman.cc"})
public final class Class1573
extends Class42 {
    private final Class44 Field15329 = this.Method23(new Class44("Mainhand Mode", (Class42)this, Class1912.Field16825));
    private final Class44 Field15330 = this.Method23(new Class44("Mainhand Slot", (Class42)this, 1.0, 1.0, Double.longBitsToDouble((long)1819707370 ^ 0x402200006C7687EAL), true));
    private final Class44 Field15331 = this.Method23(new Class44("Mainhand Right Click Mode", (Class42)this, Class1912.Field16825));
    private final Class44 Field15332 = this.Method23(new Class44("Mainhand Low HP Mode", (Class42)this, Class1912.Field16825));
    private final Class44 Field15333 = this.Method23(new Class44("Mainhand Low HP Val", (Class42)this, Double.longBitsToDouble(0x4024000000000000L), 1.0, Double.longBitsToDouble(0x4042000000000000L), true));
    private final Class44 Field15334 = this.Method23(new Class44("Offhand Mode", (Class42)this, Class1912.Field16825));
    private final Class44 Field15335 = this.Method23(new Class44("Offhand Right Click Mode", (Class42)this, Class1912.Field16825));
    private final Class44 Field15336 = this.Method23(new Class44("Offhand Right Click No Useful Items", (Class42)this, true));
    private final Class44 Field15337 = this.Method23(new Class44("Offhand Low HP Mode", (Class42)this, Class1912.Field16825));
    private final Class44 Field15338 = this.Method23(new Class44("Offhand Low HP Val", (Class42)this, Double.longBitsToDouble(0x4024000000000000L), 1.0, Double.longBitsToDouble((long)111834406 ^ 0x4042000006AA7526L), true));
    private final Class44 Field15339 = this.Method23(new Class44("Usage UpdateController", (Class42)this, true));
    private final Class44 Field15340 = this.Method23(new Class44("Hotbar First", (Class42)this, false));
    private final int Field15341 = 45;
    private int Field15342;

    /*
     * Unable to fully structure code
     */
    @Override
    public void Method45() {
        block7: {
            if (Class1573.Method6211().player == null) return;
            if (Class1573.Method6211().world == null) return;
            if (Class1573.Method6211().playerController == null) {
                return;
            }
            v0 = this.Field15329;
            Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"mainhandMode");
            if (v0.Method341() == Class1912.Field16825 || !this.Method6201(false, false, false)) break block7;
            v1 = Mouse.isButtonDown((int)1) != false && Class1573.Method6211().currentScreen == null && this.Method6201(false, true, false) != false;
            v2 = Class1573.Method6211().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)v2, (String)"mc.player");
            v3 = v2.getHealth() + Class1573.Method6211().player.absorptionAmount;
            v4 = this.Field15333;
            Intrinsics.checkExpressionValueIsNotNull((Object)v4, (String)"mainhandLowHPVal");
            if (!(v3 < (float)v4.Method335())) ** GOTO lbl-1000
            v5 = this.Field15332;
            Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"mainhandLowHPMode");
            if (v5.Method341() != Class1912.Field16825 && this.Method6201(false, false, true)) {
                v6 = true;
            } else lbl-1000:
            // 2 sources

            {
                v6 = false;
            }
            this.Method6202(false, v1, v6);
        }
        v7 = this.Field15334;
        Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"offhandMode");
        if (v7.Method341() == Class1912.Field16825) return;
        if (this.Method6201(true, false, false) == false) return;
        if (!Mouse.isButtonDown((int)1) || Class1573.Method6211().currentScreen != null) ** GOTO lbl-1000
        v8 = this.Field15336;
        Intrinsics.checkExpressionValueIsNotNull((Object)v8, (String)"offhandRightClickNoUsefulItems");
        if (!(v8.Method365() && this.Method27() || !this.Method6201(true, true, false))) {
            v9 = true;
        } else lbl-1000:
        // 2 sources

        {
            v9 = false;
        }
        v10 = Class1573.Method6211().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)v10, (String)"mc.player");
        v11 = v10.getHealth() + Class1573.Method6211().player.absorptionAmount;
        v12 = this.Field15338;
        Intrinsics.checkExpressionValueIsNotNull((Object)v12, (String)"offhandLowHPVal");
        if (!(v11 < (float)v12.Method335())) ** GOTO lbl-1000
        v13 = this.Field15337;
        Intrinsics.checkExpressionValueIsNotNull((Object)v13, (String)"offhandLowHPMode");
        if (v13.Method341() != Class1912.Field16825 && this.Method6201(true, false, true)) {
            v14 = true;
        } else lbl-1000:
        // 2 sources

        {
            v14 = false;
        }
        this.Method6202(true, v9, v14);
    }

    private final boolean Method6201(boolean bl, boolean bl2, boolean bl3) {
        if (this.Method6204(bl, bl2, bl3) == -1) return false;
        return true;
    }

    private final boolean Method27() {
        EntityPlayerSP entityPlayerSP = Class1573.Method6211().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.getHeldItemMainhand().item instanceof ItemFood) return true;
        EntityPlayerSP entityPlayerSP2 = Class1573.Method6211().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (entityPlayerSP2.getHeldItemMainhand().item instanceof ItemPotion) return true;
        EntityPlayerSP entityPlayerSP3 = Class1573.Method6211().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
        if (entityPlayerSP3.getHeldItemMainhand().item instanceof ItemBucketMilk) return true;
        EntityPlayerSP entityPlayerSP4 = Class1573.Method6211().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
        if (entityPlayerSP4.getHeldItemMainhand().item instanceof ItemExpBottle) return true;
        EntityPlayerSP entityPlayerSP5 = Class1573.Method6211().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP5, (String)"mc.player");
        if (entityPlayerSP5.getHeldItemMainhand().item instanceof ItemBow) return true;
        EntityPlayerSP entityPlayerSP6 = Class1573.Method6211().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP6, (String)"mc.player");
        if (entityPlayerSP6.getHeldItemMainhand().item instanceof ItemEnderPearl) return true;
        return false;
    }

    private final void Method6202(boolean bl, boolean bl2, boolean bl3) {
        if (!this.Method6206(bl, bl2, bl3)) return;
        this.Method6205(bl, bl2, bl3);
    }

    private final Item Method6203(boolean bl, boolean bl2, boolean bl3) {
        Enum enum_;
        Item item;
        if (bl) {
            Enum enum_2;
            if (bl2) {
                Class44 class44 = this.Field15335;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"offhandRightClickMode");
                enum_2 = class44.Method341();
            } else if (bl3) {
                Class44 class44 = this.Field15337;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"offhandLowHPMode");
                enum_2 = class44.Method341();
            } else {
                Class44 class44 = this.Field15334;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"offhandMode");
                enum_2 = class44.Method341();
            }
            if (enum_2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.combat.HandRewrite.Modes");
            }
            item = ((Class1912)enum_2).Method7099();
            return item;
        }
        if (bl2) {
            Class44 class44 = this.Field15331;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mainhandRightClickMode");
            enum_ = class44.Method341();
        } else if (bl3) {
            Class44 class44 = this.Field15332;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mainhandLowHPMode");
            enum_ = class44.Method341();
        } else {
            Class44 class44 = this.Field15329;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mainhandMode");
            enum_ = class44.Method341();
        }
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.combat.HandRewrite.Modes");
        }
        item = ((Class1912)enum_).Method7099();
        return item;
    }

    private final int Method6204(boolean bl, boolean bl2, boolean bl3) {
        Class44 class44 = this.Field15340;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"hotbarFirst");
        if (class44.Method365()) {
            Container container = Class1573.Method6211().player.inventoryContainer;
            Intrinsics.checkExpressionValueIsNotNull((Object)container, (String)"mc.player.inventoryContainer");
            int n = container.getInventory().size() - 1;
            int n2 = 1;
            while (n >= n2) {
                if (n != 5 && n != 6 && n != 7 && n != 8) {
                    Container container2 = Class1573.Method6211().player.inventoryContainer;
                    Intrinsics.checkExpressionValueIsNotNull((Object)container2, (String)"mc.player.inventoryContainer");
                    Object object = container2.getInventory().get(n);
                    Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"mc.player.inventoryContainer.inventory[i]");
                    ItemStack itemStack = (ItemStack)object;
                    if (!itemStack.isEmpty && Intrinsics.areEqual((Object)itemStack.item, (Object)this.Method6203(bl, bl2, bl3))) {
                        return n;
                    }
                }
                --n;
            }
            return -1;
        }
        int n = 0;
        Container container = Class1573.Method6211().player.inventoryContainer;
        Intrinsics.checkExpressionValueIsNotNull((Object)container, (String)"mc.player.inventoryContainer");
        int n3 = container.getInventory().size();
        while (n < n3) {
            Container container3 = Class1573.Method6211().player.inventoryContainer;
            Intrinsics.checkExpressionValueIsNotNull((Object)container3, (String)"mc.player.inventoryContainer");
            Object object = container3.getInventory().get(n);
            Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"mc.player.inventoryContainer.inventory[i]");
            ItemStack itemStack = (ItemStack)object;
            if (!itemStack.isEmpty && Intrinsics.areEqual((Object)itemStack.item, (Object)this.Method6203(bl, bl2, bl3))) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    private final void Method6205(boolean bl, boolean bl2, boolean bl3) {
        String string;
        if (bl) {
            this.Method6208(this.Method6204(bl, bl2, bl3));
        } else {
            int n = this.Method6204(bl, bl2, bl3);
            Class44 class44 = this.Field15330;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mainhandSlot");
            this.Method6209(n, Class1051.Field12661.Method7454(class44.Method335()));
        }
        Class1740 class1740 = Class1393.Method5505();
        StringBuilder stringBuilder = new StringBuilder().append(bl ? "Offhand" : " Mainhand").append(" now has a ");
        if (bl) {
            if (bl3) {
                Class44 class44 = this.Field15337;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"offhandLowHPMode");
                string = class44.Method341().name();
            } else if (bl2) {
                Class44 class44 = this.Field15335;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"offhandRightClickMode");
                string = class44.Method341().name();
            } else {
                Class44 class44 = this.Field15334;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"offhandMode");
                string = class44.Method341().name();
            }
        } else if (bl3) {
            Class44 class44 = this.Field15332;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mainhandLowHPMode");
            string = class44.Method341().name();
        } else if (bl2) {
            Class44 class44 = this.Field15331;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mainhandRightClickMode");
            string = class44.Method341().name();
        } else {
            Class44 class44 = this.Field15329;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mainhandMode");
            string = class44.Method341().name();
        }
        class1740.Method1886(stringBuilder.append(string).toString());
    }

    private final boolean Method6206(boolean bl, boolean bl2, boolean bl3) {
        Item item;
        if (bl) {
            EntityPlayerSP entityPlayerSP = Class1573.Method6211().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            item = entityPlayerSP.getHeldItemMainhand().item;
            return Intrinsics.areEqual((Object)item, (Object)this.Method6203(bl, bl2, bl3)) ^ true;
        }
        Class44 class44 = this.Field15330;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mainhandSlot");
        item = this.Method6207((int)Class1051.Field12661.Method7454((int)class44.Method335()).Method4290()).item;
        return Intrinsics.areEqual((Object)item, (Object)this.Method6203(bl, bl2, bl3)) ^ true;
    }

    private final ItemStack Method6207(int n) {
        Container container = Class1573.Method6211().player.inventoryContainer;
        Intrinsics.checkExpressionValueIsNotNull((Object)container, (String)"mc.player.inventoryContainer");
        Object object = container.getInventory().get(n);
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"mc.player.inventoryContainer.inventory[slot]");
        return (ItemStack)object;
    }

    private final void Method6208(int n) {
        this.Method6210(n, false);
        this.Method6210(n, true);
        this.Method6210(n, false);
        Class44 class44 = this.Field15339;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"usageUpdateController");
        if (!class44.Method365()) return;
        Class1573.Method6211().playerController.updateController();
    }

    private final void Method6209(int n, Class1051 class1051) {
        this.Method6210(n, false);
        this.Method6210(class1051.Method4290(), false);
        this.Method6210(n, false);
        Class44 class44 = this.Field15339;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"usageUpdateController");
        if (!class44.Method365()) return;
        Class1573.Method6211().playerController.updateController();
    }

    private final void Method6210(int n, boolean bl) {
        Class1573.Method6211().playerController.windowClick(Class1573.Method6211().player.inventoryContainer.windowId, bl ? this.Field15341 : n, 0, ClickType.PICKUP, (EntityPlayer)Class1573.Method6211().player);
    }

    public Class1573() {
        super("HandRewrite", "Need to update btw, dont use mainhand feature", Class97.Field8338);
    }

    public static final Minecraft Method6211() {
        return Class42.Field8052;
    }

    public static final void Method6212(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 237;
            cArray2[n] = (char)(cArray[n] ^ (0x33C0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

