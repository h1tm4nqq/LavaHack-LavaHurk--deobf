//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.function.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class867 implements Supplier
{
    final Class1056 Field11651;
    private String Field11652 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method3659();
    }
    
    @NotNull
    @NotNull
    public final String Method3659() {
        final StringBuilder append = new StringBuilder().append('[');
        final Function method2190 = Class467.Field9943.Method2190();
        final Class44 method2191 = Class1056.Method4308(this.Field11651);
        Intrinsics.checkExpressionValueIsNotNull((Object)method2191, "delay");
        return append.append(method2190.apply(method2191.Method335())).toString();
    }
    
    Class867(final Class1056 field11651) {
        this.Field11651 = field11651;
    }
    
    private static String Method3660(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xD00 ^ 0x2E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
