//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class605;
import lavahack.client.Class851;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/features/module/render/shader/shaders/InertiaOutlineShader;", "", "()V", "mc", "Lnet/minecraft/client/Minecraft;", "kotlin.jvm.PlatformType", "drawEntities", "", "partialTicks", "", "range", "drawShader", "shaderHelper", "Lcom/kisman/cc/features/module/render/shader/shaders/troll/ShaderHelper;", "frameBufferFinal", "Lnet/minecraft/client/shader/Framebuffer;", "ticks", "setupUniforms", "updateUniforms", "kisman.cc"})
public final class Class270 {
    private static final Minecraft Field9195;
    public static final Class270 Field9196;
    private int Field9197;

    public final void Method1445(@NotNull @NotNull Class851 class851, @NotNull @NotNull Framebuffer framebuffer, float f) {
        Intrinsics.checkParameterIsNotNull((Object)class851, (String)"shaderHelper");
        Intrinsics.checkParameterIsNotNull((Object)framebuffer, (String)"frameBufferFinal");
        Class605.Field10581.Method2624();
        Class605.Field10581.Method2617(true);
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        ShaderGroup shaderGroup = class851.Method3587();
        if (shaderGroup == null) {
            Intrinsics.throwNpe();
        }
        shaderGroup.render(f);
        Class605.Field10581.Method2617(true);
        Class605.Field10581.Method2620(false);
        Minecraft minecraft = Field9195;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        minecraft.getFramebuffer().bindFramebuffer(false);
        framebuffer.framebufferRenderExt(Class270.Field9195.displayWidth, Class270.Field9195.displayHeight, false);
        Class605.Field10581.Method2617(true);
        Class605.Field10581.Method2620(true);
        Class605.Field10581.Method2625();
    }

    public final void Method1446(float f, float f2) {
        double d;
        Class605.Field10581.Method2621(true);
        Class605.Field10581.Method2616(true);
        Class605.Field10581.Method2620(true);
        GlStateManager.depthMask((boolean)true);
        Frustum frustum = new Frustum();
        Entity entity = Class270.Field9195.renderViewEntity;
        if (entity == null) {
            entity = (Entity)Class270.Field9195.player;
        }
        Entity entity2 = entity;
        double d2 = d = (double)f;
        double d3 = entity2.posX;
        double d4 = entity2.lastTickPosX;
        return (void)(d4 + (d3 - d4) * d2);
    }

    public final void Method1447() {
    }

    public final void Method1448(@NotNull @NotNull Class851 class851) {
        Intrinsics.checkParameterIsNotNull((Object)class851, (String)"shaderHelper");
    }

    private Class270() {
    }

    static {
        Class270 class270;
        Field9196 = class270 = new Class270();
        Field9195 = Minecraft.getMinecraft();
    }

    private static String Method1449(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 51;
            cArray2[n] = (char)(cArray[n] ^ (0x798E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

