/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import lavahack.client.EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP;
import lavahack.client.NZlapI0lvoshixInpR8uRshg3YC4m0ZP;
import lavahack.client.PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo;
import lavahack.client.Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import net.minecraft.util.text.TextFormatting;

public class aaIpHGpdfYDnYhZBsTWEFEP4PYWWvmx4
extends Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj {
    private static final int Field17697;
    private static final int Field17698;
    private int Field17699;
    private int Field17700;
    private boolean Field17701;
    private boolean Field17702;
    private NZlapI0lvoshixInpR8uRshg3YC4m0ZP Field17703;
    private String[] Field17704;
    private int Field17705;
    private boolean Field17706;
    private int Field17707;
    private String Field17708 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public aaIpHGpdfYDnYhZBsTWEFEP4PYWWvmx4(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, int n, int n2, String[] stringArray, int n3) {
        super(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP);
        this.Field17699 = n;
        this.Field17700 = n2;
        this.Field17704 = stringArray;
        this.Field17705 = n3;
        this.Method676(n);
        this.Method7671();
    }

    public aaIpHGpdfYDnYhZBsTWEFEP4PYWWvmx4(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, String[] stringArray, int n) {
        this(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, ((int)654717469L ^ 0x27063230) << 2, ((int)-2133097687L ^ 0x80DB8322) << 1, stringArray, n);
    }

    private void Method7671() {
        if (this.Field17706) {
            this.Method678(this.Field17700 * this.Field17704.length + ((int)((long)-1983339512 ^ (long)-1983339511) << 2));
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
                this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12570);
                if (!this.Field17701) break block10;
                this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Field17700, PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569);
                break block11;
            }
            if (!this.Field17702) break block11;
            int n3 = this.Field17700 + ((int)((long)-1756976203 ^ (long)-1756976204) << 2);
            for (n2 = (int)((long)-1363762785 ^ (long)-1363762785); n2 < this.Field17704.length; ++n2) {
                block14: {
                    block12: {
                        block13: {
                            if (n2 == this.Field17705) continue;
                            n = this.Field17700;
                            if (this.Field17705 != 0) break block12;
                            int cfr_ignored_0 = (int)((long)2071601448 ^ (long)2071601449);
                            if (this.Field17705 != this.Field17704.length - (int)((long)1948748996 ^ (long)1948748997)) break block13;
                            if (n2 != this.Field17704.length - (((int)-1422954668L ^ 0xAB2F6F55) << 1)) break block14;
                            break block12;
                        }
                        if (n2 != this.Field17704.length - (int)((long)-1336740632 ^ (long)-1336740631)) break block14;
                    }
                    ++n;
                }
                if (this.Field17707 >= this.Method673() + n3 && this.Field17707 <= this.Method673() + n3 + this.Field17700) {
                    this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + n3, this.Method675(), this.Field17700, PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569);
                    break;
                }
                n3 += n;
            }
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - this.Field17700, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field17700, this.Method677(), this.Field17701 || this.Field17706 ? PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12570 : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), 1.0f, this.Field17701 && !this.Field17706 ? PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12571 : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569);
        if (null.Field11786.Method365()) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect((double)((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - this.Field17700) / ((int)((long)-1283795495 ^ (long)-1283795496) << 1)), (double)(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / ((int)((long)-1632227705 ^ (long)-1632227706) << 1)), (double)((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675()) / (((int)-222171009L ^ 0xF2C1F07E) << 1)), (double)((this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677()) / ((int)((long)-1177279363 ^ (long)-1177279364) << 1)), this.Field17701 || this.Field17706 ? PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12570 : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569, null.Field11788.Method367());
        }
        String string = this.Field17705 != (int)((long)35500238 ^ (long)-35500239) ? this.Field17704[this.Field17705] : TextFormatting.RED + "ERROR";
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + (((int)-1847908870L ^ 0x91DB25FB) << 2), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field17700 / ((int)((long)-633216788 ^ (long)-633216787) << 1) - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(string) / ((int)((long)-1611950263 ^ (long)-1611950264) << 1), string, PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12573);
        if (!this.Field17706) return;
        n2 = this.Field17700 + ((int)((long)-597567557 ^ (long)-597567558) << 2);
        n = (int)((long)-387849165 ^ (long)-387849165);
        while (n < this.Field17704.length) {
            block15: {
                int n4;
                block18: {
                    block16: {
                        block17: {
                            if (n == this.Field17705) break block15;
                            n4 = this.Field17700;
                            if (this.Field17705 != 0) break block16;
                            int cfr_ignored_1 = (int)((long)1077606132 ^ (long)1077606133);
                            if (this.Field17705 != this.Field17704.length - (int)((long)1115454053 ^ (long)1115454052)) break block17;
                            if (n != this.Field17704.length - ((int)((long)-714275811 ^ (long)-714275812) << 1)) break block18;
                            break block16;
                        }
                        if (n != this.Field17704.length - ((int)953856757L ^ 0x38DAB2F4)) break block18;
                    }
                    ++n4;
                }
                this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + (((int)478254697L ^ 0x1C819668) << 2), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + n2 + (((int)-1483132380L ^ 0xA799322F) - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Field17704[n]) / ((int)((long)-1253648827 ^ (long)-1253648828) << 1)), this.Field17704[n], PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12573);
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
        return (int)((long)1159946443 ^ (long)1159946443) != 0;
    }

    private void Method7672(int n, int n2, boolean bl) {
        this.Field17701 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field17700 ? (int)-1245100704L ^ 0xB5C94561 : (int)((long)-1955598729 ^ (long)-1955598729);
        this.Field17702 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677() ? (int)((long)-1985820617 ^ (long)-1985820618) : (int)((long)394992975 ^ (long)394992975);
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = n;
        this.Field17707 = n2;
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        this.Method7672(n2, n3, bl);
        if (n != 0) {
            return (int)((long)-658659943 ^ (long)-658659943) != 0;
        }
        if (this.Field17701) {
            this.Method7677((!this.Field17706 ? (int)429316560L ^ 0x1996D9D1 : (int)-231571907L ^ 0xF2327E3D) != 0);
            this.Method7671();
            return ((int)-618516943L ^ 0xDB222E30) != 0;
        }
        if (!this.Field17702) return ((int)198878620L ^ 0xBDAA59C) != 0;
        if (!this.Field17706) return ((int)198878620L ^ 0xBDAA59C) != 0;
        int n4 = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field17700 + ((int)((long)142390653 ^ (long)142390652) << 2);
        for (int i = (int)1002927855L ^ 0x3BC776EF; i < this.Field17704.length; ++i) {
            if (i == this.Field17705) continue;
            if (n3 >= n4 && n3 <= n4 + this.Field17700) {
                this.Method7673(i);
                this.Method7677((boolean)((long)-1753382272 ^ (long)-1753382272));
                break;
            }
            n4 += this.Field17700;
        }
        this.Method7672(n2, n3, bl);
        return (int)((long)-726201018 ^ (long)-726201017) != 0;
    }

    private void Method7673(int n) {
        int n2 = (int)2019537004L ^ 0x785FB06D;
        if (this.Field17703 != null) {
            n2 = this.Field17703.Method4024(n) ? 1 : 0;
        }
        this.Field17705 = n;
    }

    public int Method7674() {
        return this.Field17705;
    }

    public void Method7675(int n) {
        this.Field17705 = n;
    }

    public void Method7676(NZlapI0lvoshixInpR8uRshg3YC4m0ZP nZlapI0lvoshixInpR8uRshg3YC4m0ZP) {
        this.Field17703 = nZlapI0lvoshixInpR8uRshg3YC4m0ZP;
    }

    public void Method7677(boolean bl) {
        this.Field17706 = bl;
        this.Method7671();
    }

    static {
        Field17698 = ((int)1434268697L ^ 0x557D3412) << 1;
        Field17697 = ((int)-1516359246L ^ 0xA59E319F) << 2;
    }

    private static String Method7678(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-474447642L ^ 0xE3B880E6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-180325315L ^ 0xF54074C2);
            int n2 = (int)((long)-2059914480 ^ (long)-2059914371) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-345446005L ^ 0xEB68D9B4) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

