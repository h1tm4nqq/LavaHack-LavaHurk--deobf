//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1531 extends Class2138
{
    public double Field15157;
    private String Field15158 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1531() {
        this(0.0, 0.0, 0.0);
    }
    
    public Class1531(final Class1531 class1531) {
        this(class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1531.Field15157);
    }
    
    public Class1531(final double n) {
        this(n, n, n);
    }
    
    public Class1531(final double n, final double n2, final double field15157) {
        super(n, n2);
        this.Field15157 = field15157;
    }
    
    public final double Method5846() {
        return this.Field15157;
    }
    
    public final void Method5847(final double field15157) {
        this.Field15157 = field15157;
    }
    
    public Class1531 Method5848(final Class1531 class1531) {
        return this.Method5849(class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1531.Field15157);
    }
    
    public Class1531 Method5849(final double ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, final double uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, final double field15157) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field15157 = field15157;
        return this;
    }
    
    @Override
    public double Method5826() {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.Field15157 * this.Field15157;
    }
    
    public final double Method5850(final Class1531 class1531) {
        return Math.sqrt(this.Method5851(class1531));
    }
    
    public double Method5851(final Class1531 class1531) {
        return this.Method5829(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) + this.Method5829(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) + this.Method5829(this.Field15157 - class1531.Field15157);
    }
    
    public Class1531 Method5852() {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = -this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = -this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field15157 = -this.Field15157;
        return this;
    }
    
    public double Method5853(final Class1531 class1531) {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.Field15157 * class1531.Field15157;
    }
    
    public Class1531 Method5854(final double n) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf *= n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV *= n;
        this.Field15157 *= n;
        return this;
    }
    
    public Class1531 Method5855(final Class1531 class1531) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field15157 += class1531.Field15157;
        return this;
    }
    
    public Class1531 Method5856(final double n, final double n2, final double n3) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += n2;
        this.Field15157 += n3;
        return this;
    }
    
    public Class1531 Method5857(final Class1531 class1531) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field15157 -= class1531.Field15157;
        return this;
    }
    
    public Class1531 Method5858(final double n, final double n2, final double n3) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= n2;
        this.Field15157 -= n3;
        return this;
    }
    
    public Class155 Method5859() {
        return new Class155((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.Field15157));
    }
    
    public Class155 Method5860(final Class155 class155) {
        return class155.Method1032((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.Field15157));
    }
    
    public Class1835 Method5861() {
        return new Class1835((float)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (float)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (float)Math.floor(this.Field15157));
    }
    
    public Class1835 Method5862(final Class1835 class1835) {
        return class1835.Method6910((float)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (float)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (float)Math.floor(this.Field15157));
    }
    
    public Class1531 Method5863() {
        return new Class1531(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class1531 && this.Method5864((Class1531)o);
    }
    
    public boolean Method5864(final Class1531 class1531) {
        return this.Method5865(class1531, Double.longBitsToDouble((long)1824382635 ^ 0x3EE4F8B5ECBDDEABL));
    }
    
    public boolean Method5865(final Class1531 class1531, final double n) {
        return Math.abs(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1531.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) < n && Math.abs(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1531.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) < n && Math.abs(this.Field15157 - class1531.Field15157) < n;
    }
    
    @Override
    public String toString() {
        return String.format("[%s, %s, %s]", this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field15157);
    }
    
    @Override
    public Class2138 Method5842() {
        return this.Method5863();
    }
    
    @Override
    public Class2138 Method5833(final double n) {
        return this.Method5854(n);
    }
    
    @Override
    public Class2138 Method5831() {
        return this.Method5852();
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.Method5863();
    }
    
    private static String Method5845(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x284B ^ 0xAD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
