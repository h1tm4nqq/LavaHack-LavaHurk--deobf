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
import lavahack.client.Class1259;
import lavahack.client.Class1511;
import lavahack.client.Class1763;
import lavahack.client.Class187;
import lavahack.client.Class254;
import lavahack.client.Class44;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderChunkContainer;", "kotlin.jvm.PlatformType", "invoke"})
final class Class2079
implements Class254 {
    final Class1259 Field17504;
    private int Field17505;

    @Override
    public void Method979(Object object) {
        this.Method7619((Class1511)object);
    }

    public final void Method7619(Class1511 class1511) {
        if (!Class1259.Method5088(this.Field17504).containsKey(class1511.Field15074)) return;
        Object v = Class1259.Method5088(this.Field17504).get(class1511.Field15074);
        if (v == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(v, (String)"chunks[it.chunk]!!");
        AtomicLong atomicLong = (AtomicLong)v;
        long l = atomicLong.get();
        if (l == -1L) {
            l = System.currentTimeMillis();
            atomicLong.set(l);
        }
        long l2 = System.currentTimeMillis() - l;
        Class44 class44 = Class1259.Method5089(this.Field17504);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"length");
        if (l2 >= (long)class44.Method335()) return;
        RenderChunk renderChunk = class1511.Field15074;
        Intrinsics.checkExpressionValueIsNotNull((Object)renderChunk, (String)"it.chunk");
        BlockPos blockPos = renderChunk.getPosition();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"it.chunk.position");
        double d = -blockPos.getY();
        RenderChunk renderChunk2 = class1511.Field15074;
        Intrinsics.checkExpressionValueIsNotNull((Object)renderChunk2, (String)"it.chunk");
        BlockPos blockPos2 = renderChunk2.getPosition();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"it.chunk.position");
        double d2 = blockPos2.getY();
        Class1763 class1763 = ((Class187)Class1259.Method5090(this.Field17504).Method341()).Method849();
        Object[] objectArray = new Object[1];
        Class44 class442 = Class1259.Method5089(this.Field17504);
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"length");
        objectArray[0] = (double)(l2 / (long)class442.Method335());
        Object object = class1763.Method1726(objectArray);
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"easing.valEnum.task.doTa\u2026ength.valInt).toDouble())");
        GlStateManager.translate((double)0.0, (double)(d + d2 * ((Number)object).doubleValue()), (double)0.0);
    }

    Class2079(Class1259 class1259) {
        this.Field17504 = class1259;
    }

    private static String Method7620(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 83;
            cArray2[n] = (char)(cArray[n] ^ (0x17D4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

