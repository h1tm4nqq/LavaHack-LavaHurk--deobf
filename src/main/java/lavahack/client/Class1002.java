//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.client.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import net.minecraft.network.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1002 implements Class254
{
    final Class696 Field12313;
    private int Field12314;
    
    @Override
    public void Method979(final Object o) {
        this.Method4044((Class805)o);
    }
    
    public final void Method4044(final Class805 class805) {
        Intrinsics.checkExpressionValueIsNotNull((Object)class805, "it");
        final Packet method982 = class805.Method982();
        final Class44 method983 = Class696.Method2911(this.Field12313);
        Intrinsics.checkExpressionValueIsNotNull((Object)method983, "mode");
        if (method983.Method341() == Class1848.Field16521) {
            if (method982 instanceof CPacketPlayerDigging && ((CPacketPlayerDigging)method982).getAction() == CPacketPlayerDigging$Action.RELEASE_USE_ITEM) {
                final EntityPlayerSP player = Class696.Method2909().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                if (!player.getHeldItemMainhand().isEmpty) {
                    final EntityPlayerSP player2 = Class696.Method2909().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                    if (player2.getHeldItemMainhand().item instanceof ItemBow) {
                        final Class44 method984 = Class696.Method2912(this.Field12313);
                        Intrinsics.checkExpressionValueIsNotNull((Object)method984, "bow");
                        if (method984.Method365()) {
                            Class696.Method2913(this.Field12313);
                            final Class44 method985 = Class696.Method2914(this.Field12313);
                            Intrinsics.checkExpressionValueIsNotNull((Object)method985, "debug");
                            if (method985.Method365() && !Class696.Method2915(this.Field12313)) {
                                Class1393.Method5505().Method1886("Trying to spoof.");
                            }
                        }
                    }
                }
            }
            if (method982 instanceof CPacketPlayerTryUseItem && ((CPacketPlayerTryUseItem)method982).getHand() == EnumHand.MAIN_HAND) {
                final EntityPlayerSP player3 = Class696.Method2909().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
                if (!player3.getHeldItemMainhand().isEmpty) {
                    final EntityPlayerSP player4 = Class696.Method2909().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player4, "mc.player");
                    Label_0331: {
                        if (player4.getHeldItemMainhand().item instanceof ItemEgg) {
                            final Class44 method986 = Class696.Method2917(this.Field12313);
                            Intrinsics.checkExpressionValueIsNotNull((Object)method986, "eggs");
                            if (method986.Method365()) {
                                break Label_0331;
                            }
                        }
                        final EntityPlayerSP player5 = Class696.Method2909().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player5, "mc.player");
                        if (player5.getHeldItemMainhand().item instanceof ItemEnderPearl) {
                            final Class44 method987 = Class696.Method2918(this.Field12313);
                            Intrinsics.checkExpressionValueIsNotNull((Object)method987, "pearls");
                            if (method987.Method365()) {
                                break Label_0331;
                            }
                        }
                        final EntityPlayerSP player6 = Class696.Method2909().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player6, "mc.player");
                        if (!(player6.getHeldItemMainhand().item instanceof ItemSnowball)) {
                            return;
                        }
                        final Class44 method988 = Class696.Method2919(this.Field12313);
                        Intrinsics.checkExpressionValueIsNotNull((Object)method988, "snowballs");
                        if (!method988.Method365()) {
                            return;
                        }
                    }
                    Class696.Method2913(this.Field12313);
                }
            }
        }
    }
    
    Class1002(final Class696 field12313) {
        this.Field12313 = field12313;
    }
    
    private static String Method4045(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x60EF ^ 0xE3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
