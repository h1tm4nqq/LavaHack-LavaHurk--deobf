//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import org.lwjgl.opengl.*;
import com.kisman.cc.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraft.client.renderer.*;

public class Class1908 implements Class2142
{
    private static Class1908 Field16774;
    private String Field16775 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1908() {
    }
    
    public void Method7058(final String s, final Class870 class870, final Color color) {
        Class1178.Method4745(s, class870.Field11662, class870.Field11663, color.getRGB());
    }
    
    public void Method7059(final Class870 class870, final Class870 class871, final Color color) {
        Class753.drawRect(class870.Field11662, class870.Field11663, class871.Field11662, class871.Field11663, color.getRGB());
    }
    
    public void Method7060(final Class870 class870, final Class870 class871, final Color color) {
        this.Method7061(class870, class871, color, Float.intBitsToFloat(1056964608));
    }
    
    public void Method7061(final Class870 class870, final Class870 class871, final Color color, final float n) {
        GL11.glColor4f((float)color.getRed(), (float)color.getGreen(), (float)color.getBlue(), (float)color.getAlpha());
        GL11.glLineWidth(n);
        GL11.glBegin(1);
        GL11.glVertex2d(class870.Field11662, class870.Field11663);
        GL11.glVertex2d(class871.Field11662, class871.Field11663);
        GL11.glEnd();
    }
    
    public void Method7062() {
        GL41.glClearDepthf(1.0f);
        GL11.glClear(256);
        GL11.glColorMask(false, false, false, false);
        GL11.glDepthFunc(513);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
    }
    
    public void Method7063() {
        GL11.glColorMask(true, true, true, true);
        GL11.glDepthMask(true);
        GL11.glDepthFunc(514);
    }
    
    public void Method7064() {
        GL41.glClearDepthf(1.0f);
        GL11.glClear(1280);
        GL11.glDisable(2929);
        GL11.glDepthFunc(515);
        GL11.glDepthMask(false);
    }
    
    public int Method7065(final String s) {
        return Class1178.Method4741(s);
    }
    
    public double Method7066() {
        return Class886.Method3707().getScaledWidth_double();
    }
    
    public double Method7067() {
        return Class886.Method3707().getScaledHeight_double();
    }
    
    public void Method7068(final Class1779 class1779, final Color color) {
        Class815.Method3444(class1779.Method6744(), 1.0f, new Class2027(color), Class815.Field11486, Class815.Field11486, Class815.Field11486, Class815.Field11486, Class815.Field11486, Class2008.Field17212);
    }
    
    public void Method7069(final BlockPos blockPos, final Color color) {
        Class815.Method3444(Class1908.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class1908.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world, blockPos), 1.0f, new Class2027(color), Class815.Field11486, Class815.Field11486, Class815.Field11486, Class815.Field11486, Class815.Field11486, Class2008.Field17212);
    }
    
    public void Method7070() {
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(770, 771);
    }
    
    public void Method7071() {
        this.Method7070();
        GlStateManager.disableDepth();
        GlStateManager.depthMask(false);
        GlStateManager.disableCull();
    }
    
    public void Method7072() {
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
    }
    
    public void Method7073() {
        this.Method7072();
        GlStateManager.enableDepth();
        GlStateManager.depthMask(true);
        GlStateManager.enableCull();
    }
    
    public static Class1908 Method7074() {
        if (Class1908.Field16774 == null) {
            Class1908.Field16774 = new Class1908();
        }
        return Class1908.Field16774;
    }
    
    public void Method7075() {
        GL11.glPushMatrix();
    }
    
    public void Method7076() {
        GL11.glPopMatrix();
    }
}
