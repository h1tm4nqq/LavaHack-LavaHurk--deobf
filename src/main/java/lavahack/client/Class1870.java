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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lnet/minecraft/item/ItemStack;", "kotlin.jvm.PlatformType", "test"})
final class Class1870
implements Predicate {
    public static final Class1870 Field16587 = new Class1870();
    private String Field16588 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean test(Object object) {
        return this.Method6967((ItemStack)object);
    }

    public final boolean Method6967(ItemStack itemStack) {
        return Intrinsics.areEqual((Object)itemStack.item, (Object)Items.CHORUS_FRUIT);
    }

    Class1870() {
    }
}

