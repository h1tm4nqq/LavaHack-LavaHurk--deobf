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
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class603;
import lavahack.client.Class618;
import lavahack.client.Class97;
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

public class Class141
extends Class42 {
    private final Class44 Field8530 = this.Method23(new Class44("Radius", (Class42)this, Double.longBitsToDouble((long)850048726 ^ 0x4010000032AAB6D6L), 1.0, Double.longBitsToDouble((long)924982091 ^ 0x4030000037221B4BL), true));
    private final Map Field8531 = new ConcurrentHashMap();
    private final Map Field8532 = new ConcurrentHashMap();
    private int Field8533 = -1;
    @Class1801
    private final Class618 Field8534 = new Class618(this::Method958, new Predicate[0]);
    private int Field8535;

    public Class141() {
        super("BlockSearcher", Class97.Field8342, true);
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method705(this);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710(this);
        this.Field8533 = -1;
    }

    @Override
    public void Method45() {
        if (Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Field8533 = -1;
            return;
        }
        if (this.Field8533 == -1) {
            this.Field8533 = Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dimension;
            this.Method20();
        }
        if (this.Field8533 == -1) return;
        if (this.Field8533 == Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dimension) return;
        this.Field8533 = Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dimension;
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
        return list.stream().sorted(Comparator.comparingDouble(Class141::Method956)).collect(Collectors.toList());
    }

    private List Method953() {
        Vector<ChunkPos> vector = new Vector<ChunkPos>();
        int n = Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.chunkCoordX - this.Field8530.Method335();
        while (n <= Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.chunkCoordX + this.Field8530.Method335()) {
            for (int i = Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.chunkCoordZ - this.Field8530.Method335(); i <= Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.chunkCoordZ + this.Field8530.Method335(); ++i) {
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
                int n3 = 0;
                while (true) {
                    BlockPos blockPos = new BlockPos(n, n3, n2);
                    IBlockState iBlockState = Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
                    List list = concurrentHashMap.computeIfAbsent(iBlockState.getBlock(), Class141::Method955);
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
        return chunkPos.getDistanceSq((Entity)Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
    }

    private void Method957() {
        Iterator iterator = this.Method952(this.Method953()).iterator();
        while (iterator.hasNext()) {
            ChunkPos chunkPos = (ChunkPos)iterator.next();
            this.Field8532.put(chunkPos, this.Method954(chunkPos));
        }
    }

    private void Method958(Class603 class603) {
        ChunkPos chunkPos;
        SPacketChunkData sPacketChunkData;
        if (class603.Method982() instanceof SPacketChunkData) {
            sPacketChunkData = (SPacketChunkData)class603.Method982();
            chunkPos = new ChunkPos(sPacketChunkData.getChunkX(), sPacketChunkData.getChunkZ());
            this.Field8532.put(chunkPos, this.Method954(chunkPos));
        }
        if (class603.Method982() instanceof SPacketUnloadChunk) {
            sPacketChunkData = (SPacketUnloadChunk)class603.Method982();
            chunkPos = new ChunkPos(sPacketChunkData.getX(), sPacketChunkData.getZ());
            this.Field8532.remove(chunkPos);
        }
        if (class603.Method982() instanceof SPacketBlockChange) {
            sPacketChunkData = (SPacketBlockChange)class603.Method982();
            chunkPos = new ChunkPos(sPacketChunkData.getBlockPosition().getX() >> 4, sPacketChunkData.getBlockPosition().getZ() >> 4);
            Map map = this.Field8532.computeIfAbsent(chunkPos, Class141::Method962);
            List list = map.computeIfAbsent(sPacketChunkData.getBlockState().getBlock(), Class141::Method961);
            list.add(sPacketChunkData.getBlockPosition());
            this.Field8532.put(chunkPos, map);
        }
        if (!(class603.Method982() instanceof SPacketMultiBlockChange)) return;
        sPacketChunkData = (SPacketMultiBlockChange)class603.Method982();
        chunkPos = sPacketChunkData.getChangedBlocks();
        int n = ((SPacketMultiBlockChange.BlockUpdateData[])chunkPos).length;
        int n2 = 0;
        while (n2 < n) {
            ChunkPos chunkPos2 = chunkPos[n2];
            ChunkPos chunkPos3 = new ChunkPos(chunkPos2.getPos().getX() >> 4, chunkPos2.getPos().getZ() >> 4);
            Map map = this.Field8532.computeIfAbsent(chunkPos3, Class141::Method960);
            List list = map.computeIfAbsent(chunkPos2.getBlockState().getBlock(), Class141::Method959);
            list.add(chunkPos2.getPos());
            this.Field8532.put(chunkPos3, map);
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
        return new Color(0, 0, 0, 0);
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 80;
            cArray2[n] = (char)(cArray[n] ^ (0x5C0D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

