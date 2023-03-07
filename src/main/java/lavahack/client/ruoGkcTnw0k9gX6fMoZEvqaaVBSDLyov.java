/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.DRYM3f1zoD6FgG1OtQzVQOOmQysudi50;
import lavahack.client.EsuAJoYhZGTu1UJfUCjY7WKSAVZygiFD;

public class ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov {
    public static final float Field11501 = 0.0f;
    public float Field11502;
    public float Field11503;
    private int Field11504;

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov() {
        this(0.0f, 0.0f);
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2) {
        this(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11502, ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11503);
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov(float f) {
        this(f, f);
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov(float f, float f2) {
        this.Field11502 = f;
        this.Field11503 = f2;
    }

    public final float Method3489() {
        return this.Field11502;
    }

    public final float Method3490() {
        return this.Field11503;
    }

    public final void Method3491(float f) {
        this.Field11502 = f;
    }

    public final void Method3492(float f) {
        this.Field11503 = f;
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov Method3493(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2) {
        return this.Method3494(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11502, ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11503);
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov Method3494(float f, float f2) {
        this.Field11502 = f;
        this.Field11503 = f2;
        return this;
    }

    public final double Method3495() {
        return Math.sqrt(this.Method3496());
    }

    public float Method3496() {
        return this.Field11502 * this.Field11502 + this.Field11503 * this.Field11503;
    }

    public final double Method3497(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2) {
        return Math.sqrt(this.Method3498(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2));
    }

    public float Method3498(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2) {
        return this.Method3499(this.Field11502 - ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11502) + this.Method3499(this.Field11503 - ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11503);
    }

    protected final float Method3499(float f) {
        return f * f;
    }

    public final ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov Method3500() {
        double d = this.Method3495();
        if (d == 0.0) return this;
        return this.Method3503(1.0 / d);
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov Method3501() {
        this.Field11502 = -this.Field11502;
        this.Field11503 = -this.Field11503;
        return this;
    }

    public float Method3502(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2) {
        return this.Field11502 * ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11502 + this.Field11503 * ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11503;
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov Method3503(double d) {
        this.Field11502 = (float)((double)this.Field11502 * d);
        this.Field11503 = (float)((double)this.Field11503 * d);
        return this;
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov Method3504(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2) {
        this.Field11502 += ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11502;
        this.Field11503 += ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11503;
        return this;
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov Method3505(float f, float f2) {
        this.Field11502 += f;
        this.Field11503 += f2;
        return this;
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov Method3506(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2) {
        this.Field11502 -= ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11502;
        this.Field11503 -= ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11503;
        return this;
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov Method3507(float f, float f2) {
        this.Field11502 -= f;
        this.Field11503 -= f2;
        return this;
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 Method3508() {
        return new DRYM3f1zoD6FgG1OtQzVQOOmQysudi50((int)Math.floor(this.Field11502), (int)Math.floor(this.Field11503));
    }

    public DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 Method3509(DRYM3f1zoD6FgG1OtQzVQOOmQysudi50 dRYM3f1zoD6FgG1OtQzVQOOmQysudi50) {
        return dRYM3f1zoD6FgG1OtQzVQOOmQysudi50.Method1008((int)Math.floor(this.Field11502), (int)Math.floor(this.Field11503));
    }

    public EsuAJoYhZGTu1UJfUCjY7WKSAVZygiFD Method3510() {
        return new EsuAJoYhZGTu1UJfUCjY7WKSAVZygiFD(this.Field11502, this.Field11503);
    }

    public EsuAJoYhZGTu1UJfUCjY7WKSAVZygiFD Method3511(EsuAJoYhZGTu1UJfUCjY7WKSAVZygiFD esuAJoYhZGTu1UJfUCjY7WKSAVZygiFD) {
        return esuAJoYhZGTu1UJfUCjY7WKSAVZygiFD.Method5824(this.Field11502, this.Field11503);
    }

    public ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov Method3512() {
        return new ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov(this);
    }

    public boolean equals(Object object) {
        int n;
        if (object instanceof ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov && this.Method3513((ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov)object)) {
            n = (int)2111175245L ^ 0x7DD5FA4C;
            return n != 0;
        }
        n = (int)-904210721L ^ 0xCA1AD6DF;
        return n != 0;
    }

    public boolean Method3513(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2) {
        return this.Method3514(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2, Float.intBitsToFloat(0x43650E8 ^ 0x33119544));
    }

    public boolean Method3514(ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2, float f) {
        int n;
        if (Math.abs(this.Field11502 - ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11502) < f && Math.abs(this.Field11503 - ruoGkcTnw0k9gX6fMoZEvqaaVBSDLyov2.Field11503) < f) {
            n = (int)-23209152L ^ 0xFE9DDB41;
            return n != 0;
        }
        n = (int)-229995803L ^ 0xF24A8AE5;
        return n != 0;
    }

    public String toString() {
        Object[] objectArray = new Object[(int)((long)1461460891 ^ (long)1461460890) << 1];
        objectArray[(int)2045024038L ^ 0x79E49726] = Float.valueOf(this.Field11502);
        objectArray[(int)((long)1413690840 ^ (long)1413690841)] = Float.valueOf(this.Field11503);
        return String.format("[%s, %s]", objectArray);
    }

    public Object clone() throws CloneNotSupportedException {
        return this.Method3512();
    }

    private static String Method3515(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-766441336L ^ 0xD2510888;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1780757961L ^ 0x6A243536);
            int n2 = (int)((long)-1115226897 ^ (long)-1115227068);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-132514017 ^ (long)-132514770) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

