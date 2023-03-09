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

import lavahack.client.Class477;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public abstract class Class2058
extends Class477 {
    public final Minecraft Field17410 = Minecraft.getMinecraft();
    public static Framebuffer Field17411;
    public boolean Field17412;
    public int Field17413;
    private int Field17414;

    public Class2058(String string, String string2) {
        super(string, string2);
    }

    public void Method1714(float f) {
        GlStateManager.enableAlpha();
        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib();
        Field17411 = this.Method1716(Field17411);
        Field17411.framebufferClear();
        Field17411.bindFramebuffer(true);
        this.Field17412 = this.Field17410.gameSettings.entityShadows;
        this.Field17410.gameSettings.entityShadows = false;
        this.Field17410.entityRenderer.setupCameraTransform(f, 0);
    }

    public void Method1715() {
        this.Field17410.gameSettings.entityShadows = this.Field17412;
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        this.Field17410.getFramebuffer().bindFramebuffer(true);
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
        if (framebuffer == null) return new Framebuffer(this.Field17410.displayWidth, this.Field17410.displayHeight, true);
        framebuffer.deleteFramebuffer();
        return new Framebuffer(this.Field17410.displayWidth, this.Field17410.displayHeight, true);
    }

    public void Method1717(Framebuffer framebuffer) {
        ScaledResolution scaledResolution = new ScaledResolution(this.Field17410);
        GL11.glBindTexture((int)3553, (int)framebuffer.framebufferTexture);
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9218840531554901985L)) ^ 0x7FEFE69EB44D9FE1L), (double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1185925834 ^ 0x401398B61B37CC1BL)) ^ 0x7FE398B65D9806D1L));
        GL11.glVertex2d((double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)660122993 ^ 0x7FCA90500ECE2ABAL)) ^ 0x7FCA9050299687CBL), (double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1445830452 ^ 0x7FDAF13CDFE4211DL)) ^ 0x7FDAF13C89C9BE29L));
        GL11.glTexCoord2d((double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)864671740 ^ 0x7FE28788F8DE6810L)) ^ 0x7FE28788CB57BFECL), (double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9209151625013740635L)) ^ 0x7FCD7A9C5BA7C45BL));
        GL11.glVertex2d((double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9216870466750301506L)) ^ 0x7FE8E6DB3F70C542L), (double)scaledResolution.getScaledHeight());
        GL11.glTexCoord2d((double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)376382041 ^ 0x404A28317A851B06L)) ^ 0x7FBA28316CEA395FL), (double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9216642758441073769L)) ^ 0x7FE817C1C68E7C69L));
        GL11.glVertex2d((double)scaledResolution.getScaledWidth(), (double)scaledResolution.getScaledHeight());
        GL11.glTexCoord2d((double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1144188421 ^ 0x40123AF83417B431L)) ^ 0x7FE23AF870255A34L), (double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4627262093721323939L)) ^ 0x7FC7565BA2E3C9A3L));
        GL11.glVertex2d((double)scaledResolution.getScaledWidth(), (double)Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9217438688955136884L)) ^ 0x7FEAEBA6CA1CFB74L));
        GL11.glEnd();
        GL20.glUseProgram((int)0);
    }
}

