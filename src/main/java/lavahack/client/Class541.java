/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class2138;
import lavahack.client.Class821;

public class Class541 {
    public int Field10303;
    public int Field10304;
    private int Field10305;

    public Class541() {
        this(0, 0);
    }

    public Class541(Class541 class541) {
        this(class541.Field10303, class541.Field10304);
    }

    public Class541(int n) {
        this(n, n);
    }

    public Class541(int n, int n2) {
        this.Field10303 = n;
        this.Field10304 = n2;
    }

    public final int Method1003() {
        return this.Field10303;
    }

    public final int Method1004() {
        return this.Field10304;
    }

    public final void Method1005(int n) {
        this.Field10303 = n;
    }

    public final void Method1006(int n) {
        this.Field10304 = n;
    }

    public Class541 Method1007(Class541 class541) {
        return this.Method1008(class541.Field10303, class541.Field10304);
    }

    public Class541 Method1008(int n, int n2) {
        this.Field10303 = n;
        this.Field10304 = n2;
        return this;
    }

    public final double Method1009() {
        return Math.sqrt(this.Method1010());
    }

    public int Method1010() {
        return this.Field10303 * this.Field10303 + this.Field10304 * this.Field10304;
    }

    public final double Method1011(Class541 class541) {
        return Math.sqrt(this.Method1012(class541));
    }

    public int Method1012(Class541 class541) {
        return this.Method1013(this.Field10303 - class541.Field10303) + this.Method1013(this.Field10304 - class541.Field10304);
    }

    protected final int Method1013(int n) {
        return n * n;
    }

    public final Class541 Method1014() {
        double d = this.Method1009();
        if (d == 0.0) return this;
        return this.Method1017(1.0 / d);
    }

    public Class541 Method1015() {
        this.Field10303 = -this.Field10303;
        this.Field10304 = -this.Field10304;
        return this;
    }

    public double Method1016(Class541 class541) {
        return this.Field10303 * class541.Field10303 + this.Field10304 * class541.Field10304;
    }

    public Class541 Method1017(double d) {
        this.Field10303 = (int)((double)this.Field10303 * d);
        this.Field10304 = (int)((double)this.Field10304 * d);
        return this;
    }

    public Class541 Method1018(Class541 class541) {
        this.Field10303 += class541.Field10303;
        this.Field10304 += class541.Field10304;
        return this;
    }

    public Class541 Method1019(int n, int n2) {
        this.Field10303 += n;
        this.Field10304 += n2;
        return this;
    }

    public Class541 Method1020(Class541 class541) {
        this.Field10303 -= class541.Field10303;
        this.Field10304 -= class541.Field10304;
        return this;
    }

    public Class541 Method1021(int n, int n2) {
        this.Field10303 -= n;
        this.Field10304 -= n2;
        return this;
    }

    public Class821 Method1022() {
        return new Class821(this.Field10303, this.Field10304);
    }

    public Class821 Method1023(Class821 class821) {
        return class821.Method3494(this.Field10303, this.Field10304);
    }

    public Class2138 Method1024() {
        return new Class2138(this.Field10303, this.Field10304);
    }

    public Class2138 Method1025(Class2138 class2138) {
        return class2138.Method5824(this.Field10303, this.Field10304);
    }

    public Class541 Method1026() {
        return new Class541(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Class541)) return false;
        if (!this.Method1027((Class541)object)) return false;
        return true;
    }

    public boolean Method1027(Class541 class541) {
        if (this.Field10303 != class541.Field10303) return false;
        if (this.Field10304 != class541.Field10304) return false;
        return true;
    }

    public String toString() {
        return String.format("[%s, %s]", this.Field10303, this.Field10304);
    }

    public Object clone() throws CloneNotSupportedException {
        return this.Method1026();
    }

    private static String Method1028(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 45;
            cArray2[n] = (char)(cArray[n] ^ (0x1B28 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

