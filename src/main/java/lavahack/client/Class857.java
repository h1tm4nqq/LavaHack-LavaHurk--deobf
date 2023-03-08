//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class857
{
    public final Class686 Field11615;
    public final String Field11616;
    public final int Field11617;
    public final int Field11618;
    public final int Field11619;
    public Class1205 Field11620;
    public int Field11621;
    public int Field11622;
    public int Field11623;
    public int Field11624;
    public int Field11625;
    private String Field11626 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class857(final Class686 field11615, final String field11616) {
        this.Field11620 = Class1205.Field13466;
        this.Field11621 = 0;
        this.Field11622 = 0;
        this.Field11623 = 0;
        this.Field11624 = 0;
        this.Field11625 = 0;
        this.Field11615 = field11615;
        this.Field11616 = field11616;
        this.Field11617 = field11615.Method2891();
        this.Field11618 = field11615.Method2893();
        this.Field11619 = field11615.Method2892();
    }
    
    public boolean Method3605(final int n, final int n2, final int n3) {
        if (n == this.Field11623 && n2 == this.Field11624 && n3 == this.Field11625) {
            this.Method3606(Class1205.Field13468);
            this.Field11623 += 16;
            if (this.Field11623 >= this.Field11617) {
                this.Field11623 = 0;
                this.Field11624 += 16;
                if (this.Field11624 >= this.Field11618) {
                    this.Field11624 = 0;
                    this.Field11625 += 16;
                    if (this.Field11625 >= this.Field11619) {
                        this.Method3606(Class1205.Field13470);
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public void Method3606(final Class1205 field11620) {
        this.Field11620 = field11620;
        this.Field11621 = 0;
        this.Field11622 = 0;
    }
}
