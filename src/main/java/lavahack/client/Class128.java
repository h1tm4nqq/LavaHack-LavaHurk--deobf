//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHandSide
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0004H\u0016\u00a8\u0006\r"}, d2={"com/kisman/cc/features/module/combat/autorer/PlaceInfo$Companion$INVALID$1", "Lnet/minecraft/entity/EntityLivingBase;", "getArmorInventoryList", "", "Lnet/minecraft/item/ItemStack;", "getItemStackFromSlot", "slotIn", "Lnet/minecraft/inventory/EntityEquipmentSlot;", "getPrimaryHand", "Lnet/minecraft/util/EnumHandSide;", "setItemStackToSlot", "", "stack", "kisman.cc"})
public final class Class128
extends EntityLivingBase {
    private int Field8441;

    @NotNull
    @NotNull
    public Iterable getArmorInventoryList() {
        return new ArrayList();
    }

    public void setItemStackToSlot(@NotNull @NotNull EntityEquipmentSlot entityEquipmentSlot, @NotNull @NotNull ItemStack itemStack) {
        Intrinsics.checkParameterIsNotNull((Object)entityEquipmentSlot, (String)"slotIn");
        Intrinsics.checkParameterIsNotNull((Object)itemStack, (String)"stack");
    }

    @NotNull
    @NotNull
    public ItemStack getItemStackFromSlot(@NotNull @NotNull EntityEquipmentSlot entityEquipmentSlot) {
        Intrinsics.checkParameterIsNotNull((Object)entityEquipmentSlot, (String)"slotIn");
        ItemStack itemStack = ItemStack.EMPTY;
        Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"ItemStack.EMPTY");
        return itemStack;
    }

    @NotNull
    @NotNull
    public EnumHandSide getPrimaryHand() {
        return EnumHandSide.RIGHT;
    }

    Class128(World world) {
        super(world);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 246;
            cArray2[n] = (char)(cArray[n] ^ (0x739A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

