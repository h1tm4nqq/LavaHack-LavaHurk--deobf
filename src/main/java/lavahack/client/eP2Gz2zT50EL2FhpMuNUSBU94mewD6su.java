//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import lavahack.client.EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP;
import lavahack.client.NZlapI0lvoshixInpR8uRshg3YC4m0ZP;
import lavahack.client.PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo;
import lavahack.client.Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import net.minecraft.client.gui.Gui;
import org.lwjgl.opengl.GL11;

public class eP2Gz2zT50EL2FhpMuNUSBU94mewD6su
extends Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj {
    private static final int Field11336;
    private static final int Field11337;
    private final int Field11338;
    private final int Field11339;
    private boolean Field11340;
    private boolean Field11341;
    private vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field11342;
    private boolean Field11343;
    private float[] Field11344;
    private boolean Field11345;
    private boolean Field11346;
    private boolean Field11347;
    private int Field11348;
    private int Field11349;
    private int Field11350;
    private int Field11351;
    private int Field11352;
    private int Field11353;
    private int Field11354;
    private int Field11355;
    private int Field11356;
    private int Field11357;
    private int Field11358;
    private int Field11359;
    private int Field11360;
    private int Field11361;
    private int Field11362;
    private int Field11363;
    private vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field11364;
    private NZlapI0lvoshixInpR8uRshg3YC4m0ZP Field11365;
    private NZlapI0lvoshixInpR8uRshg3YC4m0ZP Field11366;
    private String Field11367 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public eP2Gz2zT50EL2FhpMuNUSBU94mewD6su(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, int n, int n2) {
        super(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP);
        this.Field11338 = n;
        this.Field11339 = n2;
        this.Field11342 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        float[] fArray = Color.RGBtoHSB(this.Field11342.Field17321, this.Field11342.Field17322, this.Field11342.Field17323, null);
        float[] fArray2 = new float[((int)-1339423171L ^ 0xB02A063C) << 2];
        fArray2[(int)((long)-757819963 ^ (long)-757819963)] = fArray[(int)-1550234537L ^ 0xA3994C57];
        fArray2[(int)1182125018L ^ 0x4675CBDB] = fArray[(int)-123169381L ^ 0xF8A8959A];
        fArray2[(int)((long)-86481295 ^ (long)-86481296) << 1] = fArray[((int)703494385L ^ 0x29EE78F0) << 1];
        fArray2[(int)1862207257L ^ 0x6EFF071A] = this.Field11342.Field17328;
        this.Field11344 = fArray2;
        this.Field11347 = this.Field11346 = (int)-1062094619L ^ 0xC0B1B8E5;
        this.Field11345 = this.Field11346;
        this.Field11350 = ((int)1429151887L ^ 0x552F2080) << 3;
        this.Field11351 = (int)((long)-602287602 ^ (long)-602287593) << 2;
        this.Field11348 = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / ((int)((long)-385648338 ^ (long)-385648337) << 1);
        this.Field11349 = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / (((int)-1779326577L ^ 0x95F1A18E) << 1) + n2 / (((int)2032061350L ^ 0x791ECBA7) << 1);
        this.Field11352 = this.Field11348;
        this.Field11353 = this.Field11349 + this.Field11351 + ((int)((long)-788631166 ^ (long)-788631167) << 1);
        this.Field11354 = this.Field11350;
        this.Field11355 = ((int)70866710L ^ 0x4395713) << 1;
        this.Field11356 = this.Field11348 + this.Field11350 + ((int)((long)-1822057907 ^ (long)-1822057906) << 1);
        this.Field11357 = this.Field11349;
        this.Field11358 = ((int)940067254L ^ 0x380849B3) << 1;
        this.Field11359 = this.Field11351;
        this.Field11360 = this.Field11348;
        this.Field11361 = this.Field11353 + this.Field11355 + (((int)2089372611L ^ 0x7C894BC0) << 1);
        this.Field11362 = this.Field11363 = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + (((int)-1708400157L ^ 0x9A2BE1E6) << 1);
        this.Method3280();
        this.Method3281();
    }

    public eP2Gz2zT50EL2FhpMuNUSBU94mewD6su(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        this(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (int)((long)-1788704162 ^ (long)-1788704141) << 2, ((int)-775131656L ^ 0xD1CC6DFB) << 3);
    }

    private void Method3280() {
        if (this.Field11341) {
            this.Method676((this.Field11350 + ((int)((long)-940937939 ^ (long)-940937938) << 1) + this.Field11358) * (((int)-245038683L ^ 0xF16501A4) << 1));
            return;
        }
        this.Method676(this.Field11338);
    }

    private void Method3281() {
        if (this.Field11341) {
            this.Method678(this.Field11339 + (this.Field11351 + (((int)-687264586L ^ 0xD7092CB5) << 2) + this.Field11355 + this.Field11363) * ((int)((long)1028909331 ^ (long)1028909330) << 1));
            return;
        }
        this.Method678(this.Field11339);
    }

    @Override
    public void Method668() {
        this.Field11348 = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / ((int)((long)1689617478 ^ (long)1689617479) << 1);
        this.Field11349 = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / ((int)((long)-906963043 ^ (long)-906963044) << 1) + this.Field11339 / (((int)-240129931L ^ 0xF1AFE874) << 1);
        this.Field11352 = this.Field11348;
        this.Field11353 = this.Field11349 + this.Field11351 + ((int)((long)-397414385 ^ (long)-397414388) << 1);
        this.Field11354 = this.Field11350;
        this.Field11355 = (int)((long)-1235944439 ^ (long)-1235944436) << 1;
        this.Field11356 = this.Field11348 + this.Field11350 + (((int)1644379166L ^ 0x62033C1D) << 1);
        this.Field11357 = this.Field11349;
        this.Field11358 = (int)((long)-295301365 ^ (long)-295301362) << 1;
        this.Field11359 = this.Field11351;
        this.Field11360 = this.Field11348;
        this.Field11361 = this.Field11353 + this.Field11355 + (((int)-306695726L ^ 0xEDB831D1) << 1);
        this.Field11362 = this.Field11363 = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + ((int)((long)690317168 ^ (long)690317173) << 1);
        this.Method3280();
        this.Method3281();
        if (!this.Field11341) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), this.Field11342.Method3625());
        }
        if (this.Field11341) {
            String string = "Red: " + this.Field11342.Field17321 + " Green: " + this.Field11342.Field17322 + " Blue: " + this.Field11342.Field17323;
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / (((int)-280835630L ^ 0xEF42C9D3) << 1) - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2449(string) / ((int)((long)-460705915 ^ (long)-460705916) << 1), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field11339 / (((int)21603003L ^ 0x149A2BA) << 1) - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(string) / (((int)-1279174581L ^ 0xB3C1584A) << 1), string, PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12573);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), 1.0f, this.Field11340 ? PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12571 : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569);
        if (null.Field11786.Method365()) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect((double)(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi / (((int)1636321354L ^ 0x6188484B) << 1)), (double)(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / ((int)((long)-1185085942 ^ (long)-1185085941) << 1)), (double)((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675()) / (((int)1494354602L ^ 0x59120AAB) << 1)), (double)((this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field11339) / (((int)1393417747L ^ 0x530DDE12) << 1)), this.Field11342.Method3625(), null.Field11788.Method367());
        }
        if (this.Field11341) {
            int n = this.Field11348 + this.Field11350 + ((int)((long)-844405203 ^ (long)-844405202) << 1);
            int n2 = this.Field11349 + this.Field11351 + ((int)((long)1067159029 ^ (long)1067159030) << 1);
            int n3 = ((int)1913809834L ^ 0x72126BAF) << 1;
            int n4 = (int)((long)268890170 ^ (long)268890175) << 1;
            int n5 = Color.HSBtoRGB(this.Field11344[(int)((long)1426231165 ^ (long)1426231165)], 1.0f, 1.0f);
            float f = (float)(n5 >> (((int)365576802L ^ 0x15CA4263) << 4) & (int)((long)-2063617757 ^ (long)-2063617572)) / Float.intBitsToFloat((int)1262121711L ^ 0x84572EF);
            float f2 = (float)(n5 >> ((int)((long)-484759331 ^ (long)-484759332) << 3) & (int)((long)675520900 ^ (long)675520891)) / Float.intBitsToFloat((int)((long)1680753060 ^ (long)659636644));
            float f3 = (float)(n5 & ((int)1187567431L ^ 0x46C8D7B8)) / Float.intBitsToFloat((int)888512519L ^ 0x778AA007);
            this.Method3296(this.Field11348, this.Field11349, this.Field11350, this.Field11351, f, f2, f3, this.Field11344[(int)((long)997810533 ^ (long)997810534)]);
            this.Method3294(this.Field11352, this.Field11353, this.Field11354, this.Field11355, this.Field11344[(int)-785984395L ^ 0xD126D475]);
            this.Method3295(this.Field11356, this.Field11357, this.Field11358, this.Field11359, f, f2, f3, this.Field11344[(int)-141738310L ^ 0xF78D3EB9]);
            this.Field11364 = this.Method3283(new Color(Color.HSBtoRGB(this.Field11344[(int)((long)-843534780 ^ (long)-843534780)], this.Field11344[(int)1393566077L ^ 0x5310217C], this.Field11344[((int)-1395778701L ^ 0xACCE1B72) << 1])), this.Field11344[(int)777571415L ^ 0x2E58CC54]);
            Gui.drawRect((int)n, (int)n2, (int)(n + n3), (int)(n2 + n4), (int)this.Field11364.Method3626());
            int n6 = (int)((float)this.Field11348 + this.Field11344[(int)((long)1092222296 ^ (long)1092222297)] * (float)this.Field11350);
            int n7 = (int)((float)(this.Field11349 + this.Field11351) - this.Field11344[(int)((long)1029901668 ^ (long)1029901669) << 1] * (float)this.Field11351);
            Gui.drawRect((int)(n6 - ((int)((long)-1289648629 ^ (long)-1289648630) << 1)), (int)(n7 - (((int)-545503258L ^ 0xDF7C47E7) << 1)), (int)(n6 + (((int)-630541939L ^ 0xDA6AB18C) << 1)), (int)(n7 + (((int)-733181165L ^ 0xD44C8B12) << 1)), (int)((int)((long)-503257844 ^ (long)503257843)));
            this.Field11342 = this.Field11364;
        }
        if (this.Field11365 != null) {
            this.Field11365.Method4024(this.Field11342);
        }
        if (this.Field11366 == null) return;
        this.Field11366.Method4024(this.Field11343);
    }

    @Override
    public void Method669() {
    }

    private void Method3282(int n, int n2, int n3, int n4, boolean bl, String string) {
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(n, n2, n3, n4, this.Field11340 ? PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569 : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12570);
        if (bl) {
            Color color = this.Field11340 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12570) : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569;
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(n, n2, n3, n4, color);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(n, n2, n3, n4, 1.0f, this.Field11340 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12571) : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569);
        if (null.Field11786.Method365() && bl) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect((double)(n / ((int)((long)192398560 ^ (long)192398561) << 1)), (double)(n2 / ((int)((long)563632058 ^ (long)563632059) << 1)), (double)((n + n3) / (((int)384633867L ^ 0x16ED0C0A) << 1)), (double)((n2 + n4) / (((int)296041054L ^ 0x11A53A5F) << 1)), this.Field11340 ? (null.Field11804.Method365() ? this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2456() : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12571) : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569, null.Field11788.Method367());
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(n + n3 + n4 / ((int)((long)1634488158 ^ (long)1634488159) << 2), n2 + this.Method677() / (((int)-1014873888L ^ 0xC38240E1) << 1) - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(string) / (((int)-402313267L ^ 0xE8052FCC) << 1), string, PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12573);
    }

    final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3283(Color color, float f) {
        return new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(color, f);
    }

    private void Method3284(int n, int n2, boolean bl) {
        this.Field11340 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677() ? (int)746211537L ^ 0x2C7A48D0 : (int)((long)-696400480 ^ (long)-696400480);
    }

    private boolean Method3285(int n, int n2, boolean bl) {
        int n3;
        if (!bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field11339) {
            n3 = (int)1659967327L ^ 0x62F1175E;
            return n3 != 0;
        }
        n3 = (int)((long)-235754902 ^ (long)-235754902);
        return n3 != 0;
    }

    protected boolean Method3286(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        if (n5 >= n && n6 >= n2 && n5 < n3 && n6 < n4) {
            n7 = (int)950743776L ^ 0x38AB32E1;
            return n7 != 0;
        }
        n7 = (int)((long)100762348 ^ (long)100762348);
        return n7 != 0;
    }

    @Override
    public boolean Method683(int n, int n2, boolean bl) {
        this.Method3284(n, n2, bl);
        this.Method3287(n / (((int)901241953L ^ 0x35B7DC60) << 1), n2 / ((int)((long)-2135419334 ^ (long)-2135419333) << 1));
        return ((int)1347905897L ^ 0x50576969) != 0;
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        int n4;
        if (n != 0) return (int)((long)-234100098 ^ (long)-234100098) != 0;
        this.Method3284(n2, n3, bl);
        if (this.Method3285(n2, n3, bl)) {
            this.Field11341 = !this.Field11341 ? (int)1754791179L ^ 0x6897FD0A : (int)2024188155L ^ 0x78A6A8FB;
            this.Method3280();
            this.Method3281();
            return ((int)-1873713705L ^ 0x905165D6) != 0;
        }
        if (!this.Field11341) return (int)((long)-234100098 ^ (long)-234100098) != 0;
        this.Field11345 = !bl && this.Method3286(this.Field11348, this.Field11349, this.Field11348 + this.Field11350, this.Field11349 + this.Field11351, n2 / ((int)((long)-912742927 ^ (long)-912742928) << 1), n3 / ((int)((long)1758648126 ^ (long)1758648127) << 1)) ? (int)393698223L ^ 0x17775BAE : (int)-1584516074L ^ 0xA18E3416;
        this.Field11346 = !bl && this.Method3286(this.Field11352, this.Field11353, this.Field11352 + this.Field11354, this.Field11353 + this.Field11355, n2 / (((int)-1128881615L ^ 0xBCB6A230) << 1), n3 / ((int)((long)1547313801 ^ (long)1547313800) << 1)) ? (int)1811349639L ^ 0x6BF70086 : (int)((long)2088022936 ^ (long)2088022936);
        this.Field11347 = !bl && this.Method3286(this.Field11356, this.Field11357, this.Field11356 + this.Field11358, this.Field11357 + this.Field11359, n2 / (((int)935674805L ^ 0x37C543B4) << 1), n3 / (((int)-623983905L ^ 0xDACEC2DE) << 1)) ? (int)((long)1965717034 ^ (long)1965717035) : (int)-399153770L ^ 0xE8356596;
        int n5 = this.Field11347 ? 1 : 0;
        if (this.Field11347 || this.Field11345 || this.Field11346) {
            this.Method3287(n2 / (((int)536722861L ^ 0x1FFDBDAC) << 1), n3 / ((int)((long)-145268159 ^ (long)-145268160) << 1));
        }
        if (!(this.Field11345 || this.Field11346 || this.Field11347)) {
            n4 = (int)-746815256L ^ 0xD37C80E8;
            return n4 != 0;
        }
        n4 = (int)-347530230L ^ 0xEB491C0B;
        return n4 != 0;
    }

    private void Method3287(int n, int n2) {
        float f;
        if (this.Field11346) {
            if (this.Field11354 > this.Field11355) {
                f = Math.min(Math.max(this.Field11352, n), this.Field11352 + this.Field11354);
                this.Field11344[(int)-325393797L ^ 0xEC9AE27B] = (f - (float)this.Field11352) / (float)this.Field11354;
            } else {
                f = Math.min(Math.max(this.Field11353, n2), this.Field11353 + this.Field11355);
                this.Field11344[(int)1479489363L ^ 0x582F3753] = (f - (float)this.Field11353) / (float)this.Field11355;
            }
        }
        if (this.Field11347) {
            if (this.Field11358 > this.Field11359) {
                f = Math.min(Math.max(this.Field11356, n), this.Field11356 + this.Field11358);
                this.Field11344[(int)((long)521879648 ^ (long)521879651)] = 1.0f - (f - (float)this.Field11356) / (float)this.Field11358;
            } else {
                f = Math.min(Math.max(this.Field11357, n2), this.Field11357 + this.Field11359);
                this.Field11344[(int)((long)899002359 ^ (long)899002356)] = 1.0f - (f - (float)this.Field11357) / (float)this.Field11359;
            }
        }
        if (!this.Field11345) return;
        f = Math.min(Math.max(this.Field11348, n), this.Field11348 + this.Field11350);
        float f2 = Math.min(Math.max(this.Field11349, n2), this.Field11349 + this.Field11351);
        this.Field11344[(int)-616988303L ^ 0xDB398170] = (f - (float)this.Field11348) / (float)this.Field11350;
        this.Field11344[((int)771882505L ^ 0x2E01FE08) << 1] = 1.0f - (f2 - (float)this.Field11349) / (float)this.Field11351;
    }

    @Override
    public boolean Method682(int n, int n2, int n3, boolean bl) {
        this.Method3284(n2, n3, bl);
        if (!this.Field11345 && !this.Field11346) {
            if (!this.Field11347) return ((int)-1811154406L ^ 0x940BFA1A) != 0;
        }
        if (n != 0) return ((int)-1811154406L ^ 0x940BFA1A) != 0;
        this.Method3287(n2 / ((int)((long)-433528591 ^ (long)-433528592) << 1), n3 / ((int)((long)1118045156 ^ (long)1118045157) << 1));
        this.Field11346 = this.Field11347 = (int)((long)1261079849 ^ (long)1261079849);
        this.Field11345 = this.Field11347;
        return (int)((long)1589842896 ^ (long)1589842897) != 0;
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3288() {
        return this.Field11342;
    }

    public boolean Method3289() {
        return this.Field11343;
    }

    public void Method3290(boolean bl) {
        this.Field11343 = bl;
    }

    public void Method3291(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        this.Field11342 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        float[] fArray = Color.RGBtoHSB(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17321, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17322, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17323, null);
        float[] fArray2 = new float[(int)((long)650562482 ^ (long)650562483) << 2];
        fArray2[(int)((long)1340856722 ^ (long)1340856722)] = fArray[(int)((long)-1720891637 ^ (long)-1720891637)];
        fArray2[(int)-492610764L ^ 0xE2A35B35] = fArray[(int)-1844270768L ^ 0x9212A951];
        fArray2[(int)((long)-791324782 ^ (long)-791324781) << 1] = fArray[(int)((long)-412076065 ^ (long)-412076066) << 1];
        fArray2[(int)928058865L ^ 0x37510DF2] = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17328;
        this.Field11344 = fArray2;
    }

    public void Method3292(NZlapI0lvoshixInpR8uRshg3YC4m0ZP nZlapI0lvoshixInpR8uRshg3YC4m0ZP) {
        this.Field11365 = nZlapI0lvoshixInpR8uRshg3YC4m0ZP;
    }

    public void Method3293(NZlapI0lvoshixInpR8uRshg3YC4m0ZP nZlapI0lvoshixInpR8uRshg3YC4m0ZP) {
        this.Field11366 = nZlapI0lvoshixInpR8uRshg3YC4m0ZP;
    }

    private void Method3294(int n, int n2, int n3, int n4, float f) {
        int n5 = (int)-418316479L ^ 0xE710FF41;
        if (n4 > n3) {
            Gui.drawRect((int)n, (int)n2, (int)(n + n3), (int)(n2 + ((int)((long)1890342874 ^ (long)1890342875) << 2)), (int)((int)-1186324797L ^ 0x46B51EC3));
            n2 += 4;
            int n6 = (int)1134174791L ^ 0x439A2247;
            while (true) {
                int cfr_ignored_0 = (int)((long)1346106875 ^ (long)1346106872) << 1;
                int n7 = Color.HSBtoRGB((float)n5 / Float.intBitsToFloat((int)((long)1472796429 ^ (long)386471693)), 1.0f, 1.0f);
                int n8 = Color.HSBtoRGB((float)(n5 + ((int)2117704474L ^ 0x7E399B1B)) / Float.intBitsToFloat((int)124064568L ^ 0x47A51338), 1.0f, 1.0f);
                hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawGradientRect(n, n2 + n5 * (n4 / ((int)((long)571458071 ^ (long)571458068) << 1)), n + n3, n2 + (n5 + ((int)926023140L ^ 0x3731FDE5)) * (n4 / ((int)((long)1574704733 ^ (long)1574704734) << 1)), n7, n8);
                ++n5;
                ++n6;
            }
        }
        int n9 = (int)-1830333191L ^ 0x92E754F9;
        while (true) {
            int cfr_ignored_1 = (int)((long)-394234273 ^ (long)-394234276) << 1;
            int n10 = Color.HSBtoRGB((float)n5 / Float.intBitsToFloat(0x57790AF2 ^ 0x17B90AF2), 1.0f, 1.0f);
            int n11 = Color.HSBtoRGB((float)(n5 + (int)((long)-2131343853 ^ (long)-2131343854)) / Float.intBitsToFloat(0xFDB63E5 ^ 0x4F1B63E5), 1.0f, 1.0f);
            this.Method3297(n + n5 * (n3 / (((int)-813567901L ^ 0xCF81F060) << 1)), n2, n + (n5 + (int)((long)1881760337 ^ (long)1881760336)) * (n3 / ((int)((long)408521837 ^ (long)408521838) << 1)), n2 + n4, n10, n11, ((int)343927722L ^ 0x147FEBAB) != 0);
            ++n5;
            ++n9;
        }
    }

    private void Method3295(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        int n5 = (int)((long)1088678970 ^ (long)1088678971);
        int n6 = n3 / (((int)-529197705L ^ 0xE0751576) << 1);
        int n7 = -n6;
        while (true) {
            if (n7 >= n4) {
                this.Method3297(n, n2, n + n3, n2 + n4, new Color(f, f2, f3, f4).getRGB(), (int)((long)-1106780275 ^ (long)-1106780275), ((int)396184339L ^ 0x179D4B13) != 0);
                n7 = (int)((float)(n2 + n4) - (float)n4 * f4);
                Gui.drawRect((int)n, (int)(n7 - (int)((long)435470486 ^ (long)435470487)), (int)(n + n3), (int)(n7 + (int)((long)-59445753 ^ (long)-59445754)), (int)((int)((long)-676880992 ^ (long)676880991)));
                return;
            }
            n5 = (int)((long)-768716988 ^ (long)-768716988);
            n7 += n6;
        }
    }

    private void Method3296(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        GL11.glEnable((int)(((int)1081387102L ^ 0x4074ADAF) << 1));
        GL11.glDisable((int)((int)((long)88469393 ^ (long)88466032)));
        GL11.glBlendFunc((int)(((int)-116180520L ^ 0xF9133859) << 1), (int)((int)((long)-1527249228 ^ (long)-1527249481)));
        GL11.glShadeModel((int)((int)547644679L ^ 0x20A47806));
        GL11.glBegin((int)((int)((long)448523210 ^ (long)448523203)));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glVertex2f((float)n, (float)n2);
        GL11.glVertex2f((float)n, (float)(n2 + n4));
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        GL11.glVertex2f((float)(n + n3), (float)(n2 + n4));
        GL11.glVertex2f((float)(n + n3), (float)n2);
        GL11.glEnd();
        GL11.glDisable((int)(((int)499045503L ^ 0x1DBED450) << 6));
        GL11.glBegin((int)((int)((long)1490839525 ^ (long)1490839532)));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)n, (float)n2);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glVertex2f((float)n, (float)(n2 + n4));
        GL11.glVertex2f((float)(n + n3), (float)(n2 + n4));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)(n + n3), (float)n2);
        GL11.glEnd();
        GL11.glEnable((int)((int)((long)1604237894 ^ (long)1604237929) << 6));
        GL11.glShadeModel((int)((int)((long)-1760301113 ^ (long)-1760301094) << 8));
        GL11.glEnable((int)((int)((long)-777733869 ^ (long)-777734926)));
        GL11.glDisable((int)(((int)1142173500L ^ 0x44142ACD) << 1));
    }

    protected void Method3297(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        if (bl) {
            float f = (float)(n5 >> (((int)-776321922L ^ 0xD1BA447D) << 3) & ((int)486807600L ^ 0x1D0418CF)) / Float.intBitsToFloat((int)1377278536L ^ 0x11689A48);
            float f2 = (float)(n5 >> ((int)((long)-539132544 ^ (long)-539132543) << 4) & ((int)540675880L ^ 0x203A0FD7)) / Float.intBitsToFloat((int)((long)662874565 ^ (long)1694345669));
            float f3 = (float)(n5 >> ((int)((long)267440429 ^ (long)267440428) << 3) & ((int)1937053267L ^ 0x737516AC)) / Float.intBitsToFloat((int)((long)711639110 ^ (long)1763033158));
            float f4 = (float)(n5 & ((int)-1557706488L ^ 0xA32749F7)) / Float.intBitsToFloat((int)1170771650L ^ 0x6B78EC2);
            float f5 = (float)(n6 >> ((int)((long)165099697 ^ (long)165099698) << 3) & (int)((long)-394057556 ^ (long)-394057645)) / Float.intBitsToFloat(0x7180C03F ^ 0x32FFC03F);
            float f6 = (float)(n6 >> ((int)((long)-493759090 ^ (long)-493759089) << 4) & ((int)1135359751L ^ 0x43AC37F8)) / Float.intBitsToFloat((int)1078200771L ^ 0x33B09C3);
            float f7 = (float)(n6 >> ((int)((long)-760364796 ^ (long)-760364795) << 3) & ((int)-217972219L ^ 0xF30202FA)) / Float.intBitsToFloat((int)((long)1639464179 ^ (long)583482611));
            float f8 = (float)(n6 & (int)((long)1877707024 ^ (long)1877707247)) / Float.intBitsToFloat((int)1001015959L ^ 0x78D54A97);
            GL11.glEnable((int)((int)((long)1780654939 ^ (long)0x6A22A6AA) << 1));
            GL11.glDisable((int)((int)((long)1060446404 ^ (long)1060449573)));
            GL11.glBlendFunc((int)((int)((long)311713388 ^ (long)311713773) << 1), (int)((int)-736003047L ^ 0xD4217F1A));
            GL11.glShadeModel((int)((int)((long)1202769317 ^ (long)1202770084)));
            GL11.glBegin((int)((int)-191900051L ^ 0xF48FD664));
            GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
            GL11.glVertex2f((float)n, (float)n2);
            GL11.glVertex2f((float)n, (float)n4);
            GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)f5);
            GL11.glVertex2f((float)n3, (float)n4);
            GL11.glVertex2f((float)n3, (float)n2);
            GL11.glEnd();
            GL11.glShadeModel((int)((int)((long)1221411264 ^ (long)1221411293) << 8));
            GL11.glEnable((int)((int)((long)-1168360589 ^ (long)-1168361838)));
            GL11.glDisable((int)((int)((long)1525135873 ^ (long)1525137392) << 1));
            return;
        }
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawGradientRect(n, n2, n3, n4, n5, n6);
    }

    static {
        Field11337 = (int)((long)32643228 ^ (long)32643231) << 3;
        Field11336 = (int)((long)-1385095624 ^ (long)-1385095659) << 2;
    }

    private static String Method3298(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)809593282L ^ 0x304169C2;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-236986944 ^ (long)-236987073);
            int n2 = (int)200033736L ^ 0xBEC451B;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1527001101 ^ (long)-1526999754) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

