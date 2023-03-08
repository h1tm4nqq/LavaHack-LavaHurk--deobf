//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.renderer.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventItemRenderer;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1739 implements Class254
{
    public static final Class1739 Field15979;
    private String Field15980 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method6618((Class1624)o);
    }
    
    public final void Method6618(final Class1624 class1624) {
        final Class44 method4682 = Class1161.Method4682(Class1161.Field13248);
        Intrinsics.checkExpressionValueIsNotNull((Object)method4682, "handRotateX");
        GlStateManager.rotate(method4682.Method368() * class1624.Field15601, 1.0f, 0.0f, 0.0f);
        final Class44 method4683 = Class1161.Method4683(Class1161.Field13248);
        Intrinsics.checkExpressionValueIsNotNull((Object)method4683, "handRotateY");
        GlStateManager.rotate(method4683.Method368() * class1624.Field15601, 0.0f, 1.0f, 0.0f);
        final Class44 method4684 = Class1161.Method4684(Class1161.Field13248);
        Intrinsics.checkExpressionValueIsNotNull((Object)method4684, "handRotateZ");
        GlStateManager.rotate(method4684.Method368() * class1624.Field15601, 0.0f, 0.0f, 1.0f);
    }
    
    static {
        Field15979 = new Class1739();
    }
    
    private static String Method6619(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xDFC ^ 0x80));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
