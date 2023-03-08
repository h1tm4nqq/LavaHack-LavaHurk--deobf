//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class2138
{
    public static final double Field17785;
    public double Field17786;
    public double Field17787;
    private String Field17788 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2138() {
        this(0.0, 0.0);
    }
    
    public Class2138(final Class2138 class2138) {
        this(class2138.Field17786, class2138.Field17787);
    }
    
    public Class2138(final double n) {
        this(n, n);
    }
    
    public Class2138(final double field17786, final double field17787) {
        this.Field17786 = field17786;
        this.Field17787 = field17787;
    }
    
    public final double Method5819() {
        return this.Field17786;
    }
    
    public final double Method5820() {
        return this.Field17787;
    }
    
    public final void Method5821(final double field17786) {
        this.Field17786 = field17786;
    }
    
    public final void Method5822(final double field17787) {
        this.Field17787 = field17787;
    }
    
    public Class2138 Method5823(final Class2138 class2138) {
        return this.Method5824(class2138.Field17786, class2138.Field17787);
    }
    
    public Class2138 Method5824(final double field17786, final double field17787) {
        this.Field17786 = field17786;
        this.Field17787 = field17787;
        return this;
    }
    
    public final double Method5825() {
        return Math.sqrt(this.Method5826());
    }
    
    public double Method5826() {
        return this.Field17786 * this.Field17786 + this.Field17787 * this.Field17787;
    }
    
    public final double Method5827(final Class2138 class2138) {
        return Math.sqrt(this.Method5828(class2138));
    }
    
    public double Method5828(final Class2138 class2138) {
        return this.Method5829(this.Field17786 - class2138.Field17786) + this.Method5829(this.Field17787 - class2138.Field17787);
    }
    
    protected final double Method5829(final double n) {
        return n * n;
    }
    
    public final Class2138 Method5830() {
        final double method5825 = this.Method5825();
        if (method5825 != 0.0) {
            return this.Method5833(1.0 / method5825);
        }
        return this;
    }
    
    public Class2138 Method5831() {
        this.Field17786 = -this.Field17786;
        this.Field17787 = -this.Field17787;
        return this;
    }
    
    public double Method5832(final Class2138 class2138) {
        return this.Field17786 * class2138.Field17786 + this.Field17787 * class2138.Field17787;
    }
    
    public Class2138 Method5833(final double n) {
        this.Field17786 *= n;
        this.Field17787 *= n;
        return this;
    }
    
    public Class2138 Method5834(final Class2138 class2138) {
        this.Field17786 += class2138.Field17786;
        this.Field17787 += class2138.Field17787;
        return this;
    }
    
    public Class2138 Method5835(final double n, final double n2) {
        this.Field17786 += n;
        this.Field17787 += n2;
        return this;
    }
    
    public Class2138 Method5836(final Class2138 class2138) {
        this.Field17786 -= class2138.Field17786;
        this.Field17787 -= class2138.Field17787;
        return this;
    }
    
    public Class2138 Method5837(final double n, final double n2) {
        this.Field17786 -= n;
        this.Field17787 -= n2;
        return this;
    }
    
    public Class541 Method5838() {
        return new Class541((int)Math.floor(this.Field17786), (int)Math.floor(this.Field17787));
    }
    
    public Class541 Method5839(final Class541 class541) {
        return class541.Method1008((int)Math.floor(this.Field17786), (int)Math.floor(this.Field17787));
    }
    
    public Class821 Method5840() {
        return new Class821((float)Math.floor(this.Field17786), (float)Math.floor(this.Field17787));
    }
    
    public Class821 Method5841(final Class821 class821) {
        return class821.Method3494((float)Math.floor(this.Field17786), (float)Math.floor(this.Field17787));
    }
    
    public Class2138 Method5842() {
        return new Class2138(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class2138 && this.Method5843((Class2138)o);
    }
    
    public boolean Method5843(final Class2138 class2138) {
        return this.Method5844(class2138, Double.longBitsToDouble((long)1372050612 ^ 0x3EE4F8B5D1C7D4B4L));
    }
    
    public boolean Method5844(final Class2138 class2138, final double n) {
        return Math.abs(this.Field17786 - class2138.Field17786) < n && Math.abs(this.Field17787 - class2138.Field17787) < n;
    }
    
    @Override
    public String toString() {
        return String.format("[%s, %s]", this.Field17786, this.Field17787);
    }
    
    public Object clone() throws CloneNotSupportedException {
        return this.Method5842();
    }
    
    static {
        Field17785 = 0.0;
    }
    
    private static String Method5845(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x427F ^ 0x87));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
