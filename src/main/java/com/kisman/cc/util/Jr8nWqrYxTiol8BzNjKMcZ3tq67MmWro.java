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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import net.minecraft.network.play.server.SPacketTimeUpdate;
import net.minecraft.util.math.MathHelper;

public class Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro {
    public static Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro Field10562 = new Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro();
    private final float[] Field10563 = new float[((int)-1258754869L ^ 0xB4F8ECCE) << 2];
    private int Field10564 = (int)((long)719304048 ^ (long)719304048);
    private long Field10565;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    public final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10566 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro::Method2606, new Predicate[(int)-524090878L ^ 0xE0C30202]);
    private int Field10567;

    public void Method2601() {
        this.Field10564 = (int)863803600L ^ 0x337C98D0;
        this.Field10565 = 0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL;
        Arrays.fill(this.Field10563, 0.0f);
    }

    public float Method2602() {
        float f = 0.0f;
        float f2 = 0.0f;
        float[] fArray = this.Field10563;
        int n = fArray.length;
        int n2 = (int)((long)-1549666871 ^ (long)-1549666871);
        while (n2 < n) {
            float f3 = fArray[n2];
            if (f3 > 0.0f) {
                f2 += f3;
                f += 1.0f;
            }
            ++n2;
        }
        return MathHelper.clamp((float)(f2 / f), (float)0.0f, (float)Float.intBitsToFloat(0x4E3EDA6F ^ 0xF9EDA6F));
    }

    public float Method2603() {
        float f = Float.intBitsToFloat((int)((long)1640000754 ^ (long)543190258));
        float[] fArray = this.Field10563;
        int n = fArray.length;
        int n2 = (int)-1187874411L ^ 0xB9327995;
        while (n2 < n) {
            float f2 = fArray[n2];
            if (f2 > 0.0f && f2 < f) {
                f = f2;
            }
            ++n2;
        }
        return MathHelper.clamp((float)f, (float)0.0f, (float)Float.intBitsToFloat((int)((long)50105912 ^ (long)1130139192)));
    }

    public float Method2604() {
        return MathHelper.clamp((float)this.Field10563[this.Field10563.length - ((int)-64184531L ^ 0xFC2C9F2C)], (float)0.0f, (float)Float.intBitsToFloat(0x22457193 ^ 0x63E57193));
    }

    public void Method2605() {
        if (this.Field10565 != (0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL)) {
            float f = (float)(System.currentTimeMillis() - this.Field10565) / Float.intBitsToFloat(0x5D27883D ^ 0x195D883D);
            this.Field10563[this.Field10564 % this.Field10563.length] = MathHelper.clamp((float)(Float.intBitsToFloat((int)423892440L ^ 0x58E415D8) / f), (float)0.0f, (float)Float.intBitsToFloat((int)1862306019L ^ 0x2EA088E3));
            this.Field10564 += (int)-348617086L ^ 0xEB388683;
        }
        this.Field10565 = System.currentTimeMillis();
    }

    private static void Method2606(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketTimeUpdate)) return;
        Field10562.Method2605();
    }
}

