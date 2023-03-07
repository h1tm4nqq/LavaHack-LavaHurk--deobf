//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcp.MethodsReturnNonnullByDefault
 *  net.minecraft.client.multiplayer.ChunkProviderClient
 *  net.minecraft.util.math.ChunkPos
 *  net.minecraft.world.World
 *  net.minecraft.world.chunk.Chunk
 *  net.minecraft.world.chunk.IChunkProvider
 */
package lavahack.client;

import com.google.common.base.MoreObjects;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.R0tzo2JwCqB4MX2EYSwSBvyXNUT9Eatx$1;
import lavahack.client.zI2KdKnZJxegFjgIRIDSvNGO4pwTGUIn;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.multiplayer.ChunkProviderClient;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;

@MethodsReturnNonnullByDefault
public class R0tzo2JwCqB4MX2EYSwSBvyXNUT9Eatx
extends ChunkProviderClient
implements IChunkProvider {
    private final OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 Field13127;
    private final Chunk Field13128;
    private final Map Field13129 = new ConcurrentHashMap();
    private int Field13130;

    public R0tzo2JwCqB4MX2EYSwSBvyXNUT9Eatx(OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3) {
        super((World)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3);
        this.Field13127 = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
        this.Field13128 = new R0tzo2JwCqB4MX2EYSwSBvyXNUT9Eatx$1(this, (World)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, (int)((long)1771093454 ^ (long)1771093454), (int)742553013L ^ 0x2C4275B5);
    }

    private boolean chunkExists(int n, int n2) {
        int n3;
        if (n >= 0 && n2 >= 0 && n < this.Field13127.getWidth() && n2 < this.Field13127.getLength()) {
            n3 = (int)-1747396763L ^ 0x97D8D764;
            return n3 != 0;
        }
        n3 = (int)((long)-539492953 ^ (long)-539492953);
        return n3 != 0;
    }

    public Chunk getLoadedChunk(int n, int n2) {
        if (!this.chunkExists(n, n2)) {
            return this.Field13128;
        }
        long l = ChunkPos.asLong((int)n, (int)n2);
        zI2KdKnZJxegFjgIRIDSvNGO4pwTGUIn zI2KdKnZJxegFjgIRIDSvNGO4pwTGUIn2 = (zI2KdKnZJxegFjgIRIDSvNGO4pwTGUIn)((Object)this.Field13129.get(l));
        if (zI2KdKnZJxegFjgIRIDSvNGO4pwTGUIn2 != null) return zI2KdKnZJxegFjgIRIDSvNGO4pwTGUIn2;
        zI2KdKnZJxegFjgIRIDSvNGO4pwTGUIn2 = new zI2KdKnZJxegFjgIRIDSvNGO4pwTGUIn((World)this.Field13127, n, n2);
        this.Field13129.put(l, zI2KdKnZJxegFjgIRIDSvNGO4pwTGUIn2);
        return zI2KdKnZJxegFjgIRIDSvNGO4pwTGUIn2;
    }

    public Chunk provideChunk(int n, int n2) {
        return this.getLoadedChunk(n, n2);
    }

    public String makeString() {
        return "SchematicChunkCache";
    }

    public Chunk loadChunk(int n, int n2) {
        return MoreObjects.firstNonNull(this.getLoadedChunk(n, n2), this.Field13128);
    }

    public void unloadChunk(int n, int n2) {
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1586735648 ^ (long)1586735648);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-83087933L ^ 0xFB0C2D3C);
            int n2 = (int)((long)-2020961518 ^ (long)-2020961421);
            cArray2[n] = (char)(cArray[n] ^ (((int)1392059536L ^ 0x52F9390D) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

