//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import net.minecraft.client.renderer.*;
import com.kisman.cc.util.*;
import net.minecraft.client.shader.*;
import org.lwjgl.opengl.*;

public class Class515
{
    private String Field10189 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method2371(final float n) {
        Method2377();
        GL11.glPushAttrib(1048575);
        GL11.glDisable(3008);
        GL11.glDisable(3553);
        GL11.glDisable(2896);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glLineWidth(n);
        GL11.glEnable(2848);
        GL11.glEnable(2960);
        GL11.glClear(1024);
        GL11.glClearStencil(15);
        GL11.glStencilFunc(512, 1, 15);
        GL11.glStencilOp(7681, 7681, 7681);
        GL11.glPolygonMode(1032, 6913);
    }
    
    public static void Method2372() {
        GL11.glStencilFunc(512, 0, 15);
        GL11.glStencilOp(7681, 7681, 7681);
        GL11.glPolygonMode(1032, 6914);
    }
    
    public static void Method2373() {
        GL11.glStencilFunc(514, 1, 15);
        GL11.glStencilOp(7680, 7680, 7680);
        GL11.glPolygonMode(1032, 6913);
    }
    
    public static void Method2374(final int rgb, final float n) {
        Method2376(new Color(rgb));
        GL11.glDepthMask(false);
        GL11.glDisable(2929);
        GL11.glEnable(10754);
        GL11.glPolygonOffset(n, Float.intBitsToFloat(-906746880));
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, Float.intBitsToFloat(1131413504), Float.intBitsToFloat(1131413504));
    }
    
    public static void Method2375(final float n) {
        GL11.glPolygonOffset(-n, Float.intBitsToFloat(1240736768));
        GL11.glDisable(10754);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        GL11.glDisable(2960);
        GL11.glDisable(2848);
        GL11.glHint(3154, 4352);
        GL11.glEnable(3042);
        GL11.glEnable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(3008);
        GL11.glPopAttrib();
    }
    
    public static void Method2376(final Color color) {
        GL11.glColor4d((double)(color.getRed() / Float.intBitsToFloat(1132396544)), (double)(color.getGreen() / Float.intBitsToFloat(1132396544)), (double)(color.getBlue() / Float.intBitsToFloat(1132396544)), (double)(color.getAlpha() / Float.intBitsToFloat(1132396544)));
    }
    
    public static void Method2377() {
        final Framebuffer getFramebuffer = Class2142.Field17803.getFramebuffer();
        if (getFramebuffer.depthBuffer > -1) {
            Method2378(getFramebuffer);
            getFramebuffer.depthBuffer = -1;
        }
    }
    
    public static void Method2378(final Framebuffer framebuffer) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT(framebuffer.depthBuffer);
        final int glGenRenderbuffersEXT = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT(36161, glGenRenderbuffersEXT);
        EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, Class2142.Field17803.displayWidth, Class2142.Field17803.displayHeight);
        EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, glGenRenderbuffersEXT);
        EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36096, 36161, glGenRenderbuffersEXT);
    }
}
