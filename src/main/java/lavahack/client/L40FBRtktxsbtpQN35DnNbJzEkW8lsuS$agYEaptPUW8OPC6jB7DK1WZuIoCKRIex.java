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
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex
implements Predicate {
    public static final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex Field17532 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex();
    private int Field17533;

    public boolean test(Object object) {
        return this.Method7629((ItemStack)object);
    }

    public final boolean Method7629(ItemStack itemStack) {
        int n;
        if (!itemStack.isEmpty()) {
            n = (int)((long)-2065219991 ^ (long)-2065219992);
            return n != 0;
        }
        n = (int)1689483292L ^ 0x64B3781C;
        return n != 0;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex() {
    }
}

