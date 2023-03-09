//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import lavahack.client.Class1240;
import lavahack.client.Class1951;
import lavahack.client.Class2008;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

public class Class815 {
    private static final Minecraft Field11483 = Minecraft.getMinecraft();
    public static Tessellator Field11484 = Tessellator.getInstance();
    public static BufferBuilder Field11485 = Field11484.getBuffer();
    public static final Class2027 Field11486 = new Class2027(0, 0, 0, 0);
    private String Field11487 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method3432(boolean bl) {
        GL11.glPushAttrib((int)1048575);
        GL11.glPushMatrix();
        GL11.glDisable((int)3008);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        if (!bl) {
            GL11.glDisable((int)2929);
        }
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)2884);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4353);
        GL11.glDisable((int)2896);
        GL11.glLineWidth((float)Float.intBitsToFloat(1069547520));
    }

    public static void Method3433() {
        GL11.glPushAttrib((int)1048575);
        GL11.glPushMatrix();
        GL11.glDisable((int)3008);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)2884);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4353);
        GL11.glDisable((int)2896);
        GL11.glLineWidth((float)Float.intBitsToFloat(1069547520));
    }

    public static void Method3434() {
        GL11.glEnable((int)2896);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3008);
        GL11.glDepthMask((boolean)true);
        GL11.glCullFace((int)1029);
        GL11.glPopMatrix();
        GL11.glPopAttrib();
    }

    public static void Method3435(boolean bl) {
        GL11.glEnable((int)2896);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        if (!bl) {
            GL11.glEnable((int)2929);
        }
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3008);
        GL11.glDepthMask((boolean)true);
        GL11.glCullFace((int)1029);
        GL11.glPopMatrix();
        GL11.glPopAttrib();
    }

    public static void Method3436(boolean bl) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        if (!bl) {
            GlStateManager.disableDepth();
        }
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)0, (int)1);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask((boolean)false);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glLineWidth((float)Float.intBitsToFloat(1069547520));
    }

    public static void Method3437() {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)0, (int)1);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask((boolean)false);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glLineWidth((float)Float.intBitsToFloat(1069547520));
    }

    public static void Method3438() {
        GL11.glDisable((int)2848);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.depthMask((boolean)true);
        GlStateManager.enableDepth();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public static void Method3439(boolean bl) {
        GL11.glDisable((int)2848);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.depthMask((boolean)true);
        if (!bl) {
            GlStateManager.enableDepth();
        }
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public static void Method3440() {
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
        GlStateManager.shadeModel((int)7425);
    }

    public static void Method3441() {
        GlStateManager.enableCull();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel((int)7424);
    }

    public static void Method3442(AxisAlignedBB axisAlignedBB, float f, Class2027 class2027, Class2027 class20272, Class2008 class2008) {
        Class815.Method3443(axisAlignedBB, f, class2027, class20272, class2008, false);
    }

    public static void Method3443(AxisAlignedBB axisAlignedBB, float f, Class2027 class2027, Class2027 class20272, Class2008 class2008, boolean bl) {
        Class815.Method3445(axisAlignedBB, f, class2027, class20272, class2027.Method3633(255), class20272.Method3633(255), class2027.Method3633(255), class20272.Method3633(255), class2008, bl);
    }

    public static void Method3444(AxisAlignedBB axisAlignedBB, float f, Class2027 class2027, Class2027 class20272, Class2027 class20273, Class2027 class20274, Class2027 class20275, Class2027 class20276, Class2008 class2008) {
        Class815.Method3445(axisAlignedBB, f, class2027, class20272, class20273, class20274, class20275, class20276, class2008, false);
    }

    public static void Method3445(AxisAlignedBB axisAlignedBB, float f, Class2027 class2027, Class2027 class20272, Class2027 class20273, Class2027 class20274, Class2027 class20275, Class2027 class20276, Class2008 class2008, boolean bl) {
        Color color = class2027.Method3625();
        Color color2 = class20272.Method3625();
        Color color3 = class20273.Method3625();
        Color color4 = class20274.Method3625();
        Color color5 = class20275.Method3625();
        Color color6 = class20276.Method3625();
        class2008.Method7456(axisAlignedBB, color, color2, color3, color4, color5, color6, false, Float.valueOf(f));
    }

    public static void Method3446(AxisAlignedBB axisAlignedBB, float f, Class2027 class2027, Class2027 class20272, Class2008 class2008) {
        Class815.Method3442(axisAlignedBB, f, class2027, class20272, class2008);
    }

    public static AxisAlignedBB Method3447(AxisAlignedBB axisAlignedBB) {
        return new AxisAlignedBB(axisAlignedBB.minX - Class815.Field11483.getRenderManager().viewerPosX, axisAlignedBB.minY - Class815.Field11483.getRenderManager().viewerPosY, axisAlignedBB.minZ - Class815.Field11483.getRenderManager().viewerPosZ, axisAlignedBB.maxX - Class815.Field11483.getRenderManager().viewerPosX, axisAlignedBB.maxY - Class815.Field11483.getRenderManager().viewerPosY, axisAlignedBB.maxZ - Class815.Field11483.getRenderManager().viewerPosZ);
    }

    public static BlockPos Method3448(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = Class815.Method3447(new AxisAlignedBB(blockPos));
        return new BlockPos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ);
    }

    public static AxisAlignedBB Method3449(BlockPos blockPos, double d) {
        double d2 = d * Double.longBitsToDouble(4602678819172646912L);
        double d3 = (double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L) - d2;
        double d4 = (double)blockPos.getY() + Double.longBitsToDouble(4602678819172646912L) - d2;
        double d5 = (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L) - d2;
        double d6 = (double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L) + d2;
        double d7 = (double)blockPos.getY() + Double.longBitsToDouble(4602678819172646912L) + d2;
        double d8 = (double)blockPos.getZ() + Double.longBitsToDouble((long)810961578 ^ 0x3FE0000030564AAAL) + d2;
        return new AxisAlignedBB(d3, d4, d5, d6, d7, d8);
    }

    public static AxisAlignedBB Method3450(AxisAlignedBB axisAlignedBB, double d) {
        double d2 = d * Double.longBitsToDouble((long)403010978 ^ 0x3FE00000180575A2L);
        return new AxisAlignedBB(axisAlignedBB.minX - d2, axisAlignedBB.minY - d2, axisAlignedBB.minZ - d2, axisAlignedBB.maxX + d2, axisAlignedBB.maxY + d2, axisAlignedBB.maxZ + d2);
    }

    public static Class1240 Method3451(Class1240 class1240, Class1240 class12402, float f, float f2) {
        float f3 = f / f2;
        double d = class1240.Field13620 + (class12402.Field13620 - class1240.Field13620) * (double)f3 + (class12402.Field13620 - class12402.Field13617 - (class1240.Field13620 - class1240.Field13617)) * Double.longBitsToDouble(4602678819172646912L) * (double)f3;
        double d2 = class1240.Field13621 + (class12402.Field13621 - class1240.Field13621) * (double)f3 + (class12402.Field13621 - class12402.Field13618 - (class1240.Field13621 - class1240.Field13618)) * Double.longBitsToDouble((long)20690838 ^ 0x3FE00000013BB796L) * (double)f3;
        double d3 = class1240.Field13622 + (class12402.Field13622 - class1240.Field13622) * (double)f3 + (class12402.Field13622 - class12402.Field13619 - (class1240.Field13622 - class1240.Field13619)) * Double.longBitsToDouble(4602678819172646912L) * (double)f3;
        double d4 = class1240.Field13617 + (class12402.Field13620 - class1240.Field13620) * (double)f3 + (class12402.Field13620 - class12402.Field13617 - (class1240.Field13620 - class1240.Field13617)) * Double.longBitsToDouble((long)788819291 ^ 0x3FE000002F046D5BL) * (double)f3;
        double d5 = class1240.Field13618 + (class12402.Field13621 - class1240.Field13621) * (double)f3 + (class12402.Field13621 - class12402.Field13618 - (class1240.Field13621 - class1240.Field13618)) * Double.longBitsToDouble(4602678819172646912L) * (double)f3;
        double d6 = class1240.Field13619 + (class12402.Field13622 - class1240.Field13622) * (double)f3 + (class12402.Field13622 - class12402.Field13619 - (class1240.Field13622 - class1240.Field13619)) * Double.longBitsToDouble(4602678819172646912L) * (double)f3;
        return new Class1240(new AxisAlignedBB(d4, d5, d6, d, d2, d3));
    }

    public static void Method3452(AxisAlignedBB axisAlignedBB, Class2027 class2027, Class2027 class20272, Class2027 class20273) {
        double d = (axisAlignedBB.maxY - axisAlignedBB.minY) * Double.longBitsToDouble(4602678819172646912L);
        AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.minY + d, axisAlignedBB.maxZ);
        AxisAlignedBB axisAlignedBB3 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY + d, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        Class815.Method3433();
        Class815.Method3460(axisAlignedBB2, class2027.Method3625(), class20272.Method3625());
        Class815.Method3460(axisAlignedBB3, class20272.Method3625(), class20273.Method3625());
        Class815.Method3434();
    }

    public static void Method3453(AxisAlignedBB axisAlignedBB, Class2027 class2027, Class2027 class20272, Class2027 class20273) {
        double d = (axisAlignedBB.maxY - axisAlignedBB.minY) * Double.longBitsToDouble((long)1126608360 ^ 0x3FE000004326ADE8L);
        AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.minY + d, axisAlignedBB.maxZ);
        AxisAlignedBB axisAlignedBB3 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY + d, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        Class815.Method3433();
        Class815.Method3454(axisAlignedBB3, class2027.Method3625(), class20272.Method3625());
        Class815.Method3455(axisAlignedBB2, class20272.Method3625(), class20273.Method3625());
        Class815.Method3434();
    }

    public static void Method3454(AxisAlignedBB axisAlignedBB, Color color, Color color2) {
        float f = (float)color2.getAlpha() / Float.intBitsToFloat(1132396544);
        float f2 = (float)color2.getRed() / Float.intBitsToFloat(1132396544);
        float f3 = (float)color2.getGreen() / Float.intBitsToFloat(1132396544);
        float f4 = (float)color2.getBlue() / Float.intBitsToFloat(1132396544);
        float f5 = (float)color.getAlpha() / Float.intBitsToFloat(1132396544);
        float f6 = (float)color.getRed() / Float.intBitsToFloat(1132396544);
        float f7 = (float)color.getGreen() / Float.intBitsToFloat(1132396544);
        float f8 = (float)color.getBlue() / Float.intBitsToFloat(1132396544);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        tessellator.draw();
    }

    public static void Method3455(AxisAlignedBB axisAlignedBB, Color color, Color color2) {
        float f = (float)color2.getAlpha() / Float.intBitsToFloat(1132396544);
        float f2 = (float)color2.getRed() / Float.intBitsToFloat(1132396544);
        float f3 = (float)color2.getGreen() / Float.intBitsToFloat(1132396544);
        float f4 = (float)color2.getBlue() / Float.intBitsToFloat(1132396544);
        float f5 = (float)color.getAlpha() / Float.intBitsToFloat(1132396544);
        float f6 = (float)color.getRed() / Float.intBitsToFloat(1132396544);
        float f7 = (float)color.getGreen() / Float.intBitsToFloat(1132396544);
        float f8 = (float)color.getBlue() / Float.intBitsToFloat(1132396544);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        tessellator.draw();
    }

    public static void Method3456(AxisAlignedBB axisAlignedBB, Color color) {
        Field11485.begin(5, DefaultVertexFormats.POSITION_COLOR);
        Class815.Method3457(Field11485, axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ, color);
        Field11484.draw();
    }

    public static void Method3457(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, Color color) {
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
    }

    public static void Method3458(AxisAlignedBB axisAlignedBB, Color color) {
        Field11485.begin(3, DefaultVertexFormats.POSITION_COLOR);
        Class815.Method3459(Field11485, axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ, color);
        Field11484.draw();
    }

    public static void Method3459(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, Color color) {
        bufferBuilder.pos(d, d2, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d, d5, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4, d2, d6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d5, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(d4, d2, d3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(d4, d2, d3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
    }

    public static void Method3460(AxisAlignedBB axisAlignedBB, Color color, Color color2) {
        float f = (float)color2.getAlpha() / Float.intBitsToFloat(1132396544);
        float f2 = (float)color2.getRed() / Float.intBitsToFloat(1132396544);
        float f3 = (float)color2.getGreen() / Float.intBitsToFloat(1132396544);
        float f4 = (float)color2.getBlue() / Float.intBitsToFloat(1132396544);
        float f5 = (float)color.getAlpha() / Float.intBitsToFloat(1132396544);
        float f6 = (float)color.getRed() / Float.intBitsToFloat(1132396544);
        float f7 = (float)color.getGreen() / Float.intBitsToFloat(1132396544);
        float f8 = (float)color.getBlue() / Float.intBitsToFloat(1132396544);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f).endVertex();
        tessellator.draw();
    }

    public static void Method3461(AxisAlignedBB axisAlignedBB, Color color, Color color2, float f) {
        float f2 = (float)color.getRed() / Float.intBitsToFloat(1132396544);
        float f3 = (float)color.getGreen() / Float.intBitsToFloat(1132396544);
        float f4 = (float)color.getBlue() / Float.intBitsToFloat(1132396544);
        float f5 = (float)color.getAlpha() / Float.intBitsToFloat(1132396544);
        float f6 = (float)color2.getRed() / Float.intBitsToFloat(1132396544);
        float f7 = (float)color2.getGreen() / Float.intBitsToFloat(1132396544);
        float f8 = (float)color2.getBlue() / Float.intBitsToFloat(1132396544);
        float f9 = (float)color2.getAlpha() / Float.intBitsToFloat(1132396544);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f9).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f9).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f9).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f9).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f9).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f9).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(f6, f7, f8, f9).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(f6, f7, f8, f9).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f5).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(f2, f3, f4, f5).endVertex();
        tessellator.draw();
    }

    public static void Method3462(AxisAlignedBB axisAlignedBB, Color color, Color color2, Color color3) {
        double d = (axisAlignedBB.maxY - axisAlignedBB.minY) / Double.longBitsToDouble((long)1513221321 ^ 0x400000005A31ECC9L);
        AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.minY + d, axisAlignedBB.maxZ);
        AxisAlignedBB axisAlignedBB3 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY + d, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        int n = color.getRed();
        int n2 = color.getGreen();
        int n3 = color.getBlue();
        int n4 = color.getAlpha();
        int n5 = color2.getRed();
        int n6 = color2.getGreen();
        int n7 = color2.getBlue();
        int n8 = color2.getAlpha();
        int n9 = color3.getRed();
        int n10 = color3.getGreen();
        int n11 = color3.getBlue();
        int n12 = color3.getAlpha();
        Class815.Method3433();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.maxZ).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.maxZ).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(axisAlignedBB2.maxX, axisAlignedBB2.maxY, axisAlignedBB2.minZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB2.minX, axisAlignedBB2.maxY, axisAlignedBB2.minZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.maxZ).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(axisAlignedBB2.minX, axisAlignedBB2.maxY, axisAlignedBB2.maxZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB2.minX, axisAlignedBB2.maxY, axisAlignedBB2.minZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.maxZ).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.maxZ).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(axisAlignedBB2.maxX, axisAlignedBB2.maxY, axisAlignedBB2.maxZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB2.minX, axisAlignedBB2.maxY, axisAlignedBB2.maxZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.maxZ).color(n, n2, n3, n4).endVertex();
        bufferBuilder.pos(axisAlignedBB2.maxX, axisAlignedBB2.maxY, axisAlignedBB2.maxZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB2.maxX, axisAlignedBB2.maxY, axisAlignedBB2.minZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB3.minX, axisAlignedBB3.minY, axisAlignedBB3.minZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB3.maxX, axisAlignedBB3.minY, axisAlignedBB3.minZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB3.maxX, axisAlignedBB3.maxY, axisAlignedBB3.minZ).color(n9, n10, n11, n12).endVertex();
        bufferBuilder.pos(axisAlignedBB3.minX, axisAlignedBB3.maxY, axisAlignedBB3.minZ).color(n9, n10, n11, n12).endVertex();
        bufferBuilder.pos(axisAlignedBB3.minX, axisAlignedBB3.minY, axisAlignedBB3.minZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB3.minX, axisAlignedBB3.minY, axisAlignedBB3.maxZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB3.minX, axisAlignedBB3.maxY, axisAlignedBB3.maxZ).color(n9, n10, n11, n12).endVertex();
        bufferBuilder.pos(axisAlignedBB3.minX, axisAlignedBB3.maxY, axisAlignedBB3.minZ).color(n9, n10, n11, n12).endVertex();
        bufferBuilder.pos(axisAlignedBB3.minX, axisAlignedBB3.minY, axisAlignedBB3.maxZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB3.maxX, axisAlignedBB3.minY, axisAlignedBB3.maxZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB3.maxX, axisAlignedBB3.maxY, axisAlignedBB3.maxZ).color(n9, n10, n11, n12).endVertex();
        bufferBuilder.pos(axisAlignedBB3.minX, axisAlignedBB3.maxY, axisAlignedBB3.maxZ).color(n9, n10, n11, n12).endVertex();
        bufferBuilder.pos(axisAlignedBB3.maxX, axisAlignedBB3.minY, axisAlignedBB3.minZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB3.maxX, axisAlignedBB3.minY, axisAlignedBB3.maxZ).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos(axisAlignedBB3.maxX, axisAlignedBB3.maxY, axisAlignedBB3.maxZ).color(n9, n10, n11, n12).endVertex();
        bufferBuilder.pos(axisAlignedBB3.maxX, axisAlignedBB3.maxY, axisAlignedBB3.minZ).color(n9, n10, n11, n12).endVertex();
        bufferBuilder.pos(axisAlignedBB3.minX, axisAlignedBB3.minY, axisAlignedBB3.minZ).color(n9, n10, n11, n12).endVertex();
        bufferBuilder.pos(axisAlignedBB3.maxX, axisAlignedBB3.minY, axisAlignedBB3.minZ).color(n9, n10, n11, n12).endVertex();
        bufferBuilder.pos(axisAlignedBB3.maxX, axisAlignedBB3.minY, axisAlignedBB3.maxZ).color(n9, n10, n11, n12).endVertex();
        bufferBuilder.pos(axisAlignedBB3.minX, axisAlignedBB3.minY, axisAlignedBB3.maxZ).color(n9, n10, n11, n12).endVertex();
        tessellator.draw();
        Class815.Method3434();
    }

    public static void Method3463(AxisAlignedBB axisAlignedBB, EnumFacing enumFacing, Color color, Color color2, Color color3, Color color4) {
        Class815.Method3433();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        switch (Class1951.Field17010[enumFacing.ordinal()]) {
            case 1: {
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
                break;
            }
            case 2: {
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
                break;
            }
            case 3: {
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
                break;
            }
            case 4: {
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
                break;
            }
            case 5: {
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
                break;
            }
            case 6: {
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
                break;
            }
        }
        tessellator.draw();
        Class815.Method3434();
    }

    public static void Method3464(AxisAlignedBB axisAlignedBB, EnumFacing enumFacing, float f, Color color, Color color2, Color color3, Color color4) {
        Class815.Method3433();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GL11.glLineWidth((float)f);
        bufferBuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        switch (Class1951.Field17010[enumFacing.ordinal()]) {
            case 1: {
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                break;
            }
            case 2: {
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                break;
            }
            case 3: {
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                break;
            }
            case 5: {
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                break;
            }
            case 4: {
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                break;
            }
            case 6: {
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                break;
            }
        }
        tessellator.draw();
        Class815.Method3434();
    }

    public static void Method3465(AxisAlignedBB axisAlignedBB, Color color, Color color2, Color color3, Color color4) {
        Class815.Method3433();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
        tessellator.draw();
        Class815.Method3434();
    }

    public static void Method3466(Entity entity, float f, float f2, float f3, float f4, float f5) {
        double d = Class815.Field11483.renderManager.viewerPosX;
        double d2 = Class815.Field11483.renderManager.viewerPosY;
        double d3 = Class815.Field11483.renderManager.viewerPosZ;
        double d4 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f5 - d;
        double d5 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f5 + (double)(entity.height / 2.0f) - d2;
        double d6 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f5 - d3;
        float f6 = Class815.Field11483.renderManager.playerViewY;
        float f7 = Class815.Field11483.renderManager.playerViewX;
        boolean bl = Class815.Field11483.renderManager.options.thirdPersonView == 2;
        Class815.Method3433();
        GlStateManager.translate((double)d4, (double)d5, (double)d6);
        GlStateManager.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)(-f6), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)(1.0f * f7), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)0.0, (double)1.0, (double)0.0);
        GL11.glVertex3d((double)Double.longBitsToDouble(-4620693217682128896L), (double)Double.longBitsToDouble(4602678819172646912L), (double)0.0);
        GL11.glVertex3d((double)0.0, (double)1.0, (double)0.0);
        GL11.glVertex3d((double)Double.longBitsToDouble(4602678819172646912L), (double)Double.longBitsToDouble((long)1027396821 ^ 0x3FE000003D3CD4D5L), (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)Double.longBitsToDouble(-4620693217682128896L), (double)Double.longBitsToDouble(4602678819172646912L), (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)Double.longBitsToDouble(4602678819172646912L), (double)Double.longBitsToDouble((long)1224879427 ^ 0x3FE0000049022D43L), (double)0.0);
        GL11.glEnd();
        Class815.Method3434();
    }

    static Minecraft Method3467() {
        return Field11483;
    }
}

