//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.entity.*;
import kotlin.*;
import com.kisman.cc.mixin.mixins.accessor.*;
import net.minecraft.client.shader.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0016\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u0018" }, d2 = { "Lcom/kisman/cc/features/module/render/shader/shaders/Outline2Shader;", "", "()V", "filledAlpha", "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$UniformFloat;", "mc", "Lnet/minecraft/client/Minecraft;", "kotlin.jvm.PlatformType", "outlineAlpha", "ratio", "width", "widthSq", "drawEntities", "", "partialTicks", "", "range", "drawShader", "shaderHelper", "Lcom/kisman/cc/features/module/render/shader/shaders/troll/ShaderHelper;", "frameBufferFinal", "Lnet/minecraft/client/shader/Framebuffer;", "setupUniforms", "updateUniforms", "kisman.cc" })
public final class Class1242
{
    private static final Minecraft Field13632;
    private static Class130 Field13633;
    private static Class130 Field13634;
    private static Class130 Field13635;
    private static Class130 Field13636;
    private static Class130 Field13637;
    public static final Class1242 Field13638;
    private String Field13639 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method4991(final float n, final float n2, final float n3, final float n4) {
        Class1242.Field13633 = new Class130("outlineAlpha", n);
        Class1242.Field13634 = new Class130("filledAlpha", n2);
        Class1242.Field13635 = new Class130("width", n3);
        Class1242.Field13636 = new Class130("widthSq", (float)Math.pow(n3, 2));
        Class1242.Field13637 = new Class130("ratio", n4);
    }
    
    public final void Method4992(@NotNull @NotNull final Class851 class851, @NotNull @NotNull final Framebuffer framebuffer, final float n) {
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
        final Minecraft field13632 = Class1242.Field13632;
        Intrinsics.checkExpressionValueIsNotNull((Object)field13632, "mc");
        field13632.getFramebuffer().bindFramebuffer(false);
        framebuffer.framebufferRenderExt(Class1242.Field13632.displayWidth, Class1242.Field13632.displayHeight, false);
        Class605.Field10581.Method2617(true);
        Class605.Field10581.Method2620(true);
        Class605.Field10581.Method2625();
    }
    
    public final void Method4993(final float n, final float n2) {
        Class605.Field10581.Method2621(true);
        Class605.Field10581.Method2616(true);
        Class605.Field10581.Method2620(true);
        GlStateManager.depthMask(true);
        final Frustum frustum = new Frustum();
        Entity renderViewEntity;
        if ((renderViewEntity = Class1242.Field13632.renderViewEntity) == null) {
            renderViewEntity = (Entity)Class1242.Field13632.player;
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
    
    public final void Method4994(@NotNull @NotNull final Class851 class851) {
        Intrinsics.checkParameterIsNotNull((Object)class851, "shaderHelper");
        final ShaderGroup method3587 = class851.Method3587();
        if (method3587 != null) {
            final AccessorShaderGroup accessorShaderGroup = (AccessorShaderGroup)method3587;
            if (accessorShaderGroup == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorShaderGroup");
            }
            for (final Shader shader : accessorShaderGroup.Method5561()) {
                final Class309 field11592 = Class850.Field11592;
                final Shader shader2 = shader;
                Intrinsics.checkExpressionValueIsNotNull((Object)shader2, "shader");
                final Class1160[] array = new Class1160[5];
                final int n = 0;
                final Class130 field11593 = Class1242.Field13633;
                if (field11593 == null) {
                    Intrinsics.throwNpe();
                }
                array[n] = field11593;
                final int n2 = 1;
                final Class130 field11594 = Class1242.Field13634;
                if (field11594 == null) {
                    Intrinsics.throwNpe();
                }
                array[n2] = field11594;
                final int n3 = 2;
                final Class130 field11595 = Class1242.Field13635;
                if (field11595 == null) {
                    Intrinsics.throwNpe();
                }
                array[n3] = field11595;
                final int n4 = 3;
                final Class130 field11596 = Class1242.Field13636;
                if (field11596 == null) {
                    Intrinsics.throwNpe();
                }
                array[n4] = field11596;
                final int n5 = 4;
                final Class130 field11597 = Class1242.Field13637;
                if (field11597 == null) {
                    Intrinsics.throwNpe();
                }
                array[n5] = field11597;
                field11592.Method1585(shader2, array);
            }
        }
    }
    
    private Class1242() {
    }
    
    static {
        Field13638 = new Class1242();
        Field13632 = Minecraft.getMinecraft();
    }
    
    private static String Method4995(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4E1E ^ 0xD0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
