//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import java.util.function.*;
import java.util.*;
import net.minecraft.util.math.*;
import lavahack.client.*;
import net.minecraft.network.play.server.*;

public class Class602
{
    public static Class602 Field10562;
    private final float[] Field10563;
    private int Field10564;
    private long Field10565;
    @Class1801
    public final Class618 Field10566;
    private int Field10567;
    
    public Class602() {
        this.Field10563 = new float[20];
        this.Field10564 = 0;
        this.Field10566 = new Class618(Class602::Method2606, new Predicate[0]);
    }
    
    public void Method2601() {
        this.Field10564 = 0;
        this.Field10565 = -1L;
        Arrays.fill(this.Field10563, 0.0f);
    }
    
    public float Method2602() {
        float n = 0.0f;
        float n2 = 0.0f;
        for (final float n3 : this.Field10563) {
            if (n3 > 0.0f) {
                n2 += n3;
                ++n;
            }
        }
        return MathHelper.clamp(n2 / n, 0.0f, Float.intBitsToFloat(1101004800));
    }
    
    public float Method2603() {
        float intBitsToFloat = Float.intBitsToFloat(1101004800);
        for (final float n : this.Field10563) {
            if (n > 0.0f && n < intBitsToFloat) {
                intBitsToFloat = n;
            }
        }
        return MathHelper.clamp(intBitsToFloat, 0.0f, Float.intBitsToFloat(1101004800));
    }
    
    public float Method2604() {
        return MathHelper.clamp(this.Field10563[this.Field10563.length - 1], 0.0f, Float.intBitsToFloat(1101004800));
    }
    
    public void Method2605() {
        if (this.Field10565 != -1L) {
            this.Field10563[this.Field10564 % this.Field10563.length] = MathHelper.clamp(Float.intBitsToFloat(1101004800) / ((System.currentTimeMillis() - this.Field10565) / Float.intBitsToFloat(1148846080)), 0.0f, Float.intBitsToFloat(1101004800));
            ++this.Field10564;
        }
        this.Field10565 = System.currentTimeMillis();
    }
    
    private static void Method2606(final Class544 class544) {
        if (class544.Method982() instanceof SPacketTimeUpdate) {
            Class602.Field10562.Method2605();
        }
    }
    
    static {
        Class602.Field10562 = new Class602();
    }
}
