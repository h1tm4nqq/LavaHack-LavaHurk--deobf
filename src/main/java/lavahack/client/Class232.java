//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.INetHandlerPlayServer
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
 *  net.minecraft.network.play.client.CPacketPlayerAbilities
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.network.play.client.CPacketRecipeInfo
 *  net.minecraft.network.play.client.CPacketResourcePackStatus
 *  net.minecraft.network.play.client.CPacketSeenAdvancements
 *  net.minecraft.network.play.client.CPacketSpectate
 *  net.minecraft.network.play.client.CPacketSteerBoat
 *  net.minecraft.network.play.client.CPacketTabComplete
 *  net.minecraft.network.play.client.CPacketUpdateSign
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketVehicleMove
 *  net.minecraft.util.text.ITextComponent
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class2039;
import net.minecraft.network.Packet;
import net.minecraft.network.play.INetHandlerPlayServer;
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
import net.minecraft.network.play.client.CPacketRecipeInfo;
import net.minecraft.network.play.client.CPacketResourcePackStatus;
import net.minecraft.network.play.client.CPacketSeenAdvancements;
import net.minecraft.network.play.client.CPacketSpectate;
import net.minecraft.network.play.client.CPacketSteerBoat;
import net.minecraft.network.play.client.CPacketTabComplete;
import net.minecraft.network.play.client.CPacketUpdateSign;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.client.CPacketVehicleMove;
import net.minecraft.util.text.ITextComponent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 E2\u00020\u0001:\u0001EJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0014\u0010\u0006\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020DH\u0016\u00a8\u0006F"}, d2={"Lcom/kisman/cc/pingbypass/server/nethandler/IPingBypassNetHandler;", "Lnet/minecraft/network/play/INetHandlerPlayServer;", "func_194308_a", "", "packet", "Lnet/minecraft/network/play/client/CPacketPlaceRecipe;", "handle", "Lnet/minecraft/network/Packet;", "handleAnimation", "Lnet/minecraft/network/play/client/CPacketAnimation;", "handleRecipeBookUpdate", "Lnet/minecraft/network/play/client/CPacketRecipeInfo;", "handleResourcePackStatus", "Lnet/minecraft/network/play/client/CPacketResourcePackStatus;", "handleSeenAdvancements", "Lnet/minecraft/network/play/client/CPacketSeenAdvancements;", "handleSpectate", "Lnet/minecraft/network/play/client/CPacketSpectate;", "onDisconnect", "reason", "Lnet/minecraft/util/text/ITextComponent;", "processChatMessage", "Lnet/minecraft/network/play/client/CPacketChatMessage;", "processClickWindow", "Lnet/minecraft/network/play/client/CPacketClickWindow;", "processClientSettings", "Lnet/minecraft/network/play/client/CPacketClientSettings;", "processClientStatus", "Lnet/minecraft/network/play/client/CPacketClientStatus;", "processCloseWindow", "Lnet/minecraft/network/play/client/CPacketCloseWindow;", "processConfirmTeleport", "Lnet/minecraft/network/play/client/CPacketConfirmTeleport;", "processConfirmTransaction", "Lnet/minecraft/network/play/client/CPacketConfirmTransaction;", "processCreativeInventoryAction", "Lnet/minecraft/network/play/client/CPacketCreativeInventoryAction;", "processCustomPayload", "Lnet/minecraft/network/play/client/CPacketCustomPayload;", "processEnchantItem", "Lnet/minecraft/network/play/client/CPacketEnchantItem;", "processEntityAction", "Lnet/minecraft/network/play/client/CPacketEntityAction;", "processHeldItemChange", "Lnet/minecraft/network/play/client/CPacketHeldItemChange;", "processInput", "Lnet/minecraft/network/play/client/CPacketInput;", "processKeepAlive", "Lnet/minecraft/network/play/client/CPacketKeepAlive;", "processPlayer", "Lnet/minecraft/network/play/client/CPacketPlayer;", "processPlayerAbilities", "Lnet/minecraft/network/play/client/CPacketPlayerAbilities;", "processPlayerDigging", "Lnet/minecraft/network/play/client/CPacketPlayerDigging;", "processSteerBoat", "Lnet/minecraft/network/play/client/CPacketSteerBoat;", "processTabComplete", "Lnet/minecraft/network/play/client/CPacketTabComplete;", "processTryUseItem", "Lnet/minecraft/network/play/client/CPacketPlayerTryUseItem;", "processTryUseItemOnBlock", "Lnet/minecraft/network/play/client/CPacketPlayerTryUseItemOnBlock;", "processUpdateSign", "Lnet/minecraft/network/play/client/CPacketUpdateSign;", "processUseEntity", "Lnet/minecraft/network/play/client/CPacketUseEntity;", "processVehicleMove", "Lnet/minecraft/network/play/client/CPacketVehicleMove;", "Companion", "kisman.cc"})
public interface Class232
extends INetHandlerPlayServer {
    public static final Class2039 Field9015 = Class2039.Field17372;

    public void handle(@NotNull @NotNull Packet var1);

    public void onDisconnect(@NotNull @NotNull ITextComponent var1);

    public void handleAnimation(@NotNull @NotNull CPacketAnimation var1);

    public void processChatMessage(@NotNull @NotNull CPacketChatMessage var1);

    public void processTabComplete(@NotNull @NotNull CPacketTabComplete var1);

    public void processClientStatus(@NotNull @NotNull CPacketClientStatus var1);

    public void processClientSettings(@NotNull @NotNull CPacketClientSettings var1);

    public void processConfirmTransaction(@NotNull @NotNull CPacketConfirmTransaction var1);

    public void processEnchantItem(@NotNull @NotNull CPacketEnchantItem var1);

    public void processClickWindow(@NotNull @NotNull CPacketClickWindow var1);

    public void func_194308_a(@NotNull @NotNull CPacketPlaceRecipe var1);

    public void processCloseWindow(@NotNull @NotNull CPacketCloseWindow var1);

    public void processCustomPayload(@NotNull @NotNull CPacketCustomPayload var1);

    public void processUseEntity(@NotNull @NotNull CPacketUseEntity var1);

    public void processKeepAlive(@NotNull @NotNull CPacketKeepAlive var1);

    public void processPlayer(@NotNull @NotNull CPacketPlayer var1);

    public void processPlayerAbilities(@NotNull @NotNull CPacketPlayerAbilities var1);

    public void processPlayerDigging(@NotNull @NotNull CPacketPlayerDigging var1);

    public void processEntityAction(@NotNull @NotNull CPacketEntityAction var1);

    public void processInput(@NotNull @NotNull CPacketInput var1);

    public void processHeldItemChange(@NotNull @NotNull CPacketHeldItemChange var1);

    public void processCreativeInventoryAction(@NotNull @NotNull CPacketCreativeInventoryAction var1);

    public void processUpdateSign(@NotNull @NotNull CPacketUpdateSign var1);

    public void processTryUseItemOnBlock(@NotNull @NotNull CPacketPlayerTryUseItemOnBlock var1);

    public void processTryUseItem(@NotNull @NotNull CPacketPlayerTryUseItem var1);

    public void handleSpectate(@NotNull @NotNull CPacketSpectate var1);

    public void handleResourcePackStatus(@NotNull @NotNull CPacketResourcePackStatus var1);

    public void processSteerBoat(@NotNull @NotNull CPacketSteerBoat var1);

    public void processVehicleMove(@NotNull @NotNull CPacketVehicleMove var1);

    public void processConfirmTeleport(@NotNull @NotNull CPacketConfirmTeleport var1);

    public void handleRecipeBookUpdate(@NotNull @NotNull CPacketRecipeInfo var1);

    public void handleSeenAdvancements(@NotNull @NotNull CPacketSeenAdvancements var1);
}

