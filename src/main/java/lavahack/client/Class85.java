//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "processPattern", "", "pattern", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "invoke" })
final class Class85 extends Lambda implements Function1
{
    public static final Class85 Field8286;
    private int Field8287;
    
    public Object invoke(final Object o) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class1612)o);
    }
    
    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull final Class1612 class1612) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, "pattern");
        return class1612.Method3790() && !class1612.Method3791();
    }
    
    Class85() {
        super(1);
    }
    
    static {
        Field8286 = new Class85();
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6126 ^ 0x3A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
