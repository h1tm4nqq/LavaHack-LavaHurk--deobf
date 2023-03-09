/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1039;
import lavahack.client.Class1514;
import lavahack.client.Class1876;
import lavahack.client.Class467;
import lavahack.client.Class753;
import lavahack.client.Class994;

public class Class1645
extends Class1514 {
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
    private boolean Field15651 = false;
    private boolean Field15652 = false;
    private final String[] Field15653 = new String[]{"Change", "Reset"};
    private String Field15654 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1645(Class1876 class1876, double d, double d2, double d3, Class467 class467, int n, int n2) {
        super(class1876);
        this.Field15646 = d;
        this.Field15647 = d2;
        this.Field15648 = d3;
        this.Field15649 = class467;
        this.Field15643 = n;
        this.Field15644 = n2;
        this.Method676(n);
        this.Method678(n2);
    }

    public Class1645(Class1876 class1876, double d, double d2, double d3, Class467 class467) {
        this(class1876, d, d2, d3, class467, 180, 24);
    }

    @Override
    public void Method668() {
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), this.Field15645 || this.Field15651 ? Class1039.Field12569 : Class1039.Field12570);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), 1.0f, this.Field15645 || this.Field15651 ? Class1039.Field12571 : Class1039.Field12569);
        int n = 4;
        double d = (this.Field15646 - this.Field15647) / (this.Field15648 - this.Field15647) * (double)(this.Method675() - n);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + d, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + 2, n, this.Method677() - 3, this.Field15645 || this.Field15651 ? (null.Field11804.Method365() && this.Field15645 ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12570) : Class1039.Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect(((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + d) / Double.longBitsToDouble((long)1419822698 ^ 0x4000000054A0C66AL), (double)((this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + 2) / 2), ((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + d + (double)n) / Double.longBitsToDouble(0x4000000000000000L), (double)((this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + 2 + this.Method677() - 3) / 2), this.Field15645 || this.Field15651 ? (null.Field11804.Method365() && this.Field15645 ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12570) : Class1039.Field12569, null.Field11788.Method367());
        }
        String string = (String)this.Field15649.Method2190().apply(this.Field15646);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(string) / 2, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(string) / 2, string, Class1039.Field12573);
    }

    @Override
    public void Method669() {
    }

    @Override
    public boolean Method683(int n, int n2, boolean bl) {
        this.Method6384(n, n2, bl);
        this.Method6383(n, n2);
        return this.Field15651;
    }

    private void Method6383(int n, int n2) {
        if (!this.Field15651) return;
        double d = this.Field15646;
        double d2 = Math.max(Math.min((double)(n - this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) / (double)this.Method675() * (this.Field15648 - this.Field15647) + this.Field15647, this.Field15648), this.Field15647);
        boolean bl = true;
        if (d != d2 && this.Field15650 != null) {
            bl = this.Field15650.Method4024(d2);
        }
        this.Field15646 = d2;
    }

    private void Method6384(int n, int n2, boolean bl) {
        this.Field15645 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677();
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        if (n != 0) return false;
        this.Method6384(n2, n3, bl);
        if (!this.Field15645) return false;
        this.Field15651 = true;
        this.Method6383(n2, n3);
        return true;
    }

    @Override
    public boolean Method682(int n, int n2, int n3, boolean bl) {
        if (n != 0) return false;
        this.Method6384(n2, n3, bl);
        if (!this.Field15651) return false;
        this.Field15651 = false;
        this.Method6383(n2, n3);
        return true;
    }

    public double Method6385() {
        return this.Field15646;
    }

    public void Method6386(double d) {
        this.Field15646 = d;
    }

    public void Method6387(Class994 class994) {
        this.Field15650 = class994;
    }

    static {
        Field15642 = 24;
        Field15641 = 180;
    }

    private static String Method6388(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 209;
            cArray2[n] = (char)(cArray[n] ^ (0x1CAB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

