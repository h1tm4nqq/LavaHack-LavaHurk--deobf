//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.play.INetHandlerPlayClient
 *  net.minecraft.network.play.server.SPacketChunkData
 *  net.minecraft.network.play.server.SPacketUnloadChunk
 *  net.minecraft.util.math.ChunkPos
 */
package lavahack.client;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class298;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.play.server.SPacketChunkData;
import net.minecraft.network.play.server.SPacketUnloadChunk;
import net.minecraft.util.math.ChunkPos;

public class Class40
extends Class42 {
    private final Class44 Field8046 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)1879516784 ^ 0x4050000070072670L), 1.0, Double.longBitsToDouble(0x4080000000000000L), true));
    private final Set Field8047 = Collections.newSetFromMap(new ConcurrentHashMap());
    private final Map Field8048 = new ConcurrentHashMap();
    @Class1801
    private final Class618 Field8049 = new Class618(this::Method283, new Predicate[0]);
    private String Field8050 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class40() {
        super("InfiniteRender", "Keeps chunks rendered client side", Class97.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method705(this);
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getTextureManager().tick();
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710(this);
    }

    @Override
    public void Method45() {
        Class298.Method1560(this::Method20);
    }

    private void Method283(Class544 class544) {
        ChunkPos chunkPos;
        SPacketChunkData sPacketChunkData;
        if (class544.Method982() instanceof SPacketChunkData) {
            sPacketChunkData = (SPacketChunkData)class544.Method982();
            chunkPos = new ChunkPos(sPacketChunkData.getChunkX(), sPacketChunkData.getChunkZ());
            if (this.Field8047.contains(chunkPos)) {
                return;
            }
            this.Field8047.add(chunkPos);
            class544.Method158();
        }
        if (!(class544.Method982() instanceof SPacketUnloadChunk)) return;
        sPacketChunkData = (SPacketUnloadChunk)class544.Method982();
        chunkPos = new ChunkPos(sPacketChunkData.getX(), sPacketChunkData.getZ());
        if (chunkPos.getDistanceSq((Entity)Class40.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) > (double)(this.Field8046.Method335() * this.Field8046.Method335())) {
            this.Field8047.remove(chunkPos);
            return;
        }
        this.Field8048.put(chunkPos, sPacketChunkData);
        class544.Method158();
    }

    private void Method20() {
        HashSet hashSet = new HashSet();
        Iterator iterator = this.Field8048.entrySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                hashSet.forEach(this.Field8048::remove);
                return;
            }
            Map.Entry entry = iterator.next();
            if (((ChunkPos)entry.getKey()).getDistanceSq((Entity)Class40.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) <= (double)(this.Field8046.Method335() * this.Field8046.Method335())) continue;
            ((SPacketUnloadChunk)entry.getValue()).processPacket((INetHandlerPlayClient)Class40.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection);
            hashSet.add(entry.getKey());
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 164;
            cArray2[n] = (char)(cArray[n] ^ (0x7B7B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

