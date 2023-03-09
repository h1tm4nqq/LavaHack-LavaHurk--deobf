/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe
 */
package lavahack.client;

import java.util.Arrays;
import lavahack.client.Class655;
import lavahack.client.Class684;
import lavahack.client.Class816;
import lavahack.client.OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe;

class Class1518
extends Class816 {
    private Class684[] Field15109;
    private String Field15110 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1518(int ... nArray) {
        super(nArray);
    }

    @Override
    public Class684[] Method3469() {
        this.Method6048();
        return (OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe[])Arrays.copyOf(this.Field15109, this.Field15109.length);
    }

    @Override
    public Class684 Method3470(int n) {
        this.Method6048();
        return this.Field15109[n];
    }

    @Override
    public Class684 Method3471() {
        this.Method6048();
        Class684[] class684Array = this.Field15109;
        int n = class684Array.length;
        int n2 = 0;
        while (n2 < n) {
            Class684 class684 = class684Array[n2];
            if (class684 == Class684.Field10896) {
                return Class684.Field10896;
            }
            ++n2;
        }
        return Class684.Field10897;
    }

    @Override
    public Class684 Method3472() {
        this.Method6048();
        Class684[] class684Array = this.Field15109;
        int n = class684Array.length;
        int n2 = 0;
        while (n2 < n) {
            Class684 class684 = class684Array[n2];
            if (class684 == Class684.Field10897) {
                return Class684.Field10897;
            }
            ++n2;
        }
        return Class684.Field10896;
    }

    private void Method6048() {
        Class684[] class684Array = new Class684[this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.length];
        int n = 0;
        while (true) {
            if (n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.length) {
                this.Field15109 = class684Array;
                return;
            }
            class684Array[n] = Class684.Method2878(Class655.Method2829(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[n]));
            ++n;
        }
    }
}

