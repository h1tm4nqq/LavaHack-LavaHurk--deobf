//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.entity.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\f" }, d2 = { "Lcom/kisman/cc/features/module/Debug/FutureShader;", "Lcom/kisman/cc/features/module/Module;", "()V", "opacityOutline", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "quality", "width", "onRenderWorld", "", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc" })
public final class Class59 extends Class42
{
    private final Class44 Field8193;
    private final Class44 Field8194;
    private final Class44 Field8195;
    private String Field8196 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method492(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
        GlStateManager.matrixMode(5889);
        GlStateManager.pushMatrix();
        GlStateManager.matrixMode(5888);
        GlStateManager.pushMatrix();
        final Class920 field11896 = Class920.Field11896;
        final Class44 field11897 = this.Field8195;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11897, "quality");
        field11896.Method3840(field11897.Method368());
        final Class920 field11898 = Class920.Field11896;
        final Class44 field11899 = this.Field8194;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11899, "width");
        field11898.Method3838(field11899.Method368());
        final Class920 field11900 = Class920.Field11896;
        final Class44 field11901 = this.Field8193;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11901, "opacityOutline");
        field11900.Method3836(field11901.Method368());
        Class920.Field11896.Method1714(renderWorldLastEvent.getPartialTicks());
        for (final Entity entity : Method493().world.loadedEntityList) {
            if (Intrinsics.areEqual((Object)entity, (Object)Method493().player)) {
                continue;
            }
            final Vec3d method2103 = Class447.Method2103(entity, renderWorldLastEvent.getPartialTicks());
            final Render requireNonNull = Objects.requireNonNull(Method493().getRenderManager().getEntityRenderObject(entity));
            if (requireNonNull == null) {
                Intrinsics.throwNpe();
            }
            requireNonNull.doRender(entity, method2103.x, method2103.y, method2103.z, entity.rotationYaw, renderWorldLastEvent.getPartialTicks());
        }
        Class920.Field11896.Method1715();
        GlStateManager.color(1.0f, 1.0f, 1.0f);
        GlStateManager.matrixMode(5889);
        GlStateManager.popMatrix();
        GlStateManager.matrixMode(5888);
        GlStateManager.popMatrix();
    }
    
    public Class59() {
        super("FutureShader", Class97.Field8345);
        this.Field8193 = this.Method23(new Class44("Opacity Outline", (Class42)this, 1.0, 0.0, 1.0, false));
        this.Field8194 = this.Method23(new Class44("Width", (Class42)this, 1.0, Double.longBitsToDouble((long)1395284468 ^ 0x3FB99999CAB3C06EL), Double.longBitsToDouble(4613937818241073152L), false));
        this.Field8195 = this.Method23(new Class44("Quality", (Class42)this, 1.0, Double.longBitsToDouble((long)27869581 ^ 0x3FB999999830D817L), Double.longBitsToDouble(4613937818241073152L), false));
    }
    
    public static final Minecraft Method493() {
        return Class42.Field8052;
    }
    
    public static final void Method494(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x47AE ^ 0xA4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
