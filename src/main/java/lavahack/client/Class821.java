/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class2138;
import lavahack.client.Class541;

public class Class821 {
    public static final float Field11501 = 0.0f;
    public float Field11502;
    public float Field11503;
    private int Field11504;

    public Class821() {
        this(0.0f, 0.0f);
    }

    public Class821(Class821 class821) {
        this(class821.Field11502, class821.Field11503);
    }

    public Class821(float f) {
        this(f, f);
    }

    public Class821(float f, float f2) {
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

    public Class821 Method3493(Class821 class821) {
        return this.Method3494(class821.Field11502, class821.Field11503);
    }

    public Class821 Method3494(float f, float f2) {
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

    public final double Method3497(Class821 class821) {
        return Math.sqrt(this.Method3498(class821));
    }

    public float Method3498(Class821 class821) {
        return this.Method3499(this.Field11502 - class821.Field11502) + this.Method3499(this.Field11503 - class821.Field11503);
    }

    protected final float Method3499(float f) {
        return f * f;
    }

    public final Class821 Method3500() {
        double d = this.Method3495();
        if (d == 0.0) return this;
        return this.Method3503(1.0 / d);
    }

    public Class821 Method3501() {
        this.Field11502 = -this.Field11502;
        this.Field11503 = -this.Field11503;
        return this;
    }

    public float Method3502(Class821 class821) {
        return this.Field11502 * class821.Field11502 + this.Field11503 * class821.Field11503;
    }

    public Class821 Method3503(double d) {
        this.Field11502 = (float)((double)this.Field11502 * d);
        this.Field11503 = (float)((double)this.Field11503 * d);
        return this;
    }

    public Class821 Method3504(Class821 class821) {
        this.Field11502 += class821.Field11502;
        this.Field11503 += class821.Field11503;
        return this;
    }

    public Class821 Method3505(float f, float f2) {
        this.Field11502 += f;
        this.Field11503 += f2;
        return this;
    }

    public Class821 Method3506(Class821 class821) {
        this.Field11502 -= class821.Field11502;
        this.Field11503 -= class821.Field11503;
        return this;
    }

    public Class821 Method3507(float f, float f2) {
        this.Field11502 -= f;
        this.Field11503 -= f2;
        return this;
    }

    public Class541 Method3508() {
        return new Class541((int)Math.floor(this.Field11502), (int)Math.floor(this.Field11503));
    }

    public Class541 Method3509(Class541 class541) {
        return class541.Method1008((int)Math.floor(this.Field11502), (int)Math.floor(this.Field11503));
    }

    public Class2138 Method3510() {
        return new Class2138(this.Field11502, this.Field11503);
    }

    public Class2138 Method3511(Class2138 class2138) {
        return class2138.Method5824(this.Field11502, this.Field11503);
    }

    public Class821 Method3512() {
        return new Class821(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Class821)) return false;
        if (!this.Method3513((Class821)object)) return false;
        return true;
    }

    public boolean Method3513(Class821 class821) {
        return this.Method3514(class821, Float.intBitsToFloat(925353388));
    }

    public boolean Method3514(Class821 class821, float f) {
        if (!(Math.abs(this.Field11502 - class821.Field11502) < f)) return false;
        if (!(Math.abs(this.Field11503 - class821.Field11503) < f)) return false;
        return true;
    }

    public String toString() {
        return String.format("[%s, %s]", Float.valueOf(this.Field11502), Float.valueOf(this.Field11503));
    }

    public Object clone() throws CloneNotSupportedException {
        return this.Method3512();
    }

    private static String Method3515(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 171;
            cArray2[n] = (char)(cArray[n] ^ (0x662 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

