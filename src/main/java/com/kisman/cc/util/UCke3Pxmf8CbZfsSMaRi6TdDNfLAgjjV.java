/*
 * Decompiled with CFR 0.152.
 */
package com.kisman.cc.util;

public class UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV {
    public float Field9004;
    public long Field9005;
    public float Field9006;
    public float Field9007;
    public float Field9008;
    public boolean Field9009;
    private String Field9010 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(float f, float f2, float f3) {
        this((long)(f * Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)((long)81696586 ^ (long)1055047897))) ^ ((int)-315410432L ^ 0x93756F93))), f2, f3);
    }

    public UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(long l, float f, float f2) {
        this.Field9004 = f;
        this.Field9008 = f2;
        this.Field9007 = f;
        this.Field9009 = f2 > f ? (int)((long)-545549810 ^ (long)-545549809) : (int)((long)1098129200 ^ (long)1098129200);
        float f3 = Math.abs(f - f2);
        this.Field9006 = f3 / (float)l;
        this.Field9005 = System.currentTimeMillis();
    }

    public static UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Method1297(float f, float f2, float f3) {
        return new UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(Math.abs(f - f2) / f3, f, f2);
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
                this.Field9004 = this.Field9008;
                return this.Field9004;
            }
            this.Field9004 += this.Field9006 * (float)(System.currentTimeMillis() - this.Field9005);
            if (this.Field9004 > this.Field9008) {
                this.Field9004 = this.Field9008;
            }
            this.Field9005 = System.currentTimeMillis();
            return this.Field9004;
        }
        if (this.Field9004 <= this.Field9008) {
            this.Field9004 = this.Field9008;
            return this.Field9004;
        }
        this.Field9004 -= this.Field9006 * (float)(System.currentTimeMillis() - this.Field9005);
        if (this.Field9004 < this.Field9008) {
            this.Field9004 = this.Field9008;
        }
        this.Field9005 = System.currentTimeMillis();
        return this.Field9004;
    }

    public boolean Method1300() {
        int n;
        if (this.Field9004 == this.Field9008) {
            n = (int)((long)2121818802 ^ (long)2121818803);
            return n != 0;
        }
        n = (int)((long)-1145677829 ^ (long)-1145677829);
        return n != 0;
    }

    public static double Method1301(double d, double d2, double d3) {
        double d4;
        if (d3 < 0.0) {
            d3 = 0.0;
        } else if (d3 > 1.0) {
            d3 = 1.0;
        }
        double d5 = Math.max(d, d2) - Math.min(d, d2);
        double d6 = d5 * d3;
        if (d6 < Double.longBitsToDouble((long)2089061829 ^ 0x3FB99999E51D145FL)) {
            d6 = Double.longBitsToDouble(0x8EC014272B83DE99L ^ 0xB1798DBEB21A4703L);
        }
        if (d > d2) {
            d4 = d2 + d6;
            return d4;
        }
        d4 = d2 - d6;
        return d4;
    }
}

