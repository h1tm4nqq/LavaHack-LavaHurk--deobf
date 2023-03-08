//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003?\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b?\u0006\u001b" }, d2 = { "Lcom/kisman/cc/features/catlua/mapping/MappingsGenerator$FieldMapping;", "", "deobfField", "", "deobfClass", "clientObfTotal", "serverObfTotal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientObfTotal", "()Ljava/lang/String;", "setClientObfTotal", "(Ljava/lang/String;)V", "getDeobfClass", "getDeobfField", "getServerObfTotal", "setServerObfTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "kisman.cc" })
final class Class1797
{
    @NotNull
    private final String Field16289;
    @NotNull
    private final String Field16290;
    @Nullable
    private String Field16291;
    @Nullable
    private String Field16292;
    private int Field16293;
    
    @NotNull
    @NotNull
    @Override
    public String toString() {
        return this.Field16290 + '.' + this.Field16289 + " (client: " + this.Field16291 + ") (server: " + this.Field16292 + ')';
    }
    
    @NotNull
    @NotNull
    public final String Method6796() {
        return this.Field16289;
    }
    
    @NotNull
    @NotNull
    public final String Method6797() {
        return this.Field16290;
    }
    
    @Nullable
    @Nullable
    public final String Method6798() {
        return this.Field16291;
    }
    
    public final void Method6799(@Nullable @Nullable final String field16291) {
        this.Field16291 = field16291;
    }
    
    @Nullable
    @Nullable
    public final String Method6800() {
        return this.Field16292;
    }
    
    public final void Method6801(@Nullable @Nullable final String field16292) {
        this.Field16292 = field16292;
    }
    
    public Class1797(@NotNull @NotNull final String field16289, @NotNull @NotNull final String field16290, @Nullable @Nullable final String field16291, @Nullable @Nullable final String field16292) {
        Intrinsics.checkParameterIsNotNull((Object)field16289, "deobfField");
        Intrinsics.checkParameterIsNotNull((Object)field16290, "deobfClass");
        this.Field16289 = field16289;
        this.Field16290 = field16290;
        this.Field16291 = field16291;
        this.Field16292 = field16292;
    }
    
    public Class1797(final String s, final String s2, String s3, String s4, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x4) != 0x0) {
            s3 = null;
        }
        if ((n & 0x8) != 0x0) {
            s4 = null;
        }
        this(s, s2, s3, s4);
    }
    
    @NotNull
    @NotNull
    public final String Method6802() {
        return this.Field16289;
    }
    
    @NotNull
    @NotNull
    public final String Method6803() {
        return this.Field16290;
    }
    
    @Nullable
    @Nullable
    public final String Method6804() {
        return this.Field16291;
    }
    
    @Nullable
    @Nullable
    public final String Method6805() {
        return this.Field16292;
    }
    
    @NotNull
    @NotNull
    public final Class1797 Method6806(@NotNull @NotNull final String s, @NotNull @NotNull final String s2, @Nullable @Nullable final String s3, @Nullable @Nullable final String s4) {
        Intrinsics.checkParameterIsNotNull((Object)s, "deobfField");
        Intrinsics.checkParameterIsNotNull((Object)s2, "deobfClass");
        return new Class1797(s, s2, s3, s4);
    }
    
    @NotNull
    @NotNull
    public static Class1797 Method6807(final Class1797 class1797, String field16289, String field16290, String field16291, String field16292, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            field16289 = class1797.Field16289;
        }
        if ((n & 0x2) != 0x0) {
            field16290 = class1797.Field16290;
        }
        if ((n & 0x4) != 0x0) {
            field16291 = class1797.Field16291;
        }
        if ((n & 0x8) != 0x0) {
            field16292 = class1797.Field16292;
        }
        return class1797.Method6806(field16289, field16290, field16291, field16292);
    }
    
    @Override
    public int hashCode() {
        final String field16289 = this.Field16289;
        final int n = ((field16289 != null) ? field16289.hashCode() : 0) * 31;
        final String field16290 = this.Field16290;
        final int n2 = (n + ((field16290 != null) ? field16290.hashCode() : 0)) * 31;
        final String field16291 = this.Field16291;
        final int n3 = (n2 + ((field16291 != null) ? field16291.hashCode() : 0)) * 31;
        final String field16292 = this.Field16292;
        return n3 + ((field16292 != null) ? field16292.hashCode() : 0);
    }
    
    @Override
    public boolean equals(@Nullable @Nullable final Object o) {
        if (this != o) {
            if (o instanceof Class1797) {
                final Class1797 class1797 = (Class1797)o;
                if (Intrinsics.areEqual((Object)this.Field16289, (Object)class1797.Field16289) && Intrinsics.areEqual((Object)this.Field16290, (Object)class1797.Field16290) && Intrinsics.areEqual((Object)this.Field16291, (Object)class1797.Field16291) && Intrinsics.areEqual((Object)this.Field16292, (Object)class1797.Field16292)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    private static String Method6808(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6BBB ^ 0x86));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
