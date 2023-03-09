/*
 * Decompiled with CFR 0.152.
 */
package com.kisman.cc.util;

public class Class650 {
    private long Field10790 = 0L;
    private long Field10791 = 0L;
    private long Field10792 = -1L;
    private String Field10793 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean Method2778(long l) {
        if (System.currentTimeMillis() - this.Field10790 < l) return false;
        return true;
    }

    public boolean Method2779(long l, boolean bl) {
        if (l < 150L) {
            if (!((double)this.Method2804() >= (double)l / Double.longBitsToDouble(4610019686565260820L))) return false;
            if (!bl) return true;
            this.Method2801();
            return true;
        }
        if (this.Method2804() < l) return false;
        if (!bl) return true;
        this.Method2801();
        return true;
    }

    public long Method2780() {
        return System.nanoTime() / 1000000L;
    }

    public void Method2781(long l) {
        this.Field10790 = l;
    }

    public void Method2782() {
        this.Field10790 = System.currentTimeMillis();
    }

    public int Method2783(int n) {
        return 1000 / n;
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
        if (System.nanoTime() - this.Field10792 < l) return false;
        return true;
    }

    public boolean Method2796(long l) {
        return this.Method2795(this.Method2814(l));
    }

    public boolean Method2797(long l) {
        return this.Method2795(this.Method2813(l));
    }

    public boolean Method2798(double d) {
        return this.Method2795((long)(d * Double.longBitsToDouble(0x4024000000000000L)));
    }

    public boolean Method2799(long l) {
        return this.Method2795(this.Method2811(l));
    }

    public boolean Method2800(float f) {
        if (!((float)(this.Method2780() - this.Field10790) >= f)) return false;
        return true;
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
        if (!((float)(this.Method2804() - this.Field10791) >= f)) return false;
        return true;
    }

    public long Method2804() {
        return System.nanoTime() / 1000000L;
    }

    public long Method2805(long l) {
        return l / 50L;
    }

    public long Method2806(long l) {
        return l * 50L;
    }

    public long Method2807(long l) {
        return this.Method2805(this.Method2816(l));
    }

    public long Method2808(long l) {
        return this.Method2813(this.Method2806(l));
    }

    public long Method2809(long l) {
        return l * 1000L;
    }

    public long Method2810(long l) {
        return this.Method2812(this.Method2809(l));
    }

    public long Method2811(long l) {
        return this.Method2814(this.Method2812(this.Method2809(l)));
    }

    public long Method2812(long l) {
        return l * 1000L;
    }

    public long Method2813(long l) {
        return this.Method2814(this.Method2812(l));
    }

    public long Method2814(long l) {
        return l * 1000L;
    }

    public long Method2815(long l) {
        return l / 1000L;
    }

    public long Method2816(long l) {
        return this.Method2818(this.Method2815(l));
    }

    public long Method2817(long l) {
        return this.Method2820(this.Method2818(this.Method2815(l)));
    }

    public long Method2818(long l) {
        return l / 1000L;
    }

    public long Method2819(long l) {
        return this.Method2820(this.Method2818(l));
    }

    public long Method2820(long l) {
        return l / 1000L;
    }
}

