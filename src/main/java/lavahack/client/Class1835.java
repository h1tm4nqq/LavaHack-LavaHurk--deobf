/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1531;
import lavahack.client.Class155;
import lavahack.client.Class821;

public class Class1835
extends Class821 {
    public float Field16477;
    private String Field16478 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1835() {
        this(0.0f, 0.0f, 0.0f);
    }

    public Class1835(Class1835 class1835) {
        this(class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1835.Field16477);
    }

    public Class1835(float f) {
        this(f, f, f);
    }

    public Class1835(float f, float f2, float f3) {
        super(f, f2);
        this.Field16477 = f3;
    }

    public final float Method6907() {
        return this.Field16477;
    }

    public final void Method6908(float f) {
        this.Field16477 = f;
    }

    public Class1835 Method6909(Class1835 class1835) {
        return this.Method6910(class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1835.Field16477);
    }

    public Class1835 Method6910(float f, float f2, float f3) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = f;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = f2;
        this.Field16477 = f3;
        return this;
    }

    @Override
    public float Method3496() {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.Field16477 * this.Field16477;
    }

    public final double Method6911(Class1835 class1835) {
        return Math.sqrt(this.Method6912(class1835));
    }

    public float Method6912(Class1835 class1835) {
        return this.Method3499(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) + this.Method3499(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) + this.Method3499(this.Field16477 - class1835.Field16477);
    }

    public Class1835 Method6913() {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = -this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = -this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field16477 = -this.Field16477;
        return this;
    }

    public float Method6914(Class1835 class1835) {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.Field16477 * class1835.Field16477;
    }

    public Class1835 Method6915(double d) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = (float)((double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * d);
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = (float)((double)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * d);
        this.Field16477 = (float)((double)this.Field16477 * d);
        return this;
    }

    public Class1835 Method6916(Class1835 class1835) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field16477 += class1835.Field16477;
        return this;
    }

    public Class1835 Method6917(float f, float f2, float f3) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += f;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += f2;
        this.Field16477 += f3;
        return this;
    }

    public Class1835 Method6918(Class1835 class1835) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field16477 -= class1835.Field16477;
        return this;
    }

    public Class1835 Method6919(float f, float f2, float f3) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= f;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= f2;
        this.Field16477 -= f3;
        return this;
    }

    public Class155 Method6920() {
        return new Class155((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.Field16477));
    }

    public Class155 Method6921(Class155 class155) {
        return class155.Method1032((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.Field16477));
    }

    public Class1531 Method6922() {
        return new Class1531(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field16477);
    }

    public Class1531 Method6923(Class1531 class1531) {
        return class1531.Method5849(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field16477);
    }

    public Class1835 Method6924() {
        return new Class1835(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Class1835)) return false;
        if (!this.Method6925((Class1835)object)) return false;
        return true;
    }

    public boolean Method6925(Class1835 class1835) {
        return this.Method6926(class1835, Float.intBitsToFloat(925353388));
    }

    public boolean Method6926(Class1835 class1835, float f) {
        if (!(Math.abs(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) < f)) return false;
        if (!(Math.abs(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) < f)) return false;
        if (!(Math.abs(this.Field16477 - class1835.Field16477) < f)) return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s]", Float.valueOf(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), Float.valueOf(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), Float.valueOf(this.Field16477));
    }

    @Override
    public Class821 Method3512() {
        return this.Method6924();
    }

    @Override
    public Class821 Method3503(double d) {
        return this.Method6915(d);
    }

    @Override
    public Class821 Method3501() {
        return this.Method6913();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.Method6924();
    }

    private static String Method3515(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 96;
            cArray2[n] = (char)(cArray[n] ^ (0x39BE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

