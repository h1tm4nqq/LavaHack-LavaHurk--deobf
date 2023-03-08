//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.internal.*;
import net.minecraft.network.play.client.*;
import kotlin.*;
import java.util.concurrent.*;
import net.minecraft.network.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1738 implements Class254
{
    final Class1347 Field15977;
    private String Field15978 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method6616((Class805)o);
    }
    
    public final void Method6616(final Class805 class805) {
        if (Class1347.Method5408(this.Field15977) != -1) {
            Intrinsics.checkExpressionValueIsNotNull((Object)class805, "it");
            if (class805.Method982() instanceof CPacketPlayer) {
                final ConcurrentLinkedQueue method5410 = Class1347.Method5410(this.Field15977);
                final Packet method5411 = class805.Method982();
                if (method5411 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type net.minecraft.network.play.client.CPacketPlayer");
                }
                method5410.add(method5411);
                class805.Method158();
            }
        }
    }
    
    Class1738(final Class1347 field15977) {
        this.Field15977 = field15977;
    }
    
    private static String Method6617(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7B4D ^ 0xEF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
