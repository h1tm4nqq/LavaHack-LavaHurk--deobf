//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006?\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\b\u0010\u001e\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000e?\u0006\u001f" }, d2 = { "Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Clazz;", "", "obf", "", "deobf", "fields", "", "Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Field;", "methods", "Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Method;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getDeobf", "()Ljava/lang/String;", "setDeobf", "(Ljava/lang/String;)V", "getFields", "()Ljava/util/List;", "getMethods", "getObf", "setObf", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "kisman.cc" })
public final class Class1364
{
    @NotNull
    private String Field14204;
    @NotNull
    private String Field14205;
    @NotNull
    private final List Field14206;
    @NotNull
    private final List Field14207;
    private int Field14208;
    
    @NotNull
    @NotNull
    @Override
    public String toString() {
        return this.Field14204 + ' ' + this.Field14205;
    }
    
    @NotNull
    @NotNull
    public final String Method5444() {
        return this.Field14204;
    }
    
    public final void Method5445(@NotNull @NotNull final String field14204) {
        Intrinsics.checkParameterIsNotNull((Object)field14204, "<set-?>");
        this.Field14204 = field14204;
    }
    
    @NotNull
    @NotNull
    public final String Method5446() {
        return this.Field14205;
    }
    
    public final void Method5447(@NotNull @NotNull final String field14205) {
        Intrinsics.checkParameterIsNotNull((Object)field14205, "<set-?>");
        this.Field14205 = field14205;
    }
    
    @NotNull
    @NotNull
    public final List Method5448() {
        return this.Field14206;
    }
    
    @NotNull
    @NotNull
    public final List Method5449() {
        return this.Field14207;
    }
    
    public Class1364(@NotNull @NotNull final String field14204, @NotNull @NotNull final String field14205, @NotNull @NotNull final List field14206, @NotNull @NotNull final List field14207) {
        Intrinsics.checkParameterIsNotNull((Object)field14204, "obf");
        Intrinsics.checkParameterIsNotNull((Object)field14205, "deobf");
        Intrinsics.checkParameterIsNotNull((Object)field14206, "fields");
        Intrinsics.checkParameterIsNotNull((Object)field14207, "methods");
        this.Field14204 = field14204;
        this.Field14205 = field14205;
        this.Field14206 = field14206;
        this.Field14207 = field14207;
    }
    
    public Class1364(final String s, final String s2, List list, List list2, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x4) != 0x0) {
            list = new ArrayList();
        }
        if ((n & 0x8) != 0x0) {
            list2 = new ArrayList();
        }
        this(s, s2, list, list2);
    }
    
    @NotNull
    @NotNull
    public final String Method5450() {
        return this.Field14204;
    }
    
    @NotNull
    @NotNull
    public final String Method5451() {
        return this.Field14205;
    }
    
    @NotNull
    @NotNull
    public final List Method5452() {
        return this.Field14206;
    }
    
    @NotNull
    @NotNull
    public final List Method5453() {
        return this.Field14207;
    }
    
    @NotNull
    @NotNull
    public final Class1364 Method5454(@NotNull @NotNull final String s, @NotNull @NotNull final String s2, @NotNull @NotNull final List list, @NotNull @NotNull final List list2) {
        Intrinsics.checkParameterIsNotNull((Object)s, "obf");
        Intrinsics.checkParameterIsNotNull((Object)s2, "deobf");
        Intrinsics.checkParameterIsNotNull((Object)list, "fields");
        Intrinsics.checkParameterIsNotNull((Object)list2, "methods");
        return new Class1364(s, s2, list, list2);
    }
    
    @NotNull
    @NotNull
    public static Class1364 Method5455(final Class1364 class1364, String field14204, String field14205, List field14206, List field14207, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            field14204 = class1364.Field14204;
        }
        if ((n & 0x2) != 0x0) {
            field14205 = class1364.Field14205;
        }
        if ((n & 0x4) != 0x0) {
            field14206 = class1364.Field14206;
        }
        if ((n & 0x8) != 0x0) {
            field14207 = class1364.Field14207;
        }
        return class1364.Method5454(field14204, field14205, field14206, field14207);
    }
    
    @Override
    public int hashCode() {
        final String field14204 = this.Field14204;
        final int n = ((field14204 != null) ? field14204.hashCode() : 0) * 31;
        final String field14205 = this.Field14205;
        final int n2 = (n + ((field14205 != null) ? field14205.hashCode() : 0)) * 31;
        final List field14206 = this.Field14206;
        final int n3 = (n2 + ((field14206 != null) ? field14206.hashCode() : 0)) * 31;
        final List field14207 = this.Field14207;
        return n3 + ((field14207 != null) ? field14207.hashCode() : 0);
    }
    
    @Override
    public boolean equals(@Nullable @Nullable final Object o) {
        if (this != o) {
            if (o instanceof Class1364) {
                final Class1364 class1364 = (Class1364)o;
                if (Intrinsics.areEqual((Object)this.Field14204, (Object)class1364.Field14204) && Intrinsics.areEqual((Object)this.Field14205, (Object)class1364.Field14205) && Intrinsics.areEqual((Object)this.Field14206, (Object)class1364.Field14206) && Intrinsics.areEqual((Object)this.Field14207, (Object)class1364.Field14207)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    private static String Method5456(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7925 ^ 0x36));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
