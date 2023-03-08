//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t?\u0006\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012?\u0006\u0013" }, d2 = { "Lcom/kisman/cc/settings/EntityESPSetting;", "", "setting", "Lcom/kisman/cc/settings/Setting;", "pattern", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "typeE", "Lcom/kisman/cc/util/enums/EntityESPTypes;", "typeS", "Lcom/kisman/cc/settings/util/EntityESPRendererPattern$SettingTypes;", "(Lcom/kisman/cc/settings/Setting;Lcom/kisman/cc/settings/util/RenderingRewritePattern;Lcom/kisman/cc/util/enums/EntityESPTypes;Lcom/kisman/cc/settings/util/EntityESPRendererPattern$SettingTypes;)V", "getPattern", "()Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "getTypeE", "()Lcom/kisman/cc/util/enums/EntityESPTypes;", "getTypeS", "()Lcom/kisman/cc/settings/util/EntityESPRendererPattern$SettingTypes;", "kisman.cc" })
public final class Class2145
{
    @Nullable
    private final Class44 Field17813;
    @Nullable
    private final Class1612 Field17814;
    @NotNull
    private final Class1269 Field17815;
    @NotNull
    private final Class2007 Field17816;
    private int Field17817;
    
    @Nullable
    @Nullable
    public final Class44 Method7723() {
        return this.Field17813;
    }
    
    @Nullable
    @Nullable
    public final Class1612 Method7724() {
        return this.Field17814;
    }
    
    @NotNull
    @NotNull
    public final Class1269 Method7725() {
        return this.Field17815;
    }
    
    @NotNull
    @NotNull
    public final Class2007 Method7726() {
        return this.Field17816;
    }
    
    public Class2145(@Nullable @Nullable final Class44 field17813, @Nullable @Nullable final Class1612 field17814, @NotNull @NotNull final Class1269 field17815, @NotNull @NotNull final Class2007 field17816) {
        Intrinsics.checkParameterIsNotNull((Object)field17815, "typeE");
        Intrinsics.checkParameterIsNotNull((Object)field17816, "typeS");
        this.Field17813 = field17813;
        this.Field17814 = field17814;
        this.Field17815 = field17815;
        this.Field17816 = field17816;
    }
    
    private static String Method7727(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x504D ^ 0xA3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
