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
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "it", "Lnet/minecraft/item/ItemStack;", "applyAsInt"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ
implements ToIntFunction {
    public static final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ Field9972 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ();
    private String Field9973 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public int applyAsInt(Object object) {
        return this.Method2216((ItemStack)object);
    }

    public final int Method2216(@NotNull @NotNull ItemStack itemStack) {
        Intrinsics.checkParameterIsNotNull((Object)itemStack, (String)"it");
        return itemStack.getCount();
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ() {
    }

    private static String Method2217(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1562011639L ^ 0xA2E59809;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-250901581L ^ 0xF10B8B4C);
            int n2 = (int)1864159009L ^ 0x6F1CCF04;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1270592729L ^ 0xB4445BF6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

