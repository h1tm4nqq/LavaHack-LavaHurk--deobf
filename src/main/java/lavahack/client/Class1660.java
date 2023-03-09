//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent
 */
package lavahack.client;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import lavahack.client.Class1036;
import lavahack.client.Class1303;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class711;
import lavahack.client.Class796;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Class1660
extends Class42 {
    private final Class1303 Field15724 = new Class1303("EventMode", (Class42)this, Class796.Field11386).Method5303();
    private final Class44 Field15725 = this.Method23(new Class44("PlaceRange", (Class42)this, Double.longBitsToDouble((long)719316874 ^ 0x401400002ADFE78AL), 1.0, Double.longBitsToDouble((long)1170349115 ^ 0x4018000045C21C3BL), false));
    private final Class44 Field15726 = this.Method23(new Class44("TargetRange", (Class42)this, Double.longBitsToDouble(0x4020000000000000L), 1.0, Double.longBitsToDouble(4624633867356078080L), false));
    private final Class1303 Field15727 = new Class1303("Switch", (Class42)this, Class711.Field11028);
    private final Class44 Field15728 = this.Method23(new Class44("Cancel", (Class42)this, true));
    private final Class44 Field15729 = this.Method23(new Class44("PredictFacing", (Class42)this, false));
    private final Class44 Field15730 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field15731 = this.Method23(new Class44("Packet", (Class42)this, false));
    private Entity Field15732 = null;
    private String Field15733 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1660() {
        super("DamageIncreaser", Class97.Field8338);
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
    public void Method6415(TickEvent tickEvent) {
        if (this.Field15724.Method341() != Class796.Field11386) {
            return;
        }
        this.Method20();
    }

    private void Method20() {
        if (Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field15732 = Class394.Method1924(this.Field15726.Method368());
        if (this.Field15732 == null) {
            return;
        }
        BlockPos blockPos = this.Method6418();
        if (blockPos == null) {
            return;
        }
        this.Method6416(blockPos);
    }

    private void Method6416(BlockPos blockPos) {
        int n = Class9.Method127(Blocks.OBSIDIAN);
        if (n == -1) {
            return;
        }
        int n2 = Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (!Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) return;
        if (this.Method6417(blockPos)) {
            return;
        }
        ((Class711)this.Field15727.Method341()).Method2972().Method1726(n, false);
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field15730.Method365(), this.Field15731.Method365());
        ((Class711)this.Field15727.Method341()).Method2972().Method1726(n2, true);
    }

    private boolean Method6417(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return true;
        }
        return false;
    }

    private BlockPos Method6418() {
        List list;
        BlockPos blockPos;
        BlockPos blockPos2 = new BlockPos(this.Field15732.posX, this.Field15732.posY, this.Field15732.posZ);
        if (this.Method6421(blockPos2.down()).isReplaceable((IBlockAccess)Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2.down())) {
            return null;
        }
        List list2 = Arrays.stream(EnumFacing.HORIZONTALS).map(arg_0 -> Class1660.Method6430(blockPos2, arg_0)).collect(Collectors.toList());
        if (this.Field15729.Method365()) {
            list2.remove(blockPos2.down().offset(this.Method6420()));
        }
        if ((blockPos = (BlockPos)(list = list2.stream().filter(this::Method6429).filter(Class1660::Method6428).filter(this::Method6427).filter(this::Method6426).filter(this::Method6425).collect(Collectors.toList())).stream().min(Comparator.comparingDouble(this::Method6424)).orElse(null)) == null) {
            return null;
        }
        if (!this.Field15728.Method365()) return list.stream().filter(this::Method6423).min(Comparator.comparingDouble(this::Method6422)).orElse(null);
        if (this.Method6421(blockPos).isReplaceable((IBlockAccess)Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) return list.stream().filter(this::Method6423).min(Comparator.comparingDouble(this::Method6422)).orElse(null);
        return null;
    }

    private double Method6419(Entity entity, BlockPos blockPos, int n) {
        double d = (double)blockPos.getX() + Double.longBitsToDouble((long)1059936278 ^ 0x3FE000003F2D5816L);
        double d2 = blockPos.getY() + n;
        double d3 = (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L);
        return entity.getDistance(d, d2, d3);
    }

    private EnumFacing Method6420() {
        double d;
        double d2 = Math.abs(this.Field15732.motionX);
        if (d2 > (d = Math.abs(this.Field15732.motionZ))) {
            if (!(this.Field15732.motionX >= 0.0)) return EnumFacing.WEST;
            return EnumFacing.EAST;
        }
        if (!(this.Field15732.motionZ >= 0.0)) return EnumFacing.NORTH;
        return EnumFacing.SOUTH;
    }

    private Block Method6421(BlockPos blockPos) {
        return Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock();
    }

    private double Method6422(BlockPos blockPos) {
        return this.Method6419(this.Field15732, blockPos, 1);
    }

    private boolean Method6423(BlockPos blockPos) {
        return this.Method6421(blockPos).isReplaceable((IBlockAccess)Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }

    private double Method6424(BlockPos blockPos) {
        return this.Method6419(this.Field15732, blockPos, 1);
    }

    private boolean Method6425(BlockPos blockPos) {
        if (this.Field15732.getEntityBoundingBox().intersects(new AxisAlignedBB(blockPos.up()))) return false;
        return true;
    }

    private boolean Method6426(BlockPos blockPos) {
        if (this.Method6421(blockPos.up(2)) != Blocks.AIR) return false;
        return true;
    }

    private boolean Method6427(BlockPos blockPos) {
        if (this.Method6421(blockPos.up()) != Blocks.AIR) return false;
        return true;
    }

    private static boolean Method6428(BlockPos blockPos) {
        if (Class1036.Method4213(blockPos).isEmpty()) return false;
        return true;
    }

    private boolean Method6429(BlockPos blockPos) {
        if (!(this.Method6419((Entity)Class1660.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, blockPos, 0) <= this.Field15725.Method367())) return false;
        return true;
    }

    private static BlockPos Method6430(BlockPos blockPos, EnumFacing enumFacing) {
        return blockPos.down().offset(enumFacing);
    }

    private String Method6431() {
        if (this.Field15732 == null) {
            return "No Target";
        }
        String string = this.Field15732.getName();
        return string;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 162;
            cArray2[n] = (char)(cArray[n] ^ (0x567A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

