//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.shader.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0013" }, d2 = { "Lcom/kisman/cc/features/module/render/shader/shaders/InertiaOutlineShader;", "", "()V", "mc", "Lnet/minecraft/client/Minecraft;", "kotlin.jvm.PlatformType", "drawEntities", "", "partialTicks", "", "range", "drawShader", "shaderHelper", "Lcom/kisman/cc/features/module/render/shader/shaders/troll/ShaderHelper;", "frameBufferFinal", "Lnet/minecraft/client/shader/Framebuffer;", "ticks", "setupUniforms", "updateUniforms", "kisman.cc" })
public final class Class270
{
    private static final Minecraft Field9195;
    public static final Class270 Field9196;
    private int Field9197;
    
    public final void Method1445(@NotNull @NotNull final Class851 class851, @NotNull @NotNull final Framebuffer framebuffer, final float n) {
        Intrinsics.checkParameterIsNotNull((Object)class851, "shaderHelper");
        Intrinsics.checkParameterIsNotNull((Object)framebuffer, "frameBufferFinal");
        Class605.Field10581.Method2624();
        Class605.Field10581.Method2617(true);
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        final ShaderGroup method3587 = class851.Method3587();
        if (method3587 == null) {
            Intrinsics.throwNpe();
        }
        method3587.render(n);
        Class605.Field10581.Method2617(true);
        Class605.Field10581.Method2620(false);
        final Minecraft field9195 = Class270.Field9195;
        Intrinsics.checkExpressionValueIsNotNull((Object)field9195, "mc");
        field9195.getFramebuffer().bindFramebuffer(false);
        framebuffer.framebufferRenderExt(Class270.Field9195.displayWidth, Class270.Field9195.displayHeight, false);
        Class605.Field10581.Method2617(true);
        Class605.Field10581.Method2620(true);
        Class605.Field10581.Method2625();
    }
    
    public final void Method1446(final float n, final float n2) {
        Class605.Field10581.Method2621(true);
        Class605.Field10581.Method2616(true);
        Class605.Field10581.Method2620(true);
        GlStateManager.depthMask(true);
        final Frustum frustum = new Frustum();
        Entity renderViewEntity;
        if ((renderViewEntity = Class270.Field9195.renderViewEntity) == null) {
            renderViewEntity = (Entity)Class270.Field9195.player;
        }
        final Entity entity = renderViewEntity;
        final double n3 = n;
        final double lastTickPosX = entity.lastTickPosX;
        final double posX = entity.posX;
        final double n4 = n3;
        final double n5 = posX;
        final double n6 = lastTickPosX;
        return (void)(n6 + (n5 - n6) * n4);
    }
    
    public final void Method1447() {
    }
    
    public final void Method1448(@NotNull @NotNull final Class851 class851) {
        Intrinsics.checkParameterIsNotNull((Object)class851, "shaderHelper");
    }
    
    private Class270() {
    }
    
    static {
        Field9196 = new Class270();
        Field9195 = Minecraft.getMinecraft();
    }
    
    private static String Method1449(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x798E ^ 0x33));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
