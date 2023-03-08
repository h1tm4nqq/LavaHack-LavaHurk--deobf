//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005?\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\n" }, d2 = { "Lcom/kisman/cc/features/catlua/lua/utils/LuaNet;", "", "()V", "getPasteBinAPI", "Lcom/kisman/cc/util/net/URLReader;", "url", "", "ping", "", "Companion", "kisman.cc" })
public final class Class978
{
    @NotNull
    private static Class978 Field12182;
    public static final Class147 Field12183;
    private int Field12184;
    
    @NotNull
    @NotNull
    public final Class1890 Method3979(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "url");
        return new Class1890(s);
    }
    
    public final boolean Method3980(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "url");
        return Class2067.Method7582(s);
    }
    
    static {
        Field12183 = new Class147((DefaultConstructorMarker)null);
        Class978.Field12182 = new Class978();
    }
    
    public static final Class978 Method3981() {
        return Class978.Field12182;
    }
    
    public static final void Method3982(final Class978 field12182) {
        Class978.Field12182 = field12182;
    }
    
    private static String Method3983(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6FDC ^ 0xA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
