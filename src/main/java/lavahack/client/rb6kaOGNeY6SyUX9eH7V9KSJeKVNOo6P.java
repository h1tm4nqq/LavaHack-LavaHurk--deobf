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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.PZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H;
import lavahack.client.rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.shader.Framebuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "Lcom/kisman/cc/util/render/shader/framebuffer/Shader;", "fragmentShader", "", "(Ljava/lang/String;)V", "entityShadows", "", "drawFramebuffer", "", "framebuffer", "Lnet/minecraft/client/shader/Framebuffer;", "setupFramebuffer", "startDraw", "ticks", "", "stopDraw", "Companion", "kisman.cc"})
public abstract class rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P
extends PZpKsR2HT0hxlPYyyQUpMA7nUrgViO7H {
    private boolean Field8494;
    @Nullable
    private static Framebuffer Field8495;
    public static final rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8496;
    private String Field8497 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method923(float f) {
        GlStateManager.enableAlpha();
        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib();
        Framebuffer framebuffer = this.Method926(Field8495);
        int n = (int)((long)1345119495 ^ (long)1345119495);
        int n2 = (int)((long)-9914027 ^ (long)-9914027);
        Framebuffer framebuffer2 = framebuffer;
        int n3 = (int)((long)-1468927127 ^ (long)-1468927127);
        Field8495 = framebuffer2;
        framebuffer.framebufferClear();
        Framebuffer framebuffer3 = Field8495;
        if (framebuffer3 != null) {
            framebuffer3.bindFramebuffer((boolean)((long)-973856983 ^ (long)-973856984));
        }
        this.Field8494 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.gameSettings.entityShadows;
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.gameSettings.entityShadows = (int)-1418685566L ^ 0xAB709382;
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.entityRenderer.setupCameraTransform(f, (int)427922754L ^ 0x19819542);
    }

    public final void Method924() {
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.gameSettings.entityShadows = this.Field8494;
        GL11.glEnable((int)((int)((long)-1189150491 ^ (long)-1189149420) << 1));
        GL11.glBlendFunc((int)(((int)543357747L ^ 0x2062FAB2) << 1), (int)((int)-1885301473L ^ 0x8FA0961C));
        Minecraft minecraft = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        minecraft.getFramebuffer().bindFramebuffer(((int)-1878168059L ^ 0x900D6E04) != 0);
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.entityRenderer.disableLightmap();
        RenderHelper.disableStandardItemLighting();
        this.Method915();
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.entityRenderer.setupOverlayRendering();
        Framebuffer framebuffer = Field8495;
        if (framebuffer == null) {
            Intrinsics.throwNpe();
        }
        this.Method925(framebuffer);
        this.Method916();
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.entityRenderer.disableLightmap();
        GlStateManager.popMatrix();
        GlStateManager.popAttrib();
    }

    private final void Method925(Framebuffer framebuffer) {
        GL11.glBindTexture((int)((int)1665452695L ^ 0x6344C776), (int)framebuffer.framebufferTexture);
        GL11.glBegin((int)((int)((long)200781116 ^ (long)200781115)));
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3707().getScaledHeight_double());
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3707().getScaledWidth_double(), (double)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3707().getScaledHeight_double());
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex2d((double)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3707().getScaledWidth_double(), (double)0.0);
        GL11.glEnd();
        GL20.glUseProgram((int)((int)((long)64072617 ^ (long)64072617)));
    }

    private final Framebuffer Method926(Framebuffer framebuffer) {
        if (framebuffer == null) return new Framebuffer(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.displayWidth, Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.displayHeight, (boolean)((long)-496528564 ^ (long)-496528563));
        framebuffer.deleteFramebuffer();
        return new Framebuffer(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.displayWidth, Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.displayHeight, (boolean)((long)-496528564 ^ (long)-496528563));
    }

    public rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"fragmentShader");
        super(string);
    }

    static {
        Field8496 = new rb6kaOGNeY6SyUX9eH7V9KSJeKVNOo6P$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
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
        int n = (int)((long)1615681010 ^ (long)1615681010);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1151536015L ^ 0x44A30B70);
            int n2 = (int)1633979784L ^ 0x61648DDD;
            cArray2[n] = (char)(cArray[n] ^ ((int)-825803000L ^ 0xCEC70FC3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

