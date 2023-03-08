//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1985 extends Class1835
{
    public float Field17125;
    private int Field17126;
    
    public Class1985() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    public Class1985(final Class1985 class1985) {
        this(class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, class1985.Field17125);
    }
    
    public Class1985(final float n) {
        this(n, n, n, n);
    }
    
    public Class1985(final float n, final float n2, final float n3, final float field17125) {
        super(n, n2, n3);
        this.Field17125 = field17125;
    }
    
    public final float Method7343() {
        return this.Field17125;
    }
    
    public final void Method7344(final float field17125) {
        this.Field17125 = field17125;
    }
    
    public Class1985 Method7345(final Class1985 class1985) {
        return this.Method7346(class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, class1985.Field17125);
    }
    
    public Class1985 Method7346(final float ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, final float uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, final float vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, final float field17125) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field17125 = field17125;
        return this;
    }
    
    public float Method3496() {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV * this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + this.Field17125 * this.Field17125;
    }
    
    public final double Method7347(final Class1985 class1985) {
        return Math.sqrt(this.Method7348(class1985));
    }
    
    public float Method7348(final Class1985 class1985) {
        return this.Method3499(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) + this.Method3499(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) + this.Method3499(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV - class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) + this.Method3499(this.Field17125 - class1985.Field17125);
    }
    
    public Class1985 Method7349() {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = -this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = -this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = -this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field17125 = -this.Field17125;
        return this;
    }
    
    public float Method7350(final Class1985 class1985) {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV * class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV + this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV * class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV + this.Field17125 * class1985.Field17125;
    }
    
    public Class1985 Method7351(final double n) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf *= (float)n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV *= (float)n;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV *= (float)n;
        this.Field17125 *= (float)n;
        return this;
    }
    
    public Class1985 Method7352(final Class1985 class1985) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV += class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field17125 += class1985.Field17125;
        return this;
    }
    
    public Class1985 Method7353(final float n, final float n2, final float n3, final float n4) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV += n2;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV += n3;
        this.Field17125 += n4;
        return this;
    }
    
    public Class1985 Method7354(final Class1985 class1985) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV -= class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        this.Field17125 -= class1985.Field17125;
        return this;
    }
    
    public Class1985 Method7355(final float n, final float n2, final float n3, final float n4) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= n;
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV -= n2;
        this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV -= n3;
        this.Field17125 -= n4;
        return this;
    }
    
    public Class285 Method7356() {
        return new Class285((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), (int)Math.floor(this.Field17125));
    }
    
    public Class285 Method7357(final Class285 class285) {
        return class285.Method1503((int)Math.floor(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (int)Math.floor(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV), (int)Math.floor(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV), (int)Math.floor(this.Field17125));
    }
    
    public Class1460 Method7358() {
        return new Class1460((double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, (double)this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, (double)this.Field17125);
    }
    
    public Class1460 Method7359(final Class1460 class1460) {
        return class1460.Method5869((double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, (double)this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, (double)this.Field17125);
    }
    
    public Class1985 Method7360() {
        return new Class1985(this);
    }
    
    public boolean equals(final Object o) {
        return o instanceof Class1985 && this.Method7361((Class1985)o);
    }
    
    public boolean Method7361(final Class1985 class1985) {
        return this.Method7362(class1985, Float.intBitsToFloat(925353388));
    }
    
    public boolean Method7362(final Class1985 class1985, final float n) {
        return Math.abs(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class1985.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) < n && Math.abs(this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV - class1985.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) < n && Math.abs(this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV - class1985.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) < n && Math.abs(this.Field17125 - class1985.Field17125) < n;
    }
    
    public String toString() {
        return String.format("[%s, %s, %s, %s]", this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field17125);
    }
    
    public Class1835 Method6924() {
        return this.Method7360();
    }
    
    public Class1835 Method6915(final double n) {
        return this.Method7351(n);
    }
    
    public Class1835 Method6913() {
        return this.Method7349();
    }
    
    public Class821 Method3512() {
        return (Class821)this.Method7360();
    }
    
    public Class821 Method3503(final double n) {
        return (Class821)this.Method7351(n);
    }
    
    public Class821 Method3501() {
        return (Class821)this.Method7349();
    }
    
    public Object clone() throws CloneNotSupportedException {
        return this.Method7360();
    }
    
    private static String Method3515(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x58F9 ^ 0x2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
