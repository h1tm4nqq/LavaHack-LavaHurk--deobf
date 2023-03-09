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
import lavahack.client.Class1259;
import lavahack.client.Class1475;
import lavahack.client.Class254;
import net.minecraft.client.renderer.chunk.RenderChunk;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderChunk;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1231
implements Class254 {
    final Class1259 Field13588;
    private String Field13589 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method4953((Class1475)object);
    }

    public final void Method4953(Class1475 class1475) {
        if (Class1259.Method5091().player == null) return;
        if (Class1259.Method5088(this.Field13588).containsKey(class1475.Field14879)) return;
        Map map = Class1259.Method5088(this.Field13588);
        RenderChunk renderChunk = class1475.Field14879;
        Intrinsics.checkExpressionValueIsNotNull((Object)renderChunk, (String)"it.chunk");
        RenderChunk renderChunk2 = renderChunk;
        AtomicLong atomicLong = new AtomicLong(-1L);
        boolean bl = false;
        map.put(renderChunk2, atomicLong);
    }

    Class1231(Class1259 class1259) {
        this.Field13588 = class1259;
    }

    private static String Method4954(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 121;
            cArray2[n] = (char)(cArray[n] ^ (0x32B5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

