/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public class Class357 {
    public long Field9489;
    public double Field9490;
    public double Field9491;
    public double Field9492;
    public boolean Field9493;
    public boolean Field9494;
    public boolean Field9495;
    public long Field9496;
    public long Field9497;
    public double Field9498;
    public long Field9499;
    public boolean Field9500;
    private int Field9501;

    public Class357(long l, double d, double d2) {
        this.Field9489 = l;
        this.Field9490 = d;
        this.Field9491 = d2;
        this.Field9496 = System.currentTimeMillis();
        this.Field9493 = true;
        this.Field9499 = System.currentTimeMillis() - this.Field9496;
        this.Field9498 = (d2 - d) / (double)l;
        this.Field9497 = System.currentTimeMillis();
    }

    public void Method1792() {
        if (this.Field9493) {
            this.Field9492 += this.Field9498 * (double)(System.currentTimeMillis() - this.Field9497);
        }
        this.Field9497 = System.currentTimeMillis();
    }

    public void Method1793(long l) {
        this.Field9489 = l;
        this.Field9498 = (this.Field9491 - this.Field9490) / (double)l;
        if (this.Field9493) {
            this.Field9492 += this.Field9498 * (double)(System.currentTimeMillis() - this.Field9497);
        }
        this.Field9497 = System.currentTimeMillis();
    }

    public void Method1794() {
        this.Field9493 = true;
    }

    public void Method1795() {
        this.Field9493 = false;
    }

    public double Method1796() {
        return this.Field9490 + this.Field9492;
    }
}

