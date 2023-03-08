//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class806 implements Supplier
{
    public static final Class806 Field11440;
    private int Field11441;
    
    @Override
    public Object get() {
        return this.Method3402();
    }
    
    public final boolean Method3402() {
        final Class44 method7084 = Class1909.Method7084(Class1909.Field16809);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7084, "fuAll");
        return !method7084.Method365();
    }
    
    static {
        Field11440 = new Class806();
    }
    
    private static String Method3403(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4F04 ^ 0xAE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
