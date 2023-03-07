//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.shader.Framebuffer
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.CyrKRCg4U4R1RF4jhG8M1Yvfpuo5ZZYR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public abstract class QeKqDKHtLfIoFEKMMGksH0qruCVSVC83
extends CyrKRCg4U4R1RF4jhG8M1Yvfpuo5ZZYR {
    protected static int Field15440;
    protected static int Field15441;
    protected static int Field15442;
    public static final Minecraft Field15443;
    public static Framebuffer Field15444;
    public boolean Field15445;
    public int Field15446;
    private String Field15447 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public QeKqDKHtLfIoFEKMMGksH0qruCVSVC83(String string) {
        super(string);
    }

    public void Method241(float f) {
        GlStateManager.enableAlpha();
        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib();
        Field15444 = this.Method243(Field15444);
        Field15444.framebufferClear();
        Field15444.bindFramebuffer((boolean)((long)1604123670 ^ (long)1604123671));
        this.Field15445 = QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.gameSettings.entityShadows;
        QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.gameSettings.entityShadows = (int)((long)319631966 ^ (long)319631966);
        QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.entityRenderer.setupCameraTransform(f, (int)((long)-550979514 ^ (long)-550979514));
    }

    public void Method242() {
        QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.gameSettings.entityShadows = this.Field15445;
        GL11.glEnable((int)(((int)34764131L ^ 0x2127092) << 1));
        GL11.glBlendFunc((int)(((int)-1474467313L ^ 0xA81D6B8E) << 1), (int)((int)((long)2128118410 ^ (long)2128118153)));
        Field15443.getFramebuffer().bindFramebuffer((boolean)((long)-284272512 ^ (long)-284272511));
        QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.entityRenderer.disableLightmap();
        RenderHelper.disableStandardItemLighting();
        this.Method230();
        QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.entityRenderer.setupOverlayRendering();
        this.Method244(Field15444);
        this.Method231();
        QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.entityRenderer.disableLightmap();
        GlStateManager.popMatrix();
        GlStateManager.popAttrib();
    }

    public Framebuffer Method243(Framebuffer framebuffer) {
        if (!Display.isActive() && !Display.isVisible()) {
            if (framebuffer != null) return framebuffer;
            return new Framebuffer(QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.displayWidth, QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.displayHeight, ((int)-373219905L ^ 0xE9C11DBE) != 0);
        }
        if (framebuffer == null) {
            return new Framebuffer(QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.displayWidth, QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.displayHeight, ((int)-1313420589L ^ 0xB1B6CAD2) != 0);
        }
        framebuffer.framebufferClear();
        ScaledResolution scaledResolution = new ScaledResolution(Field15443);
        int n = scaledResolution.getScaleFactor();
        int n2 = scaledResolution.getScaledWidth();
        int n3 = scaledResolution.getScaledHeight();
        if (Field15440 != n || Field15441 != n2 || Field15442 != n3) {
            framebuffer.deleteFramebuffer();
            framebuffer = new Framebuffer(QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.displayWidth, QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.displayHeight, (boolean)((long)-1852445513 ^ (long)-1852445514));
            framebuffer.framebufferClear();
        }
        Field15440 = n;
        Field15441 = n2;
        Field15442 = n3;
        return framebuffer;
    }

    public void Method244(Framebuffer framebuffer) {
        ScaledResolution scaledResolution = new ScaledResolution(Field15443);
        GL11.glBindTexture((int)((int)((long)-2097840075 ^ (long)-2097836588)), (int)framebuffer.framebufferTexture);
        GL11.glBegin((int)((int)338199102L ^ 0x14288239));
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)scaledResolution.getScaledHeight());
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)scaledResolution.getScaledWidth(), (double)scaledResolution.getScaledHeight());
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex2d((double)scaledResolution.getScaledWidth(), (double)0.0);
        GL11.glEnd();
        GL20.glUseProgram((int)((int)260533597L ^ 0xF876D5D));
    }

    static {
        Field15443 = Minecraft.getMinecraft();
    }
}

