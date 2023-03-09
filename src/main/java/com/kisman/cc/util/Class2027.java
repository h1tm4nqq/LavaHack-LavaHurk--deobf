//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.math.Vec3d
 */
package com.kisman.cc.util;

import java.awt.Color;
import java.io.Serializable;
import lavahack.client.Class1172;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;

public class Class2027
implements Serializable {
    public static final int Field17318 = 0;
    public static final int Field17319 = 1;
    public static final int Field17320 = 2;
    public int Field17321;
    public int Field17322;
    public int Field17323;
    public int Field17324;
    public float Field17325;
    public float Field17326;
    public float Field17327;
    public float Field17328;
    private boolean Field17329 = true;
    private int Field17330;

    public Class2027(float[] fArray) {
        this(Color.getHSBColor(fArray[0], fArray[1], fArray[2]));
    }

    public Class2027() {
        this(Color.RED);
    }

    public Class2027(int n, int n2, int n3, int n4) {
        this.Field17321 = n;
        this.Field17322 = n2;
        this.Field17323 = n3;
        this.Field17324 = n4;
        this.Field17325 = (float)n / Float.intBitsToFloat(1132396544);
        this.Field17326 = (float)n2 / Float.intBitsToFloat(1132396544);
        this.Field17327 = (float)n3 / Float.intBitsToFloat(1132396544);
        this.Field17328 = (float)n4 / Float.intBitsToFloat(1132396544);
        this.Method3624();
    }

    public Class2027(double d, double d2, double d3, double d4) {
        this((int)d, (int)d2, (int)d3, (int)d4);
    }

    public Class2027(int n, int n2, int n3) {
        this.Field17321 = n;
        this.Field17322 = n2;
        this.Field17323 = n3;
        this.Field17324 = 255;
        this.Field17325 = (float)n / Float.intBitsToFloat(1132396544);
        this.Field17326 = (float)n2 / Float.intBitsToFloat(1132396544);
        this.Field17327 = (float)n3 / Float.intBitsToFloat(1132396544);
        this.Field17328 = 1.0f;
        this.Method3624();
    }

    public Class2027(Class2027 class2027, int n) {
        this.Field17321 = class2027.Field17321;
        this.Field17322 = class2027.Field17322;
        this.Field17323 = class2027.Field17323;
        this.Field17324 = n;
        this.Field17325 = (float)this.Field17321 / Float.intBitsToFloat(1132396544);
        this.Field17326 = (float)this.Field17322 / Float.intBitsToFloat(1132396544);
        this.Field17327 = (float)this.Field17323 / Float.intBitsToFloat(1132396544);
        this.Field17328 = (float)n / Float.intBitsToFloat(1132396544);
        this.Method3624();
    }

    public Class2027(Color color, float f) {
        this(color);
        this.Field17324 = (int)f * 255;
        this.Field17328 = f;
        this.Method3624();
    }

    public Class2027(float f, float f2, float f3) {
        this.Field17325 = f;
        this.Field17326 = f2;
        this.Field17327 = f3;
        this.Field17328 = 1.0f;
        this.Field17321 = (int)this.Field17325 * 255;
        this.Field17322 = (int)this.Field17326 * 255;
        this.Field17323 = (int)this.Field17327 * 255;
        this.Field17324 = 255;
        this.Field17329 = false;
        this.Method3624();
    }

    public Class2027(float f, float f2, float f3, float f4) {
        this.Field17325 = f;
        this.Field17326 = f2;
        this.Field17327 = f3;
        this.Field17328 = f4;
        this.Field17321 = (int)this.Field17325 * 255;
        this.Field17322 = (int)this.Field17326 * 255;
        this.Field17323 = (int)this.Field17327 * 255;
        this.Field17324 = (int)this.Field17328 * 255;
        this.Field17329 = false;
        this.Method3624();
    }

    public Class2027(int n) {
        this.Field17321 = n >> 16 & 0xFF;
        this.Field17322 = n >> 8 & 0xFF;
        this.Field17323 = n & 0xFF;
        this.Field17324 = n >> 24 & 0xFF;
        this.Field17325 = (float)this.Field17321 / Float.intBitsToFloat(1132396544);
        this.Field17326 = (float)this.Field17322 / Float.intBitsToFloat(1132396544);
        this.Field17327 = (float)this.Field17323 / Float.intBitsToFloat(1132396544);
        this.Field17328 = (float)this.Field17324 / Float.intBitsToFloat(1132396544);
        this.Method3624();
    }

    public Vec3d Method3608() {
        return new Vec3d((double)this.Field17325, (double)this.Field17326, (double)this.Field17327);
    }

    public void Method3609() {
        float[] fArray = this.Method3623();
        double d = Math.ceil((double)(System.currentTimeMillis() + 200L) / Double.longBitsToDouble((long)1363230067 ^ 0x4034000051413D73L));
        fArray[0] = (float)((d %= Double.longBitsToDouble(4645040803167600640L)) / Double.longBitsToDouble(4645040803167600640L));
        this.Method3616(Class2027.Method3617(fArray, this.Field17324));
    }

    public void Method3610(Class2027 class2027) {
        this.Field17321 = class2027.Field17321;
        this.Field17322 = class2027.Field17322;
        this.Field17323 = class2027.Field17323;
        this.Field17324 = class2027.Field17324;
        this.Field17325 = (float)this.Field17321 / Float.intBitsToFloat(1132396544);
        this.Field17326 = (float)this.Field17322 / Float.intBitsToFloat(1132396544);
        this.Field17327 = (float)this.Field17323 / Float.intBitsToFloat(1132396544);
        this.Field17328 = (float)this.Field17324 / Float.intBitsToFloat(1132396544);
        this.Method3624();
    }

    public Class2027 Method3611(float f) {
        float[] fArray = this.Method3623();
        this.Method3616(new Class2027(new float[]{fArray[0], fArray[1], f}));
        return this;
    }

    public Class2027 Method3612(float f) {
        this.Field17324 = (int)(f * Float.intBitsToFloat(1132396544));
        this.Field17328 = f;
        this.Method3624();
        return this;
    }

    public Class2027 Method3613(int n) {
        this.Field17324 = n;
        this.Field17328 = (float)n / Float.intBitsToFloat(1132396544);
        this.Method3624();
        return this;
    }

    public Class2027 Method3614(float f) {
        float[] fArray = this.Method3623();
        this.Method3616(new Class2027(new float[]{f, fArray[1], fArray[2]}));
        return this;
    }

    public Class2027 Method3615(float f) {
        float[] fArray = this.Method3623();
        this.Method3616(new Class2027(new float[]{fArray[0], f, fArray[2]}));
        return this;
    }

    private void Method3616(Class2027 class2027) {
        this.Field17321 = class2027.Field17321;
        this.Field17322 = class2027.Field17322;
        this.Field17323 = class2027.Field17323;
        this.Field17324 = class2027.Field17324;
        this.Field17325 = (float)this.Field17321 / Float.intBitsToFloat(1132396544);
        this.Field17326 = (float)this.Field17322 / Float.intBitsToFloat(1132396544);
        this.Field17327 = (float)this.Field17323 / Float.intBitsToFloat(1132396544);
        this.Field17328 = (float)this.Field17324 / Float.intBitsToFloat(1132396544);
        this.Method3624();
    }

    public static Class2027 Method3617(float[] fArray, int n) {
        return new Class2027(Class1172.Method4728(Color.getHSBColor(fArray[0], fArray[1], fArray[2]), n));
    }

    public static Class2027 Method3618(float f, float f2, float f3) {
        return Class2027.Method3619(new float[]{f, f2, f3});
    }

    public static Class2027 Method3619(float[] fArray) {
        return new Class2027(Color.getHSBColor(fArray[0], fArray[1], fArray[2]));
    }

    public float Method3620() {
        return this.Method3623()[0];
    }

    public float Method3621() {
        return this.Method3623()[1];
    }

    public float Method3622() {
        return this.Method3623()[2];
    }

    public float[] Method3623() {
        return Color.RGBtoHSB(this.Field17321, this.Field17322, this.Field17323, null);
    }

    private void Method3624() {
        if (this.Field17321 > 255) {
            this.Field17321 = 255;
        } else if (this.Field17321 < 0) {
            this.Field17321 = 0;
        }
        if (this.Field17322 > 255) {
            this.Field17322 = 255;
        } else if (this.Field17322 < 0) {
            this.Field17322 = 0;
        }
        if (this.Field17323 > 255) {
            this.Field17323 = 255;
        } else if (this.Field17323 < 0) {
            this.Field17323 = 0;
        }
        if (this.Field17324 > 255) {
            this.Field17324 = 255;
        } else if (this.Field17324 < 0) {
            this.Field17324 = 0;
        }
        if (this.Field17325 > 1.0f) {
            this.Field17325 = 1.0f;
        } else if (this.Field17325 < 0.0f) {
            this.Field17325 = 0.0f;
        }
        if (this.Field17326 > 1.0f) {
            this.Field17326 = 1.0f;
        } else if (this.Field17326 < 0.0f) {
            this.Field17326 = 0.0f;
        }
        if (this.Field17327 > 1.0f) {
            this.Field17327 = 1.0f;
        } else if (this.Field17327 < 0.0f) {
            this.Field17327 = 0.0f;
        }
        if (this.Field17328 > 1.0f) {
            this.Field17328 = 1.0f;
            return;
        }
        if (!(this.Field17328 < 0.0f)) return;
        this.Field17328 = 0.0f;
    }

    public Class2027(Color color) {
        this(color.getRGB());
    }

    public Color Method3625() {
        return new Color(this.Field17321, this.Field17322, this.Field17323, this.Field17324);
    }

    public int Method3626() {
        return new Color(this.Field17321, this.Field17322, this.Field17323, this.Field17324).getRGB();
    }

    public float Method3627() {
        if (!this.Field17329) return this.Field17325;
        return (float)this.Field17321 / Float.intBitsToFloat(1132396544);
    }

    public float Method3628() {
        if (!this.Field17329) return this.Field17326;
        return (float)this.Field17322 / Float.intBitsToFloat(1132396544);
    }

    public float Method3629() {
        if (!this.Field17329) return this.Field17327;
        return (float)this.Field17323 / Float.intBitsToFloat(1132396544);
    }

    public float Method3630() {
        if (!this.Field17329) return this.Field17328;
        return (float)this.Field17324 / Float.intBitsToFloat(1132396544);
    }

    public int Method3631() {
        if (!this.Field17329) return (int)this.Field17328 * 255;
        return this.Field17324;
    }

    public void Method3632() {
        GlStateManager.color((float)this.Field17325, (float)this.Field17326, (float)this.Field17327, (float)this.Method3630());
    }

    public Class2027 Method3633(int n) {
        return new Class2027(this, n);
    }

    public int Method3634() {
        return this.Field17321;
    }

    public int Method3635() {
        return this.Field17322;
    }

    public int Method3636() {
        return this.Field17323;
    }
}

