//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\n" }, d2 = { "Lcom/kisman/cc/util/enums/ShadersShaders$Shader;", "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "instance", "Lcom/kisman/cc/util/enums/ShadersShaders;", "(Lcom/kisman/cc/util/enums/ShadersShaders;)V", "pattern", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "setupUniforms", "", "updateUniforms", "kisman.cc" })
public final class Class1673 extends Class134
{
    private Class1482 Field15804;
    private final Class2163 Field15805;
    private String Field15806 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1673 Method6462(@NotNull @NotNull final Class1482 field15804) {
        Intrinsics.checkParameterIsNotNull((Object)field15804, "pattern");
        this.Field15804 = field15804;
        return this;
    }
    
    public void Method917() {
        final Class2163 field15805 = this.Field15805;
        final Class1482 field15806 = this.Field15804;
        if (field15806 == null) {
            Intrinsics.throwNpe();
        }
        field15805.Method1480(field15806, this);
    }
    
    public void Method918() {
        final Class2163 field15805 = this.Field15805;
        final Class1482 field15806 = this.Field15804;
        if (field15806 == null) {
            Intrinsics.throwNpe();
        }
        field15805.Method1479(field15806, this);
    }
    
    public Class1673(@NotNull @NotNull final Class2163 field15805) {
        Intrinsics.checkParameterIsNotNull((Object)field15805, "instance");
        super(field15805.Method1482());
        this.Field15805 = field15805;
    }
    
    private static String Method922(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x654 ^ 0x6D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
