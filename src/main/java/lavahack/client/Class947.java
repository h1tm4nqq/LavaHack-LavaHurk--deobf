//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class947 implements Supplier
{
    public static final Class947 Field12042;
    private int Field12043;
    
    @Override
    public Object get() {
        return this.Method3911();
    }
    
    public final boolean Method3911() {
        final Class44 method7084 = Class1909.Method7084(Class1909.Field16809);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7084, "fuAll");
        return !method7084.Method365();
    }
    
    static {
        Field12042 = new Class947();
    }
    
    private static String Method3912(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x16A1 ^ 0x4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
