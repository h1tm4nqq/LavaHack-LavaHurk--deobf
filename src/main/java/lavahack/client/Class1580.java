//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n?\u0006\u0002\u0010\u000bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013?\u0006\u0014" }, d2 = { "Lcom/kisman/cc/settings/CharmsRewriteSetting;", "", "setting", "Lcom/kisman/cc/settings/Setting;", "typeE", "Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;", "typeS", "Lcom/kisman/cc/util/enums/CharmsRewriteTypes;", "(Lcom/kisman/cc/settings/Setting;Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;Lcom/kisman/cc/util/enums/CharmsRewriteTypes;)V", "option", "Lcom/kisman/cc/util/enums/dynamic/CharmsRewriteOptionsEnum$CharmsRewriteOptions;", "(Lcom/kisman/cc/settings/Setting;Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;Lcom/kisman/cc/util/enums/CharmsRewriteTypes;Lcom/kisman/cc/util/enums/dynamic/CharmsRewriteOptionsEnum$CharmsRewriteOptions;)V", "getOption", "()Lcom/kisman/cc/util/enums/dynamic/CharmsRewriteOptionsEnum$CharmsRewriteOptions;", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "getTypeE", "()Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;", "getTypeS", "()Lcom/kisman/cc/util/enums/CharmsRewriteTypes;", "kisman.cc" })
public final class Class1580
{
    @NotNull
    private final Class44 Field15402;
    @NotNull
    private final Class549 Field15403;
    @NotNull
    private final Class162 Field15404;
    @Nullable
    private final Class362 Field15405;
    private String Field15406 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class44 Method6219() {
        return this.Field15402;
    }
    
    @NotNull
    @NotNull
    public final Class549 Method6220() {
        return this.Field15403;
    }
    
    @NotNull
    @NotNull
    public final Class162 Method6221() {
        return this.Field15404;
    }
    
    @Nullable
    @Nullable
    public final Class362 Method6222() {
        return this.Field15405;
    }
    
    public Class1580(@NotNull @NotNull final Class44 field15402, @NotNull @NotNull final Class549 field15403, @NotNull @NotNull final Class162 field15404, @Nullable @Nullable final Class362 field15405) {
        Intrinsics.checkParameterIsNotNull((Object)field15402, "setting");
        Intrinsics.checkParameterIsNotNull((Object)field15403, "typeE");
        Intrinsics.checkParameterIsNotNull((Object)field15404, "typeS");
        this.Field15402 = field15402;
        this.Field15403 = field15403;
        this.Field15404 = field15404;
        this.Field15405 = field15405;
    }
    
    public Class1580(@NotNull @NotNull final Class44 class44, @NotNull @NotNull final Class549 class45, @NotNull @NotNull final Class162 class46) {
        Intrinsics.checkParameterIsNotNull((Object)class44, "setting");
        Intrinsics.checkParameterIsNotNull((Object)class45, "typeE");
        Intrinsics.checkParameterIsNotNull((Object)class46, "typeS");
        this(class44, class45, class46, null);
    }
    
    private static String Method6223(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x37 ^ 0x9D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
