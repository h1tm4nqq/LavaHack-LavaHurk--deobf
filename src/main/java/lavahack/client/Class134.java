//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.shader.Framebuffer
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import com.kisman.cc.util.Class886;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class701;
import lavahack.client.Class921;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.shader.Framebuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "Lcom/kisman/cc/util/render/shader/framebuffer/Shader;", "fragmentShader", "", "(Ljava/lang/String;)V", "entityShadows", "", "drawFramebuffer", "", "framebuffer", "Lnet/minecraft/client/shader/Framebuffer;", "setupFramebuffer", "startDraw", "ticks", "", "stopDraw", "Companion", "kisman.cc"})
public abstract class Class134
extends Class701 {
    private boolean Field8494;
    @Nullable
    private static Framebuffer Field8495;
    public static final Class921 Field8496;
    private String Field8497 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method923(float f) {
        GlStateManager.enableAlpha();
        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib();
        Framebuffer framebuffer = this.Method926(Field8495);
        boolean bl = false;
        boolean bl2 = false;
        Framebuffer framebuffer2 = framebuffer;
        boolean bl3 = false;
        Field8495 = framebuffer2;
        framebuffer.framebufferClear();
        Framebuffer framebuffer3 = Field8495;
        if (framebuffer3 != null) {
            framebuffer3.bindFramebuffer(true);
        }
        this.Field8494 = Class2142.Field17803.gameSettings.entityShadows;
        Class2142.Field17803.gameSettings.entityShadows = false;
        Class2142.Field17803.entityRenderer.setupCameraTransform(f, 0);
    }

    public final void Method924() {
        Class2142.Field17803.gameSettings.entityShadows = this.Field8494;
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        Minecraft minecraft = Class2142.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        minecraft.getFramebuffer().bindFramebuffer(true);
        Class2142.Field17803.entityRenderer.disableLightmap();
        RenderHelper.disableStandardItemLighting();
        this.Method915();
        Class2142.Field17803.entityRenderer.setupOverlayRendering();
        Framebuffer framebuffer = Field8495;
        if (framebuffer == null) {
            Intrinsics.throwNpe();
        }
        this.Method925(framebuffer);
        this.Method916();
        Class2142.Field17803.entityRenderer.disableLightmap();
        GlStateManager.popMatrix();
        GlStateManager.popAttrib();
    }

    private final void Method925(Framebuffer framebuffer) {
        GL11.glBindTexture((int)3553, (int)framebuffer.framebufferTexture);
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)Class886.Method3707().getScaledHeight_double());
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)Class886.Method3707().getScaledWidth_double(), (double)Class886.Method3707().getScaledHeight_double());
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex2d((double)Class886.Method3707().getScaledWidth_double(), (double)0.0);
        GL11.glEnd();
        GL20.glUseProgram((int)0);
    }

    private final Framebuffer Method926(Framebuffer framebuffer) {
        if (framebuffer == null) return new Framebuffer(Class2142.Field17803.displayWidth, Class2142.Field17803.displayHeight, true);
        framebuffer.deleteFramebuffer();
        return new Framebuffer(Class2142.Field17803.displayWidth, Class2142.Field17803.displayHeight, true);
    }

    public Class134(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"fragmentShader");
        super(string);
    }

    static {
        Field8496 = new Class921(null);
    }

    public static final Framebuffer Method927() {
        return Field8495;
    }

    public static final void Method928(Framebuffer framebuffer) {
        Field8495 = framebuffer;
    }

    private static String Method922(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 85;
            cArray2[n] = (char)(cArray[n] ^ (0x30CB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

