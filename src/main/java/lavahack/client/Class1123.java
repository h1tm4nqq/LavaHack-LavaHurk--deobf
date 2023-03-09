//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class Class1123 {
    protected final Minecraft Field13043 = Minecraft.getMinecraft();
    private String Field13044 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public abstract boolean Method1265(EntityPlayer var1, World var2, BlockPos var3, World var4, BlockPos var5);

    public final boolean Method1266(Packet packet) {
        NetHandlerPlayClient netHandlerPlayClient = this.Field13043.getConnection();
        if (netHandlerPlayClient == null) {
            return false;
        }
        netHandlerPlayClient.sendPacket(packet);
        return true;
    }
}

