//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.renderer.texture.*;
import net.minecraft.item.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.*;

public class Class2042
{
    private static final RenderItem Field17378;
    private String Field17379 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method7538(final TextureManager textureManager, final ItemStack itemStack, final int n, final int n2) {
        Method7539(textureManager, n, n2);
        if (itemStack != null && itemStack.getItem() != null) {
            Method7540(itemStack, n + 2, n2 + 2);
        }
    }
    
    public static void Method7539(final TextureManager textureManager, final int n, final int n2) {
        textureManager.bindTexture(Gui.STAT_ICONS);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        Double.longBitsToDouble((long)1844788983 ^ 0x3F8000006DF53EF7L);
        Double.longBitsToDouble((long)1146867593 ^ 0x3F800000445BCF89L);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        getBuffer.begin(7, DefaultVertexFormats.POSITION_TEX);
        Method7541(getBuffer, n + 1, n2 + 1, n + 1 + 18, n2 + 1 + 18, 0.0, 0.0, 0.0, Double.longBitsToDouble((long)878304571 ^ 0x3FC200003459DD3BL), Double.longBitsToDouble(4594234569871327232L));
        getInstance.draw();
    }
    
    public static void Method7540(final ItemStack itemStack, final int n, final int n2) {
        GlStateManager.enableRescaleNormal();
        RenderHelper.enableGUIStandardItemLighting();
        Class2042.Field17378.renderItemIntoGUI(itemStack, n, n2);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
    }
    
    public static void Method7541(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final double n8, final double n9) {
        bufferBuilder.pos(n, n2, n5).tex(n6, n7).endVertex();
        bufferBuilder.pos(n, n4, n5).tex(n6, n9).endVertex();
        bufferBuilder.pos(n3, n4, n5).tex(n8, n9).endVertex();
        bufferBuilder.pos(n3, n2, n5).tex(n8, n7).endVertex();
    }
    
    public static void Method7542(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final int n8) {
        Method7543(bufferBuilder, n, n2, n3, n4, n5, n / n6, n2 / n7, n3 / n6, n4 / n7, n8);
    }
    
    public static void Method7543(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final double n8, final double n9, final int n10) {
        Method7544(bufferBuilder, n, n2, n3, n4, n5, n6, n7, n8, n9, n10 >> 16 & 0xFF, n10 >> 8 & 0xFF, n10 & 0xFF, n10 >> 24 & 0xFF);
    }
    
    public static void Method7544(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final double n8, final double n9, final int n10, final int n11, final int n12, final int n13) {
        bufferBuilder.pos(n, n2, n5).tex(n6, n7).color(n10, n11, n12, n13).endVertex();
        bufferBuilder.pos(n, n4, n5).tex(n6, n9).color(n10, n11, n12, n13).endVertex();
        bufferBuilder.pos(n3, n4, n5).tex(n8, n9).color(n10, n11, n12, n13).endVertex();
        bufferBuilder.pos(n3, n2, n5).tex(n8, n7).color(n10, n11, n12, n13).endVertex();
    }
    
    public static void Method7545(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final int n6) {
        Method7546(bufferBuilder, n, n2, n3, n4, n5, n6 >> 16 & 0xFF, n6 >> 8 & 0xFF, n6 & 0xFF, n6 >> 24 & 0xFF);
    }
    
    public static void Method7546(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final int n6, final int n7, final int n8, final int n9) {
        bufferBuilder.pos(n, n2, n5).color(n6, n7, n8, n9).endVertex();
        bufferBuilder.pos(n, n4, n5).color(n6, n7, n8, n9).endVertex();
        bufferBuilder.pos(n3, n4, n5).color(n6, n7, n8, n9).endVertex();
        bufferBuilder.pos(n3, n2, n5).color(n6, n7, n8, n9).endVertex();
    }
    
    public static void Method7547(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final int n6, final int n7) {
        Method7548(bufferBuilder, n, n2, n3, n4, n5, n6 >> 16 & 0xFF, n6 >> 8 & 0xFF, n6 & 0xFF, n6 >> 24 & 0xFF, n7 >> 16 & 0xFF, n7 >> 8 & 0xFF, n7 & 0xFF, n7 >> 24 & 0xFF);
    }
    
    public static void Method7548(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13) {
        bufferBuilder.pos(n, n2, n5).color(n6, n7, n8, n9).endVertex();
        bufferBuilder.pos(n, n4, n5).color(n10, n11, n12, n13).endVertex();
        bufferBuilder.pos(n3, n4, n5).color(n10, n11, n12, n13).endVertex();
        bufferBuilder.pos(n3, n2, n5).color(n6, n7, n8, n9).endVertex();
    }
    
    public static void Method7549(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final int n6, final int n7) {
        Method7550(bufferBuilder, n, n2, n3, n4, n5, n6 >> 16 & 0xFF, n6 >> 8 & 0xFF, n6 & 0xFF, n6 >> 24 & 0xFF, n7 >> 16 & 0xFF, n7 >> 8 & 0xFF, n7 & 0xFF, n7 >> 24 & 0xFF);
    }
    
    public static void Method7550(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13) {
        bufferBuilder.pos(n, n2, n5).color(n6, n7, n8, n9).endVertex();
        bufferBuilder.pos(n, n4, n5).color(n6, n7, n8, n9).endVertex();
        bufferBuilder.pos(n3, n4, n5).color(n10, n11, n12, n13).endVertex();
        bufferBuilder.pos(n3, n2, n5).color(n10, n11, n12, n13).endVertex();
    }
    
    static {
        Field17378 = Minecraft.getMinecraft().getRenderItem();
    }
}
