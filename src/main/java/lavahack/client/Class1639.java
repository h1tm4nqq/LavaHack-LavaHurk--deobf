//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class1639 implements Supplier
{
    final Class1913 Field15631;
    private String Field15632 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method6372();
    }
    
    @NotNull
    @NotNull
    public final String Method6372() {
        final StringBuilder append = new StringBuilder().append('[');
        final Class44 method7119 = Class1913.Method7119(this.Field15631);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7119, "reverseStepVal");
        return append.append(method7119.Method335()).append(']').toString();
    }
    
    Class1639(final Class1913 field15631) {
        this.Field15631 = field15631;
    }
    
    private static String Method6373(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x23F9 ^ 0xB9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
