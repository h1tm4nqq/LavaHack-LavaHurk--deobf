//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.client.shader.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;

public abstract class Class1591 extends Class1297
{
    protected static int Field15440;
    protected static int Field15441;
    protected static int Field15442;
    public static final Minecraft Field15443;
    public static Framebuffer Field15444;
    public boolean Field15445;
    public int Field15446;
    private String Field15447 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1591(final String s) {
        super(s);
    }
    
    public void Method241(final float n) {
        GlStateManager.enableAlpha();
        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib();
        (Class1591.Field15444 = this.Method243(Class1591.Field15444)).framebufferClear();
        Class1591.Field15444.bindFramebuffer(true);
        this.Field15445 = Class1591.Field15443.gameSettings.entityShadows;
        Class1591.Field15443.gameSettings.entityShadows = false;
        Class1591.Field15443.entityRenderer.setupCameraTransform(n, 0);
    }
    
    public void Method242() {
        Class1591.Field15443.gameSettings.entityShadows = this.Field15445;
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        Class1591.Field15443.getFramebuffer().bindFramebuffer(true);
        Class1591.Field15443.entityRenderer.disableLightmap();
        RenderHelper.disableStandardItemLighting();
        this.Method230();
        Class1591.Field15443.entityRenderer.setupOverlayRendering();
        this.Method244(Class1591.Field15444);
        this.Method231();
        Class1591.Field15443.entityRenderer.disableLightmap();
        GlStateManager.popMatrix();
        GlStateManager.popAttrib();
    }
    
    public Framebuffer Method243(Framebuffer framebuffer) {
        if (Display.isActive() || Display.isVisible()) {
            if (framebuffer != null) {
                framebuffer.framebufferClear();
                final ScaledResolution scaledResolution = new ScaledResolution(Class1591.Field15443);
                final int getScaleFactor = scaledResolution.getScaleFactor();
                final int getScaledWidth = scaledResolution.getScaledWidth();
                final int getScaledHeight = scaledResolution.getScaledHeight();
                if (Class1591.Field15440 != getScaleFactor || Class1591.Field15441 != getScaledWidth || Class1591.Field15442 != getScaledHeight) {
                    framebuffer.deleteFramebuffer();
                    framebuffer = new Framebuffer(Class1591.Field15443.displayWidth, Class1591.Field15443.displayHeight, true);
                    framebuffer.framebufferClear();
                }
                Class1591.Field15440 = getScaleFactor;
                Class1591.Field15441 = getScaledWidth;
                Class1591.Field15442 = getScaledHeight;
            }
            else {
                framebuffer = new Framebuffer(Class1591.Field15443.displayWidth, Class1591.Field15443.displayHeight, true);
            }
        }
        else if (framebuffer == null) {
            framebuffer = new Framebuffer(Class1591.Field15443.displayWidth, Class1591.Field15443.displayHeight, true);
        }
        return framebuffer;
    }
    
    public void Method244(final Framebuffer framebuffer) {
        final ScaledResolution scaledResolution = new ScaledResolution(Class1591.Field15443);
        GL11.glBindTexture(3553, framebuffer.framebufferTexture);
        GL11.glBegin(7);
        GL11.glTexCoord2d(0.0, 1.0);
        GL11.glVertex2d(0.0, 0.0);
        GL11.glTexCoord2d(0.0, 0.0);
        GL11.glVertex2d(0.0, (double)scaledResolution.getScaledHeight());
        GL11.glTexCoord2d(1.0, 0.0);
        GL11.glVertex2d((double)scaledResolution.getScaledWidth(), (double)scaledResolution.getScaledHeight());
        GL11.glTexCoord2d(1.0, 1.0);
        GL11.glVertex2d((double)scaledResolution.getScaledWidth(), 0.0);
        GL11.glEnd();
        GL20.glUseProgram(0);
    }
    
    static {
        Field15443 = Minecraft.getMinecraft();
    }
}
