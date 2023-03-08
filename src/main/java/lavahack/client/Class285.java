//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class285 extends Class155
{
    public int Field9230;
    private int Field9231;
    
    public Class285() {
        this(0, 0, 0, 0);
    }
    
    public Class285(final Class285 class285) {
        this(class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class285.Field9230);
    }
    
    public Class285(final int n) {
        this(n, n, n, n);
    }
    
    public Class285(final int n, final int n2, final int n3, final int field9230) {
        super(n, n2, n3);
        this.Field9230 = field9230;
    }
    
    public final int Method1500() {
        return this.Field9230;
    }
    
    public final void Method1501(final int field9230) {
        this.Field9230 = field9230;
    }
    
    public Class285 Method1502(final Class285 class285) {
        return this.Method1503(class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class285.Field9230);
    }
    
    public Class285 Method1503(final int leqS0IyKEB621E1SrHdAcHHAUjScjmKi, final int ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, final int uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, final int field9230) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi = leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field9230 = field9230;
        return this;
    }
    
    public int Method1010() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi * this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.Field9230 * this.Field9230;
    }
    
    public final double Method1504(final Class285 class285) {
        return Math.sqrt(this.Method1505(class285));
    }
    
    public int Method1505(final Class285 class285) {
        return this.Method1013(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi - class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) + this.Method1013(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) + this.Method1013(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) + this.Method1013(this.Field9230 - class285.Field9230);
    }
    
    public Class285 Method1506() {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi = -this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = -this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = -this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field9230 = -this.Field9230;
        return this;
    }
    
    public double Method1507(final Class285 class285) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi * class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.Field9230 * class285.Field9230;
    }
    
    public Class285 Method1508(final double n) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi *= (int)n;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf *= (int)n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV *= (int)n;
        this.Field9230 *= (int)n;
        return this;
    }
    
    public Class285 Method1509(final Class285 class285) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi += class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field9230 += class285.Field9230;
        return this;
    }
    
    public Class285 Method1510(final int n, final int n2, final int n3, final int n4) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi += n;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += n2;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += n3;
        this.Field9230 += n4;
        return this;
    }
    
    public Class285 Method1511(final Class285 class285) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi -= class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field9230 -= class285.Field9230;
        return this;
    }
    
    public Class285 Method1512(final int n, final int n2, final int n3, final int n4) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi -= n;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= n2;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= n3;
        this.Field9230 -= n4;
        return this;
    }
    
    public Class1985 Method1513() {
        return new Class1985((float)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (float)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (float)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, (float)this.Field9230);
    }
    
    public Class1985 Method1514(final Class1985 class1985) {
        return class1985.Method7346((float)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (float)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (float)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, (float)this.Field9230);
    }
    
    public Class1460 Method1515() {
        return new Class1460((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, (double)this.Field9230);
    }
    
    public Class1460 Method1516(final Class1460 class1460) {
        return class1460.Method5869((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, (double)this.Field9230);
    }
    
    public Class285 Method1517() {
        return new Class285(this);
    }
    
    public boolean equals(final Object o) {
        return o instanceof Class285 && this.Method1518((Class285)o);
    }
    
    public boolean Method1518(final Class285 class285) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi == class285.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == class285.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV == class285.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV && this.Field9230 == class285.Field9230;
    }
    
    public String toString() {
        return String.format("[%s, %s, %s, %s]", this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field9230);
    }
    
    public Class155 Method1046() {
        return this.Method1517();
    }
    
    public Class155 Method1037(final double n) {
        return this.Method1508(n);
    }
    
    public Class155 Method1035() {
        return this.Method1506();
    }
    
    public Class541 Method1026() {
        return (Class541)this.Method1517();
    }
    
    public Class541 Method1017(final double n) {
        return (Class541)this.Method1508(n);
    }
    
    public Class541 Method1015() {
        return (Class541)this.Method1506();
    }
    
    public Object clone() throws CloneNotSupportedException {
        return this.Method1517();
    }
    
    private static String Method1028(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7BA5 ^ 0x42));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
