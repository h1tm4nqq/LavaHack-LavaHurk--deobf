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
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
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

public class esgQtmze7Y5k45QY3tXxPbizyx00XzzY
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field15724 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("EventMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11386).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15725 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)719316874 ^ 0x401400002ADFE78AL), 1.0, Double.longBitsToDouble((long)1170349115 ^ 0x4018000045C21C3BL), (boolean)((long)984272306 ^ (long)984272306)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15726 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TargetRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x78996186C5A8191BL ^ 0x38B96186C5A8191BL), 1.0, Double.longBitsToDouble(0x55E58D1EED69F669L ^ 0x15CB8D1EED69F669L), (boolean)((long)1722761610 ^ (long)1722761610)));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field15727 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15728 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Cancel", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-848718873L ^ 0xCD6993E6) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15729 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PredictFacing", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)148608772 ^ (long)148608772)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15730 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)392365923L ^ 0x17630763) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15731 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-950807276 ^ (long)-950807276)));
    private Entity Field15732 = null;
    private String Field15733 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public esgQtmze7Y5k45QY3tXxPbizyx00XzzY() {
        super("DamageIncreaser", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        this.Method44(this::Method6431);
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field15732 = null;
    }

    @Override
    public void Method45() {
        if (this.Field15724.Method341() != esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11387) {
            return;
        }
        this.Method20();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6415(TickEvent tickEvent) {
        if (this.Field15724.Method341() != esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11386) {
            return;
        }
        this.Method20();
    }

    private void Method20() {
        if (esgQtmze7Y5k45QY3tXxPbizyx00XzzY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (esgQtmze7Y5k45QY3tXxPbizyx00XzzY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field15732 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(this.Field15726.Method368());
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
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
        if (n == (int)((long)1592695885 ^ (long)-1592695886)) {
            return;
        }
        int n2 = esgQtmze7Y5k45QY3tXxPbizyx00XzzY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (!esgQtmze7Y5k45QY3tXxPbizyx00XzzY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)esgQtmze7Y5k45QY3tXxPbizyx00XzzY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) return;
        if (this.Method6417(blockPos)) {
            return;
        }
        Object[] objectArray = new Object[(int)((long)1950086837 ^ (long)1950086836) << 1];
        objectArray[(int)((long)-786308145 ^ (long)-786308145)] = n;
        objectArray[(int)((long)-1093847835 ^ (long)-1093847836)] = (boolean)((long)-1848904865 ^ (long)-1848904865);
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field15727.Method341()).Method2972().Method1726(objectArray);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field15730.Method365(), this.Field15731.Method365());
        Object[] objectArray2 = new Object[(int)((long)-1533619927 ^ (long)-1533619928) << 1];
        objectArray2[(int)1353866705L ^ 0x50B25DD1] = n2;
        objectArray2[(int)538640244L ^ 0x201AFF75] = ((int)1384008568L ^ 0x527E4B79) != 0;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field15727.Method341()).Method2972().Method1726(objectArray2);
    }

    private boolean Method6417(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = esgQtmze7Y5k45QY3tXxPbizyx00XzzY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return (int)((long)-397477551 ^ (long)-397477552) != 0;
        }
        return (int)((long)1296828410 ^ (long)1296828410) != 0;
    }

    private BlockPos Method6418() {
        List list;
        BlockPos blockPos;
        BlockPos blockPos2 = new BlockPos(this.Field15732.posX, this.Field15732.posY, this.Field15732.posZ);
        if (this.Method6421(blockPos2.down()).isReplaceable((IBlockAccess)esgQtmze7Y5k45QY3tXxPbizyx00XzzY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2.down())) {
            return null;
        }
        List list2 = Arrays.stream(EnumFacing.HORIZONTALS).map(arg_0 -> esgQtmze7Y5k45QY3tXxPbizyx00XzzY.Method6430(blockPos2, arg_0)).collect(Collectors.toList());
        if (this.Field15729.Method365()) {
            list2.remove(blockPos2.down().offset(this.Method6420()));
        }
        if ((blockPos = (BlockPos)(list = list2.stream().filter(this::Method6429).filter(esgQtmze7Y5k45QY3tXxPbizyx00XzzY::Method6428).filter(this::Method6427).filter(this::Method6426).filter(this::Method6425).collect(Collectors.toList())).stream().min(Comparator.comparingDouble(this::Method6424)).orElse(null)) == null) {
            return null;
        }
        if (!this.Field15728.Method365()) return list.stream().filter(this::Method6423).min(Comparator.comparingDouble(this::Method6422)).orElse(null);
        if (this.Method6421(blockPos).isReplaceable((IBlockAccess)esgQtmze7Y5k45QY3tXxPbizyx00XzzY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) return list.stream().filter(this::Method6423).min(Comparator.comparingDouble(this::Method6422)).orElse(null);
        return null;
    }

    private double Method6419(Entity entity, BlockPos blockPos, int n) {
        double d = (double)blockPos.getX() + Double.longBitsToDouble((long)1059936278 ^ 0x3FE000003F2D5816L);
        double d2 = blockPos.getY() + n;
        double d3 = (double)blockPos.getZ() + Double.longBitsToDouble(0x63E41FAD96A0AC0BL ^ 0x5C041FAD96A0AC0BL);
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
        return esgQtmze7Y5k45QY3tXxPbizyx00XzzY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock();
    }

    private double Method6422(BlockPos blockPos) {
        return this.Method6419(this.Field15732, blockPos, (int)1553552320L ^ 0x5C9953C1);
    }

    private boolean Method6423(BlockPos blockPos) {
        return this.Method6421(blockPos).isReplaceable((IBlockAccess)esgQtmze7Y5k45QY3tXxPbizyx00XzzY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }

    private double Method6424(BlockPos blockPos) {
        return this.Method6419(this.Field15732, blockPos, (int)1277594898L ^ 0x4C268D13);
    }

    private boolean Method6425(BlockPos blockPos) {
        boolean bl;
        if (!this.Field15732.getEntityBoundingBox().intersects(new AxisAlignedBB(blockPos.up()))) {
            bl = (int)876180368L ^ 0x34397391;
            return bl;
        }
        bl = (int)966261305L ^ 0x3997FA39;
        return bl;
    }

    private boolean Method6426(BlockPos blockPos) {
        boolean bl;
        if (this.Method6421(blockPos.up(((int)2075312445L ^ 0x7BB2C13C) << 1)) == Blocks.AIR) {
            bl = (int)1071228384L ^ 0x3FD9A5E1;
            return bl;
        }
        bl = (int)-850565299L ^ 0xCD4D674D;
        return bl;
    }

    private boolean Method6427(BlockPos blockPos) {
        boolean bl;
        if (this.Method6421(blockPos.up()) == Blocks.AIR) {
            bl = (int)-1578874622L ^ 0xA1E44903;
            return bl;
        }
        bl = (int)-1732882919L ^ 0x98B64E19;
        return bl;
    }

    private static boolean Method6428(BlockPos blockPos) {
        int n;
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty()) {
            n = (int)((long)1224703789 ^ (long)1224703788);
            return n != 0;
        }
        n = (int)168482048L ^ 0xA0AD500;
        return n != 0;
    }

    private boolean Method6429(BlockPos blockPos) {
        int n;
        if (this.Method6419((Entity)esgQtmze7Y5k45QY3tXxPbizyx00XzzY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, blockPos, (int)191971929L ^ 0xB714259) <= this.Field15725.Method367()) {
            n = (int)((long)730581625 ^ (long)730581624);
            return n != 0;
        }
        n = (int)1567185913L ^ 0x5D695BF9;
        return n != 0;
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
        int n = (int)((long)-1481882589 ^ (long)-1481882589);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-557382010 ^ (long)-557382023);
            int n2 = (int)((long)1746924637 ^ (long)1746924556) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1621647372 ^ (long)1621642033) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

