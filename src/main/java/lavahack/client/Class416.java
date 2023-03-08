//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.internal.*;
import java.io.*;
import org.jetbrains.annotations.*;
import kotlin.io.*;
import java.nio.charset.*;
import kotlin.text.*;
import kotlin.*;
import kotlin.collections.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007\b\u0002?\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00070\u00042\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00072\u0006\u0010\u000b\u001a\u00020\tJ\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00072\u0006\u0010\r\u001a\u00020\tJ\u0011\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0082\b?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/features/catlua/mapping/MappingsGenerator;", "", "()V", "generateClassMappings", "Lkotlin/Pair;", "", "", "", "classFile", "Ljava/io/File;", "generateFieldMappings", "fieldFile", "generateMethodMappings", "methodFile", "unquote", "s", "ClassMapping", "FieldMapping", "kisman.cc" })
public final class Class416
{
    public static final Class416 Field9727;
    private int Field9728;
    
    private final String Method2034(final String s) {
        final int beginIndex = 1;
        final int endIndex = s.length() - 1;
        if (s == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final String substring = s.substring(beginIndex, endIndex);
        Intrinsics.checkExpressionValueIsNotNull((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    @NotNull
    @NotNull
    public final Pair Method2035(@NotNull @NotNull final File file) {
        Intrinsics.checkParameterIsNotNull((Object)file, "classFile");
        final List mutableList = CollectionsKt.toMutableList((Collection)FilesKt.readLines$default(file, (Charset)null, 1, (Object)null));
        mutableList.remove(0);
        final ArrayList<Object> list = new ArrayList<Object>();
        final Iterator<Object> iterator = ((List<Object>)mutableList).iterator();
        while (iterator.hasNext()) {
            final List split$default = StringsKt.split$default((CharSequence)iterator.next(), new String[] { "," }, false, 0, 6, (Object)null);
            final Class416 field9727 = Class416.Field9727;
            final String s = split$default.get(0);
            final int beginIndex = 1;
            final int endIndex = s.length() - 1;
            final String s2 = s;
            if (s2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring = s2.substring(beginIndex, endIndex);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String s3 = substring;
            final Class416 field9728 = Class416.Field9727;
            final String s4 = split$default.get(1);
            final int beginIndex2 = 1;
            final int endIndex2 = s4.length() - 1;
            final String s5 = s4;
            if (s5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring2 = s5.substring(beginIndex2, endIndex2);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String s6 = substring2;
            final Class416 field9729 = Class416.Field9727;
            final String s7 = split$default.get(4);
            final int beginIndex3 = 1;
            final int endIndex3 = s7.length() - 1;
            final String s8 = s7;
            if (s8 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring3 = s8.substring(beginIndex3, endIndex3);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final boolean b = Integer.parseInt(substring3) == 0;
            for (final Class1560 class1560 : list) {
                if (Intrinsics.areEqual((Object)class1560.Method6143(), (Object)s3) && (class1560.Method6144() == null || class1560.Method6146() == null)) {
                    class1560.Method6147(s6);
                }
            }
            list.add(new Class1560(s3, (String)null, s6));
        }
        final ArrayList<Object> list2 = list;
        final ArrayList<Object> list3 = new ArrayList<Object>();
        for (final Class1560 class1561 : list2) {
            if (class1561.Method6144() == null && class1561.Method6146() != null) {
                continue;
            }
        }
        final ArrayList<Object> list5;
        final ArrayList<String> list4 = new ArrayList<String>(CollectionsKt.collectionSizeOrDefault((Iterable)(list5 = list3), 10));
        for (final Class1560 next : list5) {
            final ArrayList<String> list6 = list4;
            final Class1560 class1562 = next;
            final ArrayList<String> list7 = list6;
            final String method6146 = class1562.Method6146();
            if (method6146 == null) {
                Intrinsics.throwNpe();
            }
            list7.add(method6146);
        }
        final ArrayList<String> list8 = list4;
        final ArrayList<Object> list9 = list;
        final ArrayList<String> list10 = list8;
        final Iterable<Class1560> iterable = (Iterable<Class1560>)list9;
        final ArrayList<Object> list11 = new ArrayList<Object>();
        for (final Class1560 class1563 : iterable) {
            if (class1563.Method6144() != null && class1563.Method6146() != null) {
                continue;
            }
        }
        final ArrayList<Object> list12 = list11;
        final ArrayList<String> list13 = list10;
        final ArrayList<Object> list14 = list12;
        final ArrayList<String> list15 = list13;
        final ArrayList<Object> list16 = list14;
        final ArrayList<Pair> list17 = new ArrayList<Pair>(CollectionsKt.collectionSizeOrDefault((Iterable)list14, 10));
        for (final Class1560 next2 : list16) {
            final ArrayList<Pair> list18 = list17;
            final Class1560 class1564 = next2;
            final ArrayList<Pair> list19 = list18;
            final String method6147 = class1564.Method6146();
            if (method6147 == null) {
                Intrinsics.throwNpe();
            }
            final String method6148 = class1564.Method6144();
            if (method6148 == null) {
                Intrinsics.throwNpe();
            }
            list19.add(TuplesKt.to((Object)method6147, (Object)method6148));
        }
        return new Pair((Object)list15, (Object)MapsKt.toMap((Iterable)list17));
    }
    
    @NotNull
    @NotNull
    public final Map Method2036(@NotNull @NotNull final File file) {
        Intrinsics.checkParameterIsNotNull((Object)file, "fieldFile");
        final List mutableList = CollectionsKt.toMutableList((Collection)FilesKt.readLines$default(file, (Charset)null, 1, (Object)null));
        mutableList.remove(0);
        final ArrayList<Object> list = new ArrayList<Object>();
        final Iterator<Object> iterator = ((List<Object>)mutableList).iterator();
        while (iterator.hasNext()) {
            final List split$default = StringsKt.split$default((CharSequence)iterator.next(), new String[] { "," }, false, 0, 6, (Object)null);
            final Class416 field9727 = Class416.Field9727;
            final String s = split$default.get(1);
            final int beginIndex = 1;
            final int endIndex = s.length() - 1;
            final String s2 = s;
            if (s2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring = s2.substring(beginIndex, endIndex);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String s3 = substring;
            final Class416 field9728 = Class416.Field9727;
            final String s4 = split$default.get(5);
            final int beginIndex2 = 1;
            final int endIndex2 = s4.length() - 1;
            final String s5 = s4;
            if (s5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring2 = s5.substring(beginIndex2, endIndex2);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String s6 = substring2;
            final Class416 field9729 = Class416.Field9727;
            final String s7 = split$default.get(2);
            final int beginIndex3 = 1;
            final int endIndex3 = s7.length() - 1;
            final String s8 = s7;
            if (s8 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring3 = s8.substring(beginIndex3, endIndex3);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String str = substring3;
            final Class416 field9730 = Class416.Field9727;
            final String s9 = split$default.get(6);
            final int beginIndex4 = 1;
            final int endIndex4 = s9.length() - 1;
            final String s10 = s9;
            if (s10 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring4 = s10.substring(beginIndex4, endIndex4);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring4, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String string = substring4 + '.' + str;
            final Class416 field9731 = Class416.Field9727;
            final String s11 = split$default.get(8);
            final int beginIndex5 = 1;
            final int endIndex5 = s11.length() - 1;
            final String s12 = s11;
            if (s12 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring5 = s12.substring(beginIndex5, endIndex5);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring5, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final boolean b = Integer.parseInt(substring5) == 0;
            for (final Class1797 class1797 : list) {
                if (Intrinsics.areEqual((Object)class1797.Method6797(), (Object)s6) && Intrinsics.areEqual((Object)class1797.Method6796(), (Object)s3)) {
                    class1797.Method6801(string);
                }
            }
            list.add(new Class1797(s3, s6, (String)null, string));
        }
        final ArrayList<Object> list2 = list;
        final ArrayList<Object> list3 = new ArrayList<Object>();
        for (final Class1797 class1798 : list2) {
            if (class1798.Method6798() != null && class1798.Method6800() != null) {
                final String method6798 = class1798.Method6798();
                if (method6798 == null) {
                    Intrinsics.throwNpe();
                }
                final String s13 = StringsKt.split$default((CharSequence)method6798, new String[] { "." }, false, 0, 6, (Object)null).get(1);
                final String method6799 = class1798.Method6800();
                if (method6799 == null) {
                    Intrinsics.throwNpe();
                }
                if (Intrinsics.areEqual((Object)s13, (Object)StringsKt.split$default((CharSequence)method6799, new String[] { "." }, false, 0, 6, (Object)null).get(1)) ^ true) {
                    continue;
                }
                continue;
            }
        }
        final ArrayList<Object> list5;
        final ArrayList<Pair> list4 = new ArrayList<Pair>(CollectionsKt.collectionSizeOrDefault((Iterable)(list5 = list3), 10));
        for (final Class1797 next : list5) {
            final ArrayList<Pair> list6 = list4;
            final Class1797 class1799 = next;
            final ArrayList<Pair> list7 = list6;
            final String method6800 = class1799.Method6800();
            if (method6800 == null) {
                Intrinsics.throwNpe();
            }
            final String method6801 = class1799.Method6798();
            if (method6801 == null) {
                Intrinsics.throwNpe();
            }
            list7.add(TuplesKt.to((Object)method6800, (Object)method6801));
        }
        return MapsKt.toSortedMap(MapsKt.toMap((Iterable)list4));
    }
    
    @NotNull
    @NotNull
    public final Map Method2037(@NotNull @NotNull final File file) {
        Intrinsics.checkParameterIsNotNull((Object)file, "methodFile");
        final List mutableList = CollectionsKt.toMutableList((Collection)FilesKt.readLines$default(file, (Charset)null, 1, (Object)null));
        mutableList.remove(0);
        final ArrayList<Object> list = new ArrayList<Object>();
        final Iterator<Object> iterator = ((List<Object>)mutableList).iterator();
        while (iterator.hasNext()) {
            final List split$default = StringsKt.split$default((CharSequence)iterator.next(), new String[] { "," }, false, 0, 6, (Object)null);
            final Class416 field9727 = Class416.Field9727;
            final String s = split$default.get(1);
            final int beginIndex = 1;
            final int endIndex = s.length() - 1;
            final String s2 = s;
            if (s2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring = s2.substring(beginIndex, endIndex);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String s3 = substring;
            final Class416 field9728 = Class416.Field9727;
            final String s4 = split$default.get(5);
            final int beginIndex2 = 1;
            final int endIndex2 = s4.length() - 1;
            final String s5 = s4;
            if (s5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring2 = s5.substring(beginIndex2, endIndex2);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String s6 = substring2;
            final Class416 field9729 = Class416.Field9727;
            final String s7 = split$default.get(2);
            final int beginIndex3 = 1;
            final int endIndex3 = s7.length() - 1;
            final String s8 = s7;
            if (s8 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring3 = s8.substring(beginIndex3, endIndex3);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String str = substring3;
            final Class416 field9730 = Class416.Field9727;
            final String s9 = split$default.get(4);
            final int beginIndex4 = 1;
            final int endIndex4 = s9.length() - 1;
            final String s10 = s9;
            if (s10 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring4 = s10.substring(beginIndex4, endIndex4);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring4, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String str2 = substring4;
            final Class416 field9731 = Class416.Field9727;
            final String s11 = split$default.get(6);
            final int beginIndex5 = 1;
            final int endIndex5 = s11.length() - 1;
            final String s12 = s11;
            if (s12 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring5 = s12.substring(beginIndex5, endIndex5);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring5, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String string = substring5 + '.' + str + '.' + str2;
            final Class416 field9732 = Class416.Field9727;
            final String s13 = split$default.get(8);
            final int beginIndex6 = 1;
            final int endIndex6 = s13.length() - 1;
            final String s14 = s13;
            if (s14 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring6 = s14.substring(beginIndex6, endIndex6);
            Intrinsics.checkExpressionValueIsNotNull((Object)substring6, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final boolean b = Integer.parseInt(substring6) == 0;
            for (final Class1797 class1797 : list) {
                if (Intrinsics.areEqual((Object)class1797.Method6797(), (Object)s6) && Intrinsics.areEqual((Object)class1797.Method6796(), (Object)s3)) {
                    class1797.Method6801(string);
                }
            }
            list.add(new Class1797(s3, s6, (String)null, string));
        }
        final ArrayList<Object> list2 = list;
        final ArrayList<Object> list3 = new ArrayList<Object>();
        for (final Class1797 class1798 : list2) {
            if (class1798.Method6798() != null && class1798.Method6800() != null) {
                final String method6798 = class1798.Method6798();
                if (method6798 == null) {
                    Intrinsics.throwNpe();
                }
                final String s15 = StringsKt.split$default((CharSequence)method6798, new String[] { "." }, false, 0, 6, (Object)null).get(1);
                final String method6799 = class1798.Method6800();
                if (method6799 == null) {
                    Intrinsics.throwNpe();
                }
                if (Intrinsics.areEqual((Object)s15, (Object)StringsKt.split$default((CharSequence)method6799, new String[] { "." }, false, 0, 6, (Object)null).get(1)) ^ true) {
                    continue;
                }
                continue;
            }
        }
        final ArrayList<Object> list5;
        final ArrayList<Pair> list4 = new ArrayList<Pair>(CollectionsKt.collectionSizeOrDefault((Iterable)(list5 = list3), 10));
        for (final Class1797 next : list5) {
            final ArrayList<Pair> list6 = list4;
            final Class1797 class1799 = next;
            final ArrayList<Pair> list7 = list6;
            final String method6800 = class1799.Method6800();
            if (method6800 == null) {
                Intrinsics.throwNpe();
            }
            final String method6801 = class1799.Method6798();
            if (method6801 == null) {
                Intrinsics.throwNpe();
            }
            list7.add(TuplesKt.to((Object)method6800, (Object)method6801));
        }
        return MapsKt.toSortedMap(MapsKt.toMap((Iterable)list4));
    }
    
    private Class416() {
    }
    
    static {
        Field9727 = new Class416();
    }
    
    private static String Method2038(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x35BF ^ 0xCC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
