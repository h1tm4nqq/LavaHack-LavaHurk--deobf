//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003?\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n?\u0006\u0018" }, d2 = { "Lcom/kisman/cc/features/catlua/mapping/MappingsGenerator$ClassMapping;", "", "deobf", "", "clientObf", "serverObf", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientObf", "()Ljava/lang/String;", "setClientObf", "(Ljava/lang/String;)V", "getDeobf", "getServerObf", "setServerObf", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kisman.cc" })
final class Class1560
{
    @NotNull
    private final String Field15275;
    @Nullable
    private String Field15276;
    @Nullable
    private String Field15277;
    private String Field15278 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    @Override
    public String toString() {
        return this.Field15275 + " (client: " + this.Field15276 + ") (server: " + this.Field15277 + ')';
    }
    
    @NotNull
    @NotNull
    public final String Method6143() {
        return this.Field15275;
    }
    
    @Nullable
    @Nullable
    public final String Method6144() {
        return this.Field15276;
    }
    
    public final void Method6145(@Nullable @Nullable final String field15276) {
        this.Field15276 = field15276;
    }
    
    @Nullable
    @Nullable
    public final String Method6146() {
        return this.Field15277;
    }
    
    public final void Method6147(@Nullable @Nullable final String field15277) {
        this.Field15277 = field15277;
    }
    
    public Class1560(@NotNull @NotNull final String field15275, @Nullable @Nullable final String field15276, @Nullable @Nullable final String field15277) {
        Intrinsics.checkParameterIsNotNull((Object)field15275, "deobf");
        this.Field15275 = field15275;
        this.Field15276 = field15276;
        this.Field15277 = field15277;
    }
    
    public Class1560(final String s, String s2, String s3, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            s2 = null;
        }
        if ((n & 0x4) != 0x0) {
            s3 = null;
        }
        this(s, s2, s3);
    }
    
    @NotNull
    @NotNull
    public final String Method6148() {
        return this.Field15275;
    }
    
    @Nullable
    @Nullable
    public final String Method6149() {
        return this.Field15276;
    }
    
    @Nullable
    @Nullable
    public final String Method6150() {
        return this.Field15277;
    }
    
    @NotNull
    @NotNull
    public final Class1560 Method6151(@NotNull @NotNull final String s, @Nullable @Nullable final String s2, @Nullable @Nullable final String s3) {
        Intrinsics.checkParameterIsNotNull((Object)s, "deobf");
        return new Class1560(s, s2, s3);
    }
    
    @NotNull
    @NotNull
    public static Class1560 Method6152(final Class1560 class1560, String field15275, String field15276, String field15277, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            field15275 = class1560.Field15275;
        }
        if ((n & 0x2) != 0x0) {
            field15276 = class1560.Field15276;
        }
        if ((n & 0x4) != 0x0) {
            field15277 = class1560.Field15277;
        }
        return class1560.Method6151(field15275, field15276, field15277);
    }
    
    @Override
    public int hashCode() {
        final String field15275 = this.Field15275;
        final int n = ((field15275 != null) ? field15275.hashCode() : 0) * 31;
        final String field15276 = this.Field15276;
        final int n2 = (n + ((field15276 != null) ? field15276.hashCode() : 0)) * 31;
        final String field15277 = this.Field15277;
        return n2 + ((field15277 != null) ? field15277.hashCode() : 0);
    }
    
    @Override
    public boolean equals(@Nullable @Nullable final Object o) {
        if (this != o) {
            if (o instanceof Class1560) {
                final Class1560 class1560 = (Class1560)o;
                if (Intrinsics.areEqual((Object)this.Field15275, (Object)class1560.Field15275) && Intrinsics.areEqual((Object)this.Field15276, (Object)class1560.Field15276) && Intrinsics.areEqual((Object)this.Field15277, (Object)class1560.Field15277)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    private static String Method6153(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3F ^ 0x9E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
