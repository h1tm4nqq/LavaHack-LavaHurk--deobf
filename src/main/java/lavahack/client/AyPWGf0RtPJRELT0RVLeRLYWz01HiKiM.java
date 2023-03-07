//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.HashMap;
import java.util.Map;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM {
    private static final Minecraft Field16900 = Minecraft.getMinecraft();
    private String Field16901 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method7129(Entity entity, boolean bl, boolean bl2) {
        boolean bl3;
        if (!AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7131(new BlockPos(entity.getPositionVector()), bl, bl2).Method6959().equals((Object)AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9771)) {
            bl3 = (int)-785710489L ^ 0xD12B0266;
            return bl3;
        }
        bl3 = (int)956721084L ^ 0x390667BC;
        return bl3;
    }

    public static AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Method7130(Block block) {
        if (block == Blocks.BEDROCK) {
            return AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9697;
        }
        if (block == Blocks.OBSIDIAN) return AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9698;
        if (block == Blocks.ENDER_CHEST) return AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9698;
        if (block != Blocks.ANVIL) return AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9699;
        return AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9698;
    }

    public static AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Method7131(BlockPos blockPos, boolean bl, boolean bl2) {
        AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV();
        HashMap hashMap = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7133(blockPos);
        if (hashMap.containsKey((Object)AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10833) && hashMap.remove((Object)AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10833, (Object)AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9699) && !bl2) {
            ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6957(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9699);
            return ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        }
        int n = hashMap.size();
        hashMap.entrySet().removeIf(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM::Method7135);
        if (hashMap.size() != n) {
            ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6957(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9698);
        }
        if ((n = hashMap.size()) == 0) {
            ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6956(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9768);
            ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6958(new AxisAlignedBB(blockPos));
            ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16564.add(blockPos);
            return ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        }
        if (n == (int)((long)2142214599 ^ (long)2142214598) && !bl) {
            return AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7132(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, blockPos, (AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((Object)hashMap.keySet().stream().findFirst().get()));
        }
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6957(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9699);
        return ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
    }

    private static AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Method7132(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, BlockPos blockPos, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        BlockPos blockPos2 = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2846(blockPos);
        HashMap hashMap = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7133(blockPos2);
        int n = hashMap.size();
        hashMap.entrySet().removeIf(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM::Method7134);
        if (hashMap.size() != n) {
            ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6957(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9698);
        }
        if (hashMap.containsKey((Object)AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10833)) {
            ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6956(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9770);
            hashMap.remove((Object)AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10833);
        }
        if (hashMap.size() > (int)((long)-1427982166 ^ (long)-1427982165)) {
            ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6956(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9771);
            return ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        }
        double d = Math.min(blockPos.getX(), blockPos2.getX());
        double d2 = Math.max(blockPos.getX(), blockPos2.getX()) + (int)((long)-399877764 ^ (long)-399877763);
        double d3 = Math.min(blockPos.getZ(), blockPos2.getZ());
        double d4 = Math.max(blockPos.getZ(), blockPos2.getZ()) + (int)((long)-1456573368 ^ (long)-1456573367);
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6958(new AxisAlignedBB(d, (double)blockPos.getY(), d3, d2, (double)(blockPos.getY() + (int)((long)-1573864293 ^ (long)-1573864294)), d4));
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16564.add(blockPos);
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16564.add(blockPos2);
        if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6959() == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9770) return ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6956(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9769);
        return ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
    }

    public static HashMap Method7133(BlockPos blockPos) {
        HashMap<AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf> hashMap = new HashMap<AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf>();
        AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7130(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Field16900.world.getBlockState(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10833.Method2846(blockPos)).getBlock());
        if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf != AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9697) {
            hashMap.put(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10833, ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        }
        if ((ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7130(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Field16900.world.getBlockState(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10835.Method2846(blockPos)).getBlock())) != AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9697) {
            hashMap.put(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10835, ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        }
        if ((ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7130(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Field16900.world.getBlockState(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10837.Method2846(blockPos)).getBlock())) != AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9697) {
            hashMap.put(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10837, ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        }
        if ((ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7130(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Field16900.world.getBlockState(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10836.Method2846(blockPos)).getBlock())) != AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9697) {
            hashMap.put(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10836, ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        }
        if ((ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7130(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Field16900.world.getBlockState(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10838.Method2846(blockPos)).getBlock())) == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9697) return hashMap;
        hashMap.put(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10838, ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        return hashMap;
    }

    private static boolean Method7134(Map.Entry entry) {
        int n;
        if (entry.getValue() == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9698) {
            n = (int)((long)192321678 ^ (long)192321679);
            return n != 0;
        }
        n = (int)21681247L ^ 0x14AD45F;
        return n != 0;
    }

    private static boolean Method7135(Map.Entry entry) {
        boolean bl;
        if (entry.getValue() == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9698) {
            bl = (int)-1685171925L ^ 0x9B8E512A;
            return bl;
        }
        bl = (int)1960691565L ^ 0x74DDC76D;
        return bl;
    }
}

