/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketChatMessage
 *  net.minecraft.network.play.client.CPacketClickWindow
 *  net.minecraft.network.play.client.CPacketClientSettings
 *  net.minecraft.network.play.client.CPacketClientStatus
 *  net.minecraft.network.play.client.CPacketCloseWindow
 *  net.minecraft.network.play.client.CPacketConfirmTeleport
 *  net.minecraft.network.play.client.CPacketConfirmTransaction
 *  net.minecraft.network.play.client.CPacketCreativeInventoryAction
 *  net.minecraft.network.play.client.CPacketCustomPayload
 *  net.minecraft.network.play.client.CPacketEnchantItem
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 *  net.minecraft.network.play.client.CPacketInput
 *  net.minecraft.network.play.client.CPacketKeepAlive
 *  net.minecraft.network.play.client.CPacketPlaceRecipe
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.client.CPacketPlayer$PositionRotation
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerAbilities
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.network.play.client.CPacketResourcePackStatus
 *  net.minecraft.network.play.client.CPacketSeenAdvancements
 *  net.minecraft.network.play.client.CPacketSpectate
 *  net.minecraft.network.play.client.CPacketSteerBoat
 *  net.minecraft.network.play.client.CPacketTabComplete
 *  net.minecraft.network.play.client.CPacketUpdateSign
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketVehicleMove
 */
package lavahack.client;

import java.util.HashMap;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.network.play.client.CPacketClickWindow;
import net.minecraft.network.play.client.CPacketClientSettings;
import net.minecraft.network.play.client.CPacketClientStatus;
import net.minecraft.network.play.client.CPacketCloseWindow;
import net.minecraft.network.play.client.CPacketConfirmTeleport;
import net.minecraft.network.play.client.CPacketConfirmTransaction;
import net.minecraft.network.play.client.CPacketCreativeInventoryAction;
import net.minecraft.network.play.client.CPacketCustomPayload;
import net.minecraft.network.play.client.CPacketEnchantItem;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketInput;
import net.minecraft.network.play.client.CPacketKeepAlive;
import net.minecraft.network.play.client.CPacketPlaceRecipe;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerAbilities;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketResourcePackStatus;
import net.minecraft.network.play.client.CPacketSeenAdvancements;
import net.minecraft.network.play.client.CPacketSpectate;
import net.minecraft.network.play.client.CPacketSteerBoat;
import net.minecraft.network.play.client.CPacketTabComplete;
import net.minecraft.network.play.client.CPacketUpdateSign;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.client.CPacketVehicleMove;

public class s0rPDdwE1NquahMuvX2Nzyspfm4LkcCG {
    public static final HashMap Field12018 = new HashMap();
    private int Field12019;

    static {
        Field12018.put("CPacketAnimation", CPacketAnimation.class);
        Field12018.put("CPacketChatMessage", CPacketChatMessage.class);
        Field12018.put("CPacketClickWindow", CPacketClickWindow.class);
        Field12018.put("CPacketClientSettings", CPacketClientSettings.class);
        Field12018.put("CPacketClientStatus", CPacketClientStatus.class);
        Field12018.put("CPacketCloseWindow", CPacketCloseWindow.class);
        Field12018.put("CPacketConfirmTeleport", CPacketConfirmTeleport.class);
        Field12018.put("CPacketConfirmTransaction", CPacketConfirmTransaction.class);
        Field12018.put("CPacketCreativeInventoryAction", CPacketCreativeInventoryAction.class);
        Field12018.put("CPacketCustomPayload", CPacketCustomPayload.class);
        Field12018.put("CPacketEnchantItem", CPacketEnchantItem.class);
        Field12018.put("CPacketEntityAction", CPacketEntityAction.class);
        Field12018.put("CPacketHeldItemChange", CPacketHeldItemChange.class);
        Field12018.put("CPacketInput", CPacketInput.class);
        Field12018.put("CPacketKeepAlive", CPacketKeepAlive.class);
        Field12018.put("CPacketPlaceRecipe", CPacketPlaceRecipe.class);
        Field12018.put("CPacketPlayer", CPacketPlayer.class);
        Field12018.put("CPacketPlayerAbilities", CPacketPlayerAbilities.class);
        Field12018.put("CPacketPlayerDigging", CPacketPlayerDigging.class);
        Field12018.put("CPacketPlayerTryUseItem", CPacketPlayerTryUseItem.class);
        Field12018.put("CPacketPlayerTryUseItemOnBlock", CPacketPlayerTryUseItemOnBlock.class);
        Field12018.put("CPacketRecipeInfo", CPacketPlaceRecipe.class);
        Field12018.put("CPacketResourcePackStatus", CPacketResourcePackStatus.class);
        Field12018.put("CPacketSeenAdvancements", CPacketSeenAdvancements.class);
        Field12018.put("CPacketSpectate", CPacketSpectate.class);
        Field12018.put("CPacketSteerBoat", CPacketSteerBoat.class);
        Field12018.put("CPacketTabComplete", CPacketTabComplete.class);
        Field12018.put("CPacketUpdateSign", CPacketUpdateSign.class);
        Field12018.put("CPacketUseEntity", CPacketUseEntity.class);
        Field12018.put("CPacketVehicleMove", CPacketVehicleMove.class);
        Field12018.put("CPacketPlayer.Position", CPacketPlayer.Position.class);
        Field12018.put("CPacketPlayer.PositionRotation", CPacketPlayer.PositionRotation.class);
        Field12018.put("CPacketPlayer.Rotation", CPacketPlayer.Rotation.class);
    }

    private static String Method3891(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2138616623L ^ 0x80874CD1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-899615653L ^ 0xCA60F4A4);
            int n2 = (int)1315730360L ^ 0x4E6C73D9;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-290170226 ^ (long)-290172975) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

