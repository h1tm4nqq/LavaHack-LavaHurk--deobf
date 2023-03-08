//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;

class Class1651
{
    private final BlockPos Field15672;
    private final double Field15673;
    private final double Field15674;
    private int Field15675;
    
    public Class1651(final BlockPos field15672, final double field15673, final double field15674) {
        this.Field15672 = field15672;
        this.Field15673 = field15673;
        this.Field15674 = field15674;
    }
    
    public BlockPos Method6401() {
        return this.Field15672;
    }
    
    public double Method6402() {
        return this.Field15673;
    }
    
    public double Method6403() {
        return this.Field15674;
    }
    
    public Class1651 Method6404(final Class1651 class1651) {
        return (class1651.Field15673 > this.Field15673) ? class1651 : this;
    }
    
    static double Method6405(final Class1651 class1651) {
        return class1651.Field15673;
    }
}
