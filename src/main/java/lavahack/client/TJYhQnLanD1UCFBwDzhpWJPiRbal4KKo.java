//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.network.NetHandlerPlayClient
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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ;
import lavahack.client.NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import lavahack.client.TmOPym6tdKb9sCSEqlHetKWFnNqangKd;
import lavahack.client.Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4;
import lavahack.client.nsTNVxglJUlYpMYh0ZtA62wP57yhdiso;
import net.minecraft.client.network.NetHandlerPlayClient;
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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2={"Lcom/kisman/cc/pingbypass/server/nethandler/PingBypassNetHandler;", "Lcom/kisman/cc/pingbypass/server/nethandler/BaseNetHandler;", "Lcom/kisman/cc/pingbypass/server/nethandler/IPingBypassNetHandler;", "manager", "Lnet/minecraft/network/NetworkManager;", "(Lnet/minecraft/network/NetworkManager;)V", "factory", "Lcom/kisman/cc/pingbypass/server/protocol/ProtocolFactoryImpl;", "handle", "", "packet", "Lnet/minecraft/network/Packet;", "processClickWindow", "Lnet/minecraft/network/play/client/CPacketClickWindow;", "processCloseWindow", "Lnet/minecraft/network/play/client/CPacketCloseWindow;", "processCustomPayload", "Lnet/minecraft/network/play/client/CPacketCustomPayload;", "processEntityAction", "Lnet/minecraft/network/play/client/CPacketEntityAction;", "processHeldItemChange", "Lnet/minecraft/network/play/client/CPacketHeldItemChange;", "processInput", "Lnet/minecraft/network/play/client/CPacketInput;", "processKeepAlive", "Lnet/minecraft/network/play/client/CPacketKeepAlive;", "processPlayer", "Lnet/minecraft/network/play/client/CPacketPlayer;", "processPlayerDigging", "Lnet/minecraft/network/play/client/CPacketPlayerDigging;", "send", "client", "Lnet/minecraft/client/network/NetHandlerPlayClient;", "Companion", "kisman.cc"})
public final class TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo
extends nsTNVxglJUlYpMYh0ZtA62wP57yhdiso
implements NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ {
    private final TmOPym6tdKb9sCSEqlHetKWFnNqangKd Field11117;
    public static final TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11118 = new TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    private String Field11119 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void handle(@NotNull @NotNull Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.addScheduledTask((Runnable)new TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this, packet));
    }

    private final void Method3062(Packet packet, NetHandlerPlayClient netHandlerPlayClient) {
        Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4.Field9212.Method1465(packet);
        netHandlerPlayClient.sendPacket(packet);
    }

    @Override
    public void processClickWindow(@NotNull @NotNull CPacketClickWindow cPacketClickWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClickWindow, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2700(this, cPacketClickWindow);
    }

    @Override
    public void processCloseWindow(@NotNull @NotNull CPacketCloseWindow cPacketCloseWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCloseWindow, (String)"packet");
        this.handle((Packet)cPacketCloseWindow);
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.addScheduledTask((Runnable)TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field12646);
    }

    @Override
    public void processCustomPayload(@NotNull @NotNull CPacketCustomPayload cPacketCustomPayload) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCustomPayload, (String)"packet");
        if (Intrinsics.areEqual((Object)"PingBypass", (Object)cPacketCustomPayload.getChannelName())) {
            PacketBuffer packetBuffer = cPacketCustomPayload.getBufferData();
            Intrinsics.checkExpressionValueIsNotNull((Object)packetBuffer, (String)"packet.bufferData");
            this.Field11117.Method2598(packetBuffer, this.getManager());
            return;
        }
        this.handle((Packet)cPacketCustomPayload);
    }

    @Override
    public void processKeepAlive(@NotNull @NotNull CPacketKeepAlive cPacketKeepAlive) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketKeepAlive, (String)"packet");
        this.getTimer().Method2801();
        this.getManager().sendPacket((Packet)new SPacketKeepAlive((long)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3700()));
    }

    @Override
    public void processPlayer(@NotNull @NotNull CPacketPlayer cPacketPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayer, (String)"packet");
        this.getTimer().Method2801();
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.addScheduledTask((Runnable)new TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi(this, cPacketPlayer));
    }

    @Override
    public void processPlayerDigging(@NotNull @NotNull CPacketPlayerDigging cPacketPlayerDigging) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerDigging, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2708(this, cPacketPlayerDigging);
    }

    @Override
    public void processEntityAction(@NotNull @NotNull CPacketEntityAction cPacketEntityAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEntityAction, (String)"packet");
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.addScheduledTask((Runnable)new TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(cPacketEntityAction));
        this.handle((Packet)cPacketEntityAction);
    }

    @Override
    public void processInput(@NotNull @NotNull CPacketInput cPacketInput) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketInput, (String)"packet");
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.addScheduledTask((Runnable)TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field11528);
    }

    @Override
    public void processHeldItemChange(@NotNull @NotNull CPacketHeldItemChange cPacketHeldItemChange) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketHeldItemChange, (String)"packet");
        this.handle((Packet)cPacketHeldItemChange);
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.addScheduledTask((Runnable)new TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(cPacketHeldItemChange));
    }

    public TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo(@NotNull @NotNull NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, (String)"manager");
        super(networkManager, 0x13237533L & 0x807574L);
        this.Field11117 = new TmOPym6tdKb9sCSEqlHetKWFnNqangKd();
    }

    @Override
    public void onDisconnect(@NotNull @NotNull ITextComponent iTextComponent) {
        Intrinsics.checkParameterIsNotNull((Object)iTextComponent, (String)"reason");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2692(this, iTextComponent);
    }

    @Override
    public void handleAnimation(@NotNull @NotNull CPacketAnimation cPacketAnimation) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketAnimation, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2693(this, cPacketAnimation);
    }

    @Override
    public void processChatMessage(@NotNull @NotNull CPacketChatMessage cPacketChatMessage) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketChatMessage, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2694(this, cPacketChatMessage);
    }

    @Override
    public void processTabComplete(@NotNull @NotNull CPacketTabComplete cPacketTabComplete) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketTabComplete, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2695(this, cPacketTabComplete);
    }

    @Override
    public void processClientStatus(@NotNull @NotNull CPacketClientStatus cPacketClientStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientStatus, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2696(this, cPacketClientStatus);
    }

    @Override
    public void processClientSettings(@NotNull @NotNull CPacketClientSettings cPacketClientSettings) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientSettings, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2697(this, cPacketClientSettings);
    }

    @Override
    public void processConfirmTransaction(@NotNull @NotNull CPacketConfirmTransaction cPacketConfirmTransaction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTransaction, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2698(this, cPacketConfirmTransaction);
    }

    @Override
    public void processEnchantItem(@NotNull @NotNull CPacketEnchantItem cPacketEnchantItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEnchantItem, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2699(this, cPacketEnchantItem);
    }

    @Override
    public void func_194308_a(@NotNull @NotNull CPacketPlaceRecipe cPacketPlaceRecipe) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlaceRecipe, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2701(this, cPacketPlaceRecipe);
    }

    @Override
    public void processUseEntity(@NotNull @NotNull CPacketUseEntity cPacketUseEntity) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUseEntity, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2704(this, cPacketUseEntity);
    }

    @Override
    public void processPlayerAbilities(@NotNull @NotNull CPacketPlayerAbilities cPacketPlayerAbilities) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerAbilities, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2707(this, cPacketPlayerAbilities);
    }

    @Override
    public void processCreativeInventoryAction(@NotNull @NotNull CPacketCreativeInventoryAction cPacketCreativeInventoryAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCreativeInventoryAction, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2712(this, cPacketCreativeInventoryAction);
    }

    @Override
    public void processUpdateSign(@NotNull @NotNull CPacketUpdateSign cPacketUpdateSign) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUpdateSign, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2713(this, cPacketUpdateSign);
    }

    @Override
    public void processTryUseItemOnBlock(@NotNull @NotNull CPacketPlayerTryUseItemOnBlock cPacketPlayerTryUseItemOnBlock) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItemOnBlock, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2714(this, cPacketPlayerTryUseItemOnBlock);
    }

    @Override
    public void processTryUseItem(@NotNull @NotNull CPacketPlayerTryUseItem cPacketPlayerTryUseItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItem, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2715(this, cPacketPlayerTryUseItem);
    }

    @Override
    public void handleSpectate(@NotNull @NotNull CPacketSpectate cPacketSpectate) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSpectate, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2716(this, cPacketSpectate);
    }

    @Override
    public void handleResourcePackStatus(@NotNull @NotNull CPacketResourcePackStatus cPacketResourcePackStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketResourcePackStatus, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2717(this, cPacketResourcePackStatus);
    }

    @Override
    public void processSteerBoat(@NotNull @NotNull CPacketSteerBoat cPacketSteerBoat) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSteerBoat, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2718(this, cPacketSteerBoat);
    }

    @Override
    public void processVehicleMove(@NotNull @NotNull CPacketVehicleMove cPacketVehicleMove) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketVehicleMove, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2719(this, cPacketVehicleMove);
    }

    @Override
    public void processConfirmTeleport(@NotNull @NotNull CPacketConfirmTeleport cPacketConfirmTeleport) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTeleport, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2720(this, cPacketConfirmTeleport);
    }

    @Override
    public void handleRecipeBookUpdate(@NotNull @NotNull CPacketRecipeInfo cPacketRecipeInfo) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketRecipeInfo, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2721(this, cPacketRecipeInfo);
    }

    @Override
    public void handleSeenAdvancements(@NotNull @NotNull CPacketSeenAdvancements cPacketSeenAdvancements) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSeenAdvancements, (String)"packet");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2722(this, cPacketSeenAdvancements);
    }

    public static final /* bridge */ /* synthetic */ void Method3063(TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo tJYhQnLanD1UCFBwDzhpWJPiRbal4KKo, Packet packet, NetHandlerPlayClient netHandlerPlayClient) {
        tJYhQnLanD1UCFBwDzhpWJPiRbal4KKo.Method3062(packet, netHandlerPlayClient);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-749911063L ^ 0xD34D43E9;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)754666364L ^ 0x2CFB4B83);
            int n2 = (int)((long)1137753701 ^ (long)1137753722) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2086723746 ^ (long)-2086702431) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

