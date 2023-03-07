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
import lavahack.client.CyrKRCg4U4R1RF4jhG8M1Yvfpuo5ZZYR;
import lavahack.client.YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.Shader;
import net.minecraft.client.shader.ShaderUniform;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL20;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Companion;", "", "()V", "clearFrameBuffer", "", "frameBuffer", "Lnet/minecraft/client/shader/Framebuffer;", "setupUniforms", "shader", "Lcom/kisman/cc/features/module/render/shader/Shader;", "uniforms", "", "Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;", "(Lcom/kisman/cc/features/module/render/shader/Shader;[Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;)V", "Lnet/minecraft/client/shader/Shader;", "(Lnet/minecraft/client/shader/Shader;[Lcom/kisman/cc/features/module/render/shader/ShaderUtil$Uniform;)V", "kisman.cc"})
public final class YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private String Field9317 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method1584(@NotNull @NotNull CyrKRCg4U4R1RF4jhG8M1Yvfpuo5ZZYR cyrKRCg4U4R1RF4jhG8M1Yvfpuo5ZZYR, @NotNull @NotNull YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray) {
        Intrinsics.checkParameterIsNotNull((Object)cyrKRCg4U4R1RF4jhG8M1Yvfpuo5ZZYR, (String)"shader");
        Intrinsics.checkParameterIsNotNull((Object)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray, (String)"uniforms");
        YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray2 = yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
        int n = yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray2.length;
        int n2 = (int)1477059590L ^ 0x580A2406;
        while (n2 < n) {
            YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray2[n2];
            if (yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf instanceof YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
                GL20.glUniform1f((int)cyrKRCg4U4R1RF4jhG8M1Yvfpuo5ZZYR.Method238(((YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method864()), (float)((YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method865());
            }
            if (yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf instanceof YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
                GL20.glUniform1i((int)cyrKRCg4U4R1RF4jhG8M1Yvfpuo5ZZYR.Method238(((YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method5079()), (int)((YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method5080());
            }
            if (yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf instanceof YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS) {
                GL20.glUniform2f((int)cyrKRCg4U4R1RF4jhG8M1Yvfpuo5ZZYR.Method238(((YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method6931()), (float)((YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method6932().x, (float)((YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method6932().y);
            }
            ++n2;
        }
    }

    public final void Method1585(@NotNull @NotNull Shader shader, @NotNull @NotNull YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray) {
        Intrinsics.checkParameterIsNotNull((Object)shader, (String)"shader");
        Intrinsics.checkParameterIsNotNull((Object)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray, (String)"uniforms");
        YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray2 = yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
        int n = yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray2.length;
        int n2 = (int)-1460599435L ^ 0xA8F10575;
        while (n2 < n) {
            YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray2[n2];
            if (yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf instanceof YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
                ShaderUniform shaderUniform = shader.getShaderManager().getShaderUniform(((YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method864());
                if (shaderUniform != null) {
                    shaderUniform.set(((YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method865());
                }
            }
            if (yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf instanceof YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
                ShaderUniform shaderUniform = shader.getShaderManager().getShaderUniform(((YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method5079());
                if (shaderUniform != null) {
                    shaderUniform.set((float)((YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)yKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method5080());
                }
            }
            ++n2;
        }
    }

    public final void Method1586(@NotNull @NotNull Framebuffer framebuffer) {
        Intrinsics.checkParameterIsNotNull((Object)framebuffer, (String)"frameBuffer");
        Framebuffer framebuffer2 = framebuffer;
        int n = (int)((long)-2139129317 ^ (long)-2139129317);
        int n2 = (int)258870709L ^ 0xF6E0DB5;
        Framebuffer framebuffer3 = framebuffer2;
        int n3 = (int)-659407565L ^ 0xD8B23D33;
        framebuffer3.bindFramebuffer((boolean)((long)904778635 ^ (long)904778634));
        GlStateManager.clearColor((float)framebuffer3.framebufferColor[(int)((long)1771758098 ^ (long)1771758098)], (float)framebuffer3.framebufferColor[(int)-287971741L ^ 0xEED5E662], (float)framebuffer3.framebufferColor[(int)((long)333854126 ^ (long)333854127) << 1], (float)framebuffer3.framebufferColor[(int)1929712494L ^ 0x7305136D]);
        int n4 = (int)((long)-1373162200 ^ (long)-1373162199) << 14;
        if (framebuffer3.useDepth) {
            GlStateManager.clearDepth((double)1.0);
            n4 |= ((int)526272294L ^ 0x1F5E4727) << 8;
        }
        GlStateManager.clear((int)n4);
    }

    private YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public YKpXCFLm1fUIRSMvKJCMx60MfXpx5yro$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method1587(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1200793450 ^ (long)1200793450);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)146519163L ^ 0x8BBB484);
            int n2 = ((int)832627171L ^ 0x31A0E1FA) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-507114122L ^ 0xE1C6019F) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

