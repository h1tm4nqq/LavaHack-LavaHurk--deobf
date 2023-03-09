/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
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
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.client.Class1364;
import lavahack.client.Class1709;
import lavahack.client.Class827;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/features/catlua/mapping/TSrgUtil;", "", "()V", "fromSrg", "", "srgFile", "Ljava/io/File;", "tsrgFile", "parseTSrg", "", "Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Clazz;", "lines", "", "toSrg", "classes", "Clazz", "Field", "Method", "kisman.cc"})
public final class Class1808 {
    public static final Class1808 Field16320;
    private String Field16321 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final List Method6823(@NotNull @NotNull List list) {
        Intrinsics.checkParameterIsNotNull((Object)list, (String)"lines");
        boolean bl = false;
        List list2 = new ArrayList();
        Class1364 class1364 = null;
        Object object = list;
        boolean bl2 = false;
        int n = 0;
        Object object2 = object.iterator();
        block7: while (true) {
            Object object3;
            String string;
            if (!object2.hasNext()) {
                Class1364 class13642 = class1364;
                if (class13642 == null) return list2;
                object = class13642;
                bl2 = false;
                n = 0;
                object2 = object;
                boolean bl3 = false;
                if (list2.contains(object2)) return list2;
                list2.add(object2);
                return list2;
            }
            Object t = object2.next();
            int n2 = n++;
            boolean bl4 = false;
            int n3 = n2;
            String string2 = (String)t;
            int n4 = n3;
            boolean bl5 = false;
            if (StringsKt.startsWith$default((String)string2, (String)"#", (boolean)false, (int)2, null)) continue;
            Object object4 = string2;
            boolean bl6 = false;
            String string3 = object4;
            if (string3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            object4 = ((Object)StringsKt.trim((CharSequence)string3)).toString();
            bl6 = false;
            boolean bl7 = object4.length() == 0;
            if (StringsKt.startsWith$default((String)string2, (String)"\t", (boolean)false, (int)2, null) || StringsKt.startsWith$default((String)string2, (String)" ", (boolean)false, (int)2, null)) {
                if (class1364 == null) {
                    throw (Throwable)new RuntimeException("Parse error on line " + n4 + ": no class\n" + string2);
                }
                Object object5 = string2;
                boolean bl8 = false;
                String string4 = object5;
                if (string4 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                object4 = ((Object)StringsKt.trim((CharSequence)string4)).toString();
                object5 = StringsKt.split$default((CharSequence)object4, (String[])new String[]{" "}, (boolean)false, (int)0, (int)6, null);
                switch (object5.size()) {
                    case 2: {
                        string = (String)object5.get(0);
                        object3 = (String)object5.get(1);
                        Class1364 class13643 = class1364;
                        if (class13643 == null) {
                            Intrinsics.throwNpe();
                        }
                        class13643.Method5448().add(new Class1709(string, (String)object3));
                        continue block7;
                    }
                    case 3: {
                        string = (String)object5.get(0);
                        object3 = (String)object5.get(1);
                        String string5 = (String)object5.get(2);
                        Class1364 class13644 = class1364;
                        if (class13644 == null) {
                            Intrinsics.throwNpe();
                        }
                        class13644.Method5449().add(new Class827(string, (String)object3, string5));
                        continue block7;
                    }
                }
                throw (Throwable)new RuntimeException("Parse error on line " + n4 + ": too many parts\n" + string2);
            }
            if (!StringsKt.contains$default((CharSequence)string2, (CharSequence)" ", (boolean)false, (int)2, null)) continue;
            Class1364 class13645 = class1364;
            if (class13645 != null) {
                object4 = class13645;
                bl6 = false;
                boolean bl9 = false;
                object3 = object4;
                boolean bl10 = false;
                list2.add(object3);
            }
            object4 = StringsKt.split$default((CharSequence)string2, (String[])new String[]{" "}, (boolean)false, (int)0, (int)6, null);
            switch (object4.size()) {
                case 2: {
                    String string6 = (String)object4.get(0);
                    string = (String)object4.get(1);
                    class1364 = new Class1364(string6, string, null, null, 12, null);
                    break;
                }
                default: {
                    throw (Throwable)new RuntimeException("Parse error on line " + n4 + ": class definition has too many parts\n" + string2);
                }
            }
        }
    }

    public final void Method6824(@NotNull @NotNull List list, @NotNull @NotNull File file) {
        Object object;
        Object object2;
        boolean bl;
        Object object3;
        Object object4;
        Intrinsics.checkParameterIsNotNull((Object)list, (String)"classes");
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"srgFile");
        Object object5 = list;
        boolean bl2 = false;
        Iterable iterable = object5;
        Object object6 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)object5, (int)10));
        boolean bl3 = false;
        for (Object t : iterable) {
            object4 = (Class1364)t;
            object3 = object6;
            bl = false;
            object2 = TuplesKt.to((Object)((Class1364)object4).Method5444(), (Object)((Class1364)object4).Method5446());
            object3.add(object2);
        }
        Map map = MapsKt.toMap((Iterable)((List)object6));
        object5 = new StringBuilder();
        Iterable iterable2 = list;
        boolean bl4 = false;
        for (Object e : iterable2) {
            boolean bl5;
            Object object7;
            Class1364 class1364 = (Class1364)e;
            boolean bl6 = false;
            if (Intrinsics.areEqual((Object)class1364.Method5444(), (Object)class1364.Method5446()) ^ true) {
                ((StringBuilder)object5).append("CL: " + class1364.Method5444() + ' ' + class1364.Method5446() + '\n');
            }
            object4 = class1364.Method5448();
            bl = false;
            Iterator iterator = object4.iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                object7 = (Class1709)object;
                bl5 = false;
                ((StringBuilder)object5).append("FD: " + class1364.Method5444() + '/' + ((Class1709)object7).Method6541() + ' ' + class1364.Method5446() + '/' + ((Class1709)object7).Method6543() + '\n');
            }
            object4 = class1364.Method5449();
            bl = false;
            iterator = object4.iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                object7 = (Class827)object;
                bl5 = false;
                String string = ((Class827)object7).Method3537(map);
                ((StringBuilder)object5).append("MD: " + class1364.Method5444() + '/' + ((Class827)object7).Method3538() + ' ' + ((Class827)object7).Method3540() + ' ' + class1364.Method5446() + '/' + ((Class827)object7).Method3542() + ' ' + string + '\n');
            }
        }
        String string = ((StringBuilder)object5).toString();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"output.toString()");
        iterable2 = CollectionsKt.sorted((Iterable)StringsKt.split$default((CharSequence)string, (String[])new String[]{"\n"}, (boolean)false, (int)0, (int)6, null));
        object3 = file;
        bl4 = false;
        object6 = iterable2;
        Collection collection = new ArrayList();
        boolean bl7 = false;
        Iterator iterator = object6.iterator();
        while (true) {
            boolean bl8;
            if (!iterator.hasNext()) {
                object2 = (List)collection;
                FilesKt.writeText$default((File)object3, (String)CollectionsKt.joinToString$default((Iterable)((Iterable)object2), (CharSequence)"\n", null, null, (int)0, null, null, (int)62, null), null, (int)2, null);
                return;
            }
            object4 = iterator.next();
            String string2 = (String)object4;
            boolean bl9 = false;
            object = string2;
            boolean bl10 = false;
            if (object.length() > 0) {
                bl8 = true;
                continue;
            }
            bl8 = false;
        }
    }

    @NotNull
    @NotNull
    public final List Method6825(@NotNull @NotNull File file, @NotNull @NotNull File file2) {
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"tsrgFile");
        Intrinsics.checkParameterIsNotNull((Object)file2, (String)"srgFile");
        if (!file2.exists()) {
            file2.createNewFile();
        }
        if (file2.exists() && !file2.isFile()) {
            throw (Throwable)new RuntimeException("srg path is not a file: " + file2);
        }
        if (!file.exists()) throw (Throwable)new RuntimeException("tsrg file not found: " + file);
        if (!file.isFile()) {
            throw (Throwable)new RuntimeException("tsrg file not found: " + file);
        }
        List list = this.Method6823(FilesKt.readLines$default((File)file, null, (int)1, null));
        this.Method6824(list, file2);
        return list;
    }

    public final void Method6826(@NotNull @NotNull File file, @NotNull @NotNull File file2) {
        boolean bl;
        Object object;
        Object object2;
        Object object3;
        boolean bl2;
        String string;
        Object object4;
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"srgFile");
        Intrinsics.checkParameterIsNotNull((Object)file2, (String)"tsrgFile");
        if (!file2.exists()) {
            file2.createNewFile();
        }
        if (file2.exists() && !file2.isFile()) {
            throw (Throwable)new RuntimeException("tsrg path is not a file: " + file2);
        }
        if (!file.exists()) throw (Throwable)new RuntimeException("srg file not found: " + file);
        if (!file.isFile()) {
            throw (Throwable)new RuntimeException("srg file not found: " + file);
        }
        List list = FilesKt.readLines$default((File)file, null, (int)1, null);
        boolean bl3 = false;
        List list2 = new ArrayList();
        Object object5 = list;
        boolean bl4 = false;
        Iterator iterator = object5.iterator();
        while (true) {
            Class1364 class1364;
            Object object6;
            Collection collection;
            Object object7;
            int n;
            String string2;
            Object object8;
            Object object9;
            Object object10;
            Object object11;
            block27: {
                String string3;
                Iterator iterator2;
                Iterable iterable;
                int n2;
                String string4;
                block26: {
                    int n3;
                    String string5;
                    block25: {
                        if (!iterator.hasNext()) break;
                        object4 = iterator.next();
                        string = (String)object4;
                        boolean bl5 = false;
                        bl2 = true;
                        if (bl2 == StringsKt.startsWith$default((String)string, (String)"CL: ", (boolean)false, (int)2, null)) {
                            object3 = string;
                            int n4 = 4;
                            int n5 = string.length();
                            boolean bl6 = false;
                            String string6 = object3;
                            if (string6 == null) {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                            Intrinsics.checkExpressionValueIsNotNull((Object)string6.substring(n4, n5), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                            object3 = StringsKt.split$default((CharSequence)((CharSequence)object2), (String[])new String[]{" "}, (boolean)false, (int)0, (int)6, null);
                            string5 = (String)object3.get(0);
                            String string7 = (String)object3.get(1);
                            object = list2;
                            bl = false;
                            object11 = object;
                            Collection collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(object, (int)10));
                            n3 = 0;
                            object10 = object11.iterator();
                            while (object10.hasNext()) {
                                object9 = object10.next();
                                object8 = (Class1364)object9;
                                Collection collection3 = collection2;
                                boolean bl7 = false;
                                String string8 = ((Class1364)object8).Method5444();
                                collection3.add(string8);
                            }
                            if (((List)collection2).contains(string5)) continue;
                            list2.add(new Class1364(string5, string7, null, null, 12, null));
                            continue;
                        }
                        if (bl2 != StringsKt.startsWith$default((String)string, (String)"FD: ", (boolean)false, (int)2, null)) break block25;
                        object3 = string;
                        int n6 = 4;
                        int n7 = string.length();
                        boolean bl8 = false;
                        String string9 = object3;
                        if (string9 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                        Intrinsics.checkExpressionValueIsNotNull((Object)string9.substring(n6, n7), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                        object3 = StringsKt.split$default((CharSequence)((CharSequence)object2), (String[])new String[]{" "}, (boolean)false, (int)0, (int)6, null);
                        string5 = (String)object3.get(0);
                        n7 = StringsKt.lastIndexOf$default((CharSequence)string5, (char)'/', (int)0, (boolean)false, (int)6, null);
                        string4 = string5;
                        int n8 = 0;
                        int n9 = 0;
                        String string10 = string4;
                        if (string10 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                        Intrinsics.checkExpressionValueIsNotNull((Object)string10.substring(n8, n7), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                        object11 = string5;
                        n9 = n7 + 1;
                        n3 = string5.length();
                        boolean bl9 = false;
                        Object object12 = object11;
                        if (object12 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                        String string11 = ((String)object12).substring(n9, n3);
                        Intrinsics.checkExpressionValueIsNotNull((Object)string11, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                        string4 = string11;
                        object11 = (String)object3.get(1);
                        n9 = StringsKt.lastIndexOf$default((CharSequence)((CharSequence)object11), (char)'/', (int)0, (boolean)false, (int)6, null);
                        object10 = object11;
                        int n10 = 0;
                        int n11 = 0;
                        Object object13 = object10;
                        if (object13 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                        Intrinsics.checkExpressionValueIsNotNull((Object)((String)object13).substring(n10, n9), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                        object9 = object11;
                        n11 = n9 + 1;
                        n2 = ((String)object11).length();
                        boolean bl10 = false;
                        Object object14 = object9;
                        if (object14 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                        String string12 = ((String)object14).substring(n11, n2);
                        Intrinsics.checkExpressionValueIsNotNull((Object)string12, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                        object10 = string12;
                        object8 = list2;
                        n2 = 0;
                        Object object15 = object8;
                        iterable = new ArrayList();
                        boolean bl11 = false;
                        iterator2 = object15.iterator();
                        break block26;
                    }
                    if (bl2 != StringsKt.startsWith$default((String)string, (String)"MD: ", (boolean)false, (int)2, null)) continue;
                    object3 = string;
                    int n12 = 4;
                    int n13 = string.length();
                    boolean bl12 = false;
                    Object object16 = object3;
                    if (object16 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    Intrinsics.checkExpressionValueIsNotNull((Object)((String)object16).substring(n12, n13), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    object3 = StringsKt.split$default((CharSequence)((CharSequence)object2), (String[])new String[]{" "}, (boolean)false, (int)0, (int)6, null);
                    string5 = (String)object3.get(0);
                    n13 = StringsKt.lastIndexOf$default((CharSequence)string5, (char)'/', (int)0, (boolean)false, (int)6, null);
                    string2 = string5;
                    int n14 = 0;
                    int n15 = 0;
                    String string13 = string2;
                    if (string13 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    Intrinsics.checkExpressionValueIsNotNull((Object)string13.substring(n14, n13), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    object11 = string5;
                    n15 = n13 + 1;
                    n3 = string5.length();
                    boolean bl13 = false;
                    Object object17 = object11;
                    if (object17 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    String string14 = ((String)object17).substring(n15, n3);
                    Intrinsics.checkExpressionValueIsNotNull((Object)string14, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    string2 = string14;
                    object11 = (String)object3.get(1);
                    String string15 = (String)object3.get(2);
                    n3 = StringsKt.lastIndexOf$default((CharSequence)string15, (char)'/', (int)0, (boolean)false, (int)6, null);
                    object9 = string15;
                    int n16 = 0;
                    int n17 = 0;
                    Object object18 = object9;
                    if (object18 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    Intrinsics.checkExpressionValueIsNotNull((Object)((String)object18).substring(n16, n3), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    object8 = string15;
                    n17 = n3 + 1;
                    n = string15.length();
                    boolean bl14 = false;
                    Object object19 = object8;
                    if (object19 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    String string16 = ((String)object19).substring(n17, n);
                    Intrinsics.checkExpressionValueIsNotNull((Object)string16, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    object9 = string16;
                    object7 = list2;
                    n = 0;
                    iterable = object7;
                    collection = new ArrayList();
                    boolean bl15 = false;
                    object6 = iterable.iterator();
                    break block27;
                }
                while (iterator2.hasNext()) {
                    boolean bl16;
                    object6 = iterator2.next();
                    class1364 = (Class1364)object6;
                    boolean bl17 = false;
                    if (Intrinsics.areEqual((Object)class1364.Method5444(), (Object)object) && Intrinsics.areEqual((Object)class1364.Method5446(), (Object)string3)) {
                        bl16 = true;
                        continue;
                    }
                    bl16 = false;
                }
                object9 = (List)iterable;
                object8 = (Collection)object9;
                n2 = 0;
                boolean bl18 = !object8.isEmpty();
                object8 = new Class1364((String)object, string3, CollectionsKt.mutableListOf((Object[])new Class1709[]{new Class1709(string4, (String)object10)}), null, 8, null);
                list2.add(object8);
                continue;
            }
            while (object6.hasNext()) {
                boolean bl19;
                Class1364 class13642 = class1364 = object6.next();
                boolean bl20 = false;
                if (Intrinsics.areEqual((Object)class13642.Method5444(), (Object)object) && Intrinsics.areEqual((Object)class13642.Method5446(), (Object)object10)) {
                    bl19 = true;
                    continue;
                }
                bl19 = false;
            }
            object8 = (List)collection;
            object7 = (Collection)object8;
            n = 0;
            boolean bl21 = !object7.isEmpty();
            Object object20 = object10;
            Object object21 = object;
            n = 0;
            List list3 = new ArrayList();
            List list4 = CollectionsKt.mutableListOf((Object[])new Class827[]{new Class827(string2, (String)object11, (String)object9)});
            List list5 = list3;
            Object object22 = object20;
            Object object23 = object21;
            object7 = new Class1364((String)object23, (String)object22, list5, list4);
            list2.add(object7);
        }
        object5 = new StringBuilder();
        Iterable iterable = list2;
        boolean bl22 = false;
        object4 = iterable.iterator();
        block4: while (true) {
            if (!object4.hasNext()) {
                String string17 = ((StringBuilder)object5).toString();
                Intrinsics.checkExpressionValueIsNotNull((Object)string17, (String)"output.toString()");
                FilesKt.writeText$default((File)file2, (String)string17, null, (int)2, null);
                return;
            }
            string = object4.next();
            Class1364 class1364 = (Class1364)((Object)string);
            bl2 = false;
            ((StringBuilder)object5).append("" + class1364 + '\n');
            object3 = class1364.Method5448();
            boolean bl23 = false;
            Iterator iterator3 = object3.iterator();
            while (iterator3.hasNext()) {
                object = iterator3.next();
                object2 = (Class1709)object;
                bl = false;
                ((StringBuilder)object5).append("" + '\t' + object2 + '\n');
            }
            object3 = class1364.Method5449();
            bl23 = false;
            iterator3 = object3.iterator();
            while (true) {
                if (!iterator3.hasNext()) continue block4;
                object = iterator3.next();
                object2 = (Class827)object;
                bl = false;
                ((StringBuilder)object5).append("" + '\t' + object2 + '\n');
            }
            break;
        }
    }

    private Class1808() {
    }

    static {
        Class1808 class1808;
        Field16320 = class1808 = new Class1808();
    }

    private static String Method6827(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 212;
            cArray2[n] = (char)(cArray[n] ^ (0x784D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

