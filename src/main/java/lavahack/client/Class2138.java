/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class541;
import lavahack.client.Class821;

public class Class2138 {
    public static final double Field17785 = 0.0;
    public double Field17786;
    public double Field17787;
    private String Field17788 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2138() {
        this(0.0, 0.0);
    }

    public Class2138(Class2138 class2138) {
        this(class2138.Field17786, class2138.Field17787);
    }

    public Class2138(double d) {
        this(d, d);
    }

    public Class2138(double d, double d2) {
        this.Field17786 = d;
        this.Field17787 = d2;
    }

    public final double Method5819() {
        return this.Field17786;
    }

    public final double Method5820() {
        return this.Field17787;
    }

    public final void Method5821(double d) {
        this.Field17786 = d;
    }

    public final void Method5822(double d) {
        this.Field17787 = d;
    }

    public Class2138 Method5823(Class2138 class2138) {
        return this.Method5824(class2138.Field17786, class2138.Field17787);
    }

    public Class2138 Method5824(double d, double d2) {
        this.Field17786 = d;
        this.Field17787 = d2;
        return this;
    }

    public final double Method5825() {
        return Math.sqrt(this.Method5826());
    }

    public double Method5826() {
        return this.Field17786 * this.Field17786 + this.Field17787 * this.Field17787;
    }

    public final double Method5827(Class2138 class2138) {
        return Math.sqrt(this.Method5828(class2138));
    }

    public double Method5828(Class2138 class2138) {
        return this.Method5829(this.Field17786 - class2138.Field17786) + this.Method5829(this.Field17787 - class2138.Field17787);
    }

    protected final double Method5829(double d) {
        return d * d;
    }

    public final Class2138 Method5830() {
        double d = this.Method5825();
        if (d == 0.0) return this;
        return this.Method5833(1.0 / d);
    }

    public Class2138 Method5831() {
        this.Field17786 = -this.Field17786;
        this.Field17787 = -this.Field17787;
        return this;
    }

    public double Method5832(Class2138 class2138) {
        return this.Field17786 * class2138.Field17786 + this.Field17787 * class2138.Field17787;
    }

    public Class2138 Method5833(double d) {
        this.Field17786 *= d;
        this.Field17787 *= d;
        return this;
    }

    public Class2138 Method5834(Class2138 class2138) {
        this.Field17786 += class2138.Field17786;
        this.Field17787 += class2138.Field17787;
        return this;
    }

    public Class2138 Method5835(double d, double d2) {
        this.Field17786 += d;
        this.Field17787 += d2;
        return this;
    }

    public Class2138 Method5836(Class2138 class2138) {
        this.Field17786 -= class2138.Field17786;
        this.Field17787 -= class2138.Field17787;
        return this;
    }

    public Class2138 Method5837(double d, double d2) {
        this.Field17786 -= d;
        this.Field17787 -= d2;
        return this;
    }

    public Class541 Method5838() {
        return new Class541((int)Math.floor(this.Field17786), (int)Math.floor(this.Field17787));
    }

    public Class541 Method5839(Class541 class541) {
        return class541.Method1008((int)Math.floor(this.Field17786), (int)Math.floor(this.Field17787));
    }

    public Class821 Method5840() {
        return new Class821((float)Math.floor(this.Field17786), (float)Math.floor(this.Field17787));
    }

    public Class821 Method5841(Class821 class821) {
        return class821.Method3494((float)Math.floor(this.Field17786), (float)Math.floor(this.Field17787));
    }

    public Class2138 Method5842() {
        return new Class2138(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Class2138)) return false;
        if (!this.Method5843((Class2138)object)) return false;
        return true;
    }

    public boolean Method5843(Class2138 class2138) {
        return this.Method5844(class2138, Double.longBitsToDouble((long)1372050612 ^ 0x3EE4F8B5D1C7D4B4L));
    }

    public boolean Method5844(Class2138 class2138, double d) {
        if (!(Math.abs(this.Field17786 - class2138.Field17786) < d)) return false;
        if (!(Math.abs(this.Field17787 - class2138.Field17787) < d)) return false;
        return true;
    }

    public String toString() {
        return String.format("[%s, %s]", this.Field17786, this.Field17787);
    }

    public Object clone() throws CloneNotSupportedException {
        return this.Method5842();
    }

    private static String Method5845(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 135;
            cArray2[n] = (char)(cArray[n] ^ (0x427F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

