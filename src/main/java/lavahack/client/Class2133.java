/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import lavahack.client.Class1039;
import lavahack.client.Class1514;
import lavahack.client.Class1876;
import lavahack.client.Class753;
import lavahack.client.Class994;
import net.minecraft.util.text.TextFormatting;

public class Class2133
extends Class1514 {
    private static final int Field17697;
    private static final int Field17698;
    private int Field17699;
    private int Field17700;
    private boolean Field17701;
    private boolean Field17702;
    private Class994 Field17703;
    private String[] Field17704;
    private int Field17705;
    private boolean Field17706;
    private int Field17707;
    private String Field17708 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2133(Class1876 class1876, int n, int n2, String[] stringArray, int n3) {
        super(class1876);
        this.Field17699 = n;
        this.Field17700 = n2;
        this.Field17704 = stringArray;
        this.Field17705 = n3;
        this.Method676(n);
        this.Method7671();
    }

    public Class2133(Class1876 class1876, String[] stringArray, int n) {
        this(class1876, 180, 22, stringArray, n);
    }

    private void Method7671() {
        if (this.Field17706) {
            this.Method678(this.Field17700 * this.Field17704.length + 4);
            return;
        }
        this.Method678(this.Field17700);
    }

    @Override
    public void Method668() {
        int n;
        int n2;
        block11: {
            block10: {
                this.Method7671();
                this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), Class1039.Field12570);
                if (!this.Field17701) break block10;
                this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Field17700, Class1039.Field12569);
                break block11;
            }
            if (!this.Field17702) break block11;
            int n3 = this.Field17700 + 4;
            for (n2 = 0; n2 < this.Field17704.length; ++n2) {
                block14: {
                    block12: {
                        block13: {
                            if (n2 == this.Field17705) continue;
                            n = this.Field17700;
                            if (this.Field17705 != 0) break block12;
                            if (this.Field17705 != this.Field17704.length - 1) break block13;
                            if (n2 != this.Field17704.length - 2) break block14;
                            break block12;
                        }
                        if (n2 != this.Field17704.length - 1) break block14;
                    }
                    ++n;
                }
                if (this.Field17707 >= this.Method673() + n3 && this.Field17707 <= this.Method673() + n3 + this.Field17700) {
                    this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + n3, this.Method675(), this.Field17700, Class1039.Field12569);
                    break;
                }
                n3 += n;
            }
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - this.Field17700, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field17700, this.Method677(), this.Field17701 || this.Field17706 ? Class1039.Field12570 : Class1039.Field12569);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), 1.0f, this.Field17701 && !this.Field17706 ? Class1039.Field12571 : Class1039.Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect((double)((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - this.Field17700) / 2), (double)(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2), (double)((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675()) / 2), (double)((this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677()) / 2), this.Field17701 || this.Field17706 ? Class1039.Field12570 : Class1039.Field12569, null.Field11788.Method367());
        }
        String string = this.Field17705 != -1 ? this.Field17704[this.Field17705] : TextFormatting.RED + "ERROR";
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + 4, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field17700 / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(string) / 2, string, Class1039.Field12573);
        if (!this.Field17706) return;
        n2 = this.Field17700 + 4;
        n = 0;
        while (n < this.Field17704.length) {
            block15: {
                int n4;
                block18: {
                    block16: {
                        block17: {
                            if (n == this.Field17705) break block15;
                            n4 = this.Field17700;
                            if (this.Field17705 != 0) break block16;
                            if (this.Field17705 != this.Field17704.length - 1) break block17;
                            if (n != this.Field17704.length - 2) break block18;
                            break block16;
                        }
                        if (n != this.Field17704.length - 1) break block18;
                    }
                    ++n4;
                }
                this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + 4, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + n2 + (11 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Field17704[n]) / 2), this.Field17704[n], Class1039.Field12573);
                n2 += n4;
            }
            ++n;
        }
    }

    @Override
    public void Method669() {
    }

    @Override
    public boolean Method683(int n, int n2, boolean bl) {
        this.Method7672(n, n2, bl);
        return false;
    }

    private void Method7672(int n, int n2, boolean bl) {
        this.Field17701 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field17700;
        this.Field17702 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677();
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = n;
        this.Field17707 = n2;
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        this.Method7672(n2, n3, bl);
        if (n != 0) {
            return false;
        }
        if (this.Field17701) {
            this.Method7677(!this.Field17706);
            this.Method7671();
            return true;
        }
        if (!this.Field17702) return false;
        if (!this.Field17706) return false;
        int n4 = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field17700 + 4;
        for (int i = 0; i < this.Field17704.length; ++i) {
            if (i == this.Field17705) continue;
            if (n3 >= n4 && n3 <= n4 + this.Field17700) {
                this.Method7673(i);
                this.Method7677(false);
                break;
            }
            n4 += this.Field17700;
        }
        this.Method7672(n2, n3, bl);
        return true;
    }

    private void Method7673(int n) {
        boolean bl = true;
        if (this.Field17703 != null) {
            bl = this.Field17703.Method4024(n);
        }
        this.Field17705 = n;
    }

    public int Method7674() {
        return this.Field17705;
    }

    public void Method7675(int n) {
        this.Field17705 = n;
    }

    public void Method7676(Class994 class994) {
        this.Field17703 = class994;
    }

    public void Method7677(boolean bl) {
        this.Field17706 = bl;
        this.Method7671();
    }

    static {
        Field17698 = 22;
        Field17697 = 180;
    }

    private static String Method7678(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 218;
            cArray2[n] = (char)(cArray[n] ^ (0x607E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

