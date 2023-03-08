//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import org.jetbrains.annotations.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016?\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u000f" }, d2 = { "Lcom/kisman/cc/util/collections/LimitedSortedMap;", "K", "V", "Ljava/util/TreeMap;", "maxSize", "", "(I)V", "put", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "", "from", "", "kisman.cc" })
public final class Class1674 extends TreeMap
{
    private final int Field15807;
    private String Field15808 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Nullable
    @Nullable
    @Override
    public Object put(final Object key, final Object value) {
        final Object put = super.put(key, value);
        if (this.size() > this.Field15807) {
            final Set keySet = this.keySet();
            Intrinsics.checkExpressionValueIsNotNull((Object)keySet, "keys");
            final SortedMap<Object, Object> tailMap = this.tailMap(CollectionsKt.toList((Iterable)keySet).get(this.Field15807));
            Intrinsics.checkExpressionValueIsNotNull((Object)tailMap, "tailMap(firstToRemove)");
            final Iterator<Map.Entry<Object, Object>> iterator = tailMap.entrySet().iterator();
            while (iterator.hasNext()) {
                this.remove(iterator.next().getKey());
            }
        }
        return put;
    }
    
    @Override
    public void putAll(@NotNull @NotNull final Map map) {
        Intrinsics.checkParameterIsNotNull((Object)map, "from");
        super.putAll(map);
        if (this.size() > this.Field15807) {
            final Set keySet = this.keySet();
            Intrinsics.checkExpressionValueIsNotNull((Object)keySet, "keys");
            final SortedMap<Object, Object> tailMap = this.tailMap(CollectionsKt.toList((Iterable)keySet).get(this.Field15807));
            Intrinsics.checkExpressionValueIsNotNull((Object)tailMap, "tailMap(firstToRemove)");
            final Iterator<Map.Entry<Object, Object>> iterator = tailMap.entrySet().iterator();
            while (iterator.hasNext()) {
                this.remove(iterator.next().getKey());
            }
        }
    }
    
    public Class1674(final int field15807) {
        this.Field15807 = field15807;
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
    
    private static String Method6467(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xD2E ^ 0xC1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
