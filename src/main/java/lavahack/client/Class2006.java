//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class2006 extends Class1514
{
    private static final int Field17197;
    public static final int Field17198;
    public String Field17199;
    private int Field17200;
    private int Field17201;
    private boolean Field17202;
    private Class790 Field17203;
    private Class790 Field17204;
    private String Field17205 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2006(final Class1876 class1876, final String s, final int field17200, final int field17201) {
        super(class1876);
        this.Field17200 = field17200;
        this.Field17201 = field17201;
        this.Method688(s);
    }
    
    public Class2006(final Class1876 class1876, final String s) {
        this(class1876, s, 180, 22);
    }
    
    public void Method668() {
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Method677(), this.Field17202 ? Class1039.Field12569 : Class1039.Field12570);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Method677(), 1.0f, this.Field17202 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571) : Class1039.Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / 2, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2, (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675()) / 2, (this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677()) / 2, this.Field17202 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571) : Class1039.Field12569, null.Field11788.Method367());
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(this.Field17199) / 2, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Field17199) / 2, this.Field17199, Class1039.Field12573);
    }
    
    public void Method669() {
    }
    
    public boolean Method683(final int n, final int n2, final boolean b) {
        this.Method686(n, n2, b);
        return false;
    }
    
    private void Method686(final int n, final int n2, final boolean b) {
        this.Field17202 = (!b && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677());
    }
    
    public boolean Method684(final int n, final int n2, final int n3, final boolean b) {
        if (n == 0) {
            this.Method686(n2, n3, b);
            if (this.Field17202 && this.Field17203 != null) {
                this.Field17203.Method3300();
                return true;
            }
        }
        else if (n == 1) {
            this.Method686(n2, n3, b);
            if (this.Field17202 && this.Field17204 != null) {
                this.Field17204.Method3300();
                return true;
            }
        }
        return false;
    }
    
    public String Method687() {
        return this.Field17199;
    }
    
    public void Method688(final String field17199) {
        this.Field17199 = field17199;
        this.Method676(Math.max(this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(field17199), this.Field17200));
        this.Method678(Math.max(this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(field17199) * 5 / 4, this.Field17201));
    }
    
    public Class790 Method689() {
        return this.Field17203;
    }
    
    public void Method690(final Class790 field17203) {
        this.Field17203 = field17203;
    }
    
    public Class790 Method691() {
        return this.Field17204;
    }
    
    public void Method692(final Class790 field17204) {
        this.Field17204 = field17204;
    }
    
    static {
        Field17198 = 22;
        Field17197 = 180;
    }
}
