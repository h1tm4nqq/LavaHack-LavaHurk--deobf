//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.IBaritoneProvider
 *  baritone.api.event.events.BlockInteractEvent
 *  baritone.api.event.events.BlockInteractEvent$Type
 *  baritone.api.event.listener.IEventBus
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.world.World
 *  net.minecraftforge.common.ForgeHooks
 */
package lavahack.client;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.IBaritoneProvider;
import baritone.api.event.events.BlockInteractEvent;
import baritone.api.event.listener.IEventBus;
import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1796;
import lavahack.client.Class443;
import lavahack.client.Class731;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0006\u0010\u0006\u001a\u00020\u0001\u00a8\u0006\u0007"}, d2={"error", "", "text", "", "leftClick", "middleClick", "rightClick", "kisman.cc"})
public final class Class519 {
    private int Field10204;

    public static final void Method2383() {
        if (Class2142.Field17803.leftClickCounter > 0) {
            if (!Class731.Field11106.Method35()) return;
        }
        if (Class2142.Field17803.objectMouseOver == null) {
            Class519.Method2386("Null returned as 'hitResult', this shouldn't happen!");
            PlayerControllerMP playerControllerMP = Class2142.Field17803.playerController;
            Intrinsics.checkExpressionValueIsNotNull((Object)playerControllerMP, (String)"mc.playerController");
            if (!playerControllerMP.isNotCreative()) return;
            Class2142.Field17803.leftClickCounter = 10;
            return;
        }
        EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.isRowingBoat()) return;
        RayTraceResult.Type type = Class2142.Field17803.objectMouseOver.typeOfHit;
        if (type == null) {
            Intrinsics.throwNpe();
        }
        switch (Class443.Field9847[type.ordinal()]) {
            case 1: {
                Class2142.Field17803.playerController.attackEntity((EntityPlayer)Class2142.Field17803.player, Class2142.Field17803.objectMouseOver.entityHit);
                break;
            }
            case 2: {
                IBaritoneProvider iBaritoneProvider = BaritoneAPI.getProvider();
                Intrinsics.checkExpressionValueIsNotNull((Object)iBaritoneProvider, (String)"BaritoneAPI.getProvider()");
                IBaritone iBaritone = iBaritoneProvider.getPrimaryBaritone();
                Intrinsics.checkExpressionValueIsNotNull((Object)iBaritone, (String)"BaritoneAPI.getProvider().primaryBaritone");
                IEventBus iEventBus = iBaritone.getGameEventHandler();
                RayTraceResult rayTraceResult = Class2142.Field17803.objectMouseOver;
                Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult, (String)"mc.objectMouseOver");
                iEventBus.onBlockInteract(new BlockInteractEvent(rayTraceResult.getBlockPos(), BlockInteractEvent.Type.START_BREAK));
                WorldClient worldClient = Class2142.Field17803.world;
                RayTraceResult rayTraceResult2 = Class2142.Field17803.objectMouseOver;
                Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult2, (String)"mc.objectMouseOver");
                if (worldClient.isAirBlock(rayTraceResult2.getBlockPos())) break;
                PlayerControllerMP playerControllerMP = Class2142.Field17803.playerController;
                RayTraceResult rayTraceResult3 = Class2142.Field17803.objectMouseOver;
                Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult3, (String)"mc.objectMouseOver");
                playerControllerMP.clickBlock(rayTraceResult3.getBlockPos(), Class2142.Field17803.objectMouseOver.sideHit);
                break;
            }
            case 3: {
                PlayerControllerMP playerControllerMP = Class2142.Field17803.playerController;
                Intrinsics.checkExpressionValueIsNotNull((Object)playerControllerMP, (String)"mc.playerController");
                if (playerControllerMP.isNotCreative()) {
                    Class2142.Field17803.leftClickCounter = 10;
                }
                Class2142.Field17803.player.resetCooldown();
                ForgeHooks.onEmptyLeftClick((EntityPlayer)((EntityPlayer)Class2142.Field17803.player));
                break;
            }
        }
        Class2142.Field17803.player.swingArm(EnumHand.MAIN_HAND);
    }

    public static final void Method2384() {
        if (Class2142.Field17803.playerController.getIsHittingBlock()) return;
        Class2142.Field17803.rightClickDelayTimer = 4;
        EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.isRowingBoat()) return;
        if (Class2142.Field17803.objectMouseOver == null) {
            Class519.Method2386("Null returned as 'hitResult', this shouldn't happen!");
        }
        EnumHand[] enumHandArray = EnumHand.values();
        int n = enumHandArray.length;
        int n2 = 0;
        while (n2 < n) {
            EnumHand enumHand = enumHandArray[n2];
            ItemStack itemStack = Class2142.Field17803.player.getHeldItem(enumHand);
            if (Class2142.Field17803.objectMouseOver != null) {
                RayTraceResult.Type type = Class2142.Field17803.objectMouseOver.typeOfHit;
                if (type == null) {
                    Intrinsics.throwNpe();
                }
                switch (Class443.Field9848[type.ordinal()]) {
                    case 1: {
                        if (Class2142.Field17803.playerController.interactWithEntity((EntityPlayer)Class2142.Field17803.player, Class2142.Field17803.objectMouseOver.entityHit, Class2142.Field17803.objectMouseOver, enumHand) == EnumActionResult.SUCCESS) {
                            return;
                        }
                        if (Class2142.Field17803.playerController.interactWithEntity((EntityPlayer)Class2142.Field17803.player, Class2142.Field17803.objectMouseOver.entityHit, enumHand) != EnumActionResult.SUCCESS) break;
                        return;
                    }
                    case 2: {
                        WorldClient worldClient = Class2142.Field17803.world;
                        RayTraceResult rayTraceResult = Class2142.Field17803.objectMouseOver;
                        Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult, (String)"mc.objectMouseOver");
                        IBlockState iBlockState = worldClient.getBlockState(rayTraceResult.getBlockPos());
                        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(m\u2026objectMouseOver.blockPos)");
                        if (iBlockState.getMaterial() == Material.AIR) break;
                        ItemStack itemStack2 = itemStack;
                        Intrinsics.checkExpressionValueIsNotNull((Object)itemStack2, (String)"itemstack");
                        int n3 = itemStack2.getCount();
                        PlayerControllerMP playerControllerMP = Class2142.Field17803.playerController;
                        EntityPlayerSP entityPlayerSP2 = Class2142.Field17803.player;
                        WorldClient worldClient2 = Class2142.Field17803.world;
                        RayTraceResult rayTraceResult2 = Class2142.Field17803.objectMouseOver;
                        Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult2, (String)"mc.objectMouseOver");
                        EnumActionResult enumActionResult = playerControllerMP.processRightClickBlock(entityPlayerSP2, worldClient2, rayTraceResult2.getBlockPos(), Class2142.Field17803.objectMouseOver.sideHit, Class2142.Field17803.objectMouseOver.hitVec, enumHand);
                        if (enumActionResult != EnumActionResult.SUCCESS) break;
                        Class2142.Field17803.player.swingArm(enumHand);
                        if (itemStack.isEmpty()) return;
                        if (itemStack.getCount() == n3) {
                            PlayerControllerMP playerControllerMP2 = Class2142.Field17803.playerController;
                            Intrinsics.checkExpressionValueIsNotNull((Object)playerControllerMP2, (String)"mc.playerController");
                            if (!playerControllerMP2.isInCreativeMode()) return;
                        }
                        Class2142.Field17803.entityRenderer.itemRenderer.resetEquippedProgress(enumHand);
                        return;
                    }
                }
            }
            if (itemStack.isEmpty() && (Class2142.Field17803.objectMouseOver == null || Class2142.Field17803.objectMouseOver.typeOfHit == RayTraceResult.Type.MISS)) {
                ForgeHooks.onEmptyClick((EntityPlayer)((EntityPlayer)Class2142.Field17803.player), (EnumHand)enumHand);
            }
            if (!itemStack.isEmpty() && Class2142.Field17803.playerController.processRightClick((EntityPlayer)Class2142.Field17803.player, (World)Class2142.Field17803.world, enumHand) == EnumActionResult.SUCCESS) {
                Class2142.Field17803.entityRenderer.itemRenderer.resetEquippedProgress(enumHand);
                return;
            }
            ++n2;
        }
    }

    public static final void Method2385() {
        if (Class2142.Field17803.objectMouseOver == null) return;
        if (Class2142.Field17803.objectMouseOver.typeOfHit == RayTraceResult.Type.MISS) return;
        ForgeHooks.onPickBlock((RayTraceResult)Class2142.Field17803.objectMouseOver, (EntityPlayer)((EntityPlayer)Class2142.Field17803.player), (World)((World)Class2142.Field17803.world));
    }

    private static final void Method2386(String string) {
        Class1796.Field16243.error(string);
    }

    private static String Method2387(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 168;
            cArray2[n] = (char)(cArray[n] ^ (0x76A5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

