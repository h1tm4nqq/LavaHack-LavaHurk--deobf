//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import java.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.text.*;

public class Class725 extends Class1123
{
    private String Field11085 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public boolean Method1265(final EntityPlayer entityPlayer, final World world, final BlockPos blockPos, final World world2, final BlockPos blockPos2) {
        final TileEntity getTileEntity = world.getTileEntity(blockPos);
        final TileEntity getTileEntity2 = world2.getTileEntity(blockPos2);
        if (getTileEntity instanceof TileEntitySign && getTileEntity2 instanceof TileEntitySign) {
            final ITextComponent[] signText = ((TileEntitySign)getTileEntity).signText;
            if (!Arrays.equals(signText, ((TileEntitySign)getTileEntity2).signText)) {
                return this.Method1266((Packet)new CPacketUpdateSign(blockPos2, signText));
            }
        }
        return false;
    }
}
