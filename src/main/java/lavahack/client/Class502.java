//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.util.*;
import org.jetbrains.annotations.*;

public class Class502 implements Class337
{
    public final Class44 Field10088;
    public Class801 Field10089;
    private int Field10090;
    private int Field10091;
    private int Field10092;
    private int Field10093;
    public boolean Field10094;
    private int Field10095;
    private int Field10096;
    private int Field10097;
    private final ArrayList Field10098;
    private int Field10099;
    
    public Class502(final Class44 field10088, final int field10089, final int field10090, final int field10091, final int field10092, final int field10093) {
        this.Field10095 = 0;
        this.Field10096 = 120;
        this.Field10098 = new ArrayList();
        this.Field10088 = field10088;
        this.Field10090 = field10089;
        this.Field10091 = field10090;
        this.Field10092 = field10091;
        this.Field10093 = field10092;
        this.Field10097 = field10093;
        this.Field10096 = Class981.Method3992(field10093, this.Field10096);
        int n = 0;
        int n2 = field10091 + Class1419.Field14604;
        int n3 = 0;
        for (final String s : field10088.Field8115.keySet()) {
            ++n3;
            this.Field10098.add(new Class801(this, (Class1929)field10088.Field8115.get(s), s, n, this::Method2313, field10089, field10090, n2, n3, field10093 + 1));
            this.Field10098.add(new Class691((Class695)field10088.Field8115.get(s), field10089, field10090, n2, n3, field10093 + 1).Method2903(this::Method2312));
            n2 += Class1419.Field14604;
            ++n;
        }
        this.Field10089 = (Class801)this.Field10098.stream().filter(Class502::Method2311).findFirst().orElse(this.Field10098.get(0));
    }
    
    public void Method623(final int n, final int n2) {
        super.Method623(n, n2);
        this.Field10089 = (Class801)this.Field10098.stream().filter(this::Method2310).findFirst().orElse(this.Field10098.get(0));
        Class753.drawRectWH(this.Field10090, this.Field10091 + this.Field10092, this.Field10096, Class1419.Field14604, Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field10090 + Class1419.Field14601, this.Field10091 + this.Field10092 + Class1419.Field14602 }, new double[] { this.Field10090 + this.Field10096 / 2, this.Field10091 + this.Field10092 + Class1419.Field14602 }, new double[] { this.Field10090 + this.Field10096 / 2, this.Field10091 + this.Field10092 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Field10090 + Class1419.Field14601, this.Field10091 + this.Field10092 + Class1419.Field14604 - Class1419.Field14602 }), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field10093).Method3625()));
            Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field10090 + this.Field10096 / 2, this.Field10091 + this.Field10092 + Class1419.Field14602 }, new double[] { this.Field10090 + this.Field10096 - Class1419.Field14601, this.Field10091 + this.Field10092 + Class1419.Field14602 }, new double[] { this.Field10090 + this.Field10096 - Class1419.Field14601, this.Field10091 + this.Field10092 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Field10090 + this.Field10096 / 2, this.Field10091 + this.Field10092 + Class1419.Field14604 - Class1419.Field14602 }), Class1419.Method1228(this.Field10093).Method3625(), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335())));
        }
        else {
            Class753.drawRectWH(this.Field10090 + Class1419.Field14601, this.Field10091 + this.Field10092 + Class1419.Field14602, this.Field10096 - Class1419.Field14601 * Double.longBitsToDouble(4611686018427387904L), Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble((long)1039017586 ^ 0x400000003DEE2672L), Class1419.Method1228(this.Field10093).Method3626());
        }
        Class1419.Method1224(this.Field10088.Method354() + ": " + this.Field10089.Method3382(), this.Field10090, this.Field10091 + this.Field10092, this.Field10096, Class1419.Field14604);
        if (this.Field10094) {
            for (final Class1520 class1520 : this.Field10098) {
                if (class1520.Method641()) {
                    class1520.Method623(n, n2);
                }
            }
        }
    }
    
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Method2308(n, n2)) {
            this.Field10094 = !this.Field10094;
            if (n3 == 0) {
                this.Field10095 = 1;
            }
            else if (n3 == 1) {
                this.Field10095 = 2;
            }
        }
        else if (this.Method2309(n, n2) && this.Field10094) {
            for (final Class1520 class1520 : this.Field10098) {
                if (class1520.Method641()) {
                    class1520.Method625(n, n2, n3);
                }
            }
        }
    }
    
    public void Method628(final char c, final int n) {
        if (this.Field10095 == 2) {
            for (final Class1520 class1520 : this.Field10098) {
                if (class1520.Method641()) {
                    class1520.Method628(c, n);
                }
            }
        }
    }
    
    public void Method627(final int field10090, final int field10091) {
        this.Field10090 = field10090;
        this.Field10091 = field10091;
        if (this.Field10094) {
            final Iterator<Class1520> iterator = this.Field10098.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().Method641()) {
                    return (void)(this.Field10097 * 5);
                }
            }
        }
    }
    
    public void Method629(final int field10092) {
        this.Field10092 = field10092;
    }
    
    private int Method2307() {
        int n = 0;
        if (this.Field10094) {
            for (final Class1520 class1520 : this.Field10098) {
                if (class1520.Method641()) {
                    n += class1520.Method631();
                }
            }
        }
        return Class1419.Field14604 + n;
    }
    
    public boolean Method641() {
        return this.Field10088.Method311() && Class1419.Method1233(this.Field10088.Method354());
    }
    
    public void Method630(final int field10093) {
        this.Field10093 = field10093;
    }
    
    public int Method633() {
        return this.Field10093;
    }
    
    public void Method634(final int field10096) {
        this.Field10096 = field10096;
    }
    
    public void Method635(final int field10090) {
        this.Field10090 = field10090;
    }
    
    public int Method636() {
        return this.Field10090;
    }
    
    public void Method639(final int field10097) {
        this.Field10097 = field10097;
    }
    
    public int Method640() {
        return this.Field10097;
    }
    
    private boolean Method2308(final int n, final int n2) {
        return n > this.Field10090 && n < this.Field10090 + this.Field10096 && n2 > this.Field10091 + this.Field10092 && n2 < this.Field10091 + this.Field10092 + Class1419.Field14604;
    }
    
    private boolean Method2309(final int n, final int n2) {
        return n > this.Field10090 && n < this.Field10090 + this.Field10096 && n2 > this.Field10091 + this.Field10092 && n2 < this.Field10091 + this.Field10092 + this.Method2307();
    }
    
    public void Method637(final int field10091) {
        this.Field10091 = field10091;
    }
    
    public int Method638() {
        return this.Field10091 + this.Field10092;
    }
    
    public boolean Method1668() {
        return this.Field10094;
    }
    
    @NotNull
    @NotNull
    public ArrayList Method1669() {
        return this.Field10098;
    }
    
    private boolean Method2310(final Class1520 class1520) {
        return class1520 instanceof Class801 && ((Class801)class1520).Method3382().equals(this.Field10088.Method359());
    }
    
    private static boolean Method2311(final Class44 class44, final Class1520 class45) {
        return class45 instanceof Class801 && ((Class801)class45).Method3382().equals(class44.Method359());
    }
    
    private boolean Method2312() {
        return this.Field10094 && this.Field10095 == 2;
    }
    
    private boolean Method2313() {
        return this.Field10094 && this.Field10095 == 1;
    }
    
    private static String Method2314(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x219D ^ 0x4E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
