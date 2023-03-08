//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1645 extends Class1514
{
    private static final int Field15641;
    private static final int Field15642;
    private int Field15643;
    private int Field15644;
    private boolean Field15645;
    private double Field15646;
    private double Field15647;
    private double Field15648;
    private Class467 Field15649;
    private Class994 Field15650;
    private boolean Field15651;
    private boolean Field15652;
    private final String[] Field15653;
    private String Field15654 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1645(final Class1876 class1876, final double field15646, final double field15647, final double field15648, final Class467 field15649, final int field15650, final int field15651) {
        super(class1876);
        this.Field15651 = false;
        this.Field15652 = false;
        this.Field15653 = new String[] { "Change", "Reset" };
        this.Field15646 = field15646;
        this.Field15647 = field15647;
        this.Field15648 = field15648;
        this.Field15649 = field15649;
        this.Field15643 = field15650;
        this.Field15644 = field15651;
        this.Method676(field15650);
        this.Method678(field15651);
    }
    
    public Class1645(final Class1876 class1876, final double n, final double n2, final double n3, final Class467 class1877) {
        this(class1876, n, n2, n3, class1877, 180, 24);
    }
    
    public void Method668() {
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), (this.Field15645 || this.Field15651) ? Class1039.Field12569 : Class1039.Field12570);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), 1.0f, (this.Field15645 || this.Field15651) ? Class1039.Field12571 : Class1039.Field12569);
        final int n = 4;
        final double n2 = (this.Field15646 - this.Field15647) / (this.Field15648 - this.Field15647) * (this.Method675() - n);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + n2, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + 2, n, this.Method677() - 3, (this.Field15645 || this.Field15651) ? ((null.Field11804.Method365() && this.Field15645) ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12570) : Class1039.Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + n2) / Double.longBitsToDouble((long)1419822698 ^ 0x4000000054A0C66AL), (this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + 2) / 2, (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + n2 + n) / Double.longBitsToDouble(4611686018427387904L), (this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + 2 + this.Method677() - 3) / 2, (this.Field15645 || this.Field15651) ? ((null.Field11804.Method365() && this.Field15645) ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12570) : Class1039.Field12569, null.Field11788.Method367());
        }
        final String s = this.Field15649.Method2190().apply(this.Field15646);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(s) / 2, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(s) / 2, s, Class1039.Field12573);
    }
    
    public void Method669() {
    }
    
    public boolean Method683(final int n, final int n2, final boolean b) {
        this.Method6384(n, n2, b);
        this.Method6383(n, n2);
        return this.Field15651;
    }
    
    private void Method6383(final int n, final int n2) {
        if (this.Field15651) {
            final double field15646 = this.Field15646;
            final double max = Math.max(Math.min((n - this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) / (double)this.Method675() * (this.Field15648 - this.Field15647) + this.Field15647, this.Field15648), this.Field15647);
            if (field15646 != max && this.Field15650 != null) {
                this.Field15650.Method4024(max);
            }
            this.Field15646 = max;
        }
    }
    
    private void Method6384(final int n, final int n2, final boolean b) {
        this.Field15645 = (!b && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677());
    }
    
    public boolean Method684(final int n, final int n2, final int n3, final boolean b) {
        if (n == 0) {
            this.Method6384(n2, n3, b);
            if (this.Field15645) {
                this.Field15651 = true;
                this.Method6383(n2, n3);
                return true;
            }
        }
        return false;
    }
    
    public boolean Method682(final int n, final int n2, final int n3, final boolean b) {
        if (n == 0) {
            this.Method6384(n2, n3, b);
            if (this.Field15651) {
                this.Field15651 = false;
                this.Method6383(n2, n3);
                return true;
            }
        }
        return false;
    }
    
    public double Method6385() {
        return this.Field15646;
    }
    
    public void Method6386(final double field15646) {
        this.Field15646 = field15646;
    }
    
    public void Method6387(final Class994 field15650) {
        this.Field15650 = field15650;
    }
    
    static {
        Field15642 = 24;
        Field15641 = 180;
    }
    
    private static String Method6388(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1CAB ^ 0xD1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
