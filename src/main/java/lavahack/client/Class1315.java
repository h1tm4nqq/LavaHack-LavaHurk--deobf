/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1419;
import lavahack.client.Class1520;
import lavahack.client.Class211;
import lavahack.client.Class340;
import lavahack.client.Class753;

public class Class1315
implements Class1520 {
    public final String Field14052;
    private int Field14053;
    private String Field14054 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1315(String string, int n) {
        this.Field14052 = string;
        this.Field14053 = n;
    }

    @Override
    public void Method623(int n, int n2) {
        int n3 = Class1178.Method4741(this.Field14052);
        Class753.drawRectWH(n + 5, n2, n3, Class1419.Field14604, Class1419.Method1228(this.Field14053).Method3626());
        if (Class1419.Field14590) {
            Class753.drawAbstract(new Class211(new Class340(new double[]{n - Class1419.Field14605 + 5, n2}, new double[]{n + 5, n2}, new double[]{n + 5, n2 + Class1419.Field14604}, new double[]{n + 5 - Class1419.Field14605, n2 + Class1419.Field14604}), Class1172.Method4728(Class1419.Method1228(this.Field14053).Method3625(), 0), Class1419.Method1228(this.Field14053).Method3625()));
            Class753.drawAbstract(new Class211(new Class340(new double[]{n + 5 + n3, n2}, new double[]{n + n3 + 5 + Class1419.Field14605, n2}, new double[]{n + 5 + n3 + Class1419.Field14605, n2 + Class1419.Field14604}, new double[]{n + n3 + 5, n2 + Class1419.Field14604}), Class1419.Method1228(this.Field14053).Method3625(), Class1172.Method4728(Class1419.Method1228(this.Field14053).Method3625(), 0)));
        }
        Class1419.Method1227(this.Field14052, n, n2, n3 + Class1419.Field14605 * 2, Class1419.Field14604);
    }

    @Override
    public void Method630(int n) {
        this.Field14053 = n;
    }
}

