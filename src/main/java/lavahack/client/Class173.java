//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0006\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class173 implements Supplier
{
    final Class1488 Field8778;
    private int Field8779;
    
    @Override
    public Object get() {
        return this.Method1092();
    }
    
    public final double Method1092() {
        final Class44 method5966 = Class1488.Method5966(this.Field8778);
        Intrinsics.checkExpressionValueIsNotNull((Object)method5966, "range");
        return method5966.Method367();
    }
    
    Class173(final Class1488 field8778) {
        this.Field8778 = field8778;
    }
    
    private static String Method1093(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x355C ^ 0xD8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
