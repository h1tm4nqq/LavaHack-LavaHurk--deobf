//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.Shader
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.AccessorShaderGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1160;
import lavahack.client.Class130;
import lavahack.client.Class605;
import lavahack.client.Class850;
import lavahack.client.Class851;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0016\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2={"Lcom/kisman/cc/features/module/render/shader/shaders/Outline2Shader;", "", "()V", "filledAlpha", "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$UniformFloat;", "mc", "Lnet/minecraft/client/Minecraft;", "kotlin.jvm.PlatformType", "outlineAlpha", "ratio", "width", "widthSq", "drawEntities", "", "partialTicks", "", "range", "drawShader", "shaderHelper", "Lcom/kisman/cc/features/module/render/shader/shaders/troll/ShaderHelper;", "frameBufferFinal", "Lnet/minecraft/client/shader/Framebuffer;", "setupUniforms", "updateUniforms", "kisman.cc"})
public final class Class1242 {
    private static final Minecraft Field13632;
    private static Class130 Field13633;
    private static Class130 Field13634;
    private static Class130 Field13635;
    private static Class130 Field13636;
    private static Class130 Field13637;
    public static final Class1242 Field13638;
    private String Field13639 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method4991(float f, float f2, float f3, float f4) {
        float f5;
        Field13633 = new Class130("outlineAlpha", f);
        Field13634 = new Class130("filledAlpha", f2);
        Field13635 = new Class130("width", f3);
        float f6 = f3;
        int n = 2;
        String string = "widthSq";
        boolean bl = false;
        float f7 = f5 = (float)Math.pow(f6, n);
        String string2 = string;
        Field13636 = new Class130(string2, f7);
        Field13637 = new Class130("ratio", f4);
    }

    public final void Method4992(@NotNull @NotNull Class851 class851, @NotNull @NotNull Framebuffer framebuffer, float f) {
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
        Minecraft minecraft = Field13632;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        minecraft.getFramebuffer().bindFramebuffer(false);
        framebuffer.framebufferRenderExt(Class1242.Field13632.displayWidth, Class1242.Field13632.displayHeight, false);
        Class605.Field10581.Method2617(true);
        Class605.Field10581.Method2620(true);
        Class605.Field10581.Method2625();
    }

    public final void Method4993(float f, float f2) {
        double d;
        Class605.Field10581.Method2621(true);
        Class605.Field10581.Method2616(true);
        Class605.Field10581.Method2620(true);
        GlStateManager.depthMask((boolean)true);
        Frustum frustum = new Frustum();
        Entity entity = Class1242.Field13632.renderViewEntity;
        if (entity == null) {
            entity = (Entity)Class1242.Field13632.player;
        }
        Entity entity2 = entity;
        double d2 = d = (double)f;
        double d3 = entity2.posX;
        double d4 = entity2.lastTickPosX;
        return (void)(d4 + (d3 - d4) * d2);
    }

    public final void Method4994(@NotNull @NotNull Class851 class851) {
        Intrinsics.checkParameterIsNotNull((Object)class851, (String)"shaderHelper");
        ShaderGroup shaderGroup = class851.Method3587();
        if (shaderGroup == null) return;
        ShaderGroup shaderGroup2 = shaderGroup;
        boolean bl = false;
        boolean bl2 = false;
        ShaderGroup shaderGroup3 = shaderGroup2;
        boolean bl3 = false;
        ShaderGroup shaderGroup4 = shaderGroup3;
        if (shaderGroup4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorShaderGroup");
        }
        Iterator iterator = ((AccessorShaderGroup)shaderGroup4).Method5561().iterator();
        while (iterator.hasNext()) {
            Shader shader;
            Shader shader2 = shader = (Shader)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)shader2, (String)"shader");
            Class1160[] class1160Array = new Class1160[5];
            Class130 class130 = Field13633;
            if (class130 == null) {
                Intrinsics.throwNpe();
            }
            class1160Array[0] = class130;
            Class130 class1302 = Field13634;
            if (class1302 == null) {
                Intrinsics.throwNpe();
            }
            class1160Array[1] = class1302;
            Class130 class1303 = Field13635;
            if (class1303 == null) {
                Intrinsics.throwNpe();
            }
            class1160Array[2] = class1303;
            Class130 class1304 = Field13636;
            if (class1304 == null) {
                Intrinsics.throwNpe();
            }
            class1160Array[3] = class1304;
            Class130 class1305 = Field13637;
            if (class1305 == null) {
                Intrinsics.throwNpe();
            }
            class1160Array[4] = class1305;
            Class850.Field11592.Method1585(shader2, class1160Array);
        }
    }

    private Class1242() {
    }

    static {
        Class1242 class1242;
        Field13638 = class1242 = new Class1242();
        Field13632 = Minecraft.getMinecraft();
    }

    private static String Method4995(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 208;
            cArray2[n] = (char)(cArray[n] ^ (0x4E1E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

