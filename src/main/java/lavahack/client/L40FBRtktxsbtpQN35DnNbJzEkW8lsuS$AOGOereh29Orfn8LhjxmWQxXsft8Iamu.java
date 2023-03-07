//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "it", "Lnet/minecraft/item/ItemStack;", "test"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$AOGOereh29Orfn8LhjxmWQxXsft8Iamu
implements Predicate {
    public static final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$AOGOereh29Orfn8LhjxmWQxXsft8Iamu Field15517 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$AOGOereh29Orfn8LhjxmWQxXsft8Iamu();
    private String Field15518 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean test(Object object) {
        return this.Method6278((ItemStack)object);
    }

    public final boolean Method6278(@NotNull @NotNull ItemStack itemStack) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)itemStack, (String)"it");
        if (itemStack.getItem() == Items.GOLDEN_APPLE) {
            n = (int)-1528513556L ^ 0xA4E4BBED;
            return n != 0;
        }
        n = (int)((long)1064386831 ^ (long)1064386831);
        return n != 0;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$AOGOereh29Orfn8LhjxmWQxXsft8Iamu() {
    }

    private static String Method6279(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)824020521L ^ 0x311D8E29;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)562560365 ^ (long)562560402);
            int n2 = (int)1994515601L ^ 0x76E1E42E;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1318082280 ^ (long)1318086325) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

