/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/util/collections/LimitedSortedSet;", "E", "Ljava/util/TreeSet;", "maxSize", "", "(I)V", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "kisman.cc"})
public final class EJoXl05OUvvFtWLGg7884huLm3GXDLKU
extends TreeSet {
    private final int Field14842;
    private String Field14843 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public boolean add(Object object) {
        boolean bl = super.add(object);
        if (this.size() <= this.Field14842) return bl;
        Object object2 = this.toArray()[this.Field14842];
        SortedSet<Object> sortedSet = this.tailSet(object2);
        Intrinsics.checkExpressionValueIsNotNull(sortedSet, (String)"tailSet(firstToRemove)");
        this.removeAll((Collection)sortedSet);
        return bl;
    }

    @Override
    public boolean addAll(@NotNull @NotNull Collection collection) {
        Intrinsics.checkParameterIsNotNull((Object)collection, (String)"elements");
        boolean bl = super.addAll(collection);
        if (this.size() <= this.Field14842) return bl;
        Object object = this.toArray()[this.Field14842];
        SortedSet<Object> sortedSet = this.tailSet(object);
        Intrinsics.checkExpressionValueIsNotNull(sortedSet, (String)"tailSet(firstToRemove)");
        this.removeAll((Collection)sortedSet);
        return bl;
    }

    public EJoXl05OUvvFtWLGg7884huLm3GXDLKU(int n) {
        this.Field14842 = n;
    }

    public int Method5892() {
        return super.size();
    }

    @Override
    public final int size() {
        return this.Method5892();
    }

    private static String Method5893(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1237690581L ^ 0xB63A572B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1968012668 ^ (long)-1968012677);
            int n2 = ((int)1037215899L ^ 0x3DD2A8B4) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-897156860 ^ (long)-897183781) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

