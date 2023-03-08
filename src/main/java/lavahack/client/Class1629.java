//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.client.*;
import net.minecraftforge.common.*;

public abstract class Class1629 implements Class1320
{
    public static Supplier Field15608;
    protected static final Minecraft Field15609;
    protected Class52 Field15610;
    protected Class1996 Field15611;
    private final String Field15612;
    protected Class44 Field15613;
    private final boolean Field15614;
    private final boolean Field15615;
    private String Field15616 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1629(final Class1996 field15611, final String field15612, final boolean field15613, final boolean field15614) {
        this.Field15610 = Class1629.Field15608.get();
        this.Field15611 = field15611;
        this.Field15612 = field15612;
        this.Field15614 = field15613;
        this.Field15615 = field15614;
        this.Field15613 = this.Field15610.Method23(field15611.Method7405(new Class44(this.Field15612, this.Field15610, false)));
    }
    
    public boolean Method6362() {
        return this.Field15613.Method365();
    }
    
    protected Class44 Method6363(final Class44 class44) {
        return this.Field15610.Method23(this.Field15611.Method7405(class44.Method313(this.Field15613::Method365)));
    }
    
    public void Method6364() {
        if (this.Field15614) {
            MinecraftForge.EVENT_BUS.register((Object)this);
        }
        if (this.Field15615) {
            Class1796.Field16242.Method705((Class1320)this);
        }
    }
    
    public void Method6365() {
        if (this.Field15614) {
            MinecraftForge.EVENT_BUS.unregister((Object)this);
        }
        if (this.Field15615) {
            Class1796.Field16242.Method710((Class1320)this);
        }
    }
    
    public void Method6366() {
    }
    
    static {
        Field15609 = Minecraft.getMinecraft();
    }
}
