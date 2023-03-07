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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.play.server.SPacketChunkData;
import net.minecraft.network.play.server.SPacketUnloadChunk;
import net.minecraft.util.math.ChunkPos;

public class sATz5G4bMIthmXDaAOVxqY2m7mRHXXLp
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8046 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1879516784 ^ 0x4050000070072670L), 1.0, Double.longBitsToDouble(0x52A5DF015A7DF3B3L ^ 0x1225DF015A7DF3B3L), ((int)-1797548804L ^ 0x94DB94FD) != 0));
    private final Set Field8047 = Collections.newSetFromMap(new ConcurrentHashMap());
    private final Map Field8048 = new ConcurrentHashMap();
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8049 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method283, new Predicate[(int)((long)-820821668 ^ (long)-820821668)]);
    private String Field8050 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public sATz5G4bMIthmXDaAOVxqY2m7mRHXXLp() {
        super("InfiniteRender", "Keeps chunks rendered client side", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method705(this);
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getTextureManager().tick();
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method710(this);
    }

    @Override
    public void Method45() {
        v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2.Method1560(this::Method20);
    }

    private void Method283(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        ChunkPos chunkPos;
        SPacketChunkData sPacketChunkData;
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketChunkData) {
            sPacketChunkData = (SPacketChunkData)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
            chunkPos = new ChunkPos(sPacketChunkData.getChunkX(), sPacketChunkData.getChunkZ());
            if (this.Field8047.contains(chunkPos)) {
                return;
            }
            this.Field8047.add(chunkPos);
            tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketUnloadChunk)) return;
        sPacketChunkData = (SPacketUnloadChunk)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        chunkPos = new ChunkPos(sPacketChunkData.getX(), sPacketChunkData.getZ());
        if (chunkPos.getDistanceSq((Entity)sATz5G4bMIthmXDaAOVxqY2m7mRHXXLp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) > (double)(this.Field8046.Method335() * this.Field8046.Method335())) {
            this.Field8047.remove(chunkPos);
            return;
        }
        this.Field8048.put(chunkPos, sPacketChunkData);
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
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
            if (((ChunkPos)entry.getKey()).getDistanceSq((Entity)sATz5G4bMIthmXDaAOVxqY2m7mRHXXLp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) <= (double)(this.Field8046.Method335() * this.Field8046.Method335())) continue;
            ((SPacketUnloadChunk)entry.getValue()).processPacket((INetHandlerPlayClient)sATz5G4bMIthmXDaAOVxqY2m7mRHXXLp.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection);
            hashSet.add(entry.getKey());
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1841233797L ^ 0x6DBEFF85;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-325038557 ^ (long)-325038372);
            int n2 = ((int)742956638L ^ 0x2C489E77) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-137536060 ^ (long)-137550145) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

