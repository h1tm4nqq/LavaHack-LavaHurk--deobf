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
 *  net.minecraft.inventory.Container
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.FoodStats
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1303;
import lavahack.client.Class1466;
import lavahack.client.Class1689;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.FoodStats;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2={"Lcom/kisman/cc/features/module/player/AutoEat;", "Lcom/kisman/cc/features/module/Module;", "()V", "fromInventory", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "health", "hunger", "mode", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/features/module/player/AutoEat$Mode;", "offhand", "smartHand", "swap", "Lcom/kisman/cc/features/module/player/AutoEat$Swap;", "whileHandActive", "bestFood", "Lnet/minecraft/item/ItemStack;", "first", "second", "check", "", "getHand", "Lnet/minecraft/util/EnumHand;", "searchHotbar", "", "searchInventory", "update", "", "Mode", "Swap", "kisman.cc"})
public final class Class136
extends Class42 {
    private final Class1303 Field8515 = new Class1303("Mode", (Class42)this, Class1689.Field15843).Method5303();
    private final Class1303 Field8516 = new Class1303("Switch", (Class42)this, Class1466.Field14850).Method5303();
    private final Class44 Field8517 = this.Method23(new Class44("Hunger", (Class42)this, Double.longBitsToDouble((long)118668152 ^ 0x402800000712BB78L), 0.0, Double.longBitsToDouble(0x4033000000000000L), true));
    private final Class44 Field8518 = this.Method23(new Class44("Health", (Class42)this, Double.longBitsToDouble(0x4020000000000000L), Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(0x4034000000000000L), true));
    private final Class44 Field8519 = this.Method23(new Class44("From Inventory", (Class42)this, false));
    private final Class44 Field8520 = this.Method23(new Class44("While Hand Active", (Class42)this, true));
    private final Class44 Field8521 = this.Method23(new Class44("Offhand", (Class42)this, false));
    private final Class44 Field8522 = this.Method23(new Class44("Smart Hand", (Class42)this, false));
    private int Field8523;

    @Override
    public void Method45() {
        if (Class136.Method938().player == null) return;
        if (Class136.Method938().world == null) {
            return;
        }
        if (!this.Method27()) {
            return;
        }
        EnumHand enumHand = this.Method934();
        if (enumHand == null) return;
        EnumHand enumHand2 = enumHand;
    }

    private final boolean Method27() {
        EntityPlayerSP entityPlayerSP = Class136.Method938().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        float f = entityPlayerSP.getHealth();
        Class44 class44 = this.Field8518;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"health");
        if (f <= (float)class44.Method335()) return true;
        EntityPlayerSP entityPlayerSP2 = Class136.Method938().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        FoodStats foodStats = entityPlayerSP2.getFoodStats();
        Intrinsics.checkExpressionValueIsNotNull((Object)foodStats, (String)"mc.player.foodStats");
        int n = foodStats.getFoodLevel();
        Class44 class442 = this.Field8517;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"hunger");
        if (n <= class442.Method335()) return true;
        return false;
    }

    private final EnumHand Method934() {
        EnumHand enumHand;
        EnumHand enumHand2;
        Class44 class44 = this.Field8521;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"offhand");
        EnumHand enumHand3 = enumHand2 = class44.Method365() ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND;
        if (Class136.Method938().player.activeHand == enumHand2) {
            Class44 class442 = this.Field8520;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"whileHandActive");
            if (!class442.Method365()) {
                return null;
            }
        }
        Class44 class443 = this.Field8522;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"smartHand");
        if (!class443.Method365()) {
            return enumHand2;
        }
        if (Class136.Method938().player.activeHand == EnumHand.MAIN_HAND) {
            enumHand = EnumHand.OFF_HAND;
            return enumHand;
        }
        enumHand = EnumHand.MAIN_HAND;
        return enumHand;
    }

    private final int Method935() {
        int n = -1;
        ItemStack itemStack = null;
        int n2 = 1;
        Container container = Class136.Method938().player.inventoryContainer;
        Intrinsics.checkExpressionValueIsNotNull((Object)container, (String)"mc.player.inventoryContainer");
        int n3 = container.getInventory().size();
        if (n2 > n3) return n;
        while (n2 != n3) {
            ++n2;
        }
        return n;
    }

    private final int Method936() {
        int n = -1;
        ItemStack itemStack = null;
        int n2 = 0;
        int n3 = 9;
        while (true) {
            ItemStack itemStack2;
            ItemStack itemStack3 = Class136.Method938().player.inventory.getStackInSlot(n2);
            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack3, (String)"mc.player.inventory.getStackInSlot(i)");
            if (this.Method937(itemStack, itemStack3) != null && !Intrinsics.areEqual((Object)itemStack2, (Object)itemStack)) {
                itemStack = itemStack2;
                n = n2;
            }
            ++n2;
        }
    }

    private final ItemStack Method937(ItemStack itemStack, ItemStack itemStack2) {
        ItemStack itemStack3;
        if (itemStack == null) {
            return itemStack2;
        }
        if (!(itemStack.item instanceof ItemFood)) return null;
        if (!(itemStack2.item instanceof ItemFood)) {
            return null;
        }
        Item item = itemStack.item;
        if (item == null) {
            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.item.ItemFood");
        }
        ItemFood itemFood = (ItemFood)item;
        Item item2 = itemStack2.item;
        if (item2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.item.ItemFood");
        }
        ItemFood itemFood2 = (ItemFood)item2;
        if ((Class1689)this.Field8515.Method341() == Class1689.Field15843) {
            ItemStack itemStack4;
            if (itemFood.getHealAmount(itemStack) > itemFood2.getHealAmount(itemStack2)) {
                itemStack4 = itemStack;
                return itemStack4;
            }
            itemStack4 = itemStack2;
            return itemStack4;
        }
        if (itemFood.getSaturationModifier(itemStack) > itemFood2.getSaturationModifier(itemStack2)) {
            itemStack3 = itemStack;
            return itemStack3;
        }
        itemStack3 = itemStack2;
        return itemStack3;
    }

    public Class136() {
        super("AutoEat", "Will automatically eat", Class97.Field8341);
    }

    public static final Minecraft Method938() {
        return Class42.Field8052;
    }

    public static final void Method939(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 101;
            cArray2[n] = (char)(cArray[n] ^ (0xADD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

