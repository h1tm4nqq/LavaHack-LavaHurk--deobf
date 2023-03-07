/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public class Bja9p2KBIosyNSeMzImDQUic64LW6SyR {
    public double Field13516;
    public double Field13517;
    public double Field13518;
    private int Field13519;

    public Bja9p2KBIosyNSeMzImDQUic64LW6SyR(double d, double d2, double d3) {
        this.Field13516 = d;
        this.Field13517 = d2;
        this.Field13518 = d3;
    }

    public boolean equals(Object object) {
        int n;
        if (!(object instanceof Bja9p2KBIosyNSeMzImDQUic64LW6SyR)) return (int)((long)1381340757 ^ (long)1381340757) != 0;
        Bja9p2KBIosyNSeMzImDQUic64LW6SyR bja9p2KBIosyNSeMzImDQUic64LW6SyR = (Bja9p2KBIosyNSeMzImDQUic64LW6SyR)object;
        if (bja9p2KBIosyNSeMzImDQUic64LW6SyR.Field13516 == this.Field13516 && bja9p2KBIosyNSeMzImDQUic64LW6SyR.Field13517 == this.Field13517 && bja9p2KBIosyNSeMzImDQUic64LW6SyR.Field13518 == this.Field13518) {
            n = (int)((long)1492532989 ^ (long)1492532988);
            return n != 0;
        }
        n = (int)((long)-1624172124 ^ (long)-1624172124);
        return n != 0;
    }

    public void Method4914() {
        this.Field13516 = Math.round(this.Field13516);
        this.Field13517 = Math.round(this.Field13517);
        this.Field13518 = Math.round(this.Field13518);
    }
}

