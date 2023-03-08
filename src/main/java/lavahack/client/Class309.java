//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.shader.*;
import net.minecraft.client.renderer.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b?\u0006\u0002\u0010\rJ!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b?\u0006\u0002\u0010\u000f?\u0006\u0010" }, d2 = { "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Companion;", "", "()V", "clearFrameBuffer", "", "frameBuffer", "Lnet/minecraft/client/shader/Framebuffer;", "setupUniforms", "shader", "Lcom/kisman/cc/features/module/render/shader/Shader;", "uniforms", "", "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;", "(Lcom/kisman/cc/features/module/render/shader/Shader;[Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;)V", "Lnet/minecraft/client/shader/Shader;", "(Lnet/minecraft/client/shader/Shader;[Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;)V", "kisman.cc" })
public final class Class309
{
    private String Field9317 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method1584(@NotNull @NotNull final Class1297 class1297, @NotNull @NotNull final Class1160[] array) {
        Intrinsics.checkParameterIsNotNull((Object)class1297, "shader");
        Intrinsics.checkParameterIsNotNull((Object)array, "uniforms");
        for (final Class1160 class1298 : array) {
            if (class1298 instanceof Class130) {
                GL20.glUniform1f(class1297.Method238(((Class130)class1298).Method864()), ((Class130)class1298).Method865());
            }
            if (class1298 instanceof Class1257) {
                GL20.glUniform1i(class1297.Method238(((Class1257)class1298).Method5079()), ((Class1257)class1298).Method5080());
            }
            if (class1298 instanceof Class1838) {
                GL20.glUniform2f(class1297.Method238(((Class1838)class1298).Method6931()), ((Class1838)class1298).Method6932().x, ((Class1838)class1298).Method6932().y);
            }
        }
    }
    
    public final void Method1585(@NotNull @NotNull final Shader shader, @NotNull @NotNull final Class1160[] array) {
        Intrinsics.checkParameterIsNotNull((Object)shader, "shader");
        Intrinsics.checkParameterIsNotNull((Object)array, "uniforms");
        for (final Class1160 class1160 : array) {
            if (class1160 instanceof Class130) {
                final ShaderUniform getShaderUniform = shader.getShaderManager().getShaderUniform(((Class130)class1160).Method864());
                if (getShaderUniform != null) {
                    getShaderUniform.set(((Class130)class1160).Method865());
                }
            }
            if (class1160 instanceof Class1257) {
                final ShaderUniform getShaderUniform2 = shader.getShaderManager().getShaderUniform(((Class1257)class1160).Method5079());
                if (getShaderUniform2 != null) {
                    getShaderUniform2.set((float)((Class1257)class1160).Method5080());
                }
            }
        }
    }
    
    public final void Method1586(@NotNull @NotNull final Framebuffer framebuffer) {
        Intrinsics.checkParameterIsNotNull((Object)framebuffer, "frameBuffer");
        framebuffer.bindFramebuffer(true);
        GlStateManager.clearColor(framebuffer.framebufferColor[0], framebuffer.framebufferColor[1], framebuffer.framebufferColor[2], framebuffer.framebufferColor[3]);
        int n = 16384;
        if (framebuffer.useDepth) {
            GlStateManager.clearDepth(1.0);
            n |= 0x100;
        }
        GlStateManager.clear(n);
    }
    
    private Class309() {
    }
    
    public Class309(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method1587(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6748 ^ 0x64));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
