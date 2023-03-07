//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17778 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TargetRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1076481174 ^ 0x402000004029CC96L), 1.0, Double.longBitsToDouble((long)686123915 ^ 0x402E000028E56B8BL), ((int)-660170251L ^ 0xD8A699F5) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17779 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1772492622 ^ 0x4016000069A6174EL), 1.0, Double.longBitsToDouble((long)1442454976 ^ 0x4018000055FA1DC0L), (boolean)((long)344293327 ^ (long)344293327)));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field17780 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17781 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Support", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)2134065853L ^ 0x7F3342BC) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17782 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1232726435L ^ 0x4979E9A3) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17783 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1159848062L ^ 0xBADE1F82) != 0));
    private int Field17784;

    public Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy() {
        super("Prison", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
    }

    @Override
    public void Method45() {
        if (Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        EntityPlayer entityPlayer = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(this.Field17778.Method368());
        if (entityPlayer == null) {
            return;
        }
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
        if (n == ((int)399958448L ^ 0xE8291E4F)) {
            return;
        }
        int n2 = Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        double d = entityPlayer.posX + entityPlayer.motionX;
        double d2 = entityPlayer.posZ + entityPlayer.motionZ;
        BlockPos blockPos = new BlockPos(d, entityPlayer.posY, d2);
        BlockPos blockPos2 = new BlockPos(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ);
        if (blockPos.equals((Object)blockPos2)) {
            return;
        }
        EnumFacing enumFacing = Stream.of(EnumFacing.HORIZONTALS).filter(arg_0 -> Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy.Method7709(blockPos2, blockPos, arg_0)).findFirst().orElse(null);
        if (enumFacing == null) {
            return;
        }
        List list = this.Method7707(entityPlayer, enumFacing);
        if (Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState((BlockPos)list.get((int)((long)-291048854 ^ (long)-291048854))).getBlock().isReplaceable((IBlockAccess)Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (BlockPos)list.get((int)((long)1324488744 ^ (long)1324488744))) && Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState((BlockPos)list.get((int)-2146341863L ^ 0x80116C18)).getBlock().isReplaceable((IBlockAccess)Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (BlockPos)list.get((int)56124853L ^ 0x35865B4))) {
            return;
        }
        BlockPos blockPos3 = blockPos2.offset(enumFacing).down();
        if (this.Field17781.Method365() && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos3).isEmpty()) {
            list.add((int)1683770245L ^ 0x645C4B85, blockPos3);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos4 = (BlockPos)iterator.next();
            if (!Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos4).getBlock().isReplaceable((IBlockAccess)Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos4) || this.Method7706(blockPos4) || Math.sqrt(Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos4)) > this.Field17779.Method367()) continue;
            Object[] objectArray = new Object[((int)-206661652L ^ 0xF3AE97ED) << 1];
            objectArray[(int)2113449734L ^ 0x7DF8AF06] = n;
            objectArray[(int)-1204663719L ^ 0xB8324A58] = ((int)-1342381733L ^ 0xAFFCE15B) != 0;
            ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field17780.Method341()).Method2972().Method1726(objectArray);
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos4, EnumHand.MAIN_HAND, this.Field17782.Method365(), this.Field17783.Method365());
            Object[] objectArray2 = new Object[(int)((long)2109412337 ^ (long)2109412336) << 1];
            objectArray2[(int)((long)2027933694 ^ (long)2027933694)] = n2;
            objectArray2[(int)-1828560268L ^ 0x93026275] = ((int)227793249L ^ 0xD93D960) != 0;
            ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field17780.Method341()).Method2972().Method1726(objectArray2);
        }
    }

    private boolean Method7706(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return (int)((long)226312160 ^ (long)226312161) != 0;
        }
        return (int)((long)1757392871 ^ (long)1757392871) != 0;
    }

    private List Method7707(EntityPlayer entityPlayer, EnumFacing enumFacing) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        BlockPos blockPos = new BlockPos(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ).offset(enumFacing);
        arrayList.add(blockPos);
        arrayList.add(blockPos.up());
        arrayList.add(blockPos.up((int)((long)2082772760 ^ (long)2082772761) << 1));
        return arrayList;
    }

    private Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method7708(EntityPlayer entityPlayer) {
        double d;
        double d2 = Math.floor(entityPlayer.posX);
        double d3 = Math.floor(entityPlayer.posZ);
        double d4 = entityPlayer.posX - d2;
        double d5 = entityPlayer.posZ - d3;
        double d6 = 1.0 - d4;
        double d7 = 1.0 - d5;
        double d8 = Math.min(d4, d6);
        double d9 = Math.min(d8, d = Math.min(d5, d7));
        if (d9 == d4) {
            return new Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(EnumFacing.WEST, d4);
        }
        if (d9 == d5) {
            return new Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(EnumFacing.NORTH, d5);
        }
        if (d9 == d6) {
            return new Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(EnumFacing.EAST, d6);
        }
        if (d9 != d7) return null;
        return new Siz4qAI0SYhI2ixMKGSJtBTB9vM5Egqy$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(EnumFacing.SOUTH, d7);
    }

    private static boolean Method7709(BlockPos blockPos, BlockPos blockPos2, EnumFacing enumFacing) {
        return blockPos.offset(enumFacing).equals((Object)blockPos2);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-646583933L ^ 0xD975E983;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)795335215 ^ (long)795335376);
            int n2 = (int)((long)-1834019154 ^ (long)-1834019215);
            cArray2[n] = (char)(cArray[n] ^ (((int)1259812669L ^ 0x4B173DA6) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

