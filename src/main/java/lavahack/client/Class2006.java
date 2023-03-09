/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1039;
import lavahack.client.Class1514;
import lavahack.client.Class1876;
import lavahack.client.Class753;
import lavahack.client.Class790;

public class Class2006
extends Class1514 {
    private static final int Field17197;
    public static final int Field17198;
    public String Field17199;
    private int Field17200;
    private int Field17201;
    private boolean Field17202;
    private Class790 Field17203;
    private Class790 Field17204;
    private String Field17205 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2006(Class1876 class1876, String string, int n, int n2) {
        super(class1876);
        this.Field17200 = n;
        this.Field17201 = n2;
        this.Method688(string);
    }

    public Class2006(Class1876 class1876, String string) {
        this(class1876, string, 180, 22);
    }

    @Override
    public void Method668() {
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), this.Field17202 ? Class1039.Field12569 : Class1039.Field12570);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), 1.0f, this.Field17202 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571) : Class1039.Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect((double)(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / 2), (double)(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2), (double)((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675()) / 2), (double)((this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677()) / 2), this.Field17202 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12571) : Class1039.Field12569, null.Field11788.Method367());
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(this.Field17199) / 2, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Field17199) / 2, this.Field17199, Class1039.Field12573);
    }

    @Override
    public void Method669() {
    }

    @Override
    public boolean Method683(int n, int n2, boolean bl) {
        this.Method686(n, n2, bl);
        return false;
    }

    private void Method686(int n, int n2, boolean bl) {
        this.Field17202 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677();
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        if (n == 0) {
            this.Method686(n2, n3, bl);
            if (!this.Field17202) return false;
            if (this.Field17203 == null) return false;
            this.Field17203.Method3300();
            return true;
        }
        if (n != 1) return false;
        this.Method686(n2, n3, bl);
        if (!this.Field17202) return false;
        if (this.Field17204 == null) return false;
        this.Field17204.Method3300();
        return true;
    }

    public String Method687() {
        return this.Field17199;
    }

    public void Method688(String string) {
        this.Field17199 = string;
        this.Method676(Math.max(this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(string), this.Field17200));
        this.Method678(Math.max(this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(string) * 5 / 4, this.Field17201));
    }

    public Class790 Method689() {
        return this.Field17203;
    }

    public void Method690(Class790 class790) {
        this.Field17203 = class790;
    }

    public Class790 Method691() {
        return this.Field17204;
    }

    public void Method692(Class790 class790) {
        this.Field17204 = class790;
    }

    static {
        Field17198 = 22;
        Field17197 = 180;
    }
}

