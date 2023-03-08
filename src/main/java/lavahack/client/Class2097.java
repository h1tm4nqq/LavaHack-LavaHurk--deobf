//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import javax.vecmath.*;
import com.kisman.cc.util.*;
import java.awt.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventUpdateLightmap$Post;", "kotlin.jvm.PlatformType", "invoke" })
final class Class2097 implements Class254
{
    public static final Class2097 Field17556;
    private String Field17557 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method7632((Class180)o);
    }
    
    public final void Method7632(final Class180 class180) {
        final Class44 method6763 = Class1783.Method6763(Class1783.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)method6763, "ambience");
        if (method6763.Method365()) {
            for (int i = 0; i < class180.Method1107().length; ++i) {
                final Class44 method6764 = Class1783.Method6764(Class1783.Field16200);
                Intrinsics.checkExpressionValueIsNotNull((Object)method6764, "ambienceColor");
                final Class2027 method6765 = method6764.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method6765, "ambienceColor.colour");
                final Color method6766 = method6765.Method3625();
                Intrinsics.checkExpressionValueIsNotNull((Object)method6766, "ambienceColor.colour.color");
                final Color color = method6766;
                final float n = color.getAlpha() / Float.intBitsToFloat(1132396544);
                final int[] method6767 = Class1783.Method6765(Class1783.Field16200, class180.Method1107()[i]);
                final Vector3f method6768 = Class1783.Method6766(Class1783.Field16200, new Vector3f(method6767[2] / Float.intBitsToFloat(1132396544), method6767[1] / Float.intBitsToFloat(1132396544), method6767[0] / Float.intBitsToFloat(1132396544)), new Vector3f(color.getRed() / Float.intBitsToFloat(1132396544), color.getGreen() / Float.intBitsToFloat(1132396544), color.getBlue() / Float.intBitsToFloat(1132396544)), n);
                class180.Method1107()[i] = (0xFF000000 | (int)(method6768.x * Float.intBitsToFloat(1132396544)) << 16 | (int)(method6768.y * Float.intBitsToFloat(1132396544)) << 8 | (int)(method6768.z * Float.intBitsToFloat(1132396544)));
            }
            class180.Method158();
        }
    }
    
    static {
        Field17556 = new Class2097();
    }
    
    private static String Method7633(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x38CB ^ 0xDB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
