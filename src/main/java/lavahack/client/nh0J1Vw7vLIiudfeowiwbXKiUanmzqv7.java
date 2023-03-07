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
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.FoodStats;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2={"Lcom/kisman/cc/features/module/player/AutoEat;", "Lcom/kisman/cc/features/module/Module;", "()V", "fromInventory", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "health", "hunger", "mode", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/features/module/player/AutoEat$Mode;", "offhand", "smartHand", "swap", "Lcom/kisman/cc/features/module/player/AutoEat$Swap;", "whileHandActive", "bestFood", "Lnet/minecraft/item/ItemStack;", "first", "second", "check", "", "getHand", "Lnet/minecraft/util/EnumHand;", "searchHotbar", "", "searchInventory", "update", "", "Mode", "Swap", "kisman.cc"})
public final class nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field8515 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15843).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field8516 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field14850).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8517 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hunger", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)118668152 ^ 0x402800000712BB78L), 0.0, Double.longBitsToDouble(0xCC59B6293BEC9539L ^ 0x8C6AB6293BEC9539L), (boolean)((long)-933888252 ^ (long)-933888251)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8518 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Health", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x4DDF54F07A05A5B1L ^ 0xDFF54F07A05A5B1L), Double.longBitsToDouble(0x6CDBED3721C1E1F2L ^ 0x533BED3721C1E1F2L), Double.longBitsToDouble(0xC7F9FF5431C3F136L ^ 0x87CDFF5431C3F136L), ((int)-1054832000L ^ 0xC1208A81) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8519 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("From Inventory", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2062900347 ^ (long)-2062900347)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8520 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("While Hand Active", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-675006412 ^ (long)-675006411)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8521 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offhand", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-736143212 ^ (long)-736143212)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8522 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Smart Hand", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1935856406L ^ 0x8C9D2CEA) != 0));
    private int Field8523;

    @Override
    public void Method45() {
        if (nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7.Method938().player == null) return;
        if (nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7.Method938().world == null) {
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
        int n;
        EntityPlayerSP entityPlayerSP = nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7.Method938().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        float f = entityPlayerSP.getHealth();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field8518;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"health");
        if (!(f <= (float)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335())) {
            EntityPlayerSP entityPlayerSP2 = nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7.Method938().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            FoodStats foodStats = entityPlayerSP2.getFoodStats();
            Intrinsics.checkExpressionValueIsNotNull((Object)foodStats, (String)"mc.player.foodStats");
            int n2 = foodStats.getFoodLevel();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field8517;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"hunger");
            if (n2 > qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335()) {
                n = (int)-1607088313L ^ 0xA035C747;
                return n != 0;
            }
        }
        n = (int)37351662L ^ 0x239F0EF;
        return n != 0;
    }

    private final EnumHand Method934() {
        EnumHand enumHand;
        EnumHand enumHand2;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field8521;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"offhand");
        EnumHand enumHand3 = enumHand2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND;
        if (nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7.Method938().player.activeHand == enumHand2) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field8520;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"whileHandActive");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                return null;
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field8522;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"smartHand");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) {
            return enumHand2;
        }
        if (nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7.Method938().player.activeHand == EnumHand.MAIN_HAND) {
            enumHand = EnumHand.OFF_HAND;
            return enumHand;
        }
        enumHand = EnumHand.MAIN_HAND;
        return enumHand;
    }

    private final int Method935() {
        int n = (int)-438132588L ^ 0x1A1D5F6B;
        ItemStack itemStack = null;
        int n2 = (int)69096059L ^ 0x41E527A;
        Container container = nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7.Method938().player.inventoryContainer;
        Intrinsics.checkExpressionValueIsNotNull((Object)container, (String)"mc.player.inventoryContainer");
        int n3 = container.getInventory().size();
        if (n2 > n3) return n;
        while (true) {
            int cfr_ignored_0 = (int)((long)294955625 ^ (long)294955628);
            int cfr_ignored_1 = ((int)1582844310L ^ 0x5E584997) << 3;
            if (n2 == n3) return n;
            ++n2;
        }
    }

    private final int Method936() {
        int n = (int)1697280321L ^ 0x9AD58EBE;
        ItemStack itemStack = null;
        int n2 = (int)-1303879132L ^ 0xB2486224;
        int n3 = (int)1070991428L ^ 0x3FD6084D;
        while (true) {
            ItemStack itemStack2;
            ItemStack itemStack3 = nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7.Method938().player.inventory.getStackInSlot(n2);
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
        if ((nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field8515.Method341() == nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15843) {
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

    public nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7() {
        super("AutoEat", "Will automatically eat", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
    }

    public static final Minecraft Method938() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method939(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-827980985L ^ 0xCEA60347;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1837795408 ^ (long)1837795503);
            int n2 = (int)((long)1468284022 ^ (long)1468283923);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-102358962 ^ (long)-102356333) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

