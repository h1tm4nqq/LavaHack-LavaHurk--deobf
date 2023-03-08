//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class821
{
    public static final float Field11501;
    public float Field11502;
    public float Field11503;
    private int Field11504;
    
    public Class821() {
        this(0.0f, 0.0f);
    }
    
    public Class821(final Class821 class821) {
        this(class821.Field11502, class821.Field11503);
    }
    
    public Class821(final float n) {
        this(n, n);
    }
    
    public Class821(final float field11502, final float field11503) {
        this.Field11502 = field11502;
        this.Field11503 = field11503;
    }
    
    public final float Method3489() {
        return this.Field11502;
    }
    
    public final float Method3490() {
        return this.Field11503;
    }
    
    public final void Method3491(final float field11502) {
        this.Field11502 = field11502;
    }
    
    public final void Method3492(final float field11503) {
        this.Field11503 = field11503;
    }
    
    public Class821 Method3493(final Class821 class821) {
        return this.Method3494(class821.Field11502, class821.Field11503);
    }
    
    public Class821 Method3494(final float field11502, final float field11503) {
        this.Field11502 = field11502;
        this.Field11503 = field11503;
        return this;
    }
    
    public final double Method3495() {
        return Math.sqrt(this.Method3496());
    }
    
    public float Method3496() {
        return this.Field11502 * this.Field11502 + this.Field11503 * this.Field11503;
    }
    
    public final double Method3497(final Class821 class821) {
        return Math.sqrt(this.Method3498(class821));
    }
    
    public float Method3498(final Class821 class821) {
        return this.Method3499(this.Field11502 - class821.Field11502) + this.Method3499(this.Field11503 - class821.Field11503);
    }
    
    protected final float Method3499(final float n) {
        return n * n;
    }
    
    public final Class821 Method3500() {
        final double method3495 = this.Method3495();
        if (method3495 != 0.0) {
            return this.Method3503(1.0 / method3495);
        }
        return this;
    }
    
    public Class821 Method3501() {
        this.Field11502 = -this.Field11502;
        this.Field11503 = -this.Field11503;
        return this;
    }
    
    public float Method3502(final Class821 class821) {
        return this.Field11502 * class821.Field11502 + this.Field11503 * class821.Field11503;
    }
    
    public Class821 Method3503(final double n) {
        this.Field11502 *= (float)n;
        this.Field11503 *= (float)n;
        return this;
    }
    
    public Class821 Method3504(final Class821 class821) {
        this.Field11502 += class821.Field11502;
        this.Field11503 += class821.Field11503;
        return this;
    }
    
    public Class821 Method3505(final float n, final float n2) {
        this.Field11502 += n;
        this.Field11503 += n2;
        return this;
    }
    
    public Class821 Method3506(final Class821 class821) {
        this.Field11502 -= class821.Field11502;
        this.Field11503 -= class821.Field11503;
        return this;
    }
    
    public Class821 Method3507(final float n, final float n2) {
        this.Field11502 -= n;
        this.Field11503 -= n2;
        return this;
    }
    
    public Class541 Method3508() {
        return new Class541((int)Math.floor(this.Field11502), (int)Math.floor(this.Field11503));
    }
    
    public Class541 Method3509(final Class541 class541) {
        return class541.Method1008((int)Math.floor(this.Field11502), (int)Math.floor(this.Field11503));
    }
    
    public Class2138 Method3510() {
        return new Class2138((double)this.Field11502, (double)this.Field11503);
    }
    
    public Class2138 Method3511(final Class2138 class2138) {
        return class2138.Method5824((double)this.Field11502, (double)this.Field11503);
    }
    
    public Class821 Method3512() {
        return new Class821(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class821 && this.Method3513((Class821)o);
    }
    
    public boolean Method3513(final Class821 class821) {
        return this.Method3514(class821, Float.intBitsToFloat(925353388));
    }
    
    public boolean Method3514(final Class821 class821, final float n) {
        return Math.abs(this.Field11502 - class821.Field11502) < n && Math.abs(this.Field11503 - class821.Field11503) < n;
    }
    
    @Override
    public String toString() {
        return String.format("[%s, %s]", this.Field11502, this.Field11503);
    }
    
    public Object clone() throws CloneNotSupportedException {
        return this.Method3512();
    }
    
    static {
        Field11501 = 0.0f;
    }
    
    private static String Method3515(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x662 ^ 0xAB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
