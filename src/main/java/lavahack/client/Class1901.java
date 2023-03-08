//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/capes/Cape;", "", "cape", "Lcom/kisman/cc/features/capes/Capes;", "uuid", "", "(Lcom/kisman/cc/features/capes/Capes;Ljava/lang/String;)V", "getCape", "()Lcom/kisman/cc/features/capes/Capes;", "getUuid", "()Ljava/lang/String;", "kisman.cc" })
public final class Class1901
{
    @NotNull
    private final Class1670 Field16751;
    @NotNull
    private final String Field16752;
    private String Field16753 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1670 Method7044() {
        return this.Field16751;
    }
    
    @NotNull
    @NotNull
    public final String Method7045() {
        return this.Field16752;
    }
    
    public Class1901(@NotNull @NotNull final Class1670 field16751, @NotNull @NotNull final String field16752) {
        Intrinsics.checkParameterIsNotNull((Object)field16751, "cape");
        Intrinsics.checkParameterIsNotNull((Object)field16752, "uuid");
        this.Field16751 = field16751;
        this.Field16752 = field16752;
    }
    
    private static String Method7046(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1AE3 ^ 0xCC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
