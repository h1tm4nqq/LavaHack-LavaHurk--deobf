/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Collections;
import lavahack.client.Class1172;
import lavahack.client.Class1419;
import lavahack.client.Class211;
import lavahack.client.Class337;
import lavahack.client.Class340;
import lavahack.client.Class44;
import lavahack.client.Class691;
import lavahack.client.Class753;
import lavahack.client.Class981;
import org.jetbrains.annotations.NotNull;

public class Class2136
implements Class337 {
    private final Class44 Field17768;
    private int Field17769;
    private int Field17770;
    private int Field17771;
    private int Field17772;
    private int Field17773 = 120;
    private int Field17774;
    private final Class691 Field17775;
    private boolean Field17776;
    private int Field17777;

    public Class2136(Class44 class44, int n, int n2, int n3, int n4, int n5) {
        this.Field17768 = class44;
        this.Field17769 = n;
        this.Field17770 = n2;
        this.Field17771 = n3;
        this.Field17772 = n4;
        this.Field17774 = n5;
        this.Field17773 = Class981.Method3992(n5, this.Field17773);
        this.Field17775 = new Class691(class44, n, n2, n3 + Class1419.Field14604, n4, n5 + 1);
    }

    @Override
    public void Method623(int n, int n2) {
        Class337.super.Method623(n, n2);
        Class753.drawRectWH(this.Field17769, this.Field17770 + this.Field17771, this.Field17773, Class1419.Field14604, Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            if (this.Field17768.Method365()) {
                Class753.drawAbstract(new Class211(new Class340(new double[]{(double)this.Field17769 + Class1419.Field14601, (double)(this.Field17770 + this.Field17771) + Class1419.Field14602}, new double[]{(double)(this.Field17769 + this.Field17773) - Class1419.Field14601, (double)(this.Field17770 + this.Field17771) + Class1419.Field14602}, new double[]{(double)(this.Field17769 + this.Field17773) - Class1419.Field14601, (double)(this.Field17770 + this.Field17771 + Class1419.Field14604) - Class1419.Field14602}, new double[]{(double)this.Field17769 + Class1419.Field14601, (double)(this.Field17770 + this.Field17771 + Class1419.Field14604) - Class1419.Field14602}), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field17772).Method3625()));
            }
        } else if (Class1419.Field14594 || this.Field17768.Method365()) {
            Class753.drawRectWH((double)this.Field17769 + Class1419.Field14601, (double)(this.Field17770 + this.Field17771) + Class1419.Field14602, (double)this.Field17773 - Class1419.Field14601 * Double.longBitsToDouble(0x4000000000000000L), (double)Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble((long)432337699 ^ 0x4000000019C4F323L), this.Field17768.Method365() ? Class1419.Method1228(this.Field17772).Method3626() : Class1419.Field14584.Method3626());
        }
        if (null.Field11809.Method365()) {
            if (Class44.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7141(this.Field17768)) {
                Class1419.Method1226(Class44.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7140(this.Field17768), this.Field17768.Method354(), this.Field17769, this.Field17770 + this.Field17771, this.Field17773, Class1419.Field14604, this.Field17772, 3);
            }
        }
        Class1419.Method1224(this.Field17768.Method354(), this.Field17769, this.Field17770 + this.Field17771, this.Field17773, Class1419.Field14604);
        if (!this.Field17776) return;
        this.Field17775.Method623(n, n2);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (this.Method7705(n, n2) && n3 == 0) {
            this.Field17768.Method366(!this.Field17768.Method365());
        }
        if (this.Method7705(n, n2) && n3 == 1) {
            this.Field17776 = !this.Field17776;
        }
        if (!this.Field17776) return;
        this.Field17775.Method625(n, n2, n3);
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field17769 = n;
        this.Field17770 = n2;
        if (!this.Field17776) return;
        Class691 class691 = this.Field17775;
        int n3 = n;
        int n4 = this.Field17774;
        return (void)(n4 * 5);
    }

    @Override
    public void Method629(int n) {
        this.Field17771 = n;
    }

    @Override
    public void Method628(char c, int n) {
        if (!this.Field17776) return;
        this.Field17775.Method628(c, n);
    }

    @Override
    public int Method631() {
        return Class1419.Field14604;
    }

    @Override
    public boolean Method641() {
        if (!this.Field17768.Method311()) return false;
        if (!Class1419.Method1233(this.Field17768.Method354())) return false;
        return true;
    }

    @Override
    public void Method630(int n) {
        this.Field17772 = n;
    }

    @Override
    public int Method633() {
        return this.Field17772;
    }

    @Override
    public void Method634(int n) {
        this.Field17773 = n;
        this.Field17775.Method634(n - 10);
    }

    @Override
    public void Method635(int n) {
        this.Field17769 = n;
    }

    @Override
    public int Method636() {
        return this.Field17769;
    }

    @Override
    public void Method639(int n) {
        this.Field17774 = n;
    }

    @Override
    public int Method640() {
        return this.Field17774;
    }

    private boolean Method7705(int n, int n2) {
        if (n <= this.Field17769) return false;
        if (n >= this.Field17769 + this.Field17773) return false;
        if (n2 <= this.Field17770 + this.Field17771) return false;
        if (n2 >= this.Field17770 + this.Field17771 + Class1419.Field14604) return false;
        return true;
    }

    @Override
    public boolean Method1668() {
        return this.Field17776;
    }

    @Override
    @NotNull
    @NotNull
    public ArrayList Method1669() {
        return new ArrayList<Class691>(Collections.singletonList(this.Field17775));
    }

    @Override
    public void Method637(int n) {
        this.Field17770 = n;
    }

    @Override
    public int Method638() {
        return this.Field17770 + this.Field17771;
    }
}

