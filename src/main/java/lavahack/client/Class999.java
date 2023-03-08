//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.item.*;

class Class999
{
    private final EntityEnderCrystal Field12291;
    private final double Field12292;
    private final double Field12293;
    private String Field12294 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class999(final EntityEnderCrystal field12291, final double field12292, final double field12293) {
        this.Field12291 = field12291;
        this.Field12292 = field12292;
        this.Field12293 = field12293;
    }
    
    public EntityEnderCrystal Method4036() {
        return this.Field12291;
    }
    
    public double Method4037() {
        return this.Field12292;
    }
    
    public double Method4038() {
        return this.Field12293;
    }
    
    public Class999 Method4039(final Class999 class999) {
        return (class999.Field12292 > this.Field12292) ? class999 : this;
    }
}
