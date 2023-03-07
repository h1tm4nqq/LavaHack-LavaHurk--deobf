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
import lavahack.client.Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg;
import lavahack.client.Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
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
final class Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg Field12313;
    private int Field12314;

    @Override
    public void Method979(Object object) {
        this.Method4044((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)object);
    }

    public final void Method4044(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        block9: {
            block10: {
                block8: {
                    TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
                    Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"it");
                    Packet packet = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method982();
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2911(this.Field12313);
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"mode");
                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341() != Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16521) return;
                    if (packet instanceof CPacketPlayerDigging && ((CPacketPlayerDigging)packet).getAction() == CPacketPlayerDigging.Action.RELEASE_USE_ITEM) {
                        EntityPlayerSP entityPlayerSP = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                        if (!entityPlayerSP.getHeldItemMainhand().isEmpty) {
                            EntityPlayerSP entityPlayerSP2 = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player;
                            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
                            if (entityPlayerSP2.getHeldItemMainhand().item instanceof ItemBow) {
                                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2912(this.Field12313);
                                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"bow");
                                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                                    Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2913(this.Field12313);
                                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2914(this.Field12313);
                                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"debug");
                                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365() && !Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2915(this.Field12313)) {
                                        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("Trying to spoof.");
                                    }
                                }
                            }
                        }
                    }
                    if (!(packet instanceof CPacketPlayerTryUseItem)) return;
                    if (((CPacketPlayerTryUseItem)packet).getHand() != EnumHand.MAIN_HAND) return;
                    EntityPlayerSP entityPlayerSP = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                    if (entityPlayerSP.getHeldItemMainhand().isEmpty) return;
                    EntityPlayerSP entityPlayerSP3 = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
                    if (!(entityPlayerSP3.getHeldItemMainhand().item instanceof ItemEgg)) break block8;
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2917(this.Field12313);
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"eggs");
                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) break block9;
                }
                EntityPlayerSP entityPlayerSP = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                if (!(entityPlayerSP.getHeldItemMainhand().item instanceof ItemEnderPearl)) break block10;
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2918(this.Field12313);
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"pearls");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365()) break block9;
            }
            EntityPlayerSP entityPlayerSP = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2909().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (!(entityPlayerSP.getHeldItemMainhand().item instanceof ItemSnowball)) return;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2919(this.Field12313);
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"snowballs");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method365()) return;
        }
        Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.Method2913(this.Field12313);
    }

    Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg ce8ehKEIYQU2NDxfXULPC692xF6WK1qg) {
        this.Field12313 = ce8ehKEIYQU2NDxfXULPC692xF6WK1qg;
    }

    private static String Method4045(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-25543893L ^ 0xFE7A3B2B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)22823166L ^ 0x15C4001);
            int n2 = (int)((long)84497715 ^ (long)84497872);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1462290503 ^ (long)-1462282410) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

