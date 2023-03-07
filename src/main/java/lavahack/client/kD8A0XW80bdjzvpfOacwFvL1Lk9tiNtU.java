//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lavahack.client.kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU {
    private static final Minecraft Field15072 = Minecraft.getMinecraft();
    private String Field15073 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static List Method6031(double d) {
        List list = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7758((float)d, (boolean)((long)-1990269734 ^ (long)-1990269733), (boolean)((long)-1259626650 ^ (long)-1259626650));
        ArrayList<kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf> arrayList = new ArrayList<kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf>();
        HashSet hashSet = new HashSet();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
            BlockPos blockPos = (BlockPos)iterator.next();
            if (hashSet.contains(blockPos) || (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6032(blockPos)) == null) continue;
            hashSet.addAll(kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method7276());
            arrayList.add(kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        }
        return arrayList;
    }

    public static kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Method6032(BlockPos blockPos) {
        BlockPos blockPos2;
        if (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6038(blockPos, (boolean)((long)405583038 ^ (long)405583039))) {
            return null;
        }
        if (!kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6038(blockPos.down(), (boolean)((long)555792630 ^ (long)555792630))) {
            return null;
        }
        List list = Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).filter(kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU::Method6035).collect(Collectors.toList());
        if (list.size() <= (int)((long)-297774120 ^ (long)-297774119)) {
            return null;
        }
        if (list.size() >= (int)((long)108256340 ^ (long)108256341) << 2) {
            if (!kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6037(blockPos)) {
                return null;
            }
            kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = null;
            Iterator iterator = list.iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    BlockPos[] blockPosArray = new BlockPos[(int)((long)890747221 ^ (long)890747220)];
                    blockPosArray[(int)-2120502611L ^ 0x819BB2AD] = blockPos;
                    return new kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(Arrays.asList(blockPosArray), new AxisAlignedBB(blockPos), kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field11374, kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
                }
                BlockPos blockPos3 = (BlockPos)iterator.next();
                kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6034(kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6036(blockPos3), kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
            }
        }
        if (list.size() >= (int)((long)1522387488 ^ (long)1522387491)) {
            BlockPos blockPos4 = Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).filter(arg_0 -> kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6039(list, arg_0)).findFirst().orElse(null);
            if (blockPos4 == null) {
                return null;
            }
            if (!kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6037(blockPos) && !kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6037(blockPos4)) {
                return null;
            }
            kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field11375;
            if (!kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6038(blockPos4.down(), ((int)-243881557L ^ 0xF176A9AB) != 0)) {
                kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field11376;
            }
            kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = null;
            List list2 = Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).collect(Collectors.toList());
            list2.addAll(Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos4).offset(arg_0)).collect(Collectors.toList()));
            list2.remove(blockPos);
            list2.remove(blockPos4);
            for (BlockPos blockPos5 : list2) {
                if (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6035(blockPos5)) continue;
                return null;
            }
            for (BlockPos blockPos5 : list2) {
                kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6034(kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6036(blockPos5), kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
            }
            if (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV == null) {
                return null;
            }
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB((double)Math.min(blockPos.getX(), blockPos4.getX()), (double)Math.min(blockPos.getY(), blockPos4.getY()), (double)Math.min(blockPos.getZ(), blockPos4.getZ()), (double)(Math.max(blockPos.getX(), blockPos4.getX()) + ((int)662919345L ^ 0x278358B0)), (double)(Math.max(blockPos.getY(), blockPos4.getY()) + ((int)1761629416L ^ 0x690054E9)), (double)(Math.max(blockPos.getZ(), blockPos4.getZ()) + (int)((long)233266891 ^ (long)233266890)));
            BlockPos[] blockPosArray = new BlockPos[((int)-1276632869L ^ 0xB3E820DA) << 1];
            blockPosArray[(int)((long)-490701340 ^ (long)-490701340)] = blockPos;
            blockPosArray[(int)((long)340543373 ^ (long)340543372)] = blockPos4;
            return new kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(Arrays.asList(blockPosArray), axisAlignedBB, kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        }
        EnumFacing enumFacing = kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6033(blockPos, (BlockPos)list.get((int)2071008598L ^ 0x7B711556));
        EnumFacing enumFacing2 = kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6033(blockPos, (BlockPos)list.get((int)275922894L ^ 0x10723FCF));
        if (enumFacing == null) return null;
        if (enumFacing2 == null) {
            return null;
        }
        enumFacing = enumFacing.getOpposite();
        enumFacing2 = enumFacing2.getOpposite();
        BlockPos[] blockPosArray = new BlockPos[((int)1977453625L ^ 0x75DD8C38) << 2];
        blockPosArray[(int)-2011739757L ^ 0x88174993] = blockPos;
        blockPosArray[(int)-144109206L ^ 0xF769116B] = blockPos.offset(enumFacing);
        blockPosArray[(int)((long)716279042 ^ (long)716279043) << 1] = blockPos.offset(enumFacing2);
        blockPosArray[(int)1483429592L ^ 0x586B56DB] = blockPos.offset(enumFacing).offset(enumFacing2);
        List<BlockPos> list3 = Arrays.asList(blockPosArray);
        int n = (int)732444163L ^ 0x2BA83603;
        Iterator<BlockPos> iterator = list3.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while (!kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6037(blockPos2 = iterator.next()));
        n = (int)-1074136065L ^ 0xBFF9FBFE;
        return null;
    }

    public static EnumFacing Method6033(BlockPos blockPos, BlockPos blockPos2) {
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n2 = (int)-990643750L ^ 0xC4F3F9DA;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            if (blockPos.offset(enumFacing) == blockPos2) {
                return enumFacing;
            }
            ++n2;
        }
        return null;
    }

    public static kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Method6034(kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV == null) {
            return kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4542();
        }
        if (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV == kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field13036) {
            if (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi != kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13001) return kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field13038;
            return kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field13036;
        }
        if (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV != kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field13037) return kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field13038;
        if (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi != kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13001) return kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field13037;
        return kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field13038;
    }

    public static boolean Method6035(BlockPos blockPos) {
        int n;
        if (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Field15072.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK && kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Field15072.world.getBlockState(blockPos).getBlock() != Blocks.OBSIDIAN) {
            n = (int)1155777797L ^ 0x44E3C505;
            return n != 0;
        }
        n = (int)((long)411842360 ^ (long)411842361);
        return n != 0;
    }

    public static kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method6036(BlockPos blockPos) {
        if (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Field15072.world.getBlockState(blockPos).getBlock() == Blocks.OBSIDIAN) {
            return kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13002;
        }
        if (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Field15072.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK) return null;
        return kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13001;
    }

    public static boolean Method6037(BlockPos blockPos) {
        int n = (int)-190777193L ^ 0xF4A0F897;
        int n2 = (int)((long)2105679432 ^ (long)2105679432);
        while (true) {
            int cfr_ignored_0 = ((int)-845949999L ^ 0xCD93D3D0) << 1;
            n |= kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6038(blockPos.up(n2 + ((int)-1253582771L ^ 0xB547D84C)), (boolean)((long)-1635591822 ^ (long)-1635591821));
            ++n2;
        }
    }

    public static boolean Method6038(BlockPos blockPos, boolean bl) {
        IBlockState iBlockState = kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Field15072.world.getBlockState(blockPos);
        return iBlockState.getBlock().canCollideCheck(iBlockState, bl);
    }

    private static boolean Method6039(List list, BlockPos blockPos) {
        boolean bl;
        if (!list.contains(blockPos)) {
            bl = (int)316922721L ^ 0x12E3DB60;
            return bl;
        }
        bl = (int)1058430759L ^ 0x3F165F27;
        return bl;
    }
}

