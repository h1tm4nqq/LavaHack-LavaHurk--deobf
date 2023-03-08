//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import org.jetbrains.annotations.*;

public class Class1429 implements Class337
{
    public final ArrayList Field14670;
    public final Class42 Field14671;
    public final Class2164 Field14672;
    public final Class1315 Field14673;
    public final boolean Field14674;
    public int Field14675;
    public int Field14676;
    public int Field14677;
    public int Field14678;
    public boolean Field14679;
    private String Field14680 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1429(final Class42 field14671, final int field14672, final int field14673, final int field14674, final int field14675) {
        this.Field14670 = new ArrayList();
        this.Field14679 = false;
        this.Field14671 = field14671;
        this.Field14674 = (field14671 instanceof Class1249);
        this.Field14672 = (this.Field14674 ? new Class2164((Class1249)field14671) : null);
        this.Field14673 = new Class1315(field14671.Method31(), field14675);
        this.Field14675 = field14672;
        this.Field14676 = field14673;
        this.Field14677 = field14674;
        this.Field14678 = field14675;
        final int n = field14674 + Class1419.Field14604;
        int n2 = 0;
        if (field14671 instanceof Class1089) {
            this.Field14670.add(new Class2017((Class1089)field14671, Class480.Field10003, field14672, field14673, n, n2++, 1));
            this.Field14670.add(new Class2017((Class1089)field14671, Class480.Field10004, field14672, field14673, n + Class1419.Field14604, n2++, 1));
        }
        else if (field14671 instanceof Class1096) {
            this.Field14670.add(new Class1847((Class1096)field14671, Class226.Field8984, field14672, field14673, n, n2++, 1));
            final int n3 = n + Class1419.Field14604;
            this.Field14670.add(new Class1847((Class1096)field14671, Class226.Field8985, field14672, field14673, n3, n2++, 1));
            this.Field14670.add(new Class1847((Class1096)field14671, Class226.Field8986, field14672, field14673, n3 + Class1419.Field14604, n2++, 1));
        }
        else {
            this.Field14670.add(new Class691(field14671, field14672, field14673, n, n2++, 1));
            final int n4 = n + Class1419.Field14604;
            this.Field14670.add(new Class1873(field14671, field14672, field14673, n4, n2++, 1));
            final int n5 = n4 + Class1419.Field14604;
            this.Field14670.add(new Class1286(field14671, field14672, field14673, n5, n2++, 1));
            int n6 = n5 + Class1419.Field14604;
            if (Class1796.Field16241.Field16258.Method7571(field14671) != null) {
                for (final Class44 class44 : Class1796.Field16241.Field16258.Method7571(field14671)) {
                    if (class44 != null) {
                        if (class44.Field8086 != null) {
                            continue;
                        }
                        if (class44.Method382() && class44 instanceof Class1996) {
                            this.Field14670.add(new Class958((Class1996)class44, field14672, field14673, n6, n2++, 1));
                            n6 += Class1419.Field14604;
                        }
                        if (class44.Method387()) {
                            this.Field14670.add(new Class1599(class44, field14672, field14673, n6, n2++, 1));
                            n6 += Class1419.Field14604;
                        }
                        if (class44.Method386()) {
                            this.Field14670.add(new Class2136(class44, field14672, field14673, n6, n2++, 1));
                            n6 += Class1419.Field14604;
                        }
                        if (class44.Method380()) {
                            this.Field14670.add(new Class691(class44, field14672, field14673, n6, n2++, 1));
                            n6 += Class1419.Field14604;
                        }
                        if (class44.Method385()) {
                            this.Field14670.add(new Class502(class44, field14672, field14673, n6, n2++, 1));
                            n6 += Class1419.Field14604;
                        }
                        if (!class44.Method389()) {
                            continue;
                        }
                        this.Field14670.add(new Class294(class44, field14672, field14673, n6, n2++, 1));
                        n6 += Class1419.Field14604;
                    }
                }
            }
        }
        if (field14671 instanceof Class778) {
            Class1729.Field15934 = this;
        }
    }
    
