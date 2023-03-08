//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004?\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016?\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\r" }, d2 = { "Lcom/kisman/cc/util/collections/LimitedSortedSet;", "E", "Ljava/util/TreeSet;", "maxSize", "", "(I)V", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "kisman.cc" })
public final class Class1463 extends TreeSet
{
    private final int Field14842;
    private String Field14843 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public boolean add(final Object e) {
        final boolean add = super.add(e);
        if (this.size() > this.Field14842) {
            final SortedSet<Object> tailSet = this.tailSet(this.toArray()[this.Field14842]);
            Intrinsics.checkExpressionValueIsNotNull((Object)tailSet, "tailSet(firstToRemove)");
            this.removeAll(tailSet);
        }
        return add;
    }
    
    @Override
    public boolean addAll(@NotNull @NotNull final Collection c) {
        Intrinsics.checkParameterIsNotNull((Object)c, "elements");
        final boolean addAll = super.addAll(c);
        if (this.size() > this.Field14842) {
            final SortedSet<Object> tailSet = this.tailSet(this.toArray()[this.Field14842]);
            Intrinsics.checkExpressionValueIsNotNull((Object)tailSet, "tailSet(firstToRemove)");
            this.removeAll(tailSet);
        }
        return addAll;
    }
    
    public Class1463(final int field14842) {
        this.Field14842 = field14842;
    }
    
    public int Method5892() {
        return super.size();
    }
    
    @Override
    public final int size() {
        return this.Method5892();
    }
    
    private static String Method5893(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x76DF ^ 0xBC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
