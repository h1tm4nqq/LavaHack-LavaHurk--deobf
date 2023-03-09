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

public class Class1286
implements Class1520 {
    private final Class42 Field13862;
    private int Field13863;
    private int Field13864;
    private int Field13865;
    private int Field13866;
    private int Field13867;
    private final String[] Field13868;
    private boolean Field13869 = false;
    private int Field13870 = 120;
    private int Field13871;
    private String Field13872 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1286(Class42 class42, int n, int n2, int n3, int n4, int n5) {
        this.Field13862 = class42;
        this.Field13863 = n;
        this.Field13864 = n2;
        this.Field13865 = n3;
        this.Field13866 = n4;
        this.Field13868 = new String[]{"Toggle", "Hold"};
        this.Field13867 = class42.Field8065 ? 1 : 0;
        this.Field13871 = n5;
        this.Field13870 = Class981.Method3992(n5, this.Field13870);
    }

    @Override
    public void Method623(int n, int n2) {
        Class1520.super.Method623(n, n2);
        this.Field13867 = this.Field13862.Field8065 ? 1 : 0;
        Class753.drawRectWH(this.Field13863, this.Field13864 + this.Field13865, this.Field13870, this.Method631(), Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            Class753.drawAbstract(new Class211(new Class340(new double[]{(double)this.Field13863 + Class1419.Field14601, (double)(this.Field13864 + this.Field13865) + Class1419.Field14602}, new double[]{this.Field13863 + this.Field13870 / 2, (double)(this.Field13864 + this.Field13865) + Class1419.Field14602}, new double[]{this.Field13863 + this.Field13870 / 2, (double)(this.Field13864 + this.Field13865 + Class1419.Field14604) - Class1419.Field14602}, new double[]{(double)this.Field13863 + Class1419.Field14601, (double)(this.Field13864 + this.Field13865 + Class1419.Field14604) - Class1419.Field14602}), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field13866).Method3625()));
            Class753.drawAbstract(new Class211(new Class340(new double[]{this.Field13863 + this.Field13870 / 2, (double)(this.Field13864 + this.Field13865) + Class1419.Field14602}, new double[]{(double)(this.Field13863 + this.Field13870) - Class1419.Field14601, (double)(this.Field13864 + this.Field13865) + Class1419.Field14602}, new double[]{(double)(this.Field13863 + this.Field13870) - Class1419.Field14601, (double)(this.Field13864 + this.Field13865 + Class1419.Field14604) - Class1419.Field14602}, new double[]{this.Field13863 + this.Field13870 / 2, (double)(this.Field13864 + this.Field13865 + Class1419.Field14604) - Class1419.Field14602}), Class1419.Method1228(this.Field13866).Method3625(), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335())));
        } else {
            Class753.drawRectWH((double)this.Field13863 + Class1419.Field14601, (double)(this.Field13864 + this.Field13865) + Class1419.Field14602, (double)this.Field13870 - Class1419.Field14601 * Double.longBitsToDouble(0x4000000000000000L), (double)Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble((long)1611830136 ^ 0x4000000060129378L), Class1419.Method1228(this.Field13866).Method3626());
        }
        Class1419.Method1224("Bind Mode: " + this.Field13868[this.Field13867], this.Field13863, this.Field13864 + this.Field13865, this.Field13870, Class1419.Field14604);
        if (!this.Field13869) return;
        int n3 = this.Field13865 + Class1419.Field14604;
        int n4 = 0;
        while (n4 < this.Field13868.length) {
            if (n4 != this.Field13867) {
                Class1419.Method1227(this.Field13868[n4], this.Field13863, this.Field13864 + n3, this.Field13870, Class1419.Field14604);
                n3 += Class1419.Field14604;
            }
            ++n4;
        }
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (this.Method5229(n, n2) && n3 == 0) {
            this.Field13869 = !this.Field13869;
            return;
        }
        if (!this.Method5230(n, n2)) return;
        if (n3 != 0) return;
        if (!this.Field13869) return;
        int n4 = this.Field13864 + this.Field13865 + Class1419.Field14604;
        int n5 = 0;
        while (n5 < this.Field13868.length) {
            if (n5 != this.Field13867) {
                if (n2 >= n4 && n2 <= n4 + Class1419.Field14604) {
                    this.Field13867 = n5;
                    this.Field13869 = false;
                    this.Field13862.Field8065 = this.Field13868[n5].equals(this.Field13868[1]);
                    return;
                }
                n4 += Class1419.Field14604;
            }
            ++n5;
        }
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field13863 = n;
        this.Field13864 = n2;
    }

    @Override
    public void Method629(int n) {
        this.Field13865 = n;
    }

    @Override
    public void Method630(int n) {
        this.Field13866 = n;
    }

    @Override
    public int Method631() {
        int n;
        if (this.Field13869) {
            n = (this.Field13868.length - 1) * Class1419.Field14604;
            return Class1419.Field14604 + n;
        }
        n = 0;
        return Class1419.Field14604 + n;
    }

    @Override
    public int Method633() {
        return this.Field13866;
    }

    @Override
    public boolean Method641() {
        return true;
    }

    @Override
    public void Method634(int n) {
        this.Field13870 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field13863 = n;
    }

    @Override
    public int Method636() {
        return this.Field13863;
    }

    @Override
    public void Method639(int n) {
        this.Field13871 = n;
    }

    @Override
    public int Method640() {
        return this.Field13871;
    }

    private boolean Method5229(int n, int n2) {
        if (n <= this.Field13863) return false;
        if (n >= this.Field13863 + this.Field13870) return false;
        if (n2 <= this.Field13864 + this.Field13865) return false;
        if (n2 >= this.Field13864 + this.Field13865 + Class1419.Field14604) return false;
        return true;
    }

    private boolean Method5230(int n, int n2) {
        if (n <= this.Field13863) return false;
        if (n >= this.Field13863 + this.Field13870) return false;
        if (n2 <= this.Field13864 + this.Field13865) return false;
        if (n2 >= this.Field13864 + this.Field13865 + this.Method631()) return false;
        return true;
    }

    @Override
    public void Method637(int n) {
        this.Field13864 = n;
    }

    @Override
    public int Method638() {
        return this.Field13864 + this.Field13865;
    }

    private static String Method5231(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 9;
            cArray2[n] = (char)(cArray[n] ^ (0x5963 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

