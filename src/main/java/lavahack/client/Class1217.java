//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1217
{
    public double Field13516;
    public double Field13517;
    public double Field13518;
    private int Field13519;
    
    public Class1217(final double field13516, final double field13517, final double field13518) {
        this.Field13516 = field13516;
        this.Field13517 = field13517;
        this.Field13518 = field13518;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class1217) {
            final Class1217 class1217 = (Class1217)o;
            return class1217.Field13516 == this.Field13516 && class1217.Field13517 == this.Field13517 && class1217.Field13518 == this.Field13518;
        }
        return false;
    }
    
    public void Method4914() {
        this.Field13516 = (double)Math.round(this.Field13516);
        this.Field13517 = (double)Math.round(this.Field13517);
        this.Field13518 = (double)Math.round(this.Field13518);
    }
}
