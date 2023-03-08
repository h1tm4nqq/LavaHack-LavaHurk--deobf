//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.internal.*;
import net.minecraft.client.entity.*;
import net.minecraft.util.*;
import net.minecraft.inventory.*;
import kotlin.*;
import net.minecraft.item.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0005?\u0006\u0002\u0010\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001f" }, d2 = { "Lcom/kisman/cc/features/module/player/AutoEat;", "Lcom/kisman/cc/features/module/Module;", "()V", "fromInventory", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "health", "hunger", "mode", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/features/module/player/AutoEat$Mode;", "offhand", "smartHand", "swap", "Lcom/kisman/cc/features/module/player/AutoEat$Swap;", "whileHandActive", "bestFood", "Lnet/minecraft/item/ItemStack;", "first", "second", "check", "", "getHand", "Lnet/minecraft/util/EnumHand;", "searchHotbar", "", "searchInventory", "update", "", "Mode", "Swap", "kisman.cc" })
public final class Class136 extends Class42
{
    private final Class1303 Field8515;
    private final Class1303 Field8516;
    private final Class44 Field8517;
    private final Class44 Field8518;
    private final Class44 Field8519;
    private final Class44 Field8520;
    private final Class44 Field8521;
    private final Class44 Field8522;
    private int Field8523;
    
    @Override
    public void Method45() {
        if (Method938().player == null || Method938().world == null) {
            return;
        }
        if (!this.Method27()) {
            return;
        }
        if (this.Method934() != null) {
            return;
        }
    }
    
    private final boolean Method27() {
        final EntityPlayerSP player = Method938().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        final float getHealth = player.getHealth();
        final Class44 field8518 = this.Field8518;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8518, "health");
        if (getHealth > field8518.Method335()) {
            final EntityPlayerSP player2 = Method938().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            final FoodStats getFoodStats = player2.getFoodStats();
            Intrinsics.checkExpressionValueIsNotNull((Object)getFoodStats, "mc.player.foodStats");
            final int getFoodLevel = getFoodStats.getFoodLevel();
            final Class44 field8519 = this.Field8517;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8519, "hunger");
            if (getFoodLevel > field8519.Method335()) {
                return false;
            }
        }
        return true;
    }
    
    private final EnumHand Method934() {
        final Class44 field8521 = this.Field8521;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8521, "offhand");
        final EnumHand enumHand = field8521.Method365() ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND;
        if (Method938().player.activeHand == enumHand) {
            final Class44 field8522 = this.Field8520;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8522, "whileHandActive");
            if (!field8522.Method365()) {
                return null;
            }
        }
        final Class44 field8523 = this.Field8522;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8523, "smartHand");
        if (!field8523.Method365()) {
            return enumHand;
        }
        return (Method938().player.activeHand == EnumHand.MAIN_HAND) ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND;
    }
    
    private final int Method935() {
        final int n = -1;
        final ItemStack itemStack = null;
        int i = 1;
        final Container inventoryContainer = Method938().player.inventoryContainer;
        Intrinsics.checkExpressionValueIsNotNull((Object)inventoryContainer, "mc.player.inventoryContainer");
        final int size = inventoryContainer.getInventory().size();
        if (i <= size) {
            while (i != size) {
                ++i;
            }
        }
        return n;
    }
    
    private final int Method936() {
        ItemStack itemStack = null;
        int n = 0;
        while (true) {
            final ItemStack itemStack2 = itemStack;
            final ItemStack getStackInSlot = Method938().player.inventory.getStackInSlot(n);
            Intrinsics.checkExpressionValueIsNotNull((Object)getStackInSlot, "mc.player.inventory.getStackInSlot(i)");
            final ItemStack method937 = this.Method937(itemStack2, getStackInSlot);
            if (method937 != null) {
                final ItemStack itemStack3 = method937;
                if (!Intrinsics.areEqual((Object)itemStack3, (Object)itemStack)) {
                    itemStack = itemStack3;
                }
            }
            ++n;
        }
    }
    
    private final ItemStack Method937(final ItemStack itemStack, final ItemStack itemStack2) {
        if (itemStack == null) {
            return itemStack2;
        }
        if (!(itemStack.item instanceof ItemFood) || !(itemStack2.item instanceof ItemFood)) {
            return null;
        }
        final Item item = itemStack.item;
        if (item == null) {
            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.item.ItemFood");
        }
        final ItemFood itemFood = (ItemFood)item;
        final Item item2 = itemStack2.item;
        if (item2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.item.ItemFood");
        }
        final ItemFood itemFood2 = (ItemFood)item2;
        if (this.Field8515.Method341() == Class1689.Field15843) {
            return (itemFood.getHealAmount(itemStack) > itemFood2.getHealAmount(itemStack2)) ? itemStack : itemStack2;
        }
        return (itemFood.getSaturationModifier(itemStack) > itemFood2.getSaturationModifier(itemStack2)) ? itemStack : itemStack2;
    }
    
    public Class136() {
        super("AutoEat", "Will automatically eat", Class97.Field8341);
        this.Field8515 = new Class1303("Mode", (Class42)this, (Enum)Class1689.Field15843).Method5303();
        this.Field8516 = new Class1303("Switch", (Class42)this, (Enum)Class1466.Field14850).Method5303();
        this.Field8517 = this.Method23(new Class44("Hunger", this, Double.longBitsToDouble((long)118668152 ^ 0x402800000712BB78L), 0.0, Double.longBitsToDouble(4626041242239631360L), true));
        this.Field8518 = this.Method23(new Class44("Health", this, Double.longBitsToDouble(4620693217682128896L), Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4626322717216342016L), true));
        this.Field8519 = this.Method23(new Class44("From Inventory", this, false));
        this.Field8520 = this.Method23(new Class44("While Hand Active", this, true));
        this.Field8521 = this.Method23(new Class44("Offhand", this, false));
        this.Field8522 = this.Method23(new Class44("Smart Hand", this, false));
    }
    
    public static final Minecraft Method938() {
        return Class42.Field8052;
    }
    
    public static final void Method939(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xADD ^ 0x65));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
