//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.world.World
 *  net.minecraftforge.common.ForgeHooks
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import lavahack.client.Class1263;
import lavahack.client.Class1303;
import lavahack.client.Class1796;
import lavahack.client.Class1996;
import lavahack.client.Class202;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class449;
import lavahack.client.Class794;
import lavahack.client.Class97;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import org.lwjgl.input.Keyboard;

@Class794
public class Class1022
extends Class42 {
    private static final Class449 Field12436 = Class449.Field9868;
    private final Class1303 Field12437 = new Class1303("Switch", (Class42)this, Class1263.Field13712).Method5303();
    private final Class1996 Field12438 = this.Method24(new Class1996(new Class44("Slot 1", this)));
    private final Class44 Field12439 = this.Method23(this.Field12438.Method7405(new Class44("Slot1Active", (Class42)this, true).Method355("Active")));
    private final Class44 Field12440 = this.Method23(this.Field12438.Method7405(new Class44("Slot1Mode", (Class42)this, Field12436)).Method355("Mode"));
    private final Class44 Field12441 = this.Method23(this.Field12438.Method7405(new Class44("Slot1Key", (Class42)this, 0).Method355("Keybind")));
    private final Class1996 Field12442 = this.Method24(new Class1996(new Class44("Slot 2", this)));
    private final Class44 Field12443 = this.Method23(this.Field12442.Method7405(new Class44("Slot1Active", (Class42)this, true).Method355("Active")));
    private final Class44 Field12444 = this.Method23(this.Field12442.Method7405(new Class44("Slot1Mode", (Class42)this, Field12436)).Method355("Mode"));
    private final Class44 Field12445 = this.Method23(this.Field12442.Method7405(new Class44("Slot1Key", (Class42)this, 0).Method355("Keybind")));
    private final Class1996 Field12446 = this.Method24(new Class1996(new Class44("Slot 3", this)));
    private final Class44 Field12447 = this.Method23(this.Field12446.Method7405(new Class44("Slot1Active", (Class42)this, true).Method355("Active")));
    private final Class44 Field12448 = this.Method23(this.Field12446.Method7405(new Class44("Slot1Mode", (Class42)this, Field12436)).Method355("Mode"));
    private final Class44 Field12449 = this.Method23(this.Field12446.Method7405(new Class44("Slot1Key", (Class42)this, 0).Method355("Keybind")));
    private final Class1996 Field12450 = this.Method24(new Class1996(new Class44("Slot 4", this)));
    private final Class44 Field12451 = this.Method23(this.Field12450.Method7405(new Class44("Slot1Active", (Class42)this, true).Method355("Active")));
    private final Class44 Field12452 = this.Method23(this.Field12450.Method7405(new Class44("Slot1Mode", (Class42)this, Field12436)).Method355("Mode"));
    private final Class44 Field12453 = this.Method23(this.Field12450.Method7405(new Class44("Slot1Key", (Class42)this, 0).Method355("Keybind")));
    private final Class1996 Field12454 = this.Method24(new Class1996(new Class44("Slot 5", this)));
    private final Class44 Field12455 = this.Method23(this.Field12454.Method7405(new Class44("Slot1Active", (Class42)this, true).Method355("Active")));
    private final Class44 Field12456 = this.Method23(this.Field12454.Method7405(new Class44("Slot1Mode", (Class42)this, Field12436)).Method355("Mode"));
    private final Class44 Field12457 = this.Method23(this.Field12454.Method7405(new Class44("Slot1Key", (Class42)this, 0).Method355("Keybind")));
    private final Class1996 Field12458 = this.Method24(new Class1996(new Class44("Slot 6", this)));
    private final Class44 Field12459 = this.Method23(this.Field12458.Method7405(new Class44("Slot1Active", (Class42)this, true).Method355("Active")));
    private final Class44 Field12460 = this.Method23(this.Field12458.Method7405(new Class44("Slot1Mode", (Class42)this, Field12436)).Method355("Mode"));
    private final Class44 Field12461 = this.Method23(this.Field12458.Method7405(new Class44("Slot1Key", (Class42)this, 0).Method355("Keybind")));
    private final Class1996 Field12462 = this.Method24(new Class1996(new Class44("Slot 7", this)));
    private final Class44 Field12463 = this.Method23(this.Field12462.Method7405(new Class44("Slot1Active", (Class42)this, true).Method355("Active")));
    private final Class44 Field12464 = this.Method23(this.Field12462.Method7405(new Class44("Slot1Mode", (Class42)this, Field12436)).Method355("Mode"));
    private final Class44 Field12465 = this.Method23(this.Field12462.Method7405(new Class44("Slot1Key", (Class42)this, 0).Method355("Keybind")));
    private final Class1996 Field12466 = this.Method24(new Class1996(new Class44("Slot 8", this)));
    private final Class44 Field12467 = this.Method23(this.Field12466.Method7405(new Class44("Slot1Active", (Class42)this, true).Method355("Active")));
    private final Class44 Field12468 = this.Method23(this.Field12466.Method7405(new Class44("Slot1Mode", (Class42)this, Field12436)).Method355("Mode"));
    private final Class44 Field12469 = this.Method23(this.Field12466.Method7405(new Class44("Slot1Key", (Class42)this, 0).Method355("Keybind")));
    private final Class1996 Field12470 = this.Method24(new Class1996(new Class44("Slot 9", this)));
    private final Class44 Field12471 = this.Method23(this.Field12470.Method7405(new Class44("Slot1Active", (Class42)this, true).Method355("Active")));
    private final Class44 Field12472 = this.Method23(this.Field12470.Method7405(new Class44("Slot1Mode", (Class42)this, Field12436)).Method355("Mode"));
    private final Class44 Field12473 = this.Method23(this.Field12470.Method7405(new Class44("Slot1Key", (Class42)this, 0).Method355("Keybind")));
    private int Field12474;

    public Class1022() {
        super("Octopus", Class97.Field8341);
    }

    @Override
    public void Method45() {
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field12439.Method365() && Keyboard.isKeyDown((int)this.Field12441.Method337())) {
            this.Method4140((Class449)this.Field12440.Method341(), 1);
        }
        if (this.Field12443.Method365() && Keyboard.isKeyDown((int)this.Field12445.Method337())) {
            this.Method4140((Class449)this.Field12444.Method341(), 2);
        }
        if (this.Field12447.Method365() && Keyboard.isKeyDown((int)this.Field12449.Method337())) {
            this.Method4140((Class449)this.Field12448.Method341(), 3);
        }
        if (this.Field12451.Method365() && Keyboard.isKeyDown((int)this.Field12453.Method337())) {
            this.Method4140((Class449)this.Field12452.Method341(), 4);
        }
        if (this.Field12455.Method365() && Keyboard.isKeyDown((int)this.Field12457.Method337())) {
            this.Method4140((Class449)this.Field12456.Method341(), 5);
        }
        if (this.Field12459.Method365() && Keyboard.isKeyDown((int)this.Field12461.Method337())) {
            this.Method4140((Class449)this.Field12460.Method341(), 6);
        }
        if (this.Field12463.Method365() && Keyboard.isKeyDown((int)this.Field12465.Method337())) {
            this.Method4140((Class449)this.Field12464.Method341(), 7);
        }
        if (this.Field12467.Method365() && Keyboard.isKeyDown((int)this.Field12469.Method337())) {
            this.Method4140((Class449)this.Field12468.Method341(), 8);
        }
        if (!this.Field12471.Method365()) return;
        if (!Keyboard.isKeyDown((int)this.Field12473.Method337())) return;
        this.Method4140((Class449)this.Field12472.Method341(), 9);
    }

    private void Method4140(Class449 class449, int n) {
        int n2 = Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
        if (class449 == Class449.Field9868) {
            this.Method20();
        } else if (class449 == Class449.Field9869) {
            this.Method4141();
        } else {
            this.Method4142();
        }
        if (this.Field12437.Method341() != Class1263.Field13713) return;
        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
    }

    private void Method20() {
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.leftClickCounter > 0) return;
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver == null) {
            Class1796.Field16243.error("Null returned as 'hitResult', this shouldn't happen!");
            if (!Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.isNotCreative()) return;
            Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.leftClickCounter = 10;
            return;
        }
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRowingBoat()) return;
        switch (Class202.Field8881[Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.typeOfHit.ordinal()]) {
            case 1: {
                Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.attackEntity((EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit);
                break;
            }
            case 2: {
                BlockPos blockPos = Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos();
                if (!Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.isAirBlock(blockPos)) {
                    Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.clickBlock(blockPos, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.sideHit);
                    break;
                }
            }
            case 3: {
                if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.isNotCreative()) {
                    Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.leftClickCounter = 10;
                }
                Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.resetCooldown();
                ForgeHooks.onEmptyLeftClick((EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                break;
            }
        }
        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
    }

    private void Method4141() {
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.getIsHittingBlock()) return;
        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.rightClickDelayTimer = 4;
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRowingBoat()) return;
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver == null) {
            Class1796.Field16243.warn("Null returned as 'hitResult', this shouldn't happen!");
        }
        EnumHand[] enumHandArray = EnumHand.values();
        int n = enumHandArray.length;
        int n2 = 0;
        while (n2 < n) {
            EnumHand enumHand = enumHandArray[n2];
            ItemStack itemStack = Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItem(enumHand);
            if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver != null) {
                switch (Class202.Field8881[Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.typeOfHit.ordinal()]) {
                    case 1: {
                        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.interactWithEntity((EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver, enumHand) == EnumActionResult.SUCCESS) {
                            return;
                        }
                        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.interactWithEntity((EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit, enumHand) != EnumActionResult.SUCCESS) break;
                        return;
                    }
                    case 2: {
                        BlockPos blockPos = Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos();
                        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial() == Material.AIR) break;
                        int n3 = itemStack.getCount();
                        EnumActionResult enumActionResult = Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.sideHit, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.hitVec, enumHand);
                        if (enumActionResult != EnumActionResult.SUCCESS) break;
                        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(enumHand);
                        if (itemStack.isEmpty()) return;
                        if (itemStack.getCount() == n3) {
                            if (!Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.isInCreativeMode()) return;
                        }
                        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.itemRenderer.resetEquippedProgress(enumHand);
                        return;
                    }
                }
            }
            if (itemStack.isEmpty() && (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver == null || Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.typeOfHit == RayTraceResult.Type.MISS)) {
                ForgeHooks.onEmptyClick((EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (EnumHand)enumHand);
            }
            if (!itemStack.isEmpty() && Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClick((EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (World)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, enumHand) == EnumActionResult.SUCCESS) {
                Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.itemRenderer.resetEquippedProgress(enumHand);
                return;
            }
            ++n2;
        }
    }

    private void Method4142() {
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver == null) return;
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.typeOfHit == RayTraceResult.Type.MISS) return;
        ForgeHooks.onPickBlock((RayTraceResult)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver, (EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (World)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 166;
            cArray2[n] = (char)(cArray[n] ^ (0x7951 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

