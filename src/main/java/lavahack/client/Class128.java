//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0004H\u0016?\u0006\r" }, d2 = { "com/kisman/cc/features/module/combat/autorer/PlaceInfo$Companion$INVALID$1", "Lnet/minecraft/entity/EntityLivingBase;", "getArmorInventoryList", "", "Lnet/minecraft/item/ItemStack;", "getItemStackFromSlot", "slotIn", "Lnet/minecraft/inventory/EntityEquipmentSlot;", "getPrimaryHand", "Lnet/minecraft/util/EnumHandSide;", "setItemStackToSlot", "", "stack", "kisman.cc" })
public final class Class128 extends EntityLivingBase
{
    private int Field8441;
    
    @NotNull
    @NotNull
    public Iterable getArmorInventoryList() {
        return new ArrayList();
    }
    
    public void setItemStackToSlot(@NotNull @NotNull final EntityEquipmentSlot entityEquipmentSlot, @NotNull @NotNull final ItemStack itemStack) {
        Intrinsics.checkParameterIsNotNull((Object)entityEquipmentSlot, "slotIn");
        Intrinsics.checkParameterIsNotNull((Object)itemStack, "stack");
    }
    
    @NotNull
    @NotNull
    public ItemStack getItemStackFromSlot(@NotNull @NotNull final EntityEquipmentSlot entityEquipmentSlot) {
        Intrinsics.checkParameterIsNotNull((Object)entityEquipmentSlot, "slotIn");
        final ItemStack EMPTY = ItemStack.EMPTY;
        Intrinsics.checkExpressionValueIsNotNull((Object)EMPTY, "ItemStack.EMPTY");
        return EMPTY;
    }
    
    @NotNull
    @NotNull
    public EnumHandSide getPrimaryHand() {
        return EnumHandSide.RIGHT;
    }
    
    Class128(final World world) {
        super(world);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x739A ^ 0xF6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
