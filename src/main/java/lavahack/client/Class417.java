//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.internal.*;
import kotlin.*;
import kotlin.ranges.*;
import kotlin.text.*;
import java.nio.charset.*;
import org.jetbrains.annotations.*;
import kotlin.collections.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0011" }, d2 = { "Lcom/kisman/cc/websockets/util/ConvertUtils;", "", "()V", "fileRegex", "Lkotlin/text/Regex;", "textRegex", "isFile", "", "byteArray", "", "isText", "textToByteArray", "text", "", "toFile", "Lcom/kisman/cc/websockets/data/SocketFile;", "toText", "kisman.cc" })
public final class Class417
{
    private static final Regex Field9729;
    private static final Regex Field9730;
    public static final Class417 Field9731;
    private int Field9732;
    
    public final boolean Method2039(@NotNull @NotNull final byte[] bytes) {
        Intrinsics.checkParameterIsNotNull((Object)bytes, "byteArray");
        return Class417.Field9729.containsMatchIn((CharSequence)new String(bytes, Charsets.UTF_8));
    }
    
    public final boolean Method2040(@NotNull @NotNull final byte[] bytes) {
        Intrinsics.checkParameterIsNotNull((Object)bytes, "byteArray");
        return Class417.Field9730.containsMatchIn((CharSequence)new String(bytes, Charsets.UTF_8));
    }
    
    @Nullable
    @Nullable
    public final Class378 Method2041(@NotNull @NotNull final byte[] bytes) {
        Intrinsics.checkParameterIsNotNull((Object)bytes, "byteArray");
        if (!this.Method2039(bytes)) {
            return null;
        }
        final MatchResult find$default = Regex.find$default(Class417.Field9729, (CharSequence)new String(bytes, Charsets.UTF_8), 0, 2, (Object)null);
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
                return new Class378((String)split$default.get(0), ArraysKt.sliceArray(bytes, new IntRange(bytes2.length, ArraysKt.getLastIndex(bytes))), (String)split$default.get(1));
            }
        }
        return null;
    }
    
    @Nullable
    @Nullable
    public final String Method2042(@NotNull @NotNull final byte[] bytes) {
        Intrinsics.checkParameterIsNotNull((Object)bytes, "byteArray");
        if (!this.Method2040(bytes)) {
            return null;
        }
        final MatchResult find$default = Regex.find$default(Class417.Field9730, (CharSequence)new String(bytes, Charsets.UTF_8), 0, 2, (Object)null);
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
    public final byte[] Method2043(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        final String string = Class417.Field9730.toString();
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
    
    private Class417() {
    }
    
    static {
        Field9731 = new Class417();
        Field9729 = new Regex("IFILE:(.*?):IFILE");
        Field9730 = new Regex("ITEXT:ITEXT");
    }
    
    private static String Method2044(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3796 ^ 0x7D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
