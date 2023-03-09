//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import lavahack.client.Class1036;
import lavahack.client.Class1303;
import lavahack.client.Class1646;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class552;
import lavahack.client.Class574;
import lavahack.client.Class711;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Class1153
extends Class42 {
    private final Class1303 Field13202 = new Class1303("RedstoneMode", (Class42)this, Class1646.Field15655).Method5303();
    private final Class1303 Field13203 = new Class1303("Switch", (Class42)this, Class711.Field11028).Method5303();
    private final Class44 Field13204 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)474211432 ^ 0x401400001C43E468L), 1.0, Double.longBitsToDouble(0x4024000000000000L), false));
    private final Class44 Field13205 = this.Method23(new Class44("PacketPlace", (Class42)this, false));
    private String Field13206 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1153() {
        super("HoleKicker", Class97.Field8338);
    }

    @Override
    public void Method45() {
        if (Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        EntityPlayer entityPlayer = Class394.Method1924(this.Field13204.Method368());
        if (entityPlayer == null) {
            this.Method22();
            return;
        }
        Class1646 class1646 = (Class1646)this.Field13202.Method341();
        int n = Class9.Method127((Block)Blocks.PISTON);
        if (n == -1) {
            n = Class9.Method127((Block)Blocks.STICKY_PISTON);
        }
        if (n == -1) {
            return;
        }
        int n2 = Class9.Method127(this.Method4670());
        if (n2 == -1) {
            class1646 = this.Method4669(class1646);
            n2 = Class9.Method127(this.Method4671());
        }
        if (n2 == -1) {
            this.Method22();
            return;
        }
        int n3 = Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        BlockPos blockPos = new BlockPos(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ);
        EnumFacing enumFacing = this.Method4673(blockPos, class1646);
        if (enumFacing == null) {
            this.Method22();
            return;
        }
        Class574 class574 = this.Method4674(blockPos, enumFacing, class1646);
        if (class574 == null) {
            this.Method22();
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        switch (Class552.Field10345[enumFacing.getOpposite().ordinal()]) {
            case 1: {
                f = Float.intBitsToFloat(0x43340000);
                f2 = 0.0f;
                break;
            }
            case 2: {
                f = 0.0f;
                f2 = 0.0f;
                break;
            }
            case 3: {
                f = Float.intBitsToFloat(1119092736);
                f2 = 0.0f;
                break;
            }
            case 4: {
                f = Float.intBitsToFloat(-1028390912);
                f2 = 0.0f;
                break;
            }
            case 5: 
            case 6: {
                f2 = Float.intBitsToFloat(1119092736);
                break;
            }
        }
        Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(f, f2, Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        ((Class711)this.Field13203.Method341()).Method2972().Method1726(n, false);
        Class1036.Method4208((BlockPos)class574.Method2522(), EnumHand.MAIN_HAND, false, this.Field13205.Method365());
        ((Class711)this.Field13203.Method341()).Method2972().Method1726(n2, false);
        Class1036.Method4208((BlockPos)class574.Method2523(), EnumHand.MAIN_HAND, false, this.Field13205.Method365());
        ((Class711)this.Field13203.Method341()).Method2972().Method1726(n3, true);
        Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState((BlockPos)class574.Method2522()).getBlock().rotateBlock((World)Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (BlockPos)class574.Method2522(), enumFacing.getOpposite());
        this.Method22();
    }

    private Class1646 Method4669(Class1646 class1646) {
        if (class1646 != Class1646.Field15655) return Class1646.Field15655;
        return Class1646.Field15656;
    }

    private Block Method4670() {
        if (this.Field13202.Method341() != Class1646.Field15655) return Blocks.REDSTONE_BLOCK;
        return Blocks.REDSTONE_TORCH;
    }

    private Block Method4671() {
        if (this.Field13202.Method341() != Class1646.Field15655) return Blocks.REDSTONE_TORCH;
        return Blocks.REDSTONE_BLOCK;
    }

    private boolean Method4672(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return true;
        }
        return false;
    }

    private EnumFacing Method4673(BlockPos blockPos, Class1646 class1646) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            BlockPos blockPos2 = blockPos.offset(enumFacing).up();
            if (Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getBlock().isReplaceable((IBlockAccess)Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2) && !this.Method4672(blockPos2) && Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.offset(enumFacing.getOpposite()).up()).getBlock().isReplaceable((IBlockAccess)Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos.offset(enumFacing.getOpposite()).up()) && this.Method4674(blockPos, enumFacing, class1646) != null) {
                arrayList.add(enumFacing);
            }
            ++n2;
        }
        return arrayList.stream().min((arg_0, arg_1) -> Class1153.Method4677(blockPos, arg_0, arg_1)).orElse(null);
    }

    private Class574 Method4674(BlockPos blockPos, EnumFacing enumFacing, Class1646 class1646) {
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        if (Class1036.Method4213(blockPos2.up()).isEmpty()) {
            return null;
        }
        blockPos2 = blockPos2.up();
        if (class1646 == Class1646.Field15656) {
            return new Class574(blockPos2, blockPos2.offset(enumFacing));
        }
        BlockPos blockPos3 = null;
        Iterator iterator = Arrays.stream(EnumFacing.HORIZONTALS).filter(arg_0 -> Class1153.Method4676(enumFacing, arg_0)).collect(Collectors.toList()).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (blockPos3 != null) return new Class574(blockPos2, blockPos3);
                return null;
            }
            EnumFacing enumFacing2 = (EnumFacing)iterator.next();
            BlockPos blockPos4 = blockPos2.offset(enumFacing2);
            if (!Class1036.Method4213(blockPos4).stream().anyMatch(Class1153::Method4675)) continue;
            blockPos3 = blockPos4;
        }
    }

    private static boolean Method4675(EnumFacing enumFacing) {
        if (enumFacing == EnumFacing.UP) return false;
        return true;
    }

    private static boolean Method4676(EnumFacing enumFacing, EnumFacing enumFacing2) {
        if (enumFacing2 == enumFacing.getOpposite()) return false;
        return true;
    }

    private static int Method4677(BlockPos blockPos, EnumFacing enumFacing, EnumFacing enumFacing2) {
        BlockPos blockPos2 = blockPos.offset(enumFacing).up();
        BlockPos blockPos3 = blockPos.offset(enumFacing2).up();
        return Double.compare(Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos2.getX(), (double)blockPos2.getY(), (double)blockPos2.getZ()), Class1153.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos3.getX(), (double)blockPos3.getY(), (double)blockPos3.getZ()));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 15;
            cArray2[n] = (char)(cArray[n] ^ (0x48A8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

