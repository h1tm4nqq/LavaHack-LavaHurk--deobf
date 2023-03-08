//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1315 implements Class1520
{
    public final String Field14052;
    private int Field14053;
    private String Field14054 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1315(final String field14052, final int field14053) {
        this.Field14052 = field14052;
        this.Field14053 = field14053;
    }
    
    @Override
    public void Method623(final int n, final int n2) {
        final int method4741 = Class1178.Method4741(this.Field14052);
        Class753.drawRectWH(n + 5, n2, method4741, Class1419.Field14604, Class1419.Method1228(this.Field14053).Method3626());
        if (Class1419.Field14590) {
            Class753.drawAbstract(new Class211(new Class340(new double[] { n - Class1419.Field14605 + 5, n2 }, new double[] { n + 5, n2 }, new double[] { n + 5, n2 + Class1419.Field14604 }, new double[] { n + 5 - Class1419.Field14605, n2 + Class1419.Field14604 }), Class1172.Method4728(Class1419.Method1228(this.Field14053).Method3625(), 0), Class1419.Method1228(this.Field14053).Method3625()));
            Class753.drawAbstract(new Class211(new Class340(new double[] { n + 5 + method4741, n2 }, new double[] { n + method4741 + 5 + Class1419.Field14605, n2 }, new double[] { n + 5 + method4741 + Class1419.Field14605, n2 + Class1419.Field14604 }, new double[] { n + method4741 + 5, n2 + Class1419.Field14604 }), Class1419.Method1228(this.Field14053).Method3625(), Class1172.Method4728(Class1419.Method1228(this.Field14053).Method3625(), 0)));
        }
        Class1419.Method1227(this.Field14052, n, n2, method4741 + Class1419.Field14605 * 2, Class1419.Field14604);
    }
    
    @Override
    public void Method630(final int field14053) {
        this.Field14053 = field14053;
    }
}
