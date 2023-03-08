//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.init.*;
import net.minecraft.util.math.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import java.util.*;
import net.minecraft.util.*;

public class Class1905 extends Class42
{
    private final Class44 Field16766;
    private final Class44 Field16767;
    private final Class44 Field16768;
    private final Class44 Field16769;
    private String Field16770 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1905() {
        super("AutoAnvil", Class97.Field8338);
        this.Field16766 = this.Method23(new Class44("Setting", this, true));
        this.Field16767 = this.Method23(new Class44("Rotate", this, false));
        this.Field16768 = this.Method23(new Class44("Packet", this, false));
        this.Field16769 = this.Method23(new Class44("ToggleOnComplete", this, true));
    }
    
    @Override
    public void Method45() {
        if (Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final int currentItem = Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        final int method127 = Class9.Method127(Blocks.OBSIDIAN);
        final int method128 = Class9.Method127(Blocks.ANVIL);
        if (currentItem == -1 || method128 == -1) {
            return;
        }
        final BlockPos blockPos = new BlockPos(Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        for (final BlockPos blockPos2 : this.Method7053()) {
            Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(method127));
            Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = method127;
            Class1036.Method4208(blockPos2, EnumHand.MAIN_HAND, this.Field16767.Method365(), this.Field16768.Method365());
            Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem));
            Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = currentItem;
        }
        Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(method128));
        Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = method128;
        Class1036.Method4208(blockPos.up(2), EnumHand.MAIN_HAND, false, false);
        Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem));
        Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = currentItem;
        if (this.Field16769.Method365()) {
            this.Method22();
        }
    }
    
    private void Method7051(final int n, final boolean b) {
    }
    
    private void Method20() {
        final double n = this.Method7052(Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)62812963 ^ 0x3FE0000003BE7323L);
        final double n2 = this.Method7052(Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4602678819172646912L);
        Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(n, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, n2, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(n, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, n2);
    }
    
    private double Method7052(final double n) {
        double n2 = 0.0;
        if (n < 0.0) {
            n2 = 1.0;
        }
        return (long)n - n2;
    }
    
    private List Method7053() {
        final BlockPos blockPos = new BlockPos(Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        final List method7055 = this.Method7055(blockPos.up(2));
        final ArrayList list = new ArrayList(16);
        final Iterator<BlockPos> iterator = method7055.iterator();
        while (iterator.hasNext()) {
            if (Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState((BlockPos)iterator.next()).getMaterial().isSolid()) {
                return list;
            }
        }
        return this.Method7054(blockPos.up(2), Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing().getOpposite());
    }
    
    private List Method7054(final BlockPos blockPos, final EnumFacing enumFacing) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>(16);
        BlockPos blockPos2 = blockPos.offset(enumFacing).down(3);
        int n = 0;
        while (true) {
            if (Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getMaterial().isReplaceable()) {
                list.add(blockPos2);
            }
            blockPos2 = blockPos2.up();
            ++n;
        }
    }
    
    private List Method7055(final BlockPos blockPos) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>(16);
        list.add(blockPos.north());
        list.add(blockPos.east());
        list.add(blockPos.south());
        list.add(blockPos.west());
        return list;
    }
    
    private boolean Method28() {
        BlockPos up = new BlockPos(Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        boolean b = true;
        int n = 0;
        while (true) {
            b &= (Class1905.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(up).getBlock() == Blocks.AIR);
            up = up.up();
            ++n;
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x10F8 ^ 0xCE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
