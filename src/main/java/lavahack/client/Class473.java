//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import net.minecraft.item.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "Lnet/minecraft/item/ItemStack;", "applyAsInt" })
final class Class473 implements ToIntFunction
{
    public static final Class473 Field9972;
    private String Field9973 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public int applyAsInt(final Object o) {
        return this.Method2216((ItemStack)o);
    }
    
    public final int Method2216(@NotNull @NotNull final ItemStack itemStack) {
        Intrinsics.checkParameterIsNotNull((Object)itemStack, "it");
        return itemStack.getCount();
    }
    
    static {
        Field9972 = new Class473();
    }
    
    private static String Method2217(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x10D1 ^ 0x25));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
