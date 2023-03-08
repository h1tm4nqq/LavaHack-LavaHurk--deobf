//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class1641 implements Supplier
{
    final Class1913 Field15635;
    private int Field15636;
    
    @Override
    public Object get() {
        return this.Method6376();
    }
    
    @NotNull
    @NotNull
    public final String Method6376() {
        final StringBuilder append = new StringBuilder().append('[');
        final Class44 method7121 = Class1913.Method7121(this.Field15635);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7121, "entitySpeedVal");
        return append.append(method7121.Method335()).append(']').toString();
    }
    
    Class1641(final Class1913 field15635) {
        this.Field15635 = field15635;
    }
    
    private static String Method6377(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2D11 ^ 0xFB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
