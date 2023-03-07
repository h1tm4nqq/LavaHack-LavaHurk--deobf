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
import lavahack.loader.QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/loader/websockets/util/ConvertUtils;", "", "()V", "fileRegex", "Lkotlin/text/Regex;", "textRegex", "isFile", "", "byteArray", "", "isText", "textToByteArray", "text", "", "toFile", "Lcom/kisman/cc/loader/websockets/data/SocketFile;", "toText", "kisman.cc"})
public final class enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL {
    private static final Regex Field10829;
    private static final Regex Field10830;
    public static final enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL Field10831;
    private String Field10832 = "TheKisDevs & LavaHack Development owns you";

    public final boolean Method2840(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        Object object = byArray;
        Charset charset = Charsets.UTF_8;
        int n = (int)-2061413015L ^ 0x85215569;
        int n2 = (int)((long)391524420 ^ (long)391524420);
        object = new String((byte[])object, charset);
        charset = Field10829;
        return charset.containsMatchIn((CharSequence)object);
    }

    public final boolean Method2841(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        Object object = byArray;
        Charset charset = Charsets.UTF_8;
        int n = (int)-395693606L ^ 0xE86A31DA;
        int n2 = (int)((long)51235272 ^ (long)51235272);
        object = new String((byte[])object, charset);
        charset = Field10830;
        return charset.containsMatchIn((CharSequence)object);
    }

    @Nullable
    @Nullable
    public final QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz Method2842(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        if (!this.Method2840(byArray)) {
            return null;
        }
        Object object = byArray;
        Charset charset = Charsets.UTF_8;
        Object object2 = Field10829;
        int n = (int)-26202712L ^ 0xFE702DA8;
        int n2 = (int)((long)2141424956 ^ (long)2141424956);
        Object object3 = new String((byte[])object, charset);
        MatchResult matchResult = Regex.find$default((Regex)object2, (CharSequence)((CharSequence)object3), (int)((int)((long)1562293885 ^ (long)1562293885)), (int)(((int)-1869565405L ^ 0x9090B222) << 1), null);
        Object object4 = matchResult;
        if (matchResult == null) return null;
        List list = object4.getGroupValues();
        object4 = list;
        if (list == null) return null;
        Object object5 = object4;
        object = object5;
        int n3 = (int)-1281353638L ^ 0xB3A0185A;
        String string = (String)object.get((int)1090063821L ^ 0x40F90DCD);
        object = object5;
        n3 = (int)1227777315L ^ 0x492E6523;
        String string2 = (String)object.get((int)((long)496299886 ^ (long)496299887));
        String[] stringArray = new String[(int)-1515794993L ^ 0xA5A6CDCE];
        stringArray[(int)((long)-541662655 ^ (long)-541662655)] = ":";
        object5 = StringsKt.split$default((CharSequence)string2, (String[])stringArray, ((int)-1543074594L ^ 0xA4068CDE) != 0, (int)((int)1700043097L ^ 0x65549959), (int)((int)((long)-1379155158 ^ (long)-1379155159) << 1), null);
        if (object5.size() != (int)((long)482840327 ^ (long)482840326) << 1) {
            return null;
        }
        String string3 = string;
        object2 = byArray;
        Charset charset2 = Charsets.UTF_8;
        n2 = (int)-665954217L ^ 0xD84E5857;
        String string4 = string3;
        if (string4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] byArray2 = string4.getBytes(charset2);
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray2, (String)"(this as java.lang.String).getBytes(charset)");
        object3 = byArray2;
        int n4 = ((Object)object3).length;
        object = ArraysKt.sliceArray((byte[])object2, (IntRange)new IntRange(n4, ArraysKt.getLastIndex((byte[])byArray)));
        return new QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz((String)object5.get((int)-559767273L ^ 0xDEA2A117), (byte[])object, (String)object5.get((int)-2100104960L ^ 0x82D2F101));
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
        int n = (int)-2105779224L ^ 0x827C5BE8;
        int n2 = (int)1116928797L ^ 0x4292FB1D;
        Object object3 = new String((byte[])object, charset);
        MatchResult matchResult = Regex.find$default((Regex)object2, (CharSequence)((CharSequence)object3), (int)((int)-1484287184L ^ 0xA7879330), (int)(((int)-640559254L ^ 0xD9D1D76B) << 1), null);
        Object object4 = matchResult;
        if (matchResult == null) return null;
        List list = object4.getGroupValues();
        object4 = list;
        if (list == null) return null;
        Object object5 = object4;
        object = object5;
        int n3 = (int)1638314628L ^ 0x61A6B284;
        String string = (String)object.get((int)-1334010663L ^ 0xB07C9CD9);
        object5 = string;
        object2 = ArraysKt.toList((byte[])byArray);
        object = Charsets.UTF_8;
        n3 = (int)((long)2102069009 ^ (long)2102069009);
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
        int n = (int)-763642207L ^ 0xD27BBEA1;
        String string3 = string2;
        if (string3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] byArray = string3.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray, (String)"(this as java.lang.String).getBytes(charset)");
        string2 = string;
        byte[] byArray2 = byArray;
        charset = Charsets.UTF_8;
        n = (int)-454230533L ^ 0xE4ECFDFB;
        byte[] byArray3 = string2.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray3, (String)"(this as java.lang.String).getBytes(charset)");
        byte[] byArray4 = byArray3;
        return ArraysKt.plus((byte[])byArray2, (byte[])byArray4);
    }

    private enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL() {
    }

    static {
        enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL2;
        Field10831 = enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL2 = new enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL();
        String string = "IFILE:(.*?):IFILE";
        int n = (int)1579990990L ^ 0x5E2CBFCE;
        Field10829 = new Regex(string);
        string = "ITEXT:ITEXT";
        n = (int)281480078L ^ 0x10C70B8E;
        Field10830 = new Regex(string);
    }

    private static String Method2845(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2087056032 ^ (long)2087056032);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1365167486 ^ (long)1365167489);
            int n2 = (int)((long)1139106555 ^ (long)1139106476);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1953086495 ^ (long)-1953081190) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

