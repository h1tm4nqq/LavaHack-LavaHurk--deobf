/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.collections.ArraysKt
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.ranges.IntRange
 *  kotlin.text.Charsets
 *  kotlin.text.MatchResult
 *  kotlin.text.Regex
 *  kotlin.text.StringsKt
 */
package lavahack.loader;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lavahack.loader.Class1441;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/loader/websockets/util/ConvertUtils;", "", "()V", "fileRegex", "Lkotlin/text/Regex;", "textRegex", "isFile", "", "byteArray", "", "isText", "textToByteArray", "text", "", "toFile", "Lcom/kisman/cc/loader/websockets/data/SocketFile;", "toText", "kisman.cc"})
public final class Class667 {
    private static final Regex Field10829;
    private static final Regex Field10830;
    public static final Class667 Field10831;
    private String Field10832 = "TheKisDevs & LavaHack Development owns you";

    public final boolean Method2840(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        Object object = byArray;
        Charset charset = Charsets.UTF_8;
        boolean bl = false;
        boolean bl2 = false;
        object = new String((byte[])object, charset);
        charset = Field10829;
        return charset.containsMatchIn((CharSequence)object);
    }

    public final boolean Method2841(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        Object object = byArray;
        Charset charset = Charsets.UTF_8;
        boolean bl = false;
        boolean bl2 = false;
        object = new String((byte[])object, charset);
        charset = Field10830;
        return charset.containsMatchIn((CharSequence)object);
    }

    @Nullable
    @Nullable
    public final Class1441 Method2842(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        if (!this.Method2840(byArray)) {
            return null;
        }
        Object object = byArray;
        Charset charset = Charsets.UTF_8;
        Object object2 = Field10829;
        boolean bl = false;
        boolean bl2 = false;
        Object object3 = new String((byte[])object, charset);
        MatchResult matchResult = Regex.find$default((Regex)object2, (CharSequence)((CharSequence)object3), (int)0, (int)2, null);
        Object object4 = matchResult;
        if (matchResult == null) return null;
        List list = object4.getGroupValues();
        object4 = list;
        if (list == null) return null;
        Object object5 = object4;
        object = object5;
        boolean bl3 = false;
        String string = (String)object.get(0);
        object = object5;
        bl3 = false;
        String string2 = (String)object.get(1);
        object5 = StringsKt.split$default((CharSequence)string2, (String[])new String[]{":"}, (boolean)false, (int)0, (int)6, null);
        if (object5.size() != 2) {
            return null;
        }
        String string3 = string;
        object2 = byArray;
        Charset charset2 = Charsets.UTF_8;
        bl2 = false;
        String string4 = string3;
        if (string4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] byArray2 = string4.getBytes(charset2);
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray2, (String)"(this as java.lang.String).getBytes(charset)");
        object3 = byArray2;
        int n = ((Object)object3).length;
        object = ArraysKt.sliceArray((byte[])object2, (IntRange)new IntRange(n, ArraysKt.getLastIndex((byte[])byArray)));
        return new Class1441((String)object5.get(0), (byte[])object, (String)object5.get(1));
    }

    @Nullable
    @Nullable
    public final String Method2843(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        if (!this.Method2841(byArray)) {
            return null;
        }
        Object object = byArray;
        Charset charset = Charsets.UTF_8;
        Object object2 = Field10830;
        boolean bl = false;
        boolean bl2 = false;
        Object object3 = new String((byte[])object, charset);
        MatchResult matchResult = Regex.find$default((Regex)object2, (CharSequence)((CharSequence)object3), (int)0, (int)2, null);
        Object object4 = matchResult;
        if (matchResult == null) return null;
        List list = object4.getGroupValues();
        object4 = list;
        if (list == null) return null;
        Object object5 = object4;
        object = object5;
        boolean bl3 = false;
        String string = (String)object.get(0);
        object5 = string;
        object2 = ArraysKt.toList((byte[])byArray);
        object = Charsets.UTF_8;
        bl3 = false;
        MatchResult matchResult2 = object5;
        if (matchResult2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] byArray2 = matchResult2.getBytes((Charset)object);
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray2, (String)"(this as java.lang.String).getBytes(charset)");
        object3 = byArray2;
        object5 = CollectionsKt.toByteArray((Collection)object2.subList(((Object)object3).length, byArray.length));
        object = Charsets.UTF_8;
        return new String((byte[])object5, (Charset)object);
    }

    @NotNull
    @NotNull
    public final byte[] Method2844(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = Field10830.toString();
        Charset charset = Charsets.UTF_8;
        boolean bl = false;
        String string3 = string2;
        if (string3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] byArray = string3.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray, (String)"(this as java.lang.String).getBytes(charset)");
        string2 = string;
        byte[] byArray2 = byArray;
        charset = Charsets.UTF_8;
        bl = false;
        byte[] byArray3 = string2.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray3, (String)"(this as java.lang.String).getBytes(charset)");
        byte[] byArray4 = byArray3;
        return ArraysKt.plus((byte[])byArray2, (byte[])byArray4);
    }

    private Class667() {
    }

    static {
        Class667 class667;
        Field10831 = class667 = new Class667();
        String string = "IFILE:(.*?):IFILE";
        boolean bl = false;
        Field10829 = new Regex(string);
        string = "ITEXT:ITEXT";
        bl = false;
        Field10830 = new Regex(string);
    }

    private static String Method2845(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 87;
            cArray2[n] = (char)(cArray[n] ^ (0x36F6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

