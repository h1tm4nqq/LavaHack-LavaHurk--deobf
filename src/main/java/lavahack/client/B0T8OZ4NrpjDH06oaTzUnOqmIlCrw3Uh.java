/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u001e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003j\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/util/collections/LimitedHashMap;", "K", "V", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "maxSize", "", "(I)V", "removeEldestEntry", "", "eldest", "", "kisman.cc"})
public final class B0T8OZ4NrpjDH06oaTzUnOqmIlCrw3Uh
extends LinkedHashMap {
    private final int Field11569;
    private String Field11570 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    protected boolean removeEldestEntry(@NotNull @NotNull Map.Entry entry) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)entry, (String)"eldest");
        if (this.size() > this.Field11569) {
            n = (int)((long)-686438488 ^ (long)-686438487);
            return n != 0;
        }
        n = (int)((long)1213140673 ^ (long)1213140673);
        return n != 0;
    }

    public B0T8OZ4NrpjDH06oaTzUnOqmIlCrw3Uh(int n) {
        this.Field11569 = n;
    }

    public int Method3566() {
        return super.size();
    }

    @Override
    public final int size() {
        return this.Method3566();
    }

    public Collection Method3567() {
        return super.values();
    }

    @Override
    public final Collection values() {
        return this.Method3567();
    }

    public Set Method3568() {
        return super.entrySet();
    }

    @Override
    public final Set entrySet() {
        return this.Method3568();
    }

    public Set Method3569() {
        return super.keySet();
    }

    @Override
    public final Set keySet() {
        return this.Method3569();
    }

    private static String Method3570(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2034613490 ^ (long)2034613490);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1864698578L ^ 0x6F250A2D);
            int n2 = (int)((long)1976897748 ^ (long)1976897747) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)947807519L ^ 0x387E78F4) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

