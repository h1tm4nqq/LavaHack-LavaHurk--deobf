//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import net.minecraft.init.*;

class Class1271
{
    public final EntityPlayer Field13738;
    public double Field13739;
    public boolean Field13740;
    public boolean Field13741;
    private String Field13742 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1271(final EntityPlayer field13738, final double field13739) {
        this.Field13741 = false;
        this.Field13738 = field13738;
        this.Field13739 = field13739;
        this.Field13740 = false;
    }
    
    public Class1271(final EntityPlayer field13738, final double field13739, final boolean field13740) {
        this.Field13741 = false;
        this.Field13738 = field13738;
        this.Field13739 = field13739;
        if (field13740) {
            this.Field13741 = (!Class1416.Method5665().player.getHeldItemMainhand().getItem().equals(Items.TOTEM_OF_UNDYING) && !Class1416.Method5666().player.getHeldItemMainhand().getItem().equals(Items.TOTEM_OF_UNDYING));
        }
        this.Field13740 = field13740;
    }
}
