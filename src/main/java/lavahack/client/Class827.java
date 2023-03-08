//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import java.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003?\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u001a\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n?\u0006\u001c" }, d2 = { "Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Method;", "", "obf", "", "obfSig", "deobf", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeobf", "()Ljava/lang/String;", "setDeobf", "(Ljava/lang/String;)V", "getObf", "setObf", "getObfSig", "setObfSig", "component1", "component2", "component3", "copy", "equals", "", "other", "getDeobfSig", "classNames", "", "hashCode", "", "toString", "kisman.cc" })
public final class Class827
{
    @NotNull
    private String Field11522;
    @NotNull
    private String Field11523;
    @NotNull
    private String Field11524;
    private String Field11525 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    @Override
    public String toString() {
        return this.Field11522 + ' ' + this.Field11523 + ' ' + this.Field11524;
    }
    
    @NotNull
    @NotNull
    public final String Method3537(@NotNull @NotNull final Map map) {
        Intrinsics.checkParameterIsNotNull((Object)map, "classNames");
        final ArrayList<String> list = new ArrayList<String>();
        String s = "";
        final String s2 = this.Field11523;
        for (int i = 0; i < s2.length(); ++i) {
            switch (s2.charAt(i)) {
                case 'L': {
                    s = "";
                    break;
                }
                case ';': {
                    list.add(s);
                    break;
                }
            }
        }
        String s3 = this.Field11523;
        for (final String str : list) {
            if (map.containsKey(str)) {
                final String s4 = s3;
                final String string = 'L' + str + ';';
                final StringBuilder append = new StringBuilder().append('L');
                final String value = map.get(str);
                if (value == null) {
                    Intrinsics.throwNpe();
                }
                s3 = StringsKt.replace$default(s4, string, append.append(value).append(';').toString(), false, 4, (Object)null);
            }
        }
        return s3;
    }
    
    @NotNull
    @NotNull
    public final String Method3538() {
        return this.Field11522;
    }
    
    public final void Method3539(@NotNull @NotNull final String field11522) {
        Intrinsics.checkParameterIsNotNull((Object)field11522, "<set-?>");
        this.Field11522 = field11522;
    }
    
    @NotNull
    @NotNull
    public final String Method3540() {
        return this.Field11523;
    }
    
    public final void Method3541(@NotNull @NotNull final String field11523) {
        Intrinsics.checkParameterIsNotNull((Object)field11523, "<set-?>");
        this.Field11523 = field11523;
    }
    
    @NotNull
    @NotNull
    public final String Method3542() {
        return this.Field11524;
    }
    
    public final void Method3543(@NotNull @NotNull final String field11524) {
        Intrinsics.checkParameterIsNotNull((Object)field11524, "<set-?>");
        this.Field11524 = field11524;
    }
    
    public Class827(@NotNull @NotNull final String field11522, @NotNull @NotNull final String field11523, @NotNull @NotNull final String field11524) {
        Intrinsics.checkParameterIsNotNull((Object)field11522, "obf");
        Intrinsics.checkParameterIsNotNull((Object)field11523, "obfSig");
        Intrinsics.checkParameterIsNotNull((Object)field11524, "deobf");
        this.Field11522 = field11522;
        this.Field11523 = field11523;
        this.Field11524 = field11524;
    }
    
    @NotNull
    @NotNull
    public final String Method3544() {
        return this.Field11522;
    }
    
    @NotNull
    @NotNull
    public final String Method3545() {
        return this.Field11523;
    }
    
    @NotNull
    @NotNull
    public final String Method3546() {
        return this.Field11524;
    }
    
    @NotNull
    @NotNull
    public final Class827 Method3547(@NotNull @NotNull final String s, @NotNull @NotNull final String s2, @NotNull @NotNull final String s3) {
        Intrinsics.checkParameterIsNotNull((Object)s, "obf");
        Intrinsics.checkParameterIsNotNull((Object)s2, "obfSig");
        Intrinsics.checkParameterIsNotNull((Object)s3, "deobf");
        return new Class827(s, s2, s3);
    }
    
    @NotNull
    @NotNull
    public static Class827 Method3548(final Class827 class827, String field11522, String field11523, String field11524, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            field11522 = class827.Field11522;
        }
        if ((n & 0x2) != 0x0) {
            field11523 = class827.Field11523;
        }
        if ((n & 0x4) != 0x0) {
            field11524 = class827.Field11524;
        }
        return class827.Method3547(field11522, field11523, field11524);
    }
    
    @Override
    public int hashCode() {
        final String field11522 = this.Field11522;
        final int n = ((field11522 != null) ? field11522.hashCode() : 0) * 31;
        final String field11523 = this.Field11523;
        final int n2 = (n + ((field11523 != null) ? field11523.hashCode() : 0)) * 31;
        final String field11524 = this.Field11524;
        return n2 + ((field11524 != null) ? field11524.hashCode() : 0);
    }
    
    @Override
    public boolean equals(@Nullable @Nullable final Object o) {
        if (this != o) {
            if (o instanceof Class827) {
                final Class827 class827 = (Class827)o;
                if (Intrinsics.areEqual((Object)this.Field11522, (Object)class827.Field11522) && Intrinsics.areEqual((Object)this.Field11523, (Object)class827.Field11523) && Intrinsics.areEqual((Object)this.Field11524, (Object)class827.Field11524)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    private static String Method3549(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2D1B ^ 0x9C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
