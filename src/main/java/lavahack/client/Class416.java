/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.TypeCastException
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.MapsKt
 *  kotlin.io.FilesKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package lavahack.client;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.client.Class1560;
import lavahack.client.Class1797;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00070\u00042\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00072\u0006\u0010\u000b\u001a\u00020\tJ\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00072\u0006\u0010\r\u001a\u00020\tJ\u0011\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0082\b\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/features/catlua/mapping/MappingsGenerator;", "", "()V", "generateClassMappings", "Lkotlin/Pair;", "", "", "", "classFile", "Ljava/io/File;", "generateFieldMappings", "fieldFile", "generateMethodMappings", "methodFile", "unquote", "s", "ClassMapping", "FieldMapping", "kisman.cc"})
public final class Class416 {
    public static final Class416 Field9727;
    private int Field9728;

    private final String Method2034(String string) {
        boolean bl = false;
        String string2 = string;
        int n = 1;
        int n2 = string.length() - 1;
        boolean bl2 = false;
        String string3 = string2;
        if (string3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String string4 = string3.substring(n, n2);
        Intrinsics.checkExpressionValueIsNotNull((Object)string4, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return string4;
    }

    @NotNull
    @NotNull
    public final Pair Method2035(@NotNull @NotNull File file) {
        Object object;
        boolean bl;
        Object object2;
        List<Object> list;
        Object object32;
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"classFile");
        List list2 = CollectionsKt.toMutableList((Collection)FilesKt.readLines$default((File)file, null, (int)1, null));
        list2.remove(0);
        boolean bl2 = false;
        List list3 = new ArrayList();
        Iterable iterable = list2;
        boolean bl3 = false;
        for (Object object32 : iterable) {
            String string;
            String string2 = (String)object32;
            boolean bl4 = false;
            list = StringsKt.split$default((CharSequence)string2, (String[])new String[]{","}, (boolean)false, (int)0, (int)6, null);
            object2 = Field9727;
            Object object4 = (String)list.get(0);
            boolean bl5 = false;
            Object object5 = object4;
            int n = 1;
            int n2 = ((String)object4).length() - 1;
            int n3 = 0;
            String string3 = object5;
            if (string3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            Intrinsics.checkExpressionValueIsNotNull((Object)string3.substring(n, n2), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object4 = Field9727;
            Object object6 = (String)list.get(1);
            boolean bl6 = false;
            String string4 = object6;
            n2 = 1;
            n3 = ((String)object6).length() - 1;
            int n4 = 0;
            String string5 = string4;
            if (string5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string6 = string5.substring(n2, n3);
            Intrinsics.checkExpressionValueIsNotNull((Object)string6, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object2 = string6;
            object6 = Field9727;
            String string7 = (String)list.get(4);
            n = 0;
            Object object7 = string7;
            n3 = 1;
            n4 = string7.length() - 1;
            boolean bl7 = false;
            String string8 = object7;
            if (string8 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string9 = string8.substring(n3, n4);
            Intrinsics.checkExpressionValueIsNotNull((Object)string9, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object6 = string9;
            boolean bl8 = false;
            bl = Integer.parseInt((String)object6) == 0;
            bl5 = false;
            object5 = list3;
            n = 0;
            object7 = object5.iterator();
            while (object7.hasNext()) {
                Object e = object7.next();
                Class1560 class1560 = (Class1560)e;
                bl7 = false;
                if (!Intrinsics.areEqual((Object)class1560.Method6143(), (Object)string) || class1560.Method6144() != null && class1560.Method6146() != null) continue;
                bl5 = true;
                class1560.Method6147((String)object2);
            }
            list3.add(new Class1560(string, null, (String)object2));
        }
        iterable = list3;
        bl3 = false;
        Object object8 = iterable;
        object32 = new ArrayList();
        boolean bl9 = false;
        Iterator iterator = object8.iterator();
        while (iterator.hasNext()) {
            boolean bl10;
            list = iterator.next();
            object2 = (Class1560)((Object)list);
            bl = false;
            if (((Class1560)object2).Method6144() == null && ((Class1560)object2).Method6146() != null) {
                bl10 = true;
                continue;
            }
            bl10 = false;
        }
        Collection<Object> collection = (List)object32;
        iterable = collection;
        bl3 = false;
        object8 = iterable;
        object32 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)10));
        bl9 = false;
        iterator = object8.iterator();
        while (iterator.hasNext()) {
            list = iterator.next();
            object2 = (Class1560)((Object)list);
            collection = object32;
            bl = false;
            if (((Class1560)object2).Method6146() == null) {
                Intrinsics.throwNpe();
            }
            collection.add(object);
        }
        collection = (List)object32;
        iterable = list3;
        bl3 = false;
        object8 = iterable;
        object32 = new ArrayList();
        bl9 = false;
        iterator = object8.iterator();
        while (iterator.hasNext()) {
            boolean bl11;
            list = iterator.next();
            object2 = (Class1560)((Object)list);
            bl = false;
            if (((Class1560)object2).Method6144() != null && ((Class1560)object2).Method6146() != null) {
                bl11 = true;
                continue;
            }
            bl11 = false;
        }
        object = (List)object32;
        iterable = (Iterable)object;
        bl3 = false;
        object8 = iterable;
        object32 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)10));
        bl9 = false;
        iterator = object8.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                object = (List)object32;
                Map map = MapsKt.toMap((Iterable)((Iterable)object));
                Collection<Object> collection2 = collection;
                return new Pair(collection2, (Object)map);
            }
            list = iterator.next();
            object2 = (Class1560)((Object)list);
            object = object32;
            bl = false;
            String string = ((Class1560)object2).Method6146();
            if (string == null) {
                Intrinsics.throwNpe();
            }
            String string10 = ((Class1560)object2).Method6144();
            if (string10 == null) {
                Intrinsics.throwNpe();
            }
            Pair pair = TuplesKt.to((Object)string, (Object)string10);
            object.add(pair);
        }
    }

    @NotNull
    @NotNull
    public final Map Method2036(@NotNull @NotNull File file) {
        Object object;
        List<Object> list;
        Object object22;
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"fieldFile");
        List list2 = CollectionsKt.toMutableList((Collection)FilesKt.readLines$default((File)file, null, (int)1, null));
        list2.remove(0);
        boolean bl = false;
        List list3 = new ArrayList();
        Iterable iterable = list2;
        boolean bl2 = false;
        for (Object object22 : iterable) {
            String string;
            String string2 = (String)object22;
            boolean bl3 = false;
            list = StringsKt.split$default((CharSequence)string2, (String[])new String[]{","}, (boolean)false, (int)0, (int)6, null);
            object = Field9727;
            Object object3 = (String)list.get(1);
            boolean bl4 = false;
            Object object4 = object3;
            int n = 1;
            int n2 = ((String)object3).length() - 1;
            int n3 = 0;
            String string3 = object4;
            if (string3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            Intrinsics.checkExpressionValueIsNotNull((Object)string3.substring(n, n2), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object3 = Field9727;
            Object object5 = (String)list.get(5);
            boolean bl5 = false;
            String string4 = object5;
            n2 = 1;
            n3 = ((String)object5).length() - 1;
            int n4 = 0;
            String string5 = string4;
            if (string5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string6 = string5.substring(n2, n3);
            Intrinsics.checkExpressionValueIsNotNull((Object)string6, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object = string6;
            object5 = Field9727;
            object4 = (String)list.get(2);
            boolean bl6 = false;
            String string7 = object4;
            n3 = 1;
            n4 = ((String)object4).length() - 1;
            int n5 = 0;
            String string8 = string7;
            if (string8 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string9 = string8.substring(n3, n4);
            Intrinsics.checkExpressionValueIsNotNull((Object)string9, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object3 = string9;
            object4 = Field9727;
            String string10 = (String)list.get(6);
            boolean bl7 = false;
            String string11 = string10;
            n4 = 1;
            n5 = string10.length() - 1;
            int n6 = 0;
            String string12 = string11;
            if (string12 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string13 = string12.substring(n4, n5);
            Intrinsics.checkExpressionValueIsNotNull((Object)string13, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object5 = string13;
            object4 = (String)object5 + '.' + (String)object3;
            Object object6 = Field9727;
            string11 = (String)list.get(8);
            n4 = 0;
            String string14 = string11;
            n6 = 1;
            int n7 = string11.length() - 1;
            boolean bl8 = false;
            String string15 = string14;
            if (string15 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string16 = string15.substring(n6, n7);
            Intrinsics.checkExpressionValueIsNotNull((Object)string16, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object6 = string16;
            boolean bl9 = false;
            n = Integer.parseInt((String)object6) == 0 ? 1 : 0;
            n2 = 0;
            Iterable iterable2 = list3;
            n4 = 0;
            for (Object e : iterable2) {
                Class1797 class1797 = (Class1797)e;
                bl8 = false;
                if (!Intrinsics.areEqual((Object)class1797.Method6797(), (Object)object) || !Intrinsics.areEqual((Object)class1797.Method6796(), (Object)string)) continue;
                n2 = 1;
                class1797.Method6801((String)object4);
            }
            list3.add(new Class1797(string, (String)object, null, (String)object4));
        }
        iterable = list3;
        bl2 = false;
        Object object7 = iterable;
        object22 = new ArrayList();
        boolean bl10 = false;
        Iterator iterator = object7.iterator();
        while (iterator.hasNext()) {
            boolean bl11;
            list = iterator.next();
            object = (Class1797)((Object)list);
            boolean bl12 = false;
            if (((Class1797)object).Method6798() != null && ((Class1797)object).Method6800() != null) {
                String string = ((Class1797)object).Method6798();
                if (string == null) {
                    Intrinsics.throwNpe();
                }
                String string17 = (String)StringsKt.split$default((CharSequence)string, (String[])new String[]{"."}, (boolean)false, (int)0, (int)6, null).get(1);
                String string18 = ((Class1797)object).Method6800();
                if (string18 == null) {
                    Intrinsics.throwNpe();
                }
                if (Intrinsics.areEqual((Object)string17, (Object)((String)StringsKt.split$default((CharSequence)string18, (String[])new String[]{"."}, (boolean)false, (int)0, (int)6, null).get(1))) ^ true) {
                    bl11 = true;
                    continue;
                }
            }
            bl11 = false;
        }
        iterable = (List)object22;
        bl2 = false;
        object7 = iterable;
        object22 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)10));
        bl10 = false;
        iterator = object7.iterator();
        while (iterator.hasNext()) {
            list = iterator.next();
            object = (Class1797)((Object)list);
            Object object8 = object22;
            boolean bl13 = false;
            String string = ((Class1797)object).Method6800();
            if (string == null) {
                Intrinsics.throwNpe();
            }
            String string19 = ((Class1797)object).Method6798();
            if (string19 == null) {
                Intrinsics.throwNpe();
            }
            Pair pair = TuplesKt.to((Object)string, (Object)string19);
            object8.add((Pair)pair);
        }
        return MapsKt.toSortedMap((Map)MapsKt.toMap((Iterable)((List)object22)));
    }

    @NotNull
    @NotNull
    public final Map Method2037(@NotNull @NotNull File file) {
        Object object;
        List<Object> list;
        Object object22;
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"methodFile");
        List list2 = CollectionsKt.toMutableList((Collection)FilesKt.readLines$default((File)file, null, (int)1, null));
        list2.remove(0);
        boolean bl = false;
        List list3 = new ArrayList();
        Iterable iterable = list2;
        boolean bl2 = false;
        for (Object object22 : iterable) {
            String string;
            String string2 = (String)object22;
            boolean bl3 = false;
            list = StringsKt.split$default((CharSequence)string2, (String[])new String[]{","}, (boolean)false, (int)0, (int)6, null);
            object = Field9727;
            Object object3 = (String)list.get(1);
            boolean bl4 = false;
            Object object4 = object3;
            int n = 1;
            int n2 = ((String)object3).length() - 1;
            int n3 = 0;
            String string3 = object4;
            if (string3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            Intrinsics.checkExpressionValueIsNotNull((Object)string3.substring(n, n2), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object3 = Field9727;
            Object object5 = (String)list.get(5);
            boolean bl5 = false;
            String string4 = object5;
            n2 = 1;
            n3 = ((String)object5).length() - 1;
            int n4 = 0;
            String string5 = string4;
            if (string5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string6 = string5.substring(n2, n3);
            Intrinsics.checkExpressionValueIsNotNull((Object)string6, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object = string6;
            object5 = Field9727;
            object4 = (String)list.get(2);
            boolean bl6 = false;
            String string7 = object4;
            n3 = 1;
            n4 = ((String)object4).length() - 1;
            int n5 = 0;
            String string8 = string7;
            if (string8 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string9 = string8.substring(n3, n4);
            Intrinsics.checkExpressionValueIsNotNull((Object)string9, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object3 = string9;
            object4 = Field9727;
            Object object6 = (String)list.get(4);
            boolean bl7 = false;
            String string10 = object6;
            n4 = 1;
            n5 = ((String)object6).length() - 1;
            int n6 = 0;
            String string11 = string10;
            if (string11 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string12 = string11.substring(n4, n5);
            Intrinsics.checkExpressionValueIsNotNull((Object)string12, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object5 = string12;
            object6 = Field9727;
            String string13 = (String)list.get(6);
            boolean bl8 = false;
            String string14 = string13;
            n5 = 1;
            n6 = string13.length() - 1;
            int n7 = 0;
            String string15 = string14;
            if (string15 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string16 = string15.substring(n5, n6);
            Intrinsics.checkExpressionValueIsNotNull((Object)string16, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object4 = string16;
            object6 = (String)object4 + '.' + (String)object3 + '.' + (String)object5;
            Object object7 = Field9727;
            string14 = (String)list.get(8);
            n5 = 0;
            String string17 = string14;
            n7 = 1;
            int n8 = string14.length() - 1;
            boolean bl9 = false;
            String string18 = string17;
            if (string18 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string19 = string18.substring(n7, n8);
            Intrinsics.checkExpressionValueIsNotNull((Object)string19, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object7 = string19;
            boolean bl10 = false;
            n2 = Integer.parseInt((String)object7) == 0 ? 1 : 0;
            n3 = 0;
            Iterable iterable2 = list3;
            n5 = 0;
            for (Object e : iterable2) {
                Class1797 class1797 = (Class1797)e;
                bl9 = false;
                if (!Intrinsics.areEqual((Object)class1797.Method6797(), (Object)object) || !Intrinsics.areEqual((Object)class1797.Method6796(), (Object)string)) continue;
                n3 = 1;
                class1797.Method6801((String)object6);
            }
            list3.add(new Class1797(string, (String)object, null, (String)object6));
        }
        iterable = list3;
        bl2 = false;
        Object object8 = iterable;
        object22 = new ArrayList();
        boolean bl11 = false;
        Iterator iterator = object8.iterator();
        while (iterator.hasNext()) {
            boolean bl12;
            list = iterator.next();
            object = (Class1797)((Object)list);
            boolean bl13 = false;
            if (((Class1797)object).Method6798() != null && ((Class1797)object).Method6800() != null) {
                String string = ((Class1797)object).Method6798();
                if (string == null) {
                    Intrinsics.throwNpe();
                }
                String string20 = (String)StringsKt.split$default((CharSequence)string, (String[])new String[]{"."}, (boolean)false, (int)0, (int)6, null).get(1);
                String string21 = ((Class1797)object).Method6800();
                if (string21 == null) {
                    Intrinsics.throwNpe();
                }
                if (Intrinsics.areEqual((Object)string20, (Object)((String)StringsKt.split$default((CharSequence)string21, (String[])new String[]{"."}, (boolean)false, (int)0, (int)6, null).get(1))) ^ true) {
                    bl12 = true;
                    continue;
                }
            }
            bl12 = false;
        }
        iterable = (List)object22;
        bl2 = false;
        object8 = iterable;
        object22 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)10));
        bl11 = false;
        iterator = object8.iterator();
        while (iterator.hasNext()) {
            list = iterator.next();
            object = (Class1797)((Object)list);
            Object object9 = object22;
            boolean bl14 = false;
            String string = ((Class1797)object).Method6800();
            if (string == null) {
                Intrinsics.throwNpe();
            }
            String string22 = ((Class1797)object).Method6798();
            if (string22 == null) {
                Intrinsics.throwNpe();
            }
            Pair pair = TuplesKt.to((Object)string, (Object)string22);
            object9.add((Pair)pair);
        }
        return MapsKt.toSortedMap((Map)MapsKt.toMap((Iterable)((List)object22)));
    }

    private Class416() {
    }

    static {
        Class416 class416;
        Field9727 = class416 = new Class416();
    }

    private static String Method2038(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 204;
            cArray2[n] = (char)(cArray[n] ^ (0x35BF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

