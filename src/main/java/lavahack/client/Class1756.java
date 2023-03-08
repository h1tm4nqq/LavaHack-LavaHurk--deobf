//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventArmSwingAnimationEnd;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1756 implements Class254
{
    public static final Class1756 Field16048;
    private int Field16049;
    
    @Override
    public void Method979(final Object o) {
        this.Method6683((Class339)o);
    }
    
    public final void Method6683(final Class339 class339) {
        final Class44 method6757 = Class1783.Method6757(Class1783.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)method6757, "animation");
        if (method6757.Method365()) {
            final Class44 method6758 = Class1783.Method6758(Class1783.Field16200);
            Intrinsics.checkExpressionValueIsNotNull((Object)method6758, "animationSpeed");
            class339.Method1671(method6758.Method335());
        }
    }
    
    static {
        Field16048 = new Class1756();
    }
    
    private static String Method6684(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x58A6 ^ 0x84));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
