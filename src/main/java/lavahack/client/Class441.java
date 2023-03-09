/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lavahack.client.Class751;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0002\u0007\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\t\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/event/events/RenderEntityEvent;", "Lcom/kisman/cc/event/Event;", "entity", "Lnet/minecraft/entity/Entity;", "(Lnet/minecraft/entity/Entity;)V", "getEntity", "()Lnet/minecraft/entity/Entity;", "All", "Companion", "Lcom/kisman/cc/event/events/RenderEntityEvent$All;", "kisman.cc"})
public abstract class Class441
extends Class2157 {
    @NotNull
    private final Entity Field9841;
    private static boolean Field9842;
    public static final Class751 Field9843;
    private int Field9844;

    @NotNull
    @NotNull
    public final Entity Method2086() {
        return this.Field9841;
    }

    private Class441(Entity entity) {
        super(new Object[0]);
        this.Field9841 = entity;
    }

    static {
        Field9843 = new Class751(null);
    }

    public Class441(Entity entity, DefaultConstructorMarker defaultConstructorMarker) {
        this(entity);
    }

    public static final boolean Method2087() {
        return Field9842;
    }

    public static final void Method2088(boolean bl) {
        Field9842 = bl;
    }

    public static final boolean Method2089() {
        Class751 class751 = Field9843;
        return Field9842;
    }

    public static final void Method2090(boolean bl) {
        Class751 class751 = Field9843;
        Field9842 = bl;
    }
}

