//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemEgg
 *  net.minecraft.item.ItemEnderPearl
 *  net.minecraft.item.ItemSnowball
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1393;
import lavahack.client.Class1848;
import lavahack.client.Class254;
import lavahack.client.Class44;
import lavahack.client.Class696;
import lavahack.client.Class805;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemSnowball;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1002
implements Class254 {
    final Class696 Field12313;
    private int Field12314;

    @Override
    public void Method979(Object object) {
        this.Method4044((Class805)object);
    }

    public final void Method4044(Class805 class805) {
        block9: {
            block10: {
                block8: {
                    Class805 class8052 = class805;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class8052, (String)"it");
                    Packet packet = class8052.Method982();
                    Class44 class44 = Class696.Method2911(this.Field12313);
                    Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mode");
                    if (class44.Method341() != Class1848.Field16521) return;
                    if (packet instanceof CPacketPlayerDigging && ((CPacketPlayerDigging)packet).getAction() == CPacketPlayerDigging.Action.RELEASE_USE_ITEM) {
                        EntityPlayerSP entityPlayerSP = Class696.Method2909().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                        if (!entityPlayerSP.getHeldItemMainhand().isEmpty) {
                            EntityPlayerSP entityPlayerSP2 = Class696.Method2909().player;
                            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
                            if (entityPlayerSP2.getHeldItemMainhand().item instanceof ItemBow) {
                                Class44 class442 = Class696.Method2912(this.Field12313);
                                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"bow");
                                if (class442.Method365()) {
                                    Class696.Method2913(this.Field12313);
                                    Class44 class443 = Class696.Method2914(this.Field12313);
                                    Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"debug");
                                    if (class443.Method365() && !Class696.Method2915(this.Field12313)) {
                                        Class1393.Method5505().Method1886("Trying to spoof.");
                                    }
                                }
                            }
                        }
                    }
                    if (!(packet instanceof CPacketPlayerTryUseItem)) return;
                    if (((CPacketPlayerTryUseItem)packet).getHand() != EnumHand.MAIN_HAND) return;
                    EntityPlayerSP entityPlayerSP = Class696.Method2909().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                    if (entityPlayerSP.getHeldItemMainhand().isEmpty) return;
                    EntityPlayerSP entityPlayerSP3 = Class696.Method2909().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
                    if (!(entityPlayerSP3.getHeldItemMainhand().item instanceof ItemEgg)) break block8;
                    Class44 class444 = Class696.Method2917(this.Field12313);
                    Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"eggs");
                    if (class444.Method365()) break block9;
                }
                EntityPlayerSP entityPlayerSP = Class696.Method2909().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                if (!(entityPlayerSP.getHeldItemMainhand().item instanceof ItemEnderPearl)) break block10;
                Class44 class44 = Class696.Method2918(this.Field12313);
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"pearls");
                if (class44.Method365()) break block9;
            }
            EntityPlayerSP entityPlayerSP = Class696.Method2909().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (!(entityPlayerSP.getHeldItemMainhand().item instanceof ItemSnowball)) return;
            Class44 class44 = Class696.Method2919(this.Field12313);
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"snowballs");
            if (!class44.Method365()) return;
        }
        Class696.Method2913(this.Field12313);
    }

    Class1002(Class696 class696) {
        this.Field12313 = class696;
    }

    private static String Method4045(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 227;
            cArray2[n] = (char)(cArray[n] ^ (0x60EF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

