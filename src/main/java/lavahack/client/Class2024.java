/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.Color;
import java.util.Iterator;
import lavahack.client.Class1039;
import lavahack.client.Class1514;
import lavahack.client.Class1803;
import lavahack.client.Class1876;
import lavahack.client.Class1997;
import lavahack.client.Class753;

public class Class2024
extends Class1803 {
    private static final double Field17307 = 0.0;
    private int Field17308 = 0;
    private boolean Field17309 = false;
    private int Field17310;
    private String Field17311 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2024(Class1876 class1876, Class1997 class1997) {
        super(class1876, class1997);
    }

    @Override
    public void Method6813() {
        this.Method6814(this.Method675(), Integer.MAX_VALUE, true);
    }

    @Override
    protected void Method6814(int n, int n2, boolean bl) {
        super.Method6814(n, n2, false);
        this.Field17310 = this.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method6903();
        this.Method6811();
    }

    @Override
    public void Method668() {
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2452();
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), Color.white);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2453();
        super.Method668();
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2454();
        int n = this.Field17310 - this.Method677();
        if (n <= 0) return;
        int n2 = (int)((double)this.Method677() / (double)this.Field17310 * (double)this.Method677());
        int n3 = 3;
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - n3, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + (double)(this.Method677() - n2) * ((double)this.Field17308 / (double)n), n3, n2, null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571);
        if (!null.Field11786.Method365()) return;
        Class753.drawRoundedRect((double)((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - n3) / 2), ((double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + (double)(this.Method677() - n2) * ((double)this.Field17308 / (double)n)) / Double.longBitsToDouble(0x4000000000000000L), (double)((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675()) / 2), ((double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + (double)(this.Method677() - n2) * ((double)this.Field17308 / (double)n) + (double)n2) / Double.longBitsToDouble(0x4000000000000000L), null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571, null.Field11788.Method367());
    }

    @Override
    protected void Method6812() {
        Iterator iterator = this.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.iterator();
        while (iterator.hasNext()) {
            Class1514 class1514 = (Class1514)iterator.next();
            int[] nArray = (int[])this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.get(class1514);
            if (nArray == null) {
                this.Method6813();
                this.Method6812();
                return;
            }
            class1514.Method672(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + nArray[0]);
            class1514.Method674(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + nArray[1] - this.Field17308);
        }
    }

    private void Method7487(int n, int n2, boolean bl) {
        this.Field17309 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677();
    }

    @Override
    public boolean Method685(int n) {
        this.Field17308 = (int)((double)this.Field17308 - (double)n * Double.longBitsToDouble(4598175219545276416L));
        this.Method6811();
        return super.Method685(n);
    }

    private void Method6811() {
        if (this.Field17308 > this.Field17310 - this.Method677()) {
            this.Field17308 = this.Field17310 - this.Method677();
        }
        if (this.Field17308 >= 0) return;
        this.Field17308 = 0;
    }

    @Override
    public boolean Method683(int n, int n2, boolean bl) {
        boolean bl2;
        this.Method7487(n, n2, bl);
        if (!bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677()) {
            bl2 = false;
            return super.Method683(n, n2, bl2);
        }
        bl2 = true;
        return super.Method683(n, n2, bl2);
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        boolean bl2;
        if (!bl && n2 >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n3 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n2 <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n3 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677()) {
            bl2 = false;
            return super.Method684(n, n2, n3, bl2);
        }
        bl2 = true;
        return super.Method684(n, n2, n3, bl2);
    }

    @Override
    public boolean Method682(int n, int n2, int n3, boolean bl) {
        boolean bl2;
        if (!bl && n2 >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n3 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n2 <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n3 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677()) {
            bl2 = false;
            return super.Method682(n, n2, n3, bl2);
        }
        bl2 = true;
        return super.Method682(n, n2, n3, bl2);
    }

    @Override
    public void Method6815(Class1514 class1514) {
        super.Method6815(class1514);
    }
}

