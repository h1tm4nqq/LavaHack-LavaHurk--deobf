/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.math.BigDecimal;
import java.math.RoundingMode;
import lavahack.client.Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
import lavahack.client.QPlUy5UX00sJeOo267en2L4h1DlaeWfq;
import lavahack.client.gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.kqQwgrQ9wauUbvMCupVHbQYAPnZGzQ5k;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
import lavahack.client.zbns26JiHwo42IcUVKanfTHCxfIoRHEN;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;

public class a3hKVbTYrLSChMEUaf4SbcPdMXMblAWs
implements QPlUy5UX00sJeOo267en2L4h1DlaeWfq {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15481;
    private int Field15482;
    private int Field15483;
    private int Field15484;
    private int Field15485;
    private boolean Field15486;
    private int Field15487 = ((int)-1868628894L ^ 0x909EFC6D) << 3;
    private int Field15488;
    private String Field15489 = "";
    private boolean Field15490 = (int)956005953L ^ 0x38FB7E41;
    private boolean Field15491 = (int)((long)-3158091 ^ (long)-3158091);
    private String Field15492 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public a3hKVbTYrLSChMEUaf4SbcPdMXMblAWs(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, int n, int n2, int n3, int n4, int n5) {
        this.Field15481 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        this.Field15482 = n;
        this.Field15483 = n2;
        this.Field15484 = n3;
        this.Field15485 = n4;
        this.Field15488 = n5;
        this.Field15487 = zbns26JiHwo42IcUVKanfTHCxfIoRHEN.Method3992(n5, this.Field15487);
    }

    @Override
    public void Method623(int n, int n2) {
        QPlUy5UX00sJeOo267en2L4h1DlaeWfq.super.Method623(n, n2);
        double d = this.Field15481.Method371();
        double d2 = this.Field15481.Method372();
        if (this.Field15491) {
            this.Field15486 = (int)((long)1608523091 ^ (long)1608523091);
        } else {
            this.Field15489 = "";
        }
        if (this.Field15486) {
            double d3 = Math.min(this.Field15487, Math.max((int)-1158088118L ^ 0xBAF8FA4A, n - this.Field15482));
            if (d3 == 0.0) {
                this.Field15481.Method370(this.Field15481.Method371());
            } else {
                this.Field15481.Method370(a3hKVbTYrLSChMEUaf4SbcPdMXMblAWs.Method6258(d3 / (double)this.Field15487 * (d2 - d) + d, (int)((long)941169836 ^ (long)941169837) << 1));
            }
        }
        String string = this.Field15491 ? this.Field15489 + "_" : this.Field15481.Method354() + ": " + (String)this.Field15481.Method320().Method2190().apply(this.Field15481.Method367());
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(this.Field15482, this.Field15483 + this.Field15484, this.Field15487, zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604, zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14584.Method3626());
        int n3 = (int)((double)this.Field15487 * (this.Field15481.Method367() - d) / (d2 - d));
        if (zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14590) {
            double[] dArray = new double[((int)-938468173L ^ 0xC8101CB2) << 1];
            dArray[(int)((long)1182116385 ^ (long)1182116385)] = (double)this.Field15482 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601;
            dArray[(int)((long)748314964 ^ (long)748314965)] = (double)(this.Field15483 + this.Field15484) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray2 = new double[(int)((long)-1921011315 ^ (long)-1921011316) << 1];
            dArray2[(int)((long)1276435132 ^ (long)1276435132)] = (double)(this.Field15482 + n3) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601;
            dArray2[(int)((long)-995850515 ^ (long)-995850516)] = (double)(this.Field15483 + this.Field15484) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray3 = new double[(int)((long)1408737742 ^ (long)1408737743) << 1];
            dArray3[(int)((long)2022774063 ^ (long)2022774063)] = (double)(this.Field15482 + n3) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601;
            dArray3[(int)((long)1153482116 ^ (long)1153482117)] = (double)(this.Field15483 + this.Field15484 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray4 = new double[((int)-267231697L ^ 0xF0125E2E) << 1];
            dArray4[(int)((long)-1759935767 ^ (long)-1759935767)] = (double)this.Field15482 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601;
            dArray4[(int)1607817349L ^ 0x5FD55884] = (double)(this.Field15483 + this.Field15484 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract(new gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3(new Jl14CJNmtWTqlp58umYadtnd800b2Vd0(dArray, dArray2, dArray3, dArray4), zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1228(this.Field15485).Method3625(), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4729(zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14584.Method3626(), null.Field16098.Method335())));
        } else {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH((double)this.Field15482 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601, (double)(this.Field15483 + this.Field15484) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602, (double)n3 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601 * Double.longBitsToDouble((long)1726677962 ^ 0x4000000066EB03CAL), (double)zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602 * Double.longBitsToDouble((long)592999030 ^ 0x4000000023587276L), zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1228(this.Field15485).Method3626());
        }
        zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1224(string, this.Field15482, this.Field15483 + this.Field15484, this.Field15487, zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (this.Method6257(n, n2) && n3 == 0) {
            this.Field15486 = (int)((long)35685018 ^ (long)35685019);
        }
        if (!this.Method6257(n, n2)) return;
        if (n3 != (int)((long)-324629834 ^ (long)-324629833)) return;
        this.Field15491 = (int)((long)-1887403391 ^ (long)-1887403392);
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        this.Field15486 = (int)321541716L ^ 0x132A5654;
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field15482 = n;
        this.Field15483 = n2;
    }

    @Override
    public void Method628(char c, int n) {
        if (!this.Field15491) return;
        if (n == ((int)-1669556178L ^ 0x9C7C9829) << 2) {
            this.Field15491 = (int)1946583271L ^ 0x740680E7;
            if (this.Field15489.isEmpty()) return;
            this.Field15481.Method370(kqQwgrQ9wauUbvMCupVHbQYAPnZGzQ5k.Method7392(this.Field15489, this.Field15481.Method367()));
            return;
        }
        if (n == ((int)-49902204L ^ 0xFD068D83) << 1 && !this.Field15489.isEmpty() && kqQwgrQ9wauUbvMCupVHbQYAPnZGzQ5k.Method7392(this.Field15489, this.Field15481.Method367()) != this.Field15481.Method367()) {
            this.Field15489 = this.Field15489.substring((int)((long)-1327085295 ^ (long)-1327085295), this.Field15489.length() - ((int)-1169085942L ^ 0xBA512A0B));
            return;
        }
        this.Field15489 = this.Field15489 + c;
    }

    @Override
    public void Method629(int n) {
        this.Field15484 = n;
    }

    @Override
    public int Method631() {
        return zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604;
    }

    @Override
    public boolean Method641() {
        int n;
        if (this.Field15481.Method311() && zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1233(this.Field15481.Method354())) {
            n = (int)((long)282743567 ^ (long)282743566);
            return n != 0;
        }
        n = (int)-914133199L ^ 0xC9836F31;
        return n != 0;
    }

    @Override
    public void Method630(int n) {
        this.Field15485 = n;
    }

    @Override
    public int Method633() {
        return this.Field15485;
    }

    @Override
    public void Method634(int n) {
        this.Field15487 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field15482 = n;
    }

    @Override
    public int Method636() {
        return this.Field15482;
    }

    @Override
    public void Method639(int n) {
        this.Field15488 = n;
    }

    @Override
    public int Method640() {
        return this.Field15488;
    }

    private boolean Method6257(int n, int n2) {
        int n3;
        if (n > this.Field15482 && n < this.Field15482 + this.Field15487 && n2 > this.Field15483 + this.Field15484 && n2 < this.Field15483 + this.Field15484 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) {
            n3 = (int)((long)364278394 ^ (long)364278395);
            return n3 != 0;
        }
        n3 = (int)1599199117L ^ 0x5F51D78D;
        return n3 != 0;
    }

    private static double Method6258(double d, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bigDecimal = new BigDecimal(d);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    @Override
    public void Method637(int n) {
        this.Field15483 = n;
    }

    @Override
    public int Method638() {
        return this.Field15483 + this.Field15484;
    }

    private static String Method6259(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)781112173L ^ 0x2E8ED36D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)897482914 ^ (long)897482845);
            int n2 = (int)((long)2124785525 ^ (long)2124785526) << 5;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1565998834L ^ 0xA2A8B637 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

