//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class938 implements Supplier
{
    final Class1444 Field12006;
    private String Field12007 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method3880();
    }
    
    public final boolean Method3880() {
        final Class44 method5757 = this.Field12006.Method5757();
        Intrinsics.checkExpressionValueIsNotNull((Object)method5757, "mode");
        if (method5757.Method341().equals(Class55.Field8171)) {
            final Boolean value = this.Field12006.Method5765().get();
            Intrinsics.checkExpressionValueIsNotNull((Object)value, "visible.get()");
            if (value) {
                return true;
            }
        }
        return false;
    }
    
    Class938(final Class1444 field12006) {
        this.Field12006 = field12006;
    }
    
    private static String Method3881(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6DD5 ^ 0x8A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
