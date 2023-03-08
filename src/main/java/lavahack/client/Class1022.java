//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.input.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.common.*;
import net.minecraft.util.*;
import net.minecraft.block.material.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraft.item.*;

@Class794
public class Class1022 extends Class42
{
    private static final Class449 Field12436;
    private final Class1303 Field12437;
    private final Class1996 Field12438;
    private final Class44 Field12439;
    private final Class44 Field12440;
    private final Class44 Field12441;
    private final Class1996 Field12442;
    private final Class44 Field12443;
    private final Class44 Field12444;
    private final Class44 Field12445;
    private final Class1996 Field12446;
    private final Class44 Field12447;
    private final Class44 Field12448;
    private final Class44 Field12449;
    private final Class1996 Field12450;
    private final Class44 Field12451;
    private final Class44 Field12452;
    private final Class44 Field12453;
    private final Class1996 Field12454;
    private final Class44 Field12455;
    private final Class44 Field12456;
    private final Class44 Field12457;
    private final Class1996 Field12458;
    private final Class44 Field12459;
    private final Class44 Field12460;
    private final Class44 Field12461;
    private final Class1996 Field12462;
    private final Class44 Field12463;
    private final Class44 Field12464;
    private final Class44 Field12465;
    private final Class1996 Field12466;
    private final Class44 Field12467;
    private final Class44 Field12468;
    private final Class44 Field12469;
    private final Class1996 Field12470;
    private final Class44 Field12471;
    private final Class44 Field12472;
    private final Class44 Field12473;
    private int Field12474;
    
    public Class1022() {
        super("Octopus", Class97.Field8341);
        this.Field12437 = new Class1303("Switch", this, Class1263.Field13712).Method5303();
        this.Field12438 = this.Method24(new Class1996(new Class44("Slot 1", this)));
        this.Field12439 = this.Method23(this.Field12438.Method7405(new Class44("Slot1Active", this, true).Method355("Active")));
        this.Field12440 = this.Method23(this.Field12438.Method7405(new Class44("Slot1Mode", this, Class1022.Field12436)).Method355("Mode"));
        this.Field12441 = this.Method23(this.Field12438.Method7405(new Class44("Slot1Key", this, 0).Method355("Keybind")));
        this.Field12442 = this.Method24(new Class1996(new Class44("Slot 2", this)));
        this.Field12443 = this.Method23(this.Field12442.Method7405(new Class44("Slot1Active", this, true).Method355("Active")));
        this.Field12444 = this.Method23(this.Field12442.Method7405(new Class44("Slot1Mode", this, Class1022.Field12436)).Method355("Mode"));
        this.Field12445 = this.Method23(this.Field12442.Method7405(new Class44("Slot1Key", this, 0).Method355("Keybind")));
        this.Field12446 = this.Method24(new Class1996(new Class44("Slot 3", this)));
        this.Field12447 = this.Method23(this.Field12446.Method7405(new Class44("Slot1Active", this, true).Method355("Active")));
        this.Field12448 = this.Method23(this.Field12446.Method7405(new Class44("Slot1Mode", this, Class1022.Field12436)).Method355("Mode"));
        this.Field12449 = this.Method23(this.Field12446.Method7405(new Class44("Slot1Key", this, 0).Method355("Keybind")));
        this.Field12450 = this.Method24(new Class1996(new Class44("Slot 4", this)));
        this.Field12451 = this.Method23(this.Field12450.Method7405(new Class44("Slot1Active", this, true).Method355("Active")));
        this.Field12452 = this.Method23(this.Field12450.Method7405(new Class44("Slot1Mode", this, Class1022.Field12436)).Method355("Mode"));
        this.Field12453 = this.Method23(this.Field12450.Method7405(new Class44("Slot1Key", this, 0).Method355("Keybind")));
        this.Field12454 = this.Method24(new Class1996(new Class44("Slot 5", this)));
        this.Field12455 = this.Method23(this.Field12454.Method7405(new Class44("Slot1Active", this, true).Method355("Active")));
        this.Field12456 = this.Method23(this.Field12454.Method7405(new Class44("Slot1Mode", this, Class1022.Field12436)).Method355("Mode"));
        this.Field12457 = this.Method23(this.Field12454.Method7405(new Class44("Slot1Key", this, 0).Method355("Keybind")));
        this.Field12458 = this.Method24(new Class1996(new Class44("Slot 6", this)));
        this.Field12459 = this.Method23(this.Field12458.Method7405(new Class44("Slot1Active", this, true).Method355("Active")));
        this.Field12460 = this.Method23(this.Field12458.Method7405(new Class44("Slot1Mode", this, Class1022.Field12436)).Method355("Mode"));
        this.Field12461 = this.Method23(this.Field12458.Method7405(new Class44("Slot1Key", this, 0).Method355("Keybind")));
        this.Field12462 = this.Method24(new Class1996(new Class44("Slot 7", this)));
        this.Field12463 = this.Method23(this.Field12462.Method7405(new Class44("Slot1Active", this, true).Method355("Active")));
        this.Field12464 = this.Method23(this.Field12462.Method7405(new Class44("Slot1Mode", this, Class1022.Field12436)).Method355("Mode"));
        this.Field12465 = this.Method23(this.Field12462.Method7405(new Class44("Slot1Key", this, 0).Method355("Keybind")));
        this.Field12466 = this.Method24(new Class1996(new Class44("Slot 8", this)));
        this.Field12467 = this.Method23(this.Field12466.Method7405(new Class44("Slot1Active", this, true).Method355("Active")));
        this.Field12468 = this.Method23(this.Field12466.Method7405(new Class44("Slot1Mode", this, Class1022.Field12436)).Method355("Mode"));
        this.Field12469 = this.Method23(this.Field12466.Method7405(new Class44("Slot1Key", this, 0).Method355("Keybind")));
        this.Field12470 = this.Method24(new Class1996(new Class44("Slot 9", this)));
        this.Field12471 = this.Method23(this.Field12470.Method7405(new Class44("Slot1Active", this, true).Method355("Active")));
        this.Field12472 = this.Method23(this.Field12470.Method7405(new Class44("Slot1Mode", this, Class1022.Field12436)).Method355("Mode"));
        this.Field12473 = this.Method23(this.Field12470.Method7405(new Class44("Slot1Key", this, 0).Method355("Keybind")));
    }
    
