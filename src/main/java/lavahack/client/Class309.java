//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.client.shader.Shader
 *  net.minecraft.client.shader.ShaderUniform
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1160;
import lavahack.client.Class1257;
import lavahack.client.Class1297;
import lavahack.client.Class130;
import lavahack.client.Class1838;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderUniform;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL20;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Companion;", "", "()V", "clearFrameBuffer", "", "frameBuffer", "Lnet/minecraft/client/shader/Framebuffer;", "setupUniforms", "shader", "Lcom/kisman/cc/features/module/render/shader/Shader;", "uniforms", "", "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;", "(Lcom/kisman/cc/features/module/render/shader/Shader;[Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;)V", "Lnet/minecraft/client/shader/Shader;", "(Lnet/minecraft/client/shader/Shader;[Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;)V", "kisman.cc"})
public final class Class309 {
    private String Field9317 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method1584(@NotNull @NotNull Class1297 class1297, @NotNull @NotNull Class1160[] class1160Array) {
        Intrinsics.checkParameterIsNotNull((Object)class1297, (String)"shader");
        Intrinsics.checkParameterIsNotNull((Object)class1160Array, (String)"uniforms");
        Class1160[] class1160Array2 = class1160Array;
        int n = class1160Array2.length;
        int n2 = 0;
        while (n2 < n) {
            Class1160 class1160 = class1160Array2[n2];
            if (class1160 instanceof Class130) {
                GL20.glUniform1f((int)class1297.Method238(((Class130)class1160).Method864()), (float)((Class130)class1160).Method865());
            }
            if (class1160 instanceof Class1257) {
                GL20.glUniform1i((int)class1297.Method238(((Class1257)class1160).Method5079()), (int)((Class1257)class1160).Method5080());
            }
            if (class1160 instanceof Class1838) {
                GL20.glUniform2f((int)class1297.Method238(((Class1838)class1160).Method6931()), (float)((Class1838)class1160).Method6932().x, (float)((Class1838)class1160).Method6932().y);
            }
            ++n2;
        }
    }

    public final void Method1585(@NotNull @NotNull Shader shader, @NotNull @NotNull Class1160[] class1160Array) {
        Intrinsics.checkParameterIsNotNull((Object)shader, (String)"shader");
        Intrinsics.checkParameterIsNotNull((Object)class1160Array, (String)"uniforms");
        Class1160[] class1160Array2 = class1160Array;
        int n = class1160Array2.length;
        int n2 = 0;
        while (n2 < n) {
            Class1160 class1160 = class1160Array2[n2];
            if (class1160 instanceof Class130) {
                ShaderUniform shaderUniform = shader.getShaderManager().getShaderUniform(((Class130)class1160).Method864());
                if (shaderUniform != null) {
                    shaderUniform.set(((Class130)class1160).Method865());
                }
            }
            if (class1160 instanceof Class1257) {
                ShaderUniform shaderUniform = shader.getShaderManager().getShaderUniform(((Class1257)class1160).Method5079());
                if (shaderUniform != null) {
                    shaderUniform.set((float)((Class1257)class1160).Method5080());
                }
            }
            ++n2;
        }
    }

    public final void Method1586(@NotNull @NotNull Framebuffer framebuffer) {
        Intrinsics.checkParameterIsNotNull((Object)framebuffer, (String)"frameBuffer");
        Framebuffer framebuffer2 = framebuffer;
        boolean bl = false;
        boolean bl2 = false;
        Framebuffer framebuffer3 = framebuffer2;
        boolean bl3 = false;
        framebuffer3.bindFramebuffer(true);
        GlStateManager.clearColor((float)framebuffer3.framebufferColor[0], (float)framebuffer3.framebufferColor[1], (float)framebuffer3.framebufferColor[2], (float)framebuffer3.framebufferColor[3]);
        int n = 16384;
        if (framebuffer3.useDepth) {
            GlStateManager.clearDepth((double)1.0);
            n |= 0x100;
        }
        GlStateManager.clear((int)n);
    }

    private Class309() {
    }

    public Class309(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method1587(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 100;
            cArray2[n] = (char)(cArray[n] ^ (0x6748 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

