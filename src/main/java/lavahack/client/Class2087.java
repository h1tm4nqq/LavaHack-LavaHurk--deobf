//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.event.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;

public class Class2087 extends Class2157
{
    private BlockPos Field17527;
    private EnumFacing Field17528;
    private float Field17529;
    private int Field17530;
    private String Field17531 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2087(final BlockPos field17527, final EnumFacing field17528, final float field17529, final int field17530) {
        super(new Object[0]);
        this.Field17527 = field17527;
        this.Field17528 = field17528;
        this.Field17529 = field17529;
        this.Field17530 = field17530;
    }
    
    public Class2087(final BlockPos blockPos, final EnumFacing enumFacing) {
        this(blockPos, enumFacing, 0.0f, 0);
    }
    
    public BlockPos Method7625() {
        return this.Field17527;
    }
    
    public EnumFacing Method7626() {
        return this.Field17528;
    }
    
    public float Method7627() {
        return this.Field17529;
    }
    
    public int Method7628() {
        return this.Field17530;
    }
}
