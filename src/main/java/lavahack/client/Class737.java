//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.network.*;
import com.kisman.cc.util.*;
import net.minecraft.network.play.server.*;
import net.minecraft.network.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.text.*;
import net.minecraft.network.play.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004?\u0006\u0002\u0010\u0005J\u0014\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\"" }, d2 = { "Lcom/kisman/cc/pingbypass/server/nethandler/PingBypassNetHandler;", "Lcom/kisman/cc/pingbypass/server/nethandler/BaseNetHandler;", "Lcom/kisman/cc/pingbypass/server/nethandler/IPingBypassNetHandler;", "manager", "Lnet/minecraft/network/NetworkManager;", "(Lnet/minecraft/network/NetworkManager;)V", "factory", "Lcom/kisman/cc/pingbypass/server/protocol/ProtocolFactoryImpl;", "handle", "", "packet", "Lnet/minecraft/network/Packet;", "processClickWindow", "Lnet/minecraft/network/play/client/CPacketClickWindow;", "processCloseWindow", "Lnet/minecraft/network/play/client/CPacketCloseWindow;", "processCustomPayload", "Lnet/minecraft/network/play/client/CPacketCustomPayload;", "processEntityAction", "Lnet/minecraft/network/play/client/CPacketEntityAction;", "processHeldItemChange", "Lnet/minecraft/network/play/client/CPacketHeldItemChange;", "processInput", "Lnet/minecraft/network/play/client/CPacketInput;", "processKeepAlive", "Lnet/minecraft/network/play/client/CPacketKeepAlive;", "processPlayer", "Lnet/minecraft/network/play/client/CPacketPlayer;", "processPlayerDigging", "Lnet/minecraft/network/play/client/CPacketPlayerDigging;", "send", "client", "Lnet/minecraft/client/network/NetHandlerPlayClient;", "Companion", "kisman.cc" })
public final class Class737 extends Class1658 implements Class232
{
    private final Class932 Field11117;
    public static final Class522 Field11118;
    private String Field11119 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void handle(@NotNull @NotNull final Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, "packet");
        Class2142.Field17803.addScheduledTask((Runnable)new Class1871(this, packet));
    }
    
    private final void Method3062(final Packet packet, final NetHandlerPlayClient netHandlerPlayClient) {
        Class275.Field9212.Method1465(packet);
        netHandlerPlayClient.sendPacket(packet);
    }
    
    public void processClickWindow(@NotNull @NotNull final CPacketClickWindow cPacketClickWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClickWindow, "packet");
        Class626.Method2700((Class232)this, cPacketClickWindow);
    }
    
    public void processCloseWindow(@NotNull @NotNull final CPacketCloseWindow cPacketCloseWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCloseWindow, "packet");
        this.handle((Packet)cPacketCloseWindow);
        Class2142.Field17803.addScheduledTask((Runnable)Class1050.Field12646);
    }
    
    public void processCustomPayload(@NotNull @NotNull final CPacketCustomPayload cPacketCustomPayload) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCustomPayload, "packet");
        if (Intrinsics.areEqual((Object)"PingBypass", (Object)cPacketCustomPayload.getChannelName())) {
            final Class932 field11117 = this.Field11117;
            final PacketBuffer getBufferData = cPacketCustomPayload.getBufferData();
            Intrinsics.checkExpressionValueIsNotNull((Object)getBufferData, "packet.bufferData");
            field11117.Method2598(getBufferData, this.getManager());
        }
        else {
            this.handle((Packet)cPacketCustomPayload);
        }
    }
    
    public void processKeepAlive(@NotNull @NotNull final CPacketKeepAlive cPacketKeepAlive) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketKeepAlive, "packet");
        this.getTimer().Method2801();
        this.getManager().sendPacket((Packet)new SPacketKeepAlive((long)Class886.Method3700()));
    }
    
    public void processPlayer(@NotNull @NotNull final CPacketPlayer cPacketPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayer, "packet");
        this.getTimer().Method2801();
        Class2142.Field17803.addScheduledTask((Runnable)new Class2096(this, cPacketPlayer));
    }
    
    public void processPlayerDigging(@NotNull @NotNull final CPacketPlayerDigging cPacketPlayerDigging) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerDigging, "packet");
        Class626.Method2708((Class232)this, cPacketPlayerDigging);
    }
    
    public void processEntityAction(@NotNull @NotNull final CPacketEntityAction cPacketEntityAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEntityAction, "packet");
        Class2142.Field17803.addScheduledTask((Runnable)new Class687(cPacketEntityAction));
        this.handle((Packet)cPacketEntityAction);
    }
    
    public void processInput(@NotNull @NotNull final CPacketInput cPacketInput) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketInput, "packet");
        Class2142.Field17803.addScheduledTask((Runnable)Class829.Field11528);
    }
    
    public void processHeldItemChange(@NotNull @NotNull final CPacketHeldItemChange cPacketHeldItemChange) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketHeldItemChange, "packet");
        this.handle((Packet)cPacketHeldItemChange);
        Class2142.Field17803.addScheduledTask((Runnable)new Class2090(cPacketHeldItemChange));
    }
    
    public Class737(@NotNull @NotNull final NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, "manager");
        super(networkManager, 30000L);
        this.Field11117 = new Class932();
    }
    
    static {
        Field11118 = new Class522((DefaultConstructorMarker)null);
    }
    
    public void onDisconnect(@NotNull @NotNull final ITextComponent textComponent) {
        Intrinsics.checkParameterIsNotNull((Object)textComponent, "reason");
        Class626.Method2692((Class232)this, textComponent);
    }
    
    public void handleAnimation(@NotNull @NotNull final CPacketAnimation cPacketAnimation) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketAnimation, "packet");
        Class626.Method2693((Class232)this, cPacketAnimation);
    }
    
    public void processChatMessage(@NotNull @NotNull final CPacketChatMessage cPacketChatMessage) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketChatMessage, "packet");
        Class626.Method2694((Class232)this, cPacketChatMessage);
    }
    
    public void processTabComplete(@NotNull @NotNull final CPacketTabComplete cPacketTabComplete) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketTabComplete, "packet");
        Class626.Method2695((Class232)this, cPacketTabComplete);
    }
    
    public void processClientStatus(@NotNull @NotNull final CPacketClientStatus cPacketClientStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientStatus, "packet");
        Class626.Method2696((Class232)this, cPacketClientStatus);
    }
    
    public void processClientSettings(@NotNull @NotNull final CPacketClientSettings cPacketClientSettings) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientSettings, "packet");
        Class626.Method2697((Class232)this, cPacketClientSettings);
    }
    
    public void processConfirmTransaction(@NotNull @NotNull final CPacketConfirmTransaction cPacketConfirmTransaction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTransaction, "packet");
        Class626.Method2698((Class232)this, cPacketConfirmTransaction);
    }
    
    public void processEnchantItem(@NotNull @NotNull final CPacketEnchantItem cPacketEnchantItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEnchantItem, "packet");
        Class626.Method2699((Class232)this, cPacketEnchantItem);
    }
    
    public void func_194308_a(@NotNull @NotNull final CPacketPlaceRecipe cPacketPlaceRecipe) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlaceRecipe, "packet");
        Class626.Method2701((Class232)this, cPacketPlaceRecipe);
    }
    
    public void processUseEntity(@NotNull @NotNull final CPacketUseEntity cPacketUseEntity) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUseEntity, "packet");
        Class626.Method2704((Class232)this, cPacketUseEntity);
    }
    
    public void processPlayerAbilities(@NotNull @NotNull final CPacketPlayerAbilities cPacketPlayerAbilities) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerAbilities, "packet");
        Class626.Method2707((Class232)this, cPacketPlayerAbilities);
    }
    
    public void processCreativeInventoryAction(@NotNull @NotNull final CPacketCreativeInventoryAction cPacketCreativeInventoryAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCreativeInventoryAction, "packet");
        Class626.Method2712((Class232)this, cPacketCreativeInventoryAction);
    }
    
    public void processUpdateSign(@NotNull @NotNull final CPacketUpdateSign cPacketUpdateSign) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUpdateSign, "packet");
        Class626.Method2713((Class232)this, cPacketUpdateSign);
    }
    
    public void processTryUseItemOnBlock(@NotNull @NotNull final CPacketPlayerTryUseItemOnBlock cPacketPlayerTryUseItemOnBlock) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItemOnBlock, "packet");
        Class626.Method2714((Class232)this, cPacketPlayerTryUseItemOnBlock);
    }
    
    public void processTryUseItem(@NotNull @NotNull final CPacketPlayerTryUseItem cPacketPlayerTryUseItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItem, "packet");
        Class626.Method2715((Class232)this, cPacketPlayerTryUseItem);
    }
    
    public void handleSpectate(@NotNull @NotNull final CPacketSpectate cPacketSpectate) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSpectate, "packet");
        Class626.Method2716((Class232)this, cPacketSpectate);
    }
    
    public void handleResourcePackStatus(@NotNull @NotNull final CPacketResourcePackStatus cPacketResourcePackStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketResourcePackStatus, "packet");
        Class626.Method2717((Class232)this, cPacketResourcePackStatus);
    }
    
    public void processSteerBoat(@NotNull @NotNull final CPacketSteerBoat cPacketSteerBoat) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSteerBoat, "packet");
        Class626.Method2718((Class232)this, cPacketSteerBoat);
    }
    
    public void processVehicleMove(@NotNull @NotNull final CPacketVehicleMove cPacketVehicleMove) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketVehicleMove, "packet");
        Class626.Method2719((Class232)this, cPacketVehicleMove);
    }
    
    public void processConfirmTeleport(@NotNull @NotNull final CPacketConfirmTeleport cPacketConfirmTeleport) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTeleport, "packet");
        Class626.Method2720((Class232)this, cPacketConfirmTeleport);
    }
    
    public void handleRecipeBookUpdate(@NotNull @NotNull final CPacketRecipeInfo cPacketRecipeInfo) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketRecipeInfo, "packet");
        Class626.Method2721((Class232)this, cPacketRecipeInfo);
    }
    
    public void handleSeenAdvancements(@NotNull @NotNull final CPacketSeenAdvancements cPacketSeenAdvancements) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSeenAdvancements, "packet");
        Class626.Method2722((Class232)this, cPacketSeenAdvancements);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6DFF ^ 0xF8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
