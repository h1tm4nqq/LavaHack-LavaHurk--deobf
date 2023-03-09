/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public class Class1217 {
    public double Field13516;
    public double Field13517;
    public double Field13518;
    private int Field13519;

    public Class1217(double d, double d2, double d3) {
        this.Field13516 = d;
        this.Field13517 = d2;
        this.Field13518 = d3;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Class1217)) return false;
        Class1217 class1217 = (Class1217)object;
        if (class1217.Field13516 != this.Field13516) return false;
        if (class1217.Field13517 != this.Field13517) return false;
        if (class1217.Field13518 != this.Field13518) return false;
        return true;
    }

    public void Method4914() {
        this.Field13516 = Math.round(this.Field13516);
        this.Field13517 = Math.round(this.Field13517);
        this.Field13518 = Math.round(this.Field13518);
    }
}

