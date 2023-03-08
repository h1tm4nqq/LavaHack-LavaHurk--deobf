//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import io.netty.buffer.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.tileentity.*;

public class Class219 extends Class1123
{
    private String Field8956 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public boolean Method1265(final EntityPlayer entityPlayer, final World world, final BlockPos blockPos, final World world2, final BlockPos blockPos2) {
        final TileEntity getTileEntity = world.getTileEntity(blockPos);
        final TileEntity getTileEntity2 = world2.getTileEntity(blockPos2);
        if (getTileEntity instanceof TileEntityCommandBlock && getTileEntity2 instanceof TileEntityCommandBlock) {
            final CommandBlockBaseLogic getCommandBlockLogic = ((TileEntityCommandBlock)getTileEntity).getCommandBlockLogic();
            final CommandBlockBaseLogic getCommandBlockLogic2 = ((TileEntityCommandBlock)getTileEntity2).getCommandBlockLogic();
            if (!getCommandBlockLogic.getCommand().equals(getCommandBlockLogic2.getCommand())) {
                final PacketBuffer packetBuffer = new PacketBuffer(Unpooled.buffer());
                packetBuffer.writeByte(getCommandBlockLogic2.getCommandBlockType());
                getCommandBlockLogic2.fillInInfo((ByteBuf)packetBuffer);
                packetBuffer.writeString(getCommandBlockLogic.getCommand());
                packetBuffer.writeBoolean(getCommandBlockLogic2.shouldTrackOutput());
                return this.Method1266((Packet)new CPacketCustomPayload("MC|AdvCdm", packetBuffer));
            }
        }
        return false;
    }
    
    private static String Method1267(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4CCE ^ 0xC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
