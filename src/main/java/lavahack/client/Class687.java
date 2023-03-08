//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class687 implements Runnable
{
    final CPacketEntityAction Field10901;
    private String Field10902 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public final void run() {
        if (Class2142.Field17803.player != null) {
            final CPacketEntityAction$Action getAction = this.Field10901.getAction();
            if (getAction != null) {
                switch (Class2103.Field17581[getAction.ordinal()]) {
                    case 1: {
                        final EntityPlayerSP player = Class2142.Field17803.player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                        player.setSneaking(true);
                        break;
                    }
                    case 2: {
                        final EntityPlayerSP player2 = Class2142.Field17803.player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                        player2.setSneaking(false);
                        break;
                    }
                    case 3: {
                        final EntityPlayerSP player3 = Class2142.Field17803.player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
                        player3.setSprinting(true);
                        break;
                    }
                    case 4: {
                        final EntityPlayerSP player4 = Class2142.Field17803.player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player4, "mc.player");
                        player4.setSprinting(true);
                        break;
                    }
                }
            }
        }
    }
    
    Class687(final CPacketEntityAction field10901) {
        this.Field10901 = field10901;
    }
    
    private static String Method2896(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2F2E ^ 0x60));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
