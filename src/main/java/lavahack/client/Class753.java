//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import java.awt.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.*;
import com.kisman.cc.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.gui.*;

public class Class753 extends GuiScreen
{
    public static Class753 Field11203;
    private static final Minecraft Field11204;
    private int Field11205;
    
    public static void renderItemOverlayIntoGUI(final int n, final int n2, final String s) {
        GlStateManager.disableLighting();
        GlStateManager.disableDepth();
        GlStateManager.disableBlend();
        Class1178.Method4745(s, (double)(float)(n + 19 - 2 - Class1178.Method4741(s)), (double)(float)(n2 + 6 + 3), new Color(255, 255, 255, 255).hashCode());
        GlStateManager.enableLighting();
        GlStateManager.enableDepth();
        GlStateManager.enableBlend();
    }
    
    public static void drawGradientSidewaysWH(final double n, final double n2, final double n3, final double n4, final int n5, final int n6) {
        drawGradientSideways(n, n2, n + n3, n2 + n4, n5, n6);
    }
    
    public static void drawGradientSideways(final double n, final double n2, final double n3, final double n4, final int n5, final int n6) {
        final float n7 = (n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n8 = (n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n9 = (n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n10 = (n5 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n11 = (n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n12 = (n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n13 = (n6 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n14 = (n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(2848);
        GL11.glShadeModel(7425);
        GL11.glPushMatrix();
        GL11.glBegin(7);
        GL11.glColor4f(n8, n9, n10, n7);
        GL11.glVertex2d(n, n2);
        GL11.glVertex2d(n, n4);
        GL11.glColor4f(n14, n12, n13, n11);
        GL11.glVertex2d(n3, n4);
        GL11.glVertex2d(n3, n2);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glDisable(3042);
    }
    
    public static void drawFace(final EntityPlayer entityPlayer, final int n, final int n2, final int n3, final int n4) {
        drawFace(entityPlayer, n, n2, n3, n4, 1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    public static void drawFace(final EntityPlayer entityPlayer, final int n, final int n2, final int n3, final int n4, final float n5, final float n6, final float n7, final float n8) {
        GL11.glPushMatrix();
        Class753.Field11204.getTextureManager().bindTexture(Class753.Field11204.player.connection.getPlayerInfo(entityPlayer.getName()).getLocationSkin());
        GL11.glColor4f(n5, n6, n7, n8);
        Gui.drawScaledCustomSizeModalRect(n, n2, Float.intBitsToFloat(1090519040), Float.intBitsToFloat(1090519040), 8, 8, n3, n4, Float.intBitsToFloat(1115684864), Float.intBitsToFloat(1115684864));
        Class753.Field11204.getTextureManager().bindTexture(Class753.Field11204.player.connection.getPlayerInfo(entityPlayer.getName()).getLocationSkin());
        GL11.glColor4f(n5, n6, n7, n8);
        Gui.drawScaledCustomSizeModalRect(n, n2, Float.intBitsToFloat(1090519040), Float.intBitsToFloat(1090519040), 40, 8, n3, n4, Float.intBitsToFloat(1115684864), Float.intBitsToFloat(1115684864));
        GL11.glPopMatrix();
    }
    
    public float getZLevel() {
        return this.zLevel;
    }
    
    public void setZLevel(final float zLevel) {
        this.zLevel = zLevel;
    }
    
    public static void disableGL2D() {
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glHint(3154, 4352);
        GL11.glHint(3155, 4352);
    }
    
    public static void drawRect(final int n, int n2, int n3, int n4, int n5, final int n6) {
        if (n2 < n4) {
            final int n7 = n2;
            n2 = n4;
            n4 = n7;
        }
        if (n3 < n5) {
            final int n8 = n3;
            n3 = n5;
            n5 = n8;
        }
        final float n9 = (n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n10 = (n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n11 = (n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n12 = (n6 & 0xFF) / Float.intBitsToFloat(1132396544);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        GlStateManager.color(n10, n11, n12, n9);
        getBuffer.begin(n, DefaultVertexFormats.POSITION);
        getBuffer.pos((double)n2, (double)n5, 0.0).endVertex();
        getBuffer.pos((double)n4, (double)n5, 0.0).endVertex();
        getBuffer.pos((double)n4, (double)n3, 0.0).endVertex();
        getBuffer.pos((double)n2, (double)n3, 0.0).endVertex();
        getInstance.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }
    
    public static void drawProgressCircle2(final double n, final double n2, final double n3, final int n4, final double n5, final double n6) {
        final float n7 = (n4 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n8 = (n4 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n9 = (n4 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n10 = (n4 & 0xFF) / Float.intBitsToFloat(1132396544);
        final boolean glIsEnabled = GL11.glIsEnabled(3042);
        final boolean glIsEnabled2 = GL11.glIsEnabled(2848);
        final boolean glIsEnabled3 = GL11.glIsEnabled(3553);
        if (!glIsEnabled) {
            GL11.glEnable(3042);
        }
        if (!glIsEnabled2) {
            GL11.glEnable(2848);
        }
        if (glIsEnabled3) {
            GL11.glDisable(3553);
        }
        GL11.glEnable(2848);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(n8, n9, n10, n7);
        GL11.glLineWidth(Float.intBitsToFloat(1075838976));
        GL11.glBegin(3);
        for (double n11 = 0.0; n11 <= n5; n11 += n6) {
            GL11.glVertex2d(n + Math.sin(n11 * Double.longBitsToDouble((long)1148512792 ^ 0x400921FB1030C700L) / Double.longBitsToDouble((long)633021823 ^ 0x4066800025BB257FL)) * n3, n2 + Math.cos(n11 * Double.longBitsToDouble(4614256656552045848L) / Double.longBitsToDouble(4640537203540230144L)) * n3);
        }
        GL11.glEnd();
        GL11.glDisable(2848);
        if (glIsEnabled3) {
            GL11.glEnable(3553);
        }
        if (!glIsEnabled2) {
            GL11.glDisable(2848);
        }
        if (!glIsEnabled) {
            GL11.glDisable(3042);
        }
    }
    
    public static void drawSmoothRect(final float n, final float n2, final float n3, final float n4, final int n5) {
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        drawRect(n, n2, n3, n4, n5);
        GL11.glScalef(Float.intBitsToFloat(1056964608), Float.intBitsToFloat(1056964608), Float.intBitsToFloat(1056964608));
        drawRect(n * 2.0f - 1.0f, n2 * 2.0f, n * 2.0f, n4 * 2.0f - 1.0f, n5);
        drawRect(n * 2.0f, n2 * 2.0f - 1.0f, n3 * 2.0f, n2 * 2.0f, n5);
        drawRect(n3 * 2.0f, n2 * 2.0f, n3 * 2.0f + 1.0f, n4 * 2.0f - 1.0f, n5);
        GL11.glDisable(3042);
        GL11.glScalef(2.0f, 2.0f, 2.0f);
    }
    
    public static void drawModalRectWithCustomSizedTexture(final double n, final double n2, final float n3, final float n4, final double n5, final double n6, final double n7, final double n8) {
        final float n9 = 1.0f / (float)n7;
        final float n10 = 1.0f / (float)n8;
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(7, DefaultVertexFormats.POSITION_TEX);
        getBuffer.pos(n, n2 + n6, 0.0).tex((double)(n3 * n9), (double)((n4 + (float)n6) * n10)).endVertex();
        getBuffer.pos(n + n5, n2 + n6, 0.0).tex((double)((n3 + (float)n5) * n9), (double)((n4 + (float)n6) * n10)).endVertex();
        getBuffer.pos(n + n5, n2, 0.0).tex((double)((n3 + (float)n5) * n9), (double)(n4 * n10)).endVertex();
        getBuffer.pos(n, n2, 0.0).tex((double)(n3 * n9), (double)(n4 * n10)).endVertex();
        getInstance.draw();
    }
    
    public static void drawAbstract(final Class22 class22) {
        if (class22 != null) {
            class22.Method190();
        }
    }
    
    public static void drawAbstract(final Class1163 class1163) {
        if (class1163 != null) {
            class1163.Method190();
        }
    }
    
    public static void drawAbstract(final Class211 class211) {
        if (class211 != null) {
            class211.render();
        }
    }
    
    public static void drawRectWH(final double n, final double n2, final double n3, final double n4, final int n5) {
        drawRect(n, n2, n + n3, n2 + n4, n5);
    }
    
    public static void drawCircle(final double n, final double n2, final double n3, final Color color, final float n4, final int n5) {
        Class1172.Method4730(color);
        GL11.glLineWidth(n4);
        GL11.glBegin(2);
        for (int i = 0; i < n5; ++i) {
            final float n6 = (float)(Double.longBitsToDouble((long)1692628959 ^ 0x401921FB30A75AC7L) * i / n5);
            GL11.glVertex2d((float)(n3 * Math.cos(n6)) + n, (float)(n3 * Math.sin(n6)) + n2);
        }
        GL11.glEnd();
    }
    
    public static void drawProgressCircle(final double n, final double n2, final double n3, final Color color, final float n4, final double n5, final int n6) {
        Class1172.Method4730(color);
        GL11.glLineWidth(n4);
        GL11.glBegin(6913);
        for (int n7 = 0; n7 < n6 && n7 <= n5; ++n7) {
            final float n8 = (float)(Double.longBitsToDouble(4618760256179416344L) * n7 / n6);
            GL11.glVertex2d((float)(n3 * Math.cos(n8)) + n, (float)(n3 * Math.sin(n8)) + n2);
        }
        GL11.glEnd();
    }
    
    public static void drawTexture(final ResourceLocation resourceLocation, final int n, final int n2, final int n3, final int n4) {
        Class753.Field11204.getTextureManager().bindTexture(resourceLocation);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GuiScreen.drawModalRectWithCustomSizedTexture(n, n2, 0.0f, 0.0f, n3, n4, (float)n3, (float)n4);
    }
    
    public static void drawBox(final int n, final int n2, final int n3, final int n4, final int n5, final Color color) {
        Gui.drawRect(n, n2, n3, n4, new Color(71, 67, 67, 150).getRGB());
    }
    
    public static void drawRect(double n, double n2, double n3, double n4, final int n5) {
        if (n < n3) {
            final double n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 < n4) {
            final double n7 = n2;
            n2 = n4;
            n4 = n7;
        }
        final float n8 = (n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n9 = (n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n10 = (n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n11 = (n5 & 0xFF) / Float.intBitsToFloat(1132396544);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        GlStateManager.color(n9, n10, n11, n8);
        getBuffer.begin(7, DefaultVertexFormats.POSITION);
        getBuffer.pos(n, n4, 0.0).endVertex();
        getBuffer.pos(n3, n4, 0.0).endVertex();
        getBuffer.pos(n3, n2, 0.0).endVertex();
        getBuffer.pos(n, n2, 0.0).endVertex();
        getInstance.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }
    
    public static void drawPolygonPart(final double n, final double n2, final int n3, final int n4, final int n5, final int n6) {
        final float n7 = (n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n8 = (n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n9 = (n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n10 = (n5 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n11 = (n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n12 = (n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n13 = (n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n14 = (n6 & 0xFF) / Float.intBitsToFloat(1132396544);
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        GlStateManager.shadeModel(7425);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(6, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos(n, n2, 0.0).color(n8, n9, n10, n7).endVertex();
        for (int i = n4 * 90; i <= n4 * 90 + 90; ++i) {
            final double n15 = Double.longBitsToDouble(4618760256179416344L) * i / Double.longBitsToDouble((long)844821248 ^ 0x40768000325AF300L) + Math.toRadians(Double.longBitsToDouble((long)1935274043 ^ 0x406680007359F03BL));
            getBuffer.pos(n + Math.sin(n15) * n3, n2 + Math.cos(n15) * n3, 0.0).color(n12, n13, n14, n11).endVertex();
        }
        getInstance.draw();
        GlStateManager.shadeModel(7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }
    
    public static void drawVGradientRect(final float n, final float n2, final float n3, final float n4, final int n5, final int n6) {
        final float n7 = (n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n8 = (n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n9 = (n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n10 = (n5 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n11 = (n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n12 = (n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n13 = (n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n14 = (n6 & 0xFF) / Float.intBitsToFloat(1132396544);
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        GlStateManager.shadeModel(7425);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos((double)n3, (double)n2, 0.0).color(n8, n9, n10, n7).endVertex();
        getBuffer.pos((double)n, (double)n2, 0.0).color(n8, n9, n10, n7).endVertex();
        getBuffer.pos((double)n, (double)n4, 0.0).color(n12, n13, n14, n11).endVertex();
        getBuffer.pos((double)n3, (double)n4, 0.0).color(n12, n13, n14, n11).endVertex();
        getInstance.draw();
        GlStateManager.shadeModel(7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }
    
    public static void drawGlow(final double n, final double n2, final double n3, final double n4, final int n5) {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        GlStateManager.shadeModel(7425);
        drawVGradientRect((float)(int)n, (float)(int)n2, (float)(int)n3, (float)(int)(n2 + (n4 - n2) / Double.longBitsToDouble((long)942519302 ^ 0x40000000382DB406L)), Class1172.Method4728(new Color(n5), 0).getRGB(), n5);
        drawVGradientRect((float)(int)n, (float)(int)(n2 + (n4 - n2) / Double.longBitsToDouble((long)1022818070 ^ 0x400000003CF6F716L)), (float)(int)n3, (float)(int)n4, n5, Class1172.Method4728(new Color(n5), 0).getRGB());
        final int n6 = (int)((n4 - n2) / Double.longBitsToDouble(4611686018427387904L));
        drawPolygonPart(n, n2 + (n4 - n2) / Double.longBitsToDouble(4611686018427387904L), n6, 0, n5, Class1172.Method4728(new Color(n5), 0).getRGB());
        drawPolygonPart(n, n2 + (n4 - n2) / Double.longBitsToDouble(4611686018427387904L), n6, 1, n5, Class1172.Method4728(new Color(n5), 0).getRGB());
        drawPolygonPart(n3, n2 + (n4 - n2) / Double.longBitsToDouble((long)488955539 ^ 0x400000001D24DE93L), n6, 2, n5, Class1172.Method4728(new Color(n5), 0).getRGB());
        drawPolygonPart(n3, n2 + (n4 - n2) / Double.longBitsToDouble(4611686018427387904L), n6, 3, n5, Class1172.Method4728(new Color(n5), 0).getRGB());
        GlStateManager.shadeModel(7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }
    
    public static void gradient(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b) {
        if (b) {
            final float n7 = (n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n8 = (n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n9 = (n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n10 = (n5 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n11 = (n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n12 = (n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n13 = (n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n14 = (n6 & 0xFF) / Float.intBitsToFloat(1132396544);
            GL11.glEnable(3042);
            GL11.glDisable(3553);
            GL11.glBlendFunc(770, 771);
            GL11.glShadeModel(7425);
            GL11.glBegin(9);
            GL11.glColor4f(n8, n9, n10, n7);
            GL11.glVertex2f((float)n, (float)n2);
            GL11.glVertex2f((float)n, (float)n4);
            GL11.glColor4f(n12, n13, n14, n11);
            GL11.glVertex2f((float)n3, (float)n4);
            GL11.glVertex2f((float)n3, (float)n2);
            GL11.glEnd();
            GL11.glShadeModel(7424);
            GL11.glEnable(3553);
            GL11.glDisable(3042);
        }
        else {
            Class753.Field11203.drawGradientRect(n, n2, n3, n4, n5, n6);
        }
    }
    
    public static void drawLeftGradientRect(final double n, final double n2, final double n3, final double n4, final int n5, final int n6) {
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        GlStateManager.shadeModel(7425);
        getBuffer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos(n3, n2, 0.0).color((n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544), (n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544)).endVertex();
        getBuffer.pos(n, n2, 0.0).color((n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (n5 & 0xFF) / Float.intBitsToFloat(1132396544), (n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544)).endVertex();
        getBuffer.pos(n, n4, 0.0).color((n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (n5 & 0xFF) / Float.intBitsToFloat(1132396544), (n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544)).endVertex();
        getBuffer.pos(n3, n4, 0.0).color((n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544), (n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544)).endVertex();
        getInstance.draw();
        GlStateManager.shadeModel(7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }
    
    public static void drawRoundedRect(final double n, final double n2, final double n3, final double n4, final Color color, final double n5) {
        drawRoundedRect((float)n - n5, (float)n2 - n5, (float)n3 + n5, (float)n4 + n5, color.getRGB(), null.Field11787.Method368());
    }
    
    public static void drawRoundedRect(final double n, final double n2, final double n3, final double n4, final int n5, final float n6) {
        drawRoundedRect((float)n, (float)n2, (float)n3, (float)n4, n5, n6);
    }
    
    public static void drawBlur(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        Class92.Field8314.Method783();
        Class92.Field8314.Method783();
        Class92.Field8314.Method784("sampler", 0);
        Class92.Field8314.Method785("radius", n5);
        Class92.Field8314.Method785("radiusFactor", n6);
        Class92.Field8314.Method786("direction", n7, n8);
        GL11.glBegin(7);
        GL11.glVertex2d((double)n3, (double)n2);
        GL11.glVertex2d((double)n, (double)n2);
        GL11.glVertex2d((double)n, (double)n4);
        GL11.glVertex2d((double)n3, (double)n4);
        GL11.glEnd();
        Class92.Field8314.Method789();
        GL11.glEnable(3008);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
    
    public static void drawRoundedRect1(final float n, final float n2, final float n3, final float n4, final int n5, final float n6, final float n7) {
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        final float n8 = (n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n9 = (n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n10 = (n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n11 = (n5 & 0xFF) / Float.intBitsToFloat(1132396544);
        Class92.Field8313.Method783();
        Class92.Field8313.Method783();
        Class92.Field8313.Method788("color", n9, n10, n11, n8);
        Class92.Field8313.Method786("resolution", (float)Class886.Method3707().getScaledWidth(), (float)Class886.Method3707().getScaledHeight());
        Class92.Field8313.Method786("center", (n + (n3 - n) / 2.0f) * 2.0f, (n2 + (n4 - n2) / 2.0f) * 2.0f);
        Class92.Field8313.Method786("dst", (n3 - n - n6) * 2.0f, (n4 - n2 - n6) * 2.0f);
        Class92.Field8313.Method785("radius", n6);
        Class92.Field8313.Method785("alphaFactor", n7);
        GL11.glBegin(7);
        GL11.glVertex2d((double)n3, (double)n2);
        GL11.glVertex2d((double)n, (double)n2);
        GL11.glVertex2d((double)n, (double)n4);
        GL11.glVertex2d((double)n3, (double)n4);
        GL11.glEnd();
        Class92.Field8313.Method789();
        GL11.glEnable(3008);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
    
    public static void drawRoundedRect(final float n, final float n2, final float n3, final float n4, final int n5, final float n6) {
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        final float n7 = (n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n8 = (n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n9 = (n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n10 = (n5 & 0xFF) / Float.intBitsToFloat(1132396544);
        Class92.Field8312.Method783();
        Class92.Field8312.Method788("color", n8, n9, n10, n7);
        Class92.Field8312.Method786("resolution", (float)Class886.Method3707().getScaledWidth(), (float)Class886.Method3707().getScaledHeight());
        Class92.Field8312.Method786("center", (n + (n3 - n) / 2.0f) * 2.0f, (n2 + (n4 - n2) / 2.0f) * 2.0f);
        Class92.Field8312.Method786("dst", (n3 - n - n6) * 2.0f, (n4 - n2 - n6) * 2.0f);
        Class92.Field8312.Method785("radius", n6);
        GL11.glBegin(7);
        GL11.glVertex2d((double)n3, (double)n2);
        GL11.glVertex2d((double)n, (double)n2);
        GL11.glVertex2d((double)n, (double)n4);
        GL11.glVertex2d((double)n3, (double)n4);
        GL11.glEnd();
        Class92.Field8312.Method789();
        GL11.glEnable(3008);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
    
    public static void drawRoundedRect(final float n, final float n2, final float n3, final float n4, final int n5) {
        drawRoundedRect(n, n2, n3, n4, n5, null.Field11787.Method368());
    }
    
    public static void drawRoundedRect2(double n, double n2, final double n3, final double n4, final double n5, final int n6) {
        final double n7 = n + n3;
        final double n8 = n2 + n4;
        final float n9 = (n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n10 = (n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n11 = (n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n12 = (n6 & 0xFF) / Float.intBitsToFloat(1132396544);
        GL11.glPushAttrib(0);
        GL11.glScaled(Double.longBitsToDouble((long)106440160 ^ 0x3FE00000065825E0L), Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4602678819172646912L));
        GlStateManager.enableBlend();
        n *= Double.longBitsToDouble((long)510438070 ^ 0x400000001E6CAAB6L);
        n2 *= Double.longBitsToDouble(4611686018427387904L);
        final double n13 = n7 * Double.longBitsToDouble((long)134086833 ^ 0x4000000007FE00B1L);
        final double n14 = n8 * Double.longBitsToDouble((long)1910444776 ^ 0x4000000071DF12E8L);
        GL11.glColor4f(n10, n11, n12, n9);
        GL11.glDisable(3553);
        GL11.glEnable(2848);
        GL11.glBegin(9);
        int n15 = 0;
        while (true) {
            GL11.glVertex2d(n + n5 + Math.sin(n15 * Double.longBitsToDouble((long)2013101475 ^ 0x400921FB23B950BBL) / Double.longBitsToDouble(4640537203540230144L)) * n5 * Double.longBitsToDouble(-4616189618054758400L), n2 + n5 + Math.cos(n15 * Double.longBitsToDouble((long)502350088 ^ 0x400921FB49B56C10L) / Double.longBitsToDouble((long)674551742 ^ 0x406680002834D7BEL)) * n5 * Double.longBitsToDouble(-4616189618054758400L));
            n15 += 3;
        }
    }
    
    public static void drawRoundedRect(final double n, final double n2, final double n3, final double n4, final Color color) {
        drawRoundedRect((float)n, (float)n2, (float)n3, (float)n4, color.getRGB(), null.Field11787.Method368());
    }
    
    public static void drawShadowSliders(final double n, final double n2, final double n3, final double n4, final int n5, final double n6) {
        drawGradientRect(n, n2, n + n3, n2 + n4, n5, Color.BLACK.getRGB());
        drawOutlineRect(n, n2, n + n3, n2 + n4, n6, n5);
    }
    
    public static void drawOutlineRect(final double n, final double n2, final double n3, final double n4, final double n5, final int n6) {
        drawRect(n, n2, n3, n2 + n5, n6);
        drawRect(n, n4 - n5, n3, n4, n6);
        drawRect(n, n2, n + n5, n4, n6);
        drawRect(n3 - n5, n2, n3, n4, n6);
    }
    
    public static void drawGradientRect(final double n, final double n2, final double n3, final double n4, final int n5, final int n6) {
        final float n7 = (n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n8 = (n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n9 = (n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n10 = (n5 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n11 = (n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n12 = (n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n13 = (n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n14 = (n6 & 0xFF) / Float.intBitsToFloat(1132396544);
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        GlStateManager.shadeModel(7425);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos(n3, n2, (double)Class753.Field11203.zLevel).color(n8, n9, n10, n7).endVertex();
        getBuffer.pos(n, n2, (double)Class753.Field11203.zLevel).color(n8, n9, n10, n7).endVertex();
        getBuffer.pos(n, n4, (double)Class753.Field11203.zLevel).color(n12, n13, n14, n11).endVertex();
        getBuffer.pos(n3, n4, (double)Class753.Field11203.zLevel).color(n12, n13, n14, n11).endVertex();
        getInstance.draw();
        GlStateManager.shadeModel(7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }
    
    public static void drawTexturedRect(final float n, final float n2, final float n3, final float n4) {
        drawTexturedRect(n, n2, n3, n4, 0.0f, 1.0f, 0.0f, 1.0f);
    }
    
    public static void drawTexturedRect(final float n, final float n2, final float n3, final float n4, final int n5) {
        drawTexturedRect(n, n2, n3, n4, 0.0f, 1.0f, 0.0f, 1.0f, n5);
    }
    
    public static void drawTexturedRect(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        drawTexturedRect(n, n2, n3, n4, n5, n6, n7, n8, 9728);
    }
    
    public static void drawTexturedRect(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final int n9) {
        GlStateManager.enableBlend();
        GL14.glBlendFuncSeparate(770, 771, 1, 771);
        drawTexturedRectNoBlend(n, n2, n3, n4, n5, n6, n7, n8, n9);
        GlStateManager.disableBlend();
    }
    
    public static void drawTexturedRectNoBlend(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final int n9) {
        GlStateManager.enableTexture2D();
        GL11.glTexParameteri(3553, 10241, n9);
        GL11.glTexParameteri(3553, 10240, n9);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(7, DefaultVertexFormats.POSITION_TEX);
        getBuffer.pos((double)n, (double)(n2 + n4), 0.0).tex((double)n5, (double)n8).endVertex();
        getBuffer.pos((double)(n + n3), (double)(n2 + n4), 0.0).tex((double)n6, (double)n8).endVertex();
        getBuffer.pos((double)(n + n3), (double)n2, 0.0).tex((double)n6, (double)n7).endVertex();
        getBuffer.pos((double)n, (double)n2, 0.0).tex((double)n5, (double)n7).endVertex();
        getInstance.draw();
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
    }
    
    public static void drawBorderedRect(final double n, final double n2, final double n3, final double n4, final float n5, final int n6, final int n7) {
        drawRect(n, n2, n + n3, n2 + n4, n7);
        final float n8 = (n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n9 = (n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n10 = (n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n11 = (n6 & 0xFF) / Float.intBitsToFloat(1132396544);
        GL11.glPushMatrix();
        GL11.glPushAttrib(1048575);
        GL11.glEnable(3042);
        GL11.glDisable(2884);
        GL11.glDisable(3553);
        GL11.glColor4f(n9, n10, n11, n8);
        GL11.glLineWidth(n5);
        GL11.glEnable(2848);
        GL11.glBegin(1);
        GL11.glVertex2d(n, n2);
        GL11.glVertex2d(n + n3, n2);
        GL11.glVertex2d(n + n3, n2);
        GL11.glVertex2d(n + n3, n2 + n4);
        GL11.glVertex2d(n + n3, n2 + n4);
        GL11.glVertex2d(n, n2 + n4);
        GL11.glVertex2d(n, n2 + n4);
        GL11.glVertex2d(n, n2);
        GL11.glEnd();
        GL11.glEnable(3553);
        GL11.glEnable(2884);
        GL11.glDisable(3042);
        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }
    
    public static boolean isHovered(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return n >= n3 && n - n5 <= n3 && n2 >= n4 && n2 - n6 <= n4;
    }
    
    public static void startScissor(final double n, final double n2, final double n3, final double n4) {
        startScissor(n, n2, n3, n4, 1.0);
    }
    
    public static void startScissor(final double n, final double n2, final double n3, final double n4, final double n5) {
        final ScaledResolution scaledResolution = new ScaledResolution(Class753.Field11204);
        final double n6 = Class753.Field11204.displayWidth / scaledResolution.getScaledWidth_double();
        final double n7 = Class753.Field11204.displayHeight / scaledResolution.getScaledHeight_double();
        final double n8 = n6 * n5;
        final double n9 = n7 * n5;
        GL11.glScissor((int)(n * n8), Class753.Field11204.displayHeight - (int)((n2 + n4) * n9), (int)(n3 * n8), (int)(n4 * n9));
        GL11.glEnable(3089);
    }
    
    public static void stopScissor() {
        GL11.glDisable(3089);
    }
    
    public static void glColor(final int n) {
        GL11.glColor4f((n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (n & 0xFF) / Float.intBitsToFloat(1132396544), (n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544));
    }
    
    public static void drawArrow(final double n, final double n2, final double n3, final double n4, final double n5, final int n6) {
        final double n7 = n2 + n5 / (n4 * Double.longBitsToDouble(4602678819172646912L)) * (n4 * Double.longBitsToDouble((long)584108328 ^ 0x3FE0000022D0C928L) - n3);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate(GlStateManager$SourceFactor.SRC_ALPHA, GlStateManager$DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager$SourceFactor.ONE, GlStateManager$DestFactor.ZERO);
        glColor(n6);
        getBuffer.begin(7, DefaultVertexFormats.POSITION);
        getBuffer.pos(n, n2, 0.0);
        getBuffer.pos(n + n3, n2, 0.0);
        getBuffer.pos(n + n4 * Double.longBitsToDouble(4602678819172646912L), n7, 0.0);
        getBuffer.pos(n + n4 * Double.longBitsToDouble(4602678819172646912L), n2 + n5, 0.0);
        getBuffer.pos(n + n4 - n3, n2, 0.0);
        getBuffer.pos(n + n4, n2, 0.0);
        getBuffer.pos(n + n4 * Double.longBitsToDouble((long)546916956 ^ 0x3FE0000020994A5CL), n2 + n5, 0.0);
        getBuffer.pos(n + n4 * Double.longBitsToDouble((long)607178687 ^ 0x3FE000002430CFBFL), n7, 0.0);
        getInstance.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }
    
    static {
        Class753.Field11203 = new Class753();
        Field11204 = Minecraft.getMinecraft();
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x583C ^ 0xD1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
