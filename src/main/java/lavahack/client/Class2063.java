//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.function.Predicate;
import lavahack.client.Class1489;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class2046;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class447;
import lavahack.client.Class618;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

public class Class2063
extends Class42 {
    private final Class44 Field17425 = this.Method23(new Class44("Mode", (Class42)this, Class2046.Field17389));
    private final Class44 Field17426 = this.Method23(new Class44("Speed", (Class42)this, Double.longBitsToDouble(4610875370494461215L), 0.0, Double.longBitsToDouble((long)1045299024 ^ 0x402400003E4DFF50L), false));
    private final Class44 Field17427 = this.Method23(new Class44("DownSpeed", (Class42)this, Double.longBitsToDouble((long)1935848783 ^ 0x3FFD1EB822893050L), 0.0, Double.longBitsToDouble(0x4024000000000000L), false));
    private final Class44 Field17428 = this.Method23(new Class44("GlideSpeed", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)997950047 ^ 0x402400003B7B825FL), false));
    private final Class44 Field17429 = this.Method23(new Class44("InstantFly", (Class42)this, false));
    private final Class44 Field17430 = this.Method23(new Class44("EquipElytra", (Class42)this, true));
    private final Class650 Field17431 = new Class650();
    private int Field17432 = -1;
    @Class1801
    private final Class618 Field17433 = new Class618(this::Method7578, new Predicate[0]);
    private int Field17434;

    public Class2063() {
        super("ElytraFly", "ElytraFly", Class97.Field8340);
        super.Method44(this::Method7579);
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field17433);
        this.Field17432 = -1;
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field17430.Method365()) return;
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
            this.Field17432 = Class9.Method116(Items.ELYTRA, 0, 36);
        }
        if (this.Field17432 == -1) return;
        boolean bl = Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() != Items.AIR;
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field17432, 0, ClickType.PICKUP, (EntityPlayer)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, 6, 0, ClickType.PICKUP, (EntityPlayer)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field17433);
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (this.Field17432 == -1) return;
        if (!this.Field17430.Method365()) return;
        boolean bl = !Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(this.Field17432).isEmpty() || Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(this.Field17432).getItem() != Items.AIR;
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, 6, 0, ClickType.PICKUP, (EntityPlayer)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field17432, 0, ClickType.PICKUP, (EntityPlayer)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, 6, 0, ClickType.PICKUP, (EntityPlayer)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
    }

    private void Method7575(Class1489 class1489) {
        double[] dArray = Class447.Method2110(this.Field17426.Method367());
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.jump) {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field17426.Method367();
        }
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.sneak) {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -this.Field17426.Method367();
        }
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f) {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[0];
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[1];
        }
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
    }

    private void Method7576(Class1489 class1489) {
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.jump) {
            double d = Math.sqrt(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX * Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX + Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ * Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ);
            if (d > 1.0) {
                return;
            }
            double[] dArray = Class447.Method2110(this.Field17426.Method367());
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[0];
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -(this.Field17428.Method367() / Double.longBitsToDouble((long)1413640311 ^ 0x40C3880054427077L));
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[1];
            class1489.Method158();
            return;
        }
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(0.0, 0.0, 0.0);
        class1489.Method158();
        double[] dArray = Class447.Method2131(this.Field17426.Method367());
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f) {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[0];
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -(this.Field17428.Method367() / Double.longBitsToDouble((long)1023853841 ^ 0x40C388003D06C511L));
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[1];
        }
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.sneak) {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -this.Field17427.Method367();
        }
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevLimbSwingAmount = 0.0f;
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.limbSwingAmount = 0.0f;
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.limbSwing = 0.0f;
    }

    private void Method7577(Class1489 class1489) {
        double[] dArray = Class447.Method2131(this.Field17426.Method367());
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f) {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[0];
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[1];
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX -= Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX * (double)(Math.abs(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch) + Float.intBitsToFloat(1119092736)) / Double.longBitsToDouble((long)1365295557 ^ 0x405680005160C1C5L) - Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX;
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ -= Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ * (double)(Math.abs(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch) + Float.intBitsToFloat(1119092736)) / Double.longBitsToDouble(4636033603912859648L) - Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ;
        } else {
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        }
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -Class447.Method2099(Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch) * (double)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward;
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevLimbSwingAmount = 0.0f;
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.limbSwingAmount = 0.0f;
        Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.limbSwing = 0.0f;
        class1489.Method158();
    }

    private void Method7578(Class1489 class1489) {
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
            return;
        }
        if (!Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) {
            if (Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
            if (!this.Field17429.Method365()) return;
            if (!this.Field17431.Method2797(1000L)) {
                return;
            }
            this.Field17431.Method2801();
            Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class2063.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
            return;
        }
        String string = this.Field17425.Method359();
        int n = -1;
        switch (string.hashCode()) {
            case -1955878649: {
                if (!string.equals("Normal")) return;
                return;
            }
            case -1678770883: {
                if (!string.equals("Control")) return;
                return;
            }
            case 211665007: {
                if (!string.equals("NormalPacket")) return;
                return;
            }
        }
    }

    private String Method7579() {
        return "[" + this.Field17425.Method359() + " | " + this.Field17426.Method335() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 184;
            cArray2[n] = (char)(cArray[n] ^ (0x6011 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

