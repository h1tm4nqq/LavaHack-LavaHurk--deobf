/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2={"Lcom/kisman/cc/util/collections/LimitedSortedMap;", "K", "V", "Ljava/util/TreeMap;", "maxSize", "", "(I)V", "put", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "", "from", "", "kisman.cc"})
public final class i0A1zmXu5xZh0tT6upTRrJAS9eBA7AvD
extends TreeMap {
    private final int Field15807;
    private String Field15808 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @Nullable
    @Nullable
    public Object put(Object object, Object object2) {
        Object object3 = super.put(object, object2);
        if (this.size() <= this.Field15807) return object3;
        Set set = this.keySet();
        Intrinsics.checkExpressionValueIsNotNull((Object)set, (String)"keys");
        Object e = CollectionsKt.toList((Iterable)set).get(this.Field15807);
        SortedMap sortedMap = this.tailMap(e);
        Intrinsics.checkExpressionValueIsNotNull(sortedMap, (String)"tailMap(firstToRemove)");
        Map map = sortedMap;
        int n = (int)1916397272L ^ 0x7239E6D8;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            this.remove(entry.getKey());
        }
        return object3;
    }

    @Override
    public void putAll(@NotNull @NotNull Map map) {
        Intrinsics.checkParameterIsNotNull((Object)map, (String)"from");
        super.putAll(map);
        if (this.size() <= this.Field15807) return;
        Set set = this.keySet();
        Intrinsics.checkExpressionValueIsNotNull((Object)set, (String)"keys");
        Object e = CollectionsKt.toList((Iterable)set).get(this.Field15807);
        SortedMap sortedMap = this.tailMap(e);
        Intrinsics.checkExpressionValueIsNotNull(sortedMap, (String)"tailMap(firstToRemove)");
        Map map2 = sortedMap;
        int n = (int)-830400289L ^ 0xCE8118DF;
        Iterator iterator = map2.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            this.remove(entry.getKey());
        }
    }

    public i0A1zmXu5xZh0tT6upTRrJAS9eBA7AvD(int n) {
        this.Field15807 = n;
    }

    public int Method6463() {
        return super.size();
    }

    @Override
    public final int size() {
        return this.Method6463();
    }

    public Collection Method6464() {
        return super.values();
    }

    @Override
    public final Collection values() {
        return this.Method6464();
    }

    public Set Method6465() {
        return super.entrySet();
    }

    @Override
    public final Set entrySet() {
        return this.Method6465();
    }

    public Set Method6466() {
        return super.keySet();
    }

    @Override
    public final Set keySet() {
        return this.Method6466();
    }

    private static String Method6467(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)871233731L ^ 0x33EDF8C3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)51198477L ^ 0x30D3AF2);
            int n2 = (int)((long)-192421746 ^ (long)-192421809);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1260039838 ^ (long)-1260038155) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

