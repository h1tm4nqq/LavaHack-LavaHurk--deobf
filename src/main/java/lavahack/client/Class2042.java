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

public class Class2042 {
    private static final RenderItem Field17378 = Minecraft.getMinecraft().getRenderItem();
    private String Field17379 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method7538(TextureManager textureManager, ItemStack itemStack, int n, int n2) {
        Class2042.Method7539(textureManager, n, n2);
        if (itemStack == null) return;
        if (itemStack.getItem() == null) return;
        Class2042.Method7540(itemStack, n + 2, n2 + 2);
    }

    public static void Method7539(TextureManager textureManager, int n, int n2) {
        textureManager.bindTexture(Gui.STAT_ICONS);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        double d = Double.longBitsToDouble((long)1844788983 ^ 0x3F8000006DF53EF7L);
        double d2 = Double.longBitsToDouble((long)1146867593 ^ 0x3F800000445BCF89L);
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        Class2042.Method7541(bufferBuilder, n + 1, n2 + 1, n + 1 + 18, n2 + 1 + 18, 0.0, 0.0, 0.0, Double.longBitsToDouble((long)878304571 ^ 0x3FC200003459DD3BL), Double.longBitsToDouble(4594234569871327232L));
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
        Class2042.Method7543(bufferBuilder, d, d2, d3, d4, d5, d8, d9, d10, d11, n);
    }

    public static void Method7543(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int n) {
        int n2 = n >> 24 & 0xFF;
        int n3 = n >> 16 & 0xFF;
        int n4 = n >> 8 & 0xFF;
        int n5 = n & 0xFF;
        Class2042.Method7544(bufferBuilder, d, d2, d3, d4, d5, d6, d7, d8, d9, n3, n4, n5, n2);
    }

    public static void Method7544(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int n, int n2, int n3, int n4) {
        bufferBuilder.pos(d, d2, d5).tex(d6, d7).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d, d4, d5).tex(d6, d9).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d3, d4, d5).tex(d8, d9).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d3, d2, d5).tex(d8, d7).color(n, n2, n3, n4).endVertex();
    }

    public static void Method7545(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, int n) {
        int n2 = n >> 24 & 0xFF;
        int n3 = n >> 16 & 0xFF;
        int n4 = n >> 8 & 0xFF;
        int n5 = n & 0xFF;
        Class2042.Method7546(bufferBuilder, d, d2, d3, d4, d5, n3, n4, n5, n2);
    }

    public static void Method7546(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, int n, int n2, int n3, int n4) {
        bufferBuilder.pos(d, d2, d5).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d, d4, d5).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d3, d4, d5).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d3, d2, d5).color(n, n2, n3, n4).endVertex();
    }

    public static void Method7547(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, int n, int n2) {
        int n3 = n >> 24 & 0xFF;
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n2 >> 24 & 0xFF;
        int n8 = n2 >> 16 & 0xFF;
        int n9 = n2 >> 8 & 0xFF;
        int n10 = n2 & 0xFF;
        Class2042.Method7548(bufferBuilder, d, d2, d3, d4, d5, n4, n5, n6, n3, n8, n9, n10, n7);
    }

    public static void Method7548(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        bufferBuilder.pos(d, d2, d5).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d, d4, d5).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(d3, d4, d5).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(d3, d2, d5).color(n, n2, n3, n4).endVertex();
    }

    public static void Method7549(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, int n, int n2) {
        int n3 = n >> 24 & 0xFF;
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n2 >> 24 & 0xFF;
        int n8 = n2 >> 16 & 0xFF;
        int n9 = n2 >> 8 & 0xFF;
        int n10 = n2 & 0xFF;
        Class2042.Method7550(bufferBuilder, d, d2, d3, d4, d5, n4, n5, n6, n3, n8, n9, n10, n7);
    }

    public static void Method7550(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        bufferBuilder.pos(d, d2, d5).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d, d4, d5).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(d3, d4, d5).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(d3, d2, d5).color(n5, n6, n7, n8).endVertex();
    }
}

