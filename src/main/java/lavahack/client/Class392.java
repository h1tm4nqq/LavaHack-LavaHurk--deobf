//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/hud/modules/BindList$Element;", "", "text", "", "state", "", "(Ljava/lang/String;Z)V", "getState", "()Z", "getText", "()Ljava/lang/String;", "kisman.cc" })
public final class Class392
{
    @NotNull
    private final String Field9649;
    private final boolean Field9650;
    private int Field9651;
    
    @NotNull
    @NotNull
    public final String Method1910() {
        return this.Field9649;
    }
    
    public final boolean Method1911() {
        return this.Field9650;
    }
    
    public Class392(@NotNull @NotNull final String field9649, final boolean field9650) {
        Intrinsics.checkParameterIsNotNull((Object)field9649, "text");
        this.Field9649 = field9649;
        this.Field9650 = field9650;
    }
    
    private static String Method1912(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2121 ^ 0xFF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
