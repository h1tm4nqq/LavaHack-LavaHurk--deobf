//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b?\u0006\u0002\u0010\tB\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b?\u0006\u0002\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0007\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005?\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/settings/util/shaders/ShaderCharmsRewriteUniform;", "T", "Lcom/kisman/cc/util/render/shader/uniform/type/Type;", "Lcom/kisman/cc/util/render/shader/uniform/Uniform;", "settingName", "", "uniform", "index", "", "(Ljava/lang/String;Lcom/kisman/cc/util/render/shader/uniform/Uniform;I)V", "name", "(Ljava/lang/String;Ljava/lang/String;I)V", "getIndex", "()I", "getSettingName", "()Ljava/lang/String;", "radius", "", "kisman.cc" })
public final class Class812 extends Class1439
{
    @Nullable
    private final String Field11473;
    private final int Field11474;
    private int Field11475;
    
    public final boolean Method3416() {
        return Intrinsics.areEqual((Object)this.Method3414(), (Object)"radius");
    }
    
    @Nullable
    @Nullable
    public final String Method3417() {
        return this.Field11473;
    }
    
    public final int Method3418() {
        return this.Field11474;
    }
    
    public Class812(@Nullable @Nullable final String field11473, @NotNull @NotNull final String s, final int field11474) {
        Intrinsics.checkParameterIsNotNull((Object)s, "name");
        super(s);
        this.Field11473 = field11473;
        this.Field11474 = field11474;
    }
    
    public Class812(@Nullable @Nullable final String s, @NotNull @NotNull final Class1439 class1439, final int n) {
        Intrinsics.checkParameterIsNotNull((Object)class1439, "uniform");
        this(s, class1439.Method3414(), n);
        this.Method3412(class1439.Method3413());
    }
    
    private static String Method3415(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5BD0 ^ 0x88));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
