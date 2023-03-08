//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.atomic.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.chunk.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderChunkContainer;", "kotlin.jvm.PlatformType", "invoke" })
final class Class2079 implements Class254
{
    final Class1259 Field17504;
    private int Field17505;
    
    @Override
    public void Method979(final Object o) {
        this.Method7619((Class1511)o);
    }
    
    public final void Method7619(final Class1511 class1511) {
        if (Class1259.Method5088(this.Field17504).containsKey(class1511.Field15074)) {
            final AtomicLong value = Class1259.Method5088(this.Field17504).get(class1511.Field15074);
            if (value == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull((Object)value, "chunks[it.chunk]!!");
            final AtomicLong atomicLong = value;
            long newValue = atomicLong.get();
            if (newValue == -1L) {
                newValue = System.currentTimeMillis();
                atomicLong.set(newValue);
            }
            final long n = System.currentTimeMillis() - newValue;
            final Class44 method5089 = Class1259.Method5089(this.Field17504);
            Intrinsics.checkExpressionValueIsNotNull((Object)method5089, "length");
            if (n < method5089.Method335()) {
                final double n2 = 0.0;
                final RenderChunk field15074 = class1511.Field15074;
                Intrinsics.checkExpressionValueIsNotNull((Object)field15074, "it.chunk");
                final BlockPos getPosition = field15074.getPosition();
                Intrinsics.checkExpressionValueIsNotNull((Object)getPosition, "it.chunk.position");
                final double n3 = -getPosition.getY();
                final RenderChunk field15075 = class1511.Field15074;
                Intrinsics.checkExpressionValueIsNotNull((Object)field15075, "it.chunk");
                final BlockPos getPosition2 = field15075.getPosition();
                Intrinsics.checkExpressionValueIsNotNull((Object)getPosition2, "it.chunk.position");
                final double n4 = getPosition2.getY();
                final Class1763 method5090 = ((Class187)Class1259.Method5090(this.Field17504).Method341()).Method849();
                final Object[] array = { null };
                final int n5 = 0;
                final long n6 = n;
                final Class44 method5091 = Class1259.Method5089(this.Field17504);
                Intrinsics.checkExpressionValueIsNotNull((Object)method5091, "length");
                array[n5] = n6 / method5091.Method335();
                final Object method5092 = method5090.Method1726(array);
                Intrinsics.checkExpressionValueIsNotNull(method5092, "easing.valEnum.task.doTa\u2026ength.valInt).toDouble())");
                GlStateManager.translate(n2, n3 + n4 * ((Number)method5092).doubleValue(), 0.0);
            }
        }
    }
    
    Class2079(final Class1259 field17504) {
        this.Field17504 = field17504;
    }
    
    private static String Method7620(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x17D4 ^ 0x53));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
