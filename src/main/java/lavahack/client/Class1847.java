/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1096;
import lavahack.client.Class1172;
import lavahack.client.Class1419;
import lavahack.client.Class1520;
import lavahack.client.Class2093;
import lavahack.client.Class211;
import lavahack.client.Class226;
import lavahack.client.Class340;
import lavahack.client.Class753;
import lavahack.client.Class981;

public class Class1847
implements Class1520 {
    private final Class1096 Field16512;
    private final Class226 Field16513;
    private int Field16514;
    private int Field16515;
    private int Field16516;
    private int Field16517;
    private int Field16518 = 120;
    private int Field16519;
    private String Field16520 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1847(Class1096 class1096, Class226 class226, int n, int n2, int n3, int n4, int n5) {
        this.Field16512 = class1096;
        this.Field16513 = class226;
        this.Field16514 = n;
        this.Field16515 = n2;
        this.Field16517 = n3;
        this.Field16516 = n4;
        this.Field16519 = n5;
        this.Field16518 = Class981.Method3992(n5, this.Field16518);
    }

    @Override
    public void Method623(int n, int n2) {
        Class1520.super.Method623(n, n2);
        if (Class1419.Field14590) {
            Class753.drawRectWH(this.Field16514, this.Field16515 + this.Field16517, this.Field16518, Class1419.Field14604, Class1419.Field14584.Method3626());
            Class753.drawAbstract(new Class211(new Class340(new double[]{this.Field16514, this.Field16515 + this.Field16517}, new double[]{this.Field16514 + this.Field16518 / 2, this.Field16515 + this.Field16517}, new double[]{this.Field16514 + this.Field16518 / 2, this.Field16515 + this.Field16517 + Class1419.Field14604}, new double[]{this.Field16514, this.Field16515 + this.Field16517 + Class1419.Field14604}), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field16516).Method3625()));
            Class753.drawAbstract(new Class211(new Class340(new double[]{this.Field16514 + this.Field16518 / 2, this.Field16515 + this.Field16517}, new double[]{this.Field16514 + this.Field16518, this.Field16515 + this.Field16517}, new double[]{this.Field16514 + this.Field16518, this.Field16515 + this.Field16517 + Class1419.Field14604}, new double[]{this.Field16514 + this.Field16518 / 2, this.Field16515 + this.Field16517 + Class1419.Field14604}), Class1419.Method1228(this.Field16516).Method3625(), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335())));
        } else {
            Class753.drawRectWH(this.Field16514, this.Field16515 + this.Field16517, this.Field16518, Class1419.Field14604, Class1419.Method1228(this.Field16516).Method3626());
        }
        Class1419.Method1224(this.Field16513.Field8987, this.Field16514, this.Field16515 + this.Field16517, this.Field16518, Class1419.Field14604);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (!this.Method6941(n, n2)) return;
        if (n3 != 0) return;
        switch (Class2093.Field17548[this.Field16513.ordinal()]) {
            case 1: {
                this.Field16512.Method4489();
                return;
            }
            case 2: {
                this.Field16512.Method4490();
                return;
            }
            case 3: {
                this.Field16512.Method4491();
                return;
            }
        }
    }

    @Override
    public void Method629(int n) {
        this.Field16517 = n;
    }

    @Override
    public void Method630(int n) {
        this.Field16516 = n;
    }

    @Override
    public int Method631() {
        return Class1419.Field14604;
    }

    @Override
    public int Method633() {
        return this.Field16516;
    }

    @Override
    public boolean Method641() {
        if (this.Field16512.Method27() != (this.Field16513 != Class226.Field8984)) return false;
        if (!Class1419.Method1233(this.Field16513.Field8987)) return false;
        return true;
    }

    @Override
    public void Method634(int n) {
        this.Field16518 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field16514 = n;
    }

    @Override
    public int Method636() {
        return this.Field16514;
    }

    @Override
    public void Method639(int n) {
        this.Field16519 = n;
    }

    @Override
    public int Method640() {
        return this.Field16519;
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field16514 = n;
        this.Field16515 = n2;
    }

    private boolean Method6941(int n, int n2) {
        if (n <= this.Field16514) return false;
        if (n >= this.Field16514 + this.Field16518) return false;
        if (n2 <= this.Field16515 + this.Field16517) return false;
        if (n2 >= this.Field16515 + this.Field16517 + Class1419.Field14604) return false;
        return true;
    }

    @Override
    public void Method637(int n) {
        this.Field16515 = n;
    }

    @Override
    public int Method638() {
        return this.Field16515 + this.Field16517;
    }
}

