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

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class2142;
import com.kisman.cc.util.Class886;
import java.awt.Color;
import lavahack.client.Class1178;
import lavahack.client.Class1779;
import lavahack.client.Class2008;
import lavahack.client.Class753;
import lavahack.client.Class815;
import lavahack.client.Class870;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL41;

public class Class1908
implements Class2142 {
    private static Class1908 Field16774;
    private String Field16775 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1908() {
    }

    public void Method7058(String string, Class870 class870, Color color) {
        Class1178.Method4745(string, class870.Field11662, class870.Field11663, color.getRGB());
    }

    public void Method7059(Class870 class870, Class870 class8702, Color color) {
        Class753.drawRect(class870.Field11662, class870.Field11663, class8702.Field11662, class8702.Field11663, color.getRGB());
    }

    public void Method7060(Class870 class870, Class870 class8702, Color color) {
        this.Method7061(class870, class8702, color, Float.intBitsToFloat(0x3F000000));
    }

    public void Method7061(Class870 class870, Class870 class8702, Color color, float f) {
        GL11.glColor4f((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), (float)color.getAlpha());
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)class870.Field11662, (double)class870.Field11663);
        GL11.glVertex2d((double)class8702.Field11662, (double)class8702.Field11663);
        GL11.glEnd();
    }

    public void Method7062() {
        GL41.glClearDepthf((float)1.0f);
        GL11.glClear((int)256);
        GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
        GL11.glDepthFunc((int)513);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
    }

    public void Method7063() {
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glDepthMask((boolean)true);
        GL11.glDepthFunc((int)514);
    }

    public void Method7064() {
        GL41.glClearDepthf((float)1.0f);
        GL11.glClear((int)1280);
        GL11.glDisable((int)2929);
        GL11.glDepthFunc((int)515);
        GL11.glDepthMask((boolean)false);
    }

    public int Method7065(String string) {
        return Class1178.Method4741(string);
    }

    public double Method7066() {
        return Class886.Method3707().getScaledWidth_double();
    }

    public double Method7067() {
        return Class886.Method3707().getScaledHeight_double();
    }

    public void Method7068(Class1779 class1779, Color color) {
        Class815.Method3444(class1779.Method6744(), 1.0f, new Class2027(color), Class815.Field11486, Class815.Field11486, Class815.Field11486, Class815.Field11486, Class815.Field11486, Class2008.Field17212);
    }

    public void Method7069(BlockPos blockPos, Color color) {
        Class815.Method3444(Class1908.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class1908.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world, blockPos), 1.0f, new Class2027(color), Class815.Field11486, Class815.Field11486, Class815.Field11486, Class815.Field11486, Class815.Field11486, Class2008.Field17212);
    }

    public void Method7070() {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc((int)770, (int)771);
    }

    public void Method7071() {
        this.Method7070();
        GlStateManager.disableDepth();
        GlStateManager.depthMask((boolean)false);
        GlStateManager.disableCull();
    }

    public void Method7072() {
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
    }

    public void Method7073() {
        this.Method7072();
        GlStateManager.enableDepth();
        GlStateManager.depthMask((boolean)true);
        GlStateManager.enableCull();
    }

    public static Class1908 Method7074() {
        if (Field16774 != null) return Field16774;
        Field16774 = new Class1908();
        return Field16774;
    }

    public void Method7075() {
        GL11.glPushMatrix();
    }

    public void Method7076() {
        GL11.glPopMatrix();
    }
}

