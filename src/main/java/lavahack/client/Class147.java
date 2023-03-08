//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b?\u0006\n" }, d2 = { "Lcom/kisman/cc/features/catlua/lua/utils/LuaNet$Companion;", "", "()V", "instance", "Lcom/kisman/cc/features/catlua/lua/utils/LuaNet;", "getInstance", "()Lcom/kisman/cc/features/catlua/lua/utils/LuaNet;", "setInstance", "(Lcom/kisman/cc/features/catlua/lua/utils/LuaNet;)V", "getDefault", "kisman.cc" })
public final class Class147
{
    private int Field8574;
    
    @NotNull
    @NotNull
    public final Class978 Method983() {
        return Class978.Method3981();
    }
    
    public final void Method984(@NotNull @NotNull final Class978 class978) {
        Intrinsics.checkParameterIsNotNull((Object)class978, "<set-?>");
        Class978.Method3982(class978);
    }
    
    @NotNull
    @NotNull
    public final Class978 Method985() {
        if (this.Method983() == null) {
            this.Method984(new Class978());
        }
        return this.Method983();
    }
    
    private Class147() {
    }
    
    public Class147(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method986(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xCD4 ^ 0x8F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
