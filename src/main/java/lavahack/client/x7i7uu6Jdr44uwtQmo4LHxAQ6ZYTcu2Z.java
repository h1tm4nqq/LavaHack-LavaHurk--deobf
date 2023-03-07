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
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import lavahack.client.IYCKQnhU35TdWubH35prOxmJUUlc1eFy;
import lavahack.client.Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
import lavahack.client.QPlUy5UX00sJeOo267en2L4h1DlaeWfq;
import lavahack.client.gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
import lavahack.client.zbns26JiHwo42IcUVKanfTHCxfIoRHEN;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.gui.Gui;
import org.lwjgl.opengl.GL11;

public class x7i7uu6Jdr44uwtQmo4LHxAQ6ZYTcu2Z
implements QPlUy5UX00sJeOo267en2L4h1DlaeWfq {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9259;
    private vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field9260;
    private int Field9261;
    private int Field9262;
    private int Field9263;
    private int Field9264;
    private int Field9265;
    private int Field9266;
    public boolean Field9267 = (int)((long)346849232 ^ (long)346849232);
    private boolean Field9268;
    private boolean Field9269;
    private boolean Field9270;
    private boolean Field9271;
    private boolean Field9272;
    private boolean Field9273;
    private int Field9274 = (int)((long)-1008313046 ^ (long)-1008313051) << 3;
    private int Field9275;
    private vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field9276;
    private boolean Field9277 = (int)980596314L ^ 0x3A72B65B;
    private boolean Field9278 = (int)-164779911L ^ 0xF62DA878;
    private String Field9279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public x7i7uu6Jdr44uwtQmo4LHxAQ6ZYTcu2Z(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, int n, int n2, int n3, int n4, int n5) {
        this.Field9259 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        this.Field9261 = n;
        this.Field9262 = n2;
        this.Field9263 = n3;
        this.Field9260 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method339();
        this.Field9264 = this.Field9274 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604;
        this.Field9266 = n4;
        this.Field9275 = n5;
        this.Field9274 = zbns26JiHwo42IcUVKanfTHCxfIoRHEN.Method3992(n5, this.Field9274);
        this.Method1534(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method339());
    }

    private void Method1534(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3614(Color.RGBtoHSB(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17321, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17322, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17323, null)[(int)((long)-213824273 ^ (long)-213824273)]);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3615(1.0f);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3611(1.0f);
        this.Field9276 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
    }

    private void Method1535() {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(this.Method1536()), null);
    }

    private String Method1536() {
        return Integer.toHexString(this.Field9260.Field17321 << ((int)((long)-1661770928 ^ (long)-1661770925) << 3) | this.Field9260.Field17322 << ((int)((long)-916151718 ^ (long)-916151717) << 4) | this.Field9260.Field17323 << (((int)-124822746L ^ 0xF88F5B27) << 3) | this.Field9260.Field17324);
    }

    private vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method1537(String string) {
        int n = x7i7uu6Jdr44uwtQmo4LHxAQ6ZYTcu2Z.Method1538(string, ((int)-1735012584L ^ 0x9895CF19) << 4);
        return new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((n & ((int)-1333934640L ^ 0xB07DC52F)) << (((int)1444629847L ^ 0x561B4D54) << 3) | n >> ((int)((long)-1829997216 ^ (long)-1829997215) << 3));
    }

    private static int Method1538(String string, int n) throws NumberFormatException {
        int n2 = (int)-669391523L ^ 0xD819E55D;
        int n3 = (int)((long)2036188691 ^ (long)2036188691);
        if (string.equals("")) {
            throw new NumberFormatException();
        }
        int n4 = (int)((long)323019902 ^ (long)323019902);
        char c = string.charAt((int)((long)267115701 ^ (long)267115701));
        if (c == ((int)359357770L ^ 0x156B5D67)) {
            n4 = (int)((long)-124284122 ^ (long)-124284121);
            ++n3;
        } else if (c == (int)((long)-948075044 ^ (long)-948075017)) {
            ++n3;
        }
        while (n3 < string.length()) {
            int n5 = x7i7uu6Jdr44uwtQmo4LHxAQ6ZYTcu2Z.Method1539(string.charAt(n3++), n);
            n2 *= n;
            n2 += n5;
        }
        return n2;
    }

    private static int Method1539(char n, int n2) throws NumberFormatException {
        int n3 = n < (int)((long)-1357509989 ^ (long)-1357509926) || n > ((int)462642702L ^ 0x1B935E23) << 1 ? n : n - (((int)-1475912950L ^ 0xA8075B0B) << 5);
        int n4 = n3 < ((int)-789664268L ^ 0xD0EEADE9) << 1 ? n3 - ((int)((long)-761500484 ^ (long)-761500481) << 4) : n3 - (int)((long)-397376912 ^ (long)-397376985);
        if (n4 < 0) throw new NumberFormatException();
        if (n4 < n2) return n4;
        throw new NumberFormatException();
    }

    @Override
    public void Method623(int n, int n2) {
        if (!this.Field9259.Method339().equals(this.Field9260)) {
            this.Field9260 = this.Field9259.Method339();
            this.Method1534(this.Field9260);
        }
        this.Field9264 = this.Field9274;
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(this.Field9261, this.Field9262 + this.Field9263, this.Field9274, this.Method631(), zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14584.Method3626());
        if (zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14590) {
            double[] dArray = new double[(int)((long)290918954 ^ (long)290918955) << 1];
            dArray[(int)((long)1768929402 ^ (long)1768929402)] = (double)this.Field9261 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601;
            dArray[(int)((long)-1062202442 ^ (long)-1062202441)] = (double)(this.Field9262 + this.Field9263) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray2 = new double[(int)((long)1783857137 ^ (long)1783857136) << 1];
            dArray2[(int)-1688526578L ^ 0x9B5B210E] = (float)this.Field9261 + (float)this.Field9274 / 2.0f;
            dArray2[(int)514057761L ^ 0x1EA3E620] = (double)(this.Field9262 + this.Field9263) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray3 = new double[((int)648983825L ^ 0x26AEB510) << 1];
            dArray3[(int)((long)982483081 ^ (long)982483081)] = (float)this.Field9261 + (float)this.Field9274 / 2.0f;
            dArray3[(int)((long)-765627181 ^ (long)-765627182)] = (double)(this.Field9262 + this.Field9263 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray4 = new double[((int)1204742273L ^ 0x47CEE880) << 1];
            dArray4[(int)((long)-1165027717 ^ (long)-1165027717)] = (double)this.Field9261 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601;
            dArray4[(int)((long)1024904610 ^ (long)1024904611)] = (double)(this.Field9262 + this.Field9263 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract(new gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3(new Jl14CJNmtWTqlp58umYadtnd800b2Vd0(dArray, dArray2, dArray3, dArray4), this.Field9260.Method3625(), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4729(zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14584.Method3626(), null.Field16098.Method335())));
            double[] dArray5 = new double[((int)-275207879L ^ 0xEF98A938) << 1];
            dArray5[(int)-430599217L ^ 0xE65593CF] = (float)this.Field9261 + (float)this.Field9274 / 2.0f;
            dArray5[(int)-1432506926L ^ 0xAA9DADD3] = (double)(this.Field9262 + this.Field9263) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray6 = new double[((int)-477072334L ^ 0xE3907433) << 1];
            dArray6[(int)((long)1476431504 ^ (long)1476431504)] = (double)(this.Field9261 + this.Field9274) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601;
            dArray6[(int)((long)-1616504903 ^ (long)-1616504904)] = (double)(this.Field9262 + this.Field9263) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray7 = new double[(int)((long)1061214799 ^ (long)1061214798) << 1];
            dArray7[(int)-1440986924L ^ 0xAA1C48D4] = (double)(this.Field9261 + this.Field9274) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601;
            dArray7[(int)539828529L ^ 0x202D2130] = (double)(this.Field9262 + this.Field9263 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray8 = new double[(int)((long)246630474 ^ (long)246630475) << 1];
            dArray8[(int)-1686301989L ^ 0x9B7D12DB] = (float)this.Field9261 + (float)this.Field9274 / 2.0f;
            dArray8[(int)-350662097L ^ 0xEB19522E] = (double)(this.Field9262 + this.Field9263 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract(new gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3(new Jl14CJNmtWTqlp58umYadtnd800b2Vd0(dArray5, dArray6, dArray7, dArray8), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4729(zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14584.Method3626(), null.Field16098.Method335()), this.Field9260.Method3625()));
        } else {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH((double)this.Field9261 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601, (double)(this.Field9262 + this.Field9263) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602, (double)this.Field9274 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601 * Double.longBitsToDouble(0xCE25541D0847BB10L ^ 0x8E25541D0847BB10L), (double)this.Method631() - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602 * Double.longBitsToDouble(0x5F71F5FF90FCC7CCL ^ 0x1F71F5FF90FCC7CCL), this.Field9260.Method3626());
        }
        zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1224(this.Field9259.Method354(), this.Field9261, this.Field9262 + this.Field9263, this.Field9274, zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604);
        if (this.Field9267) {
            int n3 = zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604;
            if (null.Field16109.Method365()) {
                this.Method1544((double)this.Field9261 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601, (double)(this.Field9262 + this.Field9263 + n3) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602, (double)this.Field9264 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601 * Double.longBitsToDouble((long)1900597937 ^ 0x400000007148D2B1L), (double)this.Field9264 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602 * Double.longBitsToDouble((long)1852602300 ^ 0x400000006E6C77BCL), this.Field9276.Field17325, this.Field9276.Field17326, this.Field9276.Field17327, this.Field9276.Field17328, n, n2);
            } else {
                this.Method1544((double)this.Field9261 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601, (double)(this.Field9262 + this.Field9263 + n3) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602, (double)this.Field9264 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601 * Double.longBitsToDouble(0x776208389051B15AL ^ 0x376208389051B15AL), (double)this.Field9264 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602 * Double.longBitsToDouble(0xB31E7BA3297E5AA8L ^ 0xF31E7BA3297E5AA8L), this.Field9260.Field17325, this.Field9260.Field17326, this.Field9260.Field17327, this.Field9260.Field17328, n, n2);
            }
            this.Method1542((double)this.Field9261 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601, (double)(this.Field9262 + this.Field9263 + (n3 += this.Field9264)) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602, (double)this.Field9264 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601 * Double.longBitsToDouble((long)228266487 ^ 0x400000000D9B11F7L), (double)(zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 - ((int)-723012261L ^ 0xD4E7B558)) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602 * Double.longBitsToDouble((long)1576826579 ^ 0x400000005DFC76D3L), this.Field9260.Method3620(), n, n2);
            this.Method1543((double)this.Field9261 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601, (double)(this.Field9262 + this.Field9263 + (n3 += zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 - (int)((long)2108795437 ^ (long)2108795438))) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602, (double)this.Field9264 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601 * Double.longBitsToDouble((long)444959938 ^ 0x400000001A858CC2L), (double)(zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 - ((int)-664714321L ^ 0xD86143AC)) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602 * Double.longBitsToDouble((long)441900120 ^ 0x400000001A56DC58L), this.Field9260.Field17325, this.Field9260.Field17326, this.Field9260.Field17327, this.Field9260.Field17328, n, n2);
            this.Field9265 = n3 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 - ((int)2062230065L ^ 0x7AEB2232);
            this.Method1540(n, n2, (double)this.Field9261 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601, (double)(this.Field9262 + this.Field9263 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602);
            int n4 = (int)((float)this.Field9261 + this.Field9260.Method3623()[(int)((long)-1046095755 ^ (long)-1046095756)] * (float)this.Field9264);
            int n5 = (int)((float)(this.Field9262 + this.Field9263 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 + ((int)-1468253150L ^ 0xA87C3C27) + this.Field9264) - this.Field9260.Method3623()[(int)((long)-1161632346 ^ (long)-1161632345) << 1] * (float)this.Field9264);
            if (null.Field16108.Method365() && IYCKQnhU35TdWubH35prOxmJUUlc1eFy.Method6270((int)((long)1513666809 ^ (long)1513666809)) && this.Field9271) {
                Gui.drawRect((int)(n4 - (((int)-1323036347L ^ 0xB1241144) << 3)), (int)(n5 - ((int)((long)-1976471265 ^ (long)-1976471266) << 3)), (int)(n4 + (((int)1267421072L ^ 0x4B8B4F91) << 3)), (int)(n5 + ((int)((long)718839215 ^ (long)718839214) << 3)), (int)new Color((int)((long)1563891511 ^ (long)1563891511), (int)((long)-1783968176 ^ (long)-1783968176), (int)((long)121802581 ^ (long)121802581), (int)-83030628L ^ 0xFB0D0D63).getRGB());
                Gui.drawRect((int)(n4 - ((int)472470584L ^ 0x1C29543F)), (int)(n5 - (int)((long)1751990241 ^ (long)1751990246)), (int)(n4 + ((int)1547874885L ^ 0x5C42B242)), (int)(n5 + ((int)-1927442664L ^ 0x8D1D8F1F)), (int)this.Field9260.Method3626());
                yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt.Field11997.Method3868(n4, n5 - ((int)((long)920846635 ^ (long)920846626) << 1), Double.longBitsToDouble(0xD703B761B0F622CAL ^ 0x9733B761B0F622CAL), Double.longBitsToDouble(0x47A0A9BE95D9F268L ^ 0x790A9BE95D9F268L));
            } else {
                Gui.drawRect((int)(n4 - ((int)((long)1964036592 ^ (long)1964036593) << 1)), (int)(n5 - ((int)((long)415244510 ^ (long)415244511) << 1)), (int)(n4 + ((int)((long)1678401727 ^ (long)1678401726) << 1)), (int)(n5 + ((int)((long)-785576669 ^ (long)-785576670) << 1)), (int)((int)2087908379L ^ 0x838D0BE4));
            }
        }
        this.Field9259.Method340(this.Field9260);
    }

    private void Method1540(int n, int n2, double d, double d2) {
        float f;
        if (this.Field9271) {
            f = (float)Math.min(Math.max(d, (double)n), d + (double)this.Field9264);
            float f2 = (float)Math.min(Math.max(d2, (double)n2), d2 + (double)this.Field9264);
            this.Field9260.Method3615((f - (float)d) / (float)this.Field9264);
            this.Field9260.Method3611(1.0f - (f2 - (float)d2) / (float)this.Field9264);
        }
        if (this.Field9272) {
            f = (float)Math.min(Math.max(d, (double)n), d + (double)this.Field9264);
            this.Field9260.Method3614((f - (float)d) / (float)this.Field9264);
            this.Field9276.Method3614((f - (float)d) / (float)this.Field9264);
        }
        if (!this.Field9273) return;
        f = (float)Math.min(Math.max(d, (double)n), d + (double)this.Field9264);
        this.Field9260.Method3612(1.0f - (f - (float)d) / (float)this.Field9264);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (n3 == 0) {
            if (this.Method1541(n, n2)) {
                this.Field9267 = !this.Field9267 ? (int)1886629363L ^ 0x7073ADF2 : (int)((long)1807034429 ^ (long)1807034429);
            }
            this.Field9271 = this.Field9268;
            this.Field9272 = this.Field9269;
            this.Field9273 = this.Field9270;
        }
        if (!null.Field16110.Method365()) {
            return;
        }
        if (n3 == (int)((long)-893665412 ^ (long)-893665411) && this.Field9268 && this.Field9277) {
            this.Method1535();
            this.Field9277 = (int)((long)2044324902 ^ (long)2044324902);
        }
        if (n3 == ((int)1127968618L ^ 0x433B6F6B) && !this.Field9268) {
            this.Field9277 = (int)((long)885159869 ^ (long)885159868);
        }
        if (n3 == (int)((long)1690027134 ^ (long)1690027135) << 1 && this.Field9268 && this.Field9278) {
            Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (!transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return;
            }
            String string = (String)transferable.getTransferData(DataFlavor.stringFlavor);
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = this.Method1537(string);
            if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 == null) {
                return;
            }
            this.Field9260 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
            this.Method1534(this.Field9260);
            this.Field9278 = (int)24947904L ^ 0x17CACC0;
        }
        if (n3 != ((int)1317435781L ^ 0x4E867984) << 1) return;
        if (this.Field9268) return;
        this.Field9278 = (int)((long)-1561964430 ^ (long)-1561964429);
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        this.Field9273 = this.Field9272 = (int)-1913319917L ^ 0x8DF50E13;
        this.Field9271 = this.Field9272;
        if (n3 == (int)((long)217513286 ^ (long)217513287)) {
            this.Field9277 = (int)-2041257895L ^ 0x8654E058;
        }
        if (n3 != ((int)360183906L ^ 0x1577F863) << 1) return;
        this.Field9278 = (int)453226246L ^ 0x1B03AF07;
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field9261 = n;
        this.Field9262 = n2;
    }

    @Override
    public void Method629(int n) {
        this.Field9263 = n;
    }

    @Override
    public int Method632() {
        int n;
        if (this.Field9267) {
            n = this.Field9265;
            return zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 + n;
        }
        n = (int)((long)1129249723 ^ (long)1129249723);
        return zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 + n;
    }

    @Override
    public boolean Method641() {
        int n;
        if (this.Field9259.Method311() && zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1233(this.Field9259.Method354())) {
            n = (int)322852084L ^ 0x133E54F5;
            return n != 0;
        }
        n = (int)1778804032L ^ 0x6A066540;
        return n != 0;
    }

    @Override
    public void Method630(int n) {
        this.Field9266 = n;
    }

    @Override
    public int Method633() {
        return this.Field9266;
    }

    @Override
    public void Method634(int n) {
        this.Field9274 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field9261 = n;
    }

    @Override
    public int Method636() {
        return this.Field9261;
    }

    @Override
    public void Method639(int n) {
        this.Field9275 = n;
    }

    @Override
    public int Method640() {
        return this.Field9275;
    }

    private boolean Method1541(int n, int n2) {
        int n3;
        if (n > this.Field9261 && n < this.Field9261 + this.Field9274 && n2 > this.Field9262 + this.Field9263 && n2 < this.Field9262 + this.Field9263 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) {
            n3 = (int)((long)356327654 ^ (long)356327655);
            return n3 != 0;
        }
        n3 = (int)((long)993091181 ^ (long)993091181);
        return n3 != 0;
    }

    private void Method1542(double d, double d2, double d3, double d4, float f, int n, int n2) {
        this.Field9269 = (double)n > d && (double)n < d + d3 && (double)n2 > d2 && (double)n2 < d2 + d4 ? (int)((long)2115438833 ^ (long)2115438832) : (int)634509388L ^ 0x25D1D84C;
        int n3 = (int)((long)-297374372 ^ (long)-297374372);
        if (d4 > d3) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2, d + d3, d2 + Double.longBitsToDouble(0xFD17913FD261ECA3L ^ 0xBD07913FD261ECA3L), (int)-2013678070L ^ 0x780649F5);
            d2 += Double.longBitsToDouble((long)590606243 ^ 0x401000002333EFA3L);
            int n4 = (int)((long)1553672198 ^ (long)1553672198);
            while (true) {
                int cfr_ignored_0 = ((int)346852728L ^ 0x14AC8D7B) << 1;
                int n5 = Color.HSBtoRGB((float)n3 / Float.intBitsToFloat((int)1956510248L ^ 0x345DFA28), 1.0f, 1.0f);
                int n6 = Color.HSBtoRGB((float)(n3 + (int)((long)-309197447 ^ (long)-309197448)) / Float.intBitsToFloat((int)((long)588096313 ^ (long)1674421049)), 1.0f, 1.0f);
                hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawGradientRect(d, d2 + (double)n3 * (d4 / Double.longBitsToDouble(0x6803728B644F00E2L ^ 0x281B728B644F00E2L)), d + d3, d2 + (double)(n3 + (int)((long)-1314150378 ^ (long)-1314150377)) * (d4 / Double.longBitsToDouble((long)492675575 ^ 0x401800001D5DA1F7L)), n5, n6);
                ++n3;
                ++n4;
            }
        }
        int n7 = (int)875630122L ^ 0x34310E2A;
        while (true) {
            int cfr_ignored_1 = (int)((long)-1098149213 ^ (long)-1098149216) << 1;
            int n8 = Color.HSBtoRGB((float)n3 / Float.intBitsToFloat((int)((long)1821060836 ^ (long)743124708)), 1.0f, 1.0f);
            int n9 = Color.HSBtoRGB((float)(n3 + (int)((long)131764926 ^ (long)131764927)) / Float.intBitsToFloat((int)((long)1633802288 ^ (long)564254768)), 1.0f, 1.0f);
            this.Method1545(d + (double)n3 * (d3 / Double.longBitsToDouble(0xC29910C2B2E0CC22L ^ 0x828110C2B2E0CC22L)), d2, d + (double)(n3 + (int)((long)-892302686 ^ (long)-892302685)) * (d3 / Double.longBitsToDouble(0x90FEF9FE5FA5DAC9L ^ 0xD0E6F9FE5FA5DAC9L)), d2 + d4, n8, n9, ((int)859313321L ^ 0x333814A8) != 0);
            ++n3;
            ++n7;
        }
    }

    public void Method1543(double d, double d2, double d3, double d4, float f, float f2, float f3, float f4, int n, int n2) {
        this.Field9270 = (double)n > d && (double)n < d + d3 && (double)n2 > d2 && (double)n2 < d2 + d4 ? (int)-976375974L ^ 0xC5CDAF5B : (int)1696511021L ^ 0x651EB42D;
        int n3 = (int)270781304L ^ 0x1023CB79;
        double d5 = d4 / Double.longBitsToDouble(0xFAB9BBA47AEB038FL ^ 0xBAB9BBA47AEB038FL);
        double d6 = -d5;
        while (true) {
            if (!(d6 < d3)) {
                hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawLeftGradientRect(d, d2, d + d3, d2 + d4, new Color(f, f2, f3, 1.0f).getRGB(), (int)((long)1161886012 ^ (long)1161886012));
                int n4 = (int)(d + d3 - d3 * (double)f4);
                hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(n4 - (int)((long)-1059463003 ^ (long)-1059463004), d2, n4 + (int)((long)-916626157 ^ (long)-916626158), d2 + d4, (int)((long)-2068769710 ^ (long)2068769709));
                return;
            }
            n3 = (int)((long)-126091066 ^ (long)-126091066);
            d6 += d5;
        }
    }

    private void Method1544(double d, double d2, double d3, double d4, float f, float f2, float f3, float f4, int n, int n2) {
        this.Field9268 = (double)n > d && (double)n < d + d3 && (double)n2 > d2 && (double)n2 < d2 + d4 ? (int)196347998L ^ 0xBB4085F : (int)((long)-1343599989 ^ (long)-1343599989);
        GL11.glEnable((int)((int)((long)-515467053 ^ (long)-515465950) << 1));
        GL11.glDisable((int)((int)1539233192L ^ 0x5BBED849));
        GL11.glBlendFunc((int)((int)((long)-221031561 ^ (long)-221031690) << 1), (int)((int)((long)918465472 ^ (long)918464707)));
        GL11.glShadeModel((int)((int)((long)1112276201 ^ (long)1112269288)));
        GL11.glBegin((int)((int)((long)2056344665 ^ (long)2056344656)));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)(d2 + d4));
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        GL11.glVertex2d((double)(d + d3), (double)(d2 + d4));
        GL11.glVertex2d((double)(d + d3), (double)d2);
        GL11.glEnd();
        GL11.glDisable((int)(((int)-1093304865L ^ 0xBED57DF0) << 6));
        GL11.glBegin((int)((int)((long)589400060 ^ (long)589400053)));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glVertex2d((double)d, (double)(d2 + d4));
        GL11.glVertex2d((double)(d + d3), (double)(d2 + d4));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2d((double)(d + d3), (double)d2);
        GL11.glEnd();
        GL11.glEnable((int)((int)((long)2008518938 ^ (long)2008518965) << 6));
        GL11.glShadeModel((int)(((int)-1868324009L ^ 0x90A3A34A) << 8));
        GL11.glEnable((int)((int)578312740L ^ 0x227857C5));
        GL11.glDisable((int)((int)((long)1013278135 ^ (long)1013276742) << 1));
    }

    protected void Method1545(double d, double d2, double d3, double d4, int n, int n2, boolean bl) {
        if (bl) {
            float f = (float)(n >> ((int)((long)-346288516 ^ (long)-346288513) << 3) & (int)((long)1948826880 ^ (long)1948827135)) / Float.intBitsToFloat((int)((long)746274231 ^ (long)1862548919));
            float f2 = (float)(n >> (((int)-335732228L ^ 0xEBFD21FD) << 4) & (int)((long)-1867405035 ^ (long)-1867404822)) / Float.intBitsToFloat((int)((long)1015681066 ^ (long)2146766890));
            float f3 = (float)(n >> (((int)1466953711L ^ 0x576FEFEE) << 3) & ((int)481260446L ^ 0x1CAF7361)) / Float.intBitsToFloat(0x56E01609 ^ 0x159F1609);
            float f4 = (float)(n & (int)((long)312071207 ^ (long)312071384)) / Float.intBitsToFloat((int)((long)516550827 ^ (long)1572270251));
            float f5 = (float)(n2 >> ((int)((long)-1676394318 ^ (long)-1676394319) << 3) & ((int)451786704L ^ 0x1AEDB72F)) / Float.intBitsToFloat((int)((long)1069591368 ^ (long)2092936008));
            float f6 = (float)(n2 >> (((int)-1308293264L ^ 0xB2050771) << 4) & (int)((long)-910815703 ^ (long)-910815530)) / Float.intBitsToFloat(0x1D1B19D0 ^ 0x5E6419D0);
            float f7 = (float)(n2 >> ((int)((long)-712289920 ^ (long)-712289919) << 3) & (int)((long)-1667586902 ^ (long)-1667586987)) / Float.intBitsToFloat((int)((long)356166896 ^ (long)1447406832));
            float f8 = (float)(n2 & (int)((long)1862084070 ^ (long)1862083865)) / Float.intBitsToFloat(0x7932D7DA ^ 0x3A4DD7DA);
            GL11.glPushMatrix();
            GL11.glEnable((int)(((int)763261873L ^ 0x2D7E7640) << 1));
            GL11.glDisable((int)((int)370003807L ^ 0x160DC2BE));
            GL11.glBlendFunc((int)(((int)-749752454L ^ 0xD34FAEFB) << 1), (int)((int)((long)1387262309 ^ (long)1387262566)));
            GL11.glShadeModel((int)((int)((long)-939635825 ^ (long)-939633010)));
            GL11.glBegin((int)((int)1445406019L ^ 0x5627254A));
            GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
            GL11.glVertex2d((double)d, (double)d2);
            GL11.glVertex2d((double)d, (double)d4);
            GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)f5);
            GL11.glVertex2d((double)d3, (double)d4);
            GL11.glVertex2d((double)d3, (double)d2);
            GL11.glEnd();
            GL11.glShadeModel((int)(((int)1871818433L ^ 0x6F91AEDC) << 8));
            GL11.glEnable((int)((int)-1713816992L ^ 0x99D93781));
            GL11.glDisable((int)(((int)575506737L ^ 0x224D8CC0) << 1));
            GL11.glPopMatrix();
            return;
        }
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawGradientRect(d, d2, d3, d4, n, n2);
    }

    @Override
    public void Method637(int n) {
        this.Field9262 = n;
    }

    @Override
    public int Method638() {
        return this.Field9262 + this.Field9263;
    }

    private static String Method1546(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-83158026 ^ (long)-83158026);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1523931127 ^ (long)1523930888);
            int n2 = (int)1993865897L ^ 0x76D7FAAE;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2022522139 ^ (long)-2022509834) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

