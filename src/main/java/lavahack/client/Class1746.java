//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import net.minecraft.item.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lnet/minecraft/item/ItemStack;", "kotlin.jvm.PlatformType", "applyAsInt" })
final class Class1746 implements ToIntFunction
{
    public static final Class1746 Field16016;
    private int Field16017;
    
    @Override
    public int applyAsInt(final Object o) {
        return this.Method6667((ItemStack)o);
    }
    
    public final int Method6667(final ItemStack itemStack) {
        Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, "it");
        return itemStack.getCount();
    }
    
    static {
        Field16016 = new Class1746();
    }
    
    private static String Method6668(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3618 ^ 0xAD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
