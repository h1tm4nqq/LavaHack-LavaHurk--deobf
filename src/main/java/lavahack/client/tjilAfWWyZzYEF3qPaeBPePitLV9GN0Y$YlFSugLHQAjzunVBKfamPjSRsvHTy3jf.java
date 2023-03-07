//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.D2A33i4puy3VG87sLGopuKBa7759W0RD;
import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y;
import lavahack.client.yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderChunkContainer;", "kotlin.jvm.PlatformType", "invoke"})
final class tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y Field17504;
    private int Field17505;

    @Override
    public void Method979(Object object) {
        this.Method7619((D2A33i4puy3VG87sLGopuKBa7759W0RD)object);
    }

    public final void Method7619(D2A33i4puy3VG87sLGopuKBa7759W0RD d2A33i4puy3VG87sLGopuKBa7759W0RD) {
        if (!tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y.Method5088(this.Field17504).containsKey(d2A33i4puy3VG87sLGopuKBa7759W0RD.Field15074)) return;
        Object v = tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y.Method5088(this.Field17504).get(d2A33i4puy3VG87sLGopuKBa7759W0RD.Field15074);
        if (v == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(v, (String)"chunks[it.chunk]!!");
        AtomicLong atomicLong = (AtomicLong)v;
        long l = atomicLong.get();
        if (l == (0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL)) {
            l = System.currentTimeMillis();
            atomicLong.set(l);
        }
        long l2 = System.currentTimeMillis() - l;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y.Method5089(this.Field17504);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"length");
        if (l2 >= (long)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335()) return;
        RenderChunk renderChunk = d2A33i4puy3VG87sLGopuKBa7759W0RD.Field15074;
        Intrinsics.checkExpressionValueIsNotNull((Object)renderChunk, (String)"it.chunk");
        BlockPos blockPos = renderChunk.getPosition();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"it.chunk.position");
        double d = -blockPos.getY();
        RenderChunk renderChunk2 = d2A33i4puy3VG87sLGopuKBa7759W0RD.Field15074;
        Intrinsics.checkExpressionValueIsNotNull((Object)renderChunk2, (String)"it.chunk");
        BlockPos blockPos2 = renderChunk2.getPosition();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"it.chunk.position");
        double d2 = blockPos2.getY();
        hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs2 = ((yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y.Method5090(this.Field17504).Method341()).Method849();
        Object[] objectArray = new Object[(int)-1241254512L ^ 0xB603F591];
        int n = (int)-2091777635L ^ 0x8352019D;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y.Method5089(this.Field17504);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"length");
        objectArray[n] = (double)(l2 / (long)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335());
        Object object = hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs2.Method1726(objectArray);
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"easing.valEnum.task.doTa\u2026ength.valInt).toDouble())");
        GlStateManager.translate((double)0.0, (double)(d + d2 * ((Number)object).doubleValue()), (double)0.0);
    }

    tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y2) {
        this.Field17504 = tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y2;
    }

    private static String Method7620(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-813684365L ^ 0xCF802973;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1181058075 ^ (long)1181058276);
            int n2 = (int)((long)1890091655 ^ (long)1890091732);
            cArray2[n] = (char)(cArray[n] ^ (((int)1546134381L ^ 0x5C282698) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

