//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.Class340;
import lavahack.client.Class753;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

public class Class211
extends Gui {
    public Class340 Field8905;
    public Color Field8906;
    public Color Field8907;
    public boolean Field8908;
    public float Field8909;
    private String Field8910 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class211(Class340 class340, Color color, Color color2, boolean bl) {
        this.Field8905 = class340;
        this.Field8908 = bl;
        this.Field8906 = color;
        this.Field8907 = color2;
    }

    public Class211(Class340 class340, Color color, Color color2) {
        this(class340, color, color2, false);
    }

    public void render() {
        GL11.glPushMatrix();
        if (this.Field8908) {
            float f = (float)(this.Field8906.getRGB() >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f2 = (float)(this.Field8906.getRGB() >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f3 = (float)(this.Field8906.getRGB() >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f4 = (float)(this.Field8906.getRGB() & 0xFF) / Float.intBitsToFloat(1132396544);
            float f5 = (float)(this.Field8907.getRGB() >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f6 = (float)(this.Field8907.getRGB() >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f7 = (float)(this.Field8907.getRGB() >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f8 = (float)(this.Field8907.getRGB() & 0xFF) / Float.intBitsToFloat(1132396544);
            GlStateManager.disableTexture2D();
            GlStateManager.enableBlend();
            GlStateManager.disableAlpha();
            GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
            GlStateManager.shadeModel((int)7425);
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder bufferBuilder = tessellator.getBuffer();
            bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
            bufferBuilder.pos(this.Field8905.Field9399, this.Field8905.Field9401, (double)this.zLevel).color(f2, f3, f4, f).endVertex();
            bufferBuilder.pos(this.Field8905.Field9398, this.Field8905.Field9400, (double)this.zLevel).color(f2, f3, f4, f).endVertex();
            bufferBuilder.pos(this.Field8905.Field9403, this.Field8905.Field9405, (double)this.zLevel).color(f6, f7, f8, f5).endVertex();
            bufferBuilder.pos(this.Field8905.Field9402, this.Field8905.Field9404, (double)this.zLevel).color(f6, f7, f8, f5).endVertex();
            tessellator.draw();
            GlStateManager.shadeModel((int)7424);
            GlStateManager.disableBlend();
            GlStateManager.enableAlpha();
            GlStateManager.enableTexture2D();
        } else {
            float f = (float)(this.Field8906.getRGB() >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f9 = (float)(this.Field8906.getRGB() >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f10 = (float)(this.Field8906.getRGB() >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f11 = (float)(this.Field8906.getRGB() & 0xFF) / Float.intBitsToFloat(1132396544);
            float f12 = (float)(this.Field8907.getRGB() >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f13 = (float)(this.Field8907.getRGB() >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f14 = (float)(this.Field8907.getRGB() >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f15 = (float)(this.Field8907.getRGB() & 0xFF) / Float.intBitsToFloat(1132396544);
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glShadeModel((int)7425);
            GL11.glBegin((int)9);
            GL11.glColor4f((float)f9, (float)f10, (float)f11, (float)f);
            GL11.glVertex2d((double)this.Field8905.Field9398, (double)this.Field8905.Field9400);
            GL11.glVertex2d((double)this.Field8905.Field9403, (double)this.Field8905.Field9405);
            GL11.glColor4f((float)f13, (float)f14, (float)f15, (float)f12);
            GL11.glVertex2d((double)this.Field8905.Field9402, (double)this.Field8905.Field9404);
            GL11.glVertex2d((double)this.Field8905.Field9399, (double)this.Field8905.Field9401);
            GL11.glEnd();
            GL11.glShadeModel((int)7424);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
        }
        GL11.glPopMatrix();
    }

    public static void drawGradientRect(double d, double d2, double d3, double d4, boolean bl, boolean bl2, int n, int n2) {
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)7425);
        GL11.glBegin((int)7);
        Class753.glColor(n);
        if (bl) {
            if (bl2) {
                GL11.glVertex2d((double)d3, (double)d4);
                GL11.glVertex2d((double)d3, (double)d2);
                Class753.glColor(n2);
                GL11.glVertex2d((double)d, (double)d2);
                GL11.glVertex2d((double)d, (double)d4);
            } else {
                GL11.glVertex2d((double)d, (double)d2);
                GL11.glVertex2d((double)d, (double)d4);
                Class753.glColor(n2);
                GL11.glVertex2d((double)d3, (double)d4);
                GL11.glVertex2d((double)d3, (double)d2);
            }
        } else if (bl2) {
            GL11.glVertex2d((double)d3, (double)d4);
            Class753.glColor(n2);
            GL11.glVertex2d((double)d3, (double)d2);
            GL11.glVertex2d((double)d, (double)d2);
            Class753.glColor(n);
            GL11.glVertex2d((double)d, (double)d4);
        } else {
            GL11.glVertex2d((double)d, (double)d2);
            Class753.glColor(n2);
            GL11.glVertex2d((double)d, (double)d4);
            GL11.glVertex2d((double)d3, (double)d4);
            Class753.glColor(n);
            GL11.glVertex2d((double)d3, (double)d2);
        }
        GL11.glEnd();
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel((int)7424);
    }
}

