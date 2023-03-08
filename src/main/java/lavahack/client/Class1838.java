//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$UniformVec2f;", "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;", "name", "", "value", "Lnet/minecraft/util/math/Vec2f;", "(Ljava/lang/String;Lnet/minecraft/util/math/Vec2f;)V", "getName", "()Ljava/lang/String;", "getValue", "()Lnet/minecraft/util/math/Vec2f;", "kisman.cc" })
public final class Class1838 extends Class1160
{
    @NotNull
    private final String Field16486;
    @NotNull
    private final Vec2f Field16487;
    private String Field16488 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final String Method6931() {
        return this.Field16486;
    }
    
    @NotNull
    @NotNull
    public final Vec2f Method6932() {
        return this.Field16487;
    }
    
    public Class1838(@NotNull @NotNull final String field16486, @NotNull @NotNull final Vec2f field16487) {
        Intrinsics.checkParameterIsNotNull((Object)field16486, "name");
        Intrinsics.checkParameterIsNotNull((Object)field16487, "value");
        this.Field16486 = field16486;
        this.Field16487 = field16487;
    }
    
    private static String Method6933(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5042 ^ 0x31));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
