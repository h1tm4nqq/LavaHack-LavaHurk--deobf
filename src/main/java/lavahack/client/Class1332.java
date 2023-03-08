//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;
import java.awt.*;

@Deprecated
public class Class1332
{
    public static final Tessellator Field14099;
    public static final BufferBuilder Field14100;
    private String Field14101 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method5373(final Class1533 class1533, final Class1533 class1534, final Class1533 class1535, final Class1533 class1536) {
        Class1332.Field14100.begin(7, DefaultVertexFormats.POSITION_COLOR);
        Method5379(class1533);
        Method5379(class1534);
        Method5379(class1535);
        Method5379(class1536);
        Class1332.Field14099.draw();
    }
    
    public static void Method5374(final Class1533 class1533, final Class1533 class1534) {
        Class1332.Field14100.begin(7, DefaultVertexFormats.POSITION_COLOR);
        Method5379(class1533);
        Method5379(Method5385(Class1533.Method6078(class1533), Class1533.Method6079(class1534), Class1533.Method6080(class1533)));
        Method5379(class1534);
        Method5379(Method5385(Class1533.Method6078(class1534), Class1533.Method6079(class1533), Class1533.Method6080(class1533)));
        Class1332.Field14099.draw();
    }
    
    public static void Method5375() {
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
    
    public static void Method5376() {
        GL11.glDisable(2848);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.depthMask(true);
        GlStateManager.enableDepth();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    
    public static void Method5377() {
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
        GlStateManager.shadeModel(7425);
    }
    
    public static void Method5378() {
        GlStateManager.enableCull();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel(7424);
    }
    
    public static void Method5379(final Class1533 class1533) {
        Class1332.Field14100.pos((double)class1533.Method6075(), (double)class1533.Method6076(), 0.0).color(class1533.Method6077().getRed(), class1533.Method6077().getGreen(), class1533.Method6077().getBlue(), class1533.Method6077().getAlpha());
    }
    
    public static void Method5380(final Class1828 class1828) {
        Class1332.Field14100.pos((double)class1828.Method6883(), (double)class1828.Method6884(), (double)class1828.Method6885()).color(class1828.Method6886().getRed(), class1828.Method6886().getGreen(), class1828.Method6886().getBlue(), class1828.Method6886().getAlpha());
    }
    
    public static Color Method5381(final int r, final int g, final int b) {
        return new Color(r, g, b);
    }
    
    public static Color Method5382(final float n, final float n2, final float n3) {
        return new Color((int)(n * Float.intBitsToFloat(1132396544)), (int)(n2 * Float.intBitsToFloat(1132396544)), (int)(n3 * Float.intBitsToFloat(1132396544)));
    }
    
    public static Color Method5383(final int r, final int g, final int b, final int a) {
        return new Color(r, g, b, a);
    }
    
    public static Color Method5384(final float n, final float n2, final float n3, final float n4) {
        return new Color((int)(n * Float.intBitsToFloat(1132396544)), (int)(n2 * Float.intBitsToFloat(1132396544)), (int)(n3 * Float.intBitsToFloat(1132396544)), (int)(n4 * Float.intBitsToFloat(1132396544)));
    }
    
    public static Class1533 Method5385(final Number n, final Number n2, final Color color) {
        return new Class1533(n, n2, color);
    }
    
    public static Class1828 Method5386(final Number n, final Number n2, final Number n3, final Color color) {
        return new Class1828(n, n2, n3, color);
    }
    
    static {
        Field14099 = Tessellator.getInstance();
        Field14100 = Class1332.Field14099.getBuffer();
    }
}
