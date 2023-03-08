//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import java.awt.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;

public class Class211 extends Gui
{
    public Class340 Field8905;
    public Color Field8906;
    public Color Field8907;
    public boolean Field8908;
    public float Field8909;
    private String Field8910 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class211(final Class340 field8905, final Color field8906, final Color field8907, final boolean field8908) {
        this.Field8905 = field8905;
        this.Field8908 = field8908;
        this.Field8906 = field8906;
        this.Field8907 = field8907;
    }
    
    public Class211(final Class340 class340, final Color color, final Color color2) {
        this(class340, color, color2, false);
    }
    
    public void render() {
        GL11.glPushMatrix();
        if (this.Field8908) {
            final float n = (this.Field8906.getRGB() >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n2 = (this.Field8906.getRGB() >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n3 = (this.Field8906.getRGB() >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n4 = (this.Field8906.getRGB() & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n5 = (this.Field8907.getRGB() >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n6 = (this.Field8907.getRGB() >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n7 = (this.Field8907.getRGB() >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n8 = (this.Field8907.getRGB() & 0xFF) / Float.intBitsToFloat(1132396544);
            GlStateManager.disableTexture2D();
            GlStateManager.enableBlend();
            GlStateManager.disableAlpha();
            GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
            GlStateManager.shadeModel(7425);
            final Tessellator getInstance = Tessellator.getInstance();
            final BufferBuilder getBuffer = getInstance.getBuffer();
            getBuffer.begin(7, DefaultVertexFormats.POSITION_COLOR);
            getBuffer.pos(this.Field8905.Field9399, this.Field8905.Field9401, (double)this.zLevel).color(n2, n3, n4, n).endVertex();
            getBuffer.pos(this.Field8905.Field9398, this.Field8905.Field9400, (double)this.zLevel).color(n2, n3, n4, n).endVertex();
            getBuffer.pos(this.Field8905.Field9403, this.Field8905.Field9405, (double)this.zLevel).color(n6, n7, n8, n5).endVertex();
            getBuffer.pos(this.Field8905.Field9402, this.Field8905.Field9404, (double)this.zLevel).color(n6, n7, n8, n5).endVertex();
            getInstance.draw();
            GlStateManager.shadeModel(7424);
            GlStateManager.disableBlend();
            GlStateManager.enableAlpha();
            GlStateManager.enableTexture2D();
        }
        else {
            final float n9 = (this.Field8906.getRGB() >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n10 = (this.Field8906.getRGB() >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n11 = (this.Field8906.getRGB() >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n12 = (this.Field8906.getRGB() & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n13 = (this.Field8907.getRGB() >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n14 = (this.Field8907.getRGB() >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n15 = (this.Field8907.getRGB() >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n16 = (this.Field8907.getRGB() & 0xFF) / Float.intBitsToFloat(1132396544);
            GL11.glEnable(3042);
            GL11.glDisable(3553);
            GL11.glBlendFunc(770, 771);
            GL11.glShadeModel(7425);
            GL11.glBegin(9);
            GL11.glColor4f(n10, n11, n12, n9);
            GL11.glVertex2d(this.Field8905.Field9398, this.Field8905.Field9400);
            GL11.glVertex2d(this.Field8905.Field9403, this.Field8905.Field9405);
            GL11.glColor4f(n14, n15, n16, n13);
            GL11.glVertex2d(this.Field8905.Field9402, this.Field8905.Field9404);
            GL11.glVertex2d(this.Field8905.Field9399, this.Field8905.Field9401);
            GL11.glEnd();
            GL11.glShadeModel(7424);
            GL11.glEnable(3553);
            GL11.glDisable(3042);
        }
        GL11.glPopMatrix();
    }
    
    public static void drawGradientRect(final double n, final double n2, final double n3, final double n4, final boolean b, final boolean b2, final int n5, final int n6) {
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        GlStateManager.shadeModel(7425);
        GL11.glBegin(7);
        Class753.glColor(n5);
        if (b) {
            if (b2) {
                GL11.glVertex2d(n3, n4);
                GL11.glVertex2d(n3, n2);
                Class753.glColor(n6);
                GL11.glVertex2d(n, n2);
                GL11.glVertex2d(n, n4);
            }
            else {
                GL11.glVertex2d(n, n2);
                GL11.glVertex2d(n, n4);
                Class753.glColor(n6);
                GL11.glVertex2d(n3, n4);
                GL11.glVertex2d(n3, n2);
            }
        }
        else if (b2) {
            GL11.glVertex2d(n3, n4);
            Class753.glColor(n6);
            GL11.glVertex2d(n3, n2);
            GL11.glVertex2d(n, n2);
            Class753.glColor(n5);
            GL11.glVertex2d(n, n4);
        }
        else {
            GL11.glVertex2d(n, n2);
            Class753.glColor(n6);
            GL11.glVertex2d(n, n4);
            GL11.glVertex2d(n3, n4);
            Class753.glColor(n5);
            GL11.glVertex2d(n3, n2);
        }
        GL11.glEnd();
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel(7424);
    }
}
