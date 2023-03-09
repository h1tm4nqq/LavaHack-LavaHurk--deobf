/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.math.BigDecimal;
import java.math.RoundingMode;
import lavahack.client.Class1172;
import lavahack.client.Class1419;
import lavahack.client.Class1520;
import lavahack.client.Class1990;
import lavahack.client.Class211;
import lavahack.client.Class340;
import lavahack.client.Class44;
import lavahack.client.Class753;
import lavahack.client.Class981;

public class Class1599
implements Class1520 {
    private final Class44 Field15481;
    private int Field15482;
    private int Field15483;
    private int Field15484;
    private int Field15485;
    private boolean Field15486;
    private int Field15487 = 120;
    private int Field15488;
    private String Field15489 = "";
    private boolean Field15490 = false;
    private boolean Field15491 = false;
    private String Field15492 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1599(Class44 class44, int n, int n2, int n3, int n4, int n5) {
        this.Field15481 = class44;
        this.Field15482 = n;
        this.Field15483 = n2;
        this.Field15484 = n3;
        this.Field15485 = n4;
        this.Field15488 = n5;
        this.Field15487 = Class981.Method3992(n5, this.Field15487);
    }

    @Override
    public void Method623(int n, int n2) {
        Class1520.super.Method623(n, n2);
        double d = this.Field15481.Method371();
        double d2 = this.Field15481.Method372();
        if (this.Field15491) {
            this.Field15486 = false;
        } else {
            this.Field15489 = "";
        }
        if (this.Field15486) {
            double d3 = Math.min(this.Field15487, Math.max(0, n - this.Field15482));
            if (d3 == 0.0) {
                this.Field15481.Method370(this.Field15481.Method371());
            } else {
                this.Field15481.Method370(Class1599.Method6258(d3 / (double)this.Field15487 * (d2 - d) + d, 2));
            }
        }
        String string = this.Field15491 ? this.Field15489 + "_" : this.Field15481.Method354() + ": " + (String)this.Field15481.Method320().Method2190().apply(this.Field15481.Method367());
        Class753.drawRectWH(this.Field15482, this.Field15483 + this.Field15484, this.Field15487, Class1419.Field14604, Class1419.Field14584.Method3626());
        int n3 = (int)((double)this.Field15487 * (this.Field15481.Method367() - d) / (d2 - d));
        if (Class1419.Field14590) {
            Class753.drawAbstract(new Class211(new Class340(new double[]{(double)this.Field15482 + Class1419.Field14601, (double)(this.Field15483 + this.Field15484) + Class1419.Field14602}, new double[]{(double)(this.Field15482 + n3) - Class1419.Field14601, (double)(this.Field15483 + this.Field15484) + Class1419.Field14602}, new double[]{(double)(this.Field15482 + n3) - Class1419.Field14601, (double)(this.Field15483 + this.Field15484 + Class1419.Field14604) - Class1419.Field14602}, new double[]{(double)this.Field15482 + Class1419.Field14601, (double)(this.Field15483 + this.Field15484 + Class1419.Field14604) - Class1419.Field14602}), Class1419.Method1228(this.Field15485).Method3625(), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335())));
        } else {
            Class753.drawRectWH((double)this.Field15482 + Class1419.Field14601, (double)(this.Field15483 + this.Field15484) + Class1419.Field14602, (double)n3 - Class1419.Field14601 * Double.longBitsToDouble((long)1726677962 ^ 0x4000000066EB03CAL), (double)Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble((long)592999030 ^ 0x4000000023587276L), Class1419.Method1228(this.Field15485).Method3626());
        }
        Class1419.Method1224(string, this.Field15482, this.Field15483 + this.Field15484, this.Field15487, Class1419.Field14604);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (this.Method6257(n, n2) && n3 == 0) {
            this.Field15486 = true;
        }
        if (!this.Method6257(n, n2)) return;
        if (n3 != 1) return;
        this.Field15491 = true;
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        this.Field15486 = false;
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field15482 = n;
        this.Field15483 = n2;
    }

    @Override
    public void Method628(char c, int n) {
        if (!this.Field15491) return;
        if (n == 28) {
            this.Field15491 = false;
            if (this.Field15489.isEmpty()) return;
            this.Field15481.Method370(Class1990.Method7392(this.Field15489, this.Field15481.Method367()));
            return;
        }
        if (n == 14 && !this.Field15489.isEmpty() && Class1990.Method7392(this.Field15489, this.Field15481.Method367()) != this.Field15481.Method367()) {
            this.Field15489 = this.Field15489.substring(0, this.Field15489.length() - 1);
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
        return Class1419.Field14604;
    }

    @Override
    public boolean Method641() {
        if (!this.Field15481.Method311()) return false;
        if (!Class1419.Method1233(this.Field15481.Method354())) return false;
        return true;
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
        if (n <= this.Field15482) return false;
        if (n >= this.Field15482 + this.Field15487) return false;
        if (n2 <= this.Field15483 + this.Field15484) return false;
        if (n2 >= this.Field15483 + this.Field15484 + Class1419.Field14604) return false;
        return true;
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 96;
            cArray2[n] = (char)(cArray[n] ^ (0x7739 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

