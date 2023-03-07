//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import lavahack.client.EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.Zhgf3QiCpopc7WZLbt543132rYDzfYwu;
import lavahack.client.bZiUWDeb9iTD5vBgY6J7hAWBm6xzdKPD;
import lavahack.client.cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import lavahack.client.zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM
@EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH
public class zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14271 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x852E6BD90D2F7D4AL ^ 0xC53D58EA3E1C4E79L), 1.0, Double.longBitsToDouble(0x51AE729C349B2EL ^ 0x4049AE729C349B2EL), ((int)-2100436811L ^ 0x82CDE0B5) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14272 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ray Trace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)866593282 ^ (long)866593283)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14273 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field14905));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14274 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x5A8077EF51D3420FL ^ 0x1A8077EF51D3420FL), 0.0, Double.longBitsToDouble((long)1708094260 ^ 0x4034000065CF7334L), ((int)1378367195L ^ 0x522836DA) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14275 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TargetHoleRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x1FE0BA94BBB64E95L ^ 0x5FF389A788857DA6L), 1.0, Double.longBitsToDouble(0x206CB37647E9ABD1L ^ 0x6074B37647E9ABD1L), ((int)-1414047614L ^ 0xABB75882) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14276 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SwitchMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field7859));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14277 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CrystalDMGCheck", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1371540939 ^ (long)-1371540939)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14278 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MinDMG", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x2DE17B8CE3DC287L ^ 0x42CA17B8CE3DC287L), 0.0, Double.longBitsToDouble((long)1238483041 ^ 0x4042000049D1C061L), ((int)-973805097L ^ 0xC5F4E9D6) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14279 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MaxSelfDMG", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1434522615 ^ 0x402E0000558113F7L), 0.0, Double.longBitsToDouble(0x202E705836A10340L ^ 0x606C705836A10340L), ((int)-981633906L ^ 0xC57D748F) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14280 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Renderer", this)));
    private final cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs Field14281 = new cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs(this).Method6046(this.Field14280).Method6042().Method6043();
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam Field14282;
    private final ArrayList Field14283 = new ArrayList();
    private final ArrayList Field14284 = new ArrayList();
    private final ArrayList Field14285 = new ArrayList();
    private int Field14286 = (int)-2114630936L ^ 0x81F54AE8;
    private BlockPos Field14287 = null;
    @Zhgf3QiCpopc7WZLbt543132rYDzfYwu
    public EntityPlayer Field14288;
    public zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14289;
    private String Field14290 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam() {
        super("CrystalFiller", "HoleFiller but crystal", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        super.Method44(this::Method5494);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field14288 = null;
        this.Field14289 = null;
        this.Field14286 = (int)((long)1751539200 ^ (long)1751539200);
        this.Field14283.clear();
        this.Field14284.clear();
        this.Field14285.clear();
    }

    @Override
    public void Method45() {
        if (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field14288 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(this.Field14271.Method368());
        if (this.Field14288 == null) {
            return;
        }
        this.Field14287 = null;
        this.Method20();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5487(RenderWorldLastEvent renderWorldLastEvent) {
        this.Field14281.Method3805(this.Field14287);
    }

    /*
     * Exception decompiling
     */
    private void Method20() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getInt(SwitchStringRewriter.java:417)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$700(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at the.bytecode.club.bytecodeviewer.decompilers.impl.CFRDecompiler.decompileToZip(CFRDecompiler.java:306)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.decompileSaveAll(ResourceDecompiling.java:262)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.lambda$decompileSaveAll$0(ResourceDecompiling.java:127)
         *     at java.base/java.lang.Thread.run(Thread.java:833)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void Method5488() {
        this.Field14289 = this.Method5489();
    }

    private zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method5489() {
        return this.Field14283.stream().filter(this::Method5491).min(Comparator.comparing(zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam::Method5493)).orElse(null);
    }

    private void Method5490(EntityPlayer entityPlayer, float f) {
        this.Field14283.clear();
        Iterator iterator = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7756((Entity)entityPlayer, f, (boolean)((long)580472986 ^ (long)580472987), ((int)-262597091L ^ 0xF059161D) != 0).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (!zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) || !this.Method5492(blockPos)) continue;
            this.Field14283.add(new zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, (float)zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos), (float)entityPlayer.getDistanceSq(blockPos)));
        }
    }

    private boolean Method5491(zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        int n;
        if ((double)bZiUWDeb9iTD5vBgY6J7hAWBm6xzdKPD.Method4534((Entity)zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8234) > this.Field14271.Method367()) {
            return (int)((long)-203852340 ^ (long)-203852340) != 0;
        }
        if (this.Field14273.Method359().equals(zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field14906.name()) && this.Field14288 != null) {
            if ((double)bZiUWDeb9iTD5vBgY6J7hAWBm6xzdKPD.Method4534((Entity)this.Field14288, zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8234) > this.Field14275.Method367()) {
                return (int)((long)-1243591977 ^ (long)-1243591977) != 0;
            }
            if (this.Field14277.Method365()) {
                float f = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7772((World)zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8234, (Entity)this.Field14288);
                float f2 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7772((World)zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8234, (Entity)zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                if ((double)f < this.Field14278.Method367()) return (int)((long)-624033052 ^ (long)-624033052) != 0;
                if ((double)f2 > this.Field14279.Method367()) {
                    return (int)((long)-624033052 ^ (long)-624033052) != 0;
                }
            }
        }
        if (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8234.up((int)((long)1189384135 ^ (long)1189384134))).getBlock().equals(Blocks.AIR) && zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8234.up((int)((long)-970712700 ^ (long)-970712699) << 1)).getBlock().equals(Blocks.AIR) && zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8234.up((int)2065093234L ^ 0x7B16D271)).getBlock().equals(Blocks.AIR)) {
            n = (int)((long)505321359 ^ (long)505321358);
            return n != 0;
        }
        n = (int)((long)1621849843 ^ (long)1621849843);
        return n != 0;
    }

    private boolean Method5492(BlockPos blockPos) {
        int n;
        int n2 = (int)((long)1825315277 ^ (long)1825315277);
        if (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-750962996L ^ 0xD33D36CC, (int)976948445L ^ 0x3A3B0CDE, (int)836583929L ^ 0x31DD41F9)).getBlock() == Blocks.AIR) {
            ++n2;
        }
        if (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)1943147753L ^ 0x73D214E9, (int)((long)-1009430661 ^ (long)-1009430662) << 1, (int)-1786599749L ^ 0x9582A6BB)).getBlock() == Blocks.AIR) {
            ++n2;
        }
        if (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)724832504 ^ (long)724832504), (int)((long)-341669405 ^ (long)-341669406), (int)((long)-547806569 ^ (long)-547806569))).getBlock() == Blocks.AIR) {
            ++n2;
        }
        if (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-69536621 ^ (long)-69536621), (int)((long)521180987 ^ (long)521180987), (int)1133159499L ^ 0x438AA44B)).getBlock() == Blocks.AIR) {
            ++n2;
        }
        if (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-590265283L ^ 0xDCD1443D, (int)-1003599590L ^ 0x3BD1B6E5, (int)((long)-407248109 ^ (long)-407248109))).getBlock() == Blocks.OBSIDIAN || zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-617307281 ^ (long)-617307281), (int)1992962654L ^ 0x8935CDA1, (int)((long)343884920 ^ (long)343884920))).getBlock() == Blocks.BEDROCK || zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-1750774507 ^ (long)-1750774507), (int)((long)-1230450850 ^ (long)1230450849), (int)953853973L ^ 0x38DAA815)).getBlock() == Blocks.ENDER_CHEST) {
            ++n2;
        }
        if (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)1016311298 ^ (long)1016311299), (int)-851377857L ^ 0xCD41013F, (int)1818432425L ^ 0x6C6313A9)).getBlock() == Blocks.OBSIDIAN || zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-1133764622 ^ (long)-1133764621), (int)-783569900L ^ 0xD14BAC14, (int)((long)1443112120 ^ (long)1443112120))).getBlock() == Blocks.BEDROCK || zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-5551073 ^ (long)-5551074), (int)((long)-694616879 ^ (long)-694616879), (int)329366100L ^ 0x13A1BA54)).getBlock() == Blocks.ENDER_CHEST) {
            ++n2;
        }
        if (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)1647277587L ^ 0x9DD089EC, (int)-359268032L ^ 0xEA960140, (int)-712133780L ^ 0xD58DB36C)).getBlock() == Blocks.OBSIDIAN || zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-1971264449 ^ (long)1971264448), (int)-672835940L ^ 0xD7E5569C, (int)((long)356437439 ^ (long)356437439))).getBlock() == Blocks.BEDROCK || zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-2019422021 ^ (long)2019422020), (int)((long)1632624516 ^ (long)1632624516), (int)((long)2071233275 ^ (long)2071233275))).getBlock() == Blocks.ENDER_CHEST) {
            ++n2;
        }
        if (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)551180750 ^ (long)551180750), (int)982182636L ^ 0x3A8AEAEC, (int)-884449720L ^ 0xCB485E49)).getBlock() == Blocks.OBSIDIAN || zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)126940035 ^ (long)126940035), (int)((long)-1327215460 ^ (long)-1327215460), (int)1127917004L ^ 0x433AA5CD)).getBlock() == Blocks.BEDROCK || zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)1439308514 ^ (long)1439308514), (int)619238072L ^ 0x24E8D2B8, (int)337124645L ^ 0x14181D24)).getBlock() == Blocks.ENDER_CHEST) {
            ++n2;
        }
        if (zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-1669218742 ^ (long)-1669218742), (int)((long)-144102691 ^ (long)-144102691), (int)((long)638614585 ^ (long)-638614586))).getBlock() == Blocks.OBSIDIAN || zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)434620214L ^ 0x19E7C736, (int)((long)-1516945980 ^ (long)-1516945980), (int)-129580327L ^ 0x7B93D26)).getBlock() == Blocks.BEDROCK || zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-287945860 ^ (long)-287945860), (int)-555026732L ^ 0xDEEAF6D4, (int)((long)627259889 ^ (long)-627259890))).getBlock() == Blocks.ENDER_CHEST) {
            ++n2;
        }
        if (n2 >= ((int)-103824524L ^ 0xF9CFC37D)) {
            n = (int)((long)-243817472 ^ (long)-243817471);
            return n != 0;
        }
        n = (int)-285726868L ^ 0xEEF8276C;
        return n != 0;
    }

    private static Double Method5493(zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        return zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8234);
    }

    private String Method5494() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("[");
        if (this.Field14288 == null) {
            string = "no target no fun";
            return stringBuilder.append(string).append("]").toString();
        }
        string = this.Field14288.getName();
        return stringBuilder.append(string).append("]").toString();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1516524753 ^ (long)1516524753);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-314125111 ^ (long)-314125258);
            int n2 = (int)-1686804033L ^ 0x9B7569BA;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1638233388L ^ 0x9E5A8957) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

