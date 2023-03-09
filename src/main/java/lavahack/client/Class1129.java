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
import lavahack.client.Class1151;
import lavahack.client.Class1479;
import lavahack.client.Class316;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.multiplayer.ChunkProviderClient;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;

@MethodsReturnNonnullByDefault
public class Class1129
extends ChunkProviderClient
implements IChunkProvider {
    private final Class1479 Field13127;
    private final Chunk Field13128;
    private final Map Field13129 = new ConcurrentHashMap();
    private int Field13130;

    public Class1129(Class1479 class1479) {
        super((World)class1479);
        this.Field13127 = class1479;
        this.Field13128 = new Class316(this, (World)class1479, 0, 0);
    }

    private boolean chunkExists(int n, int n2) {
        if (n < 0) return false;
        if (n2 < 0) return false;
        if (n >= this.Field13127.getWidth()) return false;
        if (n2 >= this.Field13127.getLength()) return false;
        return true;
    }

    public Chunk getLoadedChunk(int n, int n2) {
        if (!this.chunkExists(n, n2)) {
            return this.Field13128;
        }
        long l = ChunkPos.asLong((int)n, (int)n2);
        Class1151 class1151 = (Class1151)((Object)this.Field13129.get(l));
        if (class1151 != null) return class1151;
        class1151 = new Class1151((World)this.Field13127, n, n2);
        this.Field13129.put(l, class1151);
        return class1151;
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 97;
            cArray2[n] = (char)(cArray[n] ^ (0x3B3A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

