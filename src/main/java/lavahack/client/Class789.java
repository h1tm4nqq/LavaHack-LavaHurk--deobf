//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.awt.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;

public class Class789 extends Class1514
{
    private static final int Field11336;
    private static final int Field11337;
    private final int Field11338;
    private final int Field11339;
    private boolean Field11340;
    private boolean Field11341;
    private Class2027 Field11342;
    private boolean Field11343;
    private float[] Field11344;
    private boolean Field11345;
    private boolean Field11346;
    private boolean Field11347;
    private int Field11348;
    private int Field11349;
    private int Field11350;
    private int Field11351;
    private int Field11352;
    private int Field11353;
    private int Field11354;
    private int Field11355;
    private int Field11356;
    private int Field11357;
    private int Field11358;
    private int Field11359;
    private int Field11360;
    private int Field11361;
    private int Field11362;
    private int Field11363;
    private Class2027 Field11364;
    private Class994 Field11365;
    private Class994 Field11366;
    private String Field11367 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class789(final Class1876 class1876, final Class2027 field11342, final int field11343, final int field11344) {
        super(class1876);
        this.Field11338 = field11343;
        this.Field11339 = field11344;
        this.Field11342 = field11342;
        final float[] rgBtoHSB = Color.RGBtoHSB(this.Field11342.Field17321, this.Field11342.Field17322, this.Field11342.Field17323, null);
        this.Field11344 = new float[] { rgBtoHSB[0], rgBtoHSB[1], rgBtoHSB[2], this.Field11342.Field17328 };
        final boolean field11345 = false;
        this.Field11346 = field11345;
        this.Field11347 = field11345;
        this.Field11345 = field11345;
        this.Field11350 = 120;
        this.Field11351 = 100;
        this.Field11348 = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / 2;
        this.Field11349 = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2 + field11344 / 2;
        this.Field11352 = this.Field11348;
        this.Field11353 = this.Field11349 + this.Field11351 + 6;
        this.Field11354 = this.Field11350;
        this.Field11355 = 10;
        this.Field11356 = this.Field11348 + this.Field11350 + 6;
        this.Field11357 = this.Field11349;
        this.Field11358 = 10;
        this.Field11359 = this.Field11351;
        this.Field11360 = this.Field11348;
        this.Field11361 = this.Field11353 + this.Field11355 + 6;
        this.Field11363 = Class1178.Method4748() + 10;
        this.Field11362 = this.Field11363;
        this.Method3280();
        this.Method3281();
    }
    
    public Class789(final Class1876 class1876, final Class2027 class1877) {
        this(class1876, class1877, 180, 24);
    }
    
    private void Method3280() {
        if (this.Field11341) {
            this.Method676((this.Field11350 + 6 + this.Field11358) * 2);
        }
        else {
            this.Method676(this.Field11338);
        }
    }
    
    private void Method3281() {
        if (this.Field11341) {
            this.Method678(this.Field11339 + (this.Field11351 + 12 + this.Field11355 + this.Field11363) * 2);
        }
        else {
            this.Method678(this.Field11339);
        }
    }
    
