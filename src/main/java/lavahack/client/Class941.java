//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import java.util.*;
import kotlin.*;
import java.util.function.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t?\u0006\u0002\u0010\nJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0016?\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0016J\u000b\u0010\u001a\u001a\u00028\u0000?\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0004H\u0016J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0019\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00028\u0000?\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0004H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010&\u001a\u00020\u0002H\u0016J\u0016\u0010%\u001a\u00020\u00022\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u0019H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00028\u0000X\u0082\u000e?\u0006\u0004\n\u0002\u0010\u000b?\u0006(" }, d2 = { "Lcom/kisman/cc/settings/types/SettingArray;", "T", "Lcom/kisman/cc/settings/Setting;", "name", "", "module", "Lcom/kisman/cc/features/module/Module;", "value", "list", "", "(Ljava/lang/String;Lcom/kisman/cc/features/module/Module;Ljava/lang/Object;Ljava/util/List;)V", "Ljava/lang/Object;", "checkValString", "", "str", "getOptions", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getStringFromIndex", "index", "", "getStringValues", "", "()[Ljava/lang/String;", "getSupplierString", "Ljava/util/function/Supplier;", "getValElement", "()Ljava/lang/Object;", "getValString", "register", "setTitle", "title", "setValElement", "t", "(Ljava/lang/Object;)Lcom/kisman/cc/settings/types/SettingArray;", "setValString", "in", "setVisible", "setting", "suppliner", "kisman.cc" })
public final class Class941 extends Class44
{
    private Object Field12015;
    private final List Field12016;
    private String Field12017 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final Object Method3886() {
        return this.Field12015;
    }
    
    @NotNull
    @NotNull
    public final Class941 Method3887(final Object field12015) {
        this.Field12015 = field12015;
        return this;
    }
    
    @NotNull
    @NotNull
    public String Method359() {
        return String.valueOf(this.Field12015);
    }
    
    @NotNull
    @NotNull
    public Class44 Method360(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "in");
        for (final Object next : this.Field12016) {
            if (Intrinsics.areEqual((Object)s, (Object)String.valueOf(next))) {
                this.Field12015 = next;
                break;
            }
        }
        return this;
    }
    
    public boolean Method309(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "str");
        return StringsKt.equals(String.valueOf(this.Field12015), s, true);
    }
    
    @NotNull
    @NotNull
    public String[] Method315() {
        final Object[] array = this.Method361().toArray(new String[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        return (String[])array;
    }
    
    @NotNull
    @NotNull
    public ArrayList Method361() {
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator<Object> iterator = this.Field12016.iterator();
        while (iterator.hasNext()) {
            list.add(String.valueOf(iterator.next()));
        }
        return list;
    }
    
    @NotNull
    @NotNull
    public String Method317(final int n) {
        return this.Method315()[n];
    }
    
    @NotNull
    @NotNull
    public Supplier Method391() {
        return (Supplier)new Class728(this);
    }
    
    @NotNull
    @NotNull
    public Class941 Method3888(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "title");
        final Class44 method355 = super.Method355(s);
        if (method355 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingArray<T>");
        }
        return (Class941)method355;
    }
    
    public Class44 Method355(final String s) {
        return this.Method3888(s);
    }
    
    @NotNull
    @NotNull
    public Class941 Method3889(@NotNull @NotNull final Class44 class44) {
        Intrinsics.checkParameterIsNotNull((Object)class44, "setting");
        final Class44 method312 = super.Method312(class44);
        if (method312 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingArray<T>");
        }
        return (Class941)method312;
    }
    
    public Class44 Method312(final Class44 class44) {
        return this.Method3889(class44);
    }
    
    @NotNull
    @NotNull
    public Class44 Method313(@NotNull @NotNull final Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, "suppliner");
        final Class44 method313 = super.Method313(supplier);
        if (method313 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingArray<T>");
        }
        return method313;
    }
    
    @NotNull
    @NotNull
    public final Class941 Method3890() {
        this.Method358().Method26((Class941)this);
        return this;
    }
    
    public Class941(@NotNull @NotNull final String s, @NotNull @NotNull final Class42 class42, final Object field12015, @NotNull @NotNull final List field12016) {
        Intrinsics.checkParameterIsNotNull((Object)s, "name");
        Intrinsics.checkParameterIsNotNull((Object)class42, "module");
        Intrinsics.checkParameterIsNotNull((Object)field12016, "list");
        super(s, class42);
        this.Field12015 = field12015;
        this.Field12016 = field12016;
        this.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk = "Combo";
        this.Method304((List)this.Method361());
    }
    
    private static String Method409(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2CE4 ^ 0x12));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
