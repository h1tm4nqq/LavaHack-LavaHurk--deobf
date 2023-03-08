//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

public class Class230
{
    public float Field9004;
    public long Field9005;
    public float Field9006;
    public float Field9007;
    public float Field9008;
    public boolean Field9009;
    private String Field9010 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class230(final float n, final float n2, final float n3) {
        this((long)(n * Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(977033107)) ^ 0x7E465793)), n2, n3);
    }
    
    public Class230(final long n, final float n2, final float field9008) {
        this.Field9004 = n2;
        this.Field9008 = field9008;
        this.Field9007 = n2;
        this.Field9009 = (field9008 > n2);
        this.Field9006 = Math.abs(n2 - field9008) / n;
        this.Field9005 = System.currentTimeMillis();
    }
    
    public static Class230 Method1297(final float n, final float n2, final float n3) {
        return new Class230(Math.abs(n - n2) / n3, n, n2);
    }
    
    public void Method1298() {
        this.Field9004 = this.Field9007;
        this.Field9005 = System.currentTimeMillis();
    }
    
    public float Method1299() {
        if (this.Field9004 == this.Field9008) {
            return this.Field9004;
        }
        if (this.Field9009) {
            if (this.Field9004 >= this.Field9008) {
                return this.Field9004 = this.Field9008;
            }
            this.Field9004 += this.Field9006 * (System.currentTimeMillis() - this.Field9005);
            if (this.Field9004 > this.Field9008) {
                this.Field9004 = this.Field9008;
            }
            this.Field9005 = System.currentTimeMillis();
            return this.Field9004;
        }
        else {
            if (this.Field9004 <= this.Field9008) {
                return this.Field9004 = this.Field9008;
            }
            this.Field9004 -= this.Field9006 * (System.currentTimeMillis() - this.Field9005);
            if (this.Field9004 < this.Field9008) {
                this.Field9004 = this.Field9008;
            }
            this.Field9005 = System.currentTimeMillis();
            return this.Field9004;
        }
    }
    
    public boolean Method1300() {
        return this.Field9004 == this.Field9008;
    }
    
    public static double Method1301(final double n, final double n2, double n3) {
        if (n3 < 0.0) {
            n3 = 0.0;
        }
        else if (n3 > 1.0) {
            n3 = 1.0;
        }
        double longBitsToDouble = (Math.max(n, n2) - Math.min(n, n2)) * n3;
        if (longBitsToDouble < Double.longBitsToDouble((long)2089061829 ^ 0x3FB99999E51D145FL)) {
            longBitsToDouble = Double.longBitsToDouble(4591870180066957722L);
        }
        return (n > n2) ? (n2 + longBitsToDouble) : (n2 - longBitsToDouble);
    }
}
