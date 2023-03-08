//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$UniformFloat;", "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;", "name", "", "value", "", "(Ljava/lang/String;F)V", "getName", "()Ljava/lang/String;", "getValue", "()F", "kisman.cc" })
public final class Class130 extends Class1160
{
    @NotNull
    private final String Field8445;
    private final float Field8446;
    private int Field8447;
    
    @NotNull
    @NotNull
    public final String Method864() {
        return this.Field8445;
    }
    
    public final float Method865() {
        return this.Field8446;
    }
    
    public Class130(@NotNull @NotNull final String field8445, final float field8446) {
        Intrinsics.checkParameterIsNotNull((Object)field8445, "name");
        this.Field8445 = field8445;
        this.Field8446 = field8446;
    }
    
    private static String Method866(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xBEB ^ 0x42));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
