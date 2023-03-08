//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1460 extends Class1531
{
    public double Field14832;
    private String Field14833 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1460() {
        this(0.0, 0.0, 0.0, 0.0);
    }
    
    public Class1460(final Class1460 class1460) {
        this(class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, class1460.Field14832);
    }
    
    public Class1460(final double n) {
        this(n, n, n, n);
    }
    
    public Class1460(final double n, final double n2, final double n3, final double field14832) {
        super(n, n2, n3);
        this.Field14832 = field14832;
    }
    
    public final double Method5866() {
        return this.Field14832;
    }
    
    public final void Method5867(final double field14832) {
        this.Field14832 = field14832;
    }
    
    public Class1460 Method5868(final Class1460 class1460) {
        return this.Method5869(class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, class1460.Field14832);
    }
    
    public Class1460 Method5869(final double ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, final double uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, final double vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, final double field14832) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field14832 = field14832;
        return this;
    }
    
    @Override
    public double Method5826() {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV * this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + this.Field14832 * this.Field14832;
    }
    
    public final double Method5870(final Class1460 class1460) {
        return Math.sqrt(this.Method5871(class1460));
    }
    
    public double Method5871(final Class1460 class1460) {
        return this.Method5829(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) + this.Method5829(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) + this.Method5829(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV - class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) + this.Method5829(this.Field14832 - class1460.Field14832);
    }
    
    public Class1460 Method5872() {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = -this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = -this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = -this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field14832 = -this.Field14832;
        return this;
    }
    
    public double Method5873(final Class1460 class1460) {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV * class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + this.Field14832 * class1460.Field14832;
    }
    
    public Class1460 Method5874(final double n) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf *= n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV *= n;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV *= n;
        this.Field14832 *= n;
        return this;
    }
    
    public Class1460 Method5875(final Class1460 class1460) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV += class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field14832 += class1460.Field14832;
        return this;
    }
    
    public Class1460 Method5876(final double n, final double n2, final double n3, final double n4) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += n2;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV += n3;
        this.Field14832 += n4;
        return this;
    }
    
    public Class1460 Method5877(final Class1460 class1460) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV -= class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field14832 -= class1460.Field14832;
        return this;
    }
    
    public Class1460 Method5878(final double n, final double n2, final double n3, final double n4) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= n2;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV -= n3;
        this.Field14832 -= n4;
        return this;
    }
    
    public Class285 Method5879() {
        return new Class285((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), (int)Math.floor(this.Field14832));
    }
    
    public Class285 Method5880(final Class285 class285) {
        return class285.Method1503((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), (int)Math.floor(this.Field14832));
    }
    
    public Class1985 Method5881() {
        return new Class1985((float)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (float)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (float)Math.floor(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), (float)Math.floor(this.Field14832));
    }
    
    public Class1985 Method5882(final Class1985 class1985) {
        return class1985.Method7346((float)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (float)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (float)Math.floor(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), (float)Math.floor(this.Field14832));
    }
    
    public Class1460 Method5883() {
        return new Class1460(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class1460 && this.Method5884((Class1460)o);
    }
    
    public boolean Method5884(final Class1460 class1460) {
        return this.Method5885(class1460, Double.longBitsToDouble(4532020583461814272L));
    }
    
    public boolean Method5885(final Class1460 class1460, final double n) {
        return Math.abs(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1460.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) < n && Math.abs(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1460.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) < n && Math.abs(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV - class1460.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) < n && Math.abs(this.Field14832 - class1460.Field14832) < n;
    }
    
    @Override
    public String toString() {
        return String.format("[%s, %s, %s, %s]", this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field14832);
    }
    
    @Override
    public Class1531 Method5863() {
        return this.Method5883();
    }
    
    @Override
    public Class1531 Method5854(final double n) {
        return this.Method5874(n);
    }
    
    @Override
    public Class1531 Method5852() {
        return this.Method5872();
    }
    
    @Override
    public Class2138 Method5842() {
        return this.Method5883();
    }
    
    @Override
    public Class2138 Method5833(final double n) {
        return this.Method5874(n);
    }
    
    @Override
    public Class2138 Method5831() {
        return this.Method5872();
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.Method5883();
    }
    
    private static String Method5845(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x56FD ^ 0x49));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
