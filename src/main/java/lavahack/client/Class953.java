//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0016" }, d2 = { "Lcom/kisman/cc/features/module/render/blockesp/BlockImplementation;", "Lcom/kisman/cc/util/interfaces/IBlockImplementation;", "block", "Lcom/kisman/cc/util/enums/BlockESPBlocks;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/util/enums/BlockESPBlocks;Lcom/kisman/cc/features/module/Module;)V", "getBlock", "()Lcom/kisman/cc/util/enums/BlockESPBlocks;", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "getModule", "()Lcom/kisman/cc/features/module/Module;", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "process", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "valid", "", "kisman.cc" })
public final class Class953 implements Class817
{
    private final Class1996 Field12057;
    private final Class1612 Field12058;
    @NotNull
    private final Class1456 Field12059;
    @NotNull
    private final Class42 Field12060;
    private String Field12061 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public boolean Method3473(@NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        return this.Field12058.Method3790() && this.Field12059.Method5813().Method5352((Object)blockPos);
    }
    
    public void Method3474(@NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        if (this.Method3473(blockPos)) {
            this.Field12058.Method3805(blockPos);
        }
    }
    
    @NotNull
    @NotNull
    public final Class1456 Method3919() {
        return this.Field12059;
    }
    
    @NotNull
    @NotNull
    public final Class42 Method3920() {
        return this.Field12060;
    }
    
    public Class953(@NotNull @NotNull final Class1456 field12059, @NotNull @NotNull final Class42 field12060) {
        Intrinsics.checkParameterIsNotNull((Object)field12059, "block");
        Intrinsics.checkParameterIsNotNull((Object)field12060, "module");
        this.Field12059 = field12059;
        this.Field12060 = field12060;
        this.Field12057 = this.Field12060.Method24(new Class1996(new Class44(this.Field12059.toString(), this.Field12060)));
        final Class1612 class1612 = (Class1612)new Class1612(this.Field12060).Method773(this.Field12059.name());
        final Class1996 field12061 = this.Field12057;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12061, "group");
        this.Field12058 = ((Class1612)class1612.Method772(field12061)).Method3788().Method3789();
    }
    
    private static String Method3921(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x76FA ^ 0x5D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
