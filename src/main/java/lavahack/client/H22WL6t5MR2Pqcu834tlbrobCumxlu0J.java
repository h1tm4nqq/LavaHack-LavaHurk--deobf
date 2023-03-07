/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.F4BV5Sd8qfVWq0oSYdD7gTzMRK5CFCg4;
import lavahack.client.Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
import lavahack.client.QPlUy5UX00sJeOo267en2L4h1DlaeWfq;
import lavahack.client.U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
import lavahack.client.V5Gz0heJnfrKt30zLpDjRw0tUX5tp9vG;
import lavahack.client.g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh;
import lavahack.client.gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
import lavahack.client.zbns26JiHwo42IcUVKanfTHCxfIoRHEN;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import org.jetbrains.annotations.NotNull;

public class H22WL6t5MR2Pqcu834tlbrobCumxlu0J
implements F4BV5Sd8qfVWq0oSYdD7gTzMRK5CFCg4 {
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10088;
    public xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk Field10089;
    private int Field10090;
    private int Field10091;
    private int Field10092;
    private int Field10093;
    public boolean Field10094;
    private int Field10095 = (int)((long)-212599511 ^ (long)-212599511);
    private int Field10096 = ((int)-1640773905L ^ 0x9E33C6E0) << 3;
    private int Field10097;
    private final ArrayList Field10098 = new ArrayList();
    private int Field10099;

    public H22WL6t5MR2Pqcu834tlbrobCumxlu0J(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, int n, int n2, int n3, int n4, int n5) {
        this.Field10088 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        this.Field10090 = n;
        this.Field10091 = n2;
        this.Field10092 = n3;
        this.Field10093 = n4;
        this.Field10097 = n5;
        this.Field10096 = zbns26JiHwo42IcUVKanfTHCxfIoRHEN.Method3992(n5, this.Field10096);
        int n6 = (int)-929336256L ^ 0xC89B7440;
        int n7 = n3 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604;
        int n8 = (int)((long)1953061150 ^ (long)1953061150);
        Iterator iterator = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Field8115.keySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field10089 = (xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk)this.Field10098.stream().filter(arg_0 -> H22WL6t5MR2Pqcu834tlbrobCumxlu0J.Method2311(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, arg_0)).findFirst().orElse((QPlUy5UX00sJeOo267en2L4h1DlaeWfq)this.Field10098.get((int)((long)514781690 ^ (long)514781690)));
                return;
            }
            String string = (String)iterator.next();
            xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk2 = new xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk(this, (g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Field8115.get(string), string, n6, this::Method2313, n, n2, n7, ++n8, n5 + (int)((long)-1832917142 ^ (long)-1832917141));
            this.Field10098.add(xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk2);
            this.Field10098.add(new V5Gz0heJnfrKt30zLpDjRw0tUX5tp9vG((U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Field8115.get(string), n, n2, n7, n8, n5 + ((int)1515368956L ^ 0x5A52B1FD)).Method2903(this::Method2312));
            n7 += zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604;
            ++n6;
        }
    }

    @Override
    public void Method623(int n, int n2) {
        F4BV5Sd8qfVWq0oSYdD7gTzMRK5CFCg4.super.Method623(n, n2);
        this.Field10089 = (xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk)this.Field10098.stream().filter(this::Method2310).findFirst().orElse((QPlUy5UX00sJeOo267en2L4h1DlaeWfq)this.Field10098.get((int)-1057403672L ^ 0xC0F94CE8));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(this.Field10090, this.Field10091 + this.Field10092, this.Field10096, zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604, zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14584.Method3626());
        if (zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14590) {
            double[] dArray = new double[((int)892063019L ^ 0x352BCD2A) << 1];
            dArray[(int)((long)1734129638 ^ (long)1734129638)] = (double)this.Field10090 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601;
            dArray[(int)416500298L ^ 0x18D34A4B] = (double)(this.Field10091 + this.Field10092) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray2 = new double[((int)1157209827L ^ 0x44F99EE2) << 1];
            dArray2[(int)-1088742941L ^ 0xBF1B19E3] = this.Field10090 + this.Field10096 / (((int)-1590062171L ^ 0xA13993A4) << 1);
            dArray2[(int)919770954L ^ 0x36D2974B] = (double)(this.Field10091 + this.Field10092) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray3 = new double[((int)284065365L ^ 0x10EE7E54) << 1];
            dArray3[(int)((long)-1039396646 ^ (long)-1039396646)] = this.Field10090 + this.Field10096 / ((int)((long)531598623 ^ (long)531598622) << 1);
            dArray3[(int)((long)-320419179 ^ (long)-320419180)] = (double)(this.Field10091 + this.Field10092 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray4 = new double[(int)((long)-1448982090 ^ (long)-1448982089) << 1];
            dArray4[(int)((long)800234507 ^ (long)800234507)] = (double)this.Field10090 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601;
            dArray4[(int)((long)1359397849 ^ (long)1359397848)] = (double)(this.Field10091 + this.Field10092 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract(new gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3(new Jl14CJNmtWTqlp58umYadtnd800b2Vd0(dArray, dArray2, dArray3, dArray4), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4729(zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14584.Method3626(), null.Field16098.Method335()), zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1228(this.Field10093).Method3625()));
            double[] dArray5 = new double[((int)-1964973492L ^ 0x8AE0E24D) << 1];
            dArray5[(int)1309290837L ^ 0x4E0A3155] = this.Field10090 + this.Field10096 / ((int)((long)1100441002 ^ (long)1100441003) << 1);
            dArray5[(int)-91505493L ^ 0xFA8BBCAA] = (double)(this.Field10091 + this.Field10092) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray6 = new double[((int)1092127373L ^ 0x41188A8C) << 1];
            dArray6[(int)((long)-1517667072 ^ (long)-1517667072)] = (double)(this.Field10090 + this.Field10096) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601;
            dArray6[(int)546535450L ^ 0x2093781B] = (double)(this.Field10091 + this.Field10092) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray7 = new double[(int)((long)815022186 ^ (long)815022187) << 1];
            dArray7[(int)-1032021173L ^ 0xC27C9B4B] = (double)(this.Field10090 + this.Field10096) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601;
            dArray7[(int)1541900744L ^ 0x5BE789C9] = (double)(this.Field10091 + this.Field10092 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            double[] dArray8 = new double[((int)-1339828213L ^ 0xB023D80A) << 1];
            dArray8[(int)-434926690L ^ 0xE6138B9E] = this.Field10090 + this.Field10096 / (((int)-1905327714L ^ 0x8E6F019F) << 1);
            dArray8[(int)1900416417L ^ 0x71460DA0] = (double)(this.Field10091 + this.Field10092 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602;
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract(new gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3(new Jl14CJNmtWTqlp58umYadtnd800b2Vd0(dArray5, dArray6, dArray7, dArray8), zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1228(this.Field10093).Method3625(), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4729(zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14584.Method3626(), null.Field16098.Method335())));
        } else {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH((double)this.Field10090 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601, (double)(this.Field10091 + this.Field10092) + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602, (double)this.Field10096 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14601 * Double.longBitsToDouble(0x10FB5FADDA46902DL ^ 0x50FB5FADDA46902DL), (double)zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14602 * Double.longBitsToDouble((long)1039017586 ^ 0x400000003DEE2672L), zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1228(this.Field10093).Method3626());
        }
        zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1224(this.Field10088.Method354() + ": " + this.Field10089.Method3382(), this.Field10090, this.Field10091 + this.Field10092, this.Field10096, zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604);
        if (!this.Field10094) return;
        Iterator iterator = this.Field10098.iterator();
        while (iterator.hasNext()) {
            QPlUy5UX00sJeOo267en2L4h1DlaeWfq qPlUy5UX00sJeOo267en2L4h1DlaeWfq = (QPlUy5UX00sJeOo267en2L4h1DlaeWfq)iterator.next();
            if (!qPlUy5UX00sJeOo267en2L4h1DlaeWfq.Method641()) continue;
            qPlUy5UX00sJeOo267en2L4h1DlaeWfq.Method623(n, n2);
        }
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (this.Method2308(n, n2)) {
            this.Field10094 = !this.Field10094 ? (int)-1937798962L ^ 0x8C7F88CF : (int)((long)1546961521 ^ (long)1546961521);
            int n4 = this.Field10094 ? 1 : 0;
            if (n3 == 0) {
                this.Field10095 = (int)((long)1505392941 ^ (long)1505392940);
                return;
            }
            if (n3 != ((int)-1933688429L ^ 0x8CBE4192)) return;
            this.Field10095 = (int)((long)-2080333605 ^ (long)-2080333606) << 1;
            return;
        }
        if (!this.Method2309(n, n2)) return;
        if (!this.Field10094) return;
        Iterator iterator = this.Field10098.iterator();
        while (iterator.hasNext()) {
            QPlUy5UX00sJeOo267en2L4h1DlaeWfq qPlUy5UX00sJeOo267en2L4h1DlaeWfq = (QPlUy5UX00sJeOo267en2L4h1DlaeWfq)iterator.next();
            if (!qPlUy5UX00sJeOo267en2L4h1DlaeWfq.Method641()) continue;
            qPlUy5UX00sJeOo267en2L4h1DlaeWfq.Method625(n, n2, n3);
        }
    }

    @Override
    public void Method628(char c, int n) {
        if (this.Field10095 != (int)((long)-270507448 ^ (long)-270507447) << 1) return;
        Iterator iterator = this.Field10098.iterator();
        while (iterator.hasNext()) {
            QPlUy5UX00sJeOo267en2L4h1DlaeWfq qPlUy5UX00sJeOo267en2L4h1DlaeWfq = (QPlUy5UX00sJeOo267en2L4h1DlaeWfq)iterator.next();
            if (!qPlUy5UX00sJeOo267en2L4h1DlaeWfq.Method641()) continue;
            qPlUy5UX00sJeOo267en2L4h1DlaeWfq.Method628(c, n);
        }
    }

    @Override
    public void Method627(int n, int n2) {
        QPlUy5UX00sJeOo267en2L4h1DlaeWfq qPlUy5UX00sJeOo267en2L4h1DlaeWfq;
        this.Field10090 = n;
        this.Field10091 = n2;
        if (!this.Field10094) return;
        Iterator iterator = this.Field10098.iterator();
        do {
            if (!iterator.hasNext()) return;
        } while (!(qPlUy5UX00sJeOo267en2L4h1DlaeWfq = (QPlUy5UX00sJeOo267en2L4h1DlaeWfq)iterator.next()).Method641());
        QPlUy5UX00sJeOo267en2L4h1DlaeWfq qPlUy5UX00sJeOo267en2L4h1DlaeWfq2 = qPlUy5UX00sJeOo267en2L4h1DlaeWfq;
        int n3 = n;
        int n4 = this.Field10097;
        return (void)(n4 * ((int)2111244475L ^ 0x7DD708BE));
    }

    @Override
    public void Method629(int n) {
        this.Field10092 = n;
    }

    private int Method2307() {
        int n = (int)((long)1433660292 ^ (long)1433660292);
        if (!this.Field10094) return zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 + n;
        Iterator iterator = this.Field10098.iterator();
        while (iterator.hasNext()) {
            QPlUy5UX00sJeOo267en2L4h1DlaeWfq qPlUy5UX00sJeOo267en2L4h1DlaeWfq = (QPlUy5UX00sJeOo267en2L4h1DlaeWfq)iterator.next();
            if (!qPlUy5UX00sJeOo267en2L4h1DlaeWfq.Method641()) continue;
            n += qPlUy5UX00sJeOo267en2L4h1DlaeWfq.Method631();
        }
        return zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 + n;
    }

    @Override
    public boolean Method641() {
        int n;
        if (this.Field10088.Method311() && zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1233(this.Field10088.Method354())) {
            n = (int)((long)1436431361 ^ (long)1436431360);
            return n != 0;
        }
        n = (int)-484029508L ^ 0xE3264BBC;
        return n != 0;
    }

    @Override
    public void Method630(int n) {
        this.Field10093 = n;
    }

    @Override
    public int Method633() {
        return this.Field10093;
    }

    @Override
    public void Method634(int n) {
        this.Field10096 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field10090 = n;
    }

    @Override
    public int Method636() {
        return this.Field10090;
    }

    @Override
    public void Method639(int n) {
        this.Field10097 = n;
    }

    @Override
    public int Method640() {
        return this.Field10097;
    }

    private boolean Method2308(int n, int n2) {
        int n3;
        if (n > this.Field10090 && n < this.Field10090 + this.Field10096 && n2 > this.Field10091 + this.Field10092 && n2 < this.Field10091 + this.Field10092 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) {
            n3 = (int)793053318L ^ 0x2F450887;
            return n3 != 0;
        }
        n3 = (int)1385267364L ^ 0x529180A4;
        return n3 != 0;
    }

    private boolean Method2309(int n, int n2) {
        int n3;
        if (n > this.Field10090 && n < this.Field10090 + this.Field10096 && n2 > this.Field10091 + this.Field10092 && n2 < this.Field10091 + this.Field10092 + this.Method2307()) {
            n3 = (int)((long)-465903959 ^ (long)-465903960);
            return n3 != 0;
        }
        n3 = (int)1321297228L ^ 0x4EC1654C;
        return n3 != 0;
    }

    @Override
    public void Method637(int n) {
        this.Field10091 = n;
    }

    @Override
    public int Method638() {
        return this.Field10091 + this.Field10092;
    }

    @Override
    public boolean Method1668() {
        return this.Field10094;
    }

    @Override
    @NotNull
    @NotNull
    public ArrayList Method1669() {
        return this.Field10098;
    }

    private boolean Method2310(QPlUy5UX00sJeOo267en2L4h1DlaeWfq qPlUy5UX00sJeOo267en2L4h1DlaeWfq) {
        int n;
        if (qPlUy5UX00sJeOo267en2L4h1DlaeWfq instanceof xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk && ((xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk)qPlUy5UX00sJeOo267en2L4h1DlaeWfq).Method3382().equals(this.Field10088.Method359())) {
            n = (int)-147961385L ^ 0xF72E49D6;
            return n != 0;
        }
        n = (int)((long)349654655 ^ (long)349654655);
        return n != 0;
    }

    private static boolean Method2311(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, QPlUy5UX00sJeOo267en2L4h1DlaeWfq qPlUy5UX00sJeOo267en2L4h1DlaeWfq) {
        int n;
        if (qPlUy5UX00sJeOo267en2L4h1DlaeWfq instanceof xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk && ((xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk)qPlUy5UX00sJeOo267en2L4h1DlaeWfq).Method3382().equals(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method359())) {
            n = (int)((long)771392021 ^ (long)771392020);
            return n != 0;
        }
        n = (int)((long)-1959136340 ^ (long)-1959136340);
        return n != 0;
    }

    private boolean Method2312() {
        int n;
        if (this.Field10094 && this.Field10095 == (int)((long)2094862526 ^ (long)2094862527) << 1) {
            n = (int)-1207841958L ^ 0xB801CB5B;
            return n != 0;
        }
        n = (int)-308600730L ^ 0xED9B2066;
        return n != 0;
    }

    private boolean Method2313() {
        int n;
        if (this.Field10094 && this.Field10095 == (int)((long)-1460564231 ^ (long)-1460564232)) {
            n = (int)-632669924L ^ 0xDA4A391D;
            return n != 0;
        }
        n = (int)((long)1472724127 ^ (long)1472724127);
        return n != 0;
    }

    private static String Method2314(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1963974716 ^ (long)-1963974716);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1740428678L ^ 0x98432A85);
            int n2 = (int)((long)-1234620848 ^ (long)-1234620809) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2019214347 ^ (long)2019222934) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

