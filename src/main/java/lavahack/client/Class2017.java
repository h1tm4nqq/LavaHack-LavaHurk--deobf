/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1089;
import lavahack.client.Class1166;
import lavahack.client.Class1172;
import lavahack.client.Class1419;
import lavahack.client.Class1520;
import lavahack.client.Class211;
import lavahack.client.Class340;
import lavahack.client.Class480;
import lavahack.client.Class753;
import lavahack.client.Class981;

public class Class2017
implements Class1520 {
    private final Class1089 Field17280;
    private final Class480 Field17281;
    private int Field17282;
    private int Field17283;
    private int Field17284;
    private int Field17285;
    private int Field17286 = 120;
    private int Field17287;
    private String Field17288 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2017(Class1089 class1089, Class480 class480, int n, int n2, int n3, int n4, int n5) {
        this.Field17280 = class1089;
        this.Field17281 = class480;
        this.Field17282 = n;
        this.Field17283 = n2;
        this.Field17285 = n3;
        this.Field17284 = n4;
        this.Field17287 = n5;
        this.Field17286 = Class981.Method3992(n5, this.Field17286);
    }

    @Override
    public void Method623(int n, int n2) {
        Class1520.super.Method623(n, n2);
        if (Class1419.Field14590) {
            Class753.drawRectWH(this.Field17282, this.Field17283 + this.Field17285, this.Field17286, Class1419.Field14604, Class1419.Field14584.Method3626());
            Class753.drawAbstract(new Class211(new Class340(new double[]{this.Field17282, this.Field17283 + this.Field17285}, new double[]{this.Field17282 + this.Field17286 / 2, this.Field17283 + this.Field17285}, new double[]{this.Field17282 + this.Field17286 / 2, this.Field17283 + this.Field17285 + Class1419.Field14604}, new double[]{this.Field17282, this.Field17283 + this.Field17285 + Class1419.Field14604}), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field17284).Method3625()));
            Class753.drawAbstract(new Class211(new Class340(new double[]{this.Field17282 + this.Field17286 / 2, this.Field17283 + this.Field17285}, new double[]{this.Field17282 + this.Field17286, this.Field17283 + this.Field17285}, new double[]{this.Field17282 + this.Field17286, this.Field17283 + this.Field17285 + Class1419.Field14604}, new double[]{this.Field17282 + this.Field17286 / 2, this.Field17283 + this.Field17285 + Class1419.Field14604}), Class1419.Method1228(this.Field17284).Method3625(), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335())));
        } else {
            Class753.drawRectWH(this.Field17282, this.Field17283 + this.Field17285, this.Field17286, Class1419.Field14604, Class1419.Method1228(this.Field17284).Method3626());
        }
        Class1419.Method1224(this.Field17281.Field10005, this.Field17282, this.Field17283 + this.Field17285, this.Field17286, Class1419.Field14604);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (!this.Method7473(n, n2)) return;
        if (n3 != 0) return;
        switch (Class1166.Field13263[this.Field17281.ordinal()]) {
            case 1: {
                this.Field17280.Method20();
                return;
            }
            case 2: {
                this.Field17280.Method4454(true);
                return;
            }
        }
    }

    @Override
    public void Method629(int n) {
        this.Field17285 = n;
    }

    @Override
    public void Method630(int n) {
        this.Field17284 = n;
    }

    @Override
    public int Method631() {
        return Class1419.Field14604;
    }

    @Override
    public int Method633() {
        return this.Field17284;
    }

    @Override
    public void Method634(int n) {
        this.Field17286 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field17282 = n;
    }

    @Override
    public int Method636() {
        return this.Field17282;
    }

    @Override
    public void Method639(int n) {
        this.Field17287 = n;
    }

    @Override
    public int Method640() {
        return this.Field17287;
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field17282 = n;
        this.Field17283 = n2;
    }

    private boolean Method7473(int n, int n2) {
        if (n <= this.Field17282) return false;
        if (n >= this.Field17282 + this.Field17286) return false;
        if (n2 <= this.Field17283 + this.Field17285) return false;
        if (n2 >= this.Field17283 + this.Field17285 + Class1419.Field14604) return false;
        return true;
    }

    @Override
    public boolean Method641() {
        return Class1419.Method1233(this.Field17281.Field10005);
    }

    @Override
    public void Method637(int n) {
        this.Field17283 = n;
    }

    @Override
    public int Method638() {
        return this.Field17283 + this.Field17285;
    }
}

