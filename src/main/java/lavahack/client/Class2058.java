//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.client.shader.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;

public abstract class Class2058 extends Class477
{
    public final Minecraft Field17410;
    public static Framebuffer Field17411;
    public boolean Field17412;
    public int Field17413;
    private int Field17414;
    
    public Class2058(final String s, final String s2) {
        super(s, s2);
        this.Field17410 = Minecraft.getMinecraft();
    }
    
    public void Method1714(final float n) {
        GlStateManager.enableAlpha();
        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib();
        (Class2058.Field17411 = this.Method1716(Class2058.Field17411)).framebufferClear();
        Class2058.Field17411.bindFramebuffer(true);
        this.Field17412 = this.Field17410.gameSettings.entityShadows;
        this.Field17410.gameSettings.entityShadows = false;
        this.Field17410.entityRenderer.setupCameraTransform(n, 0);
    }
    
    public void Method1715() {
        this.Field17410.gameSettings.entityShadows = this.Field17412;
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.Field17410.getFramebuffer().bindFramebuffer(true);
        this.Field17410.entityRenderer.disableLightmap();
        RenderHelper.disableStandardItemLighting();
        this.Method1703();
        this.Field17410.entityRenderer.setupOverlayRendering();
        this.Method1717(Class2058.Field17411);
        this.Method1704();
        this.Field17410.entityRenderer.disableLightmap();
        GlStateManager.popMatrix();
        GlStateManager.popAttrib();
    }
    
    public Framebuffer Method1716(Framebuffer framebuffer) {
        if (framebuffer != null) {
            framebuffer.deleteFramebuffer();
        }
        framebuffer = new Framebuffer(this.Field17410.displayWidth, this.Field17410.displayHeight, true);
        return framebuffer;
    }
    
    public void Method1717(final Framebuffer framebuffer) {
        final ScaledResolution scaledResolution = new ScaledResolution(this.Field17410);
        GL11.glBindTexture(3553, framebuffer.framebufferTexture);
        GL11.glBegin(7);
        GL11.glTexCoord2d(Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9218840531554901985L)) ^ 0x7FEFE69EB44D9FE1L), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1185925834 ^ 0x401398B61B37CC1BL)) ^ 0x7FE398B65D9806D1L));
        GL11.glVertex2d(Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)660122993 ^ 0x7FCA90500ECE2ABAL)) ^ 0x7FCA9050299687CBL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1445830452 ^ 0x7FDAF13CDFE4211DL)) ^ 0x7FDAF13C89C9BE29L));
        GL11.glTexCoord2d(Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)864671740 ^ 0x7FE28788F8DE6810L)) ^ 0x7FE28788CB57BFECL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9209151625013740635L)) ^ 0x7FCD7A9C5BA7C45BL));
        GL11.glVertex2d(Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9216870466750301506L)) ^ 0x7FE8E6DB3F70C542L), (double)scaledResolution.getScaledHeight());
        GL11.glTexCoord2d(Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)376382041 ^ 0x404A28317A851B06L)) ^ 0x7FBA28316CEA395FL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9216642758441073769L)) ^ 0x7FE817C1C68E7C69L));
        GL11.glVertex2d((double)scaledResolution.getScaledWidth(), (double)scaledResolution.getScaledHeight());
        GL11.glTexCoord2d(Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1144188421 ^ 0x40123AF83417B431L)) ^ 0x7FE23AF870255A34L), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4627262093721323939L)) ^ 0x7FC7565BA2E3C9A3L));
        GL11.glVertex2d((double)scaledResolution.getScaledWidth(), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9217438688955136884L)) ^ 0x7FEAEBA6CA1CFB74L));
        GL11.glEnd();
        GL20.glUseProgram(0);
    }
}
