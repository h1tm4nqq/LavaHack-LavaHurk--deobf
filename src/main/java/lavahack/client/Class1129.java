//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.multiplayer.*;
import mcp.*;
import net.minecraft.world.chunk.*;
import java.util.*;
import net.minecraft.world.*;
import java.util.concurrent.*;
import net.minecraft.util.math.*;
import com.google.common.base.*;

@MethodsReturnNonnullByDefault
public class Class1129 extends ChunkProviderClient implements IChunkProvider
{
    private final Class1479 Field13127;
    private final Chunk Field13128;
    private final Map Field13129;
    private int Field13130;
    
    public Class1129(final Class1479 field13127) {
        super((World)field13127);
        this.Field13129 = new ConcurrentHashMap();
        this.Field13127 = field13127;
        this.Field13128 = (Chunk)new Class316(this, (World)field13127, 0, 0);
    }
    
    private boolean chunkExists(final int n, final int n2) {
        return n >= 0 && n2 >= 0 && n < this.Field13127.getWidth() && n2 < this.Field13127.getLength();
    }
    
    public Chunk getLoadedChunk(final int n, final int n2) {
        if (!this.chunkExists(n, n2)) {
            return this.Field13128;
        }
        final long asLong = ChunkPos.asLong(n, n2);
        Class1151 class1151 = this.Field13129.get(asLong);
        if (class1151 == null) {
            class1151 = new Class1151((World)this.Field13127, n, n2);
            this.Field13129.put(asLong, class1151);
        }
        return class1151;
    }
    
    public Chunk provideChunk(final int n, final int n2) {
        return this.getLoadedChunk(n, n2);
    }
    
    public String makeString() {
        return "SchematicChunkCache";
    }
    
    public Chunk loadChunk(final int n, final int n2) {
        return (Chunk)MoreObjects.firstNonNull((Object)this.getLoadedChunk(n, n2), (Object)this.Field13128);
    }
    
    public void unloadChunk(final int n, final int n2) {
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3B3A ^ 0x61));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
