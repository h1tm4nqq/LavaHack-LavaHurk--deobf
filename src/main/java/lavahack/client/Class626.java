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
import lavahack.client.Class1340;
import lavahack.client.Class218;
import lavahack.client.Class232;
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
public final class Class626 {
    private int Field10678;

    public static void Method2691(Class232 class232, @NotNull @NotNull Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
    }

    public static void Method2692(Class232 class232, @NotNull @NotNull ITextComponent iTextComponent) {
        Intrinsics.checkParameterIsNotNull((Object)iTextComponent, (String)"reason");
        Class232.Field9015.Method7534().info("Quitting: " + iTextComponent.getUnformattedText());
        if (!Class218.Field8954.Method1252()) {
            Class1340.Method5396("PingBypass Client has disconnected.");
        }
        Class218.Field8954.Method1255(false);
        Class218.Field8954.Method1253(false);
    }

    public static void Method2693(Class232 class232, @NotNull @NotNull CPacketAnimation cPacketAnimation) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketAnimation, (String)"packet");
        class232.handle((Packet)cPacketAnimation);
    }

    public static void Method2694(Class232 class232, @NotNull @NotNull CPacketChatMessage cPacketChatMessage) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketChatMessage, (String)"packet");
        class232.handle((Packet)cPacketChatMessage);
    }

    public static void Method2695(Class232 class232, @NotNull @NotNull CPacketTabComplete cPacketTabComplete) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketTabComplete, (String)"packet");
        class232.handle((Packet)cPacketTabComplete);
    }

    public static void Method2696(Class232 class232, @NotNull @NotNull CPacketClientStatus cPacketClientStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientStatus, (String)"packet");
        class232.handle((Packet)cPacketClientStatus);
    }

    public static void Method2697(Class232 class232, @NotNull @NotNull CPacketClientSettings cPacketClientSettings) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientSettings, (String)"packet");
        class232.handle((Packet)cPacketClientSettings);
    }

    public static void Method2698(Class232 class232, @NotNull @NotNull CPacketConfirmTransaction cPacketConfirmTransaction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTransaction, (String)"packet");
        class232.handle((Packet)cPacketConfirmTransaction);
    }

    public static void Method2699(Class232 class232, @NotNull @NotNull CPacketEnchantItem cPacketEnchantItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEnchantItem, (String)"packet");
        class232.handle((Packet)cPacketEnchantItem);
    }

    public static void Method2700(Class232 class232, @NotNull @NotNull CPacketClickWindow cPacketClickWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClickWindow, (String)"packet");
        class232.handle((Packet)cPacketClickWindow);
    }

    public static void Method2701(Class232 class232, @NotNull @NotNull CPacketPlaceRecipe cPacketPlaceRecipe) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlaceRecipe, (String)"packet");
        class232.handle((Packet)cPacketPlaceRecipe);
    }

    public static void Method2702(Class232 class232, @NotNull @NotNull CPacketCloseWindow cPacketCloseWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCloseWindow, (String)"packet");
        class232.handle((Packet)cPacketCloseWindow);
    }

    public static void Method2703(Class232 class232, @NotNull @NotNull CPacketCustomPayload cPacketCustomPayload) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCustomPayload, (String)"packet");
        class232.handle((Packet)cPacketCustomPayload);
    }

    public static void Method2704(Class232 class232, @NotNull @NotNull CPacketUseEntity cPacketUseEntity) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUseEntity, (String)"packet");
        class232.handle((Packet)cPacketUseEntity);
    }

    public static void Method2705(Class232 class232, @NotNull @NotNull CPacketKeepAlive cPacketKeepAlive) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketKeepAlive, (String)"packet");
        class232.handle((Packet)cPacketKeepAlive);
    }

    public static void Method2706(Class232 class232, @NotNull @NotNull CPacketPlayer cPacketPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayer, (String)"packet");
        class232.handle((Packet)cPacketPlayer);
    }

    public static void Method2707(Class232 class232, @NotNull @NotNull CPacketPlayerAbilities cPacketPlayerAbilities) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerAbilities, (String)"packet");
        class232.handle((Packet)cPacketPlayerAbilities);
    }

    public static void Method2708(Class232 class232, @NotNull @NotNull CPacketPlayerDigging cPacketPlayerDigging) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerDigging, (String)"packet");
        class232.handle((Packet)cPacketPlayerDigging);
    }

    public static void Method2709(Class232 class232, @NotNull @NotNull CPacketEntityAction cPacketEntityAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEntityAction, (String)"packet");
        class232.handle((Packet)cPacketEntityAction);
    }

    public static void Method2710(Class232 class232, @NotNull @NotNull CPacketInput cPacketInput) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketInput, (String)"packet");
        class232.handle((Packet)cPacketInput);
    }

    public static void Method2711(Class232 class232, @NotNull @NotNull CPacketHeldItemChange cPacketHeldItemChange) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketHeldItemChange, (String)"packet");
        class232.handle((Packet)cPacketHeldItemChange);
    }

    public static void Method2712(Class232 class232, @NotNull @NotNull CPacketCreativeInventoryAction cPacketCreativeInventoryAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCreativeInventoryAction, (String)"packet");
        class232.handle((Packet)cPacketCreativeInventoryAction);
    }

    public static void Method2713(Class232 class232, @NotNull @NotNull CPacketUpdateSign cPacketUpdateSign) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUpdateSign, (String)"packet");
        class232.handle((Packet)cPacketUpdateSign);
    }

    public static void Method2714(Class232 class232, @NotNull @NotNull CPacketPlayerTryUseItemOnBlock cPacketPlayerTryUseItemOnBlock) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItemOnBlock, (String)"packet");
        class232.handle((Packet)cPacketPlayerTryUseItemOnBlock);
    }

    public static void Method2715(Class232 class232, @NotNull @NotNull CPacketPlayerTryUseItem cPacketPlayerTryUseItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItem, (String)"packet");
        class232.handle((Packet)cPacketPlayerTryUseItem);
    }

    public static void Method2716(Class232 class232, @NotNull @NotNull CPacketSpectate cPacketSpectate) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSpectate, (String)"packet");
        class232.handle((Packet)cPacketSpectate);
    }

    public static void Method2717(Class232 class232, @NotNull @NotNull CPacketResourcePackStatus cPacketResourcePackStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketResourcePackStatus, (String)"packet");
        class232.handle((Packet)cPacketResourcePackStatus);
    }

    public static void Method2718(Class232 class232, @NotNull @NotNull CPacketSteerBoat cPacketSteerBoat) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSteerBoat, (String)"packet");
        class232.handle((Packet)cPacketSteerBoat);
    }

    public static void Method2719(Class232 class232, @NotNull @NotNull CPacketVehicleMove cPacketVehicleMove) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketVehicleMove, (String)"packet");
        class232.handle((Packet)cPacketVehicleMove);
    }

    public static void Method2720(Class232 class232, @NotNull @NotNull CPacketConfirmTeleport cPacketConfirmTeleport) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTeleport, (String)"packet");
        class232.handle((Packet)cPacketConfirmTeleport);
    }

    public static void Method2721(Class232 class232, @NotNull @NotNull CPacketRecipeInfo cPacketRecipeInfo) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketRecipeInfo, (String)"packet");
        class232.handle((Packet)cPacketRecipeInfo);
    }

    public static void Method2722(Class232 class232, @NotNull @NotNull CPacketSeenAdvancements cPacketSeenAdvancements) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSeenAdvancements, (String)"packet");
        class232.handle((Packet)cPacketSeenAdvancements);
    }

    private static String Method2723(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 15;
            cArray2[n] = (char)(cArray[n] ^ (0x38DC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

