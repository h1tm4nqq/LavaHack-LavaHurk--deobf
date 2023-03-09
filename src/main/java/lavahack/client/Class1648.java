//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1621;
import lavahack.client.Class599;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u0018"}, d2={"Lcom/kisman/cc/util/world/DamageSyncHandler;", "", "state", "Ljava/util/function/Supplier;", "", "delay", "", "minOffset", "", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "getDelay", "()Ljava/util/function/Supplier;", "getMinOffset", "getState", "check", "Lcom/kisman/cc/util/collections/Bind;", "", "damage", "target", "Lnet/minecraft/entity/Entity;", "clear", "", "reset", "Companion", "kisman.cc"})
public class Class1648 {
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
        Field15664.clear();
    }

    public final void Method6395() {
        if (!((Boolean)this.Field15661.get()).booleanValue()) {
            return;
        }
        ArrayList<Entity> arrayList = new ArrayList<Entity>();
        for (Entity entity : Field15664.keySet()) {
            if (Class2142.Field17803.world.loadedEntityList.contains(entity)) continue;
            arrayList.add(entity);
        }
        Iterator<Object> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Entity entity;
            entity = (Entity)iterator.next();
            Field15664.remove(entity);
        }
    }

    @NotNull
    @NotNull
    public final Class1621 Method6396(float f, @NotNull @NotNull Entity entity) {
        Class1621 class1621;
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"target");
        if (Field15664.containsKey(entity)) {
            Object t = this.Field15661.get();
            Intrinsics.checkExpressionValueIsNotNull(t, (String)"state.get()");
            if (((Boolean)t).booleanValue()) {
                Object v = Field15664.get(entity);
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(v, (String)"map[target]!!");
                Class650 class650 = (Class650)((Class1621)v).Method6308();
                Object t2 = this.Field15662.get();
                Intrinsics.checkExpressionValueIsNotNull(t2, (String)"delay.get()");
                if (class650.Method2797(((Number)t2).longValue())) {
                    this.Method6394();
                    class1621 = new Class1621(true, Float.valueOf(f));
                    return class1621;
                }
                Object v2 = Field15664.get(entity);
                if (v2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(v2, (String)"map[target]!!");
                Object object = ((Class1621)v2).Method6307();
                Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"map[target]!!.first");
                double d = f - ((Number)object).floatValue();
                Object t3 = this.Field15663.get();
                Intrinsics.checkExpressionValueIsNotNull(t3, (String)"minOffset.get()");
                if (Double.compare(d, ((Number)t3).doubleValue()) < 0) {
                    class1621 = new Class1621(false, Float.valueOf(0.0f));
                    return class1621;
                }
                Object v3 = Field15664.get(entity);
                if (v3 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(v3, (String)"map[target]!!");
                ((Class650)((Class1621)v3).Method6308()).Method2801();
                Boolean bl = true;
                Object v4 = Field15664.get(entity);
                if (v4 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(v4, (String)"map[target]!!");
                Object object2 = ((Class1621)v4).Method6307();
                Intrinsics.checkExpressionValueIsNotNull((Object)object2, (String)"map[target]!!.first");
                class1621 = new Class1621(bl, Float.valueOf(f - ((Number)object2).floatValue()));
                return class1621;
            }
        }
        Object t = this.Field15661.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"state.get()");
        if (((Boolean)t).booleanValue()) {
            Map map = Field15664;
            Class1621 class16212 = new Class1621(Float.valueOf(f), new Class650());
            boolean bl = false;
            map.put(entity, class16212);
        }
        class1621 = new Class1621(true, Float.valueOf(f));
        return class1621;
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

    public Class1648(@NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2, @NotNull @NotNull Supplier supplier3) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"state");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"delay");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, (String)"minOffset");
        this.Field15661 = supplier;
        this.Field15662 = supplier2;
        this.Field15663 = supplier3;
    }

    static {
        Field15665 = new Class599(null);
        Field15664 = new HashMap();
    }

    private static String Method6400(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 168;
            cArray2[n] = (char)(cArray[n] ^ (0x7B30 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

