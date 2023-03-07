//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
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
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ;
import lavahack.client.myVBgvqMM56TBmRqiljjSwV5NSQMObyg;
import lavahack.client.xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG;
import net.minecraft.network.Packet;
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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
public final class NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    private int Field10678;

    public static void Method2691(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
    }

    public static void Method2692(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull ITextComponent iTextComponent) {
        Intrinsics.checkParameterIsNotNull((Object)iTextComponent, (String)"reason");
        NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.Field9015.Method7534().info("Quitting: " + iTextComponent.getUnformattedText());
        if (!xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1252()) {
            myVBgvqMM56TBmRqiljjSwV5NSQMObyg.Method5396("PingBypass Client has disconnected.");
        }
        xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1255((boolean)((long)-1732302363 ^ (long)-1732302363));
        xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1253((boolean)((long)365980605 ^ (long)365980605));
    }

    public static void Method2693(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketAnimation cPacketAnimation) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketAnimation, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketAnimation);
    }

    public static void Method2694(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketChatMessage cPacketChatMessage) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketChatMessage, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketChatMessage);
    }

    public static void Method2695(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketTabComplete cPacketTabComplete) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketTabComplete, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketTabComplete);
    }

    public static void Method2696(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketClientStatus cPacketClientStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientStatus, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketClientStatus);
    }

    public static void Method2697(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketClientSettings cPacketClientSettings) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientSettings, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketClientSettings);
    }

    public static void Method2698(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketConfirmTransaction cPacketConfirmTransaction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTransaction, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketConfirmTransaction);
    }

    public static void Method2699(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketEnchantItem cPacketEnchantItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEnchantItem, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketEnchantItem);
    }

    public static void Method2700(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketClickWindow cPacketClickWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClickWindow, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketClickWindow);
    }

    public static void Method2701(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketPlaceRecipe cPacketPlaceRecipe) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlaceRecipe, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketPlaceRecipe);
    }

    public static void Method2702(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketCloseWindow cPacketCloseWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCloseWindow, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketCloseWindow);
    }

    public static void Method2703(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketCustomPayload cPacketCustomPayload) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCustomPayload, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketCustomPayload);
    }

    public static void Method2704(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketUseEntity cPacketUseEntity) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUseEntity, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketUseEntity);
    }

    public static void Method2705(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketKeepAlive cPacketKeepAlive) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketKeepAlive, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketKeepAlive);
    }

    public static void Method2706(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketPlayer cPacketPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayer, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketPlayer);
    }

    public static void Method2707(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketPlayerAbilities cPacketPlayerAbilities) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerAbilities, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketPlayerAbilities);
    }

    public static void Method2708(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketPlayerDigging cPacketPlayerDigging) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerDigging, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketPlayerDigging);
    }

    public static void Method2709(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketEntityAction cPacketEntityAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEntityAction, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketEntityAction);
    }

    public static void Method2710(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketInput cPacketInput) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketInput, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketInput);
    }

    public static void Method2711(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketHeldItemChange cPacketHeldItemChange) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketHeldItemChange, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketHeldItemChange);
    }

    public static void Method2712(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketCreativeInventoryAction cPacketCreativeInventoryAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCreativeInventoryAction, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketCreativeInventoryAction);
    }

    public static void Method2713(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketUpdateSign cPacketUpdateSign) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUpdateSign, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketUpdateSign);
    }

    public static void Method2714(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketPlayerTryUseItemOnBlock cPacketPlayerTryUseItemOnBlock) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItemOnBlock, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketPlayerTryUseItemOnBlock);
    }

    public static void Method2715(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketPlayerTryUseItem cPacketPlayerTryUseItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItem, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketPlayerTryUseItem);
    }

    public static void Method2716(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketSpectate cPacketSpectate) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSpectate, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketSpectate);
    }

    public static void Method2717(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketResourcePackStatus cPacketResourcePackStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketResourcePackStatus, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketResourcePackStatus);
    }

    public static void Method2718(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketSteerBoat cPacketSteerBoat) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSteerBoat, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketSteerBoat);
    }

    public static void Method2719(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketVehicleMove cPacketVehicleMove) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketVehicleMove, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketVehicleMove);
    }

    public static void Method2720(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketConfirmTeleport cPacketConfirmTeleport) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTeleport, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketConfirmTeleport);
    }

    public static void Method2721(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketRecipeInfo cPacketRecipeInfo) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketRecipeInfo, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketRecipeInfo);
    }

    public static void Method2722(NOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ, @NotNull @NotNull CPacketSeenAdvancements cPacketSeenAdvancements) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSeenAdvancements, (String)"packet");
        nOpZBw6i2rktXmqv4a9ebTMCtK7GxXhQ.handle((Packet)cPacketSeenAdvancements);
    }

    private static String Method2723(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-860669460L ^ 0xCCB339EC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1274959157L ^ 0x4BFE55CA);
            int n2 = (int)((long)1605364135 ^ (long)1605364136);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-358597070 ^ (long)-358600699) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

