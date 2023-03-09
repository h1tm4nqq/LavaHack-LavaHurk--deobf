//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL14
 */
package lavahack.client;

import com.kisman.cc.util.Class886;
import java.awt.Color;
import lavahack.client.Class1163;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class211;
import lavahack.client.Class22;
import lavahack.client.Class92;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

public class Class753
extends GuiScreen {
    public static Class753 Field11203 = new Class753();
    private static final Minecraft Field11204 = Minecraft.getMinecraft();
    private int Field11205;

    public static void renderItemOverlayIntoGUI(int n, int n2, String string) {
        GlStateManager.disableLighting();
        GlStateManager.disableDepth();
        GlStateManager.disableBlend();
        Class1178.Method4745(string, n + 19 - 2 - Class1178.Method4741(string), n2 + 6 + 3, new Color(255, 255, 255, 255).hashCode());
        GlStateManager.enableLighting();
        GlStateManager.enableDepth();
        GlStateManager.enableBlend();
    }

    public static void drawGradientSidewaysWH(double d, double d2, double d3, double d4, int n, int n2) {
        Class753.drawGradientSideways(d, d2, d + d3, d2 + d4, n, n2);
    }

    public static void drawGradientSideways(double d, double d2, double d3, double d4, int n, int n2) {
        float f = (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f2 = (float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f3 = (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f4 = (float)(n & 0xFF) / Float.intBitsToFloat(1132396544);
        float f5 = (float)(n2 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f6 = (float)(n2 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f7 = (float)(n2 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f8 = (float)(n2 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glShadeModel((int)7425);
        GL11.glPushMatrix();
        GL11.glBegin((int)7);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)d4);
        GL11.glColor4f((float)f8, (float)f6, (float)f7, (float)f5);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d3, (double)d2);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void drawFace(EntityPlayer entityPlayer, int n, int n2, int n3, int n4) {
        Class753.drawFace(entityPlayer, n, n2, n3, n4, 1.0f, 1.0f, 1.0f, 1.0f);
    }

    public static void drawFace(EntityPlayer entityPlayer, int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        GL11.glPushMatrix();
        Field11204.getTextureManager().bindTexture(Class753.Field11204.player.connection.getPlayerInfo(entityPlayer.getName()).getLocationSkin());
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        Gui.drawScaledCustomSizeModalRect((int)n, (int)n2, (float)Float.intBitsToFloat(0x41000000), (float)Float.intBitsToFloat(0x41000000), (int)8, (int)8, (int)n3, (int)n4, (float)Float.intBitsToFloat(1115684864), (float)Float.intBitsToFloat(1115684864));
        Field11204.getTextureManager().bindTexture(Class753.Field11204.player.connection.getPlayerInfo(entityPlayer.getName()).getLocationSkin());
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        Gui.drawScaledCustomSizeModalRect((int)n, (int)n2, (float)Float.intBitsToFloat(0x41000000), (float)Float.intBitsToFloat(0x41000000), (int)40, (int)8, (int)n3, (int)n4, (float)Float.intBitsToFloat(1115684864), (float)Float.intBitsToFloat(1115684864));
        GL11.glPopMatrix();
    }

    public float getZLevel() {
        return this.zLevel;
    }

    public void setZLevel(float f) {
        this.zLevel = f;
    }

    public static void disableGL2D() {
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glHint((int)3155, (int)4352);
    }

    public static void drawRect(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        if (n2 < n4) {
            n7 = n2;
            n2 = n4;
            n4 = n7;
        }
        if (n3 < n5) {
            n7 = n3;
            n3 = n5;
            n5 = n7;
        }
        float f = (float)(n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f2 = (float)(n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f3 = (float)(n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f4 = (float)(n6 & 0xFF) / Float.intBitsToFloat(1132396544);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.color((float)f2, (float)f3, (float)f4, (float)f);
        bufferBuilder.begin(n, DefaultVertexFormats.POSITION);
        bufferBuilder.pos((double)n2, (double)n5, 0.0).endVertex();
        bufferBuilder.pos((double)n4, (double)n5, 0.0).endVertex();
        bufferBuilder.pos((double)n4, (double)n3, 0.0).endVertex();
        bufferBuilder.pos((double)n2, (double)n3, 0.0).endVertex();
        tessellator.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void drawProgressCircle2(double d, double d2, double d3, int n, double d4, double d5) {
        float f = (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f2 = (float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f3 = (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f4 = (float)(n & 0xFF) / Float.intBitsToFloat(1132396544);
        boolean bl = GL11.glIsEnabled((int)3042);
        boolean bl2 = GL11.glIsEnabled((int)2848);
        boolean bl3 = GL11.glIsEnabled((int)3553);
        if (!bl) {
            GL11.glEnable((int)3042);
        }
        if (!bl2) {
            GL11.glEnable((int)2848);
        }
        if (bl3) {
            GL11.glDisable((int)3553);
        }
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glLineWidth((float)Float.intBitsToFloat(0x40200000));
        GL11.glBegin((int)3);
        for (double d6 = 0.0; d6 <= d4; d6 += d5) {
            GL11.glVertex2d((double)(d + Math.sin(d6 * Double.longBitsToDouble((long)1148512792 ^ 0x400921FB1030C700L) / Double.longBitsToDouble((long)633021823 ^ 0x4066800025BB257FL)) * d3), (double)(d2 + Math.cos(d6 * Double.longBitsToDouble(4614256656552045848L) / Double.longBitsToDouble(4640537203540230144L)) * d3));
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        if (bl3) {
            GL11.glEnable((int)3553);
        }
        if (!bl2) {
            GL11.glDisable((int)2848);
        }
        if (bl) return;
        GL11.glDisable((int)3042);
    }

    public static void drawSmoothRect(float f, float f2, float f3, float f4, int n) {
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        Class753.drawRect(f, f2, f3, f4, n);
        GL11.glScalef((float)Float.intBitsToFloat(0x3F000000), (float)Float.intBitsToFloat(0x3F000000), (float)Float.intBitsToFloat(0x3F000000));
        Class753.drawRect(f * 2.0f - 1.0f, f2 * 2.0f, f * 2.0f, f4 * 2.0f - 1.0f, n);
        Class753.drawRect(f * 2.0f, f2 * 2.0f - 1.0f, f3 * 2.0f, f2 * 2.0f, n);
        Class753.drawRect(f3 * 2.0f, f2 * 2.0f, f3 * 2.0f + 1.0f, f4 * 2.0f - 1.0f, n);
        GL11.glDisable((int)3042);
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
    }

    public static void drawModalRectWithCustomSizedTexture(double d, double d2, float f, float f2, double d3, double d4, double d5, double d6) {
        float f3 = 1.0f / (float)d5;
        float f4 = 1.0f / (float)d6;
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        bufferBuilder.pos(d, d2 + d4, 0.0).tex((double)(f * f3), (double)((f2 + (float)d4) * f4)).endVertex();
        bufferBuilder.pos(d + d3, d2 + d4, 0.0).tex((double)((f + (float)d3) * f3), (double)((f2 + (float)d4) * f4)).endVertex();
        bufferBuilder.pos(d + d3, d2, 0.0).tex((double)((f + (float)d3) * f3), (double)(f2 * f4)).endVertex();
        bufferBuilder.pos(d, d2, 0.0).tex((double)(f * f3), (double)(f2 * f4)).endVertex();
        tessellator.draw();
    }

    public static void drawAbstract(Class22 class22) {
        if (class22 == null) return;
        class22.Method190();
    }

    public static void drawAbstract(Class1163 class1163) {
        if (class1163 == null) return;
        class1163.Method190();
    }

    public static void drawAbstract(Class211 class211) {
        if (class211 == null) return;
        class211.render();
    }

    public static void drawRectWH(double d, double d2, double d3, double d4, int n) {
        Class753.drawRect(d, d2, d + d3, d2 + d4, n);
    }

    public static void drawCircle(double d, double d2, double d3, Color color, float f, int n) {
        Class1172.Method4730(color);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)2);
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                GL11.glEnd();
                return;
            }
            float f2 = (float)(Double.longBitsToDouble((long)1692628959 ^ 0x401921FB30A75AC7L) * (double)n2 / (double)n);
            float f3 = (float)(d3 * Math.cos(f2));
            float f4 = (float)(d3 * Math.sin(f2));
            GL11.glVertex2d((double)((double)f3 + d), (double)((double)f4 + d2));
            ++n2;
        }
    }

    public static void drawProgressCircle(double d, double d2, double d3, Color color, float f, double d4, int n) {
        Class1172.Method4730(color);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)6913);
        for (int i = 0; i < n && !((double)i > d4); ++i) {
            float f2 = (float)(Double.longBitsToDouble(4618760256179416344L) * (double)i / (double)n);
            float f3 = (float)(d3 * Math.cos(f2));
            float f4 = (float)(d3 * Math.sin(f2));
            GL11.glVertex2d((double)((double)f3 + d), (double)((double)f4 + d2));
        }
        GL11.glEnd();
    }

    public static void drawTexture(ResourceLocation resourceLocation, int n, int n2, int n3, int n4) {
        Field11204.getTextureManager().bindTexture(resourceLocation);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GuiScreen.drawModalRectWithCustomSizedTexture((int)n, (int)n2, (float)0.0f, (float)0.0f, (int)n3, (int)n4, (float)n3, (float)n4);
    }

    public static void drawBox(int n, int n2, int n3, int n4, int n5, Color color) {
        Gui.drawRect((int)n, (int)n2, (int)n3, (int)n4, (int)new Color(71, 67, 67, 150).getRGB());
    }

    public static void drawRect(double d, double d2, double d3, double d4, int n) {
        double d5;
        if (d < d3) {
            d5 = d;
            d = d3;
            d3 = d5;
        }
        if (d2 < d4) {
            d5 = d2;
            d2 = d4;
            d4 = d5;
        }
        float f = (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f2 = (float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f3 = (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f4 = (float)(n & 0xFF) / Float.intBitsToFloat(1132396544);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.color((float)f2, (float)f3, (float)f4, (float)f);
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION);
        bufferBuilder.pos(d, d4, 0.0).endVertex();
        bufferBuilder.pos(d3, d4, 0.0).endVertex();
        bufferBuilder.pos(d3, d2, 0.0).endVertex();
        bufferBuilder.pos(d, d2, 0.0).endVertex();
        tessellator.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void drawPolygonPart(double d, double d2, int n, int n2, int n3, int n4) {
        float f = (float)(n3 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f2 = (float)(n3 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f3 = (float)(n3 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f4 = (float)(n3 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f5 = (float)(n4 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f6 = (float)(n4 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f7 = (float)(n4 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f8 = (float)(n4 & 0xFF) / Float.intBitsToFloat(1132396544);
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)7425);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(6, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(d, d2, 0.0).color(f2, f3, f4, f).endVertex();
        int n5 = n2 * 90;
        while (true) {
            if (n5 > n2 * 90 + 90) {
                tessellator.draw();
                GlStateManager.shadeModel((int)7424);
                GlStateManager.disableBlend();
                GlStateManager.enableAlpha();
                GlStateManager.enableTexture2D();
                return;
            }
            double d3 = Double.longBitsToDouble(4618760256179416344L) * (double)n5 / Double.longBitsToDouble((long)844821248 ^ 0x40768000325AF300L) + Math.toRadians(Double.longBitsToDouble((long)1935274043 ^ 0x406680007359F03BL));
            bufferBuilder.pos(d + Math.sin(d3) * (double)n, d2 + Math.cos(d3) * (double)n, 0.0).color(f6, f7, f8, f5).endVertex();
            ++n5;
        }
    }

    public static void drawVGradientRect(float f, float f2, float f3, float f4, int n, int n2) {
        float f5 = (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f6 = (float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f7 = (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f8 = (float)(n & 0xFF) / Float.intBitsToFloat(1132396544);
        float f9 = (float)(n2 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f10 = (float)(n2 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f11 = (float)(n2 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f12 = (float)(n2 & 0xFF) / Float.intBitsToFloat(1132396544);
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)7425);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos((double)f3, (double)f2, 0.0).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos((double)f, (double)f2, 0.0).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos((double)f, (double)f4, 0.0).color(f10, f11, f12, f9).endVertex();
        bufferBuilder.pos((double)f3, (double)f4, 0.0).color(f10, f11, f12, f9).endVertex();
        tessellator.draw();
        GlStateManager.shadeModel((int)7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void drawGlow(double d, double d2, double d3, double d4, int n) {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)7425);
        Class753.drawVGradientRect((int)d, (int)d2, (int)d3, (int)(d2 + (d4 - d2) / Double.longBitsToDouble((long)942519302 ^ 0x40000000382DB406L)), Class1172.Method4728(new Color(n), 0).getRGB(), n);
        Class753.drawVGradientRect((int)d, (int)(d2 + (d4 - d2) / Double.longBitsToDouble((long)1022818070 ^ 0x400000003CF6F716L)), (int)d3, (int)d4, n, Class1172.Method4728(new Color(n), 0).getRGB());
        int n2 = (int)((d4 - d2) / Double.longBitsToDouble(0x4000000000000000L));
        Class753.drawPolygonPart(d, d2 + (d4 - d2) / Double.longBitsToDouble(0x4000000000000000L), n2, 0, n, Class1172.Method4728(new Color(n), 0).getRGB());
        Class753.drawPolygonPart(d, d2 + (d4 - d2) / Double.longBitsToDouble(0x4000000000000000L), n2, 1, n, Class1172.Method4728(new Color(n), 0).getRGB());
        Class753.drawPolygonPart(d3, d2 + (d4 - d2) / Double.longBitsToDouble((long)488955539 ^ 0x400000001D24DE93L), n2, 2, n, Class1172.Method4728(new Color(n), 0).getRGB());
        Class753.drawPolygonPart(d3, d2 + (d4 - d2) / Double.longBitsToDouble(0x4000000000000000L), n2, 3, n, Class1172.Method4728(new Color(n), 0).getRGB());
        GlStateManager.shadeModel((int)7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void gradient(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        if (bl) {
            float f = (float)(n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f2 = (float)(n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f3 = (float)(n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f4 = (float)(n5 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f5 = (float)(n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f6 = (float)(n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f7 = (float)(n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f8 = (float)(n6 & 0xFF) / Float.intBitsToFloat(1132396544);
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glShadeModel((int)7425);
            GL11.glBegin((int)9);
            GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
            GL11.glVertex2f((float)n, (float)n2);
            GL11.glVertex2f((float)n, (float)n4);
            GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)f5);
            GL11.glVertex2f((float)n3, (float)n4);
            GL11.glVertex2f((float)n3, (float)n2);
            GL11.glEnd();
            GL11.glShadeModel((int)7424);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
            return;
        }
        Field11203.drawGradientRect(n, n2, n3, n4, n5, n6);
    }

    public static void drawLeftGradientRect(double d, double d2, double d3, double d4, int n, int n2) {
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)7425);
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(d3, d2, 0.0).color((float)(n2 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544), (float)(n2 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (float)(n2 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (float)(n2 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544)).endVertex();
        bufferBuilder.pos(d, d2, 0.0).color((float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (float)(n & 0xFF) / Float.intBitsToFloat(1132396544), (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544)).endVertex();
        bufferBuilder.pos(d, d4, 0.0).color((float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (float)(n & 0xFF) / Float.intBitsToFloat(1132396544), (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544)).endVertex();
        bufferBuilder.pos(d3, d4, 0.0).color((float)(n2 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544), (float)(n2 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (float)(n2 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (float)(n2 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544)).endVertex();
        tessellator.draw();
        GlStateManager.shadeModel((int)7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void drawRoundedRect(double d, double d2, double d3, double d4, Color color, double d5) {
        Class753.drawRoundedRect((double)((float)d) - d5, (double)((float)d2) - d5, (double)((float)d3) + d5, (double)((float)d4) + d5, color.getRGB(), null.Field11787.Method368());
    }

    public static void drawRoundedRect(double d, double d2, double d3, double d4, int n, float f) {
        Class753.drawRoundedRect((float)d, (float)d2, (float)d3, (float)d4, n, f);
    }

    public static void drawBlur(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        Class92.Field8314.Method783();
        Class92.Field8314.Method783();
        Class92.Field8314.Method784("sampler", 0);
        Class92.Field8314.Method785("radius", f5);
        Class92.Field8314.Method785("radiusFactor", f6);
        Class92.Field8314.Method786("direction", f7, f8);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        Class92.Field8314.Method789();
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void drawRoundedRect1(float f, float f2, float f3, float f4, int n, float f5, float f6) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        float f7 = (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f8 = (float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f9 = (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f10 = (float)(n & 0xFF) / Float.intBitsToFloat(1132396544);
        Class92.Field8313.Method783();
        Class92.Field8313.Method783();
        Class92.Field8313.Method788("color", f8, f9, f10, f7);
        Class92.Field8313.Method786("resolution", Class886.Method3707().getScaledWidth(), Class886.Method3707().getScaledHeight());
        Class92.Field8313.Method786("center", (f + (f3 - f) / 2.0f) * 2.0f, (f2 + (f4 - f2) / 2.0f) * 2.0f);
        Class92.Field8313.Method786("dst", (f3 - f - f5) * 2.0f, (f4 - f2 - f5) * 2.0f);
        Class92.Field8313.Method785("radius", f5);
        Class92.Field8313.Method785("alphaFactor", f6);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        Class92.Field8313.Method789();
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void drawRoundedRect(float f, float f2, float f3, float f4, int n, float f5) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        float f6 = (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f7 = (float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f8 = (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f9 = (float)(n & 0xFF) / Float.intBitsToFloat(1132396544);
        Class92.Field8312.Method783();
        Class92.Field8312.Method788("color", f7, f8, f9, f6);
        Class92.Field8312.Method786("resolution", Class886.Method3707().getScaledWidth(), Class886.Method3707().getScaledHeight());
        Class92.Field8312.Method786("center", (f + (f3 - f) / 2.0f) * 2.0f, (f2 + (f4 - f2) / 2.0f) * 2.0f);
        Class92.Field8312.Method786("dst", (f3 - f - f5) * 2.0f, (f4 - f2 - f5) * 2.0f);
        Class92.Field8312.Method785("radius", f5);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        Class92.Field8312.Method789();
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void drawRoundedRect(float f, float f2, float f3, float f4, int n) {
        Class753.drawRoundedRect(f, f2, f3, f4, n, null.Field11787.Method368());
    }

    public static void drawRoundedRect2(double d, double d2, double d3, double d4, double d5, int n) {
        double d6 = d + d3;
        double d7 = d2 + d4;
        float f = (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f2 = (float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f3 = (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f4 = (float)(n & 0xFF) / Float.intBitsToFloat(1132396544);
        GL11.glPushAttrib((int)0);
        GL11.glScaled((double)Double.longBitsToDouble((long)106440160 ^ 0x3FE00000065825E0L), (double)Double.longBitsToDouble(4602678819172646912L), (double)Double.longBitsToDouble(4602678819172646912L));
        GlStateManager.enableBlend();
        d *= Double.longBitsToDouble((long)510438070 ^ 0x400000001E6CAAB6L);
        d2 *= Double.longBitsToDouble(0x4000000000000000L);
        d6 *= Double.longBitsToDouble((long)134086833 ^ 0x4000000007FE00B1L);
        d7 *= Double.longBitsToDouble((long)1910444776 ^ 0x4000000071DF12E8L);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glBegin((int)9);
        int n2 = 0;
        while (true) {
            GL11.glVertex2d((double)(d + d5 + Math.sin((double)n2 * Double.longBitsToDouble((long)2013101475 ^ 0x400921FB23B950BBL) / Double.longBitsToDouble(4640537203540230144L)) * d5 * Double.longBitsToDouble(-4616189618054758400L)), (double)(d2 + d5 + Math.cos((double)n2 * Double.longBitsToDouble((long)502350088 ^ 0x400921FB49B56C10L) / Double.longBitsToDouble((long)674551742 ^ 0x406680002834D7BEL)) * d5 * Double.longBitsToDouble(-4616189618054758400L)));
            n2 += 3;
        }
    }

    public static void drawRoundedRect(double d, double d2, double d3, double d4, Color color) {
        Class753.drawRoundedRect((float)d, (float)d2, (float)d3, (float)d4, color.getRGB(), null.Field11787.Method368());
    }

    public static void drawShadowSliders(double d, double d2, double d3, double d4, int n, double d5) {
        Class753.drawGradientRect(d, d2, d + d3, d2 + d4, n, Color.BLACK.getRGB());
        Class753.drawOutlineRect(d, d2, d + d3, d2 + d4, d5, n);
    }

    public static void drawOutlineRect(double d, double d2, double d3, double d4, double d5, int n) {
        Class753.drawRect(d, d2, d3, d2 + d5, n);
        Class753.drawRect(d, d4 - d5, d3, d4, n);
        Class753.drawRect(d, d2, d + d5, d4, n);
        Class753.drawRect(d3 - d5, d2, d3, d4, n);
    }

    public static void drawGradientRect(double d, double d2, double d3, double d4, int n, int n2) {
        float f = (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f2 = (float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f3 = (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f4 = (float)(n & 0xFF) / Float.intBitsToFloat(1132396544);
        float f5 = (float)(n2 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f6 = (float)(n2 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f7 = (float)(n2 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f8 = (float)(n2 & 0xFF) / Float.intBitsToFloat(1132396544);
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)7425);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(d3, d2, (double)Class753.Field11203.zLevel).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(d, d2, (double)Class753.Field11203.zLevel).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(d, d4, (double)Class753.Field11203.zLevel).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(d3, d4, (double)Class753.Field11203.zLevel).color(f6, f7, f8, f5).endVertex();
        tessellator.draw();
        GlStateManager.shadeModel((int)7424);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void drawTexturedRect(float f, float f2, float f3, float f4) {
        Class753.drawTexturedRect(f, f2, f3, f4, 0.0f, 1.0f, 0.0f, 1.0f);
    }

    public static void drawTexturedRect(float f, float f2, float f3, float f4, int n) {
        Class753.drawTexturedRect(f, f2, f3, f4, 0.0f, 1.0f, 0.0f, 1.0f, n);
    }

    public static void drawTexturedRect(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        Class753.drawTexturedRect(f, f2, f3, f4, f5, f6, f7, f8, 9728);
    }

    public static void drawTexturedRect(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        GlStateManager.enableBlend();
        GL14.glBlendFuncSeparate((int)770, (int)771, (int)1, (int)771);
        Class753.drawTexturedRectNoBlend(f, f2, f3, f4, f5, f6, f7, f8, n);
        GlStateManager.disableBlend();
    }

    public static void drawTexturedRectNoBlend(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        GlStateManager.enableTexture2D();
        GL11.glTexParameteri((int)3553, (int)10241, (int)n);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        bufferBuilder.pos((double)f, (double)(f2 + f4), 0.0).tex((double)f5, (double)f8).endVertex();
        bufferBuilder.pos((double)(f + f3), (double)(f2 + f4), 0.0).tex((double)f6, (double)f8).endVertex();
        bufferBuilder.pos((double)(f + f3), (double)f2, 0.0).tex((double)f6, (double)f7).endVertex();
        bufferBuilder.pos((double)f, (double)f2, 0.0).tex((double)f5, (double)f7).endVertex();
        tessellator.draw();
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
    }

    public static void drawBorderedRect(double d, double d2, double d3, double d4, float f, int n, int n2) {
        Class753.drawRect(d, d2, d + d3, d2 + d4, n2);
        float f2 = (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f3 = (float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f4 = (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f5 = (float)(n & 0xFF) / Float.intBitsToFloat(1132396544);
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)1048575);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)2884);
        GL11.glDisable((int)3553);
        GL11.glColor4f((float)f3, (float)f4, (float)f5, (float)f2);
        GL11.glLineWidth((float)f);
        GL11.glEnable((int)2848);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)(d + d3), (double)d2);
        GL11.glVertex2d((double)(d + d3), (double)d2);
        GL11.glVertex2d((double)(d + d3), (double)(d2 + d4));
        GL11.glVertex2d((double)(d + d3), (double)(d2 + d4));
        GL11.glVertex2d((double)d, (double)(d2 + d4));
        GL11.glVertex2d((double)d, (double)(d2 + d4));
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2884);
        GL11.glDisable((int)3042);
        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }

    public static boolean isHovered(double d, double d2, double d3, double d4, double d5, double d6) {
        if (!(d >= d3)) return false;
        if (!(d - d5 <= d3)) return false;
        if (!(d2 >= d4)) return false;
        if (!(d2 - d6 <= d4)) return false;
        return true;
    }

    public static void startScissor(double d, double d2, double d3, double d4) {
        Class753.startScissor(d, d2, d3, d4, 1.0);
    }

    public static void startScissor(double d, double d2, double d3, double d4, double d5) {
        ScaledResolution scaledResolution = new ScaledResolution(Field11204);
        double d6 = (double)Class753.Field11204.displayWidth / scaledResolution.getScaledWidth_double();
        double d7 = (double)Class753.Field11204.displayHeight / scaledResolution.getScaledHeight_double();
        GL11.glScissor((int)((int)(d * (d6 *= d5))), (int)(Class753.Field11204.displayHeight - (int)((d2 + d4) * (d7 *= d5))), (int)((int)(d3 * d6)), (int)((int)(d4 * d7)));
        GL11.glEnable((int)3089);
    }

    public static void stopScissor() {
        GL11.glDisable((int)3089);
    }

    public static void glColor(int n) {
        float f = (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f2 = (float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f3 = (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f4 = (float)(n & 0xFF) / Float.intBitsToFloat(1132396544);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static void drawArrow(double d, double d2, double d3, double d4, double d5, int n) {
        double d6 = d5 / (d4 * Double.longBitsToDouble(4602678819172646912L));
        double d7 = d2 + d6 * (d4 * Double.longBitsToDouble((long)584108328 ^ 0x3FE0000022D0C928L) - d3);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        Class753.glColor(n);
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION);
        bufferBuilder.pos(d, d2, 0.0);
        bufferBuilder.pos(d + d3, d2, 0.0);
        bufferBuilder.pos(d + d4 * Double.longBitsToDouble(4602678819172646912L), d7, 0.0);
        bufferBuilder.pos(d + d4 * Double.longBitsToDouble(4602678819172646912L), d2 + d5, 0.0);
        bufferBuilder.pos(d + d4 - d3, d2, 0.0);
        bufferBuilder.pos(d + d4, d2, 0.0);
        bufferBuilder.pos(d + d4 * Double.longBitsToDouble((long)546916956 ^ 0x3FE0000020994A5CL), d2 + d5, 0.0);
        bufferBuilder.pos(d + d4 * Double.longBitsToDouble((long)607178687 ^ 0x3FE000002430CFBFL), d7, 0.0);
        tessellator.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 209;
            cArray2[n] = (char)(cArray[n] ^ (0x583C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

