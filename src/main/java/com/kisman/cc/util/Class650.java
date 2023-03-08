//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

public class Class650
{
    private long Field10790;
    private long Field10791;
    private long Field10792;
    private String Field10793 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class650() {
        this.Field10790 = 0L;
        this.Field10791 = 0L;
        this.Field10792 = -1L;
    }
    
    public boolean Method2778(final long n) {
        return System.currentTimeMillis() - this.Field10790 >= n;
    }
    
    public boolean Method2779(final long n, final boolean b) {
        if (n < 150L) {
            if (this.Method2804() >= n / Double.longBitsToDouble(4610019686565260820L)) {
                if (b) {
                    this.Method2801();
                }
                return true;
            }
        }
        else if (this.Method2804() >= n) {
            if (b) {
                this.Method2801();
            }
            return true;
        }
        return false;
    }
    
    public long Method2780() {
        return System.nanoTime() / 1000000L;
    }
    
    public void Method2781(final long field10790) {
        this.Field10790 = field10790;
    }
    
    public void Method2782() {
        this.Field10790 = System.currentTimeMillis();
    }
    
    public int Method2783(final int n) {
        return 1000 / n;
    }
    
    public void Method2784(final long n) {
        this.Field10792 = System.nanoTime() - this.Method2808(n);
    }
    
    public void Method2785(final long n) {
        this.Field10792 = System.nanoTime() - n;
    }
    
    public void Method2786(final long n) {
        this.Field10792 = System.nanoTime() - this.Method2814(n);
    }
    
    public void Method2787(final long n) {
        this.Field10792 = System.nanoTime() - this.Method2813(n);
    }
    
    public void Method2788(final long n) {
        this.Field10792 = System.nanoTime() - this.Method2811(n);
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
    
    public boolean Method2794(final long n) {
        return this.Method2795(this.Method2808(n));
    }
    
    public boolean Method2795(final long n) {
        return System.nanoTime() - this.Field10792 >= n;
    }
    
    public boolean Method2796(final long n) {
        return this.Method2795(this.Method2814(n));
    }
    
    public boolean Method2797(final long n) {
        return this.Method2795(this.Method2813(n));
    }
    
    public boolean Method2798(final double n) {
        return this.Method2795((long)(n * Double.longBitsToDouble(4621819117588971520L)));
    }
    
    public boolean Method2799(final long n) {
        return this.Method2795(this.Method2811(n));
    }
    
    public boolean Method2800(final float n) {
        return this.Method2780() - this.Field10790 >= n;
    }
    
    public void Method2801() {
        this.Field10790 = this.Method2780();
        this.Field10792 = System.nanoTime();
    }
    
    public void Method2802(final long n) {
        this.Field10790 = this.Method2780() + n;
        this.Field10792 = System.nanoTime();
    }
    
    public boolean Method2803(final float n) {
        return this.Method2804() - this.Field10791 >= n;
    }
    
    public long Method2804() {
        return System.nanoTime() / 1000000L;
    }
    
    public long Method2805(final long n) {
        return n / 50L;
    }
    
    public long Method2806(final long n) {
        return n * 50L;
    }
    
    public long Method2807(final long n) {
        return this.Method2805(this.Method2816(n));
    }
    
    public long Method2808(final long n) {
        return this.Method2813(this.Method2806(n));
    }
    
    public long Method2809(final long n) {
        return n * 1000L;
    }
    
    public long Method2810(final long n) {
        return this.Method2812(this.Method2809(n));
    }
    
    public long Method2811(final long n) {
        return this.Method2814(this.Method2812(this.Method2809(n)));
    }
    
    public long Method2812(final long n) {
        return n * 1000L;
    }
    
    public long Method2813(final long n) {
        return this.Method2814(this.Method2812(n));
    }
    
    public long Method2814(final long n) {
        return n * 1000L;
    }
    
    public long Method2815(final long n) {
        return n / 1000L;
    }
    
    public long Method2816(final long n) {
        return this.Method2818(this.Method2815(n));
    }
    
    public long Method2817(final long n) {
        return this.Method2820(this.Method2818(this.Method2815(n)));
    }
    
    public long Method2818(final long n) {
        return n / 1000L;
    }
    
    public long Method2819(final long n) {
        return this.Method2820(this.Method2818(n));
    }
    
    public long Method2820(final long n) {
        return n / 1000L;
    }
}
