//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.play.server.SPacketBlockChange
 *  net.minecraft.network.play.server.SPacketChunkData
 *  net.minecraft.network.play.server.SPacketMultiBlockChange
 *  net.minecraft.network.play.server.SPacketMultiBlockChange$BlockUpdateData
 *  net.minecraft.network.play.server.SPacketUnloadChunk
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.ChunkPos
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.awt.Color;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.network.play.server.SPacketChunkData;
import net.minecraft.network.play.server.SPacketMultiBlockChange;
import net.minecraft.network.play.server.SPacketUnloadChunk;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class rM38jxnO24eOYNZorpjSMvXEYTHnJKtD
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8530 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Radius", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)850048726 ^ 0x4010000032AAB6D6L), 1.0, Double.longBitsToDouble((long)924982091 ^ 0x4030000037221B4BL), ((int)836383647L ^ 0x31DA339E) != 0));
    private final Map Field8531 = new ConcurrentHashMap();
    private final Map Field8532 = new ConcurrentHashMap();
    private int Field8533 = (int)-1512952112L ^ 0x5A2DD12F;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8534 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method958, new Predicate[(int)534515476L ^ 0x1FDC0F14]);
    private int Field8535;

    public rM38jxnO24eOYNZorpjSMvXEYTHnJKtD() {
        super("BlockSearcher", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342, ((int)-2071469062L ^ 0x8487E3FB) != 0);
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method705(this);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method710(this);
        this.Field8533 = (int)-536952198L ^ 0x20013D85;
    }

    @Override
    public void Method45() {
        if (rM38jxnO24eOYNZorpjSMvXEYTHnJKtD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || rM38jxnO24eOYNZorpjSMvXEYTHnJKtD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Field8533 = (int)423730894L ^ 0xE6BE6131;
            return;
        }
        if (this.Field8533 == ((int)-823386223L ^ 0x3113E06E)) {
            this.Field8533 = rM38jxnO24eOYNZorpjSMvXEYTHnJKtD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dimension;
            this.Method20();
        }
        if (this.Field8533 == ((int)-792930996L ^ 0x2F432AB3)) return;
        if (this.Field8533 == rM38jxnO24eOYNZorpjSMvXEYTHnJKtD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dimension) return;
        this.Field8533 = rM38jxnO24eOYNZorpjSMvXEYTHnJKtD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dimension;
        this.Method20();
    }

    /*
     * Exception decompiling
     */
    @SubscribeEvent
    @SubscribeEvent
    public void Method951(RenderWorldLastEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[DOLOOP]], but top level block is 2[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    private void Method20() {
        Thread thread = new Thread(this::Method957);
        thread.start();
    }

    private List Method952(List list) {
        return list.stream().sorted(Comparator.comparingDouble(rM38jxnO24eOYNZorpjSMvXEYTHnJKtD::Method956)).collect(Collectors.toList());
    }

    private List Method953() {
        Vector<ChunkPos> vector = new Vector<ChunkPos>();
        int n = rM38jxnO24eOYNZorpjSMvXEYTHnJKtD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.chunkCoordX - this.Field8530.Method335();
        while (n <= rM38jxnO24eOYNZorpjSMvXEYTHnJKtD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.chunkCoordX + this.Field8530.Method335()) {
            for (int i = rM38jxnO24eOYNZorpjSMvXEYTHnJKtD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.chunkCoordZ - this.Field8530.Method335(); i <= rM38jxnO24eOYNZorpjSMvXEYTHnJKtD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.chunkCoordZ + this.Field8530.Method335(); ++i) {
                vector.add(new ChunkPos(n, i));
            }
            ++n;
        }
        return vector;
    }

    private Map Method954(ChunkPos chunkPos) {
        ConcurrentHashMap<Block, List> concurrentHashMap = new ConcurrentHashMap<Block, List>();
        int n = chunkPos.getXStart();
        while (n <= chunkPos.getXEnd()) {
            int n2 = chunkPos.getZStart();
            if (n2 <= chunkPos.getZEnd()) {
                int n3 = (int)((long)1723450700 ^ (long)1723450700);
                while (true) {
                    int cfr_ignored_0 = (int)((long)526665058 ^ (long)526665059) << 8;
                    BlockPos blockPos = new BlockPos(n, n3, n2);
                    IBlockState iBlockState = rM38jxnO24eOYNZorpjSMvXEYTHnJKtD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
                    List list = concurrentHashMap.computeIfAbsent(iBlockState.getBlock(), rM38jxnO24eOYNZorpjSMvXEYTHnJKtD::Method955);
                    list.add(blockPos);
                    ++n3;
                }
            }
            ++n;
        }
        return concurrentHashMap;
    }

    private static List Method955(Block block) {
        return new Vector();
    }

    private static double Method956(ChunkPos chunkPos) {
        return chunkPos.getDistanceSq((Entity)rM38jxnO24eOYNZorpjSMvXEYTHnJKtD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
    }

    private void Method957() {
        Iterator iterator = this.Method952(this.Method953()).iterator();
        while (iterator.hasNext()) {
            ChunkPos chunkPos = (ChunkPos)iterator.next();
            this.Field8532.put(chunkPos, this.Method954(chunkPos));
        }
    }

    private void Method958(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        ChunkPos chunkPos;
        SPacketChunkData sPacketChunkData;
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method982() instanceof SPacketChunkData) {
            sPacketChunkData = (SPacketChunkData)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method982();
            chunkPos = new ChunkPos(sPacketChunkData.getChunkX(), sPacketChunkData.getChunkZ());
            this.Field8532.put(chunkPos, this.Method954(chunkPos));
        }
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method982() instanceof SPacketUnloadChunk) {
            sPacketChunkData = (SPacketUnloadChunk)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method982();
            chunkPos = new ChunkPos(sPacketChunkData.getX(), sPacketChunkData.getZ());
            this.Field8532.remove(chunkPos);
        }
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method982() instanceof SPacketBlockChange) {
            sPacketChunkData = (SPacketBlockChange)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method982();
            chunkPos = new ChunkPos(sPacketChunkData.getBlockPosition().getX() >> ((int)((long)-566442270 ^ (long)-566442269) << 2), sPacketChunkData.getBlockPosition().getZ() >> (((int)-1518801134L ^ 0xA578EF13) << 2));
            Map map = this.Field8532.computeIfAbsent(chunkPos, rM38jxnO24eOYNZorpjSMvXEYTHnJKtD::Method962);
            List list = map.computeIfAbsent(sPacketChunkData.getBlockState().getBlock(), rM38jxnO24eOYNZorpjSMvXEYTHnJKtD::Method961);
            list.add(sPacketChunkData.getBlockPosition());
            this.Field8532.put(chunkPos, map);
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method982() instanceof SPacketMultiBlockChange)) return;
        sPacketChunkData = (SPacketMultiBlockChange)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method982();
        chunkPos = sPacketChunkData.getChangedBlocks();
        int n = ((SPacketMultiBlockChange.BlockUpdateData[])chunkPos).length;
        int n2 = (int)((long)657602712 ^ (long)657602712);
        while (n2 < n) {
            SPacketMultiBlockChange.BlockUpdateData blockUpdateData = chunkPos[n2];
            ChunkPos chunkPos2 = new ChunkPos(blockUpdateData.getPos().getX() >> ((int)((long)-15297590 ^ (long)-15297589) << 2), blockUpdateData.getPos().getZ() >> ((int)((long)-210123099 ^ (long)-210123100) << 2));
            Map map = this.Field8532.computeIfAbsent(chunkPos2, rM38jxnO24eOYNZorpjSMvXEYTHnJKtD::Method960);
            List list = map.computeIfAbsent(blockUpdateData.getBlockState().getBlock(), rM38jxnO24eOYNZorpjSMvXEYTHnJKtD::Method959);
            list.add(blockUpdateData.getPos());
            this.Field8532.put(chunkPos2, map);
            ++n2;
        }
    }

    private static List Method959(Block block) {
        return new Vector();
    }

    private static Map Method960(ChunkPos chunkPos) {
        return new ConcurrentHashMap();
    }

    private static List Method961(Block block) {
        return new Vector();
    }

    private static Map Method962(ChunkPos chunkPos) {
        return new ConcurrentHashMap();
    }

    private static Color Method963(Block block) {
        return new Color((int)((long)-823489506 ^ (long)-823489506), (int)((long)-521750323 ^ (long)-521750323), (int)-1851108733L ^ 0x91AA5283, (int)369256592L ^ 0x16026890);
    }

    private static List Method964(Block block) {
        return new Vector();
    }

    private static Map Method965(ChunkPos chunkPos) {
        return new ConcurrentHashMap();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)4603677 ^ (long)4603677);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1801630511 ^ (long)1801630672);
            int n2 = ((int)-1975579500L ^ 0x8A3F0C91) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)1309760401L ^ 0x4E11079C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

