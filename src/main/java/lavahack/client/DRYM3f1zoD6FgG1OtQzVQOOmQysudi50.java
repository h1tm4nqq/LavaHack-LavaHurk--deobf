/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.EsuAJoYhZGTu1UJfUCjY7WKSAVZygiFD;
import lavahack.client.ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov;

public class DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 {
    public int Field10303;
    public int Field10304;
    private int Field10305;

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50() {
        this((int)388910577L ^ 0x172E4DF1, (int)((long)-1159287784 ^ (long)-1159287784));
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50(DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 dRYM3f1zoD6FgG1OtQzVQOOmQysudi50) {
        this(dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10303, dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10304);
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50(int n) {
        this(n, n);
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50(int n, int n2) {
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

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 Method1007(DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 dRYM3f1zoD6FgG1OtQzVQOOmQysudi50) {
        return this.Method1008(dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10303, dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10304);
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 Method1008(int n, int n2) {
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

    public final double Method1011(DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 dRYM3f1zoD6FgG1OtQzVQOOmQysudi50) {
        return Math.sqrt(this.Method1012(dRYM3f1zoD6FgG1OtQzVQOOmQysudi50));
    }

    public int Method1012(DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 dRYM3f1zoD6FgG1OtQzVQOOmQysudi50) {
        return this.Method1013(this.Field10303 - dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10303) + this.Method1013(this.Field10304 - dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10304);
    }

    protected final int Method1013(int n) {
        return n * n;
    }

    public final DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 Method1014() {
        double d = this.Method1009();
        if (d == 0.0) return this;
        return this.Method1017(1.0 / d);
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 Method1015() {
        this.Field10303 = -this.Field10303;
        this.Field10304 = -this.Field10304;
        return this;
    }

    public double Method1016(DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 dRYM3f1zoD6FgG1OtQzVQOOmQysudi50) {
        return this.Field10303 * dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10303 + this.Field10304 * dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10304;
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 Method1017(double d) {
        this.Field10303 = (int)((double)this.Field10303 * d);
        this.Field10304 = (int)((double)this.Field10304 * d);
        return this;
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 Method1018(DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 dRYM3f1zoD6FgG1OtQzVQOOmQysudi50) {
        this.Field10303 += dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10303;
        this.Field10304 += dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10304;
        return this;
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 Method1019(int n, int n2) {
        this.Field10303 += n;
        this.Field10304 += n2;
        return this;
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 Method1020(DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 dRYM3f1zoD6FgG1OtQzVQOOmQysudi50) {
        this.Field10303 -= dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10303;
        this.Field10304 -= dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10304;
        return this;
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 Method1021(int n, int n2) {
        this.Field10303 -= n;
        this.Field10304 -= n2;
        return this;
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov Method1022() {
        return new ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov(this.Field10303, this.Field10304);
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov Method1023(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2) {
        return ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Method3494(this.Field10303, this.Field10304);
    }

    public EsuAJoYhZGTu1UJfUCjY7WKSAVZygiFD Method1024() {
        return new EsuAJoYhZGTu1UJfUCjY7WKSAVZygiFD(this.Field10303, this.Field10304);
    }

    public EsuAJoYhZGTu1UJfUCjY7WKSAVZygiFD Method1025(EsuAJoYhZGTu1UJfUCjY7WKSAVZygiFD esuAJoYhZGTu1UJfUCjY7WKSAVZygiFD) {
        return esuAJoYhZGTu1UJfUCjY7WKSAVZygiFD.Method5824(this.Field10303, this.Field10304);
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 Method1026() {
        return new DRYM3f1zoD6FgG1OtQzVQOOmQysudi50(this);
    }

    public boolean equals(Object object) {
        int n;
        if (object instanceof DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 && this.Method1027((DRYM3f1zoD6FgG1OtQzVQOOmQysudi50)object)) {
            n = (int)-409624315L ^ 0xE795A104;
            return n != 0;
        }
        n = (int)572319706L ^ 0x221CE7DA;
        return n != 0;
    }

    public boolean Method1027(DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 dRYM3f1zoD6FgG1OtQzVQOOmQysudi50) {
        int n;
        if (this.Field10303 == dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10303 && this.Field10304 == dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Field10304) {
            n = (int)911376684L ^ 0x3652812D;
            return n != 0;
        }
        n = (int)1121909448L ^ 0x42DEFAC8;
        return n != 0;
    }

    public String toString() {
        Object[] objectArray = new Object[((int)1249669695L ^ 0x4A7C723E) << 1];
        objectArray[(int)((long)-1876025940 ^ (long)-1876025940)] = this.Field10303;
        objectArray[(int)-743650543L ^ 0xD3ACCB10] = this.Field10304;
        return String.format("[%s, %s]", objectArray);
    }

    public Object clone() throws CloneNotSupportedException {
        return this.Method1026();
    }

    private static String Method1028(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1401867449 ^ (long)1401867449);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)607650361L ^ 0x243802C6);
            int n2 = (int)((long)-1296252679 ^ (long)-1296252716);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-7574306 ^ (long)-7573573) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

