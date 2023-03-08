//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.function.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.*;
import java.util.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003?\u0006\u0002\u0010\tJ\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003?\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b?\u0006\u0018" }, d2 = { "Lcom/kisman/cc/util/world/DamageSyncHandler;", "", "state", "Ljava/util/function/Supplier;", "", "delay", "", "minOffset", "", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "getDelay", "()Ljava/util/function/Supplier;", "getMinOffset", "getState", "check", "Lcom/kisman/cc/util/collections/Bind;", "", "damage", "target", "Lnet/minecraft/entity/Entity;", "clear", "", "reset", "Companion", "kisman.cc" })
public class Class1648
{
    @NotNull
    private final Supplier Field15661;
    @NotNull
    private final Supplier Field15662;
    @NotNull
    private final Supplier Field15663;
    private static final HashMap Field15664;
    public static final Class599 Field15665;
    private String Field15666 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method6394() {
        Class1648.Field15664.clear();
    }
    
    public final void Method6395() {
        if (!this.Field15661.get()) {
            return;
        }
        final ArrayList<Entity> list = new ArrayList<Entity>();
        for (final Entity e : Class1648.Field15664.keySet()) {
            if (!Class2142.Field17803.world.loadedEntityList.contains(e)) {
                list.add(e);
            }
        }
        final Iterator<Entity> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            Class1648.Field15664.remove(iterator2.next());
        }
    }
    
    @NotNull
    @NotNull
    public final Class1621 Method6396(final float f, @NotNull @NotNull final Entity key) {
        Intrinsics.checkParameterIsNotNull((Object)key, "target");
        if (Class1648.Field15664.containsKey(key)) {
            final Boolean value = this.Field15661.get();
            Intrinsics.checkExpressionValueIsNotNull((Object)value, "state.get()");
            if (value) {
                final Class1621 value2 = Class1648.Field15664.get(key);
                if (value2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull((Object)value2, "map[target]!!");
                final Class650 class650 = (Class650)value2.Method6308();
                final Number value3 = this.Field15662.get();
                Intrinsics.checkExpressionValueIsNotNull((Object)value3, "delay.get()");
                if (class650.Method2797(value3.longValue())) {
                    this.Method6394();
                    return new Class1621((Object)true, (Object)f);
                }
                final Class1621 value4 = Class1648.Field15664.get(key);
                if (value4 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull((Object)value4, "map[target]!!");
                final Object method6307 = value4.Method6307();
                Intrinsics.checkExpressionValueIsNotNull(method6307, "map[target]!!.first");
                final double d1 = f - ((Number)method6307).floatValue();
                final Number value5 = this.Field15663.get();
                Intrinsics.checkExpressionValueIsNotNull((Object)value5, "minOffset.get()");
                Class1621 class651;
                if (Double.compare(d1, value5.doubleValue()) >= 0) {
                    final Class1621 value6 = Class1648.Field15664.get(key);
                    if (value6 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull((Object)value6, "map[target]!!");
                    ((Class650)value6.Method6308()).Method2801();
                    final Class1621 class652;
                    class651 = class652;
                    final Boolean value7 = true;
                    final Class1621 value8 = Class1648.Field15664.get(key);
                    if (value8 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull((Object)value8, "map[target]!!");
                    final Object method6308 = value8.Method6307();
                    Intrinsics.checkExpressionValueIsNotNull(method6308, "map[target]!!.first");
                    class652 = new Class1621((Object)value7, (Object)(f - ((Number)method6308).floatValue()));
                }
                else {
                    class651 = new Class1621((Object)false, (Object)0.0f);
                }
                return class651;
            }
        }
        final Boolean value9 = this.Field15661.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value9, "state.get()");
        if (value9) {
            Class1648.Field15664.put(key, new Class1621((Object)f, (Object)new Class650()));
        }
        return new Class1621((Object)true, (Object)f);
    }
    
    @NotNull
    @NotNull
    public final Supplier Method6397() {
        return this.Field15661;
    }
    
    @NotNull
    @NotNull
    public final Supplier Method6398() {
        return this.Field15662;
    }
    
    @NotNull
    @NotNull
    public final Supplier Method6399() {
        return this.Field15663;
    }
    
    public Class1648(@NotNull @NotNull final Supplier field15661, @NotNull @NotNull final Supplier field15662, @NotNull @NotNull final Supplier field15663) {
        Intrinsics.checkParameterIsNotNull((Object)field15661, "state");
        Intrinsics.checkParameterIsNotNull((Object)field15662, "delay");
        Intrinsics.checkParameterIsNotNull((Object)field15663, "minOffset");
        this.Field15661 = field15661;
        this.Field15662 = field15662;
        this.Field15663 = field15663;
    }
    
    static {
        Field15665 = new Class599(null);
        Field15664 = new HashMap();
    }
    
    private static String Method6400(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7B30 ^ 0xA8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
