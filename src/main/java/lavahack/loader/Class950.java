//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.loader.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001?\u0006\u0002\u0010\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002?\u0006\b" }, d2 = { "getVersions", "", "", "()[Ljava/lang/String;", "onLogin", "", "key", "version", "kisman.cc" })
public final class Class950
{
    private int Field12050;
    
    public static final void Method3914(@NotNull @NotNull final String s, @NotNull @NotNull final String s2) {
        Intrinsics.checkParameterIsNotNull((Object)s, "key");
        Intrinsics.checkParameterIsNotNull((Object)s2, "version");
        if (s.length() > 0) {}
    }
    
    @NotNull
    @NotNull
    public static final String[] Method3915() {
        return Class1204.Method4839();
    }
    
    private static String Method3916(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x13BE ^ 0xA7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
