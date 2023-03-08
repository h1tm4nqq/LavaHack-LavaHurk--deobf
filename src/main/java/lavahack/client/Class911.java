//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.event.*;
import com.kisman.cc.util.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.entity.*;
import net.minecraft.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventPlayerMotionUpdate$Riding;", "kotlin.jvm.PlatformType", "invoke" })
final class Class911 implements Class254
{
    public static final Class911 Field11868;
    private String Field11869 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method979(final Object o) {
        this.Method3822((Class349)o);
    }
    
    public final void Method3822(final Class349 class349) {
        Intrinsics.checkExpressionValueIsNotNull((Object)class349, "it");
        if (class349.Method160() == Class1273.Field13746 && Class1409.Field14381.Method35()) {
            final Class44 method5551 = Class1409.Field14381.Method5551();
            Intrinsics.checkExpressionValueIsNotNull((Object)method5551, "PingBypass.protocol");
            if (method5551.Method341() == Class1963.Field17038) {
                Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketInput(class349.Method1749(), class349.Method1751(), class349.Method1753(), class349.Method1755()));
                final EntityPlayerSP player = Class2142.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                final Entity getLowestRidingEntity = player.getLowestRidingEntity();
                if (!(Intrinsics.areEqual((Object)getLowestRidingEntity, (Object)Class2142.Field17803.player) ^ true) || getLowestRidingEntity.canPassengerSteer()) {}
            }
        }
    }
    
    static {
        Field11868 = new Class911();
    }
    
    private static String Method3823(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x32F9 ^ 0xAA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
