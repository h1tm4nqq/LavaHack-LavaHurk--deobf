//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.*;
import net.minecraft.init.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "event", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "invoke" })
final class Class781 implements Class254
{
    final Class979 Field11294;
    private String Field11295 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method979(final Object o) {
        this.Method3268((Class805)o);
    }
    
    public final void Method3268(@NotNull @NotNull final Class805 class805) {
        Intrinsics.checkParameterIsNotNull((Object)class805, "event");
        if (class805.Method982() instanceof CPacketPlayerTryUseItemOnBlock) {
            final EntityPlayerSP player = Minecraft.getMinecraft().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "Minecraft.getMinecraft().player");
            if (!Intrinsics.areEqual((Object)player.getHeldItemMainhand().getItem(), (Object)Items.END_CRYSTAL)) {
                final EntityPlayerSP player2 = Minecraft.getMinecraft().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player2, "Minecraft.getMinecraft().player");
                if (!Intrinsics.areEqual((Object)player2.getHeldItemOffhand().getItem(), (Object)Items.END_CRYSTAL)) {
                    return;
                }
            }
            final Class979 field11294 = this.Field11294;
            field11294.Method3986(field11294.Method3985() + 1);
        }
    }
    
    Class781(final Class979 field11294) {
        this.Field11294 = field11294;
    }
    
    private static String Method3269(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x321 ^ 0xDD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
