/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1531;
import lavahack.client.Class1835;
import lavahack.client.Class541;

public class Class155
extends Class541 {
    public int Field8610;
    private String Field8611 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class155() {
        this(0, 0, 0);
    }

    public Class155(Class155 class155) {
        this(class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class155.Field8610);
    }

    public Class155(int n) {
        this(n, n, n);
    }

    public Class155(int n, int n2, int n3) {
        super(n, n2);
        this.Field8610 = n3;
    }

    public final int Method1029() {
        return this.Field8610;
    }

    public final void Method1030(int n) {
        this.Field8610 = n;
    }

    public Class155 Method1031(Class155 class155) {
        return this.Method1032(class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class155.Field8610);
    }

    public Class155 Method1032(int n, int n2, int n3) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi = n;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = n2;
        this.Field8610 = n3;
        return this;
    }

    @Override
    public int Method1010() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi * this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field8610 * this.Field8610;
    }

    public final double Method1033(Class155 class155) {
        return Math.sqrt(this.Method1034(class155));
    }

    public int Method1034(Class155 class155) {
        return this.Method1013(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi - class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) + this.Method1013(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) + this.Method1013(this.Field8610 - class155.Field8610);
    }

    public Class155 Method1035() {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi = -this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = -this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.Field8610 = -this.Field8610;
        return this;
    }

    public double Method1036(Class155 class155) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi * class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field8610 * class155.Field8610;
    }

    public Class155 Method1037(double d) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (int)((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi * d);
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = (int)((double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * d);
        this.Field8610 = (int)((double)this.Field8610 * d);
        return this;
    }

    public Class155 Method1038(Class155 class155) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi += class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.Field8610 += class155.Field8610;
        return this;
    }

    public Class155 Method1039(int n, int n2, int n3) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi += n;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += n2;
        this.Field8610 += n3;
        return this;
    }

    public Class155 Method1040(Class155 class155) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi -= class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.Field8610 -= class155.Field8610;
        return this;
    }

    public Class155 Method1041(int n, int n2, int n3) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi -= n;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= n2;
        this.Field8610 -= n3;
        return this;
    }

    public Class1835 Method1042() {
        return new Class1835(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field8610);
    }

    public Class1835 Method1043(Class1835 class1835) {
        return class1835.Method6910(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field8610);
    }

    public Class1531 Method1044() {
        return new Class1531(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field8610);
    }

    public Class1531 Method1045(Class1531 class1531) {
        return class1531.Method5849(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field8610);
    }

    public Class155 Method1046() {
        return new Class155(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Class155)) return false;
        if (!this.Method1047((Class155)object)) return false;
        return true;
    }

    public boolean Method1047(Class155 class155) {
        if (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi != class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) return false;
        if (this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf != class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) return false;
        if (this.Field8610 != class155.Field8610) return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s]", this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field8610);
    }

    @Override
    public Class541 Method1026() {
        return this.Method1046();
    }

    @Override
    public Class541 Method1017(double d) {
        return this.Method1037(d);
    }

    @Override
    public Class541 Method1015() {
        return this.Method1035();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.Method1046();
    }

    private static String Method1028(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 13;
            cArray2[n] = (char)(cArray[n] ^ (0x6617 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

