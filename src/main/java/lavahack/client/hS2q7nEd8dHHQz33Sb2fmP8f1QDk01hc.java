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

import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import java.awt.Color;
import lavahack.client.KXs4HRW0lXJngcZQACLZ5euPLj4dceJO;
import lavahack.client.Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T;
import lavahack.client.dEyNkKK7m9En8syt2f5PGzT6mmuTitT3;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
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

public class hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc
extends GuiScreen {
    public static hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc Field11203 = new hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc();
    private static final Minecraft Field11204 = Minecraft.getMinecraft();
    private int Field11205;

    public static void renderItemOverlayIntoGUI(int n, int n2, String string) {
        GlStateManager.disableLighting();
        GlStateManager.disableDepth();
        GlStateManager.disableBlend();
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, n + (int)((long)-1141372408 ^ (long)-1141372389) - (((int)-2133513447L ^ 0x80D52B18) << 1) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string), n2 + (((int)-868030555L ^ 0xCC42E7A6) << 1) + ((int)1016519740L ^ 0x3C96DC3F), new Color((int)-148023288L ^ 0xF72D58F7, (int)((long)-393933042 ^ (long)-393932815), (int)((long)1862434943 ^ (long)1862434944), (int)-1748857378L ^ 0x97C28D21).hashCode());
        GlStateManager.enableLighting();
        GlStateManager.enableDepth();
        GlStateManager.enableBlend();
    }

    public static void drawGradientSidewaysWH(double d, double d2, double d3, double d4, int n, int n2) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawGradientSideways(d, d2, d + d3, d2 + d4, n, n2);
    }

    public static void drawGradientSideways(double d, double d2, double d3, double d4, int n, int n2) {
        float f = (float)(n >> ((int)((long)1774248323 ^ (long)1774248320) << 3) & ((int)-1223201510L ^ 0xB7176DE5)) / Float.intBitsToFloat(0x2093EA09 ^ 0x63ECEA09);
        float f2 = (float)(n >> ((int)((long)-909875912 ^ (long)-909875911) << 4) & (int)((long)-859274850 ^ (long)-859274911)) / Float.intBitsToFloat((int)1694704286L ^ 0x267C229E);
        float f3 = (float)(n >> (((int)-670501633L ^ 0xD808F4FE) << 3) & (int)((long)611656736 ^ (long)611656927)) / Float.intBitsToFloat((int)((long)613377287 ^ (long)1743807751));
        float f4 = (float)(n & (int)((long)1452284462 ^ (long)1452284625)) / Float.intBitsToFloat((int)((long)209140962 ^ (long)1325939938));
        float f5 = (float)(n2 >> (((int)-773590036L ^ 0xD1E3F3EF) << 3) & ((int)-1166383792L ^ 0xBA7A65AF)) / Float.intBitsToFloat(0x1857070D ^ 0x5B28070D);
        float f6 = (float)(n2 >> (((int)-1997962908L ^ 0x88E98165) << 3) & ((int)-655370188L ^ 0xD8EFD8CB)) / Float.intBitsToFloat((int)((long)330972788 ^ (long)1355103860));
        float f7 = (float)(n2 & ((int)1373623239L ^ 0x51DFD338)) / Float.intBitsToFloat((int)((long)1865888661 ^ (long)742929301));
        float f8 = (float)(n2 >> (((int)-1498127706L ^ 0xA6B462A7) << 4) & (int)((long)-1588334418 ^ (long)-1588334511)) / Float.intBitsToFloat(0x7DE4CE51 ^ 0x3E9BCE51);
        GL11.glEnable((int)(((int)1482796516L ^ 0x5861A815) << 1));
        GL11.glDisable((int)((int)-1172892936L ^ 0xBA171F19));
        GL11.glBlendFunc((int)((int)((long)-1355495417 ^ (long)-1355495034) << 1), (int)((int)((long)1905402940 ^ (long)1905403711)));
        GL11.glEnable((int)(((int)-1074855564L ^ 0xBFEF012D) << 5));
        GL11.glShadeModel((int)((int)((long)-907127398 ^ (long)-907130725)));
        GL11.glPushMatrix();
        GL11.glBegin((int)((int)631837429L ^ 0x25A912F2));
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)d4);
        GL11.glColor4f((float)f8, (float)f6, (float)f7, (float)f5);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d3, (double)d2);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)((int)((long)1287025477 ^ (long)1287028388)));
        GL11.glDisable((int)((int)((long)419109803 ^ (long)419110490) << 1));
    }

    public static void drawFace(EntityPlayer entityPlayer, int n, int n2, int n3, int n4) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawFace(entityPlayer, n, n2, n3, n4, 1.0f, 1.0f, 1.0f, 1.0f);
    }

    public static void drawFace(EntityPlayer entityPlayer, int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        GL11.glPushMatrix();
        Field11204.getTextureManager().bindTexture(hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.Field11204.player.connection.getPlayerInfo(entityPlayer.getName()).getLocationSkin());
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        Gui.drawScaledCustomSizeModalRect((int)n, (int)n2, (float)Float.intBitsToFloat((int)711765621L ^ 0x6B6CAE75), (float)Float.intBitsToFloat(0x4F4FD797 ^ 0xE4FD797), (int)(((int)-1071665112L ^ 0xC01FB029) << 3), (int)((int)((long)91192638 ^ (long)91192639) << 3), (int)n3, (int)n4, (float)Float.intBitsToFloat((int)((long)1819176918 ^ (long)787378134)), (float)Float.intBitsToFloat((int)((long)417767512 ^ (long)1516675160)));
        Field11204.getTextureManager().bindTexture(hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.Field11204.player.connection.getPlayerInfo(entityPlayer.getName()).getLocationSkin());
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        Gui.drawScaledCustomSizeModalRect((int)n, (int)n2, (float)Float.intBitsToFloat((int)((long)450470116 ^ (long)1540989156)), (float)Float.intBitsToFloat((int)((long)1060781501 ^ (long)2117746109)), (int)((int)((long)-1299078530 ^ (long)-1299078533) << 3), (int)((int)((long)-216497965 ^ (long)-216497966) << 3), (int)n3, (int)n4, (float)Float.intBitsToFloat((int)((long)1222950572 ^ (long)174374572)), (float)Float.intBitsToFloat(0x534B5394 ^ 0x11CB5394));
        GL11.glPopMatrix();
    }

    public float getZLevel() {
        return this.zLevel;
    }

    public void setZLevel(float f) {
        this.zLevel = f;
    }

    public static void disableGL2D() {
        GL11.glEnable((int)((int)-1262023795L ^ 0xB4C7066C));
        GL11.glDisable((int)((int)((long)360333404 ^ (long)360334765) << 1));
        GL11.glEnable((int)((int)2061620897L ^ 0x7AE1DDD0));
        GL11.glDisable((int)(((int)422164683L ^ 0x1929B892) << 5));
        GL11.glHint((int)((int)((long)1019553731 ^ (long)1019552234) << 1), (int)((int)((long)1847089832 ^ (long)1847089849) << 8));
        GL11.glHint((int)((int)((long)375685849 ^ (long)375688842)), (int)((int)((long)1592681757 ^ (long)1592681740) << 8));
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
        float f = (float)(n6 >> (((int)920699393L ^ 0x36E0C202) << 3) & ((int)-1930203761L ^ 0x8CF36D70)) / Float.intBitsToFloat(0x4FE604FD ^ 0xC9904FD);
        float f2 = (float)(n6 >> (((int)1511359817L ^ 0x5A158548) << 4) & ((int)-763061992L ^ 0xD28499E7)) / Float.intBitsToFloat((int)((long)489883668 ^ (long)1582041108));
        float f3 = (float)(n6 >> ((int)((long)-634295091 ^ (long)-634295092) << 3) & (int)((long)484222704 ^ (long)484222479)) / Float.intBitsToFloat((int)((long)1126758712 ^ (long)5765432));
        float f4 = (float)(n6 & ((int)-2013094663L ^ 0x88029C06)) / Float.intBitsToFloat((int)((long)149440168 ^ (long)1268205224));
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
        float f = (float)(n >> (((int)1377018327L ^ 0x5213A1D4) << 3) & ((int)3288459L ^ 0x322D74)) / Float.intBitsToFloat((int)((long)191063640 ^ (long)1209820760));
        float f2 = (float)(n >> ((int)((long)-1759472120 ^ (long)-1759472119) << 4) & (int)((long)-1578816984 ^ (long)-1578816809)) / Float.intBitsToFloat(0x106ED0F8 ^ 0x5311D0F8);
        float f3 = (float)(n >> ((int)((long)1093276426 ^ (long)1093276427) << 3) & ((int)2141099717L ^ 0x7F9E963A)) / Float.intBitsToFloat((int)((long)1405064327 ^ (long)281056391));
        float f4 = (float)(n & ((int)1746671744L ^ 0x681C187F)) / Float.intBitsToFloat((int)324091247L ^ 0x502E3D6F);
        boolean bl = GL11.glIsEnabled((int)((int)((long)-751771876 ^ (long)-751772947) << 1));
        boolean bl2 = GL11.glIsEnabled((int)(((int)-884663999L ^ 0xCB451918) << 5));
        boolean bl3 = GL11.glIsEnabled((int)((int)((long)-1059752862 ^ (long)-1059751549)));
        if (!bl) {
            GL11.glEnable((int)(((int)-2101234950L ^ 0x82C1B70B) << 1));
        }
        if (!bl2) {
            GL11.glEnable((int)(((int)-1271767212L ^ 0xB4325F0D) << 5));
        }
        if (bl3) {
            GL11.glDisable((int)((int)((long)-2080056414 ^ (long)-2080057789)));
        }
        GL11.glEnable((int)((int)((long)83338049 ^ (long)83338008) << 5));
        GL11.glBlendFunc((int)((int)((long)1818337508 ^ (long)1818337637) << 1), (int)((int)((long)2074577562 ^ (long)2074577305)));
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glLineWidth((float)Float.intBitsToFloat((int)1139731770L ^ 0x3CEED3A));
        GL11.glBegin((int)((int)1690409809L ^ 0x64C19B52));
        for (double d6 = 0.0; d6 <= d4; d6 += d5) {
            GL11.glVertex2d((double)(d + Math.sin(d6 * Double.longBitsToDouble((long)1148512792 ^ 0x400921FB1030C700L) / Double.longBitsToDouble((long)633021823 ^ 0x4066800025BB257FL)) * d3), (double)(d2 + Math.cos(d6 * Double.longBitsToDouble(0x1D1D12A931BA3E23L ^ 0x5D14335265FE133BL) / Double.longBitsToDouble(0x62133A693E44A4ECL ^ 0x2275BA693E44A4ECL)) * d3));
        }
        GL11.glEnd();
        GL11.glDisable((int)((int)((long)-283472062 ^ (long)-283472101) << 5));
        if (bl3) {
            GL11.glEnable((int)((int)((long)-215222425 ^ (long)-215221626)));
        }
        if (!bl2) {
            GL11.glDisable((int)(((int)-1615941960L ^ 0x9FAEAEE1) << 5));
        }
        if (bl) return;
        GL11.glDisable((int)(((int)672371501L ^ 0x281396DC) << 1));
    }

    public static void drawSmoothRect(float f, float f2, float f3, float f4, int n) {
        GL11.glEnable((int)((int)((long)-1832365964 ^ (long)-1832364667) << 1));
        GL11.glEnable((int)(((int)1066027188L ^ 0x3F8A48ED) << 5));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(f, f2, f3, f4, n);
        GL11.glScalef((float)Float.intBitsToFloat((int)((long)795326945 ^ (long)275233249)), (float)Float.intBitsToFloat(0x7BF4A6CD ^ 0x44F4A6CD), (float)Float.intBitsToFloat((int)((long)9332110 ^ (long)1066296718)));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(f * 2.0f - 1.0f, f2 * 2.0f, f * 2.0f, f4 * 2.0f - 1.0f, n);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(f * 2.0f, f2 * 2.0f - 1.0f, f3 * 2.0f, f2 * 2.0f, n);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(f3 * 2.0f, f2 * 2.0f, f3 * 2.0f + 1.0f, f4 * 2.0f - 1.0f, n);
        GL11.glDisable((int)((int)((long)-500078577 ^ (long)-500077058) << 1));
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
    }

    public static void drawModalRectWithCustomSizedTexture(double d, double d2, float f, float f2, double d3, double d4, double d5, double d6) {
        float f3 = 1.0f / (float)d5;
        float f4 = 1.0f / (float)d6;
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)1784454628L ^ 0x6A5C9DE3, DefaultVertexFormats.POSITION_TEX);
        bufferBuilder.pos(d, d2 + d4, 0.0).tex((double)(f * f3), (double)((f2 + (float)d4) * f4)).endVertex();
        bufferBuilder.pos(d + d3, d2 + d4, 0.0).tex((double)((f + (float)d3) * f3), (double)((f2 + (float)d4) * f4)).endVertex();
        bufferBuilder.pos(d + d3, d2, 0.0).tex((double)((f + (float)d3) * f3), (double)(f2 * f4)).endVertex();
        bufferBuilder.pos(d, d2, 0.0).tex((double)(f * f3), (double)(f2 * f4)).endVertex();
        tessellator.draw();
    }

    public static void drawAbstract(dEyNkKK7m9En8syt2f5PGzT6mmuTitT3 dEyNkKK7m9En8syt2f5PGzT6mmuTitT32) {
        if (dEyNkKK7m9En8syt2f5PGzT6mmuTitT32 == null) return;
        dEyNkKK7m9En8syt2f5PGzT6mmuTitT32.Method190();
    }

    public static void drawAbstract(KXs4HRW0lXJngcZQACLZ5euPLj4dceJO kXs4HRW0lXJngcZQACLZ5euPLj4dceJO) {
        if (kXs4HRW0lXJngcZQACLZ5euPLj4dceJO == null) return;
        kXs4HRW0lXJngcZQACLZ5euPLj4dceJO.Method190();
    }

    public static void drawAbstract(gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3 gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW32) {
        if (gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW32 == null) return;
        gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW32.render();
    }

    public static void drawRectWH(double d, double d2, double d3, double d4, int n) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2, d + d3, d2 + d4, n);
    }

    public static void drawCircle(double d, double d2, double d3, Color color, float f, int n) {
        zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4730(color);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)(((int)1874034610L ^ 0x6FB37FB3) << 1));
        int n2 = (int)((long)767639109 ^ (long)767639109);
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
        zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4730(color);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)((int)522357895L ^ 0x1F229786));
        for (int i = (int)-1385953561L ^ 0xAD6406E7; i < n && !((double)i > d4); ++i) {
            float f2 = (float)(Double.longBitsToDouble(0x624B6492EEAA5B09L ^ 0x22524569BAEE7611L) * (double)i / (double)n);
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
        Gui.drawRect((int)n, (int)n2, (int)n3, (int)n4, (int)new Color((int)((long)-2111977717 ^ (long)-2111977652), (int)-1588940941L ^ 0xA14AAF30, (int)((long)1072446825 ^ (long)1072446762), ((int)-136588259L ^ 0xF7DBD456) << 1).getRGB());
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
        float f = (float)(n >> (((int)1419594494L ^ 0x549D4AFD) << 3) & (int)((long)-657996905 ^ (long)-657996952)) / Float.intBitsToFloat((int)((long)1827868763 ^ (long)797708379));
        float f2 = (float)(n >> ((int)((long)-1531836478 ^ (long)-1531836477) << 4) & (int)((long)-1709154094 ^ (long)-1709154259)) / Float.intBitsToFloat((int)((long)1791010658 ^ (long)700426082));
        float f3 = (float)(n >> ((int)((long)-1262356030 ^ (long)-1262356029) << 3) & (int)((long)1927359873 ^ (long)1927359870)) / Float.intBitsToFloat(0x1EEAC686 ^ 0x5D95C686);
        float f4 = (float)(n & ((int)-2089141120L ^ 0x837A3C7F)) / Float.intBitsToFloat((int)858577816L ^ 0x7053DB98);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.color((float)f2, (float)f3, (float)f4, (float)f);
        bufferBuilder.begin((int)-55409484L ^ 0xFCB284B3, DefaultVertexFormats.POSITION);
        bufferBuilder.pos(d, d4, 0.0).endVertex();
        bufferBuilder.pos(d3, d4, 0.0).endVertex();
        bufferBuilder.pos(d3, d2, 0.0).endVertex();
        bufferBuilder.pos(d, d2, 0.0).endVertex();
        tessellator.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void drawPolygonPart(double d, double d2, int n, int n2, int n3, int n4) {
        float f = (float)(n3 >> ((int)((long)-1946132969 ^ (long)-1946132972) << 3) & ((int)-559901991L ^ 0xDEA09226)) / Float.intBitsToFloat((int)((long)1604035978 ^ (long)484746634));
        float f2 = (float)(n3 >> (((int)-572248958L ^ 0xDDE42C83) << 4) & (int)((long)1644385517 ^ (long)1644385298)) / Float.intBitsToFloat((int)((long)1144719484 ^ (long)121899132));
        float f3 = (float)(n3 >> (((int)-1122917564L ^ 0xBD11A345) << 3) & ((int)-2135269550L ^ 0x80BA5FAD)) / Float.intBitsToFloat((int)((long)355434668 ^ (long)1448116396));
        float f4 = (float)(n3 & ((int)-534477049L ^ 0xE02487F8)) / Float.intBitsToFloat((int)336989852L ^ 0x57690E9C);
        float f5 = (float)(n4 >> ((int)((long)-892493894 ^ (long)-892493895) << 3) & ((int)1006643302L ^ 0x3C002899)) / Float.intBitsToFloat((int)((long)1077766595 ^ (long)54684099));
        float f6 = (float)(n4 >> (((int)479433467L ^ 0x1C9392FA) << 4) & (int)((long)-1653093472 ^ (long)-1653093537)) / Float.intBitsToFloat(0x6CE942ED ^ 0x2F9642ED);
        float f7 = (float)(n4 >> ((int)((long)758393547 ^ (long)758393546) << 3) & (int)((long)1193818681 ^ (long)1193818822)) / Float.intBitsToFloat((int)((long)604522493 ^ (long)1735870461));
        float f8 = (float)(n4 & ((int)597580240L ^ 0x239E592F)) / Float.intBitsToFloat((int)((long)1084937240 ^ (long)64345112));
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)((int)((long)-981059903 ^ (long)-981062720)));
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)((long)734911189 ^ (long)734911190) << 1, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(d, d2, 0.0).color(f2, f3, f4, f).endVertex();
        int n5 = n2 * ((int)((long)-755009927 ^ (long)-755009964) << 1);
        while (true) {
            if (n5 > n2 * (((int)-407856006L ^ 0xE7B09C57) << 1) + ((int)((long)-1048360595 ^ (long)-1048360640) << 1)) {
                tessellator.draw();
                GlStateManager.shadeModel((int)(((int)-1454995685L ^ 0xA9468706) << 8));
                GlStateManager.disableBlend();
                GlStateManager.enableAlpha();
                GlStateManager.enableTexture2D();
                return;
            }
            double d3 = Double.longBitsToDouble(0x60018AE152677D85L ^ 0x2018AB1A0623509DL) * (double)n5 / Double.longBitsToDouble((long)844821248 ^ 0x40768000325AF300L) + Math.toRadians(Double.longBitsToDouble((long)1935274043 ^ 0x406680007359F03BL));
            bufferBuilder.pos(d + Math.sin(d3) * (double)n, d2 + Math.cos(d3) * (double)n, 0.0).color(f6, f7, f8, f5).endVertex();
            ++n5;
        }
    }

    public static void drawVGradientRect(float f, float f2, float f3, float f4, int n, int n2) {
        float f5 = (float)(n >> (((int)1461390758L ^ 0x571B0DA5) << 3) & ((int)1489462964L ^ 0x58C7664B)) / Float.intBitsToFloat((int)2134338756L ^ 0x3C486CC4);
        float f6 = (float)(n >> ((int)((long)-625819642 ^ (long)-625819641) << 4) & (int)((long)536391276 ^ (long)536391315)) / Float.intBitsToFloat((int)((long)942357193 ^ (long)2069117641));
        float f7 = (float)(n >> ((int)((long)-1487160047 ^ (long)-1487160048) << 3) & ((int)-1717616198L ^ 0x999F4145)) / Float.intBitsToFloat((int)((long)2105981814 ^ (long)1056553846));
        float f8 = (float)(n & ((int)568629038L ^ 0x21E497D1)) / Float.intBitsToFloat((int)((long)1572454386 ^ (long)516341746));
        float f9 = (float)(n2 >> (((int)2056445958L ^ 0x7A92E005) << 3) & (int)((long)1478677206 ^ (long)1478677033)) / Float.intBitsToFloat(0x49D9B930 ^ 0xAA6B930);
        float f10 = (float)(n2 >> (((int)-2132827742L ^ 0x80DFA1A3) << 4) & (int)((long)-1147849954 ^ (long)-1147849759)) / Float.intBitsToFloat((int)((long)1800904811 ^ (long)673751147));
        float f11 = (float)(n2 >> (((int)386614457L ^ 0x170B44B8) << 3) & ((int)456210220L ^ 0x1B3137D3)) / Float.intBitsToFloat(0x6D00093F ^ 0x2E7F093F);
        float f12 = (float)(n2 & ((int)508759762L ^ 0x1E530E2D)) / Float.intBitsToFloat((int)((long)1144098014 ^ (long)122588382));
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)((int)494538428L ^ 0x1D7A13BD));
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)((long)1305270572 ^ (long)1305270571), DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos((double)f3, (double)f2, 0.0).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos((double)f, (double)f2, 0.0).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos((double)f, (double)f4, 0.0).color(f10, f11, f12, f9).endVertex();
        bufferBuilder.pos((double)f3, (double)f4, 0.0).color(f10, f11, f12, f9).endVertex();
        tessellator.draw();
        GlStateManager.shadeModel((int)(((int)426024120L ^ 0x19649CA5) << 8));
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void drawGlow(double d, double d2, double d3, double d4, int n) {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)((int)((long)327599777 ^ (long)327605152)));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawVGradientRect((int)d, (int)d2, (int)d3, (int)(d2 + (d4 - d2) / Double.longBitsToDouble((long)942519302 ^ 0x40000000382DB406L)), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728(new Color(n), (int)((long)1359942009 ^ (long)1359942009)).getRGB(), n);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawVGradientRect((int)d, (int)(d2 + (d4 - d2) / Double.longBitsToDouble((long)1022818070 ^ 0x400000003CF6F716L)), (int)d3, (int)d4, n, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728(new Color(n), (int)((long)-1777273986 ^ (long)-1777273986)).getRGB());
        int n2 = (int)((d4 - d2) / Double.longBitsToDouble(0x32166D7AF7688691L ^ 0x72166D7AF7688691L));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawPolygonPart(d, d2 + (d4 - d2) / Double.longBitsToDouble(0x6F9D4C9EC20FE68BL ^ 0x2F9D4C9EC20FE68BL), n2, (int)-608188633L ^ 0xDBBFC727, n, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728(new Color(n), (int)((long)-206113522 ^ (long)-206113522)).getRGB());
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawPolygonPart(d, d2 + (d4 - d2) / Double.longBitsToDouble(0xE21C261C82003734L ^ 0xA21C261C82003734L), n2, (int)((long)-918311746 ^ (long)-918311745), n, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728(new Color(n), (int)((long)-621527017 ^ (long)-621527017)).getRGB());
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawPolygonPart(d3, d2 + (d4 - d2) / Double.longBitsToDouble((long)488955539 ^ 0x400000001D24DE93L), n2, ((int)-283051964L ^ 0xEF20F845) << 1, n, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728(new Color(n), (int)622402318L ^ 0x25191B0E).getRGB());
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawPolygonPart(d3, d2 + (d4 - d2) / Double.longBitsToDouble(0xD85A59D2E55B2A8BL ^ 0x985A59D2E55B2A8BL), n2, (int)-1467384395L ^ 0xA8897DB6, n, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728(new Color(n), (int)((long)757878727 ^ (long)757878727)).getRGB());
        GlStateManager.shadeModel((int)(((int)-1288853045L ^ 0xB32DA9D6) << 8));
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void gradient(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        if (bl) {
            float f = (float)(n5 >> ((int)((long)-839629888 ^ (long)-839629885) << 3) & (int)((long)-501575818 ^ (long)-501575799)) / Float.intBitsToFloat((int)((long)123570283 ^ (long)1143113835));
            float f2 = (float)(n5 >> (((int)-719175268L ^ 0xD522419D) << 4) & ((int)-1428428292L ^ 0xAADBE903)) / Float.intBitsToFloat(0x569A6B94 ^ 0x15E56B94);
            float f3 = (float)(n5 >> (((int)1764575769L ^ 0x692D4A18) << 3) & ((int)256100738L ^ 0xF43C97D)) / Float.intBitsToFloat((int)4244124L ^ 0x433FC29C);
            float f4 = (float)(n5 & ((int)814068264L ^ 0x3085B2D7)) / Float.intBitsToFloat((int)((long)1341106968 ^ (long)210807576));
            float f5 = (float)(n6 >> (((int)-25182475L ^ 0xFE7FBEF6) << 3) & ((int)-1822960531L ^ 0x9357D492)) / Float.intBitsToFloat((int)((long)1524361823 ^ (long)430238303));
            float f6 = (float)(n6 >> (((int)563333671L ^ 0x2193CA26) << 4) & (int)((long)-276568830 ^ (long)-276568579)) / Float.intBitsToFloat((int)1850711131L ^ 0x2D309C5B);
            float f7 = (float)(n6 >> ((int)((long)-1930725013 ^ (long)-1930725014) << 3) & (int)((long)1019366340 ^ (long)1019366203)) / Float.intBitsToFloat((int)((long)325527425 ^ (long)1343760257));
            float f8 = (float)(n6 & ((int)331258594L ^ 0x13BE9A1D)) / Float.intBitsToFloat(0x79EF6292 ^ 0x3A906292);
            GL11.glEnable((int)(((int)254524587L ^ 0xF2BB95A) << 1));
            GL11.glDisable((int)((int)-1237601433L ^ 0xB63BBE86));
            GL11.glBlendFunc((int)(((int)-375979475L ^ 0xE99703AC) << 1), (int)((int)-8270307L ^ 0xFF81CD1E));
            GL11.glShadeModel((int)((int)3412605L ^ 0x340F7C));
            GL11.glBegin((int)((int)((long)-888448601 ^ (long)-888448594)));
            GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
            GL11.glVertex2f((float)n, (float)n2);
            GL11.glVertex2f((float)n, (float)n4);
            GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)f5);
            GL11.glVertex2f((float)n3, (float)n4);
            GL11.glVertex2f((float)n3, (float)n2);
            GL11.glEnd();
            GL11.glShadeModel((int)((int)((long)-1893822317 ^ (long)-1893822322) << 8));
            GL11.glEnable((int)((int)98226582L ^ 0x5DADC77));
            GL11.glDisable((int)((int)((long)-671401696 ^ (long)-671400751) << 1));
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
        GlStateManager.shadeModel((int)((int)((long)-338783774 ^ (long)-338785053)));
        bufferBuilder.begin((int)((long)-1197948935 ^ (long)-1197948930), DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(d3, d2, 0.0).color((float)(n2 >> ((int)((long)1519143714 ^ (long)1519143713) << 3) & (int)((long)-1539093229 ^ (long)-1539093012)) / Float.intBitsToFloat(0x44D2BE8B ^ 0x7ADBE8B), (float)(n2 >> ((int)((long)986057953 ^ (long)986057952) << 4) & (int)((long)1905776742 ^ (long)1905776793)) / Float.intBitsToFloat((int)357421490L ^ 0x5632D1B2), (float)(n2 >> (((int)-618612356L ^ 0xDB20B97D) << 3) & (int)((long)627333682 ^ (long)627333837)) / Float.intBitsToFloat((int)1677671839L ^ 0x20803D9F), (float)(n2 >> (((int)-1333069755L ^ 0xB08AF846) << 3) & (int)((long)426040623 ^ (long)426040784)) / Float.intBitsToFloat((int)628372028L ^ 0x660B323C)).endVertex();
        bufferBuilder.pos(d, d2, 0.0).color((float)(n >> (((int)-1009521915L ^ 0xC3D3EB04) << 4) & (int)((long)306704261 ^ (long)306704250)) / Float.intBitsToFloat(0xB644AD4 ^ 0x481B4AD4), (float)(n >> ((int)((long)56637996 ^ (long)56637997) << 3) & ((int)1762185150L ^ 0x6908CF41)) / Float.intBitsToFloat(0x2F90F8A3 ^ 0x6CEFF8A3), (float)(n & (int)((long)-783546200 ^ (long)-783546281)) / Float.intBitsToFloat(0x1B62A143 ^ 0x581DA143), (float)(n >> (((int)-1968155329L ^ 0x8AB0553C) << 3) & (int)((long)879432758 ^ (long)879432905)) / Float.intBitsToFloat((int)((long)231892320 ^ (long)1319986528))).endVertex();
        bufferBuilder.pos(d, d4, 0.0).color((float)(n >> (((int)-1930141259L ^ 0x8CF461B4) << 4) & (int)((long)1126466806 ^ (long)1126466569)) / Float.intBitsToFloat((int)((long)1342551133 ^ (long)326808669)), (float)(n >> ((int)((long)-161115394 ^ (long)-161115393) << 3) & ((int)-1308095857L ^ 0xB2080A70)) / Float.intBitsToFloat((int)((long)2134579864 ^ (long)1011096216)), (float)(n & (int)((long)1807951560 ^ (long)1807951415)) / Float.intBitsToFloat((int)((long)266637616 ^ (long)1285263664)), (float)(n >> (((int)-779101974L ^ 0xD18FD8E9) << 3) & ((int)-1588409180L ^ 0xA152CC5B)) / Float.intBitsToFloat(0x1BA608E7 ^ 0x58D908E7)).endVertex();
        bufferBuilder.pos(d3, d4, 0.0).color((float)(n2 >> (((int)-69977132L ^ 0xFBD43BD7) << 3) & ((int)114690673L ^ 0x6D60A8E)) / Float.intBitsToFloat((int)((long)30676372 ^ (long)1118508436)), (float)(n2 >> ((int)((long)-1783765398 ^ (long)-1783765397) << 4) & ((int)-1692984346L ^ 0x9B171B19)) / Float.intBitsToFloat((int)190713691L ^ 0x48210F5B), (float)(n2 >> ((int)((long)-1611648392 ^ (long)-1611648391) << 3) & (int)((long)1836385655 ^ (long)1836385672)) / Float.intBitsToFloat((int)((long)1862372668 ^ (long)746491196)), (float)(n2 >> (((int)405392948L ^ 0x1829CE37) << 3) & ((int)-1885978935L ^ 0x8F963E36)) / Float.intBitsToFloat((int)((long)265991296 ^ (long)1285928064))).endVertex();
        tessellator.draw();
        GlStateManager.shadeModel((int)((int)((long)1096412397 ^ (long)1096412400) << 8));
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void drawRoundedRect(double d, double d2, double d3, double d4, Color color, double d5) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect((double)((float)d) - d5, (double)((float)d2) - d5, (double)((float)d3) + d5, (double)((float)d4) + d5, color.getRGB(), null.Field11787.Method368());
    }

    public static void drawRoundedRect(double d, double d2, double d3, double d4, int n, float f) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect((float)d, (float)d2, (float)d3, (float)d4, n, f);
    }

    public static void drawBlur(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        GL11.glPushMatrix();
        GL11.glEnable((int)((int)((long)819822879 ^ (long)819823854) << 1));
        GL11.glDisable((int)((int)((long)826001618 ^ (long)826001661) << 6));
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8314.Method783();
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8314.Method783();
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8314.Method784("sampler", (int)-1578263731L ^ 0xA1ED9B4D);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8314.Method785("radius", f5);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8314.Method785("radiusFactor", f6);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8314.Method786("direction", f7, f8);
        GL11.glBegin((int)((int)1989917077L ^ 0x769BB992));
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8314.Method789();
        GL11.glEnable((int)(((int)1236713809L ^ 0x49B6C17E) << 6));
        GL11.glDisable((int)((int)((long)155078911 ^ (long)155079950) << 1));
        GL11.glPopMatrix();
    }

    public static void drawRoundedRect1(float f, float f2, float f3, float f4, int n, float f5, float f6) {
        GL11.glPushMatrix();
        GL11.glEnable((int)(((int)1041257319L ^ 0x3E105696) << 1));
        GL11.glDisable((int)((int)((long)1033469181 ^ (long)1033469138) << 6));
        float f7 = (float)(n >> (((int)-1049613917L ^ 0xC17029A0) << 3) & ((int)1768886664L ^ 0x696F1177)) / Float.intBitsToFloat((int)1604595245L ^ 0x1CDB2E2D);
        float f8 = (float)(n >> (((int)-1698786897L ^ 0x9ABE91AE) << 4) & (int)((long)1048598507 ^ (long)1048598292)) / Float.intBitsToFloat((int)327303217L ^ 0x50FD4031);
        float f9 = (float)(n >> ((int)((long)-699409141 ^ (long)-699409142) << 3) & (int)((long)-1222786369 ^ (long)-1222786496)) / Float.intBitsToFloat(0x3A755CA9 ^ 0x790A5CA9);
        float f10 = (float)(n & (int)((long)174341236 ^ (long)174341259)) / Float.intBitsToFloat((int)((long)1481170888 ^ (long)456646600));
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8313.Method783();
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8313.Method783();
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8313.Method788("color", f8, f9, f10, f7);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8313.Method786("resolution", agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3707().getScaledWidth(), agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3707().getScaledHeight());
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8313.Method786("center", (f + (f3 - f) / 2.0f) * 2.0f, (f2 + (f4 - f2) / 2.0f) * 2.0f);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8313.Method786("dst", (f3 - f - f5) * 2.0f, (f4 - f2 - f5) * 2.0f);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8313.Method785("radius", f5);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8313.Method785("alphaFactor", f6);
        GL11.glBegin((int)((int)1036636198L ^ 0x3DC9D021));
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8313.Method789();
        GL11.glEnable((int)(((int)137789911L ^ 0x83681F8) << 6));
        GL11.glDisable((int)(((int)441451942L ^ 0x1A500057) << 1));
        GL11.glPopMatrix();
    }

    public static void drawRoundedRect(float f, float f2, float f3, float f4, int n, float f5) {
        GL11.glPushMatrix();
        GL11.glEnable((int)(((int)270790536L ^ 0x1023EA79) << 1));
        GL11.glDisable((int)((int)((long)1663887391 ^ (long)1663887408) << 6));
        float f6 = (float)(n >> (((int)-1267384213L ^ 0xB4754068) << 3) & (int)((long)-256986293 ^ (long)-256986188)) / Float.intBitsToFloat((int)((long)76182148 ^ (long)1207267972));
        float f7 = (float)(n >> (((int)941316267L ^ 0x381B58AA) << 4) & ((int)-393220773L ^ 0xE88FEDA4)) / Float.intBitsToFloat((int)((long)1431173647 ^ (long)372439567));
        float f8 = (float)(n >> (((int)-1748638271L ^ 0x97C5E5C0) << 3) & ((int)-749267001L ^ 0xD3571738)) / Float.intBitsToFloat((int)((long)271025201 ^ (long)1398309937));
        float f9 = (float)(n & ((int)1908215339L ^ 0x71BD0ED4)) / Float.intBitsToFloat((int)1226851306L ^ 0xA5F43EA);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method783();
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method788("color", f7, f8, f9, f6);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method786("resolution", agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3707().getScaledWidth(), agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3707().getScaledHeight());
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method786("center", (f + (f3 - f) / 2.0f) * 2.0f, (f2 + (f4 - f2) / 2.0f) * 2.0f);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method786("dst", (f3 - f - f5) * 2.0f, (f4 - f2 - f5) * 2.0f);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method785("radius", f5);
        GL11.glBegin((int)((int)((long)-1587996062 ^ (long)-1587996059)));
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method789();
        GL11.glEnable((int)((int)((long)1772478618 ^ (long)1772478645) << 6));
        GL11.glDisable((int)(((int)-1131069677L ^ 0xBC953AE2) << 1));
        GL11.glPopMatrix();
    }

    public static void drawRoundedRect(float f, float f2, float f3, float f4, int n) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect(f, f2, f3, f4, n, null.Field11787.Method368());
    }

    public static void drawRoundedRect2(double d, double d2, double d3, double d4, double d5, int n) {
        double d6 = d + d3;
        double d7 = d2 + d4;
        float f = (float)(n >> ((int)((long)1098405759 ^ (long)1098405756) << 3) & ((int)-1713515866L ^ 0x99DDD259)) / Float.intBitsToFloat((int)509475479L ^ 0x5D22FA97);
        float f2 = (float)(n >> ((int)((long)-1931563913 ^ (long)-1931563914) << 4) & (int)((long)687245982 ^ (long)687245921)) / Float.intBitsToFloat((int)((long)295049243 ^ (long)1391007771));
        float f3 = (float)(n >> ((int)((long)1736874554 ^ (long)1736874555) << 3) & (int)((long)-1782216920 ^ (long)-1782216745)) / Float.intBitsToFloat((int)((long)378071821 ^ (long)1442310925));
        float f4 = (float)(n & (int)((long)-1824157230 ^ (long)-1824157395)) / Float.intBitsToFloat((int)((long)627799094 ^ (long)1712616502));
        GL11.glPushAttrib((int)((int)((long)-606323737 ^ (long)-606323737)));
        GL11.glScaled((double)Double.longBitsToDouble((long)106440160 ^ 0x3FE00000065825E0L), (double)Double.longBitsToDouble(0xDB513B168A85B089L ^ 0xE4B13B168A85B089L), (double)Double.longBitsToDouble(0x4DC5E7078BACDC9DL ^ 0x7225E7078BACDC9DL));
        GlStateManager.enableBlend();
        d *= Double.longBitsToDouble((long)510438070 ^ 0x400000001E6CAAB6L);
        d2 *= Double.longBitsToDouble(0x545C7E93F6B57E4AL ^ 0x145C7E93F6B57E4AL);
        d6 *= Double.longBitsToDouble((long)134086833 ^ 0x4000000007FE00B1L);
        d7 *= Double.longBitsToDouble((long)1910444776 ^ 0x4000000071DF12E8L);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glDisable((int)((int)-1657528414L ^ 0x9D341243));
        GL11.glEnable((int)(((int)-1380215780L ^ 0xADBB9445) << 5));
        GL11.glBegin((int)((int)-1223621374L ^ 0xB711050B));
        int n2 = (int)((long)846978367 ^ (long)846978367);
        while (true) {
            int cfr_ignored_0 = (int)((long)-1604641645 ^ (long)-1604641602) << 1;
            GL11.glVertex2d((double)(d + d5 + Math.sin((double)n2 * Double.longBitsToDouble((long)2013101475 ^ 0x400921FB23B950BBL) / Double.longBitsToDouble(0xBF2EF0601697A914L ^ 0xFF4870601697A914L)) * d5 * Double.longBitsToDouble(0x9ACDC305A188C414L ^ 0x253DC305A188C414L)), (double)(d2 + d5 + Math.cos((double)n2 * Double.longBitsToDouble((long)502350088 ^ 0x400921FB49B56C10L) / Double.longBitsToDouble((long)674551742 ^ 0x406680002834D7BEL)) * d5 * Double.longBitsToDouble(0x9AEF518D716041A3L ^ 0x251F518D716041A3L)));
            n2 += 3;
        }
    }

    public static void drawRoundedRect(double d, double d2, double d3, double d4, Color color) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect((float)d, (float)d2, (float)d3, (float)d4, color.getRGB(), null.Field11787.Method368());
    }

    public static void drawShadowSliders(double d, double d2, double d3, double d4, int n, double d5) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawGradientRect(d, d2, d + d3, d2 + d4, n, Color.BLACK.getRGB());
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawOutlineRect(d, d2, d + d3, d2 + d4, d5, n);
    }

    public static void drawOutlineRect(double d, double d2, double d3, double d4, double d5, int n) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2, d3, d2 + d5, n);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d4 - d5, d3, d4, n);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2, d + d5, d4, n);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d3 - d5, d2, d3, d4, n);
    }

    public static void drawGradientRect(double d, double d2, double d3, double d4, int n, int n2) {
        float f = (float)(n >> (((int)2139250974L ^ 0x7F82611D) << 3) & ((int)1823763190L ^ 0x6CB46A09)) / Float.intBitsToFloat((int)508452269L ^ 0x5D315DAD);
        float f2 = (float)(n >> (((int)558074135L ^ 0x21438916) << 4) & ((int)-1346392372L ^ 0xAFBFAE33)) / Float.intBitsToFloat((int)((long)758494587 ^ (long)1850389883));
        float f3 = (float)(n >> (((int)-1125633372L ^ 0xBCE832A5) << 3) & (int)((long)1416907451 ^ (long)1416907332)) / Float.intBitsToFloat((int)((long)1973751392 ^ (long)920260192));
        float f4 = (float)(n & ((int)1822730009L ^ 0x6CA4A7E6)) / Float.intBitsToFloat((int)((long)597464688 ^ (long)1625527920));
        float f5 = (float)(n2 >> ((int)((long)-36467892 ^ (long)-36467889) << 3) & ((int)435313989L ^ 0x19F25DBA)) / Float.intBitsToFloat(0x5A990C6B ^ 0x19E60C6B);
        float f6 = (float)(n2 >> (((int)1144841658L ^ 0x443CE5BB) << 4) & (int)((long)254853047 ^ (long)254852936)) / Float.intBitsToFloat(0x656A0236 ^ 0x26150236);
        float f7 = (float)(n2 >> (((int)386522041L ^ 0x1709DBB8) << 3) & ((int)-1896696098L ^ 0x8EF2B621)) / Float.intBitsToFloat((int)1909315020L ^ 0x32B2D5CC);
        float f8 = (float)(n2 & (int)((long)979951610 ^ (long)979951365)) / Float.intBitsToFloat(0x18CC67D ^ 0x42F3C67D);
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel((int)((int)((long)1409830341 ^ (long)1409831108)));
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)((long)-1765970880 ^ (long)-1765970873), DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(d3, d2, (double)hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.Field11203.zLevel).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(d, d2, (double)hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.Field11203.zLevel).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(d, d4, (double)hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.Field11203.zLevel).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(d3, d4, (double)hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.Field11203.zLevel).color(f6, f7, f8, f5).endVertex();
        tessellator.draw();
        GlStateManager.shadeModel((int)(((int)-809543094L ^ 0xCFBF5A57) << 8));
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
    }

    public static void drawTexturedRect(float f, float f2, float f3, float f4) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawTexturedRect(f, f2, f3, f4, 0.0f, 1.0f, 0.0f, 1.0f);
    }

    public static void drawTexturedRect(float f, float f2, float f3, float f4, int n) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawTexturedRect(f, f2, f3, f4, 0.0f, 1.0f, 0.0f, 1.0f, n);
    }

    public static void drawTexturedRect(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawTexturedRect(f, f2, f3, f4, f5, f6, f7, f8, ((int)511604392L ^ 0x1E7E76BB) << 9);
    }

    public static void drawTexturedRect(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        GlStateManager.enableBlend();
        GL14.glBlendFuncSeparate((int)(((int)1340384999L ^ 0x4FE4A766) << 1), (int)((int)((long)902397918 ^ (long)902397149)), (int)((int)((long)190112578 ^ (long)190112579)), (int)((int)((long)916894046 ^ (long)916894301)));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawTexturedRectNoBlend(f, f2, f3, f4, f5, f6, f7, f8, n);
        GlStateManager.disableBlend();
    }

    public static void drawTexturedRectNoBlend(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        GlStateManager.enableTexture2D();
        GL11.glTexParameteri((int)((int)384124342L ^ 0x16E54857), (int)((int)-289274560L ^ 0xEEC22D41), (int)n);
        GL11.glTexParameteri((int)((int)((long)2143642234 ^ (long)2143645595)), (int)(((int)-1038533215L ^ 0xC2193DA4) << 11), (int)n);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)-1624606517L ^ 0x9F2A78CC, DefaultVertexFormats.POSITION_TEX);
        bufferBuilder.pos((double)f, (double)(f2 + f4), 0.0).tex((double)f5, (double)f8).endVertex();
        bufferBuilder.pos((double)(f + f3), (double)(f2 + f4), 0.0).tex((double)f6, (double)f8).endVertex();
        bufferBuilder.pos((double)(f + f3), (double)f2, 0.0).tex((double)f6, (double)f7).endVertex();
        bufferBuilder.pos((double)f, (double)f2, 0.0).tex((double)f5, (double)f7).endVertex();
        tessellator.draw();
        GL11.glTexParameteri((int)((int)((long)1768590958 ^ (long)1768588175)), (int)((int)((long)-1349869729 ^ (long)-1349863586)), (int)(((int)1863927542L ^ 0x6F1946E5) << 9));
        GL11.glTexParameteri((int)((int)-211271606L ^ 0xF3684DAB), (int)(((int)-142404881L ^ 0xF78312EA) << 11), (int)(((int)1717141361L ^ 0x66597F62) << 9));
    }

    public static void drawBorderedRect(double d, double d2, double d3, double d4, float f, int n, int n2) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2, d + d3, d2 + d4, n2);
        float f2 = (float)(n >> ((int)((long)1531879076 ^ (long)1531879079) << 3) & ((int)1599894094L ^ 0x5F5C72B1)) / Float.intBitsToFloat((int)((long)1084547591 ^ (long)64741895));
        float f3 = (float)(n >> ((int)((long)1953062975 ^ (long)1953062974) << 4) & ((int)1244798723L ^ 0x4A321FFC)) / Float.intBitsToFloat(0x6CFC92BC ^ 0x2F8392BC);
        float f4 = (float)(n >> (((int)2001821988L ^ 0x77516125) << 3) & ((int)1861084856L ^ 0x6EEDE647)) / Float.intBitsToFloat((int)((long)1686371896 ^ (long)670891576));
        float f5 = (float)(n & (int)((long)-698654461 ^ (long)-698654212)) / Float.intBitsToFloat(0x4FD7C247 ^ 0xCA8C247);
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)((int)2108802657L ^ 0x7DBE399E));
        GL11.glEnable((int)(((int)591195785L ^ 0x233CEB78) << 1));
        GL11.glDisable((int)(((int)-672198195L ^ 0xD7EF131C) << 2));
        GL11.glDisable((int)((int)-738802285L ^ 0xD3F6C872));
        GL11.glColor4f((float)f3, (float)f4, (float)f5, (float)f2);
        GL11.glLineWidth((float)f);
        GL11.glEnable((int)(((int)1220933829L ^ 0x48C5F89C) << 5));
        GL11.glBegin((int)((int)((long)-1019754408 ^ (long)-1019754407)));
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)(d + d3), (double)d2);
        GL11.glVertex2d((double)(d + d3), (double)d2);
        GL11.glVertex2d((double)(d + d3), (double)(d2 + d4));
        GL11.glVertex2d((double)(d + d3), (double)(d2 + d4));
        GL11.glVertex2d((double)d, (double)(d2 + d4));
        GL11.glVertex2d((double)d, (double)(d2 + d4));
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glEnd();
        GL11.glEnable((int)((int)1190034794L ^ 0x46EE708B));
        GL11.glEnable((int)(((int)511396974L ^ 0x1E7B4EBF) << 2));
        GL11.glDisable((int)(((int)898453702L ^ 0x358D5537) << 1));
        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }

    public static boolean isHovered(double d, double d2, double d3, double d4, double d5, double d6) {
        int n;
        if (d >= d3 && d - d5 <= d3 && d2 >= d4 && d2 - d6 <= d4) {
            n = (int)((long)346104501 ^ (long)346104500);
            return n != 0;
        }
        n = (int)((long)1658977234 ^ (long)1658977234);
        return n != 0;
    }

    public static void startScissor(double d, double d2, double d3, double d4) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.startScissor(d, d2, d3, d4, 1.0);
    }

    public static void startScissor(double d, double d2, double d3, double d4, double d5) {
        ScaledResolution scaledResolution = new ScaledResolution(Field11204);
        double d6 = (double)hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.Field11204.displayWidth / scaledResolution.getScaledWidth_double();
        double d7 = (double)hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.Field11204.displayHeight / scaledResolution.getScaledHeight_double();
        GL11.glScissor((int)((int)(d * (d6 *= d5))), (int)(hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.Field11204.displayHeight - (int)((d2 + d4) * (d7 *= d5))), (int)((int)(d3 * d6)), (int)((int)(d4 * d7)));
        GL11.glEnable((int)((int)-1623082602L ^ 0x9F41B587));
    }

    public static void stopScissor() {
        GL11.glDisable((int)((int)((long)-1886774794 ^ (long)-1886775833)));
    }

    public static void glColor(int n) {
        float f = (float)(n >> ((int)((long)-1671344367 ^ (long)-1671344366) << 3) & (int)((long)1075792487 ^ (long)1075792536)) / Float.intBitsToFloat((int)((long)1446814727 ^ (long)356754439));
        float f2 = (float)(n >> ((int)((long)401435752 ^ (long)401435753) << 4) & ((int)-91615737L ^ 0xFA8A0EF8)) / Float.intBitsToFloat((int)((long)950707971 ^ (long)2077599491));
        float f3 = (float)(n >> ((int)((long)236072683 ^ (long)236072682) << 3) & ((int)-1414883249L ^ 0xABAA98B0)) / Float.intBitsToFloat((int)((long)505513251 ^ (long)1566475555));
        float f4 = (float)(n & (int)((long)627187942 ^ (long)627187737)) / Float.intBitsToFloat((int)74931226L ^ 0x47085C1A);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static void drawArrow(double d, double d2, double d3, double d4, double d5, int n) {
        double d6 = d5 / (d4 * Double.longBitsToDouble(0x6FC017848124B91BL ^ 0x502017848124B91BL));
        double d7 = d2 + d6 * (d4 * Double.longBitsToDouble((long)584108328 ^ 0x3FE0000022D0C928L) - d3);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.glColor(n);
        bufferBuilder.begin((int)((long)1564418775 ^ (long)1564418768), DefaultVertexFormats.POSITION);
        bufferBuilder.pos(d, d2, 0.0);
        bufferBuilder.pos(d + d3, d2, 0.0);
        bufferBuilder.pos(d + d4 * Double.longBitsToDouble(0xA6BA02A4523A10EEL ^ 0x995A02A4523A10EEL), d7, 0.0);
        bufferBuilder.pos(d + d4 * Double.longBitsToDouble(0xC75307FFC1439CA3L ^ 0xF8B307FFC1439CA3L), d2 + d5, 0.0);
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
        int n = (int)-280676089L ^ 0xEF453907;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1808303265 ^ (long)-1808303200);
            int n2 = (int)((long)-346449406 ^ (long)-346449197);
            cArray2[n] = (char)(cArray[n] ^ (((int)1131081854L ^ 0x436AE671) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

