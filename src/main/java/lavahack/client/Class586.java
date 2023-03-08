//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke" })
final class Class586 implements Class254
{
    public static final Class586 Field10489;
    private String Field10490 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method979(final Object o) {
        this.Method2548((Class805)o);
    }
    
    public final void Method2548(final Class805 class805) {
        final Class275 field9212 = Class275.Field9212;
        Intrinsics.checkExpressionValueIsNotNull((Object)class805, "it");
        final Packet method982 = class805.Method982();
        Intrinsics.checkExpressionValueIsNotNull((Object)method982, "it.packet");
        if (field9212.Method1462(method982) && Class218.Field8954.Method1254() && Class275.Method1466(Class275.Field9212).contains(class805.Method982().getClass()) && Class275.Field9212.Method1463()) {
            class805.Method158();
        }
    }
    
    static {
        Field10489 = new Class586();
    }
    
    private static String Method2549(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x43D6 ^ 0x65));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
