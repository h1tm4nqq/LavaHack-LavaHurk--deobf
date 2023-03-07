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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$1;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2;
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

public class exalTBqSufwHR1VdwyK23X5QNwSlzh5j {
    private static final Minecraft Field11483 = Minecraft.getMinecraft();
    public static Tessellator Field11484 = Tessellator.getInstance();
    public static BufferBuilder Field11485 = Field11484.getBuffer();
    public static final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field11486 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1357928599 ^ (long)1357928599), (int)((long)-1941870448 ^ (long)-1941870448), (int)((long)1875654986 ^ (long)1875654986), (int)((long)1896776941 ^ (long)1896776941));
    private String Field11487 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method3432(boolean bl) {
        GL11.glPushAttrib((int)((int)((long)35017562 ^ (long)35237029)));
        GL11.glPushMatrix();
        GL11.glDisable((int)(((int)-216546064L ^ 0xF317C4DF) << 6));
        GL11.glEnable((int)((int)((long)-35229152 ^ (long)-35227695) << 1));
        GL11.glBlendFunc((int)((int)((long)832772135 ^ (long)832772518) << 1), (int)((int)((long)310199642 ^ (long)310199897)));
        GL11.glDisable((int)((int)1374801537L ^ 0x51F1C360));
        if (!bl) {
            GL11.glDisable((int)((int)((long)492113292 ^ (long)492111613)));
        }
        GL11.glDepthMask((boolean)((long)2070663953 ^ (long)2070663953));
        GL11.glEnable((int)((int)((long)276804677 ^ (long)276805268) << 2));
        GL11.glEnable((int)((int)((long)2021572390 ^ (long)2021572479) << 5));
        GL11.glHint((int)(((int)-1766020534L ^ 0x96BCAC63) << 1), (int)((int)-908133028L ^ 0xC9DEEC5D));
        GL11.glDisable((int)(((int)-229097724L ^ 0xF2583FB1) << 4));
        GL11.glLineWidth((float)Float.intBitsToFloat((int)((long)950143887 ^ (long)123865999)));
    }

    public static void Method3433() {
        GL11.glPushAttrib((int)((int)((long)-1233807938 ^ (long)-1233491391)));
        GL11.glPushMatrix();
        GL11.glDisable((int)((int)((long)-1475557880 ^ (long)-1475557849) << 6));
        GL11.glEnable((int)(((int)-67113050L ^ 0xFBFFEA57) << 1));
        GL11.glBlendFunc((int)((int)((long)96119843 ^ (long)96120226) << 1), (int)((int)1502075376L ^ 0x5987DAF3));
        GL11.glDisable((int)((int)((long)-476201318 ^ (long)-476204165)));
        GL11.glDisable((int)((int)-1739991961L ^ 0x9849DF16));
        GL11.glDepthMask((boolean)((long)-1826462856 ^ (long)-1826462856));
        GL11.glEnable((int)(((int)1818835431L ^ 0x6C693B36) << 2));
        GL11.glEnable((int)(((int)-172689072L ^ 0xF5B4F909) << 5));
        GL11.glHint((int)((int)((long)-947119468 ^ (long)-947118915) << 1), (int)((int)247227729L ^ 0xEBC7450));
        GL11.glDisable((int)((int)((long)-49630830 ^ (long)-49630937) << 4));
        GL11.glLineWidth((float)Float.intBitsToFloat(0x678E5389 ^ 0x584E5389));
    }

    public static void Method3434() {
        GL11.glEnable((int)((int)((long)138113153 ^ (long)138113076) << 4));
        GL11.glDisable((int)((int)((long)2074169851 ^ (long)2074169762) << 5));
        GL11.glEnable((int)((int)-2009379646L ^ 0x883B4123));
        GL11.glEnable((int)((int)((long)-1777620642 ^ (long)-1777622481)));
        GL11.glDisable((int)((int)((long)1750988551 ^ (long)1750987510) << 1));
        GL11.glEnable((int)((int)((long)183839495 ^ (long)183839528) << 6));
        GL11.glDepthMask(((int)-613125476L ^ 0xDB74729D) != 0);
        GL11.glCullFace((int)((int)203805232L ^ 0xC25D635));
        GL11.glPopMatrix();
        GL11.glPopAttrib();
    }

    public static void Method3435(boolean bl) {
        GL11.glEnable((int)(((int)888748628L ^ 0x34F93AE1) << 4));
        GL11.glDisable((int)((int)((long)1755322407 ^ (long)1755322494) << 5));
        GL11.glEnable((int)((int)((long)-1891108369 ^ (long)-1891109874)));
        if (!bl) {
            GL11.glEnable((int)((int)-1143159357L ^ 0xBBDCCEB2));
        }
        GL11.glDisable((int)((int)((long)683138343 ^ (long)683137238) << 1));
        GL11.glEnable((int)((int)((long)-341009585 ^ (long)-341009568) << 6));
        GL11.glDepthMask(((int)-671200333L ^ 0xD7FE4BB2) != 0);
        GL11.glCullFace((int)((int)((long)-1574621209 ^ (long)-1574622238)));
        GL11.glPopMatrix();
        GL11.glPopAttrib();
    }

    public static void Method3436(boolean bl) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        if (!bl) {
            GlStateManager.disableDepth();
        }
        GlStateManager.tryBlendFuncSeparate((int)((int)((long)1421667659 ^ (long)1421667530) << 1), (int)((int)-1641042162L ^ 0x9E2FAC0D), (int)((int)((long)2042022430 ^ (long)2042022430)), (int)((int)-1714694914L ^ 0x99CBD4FF));
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask((boolean)((long)-1505588617 ^ (long)-1505588617));
        GL11.glEnable((int)(((int)-707465576L ^ 0xD5D4EEC1) << 5));
        GL11.glHint((int)(((int)49113722L ^ 0x2ED6C53) << 1), (int)(((int)-1233999093L ^ 0xB672A38A) << 1));
        GL11.glLineWidth((float)Float.intBitsToFloat((int)((long)922713246 ^ (long)155155614)));
    }

    public static void Method3437() {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate((int)(((int)-657018106L ^ 0xD8D6B287) << 1), (int)((int)((long)2010655095 ^ (long)2010655348)), (int)((int)1985702049L ^ 0x765B68A1), (int)((int)((long)52303898 ^ (long)52303899)));
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask((boolean)((long)-2080204717 ^ (long)-2080204717));
        GL11.glEnable((int)(((int)-1258041915L ^ 0xB503CD9C) << 5));
        GL11.glHint((int)((int)((long)-2046902370 ^ (long)-2046903881) << 1), (int)((int)((long)-911308934 ^ (long)-911306757) << 1));
        GL11.glLineWidth((float)Float.intBitsToFloat((int)((long)513245647 ^ (long)559382991)));
    }

    public static void Method3438() {
        GL11.glDisable((int)((int)((long)676648327 ^ (long)676648414) << 5));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.depthMask((boolean)((long)-158623392 ^ (long)-158623391));
        GlStateManager.enableDepth();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public static void Method3439(boolean bl) {
        GL11.glDisable((int)((int)((long)1363756749 ^ (long)1363756692) << 5));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.depthMask((boolean)((long)821663036 ^ (long)821663037));
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
        GlStateManager.shadeModel((int)((int)857052713L ^ 0x33158B28));
    }

    public static void Method3441() {
        GlStateManager.enableCull();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel((int)((int)((long)-2120726092 ^ (long)-2120726103) << 8));
    }

    public static void Method3442(AxisAlignedBB axisAlignedBB, float f, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3443(axisAlignedBB, f, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (boolean)((long)-1732378027 ^ (long)-1732378027));
    }

    public static void Method3443(AxisAlignedBB axisAlignedBB, float f, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, boolean bl) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3445(axisAlignedBB, f, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3633((int)-858183983L ^ 0xCCD9262E), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3633((int)((long)-1775516613 ^ (long)-1775516476)), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3633((int)((long)1717595717 ^ (long)1717595834)), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3633((int)-666568712L ^ 0xD844F707), exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, bl);
    }

    public static void Method3444(AxisAlignedBB axisAlignedBB, float f, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3445(axisAlignedBB, f, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (boolean)((long)104684819 ^ (long)104684819));
    }

    public static void Method3445(AxisAlignedBB axisAlignedBB, float f, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, boolean bl) {
        Color color = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3625();
        Color color2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3625();
        Color color3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Method3625();
        Color color4 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5.Method3625();
        Color color5 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6.Method3625();
        Color color6 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7.Method3625();
        Object[] objectArray = new Object[(int)1068191198L ^ 0x3FAB4DDF];
        objectArray[(int)((long)-767156444 ^ (long)-767156444)] = Float.valueOf(f);
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7456(axisAlignedBB, color, color2, color3, color4, color5, color6, (boolean)((long)-1137344618 ^ (long)-1137344618), objectArray);
    }

    public static void Method3446(AxisAlignedBB axisAlignedBB, float f, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3442(axisAlignedBB, f, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
    }

    public static AxisAlignedBB Method3447(AxisAlignedBB axisAlignedBB) {
        return new AxisAlignedBB(axisAlignedBB.minX - exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11483.getRenderManager().viewerPosX, axisAlignedBB.minY - exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11483.getRenderManager().viewerPosY, axisAlignedBB.minZ - exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11483.getRenderManager().viewerPosZ, axisAlignedBB.maxX - exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11483.getRenderManager().viewerPosX, axisAlignedBB.maxY - exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11483.getRenderManager().viewerPosY, axisAlignedBB.maxZ - exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11483.getRenderManager().viewerPosZ);
    }

    public static BlockPos Method3448(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(new AxisAlignedBB(blockPos));
        return new BlockPos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ);
    }

    public static AxisAlignedBB Method3449(BlockPos blockPos, double d) {
        double d2 = d * Double.longBitsToDouble(0x59BFBB9778DA0FC1L ^ 0x665FBB9778DA0FC1L);
        double d3 = (double)blockPos.getX() + Double.longBitsToDouble(0x7DB9D3B2A9B03E61L ^ 0x4259D3B2A9B03E61L) - d2;
        double d4 = (double)blockPos.getY() + Double.longBitsToDouble(0xAB241947C4CD5F0EL ^ 0x94C41947C4CD5F0EL) - d2;
        double d5 = (double)blockPos.getZ() + Double.longBitsToDouble(0x2BC15C9D6EE5B309L ^ 0x14215C9D6EE5B309L) - d2;
        double d6 = (double)blockPos.getX() + Double.longBitsToDouble(0x253C2DD57635D258L ^ 0x1ADC2DD57635D258L) + d2;
        double d7 = (double)blockPos.getY() + Double.longBitsToDouble(0x8246E0E431C7B0BCL ^ 0xBDA6E0E431C7B0BCL) + d2;
        double d8 = (double)blockPos.getZ() + Double.longBitsToDouble((long)810961578 ^ 0x3FE0000030564AAAL) + d2;
        return new AxisAlignedBB(d3, d4, d5, d6, d7, d8);
    }

    public static AxisAlignedBB Method3450(AxisAlignedBB axisAlignedBB, double d) {
        double d2 = d * Double.longBitsToDouble((long)403010978 ^ 0x3FE00000180575A2L);
        return new AxisAlignedBB(axisAlignedBB.minX - d2, axisAlignedBB.minY - d2, axisAlignedBB.minZ - d2, axisAlignedBB.maxX + d2, axisAlignedBB.maxY + d2, axisAlignedBB.maxZ + d2);
    }

    public static ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method3451(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22, ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23, float f, float f2) {
        float f3 = f / f2;
        double d = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13620 + (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13620 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13620) * (double)f3 + (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13620 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13617 - (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13620 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13617)) * Double.longBitsToDouble(0x53666F01A8A35BE5L ^ 0x6C866F01A8A35BE5L) * (double)f3;
        double d2 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13621 + (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13621 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13621) * (double)f3 + (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13621 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13618 - (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13621 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13618)) * Double.longBitsToDouble((long)20690838 ^ 0x3FE00000013BB796L) * (double)f3;
        double d3 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13622 + (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13622 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13622) * (double)f3 + (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13622 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13619 - (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13622 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13619)) * Double.longBitsToDouble(0x4552C354A4F1767EL ^ 0x7AB2C354A4F1767EL) * (double)f3;
        double d4 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13617 + (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13620 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13620) * (double)f3 + (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13620 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13617 - (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13620 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13617)) * Double.longBitsToDouble((long)788819291 ^ 0x3FE000002F046D5BL) * (double)f3;
        double d5 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13618 + (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13621 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13621) * (double)f3 + (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13621 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13618 - (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13621 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13618)) * Double.longBitsToDouble(0x69B1186704ECA285L ^ 0x5651186704ECA285L) * (double)f3;
        double d6 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13619 + (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13622 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13622) * (double)f3 + (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13622 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX23.Field13619 - (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13622 - ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13619)) * Double.longBitsToDouble(0x2EAB0AADED61E116L ^ 0x114B0AADED61E116L) * (double)f3;
        return new ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2(new AxisAlignedBB(d4, d5, d6, d, d2, d3));
    }

    public static void Method3452(AxisAlignedBB axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4) {
        double d = (axisAlignedBB.maxY - axisAlignedBB.minY) * Double.longBitsToDouble(0x2A5B865ACD474866L ^ 0x15BB865ACD474866L);
        AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.minY + d, axisAlignedBB.maxZ);
        AxisAlignedBB axisAlignedBB3 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY + d, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3460(axisAlignedBB2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3625(), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3625());
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3460(axisAlignedBB3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3625(), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Method3625());
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    public static void Method3453(AxisAlignedBB axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4) {
        double d = (axisAlignedBB.maxY - axisAlignedBB.minY) * Double.longBitsToDouble((long)1126608360 ^ 0x3FE000004326ADE8L);
        AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.minY + d, axisAlignedBB.maxZ);
        AxisAlignedBB axisAlignedBB3 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY + d, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3454(axisAlignedBB3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3625(), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3625());
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3455(axisAlignedBB2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3625(), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Method3625());
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    public static void Method3454(AxisAlignedBB axisAlignedBB, Color color, Color color2) {
        float f = (float)color2.getAlpha() / Float.intBitsToFloat((int)((long)1917208840 ^ (long)825837832));
        float f2 = (float)color2.getRed() / Float.intBitsToFloat(0x5C47513F ^ 0x1F38513F);
        float f3 = (float)color2.getGreen() / Float.intBitsToFloat((int)((long)1849041150 ^ (long)759767294));
        float f4 = (float)color2.getBlue() / Float.intBitsToFloat((int)((long)1906292138 ^ (long)853587370));
        float f5 = (float)color.getAlpha() / Float.intBitsToFloat((int)((long)1984065415 ^ (long)893218695));
        float f6 = (float)color.getRed() / Float.intBitsToFloat(0xDC9C3F0 ^ 0x4EB6C3F0);
        float f7 = (float)color.getGreen() / Float.intBitsToFloat(0x12CEB367 ^ 0x51B1B367);
        float f8 = (float)color.getBlue() / Float.intBitsToFloat((int)1445461291L ^ 0x1558FD2B);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)168361726L ^ 0xA08FEF9, DefaultVertexFormats.POSITION_COLOR);
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
        float f = (float)color2.getAlpha() / Float.intBitsToFloat((int)((long)1176078204 ^ (long)90605436));
        float f2 = (float)color2.getRed() / Float.intBitsToFloat((int)199946435L ^ 0x4895F0C3);
        float f3 = (float)color2.getGreen() / Float.intBitsToFloat((int)2057200631L ^ 0x39E163F7);
        float f4 = (float)color2.getBlue() / Float.intBitsToFloat(0x212B91EF ^ 0x625491EF);
        float f5 = (float)color.getAlpha() / Float.intBitsToFloat(0x561F9A2 ^ 0x461EF9A2);
        float f6 = (float)color.getRed() / Float.intBitsToFloat(0x118386F7 ^ 0x52FC86F7);
        float f7 = (float)color.getGreen() / Float.intBitsToFloat((int)((long)1351204818 ^ (long)334938066));
        float f8 = (float)color.getBlue() / Float.intBitsToFloat((int)((long)415814374 ^ (long)1538773734));
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)357101406L ^ 0x1548EF59, DefaultVertexFormats.POSITION_COLOR);
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
        Field11485.begin((int)((long)-368820397 ^ (long)-368820394), DefaultVertexFormats.POSITION_COLOR);
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3457(Field11485, axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ, color);
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
        Field11485.begin((int)((long)316696353 ^ (long)316696354), DefaultVertexFormats.POSITION_COLOR);
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3459(Field11485, axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ, color);
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
        float f = (float)color2.getAlpha() / Float.intBitsToFloat(0x77540C35 ^ 0x342B0C35);
        float f2 = (float)color2.getRed() / Float.intBitsToFloat(0x31508FB8 ^ 0x722F8FB8);
        float f3 = (float)color2.getGreen() / Float.intBitsToFloat((int)((long)1013355585 ^ (long)2132382785));
        float f4 = (float)color2.getBlue() / Float.intBitsToFloat((int)((long)1623400488 ^ (long)599531560));
        float f5 = (float)color.getAlpha() / Float.intBitsToFloat((int)((long)1973064079 ^ (long)921014671));
        float f6 = (float)color.getRed() / Float.intBitsToFloat((int)798009669L ^ 0x6CEFA945);
        float f7 = (float)color.getGreen() / Float.intBitsToFloat((int)((long)682253017 ^ (long)1809144537));
        float f8 = (float)color.getBlue() / Float.intBitsToFloat((int)((long)622962657 ^ (long)1717479393));
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)1682311274L ^ 0x6446086D, DefaultVertexFormats.POSITION_COLOR);
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
        float f2 = (float)color.getRed() / Float.intBitsToFloat((int)((long)561348687 ^ (long)1644855375));
        float f3 = (float)color.getGreen() / Float.intBitsToFloat(0x1BF4AEB4 ^ 0x588BAEB4);
        float f4 = (float)color.getBlue() / Float.intBitsToFloat((int)940347273L ^ 0x7B738F89);
        float f5 = (float)color.getAlpha() / Float.intBitsToFloat((int)((long)19425226 ^ (long)1113024458));
        float f6 = (float)color2.getRed() / Float.intBitsToFloat((int)((long)462343664 ^ (long)1492241904));
        float f7 = (float)color2.getGreen() / Float.intBitsToFloat((int)((long)230925078 ^ (long)1320985366));
        float f8 = (float)color2.getBlue() / Float.intBitsToFloat(0x1950B857 ^ 0x5A2FB857);
        float f9 = (float)color2.getAlpha() / Float.intBitsToFloat((int)1462884289L ^ 0x144ED7C1);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)-205666086L ^ 0xF3BDC8D9, DefaultVertexFormats.POSITION_COLOR);
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
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)((long)466336574 ^ (long)466336569), DefaultVertexFormats.POSITION_COLOR);
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
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    public static void Method3463(AxisAlignedBB axisAlignedBB, EnumFacing enumFacing, Color color, Color color2, Color color3, Color color4) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)263818471L ^ 0xFB98CE0, DefaultVertexFormats.POSITION_COLOR);
        switch (exalTBqSufwHR1VdwyK23X5QNwSlzh5j$1.Field17010[enumFacing.ordinal()]) {
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
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    public static void Method3464(AxisAlignedBB axisAlignedBB, EnumFacing enumFacing, float f, Color color, Color color2, Color color3, Color color4) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GL11.glLineWidth((float)f);
        bufferBuilder.begin((int)((long)-1586168119 ^ (long)-1586168118), DefaultVertexFormats.POSITION_COLOR);
        switch (exalTBqSufwHR1VdwyK23X5QNwSlzh5j$1.Field17010[enumFacing.ordinal()]) {
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
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    public static void Method3465(AxisAlignedBB axisAlignedBB, Color color, Color color2, Color color3, Color color4) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)1968996453L ^ 0x755C8062, DefaultVertexFormats.POSITION_COLOR);
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
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    public static void Method3466(Entity entity, float f, float f2, float f3, float f4, float f5) {
        double d = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11483.renderManager.viewerPosX;
        double d2 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11483.renderManager.viewerPosY;
        double d3 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11483.renderManager.viewerPosZ;
        double d4 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f5 - d;
        double d5 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f5 + (double)(entity.height / 2.0f) - d2;
        double d6 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f5 - d3;
        float f6 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11483.renderManager.playerViewY;
        float f7 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11483.renderManager.playerViewX;
        int n = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11483.renderManager.options.thirdPersonView == ((int)289535839L ^ 0x1141F75E) << 1 ? (int)-1510538290L ^ 0xA5F703CF : (int)1529687424L ^ 0x5B2D2D80;
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        GlStateManager.translate((double)d4, (double)d5, (double)d6);
        GlStateManager.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)(-f6), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)((float)((int)1251579787L ^ 0x4A99978A) * f7), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        GL11.glBegin((int)((int)((long)-1100615459 ^ (long)-1100615460)));
        GL11.glVertex3d((double)0.0, (double)1.0, (double)0.0);
        GL11.glVertex3d((double)Double.longBitsToDouble(0x1D9C65CD6F57642EL ^ 0xA27C65CD6F57642EL), (double)Double.longBitsToDouble(0xE09444DB7152CCABL ^ 0xDF7444DB7152CCABL), (double)0.0);
        GL11.glVertex3d((double)0.0, (double)1.0, (double)0.0);
        GL11.glVertex3d((double)Double.longBitsToDouble(0xAA1DB658BC8729CCL ^ 0x95FDB658BC8729CCL), (double)Double.longBitsToDouble((long)1027396821 ^ 0x3FE000003D3CD4D5L), (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)Double.longBitsToDouble(0xAF8DB8DDA0650B98L ^ 0x106DB8DDA0650B98L), (double)Double.longBitsToDouble(0xDB893BFD626D7D46L ^ 0xE4693BFD626D7D46L), (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)Double.longBitsToDouble(0xCC66C72059156C73L ^ 0xF386C72059156C73L), (double)Double.longBitsToDouble((long)1224879427 ^ 0x3FE0000049022D43L), (double)0.0);
        GL11.glEnd();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    static Minecraft Method3467() {
        return Field11483;
    }
}

