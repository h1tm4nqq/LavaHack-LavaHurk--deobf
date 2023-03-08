//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\n" }, d2 = { "Lcom/kisman/cc/settings/util/shaders/ShaderCharmsRewriteFramebufferShader;", "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "pattern", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "fragmentShader", "", "(Lcom/kisman/cc/settings/util/ShadersRendererPattern;Ljava/lang/String;)V", "setupUniforms", "", "updateUniforms", "kisman.cc" })
public abstract class Class1649 extends Class134
{
    private final Class1482 Field15667;
    private String Field15668 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method917() {
    }
    
    public void Method918() {
    }
    
    public Class1649(@NotNull @NotNull final Class1482 field15667, @NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)field15667, "pattern");
        Intrinsics.checkParameterIsNotNull((Object)s, "fragmentShader");
        super(s);
        this.Field15667 = field15667;
    }
    
    private static String Method922(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7996 ^ 0x6B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
