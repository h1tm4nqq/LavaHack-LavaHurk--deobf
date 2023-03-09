//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1036;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public class Class1905
extends Class42 {
    private final Class44 Field16766 = this.Method23(new Class44("Setting", (Class42)this, true));
    private final Class44 Field16767 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field16768 = this.Method23(new Class44("Packet", (Class42)this, false));
    private final Class44 Field16769 = this.Method23(new Class44("ToggleOnComplete", (Class42)this, true));
    private String Field16770 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1905() {
        super("AutoAnvil", Class97.Field8338);
    }

    @Override
    public void Method45() {
        if (Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        int n2 = Class9.Method127(Blocks.OBSIDIAN);
        int n3 = Class9.Method127(Blocks.ANVIL);
        if (n == -1) return;
        if (n3 == -1) {
            return;
        }
        BlockPos blockPos = new BlockPos(Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        List list = this.Method7053();
        Iterator iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n3));
                Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n3;
                Class1036.Method4208(blockPos.up(2), EnumHand.MAIN_HAND, false, false);
                Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
                Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
                if (!this.Field16769.Method365()) return;
                this.Method22();
                return;
            }
            BlockPos blockPos2 = (BlockPos)iterator.next();
            Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
            Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
            Class1036.Method4208(blockPos2, EnumHand.MAIN_HAND, this.Field16767.Method365(), this.Field16768.Method365());
            Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
            Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
        }
    }

    private void Method7051(int n, boolean bl) {
    }

    private void Method20() {
        double d = this.Method7052(Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)62812963 ^ 0x3FE0000003BE7323L);
        double d2 = this.Method7052(Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4602678819172646912L);
        Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, d2, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(d, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, d2);
    }

    private double Method7052(double d) {
        double d2 = 0.0;
        if (!(d < 0.0)) return (double)((long)d) - d2;
        d2 = 1.0;
        return (double)((long)d) - d2;
    }

    private List Method7053() {
        BlockPos blockPos;
        BlockPos blockPos2 = new BlockPos(Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        List list = this.Method7055(blockPos2.up(2));
        ArrayList arrayList = new ArrayList(16);
        Iterator iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return this.Method7054(blockPos2.up(2), Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing().getOpposite());
        } while (!Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos = (BlockPos)iterator.next()).getMaterial().isSolid());
        return arrayList;
    }

    private List Method7054(BlockPos blockPos, EnumFacing enumFacing) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(16);
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        blockPos2 = blockPos2.down(3);
        int n = 0;
        while (true) {
            if (Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getMaterial().isReplaceable()) {
                arrayList.add(blockPos2);
            }
            blockPos2 = blockPos2.up();
            ++n;
        }
    }

    private List Method7055(BlockPos blockPos) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(16);
        arrayList.add(blockPos.north());
        arrayList.add(blockPos.east());
        arrayList.add(blockPos.south());
        arrayList.add(blockPos.west());
        return arrayList;
    }

    private boolean Method28() {
        BlockPos blockPos = new BlockPos(Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        boolean bl = true;
        int n = 0;
        while (true) {
            bl &= Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock() == Blocks.AIR;
            blockPos = blockPos.up();
            ++n;
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 206;
            cArray2[n] = (char)(cArray[n] ^ (0x10F8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

