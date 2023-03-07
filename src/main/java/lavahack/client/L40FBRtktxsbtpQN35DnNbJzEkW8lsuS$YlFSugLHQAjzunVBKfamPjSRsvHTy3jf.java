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
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements ToIntFunction {
    public static final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field15659 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
    private int Field15660;

    public int applyAsInt(Object object) {
        return this.Method6390((ItemStack)object);
    }

    public final int Method6390(ItemStack itemStack) {
        ItemStack itemStack2 = itemStack;
        Intrinsics.checkExpressionValueIsNotNull((Object)itemStack2, (String)"it");
        return itemStack2.getCount();
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
    }

    private static String Method6391(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1325197619 ^ (long)-1325197619);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)449837952L ^ 0x1ACFFB7F);
            int n2 = (int)128028111L ^ 0x7A18D40;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1924857182 ^ (long)1924853089) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

