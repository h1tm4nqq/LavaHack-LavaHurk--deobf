//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.init.*;
import java.util.stream.*;
import java.util.function.*;
import net.minecraft.world.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import java.util.*;
import net.minecraft.network.play.client.*;

public class Class1742 extends Class42
{
    private int Field15986;
    
    public Class1742() {
        super("BurrowHelper", Class97.Field8345);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        final int method127 = Class9.Method127(Blocks.OBSIDIAN);
        if (method127 == -1) {
            return;
        }
        final int currentItem = Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        final double floor = Math.floor(Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
        final double posY = Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        final double floor2 = Math.floor(Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        final BlockPos blockPos = Stream.of(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ? extends BlockPos>)Class1742::Method6623).min(Comparator.comparingDouble((ToDoubleFunction<? super BlockPos>)Class1742::Method6622)).orElse(null);
        if (blockPos == null) {
            return;
        }
        final BlockPos down = blockPos.down();
        if (Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(down).getBlock().isReplaceable((IBlockAccess)Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, down)) {
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(method127));
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = method127;
            Class1036.Method4208(down, EnumHand.MAIN_HAND, true, false);
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem));
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = currentItem;
        }
        final BlockPos up = down.up();
        if (Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(up).getBlock().isReplaceable((IBlockAccess)Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, up)) {
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(method127));
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = method127;
            Class1036.Method4208(up, EnumHand.MAIN_HAND, true, false);
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem));
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = currentItem;
        }
        final BlockPos up2 = up.up();
        if (Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(up2).getBlock().isReplaceable((IBlockAccess)Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, up2)) {
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(method127));
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = method127;
            Class1036.Method4208(up2, EnumHand.MAIN_HAND, true, false);
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem));
            Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = currentItem;
        }
        final Vec3d vec3d = Arrays.asList(new Vec3d(floor + Double.longBitsToDouble(4599075939470750515L), posY, floor2 + Double.longBitsToDouble((long)1188100240 ^ 0x3FD3333375E3CBA3L)), new Vec3d(floor + Double.longBitsToDouble(4599075939470750515L), posY, floor2 + Double.longBitsToDouble((long)1717020330 ^ 0x3FE3333355649599L)), new Vec3d(floor + Double.longBitsToDouble((long)140622981 ^ 0x3FE333333B528FB6L), posY, floor2 + Double.longBitsToDouble(4599075939470750515L)), new Vec3d(floor + Double.longBitsToDouble(4603579539098121011L), posY, floor2 + Double.longBitsToDouble(4603579539098121011L))).stream().min(Comparator.comparingDouble((ToDoubleFunction<? super Vec3d>)Class1742::Method6621)).orElse(null);
        Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(vec3d.x, vec3d.y, vec3d.z, Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(vec3d.x, vec3d.y, vec3d.z);
        Class298.Method1560(Class1742::Method20);
    }
    
    private static void Method20() {
        Class298.Method1561(60L);
        Class1124.Field13068.Method36();
    }
    
    private static double Method6621(final Vec3d vec3d) {
        return Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(vec3d.x, vec3d.y, vec3d.z);
    }
    
    private static double Method6622(final BlockPos blockPos) {
        return Class1742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(blockPos.getX() + Double.longBitsToDouble((long)430517015 ^ 0x3FE0000019A92B17L), blockPos.getY() + Double.longBitsToDouble(4602678819172646912L), blockPos.getZ() + Double.longBitsToDouble((long)1142730101 ^ 0x3FE00000441CAD75L));
    }
    
    private static BlockPos Method6623(final double n, final double n2, final double n3, final EnumFacing enumFacing) {
        return new BlockPos(n, n2, n3).offset(enumFacing);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2452 ^ 0x22));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
