//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.RenderItem
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemStack;

public class q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV {
    private static final RenderItem Field17378 = Minecraft.getMinecraft().getRenderItem();
    private String Field17379 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method7538(TextureManager textureManager, ItemStack itemStack, int n, int n2) {
        q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV.Method7539(textureManager, n, n2);
        if (itemStack == null) return;
        if (itemStack.getItem() == null) return;
        q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV.Method7540(itemStack, n + ((int)((long)1473407255 ^ (long)1473407254) << 1), n2 + (((int)-653695285L ^ 0xD90966CA) << 1));
    }

    public static void Method7539(TextureManager textureManager, int n, int n2) {
        textureManager.bindTexture(Gui.STAT_ICONS);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        double d = Double.longBitsToDouble((long)1844788983 ^ 0x3F8000006DF53EF7L);
        double d2 = Double.longBitsToDouble((long)1146867593 ^ 0x3F800000445BCF89L);
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bufferBuilder.begin((int)-1980502268L ^ 0x89F3EF03, DefaultVertexFormats.POSITION_TEX);
        q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV.Method7541(bufferBuilder, n + (int)((long)-461865461 ^ (long)-461865462), n2 + ((int)-1766338765L ^ 0x96B7CF32), n + (int)((long)-210845124 ^ (long)-210845123) + ((int)((long)-1032621494 ^ (long)-1032621501) << 1), n2 + ((int)-1763898483L ^ 0x96DD0B8C) + (((int)178425986L ^ 0xAA2908B) << 1), 0.0, 0.0, 0.0, Double.longBitsToDouble((long)878304571 ^ 0x3FC200003459DD3BL), Double.longBitsToDouble(0x7B651DE921CD258BL ^ 0x44A71DE921CD258BL));
        tessellator.draw();
    }

    public static void Method7540(ItemStack itemStack, int n, int n2) {
        GlStateManager.enableRescaleNormal();
        RenderHelper.enableGUIStandardItemLighting();
        Field17378.renderItemIntoGUI(itemStack, n, n2);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
    }

    public static void Method7541(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        bufferBuilder.pos(d, d2, d5).tex(d6, d7).endVertex();
        bufferBuilder.pos(d, d4, d5).tex(d6, d9).endVertex();
        bufferBuilder.pos(d3, d4, d5).tex(d8, d9).endVertex();
        bufferBuilder.pos(d3, d2, d5).tex(d8, d7).endVertex();
    }

    public static void Method7542(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, double d7, int n) {
        double d8 = d / d6;
        double d9 = d2 / d7;
        double d10 = d3 / d6;
        double d11 = d4 / d7;
        q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV.Method7543(bufferBuilder, d, d2, d3, d4, d5, d8, d9, d10, d11, n);
    }

    public static void Method7543(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int n) {
        int n2 = n >> ((int)((long)550133758 ^ (long)550133757) << 3) & (int)((long)-335953939 ^ (long)-335954158);
        int n3 = n >> (((int)937444115L ^ 0x37E04312) << 4) & ((int)-492159584L ^ 0xE2AA3D5F);
        int n4 = n >> (((int)-950064053L ^ 0xC75F2C4A) << 3) & (int)((long)-766316471 ^ (long)-766316362);
        int n5 = n & ((int)1470269960L ^ 0x57A28AF7);
        q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV.Method7544(bufferBuilder, d, d2, d3, d4, d5, d6, d7, d8, d9, n3, n4, n5, n2);
    }

    public static void Method7544(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int n, int n2, int n3, int n4) {
        bufferBuilder.pos(d, d2, d5).tex(d6, d7).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d, d4, d5).tex(d6, d9).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d3, d4, d5).tex(d8, d9).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d3, d2, d5).tex(d8, d7).color(n, n2, n3, n4).endVertex();
    }

    public static void Method7545(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, int n) {
        int n2 = n >> (((int)979846621L ^ 0x3A6745DE) << 3) & ((int)27154389L ^ 0x19E572A);
        int n3 = n >> (((int)-699788050L ^ 0xD64A14EF) << 4) & (int)((long)835685263 ^ (long)835685232);
        int n4 = n >> ((int)((long)-682310327 ^ (long)-682310328) << 3) & ((int)-1779117289L ^ 0x95F4D3E8);
        int n5 = n & ((int)683909026L ^ 0x28C39F5D);
        q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV.Method7546(bufferBuilder, d, d2, d3, d4, d5, n3, n4, n5, n2);
    }

    public static void Method7546(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, int n, int n2, int n3, int n4) {
        bufferBuilder.pos(d, d2, d5).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d, d4, d5).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d3, d4, d5).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d3, d2, d5).color(n, n2, n3, n4).endVertex();
    }

    public static void Method7547(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, int n, int n2) {
        int n3 = n >> ((int)((long)175855158 ^ (long)175855157) << 3) & ((int)-544559311L ^ 0xDF8AAFCE);
        int n4 = n >> (((int)1331883531L ^ 0x4F62EE0A) << 4) & (int)((long)1102088520 ^ (long)1102088631);
        int n5 = n >> ((int)((long)-405437324 ^ (long)-405437323) << 3) & ((int)-464211490L ^ 0xE454B121);
        int n6 = n & ((int)804238066L ^ 0x2FEFB20D);
        int n7 = n2 >> (((int)-1763682439L ^ 0x96E0577A) << 3) & ((int)-1813350175L ^ 0x93EA781E);
        int n8 = n2 >> ((int)((long)392963640 ^ (long)392963641) << 4) & ((int)-769924882L ^ 0xD21BE011);
        int n9 = n2 >> (((int)-1528042605L ^ 0xA4EBEB92) << 3) & (int)((long)1532087615 ^ (long)1532087744);
        int n10 = n2 & ((int)-1951109892L ^ 0x8BB46C03);
        q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV.Method7548(bufferBuilder, d, d2, d3, d4, d5, n4, n5, n6, n3, n8, n9, n10, n7);
    }

    public static void Method7548(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        bufferBuilder.pos(d, d2, d5).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d, d4, d5).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(d3, d4, d5).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(d3, d2, d5).color(n, n2, n3, n4).endVertex();
    }

    public static void Method7549(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, int n, int n2) {
        int n3 = n >> (((int)-1957001174L ^ 0x8B5A8829) << 3) & ((int)-489811713L ^ 0xE2CE1000);
        int n4 = n >> ((int)((long)628551234 ^ (long)628551235) << 4) & (int)((long)-182187125 ^ (long)-182187148);
        int n5 = n >> ((int)((long)-2115042339 ^ (long)-2115042340) << 3) & ((int)-340049768L ^ 0xEBBB4067);
        int n6 = n & (int)((long)1587671697 ^ (long)1587671662);
        int n7 = n2 >> ((int)((long)393459878 ^ (long)393459877) << 3) & (int)((long)1367880124 ^ (long)1367880003);
        int n8 = n2 >> (((int)-1279099814L ^ 0xB3C27C5B) << 4) & ((int)330660132L ^ 0x13B579DB);
        int n9 = n2 >> ((int)((long)419260065 ^ (long)419260064) << 3) & (int)((long)-1284866049 ^ (long)-1284866304);
        int n10 = n2 & (int)((long)-1957665538 ^ (long)-1957665791);
        q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV.Method7550(bufferBuilder, d, d2, d3, d4, d5, n4, n5, n6, n3, n8, n9, n10, n7);
    }

    public static void Method7550(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        bufferBuilder.pos(d, d2, d5).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d, d4, d5).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d3, d4, d5).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(d3, d2, d5).color(n5, n6, n7, n8).endVertex();
    }
}

