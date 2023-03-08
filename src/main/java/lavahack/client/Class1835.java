//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1835 extends Class821
{
    public float Field16477;
    private String Field16478 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1835() {
        this(0.0f, 0.0f, 0.0f);
    }
    
    public Class1835(final Class1835 class1835) {
        this(class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1835.Field16477);
    }
    
    public Class1835(final float n) {
        this(n, n, n);
    }
    
    public Class1835(final float n, final float n2, final float field16477) {
        super(n, n2);
        this.Field16477 = field16477;
    }
    
    public final float Method6907() {
        return this.Field16477;
    }
    
    public final void Method6908(final float field16477) {
        this.Field16477 = field16477;
    }
    
    public Class1835 Method6909(final Class1835 class1835) {
        return this.Method6910(class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1835.Field16477);
    }
    
    public Class1835 Method6910(final float ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, final float uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, final float field16477) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field16477 = field16477;
        return this;
    }
    
    @Override
    public float Method3496() {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.Field16477 * this.Field16477;
    }
    
    public final double Method6911(final Class1835 class1835) {
        return Math.sqrt(this.Method6912(class1835));
    }
    
    public float Method6912(final Class1835 class1835) {
        return this.Method3499(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) + this.Method3499(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) + this.Method3499(this.Field16477 - class1835.Field16477);
    }
    
    public Class1835 Method6913() {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = -this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = -this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field16477 = -this.Field16477;
        return this;
    }
    
    public float Method6914(final Class1835 class1835) {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.Field16477 * class1835.Field16477;
    }
    
    public Class1835 Method6915(final double n) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf *= (float)n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV *= (float)n;
        this.Field16477 *= (float)n;
        return this;
    }
    
    public Class1835 Method6916(final Class1835 class1835) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field16477 += class1835.Field16477;
        return this;
    }
    
    public Class1835 Method6917(final float n, final float n2, final float n3) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += n2;
        this.Field16477 += n3;
        return this;
    }
    
    public Class1835 Method6918(final Class1835 class1835) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field16477 -= class1835.Field16477;
        return this;
    }
    
    public Class1835 Method6919(final float n, final float n2, final float n3) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= n2;
        this.Field16477 -= n3;
        return this;
    }
    
    public Class155 Method6920() {
        return new Class155((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.Field16477));
    }
    
    public Class155 Method6921(final Class155 class155) {
        return class155.Method1032((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.Field16477));
    }
    
    public Class1531 Method6922() {
        return new Class1531((double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, (double)this.Field16477);
    }
    
    public Class1531 Method6923(final Class1531 class1531) {
        return class1531.Method5849((double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, (double)this.Field16477);
    }
    
    public Class1835 Method6924() {
        return new Class1835(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class1835 && this.Method6925((Class1835)o);
    }
    
    public boolean Method6925(final Class1835 class1835) {
        return this.Method6926(class1835, Float.intBitsToFloat(925353388));
    }
    
    public boolean Method6926(final Class1835 class1835, final float n) {
        return Math.abs(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1835.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) < n && Math.abs(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1835.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) < n && Math.abs(this.Field16477 - class1835.Field16477) < n;
    }
    
    @Override
    public String toString() {
        return String.format("[%s, %s, %s]", this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field16477);
    }
    
    @Override
    public Class821 Method3512() {
        return this.Method6924();
    }
    
    @Override
    public Class821 Method3503(final double n) {
        return this.Method6915(n);
    }
    
    @Override
    public Class821 Method3501() {
        return this.Method6913();
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.Method6924();
    }
    
    private static String Method3515(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x39BE ^ 0x60));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
