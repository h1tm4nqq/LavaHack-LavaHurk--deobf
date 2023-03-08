//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import java.io.*;
import java.awt.*;
import net.minecraft.util.math.*;
import lavahack.client.*;
import net.minecraft.client.renderer.*;

public class Class2027 implements Serializable
{
    public static final int Field17318;
    public static final int Field17319;
    public static final int Field17320;
    public int Field17321;
    public int Field17322;
    public int Field17323;
    public int Field17324;
    public float Field17325;
    public float Field17326;
    public float Field17327;
    public float Field17328;
    private boolean Field17329;
    private int Field17330;
    
    public Class2027(final float[] array) {
        this(Color.getHSBColor(array[0], array[1], array[2]));
    }
    
    public Class2027() {
        this(Color.RED);
    }
    
    public Class2027(final int field17321, final int field17322, final int field17323, final int field17324) {
        this.Field17329 = true;
        this.Field17321 = field17321;
        this.Field17322 = field17322;
        this.Field17323 = field17323;
        this.Field17324 = field17324;
        this.Field17325 = field17321 / Float.intBitsToFloat(1132396544);
        this.Field17326 = field17322 / Float.intBitsToFloat(1132396544);
        this.Field17327 = field17323 / Float.intBitsToFloat(1132396544);
        this.Field17328 = field17324 / Float.intBitsToFloat(1132396544);
        this.Method3624();
    }
    
    public Class2027(final double n, final double n2, final double n3, final double n4) {
        this((int)n, (int)n2, (int)n3, (int)n4);
    }
    
    public Class2027(final int field17321, final int field17322, final int field17323) {
        this.Field17329 = true;
        this.Field17321 = field17321;
        this.Field17322 = field17322;
        this.Field17323 = field17323;
        this.Field17324 = 255;
        this.Field17325 = field17321 / Float.intBitsToFloat(1132396544);
        this.Field17326 = field17322 / Float.intBitsToFloat(1132396544);
        this.Field17327 = field17323 / Float.intBitsToFloat(1132396544);
        this.Field17328 = 1.0f;
        this.Method3624();
    }
    
    public Class2027(final Class2027 class2027, final int field17324) {
        this.Field17329 = true;
        this.Field17321 = class2027.Field17321;
        this.Field17322 = class2027.Field17322;
        this.Field17323 = class2027.Field17323;
        this.Field17324 = field17324;
        this.Field17325 = this.Field17321 / Float.intBitsToFloat(1132396544);
        this.Field17326 = this.Field17322 / Float.intBitsToFloat(1132396544);
        this.Field17327 = this.Field17323 / Float.intBitsToFloat(1132396544);
        this.Field17328 = field17324 / Float.intBitsToFloat(1132396544);
        this.Method3624();
    }
    
    public Class2027(final Color color, final float field17328) {
        this(color);
        this.Field17324 = (int)field17328 * 255;
        this.Field17328 = field17328;
        this.Method3624();
    }
    
    public Class2027(final float field17325, final float field17326, final float field17327) {
        this.Field17329 = true;
        this.Field17325 = field17325;
        this.Field17326 = field17326;
        this.Field17327 = field17327;
        this.Field17328 = 1.0f;
        this.Field17321 = (int)this.Field17325 * 255;
        this.Field17322 = (int)this.Field17326 * 255;
        this.Field17323 = (int)this.Field17327 * 255;
        this.Field17324 = 255;
        this.Field17329 = false;
        this.Method3624();
    }
    
    public Class2027(final float field17325, final float field17326, final float field17327, final float field17328) {
        this.Field17329 = true;
        this.Field17325 = field17325;
        this.Field17326 = field17326;
        this.Field17327 = field17327;
        this.Field17328 = field17328;
        this.Field17321 = (int)this.Field17325 * 255;
        this.Field17322 = (int)this.Field17326 * 255;
        this.Field17323 = (int)this.Field17327 * 255;
        this.Field17324 = (int)this.Field17328 * 255;
        this.Field17329 = false;
        this.Method3624();
    }
    
    public Class2027(final int n) {
        this.Field17329 = true;
        this.Field17321 = (n >> 16 & 0xFF);
        this.Field17322 = (n >> 8 & 0xFF);
        this.Field17323 = (n & 0xFF);
        this.Field17324 = (n >> 24 & 0xFF);
        this.Field17325 = this.Field17321 / Float.intBitsToFloat(1132396544);
        this.Field17326 = this.Field17322 / Float.intBitsToFloat(1132396544);
        this.Field17327 = this.Field17323 / Float.intBitsToFloat(1132396544);
        this.Field17328 = this.Field17324 / Float.intBitsToFloat(1132396544);
        this.Method3624();
    }
    
    public Vec3d Method3608() {
        return new Vec3d((double)this.Field17325, (double)this.Field17326, (double)this.Field17327);
    }
    
    public void Method3609() {
        final float[] method3623 = this.Method3623();
        method3623[0] = (float)(Math.ceil((System.currentTimeMillis() + 200L) / Double.longBitsToDouble((long)1363230067 ^ 0x4034000051413D73L)) % Double.longBitsToDouble(4645040803167600640L) / Double.longBitsToDouble(4645040803167600640L));
        this.Method3616(Method3617(method3623, this.Field17324));
    }
    
