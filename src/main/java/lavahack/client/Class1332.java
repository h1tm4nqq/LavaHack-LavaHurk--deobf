//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.Class1533;
import lavahack.client.Class1828;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

@Deprecated
public class Class1332 {
    public static final Tessellator Field14099 = Tessellator.getInstance();
    public static final BufferBuilder Field14100 = Field14099.getBuffer();
    private String Field14101 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method5373(Class1533 class1533, Class1533 class15332, Class1533 class15333, Class1533 class15334) {
        Field14100.begin(7, DefaultVertexFormats.POSITION_COLOR);
        Class1332.Method5379(class1533);
        Class1332.Method5379(class15332);
        Class1332.Method5379(class15333);
        Class1332.Method5379(class15334);
        Field14099.draw();
    }

    public static void Method5374(Class1533 class1533, Class1533 class15332) {
        Field14100.begin(7, DefaultVertexFormats.POSITION_COLOR);
        Class1332.Method5379(class1533);
        Class1332.Method5379(Class1332.Method5385(Class1533.Method6078(class1533), Class1533.Method6079(class15332), Class1533.Method6080(class1533)));
        Class1332.Method5379(class15332);
        Class1332.Method5379(Class1332.Method5385(Class1533.Method6078(class15332), Class1533.Method6079(class1533), Class1533.Method6080(class1533)));
        Field14099.draw();
    }

    public static void Method5375() {
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

    public static void Method5376() {
        GL11.glDisable((int)2848);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.depthMask((boolean)true);
        GlStateManager.enableDepth();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public static void Method5377() {
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
        GlStateManager.shadeModel((int)7425);
    }

    public static void Method5378() {
        GlStateManager.enableCull();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel((int)7424);
    }

    public static void Method5379(Class1533 class1533) {
        Field14100.pos(((Double)class1533.Method6075()).doubleValue(), ((Double)class1533.Method6076()).doubleValue(), 0.0).color(class1533.Method6077().getRed(), class1533.Method6077().getGreen(), class1533.Method6077().getBlue(), class1533.Method6077().getAlpha());
    }

    public static void Method5380(Class1828 class1828) {
        Field14100.pos(((Double)class1828.Method6883()).doubleValue(), ((Double)class1828.Method6884()).doubleValue(), ((Double)class1828.Method6885()).doubleValue()).color(class1828.Method6886().getRed(), class1828.Method6886().getGreen(), class1828.Method6886().getBlue(), class1828.Method6886().getAlpha());
    }

    public static Color Method5381(int n, int n2, int n3) {
        return new Color(n, n2, n3);
    }

    public static Color Method5382(float f, float f2, float f3) {
        return new Color((int)(f * Float.intBitsToFloat(1132396544)), (int)(f2 * Float.intBitsToFloat(1132396544)), (int)(f3 * Float.intBitsToFloat(1132396544)));
    }

    public static Color Method5383(int n, int n2, int n3, int n4) {
        return new Color(n, n2, n3, n4);
    }

    public static Color Method5384(float f, float f2, float f3, float f4) {
        return new Color((int)(f * Float.intBitsToFloat(1132396544)), (int)(f2 * Float.intBitsToFloat(1132396544)), (int)(f3 * Float.intBitsToFloat(1132396544)), (int)(f4 * Float.intBitsToFloat(1132396544)));
    }

    public static Class1533 Method5385(Number number, Number number2, Color color) {
        return new Class1533(number, number2, color);
    }

    public static Class1828 Method5386(Number number, Number number2, Number number3, Color color) {
        return new Class1828(number, number2, number3, color);
    }
}

