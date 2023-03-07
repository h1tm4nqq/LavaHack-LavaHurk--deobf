//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import java.util.Random;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

public class zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB {
    private String Field13278 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static int Method4699(int n, int n2, int n3) {
        return zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4700(n, n2, n3, (int)((long)188593834 ^ (long)188593749));
    }

    public static int Method4700(int n, int n2, int n3, int n4) {
        return (n << (((int)1271708734L ^ 0x4BCCBC3F) << 4)) + (n2 << ((int)((long)1453672029 ^ (long)1453672028) << 3)) + n3 + (n4 << ((int)((long)-1798802119 ^ (long)-1798802118) << 3));
    }

    public static int Method4701(Color color) {
        return zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4700(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public static int[] Method4702(int n) {
        int[] nArray = new int[((int)1825344071L ^ 0x6CCC8A46) << 2];
        nArray[(int)-9068653L ^ 0xFF759F93] = n >> (((int)-1547361396L ^ 0xA3C5238D) << 4) & (int)((long)1907241817 ^ (long)1907241894);
        nArray[(int)1663910615L ^ 0x632D42D6] = n >> ((int)((long)1765314295 ^ (long)1765314294) << 3) & (int)((long)-1731439675 ^ (long)-1731439814);
        nArray[(int)((long)-1715940785 ^ (long)-1715940786) << 1] = n & ((int)-848956114L ^ 0xCD65F5D1);
        nArray[(int)-99136864L ^ 0xFA174AA3] = n >> ((int)((long)-792462642 ^ (long)-792462643) << 3) & ((int)-385308799L ^ 0xE908A77E);
        return nArray;
    }

    public static Color Method4703(int n) {
        int[] nArray = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4702(n);
        return new Color(nArray[(int)-1814016938L ^ 0x93E04C56], nArray[(int)((long)-1926384353 ^ (long)-1926384354)], nArray[((int)-2019914720L ^ 0x879A8C21) << 1], nArray[(int)((long)1413313509 ^ (long)1413313510)]);
    }

    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method4704() {
        float[] fArray = new float[(int)-1142447396L ^ 0xBBE7A2DF];
        fArray[(int)((long)178428273 ^ (long)178428273)] = new Random().nextFloat();
        fArray[(int)((long)-1426922382 ^ (long)-1426922381)] = 1.0f;
        fArray[(int)((long)-1657441387 ^ (long)-1657441388) << 1] = 1.0f;
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3617(fArray, (int)1637286216L ^ 0x619701B7);
    }

    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method4705(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, double d) {
        double d2;
        if (d > 1.0) {
            d2 = d % 1.0;
            d = (int)d % ((int)((long)461446685 ^ (long)461446684) << 1) == 0 ? d2 : 1.0 - d2;
        }
        d2 = 1.0 - d;
        return new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((double)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17321 * d2 + (double)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17321 * d, (double)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17322 * d2 + (double)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17322 * d, (double)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17323 * d2 + (double)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17323 * d, (double)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17324 * d2 + (double)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17324 * d);
    }

    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method4706(float f, float f2) {
        int n = (int)(f / f2 * Float.intBitsToFloat((int)((long)1818581727 ^ (long)790256351)));
        return new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Math.max(Math.min(((int)363542979L ^ 0x15AB393C) - n, (int)((long)-1544719286 ^ (long)-1544719179)), (int)((long)527846864 ^ (long)527846864)), Math.max(Math.min(n, (int)((long)789081968 ^ (long)789081999)), (int)((long)1398041635 ^ (long)1398041635)), (int)65687655L ^ 0x3EA5067, (int)1017341992L ^ 0x3CA368D7);
    }

    public static int Method4707(int n) {
        float f = Float.intBitsToFloat(0x1EE279BB ^ 0x5BD739BB);
        float f2 = (float)(System.currentTimeMillis() % (long)((int)f)) + (float)(((((int)-173159216L ^ 0xF5ADCCAD) << 3) - n) * ((int)-84337341L ^ 0xFAF91D4A));
        while (true) {
            if (!(f2 > f)) {
                if (!((double)(f2 /= f) > Double.longBitsToDouble((long)1497200289 ^ 0x3FE00000593D76A1L))) return Color.HSBtoRGB(f2 += Float.intBitsToFloat(0x41B96C23 ^ 0x7EB96C23), Float.intBitsToFloat(0x3B36C724 ^ 0x410A142), 1.0f);
                f2 = Float.intBitsToFloat(0x21BC7147 ^ 0x1EBC7147) - (f2 - Float.intBitsToFloat((int)571647737L ^ 0x1D12A6F9));
                return Color.HSBtoRGB(f2 += Float.intBitsToFloat(0x41B96C23 ^ 0x7EB96C23), Float.intBitsToFloat(0x3B36C724 ^ 0x410A142), 1.0f);
            }
            f2 -= f;
        }
    }

    public static Color Method4708() {
        long l = 0xE8D5A76FFFL & 0xE8D6E50FFFL;
        float f = (float)(System.nanoTime() + l) / Float.intBitsToFloat((int)((long)2078282767 ^ (long)737482486)) % 1.0f;
        long l2 = Long.parseLong(Integer.toHexString(Color.HSBtoRGB(f, 1.0f, 1.0f)), ((int)-966388708L ^ 0xC666141D) << 4);
        Color color = new Color((int)l2);
        return new Color((float)color.getRed() / Float.intBitsToFloat(0x67847500 ^ 0x24FB7500), (float)color.getGreen() / Float.intBitsToFloat((int)((long)1119457623 ^ (long)29790551)), (float)color.getBlue() / Float.intBitsToFloat(0x10BBE649 ^ 0x53C4E649), (float)color.getAlpha() / Float.intBitsToFloat((int)((long)1682249021 ^ (long)658117949)));
    }

    public static int Method4709(int n, int n2) {
        float f = Float.intBitsToFloat(0x7DE02274 ^ 0x38D56274);
        float f2 = (float)(System.currentTimeMillis() % (long)((int)f)) + (float)((n2 - n) * ((int)-787054972L ^ 0xD1167E8D));
        while (true) {
            if (!(f2 > f)) {
                float f3;
                f2 /= f;
                if (!((double)f3 > Double.longBitsToDouble((long)1645248303 ^ 0x3FE0000062107F2FL))) return Color.HSBtoRGB(f2 += Float.intBitsToFloat((int)219112005L ^ 0x320F6245), Float.intBitsToFloat((int)((long)32574116 ^ (long)1055984292)), 1.0f);
                f2 = Float.intBitsToFloat((int)1052069152L ^ 0x1B54D20) - (f2 - Float.intBitsToFloat((int)((long)194413306 ^ (long)882279162)));
                return Color.HSBtoRGB(f2 += Float.intBitsToFloat((int)219112005L ^ 0x320F6245), Float.intBitsToFloat((int)((long)32574116 ^ (long)1055984292)), 1.0f);
            }
            f2 -= f;
        }
    }

    public static Color Method4710(int n, int n2, int n3) {
        int n4 = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(n, n2);
        return new Color(zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4721(n4), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4722(n4), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4723(n4), n3);
    }

    public static Color Method4711(int n, int n2) {
        return zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4710(n, n2, (int)1620715046L ^ 0x609A26D9);
    }

    public static int Method4712(int n, long l) {
        double d = Math.ceil(System.currentTimeMillis() + l + (long)n) / Double.longBitsToDouble((long)951652714 ^ 0x402E000038B9116AL);
        return Color.getHSBColor((float)((d %= Double.longBitsToDouble(0xE0CEE50B0B2ACA7L ^ 0x4E7A6E50B0B2ACA7L)) / Double.longBitsToDouble(0x5F2B71C75C210C43L ^ 0x1F5DF1C75C210C43L)), Float.intBitsToFloat((int)((long)567778452 ^ (long)521883737)), 1.0f).getRGB();
    }

    public static int Method4713(int n, long l) {
        double d = Math.ceil(System.currentTimeMillis() + l + (long)n) / Double.longBitsToDouble((long)275344953 ^ 0x4008000010696E39L);
        return Color.getHSBColor((float)((d %= Double.longBitsToDouble(0x2688F95FFEDDB6AFL ^ 0x66E7F95FFEDDB6AFL)) / Double.longBitsToDouble(0x9C1984A05C0B5A97L ^ 0xDC7684A05C0B5A97L)), Float.intBitsToFloat((int)504203998L ^ 0x210D8ADE), Float.intBitsToFloat((int)363247306L ^ 0x2ABF2F50)).getRGB();
    }

    public static void Method4714(int n, int n2) {
        float f = (float)(n >> (((int)1507293017L ^ 0x59D77758) << 4) & (int)((long)-590308366 ^ (long)-590308595)) / Float.intBitsToFloat((int)((long)1882173751 ^ (long)860926263));
        float f2 = (float)(n >> ((int)((long)1603163057 ^ (long)1603163056) << 3) & (int)((long)979647639 ^ (long)979647592)) / Float.intBitsToFloat(0x7B110A99 ^ 0x386E0A99);
        float f3 = (float)(n & (int)((long)-911173504 ^ (long)-911173505)) / Float.intBitsToFloat((int)1662338872L ^ 0x206A4738);
        GlStateManager.color((float)f, (float)f2, (float)f3, (float)((float)n2 / Float.intBitsToFloat((int)((long)203583571 ^ (long)1331523667))));
    }

    public static int Method4715(int n, int n2, int n3, int n4) {
        return new Color(n, n2, n3, n4).getRGB();
    }

    public static int Method4716(float f, float f2, float f3, float f4) {
        return new Color(f, f2, f3, f4).getRGB();
    }

    public static int Method4717(int n, int n2, int n3, int n4) {
        return n << ((int)((long)988293411 ^ (long)988293408) << 3) | n2 << ((int)((long)-437441645 ^ (long)-437441646) << 4) | n3 << ((int)((long)2012342670 ^ (long)2012342671) << 3) | n4;
    }

    public static int Method4718(int n, int n2, int n3) {
        return (int)((long)941102908 ^ (long)-954722500) | n << ((int)((long)-547062631 ^ (long)-547062632) << 4) | n2 << (((int)1938551432L ^ 0x738BF289) << 3) | n3;
    }

    public static int Method4719(Color color) {
        return color.getRed() | color.getGreen() << (((int)1063978571L ^ 0x3F6B064A) << 3) | color.getBlue() << (((int)761472959L ^ 0x2D6327BE) << 4) | color.getAlpha() << ((int)((long)-232201889 ^ (long)-232201892) << 3);
    }

    public static Color Method4720(int n, float f, float f2) {
        return Color.getHSBColor((float)((System.currentTimeMillis() + (long)n) % (0x2027D01L & 0x10CC2FF0L)) / Float.intBitsToFloat((int)((long)1030982065 ^ (long)2068285873)), f, f2);
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
        return new Color(zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4721(Color.HSBtoRGB((float)((System.currentTimeMillis() + (long)n) % (0x40303D84L & 0x20066D40L)) / Float.intBitsToFloat(0x7D82B22A ^ 0x3BB6B22A), f, f2)), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4722(Color.HSBtoRGB((float)((System.currentTimeMillis() + (long)n) % (0x464C3F02L & 0x10802DE4L)) / Float.intBitsToFloat((int)1116730718L ^ 0x4BBF55E), f, f2)), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4723(Color.HSBtoRGB((float)((System.currentTimeMillis() + (long)n) % (0x680C2D12L & 0x1133AFA0L)) / Float.intBitsToFloat((int)((long)1552214389 ^ (long)447801717)), f, f2)));
    }

    public static int Method4726(int n) {
        return zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4717(n, n, n, (int)((long)-1108825121 ^ (long)-1108825312));
    }

    public static int Method4727(int n, int n2) {
        return zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4717(n, n, n, n2);
    }

    public static Color Method4728(Color color, int n) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n);
    }

    public static Color Method4729(int n, int n2) {
        return new Color(zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4721(n), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4722(n), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4723(n), n2);
    }

    public static void Method4730(Color color) {
        GL11.glColor4f((float)((float)color.getRed() / Float.intBitsToFloat((int)((long)1561134958 ^ (long)510789486))), (float)((float)color.getGreen() / Float.intBitsToFloat((int)660030782L ^ 0x6428453E)), (float)((float)color.getBlue() / Float.intBitsToFloat((int)((long)1412211846 ^ (long)391357574))), (float)((float)color.getAlpha() / Float.intBitsToFloat((int)((long)856109607 ^ (long)1886925351))));
    }
}

