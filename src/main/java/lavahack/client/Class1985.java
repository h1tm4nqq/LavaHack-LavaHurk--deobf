/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1460;
import lavahack.client.Class1835;
import lavahack.client.Class285;
import lavahack.client.Class821;

public class Class1985
extends Class1835 {
    public float Field17125;
    private int Field17126;

    public Class1985() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class1985(Class1985 class1985) {
        this(class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, class1985.Field17125);
    }

    public Class1985(float f) {
        this(f, f, f, f);
    }

    public Class1985(float f, float f2, float f3, float f4) {
        super(f, f2, f3);
        this.Field17125 = f4;
    }

    public final float Method7343() {
        return this.Field17125;
    }

    public final void Method7344(float f) {
        this.Field17125 = f;
    }

    public Class1985 Method7345(Class1985 class1985) {
        return this.Method7346(class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, class1985.Field17125);
    }

    public Class1985 Method7346(float f, float f2, float f3, float f4) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = f;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = f2;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = f3;
        this.Field17125 = f4;
        return this;
    }

    @Override
    public float Method3496() {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV * this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + this.Field17125 * this.Field17125;
    }

    public final double Method7347(Class1985 class1985) {
        return Math.sqrt(this.Method7348(class1985));
    }

    public float Method7348(Class1985 class1985) {
        return this.Method3499(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) + this.Method3499(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) + this.Method3499(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV - class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) + this.Method3499(this.Field17125 - class1985.Field17125);
    }

    public Class1985 Method7349() {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = -this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = -this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = -this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field17125 = -this.Field17125;
        return this;
    }

    public float Method7350(Class1985 class1985) {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV * class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + this.Field17125 * class1985.Field17125;
    }

    public Class1985 Method7351(double d) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = (float)((double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * d);
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = (float)((double)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * d);
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = (float)((double)this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV * d);
        this.Field17125 = (float)((double)this.Field17125 * d);
        return this;
    }

    public Class1985 Method7352(Class1985 class1985) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV += class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field17125 += class1985.Field17125;
        return this;
    }

    public Class1985 Method7353(float f, float f2, float f3, float f4) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += f;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += f2;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV += f3;
        this.Field17125 += f4;
        return this;
    }

    public Class1985 Method7354(Class1985 class1985) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV -= class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field17125 -= class1985.Field17125;
        return this;
    }

    public Class1985 Method7355(float f, float f2, float f3, float f4) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= f;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= f2;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV -= f3;
        this.Field17125 -= f4;
        return this;
    }

    public Class285 Method7356() {
        return new Class285((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), (int)Math.floor(this.Field17125));
    }

    public Class285 Method7357(Class285 class285) {
        return class285.Method1503((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), (int)Math.floor(this.Field17125));
    }

    public Class1460 Method7358() {
        return new Class1460(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field17125);
    }

    public Class1460 Method7359(Class1460 class1460) {
        return class1460.Method5869(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field17125);
    }

    public Class1985 Method7360() {
        return new Class1985(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Class1985)) return false;
        if (!this.Method7361((Class1985)object)) return false;
        return true;
    }

    public boolean Method7361(Class1985 class1985) {
        return this.Method7362(class1985, Float.intBitsToFloat(925353388));
    }

    public boolean Method7362(Class1985 class1985, float f) {
        if (!(Math.abs(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) < f)) return false;
        if (!(Math.abs(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) < f)) return false;
        if (!(Math.abs(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV - class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) < f)) return false;
        if (!(Math.abs(this.Field17125 - class1985.Field17125) < f)) return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s, %s]", Float.valueOf(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), Float.valueOf(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), Float.valueOf(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), Float.valueOf(this.Field17125));
    }

    @Override
    public Class1835 Method6924() {
        return this.Method7360();
    }

    @Override
    public Class1835 Method6915(double d) {
        return this.Method7351(d);
    }

    @Override
    public Class1835 Method6913() {
        return this.Method7349();
    }

    @Override
    public Class821 Method3512() {
        return this.Method7360();
    }

    @Override
    public Class821 Method3503(double d) {
        return this.Method7351(d);
    }

    @Override
    public Class821 Method3501() {
        return this.Method7349();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.Method7360();
    }

    private static String Method3515(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 2;
            cArray2[n] = (char)(cArray[n] ^ (0x58F9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

