//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import net.minecraft.network.play.client.*;

public class Class942
{
    public static final HashMap Field12018;
    private int Field12019;
    
    static {
        (Field12018 = new HashMap()).put("CPacketAnimation", CPacketAnimation.class);
        Class942.Field12018.put("CPacketChatMessage", CPacketChatMessage.class);
        Class942.Field12018.put("CPacketClickWindow", CPacketClickWindow.class);
        Class942.Field12018.put("CPacketClientSettings", CPacketClientSettings.class);
        Class942.Field12018.put("CPacketClientStatus", CPacketClientStatus.class);
        Class942.Field12018.put("CPacketCloseWindow", CPacketCloseWindow.class);
        Class942.Field12018.put("CPacketConfirmTeleport", CPacketConfirmTeleport.class);
        Class942.Field12018.put("CPacketConfirmTransaction", CPacketConfirmTransaction.class);
        Class942.Field12018.put("CPacketCreativeInventoryAction", CPacketCreativeInventoryAction.class);
        Class942.Field12018.put("CPacketCustomPayload", CPacketCustomPayload.class);
        Class942.Field12018.put("CPacketEnchantItem", CPacketEnchantItem.class);
        Class942.Field12018.put("CPacketEntityAction", CPacketEntityAction.class);
        Class942.Field12018.put("CPacketHeldItemChange", CPacketHeldItemChange.class);
        Class942.Field12018.put("CPacketInput", CPacketInput.class);
        Class942.Field12018.put("CPacketKeepAlive", CPacketKeepAlive.class);
        Class942.Field12018.put("CPacketPlaceRecipe", CPacketPlaceRecipe.class);
        Class942.Field12018.put("CPacketPlayer", CPacketPlayer.class);
        Class942.Field12018.put("CPacketPlayerAbilities", CPacketPlayerAbilities.class);
        Class942.Field12018.put("CPacketPlayerDigging", CPacketPlayerDigging.class);
        Class942.Field12018.put("CPacketPlayerTryUseItem", CPacketPlayerTryUseItem.class);
        Class942.Field12018.put("CPacketPlayerTryUseItemOnBlock", CPacketPlayerTryUseItemOnBlock.class);
        Class942.Field12018.put("CPacketRecipeInfo", CPacketPlaceRecipe.class);
        Class942.Field12018.put("CPacketResourcePackStatus", CPacketResourcePackStatus.class);
        Class942.Field12018.put("CPacketSeenAdvancements", CPacketSeenAdvancements.class);
        Class942.Field12018.put("CPacketSpectate", CPacketSpectate.class);
        Class942.Field12018.put("CPacketSteerBoat", CPacketSteerBoat.class);
        Class942.Field12018.put("CPacketTabComplete", CPacketTabComplete.class);
        Class942.Field12018.put("CPacketUpdateSign", CPacketUpdateSign.class);
        Class942.Field12018.put("CPacketUseEntity", CPacketUseEntity.class);
        Class942.Field12018.put("CPacketVehicleMove", CPacketVehicleMove.class);
        Class942.Field12018.put("CPacketPlayer.Position", CPacketPlayer$Position.class);
        Class942.Field12018.put("CPacketPlayer.PositionRotation", CPacketPlayer$PositionRotation.class);
        Class942.Field12018.put("CPacketPlayer.Rotation", CPacketPlayer$Rotation.class);
    }
    
    private static String Method3891(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2ABE ^ 0x61));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
