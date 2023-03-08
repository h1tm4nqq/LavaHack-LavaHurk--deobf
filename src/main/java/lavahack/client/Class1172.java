//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import com.kisman.cc.util.*;
import java.util.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;

public class Class1172
{
    private String Field13278 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static int Method4699(final int n, final int n2, final int n3) {
        return Method4700(n, n2, n3, 255);
    }
    
    public static int Method4700(final int n, final int n2, final int n3, final int n4) {
        return (n << 16) + (n2 << 8) + n3 + (n4 << 24);
    }
    
    public static int Method4701(final Color color) {
        return Method4700(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }
    
    public static int[] Method4702(final int n) {
        return new int[] { n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, n >> 24 & 0xFF };
    }
    
    public static Color Method4703(final int n) {
        final int[] method4702 = Method4702(n);
        return new Color(method4702[0], method4702[1], method4702[2], method4702[3]);
    }
    
    public static Class2027 Method4704() {
        return Class2027.Method3617(new float[] { new Random().nextFloat(), 1.0f, 1.0f }, 255);
    }
    
    public static Class2027 Method4705(final Class2027 class2027, final Class2027 class2028, double n) {
        if (n > 1.0) {
            final double n2 = n % 1.0;
            n = (((int)n % 2 == 0) ? n2 : (1.0 - n2));
        }
        final double n3 = 1.0 - n;
        return new Class2027(class2027.Field17321 * n3 + class2028.Field17321 * n, class2027.Field17322 * n3 + class2028.Field17322 * n, class2027.Field17323 * n3 + class2028.Field17323 * n, class2027.Field17324 * n3 + class2028.Field17324 * n);
    }
    
    public static Class2027 Method4706(final float n, final float n2) {
        final int a = (int)(n / n2 * Float.intBitsToFloat(1132396544));
        return new Class2027(Math.max(Math.min(255 - a, 255), 0), Math.max(Math.min(a, 255), 0), 0, 255);
    }
    
    public static int Method4707(final int n) {
        float intBitsToFloat;
        float n2;
        for (intBitsToFloat = Float.intBitsToFloat(1161117696), n2 = System.currentTimeMillis() % (int)intBitsToFloat + (float)((1000 - n) * 9); n2 > intBitsToFloat; n2 -= intBitsToFloat) {}
        float n3 = n2 / intBitsToFloat;
        if (n3 > Double.longBitsToDouble((long)1497200289 ^ 0x3FE00000593D76A1L)) {
            n3 = Float.intBitsToFloat(1056964608) - (n3 - Float.intBitsToFloat(1056964608));
        }
        return Color.HSBtoRGB(n3 + Float.intBitsToFloat(1056964608), Float.intBitsToFloat(1059481190), 1.0f);
    }
    
    public static Color Method4708() {
        final Color color = new Color((int)Long.parseLong(Integer.toHexString(Color.HSBtoRGB((System.nanoTime() + 999999999999L) / Float.intBitsToFloat(1343554297) % 1.0f, 1.0f, 1.0f)), 16));
        return new Color(color.getRed() / Float.intBitsToFloat(1132396544), color.getGreen() / Float.intBitsToFloat(1132396544), color.getBlue() / Float.intBitsToFloat(1132396544), color.getAlpha() / Float.intBitsToFloat(1132396544));
    }
    
    public static int Method4709(final int n, final int n2) {
        float intBitsToFloat;
        float n3;
        for (intBitsToFloat = Float.intBitsToFloat(1161117696), n3 = System.currentTimeMillis() % (int)intBitsToFloat + (float)((n2 - n) * 9); n3 > intBitsToFloat; n3 -= intBitsToFloat) {}
        float n4;
        if ((n4 = n3 / intBitsToFloat) > Double.longBitsToDouble((long)1645248303 ^ 0x3FE0000062107F2FL)) {
            n4 = Float.intBitsToFloat(1056964608) - (n4 - Float.intBitsToFloat(1056964608));
        }
        return Color.HSBtoRGB(n4 + Float.intBitsToFloat(1056964608), Float.intBitsToFloat(1056964608), 1.0f);
    }
    
    public static Color Method4710(final int n, final int n2, final int a) {
        final int method4709 = Method4709(n, n2);
        return new Color(Method4721(method4709), Method4722(method4709), Method4723(method4709), a);
    }
    
    public static Color Method4711(final int n, final int n2) {
        return Method4710(n, n2, 255);
    }
    
    public static int Method4712(final int n, final long n2) {
        return Color.getHSBColor((float)(Math.ceil((double)(System.currentTimeMillis() + n2 + n)) / Double.longBitsToDouble((long)951652714 ^ 0x402E000038B9116AL) % Double.longBitsToDouble(4645040803167600640L) / Double.longBitsToDouble(4645040803167600640L)), Float.intBitsToFloat(1053609165), 1.0f).getRGB();
    }
    
    public static int Method4713(final int n, final long n2) {
        return Color.getHSBColor((float)(Math.ceil((double)(System.currentTimeMillis() + n2 + n)) / Double.longBitsToDouble((long)275344953 ^ 0x4008000010696E39L) % Double.longBitsToDouble(4642929740842270720L) / Double.longBitsToDouble(4642929740842270720L)), Float.intBitsToFloat(1056964608), Float.intBitsToFloat(1058642330)).getRGB();
    }
    
    public static void Method4714(final int n, final int n2) {
        GlStateManager.color((n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (n & 0xFF) / Float.intBitsToFloat(1132396544), n2 / Float.intBitsToFloat(1132396544));
    }
    
    public static int Method4715(final int r, final int g, final int b, final int a) {
        return new Color(r, g, b, a).getRGB();
    }
    
    public static int Method4716(final float r, final float g, final float b, final float a) {
        return new Color(r, g, b, a).getRGB();
    }
    
    public static int Method4717(final int n, final int n2, final int n3, final int n4) {
        return n << 24 | n2 << 16 | n3 << 8 | n4;
    }
    
    public static int Method4718(final int n, final int n2, final int n3) {
        return 0xFF000000 | n << 16 | n2 << 8 | n3;
    }
    
    public static int Method4719(final Color color) {
        return color.getRed() | color.getGreen() << 8 | color.getBlue() << 16 | color.getAlpha() << 24;
    }
    
    public static Color Method4720(final int n, final float s, final float b) {
        return Color.getHSBColor((System.currentTimeMillis() + n) % 11520L / Float.intBitsToFloat(1177812992), s, b);
    }
    
    public static int Method4721(final int rgb) {
        return new Color(rgb).getRed();
    }
    
    public static int Method4722(final int rgb) {
        return new Color(rgb).getGreen();
    }
    
    public static int Method4723(final int rgb) {
        return new Color(rgb).getBlue();
    }
    
    public static int Method4724(final int rgb) {
        return new Color(rgb).getAlpha();
    }
    
    public static Color Method4725(final int n, final float saturation, final float brightness) {
        return new Color(Method4721(Color.HSBtoRGB((System.currentTimeMillis() + n) % 11520L / Float.intBitsToFloat(1177812992), saturation, brightness)), Method4722(Color.HSBtoRGB((System.currentTimeMillis() + n) % 11520L / Float.intBitsToFloat(1177812992), saturation, brightness)), Method4723(Color.HSBtoRGB((System.currentTimeMillis() + n) % 11520L / Float.intBitsToFloat(1177812992), saturation, brightness)));
    }
    
    public static int Method4726(final int n) {
        return Method4717(n, n, n, 255);
    }
    
    public static int Method4727(final int n, final int n2) {
        return Method4717(n, n, n, n2);
    }
    
    public static Color Method4728(final Color color, final int a) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), a);
    }
    
    public static Color Method4729(final int n, final int a) {
        return new Color(Method4721(n), Method4722(n), Method4723(n), a);
    }
    
    public static void Method4730(final Color color) {
        GL11.glColor4f(color.getRed() / Float.intBitsToFloat(1132396544), color.getGreen() / Float.intBitsToFloat(1132396544), color.getBlue() / Float.intBitsToFloat(1132396544), color.getAlpha() / Float.intBitsToFloat(1132396544));
    }
}
