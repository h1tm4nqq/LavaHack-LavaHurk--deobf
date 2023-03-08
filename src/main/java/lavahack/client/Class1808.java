//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.text.*;
import kotlin.jvm.internal.*;
import java.io.*;
import kotlin.*;
import kotlin.collections.*;
import kotlin.jvm.functions.*;
import kotlin.io.*;
import java.nio.charset.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/features/catlua/mapping/TSrgUtil;", "", "()V", "fromSrg", "", "srgFile", "Ljava/io/File;", "tsrgFile", "parseTSrg", "", "Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Clazz;", "lines", "", "toSrg", "classes", "Clazz", "Field", "Method", "kisman.cc" })
public final class Class1808
{
    public static final Class1808 Field16320;
    private String Field16321 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final List Method6823(@NotNull @NotNull final List list) {
        Intrinsics.checkParameterIsNotNull((Object)list, "lines");
        final ArrayList<Object> list2 = new ArrayList<Object>();
        Class1364 class1364 = null;
        final List<Object> list3 = (List<Object>)list;
        int n = 0;
        for (final String next : list3) {
            final int n2 = n++;
            final String str = next;
            final int i = n2;
            if (!StringsKt.startsWith$default(str, "#", false, 2, (Object)null)) {
                final String s = str;
                if (s == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                if (StringsKt.trim((CharSequence)s).toString().length() == 0) {}
                if (StringsKt.startsWith$default(str, "\t", false, 2, (Object)null) || StringsKt.startsWith$default(str, " ", false, 2, (Object)null)) {
                    if (class1364 == null) {
                        throw new RuntimeException("Parse error on line " + i + ": no class\n" + str);
                    }
                    final String s2 = str;
                    if (s2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    final List split$default = StringsKt.split$default((CharSequence)StringsKt.trim((CharSequence)s2).toString(), new String[] { " " }, false, 0, 6, (Object)null);
                    switch (split$default.size()) {
                        case 2: {
                            final String s3 = split$default.get(0);
                            final String s4 = split$default.get(1);
                            final Class1364 class1365 = class1364;
                            if (class1365 == null) {
                                Intrinsics.throwNpe();
                            }
                            class1365.Method5448().add(new Class1709(s3, s4));
                            continue;
                        }
                        case 3: {
                            final String s5 = split$default.get(0);
                            final String s6 = split$default.get(1);
                            final String s7 = split$default.get(2);
                            final Class1364 class1366 = class1364;
                            if (class1366 == null) {
                                Intrinsics.throwNpe();
                            }
                            class1366.Method5449().add(new Class827(s5, s6, s7));
                            continue;
                        }
                        default: {
                            throw new RuntimeException("Parse error on line " + i + ": too many parts\n" + str);
                        }
                    }
                }
                else {
                    if (!StringsKt.contains$default((CharSequence)str, (CharSequence)" ", false, 2, (Object)null)) {
                        continue;
                    }
                    final Class1364 class1367 = class1364;
                    if (class1367 != null) {
                        list2.add(class1367);
                    }
                    final List split$default2 = StringsKt.split$default((CharSequence)str, new String[] { " " }, false, 0, 6, (Object)null);
                    switch (split$default2.size()) {
                        case 2: {
                            class1364 = new Class1364((String)split$default2.get(0), (String)split$default2.get(1), (List)null, (List)null, 12, (DefaultConstructorMarker)null);
                            continue;
                        }
                        default: {
                            throw new RuntimeException("Parse error on line " + i + ": class definition has too many parts\n" + str);
                        }
                    }
                }
            }
        }
        final Class1364 class1368 = class1364;
        if (class1368 != null) {
            final Class1364 class1369 = class1368;
            if (!list2.contains(class1369)) {
                list2.add(class1369);
            }
        }
        return list2;
    }
    
    public final void Method6824(@NotNull @NotNull final List list, @NotNull @NotNull final File file) {
        Intrinsics.checkParameterIsNotNull((Object)list, "classes");
        Intrinsics.checkParameterIsNotNull((Object)file, "srgFile");
        final List<Object> list3;
        final ArrayList<Pair> list2 = new ArrayList<Pair>(CollectionsKt.collectionSizeOrDefault((Iterable)(list3 = (List<Object>)list), 10));
        for (final Class1364 next : list3) {
            final ArrayList<Pair> list4 = list2;
            final Class1364 class1364 = next;
            list4.add(TuplesKt.to((Object)class1364.Method5444(), (Object)class1364.Method5446()));
        }
        final Map map = MapsKt.toMap((Iterable)list2);
        final StringBuilder sb = new StringBuilder();
        for (final Class1364 class1365 : (List<Object>)list) {
            if (Intrinsics.areEqual((Object)class1365.Method5444(), (Object)class1365.Method5446()) ^ true) {
                sb.append("CL: " + class1365.Method5444() + ' ' + class1365.Method5446() + '\n');
            }
            for (final Class1709 class1366 : class1365.Method5448()) {
                sb.append("FD: " + class1365.Method5444() + '/' + class1366.Method6541() + ' ' + class1365.Method5446() + '/' + class1366.Method6543() + '\n');
            }
            for (final Class827 class1367 : class1365.Method5449()) {
                sb.append("MD: " + class1365.Method5444() + '/' + class1367.Method3538() + ' ' + class1367.Method3540() + ' ' + class1365.Method5446() + '/' + class1367.Method3542() + ' ' + class1367.Method3537(map) + '\n');
            }
        }
        final String string = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, "output.toString()");
        final List list5 = CollectionsKt.sorted((Iterable)StringsKt.split$default((CharSequence)string, new String[] { "\n" }, false, 0, 6, (Object)null));
        final ArrayList list6 = new ArrayList();
        final Iterator<String> iterator5 = (Iterator<String>)list5.iterator();
        while (iterator5.hasNext()) {
            if (iterator5.next().length() > 0) {
                continue;
            }
        }
        FilesKt.writeText$default(file, CollectionsKt.joinToString$default((Iterable)list6, (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null), (Charset)null, 2, (Object)null);
    }
    
    @NotNull
    @NotNull
    public final List Method6825(@NotNull @NotNull final File obj, @NotNull @NotNull final File obj2) {
        Intrinsics.checkParameterIsNotNull((Object)obj, "tsrgFile");
        Intrinsics.checkParameterIsNotNull((Object)obj2, "srgFile");
        if (!obj2.exists()) {
            obj2.createNewFile();
        }
        if (obj2.exists() && !obj2.isFile()) {
            throw new RuntimeException("srg path is not a file: " + obj2);
        }
        if (!obj.exists() || !obj.isFile()) {
            throw new RuntimeException("tsrg file not found: " + obj);
        }
        final List method6823 = this.Method6823(FilesKt.readLines$default(obj, (Charset)null, 1, (Object)null));
        this.Method6824(method6823, obj2);
        return method6823;
    }
    
    public final void Method6826(@NotNull @NotNull final File obj, @NotNull @NotNull final File obj2) {
        Intrinsics.checkParameterIsNotNull((Object)obj, "srgFile");
        Intrinsics.checkParameterIsNotNull((Object)obj2, "tsrgFile");
        if (!obj2.exists()) {
            obj2.createNewFile();
        }
        if (obj2.exists() && !obj2.isFile()) {
            throw new RuntimeException("tsrg path is not a file: " + obj2);
        }
        if (!obj.exists() || !obj.isFile()) {
            throw new RuntimeException("srg file not found: " + obj);
        }
        final List lines$default = FilesKt.readLines$default(obj, (Charset)null, 1, (Object)null);
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final String s : (List<Object>)lines$default) {
            final boolean b = true;
            if (b == StringsKt.startsWith$default(s, "CL: ", false, 2, (Object)null)) {
                final String s2 = s;
                final int beginIndex = 4;
                final int length = s.length();
                final String s3 = s2;
                if (s3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring = s3.substring(beginIndex, length);
                Intrinsics.checkExpressionValueIsNotNull((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final List split$default = StringsKt.split$default((CharSequence)substring, new String[] { " " }, false, 0, 6, (Object)null);
                final String s4 = split$default.get(0);
                final String s5 = split$default.get(1);
                final ArrayList<Object> list3;
                final ArrayList<String> list2 = new ArrayList<String>(CollectionsKt.collectionSizeOrDefault((Iterable)(list3 = list), 10));
                final Iterator<Class1364> iterator2 = list3.iterator();
                while (iterator2.hasNext()) {
                    list2.add(iterator2.next().Method5444());
                }
                if (list2.contains(s4)) {
                    continue;
                }
                list.add(new Class1364(s4, s5, (List)null, (List)null, 12, (DefaultConstructorMarker)null));
            }
            else if (b == StringsKt.startsWith$default(s, "FD: ", false, 2, (Object)null)) {
                final String s6 = s;
                final int beginIndex2 = 4;
                final int length2 = s.length();
                final String s7 = s6;
                if (s7 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring2 = s7.substring(beginIndex2, length2);
                Intrinsics.checkExpressionValueIsNotNull((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final List split$default2 = StringsKt.split$default((CharSequence)substring2, new String[] { " " }, false, 0, 6, (Object)null);
                final String s8 = split$default2.get(0);
                final int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence)s8, '/', 0, false, 6, (Object)null);
                final String s9 = s8;
                final int beginIndex3 = 0;
                final String s10 = s9;
                if (s10 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring3 = s10.substring(beginIndex3, lastIndexOf$default);
                Intrinsics.checkExpressionValueIsNotNull((Object)substring3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final String s11 = substring3;
                final String s12 = s8;
                final int beginIndex4 = lastIndexOf$default + 1;
                final int length3 = s8.length();
                final String s13 = s12;
                if (s13 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring4 = s13.substring(beginIndex4, length3);
                Intrinsics.checkExpressionValueIsNotNull((Object)substring4, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final String s14 = substring4;
                final String s15 = split$default2.get(1);
                final int lastIndexOf$default2 = StringsKt.lastIndexOf$default((CharSequence)s15, '/', 0, false, 6, (Object)null);
                final String s16 = s15;
                final int beginIndex5 = 0;
                final String s17 = s16;
                if (s17 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring5 = s17.substring(beginIndex5, lastIndexOf$default2);
                Intrinsics.checkExpressionValueIsNotNull((Object)substring5, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final String s18 = substring5;
                final String s19 = s15;
                final int beginIndex6 = lastIndexOf$default2 + 1;
                final int length4 = s15.length();
                final String s20 = s19;
                if (s20 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring6 = s20.substring(beginIndex6, length4);
                Intrinsics.checkExpressionValueIsNotNull((Object)substring6, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final String s21 = substring6;
                final ArrayList<Object> list4 = list;
                final ArrayList list5 = new ArrayList();
                for (final Class1364 class1364 : list4) {
                    if (Intrinsics.areEqual((Object)class1364.Method5444(), (Object)s11) && Intrinsics.areEqual((Object)class1364.Method5446(), (Object)s18)) {
                        continue;
                    }
                }
                if (!list5.isEmpty()) {}
                list.add(new Class1364(s11, s18, CollectionsKt.mutableListOf((Object[])new Class1709[] { new Class1709(s14, s21) }), (List)null, 8, (DefaultConstructorMarker)null));
            }
            else {
                if (b != StringsKt.startsWith$default(s, "MD: ", false, 2, (Object)null)) {
                    continue;
                }
                final String s22 = s;
                final int beginIndex7 = 4;
                final int length5 = s.length();
                final String s23 = s22;
                if (s23 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring7 = s23.substring(beginIndex7, length5);
                Intrinsics.checkExpressionValueIsNotNull((Object)substring7, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final List split$default3 = StringsKt.split$default((CharSequence)substring7, new String[] { " " }, false, 0, 6, (Object)null);
                final String s24 = split$default3.get(0);
                final int lastIndexOf$default3 = StringsKt.lastIndexOf$default((CharSequence)s24, '/', 0, false, 6, (Object)null);
                final String s25 = s24;
                final int beginIndex8 = 0;
                final String s26 = s25;
                if (s26 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring8 = s26.substring(beginIndex8, lastIndexOf$default3);
                Intrinsics.checkExpressionValueIsNotNull((Object)substring8, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final String s27 = substring8;
                final String s28 = s24;
                final int beginIndex9 = lastIndexOf$default3 + 1;
                final int length6 = s24.length();
                final String s29 = s28;
                if (s29 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring9 = s29.substring(beginIndex9, length6);
                Intrinsics.checkExpressionValueIsNotNull((Object)substring9, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final String s30 = substring9;
                final String s31 = split$default3.get(1);
                final String s32 = split$default3.get(2);
                final int lastIndexOf$default4 = StringsKt.lastIndexOf$default((CharSequence)s32, '/', 0, false, 6, (Object)null);
                final String s33 = s32;
                final int beginIndex10 = 0;
                final String s34 = s33;
                if (s34 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring10 = s34.substring(beginIndex10, lastIndexOf$default4);
                Intrinsics.checkExpressionValueIsNotNull((Object)substring10, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final String s35 = substring10;
                final String s36 = s32;
                final int beginIndex11 = lastIndexOf$default4 + 1;
                final int length7 = s32.length();
                final String s37 = s36;
                if (s37 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring11 = s37.substring(beginIndex11, length7);
                Intrinsics.checkExpressionValueIsNotNull((Object)substring11, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final String s38 = substring11;
                final ArrayList<Object> list6 = list;
                final ArrayList list7 = new ArrayList();
                for (final Class1364 class1365 : list6) {
                    if (Intrinsics.areEqual((Object)class1365.Method5444(), (Object)s27) && Intrinsics.areEqual((Object)class1365.Method5446(), (Object)s35)) {
                        continue;
                    }
                }
                if (!list7.isEmpty()) {}
                list.add(new Class1364(s27, s35, (List)new ArrayList(), CollectionsKt.mutableListOf((Object[])new Class827[] { new Class827(s30, s31, s38) })));
            }
        }
        final StringBuilder sb = new StringBuilder();
        for (final Class1364 obj3 : list) {
            sb.append(new StringBuilder().append(obj3).append('\n').toString());
            final Iterator iterator6 = obj3.Method5448().iterator();
            while (iterator6.hasNext()) {
                sb.append(new StringBuilder().append('\t').append(iterator6.next()).append('\n').toString());
            }
            final Iterator iterator7 = obj3.Method5449().iterator();
            while (iterator7.hasNext()) {
                sb.append(new StringBuilder().append('\t').append(iterator7.next()).append('\n').toString());
            }
        }
        final String string = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, "output.toString()");
        FilesKt.writeText$default(obj2, string, (Charset)null, 2, (Object)null);
    }
    
    private Class1808() {
    }
    
    static {
        Field16320 = new Class1808();
    }
    
    private static String Method6827(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x784D ^ 0xD4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
