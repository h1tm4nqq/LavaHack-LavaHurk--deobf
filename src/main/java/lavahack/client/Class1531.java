/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class155;
import lavahack.client.Class1835;
import lavahack.client.Class2138;

public class Class1531
extends Class2138 {
    public double Field15157;
    private String Field15158 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1531() {
        this(0.0, 0.0, 0.0);
    }

    public Class1531(Class1531 class1531) {
        this(class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1531.Field15157);
    }

    public Class1531(double d) {
        this(d, d, d);
    }

    public Class1531(double d, double d2, double d3) {
        super(d, d2);
        this.Field15157 = d3;
    }

    public final double Method5846() {
        return this.Field15157;
    }

    public final void Method5847(double d) {
        this.Field15157 = d;
    }

    public Class1531 Method5848(Class1531 class1531) {
        return this.Method5849(class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1531.Field15157);
    }

    public Class1531 Method5849(double d, double d2, double d3) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = d;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = d2;
        this.Field15157 = d3;
        return this;
    }

    @Override
    public double Method5826() {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.Field15157 * this.Field15157;
    }

    public final double Method5850(Class1531 class1531) {
        return Math.sqrt(this.Method5851(class1531));
    }

    public double Method5851(Class1531 class1531) {
        return this.Method5829(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) + this.Method5829(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) + this.Method5829(this.Field15157 - class1531.Field15157);
    }

    public Class1531 Method5852() {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = -this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = -this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field15157 = -this.Field15157;
        return this;
    }

    public double Method5853(Class1531 class1531) {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.Field15157 * class1531.Field15157;
    }

    public Class1531 Method5854(double d) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf *= d;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV *= d;
        this.Field15157 *= d;
        return this;
    }

    public Class1531 Method5855(Class1531 class1531) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field15157 += class1531.Field15157;
        return this;
    }

    public Class1531 Method5856(double d, double d2, double d3) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += d;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += d2;
        this.Field15157 += d3;
        return this;
    }

    public Class1531 Method5857(Class1531 class1531) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field15157 -= class1531.Field15157;
        return this;
    }

    public Class1531 Method5858(double d, double d2, double d3) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= d;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= d2;
        this.Field15157 -= d3;
        return this;
    }

    public Class155 Method5859() {
        return new Class155((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.Field15157));
    }

    public Class155 Method5860(Class155 class155) {
        return class155.Method1032((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.Field15157));
    }

    public Class1835 Method5861() {
        return new Class1835((float)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (float)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (float)Math.floor(this.Field15157));
    }

    public Class1835 Method5862(Class1835 class1835) {
        return class1835.Method6910((float)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (float)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (float)Math.floor(this.Field15157));
    }

    public Class1531 Method5863() {
        return new Class1531(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Class1531)) return false;
        if (!this.Method5864((Class1531)object)) return false;
        return true;
    }

    public boolean Method5864(Class1531 class1531) {
        return this.Method5865(class1531, Double.longBitsToDouble((long)1824382635 ^ 0x3EE4F8B5ECBDDEABL));
    }

    public boolean Method5865(Class1531 class1531, double d) {
        if (!(Math.abs(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) < d)) return false;
        if (!(Math.abs(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) < d)) return false;
        if (!(Math.abs(this.Field15157 - class1531.Field15157) < d)) return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s]", this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field15157);
    }

    @Override
    public Class2138 Method5842() {
        return this.Method5863();
    }

    @Override
    public Class2138 Method5833(double d) {
        return this.Method5854(d);
    }

    @Override
    public Class2138 Method5831() {
        return this.Method5852();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.Method5863();
    }

    private static String Method5845(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 173;
            cArray2[n] = (char)(cArray[n] ^ (0x284B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

