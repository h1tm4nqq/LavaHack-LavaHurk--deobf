//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.shader.Framebuffer
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import java.awt.Color;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public class Class515 {
    private String Field10189 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method2371(float f) {
        Class515.Method2377();
        GL11.glPushAttrib((int)1048575);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)f);
        GL11.glEnable((int)2848);
        GL11.glEnable((int)2960);
        GL11.glClear((int)1024);
        GL11.glClearStencil((int)15);
        GL11.glStencilFunc((int)512, (int)1, (int)15);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    public static void Method2372() {
        GL11.glStencilFunc((int)512, (int)0, (int)15);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6914);
    }

    public static void Method2373() {
        GL11.glStencilFunc((int)514, (int)1, (int)15);
        GL11.glStencilOp((int)7680, (int)7680, (int)7680);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    public static void Method2374(int n, float f) {
        Class515.Method2376(new Color(n));
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)10754);
        GL11.glPolygonOffset((float)f, (float)Float.intBitsToFloat(-906746880));
        OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)Float.intBitsToFloat(1131413504), (float)Float.intBitsToFloat(1131413504));
    }

    public static void Method2375(float f) {
        GL11.glPolygonOffset((float)(-f), (float)Float.intBitsToFloat(1240736768));
        GL11.glDisable((int)10754);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)2960);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)3008);
        GL11.glPopAttrib();
    }

    public static void Method2376(Color color) {
        GL11.glColor4d((double)((float)color.getRed() / Float.intBitsToFloat(1132396544)), (double)((float)color.getGreen() / Float.intBitsToFloat(1132396544)), (double)((float)color.getBlue() / Float.intBitsToFloat(1132396544)), (double)((float)color.getAlpha() / Float.intBitsToFloat(1132396544)));
    }

    public static void Method2377() {
        Framebuffer framebuffer = Class2142.Field17803.getFramebuffer();
        if (framebuffer.depthBuffer <= -1) return;
        Class515.Method2378(framebuffer);
        framebuffer.depthBuffer = -1;
    }

    public static void Method2378(Framebuffer framebuffer) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)framebuffer.depthBuffer);
        int n = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)n);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)Class2142.Field17803.displayWidth, (int)Class2142.Field17803.displayHeight);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)n);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36096, (int)36161, (int)n);
    }
}

