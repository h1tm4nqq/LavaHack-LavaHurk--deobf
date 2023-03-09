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
import lavahack.client.Class1036;
import lavahack.client.Class1303;
import lavahack.client.Class1865;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class711;
import lavahack.client.Class9;
import lavahack.client.Class97;
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

public class Class2137
extends Class42 {
    private final Class44 Field17778 = this.Method23(new Class44("TargetRange", (Class42)this, Double.longBitsToDouble((long)1076481174 ^ 0x402000004029CC96L), 1.0, Double.longBitsToDouble((long)686123915 ^ 0x402E000028E56B8BL), false));
    private final Class44 Field17779 = this.Method23(new Class44("PlaceRange", (Class42)this, Double.longBitsToDouble((long)1772492622 ^ 0x4016000069A6174EL), 1.0, Double.longBitsToDouble((long)1442454976 ^ 0x4018000055FA1DC0L), false));
    private final Class1303 Field17780 = new Class1303("Switch", (Class42)this, Class711.Field11028).Method5303();
    private final Class44 Field17781 = this.Method23(new Class44("Support", (Class42)this, true));
    private final Class44 Field17782 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field17783 = this.Method23(new Class44("Packet", (Class42)this, false));
    private int Field17784;

    public Class2137() {
        super("Prison", Class97.Field8338);
    }

    @Override
    public void Method45() {
        if (Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        EntityPlayer entityPlayer = Class394.Method1924(this.Field17778.Method368());
        if (entityPlayer == null) {
            return;
        }
        int n = Class9.Method127(Blocks.OBSIDIAN);
        if (n == -1) {
            return;
        }
        int n2 = Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        double d = entityPlayer.posX + entityPlayer.motionX;
        double d2 = entityPlayer.posZ + entityPlayer.motionZ;
        BlockPos blockPos = new BlockPos(d, entityPlayer.posY, d2);
        BlockPos blockPos2 = new BlockPos(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ);
        if (blockPos.equals((Object)blockPos2)) {
            return;
        }
        EnumFacing enumFacing = Stream.of(EnumFacing.HORIZONTALS).filter(arg_0 -> Class2137.Method7709(blockPos2, blockPos, arg_0)).findFirst().orElse(null);
        if (enumFacing == null) {
            return;
        }
        List list = this.Method7707(entityPlayer, enumFacing);
        if (Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState((BlockPos)list.get(0)).getBlock().isReplaceable((IBlockAccess)Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (BlockPos)list.get(0)) && Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState((BlockPos)list.get(1)).getBlock().isReplaceable((IBlockAccess)Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (BlockPos)list.get(1))) {
            return;
        }
        BlockPos blockPos3 = blockPos2.offset(enumFacing).down();
        if (this.Field17781.Method365() && Class1036.Method4213(blockPos3).isEmpty()) {
            list.add(0, blockPos3);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos4 = (BlockPos)iterator.next();
            if (!Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos4).getBlock().isReplaceable((IBlockAccess)Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos4) || this.Method7706(blockPos4) || Math.sqrt(Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos4)) > this.Field17779.Method367()) continue;
            ((Class711)this.Field17780.Method341()).Method2972().Method1726(n, false);
            Class1036.Method4208(blockPos4, EnumHand.MAIN_HAND, this.Field17782.Method365(), this.Field17783.Method365());
            ((Class711)this.Field17780.Method341()).Method2972().Method1726(n2, true);
        }
    }

    private boolean Method7706(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return true;
        }
        return false;
    }

    private List Method7707(EntityPlayer entityPlayer, EnumFacing enumFacing) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        BlockPos blockPos = new BlockPos(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ).offset(enumFacing);
        arrayList.add(blockPos);
        arrayList.add(blockPos.up());
        arrayList.add(blockPos.up(2));
        return arrayList;
    }

    private Class1865 Method7708(EntityPlayer entityPlayer) {
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
            return new Class1865(EnumFacing.WEST, d4);
        }
        if (d9 == d5) {
            return new Class1865(EnumFacing.NORTH, d5);
        }
        if (d9 == d6) {
            return new Class1865(EnumFacing.EAST, d6);
        }
        if (d9 != d7) return null;
        return new Class1865(EnumFacing.SOUTH, d7);
    }

    private static boolean Method7709(BlockPos blockPos, BlockPos blockPos2, EnumFacing enumFacing) {
        return blockPos.offset(enumFacing).equals((Object)blockPos2);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 223;
            cArray2[n] = (char)(cArray[n] ^ (0x54D8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

