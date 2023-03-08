//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001-Ba\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e?\u0006\u0002\u0010\u0011J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H&R\u0011\u0010\b\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e?\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u000e?\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u000e?\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001f?\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006?\u0006\b\n\u0000\u001a\u0004\b\"\u0010#j\u0002\b+j\u0002\b,?\u0006." }, d2 = { "Lcom/kisman/cc/util/enums/ShadersShaders;", "", "name_", "", "displayName", "uniforms", "", "Lcom/kisman/cc/settings/util/shaders/ShaderCharmsRewriteUniform;", "animated", "", "haveTextureUniform", "haveTexelSizeUniform", "haveResolutionUniform", "index", "", "radiusIndex", "qualityIndex", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZZIII)V", "getAnimated", "()Z", "getDisplayName", "()Ljava/lang/String;", "getHaveResolutionUniform", "getHaveTexelSizeUniform", "getHaveTextureUniform", "getIndex", "()I", "getName_", "getQualityIndex", "getRadiusIndex", "shader", "Lcom/kisman/cc/util/enums/ShadersShaders$Shader;", "getShader", "()Lcom/kisman/cc/util/enums/ShadersShaders$Shader;", "getUniforms", "()Ljava/util/List;", "setupUniforms", "", "pattern", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "framebuffer", "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "updateUniforms", "ItemGlow", "Snow", "Shader", "kisman.cc" })
public enum Class2163
{
    Field17881("ItemGlow", 0), 
    Field17882("Snow", 1);
    
    private static final Class2163[] Field17883;
    @NotNull
    private final Class1673 Field17884;
    @NotNull
    private final String Field17885;
    @NotNull
    private final String Field17886;
    @NotNull
    private final List Field17887;
    private final boolean Field17888;
    private final boolean Field17889;
    private final boolean Field17890;
    private final boolean Field17891;
    private final int Field17892;
    private final int Field17893;
    private final int Field17894;
    private String Field17895 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public abstract void Method1479(@NotNull @NotNull final Class1482 p0, @NotNull @NotNull final Class134 p1);
    
    public void Method1480(@NotNull @NotNull final Class1482 class1482, @NotNull @NotNull final Class134 class1483) {
        Intrinsics.checkParameterIsNotNull((Object)class1482, "pattern");
        Intrinsics.checkParameterIsNotNull((Object)class1483, "framebuffer");
        final Iterator<Class812> iterator = this.Field17887.iterator();
        while (iterator.hasNext()) {
            class1483.Method921(iterator.next().Method3414());
        }
    }
    
    @NotNull
    @NotNull
    public final Class1673 Method1481() {
        return this.Field17884;
    }
    
    @NotNull
    @NotNull
    public final String Method1482() {
        return this.Field17885;
    }
    
    @NotNull
    @NotNull
    public final String Method1483() {
        return this.Field17886;
    }
    
    @NotNull
    @NotNull
    public final List Method1484() {
        return this.Field17887;
    }
    
    public final boolean Method1485() {
        return this.Field17888;
    }
    
    public final boolean Method1486() {
        return this.Field17889;
    }
    
    public final boolean Method1487() {
        return this.Field17890;
    }
    
    public final boolean Method1488() {
        return this.Field17891;
    }
    
    public final int Method1489() {
        return this.Field17892;
    }
    
    public final int Method1490() {
        return this.Field17893;
    }
    
    public final int Method1491() {
        return this.Field17894;
    }
    
    private Class2163(final String name, final int ordinal, final String field17885, final String field17886, final List field17887, final boolean field17888, final boolean field17889, final boolean field17890, final boolean field17891, final int field17892, final int field17893, final int field17894) {
        this.Field17885 = field17885;
        this.Field17886 = field17886;
        this.Field17887 = field17887;
        this.Field17888 = field17888;
        this.Field17889 = field17889;
        this.Field17890 = field17890;
        this.Field17891 = field17891;
        this.Field17892 = field17892;
        this.Field17893 = field17893;
        this.Field17894 = field17894;
        this.Field17884 = new Class1673(this);
    }
    
    public Class2163(final String s, final int n, final String s2, final String s3, final List list, final boolean b, final boolean b2, final boolean b3, final boolean b4, final int n2, final int n3, final int n4, final DefaultConstructorMarker defaultConstructorMarker) {
        this(s, n, s2, s3, list, b, b2, b3, b4, n2, n3, n4);
    }
    
    private static String Method1492(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x52D2 ^ 0x36));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
