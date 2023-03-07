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
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm
implements ToIntFunction {
    public static final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm Field16016 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm();
    private int Field16017;

    public int applyAsInt(Object object) {
        return this.Method6667((ItemStack)object);
    }

    public final int Method6667(ItemStack itemStack) {
        ItemStack itemStack2 = itemStack;
        Intrinsics.checkExpressionValueIsNotNull((Object)itemStack2, (String)"it");
        return itemStack2.getCount();
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm() {
    }

    private static String Method6668(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)565449231 ^ (long)565449231);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1896697196L ^ 0x8EF2B26B);
            int n2 = (int)-1190738615L ^ 0xB906C5E4;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1883392001L ^ 0x8FBDB13C) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

