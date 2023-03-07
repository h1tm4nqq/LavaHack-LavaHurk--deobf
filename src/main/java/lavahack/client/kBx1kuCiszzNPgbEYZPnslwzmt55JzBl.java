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

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ;
import lavahack.client.kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

public class kBx1kuCiszzNPgbEYZPnslwzmt55JzBl
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17425 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, kBx1kuCiszzNPgbEYZPnslwzmt55JzBl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17389));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17426 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x667A350533854887L ^ 0x59872BBD626ECD98L), 0.0, Double.longBitsToDouble((long)1045299024 ^ 0x402400003E4DFF50L), (boolean)((long)151834829 ^ (long)151834829)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17427 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("DownSpeed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1935848783 ^ 0x3FFD1EB822893050L), 0.0, Double.longBitsToDouble(0x53D700F24CCEC6EDL ^ 0x13F300F24CCEC6EDL), ((int)-425669480L ^ 0xE6A0CC98) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17428 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("GlideSpeed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)997950047 ^ 0x402400003B7B825FL), ((int)720665262L ^ 0x2AF47AAE) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17429 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("InstantFly", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)284785544 ^ (long)284785544)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17430 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("EquipElytra", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-271394713L ^ 0xEFD2D866) != 0));
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field17431 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private int Field17432 = (int)((long)-989278836 ^ (long)989278835);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17433 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method7578, new Predicate[(int)-1589727392L ^ 0xA13EAF60]);
    private int Field17434;

    public kBx1kuCiszzNPgbEYZPnslwzmt55JzBl() {
        super("ElytraFly", "ElytraFly", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
        super.Method44(this::Method7579);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field17433);
        this.Field17432 = (int)2799123L ^ 0xFFD549EC;
        if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field17430.Method365()) return;
        if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
            this.Field17432 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Items.ELYTRA, (int)-2049984972L ^ 0x85CFB634, (int)((long)-1402968069 ^ (long)-1402968078) << 2);
        }
        if (this.Field17432 == ((int)1204853242L ^ 0xB82F6605)) return;
        int n = kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() != Items.AIR ? (int)14312556L ^ 0xDA646D : (int)-2117860052L ^ 0x81C4052C;
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field17432, (int)1904902716L ^ 0x718A823C, ClickType.PICKUP, (EntityPlayer)kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, ((int)302851238L ^ 0x120D24A5) << 1, (int)((long)1311764657 ^ (long)1311764657), ClickType.PICKUP, (EntityPlayer)kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field17433);
        if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (this.Field17432 == ((int)259715320L ^ 0xF0850F07)) return;
        if (!this.Field17430.Method365()) return;
        int n = !kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(this.Field17432).isEmpty() || kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(this.Field17432).getItem() != Items.AIR ? (int)((long)1873995947 ^ (long)1873995946) : (int)1358137983L ^ 0x50F38A7F;
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, ((int)2043206379L ^ 0x79C8DAE8) << 1, (int)826067709L ^ 0x313CCAFD, ClickType.PICKUP, (EntityPlayer)kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field17432, (int)-671077137L ^ 0xD8002CEF, ClickType.PICKUP, (EntityPlayer)kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, (int)((long)-254998331 ^ (long)-254998330) << 1, (int)((long)204620754 ^ (long)204620754), ClickType.PICKUP, (EntityPlayer)kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
    }

    private void Method7575(fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ2) {
        double[] dArray = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2110(this.Field17426.Method367());
        if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.jump) {
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field17426.Method367();
        }
        if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.sneak) {
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -this.Field17426.Method367();
        }
        if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f) {
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[(int)-1633786723L ^ 0x9E9E649D];
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[(int)((long)-1968501791 ^ (long)-1968501792)];
        }
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
    }

    private void Method7576(fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ2) {
        if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.jump) {
            double d = Math.sqrt(kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX * kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX + kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ * kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ);
            if (d > 1.0) {
                return;
            }
            double[] dArray = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2110(this.Field17426.Method367());
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[(int)((long)1457738392 ^ (long)1457738392)];
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -(this.Field17428.Method367() / Double.longBitsToDouble((long)1413640311 ^ 0x40C3880054427077L));
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[(int)((long)766302627 ^ (long)766302626)];
            fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ2.Method158();
            return;
        }
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(0.0, 0.0, 0.0);
        fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ2.Method158();
        double[] dArray = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2131(this.Field17426.Method367());
        if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f) {
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[(int)((long)-374162875 ^ (long)-374162875)];
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -(this.Field17428.Method367() / Double.longBitsToDouble((long)1023853841 ^ 0x40C388003D06C511L));
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[(int)-1842285057L ^ 0x9230F5FE];
        }
        if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.sneak) {
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -this.Field17427.Method367();
        }
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevLimbSwingAmount = 0.0f;
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.limbSwingAmount = 0.0f;
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.limbSwing = 0.0f;
    }

    private void Method7577(fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ2) {
        double[] dArray = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2131(this.Field17426.Method367());
        if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f) {
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[(int)((long)-1366587425 ^ (long)-1366587425)];
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[(int)((long)1038145558 ^ (long)1038145559)];
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX -= kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX * (double)(Math.abs(kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch) + Float.intBitsToFloat((int)((long)1415404837 ^ (long)384392485))) / Double.longBitsToDouble((long)1365295557 ^ 0x405680005160C1C5L) - kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX;
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ -= kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ * (double)(Math.abs(kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch) + Float.intBitsToFloat((int)((long)795373272 ^ (long)1843162840))) / Double.longBitsToDouble(0x5F41BF01D4FF647BL ^ 0x1F173F01D4FF647BL) - kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ;
        } else {
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        }
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2099(kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch) * (double)kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward;
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevLimbSwingAmount = 0.0f;
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.limbSwingAmount = 0.0f;
        kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.limbSwing = 0.0f;
        fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ2.Method158();
    }

    private void Method7578(fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ fWLM1xYQAvLvszZ46JEibQwGmnGO0DeQ2) {
        if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
            return;
        }
        if (!kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) {
            if (kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
            if (!this.Field17429.Method365()) return;
            if (!this.Field17431.Method2797(0x1007F8L & 0x48A46BEAL)) {
                return;
            }
            this.Field17431.Method2801();
            kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)kBx1kuCiszzNPgbEYZPnslwzmt55JzBl.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
            return;
        }
        String string = this.Field17425.Method359();
        int n = (int)1504682328L ^ 0xA6505EA7;
        switch (string.hashCode()) {
            case -1955878649: {
                if (!string.equals("Normal")) return;
                n = (int)-636129056L ^ 0xDA1570E0;
                return;
            }
            case -1678770883: {
                if (!string.equals("Control")) return;
                n = (int)((long)2145845070 ^ (long)2145845071);
                return;
            }
            case 211665007: {
                if (!string.equals("NormalPacket")) return;
                n = ((int)-1198678171L ^ 0xB88D9F64) << 1;
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
        int n = (int)((long)2126368067 ^ (long)2126368067);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1321883385 ^ (long)-1321883144);
            int n2 = ((int)-38036675L ^ 0xFDBB9B2A) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)103145297 ^ (long)103137088) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

