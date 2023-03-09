//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 *  net.minecraft.network.PacketBuffer
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
 *  net.minecraft.network.play.server.SPacketKeepAlive
 *  net.minecraft.util.text.ITextComponent
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1658;
import lavahack.client.Class232;
import lavahack.client.Class626;
import lavahack.client.Class932;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
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
import net.minecraft.network.play.server.SPacketKeepAlive;
import net.minecraft.util.text.ITextComponent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/pingbypass/server/nethandler/WaitingForJoinHandler;", "Lcom/kisman/cc/pingbypass/server/nethandler/BaseNetHandler;", "Lcom/kisman/cc/pingbypass/server/nethandler/IPingBypassNetHandler;", "manager", "Lnet/minecraft/network/NetworkManager;", "(Lnet/minecraft/network/NetworkManager;)V", "factory", "Lcom/kisman/cc/pingbypass/server/protocol/ProtocolFactoryImpl;", "processChatMessage", "", "packet", "Lnet/minecraft/network/play/client/CPacketChatMessage;", "processCustomPayload", "Lnet/minecraft/network/play/client/CPacketCustomPayload;", "processKeepAlive", "Lnet/minecraft/network/play/client/CPacketKeepAlive;", "kisman.cc"})
public final class Class1524
extends Class1658
implements Class232 {
    private final Class932 Field15121;
    private String Field15122 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void processCustomPayload(@NotNull @NotNull CPacketCustomPayload cPacketCustomPayload) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCustomPayload, (String)"packet");
        if (!Intrinsics.areEqual((Object)"PingBypass", (Object)cPacketCustomPayload.getChannelName())) return;
        PacketBuffer packetBuffer = cPacketCustomPayload.getBufferData();
        Intrinsics.checkExpressionValueIsNotNull((Object)packetBuffer, (String)"packet.bufferData");
        this.Field15121.Method2598(packetBuffer, this.getManager());
    }

    @Override
    public void processChatMessage(@NotNull @NotNull CPacketChatMessage cPacketChatMessage) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketChatMessage, (String)"packet");
    }

    @Override
    public void processKeepAlive(@NotNull @NotNull CPacketKeepAlive cPacketKeepAlive) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketKeepAlive, (String)"packet");
        this.getTimer().Method2801();
        this.getManager().sendPacket((Packet)new SPacketKeepAlive(0L));
    }

    public Class1524(@NotNull @NotNull NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, (String)"manager");
        super(networkManager, 100000L);
        this.Field15121 = new Class932();
    }

    @Override
    public void handle(@NotNull @NotNull Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
        Class626.Method2691(this, packet);
    }

    @Override
    public void onDisconnect(@NotNull @NotNull ITextComponent iTextComponent) {
        Intrinsics.checkParameterIsNotNull((Object)iTextComponent, (String)"reason");
        Class626.Method2692(this, iTextComponent);
    }

    @Override
    public void handleAnimation(@NotNull @NotNull CPacketAnimation cPacketAnimation) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketAnimation, (String)"packet");
        Class626.Method2693(this, cPacketAnimation);
    }

    @Override
    public void processTabComplete(@NotNull @NotNull CPacketTabComplete cPacketTabComplete) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketTabComplete, (String)"packet");
        Class626.Method2695(this, cPacketTabComplete);
    }

    @Override
    public void processClientStatus(@NotNull @NotNull CPacketClientStatus cPacketClientStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientStatus, (String)"packet");
        Class626.Method2696(this, cPacketClientStatus);
    }

    @Override
    public void processClientSettings(@NotNull @NotNull CPacketClientSettings cPacketClientSettings) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientSettings, (String)"packet");
        Class626.Method2697(this, cPacketClientSettings);
    }

    @Override
    public void processConfirmTransaction(@NotNull @NotNull CPacketConfirmTransaction cPacketConfirmTransaction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTransaction, (String)"packet");
        Class626.Method2698(this, cPacketConfirmTransaction);
    }

    @Override
    public void processEnchantItem(@NotNull @NotNull CPacketEnchantItem cPacketEnchantItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEnchantItem, (String)"packet");
        Class626.Method2699(this, cPacketEnchantItem);
    }

    @Override
    public void processClickWindow(@NotNull @NotNull CPacketClickWindow cPacketClickWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClickWindow, (String)"packet");
        Class626.Method2700(this, cPacketClickWindow);
    }

    @Override
    public void func_194308_a(@NotNull @NotNull CPacketPlaceRecipe cPacketPlaceRecipe) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlaceRecipe, (String)"packet");
        Class626.Method2701(this, cPacketPlaceRecipe);
    }

    @Override
    public void processCloseWindow(@NotNull @NotNull CPacketCloseWindow cPacketCloseWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCloseWindow, (String)"packet");
        Class626.Method2702(this, cPacketCloseWindow);
    }

    @Override
    public void processUseEntity(@NotNull @NotNull CPacketUseEntity cPacketUseEntity) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUseEntity, (String)"packet");
        Class626.Method2704(this, cPacketUseEntity);
    }

    @Override
    public void processPlayer(@NotNull @NotNull CPacketPlayer cPacketPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayer, (String)"packet");
        Class626.Method2706(this, cPacketPlayer);
    }

    @Override
    public void processPlayerAbilities(@NotNull @NotNull CPacketPlayerAbilities cPacketPlayerAbilities) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerAbilities, (String)"packet");
        Class626.Method2707(this, cPacketPlayerAbilities);
    }

    @Override
    public void processPlayerDigging(@NotNull @NotNull CPacketPlayerDigging cPacketPlayerDigging) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerDigging, (String)"packet");
        Class626.Method2708(this, cPacketPlayerDigging);
    }

    @Override
    public void processEntityAction(@NotNull @NotNull CPacketEntityAction cPacketEntityAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEntityAction, (String)"packet");
        Class626.Method2709(this, cPacketEntityAction);
    }

    @Override
    public void processInput(@NotNull @NotNull CPacketInput cPacketInput) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketInput, (String)"packet");
        Class626.Method2710(this, cPacketInput);
    }

    @Override
    public void processHeldItemChange(@NotNull @NotNull CPacketHeldItemChange cPacketHeldItemChange) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketHeldItemChange, (String)"packet");
        Class626.Method2711(this, cPacketHeldItemChange);
    }

    @Override
    public void processCreativeInventoryAction(@NotNull @NotNull CPacketCreativeInventoryAction cPacketCreativeInventoryAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCreativeInventoryAction, (String)"packet");
        Class626.Method2712(this, cPacketCreativeInventoryAction);
    }

    @Override
    public void processUpdateSign(@NotNull @NotNull CPacketUpdateSign cPacketUpdateSign) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUpdateSign, (String)"packet");
        Class626.Method2713(this, cPacketUpdateSign);
    }

    @Override
    public void processTryUseItemOnBlock(@NotNull @NotNull CPacketPlayerTryUseItemOnBlock cPacketPlayerTryUseItemOnBlock) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItemOnBlock, (String)"packet");
        Class626.Method2714(this, cPacketPlayerTryUseItemOnBlock);
    }

    @Override
    public void processTryUseItem(@NotNull @NotNull CPacketPlayerTryUseItem cPacketPlayerTryUseItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItem, (String)"packet");
        Class626.Method2715(this, cPacketPlayerTryUseItem);
    }

    @Override
    public void handleSpectate(@NotNull @NotNull CPacketSpectate cPacketSpectate) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSpectate, (String)"packet");
        Class626.Method2716(this, cPacketSpectate);
    }

    @Override
    public void handleResourcePackStatus(@NotNull @NotNull CPacketResourcePackStatus cPacketResourcePackStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketResourcePackStatus, (String)"packet");
        Class626.Method2717(this, cPacketResourcePackStatus);
    }

    @Override
    public void processSteerBoat(@NotNull @NotNull CPacketSteerBoat cPacketSteerBoat) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSteerBoat, (String)"packet");
        Class626.Method2718(this, cPacketSteerBoat);
    }

    @Override
    public void processVehicleMove(@NotNull @NotNull CPacketVehicleMove cPacketVehicleMove) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketVehicleMove, (String)"packet");
        Class626.Method2719(this, cPacketVehicleMove);
    }

    @Override
    public void processConfirmTeleport(@NotNull @NotNull CPacketConfirmTeleport cPacketConfirmTeleport) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTeleport, (String)"packet");
        Class626.Method2720(this, cPacketConfirmTeleport);
    }

    @Override
    public void handleRecipeBookUpdate(@NotNull @NotNull CPacketRecipeInfo cPacketRecipeInfo) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketRecipeInfo, (String)"packet");
        Class626.Method2721(this, cPacketRecipeInfo);
    }

    @Override
    public void handleSeenAdvancements(@NotNull @NotNull CPacketSeenAdvancements cPacketSeenAdvancements) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSeenAdvancements, (String)"packet");
        Class626.Method2722(this, cPacketSeenAdvancements);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 223;
            cArray2[n] = (char)(cArray[n] ^ (0x4F90 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

