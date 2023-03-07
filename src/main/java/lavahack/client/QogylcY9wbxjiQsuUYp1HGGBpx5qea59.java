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
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/features/module/Debug/FutureShader;", "Lcom/kisman/cc/features/module/Module;", "()V", "opacityOutline", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "quality", "width", "onRenderWorld", "", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc"})
public final class QogylcY9wbxjiQsuUYp1HGGBpx5qea59
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8193 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Opacity Outline", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, ((int)-1863087582L ^ 0x90F38A22) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8194 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Width", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)1395284468 ^ 0x3FB99999CAB3C06EL), Double.longBitsToDouble(0x469E08C16F17C27FL ^ 0x69608C16F17C27FL), ((int)1663810290L ^ 0x632BBAF2) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8195 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Quality", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)27869581 ^ 0x3FB999999830D817L), Double.longBitsToDouble(0x3FC85A14DA002AA2L ^ 0x7FC05A14DA002AA2L), ((int)-1143089040L ^ 0xBBDDD870) != 0));
    private String Field8196 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method492(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        GlStateManager.matrixMode((int)((int)((long)36639360 ^ (long)36636033)));
        GlStateManager.pushMatrix();
        GlStateManager.matrixMode((int)(((int)-237440826L ^ 0xF1D8F0D1) << 8));
        GlStateManager.pushMatrix();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field8195;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"quality");
        lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw.Field11896.Method3840(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method368());
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field8194;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"width");
        lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw.Field11896.Method3838(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method368());
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field8193;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"opacityOutline");
        lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw.Field11896.Method3836(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method368());
        lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw.Field11896.Method1714(renderWorldLastEvent.getPartialTicks());
        Iterator iterator = QogylcY9wbxjiQsuUYp1HGGBpx5qea59.Method493().world.loadedEntityList.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                lFNdUnzbYCj9CIxFXBi7W1pmKf601Ruw.Field11896.Method1715();
                GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f);
                GlStateManager.matrixMode((int)((int)((long)918890891 ^ (long)918896266)));
                GlStateManager.popMatrix();
                GlStateManager.matrixMode((int)(((int)955501462L ^ 0x38F3CB81) << 8));
                GlStateManager.popMatrix();
                return;
            }
            Entity entity = (Entity)iterator.next();
            if (Intrinsics.areEqual((Object)entity, (Object)QogylcY9wbxjiQsuUYp1HGGBpx5qea59.Method493().player)) continue;
            Vec3d vec3d = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2103(entity, renderWorldLastEvent.getPartialTicks());
            Render render = Objects.requireNonNull(QogylcY9wbxjiQsuUYp1HGGBpx5qea59.Method493().getRenderManager().getEntityRenderObject(entity));
            if (render == null) {
                Intrinsics.throwNpe();
            }
            render.doRender(entity, vec3d.x, vec3d.y, vec3d.z, entity.rotationYaw, renderWorldLastEvent.getPartialTicks());
        }
    }

    public QogylcY9wbxjiQsuUYp1HGGBpx5qea59() {
        super("FutureShader", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    public static final Minecraft Method493() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method494(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)834065146 ^ (long)834065146);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)721321937L ^ 0x2AFE7F2E);
            int n2 = (int)((long)-1585682897 ^ (long)-1585682938) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1980050135 ^ (long)1980041472) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

