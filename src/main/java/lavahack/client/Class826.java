//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventAspect;", "kotlin.jvm.PlatformType", "invoke" })
final class Class826 implements Class254
{
    public static final Class826 Field11520;
    private String Field11521 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method979(final Object o) {
        this.Method3535((Class1931)o);
    }
    
    public final void Method3535(final Class1931 class1931) {
        final Class44 method6759 = Class1783.Method6759(Class1783.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)method6759, "aspect");
        if (method6759.Method365()) {
            final Class44 method6760 = Class1783.Method6760(Class1783.Field16200);
            Intrinsics.checkExpressionValueIsNotNull((Object)method6760, "aspectWidth");
            final float method6761 = method6760.Method368();
            final Class44 method6762 = Class1783.Method6761(Class1783.Field16200);
            Intrinsics.checkExpressionValueIsNotNull((Object)method6762, "aspectHeight");
            class1931.Method7187(method6761 / method6762.Method368());
        }
    }
    
    static {
        Field11520 = new Class826();
    }
    
    private static String Method3536(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x796 ^ 0x7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
