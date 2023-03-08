//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import com.kisman.cc.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.math.*;
import java.awt.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;

public class Class815
{
    private static final Minecraft Field11483;
    public static Tessellator Field11484;
    public static BufferBuilder Field11485;
    public static final Class2027 Field11486;
    private String Field11487 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method3432(final boolean b) {
        GL11.glPushAttrib(1048575);
        GL11.glPushMatrix();
        GL11.glDisable(3008);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3553);
        if (!b) {
            GL11.glDisable(2929);
        }
        GL11.glDepthMask(false);
        GL11.glEnable(2884);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4353);
        GL11.glDisable(2896);
        GL11.glLineWidth(Float.intBitsToFloat(1069547520));
    }
    
    public static void Method3433() {
        GL11.glPushAttrib(1048575);
        GL11.glPushMatrix();
        GL11.glDisable(3008);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glEnable(2884);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4353);
        GL11.glDisable(2896);
        GL11.glLineWidth(Float.intBitsToFloat(1069547520));
    }
    
    public static void Method3434() {
        GL11.glEnable(2896);
        GL11.glDisable(2848);
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glDepthMask(true);
        GL11.glCullFace(1029);
        GL11.glPopMatrix();
        GL11.glPopAttrib();
    }
    
    public static void Method3435(final boolean b) {
        GL11.glEnable(2896);
        GL11.glDisable(2848);
        GL11.glEnable(3553);
        if (!b) {
            GL11.glEnable(2929);
        }
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glDepthMask(true);
        GL11.glCullFace(1029);
        GL11.glPopMatrix();
        GL11.glPopAttrib();
    }
    
    public static void Method3436(final boolean b) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        if (!b) {
            GlStateManager.disableDepth();
        }
        GlStateManager.tryBlendFuncSeparate(770, 771, 0, 1);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask(false);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glLineWidth(Float.intBitsToFloat(1069547520));
    }
    
    public static void Method3437() {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate(770, 771, 0, 1);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask(false);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glLineWidth(Float.intBitsToFloat(1069547520));
    }
    
    public static void Method3438() {
        GL11.glDisable(2848);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.depthMask(true);
        GlStateManager.enableDepth();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    
    public static void Method3439(final boolean b) {
        GL11.glDisable(2848);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.depthMask(true);
        if (!b) {
            GlStateManager.enableDepth();
        }
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    
    public static void Method3440() {
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
        GlStateManager.shadeModel(7425);
    }
    
    public static void Method3441() {
        GlStateManager.enableCull();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel(7424);
    }
    
    public static void Method3442(final AxisAlignedBB axisAlignedBB, final float n, final Class2027 class2027, final Class2027 class2028, final Class2008 class2029) {
        Method3443(axisAlignedBB, n, class2027, class2028, class2029, false);
    }
    
    public static void Method3443(final AxisAlignedBB axisAlignedBB, final float n, final Class2027 class2027, final Class2027 class2028, final Class2008 class2029, final boolean b) {
        Method3445(axisAlignedBB, n, class2027, class2028, class2027.Method3633(255), class2028.Method3633(255), class2027.Method3633(255), class2028.Method3633(255), class2029, b);
    }
    
    public static void Method3444(final AxisAlignedBB axisAlignedBB, final float n, final Class2027 class2027, final Class2027 class2028, final Class2027 class2029, final Class2027 class2030, final Class2027 class2031, final Class2027 class2032, final Class2008 class2033) {
        Method3445(axisAlignedBB, n, class2027, class2028, class2029, class2030, class2031, class2032, class2033, false);
    }
    
    public static void Method3445(final AxisAlignedBB axisAlignedBB, final float f, final Class2027 class2027, final Class2027 class2028, final Class2027 class2029, final Class2027 class2030, final Class2027 class2031, final Class2027 class2032, final Class2008 class2033, final boolean b) {
        class2033.Method7456(axisAlignedBB, class2027.Method3625(), class2028.Method3625(), class2029.Method3625(), class2030.Method3625(), class2031.Method3625(), class2032.Method3625(), false, new Object[] { f });
    }
    
    public static void Method3446(final AxisAlignedBB axisAlignedBB, final float n, final Class2027 class2027, final Class2027 class2028, final Class2008 class2029) {
        Method3442(axisAlignedBB, n, class2027, class2028, class2029);
    }
    
    public static AxisAlignedBB Method3447(final AxisAlignedBB axisAlignedBB) {
        return new AxisAlignedBB(axisAlignedBB.minX - Class815.Field11483.getRenderManager().viewerPosX, axisAlignedBB.minY - Class815.Field11483.getRenderManager().viewerPosY, axisAlignedBB.minZ - Class815.Field11483.getRenderManager().viewerPosZ, axisAlignedBB.maxX - Class815.Field11483.getRenderManager().viewerPosX, axisAlignedBB.maxY - Class815.Field11483.getRenderManager().viewerPosY, axisAlignedBB.maxZ - Class815.Field11483.getRenderManager().viewerPosZ);
    }
    
    public static BlockPos Method3448(final BlockPos blockPos) {
        final AxisAlignedBB method3447 = Method3447(new AxisAlignedBB(blockPos));
        return new BlockPos(method3447.minX, method3447.minY, method3447.minZ);
    }
    
    public static AxisAlignedBB Method3449(final BlockPos blockPos, final double n) {
        final double n2 = n * Double.longBitsToDouble(4602678819172646912L);
        return new AxisAlignedBB(blockPos.getX() + Double.longBitsToDouble(4602678819172646912L) - n2, blockPos.getY() + Double.longBitsToDouble(4602678819172646912L) - n2, blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L) - n2, blockPos.getX() + Double.longBitsToDouble(4602678819172646912L) + n2, blockPos.getY() + Double.longBitsToDouble(4602678819172646912L) + n2, blockPos.getZ() + Double.longBitsToDouble((long)810961578 ^ 0x3FE0000030564AAAL) + n2);
    }
    
    public static AxisAlignedBB Method3450(final AxisAlignedBB axisAlignedBB, final double n) {
        final double n2 = n * Double.longBitsToDouble((long)403010978 ^ 0x3FE00000180575A2L);
        return new AxisAlignedBB(axisAlignedBB.minX - n2, axisAlignedBB.minY - n2, axisAlignedBB.minZ - n2, axisAlignedBB.maxX + n2, axisAlignedBB.maxY + n2, axisAlignedBB.maxZ + n2);
    }
    
    public static Class1240 Method3451(final Class1240 class1240, final Class1240 class1241, final float n, final float n2) {
        final float n3 = n / n2;
        return new Class1240(new AxisAlignedBB(class1240.Field13617 + (class1241.Field13620 - class1240.Field13620) * n3 + (class1241.Field13620 - class1241.Field13617 - (class1240.Field13620 - class1240.Field13617)) * Double.longBitsToDouble((long)788819291 ^ 0x3FE000002F046D5BL) * n3, class1240.Field13618 + (class1241.Field13621 - class1240.Field13621) * n3 + (class1241.Field13621 - class1241.Field13618 - (class1240.Field13621 - class1240.Field13618)) * Double.longBitsToDouble(4602678819172646912L) * n3, class1240.Field13619 + (class1241.Field13622 - class1240.Field13622) * n3 + (class1241.Field13622 - class1241.Field13619 - (class1240.Field13622 - class1240.Field13619)) * Double.longBitsToDouble(4602678819172646912L) * n3, class1240.Field13620 + (class1241.Field13620 - class1240.Field13620) * n3 + (class1241.Field13620 - class1241.Field13617 - (class1240.Field13620 - class1240.Field13617)) * Double.longBitsToDouble(4602678819172646912L) * n3, class1240.Field13621 + (class1241.Field13621 - class1240.Field13621) * n3 + (class1241.Field13621 - class1241.Field13618 - (class1240.Field13621 - class1240.Field13618)) * Double.longBitsToDouble((long)20690838 ^ 0x3FE00000013BB796L) * n3, class1240.Field13622 + (class1241.Field13622 - class1240.Field13622) * n3 + (class1241.Field13622 - class1241.Field13619 - (class1240.Field13622 - class1240.Field13619)) * Double.longBitsToDouble(4602678819172646912L) * n3));
    }
    
    public static void Method3452(final AxisAlignedBB axisAlignedBB, final Class2027 class2027, final Class2027 class2028, final Class2027 class2029) {
        final double n = (axisAlignedBB.maxY - axisAlignedBB.minY) * Double.longBitsToDouble(4602678819172646912L);
        final AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.minY + n, axisAlignedBB.maxZ);
        final AxisAlignedBB axisAlignedBB3 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY + n, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        Method3433();
        Method3460(axisAlignedBB2, class2027.Method3625(), class2028.Method3625());
        Method3460(axisAlignedBB3, class2028.Method3625(), class2029.Method3625());
        Method3434();
    }
    
    public static void Method3453(final AxisAlignedBB axisAlignedBB, final Class2027 class2027, final Class2027 class2028, final Class2027 class2029) {
        final double n = (axisAlignedBB.maxY - axisAlignedBB.minY) * Double.longBitsToDouble((long)1126608360 ^ 0x3FE000004326ADE8L);
        final AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.minY + n, axisAlignedBB.maxZ);
        final AxisAlignedBB axisAlignedBB3 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY + n, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        Method3433();
        Method3454(axisAlignedBB3, class2027.Method3625(), class2028.Method3625());
        Method3455(axisAlignedBB2, class2028.Method3625(), class2029.Method3625());
        Method3434();
    }
    
    public static void Method3454(final AxisAlignedBB axisAlignedBB, final Color color, final Color color2) {
        final float n = color2.getAlpha() / Float.intBitsToFloat(1132396544);
        final float n2 = color2.getRed() / Float.intBitsToFloat(1132396544);
        final float n3 = color2.getGreen() / Float.intBitsToFloat(1132396544);
        final float n4 = color2.getBlue() / Float.intBitsToFloat(1132396544);
        final float n5 = color.getAlpha() / Float.intBitsToFloat(1132396544);
        final float n6 = color.getRed() / Float.intBitsToFloat(1132396544);
        final float n7 = color.getGreen() / Float.intBitsToFloat(1132396544);
        final float n8 = color.getBlue() / Float.intBitsToFloat(1132396544);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getInstance.draw();
    }
    
    public static void Method3455(final AxisAlignedBB axisAlignedBB, final Color color, final Color color2) {
        final float n = color2.getAlpha() / Float.intBitsToFloat(1132396544);
        final float n2 = color2.getRed() / Float.intBitsToFloat(1132396544);
        final float n3 = color2.getGreen() / Float.intBitsToFloat(1132396544);
        final float n4 = color2.getBlue() / Float.intBitsToFloat(1132396544);
        final float n5 = color.getAlpha() / Float.intBitsToFloat(1132396544);
        final float n6 = color.getRed() / Float.intBitsToFloat(1132396544);
        final float n7 = color.getGreen() / Float.intBitsToFloat(1132396544);
        final float n8 = color.getBlue() / Float.intBitsToFloat(1132396544);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getInstance.draw();
    }
    
    public static void Method3456(final AxisAlignedBB axisAlignedBB, final Color color) {
        Class815.Field11485.begin(5, DefaultVertexFormats.POSITION_COLOR);
        Method3457(Class815.Field11485, axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ, color);
        Class815.Field11484.draw();
    }
    
    public static void Method3457(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final Color color) {
        bufferBuilder.pos(n, n2, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n2, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n2, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n2, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n5, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n5, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n5, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n2, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n5, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n2, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n2, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n2, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n5, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n5, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n5, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n2, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n5, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n2, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n2, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n2, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n2, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n2, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n2, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n5, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n5, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n5, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n5, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n5, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n5, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n5, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
    }
    
    public static void Method3458(final AxisAlignedBB axisAlignedBB, final Color color) {
        Class815.Field11485.begin(3, DefaultVertexFormats.POSITION_COLOR);
        Method3459(Class815.Field11485, axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ, color);
        Class815.Field11484.draw();
    }
    
    public static void Method3459(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final Color color) {
        bufferBuilder.pos(n, n2, n3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(n, n2, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n2, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n2, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n2, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n2, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n5, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n5, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n5, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n5, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n5, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n, n5, n6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(n, n2, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n5, n6).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(n4, n2, n6).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n5, n3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
        bufferBuilder.pos(n4, n2, n3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos(n4, n2, n3).color((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), 0.0f).endVertex();
    }
    
    public static void Method3460(final AxisAlignedBB axisAlignedBB, final Color color, final Color color2) {
        final float n = color2.getAlpha() / Float.intBitsToFloat(1132396544);
        final float n2 = color2.getRed() / Float.intBitsToFloat(1132396544);
        final float n3 = color2.getGreen() / Float.intBitsToFloat(1132396544);
        final float n4 = color2.getBlue() / Float.intBitsToFloat(1132396544);
        final float n5 = color.getAlpha() / Float.intBitsToFloat(1132396544);
        final float n6 = color.getRed() / Float.intBitsToFloat(1132396544);
        final float n7 = color.getGreen() / Float.intBitsToFloat(1132396544);
        final float n8 = color.getBlue() / Float.intBitsToFloat(1132396544);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n).endVertex();
        getInstance.draw();
    }
    
    public static void Method3461(final AxisAlignedBB axisAlignedBB, final Color color, final Color color2, final float n) {
        final float n2 = color.getRed() / Float.intBitsToFloat(1132396544);
        final float n3 = color.getGreen() / Float.intBitsToFloat(1132396544);
        final float n4 = color.getBlue() / Float.intBitsToFloat(1132396544);
        final float n5 = color.getAlpha() / Float.intBitsToFloat(1132396544);
        final float n6 = color2.getRed() / Float.intBitsToFloat(1132396544);
        final float n7 = color2.getGreen() / Float.intBitsToFloat(1132396544);
        final float n8 = color2.getBlue() / Float.intBitsToFloat(1132396544);
        final float n9 = color2.getAlpha() / Float.intBitsToFloat(1132396544);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(3, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n9).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n9).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n9).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n9).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n9).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n9).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(n6, n7, n8, n9).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(n2, n3, n4, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n5).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(n6, n7, n8, n9).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n5).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(n2, n3, n4, n5).endVertex();
        getInstance.draw();
    }
    
    public static void Method3462(final AxisAlignedBB axisAlignedBB, final Color color, final Color color2, final Color color3) {
        final double n = (axisAlignedBB.maxY - axisAlignedBB.minY) / Double.longBitsToDouble((long)1513221321 ^ 0x400000005A31ECC9L);
        final AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.minY + n, axisAlignedBB.maxZ);
        final AxisAlignedBB axisAlignedBB3 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY + n, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        final int red = color.getRed();
        final int green = color.getGreen();
        final int blue = color.getBlue();
        final int alpha = color.getAlpha();
        final int red2 = color2.getRed();
        final int green2 = color2.getGreen();
        final int blue2 = color2.getBlue();
        final int alpha2 = color2.getAlpha();
        final int red3 = color3.getRed();
        final int green3 = color3.getGreen();
        final int blue3 = color3.getBlue();
        final int alpha3 = color3.getAlpha();
        Method3433();
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(red, green, blue, alpha).endVertex();
        getBuffer.pos(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(red, green, blue, alpha).endVertex();
        getBuffer.pos(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.maxZ).color(red, green, blue, alpha).endVertex();
        getBuffer.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.maxZ).color(red, green, blue, alpha).endVertex();
        getBuffer.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(red, green, blue, alpha).endVertex();
        getBuffer.pos(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(red, green, blue, alpha).endVertex();
        getBuffer.pos(axisAlignedBB2.maxX, axisAlignedBB2.maxY, axisAlignedBB2.minZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB2.minX, axisAlignedBB2.maxY, axisAlignedBB2.minZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(red, green, blue, alpha).endVertex();
        getBuffer.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.maxZ).color(red, green, blue, alpha).endVertex();
        getBuffer.pos(axisAlignedBB2.minX, axisAlignedBB2.maxY, axisAlignedBB2.maxZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB2.minX, axisAlignedBB2.maxY, axisAlignedBB2.minZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.maxZ).color(red, green, blue, alpha).endVertex();
        getBuffer.pos(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.maxZ).color(red, green, blue, alpha).endVertex();
        getBuffer.pos(axisAlignedBB2.maxX, axisAlignedBB2.maxY, axisAlignedBB2.maxZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB2.minX, axisAlignedBB2.maxY, axisAlignedBB2.maxZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(red, green, blue, alpha).endVertex();
        getBuffer.pos(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.maxZ).color(red, green, blue, alpha).endVertex();
        getBuffer.pos(axisAlignedBB2.maxX, axisAlignedBB2.maxY, axisAlignedBB2.maxZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB2.maxX, axisAlignedBB2.maxY, axisAlignedBB2.minZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB3.minX, axisAlignedBB3.minY, axisAlignedBB3.minZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB3.maxX, axisAlignedBB3.minY, axisAlignedBB3.minZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB3.maxX, axisAlignedBB3.maxY, axisAlignedBB3.minZ).color(red3, green3, blue3, alpha3).endVertex();
        getBuffer.pos(axisAlignedBB3.minX, axisAlignedBB3.maxY, axisAlignedBB3.minZ).color(red3, green3, blue3, alpha3).endVertex();
        getBuffer.pos(axisAlignedBB3.minX, axisAlignedBB3.minY, axisAlignedBB3.minZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB3.minX, axisAlignedBB3.minY, axisAlignedBB3.maxZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB3.minX, axisAlignedBB3.maxY, axisAlignedBB3.maxZ).color(red3, green3, blue3, alpha3).endVertex();
        getBuffer.pos(axisAlignedBB3.minX, axisAlignedBB3.maxY, axisAlignedBB3.minZ).color(red3, green3, blue3, alpha3).endVertex();
        getBuffer.pos(axisAlignedBB3.minX, axisAlignedBB3.minY, axisAlignedBB3.maxZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB3.maxX, axisAlignedBB3.minY, axisAlignedBB3.maxZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB3.maxX, axisAlignedBB3.maxY, axisAlignedBB3.maxZ).color(red3, green3, blue3, alpha3).endVertex();
        getBuffer.pos(axisAlignedBB3.minX, axisAlignedBB3.maxY, axisAlignedBB3.maxZ).color(red3, green3, blue3, alpha3).endVertex();
        getBuffer.pos(axisAlignedBB3.maxX, axisAlignedBB3.minY, axisAlignedBB3.minZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB3.maxX, axisAlignedBB3.minY, axisAlignedBB3.maxZ).color(red2, green2, blue2, alpha2).endVertex();
        getBuffer.pos(axisAlignedBB3.maxX, axisAlignedBB3.maxY, axisAlignedBB3.maxZ).color(red3, green3, blue3, alpha3).endVertex();
        getBuffer.pos(axisAlignedBB3.maxX, axisAlignedBB3.maxY, axisAlignedBB3.minZ).color(red3, green3, blue3, alpha3).endVertex();
        getBuffer.pos(axisAlignedBB3.minX, axisAlignedBB3.minY, axisAlignedBB3.minZ).color(red3, green3, blue3, alpha3).endVertex();
        getBuffer.pos(axisAlignedBB3.maxX, axisAlignedBB3.minY, axisAlignedBB3.minZ).color(red3, green3, blue3, alpha3).endVertex();
        getBuffer.pos(axisAlignedBB3.maxX, axisAlignedBB3.minY, axisAlignedBB3.maxZ).color(red3, green3, blue3, alpha3).endVertex();
        getBuffer.pos(axisAlignedBB3.minX, axisAlignedBB3.minY, axisAlignedBB3.maxZ).color(red3, green3, blue3, alpha3).endVertex();
        getInstance.draw();
        Method3434();
    }
    
    public static void Method3463(final AxisAlignedBB axisAlignedBB, final EnumFacing enumFacing, final Color color, final Color color2, final Color color3, final Color color4) {
        Method3433();
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        switch (Class1951.Field17010[enumFacing.ordinal()]) {
            case 1: {
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
                break;
            }
            case 2: {
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
                break;
            }
            case 3: {
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
                break;
            }
            case 4: {
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
                break;
            }
            case 5: {
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
                break;
            }
            case 6: {
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
                break;
            }
        }
        getInstance.draw();
        Method3434();
    }
    
    public static void Method3464(final AxisAlignedBB axisAlignedBB, final EnumFacing enumFacing, final float n, final Color color, final Color color2, final Color color3, final Color color4) {
        Method3433();
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        GL11.glLineWidth(n);
        getBuffer.begin(3, DefaultVertexFormats.POSITION_COLOR);
        switch (Class1951.Field17010[enumFacing.ordinal()]) {
            case 1: {
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                break;
            }
            case 2: {
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                break;
            }
            case 3: {
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                break;
            }
            case 5: {
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                break;
            }
            case 4: {
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                break;
            }
            case 6: {
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
                getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
                break;
            }
        }
        getInstance.draw();
        Method3434();
    }
    
    public static void Method3465(final AxisAlignedBB axisAlignedBB, final Color color, final Color color2, final Color color3, final Color color4) {
        Method3433();
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color3.getAlpha()).endVertex();
        getInstance.draw();
        Method3434();
    }
    
    public static void Method3466(final Entity entity, final float n, final float n2, final float n3, final float n4, final float n5) {
        final double viewerPosX = Class815.Field11483.renderManager.viewerPosX;
        final double viewerPosY = Class815.Field11483.renderManager.viewerPosY;
        final double viewerPosZ = Class815.Field11483.renderManager.viewerPosZ;
        final double n6 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * n5 - viewerPosX;
        final double n7 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * n5 + entity.height / 2.0f - viewerPosY;
        final double n8 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * n5 - viewerPosZ;
        final float playerViewY = Class815.Field11483.renderManager.playerViewY;
        final float playerViewX = Class815.Field11483.renderManager.playerViewX;
        final boolean b = Class815.Field11483.renderManager.options.thirdPersonView == 2;
        Method3433();
        GlStateManager.translate(n6, n7, n8);
        GlStateManager.glNormal3f(0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-playerViewY, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(1 * playerViewX, 1.0f, 0.0f, 0.0f);
        GL11.glColor4f(n, n2, n3, n4);
        GL11.glBegin(1);
        GL11.glVertex3d(0.0, 1.0, 0.0);
        GL11.glVertex3d(Double.longBitsToDouble(-4620693217682128896L), Double.longBitsToDouble(4602678819172646912L), 0.0);
        GL11.glVertex3d(0.0, 1.0, 0.0);
        GL11.glVertex3d(Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)1027396821 ^ 0x3FE000003D3CD4D5L), 0.0);
        GL11.glVertex3d(0.0, 0.0, 0.0);
        GL11.glVertex3d(Double.longBitsToDouble(-4620693217682128896L), Double.longBitsToDouble(4602678819172646912L), 0.0);
        GL11.glVertex3d(0.0, 0.0, 0.0);
        GL11.glVertex3d(Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)1224879427 ^ 0x3FE0000049022D43L), 0.0);
        GL11.glEnd();
        Method3434();
    }
    
    static Minecraft Method3467() {
        return Class815.Field11483;
    }
    
    static {
        Field11483 = Minecraft.getMinecraft();
        Class815.Field11484 = Tessellator.getInstance();
        Class815.Field11485 = Class815.Field11484.getBuffer();
        Field11486 = new Class2027(0, 0, 0, 0);
    }
}
