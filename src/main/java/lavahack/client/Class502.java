/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.QPlUy5UX00sJeOo267en2L4h1DlaeWfq
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.Class1172;
import lavahack.client.Class1419;
import lavahack.client.Class1520;
import lavahack.client.Class1929;
import lavahack.client.Class211;
import lavahack.client.Class337;
import lavahack.client.Class340;
import lavahack.client.Class44;
import lavahack.client.Class691;
import lavahack.client.Class695;
import lavahack.client.Class753;
import lavahack.client.Class801;
import lavahack.client.Class981;
import lavahack.client.QPlUy5UX00sJeOo267en2L4h1DlaeWfq;
import org.jetbrains.annotations.NotNull;

public class Class502
implements Class337 {
    public final Class44 Field10088;
    public Class801 Field10089;
    private int Field10090;
    private int Field10091;
    private int Field10092;
    private int Field10093;
    public boolean Field10094;
    private int Field10095 = 0;
    private int Field10096 = 120;
    private int Field10097;
    private final ArrayList Field10098 = new ArrayList();
    private int Field10099;

    public Class502(Class44 class44, int n, int n2, int n3, int n4, int n5) {
        this.Field10088 = class44;
        this.Field10090 = n;
        this.Field10091 = n2;
        this.Field10092 = n3;
        this.Field10093 = n4;
        this.Field10097 = n5;
        this.Field10096 = Class981.Method3992(n5, this.Field10096);
        int n6 = 0;
        int n7 = n3 + Class1419.Field14604;
        int n8 = 0;
        Iterator iterator = class44.Field8115.keySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field10089 = (Class801)this.Field10098.stream().filter(arg_0 -> Class502.Method2311(class44, arg_0)).findFirst().orElse((QPlUy5UX00sJeOo267en2L4h1DlaeWfq)this.Field10098.get(0));
                return;
            }
            String string = (String)iterator.next();
            Class801 class801 = new Class801(this, (Class1929)class44.Field8115.get(string), string, n6, this::Method2313, n, n2, n7, ++n8, n5 + 1);
            this.Field10098.add(class801);
            this.Field10098.add(new Class691((Class695)class44.Field8115.get(string), n, n2, n7, n8, n5 + 1).Method2903(this::Method2312));
            n7 += Class1419.Field14604;
            ++n6;
        }
    }

    @Override
    public void Method623(int n, int n2) {
        Class337.super.Method623(n, n2);
        this.Field10089 = (Class801)this.Field10098.stream().filter(this::Method2310).findFirst().orElse((QPlUy5UX00sJeOo267en2L4h1DlaeWfq)this.Field10098.get(0));
        Class753.drawRectWH(this.Field10090, this.Field10091 + this.Field10092, this.Field10096, Class1419.Field14604, Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            Class753.drawAbstract(new Class211(new Class340(new double[]{(double)this.Field10090 + Class1419.Field14601, (double)(this.Field10091 + this.Field10092) + Class1419.Field14602}, new double[]{this.Field10090 + this.Field10096 / 2, (double)(this.Field10091 + this.Field10092) + Class1419.Field14602}, new double[]{this.Field10090 + this.Field10096 / 2, (double)(this.Field10091 + this.Field10092 + Class1419.Field14604) - Class1419.Field14602}, new double[]{(double)this.Field10090 + Class1419.Field14601, (double)(this.Field10091 + this.Field10092 + Class1419.Field14604) - Class1419.Field14602}), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field10093).Method3625()));
            Class753.drawAbstract(new Class211(new Class340(new double[]{this.Field10090 + this.Field10096 / 2, (double)(this.Field10091 + this.Field10092) + Class1419.Field14602}, new double[]{(double)(this.Field10090 + this.Field10096) - Class1419.Field14601, (double)(this.Field10091 + this.Field10092) + Class1419.Field14602}, new double[]{(double)(this.Field10090 + this.Field10096) - Class1419.Field14601, (double)(this.Field10091 + this.Field10092 + Class1419.Field14604) - Class1419.Field14602}, new double[]{this.Field10090 + this.Field10096 / 2, (double)(this.Field10091 + this.Field10092 + Class1419.Field14604) - Class1419.Field14602}), Class1419.Method1228(this.Field10093).Method3625(), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335())));
        } else {
            Class753.drawRectWH((double)this.Field10090 + Class1419.Field14601, (double)(this.Field10091 + this.Field10092) + Class1419.Field14602, (double)this.Field10096 - Class1419.Field14601 * Double.longBitsToDouble(0x4000000000000000L), (double)Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble((long)1039017586 ^ 0x400000003DEE2672L), Class1419.Method1228(this.Field10093).Method3626());
        }
        Class1419.Method1224(this.Field10088.Method354() + ": " + this.Field10089.Method3382(), this.Field10090, this.Field10091 + this.Field10092, this.Field10096, Class1419.Field14604);
        if (!this.Field10094) return;
        Iterator iterator = this.Field10098.iterator();
        while (iterator.hasNext()) {
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            class1520.Method623(n, n2);
        }
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (this.Method2308(n, n2)) {
            boolean bl = this.Field10094 = !this.Field10094;
            if (n3 == 0) {
                this.Field10095 = 1;
                return;
            }
            if (n3 != 1) return;
            this.Field10095 = 2;
            return;
        }
        if (!this.Method2309(n, n2)) return;
        if (!this.Field10094) return;
        Iterator iterator = this.Field10098.iterator();
        while (iterator.hasNext()) {
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            class1520.Method625(n, n2, n3);
        }
    }

    @Override
    public void Method628(char c, int n) {
        if (this.Field10095 != 2) return;
        Iterator iterator = this.Field10098.iterator();
        while (iterator.hasNext()) {
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            class1520.Method628(c, n);
        }
    }

    @Override
    public void Method627(int n, int n2) {
        Class1520 class1520;
        this.Field10090 = n;
        this.Field10091 = n2;
        if (!this.Field10094) return;
        Iterator iterator = this.Field10098.iterator();
        do {
            if (!iterator.hasNext()) return;
        } while (!(class1520 = (Class1520)iterator.next()).Method641());
        Class1520 class15202 = class1520;
        int n3 = n;
        int n4 = this.Field10097;
        return (void)(n4 * 5);
    }

    @Override
    public void Method629(int n) {
        this.Field10092 = n;
    }

    private int Method2307() {
        int n = 0;
        if (!this.Field10094) return Class1419.Field14604 + n;
        Iterator iterator = this.Field10098.iterator();
        while (iterator.hasNext()) {
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            n += class1520.Method631();
        }
        return Class1419.Field14604 + n;
    }

    @Override
    public boolean Method641() {
        if (!this.Field10088.Method311()) return false;
        if (!Class1419.Method1233(this.Field10088.Method354())) return false;
        return true;
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
        if (n <= this.Field10090) return false;
        if (n >= this.Field10090 + this.Field10096) return false;
        if (n2 <= this.Field10091 + this.Field10092) return false;
        if (n2 >= this.Field10091 + this.Field10092 + Class1419.Field14604) return false;
        return true;
    }

    private boolean Method2309(int n, int n2) {
        if (n <= this.Field10090) return false;
        if (n >= this.Field10090 + this.Field10096) return false;
        if (n2 <= this.Field10091 + this.Field10092) return false;
        if (n2 >= this.Field10091 + this.Field10092 + this.Method2307()) return false;
        return true;
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

    private boolean Method2310(Class1520 class1520) {
        if (!(class1520 instanceof Class801)) return false;
        if (!((Class801)class1520).Method3382().equals(this.Field10088.Method359())) return false;
        return true;
    }

    private static boolean Method2311(Class44 class44, Class1520 class1520) {
        if (!(class1520 instanceof Class801)) return false;
        if (!((Class801)class1520).Method3382().equals(class44.Method359())) return false;
        return true;
    }

    private boolean Method2312() {
        if (!this.Field10094) return false;
        if (this.Field10095 != 2) return false;
        return true;
    }

    private boolean Method2313() {
        if (!this.Field10094) return false;
        if (this.Field10095 != 1) return false;
        return true;
    }

    private static String Method2314(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 78;
            cArray2[n] = (char)(cArray[n] ^ (0x219D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

