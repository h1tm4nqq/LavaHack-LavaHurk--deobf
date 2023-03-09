/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1172;
import lavahack.client.Class1419;
import lavahack.client.Class1520;
import lavahack.client.Class211;
import lavahack.client.Class340;
import lavahack.client.Class42;
import lavahack.client.Class753;
import lavahack.client.Class981;

public class Class1873
implements Class1520 {
    private final Class42 Field16593;
    private int Field16594;
    private int Field16595;
    private int Field16596;
    private int Field16597;
    private int Field16598 = 120;
    private int Field16599;
    private int Field16600;

    public Class1873(Class42 class42, int n, int n2, int n3, int n4, int n5) {
        this.Field16593 = class42;
        this.Field16594 = n;
        this.Field16595 = n2;
        this.Field16596 = n3;
        this.Field16597 = n4;
        this.Field16599 = n5;
        this.Field16598 = Class981.Method3992(n5, this.Field16598);
    }

    @Override
    public void Method623(int n, int n2) {
        Class1520.super.Method623(n, n2);
        Class753.drawRectWH(this.Field16594, this.Field16595 + this.Field16596, this.Field16598, Class1419.Field14604, Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            if (this.Field16593.Field8064) {
                Class753.drawAbstract(new Class211(new Class340(new double[]{(double)this.Field16594 + Class1419.Field14601, (double)(this.Field16595 + this.Field16596) + Class1419.Field14602}, new double[]{(double)(this.Field16594 + this.Field16598) - Class1419.Field14601, (double)(this.Field16595 + this.Field16596) + Class1419.Field14602}, new double[]{(double)(this.Field16594 + this.Field16598) - Class1419.Field14601, (double)(this.Field16595 + this.Field16596 + Class1419.Field14604) - Class1419.Field14602}, new double[]{(double)this.Field16594 + Class1419.Field14601, (double)(this.Field16595 + this.Field16596 + Class1419.Field14604) - Class1419.Field14602}), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field16597).Method3625()));
            }
        } else if (Class1419.Field14594 || this.Field16593.Field8064) {
            Class753.drawRectWH((double)this.Field16594 + Class1419.Field14601, (double)(this.Field16595 + this.Field16596) + Class1419.Field14602, (double)this.Field16598 - Class1419.Field14601 * Double.longBitsToDouble((long)556520748 ^ 0x40000000212BD52CL), (double)Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble(0x4000000000000000L), this.Field16593.Field8064 ? Class1419.Method1228(this.Field16597).Method3626() : Class1419.Field14584.Method3626());
        }
        Class1419.Method1224("Visible", this.Field16594, this.Field16595 + this.Field16596, this.Field16598, Class1419.Field14604);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (!this.Method6969(n, n2)) return;
        if (n3 != 0) return;
        this.Field16593.Field8064 = !this.Field16593.Field8064;
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field16594 = n;
        this.Field16595 = n2;
    }

    @Override
    public void Method629(int n) {
        this.Field16596 = n;
    }

    @Override
    public int Method631() {
        return Class1419.Field14604;
    }

    @Override
    public boolean Method641() {
        return true;
    }

    @Override
    public void Method630(int n) {
        this.Field16597 = n;
    }

    @Override
    public int Method633() {
        return this.Field16597;
    }

    @Override
    public void Method634(int n) {
        this.Field16598 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field16594 = n;
    }

    @Override
    public int Method636() {
        return this.Field16594;
    }

    @Override
    public void Method639(int n) {
        this.Field16599 = n;
    }

    @Override
    public int Method640() {
        return this.Field16599;
    }

    private boolean Method6969(int n, int n2) {
        if (n <= this.Field16594) return false;
        if (n >= this.Field16594 + this.Field16598) return false;
        if (n2 <= this.Field16595 + this.Field16596) return false;
        if (n2 >= this.Field16595 + this.Field16596 + Class1419.Field14604) return false;
        return true;
    }

    @Override
    public void Method637(int n) {
        this.Field16595 = n;
    }

    @Override
    public int Method638() {
        return this.Field16595 + this.Field16596;
    }

    private static String Method6970(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 235;
            cArray2[n] = (char)(cArray[n] ^ (0x3226 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

