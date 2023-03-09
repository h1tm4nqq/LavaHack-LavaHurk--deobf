//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import java.util.Random;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

public class Class1172 {
    private String Field13278 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static int Method4699(int n, int n2, int n3) {
        return Class1172.Method4700(n, n2, n3, 255);
    }

    public static int Method4700(int n, int n2, int n3, int n4) {
        return (n << 16) + (n2 << 8) + n3 + (n4 << 24);
    }

    public static int Method4701(Color color) {
        return Class1172.Method4700(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public static int[] Method4702(int n) {
        return new int[]{n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, n >> 24 & 0xFF};
    }

    public static Color Method4703(int n) {
        int[] nArray = Class1172.Method4702(n);
        return new Color(nArray[0], nArray[1], nArray[2], nArray[3]);
    }

    public static Class2027 Method4704() {
        return Class2027.Method3617(new float[]{new Random().nextFloat(), 1.0f, 1.0f}, 255);
    }

    public static Class2027 Method4705(Class2027 class2027, Class2027 class20272, double d) {
        double d2;
        if (d > 1.0) {
            d2 = d % 1.0;
            d = (int)d % 2 == 0 ? d2 : 1.0 - d2;
        }
        d2 = 1.0 - d;
        return new Class2027((double)class2027.Field17321 * d2 + (double)class20272.Field17321 * d, (double)class2027.Field17322 * d2 + (double)class20272.Field17322 * d, (double)class2027.Field17323 * d2 + (double)class20272.Field17323 * d, (double)class2027.Field17324 * d2 + (double)class20272.Field17324 * d);
    }

    public static Class2027 Method4706(float f, float f2) {
        int n = (int)(f / f2 * Float.intBitsToFloat(1132396544));
        return new Class2027(Math.max(Math.min(255 - n, 255), 0), Math.max(Math.min(n, 255), 0), 0, 255);
    }

    public static int Method4707(int n) {
        float f = Float.intBitsToFloat(1161117696);
        float f2 = (float)(System.currentTimeMillis() % (long)((int)f)) + (float)((1000 - n) * 9);
        while (true) {
            if (!(f2 > f)) {
                if (!((double)(f2 /= f) > Double.longBitsToDouble((long)1497200289 ^ 0x3FE00000593D76A1L))) return Color.HSBtoRGB(f2 += Float.intBitsToFloat(0x3F000000), Float.intBitsToFloat(1059481190), 1.0f);
                f2 = Float.intBitsToFloat(0x3F000000) - (f2 - Float.intBitsToFloat(0x3F000000));
                return Color.HSBtoRGB(f2 += Float.intBitsToFloat(0x3F000000), Float.intBitsToFloat(1059481190), 1.0f);
            }
            f2 -= f;
        }
    }

    public static Color Method4708() {
        long l = 999999999999L;
        float f = (float)(System.nanoTime() + l) / Float.intBitsToFloat(1343554297) % 1.0f;
        long l2 = Long.parseLong(Integer.toHexString(Color.HSBtoRGB(f, 1.0f, 1.0f)), 16);
        Color color = new Color((int)l2);
        return new Color((float)color.getRed() / Float.intBitsToFloat(1132396544), (float)color.getGreen() / Float.intBitsToFloat(1132396544), (float)color.getBlue() / Float.intBitsToFloat(1132396544), (float)color.getAlpha() / Float.intBitsToFloat(1132396544));
    }

    public static int Method4709(int n, int n2) {
        float f = Float.intBitsToFloat(1161117696);
        float f2 = (float)(System.currentTimeMillis() % (long)((int)f)) + (float)((n2 - n) * 9);
        while (true) {
            if (!(f2 > f)) {
                float f3;
                f2 /= f;
                if (!((double)f3 > Double.longBitsToDouble((long)1645248303 ^ 0x3FE0000062107F2FL))) return Color.HSBtoRGB(f2 += Float.intBitsToFloat(0x3F000000), Float.intBitsToFloat(0x3F000000), 1.0f);
                f2 = Float.intBitsToFloat(0x3F000000) - (f2 - Float.intBitsToFloat(0x3F000000));
                return Color.HSBtoRGB(f2 += Float.intBitsToFloat(0x3F000000), Float.intBitsToFloat(0x3F000000), 1.0f);
            }
            f2 -= f;
        }
    }

    public static Color Method4710(int n, int n2, int n3) {
        int n4 = Class1172.Method4709(n, n2);
        return new Color(Class1172.Method4721(n4), Class1172.Method4722(n4), Class1172.Method4723(n4), n3);
    }

    public static Color Method4711(int n, int n2) {
        return Class1172.Method4710(n, n2, 255);
    }

    public static int Method4712(int n, long l) {
        double d = Math.ceil(System.currentTimeMillis() + l + (long)n) / Double.longBitsToDouble((long)951652714 ^ 0x402E000038B9116AL);
        return Color.getHSBColor((float)((d %= Double.longBitsToDouble(4645040803167600640L)) / Double.longBitsToDouble(4645040803167600640L)), Float.intBitsToFloat(1053609165), 1.0f).getRGB();
    }

    public static int Method4713(int n, long l) {
        double d = Math.ceil(System.currentTimeMillis() + l + (long)n) / Double.longBitsToDouble((long)275344953 ^ 0x4008000010696E39L);
        return Color.getHSBColor((float)((d %= Double.longBitsToDouble(4642929740842270720L)) / Double.longBitsToDouble(4642929740842270720L)), Float.intBitsToFloat(0x3F000000), Float.intBitsToFloat(1058642330)).getRGB();
    }

    public static void Method4714(int n, int n2) {
        float f = (float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f2 = (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f3 = (float)(n & 0xFF) / Float.intBitsToFloat(1132396544);
        GlStateManager.color((float)f, (float)f2, (float)f3, (float)((float)n2 / Float.intBitsToFloat(1132396544)));
    }

    public static int Method4715(int n, int n2, int n3, int n4) {
        return new Color(n, n2, n3, n4).getRGB();
    }

    public static int Method4716(float f, float f2, float f3, float f4) {
        return new Color(f, f2, f3, f4).getRGB();
    }

    public static int Method4717(int n, int n2, int n3, int n4) {
        return n << 24 | n2 << 16 | n3 << 8 | n4;
    }

    public static int Method4718(int n, int n2, int n3) {
        return 0xFF000000 | n << 16 | n2 << 8 | n3;
    }

    public static int Method4719(Color color) {
        return color.getRed() | color.getGreen() << 8 | color.getBlue() << 16 | color.getAlpha() << 24;
    }

    public static Color Method4720(int n, float f, float f2) {
        return Color.getHSBColor((float)((System.currentTimeMillis() + (long)n) % 11520L) / Float.intBitsToFloat(1177812992), f, f2);
    }

    public static int Method4721(int n) {
        return new Color(n).getRed();
    }

    public static int Method4722(int n) {
        return new Color(n).getGreen();
    }

    public static int Method4723(int n) {
        return new Color(n).getBlue();
    }

    public static int Method4724(int n) {
        return new Color(n).getAlpha();
    }

    public static Color Method4725(int n, float f, float f2) {
        return new Color(Class1172.Method4721(Color.HSBtoRGB((float)((System.currentTimeMillis() + (long)n) % 11520L) / Float.intBitsToFloat(1177812992), f, f2)), Class1172.Method4722(Color.HSBtoRGB((float)((System.currentTimeMillis() + (long)n) % 11520L) / Float.intBitsToFloat(1177812992), f, f2)), Class1172.Method4723(Color.HSBtoRGB((float)((System.currentTimeMillis() + (long)n) % 11520L) / Float.intBitsToFloat(1177812992), f, f2)));
    }

    public static int Method4726(int n) {
        return Class1172.Method4717(n, n, n, 255);
    }

    public static int Method4727(int n, int n2) {
        return Class1172.Method4717(n, n, n, n2);
    }

    public static Color Method4728(Color color, int n) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n);
    }

    public static Color Method4729(int n, int n2) {
        return new Color(Class1172.Method4721(n), Class1172.Method4722(n), Class1172.Method4723(n), n2);
    }

    public static void Method4730(Color color) {
        GL11.glColor4f((float)((float)color.getRed() / Float.intBitsToFloat(1132396544)), (float)((float)color.getGreen() / Float.intBitsToFloat(1132396544)), (float)((float)color.getBlue() / Float.intBitsToFloat(1132396544)), (float)((float)color.getAlpha() / Float.intBitsToFloat(1132396544)));
    }
}

