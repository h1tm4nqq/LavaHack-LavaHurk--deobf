//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1847 implements Class1520
{
    private final Class1096 Field16512;
    private final Class226 Field16513;
    private int Field16514;
    private int Field16515;
    private int Field16516;
    private int Field16517;
    private int Field16518;
    private int Field16519;
    private String Field16520 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1847(final Class1096 field16512, final Class226 field16513, final int field16514, final int field16515, final int field16516, final int field16517, final int field16518) {
        this.Field16518 = 120;
        this.Field16512 = field16512;
        this.Field16513 = field16513;
        this.Field16514 = field16514;
        this.Field16515 = field16515;
        this.Field16517 = field16516;
        this.Field16516 = field16517;
        this.Field16519 = field16518;
        this.Field16518 = Class981.Method3992(field16518, this.Field16518);
    }
    
    public void Method623(final int n, final int n2) {
        super.Method623(n, n2);
        if (Class1419.Field14590) {
            Class753.drawRectWH(this.Field16514, this.Field16515 + this.Field16517, this.Field16518, Class1419.Field14604, Class1419.Field14584.Method3626());
            Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field16514, this.Field16515 + this.Field16517 }, new double[] { this.Field16514 + this.Field16518 / 2, this.Field16515 + this.Field16517 }, new double[] { this.Field16514 + this.Field16518 / 2, this.Field16515 + this.Field16517 + Class1419.Field14604 }, new double[] { this.Field16514, this.Field16515 + this.Field16517 + Class1419.Field14604 }), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), Class1419.Method1228(this.Field16516).Method3625()));
            Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field16514 + this.Field16518 / 2, this.Field16515 + this.Field16517 }, new double[] { this.Field16514 + this.Field16518, this.Field16515 + this.Field16517 }, new double[] { this.Field16514 + this.Field16518, this.Field16515 + this.Field16517 + Class1419.Field14604 }, new double[] { this.Field16514 + this.Field16518 / 2, this.Field16515 + this.Field16517 + Class1419.Field14604 }), Class1419.Method1228(this.Field16516).Method3625(), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335())));
        }
        else {
            Class753.drawRectWH(this.Field16514, this.Field16515 + this.Field16517, this.Field16518, Class1419.Field14604, Class1419.Method1228(this.Field16516).Method3626());
        }
        Class1419.Method1224(this.Field16513.Field8987, this.Field16514, this.Field16515 + this.Field16517, this.Field16518, Class1419.Field14604);
    }
    
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Method6941(n, n2) && n3 == 0) {
            switch (Class2093.Field17548[this.Field16513.ordinal()]) {
                case 1: {
                    this.Field16512.Method4489();
                    break;
                }
                case 2: {
                    this.Field16512.Method4490();
                    break;
                }
                case 3: {
                    this.Field16512.Method4491();
                    break;
                }
            }
        }
    }
    
    public void Method629(final int field16517) {
        this.Field16517 = field16517;
    }
    
    public void Method630(final int field16516) {
        this.Field16516 = field16516;
    }
    
    public int Method631() {
        return Class1419.Field14604;
    }
    
    public int Method633() {
        return this.Field16516;
    }
    
    public boolean Method641() {
        return this.Field16512.Method27() == (this.Field16513 != Class226.Field8984) && Class1419.Method1233(this.Field16513.Field8987);
    }
    
    public void Method634(final int field16518) {
        this.Field16518 = field16518;
    }
    
    public void Method635(final int field16514) {
        this.Field16514 = field16514;
    }
    
    public int Method636() {
        return this.Field16514;
    }
    
    public void Method639(final int field16519) {
        this.Field16519 = field16519;
    }
    
    public int Method640() {
        return this.Field16519;
    }
    
    public void Method627(final int field16514, final int field16515) {
        this.Field16514 = field16514;
        this.Field16515 = field16515;
    }
    
    private boolean Method6941(final int n, final int n2) {
        return n > this.Field16514 && n < this.Field16514 + this.Field16518 && n2 > this.Field16515 + this.Field16517 && n2 < this.Field16515 + this.Field16517 + Class1419.Field14604;
    }
    
    public void Method637(final int field16515) {
        this.Field16515 = field16515;
    }
    
    public int Method638() {
        return this.Field16515 + this.Field16517;
    }
}
