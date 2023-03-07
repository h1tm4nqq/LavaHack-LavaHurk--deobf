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
import lavahack.client.Tm0kFEbVFI8OLVdDSLk9WkpQRt7DCYBy;
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
public class ppgCVXcfiSfr3inPtq2TIUtq3zK7pHww
extends ChunkRenderDispatcher {
    private String Field12240 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public ppgCVXcfiSfr3inPtq2TIUtq3zK7pHww() {
    }

    public ppgCVXcfiSfr3inPtq2TIUtq3zK7pHww(int n) {
        super(n);
    }

    public ListenableFuture uploadChunk(BlockRenderLayer blockRenderLayer, BufferBuilder bufferBuilder, RenderChunk renderChunk, CompiledChunk compiledChunk, double d) {
        if (!Minecraft.getMinecraft().isCallingFromMinecraftThread()) return super.uploadChunk(blockRenderLayer, bufferBuilder, renderChunk, compiledChunk, d);
        if (OpenGlHelper.useVbo()) {
            return super.uploadChunk(blockRenderLayer, bufferBuilder, renderChunk, compiledChunk, d);
        }
        Class[] classArray = new Class[((int)1452242436L ^ 0x568F7605) << 2];
        classArray[(int)1127292256L ^ 0x43311D60] = BufferBuilder.class;
        classArray[(int)((long)-55971563 ^ (long)-55971564)] = Integer.class;
        classArray[((int)-1673120686L ^ 0x9C463453) << 1] = CompiledChunk.class;
        classArray[(int)((long)-856121417 ^ (long)-856121420)] = RenderChunk.class;
        Method method = Class.forName("net.minecraft.client.renderer.chunk.ChunkRenderDispatcher").getMethod("uploadDisplayList", classArray);
        method.setAccessible(((int)-1425439232L ^ 0xAB098601) != 0);
        Object[] objectArray = new Object[(int)((long)709455146 ^ (long)709455145)];
        objectArray[(int)785166362L ^ 0x2ECCB01A] = bufferBuilder;
        objectArray[(int)1960035495L ^ 0x74D3C4A6] = ((Tm0kFEbVFI8OLVdDSLk9WkpQRt7DCYBy)renderChunk).Method7271(blockRenderLayer, compiledChunk);
        objectArray[((int)-389454530L ^ 0xE8C9653F) << 1] = renderChunk;
        method.invoke((Object)this, objectArray);
        bufferBuilder.setTranslation(0.0, 0.0, 0.0);
        return Futures.immediateFuture(null);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2061971083L ^ 0x7AE72E8B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1820178805L ^ 0x93824674);
            int n2 = ((int)1910376311L ^ 0x71DE0774) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1072944938 ^ (long)-1072932735) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

