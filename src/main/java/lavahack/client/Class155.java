//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class155 extends Class541
{
    public int Field8610;
    private String Field8611 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class155() {
        this(0, 0, 0);
    }
    
    public Class155(final Class155 class155) {
        this(class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class155.Field8610);
    }
    
    public Class155(final int n) {
        this(n, n, n);
    }
    
    public Class155(final int n, final int n2, final int field8610) {
        super(n, n2);
        this.Field8610 = field8610;
    }
    
    public final int Method1029() {
        return this.Field8610;
    }
    
    public final void Method1030(final int field8610) {
        this.Field8610 = field8610;
    }
    
    public Class155 Method1031(final Class155 class155) {
        return this.Method1032(class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, class155.Field8610);
    }
    
    public Class155 Method1032(final int leqS0IyKEB621E1SrHdAcHHAUjScjmKi, final int ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, final int field8610) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi = leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.Field8610 = field8610;
        return this;
    }
    
    @Override
    public int Method1010() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi * this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field8610 * this.Field8610;
    }
    
    public final double Method1033(final Class155 class155) {
        return Math.sqrt(this.Method1034(class155));
    }
    
    public int Method1034(final Class155 class155) {
        return this.Method1013(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi - class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) + this.Method1013(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf - class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) + this.Method1013(this.Field8610 - class155.Field8610);
    }
    
    public Class155 Method1035() {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi = -this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = -this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.Field8610 = -this.Field8610;
        return this;
    }
    
    public double Method1036(final Class155 class155) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi * class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf * class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field8610 * class155.Field8610;
    }
    
    public Class155 Method1037(final double n) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi *= (int)n;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf *= (int)n;
        this.Field8610 *= (int)n;
        return this;
    }
    
    public Class155 Method1038(final Class155 class155) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi += class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.Field8610 += class155.Field8610;
        return this;
    }
    
    public Class155 Method1039(final int n, final int n2, final int n3) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi += n;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf += n2;
        this.Field8610 += n3;
        return this;
    }
    
    public Class155 Method1040(final Class155 class155) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi -= class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.Field8610 -= class155.Field8610;
        return this;
    }
    
    public Class155 Method1041(final int n, final int n2, final int n3) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi -= n;
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf -= n2;
        this.Field8610 -= n3;
        return this;
    }
    
    public Class1835 Method1042() {
        return new Class1835((float)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (float)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (float)this.Field8610);
    }
    
    public Class1835 Method1043(final Class1835 class1835) {
        return class1835.Method6910((float)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (float)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (float)this.Field8610);
    }
    
    public Class1531 Method1044() {
        return new Class1531((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Field8610);
    }
    
    public Class1531 Method1045(final Class1531 class1531) {
        return class1531.Method5849((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Field8610);
    }
    
    public Class155 Method1046() {
        return new Class155(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class155 && this.Method1047((Class155)o);
    }
    
    public boolean Method1047(final Class155 class155) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi == class155.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == class155.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && this.Field8610 == class155.Field8610;
    }
    
    @Override
    public String toString() {
        return String.format("[%s, %s, %s]", this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field8610);
    }
    
    @Override
    public Class541 Method1026() {
        return this.Method1046();
    }
    
    @Override
    public Class541 Method1017(final double n) {
        return this.Method1037(n);
    }
    
    @Override
    public Class541 Method1015() {
        return this.Method1035();
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.Method1046();
    }
    
    private static String Method1028(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6617 ^ 0xD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
