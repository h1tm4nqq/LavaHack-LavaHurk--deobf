//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;

public class Class1461 extends Class1514
{
    private static final int Field14834;
    private boolean Field14835;
    private String Field14836;
    private int Field14837;
    private boolean Field14838;
    private Class994 Field14839;
    private String Field14840 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1461(final Class1876 class1876, final String s, final int field14837) {
        super(class1876);
        this.Field14837 = field14837;
        this.Method5888(s);
    }
    
    public Class1461(final Class1876 class1876, final String s) {
        this(class1876, s, 22);
    }
    
    @Override
    public void Method668() {
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field14837, this.Field14837, this.Field14838 ? Class1039.Field12569 : Class1039.Field12570);
        if (this.Field14835) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field14837, this.Field14837, this.Field14838 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12570) : Class1039.Field12569);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field14837, this.Field14837, 1.0f, this.Field14838 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571) : Class1039.Field12569);
        if (null.Field11786.Method365() && this.Field14835) {
            Class753.drawRoundedRect(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / 2, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2, (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Field14837) / 2, (this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field14837) / 2, this.Field14838 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571) : Class1039.Field12569, null.Field11788.Method367());
        }
        if (null.Field11806.Method365() && this.Field14835) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2444((float)(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / 2 - 5), (float)(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2 - 1), this.Field14837, Color.WHITE.getRGB());
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Field14837 + this.Field14837 / 4, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Field14836) / 2, this.Field14836, Class1039.Field12573);
    }
    
    @Override
    public void Method669() {
    }
    
    @Override
    public boolean Method683(final int n, final int n2, final boolean b) {
        this.Method5886(n, n2, b);
        return false;
    }
    
    private void Method5886(final int n, final int n2, final boolean b) {
        this.Field14838 = (!b && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677());
    }
    
    @Override
    public boolean Method684(final int n, final int n2, final int n3, final boolean b) {
        if (n == 0) {
            this.Method5886(n2, n3, b);
            if (this.Field14838) {
                final boolean b2 = !this.Field14835;
                if (this.Field14839 != null) {
                    this.Field14839.Method4024(b2);
                }
                this.Field14835 = b2;
                return true;
            }
        }
        return false;
    }
    
    public String Method5887() {
        return this.Field14836;
    }
    
    public void Method5888(final String field14836) {
        this.Field14836 = field14836;
        this.Method676(this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(field14836) + this.Field14837 + this.Field14837 / 4);
        this.Method678(this.Field14837);
    }
    
    public void Method5889(final Class994 field14839) {
        this.Field14839 = field14839;
    }
    
    public boolean Method5890() {
        return this.Field14835;
    }
    
    public void Method5891(final boolean field14835) {
        this.Field14835 = field14835;
    }
    
    static {
        Field14834 = 22;
    }
}
