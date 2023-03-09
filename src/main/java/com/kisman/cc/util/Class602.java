//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketTimeUpdate
 *  net.minecraft.util.math.MathHelper
 */
package com.kisman.cc.util;

import java.util.Arrays;
import java.util.function.Predicate;
import lavahack.client.Class1801;
import lavahack.client.Class544;
import lavahack.client.Class618;
import net.minecraft.network.play.server.SPacketTimeUpdate;
import net.minecraft.util.math.MathHelper;

public class Class602 {
    public static Class602 Field10562 = new Class602();
    private final float[] Field10563 = new float[20];
    private int Field10564 = 0;
    private long Field10565;
    @Class1801
    public final Class618 Field10566 = new Class618(Class602::Method2606, new Predicate[0]);
    private int Field10567;

    public void Method2601() {
        this.Field10564 = 0;
        this.Field10565 = -1L;
        Arrays.fill(this.Field10563, 0.0f);
    }

    public float Method2602() {
        float f = 0.0f;
        float f2 = 0.0f;
        float[] fArray = this.Field10563;
        int n = fArray.length;
        int n2 = 0;
        while (n2 < n) {
            float f3 = fArray[n2];
            if (f3 > 0.0f) {
                f2 += f3;
                f += 1.0f;
            }
            ++n2;
        }
        return MathHelper.clamp((float)(f2 / f), (float)0.0f, (float)Float.intBitsToFloat(1101004800));
    }

    public float Method2603() {
        float f = Float.intBitsToFloat(1101004800);
        float[] fArray = this.Field10563;
        int n = fArray.length;
        int n2 = 0;
        while (n2 < n) {
            float f2 = fArray[n2];
            if (f2 > 0.0f && f2 < f) {
                f = f2;
            }
            ++n2;
        }
        return MathHelper.clamp((float)f, (float)0.0f, (float)Float.intBitsToFloat(1101004800));
    }

    public float Method2604() {
        return MathHelper.clamp((float)this.Field10563[this.Field10563.length - 1], (float)0.0f, (float)Float.intBitsToFloat(1101004800));
    }

    public void Method2605() {
        if (this.Field10565 != -1L) {
            float f = (float)(System.currentTimeMillis() - this.Field10565) / Float.intBitsToFloat(1148846080);
            this.Field10563[this.Field10564 % this.Field10563.length] = MathHelper.clamp((float)(Float.intBitsToFloat(1101004800) / f), (float)0.0f, (float)Float.intBitsToFloat(1101004800));
            ++this.Field10564;
        }
        this.Field10565 = System.currentTimeMillis();
    }

    private static void Method2606(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketTimeUpdate)) return;
        Field10562.Method2605();
    }
}

