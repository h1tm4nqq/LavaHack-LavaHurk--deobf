//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL41
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import lavahack.client.bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.hCtTgnEE6TMT0gFFqDwE9rj9V3nDioMu;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL41;

public class GI1YnXdds8IVC7IycuwMgptf06CmJ6TH
implements Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
    private static GI1YnXdds8IVC7IycuwMgptf06CmJ6TH Field16774;
    private String Field16775 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    GI1YnXdds8IVC7IycuwMgptf06CmJ6TH() {
    }

    public void Method7058(String string, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2, Color color) {
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11662, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11663, color.getRGB());
    }

    public void Method7059(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3, Color color) {
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11662, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11663, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3.Field11662, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3.Field11663, color.getRGB());
    }

    public void Method7060(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3, Color color) {
        this.Method7061(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3, color, Float.intBitsToFloat((int)((long)762426565 ^ (long)309441733)));
    }

    public void Method7061(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3, Color color, float f) {
        GL11.glColor4f((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), (float)color.getAlpha());
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)((int)1273935409L ^ 0x4BEEB630));
        GL11.glVertex2d((double)bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11662, (double)bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11663);
        GL11.glVertex2d((double)bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3.Field11662, (double)bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3.Field11663);
        GL11.glEnd();
    }

    public void Method7062() {
        GL41.glClearDepthf((float)1.0f);
        GL11.glClear((int)(((int)124428372L ^ 0x76AA055) << 8));
        GL11.glColorMask(((int)-1208383183L ^ 0xB7F98931) != 0, ((int)480704336L ^ 0x1CA6F750) != 0, ((int)-551572164L ^ 0xDF1FAD3C) != 0, ((int)3415606L ^ 0x341E36) != 0);
        GL11.glDepthFunc((int)((int)-172942255L ^ 0xF5B11E50));
        GL11.glEnable((int)((int)208388699L ^ 0xC6BC92A));
        GL11.glDepthMask((boolean)((long)-961443227 ^ (long)-961443228));
    }

    public void Method7063() {
        GL11.glColorMask((boolean)((long)445402342 ^ (long)445402343), ((int)-637637701L ^ 0xD9FE6BBA) != 0, (boolean)((long)1136276084 ^ (long)1136276085), (boolean)((long)419926414 ^ (long)419926415));
        GL11.glDepthMask((boolean)((long)1350083937 ^ (long)1350083936));
        GL11.glDepthFunc((int)(((int)653482737L ^ 0x26F35BF0) << 1));
    }

    public void Method7064() {
        GL41.glClearDepthf((float)1.0f);
        GL11.glClear((int)((int)((long)1155232735 ^ (long)1155232730) << 8));
        GL11.glDisable((int)((int)1567322135L ^ 0x5D6B7B66));
        GL11.glDepthFunc((int)((int)((long)-633074073 ^ (long)-633074588)));
        GL11.glDepthMask((boolean)((long)729159797 ^ (long)729159797));
    }

    public int Method7065(String string) {
        return fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string);
    }

    public double Method7066() {
        return agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3707().getScaledWidth_double();
    }

    public double Method7067() {
        return agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3707().getScaledHeight_double();
    }

    public void Method7068(hCtTgnEE6TMT0gFFqDwE9rj9V3nDioMu hCtTgnEE6TMT0gFFqDwE9rj9V3nDioMu2, Color color) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3444(hCtTgnEE6TMT0gFFqDwE9rj9V3nDioMu2.Method6744(), 1.0f, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(color), exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17212);
    }

    public void Method7069(BlockPos blockPos, Color color) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3444(GI1YnXdds8IVC7IycuwMgptf06CmJ6TH.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.getBlockState(blockPos).getSelectedBoundingBox((World)GI1YnXdds8IVC7IycuwMgptf06CmJ6TH.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world, blockPos), 1.0f, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(color), exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17212);
    }

    public void Method7070() {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc((int)((int)((long)1334767335 ^ (long)1334767462) << 1), (int)((int)-1570484779L ^ 0xA2644ED6));
    }

    public void Method7071() {
        this.Method7070();
        GlStateManager.disableDepth();
        GlStateManager.depthMask(((int)-585788948L ^ 0xDD1591EC) != 0);
        GlStateManager.disableCull();
    }

    public void Method7072() {
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
    }

    public void Method7073() {
        this.Method7072();
        GlStateManager.enableDepth();
        GlStateManager.depthMask((boolean)((long)-1970815245 ^ (long)-1970815246));
        GlStateManager.enableCull();
    }

    public static GI1YnXdds8IVC7IycuwMgptf06CmJ6TH Method7074() {
        if (Field16774 != null) return Field16774;
        Field16774 = new GI1YnXdds8IVC7IycuwMgptf06CmJ6TH();
        return Field16774;
    }

    public void Method7075() {
        GL11.glPushMatrix();
    }

    public void Method7076() {
        GL11.glPopMatrix();
    }
}

