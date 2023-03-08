//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import net.minecraftforge.client.event.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import java.awt.*;
import com.kisman.cc.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.*;
import net.minecraft.entity.*;
import net.minecraft.network.play.server.*;

public class Class141 extends Class42
{
    private final Class44 Field8530;
    private final Map Field8531;
    private final Map Field8532;
    private int Field8533;
    @Class1801
    private final Class618 Field8534;
    private int Field8535;
    
    public Class141() {
        super("BlockSearcher", Class97.Field8342, true);
        this.Field8530 = this.Method23(new Class44("Radius", this, Double.longBitsToDouble((long)850048726 ^ 0x4010000032AAB6D6L), 1.0, Double.longBitsToDouble((long)924982091 ^ 0x4030000037221B4BL), true));
        this.Field8531 = new ConcurrentHashMap();
        this.Field8532 = new ConcurrentHashMap();
        this.Field8533 = -1;
        this.Field8534 = new Class618(this::Method958, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method705((Class1320)this);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710((Class1320)this);
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
        if (this.Field8533 != -1 && this.Field8533 != Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dimension) {
            this.Field8533 = Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dimension;
            this.Method20();
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method951(final RenderWorldLastEvent renderWorldLastEvent) {
        for (final ChunkPos key : this.Field8532.keySet()) {
            for (final Block block : this.Field8531.keySet()) {
                for (final BlockPos blockPos : this.Field8532.computeIfAbsent(key, Class141::Method965).computeIfAbsent(block, Class141::Method964)) {
                    Class815.Method3446(Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos), Float.intBitsToFloat(1069547520), new Class2027((Color)this.Field8531.computeIfAbsent(block, Class141::Method963)), new Class2027(0, 0, 0, 0), Class2008.Field17215);
                }
            }
        }
    }
    
    private void Method20() {
        new Thread(this::Method957).start();
    }
    
    private List Method952(final List list) {
        return list.stream().sorted(Comparator.comparingDouble((ToDoubleFunction<? super Object>)Class141::Method956)).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
    }
    
    private List Method953() {
        final Vector<ChunkPos> vector = new Vector<ChunkPos>();
        for (int i = Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.chunkCoordX - this.Field8530.Method335(); i <= Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.chunkCoordX + this.Field8530.Method335(); ++i) {
            for (int j = Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.chunkCoordZ - this.Field8530.Method335(); j <= Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.chunkCoordZ + this.Field8530.Method335(); ++j) {
                vector.add(new ChunkPos(i, j));
            }
        }
        return vector;
    }
    
    private Map Method954(final ChunkPos chunkPos) {
        final ConcurrentHashMap<Block, List<BlockPos>> concurrentHashMap = (ConcurrentHashMap<Block, List<BlockPos>>)new ConcurrentHashMap<Block, Object>();
        for (int i = chunkPos.getXStart(); i <= chunkPos.getXEnd(); ++i) {
            final int getZStart = chunkPos.getZStart();
            if (getZStart <= chunkPos.getZEnd()) {
                int n = 0;
                while (true) {
                    final BlockPos blockPos = new BlockPos(i, n, getZStart);
                    ((List<BlockPos>)concurrentHashMap.computeIfAbsent(Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock(), (Function<? super Block, ?>)Class141::Method955)).add(blockPos);
                    ++n;
                }
            }
            else {}
        }
        return concurrentHashMap;
    }
    
    private static List Method955(final Block block) {
        return new Vector();
    }
    
    private static double Method956(final ChunkPos chunkPos) {
        return chunkPos.getDistanceSq((Entity)Class141.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
    }
    
    private void Method957() {
        for (final ChunkPos chunkPos : this.Method952(this.Method953())) {
            this.Field8532.put(chunkPos, this.Method954(chunkPos));
        }
    }
    
    private void Method958(final Class603 class603) {
        if (class603.Method982() instanceof SPacketChunkData) {
            final SPacketChunkData sPacketChunkData = (SPacketChunkData)class603.Method982();
            final ChunkPos chunkPos = new ChunkPos(sPacketChunkData.getChunkX(), sPacketChunkData.getChunkZ());
            this.Field8532.put(chunkPos, this.Method954(chunkPos));
        }
        if (class603.Method982() instanceof SPacketUnloadChunk) {
            final SPacketUnloadChunk sPacketUnloadChunk = (SPacketUnloadChunk)class603.Method982();
            this.Field8532.remove(new ChunkPos(sPacketUnloadChunk.getX(), sPacketUnloadChunk.getZ()));
        }
        if (class603.Method982() instanceof SPacketBlockChange) {
            final SPacketBlockChange sPacketBlockChange = (SPacketBlockChange)class603.Method982();
            final ChunkPos key = new ChunkPos(sPacketBlockChange.getBlockPosition().getX() >> 4, sPacketBlockChange.getBlockPosition().getZ() >> 4);
            final Map<Block, List> map = this.Field8532.computeIfAbsent(key, Class141::Method962);
            ((List<BlockPos>)map.computeIfAbsent(sPacketBlockChange.getBlockState().getBlock(), Class141::Method961)).add(sPacketBlockChange.getBlockPosition());
            this.Field8532.put(key, map);
        }
        if (class603.Method982() instanceof SPacketMultiBlockChange) {
            for (final SPacketMultiBlockChange$BlockUpdateData sPacketMultiBlockChange$BlockUpdateData : ((SPacketMultiBlockChange)class603.Method982()).getChangedBlocks()) {
                final ChunkPos key2 = new ChunkPos(sPacketMultiBlockChange$BlockUpdateData.getPos().getX() >> 4, sPacketMultiBlockChange$BlockUpdateData.getPos().getZ() >> 4);
                final Map<Block, List> map2 = this.Field8532.computeIfAbsent(key2, Class141::Method960);
                ((List<BlockPos>)map2.computeIfAbsent(sPacketMultiBlockChange$BlockUpdateData.getBlockState().getBlock(), Class141::Method959)).add(sPacketMultiBlockChange$BlockUpdateData.getPos());
                this.Field8532.put(key2, map2);
            }
        }
    }
    
    private static List Method959(final Block block) {
        return new Vector();
    }
    
    private static Map Method960(final ChunkPos chunkPos) {
        return new ConcurrentHashMap();
    }
    
    private static List Method961(final Block block) {
        return new Vector();
    }
    
    private static Map Method962(final ChunkPos chunkPos) {
        return new ConcurrentHashMap();
    }
    
    private static Color Method963(final Block block) {
        return new Color(0, 0, 0, 0);
    }
    
    private static List Method964(final Block block) {
        return new Vector();
    }
    
    private static Map Method965(final ChunkPos chunkPos) {
        return new ConcurrentHashMap();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5C0D ^ 0x50));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
