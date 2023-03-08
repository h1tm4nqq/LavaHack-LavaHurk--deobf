//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.client.*;
import net.minecraft.init.*;
import net.minecraft.network.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1443 implements Class254
{
    final Class1031 Field14757;
    private String Field14758 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method5755((Class805)o);
    }
    
    public final void Method5755(final Class805 class805) {
        Class1031.Method4177(this.Field14757);
        Intrinsics.checkExpressionValueIsNotNull((Object)class805, "it");
        final Packet method982 = class805.Method982();
        if (method982 instanceof CPacketPlayerTryUseItem || method982 instanceof CPacketPlayerTryUseItemOnBlock) {
            final EntityPlayerSP player = Class1031.Method4178().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            if (Intrinsics.areEqual((Object)player.getHeldItemMainhand().item, (Object)Items.ENDER_PEARL)) {
                Class1031.Method4181(this.Field14757, System.currentTimeMillis());
            }
        }
    }
    
    Class1443(final Class1031 field14757) {
        this.Field14757 = field14757;
    }
    
    private static String Method5756(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3F0A ^ 0x85));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