    public void Method668() {
        this.Field11348 = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / 2;
        this.Field11349 = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2 + this.Field11339 / 2;
        this.Field11352 = this.Field11348;
        this.Field11353 = this.Field11349 + this.Field11351 + 6;
        this.Field11354 = this.Field11350;
        this.Field11355 = 10;
        this.Field11356 = this.Field11348 + this.Field11350 + 6;
        this.Field11357 = this.Field11349;
        this.Field11358 = 10;
        this.Field11359 = this.Field11351;
        this.Field11360 = this.Field11348;
        this.Field11361 = this.Field11353 + this.Field11355 + 6;
        this.Field11363 = Class1178.Method4748() + 10;
        this.Field11362 = this.Field11363;
        this.Method3280();
        this.Method3281();
        if (!this.Field11341) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Method677(), this.Field11342.Method3625());
        }
        if (this.Field11341) {
            final String string = "Red: " + this.Field11342.Field17321 + " Green: " + this.Field11342.Field17322 + " Blue: " + this.Field11342.Field17323;
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(string) / 2, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field11339 / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(string) / 2, string, Class1039.Field12573);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Method677(), 1.0f, this.Field11340 ? Class1039.Field12571 : Class1039.Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect((double)(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / 2), (double)(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2), (double)((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675()) / 2), (double)((this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field11339) / 2), this.Field11342.Method3625(), null.Field11788.Method367());
        }
        if (this.Field11341) {
            final int n = this.Field11348 + this.Field11350 + 6;
            final int n2 = this.Field11349 + this.Field11351 + 6;
            final int n3 = 10;
            final int n4 = 10;
            final int hsBtoRGB = Color.HSBtoRGB(this.Field11344[0], 1.0f, 1.0f);
            final float n5 = (hsBtoRGB >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n6 = (hsBtoRGB >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n7 = (hsBtoRGB & 0xFF) / Float.intBitsToFloat(1132396544);
            this.Method3296(this.Field11348, this.Field11349, this.Field11350, this.Field11351, n5, n6, n7, this.Field11344[3]);
            this.Method3294(this.Field11352, this.Field11353, this.Field11354, this.Field11355, this.Field11344[0]);
            this.Method3295(this.Field11356, this.Field11357, this.Field11358, this.Field11359, n5, n6, n7, this.Field11344[3]);
            this.Field11364 = this.Method3283(new Color(Color.HSBtoRGB(this.Field11344[0], this.Field11344[1], this.Field11344[2])), this.Field11344[3]);
            Gui.drawRect(n, n2, n + n3, n2 + n4, this.Field11364.Method3626());
            final int n8 = (int)(this.Field11348 + this.Field11344[1] * this.Field11350);
            final int n9 = (int)(this.Field11349 + this.Field11351 - this.Field11344[2] * this.Field11351);
            Gui.drawRect(n8 - 2, n9 - 2, n8 + 2, n9 + 2, -1);
            this.Field11342 = this.Field11364;
        }
        if (this.Field11365 != null) {
            this.Field11365.Method4024(this.Field11342);
        }
        if (this.Field11366 != null) {
            this.Field11366.Method4024(this.Field11343);
        }
    }
    
    public void Method669() {
    }
    
    private void Method3282(final int n, final int n2, final int n3, final int n4, final boolean b, final String s) {
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)n, (double)n2, (double)n3, (double)n4, this.Field11340 ? Class1039.Field12569 : Class1039.Field12570);
        if (b) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)n, (double)n2, (double)n3, (double)n4, this.Field11340 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12570) : Class1039.Field12569);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446((double)n, (double)n2, (double)n3, (double)n4, 1.0f, this.Field11340 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571) : Class1039.Field12569);
        if (null.Field11786.Method365() && b) {
            Class753.drawRoundedRect((double)(n / 2), (double)(n2 / 2), (double)((n + n3) / 2), (double)((n2 + n4) / 2), this.Field11340 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571) : Class1039.Field12569, null.Field11788.Method367());
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(n + n3 + n4 / 4, n2 + this.Method677() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(s) / 2, s, Class1039.Field12573);
    }
    
    final Class2027 Method3283(final Color color, final float n) {
        return new Class2027(color, n);
    }
    
    private void Method3284(final int n, final int n2, final boolean b) {
        this.Field11340 = (!b && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677());
    }
    
    private boolean Method3285(final int n, final int n2, final boolean b) {
        return !b && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field11339;
    }
    
    protected boolean Method3286(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return n5 >= n && n6 >= n2 && n5 < n3 && n6 < n4;
    }
    
    public boolean Method683(final int n, final int n2, final boolean b) {
        this.Method3284(n, n2, b);
        this.Method3287(n / 2, n2 / 2);
        return false;
    }
    
    public boolean Method684(final int n, final int n2, final int n3, final boolean b) {
        if (n == 0) {
            this.Method3284(n2, n3, b);
            if (this.Method3285(n2, n3, b)) {
                this.Field11341 = !this.Field11341;
                this.Method3280();
                this.Method3281();
                return true;
            }
            if (this.Field11341) {
                this.Field11345 = (!b && this.Method3286(this.Field11348, this.Field11349, this.Field11348 + this.Field11350, this.Field11349 + this.Field11351, n2 / 2, n3 / 2));
                this.Field11346 = (!b && this.Method3286(this.Field11352, this.Field11353, this.Field11352 + this.Field11354, this.Field11353 + this.Field11355, n2 / 2, n3 / 2));
                this.Field11347 = (!b && this.Method3286(this.Field11356, this.Field11357, this.Field11356 + this.Field11358, this.Field11357 + this.Field11359, n2 / 2, n3 / 2));
                if (this.Field11347 || this.Field11345 || this.Field11346) {
                    this.Method3287(n2 / 2, n3 / 2);
                }
                return this.Field11345 || this.Field11346 || this.Field11347;
            }
        }
        return false;
    }
    
    private void Method3287(final int b, final int b2) {
        if (this.Field11346) {
            if (this.Field11354 > this.Field11355) {
                this.Field11344[0] = (Math.min(Math.max(this.Field11352, b), this.Field11352 + this.Field11354) - (float)this.Field11352) / this.Field11354;
            }
            else {
                this.Field11344[0] = (Math.min(Math.max(this.Field11353, b2), this.Field11353 + this.Field11355) - (float)this.Field11353) / this.Field11355;
            }
        }
        if (this.Field11347) {
            if (this.Field11358 > this.Field11359) {
                this.Field11344[3] = 1.0f - (Math.min(Math.max(this.Field11356, b), this.Field11356 + this.Field11358) - (float)this.Field11356) / this.Field11358;
            }
            else {
                this.Field11344[3] = 1.0f - (Math.min(Math.max(this.Field11357, b2), this.Field11357 + this.Field11359) - (float)this.Field11357) / this.Field11359;
            }
        }
        if (this.Field11345) {
            final float n = (float)Math.min(Math.max(this.Field11348, b), this.Field11348 + this.Field11350);
            final float n2 = (float)Math.min(Math.max(this.Field11349, b2), this.Field11349 + this.Field11351);
            this.Field11344[1] = (n - this.Field11348) / this.Field11350;
            this.Field11344[2] = 1.0f - (n2 - this.Field11349) / this.Field11351;
        }
    }
    
    public boolean Method682(final int n, final int n2, final int n3, final boolean b) {
        this.Method3284(n2, n3, b);
        if ((this.Field11345 || this.Field11346 || this.Field11347) && n == 0) {
            this.Method3287(n2 / 2, n3 / 2);
            final boolean field11345 = false;
            this.Field11347 = field11345;
            this.Field11346 = field11345;
            this.Field11345 = field11345;
            return true;
        }
        return false;
    }
    
    public Class2027 Method3288() {
        return this.Field11342;
    }
    
    public boolean Method3289() {
        return this.Field11343;
    }
    
    public void Method3290(final boolean field11343) {
        this.Field11343 = field11343;
    }
    
    public void Method3291(final Class2027 field11342) {
        this.Field11342 = field11342;
        final float[] rgBtoHSB = Color.RGBtoHSB(field11342.Field17321, field11342.Field17322, field11342.Field17323, null);
        this.Field11344 = new float[] { rgBtoHSB[0], rgBtoHSB[1], rgBtoHSB[2], field11342.Field17328 };
    }
    
    public void Method3292(final Class994 field11365) {
        this.Field11365 = field11365;
    }
    
    public void Method3293(final Class994 field11366) {
        this.Field11366 = field11366;
    }
    
    private void Method3294(final int n, int n2, final int n3, final int n4, final float n5) {
        int n6 = 0;
        if (n4 > n3) {
            Gui.drawRect(n, n2, n + n3, n2 + 4, -65536);
            n2 += 4;
            int n7 = 0;
            while (true) {
                Class753.drawGradientRect((double)n, (double)(n2 + n6 * (n4 / 6)), (double)(n + n3), (double)(n2 + (n6 + 1) * (n4 / 6)), Color.HSBtoRGB(n6 / Float.intBitsToFloat(1086324736), 1.0f, 1.0f), Color.HSBtoRGB((n6 + 1) / Float.intBitsToFloat(1086324736), 1.0f, 1.0f));
                ++n6;
                ++n7;
            }
        }
        else {
            int n8 = 0;
            while (true) {
                this.Method3297(n + n6 * (n3 / 6), n2, n + (n6 + 1) * (n3 / 6), n2 + n4, Color.HSBtoRGB(n6 / Float.intBitsToFloat(1086324736), 1.0f, 1.0f), Color.HSBtoRGB((n6 + 1) / Float.intBitsToFloat(1086324736), 1.0f, 1.0f), true);
                ++n6;
                ++n8;
            }
        }
    }
    
    private void Method3295(final int n, final int n2, final int n3, final int n4, final float r, final float g, final float b, final float a) {
        for (int n5 = n3 / 2, i = -n5; i < n4; i += n5) {}
        this.Method3297(n, n2, n + n3, n2 + n4, new Color(r, g, b, a).getRGB(), 0, false);
        final int n6 = (int)(n2 + n4 - n4 * a);
        Gui.drawRect(n, n6 - 1, n + n3, n6 + 1, -1);
    }
    
    private void Method3296(final int n, final int n2, final int n3, final int n4, final float n5, final float n6, final float n7, final float n8) {
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glShadeModel(7425);
        GL11.glBegin(9);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glVertex2f((float)n, (float)n2);
        GL11.glVertex2f((float)n, (float)(n2 + n4));
        GL11.glColor4f(n5, n6, n7, n8);
        GL11.glVertex2f((float)(n + n3), (float)(n2 + n4));
        GL11.glVertex2f((float)(n + n3), (float)n2);
        GL11.glEnd();
        GL11.glDisable(3008);
        GL11.glBegin(9);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glVertex2f((float)n, (float)n2);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glVertex2f((float)n, (float)(n2 + n4));
        GL11.glVertex2f((float)(n + n3), (float)(n2 + n4));
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glVertex2f((float)(n + n3), (float)n2);
        GL11.glEnd();
        GL11.glEnable(3008);
        GL11.glShadeModel(7424);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
    }
    
    protected void Method3297(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b) {
        if (b) {
            final float n7 = (n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n8 = (n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n9 = (n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n10 = (n5 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n11 = (n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n12 = (n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n13 = (n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n14 = (n6 & 0xFF) / Float.intBitsToFloat(1132396544);
            GL11.glEnable(3042);
            GL11.glDisable(3553);
            GL11.glBlendFunc(770, 771);
            GL11.glShadeModel(7425);
            GL11.glBegin(9);
            GL11.glColor4f(n8, n9, n10, n7);
            GL11.glVertex2f((float)n, (float)n2);
            GL11.glVertex2f((float)n, (float)n4);
            GL11.glColor4f(n12, n13, n14, n11);
            GL11.glVertex2f((float)n3, (float)n4);
            GL11.glVertex2f((float)n3, (float)n2);
            GL11.glEnd();
            GL11.glShadeModel(7424);
            GL11.glEnable(3553);
            GL11.glDisable(3042);
        }
        else {
            Class753.drawGradientRect((double)n, (double)n2, (double)n3, (double)n4, n5, n6);
        }
    }
    
    static {
        Field11337 = 24;
        Field11336 = 180;
    }
    
    private static String Method3298(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1AC5 ^ 0xD3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
