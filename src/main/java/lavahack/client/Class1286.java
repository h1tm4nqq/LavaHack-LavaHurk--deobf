//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1286 implements Class1520
{
    private final Class42 Field13862;
    private int Field13863;
    private int Field13864;
    private int Field13865;
    private int Field13866;
    private int Field13867;
    private final String[] Field13868;
    private boolean Field13869;
    private int Field13870;
    private int Field13871;
    private String Field13872 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1286(final Class42 field13862, final int field13863, final int field13864, final int field13865, final int field13866, final int field13867) {
        this.Field13869 = false;
        this.Field13870 = 120;
        this.Field13862 = field13862;
        this.Field13863 = field13863;
        this.Field13864 = field13864;
        this.Field13865 = field13865;
        this.Field13866 = field13866;
        this.Field13868 = new String[] { "Toggle", "Hold" };
        this.Field13867 = (field13862.Field8065 ? 1 : 0);
        this.Field13871 = field13867;
        this.Field13870 = Class981.Method3992(field13867, this.Field13870);
    }
    
    @Override
    public void Method623(final int n, final int n2) {
        super.Method623(n, n2);
        this.Field13867 = (this.Field13862.Field8065 ? 1 : 0);
        Class753.drawRectWH(this.Field13863, this.Field13864 + this.Field13865, this.Field13870, this.Method631(), Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field13863 + Class1419.Field14601, this.Field13864 + this.Field13865 + Class1419.Field14602 }, new double[] { this.Field13863 + this.Field13870 / 2, this.Field13864 + this.Field13865 + Class1419.Field14602 }, new double[] { this.Field13863 + this.Field13870 / 2, this.Field13864 + this.Field13865 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Field13863 + Class1419.Field14601, this.Field13864 + this.Field13865 + Class1419.Field14604 - Class1419.Field14602 }), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field13866).Method3625()));
            Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field13863 + this.Field13870 / 2, this.Field13864 + this.Field13865 + Class1419.Field14602 }, new double[] { this.Field13863 + this.Field13870 - Class1419.Field14601, this.Field13864 + this.Field13865 + Class1419.Field14602 }, new double[] { this.Field13863 + this.Field13870 - Class1419.Field14601, this.Field13864 + this.Field13865 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Field13863 + this.Field13870 / 2, this.Field13864 + this.Field13865 + Class1419.Field14604 - Class1419.Field14602 }), Class1419.Method1228(this.Field13866).Method3625(), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335())));
        }
        else {
            Class753.drawRectWH(this.Field13863 + Class1419.Field14601, this.Field13864 + this.Field13865 + Class1419.Field14602, this.Field13870 - Class1419.Field14601 * Double.longBitsToDouble(4611686018427387904L), Class1419.Field14604 - Class1419.Field14602 * Double.longBitsToDouble((long)1611830136 ^ 0x4000000060129378L), Class1419.Method1228(this.Field13866).Method3626());
        }
        Class1419.Method1224("Bind Mode: " + this.Field13868[this.Field13867], this.Field13863, this.Field13864 + this.Field13865, this.Field13870, Class1419.Field14604);
        if (this.Field13869) {
            int n3 = this.Field13865 + Class1419.Field14604;
            for (int i = 0; i < this.Field13868.length; ++i) {
                if (i != this.Field13867) {
                    Class1419.Method1227(this.Field13868[i], this.Field13863, this.Field13864 + n3, this.Field13870, Class1419.Field14604);
                    n3 += Class1419.Field14604;
                }
            }
        }
    }
    
    @Override
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Method5229(n, n2) && n3 == 0) {
            this.Field13869 = !this.Field13869;
        }
        else if (this.Method5230(n, n2) && n3 == 0 && this.Field13869) {
            int n4 = this.Field13864 + this.Field13865 + Class1419.Field14604;
            for (int i = 0; i < this.Field13868.length; ++i) {
                if (i != this.Field13867) {
                    if (n2 >= n4 && n2 <= n4 + Class1419.Field14604) {
                        this.Field13867 = i;
                        this.Field13869 = false;
                        this.Field13862.Field8065 = this.Field13868[i].equals(this.Field13868[1]);
                        break;
                    }
                    n4 += Class1419.Field14604;
                }
            }
        }
    }
    
    @Override
    public void Method627(final int field13863, final int field13864) {
        this.Field13863 = field13863;
        this.Field13864 = field13864;
    }
    
    @Override
    public void Method629(final int field13865) {
        this.Field13865 = field13865;
    }
    
    @Override
    public void Method630(final int field13866) {
        this.Field13866 = field13866;
    }
    
    @Override
    public int Method631() {
        return Class1419.Field14604 + (this.Field13869 ? ((this.Field13868.length - 1) * Class1419.Field14604) : 0);
    }
    
    @Override
    public int Method633() {
        return this.Field13866;
    }
    
    @Override
    public boolean Method641() {
        return true;
    }
    
    @Override
    public void Method634(final int field13870) {
        this.Field13870 = field13870;
    }
    
    @Override
    public void Method635(final int field13863) {
        this.Field13863 = field13863;
    }
    
    @Override
    public int Method636() {
        return this.Field13863;
    }
    
    @Override
    public void Method639(final int field13871) {
        this.Field13871 = field13871;
    }
    
    @Override
    public int Method640() {
        return this.Field13871;
    }
    
    private boolean Method5229(final int n, final int n2) {
        return n > this.Field13863 && n < this.Field13863 + this.Field13870 && n2 > this.Field13864 + this.Field13865 && n2 < this.Field13864 + this.Field13865 + Class1419.Field14604;
    }
    
    private boolean Method5230(final int n, final int n2) {
        return n > this.Field13863 && n < this.Field13863 + this.Field13870 && n2 > this.Field13864 + this.Field13865 && n2 < this.Field13864 + this.Field13865 + this.Method631();
    }
    
    @Override
    public void Method637(final int field13864) {
        this.Field13864 = field13864;
    }
    
    @Override
    public int Method638() {
        return this.Field13864 + this.Field13865;
    }
    
    private static String Method5231(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5963 ^ 0x9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
