//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class532 extends Class1514
{
    private static final int Field10243;
    public int Field10244;
    private String Field10245;
    private int Field10246;
    private boolean Field10247;
    private Class790 Field10248;
    private Class1803 Field10249;
    private boolean Field10250;
    private Class42 Field10251;
    private final int[] Field10252;
    private int Field10253;
    
    public Class532(final Class1876 class1876, final String s, final int field10244, final int field10245, final Class1803 field10246) {
        super(class1876);
        this.Field10250 = false;
        this.Field10251 = null;
        this.Field10252 = new int[] { 0, 0 };
        this.Field10244 = field10244;
        this.Field10246 = field10245;
        this.Field10249 = field10246;
        this.Method2416(s);
    }
    
    public Class532(final Class1876 class1876, final String s, final int n, final Class1803 class1877) {
        this(class1876, s, n, 28, class1877);
    }
    
    public Class532(final Class1876 class1876, final String s, final int n, final Class1803 class1877, final Class42 field10251) {
        this(class1876, s, n, 28, class1877);
        this.Field10251 = field10251;
    }
    
    public void Method668() {
        if (this.Field10247) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Field10246, Class1039.Field12569);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Field10246, 1.0f, Class1039.Field12569);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(this.Field10245) / 2, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field10246 / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Field10245) / 2, this.Field10245, (null.Field11804.Method365() && this.Method2414()) ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12573);
        if (this.Field10250) {
            this.Method2417();
            this.Field10249.Method672(this.Method671());
            this.Field10249.Method674(this.Method673() + this.Field10246);
            this.Field10249.Method668();
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Method677(), 1.0f, Class1039.Field12569);
        }
    }
    
    public void Method669() {
        if (!this.Field10251.Method31().isEmpty() && null.Field11789.Method365() && this.Field10247 && this.Field10251 != null) {
            final int n = 10;
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)(this.Field10252[0] + n), (double)this.Field10252[1], (double)(10 + this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(this.Field10251.Method31())), (double)this.Field10246, Class1039.Field12572);
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446((double)(this.Field10252[0] + n), (double)this.Field10252[1], (double)(10 + this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(this.Field10251.Method31())), (double)this.Field10246, 1.0f, Class1039.Field12572);
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.Field10252[0] + n + 5, this.Field10252[1] + this.Field10246 / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Field10251.Method31()) / 2, this.Field10251.Method31(), Class1039.Field12573);
        }
    }
    
    public boolean Method683(final int n, final int n2, final boolean b) {
        this.Method2413(this.Field10252[0] = n, this.Field10252[1] = n2, b);
        return this.Field10250 && this.Field10249.Method683(n, n2, b);
    }
    
    private void Method2413(final int n, final int n2, final boolean b) {
        this.Field10247 = (!b && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field10246);
    }
    
    public boolean Method684(final int n, final int n2, final int n3, final boolean b) {
        if (n == 0) {
            this.Method2413(n2, n3, b);
            if (this.Field10247) {
                this.Field10250 = !this.Field10250;
                this.Field10249.Method6813();
                this.Method2417();
                return true;
            }
        }
        return this.Field10250 && this.Field10249.Method684(n, n2, n3, b);
    }
    
    public boolean Method2414() {
        return this.Field10251 != null && this.Field10251.Method35();
    }
    
    public String Method2415() {
        return this.Field10245;
    }
    
    public void Method2416(final String field10245) {
        this.Field10245 = field10245;
        this.Method2417();
    }
    
    private void Method2417() {
        this.Method678(Math.max(this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Method2415()) * 5 / 4, this.Field10246) + (this.Field10250 ? this.Field10249.Method677() : 0));
    }
    
    public void Method2418(final Class790 field10248) {
        this.Field10248 = field10248;
    }
    
    public boolean Method682(final int n, final int n2, final int n3, final boolean b) {
        return this.Field10250 && this.Field10249.Method682(n, n2, n3, b);
    }
    
    public boolean Method685(final int n) {
        return this.Field10250 && this.Field10249.Method685(n);
    }
    
    public boolean Method681(final int n, final char c) {
        return this.Field10250 && this.Field10249.Method681(n, c);
    }
    
    static {
        Field10243 = 28;
    }
}
