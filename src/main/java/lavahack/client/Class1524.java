//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.server.*;
import net.minecraft.network.*;
import net.minecraft.util.text.*;
import net.minecraft.network.play.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004?\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0010" }, d2 = { "Lcom/kisman/cc/pingbypass/server/nethandler/WaitingForJoinHandler;", "Lcom/kisman/cc/pingbypass/server/nethandler/BaseNetHandler;", "Lcom/kisman/cc/pingbypass/server/nethandler/IPingBypassNetHandler;", "manager", "Lnet/minecraft/network/NetworkManager;", "(Lnet/minecraft/network/NetworkManager;)V", "factory", "Lcom/kisman/cc/pingbypass/server/protocol/ProtocolFactoryImpl;", "processChatMessage", "", "packet", "Lnet/minecraft/network/play/client/CPacketChatMessage;", "processCustomPayload", "Lnet/minecraft/network/play/client/CPacketCustomPayload;", "processKeepAlive", "Lnet/minecraft/network/play/client/CPacketKeepAlive;", "kisman.cc" })
public final class Class1524 extends Class1658 implements Class232
{
    private final Class932 Field15121;
    private String Field15122 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void processCustomPayload(@NotNull @NotNull final CPacketCustomPayload cPacketCustomPayload) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCustomPayload, "packet");
        if (Intrinsics.areEqual((Object)"PingBypass", (Object)cPacketCustomPayload.getChannelName())) {
            final Class932 field15121 = this.Field15121;
            final PacketBuffer getBufferData = cPacketCustomPayload.getBufferData();
            Intrinsics.checkExpressionValueIsNotNull((Object)getBufferData, "packet.bufferData");
            field15121.Method2598(getBufferData, this.getManager());
        }
    }
    
    @Override
    public void processChatMessage(@NotNull @NotNull final CPacketChatMessage cPacketChatMessage) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketChatMessage, "packet");
    }
    
    @Override
    public void processKeepAlive(@NotNull @NotNull final CPacketKeepAlive cPacketKeepAlive) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketKeepAlive, "packet");
        this.getTimer().Method2801();
        this.getManager().sendPacket((Packet)new SPacketKeepAlive(0L));
    }
    
    public Class1524(@NotNull @NotNull final NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, "manager");
        super(networkManager, 100000L);
        this.Field15121 = new Class932();
    }
    
    @Override
    public void handle(@NotNull @NotNull final Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, "packet");
        Class626.Method2691(this, packet);
    }
    
    @Override
    public void onDisconnect(@NotNull @NotNull final ITextComponent textComponent) {
        Intrinsics.checkParameterIsNotNull((Object)textComponent, "reason");
        Class626.Method2692(this, textComponent);
    }
    
    @Override
    public void handleAnimation(@NotNull @NotNull final CPacketAnimation cPacketAnimation) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketAnimation, "packet");
        Class626.Method2693(this, cPacketAnimation);
    }
    
    @Override
    public void processTabComplete(@NotNull @NotNull final CPacketTabComplete cPacketTabComplete) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketTabComplete, "packet");
        Class626.Method2695(this, cPacketTabComplete);
    }
    
    @Override
    public void processClientStatus(@NotNull @NotNull final CPacketClientStatus cPacketClientStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientStatus, "packet");
        Class626.Method2696(this, cPacketClientStatus);
    }
    
    @Override
    public void processClientSettings(@NotNull @NotNull final CPacketClientSettings cPacketClientSettings) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientSettings, "packet");
        Class626.Method2697(this, cPacketClientSettings);
    }
    
    @Override
    public void processConfirmTransaction(@NotNull @NotNull final CPacketConfirmTransaction cPacketConfirmTransaction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTransaction, "packet");
        Class626.Method2698(this, cPacketConfirmTransaction);
    }
    
    @Override
    public void processEnchantItem(@NotNull @NotNull final CPacketEnchantItem cPacketEnchantItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEnchantItem, "packet");
        Class626.Method2699(this, cPacketEnchantItem);
    }
    
    @Override
    public void processClickWindow(@NotNull @NotNull final CPacketClickWindow cPacketClickWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClickWindow, "packet");
        Class626.Method2700(this, cPacketClickWindow);
    }
    
    @Override
    public void func_194308_a(@NotNull @NotNull final CPacketPlaceRecipe cPacketPlaceRecipe) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlaceRecipe, "packet");
        Class626.Method2701(this, cPacketPlaceRecipe);
    }
    
    @Override
    public void processCloseWindow(@NotNull @NotNull final CPacketCloseWindow cPacketCloseWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCloseWindow, "packet");
        Class626.Method2702(this, cPacketCloseWindow);
    }
    
    @Override
    public void processUseEntity(@NotNull @NotNull final CPacketUseEntity cPacketUseEntity) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUseEntity, "packet");
        Class626.Method2704(this, cPacketUseEntity);
    }
    
    @Override
    public void processPlayer(@NotNull @NotNull final CPacketPlayer cPacketPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayer, "packet");
        Class626.Method2706(this, cPacketPlayer);
    }
    
    @Override
    public void processPlayerAbilities(@NotNull @NotNull final CPacketPlayerAbilities cPacketPlayerAbilities) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerAbilities, "packet");
        Class626.Method2707(this, cPacketPlayerAbilities);
    }
    
    @Override
    public void processPlayerDigging(@NotNull @NotNull final CPacketPlayerDigging cPacketPlayerDigging) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerDigging, "packet");
        Class626.Method2708(this, cPacketPlayerDigging);
    }
    
    @Override
    public void processEntityAction(@NotNull @NotNull final CPacketEntityAction cPacketEntityAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEntityAction, "packet");
        Class626.Method2709(this, cPacketEntityAction);
    }
    
    @Override
    public void processInput(@NotNull @NotNull final CPacketInput cPacketInput) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketInput, "packet");
        Class626.Method2710(this, cPacketInput);
    }
    
    @Override
    public void processHeldItemChange(@NotNull @NotNull final CPacketHeldItemChange cPacketHeldItemChange) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketHeldItemChange, "packet");
        Class626.Method2711(this, cPacketHeldItemChange);
    }
    
    @Override
    public void processCreativeInventoryAction(@NotNull @NotNull final CPacketCreativeInventoryAction cPacketCreativeInventoryAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCreativeInventoryAction, "packet");
        Class626.Method2712(this, cPacketCreativeInventoryAction);
    }
    
    @Override
    public void processUpdateSign(@NotNull @NotNull final CPacketUpdateSign cPacketUpdateSign) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUpdateSign, "packet");
        Class626.Method2713(this, cPacketUpdateSign);
    }
    
    @Override
    public void processTryUseItemOnBlock(@NotNull @NotNull final CPacketPlayerTryUseItemOnBlock cPacketPlayerTryUseItemOnBlock) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItemOnBlock, "packet");
        Class626.Method2714(this, cPacketPlayerTryUseItemOnBlock);
    }
    
    @Override
    public void processTryUseItem(@NotNull @NotNull final CPacketPlayerTryUseItem cPacketPlayerTryUseItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItem, "packet");
        Class626.Method2715(this, cPacketPlayerTryUseItem);
    }
    
    @Override
    public void handleSpectate(@NotNull @NotNull final CPacketSpectate cPacketSpectate) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSpectate, "packet");
        Class626.Method2716(this, cPacketSpectate);
    }
    
    @Override
    public void handleResourcePackStatus(@NotNull @NotNull final CPacketResourcePackStatus cPacketResourcePackStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketResourcePackStatus, "packet");
        Class626.Method2717(this, cPacketResourcePackStatus);
    }
    
    @Override
    public void processSteerBoat(@NotNull @NotNull final CPacketSteerBoat cPacketSteerBoat) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSteerBoat, "packet");
        Class626.Method2718(this, cPacketSteerBoat);
    }
    
    @Override
    public void processVehicleMove(@NotNull @NotNull final CPacketVehicleMove cPacketVehicleMove) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketVehicleMove, "packet");
        Class626.Method2719(this, cPacketVehicleMove);
    }
    
    @Override
    public void processConfirmTeleport(@NotNull @NotNull final CPacketConfirmTeleport cPacketConfirmTeleport) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTeleport, "packet");
        Class626.Method2720(this, cPacketConfirmTeleport);
    }
    
    @Override
    public void handleRecipeBookUpdate(@NotNull @NotNull final CPacketRecipeInfo cPacketRecipeInfo) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketRecipeInfo, "packet");
        Class626.Method2721(this, cPacketRecipeInfo);
    }
    
    @Override
    public void handleSeenAdvancements(@NotNull @NotNull final CPacketSeenAdvancements cPacketSeenAdvancements) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSeenAdvancements, "packet");
        Class626.Method2722(this, cPacketSeenAdvancements);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4F90 ^ 0xDF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
