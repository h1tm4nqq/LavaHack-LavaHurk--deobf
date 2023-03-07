//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.R5qRfoconoryjIZMLcXF3UgKlG2GLvzd;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.dMPXKkhJGMQeN15BHtks5yzrr7htHAKL;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Deprecated
public class UCZ5eyIdbomptDIyc07IMnAE53rUaaNS
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11686 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Obsidian", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-208099970 ^ (long)-208099969)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11687 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Bedrock", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1028098686 ^ (long)1028098687)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11688 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Single", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)207827474L ^ 0xC633213) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11689 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Double", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-268025101L ^ 0xF00642F2) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11690 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)365904260 ^ 0x4028000015CF4184L), 1.0, Double.longBitsToDouble(0x4728D01AE7E9350CL ^ 0x71CD01AE7E9350CL), ((int)1486284950L ^ 0x5896E896) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11691 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Limit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0xF0C06055C7B31CL ^ 0x40B9C06055C7B31CL), ((int)1361541485L ^ 0x5127796C) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11692 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RenderObsidian", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1143214973L ^ 0xBBDBEC82) != 0));
    private final dMPXKkhJGMQeN15BHtks5yzrr7htHAKL Field11693 = new R5qRfoconoryjIZMLcXF3UgKlG2GLvzd(this, "").Method2729();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11694 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Height", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, (boolean)((long)245235302 ^ (long)245235302)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11695 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RenderBedrock", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-310123555 ^ (long)-310123556)));
    private final dMPXKkhJGMQeN15BHtks5yzrr7htHAKL Field11696 = new R5qRfoconoryjIZMLcXF3UgKlG2GLvzd(this, "2").Method2729();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11697 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Height 2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, ((int)1980933101L ^ 0x7612A3ED) != 0));
    private int Field11698 = (int)((long)250900819 ^ (long)250900819);
    private List Field11699 = new ArrayList();
    private Map Field11700 = new HashMap(((int)-1747831676L ^ 0x97D23485) << 7);
    private String Field11701 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public UCZ5eyIdbomptDIyc07IMnAE53rUaaNS() {
        super("HoleESPRewrite", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @Override
    public void Method45() {
        if (UCZ5eyIdbomptDIyc07IMnAE53rUaaNS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (UCZ5eyIdbomptDIyc07IMnAE53rUaaNS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field11699 = this.Method3673();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3672(RenderWorldLastEvent renderWorldLastEvent) {
        if (UCZ5eyIdbomptDIyc07IMnAE53rUaaNS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (UCZ5eyIdbomptDIyc07IMnAE53rUaaNS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        HashSet<AxisAlignedBB> hashSet = new HashSet<AxisAlignedBB>((int)((long)-454521017 ^ (long)-454521018) << 7);
        Iterator iterator = this.Field11699.iterator();
        while (true) {
            CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY cwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY;
            if (!iterator.hasNext()) {
                hashSet.clear();
                return;
            }
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = (AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)iterator.next();
            if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV == null) continue;
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6960();
            if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == null) {
                return;
            }
            if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9699 && !this.Field11695.Method365() || !this.Field11692.Method365() || (cwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY = (CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY)this.Field11700.get(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)) == null || hashSet.contains(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6961())) continue;
            ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22 = new ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6961());
            ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13621 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13618 + this.Field11694.Method367();
            if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9697) {
                ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13621 = ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13618 + this.Field11697.Method367();
            }
            cwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY.Method7308(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22).Method7317();
            hashSet.add(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6961());
        }
    }

    private List Method3673() {
        ArrayList arrayList = new ArrayList(((int)1336563097L ^ 0x4FAA5598) << 6);
        float f = this.Field11690.Method368();
        Set set = this.Method3675(f);
        this.Field11698 = (int)88210646L ^ 0x541FCD6;
        this.Field11700.clear();
        if (this.Field11688.Method365()) {
            arrayList.addAll(this.Method3674(set, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9768));
        }
        if (!this.Field11689.Method365()) return arrayList;
        arrayList.addAll(this.Method3674(set, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9769));
        return arrayList;
    }

    private List Method3674(Set set, AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        ArrayList<AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV> arrayList = new ArrayList<AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV>((int)((long)958366266 ^ (long)958366267) << 5);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (this.Field11691.Method335() != 0 && this.Field11698 > this.Field11691.Method335()) {
                return arrayList;
            }
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7131(blockPos, (boolean)((long)-198685778 ^ (long)-198685778), (boolean)((long)-817596687 ^ (long)-817596687));
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6959();
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6960();
            if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 != ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) continue;
            if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9697 && this.Field11687.Method365()) {
                arrayList.add(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
                this.Field11700.put(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field11696.Method2732());
                this.Field11698 += (int)-1718812649L ^ 0x998D0016;
                continue;
            }
            if (!this.Field11686.Method365()) continue;
            arrayList.add(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
            this.Field11700.put(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.Field11693.Method2732());
            this.Field11698 += (int)((long)-1593266023 ^ (long)-1593266024);
        }
        return arrayList;
    }

    private Set Method3675(float f) {
        HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
        List list = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1946(new BlockPos(UCZ5eyIdbomptDIyc07IMnAE53rUaaNS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, UCZ5eyIdbomptDIyc07IMnAE53rUaaNS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, UCZ5eyIdbomptDIyc07IMnAE53rUaaNS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), f, (int)f, ((int)222410415L ^ 0xD41B6AF) != 0, ((int)-1547129426L ^ 0xA3C8ADAF) != 0, (int)-752712106L ^ 0xD3228656);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
            if (!UCZ5eyIdbomptDIyc07IMnAE53rUaaNS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).isEmpty() || !UCZ5eyIdbomptDIyc07IMnAE53rUaaNS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) || UCZ5eyIdbomptDIyc07IMnAE53rUaaNS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)610600744 ^ (long)610600744), (int)((long)-1006059509 ^ (long)1006059508), (int)-19579720L ^ 0xFED53CB8)).getBlock().equals(Blocks.AIR) || !UCZ5eyIdbomptDIyc07IMnAE53rUaaNS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-1911038854L ^ 0x8E17DC7A, (int)((long)-1163761009 ^ (long)-1163761010), (int)-1147952401L ^ 0xBB93A2EF)).getBlock().equals(Blocks.AIR) || !UCZ5eyIdbomptDIyc07IMnAE53rUaaNS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)1785202640L ^ 0x6A6807D0, ((int)-1498303089L ^ 0xA6B1B58E) << 1, (int)((long)-310176073 ^ (long)-310176073))).getBlock().equals(Blocks.AIR)) continue;
            hashSet.add(blockPos);
        }
        return hashSet;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)83746622 ^ (long)83746622);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-994911882L ^ 0xC4B2D989);
            int n2 = (int)-224936428L ^ 0xF297BE41;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)120019401 ^ (long)120026134) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

