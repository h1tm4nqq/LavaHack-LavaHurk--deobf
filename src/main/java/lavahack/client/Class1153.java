//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import net.minecraft.world.*;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Class1153 extends Class42
{
    private final Class1303 Field13202;
    private final Class1303 Field13203;
    private final Class44 Field13204;
    private final Class44 Field13205;
    private String Field13206 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1153() {
        super("HoleKicker", Class97.Field8338);
        this.Field13202 = new Class1303("RedstoneMode", this, Class1646.Field15655).Method5303();
        this.Field13203 = new Class1303("Switch", this, Class711.Field11028).Method5303();
        this.Field13204 = this.Method23(new Class44("Range", this, Double.longBitsToDouble((long)474211432 ^ 0x401400001C43E468L), 1.0, Double.longBitsToDouble(4621819117588971520L), false));
        this.Field13205 = this.Method23(new Class44("PacketPlace", this, false));
    }
    
    @Override
    public void Method45() {
        if (Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final EntityPlayer method1924 = Class394.Method1924(this.Field13204.Method368());
        if (method1924 == null) {
            this.Method22();
            return;
        }
        Class1646 method1925 = (Class1646)this.Field13202.Method341();
        int i = Class9.Method127((Block)Blocks.PISTON);
        if (i == -1) {
            i = Class9.Method127((Block)Blocks.STICKY_PISTON);
        }
        if (i == -1) {
            return;
        }
        int j = Class9.Method127(this.Method4670());
        if (j == -1) {
            method1925 = this.Method4669(method1925);
            j = Class9.Method127(this.Method4671());
        }
        if (j == -1) {
            this.Method22();
            return;
        }
        final int currentItem = Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        final BlockPos blockPos = new BlockPos(method1924.posX, method1924.posY, method1924.posZ);
        final EnumFacing method1926 = this.Method4673(blockPos, method1925);
        if (method1926 == null) {
            this.Method22();
            return;
        }
        final Class574 method1927 = this.Method4674(blockPos, method1926, method1925);
        if (method1927 == null) {
            this.Method22();
            return;
        }
        float n = 0.0f;
        float intBitsToFloat = 0.0f;
        switch (Class552.Field10345[method1926.getOpposite().ordinal()]) {
            case 1: {
                n = Float.intBitsToFloat(1127481344);
                intBitsToFloat = 0.0f;
                break;
            }
            case 2: {
                n = 0.0f;
                intBitsToFloat = 0.0f;
                break;
            }
            case 3: {
                n = Float.intBitsToFloat(1119092736);
                intBitsToFloat = 0.0f;
                break;
            }
            case 4: {
                n = Float.intBitsToFloat(-1028390912);
                intBitsToFloat = 0.0f;
                break;
            }
            case 5:
            case 6: {
                intBitsToFloat = Float.intBitsToFloat(1119092736);
                break;
            }
        }
        Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(n, intBitsToFloat, Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        ((Class711)this.Field13203.Method341()).Method2972().Method1726(i, false);
        Class1036.Method4208((BlockPos)method1927.Method2522(), EnumHand.MAIN_HAND, false, this.Field13205.Method365());
        ((Class711)this.Field13203.Method341()).Method2972().Method1726(j, false);
        Class1036.Method4208((BlockPos)method1927.Method2523(), EnumHand.MAIN_HAND, false, this.Field13205.Method365());
        ((Class711)this.Field13203.Method341()).Method2972().Method1726(currentItem, true);
        Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState((BlockPos)method1927.Method2522()).getBlock().rotateBlock((World)Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (BlockPos)method1927.Method2522(), method1926.getOpposite());
        this.Method22();
    }
    
    private Class1646 Method4669(final Class1646 class1646) {
        if (class1646 == Class1646.Field15655) {
            return Class1646.Field15656;
        }
        return Class1646.Field15655;
    }
    
    private Block Method4670() {
        if (this.Field13202.Method341() == Class1646.Field15655) {
            return Blocks.REDSTONE_TORCH;
        }
        return Blocks.REDSTONE_BLOCK;
    }
    
    private Block Method4671() {
        if (this.Field13202.Method341() == Class1646.Field15655) {
            return Blocks.REDSTONE_BLOCK;
        }
        return Blocks.REDSTONE_TORCH;
    }
    
    private boolean Method4672(final BlockPos blockPos) {
        for (final Entity entity : Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
            if (!(entity instanceof EntityItem)) {
                if (entity instanceof EntityXPOrb) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    private EnumFacing Method4673(final BlockPos blockPos, final Class1646 class1646) {
        final ArrayList<EnumFacing> list = new ArrayList<EnumFacing>();
        for (final EnumFacing enumFacing : EnumFacing.HORIZONTALS) {
            final BlockPos up = blockPos.offset(enumFacing).up();
            if (Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(up).getBlock().isReplaceable((IBlockAccess)Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, up)) {
                if (!this.Method4672(up)) {
                    if (Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.offset(enumFacing.getOpposite()).up()).getBlock().isReplaceable((IBlockAccess)Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos.offset(enumFacing.getOpposite()).up())) {
                        if (this.Method4674(blockPos, enumFacing, class1646) != null) {
                            list.add(enumFacing);
                        }
                    }
                }
            }
        }
        return list.stream().min(Class1153::Method4677).orElse(null);
    }
    
    private Class574 Method4674(final BlockPos blockPos, final EnumFacing enumFacing, final Class1646 class1646) {
        final BlockPos offset = blockPos.offset(enumFacing);
        if (Class1036.Method4213(offset.up()).isEmpty()) {
            return null;
        }
        final BlockPos up = offset.up();
        if (class1646 == Class1646.Field15656) {
            return new Class574(up, up.offset(enumFacing));
        }
        Object o = null;
        final Iterator<EnumFacing> iterator = Arrays.stream(EnumFacing.HORIZONTALS).filter(Class1153::Method4676).collect((Collector<? super EnumFacing, ?, List<? super EnumFacing>>)Collectors.toList()).iterator();
        while (iterator.hasNext()) {
            final BlockPos offset2 = up.offset((EnumFacing)iterator.next());
            if (Class1036.Method4213(offset2).stream().anyMatch(Class1153::Method4675)) {
                o = offset2;
            }
        }
        if (o == null) {
            return null;
        }
        return new Class574(up, o);
    }
    
    private static boolean Method4675(final EnumFacing enumFacing) {
        return enumFacing != EnumFacing.UP;
    }
    
    private static boolean Method4676(final EnumFacing enumFacing, final EnumFacing enumFacing2) {
        return enumFacing2 != enumFacing.getOpposite();
    }
    
    private static int Method4677(final BlockPos blockPos, final EnumFacing enumFacing, final EnumFacing enumFacing2) {
        final BlockPos up = blockPos.offset(enumFacing).up();
        final BlockPos up2 = blockPos.offset(enumFacing2).up();
        return Double.compare(Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)up.getX(), (double)up.getY(), (double)up.getZ()), Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)up2.getX(), (double)up2.getY(), (double)up2.getZ()));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x48A8 ^ 0xF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
