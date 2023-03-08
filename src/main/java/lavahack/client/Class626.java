//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.network.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.text.*;
import net.minecraft.network.play.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3)
public final class Class626
{
    private int Field10678;
    
    public static void Method2691(final Class232 class232, @NotNull @NotNull final Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, "packet");
    }
    
    public static void Method2692(final Class232 class232, @NotNull @NotNull final ITextComponent textComponent) {
        Intrinsics.checkParameterIsNotNull((Object)textComponent, "reason");
        Class232.Field9015.Method7534().info("Quitting: " + textComponent.getUnformattedText());
        if (!Class218.Field8954.Method1252()) {
            Class1340.Method5396("PingBypass Client has disconnected.");
        }
        Class218.Field8954.Method1255(false);
        Class218.Field8954.Method1253(false);
    }
    
    public static void Method2693(final Class232 class232, @NotNull @NotNull final CPacketAnimation cPacketAnimation) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketAnimation, "packet");
        class232.handle((Packet)cPacketAnimation);
    }
    
    public static void Method2694(final Class232 class232, @NotNull @NotNull final CPacketChatMessage cPacketChatMessage) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketChatMessage, "packet");
        class232.handle((Packet)cPacketChatMessage);
    }
    
    public static void Method2695(final Class232 class232, @NotNull @NotNull final CPacketTabComplete cPacketTabComplete) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketTabComplete, "packet");
        class232.handle((Packet)cPacketTabComplete);
    }
    
    public static void Method2696(final Class232 class232, @NotNull @NotNull final CPacketClientStatus cPacketClientStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientStatus, "packet");
        class232.handle((Packet)cPacketClientStatus);
    }
    
    public static void Method2697(final Class232 class232, @NotNull @NotNull final CPacketClientSettings cPacketClientSettings) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClientSettings, "packet");
        class232.handle((Packet)cPacketClientSettings);
    }
    
    public static void Method2698(final Class232 class232, @NotNull @NotNull final CPacketConfirmTransaction cPacketConfirmTransaction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTransaction, "packet");
        class232.handle((Packet)cPacketConfirmTransaction);
    }
    
    public static void Method2699(final Class232 class232, @NotNull @NotNull final CPacketEnchantItem cPacketEnchantItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEnchantItem, "packet");
        class232.handle((Packet)cPacketEnchantItem);
    }
    
    public static void Method2700(final Class232 class232, @NotNull @NotNull final CPacketClickWindow cPacketClickWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketClickWindow, "packet");
        class232.handle((Packet)cPacketClickWindow);
    }
    
    public static void Method2701(final Class232 class232, @NotNull @NotNull final CPacketPlaceRecipe cPacketPlaceRecipe) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlaceRecipe, "packet");
        class232.handle((Packet)cPacketPlaceRecipe);
    }
    
    public static void Method2702(final Class232 class232, @NotNull @NotNull final CPacketCloseWindow cPacketCloseWindow) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCloseWindow, "packet");
        class232.handle((Packet)cPacketCloseWindow);
    }
    
    public static void Method2703(final Class232 class232, @NotNull @NotNull final CPacketCustomPayload cPacketCustomPayload) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCustomPayload, "packet");
        class232.handle((Packet)cPacketCustomPayload);
    }
    
    public static void Method2704(final Class232 class232, @NotNull @NotNull final CPacketUseEntity cPacketUseEntity) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUseEntity, "packet");
        class232.handle((Packet)cPacketUseEntity);
    }
    
    public static void Method2705(final Class232 class232, @NotNull @NotNull final CPacketKeepAlive cPacketKeepAlive) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketKeepAlive, "packet");
        class232.handle((Packet)cPacketKeepAlive);
    }
    
    public static void Method2706(final Class232 class232, @NotNull @NotNull final CPacketPlayer cPacketPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayer, "packet");
        class232.handle((Packet)cPacketPlayer);
    }
    
    public static void Method2707(final Class232 class232, @NotNull @NotNull final CPacketPlayerAbilities cPacketPlayerAbilities) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerAbilities, "packet");
        class232.handle((Packet)cPacketPlayerAbilities);
    }
    
    public static void Method2708(final Class232 class232, @NotNull @NotNull final CPacketPlayerDigging cPacketPlayerDigging) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerDigging, "packet");
        class232.handle((Packet)cPacketPlayerDigging);
    }
    
    public static void Method2709(final Class232 class232, @NotNull @NotNull final CPacketEntityAction cPacketEntityAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketEntityAction, "packet");
        class232.handle((Packet)cPacketEntityAction);
    }
    
    public static void Method2710(final Class232 class232, @NotNull @NotNull final CPacketInput cPacketInput) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketInput, "packet");
        class232.handle((Packet)cPacketInput);
    }
    
    public static void Method2711(final Class232 class232, @NotNull @NotNull final CPacketHeldItemChange cPacketHeldItemChange) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketHeldItemChange, "packet");
        class232.handle((Packet)cPacketHeldItemChange);
    }
    
    public static void Method2712(final Class232 class232, @NotNull @NotNull final CPacketCreativeInventoryAction cPacketCreativeInventoryAction) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketCreativeInventoryAction, "packet");
        class232.handle((Packet)cPacketCreativeInventoryAction);
    }
    
    public static void Method2713(final Class232 class232, @NotNull @NotNull final CPacketUpdateSign cPacketUpdateSign) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketUpdateSign, "packet");
        class232.handle((Packet)cPacketUpdateSign);
    }
    
    public static void Method2714(final Class232 class232, @NotNull @NotNull final CPacketPlayerTryUseItemOnBlock cPacketPlayerTryUseItemOnBlock) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItemOnBlock, "packet");
        class232.handle((Packet)cPacketPlayerTryUseItemOnBlock);
    }
    
    public static void Method2715(final Class232 class232, @NotNull @NotNull final CPacketPlayerTryUseItem cPacketPlayerTryUseItem) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayerTryUseItem, "packet");
        class232.handle((Packet)cPacketPlayerTryUseItem);
    }
    
    public static void Method2716(final Class232 class232, @NotNull @NotNull final CPacketSpectate cPacketSpectate) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSpectate, "packet");
        class232.handle((Packet)cPacketSpectate);
    }
    
    public static void Method2717(final Class232 class232, @NotNull @NotNull final CPacketResourcePackStatus cPacketResourcePackStatus) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketResourcePackStatus, "packet");
        class232.handle((Packet)cPacketResourcePackStatus);
    }
    
    public static void Method2718(final Class232 class232, @NotNull @NotNull final CPacketSteerBoat cPacketSteerBoat) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSteerBoat, "packet");
        class232.handle((Packet)cPacketSteerBoat);
    }
    
    public static void Method2719(final Class232 class232, @NotNull @NotNull final CPacketVehicleMove cPacketVehicleMove) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketVehicleMove, "packet");
        class232.handle((Packet)cPacketVehicleMove);
    }
    
    public static void Method2720(final Class232 class232, @NotNull @NotNull final CPacketConfirmTeleport cPacketConfirmTeleport) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketConfirmTeleport, "packet");
        class232.handle((Packet)cPacketConfirmTeleport);
    }
    
    public static void Method2721(final Class232 class232, @NotNull @NotNull final CPacketRecipeInfo cPacketRecipeInfo) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketRecipeInfo, "packet");
        class232.handle((Packet)cPacketRecipeInfo);
    }
    
    public static void Method2722(final Class232 class232, @NotNull @NotNull final CPacketSeenAdvancements cPacketSeenAdvancements) {
        Intrinsics.checkParameterIsNotNull((Object)cPacketSeenAdvancements, "packet");
        class232.handle((Packet)cPacketSeenAdvancements);
    }
    
    private static String Method2723(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x38DC ^ 0xF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
