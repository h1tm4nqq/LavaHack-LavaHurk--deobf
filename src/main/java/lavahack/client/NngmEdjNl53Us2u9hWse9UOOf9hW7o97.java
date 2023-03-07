//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import lavahack.client.AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y;
import lavahack.client.NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vo8JGtFXaeonZQiouVGTbpILJYQDvWk4;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;

public class NngmEdjNl53Us2u9hWse9UOOf9hW7o97
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14385 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SurroundVec", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8358);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14386 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Completion", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field15115);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14387 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Center", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10963);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14388 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, NngmEdjNl53Us2u9hWse9UOOf9hW7o97$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field16072);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14389 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hand", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15103);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14390 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("BlocksPerTick", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1069413959 ^ 0x401000003FBDF647L), 0.0, Double.longBitsToDouble(0x29879CB89F9F4E5DL ^ 0x69A39CB89F9F4E5DL), ((int)-14669019L ^ 0xFF202B24) != 0);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14391 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RayTrace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)2106624162L ^ 0x7D9088A2) != 0);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14392 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1915630574 ^ (long)1915630574));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14393 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Confirm", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1044550888L ^ 0x3E4294E8) != 0);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14394 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Interact", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-568690348L ^ 0xDE1A7954) != 0);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14395 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-175985959 ^ (long)-175985959));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14396 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Dynamic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-895742604 ^ (long)-895742604));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14397 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Support", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field15462);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14398 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Retries", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xEFC5BA74D3BED076L ^ 0xAFD1BA74D3BED076L), 0.0, Double.longBitsToDouble(0x3F65BB1ACC887B28L ^ 0x7F51BB1ACC887B28L), ((int)-635078476L ^ 0xDA2578B5) != 0);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14399 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Protect Retries", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x36C3201D52526F37L ^ 0x76D7201D52526F37L), 0.0, Double.longBitsToDouble((long)301170471 ^ 0x4034000011F37F27L), (boolean)((long)-695913175 ^ (long)-695913176));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14400 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field15962);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14401 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Crystal Breaker", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1977948993L ^ 0x75E51B40) != 0);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14402 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Break Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x163C4BB74FA0D648L ^ 0x56184BB74FA0D648L), 0.0, Double.longBitsToDouble(0x590AF641B6C938C0L ^ 0x1953F641B6C938C0L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14403 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Break Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)243272149 ^ 0x401400000E8009D5L), 1.0, Double.longBitsToDouble((long)95850504 ^ 0x4018000005B69008L), ((int)-900994494L ^ 0xCA4BEA42) != 0);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14404 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Protect Vec", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)442969845 ^ (long)442969845));
    public static NngmEdjNl53Us2u9hWse9UOOf9hW7o97 Field14405;
    private int Field14406 = (int)((long)418202871 ^ (long)-418202872);
    private int Field14407;
    private int Field14408;
    private int Field14409;
    private int Field14410 = (int)1288831304L ^ 0x4CD20148;
    private BlockPos Field14411 = BlockPos.ORIGIN;
    private BlockPos Field14412 = BlockPos.ORIGIN;
    private IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14413 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private ArrayList Field14414 = new ArrayList();
    private String Field14415 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public NngmEdjNl53Us2u9hWse9UOOf9hW7o97() {
        super("Surround", "Surround", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        Field14405 = this;
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14385);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14386);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14387);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14388);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14389);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14390);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14391);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14392);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14393);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14394);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14395);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14396);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14397);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14398);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14399);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14400);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14401);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14402);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14403);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14404);
    }

    @Override
    public void Method38() {
        this.Field14411 = new BlockPos(new Vec3d((double)dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2112(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().x, (int)((long)776958414 ^ (long)776958414)), (double)dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2112(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().y, (int)1050461302L ^ 0x3E9CC476), (double)dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2112(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().z, (int)-564982182L ^ 0xDE530E5A)));
        String string = this.Field14387.Method359();
        int n = (int)98516681L ^ 0xFA20C136;
        switch (string.hashCode()) {
            case -577575125: {
                if (!string.equals("TELEPORT")) return;
                n = (int)((long)1011445415 ^ (long)1011445415);
                return;
            }
            case -2014989386: {
                if (!string.equals("MOTION")) return;
                n = (int)((long)1683707173 ^ (long)1683707172);
                return;
            }
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void Method45() {
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

    private NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Method5565(String string) {
        String string2 = string;
        int n = (int)634000788L ^ 0xDA35EA6B;
        switch (string2.hashCode()) {
            case 2031313: {
                if (!string2.equals("BASE")) return NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8358;
                n = (int)((long)261435055 ^ (long)261435055);
                return NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8358;
            }
            case 2095255245: {
                if (!string2.equals("STANDART")) return NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8358;
                n = (int)((long)69474016 ^ (long)69474017);
                return NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8358;
            }
            case 408969903: {
                if (!string2.equals("PROTECT")) return NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8358;
                n = (int)((long)-1695505403 ^ (long)-1695505404) << 1;
                return NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8358;
            }
            case 1463156937: {
                if (!string2.equals("PROTECTplus")) return NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8358;
                n = (int)1651509770L ^ 0x62700A09;
                return NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8358;
            }
        }
        return NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field8358;
    }

    public void Method20() {
        this.Field14406 = NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (!NngmEdjNl53Us2u9hWse9UOOf9hW7o97.Method5569((Entity)NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && !this.Field14395.Method365()) {
            lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Item.getItemFromBlock((Block)Blocks.OBSIDIAN), (int)856570297L ^ 0x330E39B9, (int)544809853L ^ 0x20792374), this.Field14388.Method359().equals("Silent"));
            this.Method5566();
            if (!this.Field14388.Method359().equals("Silent")) return;
            lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(this.Field14406, ((int)-1824844126L ^ 0x933B16A3) != 0);
            return;
        }
        if (!this.Field14395.Method365()) return;
        this.Method5566();
    }

    public void Method5566() {
        block19: {
            Iterator iterator;
            float[] fArray;
            block20: {
                block18: {
                    int n;
                    if (!this.Field14395.Method365()) break block18;
                    if (this.Method5572().isEmpty()) break block19;
                    if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.OBSIDIAN, (int)454523917L ^ 0x1B177C0D, (int)-421107658L ^ 0xE6E6683F) != (int)((long)2029269042 ^ (long)-2029269043)) {
                        n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.OBSIDIAN, (int)1250581783L ^ 0x4A8A5D17, (int)((long)-971253294 ^ (long)-971253285));
                    } else {
                        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.ENDER_CHEST, (int)1378658581L ^ 0x522CA915, (int)-1639316885L ^ 0x9E4A0262) == (int)((long)-1177109720 ^ (long)1177109719)) return;
                        n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.OBSIDIAN, (int)1479389163L ^ 0x582DAFEB, (int)((long)-766282823 ^ (long)-766282832));
                    }
                    lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(n, this.Field14388.Method359().equals("Silent"));
                    float[] fArray2 = new float[((int)-2132328376L ^ 0x80E74049) << 1];
                    fArray2[(int)-2059169114L ^ 0x854392A6] = NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
                    fArray2[(int)((long)1824224898 ^ (long)1824224899)] = NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
                    fArray = fArray2;
                    iterator = this.Method5572().iterator();
                    break block20;
                }
                Iterator iterator2 = NngmEdjNl53Us2u9hWse9UOOf9hW7o97$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method816(this.Method5565(this.Field14385.Method359())).iterator();
                while (iterator2.hasNext()) {
                    Vec3d vec3d = (Vec3d)iterator2.next();
                    if (!Objects.equals((Object)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(new BlockPos(vec3d.add(new Vec3d(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)Math.round(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)))), (Object)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12390) || !((double)this.Field14410 <= this.Field14390.Method367())) continue;
                    this.Field14412 = new BlockPos(vec3d.add(new Vec3d(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)Math.round(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)));
                    for (Entity entity : NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
                        if (!(entity instanceof EntityItem) || !((EntityItem)entity).getItem().getItem().equals(Item.getItemFromBlock((Block)Blocks.OBSIDIAN))) continue;
                        entity.setDead();
                        NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(entity.getEntityId());
                    }
                    boolean bl = NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSneaking();
                    if (this.Field14394.Method365()) {
                        NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking((boolean)((long)-811840416 ^ (long)-811840415));
                    }
                    h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4214(new BlockPos(vec3d.add(new Vec3d(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)Math.round(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ))), this.Field14392.Method365(), this.Field14393.Method365());
                    if (this.Field14394.Method365()) {
                        NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(bl);
                    }
                    PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6632((PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field14389.Method341());
                    this.Field14410 += (int)-598899404L ^ 0xDC4D8535;
                }
                return;
            }
            while (iterator.hasNext()) {
                BlockPos blockPos = (BlockPos)iterator.next();
                if (!this.Field14400.Method359().equalsIgnoreCase(NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field15960.name())) {
                    float[] fArray3 = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6176(blockPos);
                    NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray3[(int)((long)-1698577504 ^ (long)-1698577504)];
                    NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray3[(int)208043979L ^ 0xC667FCA];
                }
                if (!this.Field14397.Method359().equalsIgnoreCase(NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field15462.name()) && (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4215(blockPos) == null || this.Field14397.Method359().equalsIgnoreCase(NngmEdjNl53Us2u9hWse9UOOf9hW7o97$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field15464.name()) && vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5948(blockPos, (boolean)((long)-386614539 ^ (long)-386614540), (boolean)((long)-812358205 ^ (long)-812358206)))) {
                    if (this.Field14401.Method365()) {
                        this.Method5567(blockPos.down());
                    }
                    this.Method5568(blockPos.down());
                }
                if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5951(blockPos, (boolean)((long)1815030584 ^ (long)1815030585), (boolean)((long)-2059744166 ^ (long)-2059744165), (this.Field14408 <= this.Field14398.Method335() ? (int)1227550130L ^ 0x492AEDB3 : (int)((long)794950784 ^ (long)794950784)) != 0)) continue;
                if (this.Field14401.Method365()) {
                    this.Method5567(blockPos);
                }
                this.Method5568(blockPos);
                this.Field14408 += (int)-1947611240L ^ 0x8BE9CF99;
            }
            if (!this.Field14414.isEmpty() && this.Field14404.Method365()) {
                for (BlockPos blockPos : this.Field14414) {
                    if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5951(blockPos, (boolean)((long)752482928 ^ (long)752482929), (boolean)((long)-148219579 ^ (long)-148219580), (this.Field14409 <= this.Field14399.Method335() ? (int)1805403787L ^ 0x6B9C468A : (int)((long)-247337163 ^ (long)-247337163)) != 0)) continue;
                    if (this.Field14401.Method365()) {
                        this.Method5567(blockPos);
                    }
                    this.Method5568(blockPos);
                }
            }
            if (this.Field14388.Method359().equals("Silent")) {
                lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(this.Field14406, ((int)-1542593776L ^ 0xA40DE311) != 0);
            }
            if (this.Field14400.Method359().equalsIgnoreCase(NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field15962.name())) {
                NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray[(int)((long)1801193409 ^ (long)1801193409)];
                NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray[(int)((long)1306433273 ^ (long)1306433272)];
            }
        }
        this.Field14407 = (int)((long)-915428670 ^ (long)-915428670);
        if (!this.Method5572().isEmpty()) {
            return;
        }
        if (this.Field14414.isEmpty()) {
            this.Field14409 = (int)((long)-1773698976 ^ (long)-1773698976);
        }
        this.Field14408 = (int)1310789901L ^ 0x4E21110D;
        if (!this.Field14386.Method359().equalsIgnoreCase(NngmEdjNl53Us2u9hWse9UOOf9hW7o97$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field15118.name())) return;
        this.Method21((boolean)((long)-268047305 ^ (long)-268047305));
    }

    private void Method5567(BlockPos blockPos) {
        Iterator iterator = NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(blockPos)).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof EntityEnderCrystal)) continue;
            if (!this.Field14400.Method359().equalsIgnoreCase(NngmEdjNl53Us2u9hWse9UOOf9hW7o97$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field15960.name())) {
                float[] fArray = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6176(blockPos);
                NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray[(int)-81348242L ^ 0xFB26B96E];
                NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray[(int)((long)1881068601 ^ (long)1881068600)];
            }
            NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
            NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
        }
    }

    private void Method5568(BlockPos blockPos) {
        if (this.Field14407 >= this.Field14390.Method335()) return;
        boolean bl = NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSneaking();
        if (this.Field14394.Method365()) {
            NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking((boolean)((long)916666463 ^ (long)916666462));
        }
        vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5949(blockPos, EnumHand.MAIN_HAND, this.Field14392.Method365());
        if (this.Field14394.Method365()) {
            NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(bl);
        }
        this.Field14407 += (int)1846165261L ^ 0x6E0A3F0C;
    }

    public static boolean Method5569(Entity entity) {
        int n;
        if (!NngmEdjNl53Us2u9hWse9UOOf9hW7o97.Method5570(new BlockPos(entity.posX, (double)Math.round(entity.posY), entity.posZ)) && !NngmEdjNl53Us2u9hWse9UOOf9hW7o97.Method5571(new BlockPos(entity.posX, (double)Math.round(entity.posY), entity.posZ))) {
            n = (int)((long)-803240185 ^ (long)-803240185);
            return n != 0;
        }
        n = (int)1002833039L ^ 0x3BC6048E;
        return n != 0;
    }

    public static boolean Method5570(BlockPos blockPos) {
        int n;
        if (!(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)((long)-643545012 ^ (long)-643545012), (int)((long)-2114948144 ^ (long)-2114948143), (int)((long)-2081148437 ^ (long)-2081148437))) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12390 || NngmEdjNl53Us2u9hWse9UOOf9hW7o97.Method5571(blockPos) || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)-1921094533L ^ 0x8D7E6C7B, (int)-660243534L ^ 0xD8A57BB2, (int)1189434356L ^ 0x46E553F4)) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12390 || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)((long)215724139 ^ (long)215724139), ((int)42440034L ^ 0x2879563) << 1, (int)((long)-1150841784 ^ (long)-1150841784))) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12390 || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)-1737942256L ^ 0x98691B10, (int)1195373469L ^ 0x473FF39D, (int)((long)-629209103 ^ (long)629209102))) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12392 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)((long)-1017263370 ^ (long)-1017263370), (int)1797983943L ^ 0x6B2B0EC7, (int)((long)291551750 ^ (long)-291551751))) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12393 || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)-1994956489L ^ 0x89176136, (int)-1922950196L ^ 0x8D621BCC, (int)((long)901719538 ^ (long)901719538))) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12392 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)((long)1838377209 ^ (long)1838377208), (int)-2124803055L ^ 0x815A1411, (int)((long)585244028 ^ (long)585244028))) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12393 || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)1054481968L ^ 0xC125E1CF, (int)363106424L ^ 0x15A49078, (int)-1300051950L ^ 0xB282C812)) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12392 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)-1166055187L ^ 0x45809712, (int)((long)-417200536 ^ (long)-417200536), (int)-1134438450L ^ 0xBC61D7CE)) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12393 || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)((long)-1725233136 ^ (long)-1725233136), (int)((long)1885824706 ^ (long)1885824706), (int)((long)-1661561403 ^ (long)-1661561404))) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12392 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)((long)1401165685 ^ (long)1401165685), (int)828539410L ^ 0x31628212, (int)-942881232L ^ 0xC7CCC631)) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12393 || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add(Double.longBitsToDouble((long)831616464 ^ 0x3FE00000319175D0L), Double.longBitsToDouble((long)2017402461 ^ 0x3FE00000783F1E5DL), Double.longBitsToDouble((long)1530061920 ^ 0x3FE000005B32E460L))) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12390 || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)1698561348L ^ 0x653DFD44, (int)((long)-211412204 ^ (long)211412203), (int)318767114L ^ 0x1300000A)) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12392 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)-173168151L ^ 0xF5ADA9E9, (int)-1495771846L ^ 0x5927AAC5, (int)1268240960L ^ 0x4B97D240)) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12393)) {
            n = (int)1041409350L ^ 0x3E12A547;
            return n != 0;
        }
        n = (int)1881251402L ^ 0x70219E4A;
        return n != 0;
    }

    public static boolean Method5571(BlockPos blockPos) {
        int n;
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)((long)-1007769414 ^ (long)-1007769414), (int)((long)996406199 ^ (long)996406198), (int)421995928L ^ 0x19272598)) == h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12390 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)((long)-178220441 ^ (long)-178220441), (int)-317022625L ^ 0xED1A9E5F, (int)-1656553280L ^ 0x9D4300C0)) == h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12390 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)((long)-1244822579 ^ (long)-1244822579), (int)((long)693017423 ^ (long)693017422) << 1, (int)((long)-178873660 ^ (long)-178873660))) == h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12390 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)((long)864541526 ^ (long)864541526), (int)((long)705533307 ^ (long)705533307), (int)515954712L ^ 0xE13F27E7)) == h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12393 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)-807220742L ^ 0xCFE2C9FB, (int)((long)-1964130695 ^ (long)-1964130695), (int)32054040L ^ 0x1E91B18)) == h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12393 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)-708619263L ^ 0x2A3CABFE, (int)-1903655959L ^ 0x8E8883E9, (int)((long)532528433 ^ (long)532528433))) == h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12393 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)-391307941L ^ 0xE8AD1D5B, (int)((long)1763569493 ^ (long)1763569493), (int)((long)-1283448037 ^ (long)-1283448038))) == h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12393 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add(Double.longBitsToDouble((long)914460024 ^ 0x3FE0000036818D78L), Double.longBitsToDouble((long)691895546 ^ 0x3FE00000293D7CFAL), Double.longBitsToDouble((long)831109537 ^ 0x3FE000003189B9A1L))) == h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12390 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.add((int)-905041140L ^ 0xCA0E2B0C, (int)-2023964721L ^ 0x78A34030, (int)1872038045L ^ 0x6F95089D)) == h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12393) {
            n = (int)-1811022878L ^ 0x940DFBE3;
            return n != 0;
        }
        n = (int)-761510768L ^ 0xD29C4490;
        return n != 0;
    }

    private List Method5572() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        Iterator iterator = this.Method5574().iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (this.Method5573(blockPos)) continue;
            arrayList.add(blockPos);
        }
        return arrayList;
    }

    private boolean Method5573(BlockPos blockPos) {
        boolean bl;
        if (!NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            bl = (int)-223960690L ^ 0xF2A6A18F;
            return bl;
        }
        bl = (int)-409099853L ^ 0xE79DA1B3;
        return bl;
    }

    private List Method5574() {
        ArrayList arrayList = new ArrayList();
        this.Field14414.clear();
        if (this.Field14396.Method365()) {
            int n;
            int n2;
            double d = Math.abs(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) - Math.floor(Math.abs(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX));
            double d2 = Math.abs(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) - Math.floor(Math.abs(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
            int n3 = this.Method5578(d, (boolean)((long)-1438246359 ^ (long)-1438246359));
            int n4 = this.Method5578(d, ((int)552213386L ^ 0x20EA1B8B) != 0);
            int n5 = this.Method5578(d2, (boolean)((long)-451634955 ^ (long)-451634955));
            int n6 = this.Method5578(d2, (boolean)((long)1848932259 ^ (long)1848932258));
            ArrayList<BlockPos> arrayList2 = new ArrayList<BlockPos>();
            arrayList.addAll(this.Method5576());
            for (n2 = (int)520227023L ^ 0x1F0208CE; n2 < n3 + (int)((long)31656364 ^ (long)31656365); ++n2) {
                arrayList2.add(this.Method5579(this.Method5575(), n2, (int)((long)906111985 ^ (long)906111984) + n5));
                arrayList2.add(this.Method5579(this.Method5575(), n2, -((int)((long)-1370857998 ^ (long)-1370857997) + n6)));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), n2, (int)((long)156912234 ^ (long)156912235) + n5), n2, ((int)((long)-815128728 ^ (long)-815128727) << 1) + n5));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), n2, ((int)-1391911189L ^ 0xAD091EEA) + n5), n2, (int)((long)842240958 ^ (long)842240957) + n5));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), n2, -((int)((long)564392754 ^ (long)564392755) + n6)), n2, -((((int)444320558L ^ 0x1A7BCB2F) << 1) + n6)));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), n2, -((int)((long)1213472105 ^ (long)1213472104) + n6)), n2, -((int)((long)-662935318 ^ (long)-662935319) + n6)));
            }
            for (n2 = (int)((long)-832528356 ^ (long)-832528356); n2 <= n4; ++n2) {
                arrayList2.add(this.Method5579(this.Method5575(), -n2, (int)((long)-1768096578 ^ (long)-1768096577) + n5));
                arrayList2.add(this.Method5579(this.Method5575(), -n2, -(((int)-1642425192L ^ 0x9E1A9499) + n6)));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -n2, ((int)585679511L ^ 0x22E8C296) + n5), -n2, (((int)544521506L ^ 0x2074BD23) << 1) + n5));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -n2, ((int)-1050196923L ^ 0xC1674444) + n5), -n2, (int)((long)1589794675 ^ (long)1589794672) + n5));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -n2, -((int)((long)-1480098423 ^ (long)-1480098424) + n6)), -n2, -(((int)((long)-594367412 ^ (long)-594367411) << 1) + n6)));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -n2, -(((int)358861735L ^ 0x1563CBA6) + n6)), -n2, -(((int)-982419843L ^ 0xC571767E) + n6)));
            }
            for (n = (int)-78043855L ^ 0xFB592530; n < n5 + (int)((long)1618641807 ^ (long)1618641806); ++n) {
                arrayList2.add(this.Method5579(this.Method5575(), ((int)132010114L ^ 0x7DE5083) + n3, n));
                arrayList2.add(this.Method5579(this.Method5575(), -(((int)-5445861L ^ 0xFFACE71A) + n4), n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), (int)((long)793175951 ^ (long)793175950) + n3, n), (((int)-704457538L ^ 0xD602D4BF) << 1) + n3, n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), ((int)533110183L ^ 0x1FC69DA6) + n3, n), (int)((long)-226354966 ^ (long)-226354967) + n3, n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -((int)((long)1048920251 ^ (long)1048920250) + n4), n), -(((int)((long)-723769926 ^ (long)-723769925) << 1) + n4), n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -((int)((long)-1062203080 ^ (long)-1062203079) + n4), n), -((int)((long)-1566208177 ^ (long)-1566208180) + n4), n));
            }
            n = (int)1104218315L ^ 0x41D108CB;
            while (true) {
                if (n > n6) {
                    arrayList.addAll(arrayList2);
                    return arrayList;
                }
                arrayList2.add(this.Method5579(this.Method5575(), ((int)2026359730L ^ 0x78C7CBB3) + n3, -n));
                arrayList2.add(this.Method5579(this.Method5575(), -((int)((long)527528870 ^ (long)527528871) + n4), -n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), ((int)-1583096246L ^ 0xA1A3DE4B) + n3, n), (((int)1500351257L ^ 0x596D8B18) << 1) + n3, -n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), ((int)1150306225L ^ 0x449047B0) + n3, n), ((int)315517634L ^ 0x12CE6AC1) + n3, n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -(((int)-779410315L ^ 0xD18B2474) + n4), -n), -(((int)((long)-1612804210 ^ (long)-1612804209) << 1) + n4), -n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -((int)((long)-1173465495 ^ (long)-1173465496) + n4), -n), -(((int)355737934L ^ 0x1534214D) + n4), -n));
                ++n;
            }
        }
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n7 = (int)((long)-1410529954 ^ (long)-1410529954);
        while (n7 < n) {
            EnumFacing enumFacing = enumFacingArray[n7];
            arrayList.add(this.Method5575().add(enumFacing.getXOffset(), (int)((long)290041821 ^ (long)290041821), enumFacing.getZOffset()));
            ++n7;
        }
        return arrayList;
    }

    private BlockPos Method5575() {
        double d;
        double d2 = NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        if (NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Math.floor(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) > Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)619283039 ^ 0x403364B8234E92A8L)) ^ 0x7FDAFD219F3EAB7FL & 0x7FDAFD21FEFE896DL)) {
            d = Math.floor(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x3548EDB33F1DDDBCL ^ 0x755B4CB8DBB978ACL)) ^ 0x7FE3A10BE4A6ED10L & 0x7FE3A10BE4E4A59CL);
            return new BlockPos(d2, d, NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        }
        d = Math.floor(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        return new BlockPos(d2, d, NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }

    private List Method5576() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        int n = this.Method5577(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Math.floor(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX));
        int n2 = this.Method5577(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Math.floor(NngmEdjNl53Us2u9hWse9UOOf9hW7o97.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
        arrayList.add(this.Method5575());
        int n3 = (int)-1155048127L ^ 0xBB275D41;
        while (n3 <= Math.abs(n)) {
            for (int i = (int)-1928382919L ^ 0x8D0F3639; i <= Math.abs(n2); ++i) {
                int n4 = n3 * n;
                int n5 = i * n2;
                arrayList.add(this.Method5575().add(n4, (int)((long)1035083572 ^ (long)-1035083573), n5));
            }
            ++n3;
        }
        return arrayList;
    }

    private int Method5577(double d) {
        int n;
        if (d >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0xE29311A5B3EB98FL ^ 0x4E1F032BBECA9C10L)) ^ 0x7FD0545783B2E3F9L & 0x7FD054578B9B53F9L)) {
            n = (int)900420150L ^ 0x35AB5237;
            return n;
        }
        if (d <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x80BDE662C831414AL ^ 0xC0A1C213DE7956A2L)) ^ 0x7FCF1742277F2EDFL & 0x7FCF17426DFB35FBL)) {
            n = (int)((long)1269386098 ^ (long)-1269386099);
            return n;
        }
        n = (int)((long)1920109386 ^ (long)1920109386);
        return n;
    }

    private int Method5578(double d, boolean bl) {
        int n;
        if (bl) {
            int n2;
            if (d <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)847006289 ^ 0x403E8FD0A92AC17EL)) ^ 0x7FEDBCE3A9E5B8BDL & 0x7FEDBCE3BA65F91CL)) {
                n2 = (int)((long)-672615758 ^ (long)-672615757);
                return n2;
            }
            n2 = (int)((long)-45908272 ^ (long)-45908272);
            return n2;
        }
        if (d >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x84C4F6BEF0E40703L ^ 0xC4F2AF05ED90D538L)) ^ 0x7FD03FDD7F12F47FL & 0x7FD03FDD7B5AB45DL)) {
            n = (int)-761976053L ^ 0xD2952B0A;
            return n;
        }
        n = (int)((long)1133687460 ^ (long)1133687460);
        return n;
    }

    private BlockPos Method5579(BlockPos blockPos, double d, double d2) {
        if (blockPos.getX() < 0) {
            d = -d;
        }
        if (blockPos.getZ() >= 0) {
            return blockPos.add(d, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)671686526 ^ 0x7FEA775983EEE8BFL)) ^ 0x7FEA7759AFF7F7C1L & 0x7FEA7759BBE7FFD9L), d2);
        }
        d2 = -d2;
        return blockPos.add(d, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)671686526 ^ 0x7FEA775983EEE8BFL)) ^ 0x7FEA7759AFF7F7C1L & 0x7FEA7759BBE7FFD9L), d2);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1310338280L ^ 0xB1E5D318;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-917635233 ^ (long)-917635168);
            int n2 = (int)((long)-1512600770 ^ (long)-1512600739) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-108577307L ^ 0xF98773CC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

