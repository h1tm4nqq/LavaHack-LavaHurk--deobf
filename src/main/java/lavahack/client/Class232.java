//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.play.*;
import kotlin.*;
import net.minecraft.network.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.text.*;
import net.minecraft.network.play.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 E2\u00020\u0001:\u0001EJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0014\u0010\u0006\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020DH\u0016?\u0006F" }, d2 = { "Lcom/kisman/cc/pingbypass/server/nethandler/IPingBypassNetHandler;", "Lnet/minecraft/network/play/INetHandlerPlayServer;", "func_194308_a", "", "packet", "Lnet/minecraft/network/play/client/CPacketPlaceRecipe;", "handle", "Lnet/minecraft/network/Packet;", "handleAnimation", "Lnet/minecraft/network/play/client/CPacketAnimation;", "handleRecipeBookUpdate", "Lnet/minecraft/network/play/client/CPacketRecipeInfo;", "handleResourcePackStatus", "Lnet/minecraft/network/play/client/CPacketResourcePackStatus;", "handleSeenAdvancements", "Lnet/minecraft/network/play/client/CPacketSeenAdvancements;", "handleSpectate", "Lnet/minecraft/network/play/client/CPacketSpectate;", "onDisconnect", "reason", "Lnet/minecraft/util/text/ITextComponent;", "processChatMessage", "Lnet/minecraft/network/play/client/CPacketChatMessage;", "processClickWindow", "Lnet/minecraft/network/play/client/CPacketClickWindow;", "processClientSettings", "Lnet/minecraft/network/play/client/CPacketClientSettings;", "processClientStatus", "Lnet/minecraft/network/play/client/CPacketClientStatus;", "processCloseWindow", "Lnet/minecraft/network/play/client/CPacketCloseWindow;", "processConfirmTeleport", "Lnet/minecraft/network/play/client/CPacketConfirmTeleport;", "processConfirmTransaction", "Lnet/minecraft/network/play/client/CPacketConfirmTransaction;", "processCreativeInventoryAction", "Lnet/minecraft/network/play/client/CPacketCreativeInventoryAction;", "processCustomPayload", "Lnet/minecraft/network/play/client/CPacketCustomPayload;", "processEnchantItem", "Lnet/minecraft/network/play/client/CPacketEnchantItem;", "processEntityAction", "Lnet/minecraft/network/play/client/CPacketEntityAction;", "processHeldItemChange", "Lnet/minecraft/network/play/client/CPacketHeldItemChange;", "processInput", "Lnet/minecraft/network/play/client/CPacketInput;", "processKeepAlive", "Lnet/minecraft/network/play/client/CPacketKeepAlive;", "processPlayer", "Lnet/minecraft/network/play/client/CPacketPlayer;", "processPlayerAbilities", "Lnet/minecraft/network/play/client/CPacketPlayerAbilities;", "processPlayerDigging", "Lnet/minecraft/network/play/client/CPacketPlayerDigging;", "processSteerBoat", "Lnet/minecraft/network/play/client/CPacketSteerBoat;", "processTabComplete", "Lnet/minecraft/network/play/client/CPacketTabComplete;", "processTryUseItem", "Lnet/minecraft/network/play/client/CPacketPlayerTryUseItem;", "processTryUseItemOnBlock", "Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;", "processUpdateSign", "Lnet/minecraft/network/play/client/CPacketUpdateSign;", "processUseEntity", "Lnet/minecraft/network/play/client/CPacketUseEntity;", "processVehicleMove", "Lnet/minecraft/network/play/client/CPacketVehicleMove;", "Companion", "kisman.cc" })
public interface Class232 extends INetHandlerPlayServer
{
    public static final Class2039 Field9015 = Class2039.Field17372;
    
    void handle(@NotNull @NotNull final Packet p0);
    
    void onDisconnect(@NotNull @NotNull final ITextComponent p0);
    
    void handleAnimation(@NotNull @NotNull final CPacketAnimation p0);
    
    void processChatMessage(@NotNull @NotNull final CPacketChatMessage p0);
    
    void processTabComplete(@NotNull @NotNull final CPacketTabComplete p0);
    
    void processClientStatus(@NotNull @NotNull final CPacketClientStatus p0);
    
    void processClientSettings(@NotNull @NotNull final CPacketClientSettings p0);
    
    void processConfirmTransaction(@NotNull @NotNull final CPacketConfirmTransaction p0);
    
    void processEnchantItem(@NotNull @NotNull final CPacketEnchantItem p0);
    
    void processClickWindow(@NotNull @NotNull final CPacketClickWindow p0);
    
    void func_194308_a(@NotNull @NotNull final CPacketPlaceRecipe p0);
    
    void processCloseWindow(@NotNull @NotNull final CPacketCloseWindow p0);
    
    void processCustomPayload(@NotNull @NotNull final CPacketCustomPayload p0);
    
    void processUseEntity(@NotNull @NotNull final CPacketUseEntity p0);
    
    void processKeepAlive(@NotNull @NotNull final CPacketKeepAlive p0);
    
    void processPlayer(@NotNull @NotNull final CPacketPlayer p0);
    
    void processPlayerAbilities(@NotNull @NotNull final CPacketPlayerAbilities p0);
    
    void processPlayerDigging(@NotNull @NotNull final CPacketPlayerDigging p0);
    
    void processEntityAction(@NotNull @NotNull final CPacketEntityAction p0);
    
    void processInput(@NotNull @NotNull final CPacketInput p0);
    
    void processHeldItemChange(@NotNull @NotNull final CPacketHeldItemChange p0);
    
    void processCreativeInventoryAction(@NotNull @NotNull final CPacketCreativeInventoryAction p0);
    
    void processUpdateSign(@NotNull @NotNull final CPacketUpdateSign p0);
    
    void processTryUseItemOnBlock(@NotNull @NotNull final CPacketPlayerTryUseItemOnBlock p0);
    
    void processTryUseItem(@NotNull @NotNull final CPacketPlayerTryUseItem p0);
    
    void handleSpectate(@NotNull @NotNull final CPacketSpectate p0);
    
    void handleResourcePackStatus(@NotNull @NotNull final CPacketResourcePackStatus p0);
    
    void processSteerBoat(@NotNull @NotNull final CPacketSteerBoat p0);
    
    void processVehicleMove(@NotNull @NotNull final CPacketVehicleMove p0);
    
    void processConfirmTeleport(@NotNull @NotNull final CPacketConfirmTeleport p0);
    
    void handleRecipeBookUpdate(@NotNull @NotNull final CPacketRecipeInfo p0);
    
    void handleSeenAdvancements(@NotNull @NotNull final CPacketSeenAdvancements p0);
}
