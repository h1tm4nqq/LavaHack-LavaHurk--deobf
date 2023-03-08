//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.function.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000?\u0006\u0002\u0010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\r\u0010\f\u001a\u00028\u0000H\u0016?\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0016?\u0006\u0016" }, d2 = { "Lcom/kisman/cc/settings/types/SettingEnum;", "T", "", "Lcom/kisman/cc/settings/Setting;", "name", "", "module", "Lcom/kisman/cc/features/module/Module;", "t", "(Ljava/lang/String;Lcom/kisman/cc/features/module/Module;Ljava/lang/Enum;)V", "getSupplierEnum0", "Ljava/util/function/Supplier;", "getValEnum", "()Ljava/lang/Enum;", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "register", "setTitle", "title", "setVisible", "visible", "", "kisman.cc" })
public final class Class1303 extends Class44
{
    private String Field13965 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    @Override
    public Enum Method341() {
        final Enum method341 = super.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type T");
        }
        return method341;
    }
    
    @NotNull
    @NotNull
    public Class1303 Method5300(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "title");
        final Class44 method355 = super.Method355(s);
        if (method355 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingEnum<T>");
        }
        return (Class1303)method355;
    }
    
    @Override
    public Class44 Method355(final String s) {
        return this.Method5300(s);
    }
    
    @NotNull
    @NotNull
    public Class1303 Method5301(@NotNull @NotNull final Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, "visible");
        final Class44 method313 = super.Method313(supplier);
        if (method313 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingEnum<T>");
        }
        return (Class1303)method313;
    }
    
    @Override
    public Class44 Method313(final Supplier supplier) {
        return this.Method5301(supplier);
    }
    
    @NotNull
    @NotNull
    public final Supplier Method5302() {
        return new Class2013(this);
    }
    
    @NotNull
    @NotNull
    public final Class1303 Method5303() {
        final Class1303 method25 = super.Field8085.Method25(this);
        if (method25 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingEnum<T>");
        }
        return method25;
    }
    
    @NotNull
    @NotNull
    public final Class1303 Method5304(@NotNull @NotNull final Class1996 class1996) {
        Intrinsics.checkParameterIsNotNull((Object)class1996, "group");
        final Class1303 method7407 = class1996.Method7407(this);
        if (method7407 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingEnum<T>");
        }
        return method7407;
    }
    
    public Class1303(@NotNull @NotNull final String s, @NotNull @NotNull final Class42 class42, @NotNull @NotNull final Enum enum1) {
        Intrinsics.checkParameterIsNotNull((Object)s, "name");
        Intrinsics.checkParameterIsNotNull((Object)class42, "module");
        Intrinsics.checkParameterIsNotNull((Object)enum1, "t");
        super(s, class42, enum1);
    }
    
    private static String Method409(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6E28 ^ 0x3C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
