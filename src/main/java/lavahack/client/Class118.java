/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1763;

interface Class118 {
    default public double Method845(float f) {
        if (f < 0.0f) {
            return 0.0;
        }
        if (!(f > 1.0f)) return (Double)this.Method849().Method1726(f);
        return 1.0;
    }

    default public double Method846(float f) {
        return 1.0 - this.Method845(f);
    }

    default public double Method847(float f, float f2, float f3) {
        if (f3 == f2) {
            return 0.0;
        }
        if (f3 < f2) {
            float f4 = f3;
            f3 = f2;
            f2 = f4;
        }
        if (f <= 0.0f) {
            return f3;
        }
        if (f >= 1.0f) {
            return f2;
        }
        double d = this.Method846(f);
        double d2 = f3;
        double d3 = f2;
        return d3 + (d2 - d3) * d;
    }

    default public double Method848(float f) {
        if (f <= 0.0f) {
            return 1.0;
        }
        if (!(f >= 1.0f)) return this.Method846(f);
        return 0.0;
    }

    public Class1763 Method849();
}

