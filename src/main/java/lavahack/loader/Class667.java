//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.jvm.internal.*;
import kotlin.*;
import kotlin.ranges.*;
import kotlin.text.*;
import java.nio.charset.*;
import org.jetbrains.annotations.*;
import kotlin.collections.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0011" }, d2 = { "Lcom/kisman/cc/loader/websockets/util/ConvertUtils;", "", "()V", "fileRegex", "Lkotlin/text/Regex;", "textRegex", "isFile", "", "byteArray", "", "isText", "textToByteArray", "text", "", "toFile", "Lcom/kisman/cc/loader/websockets/data/SocketFile;", "toText", "kisman.cc" })
public final class Class667
{
    private static final Regex Field10829;
    private static final Regex Field10830;
    public static final Class667 Field10831;
    private String Field10832 = "TheKisDevs & LavaHack Development owns you";
    
    public final boolean Method2840(@NotNull @NotNull final byte[] bytes) {
        Intrinsics.checkParameterIsNotNull((Object)bytes, "byteArray");
        return Class667.Field10829.containsMatchIn((CharSequence)new String(bytes, Charsets.UTF_8));
    }
    
    public final boolean Method2841(@NotNull @NotNull final byte[] bytes) {
        Intrinsics.checkParameterIsNotNull((Object)bytes, "byteArray");
        return Class667.Field10830.containsMatchIn((CharSequence)new String(bytes, Charsets.UTF_8));
    }
    
    @Nullable
    @Nullable
    public final Class1441 Method2842(@NotNull @NotNull final byte[] bytes) {
        Intrinsics.checkParameterIsNotNull((Object)bytes, "byteArray");
        if (!this.Method2840(bytes)) {
            return null;
        }
        final MatchResult find$default = Regex.find$default(Class667.Field10829, (CharSequence)new String(bytes, Charsets.UTF_8), 0, 2, (Object)null);
        if (find$default != null) {
            final List groupValues = find$default.getGroupValues();
            if (groupValues != null) {
                final List<String> list = (List<String>)groupValues;
                final String s = list.get(0);
                final List split$default = StringsKt.split$default((CharSequence)list.get(1), new String[] { ":" }, false, 0, 6, (Object)null);
                if (split$default.size() != 2) {
                    return null;
                }
                final String s2 = s;
                final Charset utf_8 = Charsets.UTF_8;
                final String s3 = s2;
                if (s3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final byte[] bytes2 = s3.getBytes(utf_8);
                Intrinsics.checkExpressionValueIsNotNull((Object)bytes2, "(this as java.lang.String).getBytes(charset)");
                return new Class1441((String)split$default.get(0), ArraysKt.sliceArray(bytes, new IntRange(bytes2.length, ArraysKt.getLastIndex(bytes))), (String)split$default.get(1));
            }
        }
        return null;
    }
    
    @Nullable
    @Nullable
    public final String Method2843(@NotNull @NotNull final byte[] bytes) {
        Intrinsics.checkParameterIsNotNull((Object)bytes, "byteArray");
        if (!this.Method2841(bytes)) {
            return null;
        }
        final MatchResult find$default = Regex.find$default(Class667.Field10830, (CharSequence)new String(bytes, Charsets.UTF_8), 0, 2, (Object)null);
        if (find$default != null) {
            final List groupValues = find$default.getGroupValues();
            if (groupValues != null) {
                final String s = groupValues.get(0);
                final List list = ArraysKt.toList(bytes);
                final String s2 = s;
                final List list2 = list;
                final Charset utf_8 = Charsets.UTF_8;
                final String s3 = s2;
                if (s3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final byte[] bytes2 = s3.getBytes(utf_8);
                Intrinsics.checkExpressionValueIsNotNull((Object)bytes2, "(this as java.lang.String).getBytes(charset)");
                return new String(CollectionsKt.toByteArray((Collection)list2.subList(bytes2.length, bytes.length)), Charsets.UTF_8);
            }
        }
        return null;
    }
    
    @NotNull
    @NotNull
    public final byte[] Method2844(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        final String string = Class667.Field10830.toString();
        final Charset utf_8 = Charsets.UTF_8;
        final String s2 = string;
        if (s2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final byte[] bytes = s2.getBytes(utf_8);
        Intrinsics.checkExpressionValueIsNotNull((Object)bytes, "(this as java.lang.String).getBytes(charset)");
        final byte[] array = bytes;
        final byte[] bytes2 = s.getBytes(Charsets.UTF_8);
        Intrinsics.checkExpressionValueIsNotNull((Object)bytes2, "(this as java.lang.String).getBytes(charset)");
        return ArraysKt.plus(array, bytes2);
    }
    
    private Class667() {
    }
    
    static {
        Field10831 = new Class667();
        Field10829 = new Regex("IFILE:(.*?):IFILE");
        Field10830 = new Regex("ITEXT:ITEXT");
    }
    
    private static String Method2845(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x36F6 ^ 0x57));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
