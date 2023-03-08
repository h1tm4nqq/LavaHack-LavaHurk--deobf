//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventEntityControl;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1457 implements Class254
{
    final Class1913 Field14818;
    private int Field14819;
    
    @Override
    public void Method979(final Object o) {
        this.Method5815((Class756)o);
    }
    
    public final void Method5815(final Class756 class756) {
        final Class44 method7124 = Class1913.Method7124(this.Field14818);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7124, "entityControl");
        if (method7124.Method365()) {
            class756.Method158();
        }
    }
    
    Class1457(final Class1913 field14818) {
        this.Field14818 = field14818;
    }
    
    private static String Method5816(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xA90 ^ 0xCD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