    @Override
    public void Method623(final int n, final int n2) {
        if (this.Field14674 && this.Field14672 != null) {
            this.Field14672.Method623(n, n2);
        }
        Class753.drawRectWH(this.Field14675, this.Field14676 + this.Field14677, Double.longBitsToDouble((long)900211273 ^ 0x405E000035A82249L), Class1419.Field14604, Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            if (this.Field14671.Method35()) {
                Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field14675 + Class1419.Field14601, this.Field14676 + this.Field14677 + Class1419.Field14602 }, new double[] { this.Field14675 + 120 - Class1419.Field14601, this.Field14676 + this.Field14677 + Class1419.Field14602 }, new double[] { this.Field14675 + 120 - Class1419.Field14601, this.Field14676 + this.Field14677 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Field14675 + Class1419.Field14601, this.Field14676 + this.Field14677 + Class1419.Field14604 - Class1419.Field14602 }), Class1172.Method4729(Class1419.Field14584.Method3626(), 30), Class1419.Method1228(this.Field14678).Method3625()));
            }
        }
        else if (Class1419.Field14594 || this.Field14671.Method35()) {
            Class753.drawRectWH(this.Field14675 + Class1419.Field14601, this.Field14676 + this.Field14677 + Class1419.Field14602, Double.longBitsToDouble(4638144666238189568L) - Class1419.Field14601 * Double.longBitsToDouble((long)1102777295 ^ 0x4000000041BB0BCFL), Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble(4611686018427387904L), this.Field14671.Method35() ? Class1419.Method1228(this.Field14678).Method3626() : Class1419.Field14586.Method3626());
        }
        Class1419.Method1224(this.Field14671.Method40(), this.Field14675, this.Field14676 + this.Field14677, 120, Class1419.Field14604);
        if (!Class1419.Field14591) {
            if (this.Field14671.Method52()) {
                Class1419.Method1226("beta", this.Field14671.Method40(), (double)this.Field14675, (double)(this.Field14676 + this.Field14677), Double.longBitsToDouble((long)601280937 ^ 0x405E000023D6D1A9L) - Class1419.Field14601, (double)Class1419.Field14604, this.Field14678, 1);
            }
            if (this.Field14671.Method53()) {
                Class1419.Method1226("addon", this.Field14671.Method40(), (double)this.Field14675, (double)(this.Field14676 + this.Field14677), Double.longBitsToDouble(4638144666238189568L) - Class1419.Field14601, (double)Class1419.Field14604, this.Field14678, 2);
            }
        }
        if (null.Field11809.Method365()) {
            final Class42 field14671 = this.Field14671;
            if (Class42.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7141(this.Field14671)) {
                final Class42 field14672 = this.Field14671;
                Class1419.Method1226(Class42.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7140(this.Field14671), this.Field14671.Method40(), (double)this.Field14675, (double)(this.Field14676 + this.Field14677), Double.longBitsToDouble((long)1813847087 ^ 0x405E00006C1D1C2FL) - Class1419.Field14601, (double)Class1419.Field14604, this.Field14678, 3);
            }
        }
        if (this.Field14679 && !this.Field14670.isEmpty()) {
            for (final Class1520 class1520 : this.Field14670) {
                if (!class1520.Method641()) {
                    continue;
                }
                class1520.Method623(n, n2);
            }
        }
    }
    
    @Override
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Field14674 && this.Field14672 != null) {
            this.Field14672.Method625(n, n2, n3);
        }
        if (this.Method5715(n, n2) && n3 == 0 && this.Field14671.Field8062) {
            this.Field14671.Method22();
        }
        if (this.Method5715(n, n2) && n3 == 1) {
            this.Field14679 = !this.Field14679;
        }
        if (this.Field14679 && !this.Field14670.isEmpty()) {
            for (final Class1520 class1520 : this.Field14670) {
                if (class1520.Method641()) {
                    class1520.Method625(n, n2, n3);
                }
            }
        }
    }
    
    @Override
    public void Method626(final int n, final int n2, final int n3) {
        if (this.Field14674 && this.Field14672 != null) {
            this.Field14672.Method626(n, n2, n3);
        }
        if (this.Field14679 && !this.Field14670.isEmpty()) {
            for (final Class1520 class1520 : this.Field14670) {
                if (class1520.Method641()) {
                    class1520.Method626(n, n2, n3);
                }
            }
        }
    }
    
    @Override
    public void Method627(final int field14675, final int field14676) {
        this.Field14675 = field14675;
        this.Field14676 = field14676;
        if (this.Field14679 && !this.Field14670.isEmpty()) {
            for (final Class1520 class1520 : this.Field14670) {
                if (class1520.Method641()) {
                    return (void)(class1520.Method640() * 5);
                }
            }
        }
    }
    
    @Override
    public void Method628(final char c, final int n) {
        if (this.Field14679 && !this.Field14670.isEmpty()) {
            for (final Class1520 class1520 : this.Field14670) {
                if (class1520.Method641()) {
                    class1520.Method628(c, n);
                }
            }
        }
    }
    
    @Override
    public void Method629(final int field14677) {
        this.Field14677 = field14677;
    }
    
    @Override
    public int Method631() {
        return Class1419.Field14604 + this.Method5714() * Class1419.Field14604;
    }
    
    @Override
    public void Method630(final int field14678) {
        this.Field14678 = field14678;
        this.Field14673.Method630(field14678);
    }
    
    @Override
    public int Method633() {
        return this.Field14678;
    }
    
    public int Method5714() {
        int n = 0;
        final Iterator<Class1520> iterator = (Iterator<Class1520>)this.Field14670.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().Method641()) {
                ++n;
            }
        }
        return n;
    }
    
    public boolean Method5715(final int n, final int n2) {
        return n > this.Field14675 && n < this.Field14675 + 120 && n2 > this.Field14676 + this.Field14677 && n2 < this.Field14676 + Class1419.Field14604 + this.Field14677;
    }
    
    @Override
    public void Method637(final int field14676) {
        this.Field14676 = field14676;
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
    public void Method635(final int field14675) {
        this.Field14675 = field14675;
    }
    
    @Override
    public int Method636() {
        return this.Field14675;
    }
    
    @NotNull
    @NotNull
    @Override
    public ArrayList Method1669() {
        return this.Field14670;
    }
    
    @Override
    public boolean Method641() {
        return Class1419.Method1234((Class337)this) && Class1419.Method1233(this.Field14671.Method40());
    }
    
    private static String Method5716(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x69A5 ^ 0x98));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
