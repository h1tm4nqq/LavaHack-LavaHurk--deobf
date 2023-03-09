/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.Class1089;
import lavahack.client.Class1096;
import lavahack.client.Class1172;
import lavahack.client.Class1249;
import lavahack.client.Class1286;
import lavahack.client.Class1315;
import lavahack.client.Class1419;
import lavahack.client.Class1520;
import lavahack.client.Class1599;
import lavahack.client.Class1729;
import lavahack.client.Class1796;
import lavahack.client.Class1847;
import lavahack.client.Class1873;
import lavahack.client.Class1996;
import lavahack.client.Class2017;
import lavahack.client.Class211;
import lavahack.client.Class2136;
import lavahack.client.Class2164;
import lavahack.client.Class226;
import lavahack.client.Class294;
import lavahack.client.Class337;
import lavahack.client.Class340;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class480;
import lavahack.client.Class502;
import lavahack.client.Class691;
import lavahack.client.Class753;
import lavahack.client.Class778;
import lavahack.client.Class958;
import org.jetbrains.annotations.NotNull;

public class Class1429
implements Class337 {
    public final ArrayList Field14670 = new ArrayList();
    public final Class42 Field14671;
    public final Class2164 Field14672;
    public final Class1315 Field14673;
    public final boolean Field14674;
    public int Field14675;
    public int Field14676;
    public int Field14677;
    public int Field14678;
    public boolean Field14679 = false;
    private String Field14680 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1429(Class42 class42, int n, int n2, int n3, int n4) {
        this.Field14671 = class42;
        this.Field14674 = class42 instanceof Class1249;
        this.Field14672 = this.Field14674 ? new Class2164((Class1249)class42) : null;
        this.Field14673 = new Class1315(class42.Method31(), n4);
        this.Field14675 = n;
        this.Field14676 = n2;
        this.Field14677 = n3;
        this.Field14678 = n4;
        int n5 = n3 + Class1419.Field14604;
        int n6 = 0;
        if (class42 instanceof Class1089) {
            this.Field14670.add(new Class2017((Class1089)class42, Class480.Field10003, n, n2, n5, n6++, 1));
            this.Field14670.add(new Class2017((Class1089)class42, Class480.Field10004, n, n2, n5 += Class1419.Field14604, n6++, 1));
        } else if (class42 instanceof Class1096) {
            this.Field14670.add(new Class1847((Class1096)class42, Class226.Field8984, n, n2, n5, n6++, 1));
            this.Field14670.add(new Class1847((Class1096)class42, Class226.Field8985, n, n2, n5 += Class1419.Field14604, n6++, 1));
            this.Field14670.add(new Class1847((Class1096)class42, Class226.Field8986, n, n2, n5 += Class1419.Field14604, n6++, 1));
        } else {
            this.Field14670.add(new Class691(class42, n, n2, n5, n6++, 1));
            this.Field14670.add(new Class1873(class42, n, n2, n5 += Class1419.Field14604, n6++, 1));
            this.Field14670.add(new Class1286(class42, n, n2, n5 += Class1419.Field14604, n6++, 1));
            n5 += Class1419.Field14604;
            if (Class1796.Field16241.Field16258.Method7571(class42) != null) {
                for (Class44 class44 : Class1796.Field16241.Field16258.Method7571(class42)) {
                    if (class44 == null || class44.Field8086 != null) continue;
                    if (class44.Method382() && class44 instanceof Class1996) {
                        this.Field14670.add(new Class958((Class1996)class44, n, n2, n5, n6++, 1));
                        n5 += Class1419.Field14604;
                    }
                    if (class44.Method387()) {
                        this.Field14670.add(new Class1599(class44, n, n2, n5, n6++, 1));
                        n5 += Class1419.Field14604;
                    }
                    if (class44.Method386()) {
                        this.Field14670.add(new Class2136(class44, n, n2, n5, n6++, 1));
                        n5 += Class1419.Field14604;
                    }
                    if (class44.Method380()) {
                        this.Field14670.add(new Class691(class44, n, n2, n5, n6++, 1));
                        n5 += Class1419.Field14604;
                    }
                    if (class44.Method385()) {
                        this.Field14670.add(new Class502(class44, n, n2, n5, n6++, 1));
                        n5 += Class1419.Field14604;
                    }
                    if (!class44.Method389()) continue;
                    this.Field14670.add(new Class294(class44, n, n2, n5, n6++, 1));
                    n5 += Class1419.Field14604;
                }
            }
        }
        if (!(class42 instanceof Class778)) return;
        Class1729.Field15934 = this;
    }

    @Override
    public void Method623(int n, int n2) {
        if (this.Field14674 && this.Field14672 != null) {
            this.Field14672.Method623(n, n2);
        }
        Class753.drawRectWH(this.Field14675, this.Field14676 + this.Field14677, Double.longBitsToDouble((long)900211273 ^ 0x405E000035A82249L), Class1419.Field14604, Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            if (this.Field14671.Method35()) {
                Class753.drawAbstract(new Class211(new Class340(new double[]{(double)this.Field14675 + Class1419.Field14601, (double)(this.Field14676 + this.Field14677) + Class1419.Field14602}, new double[]{(double)(this.Field14675 + 120) - Class1419.Field14601, (double)(this.Field14676 + this.Field14677) + Class1419.Field14602}, new double[]{(double)(this.Field14675 + 120) - Class1419.Field14601, (double)(this.Field14676 + this.Field14677 + Class1419.Field14604) - Class1419.Field14602}, new double[]{(double)this.Field14675 + Class1419.Field14601, (double)(this.Field14676 + this.Field14677 + Class1419.Field14604) - Class1419.Field14602}), Class1172.Method4729(Class1419.Field14584.Method3626(), 30), Class1419.Method1228(this.Field14678).Method3625()));
            }
        } else if (Class1419.Field14594 || this.Field14671.Method35()) {
            Class753.drawRectWH((double)this.Field14675 + Class1419.Field14601, (double)(this.Field14676 + this.Field14677) + Class1419.Field14602, Double.longBitsToDouble(4638144666238189568L) - Class1419.Field14601 * Double.longBitsToDouble((long)1102777295 ^ 0x4000000041BB0BCFL), (double)Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble(0x4000000000000000L), this.Field14671.Method35() ? Class1419.Method1228(this.Field14678).Method3626() : Class1419.Field14586.Method3626());
        }
        Class1419.Method1224(this.Field14671.Method40(), this.Field14675, this.Field14676 + this.Field14677, 120, Class1419.Field14604);
        if (!Class1419.Field14591) {
            if (this.Field14671.Method52()) {
                Class1419.Method1226("beta", this.Field14671.Method40(), this.Field14675, this.Field14676 + this.Field14677, Double.longBitsToDouble((long)601280937 ^ 0x405E000023D6D1A9L) - Class1419.Field14601, Class1419.Field14604, this.Field14678, 1);
            }
            if (this.Field14671.Method53()) {
                Class1419.Method1226("addon", this.Field14671.Method40(), this.Field14675, this.Field14676 + this.Field14677, Double.longBitsToDouble(4638144666238189568L) - Class1419.Field14601, Class1419.Field14604, this.Field14678, 2);
            }
        }
        if (null.Field11809.Method365()) {
            if (Class42.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7141(this.Field14671)) {
                Class1419.Method1226(Class42.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7140(this.Field14671), this.Field14671.Method40(), this.Field14675, this.Field14676 + this.Field14677, Double.longBitsToDouble((long)1813847087 ^ 0x405E00006C1D1C2FL) - Class1419.Field14601, Class1419.Field14604, this.Field14678, 3);
            }
        }
        if (!this.Field14679) return;
        if (this.Field14670.isEmpty()) return;
        Iterator iterator = this.Field14670.iterator();
        while (iterator.hasNext()) {
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            class1520.Method623(n, n2);
        }
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (this.Field14674 && this.Field14672 != null) {
            this.Field14672.Method625(n, n2, n3);
        }
        if (this.Method5715(n, n2) && n3 == 0 && this.Field14671.Field8062) {
            this.Field14671.Method22();
        }
        if (this.Method5715(n, n2) && n3 == 1) {
            this.Field14679 = !this.Field14679;
        }
        if (!this.Field14679) return;
        if (this.Field14670.isEmpty()) return;
        Iterator iterator = this.Field14670.iterator();
        while (iterator.hasNext()) {
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            class1520.Method625(n, n2, n3);
        }
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        if (this.Field14674 && this.Field14672 != null) {
            this.Field14672.Method626(n, n2, n3);
        }
        if (!this.Field14679) return;
        if (this.Field14670.isEmpty()) return;
        Iterator iterator = this.Field14670.iterator();
        while (iterator.hasNext()) {
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            class1520.Method626(n, n2, n3);
        }
    }

    @Override
    public void Method627(int n, int n2) {
        Class1520 class1520;
        this.Field14675 = n;
        this.Field14676 = n2;
        if (!this.Field14679) return;
        if (this.Field14670.isEmpty()) return;
        Iterator iterator = this.Field14670.iterator();
        do {
            if (!iterator.hasNext()) return;
        } while (!(class1520 = (Class1520)iterator.next()).Method641());
        Class1520 class15202 = class1520;
        int n3 = n;
        int n4 = class1520.Method640();
        return (void)(n4 * 5);
    }

    @Override
    public void Method628(char c, int n) {
        if (!this.Field14679) return;
        if (this.Field14670.isEmpty()) return;
        Iterator iterator = this.Field14670.iterator();
        while (iterator.hasNext()) {
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            class1520.Method628(c, n);
        }
    }

    @Override
    public void Method629(int n) {
        this.Field14677 = n;
    }

    @Override
    public int Method631() {
        return Class1419.Field14604 + this.Method5714() * Class1419.Field14604;
    }

    @Override
    public void Method630(int n) {
        this.Field14678 = n;
        this.Field14673.Method630(n);
    }

    @Override
    public int Method633() {
        return this.Field14678;
    }

    public int Method5714() {
        int n = 0;
        Iterator iterator = this.Field14670.iterator();
        while (iterator.hasNext()) {
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            ++n;
        }
        return n;
    }

    public boolean Method5715(int n, int n2) {
        if (n <= this.Field14675) return false;
        if (n >= this.Field14675 + 120) return false;
        if (n2 <= this.Field14676 + this.Field14677) return false;
        if (n2 >= this.Field14676 + Class1419.Field14604 + this.Field14677) return false;
        return true;
    }

    @Override
    public void Method637(int n) {
        this.Field14676 = n;
    }

    @Override
    public int Method638() {
        return this.Field14676 + this.Field14677;
    }

    @Override
    public boolean Method1668() {
        return this.Field14679;
    }

    @Override
    public void Method635(int n) {
        this.Field14675 = n;
    }

    @Override
    public int Method636() {
        return this.Field14675;
    }

    @Override
    @NotNull
    @NotNull
    public ArrayList Method1669() {
        return this.Field14670;
    }

    @Override
    public boolean Method641() {
        if (!Class1419.Method1234(this)) return false;
        if (!Class1419.Method1233(this.Field14671.Method40())) return false;
        return true;
    }

    private static String Method5716(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 152;
            cArray2[n] = (char)(cArray[n] ^ (0x69A5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

