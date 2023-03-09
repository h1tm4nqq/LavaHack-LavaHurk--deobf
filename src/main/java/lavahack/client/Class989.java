//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcp.MethodsReturnNonnullByDefault
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.chunk.ChunkRenderDispatcher
 *  net.minecraft.client.renderer.chunk.CompiledChunk
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.util.BlockRenderLayer
 */
package lavahack.client;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Method;
import javax.annotation.ParametersAreNonnullByDefault;
import lavahack.client.Class1957;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.BlockRenderLayer;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class Class989
extends ChunkRenderDispatcher {
    private String Field12240 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class989() {
    }

    public Class989(int n) {
        super(n);
    }

    public ListenableFuture uploadChunk(BlockRenderLayer blockRenderLayer, BufferBuilder bufferBuilder, RenderChunk renderChunk, CompiledChunk compiledChunk, double d) {
        if (!Minecraft.getMinecraft().isCallingFromMinecraftThread()) return super.uploadChunk(blockRenderLayer, bufferBuilder, renderChunk, compiledChunk, d);
        if (OpenGlHelper.useVbo()) {
            return super.uploadChunk(blockRenderLayer, bufferBuilder, renderChunk, compiledChunk, d);
        }
        Method method = Class.forName("net.minecraft.client.renderer.chunk.ChunkRenderDispatcher").getMethod("uploadDisplayList", BufferBuilder.class, Integer.class, CompiledChunk.class, RenderChunk.class);
        method.setAccessible(true);
        method.invoke((Object)this, bufferBuilder, ((Class1957)renderChunk).Method7271(blockRenderLayer, compiledChunk), renderChunk);
        bufferBuilder.setTranslation(0.0, 0.0, 0.0);
        return Futures.immediateFuture(null);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 48;
            cArray2[n] = (char)(cArray[n] ^ (0x7057 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

