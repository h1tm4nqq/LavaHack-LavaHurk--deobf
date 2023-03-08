//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/features/module/render/Trails$TracePos;", "test" })
final class Class563 implements Predicate
{
    public static final Class563 Field10398;
    private int Field10399;
    
    @Override
    public boolean test(final Object o) {
        return this.Method2480((Class773)o);
    }
    
    public final boolean Method2480(@NotNull @NotNull final Class773 class773) {
        Intrinsics.checkParameterIsNotNull((Object)class773, "it");
        return class773.Method3221();
    }
    
    static {
        Field10398 = new Class563();
    }
    
    private static String Method2481(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x65A4 ^ 0x6E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
