//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.atomic.*;
import net.minecraft.client.renderer.chunk.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderChunk;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1231 implements Class254
{
    final Class1259 Field13588;
    private String Field13589 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method4953((Class1475)o);
    }
    
    public final void Method4953(final Class1475 class1475) {
        if (Class1259.Method5091().player != null && !Class1259.Method5088(this.Field13588).containsKey(class1475.Field14879)) {
            final HashMap hashMap = Class1259.Method5088(this.Field13588);
            final RenderChunk field14879 = class1475.Field14879;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14879, "it.chunk");
            hashMap.put(field14879, new AtomicLong(-1L));
        }
    }
    
    Class1231(final Class1259 field13588) {
        this.Field13588 = field13588;
    }
    
    private static String Method4954(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x32B5 ^ 0x79));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
