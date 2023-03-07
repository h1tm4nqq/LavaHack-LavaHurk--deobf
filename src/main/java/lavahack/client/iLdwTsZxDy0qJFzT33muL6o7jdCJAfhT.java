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
import lavahack.client.iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00070\u00042\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00072\u0006\u0010\u000b\u001a\u00020\tJ\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00072\u0006\u0010\r\u001a\u00020\tJ\u0011\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0082\b\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/features/catlua/mapping/MappingsGenerator;", "", "()V", "generateClassMappings", "Lkotlin/Pair;", "", "", "", "classFile", "Ljava/io/File;", "generateFieldMappings", "fieldFile", "generateMethodMappings", "methodFile", "unquote", "s", "ClassMapping", "FieldMapping", "kisman.cc"})
public final class iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT {
    public static final iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT Field9727;
    private int Field9728;

    private final String Method2034(String string) {
        int n = (int)((long)305059960 ^ (long)305059960);
        String string2 = string;
        int n2 = (int)((long)1177334426 ^ (long)1177334427);
        int n3 = string.length() - (int)((long)1326126209 ^ (long)1326126208);
        int n4 = (int)((long)82231397 ^ (long)82231397);
        String string3 = string2;
        if (string3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String string4 = string3.substring(n2, n3);
        Intrinsics.checkExpressionValueIsNotNull((Object)string4, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return string4;
    }

    @NotNull
    @NotNull
    public final Pair Method2035(@NotNull @NotNull File file) {
        Object object;
        int n;
        Object object2;
        Object object3;
        Object object42;
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"classFile");
        List list = CollectionsKt.toMutableList((Collection)FilesKt.readLines$default((File)file, null, (int)((int)((long)80664372 ^ (long)80664373)), null));
        list.remove((int)((long)-960580865 ^ (long)-960580865));
        int n2 = (int)-1494519188L ^ 0xA6EB726C;
        List list2 = new ArrayList();
        Iterable iterable = list;
        int n3 = (int)((long)-1171713327 ^ (long)-1171713327);
        for (Object object42 : iterable) {
            String string;
            String string2 = (String)object42;
            int n4 = (int)((long)-327506907 ^ (long)-327506907);
            String[] stringArray = new String[(int)-363302773L ^ 0xEA58708A];
            stringArray[(int)((long)1684592937 ^ (long)1684592937)] = ",";
            object3 = StringsKt.split$default((CharSequence)string2, (String[])stringArray, ((int)851107716L ^ 0x32BADF84) != 0, (int)((int)2002240270L ^ 0x7757C30E), (int)((int)((long)333218305 ^ (long)333218306) << 1), null);
            object2 = Field9727;
            Object object5 = (String)object3.get((int)1502559837L ^ 0x598F3E5D);
            int n5 = (int)((long)-1988610402 ^ (long)-1988610402);
            Object object6 = object5;
            int n6 = (int)((long)770371305 ^ (long)770371304);
            int n7 = ((String)object5).length() - (int)((long)-1743281996 ^ (long)-1743281995);
            int n8 = (int)((long)2049196765 ^ (long)2049196765);
            String string3 = object6;
            if (string3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            Intrinsics.checkExpressionValueIsNotNull((Object)string3.substring(n6, n7), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object5 = Field9727;
            Object object7 = (String)object3.get((int)((long)507470610 ^ (long)507470611));
            int n9 = (int)1048168618L ^ 0x3E79C8AA;
            String string4 = object7;
            n7 = (int)((long)-1567053600 ^ (long)-1567053599);
            n8 = ((String)object7).length() - ((int)-1703350101L ^ 0x9A78F0AA);
            int n10 = (int)856574604L ^ 0x330E4A8C;
            String string5 = string4;
            if (string5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string6 = string5.substring(n7, n8);
            Intrinsics.checkExpressionValueIsNotNull((Object)string6, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object2 = string6;
            object7 = Field9727;
            String string7 = (String)object3.get((int)((long)-1655370108 ^ (long)-1655370107) << 2);
            n6 = (int)((long)-1739792961 ^ (long)-1739792961);
            Object object8 = string7;
            n8 = (int)((long)695831058 ^ (long)695831059);
            n10 = string7.length() - ((int)-1471522709L ^ 0xA84A586A);
            int n11 = (int)((long)1919449180 ^ (long)1919449180);
            String string8 = object8;
            if (string8 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string9 = string8.substring(n8, n10);
            Intrinsics.checkExpressionValueIsNotNull((Object)string9, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object7 = string9;
            int n12 = (int)((long)1906751003 ^ (long)1906751003);
            n = Integer.parseInt((String)object7) == 0 ? (int)((long)657411493 ^ (long)657411492) : (int)((long)840888927 ^ (long)840888927);
            n5 = (int)1715768088L ^ 0x66448B18;
            object6 = list2;
            n6 = (int)2123630079L ^ 0x7E9405FF;
            object8 = object6.iterator();
            while (object8.hasNext()) {
                Object e = object8.next();
                iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)e;
                n11 = (int)1533985226L ^ 0x5B6EC1CA;
                if (!Intrinsics.areEqual((Object)iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6143(), (Object)string) || iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6144() != null && iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6146() != null) continue;
                n5 = (int)((long)941775579 ^ (long)941775578);
                iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6147((String)object2);
            }
            list2.add(new iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(string, null, (String)object2));
        }
        iterable = list2;
        n3 = (int)635713662L ^ 0x25E4387E;
        Object object9 = iterable;
        object42 = new ArrayList();
        int n13 = (int)2078302212L ^ 0x7BE06004;
        Iterator iterator = object9.iterator();
        while (iterator.hasNext()) {
            int n14;
            object3 = iterator.next();
            object2 = (iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object3;
            n = (int)((long)1340390492 ^ (long)1340390492);
            if (((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method6144() == null && ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method6146() != null) {
                n14 = (int)1048571558L ^ 0x3E7FEEA7;
                continue;
            }
            n14 = (int)((long)276658587 ^ (long)276658587);
        }
        Collection<Object> collection = (List)object42;
        iterable = collection;
        n3 = (int)1274450814L ^ 0x4BF6937E;
        object9 = iterable;
        object42 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)((int)((long)-1153314907 ^ (long)-1153314912) << 1)));
        n13 = (int)561068955L ^ 0x21713B9B;
        iterator = object9.iterator();
        while (iterator.hasNext()) {
            object3 = iterator.next();
            object2 = (iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object3;
            collection = object42;
            n = (int)1540347944L ^ 0x5BCFD828;
            if (((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method6146() == null) {
                Intrinsics.throwNpe();
            }
            collection.add(object);
        }
        collection = (List)object42;
        iterable = list2;
        n3 = (int)-427208482L ^ 0xE68950DE;
        object9 = iterable;
        object42 = new ArrayList();
        n13 = (int)((long)-572821831 ^ (long)-572821831);
        iterator = object9.iterator();
        while (iterator.hasNext()) {
            int n15;
            object3 = iterator.next();
            object2 = (iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object3;
            n = (int)((long)2074922241 ^ (long)2074922241);
            if (((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method6144() != null && ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method6146() != null) {
                n15 = (int)((long)-2134845449 ^ (long)-2134845450);
                continue;
            }
            n15 = (int)((long)878822591 ^ (long)878822591);
        }
        object = (List)object42;
        iterable = (Iterable)object;
        n3 = (int)((long)1165537341 ^ (long)1165537341);
        object9 = iterable;
        object42 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)(((int)-1976992079L ^ 0x8A297EB4) << 1)));
        n13 = (int)((long)1342040569 ^ (long)1342040569);
        iterator = object9.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                object = (List)object42;
                Map map = MapsKt.toMap((Iterable)((Iterable)object));
                Collection<Object> collection2 = collection;
                return new Pair(collection2, (Object)map);
            }
            object3 = iterator.next();
            object2 = (iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object3;
            object = object42;
            n = (int)((long)1477755042 ^ (long)1477755042);
            String string = ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method6146();
            if (string == null) {
                Intrinsics.throwNpe();
            }
            String string10 = ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method6144();
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
        Object object2;
        Object object32;
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"fieldFile");
        List list = CollectionsKt.toMutableList((Collection)FilesKt.readLines$default((File)file, null, (int)((int)1480391074L ^ 0x583CF9A3), null));
        list.remove((int)-365385396L ^ 0xEA38A94C);
        int n = (int)((long)-966856008 ^ (long)-966856008);
        List list2 = new ArrayList();
        Iterable iterable = list;
        int n2 = (int)198705805L ^ 0xBD8028D;
        for (Object object32 : iterable) {
            String string;
            String string2 = (String)object32;
            int n3 = (int)((long)-111876252 ^ (long)-111876252);
            String[] stringArray = new String[(int)((long)-158657526 ^ (long)-158657525)];
            stringArray[(int)-1395189452L ^ 0xACD71934] = ",";
            object2 = StringsKt.split$default((CharSequence)string2, (String[])stringArray, ((int)1379534427L ^ 0x523A065B) != 0, (int)((int)((long)-538060502 ^ (long)-538060502)), (int)((int)((long)1630311511 ^ (long)1630311508) << 1), null);
            object = Field9727;
            Object object4 = (String)object2.get((int)10703583L ^ 0xA352DE);
            int n4 = (int)((long)-1425672764 ^ (long)-1425672764);
            Object object5 = object4;
            int n5 = (int)((long)-259108426 ^ (long)-259108425);
            int n6 = ((String)object4).length() - ((int)317684659L ^ 0x12EF7BB2);
            int n7 = (int)((long)-1613305988 ^ (long)-1613305988);
            String string3 = object5;
            if (string3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            Intrinsics.checkExpressionValueIsNotNull((Object)string3.substring(n5, n6), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object4 = Field9727;
            Object object6 = (String)object2.get((int)((long)1637105814 ^ (long)1637105811));
            int n8 = (int)-426959685L ^ 0xE68D1CBB;
            String string4 = object6;
            n6 = (int)((long)-2107963796 ^ (long)-2107963795);
            n7 = ((String)object6).length() - (int)((long)121422774 ^ (long)121422775);
            int n9 = (int)((long)-556514156 ^ (long)-556514156);
            String string5 = string4;
            if (string5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string6 = string5.substring(n6, n7);
            Intrinsics.checkExpressionValueIsNotNull((Object)string6, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object = string6;
            object6 = Field9727;
            object5 = (String)object2.get((int)((long)906271851 ^ (long)906271850) << 1);
            int n10 = (int)-489541804L ^ 0xE2D22F54;
            String string7 = object5;
            n7 = (int)-1654344896L ^ 0x9D64B341;
            n9 = ((String)object5).length() - ((int)1865867183L ^ 0x6F36DFAE);
            int n11 = (int)-93826813L ^ 0xFA685103;
            String string8 = string7;
            if (string8 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string9 = string8.substring(n7, n9);
            Intrinsics.checkExpressionValueIsNotNull((Object)string9, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object4 = string9;
            object5 = Field9727;
            String string10 = (String)object2.get(((int)-482785535L ^ 0xE3394702) << 1);
            int n12 = (int)((long)-58655447 ^ (long)-58655447);
            String string11 = string10;
            n9 = (int)((long)1285148103 ^ (long)1285148102);
            n11 = string10.length() - (int)((long)-1214805290 ^ (long)-1214805289);
            int n13 = (int)909783752L ^ 0x363A32C8;
            String string12 = string11;
            if (string12 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string13 = string12.substring(n9, n11);
            Intrinsics.checkExpressionValueIsNotNull((Object)string13, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object6 = string13;
            object5 = (String)object6 + (((int)-1699434386L ^ 0x9AB4B079) << 1) + (String)object4;
            Object object7 = Field9727;
            string11 = (String)object2.get(((int)-1449053705L ^ 0xA9A131F6) << 3);
            n9 = (int)((long)-596075651 ^ (long)-596075651);
            String string14 = string11;
            n13 = (int)((long)314654660 ^ (long)314654661);
            int n14 = string11.length() - (int)((long)-1857292849 ^ (long)-1857292850);
            int n15 = (int)463433404L ^ 0x1B9F6EBC;
            String string15 = string14;
            if (string15 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string16 = string15.substring(n13, n14);
            Intrinsics.checkExpressionValueIsNotNull((Object)string16, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object7 = string16;
            int n16 = (int)193837712L ^ 0xB8DBA90;
            n5 = Integer.parseInt((String)object7) == 0 ? (int)-213926239L ^ 0xF33FBEA0 : (int)148188833L ^ 0x8D52EA1;
            n6 = (int)((long)-387031459 ^ (long)-387031459);
            Iterable iterable2 = list2;
            n9 = (int)((long)238839179 ^ (long)238839179);
            for (Object e : iterable2) {
                iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = (iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)e;
                n15 = (int)-1550375256L ^ 0xA39726A8;
                if (!Intrinsics.areEqual((Object)iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method6797(), (Object)object) || !Intrinsics.areEqual((Object)iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method6796(), (Object)string)) continue;
                n6 = (int)((long)-1517810005 ^ (long)-1517810006);
                iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method6801((String)object5);
            }
            list2.add(new iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(string, (String)object, null, (String)object5));
        }
        iterable = list2;
        n2 = (int)((long)-631949131 ^ (long)-631949131);
        Object object8 = iterable;
        object32 = new ArrayList();
        int n17 = (int)-1053454128L ^ 0xC13590D0;
        Iterator iterator = object8.iterator();
        while (iterator.hasNext()) {
            int n18;
            object2 = iterator.next();
            object = (iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object2;
            int n19 = (int)((long)1599294217 ^ (long)1599294217);
            if (((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object).Method6798() != null && ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object).Method6800() != null) {
                String string = ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object).Method6798();
                if (string == null) {
                    Intrinsics.throwNpe();
                }
                String[] stringArray = new String[(int)957367058L ^ 0x39104313];
                stringArray[(int)981939684L ^ 0x3A8735E4] = ".";
                String string17 = (String)StringsKt.split$default((CharSequence)string, (String[])stringArray, ((int)1451577274L ^ 0x56854FBA) != 0, (int)((int)1157200731L ^ 0x44F97B5B), (int)(((int)2096233526L ^ 0x7CF1FC35) << 1), null).get((int)2086627772L ^ 0x7C5F69BD);
                String string18 = ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object).Method6800();
                if (string18 == null) {
                    Intrinsics.throwNpe();
                }
                String[] stringArray2 = new String[(int)((long)-750300914 ^ (long)-750300913)];
                stringArray2[(int)239291732L ^ 0xE434D54] = ".";
                if ((Intrinsics.areEqual((Object)string17, (Object)((String)StringsKt.split$default((CharSequence)string18, (String[])stringArray2, (boolean)((long)-435619108 ^ (long)-435619108), (int)((int)1273802080L ^ 0x4BECAD60), (int)(((int)62667118L ^ 0x3BC396D) << 1), null).get((int)-1369946432L ^ 0xAE5846C1))) ^ (int)((long)2121265629 ^ (long)2121265628)) != 0) {
                    n18 = (int)475375454L ^ 0x1C55A75F;
                    continue;
                }
            }
            n18 = (int)-2040877010L ^ 0x865AB02E;
        }
        iterable = (List)object32;
        n2 = (int)((long)-1248304265 ^ (long)-1248304265);
        object8 = iterable;
        object32 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)((int)((long)-316581505 ^ (long)-316581510) << 1)));
        n17 = (int)-615504790L ^ 0xDB50246A;
        iterator = object8.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object = (iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object2;
            Object object9 = object32;
            int n20 = (int)596604520L ^ 0x238F7668;
            String string = ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object).Method6800();
            if (string == null) {
                Intrinsics.throwNpe();
            }
            String string19 = ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object).Method6798();
            if (string19 == null) {
                Intrinsics.throwNpe();
            }
            Pair pair = TuplesKt.to((Object)string, (Object)string19);
            object9.add((Pair)pair);
        }
        return MapsKt.toSortedMap((Map)MapsKt.toMap((Iterable)((List)object32)));
    }

    @NotNull
    @NotNull
    public final Map Method2037(@NotNull @NotNull File file) {
        Object object;
        Object object2;
        Object object32;
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"methodFile");
        List list = CollectionsKt.toMutableList((Collection)FilesKt.readLines$default((File)file, null, (int)((int)((long)280420377 ^ (long)280420376)), null));
        list.remove((int)((long)650558279 ^ (long)650558279));
        int n = (int)1869991498L ^ 0x6F75CE4A;
        List list2 = new ArrayList();
        Iterable iterable = list;
        int n2 = (int)1389988505L ^ 0x52D98A99;
        for (Object object32 : iterable) {
            String string;
            String string2 = (String)object32;
            int n3 = (int)-1088828269L ^ 0xBF19CC93;
            String[] stringArray = new String[(int)((long)955348262 ^ (long)955348263)];
            stringArray[(int)((long)69342893 ^ (long)69342893)] = ",";
            object2 = StringsKt.split$default((CharSequence)string2, (String[])stringArray, ((int)-439805101L ^ 0xE5C91B53) != 0, (int)((int)-1567308360L ^ 0xA294C5B8), (int)((int)((long)1224428047 ^ (long)1224428044) << 1), null);
            object = Field9727;
            Object object4 = (String)object2.get((int)((long)-2140032808 ^ (long)-2140032807));
            int n4 = (int)1630186405L ^ 0x612AABA5;
            Object object5 = object4;
            int n5 = (int)((long)1168026364 ^ (long)1168026365);
            int n6 = ((String)object4).length() - ((int)-536806897L ^ 0xE000FA0E);
            int n7 = (int)((long)-2128703800 ^ (long)-2128703800);
            String string3 = object5;
            if (string3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            Intrinsics.checkExpressionValueIsNotNull((Object)string3.substring(n5, n6), (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object4 = Field9727;
            Object object6 = (String)object2.get((int)-2039529764L ^ 0x866F3ED9);
            int n8 = (int)433027925L ^ 0x19CF7B55;
            String string4 = object6;
            n6 = (int)936822563L ^ 0x37D6C722;
            n7 = ((String)object6).length() - (int)((long)1784924905 ^ (long)1784924904);
            int n9 = (int)1817889702L ^ 0x6C5ACBA6;
            String string5 = string4;
            if (string5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string6 = string5.substring(n6, n7);
            Intrinsics.checkExpressionValueIsNotNull((Object)string6, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object = string6;
            object6 = Field9727;
            object5 = (String)object2.get((int)((long)-1535105580 ^ (long)-1535105579) << 1);
            int n10 = (int)1255483294L ^ 0x4AD5279E;
            String string7 = object5;
            n7 = (int)-1125604337L ^ 0xBCE8A40E;
            n9 = ((String)object5).length() - ((int)-1187054716L ^ 0xB93EFB85);
            int n11 = (int)-1256477593L ^ 0xB51BAC67;
            String string8 = string7;
            if (string8 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string9 = string8.substring(n7, n9);
            Intrinsics.checkExpressionValueIsNotNull((Object)string9, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object4 = string9;
            object5 = Field9727;
            Object object7 = (String)object2.get((int)((long)-640223652 ^ (long)-640223651) << 2);
            int n12 = (int)((long)924452992 ^ (long)924452992);
            String string10 = object7;
            n9 = (int)-1945473118L ^ 0x8C0A6FA3;
            n11 = ((String)object7).length() - ((int)330243509L ^ 0x13AF1DB4);
            int n13 = (int)-309632349L ^ 0xED8B62A3;
            String string11 = string10;
            if (string11 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string12 = string11.substring(n9, n11);
            Intrinsics.checkExpressionValueIsNotNull((Object)string12, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object6 = string12;
            object7 = Field9727;
            String string13 = (String)object2.get(((int)2067509125L ^ 0x7B3BAF86) << 1);
            int n14 = (int)((long)1125009340 ^ (long)1125009340);
            String string14 = string13;
            n11 = (int)((long)-1802578956 ^ (long)-1802578955);
            n13 = string13.length() - (int)((long)-429675922 ^ (long)-429675921);
            int n15 = (int)((long)1467273908 ^ (long)1467273908);
            String string15 = string14;
            if (string15 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string16 = string15.substring(n11, n13);
            Intrinsics.checkExpressionValueIsNotNull((Object)string16, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object5 = string16;
            object7 = (String)object5 + ((int)((long)-628356426 ^ (long)-628356447) << 1) + (String)object4 + (((int)302532561L ^ 0x120847C6) << 1) + (String)object6;
            Object object8 = Field9727;
            string14 = (String)object2.get(((int)1704239527L ^ 0x6594A1A6) << 3);
            n11 = (int)1101733431L ^ 0x41AB1E37;
            String string17 = string14;
            n15 = (int)((long)97988907 ^ (long)97988906);
            int n16 = string14.length() - ((int)760023553L ^ 0x2D4D0A00);
            int n17 = (int)((long)119366283 ^ (long)119366283);
            String string18 = string17;
            if (string18 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string19 = string18.substring(n15, n16);
            Intrinsics.checkExpressionValueIsNotNull((Object)string19, (String)"(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            object8 = string19;
            int n18 = (int)1712307665L ^ 0x660FBDD1;
            n6 = Integer.parseInt((String)object8) == 0 ? (int)110238934L ^ 0x6921CD7 : (int)-387790757L ^ 0xE8E2C85B;
            n7 = (int)((long)-940060914 ^ (long)-940060914);
            Iterable iterable2 = list2;
            n11 = (int)((long)-469765579 ^ (long)-469765579);
            for (Object e : iterable2) {
                iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = (iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)e;
                n17 = (int)-2057005309L ^ 0x85649703;
                if (!Intrinsics.areEqual((Object)iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method6797(), (Object)object) || !Intrinsics.areEqual((Object)iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method6796(), (Object)string)) continue;
                n7 = (int)((long)1083611870 ^ (long)1083611871);
                iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method6801((String)object7);
            }
            list2.add(new iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(string, (String)object, null, (String)object7));
        }
        iterable = list2;
        n2 = (int)((long)-1274718861 ^ (long)-1274718861);
        Object object9 = iterable;
        object32 = new ArrayList();
        int n19 = (int)((long)357291374 ^ (long)357291374);
        Iterator iterator = object9.iterator();
        while (iterator.hasNext()) {
            int n20;
            object2 = iterator.next();
            object = (iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object2;
            int n21 = (int)((long)1709320240 ^ (long)1709320240);
            if (((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object).Method6798() != null && ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object).Method6800() != null) {
                String string = ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object).Method6798();
                if (string == null) {
                    Intrinsics.throwNpe();
                }
                String[] stringArray = new String[(int)((long)-1031543252 ^ (long)-1031543251)];
                stringArray[(int)((long)1538792569 ^ (long)1538792569)] = ".";
                String string20 = (String)StringsKt.split$default((CharSequence)string, (String[])stringArray, (boolean)((long)-1438439714 ^ (long)-1438439714), (int)((int)657659424L ^ 0x27331620), (int)((int)((long)-334653412 ^ (long)-334653409) << 1), null).get((int)((long)2130575551 ^ (long)2130575550));
                String string21 = ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object).Method6800();
                if (string21 == null) {
                    Intrinsics.throwNpe();
                }
                String[] stringArray2 = new String[(int)1095905836L ^ 0x4152322D];
                stringArray2[(int)((long)717691133 ^ (long)717691133)] = ".";
                if ((Intrinsics.areEqual((Object)string20, (Object)((String)StringsKt.split$default((CharSequence)string21, (String[])stringArray2, ((int)-564350819L ^ 0xDE5CB09D) != 0, (int)((int)((long)1258611961 ^ (long)1258611961)), (int)(((int)-1316387335L ^ 0xB18985FA) << 1), null).get((int)2070930156L ^ 0x7B6FE2ED))) ^ (int)((long)1485189632 ^ (long)1485189633)) != 0) {
                    n20 = (int)149123107L ^ 0x8E37022;
                    continue;
                }
            }
            n20 = (int)-841643893L ^ 0xCDD5888B;
        }
        iterable = (List)object32;
        n2 = (int)1898101143L ^ 0x7122B997;
        object9 = iterable;
        object32 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)(((int)-1906965982L ^ 0x8E560227) << 1)));
        n19 = (int)646143344L ^ 0x26835D70;
        iterator = object9.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object = (iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object2;
            Object object10 = object32;
            int n22 = (int)1749981947L ^ 0x684E9AFB;
            String string = ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object).Method6800();
            if (string == null) {
                Intrinsics.throwNpe();
            }
            String string22 = ((iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object).Method6798();
            if (string22 == null) {
                Intrinsics.throwNpe();
            }
            Pair pair = TuplesKt.to((Object)string, (Object)string22);
            object10.add((Pair)pair);
        }
        return MapsKt.toSortedMap((Map)MapsKt.toMap((Iterable)((List)object32)));
    }

    private iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT() {
    }

    static {
        iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT2;
        Field9727 = iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT2 = new iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT();
    }

    private static String Method2038(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1417841132 ^ (long)-1417841132);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1745385050 ^ (long)1745385125);
            int n2 = (int)((long)-330326573 ^ (long)-330326560) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-858984698 ^ (long)-858989895) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

