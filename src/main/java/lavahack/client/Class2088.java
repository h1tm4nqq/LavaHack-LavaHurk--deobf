//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import net.minecraft.item.ItemStack;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lnet/minecraft/item/ItemStack;", "kotlin.jvm.PlatformType", "test"})
final class Class2088
implements Predicate {
    public static final Class2088 Field17532 = new Class2088();
    private int Field17533;

    public boolean test(Object object) {
        return this.Method7629((ItemStack)object);
    }

    public final boolean Method7629(ItemStack itemStack) {
        if (itemStack.isEmpty()) return false;
        return true;
    }

    Class2088() {
    }
}

