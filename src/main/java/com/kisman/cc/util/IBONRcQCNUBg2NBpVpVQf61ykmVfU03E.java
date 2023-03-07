/*
 * Decompiled with CFR 0.152.
 */
package com.kisman.cc.util;

public class IBONRcQCNUBg2NBpVpVQf61ykmVfU03E {
    private long Field10790 = 0L;
    private long Field10791 = 0L;
    private long Field10792 = 0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL;
    private String Field10793 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean Method2778(long l) {
        if (System.currentTimeMillis() - this.Field10790 < l) return ((int)1849244950L ^ 0x6E393D16) != 0;
        return ((int)522445554L ^ 0x1F23E2F3) != 0;
    }

    public boolean Method2779(long l, boolean bl) {
        if (l < (0x285C3096L & 0x82C09FL)) {
            if (!((double)this.Method2804() >= (double)l / Double.longBitsToDouble(0x91965EAA5FEEF906L ^ 0xAE6C4AD0BEA95712L))) return (int)((long)-230389316 ^ (long)-230389316) != 0;
            if (!bl) return ((int)-1154523489L ^ 0xBB2F5E9E) != 0;
            this.Method2801();
            return ((int)-1154523489L ^ 0xBB2F5E9E) != 0;
        }
        if (this.Method2804() < l) return (int)((long)-230389316 ^ (long)-230389316) != 0;
        if (!bl) return ((int)-1273852385L ^ 0xB4128E1E) != 0;
        this.Method2801();
        return ((int)-1273852385L ^ 0xB4128E1E) != 0;
    }

    public long Method2780() {
        return System.nanoTime() / (0x240F6241L & 0x12FC760L);
    }

    public void Method2781(long l) {
        this.Field10790 = l;
    }

    public void Method2782() {
        this.Field10790 = System.currentTimeMillis();
    }

    public int Method2783(int n) {
        return (((int)-843551821L ^ 0xCDB86BCE) << 3) / n;
    }

    public void Method2784(long l) {
        this.Field10792 = System.nanoTime() - this.Method2808(l);
    }

    public void Method2785(long l) {
        this.Field10792 = System.nanoTime() - l;
    }

    public void Method2786(long l) {
        this.Field10792 = System.nanoTime() - this.Method2814(l);
    }

    public void Method2787(long l) {
        this.Field10792 = System.nanoTime() - this.Method2813(l);
    }

    public void Method2788(long l) {
        this.Field10792 = System.nanoTime() - this.Method2811(l);
    }

    public long Method2789() {
        return this.Method2807(this.Field10792);
    }

    public long Method2790() {
        return this.Field10792;
    }

    public long Method2791() {
        return this.Method2815(this.Field10792);
    }

    public long Method2792() {
        return this.Method2816(this.Field10792);
    }

    public long Method2793() {
        return this.Method2817(this.Field10792);
    }

    public boolean Method2794(long l) {
        return this.Method2795(this.Method2808(l));
    }

    public boolean Method2795(long l) {
        int n;
        if (System.nanoTime() - this.Field10792 >= l) {
            n = (int)-1479931944L ^ 0xA7CA07D9;
            return n != 0;
        }
        n = (int)((long)1184275243 ^ (long)1184275243);
        return n != 0;
    }

    public boolean Method2796(long l) {
        return this.Method2795(this.Method2814(l));
    }

    public boolean Method2797(long l) {
        return this.Method2795(this.Method2813(l));
    }

    public boolean Method2798(double d) {
        return this.Method2795((long)(d * Double.longBitsToDouble(0x7B281B5264F9E580L ^ 0x3B0C1B5264F9E580L)));
    }

    public boolean Method2799(long l) {
        return this.Method2795(this.Method2811(l));
    }

    public boolean Method2800(float f) {
        int n;
        if ((float)(this.Method2780() - this.Field10790) >= f) {
            n = (int)((long)-481568898 ^ (long)-481568897);
            return n != 0;
        }
        n = (int)((long)-2021359969 ^ (long)-2021359969);
        return n != 0;
    }

    public void Method2801() {
        this.Field10790 = this.Method2780();
        this.Field10792 = System.nanoTime();
    }

    public void Method2802(long l) {
        this.Field10790 = this.Method2780() + l;
        this.Field10792 = System.nanoTime();
    }

    public boolean Method2803(float f) {
        boolean bl;
        if ((float)(this.Method2804() - this.Field10791) >= f) {
            bl = (int)171277134L ^ 0xA357B4F;
            return bl;
        }
        bl = (int)430133928L ^ 0x19A352A8;
        return bl;
    }

    public long Method2804() {
        return System.nanoTime() / (0x88FDA40L & 0x627F4755L);
    }

    public long Method2805(long l) {
        return l / (0x1016232L & 0x627080F7L);
    }

    public long Method2806(long l) {
        return l * (0x4881532L & 0x4850C2BBL);
    }

    public long Method2807(long l) {
        return this.Method2805(this.Method2816(l));
    }

    public long Method2808(long l) {
        return this.Method2813(this.Method2806(l));
    }

    public long Method2809(long l) {
        return l * (0x291E47ECL & 0x33F8L);
    }

    public long Method2810(long l) {
        return this.Method2812(this.Method2809(l));
    }

    public long Method2811(long l) {
        return this.Method2814(this.Method2812(this.Method2809(l)));
    }

    public long Method2812(long l) {
        return l * (0x683803E8L & 0x4065FFAL);
    }

    public long Method2813(long l) {
        return this.Method2814(this.Method2812(l));
    }

    public long Method2814(long l) {
        return l * (0x204083FCL & 0x1333E8L);
    }

    public long Method2815(long l) {
        return l / (0x424463E9L & 0x82A0BF8L);
    }

    public long Method2816(long l) {
        return this.Method2818(this.Method2815(l));
    }

    public long Method2817(long l) {
        return this.Method2820(this.Method2818(this.Method2815(l)));
    }

    public long Method2818(long l) {
        return l / (0x109583E8L & 0x430017EDL);
    }

    public long Method2819(long l) {
        return this.Method2820(this.Method2818(l));
    }

    public long Method2820(long l) {
        return l / (0x18088BE8L & 0x21B603F8L);
    }
}

