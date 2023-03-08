//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lnet/minecraft/item/ItemStack;", "kotlin.jvm.PlatformType", "test" })
final class Class1793 implements Predicate
{
    public static final Class1793 Field16224;
    private String Field16225 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public boolean test(final Object o) {
        return this.Method6777((ItemStack)o);
    }
    
    public final boolean Method6777(final ItemStack itemStack) {
        return Intrinsics.areEqual((Object)itemStack.item, (Object)Items.CHORUS_FRUIT);
    }
    
    static {
        Field16224 = new Class1793();
    }
}
