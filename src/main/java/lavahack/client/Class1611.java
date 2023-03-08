//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import net.minecraft.item.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.init.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "Lnet/minecraft/item/ItemStack;", "test" })
final class Class1611 implements Predicate
{
    public static final Class1611 Field15517;
    private String Field15518 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public boolean test(final Object o) {
        return this.Method6278((ItemStack)o);
    }
    
    public final boolean Method6278(@NotNull @NotNull final ItemStack itemStack) {
        Intrinsics.checkParameterIsNotNull((Object)itemStack, "it");
        return itemStack.getItem() == Items.GOLDEN_APPLE;
    }
    
    static {
        Field15517 = new Class1611();
    }
    
    private static String Method6279(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x60BA ^ 0xBF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
