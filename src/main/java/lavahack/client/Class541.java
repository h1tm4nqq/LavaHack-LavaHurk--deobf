//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class541
{
    public int Field10303;
    public int Field10304;
    private int Field10305;
    
    public Class541() {
        this(0, 0);
    }
    
    public Class541(final Class541 class541) {
        this(class541.Field10303, class541.Field10304);
    }
    
    public Class541(final int n) {
        this(n, n);
    }
    
    public Class541(final int field10303, final int field10304) {
        this.Field10303 = field10303;
        this.Field10304 = field10304;
    }
    
    public final int Method1003() {
        return this.Field10303;
    }
    
    public final int Method1004() {
        return this.Field10304;
    }
    
    public final void Method1005(final int field10303) {
        this.Field10303 = field10303;
    }
    
    public final void Method1006(final int field10304) {
        this.Field10304 = field10304;
    }
    
    public Class541 Method1007(final Class541 class541) {
        return this.Method1008(class541.Field10303, class541.Field10304);
    }
    
    public Class541 Method1008(final int field10303, final int field10304) {
        this.Field10303 = field10303;
        this.Field10304 = field10304;
        return this;
    }
    
    public final double Method1009() {
        return Math.sqrt(this.Method1010());
    }
    
    public int Method1010() {
        return this.Field10303 * this.Field10303 + this.Field10304 * this.Field10304;
    }
    
    public final double Method1011(final Class541 class541) {
        return Math.sqrt(this.Method1012(class541));
    }
    
    public int Method1012(final Class541 class541) {
        return this.Method1013(this.Field10303 - class541.Field10303) + this.Method1013(this.Field10304 - class541.Field10304);
    }
    
    protected final int Method1013(final int n) {
        return n * n;
    }
    
    public final Class541 Method1014() {
        final double method1009 = this.Method1009();
        if (method1009 != 0.0) {
            return this.Method1017(1.0 / method1009);
        }
        return this;
    }
    
    public Class541 Method1015() {
        this.Field10303 = -this.Field10303;
        this.Field10304 = -this.Field10304;
        return this;
    }
    
    public double Method1016(final Class541 class541) {
        return this.Field10303 * class541.Field10303 + this.Field10304 * class541.Field10304;
    }
    
    public Class541 Method1017(final double n) {
        this.Field10303 *= (int)n;
        this.Field10304 *= (int)n;
        return this;
    }
    
    public Class541 Method1018(final Class541 class541) {
        this.Field10303 += class541.Field10303;
        this.Field10304 += class541.Field10304;
        return this;
    }
    
    public Class541 Method1019(final int n, final int n2) {
        this.Field10303 += n;
        this.Field10304 += n2;
        return this;
    }
    
    public Class541 Method1020(final Class541 class541) {
        this.Field10303 -= class541.Field10303;
        this.Field10304 -= class541.Field10304;
        return this;
    }
    
    public Class541 Method1021(final int n, final int n2) {
        this.Field10303 -= n;
        this.Field10304 -= n2;
        return this;
    }
    
    public Class821 Method1022() {
        return new Class821((float)this.Field10303, (float)this.Field10304);
    }
    
    public Class821 Method1023(final Class821 class821) {
        return class821.Method3494((float)this.Field10303, (float)this.Field10304);
    }
    
    public Class2138 Method1024() {
        return new Class2138((double)this.Field10303, (double)this.Field10304);
    }
    
    public Class2138 Method1025(final Class2138 class2138) {
        return class2138.Method5824((double)this.Field10303, (double)this.Field10304);
    }
    
    public Class541 Method1026() {
        return new Class541(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class541 && this.Method1027((Class541)o);
    }
    
    public boolean Method1027(final Class541 class541) {
        return this.Field10303 == class541.Field10303 && this.Field10304 == class541.Field10304;
    }
    
    @Override
    public String toString() {
        return String.format("[%s, %s]", this.Field10303, this.Field10304);
    }
    
    public Object clone() throws CloneNotSupportedException {
        return this.Method1026();
    }
    
    private static String Method1028(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1B28 ^ 0x2D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
