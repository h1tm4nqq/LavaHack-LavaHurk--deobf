/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1460;
import lavahack.client.Class155;
import lavahack.client.Class1985;
import lavahack.client.Class541;

public class Class285
extends Class155 {
    public int Field9230;
    private int Field9231;

    public Class285() {
        this(0, 0, 0, 0);
    }

    public Class285(Class285 class285) {
        this(class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class285.Field9230);
    }

    public Class285(int n) {
        this(n, n, n, n);
    }

    public Class285(int n, int n2, int n3, int n4) {
        super(n, n2, n3);
        this.Field9230 = n4;
    }

    public final int Method1500() {
        return this.Field9230;
    }

    public final void Method1501(int n) {
        this.Field9230 = n;
    }

    public Class285 Method1502(Class285 class285) {
        return this.Method1503(class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class285.Field9230);
    }

    public Class285 Method1503(int n, int n2, int n3, int n4) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi = n;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = n2;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = n3;
        this.Field9230 = n4;
        return this;
    }

    @Override
    public int Method1010() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi * this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.Field9230 * this.Field9230;
    }

    public final double Method1504(Class285 class285) {
        return Math.sqrt(this.Method1505(class285));
    }

    public int Method1505(Class285 class285) {
        return this.Method1013(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi - class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) + this.Method1013(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) + this.Method1013(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) + this.Method1013(this.Field9230 - class285.Field9230);
    }

    public Class285 Method1506() {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi = -this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = -this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = -this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field9230 = -this.Field9230;
        return this;
    }

    public double Method1507(Class285 class285) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi * class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.Field9230 * class285.Field9230;
    }

    public Class285 Method1508(double d) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (int)((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi * d);
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = (int)((double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * d);
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = (int)((double)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * d);
        this.Field9230 = (int)((double)this.Field9230 * d);
        return this;
    }

    public Class285 Method1509(Class285 class285) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi += class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field9230 += class285.Field9230;
        return this;
    }

    public Class285 Method1510(int n, int n2, int n3, int n4) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi += n;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += n2;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += n3;
        this.Field9230 += n4;
        return this;
    }

    public Class285 Method1511(Class285 class285) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi -= class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field9230 -= class285.Field9230;
        return this;
    }

    public Class285 Method1512(int n, int n2, int n3, int n4) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi -= n;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= n2;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= n3;
        this.Field9230 -= n4;
        return this;
    }

    public Class1985 Method1513() {
        return new Class1985(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field9230);
    }

    public Class1985 Method1514(Class1985 class1985) {
        return class1985.Method7346(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field9230);
    }

    public Class1460 Method1515() {
        return new Class1460(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field9230);
    }

    public Class1460 Method1516(Class1460 class1460) {
        return class1460.Method5869(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field9230);
    }

    public Class285 Method1517() {
        return new Class285(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Class285)) return false;
        if (!this.Method1518((Class285)object)) return false;
        return true;
    }

    public boolean Method1518(Class285 class285) {
        if (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi != class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) return false;
        if (this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf != class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) return false;
        if (this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV != class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) return false;
        if (this.Field9230 != class285.Field9230) return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s, %s]", this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field9230);
    }

    @Override
    public Class155 Method1046() {
        return this.Method1517();
    }

    @Override
    public Class155 Method1037(double d) {
        return this.Method1508(d);
    }

    @Override
    public Class155 Method1035() {
        return this.Method1506();
    }

    @Override
    public Class541 Method1026() {
        return this.Method1517();
    }

    @Override
    public Class541 Method1017(double d) {
        return this.Method1508(d);
    }

    @Override
    public Class541 Method1015() {
        return this.Method1506();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.Method1517();
    }

    private static String Method1028(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 66;
            cArray2[n] = (char)(cArray[n] ^ (0x7BA5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

