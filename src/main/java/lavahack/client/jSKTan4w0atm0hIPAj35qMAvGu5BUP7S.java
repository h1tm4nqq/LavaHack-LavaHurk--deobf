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
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$1;
import lavahack.client.jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
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

public class jSKTan4w0atm0hIPAj35qMAvGu5BUP7S
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field13202 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("RedstoneMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15655).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field13203 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13204 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)474211432 ^ 0x401400001C43E468L), 1.0, Double.longBitsToDouble(0x664F2BE19F7F5B34L ^ 0x266B2BE19F7F5B34L), (boolean)((long)695734539 ^ (long)695734539)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13205 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PacketPlace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-106087020 ^ (long)-106087020)));
    private String Field13206 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public jSKTan4w0atm0hIPAj35qMAvGu5BUP7S() {
        super("HoleKicker", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
    }

    @Override
    public void Method45() {
        if (jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        EntityPlayer entityPlayer = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(this.Field13204.Method368());
        if (entityPlayer == null) {
            this.Method22();
            return;
        }
        jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field13202.Method341();
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127((Block)Blocks.PISTON);
        if (n == (int)((long)1529807564 ^ (long)-1529807565)) {
            n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127((Block)Blocks.STICKY_PISTON);
        }
        if (n == (int)((long)2145262738 ^ (long)-2145262739)) {
            return;
        }
        int n2 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(this.Method4670());
        if (n2 == (int)((long)383791885 ^ (long)-383791886)) {
            jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = this.Method4669(jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            n2 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(this.Method4671());
        }
        if (n2 == (int)((long)-866517080 ^ (long)866517079)) {
            this.Method22();
            return;
        }
        int n3 = jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        BlockPos blockPos = new BlockPos(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ);
        EnumFacing enumFacing = this.Method4673(blockPos, jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        if (enumFacing == null) {
            this.Method22();
            return;
        }
        Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq = this.Method4674(blockPos, enumFacing, jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        if (ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq == null) {
            this.Method22();
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        switch (jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$1.Field10345[enumFacing.getOpposite().ordinal()]) {
            case 1: {
                f = Float.intBitsToFloat(0x1156126 ^ 0x42216126);
                f2 = 0.0f;
                break;
            }
            case 2: {
                f = 0.0f;
                f2 = 0.0f;
                break;
            }
            case 3: {
                f = Float.intBitsToFloat((int)((long)1295848667 ^ (long)260642011));
                f2 = 0.0f;
                break;
            }
            case 4: {
                f = Float.intBitsToFloat((int)((long)563988528 ^ (long)-483801040));
                f2 = 0.0f;
                break;
            }
            case 5: 
            case 6: {
                f2 = Float.intBitsToFloat((int)1327134807L ^ 0xDAE7857);
                break;
            }
        }
        jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(f, f2, jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        Object[] objectArray = new Object[((int)1261518990L ^ 0x4B31408F) << 1];
        objectArray[(int)-51497075L ^ 0xFCEE378D] = n;
        objectArray[(int)-314784435L ^ 0xED3CC54C] = ((int)-498318538L ^ 0xE24C4336) != 0;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field13203.Method341()).Method2972().Method1726(objectArray);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208((BlockPos)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2522(), EnumHand.MAIN_HAND, (boolean)((long)-1496264746 ^ (long)-1496264746), this.Field13205.Method365());
        Object[] objectArray2 = new Object[((int)2067410782L ^ 0x7B3A2F5F) << 1];
        objectArray2[(int)((long)-237755888 ^ (long)-237755888)] = n2;
        objectArray2[(int)1991583093L ^ 0x76B52574] = (boolean)((long)-802389808 ^ (long)-802389808);
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field13203.Method341()).Method2972().Method1726(objectArray2);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208((BlockPos)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2523(), EnumHand.MAIN_HAND, (boolean)((long)-509266670 ^ (long)-509266670), this.Field13205.Method365());
        Object[] objectArray3 = new Object[((int)1822137002L ^ 0x6C9B9AAB) << 1];
        objectArray3[(int)((long)595814045 ^ (long)595814045)] = n3;
        objectArray3[(int)460910199L ^ 0x1B78EE76] = ((int)-1239343950L ^ 0xB6211CB3) != 0;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field13203.Method341()).Method2972().Method1726(objectArray3);
        jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState((BlockPos)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2522()).getBlock().rotateBlock((World)jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (BlockPos)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2522(), enumFacing.getOpposite());
        this.Method22();
    }

    private jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method4669(jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        if (jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi != jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15655) return jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15655;
        return jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15656;
    }

    private Block Method4670() {
        if (this.Field13202.Method341() != jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15655) return Blocks.REDSTONE_BLOCK;
        return Blocks.REDSTONE_TORCH;
    }

    private Block Method4671() {
        if (this.Field13202.Method341() != jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15655) return Blocks.REDSTONE_TORCH;
        return Blocks.REDSTONE_BLOCK;
    }

    private boolean Method4672(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return (int)((long)-1228290792 ^ (long)-1228290791) != 0;
        }
        return ((int)1127844838L ^ 0x43398BE6) != 0;
    }

    private EnumFacing Method4673(BlockPos blockPos, jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n2 = (int)-11601960L ^ 0xFF4EF7D8;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            BlockPos blockPos2 = blockPos.offset(enumFacing).up();
            if (jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getBlock().isReplaceable((IBlockAccess)jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2) && !this.Method4672(blockPos2) && jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.offset(enumFacing.getOpposite()).up()).getBlock().isReplaceable((IBlockAccess)jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos.offset(enumFacing.getOpposite()).up()) && this.Method4674(blockPos, enumFacing, jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) != null) {
                arrayList.add(enumFacing);
            }
            ++n2;
        }
        return arrayList.stream().min((arg_0, arg_1) -> jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.Method4677(blockPos, arg_0, arg_1)).orElse(null);
    }

    private Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq Method4674(BlockPos blockPos, EnumFacing enumFacing, jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos2.up()).isEmpty()) {
            return null;
        }
        blockPos2 = blockPos2.up();
        if (jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15656) {
            return new Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq(blockPos2, blockPos2.offset(enumFacing));
        }
        BlockPos blockPos3 = null;
        Iterator iterator = Arrays.stream(EnumFacing.HORIZONTALS).filter(arg_0 -> jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.Method4676(enumFacing, arg_0)).collect(Collectors.toList()).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (blockPos3 != null) return new Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq(blockPos2, blockPos3);
                return null;
            }
            EnumFacing enumFacing2 = (EnumFacing)iterator.next();
            BlockPos blockPos4 = blockPos2.offset(enumFacing2);
            if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos4).stream().anyMatch(jSKTan4w0atm0hIPAj35qMAvGu5BUP7S::Method4675)) continue;
            blockPos3 = blockPos4;
        }
    }

    private static boolean Method4675(EnumFacing enumFacing) {
        int n;
        if (enumFacing != EnumFacing.UP) {
            n = (int)((long)570852950 ^ (long)570852951);
            return n != 0;
        }
        n = (int)484836454L ^ 0x1CE60466;
        return n != 0;
    }

    private static boolean Method4676(EnumFacing enumFacing, EnumFacing enumFacing2) {
        int n;
        if (enumFacing2 != enumFacing.getOpposite()) {
            n = (int)((long)-558963231 ^ (long)-558963232);
            return n != 0;
        }
        n = (int)((long)331221438 ^ (long)331221438);
        return n != 0;
    }

    private static int Method4677(BlockPos blockPos, EnumFacing enumFacing, EnumFacing enumFacing2) {
        BlockPos blockPos2 = blockPos.offset(enumFacing).up();
        BlockPos blockPos3 = blockPos.offset(enumFacing2).up();
        return Double.compare(jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos2.getX(), (double)blockPos2.getY(), (double)blockPos2.getZ()), jSKTan4w0atm0hIPAj35qMAvGu5BUP7S.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos3.getX(), (double)blockPos3.getY(), (double)blockPos3.getZ()));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1674922614 ^ (long)1674922614);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1286980040L ^ 0xB34A3EC7);
            int n2 = (int)1608837852L ^ 0x5FE4EAD3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1295542692L ^ 0xB2C79F49) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

