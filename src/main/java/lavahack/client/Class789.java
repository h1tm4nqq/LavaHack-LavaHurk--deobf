//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import lavahack.client.Class1039;
import lavahack.client.Class1178;
import lavahack.client.Class1514;
import lavahack.client.Class1876;
import lavahack.client.Class753;
import lavahack.client.Class994;
import net.minecraft.client.gui.Gui;
import org.lwjgl.opengl.GL11;

public class Class789
extends Class1514 {
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

    public Class789(Class1876 class1876, Class2027 class2027, int n, int n2) {
        super(class1876);
        this.Field11338 = n;
        this.Field11339 = n2;
        this.Field11342 = class2027;
        float[] fArray = Color.RGBtoHSB(this.Field11342.Field17321, this.Field11342.Field17322, this.Field11342.Field17323, null);
        this.Field11344 = new float[]{fArray[0], fArray[1], fArray[2], this.Field11342.Field17328};
        this.Field11346 = false;
        this.Field11347 = false;
        this.Field11345 = false;
        this.Field11350 = 120;
        this.Field11351 = 100;
        this.Field11348 = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / 2;
        this.Field11349 = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2 + n2 / 2;
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
        this.Field11362 = this.Field11363 = Class1178.Method4748() + 10;
        this.Method3280();
        this.Method3281();
    }

    public Class789(Class1876 class1876, Class2027 class2027) {
        this(class1876, class2027, 180, 24);
    }

    private void Method3280() {
        if (this.Field11341) {
            this.Method676((this.Field11350 + 6 + this.Field11358) * 2);
            return;
        }
        this.Method676(this.Field11338);
    }

    private void Method3281() {
        if (this.Field11341) {
            this.Method678(this.Field11339 + (this.Field11351 + 12 + this.Field11355 + this.Field11363) * 2);
            return;
        }
        this.Method678(this.Field11339);
    }

    @Override
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
        this.Field11362 = this.Field11363 = Class1178.Method4748() + 10;
        this.Method3280();
        this.Method3281();
        if (!this.Field11341) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), this.Field11342.Method3625());
        }
        if (this.Field11341) {
            String string = "Red: " + this.Field11342.Field17321 + " Green: " + this.Field11342.Field17322 + " Blue: " + this.Field11342.Field17323;
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(string) / 2, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field11339 / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(string) / 2, string, Class1039.Field12573);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), 1.0f, this.Field11340 ? Class1039.Field12571 : Class1039.Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect((double)(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / 2), (double)(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2), (double)((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675()) / 2), (double)((this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field11339) / 2), this.Field11342.Method3625(), null.Field11788.Method367());
        }
        if (this.Field11341) {
            int n = this.Field11348 + this.Field11350 + 6;
            int n2 = this.Field11349 + this.Field11351 + 6;
            int n3 = 10;
            int n4 = 10;
            int n5 = Color.HSBtoRGB(this.Field11344[0], 1.0f, 1.0f);
            float f = (float)(n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f2 = (float)(n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f3 = (float)(n5 & 0xFF) / Float.intBitsToFloat(1132396544);
            this.Method3296(this.Field11348, this.Field11349, this.Field11350, this.Field11351, f, f2, f3, this.Field11344[3]);
            this.Method3294(this.Field11352, this.Field11353, this.Field11354, this.Field11355, this.Field11344[0]);
            this.Method3295(this.Field11356, this.Field11357, this.Field11358, this.Field11359, f, f2, f3, this.Field11344[3]);
            this.Field11364 = this.Method3283(new Color(Color.HSBtoRGB(this.Field11344[0], this.Field11344[1], this.Field11344[2])), this.Field11344[3]);
            Gui.drawRect((int)n, (int)n2, (int)(n + n3), (int)(n2 + n4), (int)this.Field11364.Method3626());
            int n6 = (int)((float)this.Field11348 + this.Field11344[1] * (float)this.Field11350);
            int n7 = (int)((float)(this.Field11349 + this.Field11351) - this.Field11344[2] * (float)this.Field11351);
            Gui.drawRect((int)(n6 - 2), (int)(n7 - 2), (int)(n6 + 2), (int)(n7 + 2), (int)-1);
            this.Field11342 = this.Field11364;
        }
        if (this.Field11365 != null) {
            this.Field11365.Method4024(this.Field11342);
        }
        if (this.Field11366 == null) return;
        this.Field11366.Method4024(this.Field11343);
    }

    @Override
    public void Method669() {
    }

    private void Method3282(int n, int n2, int n3, int n4, boolean bl, String string) {
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(n, n2, n3, n4, this.Field11340 ? Class1039.Field12569 : Class1039.Field12570);
        if (bl) {
            Color color = this.Field11340 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12570) : Class1039.Field12569;
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(n, n2, n3, n4, color);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(n, n2, n3, n4, 1.0f, this.Field11340 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571) : Class1039.Field12569);
        if (null.Field11786.Method365() && bl) {
            Class753.drawRoundedRect((double)(n / 2), (double)(n2 / 2), (double)((n + n3) / 2), (double)((n2 + n4) / 2), this.Field11340 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571) : Class1039.Field12569, null.Field11788.Method367());
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(n + n3 + n4 / 4, n2 + this.Method677() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(string) / 2, string, Class1039.Field12573);
    }

    final Class2027 Method3283(Color color, float f) {
        return new Class2027(color, f);
    }

    private void Method3284(int n, int n2, boolean bl) {
        this.Field11340 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677();
    }

    private boolean Method3285(int n, int n2, boolean bl) {
        if (bl) return false;
        if (n < this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) return false;
        if (n2 < this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) return false;
        if (n > this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675()) return false;
        if (n2 > this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field11339) return false;
        return true;
    }

    protected boolean Method3286(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n5 < n) return false;
        if (n6 < n2) return false;
        if (n5 >= n3) return false;
        if (n6 >= n4) return false;
        return true;
    }

    @Override
    public boolean Method683(int n, int n2, boolean bl) {
        this.Method3284(n, n2, bl);
        this.Method3287(n / 2, n2 / 2);
        return false;
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        if (n != 0) return false;
        this.Method3284(n2, n3, bl);
        if (this.Method3285(n2, n3, bl)) {
            this.Field11341 = !this.Field11341;
            this.Method3280();
            this.Method3281();
            return true;
        }
        if (!this.Field11341) return false;
        this.Field11345 = !bl && this.Method3286(this.Field11348, this.Field11349, this.Field11348 + this.Field11350, this.Field11349 + this.Field11351, n2 / 2, n3 / 2);
        this.Field11346 = !bl && this.Method3286(this.Field11352, this.Field11353, this.Field11352 + this.Field11354, this.Field11353 + this.Field11355, n2 / 2, n3 / 2);
        boolean bl2 = this.Field11347 = !bl && this.Method3286(this.Field11356, this.Field11357, this.Field11356 + this.Field11358, this.Field11357 + this.Field11359, n2 / 2, n3 / 2);
        if (this.Field11347 || this.Field11345 || this.Field11346) {
            this.Method3287(n2 / 2, n3 / 2);
        }
        if (this.Field11345) return true;
        if (this.Field11346) return true;
        if (this.Field11347) return true;
        return false;
    }

    private void Method3287(int n, int n2) {
        float f;
        if (this.Field11346) {
            if (this.Field11354 > this.Field11355) {
                f = Math.min(Math.max(this.Field11352, n), this.Field11352 + this.Field11354);
                this.Field11344[0] = (f - (float)this.Field11352) / (float)this.Field11354;
            } else {
                f = Math.min(Math.max(this.Field11353, n2), this.Field11353 + this.Field11355);
                this.Field11344[0] = (f - (float)this.Field11353) / (float)this.Field11355;
            }
        }
        if (this.Field11347) {
            if (this.Field11358 > this.Field11359) {
                f = Math.min(Math.max(this.Field11356, n), this.Field11356 + this.Field11358);
                this.Field11344[3] = 1.0f - (f - (float)this.Field11356) / (float)this.Field11358;
            } else {
                f = Math.min(Math.max(this.Field11357, n2), this.Field11357 + this.Field11359);
                this.Field11344[3] = 1.0f - (f - (float)this.Field11357) / (float)this.Field11359;
            }
        }
        if (!this.Field11345) return;
        f = Math.min(Math.max(this.Field11348, n), this.Field11348 + this.Field11350);
        float f2 = Math.min(Math.max(this.Field11349, n2), this.Field11349 + this.Field11351);
        this.Field11344[1] = (f - (float)this.Field11348) / (float)this.Field11350;
        this.Field11344[2] = 1.0f - (f2 - (float)this.Field11349) / (float)this.Field11351;
    }

    @Override
    public boolean Method682(int n, int n2, int n3, boolean bl) {
        this.Method3284(n2, n3, bl);
        if (!this.Field11345 && !this.Field11346) {
            if (!this.Field11347) return false;
        }
        if (n != 0) return false;
        this.Method3287(n2 / 2, n3 / 2);
        this.Field11347 = false;
        this.Field11346 = false;
        this.Field11345 = false;
        return true;
    }

    public Class2027 Method3288() {
        return this.Field11342;
    }

    public boolean Method3289() {
        return this.Field11343;
    }

    public void Method3290(boolean bl) {
        this.Field11343 = bl;
    }

    public void Method3291(Class2027 class2027) {
        this.Field11342 = class2027;
        float[] fArray = Color.RGBtoHSB(class2027.Field17321, class2027.Field17322, class2027.Field17323, null);
        this.Field11344 = new float[]{fArray[0], fArray[1], fArray[2], class2027.Field17328};
    }

    public void Method3292(Class994 class994) {
        this.Field11365 = class994;
    }

    public void Method3293(Class994 class994) {
        this.Field11366 = class994;
    }

    private void Method3294(int n, int n2, int n3, int n4, float f) {
        int n5 = 0;
        if (n4 > n3) {
            Gui.drawRect((int)n, (int)n2, (int)(n + n3), (int)(n2 + 4), (int)-65536);
            n2 += 4;
            int n6 = 0;
            while (true) {
                int n7 = Color.HSBtoRGB((float)n5 / Float.intBitsToFloat(0x40C00000), 1.0f, 1.0f);
                int n8 = Color.HSBtoRGB((float)(n5 + 1) / Float.intBitsToFloat(0x40C00000), 1.0f, 1.0f);
                Class753.drawGradientRect(n, n2 + n5 * (n4 / 6), n + n3, n2 + (n5 + 1) * (n4 / 6), n7, n8);
                ++n5;
                ++n6;
            }
        }
        int n9 = 0;
        while (true) {
            int n10 = Color.HSBtoRGB((float)n5 / Float.intBitsToFloat(0x40C00000), 1.0f, 1.0f);
            int n11 = Color.HSBtoRGB((float)(n5 + 1) / Float.intBitsToFloat(0x40C00000), 1.0f, 1.0f);
            this.Method3297(n + n5 * (n3 / 6), n2, n + (n5 + 1) * (n3 / 6), n2 + n4, n10, n11, true);
            ++n5;
            ++n9;
        }
    }

    private void Method3295(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        boolean bl = true;
        int n5 = n3 / 2;
        int n6 = -n5;
        while (true) {
            if (n6 >= n4) {
                this.Method3297(n, n2, n + n3, n2 + n4, new Color(f, f2, f3, f4).getRGB(), 0, false);
                n6 = (int)((float)(n2 + n4) - (float)n4 * f4);
                Gui.drawRect((int)n, (int)(n6 - 1), (int)(n + n3), (int)(n6 + 1), (int)-1);
                return;
            }
            bl = false;
            n6 += n5;
        }
    }

    private void Method3296(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)9);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glVertex2f((float)n, (float)n2);
        GL11.glVertex2f((float)n, (float)(n2 + n4));
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        GL11.glVertex2f((float)(n + n3), (float)(n2 + n4));
        GL11.glVertex2f((float)(n + n3), (float)n2);
        GL11.glEnd();
        GL11.glDisable((int)3008);
        GL11.glBegin((int)9);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)n, (float)n2);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glVertex2f((float)n, (float)(n2 + n4));
        GL11.glVertex2f((float)(n + n3), (float)(n2 + n4));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)(n + n3), (float)n2);
        GL11.glEnd();
        GL11.glEnable((int)3008);
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    protected void Method3297(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        if (bl) {
            float f = (float)(n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f2 = (float)(n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f3 = (float)(n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f4 = (float)(n5 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f5 = (float)(n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f6 = (float)(n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f7 = (float)(n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f8 = (float)(n6 & 0xFF) / Float.intBitsToFloat(1132396544);
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glShadeModel((int)7425);
            GL11.glBegin((int)9);
            GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
            GL11.glVertex2f((float)n, (float)n2);
            GL11.glVertex2f((float)n, (float)n4);
            GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)f5);
            GL11.glVertex2f((float)n3, (float)n4);
            GL11.glVertex2f((float)n3, (float)n2);
            GL11.glEnd();
            GL11.glShadeModel((int)7424);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
            return;
        }
        Class753.drawGradientRect(n, n2, n3, n4, n5, n6);
    }

    static {
        Field11337 = 24;
        Field11336 = 180;
    }

    private static String Method3298(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 211;
            cArray2[n] = (char)(cArray[n] ^ (0x1AC5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

