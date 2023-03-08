//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.init.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import net.minecraft.util.*;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;
import net.minecraft.block.*;

public class Class1660 extends Class42
{
    private final Class1303 Field15724;
    private final Class44 Field15725;
    private final Class44 Field15726;
    private final Class1303 Field15727;
    private final Class44 Field15728;
    private final Class44 Field15729;
    private final Class44 Field15730;
    private final Class44 Field15731;
    private Entity Field15732;
    private String Field15733 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1660() {
        super("DamageIncreaser", Class97.Field8338);
        this.Field15724 = new Class1303("EventMode", (Class42)this, (Enum)Class796.Field11386).Method5303();
        this.Field15725 = this.Method23(new Class44("PlaceRange", this, Double.longBitsToDouble((long)719316874 ^ 0x401400002ADFE78AL), 1.0, Double.longBitsToDouble((long)1170349115 ^ 0x4018000045C21C3BL), false));
        this.Field15726 = this.Method23(new Class44("TargetRange", this, Double.longBitsToDouble(4620693217682128896L), 1.0, Double.longBitsToDouble(4624633867356078080L), false));
        this.Field15727 = new Class1303("Switch", (Class42)this, (Enum)Class711.Field11028);
        this.Field15728 = this.Method23(new Class44("Cancel", this, true));
        this.Field15729 = this.Method23(new Class44("PredictFacing", this, false));
        this.Field15730 = this.Method23(new Class44("Rotate", this, false));
        this.Field15731 = this.Method23(new Class44("Packet", this, false));
        this.Field15732 = null;
        this.Method44(this::Method6431);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        this.Field15732 = null;
    }
    
    @Override
    public void Method45() {
        if (this.Field15724.Method341() != Class796.Field11387) {
            return;
        }
        this.Method20();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6415(final TickEvent tickEvent) {
        if (this.Field15724.Method341() != Class796.Field11386) {
            return;
        }
        this.Method20();
    }
    
    private void Method20() {
        if (Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field15732 = (Entity)Class394.Method1924(this.Field15726.Method368());
        if (this.Field15732 == null) {
            return;
        }
        final BlockPos method6418 = this.Method6418();
        if (method6418 == null) {
            return;
        }
        this.Method6416(method6418);
    }
    
    private void Method6416(final BlockPos blockPos) {
        final int method127 = Class9.Method127(Blocks.OBSIDIAN);
        if (method127 == -1) {
            return;
        }
        final int currentItem = Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (!Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos) || this.Method6417(blockPos)) {
            return;
        }
        ((Class711)this.Field15727.Method341()).Method2972().Method1726(method127, false);
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field15730.Method365(), this.Field15731.Method365());
        ((Class711)this.Field15727.Method341()).Method2972().Method1726(currentItem, true);
    }
    
    private boolean Method6417(final BlockPos blockPos) {
        for (final Entity entity : Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
            if (!(entity instanceof EntityItem)) {
                if (entity instanceof EntityXPOrb) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    private BlockPos Method6418() {
        final BlockPos blockPos = new BlockPos(this.Field15732.posX, this.Field15732.posY, this.Field15732.posZ);
        if (this.Method6421(blockPos.down()).isReplaceable((IBlockAccess)Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos.down())) {
            return null;
        }
        final List<? super Object> list = Arrays.stream(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ?>)Class1660::Method6430).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
        if (this.Field15729.Method365()) {
            list.remove(blockPos.down().offset(this.Method6420()));
        }
        final List<Object> list2 = list.stream().filter((Predicate<? super Object>)this::Method6429).filter((Predicate<? super Object>)Class1660::Method6428).filter((Predicate<? super Object>)this::Method6427).filter((Predicate<? super Object>)this::Method6426).filter((Predicate<? super Object>)this::Method6425).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
        final BlockPos blockPos2 = list2.stream().min(Comparator.comparingDouble((ToDoubleFunction<? super BlockPos>)this::Method6424)).orElse(null);
        if (blockPos2 == null) {
            return null;
        }
        if (this.Field15728.Method365() && !this.Method6421(blockPos2).isReplaceable((IBlockAccess)Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2)) {
            return null;
        }
        return list2.stream().filter(this::Method6423).min(Comparator.comparingDouble((ToDoubleFunction<? super BlockPos>)this::Method6422)).orElse(null);
    }
    
    private double Method6419(final Entity entity, final BlockPos blockPos, final int n) {
        return entity.getDistance(blockPos.getX() + Double.longBitsToDouble((long)1059936278 ^ 0x3FE000003F2D5816L), (double)(blockPos.getY() + n), blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
    }
    
    private EnumFacing Method6420() {
        if (Math.abs(this.Field15732.motionX) > Math.abs(this.Field15732.motionZ)) {
            if (this.Field15732.motionX >= 0.0) {
                return EnumFacing.EAST;
            }
            return EnumFacing.WEST;
        }
        else {
            if (this.Field15732.motionZ >= 0.0) {
                return EnumFacing.SOUTH;
            }
            return EnumFacing.NORTH;
        }
    }
    
    private Block Method6421(final BlockPos blockPos) {
        return Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock();
    }
    
    private double Method6422(final BlockPos blockPos) {
        return this.Method6419(this.Field15732, blockPos, 1);
    }
    
    private boolean Method6423(final BlockPos blockPos) {
        return this.Method6421(blockPos).isReplaceable((IBlockAccess)Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }
    
    private double Method6424(final BlockPos blockPos) {
        return this.Method6419(this.Field15732, blockPos, 1);
    }
    
    private boolean Method6425(final BlockPos blockPos) {
        return !this.Field15732.getEntityBoundingBox().intersects(new AxisAlignedBB(blockPos.up()));
    }
    
    private boolean Method6426(final BlockPos blockPos) {
        return this.Method6421(blockPos.up(2)) == Blocks.AIR;
    }
    
    private boolean Method6427(final BlockPos blockPos) {
        return this.Method6421(blockPos.up()) == Blocks.AIR;
    }
    
    private static boolean Method6428(final BlockPos blockPos) {
        return !Class1036.Method4213(blockPos).isEmpty();
    }
    
    private boolean Method6429(final BlockPos blockPos) {
        return this.Method6419((Entity)Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, blockPos, 0) <= this.Field15725.Method367();
    }
    
    private static BlockPos Method6430(final BlockPos blockPos, final EnumFacing enumFacing) {
        return blockPos.down().offset(enumFacing);
    }
    
    private String Method6431() {
        return (this.Field15732 == null) ? "No Target" : this.Field15732.getName();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x567A ^ 0xA2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
