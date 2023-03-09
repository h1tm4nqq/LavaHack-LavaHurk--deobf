/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1531;
import lavahack.client.Class1985;
import lavahack.client.Class2138;
import lavahack.client.Class285;

public class Class1460
extends Class1531 {
    public double Field14832;
    private String Field14833 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1460() {
        this(0.0, 0.0, 0.0, 0.0);
    }

    public Class1460(Class1460 class1460) {
        this(class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, class1460.Field14832);
    }

    public Class1460(double d) {
        this(d, d, d, d);
    }

    public Class1460(double d, double d2, double d3, double d4) {
        super(d, d2, d3);
        this.Field14832 = d4;
    }

    public final double Method5866() {
        return this.Field14832;
    }

    public final void Method5867(double d) {
        this.Field14832 = d;
    }

    public Class1460 Method5868(Class1460 class1460) {
        return this.Method5869(class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, class1460.Field14832);
    }

    public Class1460 Method5869(double d, double d2, double d3, double d4) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = d;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = d2;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = d3;
        this.Field14832 = d4;
        return this;
    }

    @Override
    public double Method5826() {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV * this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + this.Field14832 * this.Field14832;
    }

    public final double Method5870(Class1460 class1460) {
        return Math.sqrt(this.Method5871(class1460));
    }

    public double Method5871(Class1460 class1460) {
        return this.Method5829(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) + this.Method5829(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) + this.Method5829(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV - class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) + this.Method5829(this.Field14832 - class1460.Field14832);
    }

    public Class1460 Method5872() {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = -this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = -this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = -this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field14832 = -this.Field14832;
        return this;
    }

    public double Method5873(Class1460 class1460) {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV * class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + this.Field14832 * class1460.Field14832;
    }

    public Class1460 Method5874(double d) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf *= d;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV *= d;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV *= d;
        this.Field14832 *= d;
        return this;
    }

    public Class1460 Method5875(Class1460 class1460) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV += class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field14832 += class1460.Field14832;
        return this;
    }

    public Class1460 Method5876(double d, double d2, double d3, double d4) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += d;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += d2;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV += d3;
        this.Field14832 += d4;
        return this;
    }

    public Class1460 Method5877(Class1460 class1460) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV -= class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field14832 -= class1460.Field14832;
        return this;
    }

    public Class1460 Method5878(double d, double d2, double d3, double d4) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= d;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= d2;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV -= d3;
        this.Field14832 -= d4;
        return this;
    }

    public Class285 Method5879() {
        return new Class285((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), (int)Math.floor(this.Field14832));
    }

    public Class285 Method5880(Class285 class285) {
        return class285.Method1503((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), (int)Math.floor(this.Field14832));
    }

    public Class1985 Method5881() {
        return new Class1985((float)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (float)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (float)Math.floor(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), (float)Math.floor(this.Field14832));
    }

    public Class1985 Method5882(Class1985 class1985) {
        return class1985.Method7346((float)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (float)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (float)Math.floor(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), (float)Math.floor(this.Field14832));
    }

    public Class1460 Method5883() {
        return new Class1460(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Class1460)) return false;
        if (!this.Method5884((Class1460)object)) return false;
        return true;
    }

    public boolean Method5884(Class1460 class1460) {
        return this.Method5885(class1460, Double.longBitsToDouble(4532020583461814272L));
    }

    public boolean Method5885(Class1460 class1460, double d) {
        if (!(Math.abs(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) < d)) return false;
        if (!(Math.abs(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) < d)) return false;
        if (!(Math.abs(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV - class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) < d)) return false;
        if (!(Math.abs(this.Field14832 - class1460.Field14832) < d)) return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s, %s]", this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field14832);
    }

    @Override
    public Class1531 Method5863() {
        return this.Method5883();
    }

    @Override
    public Class1531 Method5854(double d) {
        return this.Method5874(d);
    }

    @Override
    public Class1531 Method5852() {
        return this.Method5872();
    }

    @Override
    public Class2138 Method5842() {
        return this.Method5883();
    }

    @Override
    public Class2138 Method5833(double d) {
        return this.Method5874(d);
    }

    @Override
    public Class2138 Method5831() {
        return this.Method5872();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.Method5883();
    }

    private static String Method5845(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 73;
            cArray2[n] = (char)(cArray[n] ^ (0x56FD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

