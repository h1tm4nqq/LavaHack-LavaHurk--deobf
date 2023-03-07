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
package lavahack.client;

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
import lavahack.client.Kh147LjtfFlYpSp6caspygSmIjrCyio1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/websockets/util/ConvertUtils;", "", "()V", "fileRegex", "Lkotlin/text/Regex;", "textRegex", "isFile", "", "byteArray", "", "isText", "textToByteArray", "text", "", "toFile", "Lcom/kisman/cc/websockets/data/SocketFile;", "toText", "kisman.cc"})
public final class c2wSJvPc9Xagv2TJdrOxi6Lhhww1MMln {
    private static final Regex Field9729;
    private static final Regex Field9730;
    public static final c2wSJvPc9Xagv2TJdrOxi6Lhhww1MMln Field9731;
    private int Field9732;

    public final boolean Method2039(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        Object object = byArray;
        Charset charset = Charsets.UTF_8;
        int n = (int)((long)764973753 ^ (long)764973753);
        int n2 = (int)1761969111L ^ 0x690583D7;
        object = new String((byte[])object, charset);
        charset = Field9729;
        return charset.containsMatchIn((CharSequence)object);
    }

    public final boolean Method2040(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        Object object = byArray;
        Charset charset = Charsets.UTF_8;
        int n = (int)((long)-1715097069 ^ (long)-1715097069);
        int n2 = (int)((long)434940543 ^ (long)434940543);
        object = new String((byte[])object, charset);
        charset = Field9730;
        return charset.containsMatchIn((CharSequence)object);
    }

    @Nullable
    @Nullable
    public final Kh147LjtfFlYpSp6caspygSmIjrCyio1 Method2041(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        if (!this.Method2039(byArray)) {
            return null;
        }
        Object object = byArray;
        Charset charset = Charsets.UTF_8;
        Object object2 = Field9729;
        int n = (int)((long)-438438147 ^ (long)-438438147);
        int n2 = (int)((long)-972249858 ^ (long)-972249858);
        Object object3 = new String((byte[])object, charset);
        MatchResult matchResult = Regex.find$default((Regex)object2, (CharSequence)((CharSequence)object3), (int)((int)((long)1495887047 ^ (long)1495887047)), (int)((int)((long)1655392154 ^ (long)1655392155) << 1), null);
        Object object4 = matchResult;
        if (matchResult == null) return null;
        List list = object4.getGroupValues();
        object4 = list;
        if (list == null) return null;
        Object object5 = object4;
        object = object5;
        int n3 = (int)60324228L ^ 0x3987984;
        String string = (String)object.get((int)((long)486902389 ^ (long)486902389));
        object = object5;
        n3 = (int)((long)-1253736845 ^ (long)-1253736845);
        String string2 = (String)object.get((int)-587701055L ^ 0xDCF864C0);
        String[] stringArray = new String[(int)((long)-928177567 ^ (long)-928177568)];
        stringArray[(int)((long)-1166006239 ^ (long)-1166006239)] = ":";
        object5 = StringsKt.split$default((CharSequence)string2, (String[])stringArray, ((int)1176281499L ^ 0x461CA19B) != 0, (int)((int)-1765385725L ^ 0x96C65A03), (int)((int)((long)1797778183 ^ (long)1797778180) << 1), null);
        if (object5.size() != ((int)1597140384L ^ 0x5F326DA1) << 1) {
            return null;
        }
        String string3 = string;
        object2 = byArray;
        Charset charset2 = Charsets.UTF_8;
        n2 = (int)((long)-1803157221 ^ (long)-1803157221);
        String string4 = string3;
        if (string4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] byArray2 = string4.getBytes(charset2);
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray2, (String)"(this as java.lang.String).getBytes(charset)");
        object3 = byArray2;
        int n4 = ((Object)object3).length;
        object = ArraysKt.sliceArray((byte[])object2, (IntRange)new IntRange(n4, ArraysKt.getLastIndex((byte[])byArray)));
        return new Kh147LjtfFlYpSp6caspygSmIjrCyio1((String)object5.get((int)1255504046L ^ 0x4AD578AE), (byte[])object, (String)object5.get((int)((long)1161535541 ^ (long)1161535540)));
    }

    @Nullable
    @Nullable
    public final String Method2042(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        if (!this.Method2040(byArray)) {
            return null;
        }
        Object object = byArray;
        Charset charset = Charsets.UTF_8;
        Object object2 = Field9730;
        int n = (int)((long)936231838 ^ (long)936231838);
        int n2 = (int)((long)-183934601 ^ (long)-183934601);
        Object object3 = new String((byte[])object, charset);
        MatchResult matchResult = Regex.find$default((Regex)object2, (CharSequence)((CharSequence)object3), (int)((int)1282591336L ^ 0x4C72CA68), (int)((int)((long)-1600487061 ^ (long)-1600487062) << 1), null);
        Object object4 = matchResult;
        if (matchResult == null) return null;
        List list = object4.getGroupValues();
        object4 = list;
        if (list == null) return null;
        Object object5 = object4;
        object = object5;
        int n3 = (int)((long)-86532916 ^ (long)-86532916);
        String string = (String)object.get((int)-855372393L ^ 0xCD040D97);
        object5 = string;
        object2 = ArraysKt.toList((byte[])byArray);
        object = Charsets.UTF_8;
        n3 = (int)82414895L ^ 0x4E98D2F;
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
    public final byte[] Method2043(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = Field9730.toString();
        Charset charset = Charsets.UTF_8;
        int n = (int)((long)68264045 ^ (long)68264045);
        String string3 = string2;
        if (string3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] byArray = string3.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray, (String)"(this as java.lang.String).getBytes(charset)");
        string2 = string;
        byte[] byArray2 = byArray;
        charset = Charsets.UTF_8;
        n = (int)-1821263054L ^ 0x9371BB32;
        byte[] byArray3 = string2.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray3, (String)"(this as java.lang.String).getBytes(charset)");
        byte[] byArray4 = byArray3;
        return ArraysKt.plus((byte[])byArray2, (byte[])byArray4);
    }

    private c2wSJvPc9Xagv2TJdrOxi6Lhhww1MMln() {
    }

    static {
        c2wSJvPc9Xagv2TJdrOxi6Lhhww1MMln c2wSJvPc9Xagv2TJdrOxi6Lhhww1MMln2;
        Field9731 = c2wSJvPc9Xagv2TJdrOxi6Lhhww1MMln2 = new c2wSJvPc9Xagv2TJdrOxi6Lhhww1MMln();
        String string = "IFILE:(.*?):IFILE";
        int n = (int)((long)1952118702 ^ (long)1952118702);
        Field9729 = new Regex(string);
        string = "ITEXT:ITEXT";
        n = (int)-163243769L ^ 0xF6451907;
        Field9730 = new Regex(string);
    }

    private static String Method2044(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-80610657 ^ (long)-80610657);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1562150091 ^ (long)-1562149942);
            int n2 = (int)511010655L ^ 0x1E756722;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-208712347 ^ (long)-208709970) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

