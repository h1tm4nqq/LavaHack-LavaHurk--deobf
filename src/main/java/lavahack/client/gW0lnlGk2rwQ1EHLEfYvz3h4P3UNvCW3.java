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
import lavahack.client.Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

public class gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3
extends Gui {
    public Jl14CJNmtWTqlp58umYadtnd800b2Vd0 Field8905;
    public Color Field8906;
    public Color Field8907;
    public boolean Field8908;
    public float Field8909;
    private String Field8910 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3(Jl14CJNmtWTqlp58umYadtnd800b2Vd0 jl14CJNmtWTqlp58umYadtnd800b2Vd0, Color color, Color color2, boolean bl) {
        this.Field8905 = jl14CJNmtWTqlp58umYadtnd800b2Vd0;
        this.Field8908 = bl;
        this.Field8906 = color;
        this.Field8907 = color2;
    }

    public gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3(Jl14CJNmtWTqlp58umYadtnd800b2Vd0 jl14CJNmtWTqlp58umYadtnd800b2Vd0, Color color, Color color2) {
        this(jl14CJNmtWTqlp58umYadtnd800b2Vd0, color, color2, (boolean)((long)-68906192 ^ (long)-68906192));
    }

    public void render() {
        GL11.glPushMatrix();
        if (this.Field8908) {
            float f = (float)(this.Field8906.getRGB() >> (((int)810491562L ^ 0x304F1EA9) << 3) & (int)((long)-533090317 ^ (long)-533090548)) / Float.intBitsToFloat((int)1976188802L ^ 0x36B53F82);
            float f2 = (float)(this.Field8906.getRGB() >> (((int)754263545L ^ 0x2CF525F8) << 4) & ((int)685045771L ^ 0x28D4F8F4)) / Float.intBitsToFloat(0x1DD39157 ^ 0x5EAC9157);
            float f3 = (float)(this.Field8906.getRGB() >> (((int)0x433634L ^ 0x433635) << 3) & ((int)-458142119L ^ 0xE4B14EA6)) / Float.intBitsToFloat((int)((long)774217068 ^ (long)1834655084));
            float f4 = (float)(this.Field8906.getRGB() & ((int)-2074109599L ^ 0x845F999E)) / Float.intBitsToFloat((int)((long)336476904 ^ (long)1467038440));
            float f5 = (float)(this.Field8907.getRGB() >> ((int)((long)331367949 ^ (long)331367950) << 3) & (int)((long)-2106829271 ^ (long)-2106829098)) / Float.intBitsToFloat(0x5599B40F ^ 0x16E6B40F);
            float f6 = (float)(this.Field8907.getRGB() >> (((int)-226819792L ^ 0xF27B0131) << 4) & ((int)515850206L ^ 0x1EBF3F21)) / Float.intBitsToFloat(0x61301BCB ^ 0x224F1BCB);
            float f7 = (float)(this.Field8907.getRGB() >> ((int)((long)-1921031794 ^ (long)-1921031793) << 3) & (int)((long)1168082149 ^ (long)1168081946)) / Float.intBitsToFloat((int)((long)1212721722 ^ (long)188197434));
            float f8 = (float)(this.Field8907.getRGB() & (int)((long)-1403497649 ^ (long)-1403497552)) / Float.intBitsToFloat((int)((long)802978034 ^ (long)1822652658));
            GlStateManager.disableTexture2D();
            GlStateManager.enableBlend();
            GlStateManager.disableAlpha();
            GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
            GlStateManager.shadeModel((int)((int)-1055954513L ^ 0xC10F74AE));
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder bufferBuilder = tessellator.getBuffer();
            bufferBuilder.begin((int)((long)1775910955 ^ (long)1775910956), DefaultVertexFormats.POSITION_COLOR);
            bufferBuilder.pos(this.Field8905.Field9399, this.Field8905.Field9401, (double)this.zLevel).color(f2, f3, f4, f).endVertex();
            bufferBuilder.pos(this.Field8905.Field9398, this.Field8905.Field9400, (double)this.zLevel).color(f2, f3, f4, f).endVertex();
            bufferBuilder.pos(this.Field8905.Field9403, this.Field8905.Field9405, (double)this.zLevel).color(f6, f7, f8, f5).endVertex();
            bufferBuilder.pos(this.Field8905.Field9402, this.Field8905.Field9404, (double)this.zLevel).color(f6, f7, f8, f5).endVertex();
            tessellator.draw();
            GlStateManager.shadeModel((int)(((int)-1842174159L ^ 0x9232A72C) << 8));
            GlStateManager.disableBlend();
            GlStateManager.enableAlpha();
            GlStateManager.enableTexture2D();
        } else {
            float f = (float)(this.Field8906.getRGB() >> ((int)((long)-2030984872 ^ (long)-2030984869) << 3) & ((int)-1164792622L ^ 0xBA92AC2D)) / Float.intBitsToFloat((int)((long)1469297849 ^ (long)351057081));
            float f9 = (float)(this.Field8906.getRGB() >> ((int)((long)-1154161373 ^ (long)-1154161374) << 4) & (int)((long)-1091279122 ^ (long)-1091279343)) / Float.intBitsToFloat((int)((long)714206495 ^ (long)1777265951));
            float f10 = (float)(this.Field8906.getRGB() >> ((int)((long)1231090565 ^ (long)1231090564) << 3) & ((int)259057723L ^ 0xF70E8C4)) / Float.intBitsToFloat((int)((long)245084212 ^ (long)1306832948));
            float f11 = (float)(this.Field8906.getRGB() & (int)((long)1014115248 ^ (long)1014115151)) / Float.intBitsToFloat((int)((long)1560317381 ^ (long)511675845));
            float f12 = (float)(this.Field8907.getRGB() >> (((int)-229808462L ^ 0xF24D66B1) << 3) & ((int)-37173851L ^ 0xFDC8C55A)) / Float.intBitsToFloat(0x5CB51F89 ^ 0x1FCA1F89);
            float f13 = (float)(this.Field8907.getRGB() >> ((int)((long)-490797078 ^ (long)-490797077) << 4) & ((int)-77105576L ^ 0xFB6776A7)) / Float.intBitsToFloat((int)((long)146848563 ^ (long)1270856499));
            float f14 = (float)(this.Field8907.getRGB() >> (((int)1020435082L ^ 0x3CD29A8B) << 3) & ((int)501125203L ^ 0x1DDE90AC)) / Float.intBitsToFloat(0x477AF656 ^ 0x405F656);
            float f15 = (float)(this.Field8907.getRGB() & (int)((long)-990836233 ^ (long)-990836472)) / Float.intBitsToFloat((int)2014319247L ^ 0x3B6F128F);
            GL11.glEnable((int)((int)((long)117622116 ^ (long)117620885) << 1));
            GL11.glDisable((int)((int)160238287L ^ 0x98D072E));
            GL11.glBlendFunc((int)((int)((long)-1356097906 ^ (long)-1356097777) << 1), (int)((int)-401705839L ^ 0xE80E7792));
            GL11.glShadeModel((int)((int)((long)723021625 ^ (long)723022392)));
            GL11.glBegin((int)((int)((long)-190068958 ^ (long)-190068949)));
            GL11.glColor4f((float)f9, (float)f10, (float)f11, (float)f);
            GL11.glVertex2d((double)this.Field8905.Field9398, (double)this.Field8905.Field9400);
            GL11.glVertex2d((double)this.Field8905.Field9403, (double)this.Field8905.Field9405);
            GL11.glColor4f((float)f13, (float)f14, (float)f15, (float)f12);
            GL11.glVertex2d((double)this.Field8905.Field9402, (double)this.Field8905.Field9404);
            GL11.glVertex2d((double)this.Field8905.Field9399, (double)this.Field8905.Field9401);
            GL11.glEnd();
            GL11.glShadeModel((int)(((int)-1667061660L ^ 0x9CA2A879) << 8));
            GL11.glEnable((int)((int)((long)1964292047 ^ (long)1964292654)));
            GL11.glDisable((int)((int)((long)-1219971373 ^ (long)-1219972318) << 1));
        }
        GL11.glPopMatrix();
    }

    public static void drawGradientRect(double d, double d2, double d3, double d4, boolean bl, boolean bl2, int n, int n2) {
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)((int)690661384L ^ 0x292AB509));
        GL11.glBegin((int)((int)((long)674692289 ^ (long)674692294)));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.glColor(n);
        if (bl) {
            if (bl2) {
                GL11.glVertex2d((double)d3, (double)d4);
                GL11.glVertex2d((double)d3, (double)d2);
                hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.glColor(n2);
                GL11.glVertex2d((double)d, (double)d2);
                GL11.glVertex2d((double)d, (double)d4);
            } else {
                GL11.glVertex2d((double)d, (double)d2);
                GL11.glVertex2d((double)d, (double)d4);
                hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.glColor(n2);
                GL11.glVertex2d((double)d3, (double)d4);
                GL11.glVertex2d((double)d3, (double)d2);
            }
        } else if (bl2) {
            GL11.glVertex2d((double)d3, (double)d4);
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.glColor(n2);
            GL11.glVertex2d((double)d3, (double)d2);
            GL11.glVertex2d((double)d, (double)d2);
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.glColor(n);
            GL11.glVertex2d((double)d, (double)d4);
        } else {
            GL11.glVertex2d((double)d, (double)d2);
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.glColor(n2);
            GL11.glVertex2d((double)d, (double)d4);
            GL11.glVertex2d((double)d3, (double)d4);
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.glColor(n);
            GL11.glVertex2d((double)d3, (double)d2);
        }
        GL11.glEnd();
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel((int)((int)((long)0x11C1CB1B ^ (long)297913094) << 8));
    }
}

