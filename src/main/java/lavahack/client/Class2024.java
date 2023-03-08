//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import java.util.*;

public class Class2024 extends Class1803
{
    private static final double Field17307;
    private int Field17308;
    private boolean Field17309;
    private int Field17310;
    private String Field17311 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2024(final Class1876 class1876, final Class1997 class1877) {
        super(class1876, class1877);
        this.Field17308 = 0;
        this.Field17309 = false;
    }
    
    public void Method6813() {
        this.Method6814(this.Method675(), Integer.MAX_VALUE, true);
    }
    
    protected void Method6814(final int n, final int n2, final boolean b) {
        super.Method6814(n, n2, false);
        this.Field17310 = this.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method6903();
        this.Method6811();
    }
    
    public void Method668() {
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2452();
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Method677(), Color.white);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2453();
        super.Method668();
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2454();
        final int n = this.Field17310 - this.Method677();
        if (n > 0) {
            final int n2 = (int)(this.Method677() / (double)this.Field17310 * this.Method677());
            final int n3 = 3;
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - n3), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + (this.Method677() - n2) * (this.Field17308 / (double)n), (double)n3, (double)n2, null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571);
            if (null.Field11786.Method365()) {
                Class753.drawRoundedRect((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - n3) / 2, (this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + (this.Method677() - n2) * (this.Field17308 / (double)n)) / Double.longBitsToDouble(4611686018427387904L), (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675()) / 2, (this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + (this.Method677() - n2) * (this.Field17308 / (double)n) + n2) / Double.longBitsToDouble(4611686018427387904L), null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571, null.Field11788.Method367());
            }
        }
    }
    
    protected void Method6812() {
        for (final Class1514 class1514 : this.Ljc0gDTN8WkwPRHY480HpEkScGALG41A) {
            final int[] array = this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.get(class1514);
            if (array == null) {
                this.Method6813();
                this.Method6812();
                return;
            }
            class1514.Method672(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + array[0]);
            class1514.Method674(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + array[1] - this.Field17308);
        }
    }
    
    private void Method7487(final int n, final int n2, final boolean b) {
        this.Field17309 = (!b && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677());
    }
    
    public boolean Method685(final int n) {
        this.Field17308 -= (int)(n * Double.longBitsToDouble(4598175219545276416L));
        this.Method6811();
        return super.Method685(n);
    }
    
    private void Method6811() {
        if (this.Field17308 > this.Field17310 - this.Method677()) {
            this.Field17308 = this.Field17310 - this.Method677();
        }
        if (this.Field17308 < 0) {
            this.Field17308 = 0;
        }
    }
    
    public boolean Method683(final int n, final int n2, final boolean b) {
        this.Method7487(n, n2, b);
        return super.Method683(n, n2, b || n < this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi || n2 < this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf || n > this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() || n2 > this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677());
    }
    
    public boolean Method684(final int n, final int n2, final int n3, final boolean b) {
        return super.Method684(n, n2, n3, b || n2 < this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi || n3 < this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf || n2 > this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() || n3 > this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677());
    }
    
    public boolean Method682(final int n, final int n2, final int n3, final boolean b) {
        return super.Method682(n, n2, n3, b || n2 < this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi || n3 < this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf || n2 > this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() || n3 > this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677());
    }
    
    public void Method6815(final Class1514 class1514) {
        super.Method6815(class1514);
    }
    
    static {
        Field17307 = 0.0;
    }
}
