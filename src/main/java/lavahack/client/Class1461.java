/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.Class1039;
import lavahack.client.Class1514;
import lavahack.client.Class1876;
import lavahack.client.Class753;
import lavahack.client.Class994;

public class Class1461
extends Class1514 {
    private static final int Field14834 = 22;
    private boolean Field14835;
    private String Field14836;
    private int Field14837;
    private boolean Field14838;
    private Class994 Field14839;
    private String Field14840 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1461(Class1876 class1876, String string, int n) {
        super(class1876);
        this.Field14837 = n;
        this.Method5888(string);
    }

    public Class1461(Class1876 class1876, String string) {
        this(class1876, string, 22);
    }

    @Override
    public void Method668() {
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field14837, this.Field14837, this.Field14838 ? Class1039.Field12569 : Class1039.Field12570);
        if (this.Field14835) {
            Color color = this.Field14838 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12570) : Class1039.Field12569;
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field14837, this.Field14837, color);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field14837, this.Field14837, 1.0f, this.Field14838 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571) : Class1039.Field12569);
        if (null.Field11786.Method365() && this.Field14835) {
            Class753.drawRoundedRect((double)(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / 2), (double)(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2), (double)((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Field14837) / 2), (double)((this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field14837) / 2), this.Field14838 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571) : Class1039.Field12569, null.Field11788.Method367());
        }
        if (null.Field11806.Method365() && this.Field14835) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2444(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / 2 - 5, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2 - 1, this.Field14837, Color.WHITE.getRGB());
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Field14837 + this.Field14837 / 4, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Field14836) / 2, this.Field14836, Class1039.Field12573);
    }

    @Override
    public void Method669() {
    }

    @Override
    public boolean Method683(int n, int n2, boolean bl) {
        this.Method5886(n, n2, bl);
        return false;
    }

    private void Method5886(int n, int n2, boolean bl) {
        this.Field14838 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677();
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        if (n != 0) return false;
        this.Method5886(n2, n3, bl);
        if (!this.Field14838) return false;
        boolean bl2 = !this.Field14835;
        boolean bl3 = true;
        if (this.Field14839 != null) {
            bl3 = this.Field14839.Method4024(bl2);
        }
        this.Field14835 = bl2;
        return true;
    }

    public String Method5887() {
        return this.Field14836;
    }

    public void Method5888(String string) {
        this.Field14836 = string;
        this.Method676(this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(string) + this.Field14837 + this.Field14837 / 4);
        this.Method678(this.Field14837);
    }

    public void Method5889(Class994 class994) {
        this.Field14839 = class994;
    }

    public boolean Method5890() {
        return this.Field14835;
    }

    public void Method5891(boolean bl) {
        this.Field14835 = bl;
    }
}