    @Override
    public void Method45() {
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field12439.Method365() && Keyboard.isKeyDown(this.Field12441.Method337())) {
            this.Method4140((Class449)this.Field12440.Method341(), 1);
        }
        if (this.Field12443.Method365() && Keyboard.isKeyDown(this.Field12445.Method337())) {
            this.Method4140((Class449)this.Field12444.Method341(), 2);
        }
        if (this.Field12447.Method365() && Keyboard.isKeyDown(this.Field12449.Method337())) {
            this.Method4140((Class449)this.Field12448.Method341(), 3);
        }
        if (this.Field12451.Method365() && Keyboard.isKeyDown(this.Field12453.Method337())) {
            this.Method4140((Class449)this.Field12452.Method341(), 4);
        }
        if (this.Field12455.Method365() && Keyboard.isKeyDown(this.Field12457.Method337())) {
            this.Method4140((Class449)this.Field12456.Method341(), 5);
        }
        if (this.Field12459.Method365() && Keyboard.isKeyDown(this.Field12461.Method337())) {
            this.Method4140((Class449)this.Field12460.Method341(), 6);
        }
        if (this.Field12463.Method365() && Keyboard.isKeyDown(this.Field12465.Method337())) {
            this.Method4140((Class449)this.Field12464.Method341(), 7);
        }
        if (this.Field12467.Method365() && Keyboard.isKeyDown(this.Field12469.Method337())) {
            this.Method4140((Class449)this.Field12468.Method341(), 8);
        }
        if (this.Field12471.Method365() && Keyboard.isKeyDown(this.Field12473.Method337())) {
            this.Method4140((Class449)this.Field12472.Method341(), 9);
        }
    }
    
    private void Method4140(final Class449 class449, final int currentItem) {
        final int currentItem2 = Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem));
        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = currentItem;
        if (class449 == Class449.Field9868) {
            this.Method20();
        }
        else if (class449 == Class449.Field9869) {
            this.Method4141();
        }
        else {
            this.Method4142();
        }
        if (this.Field12437.Method341() == Class1263.Field13713) {
            Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem2));
            Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = currentItem2;
        }
    }
    
    private void Method20() {
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.leftClickCounter <= 0) {
            if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver == null) {
                Class1796.Field16243.error("Null returned as 'hitResult', this shouldn't happen!");
                if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.isNotCreative()) {
                    Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.leftClickCounter = 10;
                }
            }
            else if (!Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRowingBoat()) {
                switch (Class202.Field8881[Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.typeOfHit.ordinal()]) {
                    case 1: {
                        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.attackEntity((EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit);
                        break;
                    }
                    case 2: {
                        final BlockPos getBlockPos = Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos();
                        if (!Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.isAirBlock(getBlockPos)) {
                            Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.clickBlock(getBlockPos, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.sideHit);
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
        }
    }
    
    private void Method4141() {
        if (!Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.getIsHittingBlock()) {
            Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.rightClickDelayTimer = 4;
            if (!Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRowingBoat()) {
                if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver == null) {
                    Class1796.Field16243.warn("Null returned as 'hitResult', this shouldn't happen!");
                }
                for (final EnumHand enumHand : EnumHand.values()) {
                    final ItemStack getHeldItem = Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItem(enumHand);
                    if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver != null) {
                        switch (Class202.Field8881[Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.typeOfHit.ordinal()]) {
                            case 1: {
                                if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.interactWithEntity((EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver, enumHand) == EnumActionResult.SUCCESS) {
                                    return;
                                }
                                if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.interactWithEntity((EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit, enumHand) == EnumActionResult.SUCCESS) {
                                    return;
                                }
                                break;
                            }
                            case 2: {
                                final BlockPos getBlockPos = Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos();
                                if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(getBlockPos).getMaterial() == Material.AIR) {
                                    break;
                                }
                                final int getCount = getHeldItem.getCount();
                                if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, getBlockPos, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.sideHit, Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.hitVec, enumHand) == EnumActionResult.SUCCESS) {
                                    Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(enumHand);
                                    if (!getHeldItem.isEmpty() && (getHeldItem.getCount() != getCount || Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.isInCreativeMode())) {
                                        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.itemRenderer.resetEquippedProgress(enumHand);
                                    }
                                    return;
                                }
                                break;
                            }
                        }
                    }
                    if (getHeldItem.isEmpty() && (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver == null || Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.typeOfHit == RayTraceResult$Type.MISS)) {
                        ForgeHooks.onEmptyClick((EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, enumHand);
                    }
                    if (!getHeldItem.isEmpty() && Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClick((EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (World)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, enumHand) == EnumActionResult.SUCCESS) {
                        Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.itemRenderer.resetEquippedProgress(enumHand);
                        return;
                    }
                }
            }
        }
    }
    
    private void Method4142() {
        if (Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver != null && Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.typeOfHit != RayTraceResult$Type.MISS) {
            ForgeHooks.onPickBlock(Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver, (EntityPlayer)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (World)Class1022.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
        }
    }
    
    static {
        Field12436 = Class449.Field9868;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7951 ^ 0xA6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
