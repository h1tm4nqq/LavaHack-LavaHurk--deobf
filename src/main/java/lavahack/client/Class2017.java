//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class2017 implements Class1520
{
    private final Class1089 Field17280;
    private final Class480 Field17281;
    private int Field17282;
    private int Field17283;
    private int Field17284;
    private int Field17285;
    private int Field17286;
    private int Field17287;
    private String Field17288 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2017(final Class1089 field17280, final Class480 field17281, final int field17282, final int field17283, final int field17284, final int field17285, final int field17286) {
        this.Field17286 = 120;
        this.Field17280 = field17280;
        this.Field17281 = field17281;
        this.Field17282 = field17282;
        this.Field17283 = field17283;
        this.Field17285 = field17284;
        this.Field17284 = field17285;
        this.Field17287 = field17286;
        this.Field17286 = Class981.Method3992(field17286, this.Field17286);
    }
    
    public void Method623(final int n, final int n2) {
        super.Method623(n, n2);
        if (Class1419.Field14590) {
            Class753.drawRectWH(this.Field17282, this.Field17283 + this.Field17285, this.Field17286, Class1419.Field14604, Class1419.Field14584.Method3626());
            Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field17282, this.Field17283 + this.Field17285 }, new double[] { this.Field17282 + this.Field17286 / 2, this.Field17283 + this.Field17285 }, new double[] { this.Field17282 + this.Field17286 / 2, this.Field17283 + this.Field17285 + Class1419.Field14604 }, new double[] { this.Field17282, this.Field17283 + this.Field17285 + Class1419.Field14604 }), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field17284).Method3625()));
            Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field17282 + this.Field17286 / 2, this.Field17283 + this.Field17285 }, new double[] { this.Field17282 + this.Field17286, this.Field17283 + this.Field17285 }, new double[] { this.Field17282 + this.Field17286, this.Field17283 + this.Field17285 + Class1419.Field14604 }, new double[] { this.Field17282 + this.Field17286 / 2, this.Field17283 + this.Field17285 + Class1419.Field14604 }), Class1419.Method1228(this.Field17284).Method3625(), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335())));
        }
        else {
            Class753.drawRectWH(this.Field17282, this.Field17283 + this.Field17285, this.Field17286, Class1419.Field14604, Class1419.Method1228(this.Field17284).Method3626());
        }
        Class1419.Method1224(this.Field17281.Field10005, this.Field17282, this.Field17283 + this.Field17285, this.Field17286, Class1419.Field14604);
    }
    
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Method7473(n, n2) && n3 == 0) {
            switch (Class1166.Field13263[this.Field17281.ordinal()]) {
                case 1: {
                    this.Field17280.Method20();
                    break;
                }
                case 2: {
                    this.Field17280.Method4454(true);
                    break;
                }
            }
        }
    }
    
    public void Method629(final int field17285) {
        this.Field17285 = field17285;
    }
    
    public void Method630(final int field17284) {
        this.Field17284 = field17284;
    }
    
    public int Method631() {
        return Class1419.Field14604;
    }
    
    public int Method633() {
        return this.Field17284;
    }
    
    public void Method634(final int field17286) {
        this.Field17286 = field17286;
    }
    
    public void Method635(final int field17282) {
        this.Field17282 = field17282;
    }
    
    public int Method636() {
        return this.Field17282;
    }
    
    public void Method639(final int field17287) {
        this.Field17287 = field17287;
    }
    
    public int Method640() {
        return this.Field17287;
    }
    
    public void Method627(final int field17282, final int field17283) {
        this.Field17282 = field17282;
        this.Field17283 = field17283;
    }
    
    private boolean Method7473(final int n, final int n2) {
        return n > this.Field17282 && n < this.Field17282 + this.Field17286 && n2 > this.Field17283 + this.Field17285 && n2 < this.Field17283 + this.Field17285 + Class1419.Field14604;
    }
    
    public boolean Method641() {
        return Class1419.Method1233(this.Field17281.Field10005);
    }
    
    public void Method637(final int field17283) {
        this.Field17283 = field17283;
    }
    
    public int Method638() {
        return this.Field17283 + this.Field17285;
    }
}
