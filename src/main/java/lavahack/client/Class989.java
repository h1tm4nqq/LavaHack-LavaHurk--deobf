//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import mcp.*;
import javax.annotation.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.chunk.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import com.google.common.util.concurrent.*;
import java.lang.reflect.*;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class Class989 extends ChunkRenderDispatcher
{
    private String Field12240 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class989() {
    }
    
    public Class989(final int n) {
        super(n);
    }
    
    public ListenableFuture uploadChunk(final BlockRenderLayer blockRenderLayer, final BufferBuilder bufferBuilder, final RenderChunk renderChunk, final CompiledChunk compiledChunk, final double n) {
        if (!Minecraft.getMinecraft().isCallingFromMinecraftThread() || OpenGlHelper.useVbo()) {
            return super.uploadChunk(blockRenderLayer, bufferBuilder, renderChunk, compiledChunk, n);
        }
        final Method method = Class.forName("net.minecraft.client.renderer.chunk.ChunkRenderDispatcher").getMethod("uploadDisplayList", BufferBuilder.class, Integer.class, CompiledChunk.class, RenderChunk.class);
        method.setAccessible(true);
        method.invoke(this, bufferBuilder, ((Class1957)renderChunk).Method7271(blockRenderLayer, compiledChunk), renderChunk);
        bufferBuilder.setTranslation(0.0, 0.0, 0.0);
        return Futures.immediateFuture((Object)null);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7057 ^ 0x30));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
