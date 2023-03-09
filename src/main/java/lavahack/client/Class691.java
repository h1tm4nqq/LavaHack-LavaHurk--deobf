/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.BooleanSupplier;
import lavahack.client.Class1172;
import lavahack.client.Class1419;
import lavahack.client.Class1520;
import lavahack.client.Class211;
import lavahack.client.Class340;
import lavahack.client.Class44;
import lavahack.client.Class695;
import lavahack.client.Class753;
import lavahack.client.Class955;
import lavahack.client.Class981;

public class Class691
implements Class1520 {
    private final Class695 Field10913;
    private int Field10914;
    private int Field10915;
    private int Field10916;
    private int Field10917;
    private boolean Field10918;
    private int Field10919 = 120;
    private int Field10920;
    public BooleanSupplier Field10921 = null;
    private String Field10922 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class691(Class695 class695, int n, int n2, int n3, int n4, int n5) {
        this.Field10913 = class695;
        this.Field10914 = n;
        this.Field10915 = n2;
        this.Field10916 = n3;
        this.Field10917 = n4;
        this.Field10920 = n5;
        this.Field10919 = Class981.Method3992(n5, this.Field10919);
    }

    public Class691 Method2903(BooleanSupplier booleanSupplier) {
        this.Field10921 = booleanSupplier;
        return this;
    }

    @Override
    public void Method623(int n, int n2) {
        Class1520.super.Method623(n, n2);
        Class753.drawRectWH(this.Field10914, this.Field10915 + this.Field10916, this.Field10919, Class1419.Field14604, Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            if (this.Field10918) {
                Class753.drawAbstract(new Class211(new Class340(new double[]{(double)this.Field10914 + Class1419.Field14601, (double)(this.Field10915 + this.Field10916) + Class1419.Field14602}, new double[]{(double)(this.Field10914 + this.Field10919) - Class1419.Field14601, (double)(this.Field10915 + this.Field10916) + Class1419.Field14602}, new double[]{(double)(this.Field10914 + this.Field10919) - Class1419.Field14601, (double)(this.Field10915 + this.Field10916 + Class1419.Field14604) - Class1419.Field14602}, new double[]{(double)this.Field10914 + Class1419.Field14601, (double)(this.Field10915 + this.Field10916 + Class1419.Field14604) - Class1419.Field14602}), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field10917).Method3625()));
            }
        } else if (Class1419.Field14594 || this.Field10918) {
            Class753.drawRectWH((double)this.Field10914 + Class1419.Field14601, (double)(this.Field10915 + this.Field10916) + Class1419.Field14602, (double)this.Field10919 - Class1419.Field14601 * Double.longBitsToDouble((long)1200807584 ^ 0x400000004792DEA0L), (double)Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble(0x4000000000000000L), this.Field10918 ? Class1419.Method1228(this.Field10917).Method3626() : Class1419.Field14584.Method3626());
        }
        Class1419.Method1224(this.Field10918 ? "Press a key..." : this.Field10913.Method16() + ": " + Class695.Field10935.Method7140(this.Field10913), this.Field10914, this.Field10915 + this.Field10916, this.Field10919, Class1419.Field14604);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (this.Method2904(n, n2) && n3 == 0) {
            boolean bl = this.Field10918 = !this.Field10918;
        }
        if (this.Method2904(n, n2) && n3 == 1) {
            this.Field10918 = false;
            this.Field10913.Method13(Class955.Field12068);
            this.Field10913.Method9(0);
            this.Field10913.Method11(-1);
        }
        if (n3 <= 1) return;
        if (!this.Field10918) return;
        this.Field10918 = false;
        this.Field10913.Method13(Class955.Field12069);
        this.Field10913.Method11(n3);
    }

    @Override
    public void Method628(char c, int n) {
        if (!this.Field10918) return;
        this.Field10918 = false;
        this.Field10913.Method13(Class955.Field12068);
        this.Field10913.Method9(n);
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field10914 = n;
        this.Field10915 = n2;
    }

    @Override
    public void Method629(int n) {
        this.Field10916 = n;
    }

    @Override
    public int Method631() {
        return Class1419.Field14604;
    }

    @Override
    public boolean Method641() {
        if (this.Field10921 != null) {
            boolean bl = this.Field10921.getAsBoolean();
            return bl;
        }
        if (!(this.Field10913 instanceof Class44)) return true;
        if (!((Class44)this.Field10913).Method311()) return false;
        if (!Class1419.Method1233(((Class44)this.Field10913).Method354())) return false;
        return true;
    }

    @Override
    public void Method630(int n) {
        this.Field10917 = n;
    }

    @Override
    public int Method633() {
        return this.Field10917;
    }

    @Override
    public void Method634(int n) {
        this.Field10919 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field10914 = n;
    }

    @Override
    public int Method636() {
        return this.Field10914;
    }

    @Override
    public void Method639(int n) {
        this.Field10920 = n;
    }

    @Override
    public int Method640() {
        return this.Field10920;
    }

    private boolean Method2904(int n, int n2) {
        if (n <= this.Field10914) return false;
        if (n >= this.Field10914 + this.Field10919) return false;
        if (n2 <= this.Field10915 + this.Field10916) return false;
        if (n2 >= this.Field10915 + this.Field10916 + Class1419.Field14604) return false;
        return true;
    }

    @Override
    public void Method637(int n) {
        this.Field10915 = n;
    }

    @Override
    public int Method638() {
        return this.Field10915 + this.Field10916;
    }

    private static String Method2905(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 190;
            cArray2[n] = (char)(cArray[n] ^ (0x180E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

