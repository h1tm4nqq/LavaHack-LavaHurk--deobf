//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.renderer.chunk.RenderChunk
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.l6yKOMt7SVcyIzts9W2dZyllrA36dUBL;
import lavahack.client.tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y;
import net.minecraft.client.renderer.chunk.RenderChunk;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderChunk;", "kotlin.jvm.PlatformType", "invoke"})
final class tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y Field13588;
    private String Field13589 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method4953((l6yKOMt7SVcyIzts9W2dZyllrA36dUBL)object);
    }

    public final void Method4953(l6yKOMt7SVcyIzts9W2dZyllrA36dUBL l6yKOMt7SVcyIzts9W2dZyllrA36dUBL2) {
        if (tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y.Method5091().player == null) return;
        if (tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y.Method5088(this.Field13588).containsKey(l6yKOMt7SVcyIzts9W2dZyllrA36dUBL2.Field14879)) return;
        Map map = tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y.Method5088(this.Field13588);
        RenderChunk renderChunk = l6yKOMt7SVcyIzts9W2dZyllrA36dUBL2.Field14879;
        Intrinsics.checkExpressionValueIsNotNull((Object)renderChunk, (String)"it.chunk");
        RenderChunk renderChunk2 = renderChunk;
        AtomicLong atomicLong = new AtomicLong(0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL);
        int n = (int)415757937L ^ 0x18C7F671;
        map.put(renderChunk2, atomicLong);
    }

    tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y2) {
        this.Field13588 = tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y2;
    }

    private static String Method4954(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1601791638 ^ (long)1601791638);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2139086486L ^ 0x80802195);
            int n2 = (int)1753390102L ^ 0x68829C6F;
            cArray2[n] = (char)(cArray[n] ^ ((int)330956834L ^ 0x13BA3297 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

