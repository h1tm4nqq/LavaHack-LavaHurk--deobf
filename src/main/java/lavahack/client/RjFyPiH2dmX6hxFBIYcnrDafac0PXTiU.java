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
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.qUoUFSySVMumXYRbdcinJ02PQfIIYTE7;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public abstract class RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU
extends qUoUFSySVMumXYRbdcinJ02PQfIIYTE7 {
    public final Minecraft Field17410 = Minecraft.getMinecraft();
    public static Framebuffer Field17411;
    public boolean Field17412;
    public int Field17413;
    private int Field17414;

    public RjFyPiH2dmX6hxFBIYcnrDafac0PXTiU(String string, String string2) {
        super(string, string2);
    }

    public void Method1714(float f) {
        GlStateManager.enableAlpha();
        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib();
        Field17411 = this.Method1716(Field17411);
        Field17411.framebufferClear();
        Field17411.bindFramebuffer((boolean)((long)-1785484960 ^ (long)-1785484959));
        this.Field17412 = this.Field17410.gameSettings.entityShadows;
        this.Field17410.gameSettings.entityShadows = (int)((long)-448904402 ^ (long)-448904402);
        this.Field17410.entityRenderer.setupCameraTransform(f, (int)((long)420312398 ^ (long)420312398));
    }

    public void Method1715() {
        this.Field17410.gameSettings.entityShadows = this.Field17412;
        GL11.glEnable((int)((int)((long)1509899688 ^ (long)1509898329) << 1));
        GL11.glBlendFunc((int)((int)((long)-569195427 ^ (long)-569195044) << 1), (int)((int)-1371826234L ^ 0xAE3B94C5));
        this.Field17410.getFramebuffer().bindFramebuffer(((int)555847975L ^ 0x21219126) != 0);
        this.Field17410.entityRenderer.disableLightmap();
        RenderHelper.disableStandardItemLighting();
        this.Method1703();
        this.Field17410.entityRenderer.setupOverlayRendering();
        this.Method1717(Field17411);
        this.Method1704();
        this.Field17410.entityRenderer.disableLightmap();
        GlStateManager.popMatrix();
        GlStateManager.popAttrib();
    }

    public Framebuffer Method1716(Framebuffer framebuffer) {
        if (framebuffer == null) return new Framebuffer(this.Field17410.displayWidth, this.Field17410.displayHeight, (boolean)((long)633945050 ^ (long)633945051));
        framebuffer.deleteFramebuffer();
        return new Framebuffer(this.Field17410.displayWidth, this.Field17410.displayHeight, (boolean)((long)633945050 ^ (long)633945051));
    }

    public void Method1717(Framebuffer framebuffer) {
        ScaledResolution scaledResolution = new ScaledResolution(this.Field17410);
        GL11.glBindTexture((int)((int)196403658L ^ 0xBB4EC2B), (int)framebuffer.framebufferTexture);
        GL11.glBegin((int)((int)-1067311194L ^ 0xC0621FA1));
        GL11.glTexCoord2d((double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x369B1A3C382ADD37L ^ 0x4974FCA28C6742D6L)) ^ 0x7FEFE69EB74FFFF5L & 0x7FEFE69EF4CD9FE1L), (double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1185925834 ^ 0x401398B61B37CC1BL)) ^ 0x7FE398B65DD806D1L & 0x7FE398B65FBC26D3L));
        GL11.glVertex2d((double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)660122993 ^ 0x7FCA90500ECE2ABAL)) ^ 0x7FCA9050399687EBL & 0x7FCA90502BD7F7DBL), (double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1445830452 ^ 0x7FDAF13CDFE4211DL)) ^ 0x7FDAF13CCBC9BE2DL & 0x7FDAF13C99D9BEB9L));
        GL11.glTexCoord2d((double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)864671740 ^ 0x7FE28788F8DE6810L)) ^ 0x7FE28788CF57BFECL & 0x7FE28788EB5FBFEEL), (double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0xC37C82F06806DB7DL ^ 0xBCB1F86C33A11F26L)) ^ 0x7FCD7A9C5BA7E4DBL & 0x7FCD7A9C7BB7CE5BL));
        GL11.glVertex2d((double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0xFC701148F88E1DA0L ^ 0x8398F793C7FED8E2L)) ^ 0x7FE8E6DB3F70D5C2L & 0x7FE8E6DB3F78C542L), (double)scaledResolution.getScaledHeight());
        GL11.glTexCoord2d((double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)376382041 ^ 0x404A28317A851B06L)) ^ 0x7FBA28316DFABBDFL & 0x7FBA28317EEA795FL), (double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0xAE175CE846E49E1DL ^ 0xD1FF4B29806AE274L)) ^ 0x7FE817C1E69E7C6BL & 0x7FE817C1DFEF7C79L));
        GL11.glVertex2d((double)scaledResolution.getScaledWidth(), (double)scaledResolution.getScaledHeight());
        GL11.glTexCoord2d((double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1144188421 ^ 0x40123AF83417B431L)) ^ 0x7FE23AF870657ABEL & 0x7FE23AF872AF5B34L), (double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x57BCEF226BF3558L ^ 0x454C98A9845CFCFBL)) ^ 0x7FC7565BA2E7E9B3L & 0x7FC7565BE2E3C9AFL));
        GL11.glVertex2d((double)scaledResolution.getScaledWidth(), (double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x47A6FC43E926EDC4L ^ 0x384C17E5233A16B0L)) ^ 0x7FEAEBA6CA1CFB76L & 0x7FEAEBA6EF1CFBF4L));
        GL11.glEnd();
        GL20.glUseProgram((int)((int)((long)109735715 ^ (long)109735715)));
    }
}