    public void Method3610(final Class2027 class2027) {
        this.Field17321 = class2027.Field17321;
        this.Field17322 = class2027.Field17322;
        this.Field17323 = class2027.Field17323;
        this.Field17324 = class2027.Field17324;
        this.Field17325 = this.Field17321 / Float.intBitsToFloat(1132396544);
        this.Field17326 = this.Field17322 / Float.intBitsToFloat(1132396544);
        this.Field17327 = this.Field17323 / Float.intBitsToFloat(1132396544);
        this.Field17328 = this.Field17324 / Float.intBitsToFloat(1132396544);
        this.Method3624();
    }
    
    public Class2027 Method3611(final float n) {
        final float[] method3623 = this.Method3623();
        this.Method3616(new Class2027(new float[] { method3623[0], method3623[1], n }));
        return this;
    }
    
    public Class2027 Method3612(final float field17328) {
        this.Field17324 = (int)(field17328 * Float.intBitsToFloat(1132396544));
        this.Field17328 = field17328;
        this.Method3624();
        return this;
    }
    
    public Class2027 Method3613(final int field17324) {
        this.Field17324 = field17324;
        this.Field17328 = field17324 / Float.intBitsToFloat(1132396544);
        this.Method3624();
        return this;
    }
    
    public Class2027 Method3614(final float n) {
        final float[] method3623 = this.Method3623();
        this.Method3616(new Class2027(new float[] { n, method3623[1], method3623[2] }));
        return this;
    }
    
    public Class2027 Method3615(final float n) {
        final float[] method3623 = this.Method3623();
        this.Method3616(new Class2027(new float[] { method3623[0], n, method3623[2] }));
        return this;
    }
    
    private void Method3616(final Class2027 class2027) {
        this.Field17321 = class2027.Field17321;
        this.Field17322 = class2027.Field17322;
        this.Field17323 = class2027.Field17323;
        this.Field17324 = class2027.Field17324;
        this.Field17325 = this.Field17321 / Float.intBitsToFloat(1132396544);
        this.Field17326 = this.Field17322 / Float.intBitsToFloat(1132396544);
        this.Field17327 = this.Field17323 / Float.intBitsToFloat(1132396544);
        this.Field17328 = this.Field17324 / Float.intBitsToFloat(1132396544);
        this.Method3624();
    }
    
    public static Class2027 Method3617(final float[] array, final int n) {
        return new Class2027(Class1172.Method4728(Color.getHSBColor(array[0], array[1], array[2]), n));
    }
    
    public static Class2027 Method3618(final float n, final float n2, final float n3) {
        return Method3619(new float[] { n, n2, n3 });
    }
    
    public static Class2027 Method3619(final float[] array) {
        return new Class2027(Color.getHSBColor(array[0], array[1], array[2]));
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
        }
        else if (this.Field17321 < 0) {
            this.Field17321 = 0;
        }
        if (this.Field17322 > 255) {
            this.Field17322 = 255;
        }
        else if (this.Field17322 < 0) {
            this.Field17322 = 0;
        }
        if (this.Field17323 > 255) {
            this.Field17323 = 255;
        }
        else if (this.Field17323 < 0) {
            this.Field17323 = 0;
        }
        if (this.Field17324 > 255) {
            this.Field17324 = 255;
        }
        else if (this.Field17324 < 0) {
            this.Field17324 = 0;
        }
        if (this.Field17325 > 1.0f) {
            this.Field17325 = 1.0f;
        }
        else if (this.Field17325 < 0.0f) {
            this.Field17325 = 0.0f;
        }
        if (this.Field17326 > 1.0f) {
            this.Field17326 = 1.0f;
        }
        else if (this.Field17326 < 0.0f) {
            this.Field17326 = 0.0f;
        }
        if (this.Field17327 > 1.0f) {
            this.Field17327 = 1.0f;
        }
        else if (this.Field17327 < 0.0f) {
            this.Field17327 = 0.0f;
        }
        if (this.Field17328 > 1.0f) {
            this.Field17328 = 1.0f;
        }
        else if (this.Field17328 < 0.0f) {
            this.Field17328 = 0.0f;
        }
    }
    
    public Class2027(final Color color) {
        this(color.getRGB());
    }
    
    public Color Method3625() {
        return new Color(this.Field17321, this.Field17322, this.Field17323, this.Field17324);
    }
    
    public int Method3626() {
        return new Color(this.Field17321, this.Field17322, this.Field17323, this.Field17324).getRGB();
    }
    
    public float Method3627() {
        if (this.Field17329) {
            return this.Field17321 / Float.intBitsToFloat(1132396544);
        }
        return this.Field17325;
    }
    
    public float Method3628() {
        if (this.Field17329) {
            return this.Field17322 / Float.intBitsToFloat(1132396544);
        }
        return this.Field17326;
    }
    
    public float Method3629() {
        if (this.Field17329) {
            return this.Field17323 / Float.intBitsToFloat(1132396544);
        }
        return this.Field17327;
    }
    
    public float Method3630() {
        if (this.Field17329) {
            return this.Field17324 / Float.intBitsToFloat(1132396544);
        }
        return this.Field17328;
    }
    
    public int Method3631() {
        if (this.Field17329) {
            return this.Field17324;
        }
        return (int)this.Field17328 * 255;
    }
    
    public void Method3632() {
        GlStateManager.color(this.Field17325, this.Field17326, this.Field17327, this.Method3630());
    }
    
    public Class2027 Method3633(final int n) {
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
    
    static {
        Field17318 = 0;
        Field17319 = 1;
        Field17320 = 2;
    }
}
