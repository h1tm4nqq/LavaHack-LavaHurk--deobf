//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class447;
import lavahack.client.Class920;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/features/module/Debug/FutureShader;", "Lcom/kisman/cc/features/module/Module;", "()V", "opacityOutline", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "quality", "width", "onRenderWorld", "", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc"})
public final class Class59
extends Class42 {
    private final Class44 Field8193 = this.Method23(new Class44("Opacity Outline", (Class42)this, 1.0, 0.0, 1.0, false));
    private final Class44 Field8194 = this.Method23(new Class44("Width", (Class42)this, 1.0, Double.longBitsToDouble((long)1395284468 ^ 0x3FB99999CAB3C06EL), Double.longBitsToDouble(0x4008000000000000L), false));
    private final Class44 Field8195 = this.Method23(new Class44("Quality", (Class42)this, 1.0, Double.longBitsToDouble((long)27869581 ^ 0x3FB999999830D817L), Double.longBitsToDouble(0x4008000000000000L), false));
    private String Field8196 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method492(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        GlStateManager.matrixMode((int)5889);
        GlStateManager.pushMatrix();
        GlStateManager.matrixMode((int)5888);
        GlStateManager.pushMatrix();
        Class44 class44 = this.Field8195;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"quality");
        Class920.Field11896.Method3840(class44.Method368());
        Class44 class442 = this.Field8194;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"width");
        Class920.Field11896.Method3838(class442.Method368());
        Class44 class443 = this.Field8193;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"opacityOutline");
        Class920.Field11896.Method3836(class443.Method368());
        Class920.Field11896.Method1714(renderWorldLastEvent.getPartialTicks());
        Iterator iterator = Class59.Method493().world.loadedEntityList.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                Class920.Field11896.Method1715();
                GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f);
                GlStateManager.matrixMode((int)5889);
                GlStateManager.popMatrix();
                GlStateManager.matrixMode((int)5888);
                GlStateManager.popMatrix();
                return;
            }
            Entity entity = (Entity)iterator.next();
            if (Intrinsics.areEqual((Object)entity, (Object)Class59.Method493().player)) continue;
            Vec3d vec3d = Class447.Method2103(entity, renderWorldLastEvent.getPartialTicks());
            Render render = Objects.requireNonNull(Class59.Method493().getRenderManager().getEntityRenderObject(entity));
            if (render == null) {
                Intrinsics.throwNpe();
            }
            render.doRender(entity, vec3d.x, vec3d.y, vec3d.z, entity.rotationYaw, renderWorldLastEvent.getPartialTicks());
        }
    }

    public Class59() {
        super("FutureShader", Class97.Field8345);
    }

    public static final Minecraft Method493() {
        return Class42.Field8052;
    }

    public static final void Method494(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 164;
            cArray2[n] = (char)(cArray[n] ^ (0x47AE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

