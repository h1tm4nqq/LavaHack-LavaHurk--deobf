//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.network.*;
import net.minecraft.client.network.*;

public abstract class Class1123
{
    protected final Minecraft Field13043;
    private String Field13044 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1123() {
        this.Field13043 = Minecraft.getMinecraft();
    }
    
    public abstract boolean Method1265(final EntityPlayer p0, final World p1, final BlockPos p2, final World p3, final BlockPos p4);
    
    public final boolean Method1266(final Packet packet) {
        final NetHandlerPlayClient getConnection = this.Field13043.getConnection();
        if (getConnection == null) {
            return false;
        }
        getConnection.sendPacket(packet);
        return true;
    }
}
