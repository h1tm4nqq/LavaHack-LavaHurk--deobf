//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.server.*;
import net.minecraft.entity.*;
import net.minecraft.network.play.*;
import java.util.function.*;
import java.util.*;

public class Class40 extends Class42
{
    private final Class44 Field8046;
    private final Set Field8047;
    private final Map Field8048;
    @Class1801
    private final Class618 Field8049;
    private String Field8050 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class40() {
        super("InfiniteRender", "Keeps chunks rendered client side", Class97.Field8342);
        this.Field8046 = this.Method23(new Class44("Range", this, Double.longBitsToDouble((long)1879516784 ^ 0x4050000070072670L), 1.0, Double.longBitsToDouble(4647714815446351872L), true));
        this.Field8047 = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>());
        this.Field8048 = new ConcurrentHashMap();
        this.Field8049 = new Class618(this::Method283, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method705((Class1320)this);
        Class40.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getTextureManager().tick();
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710((Class1320)this);
    }
    
    @Override
    public void Method45() {
        Class298.Method1560(this::Method20);
    }
    
    private void Method283(final Class544 class544) {
        if (class544.Method982() instanceof SPacketChunkData) {
            final SPacketChunkData sPacketChunkData = (SPacketChunkData)class544.Method982();
            final ChunkPos chunkPos = new ChunkPos(sPacketChunkData.getChunkX(), sPacketChunkData.getChunkZ());
            if (this.Field8047.contains(chunkPos)) {
                return;
            }
            this.Field8047.add(chunkPos);
            class544.Method158();
        }
        if (class544.Method982() instanceof SPacketUnloadChunk) {
            final SPacketUnloadChunk sPacketUnloadChunk = (SPacketUnloadChunk)class544.Method982();
            final ChunkPos chunkPos2 = new ChunkPos(sPacketUnloadChunk.getX(), sPacketUnloadChunk.getZ());
            if (chunkPos2.getDistanceSq((Entity)Class40.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) > this.Field8046.Method335() * this.Field8046.Method335()) {
                this.Field8047.remove(chunkPos2);
                return;
            }
            this.Field8048.put(chunkPos2, sPacketUnloadChunk);
            class544.Method158();
        }
    }
    
    private void Method20() {
        final HashSet<ChunkPos> set = new HashSet<ChunkPos>();
        for (final Map.Entry<ChunkPos, V> entry : this.Field8048.entrySet()) {
            if (entry.getKey().getDistanceSq((Entity)Class40.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) <= this.Field8046.Method335() * this.Field8046.Method335()) {
                continue;
            }
            ((SPacketUnloadChunk)entry.getValue()).processPacket((INetHandlerPlayClient)Class40.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection);
            set.add(entry.getKey());
        }
        set.forEach(this.Field8048::remove);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7B7B ^ 0xA4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
