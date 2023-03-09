/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1039;
import lavahack.client.Class1514;
import lavahack.client.Class1803;
import lavahack.client.Class1876;
import lavahack.client.Class42;
import lavahack.client.Class790;

public class Class532
extends Class1514 {
    private static final int Field10243 = 28;
    public int Field10244;
    private String Field10245;
    private int Field10246;
    private boolean Field10247;
    private Class790 Field10248;
    private Class1803 Field10249;
    private boolean Field10250 = false;
    private Class42 Field10251 = null;
    private final int[] Field10252 = new int[]{0, 0};
    private int Field10253;

    public Class532(Class1876 class1876, String string, int n, int n2, Class1803 class1803) {
        super(class1876);
        this.Field10244 = n;
        this.Field10246 = n2;
        this.Field10249 = class1803;
        this.Method2416(string);
    }

    public Class532(Class1876 class1876, String string, int n, Class1803 class1803) {
        this(class1876, string, n, 28, class1803);
    }

    public Class532(Class1876 class1876, String string, int n, Class1803 class1803, Class42 class42) {
        this(class1876, string, n, 28, class1803);
        this.Field10251 = class42;
    }

    @Override
    public void Method668() {
        if (this.Field10247) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Field10246, Class1039.Field12569);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Field10246, 1.0f, Class1039.Field12569);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(this.Field10245) / 2, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field10246 / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Field10245) / 2, this.Field10245, null.Field11804.Method365() && this.Method2414() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : Class1039.Field12573);
        if (!this.Field10250) return;
        this.Method2417();
        this.Field10249.Method672(this.Method671());
        this.Field10249.Method674(this.Method673() + this.Field10246);
        this.Field10249.Method668();
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), 1.0f, Class1039.Field12569);
    }

    @Override
    public void Method669() {
        if (this.Field10251.Method31().isEmpty()) return;
        if (!null.Field11789.Method365()) return;
        if (!this.Field10247) return;
        if (this.Field10251 == null) return;
        int n = 10;
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.Field10252[0] + n, this.Field10252[1], 10 + this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(this.Field10251.Method31()), this.Field10246, Class1039.Field12572);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.Field10252[0] + n, this.Field10252[1], 10 + this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(this.Field10251.Method31()), this.Field10246, 1.0f, Class1039.Field12572);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.Field10252[0] + n + 5, this.Field10252[1] + this.Field10246 / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Field10251.Method31()) / 2, this.Field10251.Method31(), Class1039.Field12573);
    }

    @Override
    public boolean Method683(int n, int n2, boolean bl) {
        this.Field10252[0] = n;
        this.Field10252[1] = n2;
        this.Method2413(n, n2, bl);
        if (!this.Field10250) return false;
        if (!this.Field10249.Method683(n, n2, bl)) return false;
        return true;
    }

    private void Method2413(int n, int n2, boolean bl) {
        this.Field10247 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field10246;
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        if (n == 0) {
            this.Method2413(n2, n3, bl);
            if (this.Field10247) {
                this.Field10250 = !this.Field10250;
                this.Field10249.Method6813();
                this.Method2417();
                return true;
            }
        }
        if (!this.Field10250) return false;
        if (!this.Field10249.Method684(n, n2, n3, bl)) return false;
        return true;
    }

    public boolean Method2414() {
        if (this.Field10251 == null) return false;
        boolean bl = this.Field10251.Method35();
        return bl;
    }

    public String Method2415() {
        return this.Field10245;
    }

    public void Method2416(String string) {
        this.Field10245 = string;
        this.Method2417();
    }

    private void Method2417() {
        this.Method678(Math.max(this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Method2415()) * 5 / 4, this.Field10246) + (this.Field10250 ? this.Field10249.Method677() : 0));
    }

    public void Method2418(Class790 class790) {
        this.Field10248 = class790;
    }

    @Override
    public boolean Method682(int n, int n2, int n3, boolean bl) {
        if (!this.Field10250) return false;
        if (!this.Field10249.Method682(n, n2, n3, bl)) return false;
        return true;
    }

    @Override
    public boolean Method685(int n) {
        if (!this.Field10250) return false;
        if (!this.Field10249.Method685(n)) return false;
        return true;
    }

    @Override
    public boolean Method681(int n, char c) {
        if (!this.Field10250) return false;
        if (!this.Field10249.Method681(n, c)) return false;
        return true;
    }
}

