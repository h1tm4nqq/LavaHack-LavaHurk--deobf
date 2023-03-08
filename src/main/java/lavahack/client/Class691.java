//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

public class Class691 implements Class1520
{
    private final Class695 Field10913;
    private int Field10914;
    private int Field10915;
    private int Field10916;
    private int Field10917;
    private boolean Field10918;
    private int Field10919;
    private int Field10920;
    public BooleanSupplier Field10921;
    private String Field10922 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class691(final Class695 field10913, final int field10914, final int field10915, final int field10916, final int field10917, final int field10918) {
        this.Field10919 = 120;
        this.Field10921 = null;
        this.Field10913 = field10913;
        this.Field10914 = field10914;
        this.Field10915 = field10915;
        this.Field10916 = field10916;
        this.Field10917 = field10917;
        this.Field10920 = field10918;
        this.Field10919 = Class981.Method3992(field10918, this.Field10919);
    }
    
    public Class691 Method2903(final BooleanSupplier field10921) {
        this.Field10921 = field10921;
        return this;
    }
    
    public void Method623(final int n, final int n2) {
        super.Method623(n, n2);
        Class753.drawRectWH(this.Field10914, this.Field10915 + this.Field10916, this.Field10919, Class1419.Field14604, Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            if (this.Field10918) {
                Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field10914 + Class1419.Field14601, this.Field10915 + this.Field10916 + Class1419.Field14602 }, new double[] { this.Field10914 + this.Field10919 - Class1419.Field14601, this.Field10915 + this.Field10916 + Class1419.Field14602 }, new double[] { this.Field10914 + this.Field10919 - Class1419.Field14601, this.Field10915 + this.Field10916 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Field10914 + Class1419.Field14601, this.Field10915 + this.Field10916 + Class1419.Field14604 - Class1419.Field14602 }), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field10917).Method3625()));
            }
        }
        else if (Class1419.Field14594 || this.Field10918) {
            Class753.drawRectWH(this.Field10914 + Class1419.Field14601, this.Field10915 + this.Field10916 + Class1419.Field14602, this.Field10919 - Class1419.Field14601 * Double.longBitsToDouble((long)1200807584 ^ 0x400000004792DEA0L), Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble(4611686018427387904L), this.Field10918 ? Class1419.Method1228(this.Field10917).Method3626() : Class1419.Field14584.Method3626());
        }
        String string;
        if (this.Field10918) {
            string = "Press a key...";
        }
        else {
            final StringBuilder append = new StringBuilder().append(this.Field10913.Method16()).append(": ");
            final Class695 field10913 = this.Field10913;
            string = append.append(Class695.Field10935.Method7140(this.Field10913)).toString();
        }
        Class1419.Method1224(string, this.Field10914, this.Field10915 + this.Field10916, this.Field10919, Class1419.Field14604);
    }
    
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Method2904(n, n2) && n3 == 0) {
            this.Field10918 = !this.Field10918;
        }
        if (this.Method2904(n, n2) && n3 == 1) {
            this.Field10918 = false;
            this.Field10913.Method13(Class955.Field12068);
            this.Field10913.Method9(0);
            this.Field10913.Method11(-1);
        }
        if (n3 > 1 && this.Field10918) {
            this.Field10918 = false;
            this.Field10913.Method13(Class955.Field12069);
            this.Field10913.Method11(n3);
        }
    }
    
    public void Method628(final char c, final int n) {
        if (this.Field10918) {
            this.Field10918 = false;
            this.Field10913.Method13(Class955.Field12068);
            this.Field10913.Method9(n);
        }
    }
    
    public void Method627(final int field10914, final int field10915) {
        this.Field10914 = field10914;
        this.Field10915 = field10915;
    }
    
    public void Method629(final int field10916) {
        this.Field10916 = field10916;
    }
    
    public int Method631() {
        return Class1419.Field14604;
    }
    
    public boolean Method641() {
        return (this.Field10921 != null) ? this.Field10921.getAsBoolean() : (!(this.Field10913 instanceof Class44) || (((Class44)this.Field10913).Method311() && Class1419.Method1233(((Class44)this.Field10913).Method354())));
    }
    
    public void Method630(final int field10917) {
        this.Field10917 = field10917;
    }
    
    public int Method633() {
        return this.Field10917;
    }
    
    public void Method634(final int field10919) {
        this.Field10919 = field10919;
    }
    
    public void Method635(final int field10914) {
        this.Field10914 = field10914;
    }
    
    public int Method636() {
        return this.Field10914;
    }
    
    public void Method639(final int field10920) {
        this.Field10920 = field10920;
    }
    
    public int Method640() {
        return this.Field10920;
    }
    
    private boolean Method2904(final int n, final int n2) {
        return n > this.Field10914 && n < this.Field10914 + this.Field10919 && n2 > this.Field10915 + this.Field10916 && n2 < this.Field10915 + this.Field10916 + Class1419.Field14604;
    }
    
    public void Method637(final int field10915) {
        this.Field10915 = field10915;
    }
    
    public int Method638() {
        return this.Field10915 + this.Field10916;
    }
    
    private static String Method2905(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x180E ^ 0xBE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
