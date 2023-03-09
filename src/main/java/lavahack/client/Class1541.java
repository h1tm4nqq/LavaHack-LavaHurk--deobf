//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.inventory.GuiInventory
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemSword
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import java.util.concurrent.atomic.AtomicBoolean;
import lavahack.client.Class1303;
import lavahack.client.Class1351;
import lavahack.client.Class1416;
import lavahack.client.Class1744;
import lavahack.client.Class2012;
import lavahack.client.Class2155;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class726;
import lavahack.client.Class873;
import lavahack.client.Class97;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Mouse;

@Class2012
public class Class1541
extends Class42 {
    private final Class44 Field15193 = this.Method23(new Class44("Health", (Class42)this, Double.longBitsToDouble((long)1971063238 ^ 0x40260000757C09C6L), 0.0, Double.longBitsToDouble(0x4042000000000000L), true));
    private final Class1303 Field15194 = new Class1303("Mode", (Class42)this, Class1351.Field14145).Method5303();
    private final Class1303 Field15195 = new Class1303("Falling Mode", (Class42)this, Class1351.Field14145).Method5303();
    private final Class44 Field15196 = this.Method23(new Class44("Fall Distance", (Class42)this, Double.longBitsToDouble((long)529964251 ^ 0x402E00001F969CDBL), 0.0, Double.longBitsToDouble(4636737291354636288L), true));
    private final Class44 Field15197 = this.Method23(new Class44("Anti Place", (Class42)this, false));
    private final Class44 Field15198 = this.Method23(new Class44("Totem On Elytra", (Class42)this, true));
    private final Class44 Field15199 = this.Method23(new Class44("Gap On Sword", (Class42)this, true));
    private final Class44 Field15200 = this.Method23(new Class44("Right Click Gap", (Class42)this, false).Method312(this.Field15199));
    private final Class44 Field15201 = this.Method23(new Class44("Totem If No Nearby Players", (Class42)this, false));
    private final Class44 Field15202 = this.Method23(new Class44("Hotbar First", (Class42)this, false));
    private final Class44 Field15203 = this.Method23(new Class44("Use UpdateController", (Class42)this, true));
    private final Class44 Field15204 = this.Method23(new Class44("Anti Totem Fail", (Class42)this, true));
    private final Class44 Field15205 = this.Method23(new Class44("Terrain", (Class42)this, true));
    public final Class44 Field15206 = this.Method23(new Class44("Smart Switch Auto Rer Sync", (Class42)this, false));
    private final Class411 Field15207 = this.Method54();
    private final AtomicBoolean Field15208 = new AtomicBoolean(false);
    @Class873
    public static Class1541 Field15209;
    private String Field15210 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1541() {
        super("OffHand", "gg", Class97.Field8338);
        super.Method44(this::Method6102);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field15207.Method2004();
    }

    @Override
    public void Method45() {
        if (Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen != null && !(Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiInventory)) {
            return;
        }
        this.Field15207.Method2005(this::Method20);
        Class1351 class1351 = (Class1351)this.Field15194.Method341();
        if (!this.Field15206.Method365()) {
            if (this.Field15208.get() || this.Field15193.Method367() > (double)(Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) || this.Field15194.Method359().equalsIgnoreCase("Totem") || this.Field15198.Method365() && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying() || (double)Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance >= this.Field15196.Method367() && !Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) {
                class1351 = Class1351.Field14145;
            }
            if (Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemSword && this.Field15199.Method365() && !this.Field15200.Method365() || this.Field15199.Method365() && this.Field15200.Method365() && Mouse.isButtonDown((int)1) && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemSword) {
                class1351 = Class1351.Field14141;
            }
        } else if (((Boolean)Class1416.Field14544.Field14568.get()).booleanValue() && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.TOTEM_OF_UNDYING) {
            class1351 = Class1351.Field14140;
        }
        this.Method6099(class1351.Method5415());
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6098(PlayerInteractEvent.RightClickBlock rightClickBlock) {
        if (!this.Field15197.Method365()) return;
        if (!(Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemFood)) {
            if (!(Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() instanceof ItemFood)) return;
        }
        rightClickBlock.setCanceled(true);
    }

    private void Method6099(Item item) {
        int n;
        if (Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() == item) return;
        int n2 = n = this.Field15202.Method365() ? Class1744.Method6661(item) : Class1744.Method6660(item);
        if (n == -1 && item != ((Class1351)this.Field15195.Method341()).Method5415() && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != ((Class1351)this.Field15195.Method341()).Method5415() && ((n = Class1744.Method6661(((Class1351)this.Field15195.Method341()).Method5415())) == -1 && ((Class1351)this.Field15195.Method341()).Method5415() != Items.TOTEM_OF_UNDYING || item != Items.TOTEM_OF_UNDYING && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.TOTEM_OF_UNDYING)) {
            n = Class1744.Method6661(Items.TOTEM_OF_UNDYING);
        }
        if (n == -1) return;
        Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, n, 0, ClickType.PICKUP, (EntityPlayer)Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, 45, 0, ClickType.PICKUP, (EntityPlayer)Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, n, 0, ClickType.PICKUP, (EntityPlayer)Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        if (!this.Field15203.Method365()) return;
        Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
    }

    private void Method20() {
        this.Field15208.set(this.Field15201.Method365() && !this.Field15194.Method359().equalsIgnoreCase("Totem") && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.stream().noneMatch(Class1541::Method6101));
        this.Field15208.set(this.Field15208.get() || this.Field15204.Method365() && !Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem().equals(Items.TOTEM_OF_UNDYING) && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().anyMatch(this::Method6100));
    }

    private boolean Method6100(Entity entity) {
        if (!(entity instanceof EntityEnderCrystal)) return false;
        if (!(Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(entity) <= Double.longBitsToDouble(4639270566145032192L))) return false;
        if (!(Class2155.Method7759((World)Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity.posX + Double.longBitsToDouble((long)442867984 ^ 0x3FE000001A65A110L), entity.posY, entity.posZ + Double.longBitsToDouble(4602678819172646912L), (Entity)Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field15205.Method365()) >= Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount())) return false;
        return true;
    }

    private static boolean Method6101(EntityPlayer entityPlayer) {
        if (entityPlayer == Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return false;
        if (Class726.Field11086.Method3042(entityPlayer)) return false;
        if (Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) > Float.intBitsToFloat(1097859072)) return false;
        return true;
    }

    private String Method6102() {
        return "[" + this.Field15194.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 91;
            cArray2[n] = (char)(cArray[n] ^ (0x48DA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

