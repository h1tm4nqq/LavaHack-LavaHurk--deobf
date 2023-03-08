//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import net.minecraft.init.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import net.minecraft.network.play.client.*;
import net.minecraft.entity.*;
import net.minecraft.network.*;
import net.minecraft.client.entity.*;

public class Class2063 extends Class42
{
    private final Class44 Field17425;
    private final Class44 Field17426;
    private final Class44 Field17427;
    private final Class44 Field17428;
    private final Class44 Field17429;
    private final Class44 Field17430;
    private final Class650 Field17431;
    private int Field17432;
    @Class1801
    private final Class618 Field17433;
    private int Field17434;
    
    public Class2063() {
        super("ElytraFly", "ElytraFly", Class97.Field8340);
        this.Field17425 = this.Method23(new Class44("Mode", this, (Enum)Class2046.Field17389));
        this.Field17426 = this.Method23(new Class44("Speed", this, Double.longBitsToDouble(4610875370494461215L), 0.0, Double.longBitsToDouble((long)1045299024 ^ 0x402400003E4DFF50L), false));
        this.Field17427 = this.Method23(new Class44("DownSpeed", this, Double.longBitsToDouble((long)1935848783 ^ 0x3FFD1EB822893050L), 0.0, Double.longBitsToDouble(4621819117588971520L), false));
        this.Field17428 = this.Method23(new Class44("GlideSpeed", this, 1.0, 0.0, Double.longBitsToDouble((long)997950047 ^ 0x402400003B7B825FL), false));
        this.Field17429 = this.Method23(new Class44("InstantFly", this, false));
        this.Field17430 = this.Method23(new Class44("EquipElytra", this, true));
        this.Field17431 = new Class650();
        this.Field17432 = -1;
        this.Field17433 = new Class618(this::Method7578, new Predicate[0]);
        super.Method44(this::Method7579);
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field17433);
        this.Field17432 = -1;
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field17430.Method365()) {
            if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
                this.Field17432 = Class9.Method116(Items.ELYTRA, 0, 36);
            }
            if (this.Field17432 != -1) {
                final boolean b = Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() != Items.AIR;
                Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field17432, 0, ClickType.PICKUP, (EntityPlayer)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, 6, 0, ClickType.PICKUP, (EntityPlayer)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            }
        }
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field17433);
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && this.Field17432 != -1 && this.Field17430.Method365()) {
            final boolean b = !Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(this.Field17432).isEmpty() || Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(this.Field17432).getItem() != Items.AIR;
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, 6, 0, ClickType.PICKUP, (EntityPlayer)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field17432, 0, ClickType.PICKUP, (EntityPlayer)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, 6, 0, ClickType.PICKUP, (EntityPlayer)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        }
    }
    
    private void Method7575(final Class1489 class1489) {
        final double[] method2110 = Class447.Method2110(this.Field17426.Method367());
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.jump) {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field17426.Method367();
        }
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.sneak) {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -this.Field17426.Method367();
        }
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f) {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = method2110[0];
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = method2110[1];
        }
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction$Action.START_FALL_FLYING));
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction$Action.START_FALL_FLYING));
    }
    
    private void Method7576(final Class1489 class1489) {
        if (!Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.jump) {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(0.0, 0.0, 0.0);
            class1489.Method158();
            final double[] method2131 = Class447.Method2131(this.Field17426.Method367());
            if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f) {
                Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = method2131[0];
                Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -(this.Field17428.Method367() / Double.longBitsToDouble((long)1023853841 ^ 0x40C388003D06C511L));
                Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = method2131[1];
            }
            if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.sneak) {
                Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -this.Field17427.Method367();
            }
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevLimbSwingAmount = 0.0f;
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.limbSwingAmount = 0.0f;
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.limbSwing = 0.0f;
            return;
        }
        if (Math.sqrt(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX * Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX + Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ * Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ) > 1.0) {
            return;
        }
        final double[] method2132 = Class447.Method2110(this.Field17426.Method367());
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = method2132[0];
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -(this.Field17428.Method367() / Double.longBitsToDouble((long)1413640311 ^ 0x40C3880054427077L));
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = method2132[1];
        class1489.Method158();
    }
    
    private void Method7577(final Class1489 class1489) {
        final double[] method2131 = Class447.Method2131(this.Field17426.Method367());
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f) {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = method2131[0];
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = method2131[1];
            final EntityPlayerSP player = Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            player.motionX -= Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX * (Math.abs(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch) + Float.intBitsToFloat(1119092736)) / Double.longBitsToDouble((long)1365295557 ^ 0x405680005160C1C5L) - Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX;
            final EntityPlayerSP player2 = Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            player2.motionZ -= Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ * (Math.abs(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch) + Float.intBitsToFloat(1119092736)) / Double.longBitsToDouble(4636033603912859648L) - Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ;
        }
        else {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        }
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -Class447.Method2099(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch) * Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward;
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevLimbSwingAmount = 0.0f;
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.limbSwingAmount = 0.0f;
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.limbSwing = 0.0f;
        class1489.Method158();
    }
    
    private void Method7578(final Class1489 class1489) {
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
            return;
        }
        if (!Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) {
            if (!Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround && this.Field17429.Method365()) {
                if (!this.Field17431.Method2797(1000L)) {
                    return;
                }
                this.Field17431.Method2801();
                Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction$Action.START_FALL_FLYING));
            }
            return;
        }
        final String method359 = this.Field17425.Method359();
        switch (method359.hashCode()) {
            case -1955878649: {
                if (method359.equals("Normal")) {
                    break;
                }
                break;
            }
            case -1678770883: {
                if (method359.equals("Control")) {
                    break;
                }
                break;
            }
            case 211665007: {
                if (method359.equals("NormalPacket")) {
                    break;
                }
                break;
            }
        }
    }
    
    private String Method7579() {
        return "[" + this.Field17425.Method359() + " | " + this.Field17426.Method335() + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6011 ^ 0xB8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
