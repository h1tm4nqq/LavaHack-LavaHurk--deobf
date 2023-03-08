//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$UniformInt;", "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;", "name", "", "value", "", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getValue", "()I", "kisman.cc" })
public final class Class1257 extends Class1160
{
    @NotNull
    private final String Field13699;
    private final int Field13700;
    private String Field13701 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final String Method5079() {
        return this.Field13699;
    }
    
    public final int Method5080() {
        return this.Field13700;
    }
    
    public Class1257(@NotNull @NotNull final String field13699, final int field13700) {
        Intrinsics.checkParameterIsNotNull((Object)field13699, "name");
        this.Field13699 = field13699;
        this.Field13700 = field13700;
    }
    
    private static String Method5081(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4B69 ^ 0xCF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
