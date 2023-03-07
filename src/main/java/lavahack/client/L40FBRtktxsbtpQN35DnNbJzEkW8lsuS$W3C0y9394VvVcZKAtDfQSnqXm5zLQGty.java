//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import java.util.function.ToIntFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.item.ItemStack;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lnet/minecraft/item/ItemStack;", "kotlin.jvm.PlatformType", "applyAsInt"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty
implements ToIntFunction {
    public static final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty Field11526 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
    private int Field11527;

    public int applyAsInt(Object object) {
        return this.Method3550((ItemStack)object);
    }

    public final int Method3550(ItemStack itemStack) {
        int n = (int)((long)1352281846 ^ (long)1352281839) << 2;
        int n2 = (int)((long)308953155 ^ (long)308953154);
        ItemStack itemStack2 = itemStack;
        Intrinsics.checkExpressionValueIsNotNull((Object)itemStack2, (String)"it");
        return n - (n2 - (itemStack2.getMaxDamage() - itemStack.itemDamage) / itemStack.getMaxDamage()) * ((int)((long)-1021728340 ^ (long)-1021728331) << 2);
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty() {
    }

    private static String Method3551(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-925819353 ^ (long)-925819353);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)666018402 ^ (long)666018461);
            int n2 = ((int)690355200L ^ 0x2925FC43) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-744460122 ^ (long)-744462973) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

