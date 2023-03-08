//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003?\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t?\u0006\u0015" }, d2 = { "Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Field;", "", "obf", "", "deobf", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeobf", "()Ljava/lang/String;", "setDeobf", "(Ljava/lang/String;)V", "getObf", "setObf", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kisman.cc" })
public final class Class1709
{
    @NotNull
    private String Field15898;
    @NotNull
    private String Field15899;
    private String Field15900 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    @Override
    public String toString() {
        return this.Field15898 + ' ' + this.Field15899;
    }
    
    @NotNull
    @NotNull
    public final String Method6541() {
        return this.Field15898;
    }
    
    public final void Method6542(@NotNull @NotNull final String field15898) {
        Intrinsics.checkParameterIsNotNull((Object)field15898, "<set-?>");
        this.Field15898 = field15898;
    }
    
    @NotNull
    @NotNull
    public final String Method6543() {
        return this.Field15899;
    }
    
    public final void Method6544(@NotNull @NotNull final String field15899) {
        Intrinsics.checkParameterIsNotNull((Object)field15899, "<set-?>");
        this.Field15899 = field15899;
    }
    
    public Class1709(@NotNull @NotNull final String field15898, @NotNull @NotNull final String field15899) {
        Intrinsics.checkParameterIsNotNull((Object)field15898, "obf");
        Intrinsics.checkParameterIsNotNull((Object)field15899, "deobf");
        this.Field15898 = field15898;
        this.Field15899 = field15899;
    }
    
    @NotNull
    @NotNull
    public final String Method6545() {
        return this.Field15898;
    }
    
    @NotNull
    @NotNull
    public final String Method6546() {
        return this.Field15899;
    }
    
    @NotNull
    @NotNull
    public final Class1709 Method6547(@NotNull @NotNull final String s, @NotNull @NotNull final String s2) {
        Intrinsics.checkParameterIsNotNull((Object)s, "obf");
        Intrinsics.checkParameterIsNotNull((Object)s2, "deobf");
        return new Class1709(s, s2);
    }
    
    @NotNull
    @NotNull
    public static Class1709 Method6548(final Class1709 class1709, String field15898, String field15899, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            field15898 = class1709.Field15898;
        }
        if ((n & 0x2) != 0x0) {
            field15899 = class1709.Field15899;
        }
        return class1709.Method6547(field15898, field15899);
    }
    
    @Override
    public int hashCode() {
        final String field15898 = this.Field15898;
        final int n = ((field15898 != null) ? field15898.hashCode() : 0) * 31;
        final String field15899 = this.Field15899;
        return n + ((field15899 != null) ? field15899.hashCode() : 0);
    }
    
    @Override
    public boolean equals(@Nullable @Nullable final Object o) {
        if (this != o) {
            if (o instanceof Class1709) {
                final Class1709 class1709 = (Class1709)o;
                if (Intrinsics.areEqual((Object)this.Field15898, (Object)class1709.Field15898) && Intrinsics.areEqual((Object)this.Field15899, (Object)class1709.Field15899)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    private static String Method6549(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x546D ^ 0xA4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
