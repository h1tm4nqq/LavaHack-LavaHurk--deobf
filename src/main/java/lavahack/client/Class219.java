//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.network.play.client.CPacketCustomPayload
 *  net.minecraft.tileentity.CommandBlockBaseLogic
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityCommandBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lavahack.client.Class1123;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.CPacketCustomPayload;
import net.minecraft.tileentity.CommandBlockBaseLogic;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class219
extends Class1123 {
    private String Field8956 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public boolean Method1265(EntityPlayer entityPlayer, World world, BlockPos blockPos, World world2, BlockPos blockPos2) {
        TileEntity tileEntity = world.getTileEntity(blockPos);
        TileEntity tileEntity2 = world2.getTileEntity(blockPos2);
        if (!(tileEntity instanceof TileEntityCommandBlock)) return false;
        if (!(tileEntity2 instanceof TileEntityCommandBlock)) return false;
        CommandBlockBaseLogic commandBlockBaseLogic = ((TileEntityCommandBlock)tileEntity).getCommandBlockLogic();
        CommandBlockBaseLogic commandBlockBaseLogic2 = ((TileEntityCommandBlock)tileEntity2).getCommandBlockLogic();
        if (commandBlockBaseLogic.getCommand().equals(commandBlockBaseLogic2.getCommand())) return false;
        PacketBuffer packetBuffer = new PacketBuffer(Unpooled.buffer());
        packetBuffer.writeByte(commandBlockBaseLogic2.getCommandBlockType());
        commandBlockBaseLogic2.fillInInfo((ByteBuf)packetBuffer);
        packetBuffer.writeString(commandBlockBaseLogic.getCommand());
        packetBuffer.writeBoolean(commandBlockBaseLogic2.shouldTrackOutput());
        return this.Method1266((Packet)new CPacketCustomPayload("MC|AdvCdm", packetBuffer));
    }

    private static String Method1267(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 12;
            cArray2[n] = (char)(cArray[n] ^ (0x4CCE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

