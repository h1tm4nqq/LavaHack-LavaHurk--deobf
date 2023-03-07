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
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$jNiJm0uQgY2wVhFel4twUsWMig1Nujvc
implements ToIntFunction {
    public static final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$jNiJm0uQgY2wVhFel4twUsWMig1Nujvc Field11872 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$jNiJm0uQgY2wVhFel4twUsWMig1Nujvc();
    private String Field11873 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public int applyAsInt(Object object) {
        return this.Method3825((ItemStack)object);
    }

    public final int Method3825(ItemStack itemStack) {
        ItemStack itemStack2 = itemStack;
        Intrinsics.checkExpressionValueIsNotNull((Object)itemStack2, (String)"it");
        return itemStack2.getCount();
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$jNiJm0uQgY2wVhFel4twUsWMig1Nujvc() {
    }

    private static String Method3826(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)422215014 ^ (long)422215014);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)2077395683L ^ 0x7BD28A1C);
            int n2 = (int)1518219418L ^ 0x5A7E30C1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)367815483 ^ (long)367818052) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

