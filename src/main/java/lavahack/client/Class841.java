//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u001e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003j\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\f" }, d2 = { "Lcom/kisman/cc/util/collections/LimitedHashMap;", "K", "V", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "maxSize", "", "(I)V", "removeEldestEntry", "", "eldest", "", "kisman.cc" })
public final class Class841 extends LinkedHashMap
{
    private final int Field11569;
    private String Field11570 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    protected boolean removeEldestEntry(@NotNull @NotNull final Map.Entry entry) {
        Intrinsics.checkParameterIsNotNull((Object)entry, "eldest");
        return this.size() > this.Field11569;
    }
    
    public Class841(final int field11569) {
        this.Field11569 = field11569;
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
    
    private static String Method3570(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x77AC ^ 0x1C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
