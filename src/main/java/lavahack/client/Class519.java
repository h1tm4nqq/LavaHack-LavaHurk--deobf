//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.player.*;
import baritone.api.event.events.*;
import net.minecraftforge.common.*;
import net.minecraft.client.entity.*;
import baritone.api.*;
import baritone.api.event.listener.*;
import net.minecraft.util.math.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.util.*;
import net.minecraft.block.material.*;
import net.minecraft.world.*;
import net.minecraft.item.*;
import net.minecraft.block.state.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0006\u0010\u0006\u001a\u00020\u0001?\u0006\u0007" }, d2 = { "error", "", "text", "", "leftClick", "middleClick", "rightClick", "kisman.cc" })
public final class Class519
{
    private int Field10204;
    
    public static final void Method2383() {
        if (Class2142.Field17803.leftClickCounter <= 0 || Class731.Field11106.Method35()) {
            if (Class2142.Field17803.objectMouseOver == null) {
                Method2386("Null returned as 'hitResult', this shouldn't happen!");
                final PlayerControllerMP playerController = Class2142.Field17803.playerController;
                Intrinsics.checkExpressionValueIsNotNull((Object)playerController, "mc.playerController");
                if (playerController.isNotCreative()) {
                    Class2142.Field17803.leftClickCounter = 10;
                }
            }
            else {
                final EntityPlayerSP player = Class2142.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                if (!player.isRowingBoat()) {
                    final RayTraceResult$Type typeOfHit = Class2142.Field17803.objectMouseOver.typeOfHit;
                    if (typeOfHit == null) {
                        Intrinsics.throwNpe();
                    }
                    switch (Class443.Field9847[typeOfHit.ordinal()]) {
                        case 1: {
                            Class2142.Field17803.playerController.attackEntity((EntityPlayer)Class2142.Field17803.player, Class2142.Field17803.objectMouseOver.entityHit);
                            break;
                        }
                        case 2: {
                            final IBaritoneProvider provider = BaritoneAPI.getProvider();
                            Intrinsics.checkExpressionValueIsNotNull((Object)provider, "BaritoneAPI.getProvider()");
                            final IBaritone primaryBaritone = provider.getPrimaryBaritone();
                            Intrinsics.checkExpressionValueIsNotNull((Object)primaryBaritone, "BaritoneAPI.getProvider().primaryBaritone");
                            final IEventBus gameEventHandler = primaryBaritone.getGameEventHandler();
                            final RayTraceResult objectMouseOver = Class2142.Field17803.objectMouseOver;
                            Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver, "mc.objectMouseOver");
                            gameEventHandler.onBlockInteract(new BlockInteractEvent(objectMouseOver.getBlockPos(), BlockInteractEvent$Type.START_BREAK));
                            final WorldClient world = Class2142.Field17803.world;
                            final RayTraceResult objectMouseOver2 = Class2142.Field17803.objectMouseOver;
                            Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver2, "mc.objectMouseOver");
                            if (!world.isAirBlock(objectMouseOver2.getBlockPos())) {
                                final PlayerControllerMP playerController2 = Class2142.Field17803.playerController;
                                final RayTraceResult objectMouseOver3 = Class2142.Field17803.objectMouseOver;
                                Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver3, "mc.objectMouseOver");
                                playerController2.clickBlock(objectMouseOver3.getBlockPos(), Class2142.Field17803.objectMouseOver.sideHit);
                                break;
                            }
                            break;
                        }
                        case 3: {
                            final PlayerControllerMP playerController3 = Class2142.Field17803.playerController;
                            Intrinsics.checkExpressionValueIsNotNull((Object)playerController3, "mc.playerController");
                            if (playerController3.isNotCreative()) {
                                Class2142.Field17803.leftClickCounter = 10;
                            }
                            Class2142.Field17803.player.resetCooldown();
                            ForgeHooks.onEmptyLeftClick((EntityPlayer)Class2142.Field17803.player);
                            break;
                        }
                    }
                    Class2142.Field17803.player.swingArm(EnumHand.MAIN_HAND);
                }
            }
        }
    }
    
    public static final void Method2384() {
        if (!Class2142.Field17803.playerController.getIsHittingBlock()) {
            Class2142.Field17803.rightClickDelayTimer = 4;
            final EntityPlayerSP player = Class2142.Field17803.player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            if (!player.isRowingBoat()) {
                if (Class2142.Field17803.objectMouseOver == null) {
                    Method2386("Null returned as 'hitResult', this shouldn't happen!");
                }
                for (final EnumHand enumHand : EnumHand.values()) {
                    final ItemStack getHeldItem = Class2142.Field17803.player.getHeldItem(enumHand);
                    if (Class2142.Field17803.objectMouseOver != null) {
                        final RayTraceResult$Type typeOfHit = Class2142.Field17803.objectMouseOver.typeOfHit;
                        if (typeOfHit == null) {
                            Intrinsics.throwNpe();
                        }
                        switch (Class443.Field9848[typeOfHit.ordinal()]) {
                            case 1: {
                                if (Class2142.Field17803.playerController.interactWithEntity((EntityPlayer)Class2142.Field17803.player, Class2142.Field17803.objectMouseOver.entityHit, Class2142.Field17803.objectMouseOver, enumHand) == EnumActionResult.SUCCESS) {
                                    return;
                                }
                                if (Class2142.Field17803.playerController.interactWithEntity((EntityPlayer)Class2142.Field17803.player, Class2142.Field17803.objectMouseOver.entityHit, enumHand) == EnumActionResult.SUCCESS) {
                                    return;
                                }
                                break;
                            }
                            case 2: {
                                final WorldClient world = Class2142.Field17803.world;
                                final RayTraceResult objectMouseOver = Class2142.Field17803.objectMouseOver;
                                Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver, "mc.objectMouseOver");
                                final IBlockState getBlockState = world.getBlockState(objectMouseOver.getBlockPos());
                                Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(m\u2026objectMouseOver.blockPos)");
                                if (getBlockState.getMaterial() == Material.AIR) {
                                    break;
                                }
                                final ItemStack itemStack = getHeldItem;
                                Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, "itemstack");
                                final int getCount = itemStack.getCount();
                                final PlayerControllerMP playerController = Class2142.Field17803.playerController;
                                final EntityPlayerSP player2 = Class2142.Field17803.player;
                                final WorldClient world2 = Class2142.Field17803.world;
                                final RayTraceResult objectMouseOver2 = Class2142.Field17803.objectMouseOver;
                                Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver2, "mc.objectMouseOver");
                                if (playerController.processRightClickBlock(player2, world2, objectMouseOver2.getBlockPos(), Class2142.Field17803.objectMouseOver.sideHit, Class2142.Field17803.objectMouseOver.hitVec, enumHand) == EnumActionResult.SUCCESS) {
                                    Class2142.Field17803.player.swingArm(enumHand);
                                    if (!getHeldItem.isEmpty()) {
                                        if (getHeldItem.getCount() == getCount) {
                                            final PlayerControllerMP playerController2 = Class2142.Field17803.playerController;
                                            Intrinsics.checkExpressionValueIsNotNull((Object)playerController2, "mc.playerController");
                                            if (!playerController2.isInCreativeMode()) {
                                                return;
                                            }
                                        }
                                        Class2142.Field17803.entityRenderer.itemRenderer.resetEquippedProgress(enumHand);
                                    }
                                    return;
                                }
                                break;
                            }
                        }
                    }
                    if (getHeldItem.isEmpty() && (Class2142.Field17803.objectMouseOver == null || Class2142.Field17803.objectMouseOver.typeOfHit == RayTraceResult$Type.MISS)) {
                        ForgeHooks.onEmptyClick((EntityPlayer)Class2142.Field17803.player, enumHand);
                    }
                    if (!getHeldItem.isEmpty() && Class2142.Field17803.playerController.processRightClick((EntityPlayer)Class2142.Field17803.player, (World)Class2142.Field17803.world, enumHand) == EnumActionResult.SUCCESS) {
                        Class2142.Field17803.entityRenderer.itemRenderer.resetEquippedProgress(enumHand);
                        return;
                    }
                }
            }
        }
    }
    
    public static final void Method2385() {
        if (Class2142.Field17803.objectMouseOver != null && Class2142.Field17803.objectMouseOver.typeOfHit != RayTraceResult$Type.MISS) {
            ForgeHooks.onPickBlock(Class2142.Field17803.objectMouseOver, (EntityPlayer)Class2142.Field17803.player, (World)Class2142.Field17803.world);
        }
    }
    
    private static final void Method2386(final String s) {
        Class1796.Field16243.error(s);
    }
    
    private static String Method2387(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x76A5 ^ 0xA8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
