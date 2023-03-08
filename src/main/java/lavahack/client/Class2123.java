//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.entity.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB7\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t?\u0006\u0002\u0010\u000bR\u000e\u0010\n\u001a\u00020\tX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004?\u0006\u0002\n\u0000\u0082\u0001\u0002\u000e\u000f?\u0006\u0010" }, d2 = { "Lcom/kisman/cc/event/events/RenderEntityEvent$All;", "Lcom/kisman/cc/event/events/RenderEntityEvent;", "entity", "Lnet/minecraft/entity/Entity;", "x", "", "y", "z", "yaw", "", "partialTicks", "(Lnet/minecraft/entity/Entity;DDDFF)V", "Post", "Pre", "Lcom/kisman/cc/event/events/RenderEntityEvent$All$Pre;", "Lcom/kisman/cc/event/events/RenderEntityEvent$All$Post;", "kisman.cc" })
public abstract class Class2123 extends Class441
{
    private final double Field17659;
    private final double Field17660;
    private final double Field17661;
    private final float Field17662;
    private final float Field17663;
    private int Field17664;
    
    private Class2123(final Entity entity, final double field17659, final double field17660, final double field17661, final float field17662, final float field17663) {
        super(entity, null);
        this.Field17659 = field17659;
        this.Field17660 = field17660;
        this.Field17661 = field17661;
        this.Field17662 = field17662;
        this.Field17663 = field17663;
    }
    
    public Class2123(final Entity entity, final double n, final double n2, final double n3, final float n4, final float n5, final DefaultConstructorMarker defaultConstructorMarker) {
        this(entity, n, n2, n3, n4, n5);
    }
}
