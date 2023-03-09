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

import lavahack.client.Class1297;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public abstract class Class1591
extends Class1297 {
    protected static int Field15440;
    protected static int Field15441;
    protected static int Field15442;
    public static final Minecraft Field15443;
    public static Framebuffer Field15444;
    public boolean Field15445;
    public int Field15446;
    private String Field15447 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1591(String string) {
        super(string);
    }

    public void Method241(float f) {
        GlStateManager.enableAlpha();
        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib();
        Field15444 = this.Method243(Field15444);
        Field15444.framebufferClear();
        Field15444.bindFramebuffer(true);
        this.Field15445 = Class1591.Field15443.gameSettings.entityShadows;
        Class1591.Field15443.gameSettings.entityShadows = false;
        Class1591.Field15443.entityRenderer.setupCameraTransform(f, 0);
    }

    public void Method242() {
        Class1591.Field15443.gameSettings.entityShadows = this.Field15445;
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        Field15443.getFramebuffer().bindFramebuffer(true);
        Class1591.Field15443.entityRenderer.disableLightmap();
        RenderHelper.disableStandardItemLighting();
        this.Method230();
        Class1591.Field15443.entityRenderer.setupOverlayRendering();
        this.Method244(Field15444);
        this.Method231();
        Class1591.Field15443.entityRenderer.disableLightmap();
        GlStateManager.popMatrix();
        GlStateManager.popAttrib();
    }

    public Framebuffer Method243(Framebuffer framebuffer) {
        if (!Display.isActive() && !Display.isVisible()) {
            if (framebuffer != null) return framebuffer;
            return new Framebuffer(Class1591.Field15443.displayWidth, Class1591.Field15443.displayHeight, true);
        }
        if (framebuffer == null) {
            return new Framebuffer(Class1591.Field15443.displayWidth, Class1591.Field15443.displayHeight, true);
        }
        framebuffer.framebufferClear();
        ScaledResolution scaledResolution = new ScaledResolution(Field15443);
        int n = scaledResolution.getScaleFactor();
        int n2 = scaledResolution.getScaledWidth();
        int n3 = scaledResolution.getScaledHeight();
        if (Field15440 != n || Field15441 != n2 || Field15442 != n3) {
            framebuffer.deleteFramebuffer();
            framebuffer = new Framebuffer(Class1591.Field15443.displayWidth, Class1591.Field15443.displayHeight, true);
            framebuffer.framebufferClear();
        }
        Field15440 = n;
        Field15441 = n2;
        Field15442 = n3;
        return framebuffer;
    }

    public void Method244(Framebuffer framebuffer) {
        ScaledResolution scaledResolution = new ScaledResolution(Field15443);
        GL11.glBindTexture((int)3553, (int)framebuffer.framebufferTexture);
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)scaledResolution.getScaledHeight());
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)scaledResolution.getScaledWidth(), (double)scaledResolution.getScaledHeight());
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex2d((double)scaledResolution.getScaledWidth(), (double)0.0);
        GL11.glEnd();
        GL20.glUseProgram((int)0);
    }

    static {
        Field15443 = Minecraft.getMinecraft();
    }
}

