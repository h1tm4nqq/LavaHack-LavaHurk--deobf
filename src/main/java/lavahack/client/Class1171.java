//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.internal.*;
import net.minecraft.network.play.client.*;
import kotlin.*;
import net.minecraft.client.entity.*;
import net.minecraft.network.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1171 implements Class254
{
    final Class1913 Field13276;
    private String Field13277 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method4697((Class805)o);
    }
    
    public final void Method4697(final Class805 class805) {
        if (Class1913.Method7117().player != null) {
            final EntityPlayerSP player = Class1913.Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            if (player.isOnLadder()) {
                final Class44 method7123 = Class1913.Method7123(this.Field13276);
                Intrinsics.checkExpressionValueIsNotNull((Object)method7123, "fastLadder");
                if (method7123.Method365() && Class1917.Method7159()) {
                    Intrinsics.checkExpressionValueIsNotNull((Object)class805, "it");
                    if (class805.Method982() instanceof CPacketPlayer) {
                        final Packet method7124 = class805.Method982();
                        if (method7124 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.network.play.client.CPacketPlayer");
                        }
                        ((CPacketPlayer)method7124).onGround = true;
                    }
                }
            }
        }
    }
    
    Class1171(final Class1913 field13276) {
        this.Field13276 = field13276;
    }
    
    private static String Method4698(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x226 ^ 0xC5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
