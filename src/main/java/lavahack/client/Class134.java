//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.shader.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.*;
import com.kisman.cc.util.*;
import org.lwjgl.opengl.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u0011" }, d2 = { "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "Lcom/kisman/cc/util/render/shader/framebuffer/Shader;", "fragmentShader", "", "(Ljava/lang/String;)V", "entityShadows", "", "drawFramebuffer", "", "framebuffer", "Lnet/minecraft/client/shader/Framebuffer;", "setupFramebuffer", "startDraw", "ticks", "", "stopDraw", "Companion", "kisman.cc" })
public abstract class Class134 extends Class701
{
    private boolean Field8494;
    @Nullable
    private static Framebuffer Field8495;
    public static final Class921 Field8496;
    private String Field8497 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method923(final float n) {
        GlStateManager.enableAlpha();
        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib();
        (Class134.Field8495 = this.Method926(Class134.Field8495)).framebufferClear();
        final Framebuffer field8495 = Class134.Field8495;
        if (field8495 != null) {
            field8495.bindFramebuffer(true);
        }
        this.Field8494 = Class2142.Field17803.gameSettings.entityShadows;
        Class2142.Field17803.gameSettings.entityShadows = false;
        Class2142.Field17803.entityRenderer.setupCameraTransform(n, 0);
    }
    
    public final void Method924() {
        Class2142.Field17803.gameSettings.entityShadows = this.Field8494;
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        final Minecraft field17803 = Class2142.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)field17803, "mc");
        field17803.getFramebuffer().bindFramebuffer(true);
        Class2142.Field17803.entityRenderer.disableLightmap();
        RenderHelper.disableStandardItemLighting();
        this.Method915();
        Class2142.Field17803.entityRenderer.setupOverlayRendering();
        final Framebuffer field17804 = Class134.Field8495;
        if (field17804 == null) {
            Intrinsics.throwNpe();
        }
        this.Method925(field17804);
        this.Method916();
        Class2142.Field17803.entityRenderer.disableLightmap();
        GlStateManager.popMatrix();
        GlStateManager.popAttrib();
    }
    
    private final void Method925(final Framebuffer framebuffer) {
        GL11.glBindTexture(3553, framebuffer.framebufferTexture);
        GL11.glBegin(7);
        GL11.glTexCoord2d(0.0, 1.0);
        GL11.glVertex2d(0.0, 0.0);
        GL11.glTexCoord2d(0.0, 0.0);
        GL11.glVertex2d(0.0, Class886.Method3707().getScaledHeight_double());
        GL11.glTexCoord2d(1.0, 0.0);
        GL11.glVertex2d(Class886.Method3707().getScaledWidth_double(), Class886.Method3707().getScaledHeight_double());
        GL11.glTexCoord2d(1.0, 1.0);
        GL11.glVertex2d(Class886.Method3707().getScaledWidth_double(), 0.0);
        GL11.glEnd();
        GL20.glUseProgram(0);
    }
    
    private final Framebuffer Method926(final Framebuffer framebuffer) {
        if (framebuffer != null) {
            framebuffer.deleteFramebuffer();
        }
        return new Framebuffer(Class2142.Field17803.displayWidth, Class2142.Field17803.displayHeight, true);
    }
    
    public Class134(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "fragmentShader");
        super(s);
    }
    
    static {
        Field8496 = new Class921(null);
    }
    
    public static final Framebuffer Method927() {
        return Class134.Field8495;
    }
    
    public static final void Method928(final Framebuffer field8495) {
        Class134.Field8495 = field8495;
    }
    
    private static String Method922(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x30CB ^ 0x55));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
