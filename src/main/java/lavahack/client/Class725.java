//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketUpdateSign
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntitySign
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.Arrays;
import lavahack.client.Class1123;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUpdateSign;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class Class725
extends Class1123 {
    private String Field11085 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public boolean Method1265(EntityPlayer entityPlayer, World world, BlockPos blockPos, World world2, BlockPos blockPos2) {
        TileEntity tileEntity = world.getTileEntity(blockPos);
        TileEntity tileEntity2 = world2.getTileEntity(blockPos2);
        if (!(tileEntity instanceof TileEntitySign)) return false;
        if (!(tileEntity2 instanceof TileEntitySign)) return false;
        Object[] objectArray = ((TileEntitySign)tileEntity).signText;
        Object[] objectArray2 = ((TileEntitySign)tileEntity2).signText;
        if (Arrays.equals(objectArray, objectArray2)) return false;
        return this.Method1266((Packet)new CPacketUpdateSign(blockPos2, (ITextComponent[])objectArray));
    }
}

