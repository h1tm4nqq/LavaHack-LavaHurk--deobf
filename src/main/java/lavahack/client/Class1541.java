//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.atomic.*;
import net.minecraft.client.gui.inventory.*;
import org.lwjgl.input.*;
import net.minecraft.init.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.item.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import java.util.function.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import net.minecraft.world.*;

@Class2012
public class Class1541 extends Class42
{
    private final Class44 Field15193;
    private final Class1303 Field15194;
    private final Class1303 Field15195;
    private final Class44 Field15196;
    private final Class44 Field15197;
    private final Class44 Field15198;
    private final Class44 Field15199;
    private final Class44 Field15200;
    private final Class44 Field15201;
    private final Class44 Field15202;
    private final Class44 Field15203;
    private final Class44 Field15204;
    private final Class44 Field15205;
    public final Class44 Field15206;
    private final Class411 Field15207;
    private final AtomicBoolean Field15208;
    @Class873
    public static Class1541 Field15209;
    private String Field15210 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1541() {
        super("OffHand", "gg", Class97.Field8338);
        this.Field15193 = this.Method23(new Class44("Health", this, Double.longBitsToDouble((long)1971063238 ^ 0x40260000757C09C6L), 0.0, Double.longBitsToDouble(4630263366890291200L), true));
        this.Field15194 = new Class1303("Mode", (Class42)this, (Enum)Class1351.Field14145).Method5303();
        this.Field15195 = new Class1303("Falling Mode", (Class42)this, (Enum)Class1351.Field14145).Method5303();
        this.Field15196 = this.Method23(new Class44("Fall Distance", this, Double.longBitsToDouble((long)529964251 ^ 0x402E00001F969CDBL), 0.0, Double.longBitsToDouble(4636737291354636288L), true));
        this.Field15197 = this.Method23(new Class44("Anti Place", this, false));
        this.Field15198 = this.Method23(new Class44("Totem On Elytra", this, true));
        this.Field15199 = this.Method23(new Class44("Gap On Sword", this, true));
        this.Field15200 = this.Method23(new Class44("Right Click Gap", this, false).Method312(this.Field15199));
        this.Field15201 = this.Method23(new Class44("Totem If No Nearby Players", this, false));
        this.Field15202 = this.Method23(new Class44("Hotbar First", this, false));
        this.Field15203 = this.Method23(new Class44("Use UpdateController", this, true));
        this.Field15204 = this.Method23(new Class44("Anti Totem Fail", this, true));
        this.Field15205 = this.Method23(new Class44("Terrain", this, true));
        this.Field15206 = this.Method23(new Class44("Smart Switch Auto Rer Sync", this, false));
        this.Field15207 = this.Method54();
        this.Field15208 = new AtomicBoolean(false);
        super.Method44(this::Method6102);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        this.Field15207.Method2004();
    }
    
    @Override
    public void Method45() {
        if (Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || (Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen != null && !(Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiInventory))) {
            return;
        }
        this.Field15207.Method2005(this::Method20);
        Class1351 class1351 = (Class1351)this.Field15194.Method341();
        if (!this.Field15206.Method365()) {
            if (this.Field15208.get() || this.Field15193.Method367() > Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() || this.Field15194.Method359().equalsIgnoreCase("Totem") || (this.Field15198.Method365() && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) || (Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance >= this.Field15196.Method367() && !Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying())) {
                class1351 = Class1351.Field14145;
            }
            if ((Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemSword && this.Field15199.Method365() && !this.Field15200.Method365()) || (this.Field15199.Method365() && this.Field15200.Method365() && Mouse.isButtonDown(1) && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemSword)) {
                class1351 = Class1351.Field14141;
            }
        }
        else if (Class1416.Field14544.Field14568.get() && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.TOTEM_OF_UNDYING) {
            class1351 = Class1351.Field14140;
        }
        this.Method6099(class1351.Method5415());
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6098(final PlayerInteractEvent$RightClickBlock playerInteractEvent$RightClickBlock) {
        if (this.Field15197.Method365() && (Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemFood || Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() instanceof ItemFood)) {
            playerInteractEvent$RightClickBlock.setCanceled(true);
        }
    }
    
    private void Method6099(final Item item) {
        if (Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != item) {
            int n = this.Field15202.Method365() ? Class1744.Method6661(item) : Class1744.Method6660(item);
            if (n == -1 && item != ((Class1351)this.Field15195.Method341()).Method5415() && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != ((Class1351)this.Field15195.Method341()).Method5415()) {
                n = Class1744.Method6661(((Class1351)this.Field15195.Method341()).Method5415());
                if ((n == -1 && ((Class1351)this.Field15195.Method341()).Method5415() != Items.TOTEM_OF_UNDYING) || (item != Items.TOTEM_OF_UNDYING && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.TOTEM_OF_UNDYING)) {
                    n = Class1744.Method6661(Items.TOTEM_OF_UNDYING);
                }
            }
            if (n != -1) {
                Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, n, 0, ClickType.PICKUP, (EntityPlayer)Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, 45, 0, ClickType.PICKUP, (EntityPlayer)Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, n, 0, ClickType.PICKUP, (EntityPlayer)Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                if (this.Field15203.Method365()) {
                    Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
                }
            }
        }
    }
    
    private void Method20() {
        this.Field15208.set(this.Field15201.Method365() && !this.Field15194.Method359().equalsIgnoreCase("Totem") && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.stream().noneMatch(Class1541::Method6101));
        this.Field15208.set(this.Field15208.get() || (this.Field15204.Method365() && !Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem().equals(Items.TOTEM_OF_UNDYING) && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().anyMatch(this::Method6100)));
    }
    
    private boolean Method6100(final Entity entity) {
        return entity instanceof EntityEnderCrystal && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(entity) <= Double.longBitsToDouble(4639270566145032192L) && Class2155.Method7759((World)Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity.posX + Double.longBitsToDouble((long)442867984 ^ 0x3FE000001A65A110L), entity.posY, entity.posZ + Double.longBitsToDouble(4602678819172646912L), (Entity)Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field15205.Method365()) >= Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount();
    }
    
    private static boolean Method6101(final EntityPlayer entityPlayer) {
        return entityPlayer != Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && !Class726.Field11086.Method3042(entityPlayer) && Class1541.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) <= Float.intBitsToFloat(1097859072);
    }
    
    private String Method6102() {
        return "[" + this.Field15194.Method359() + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x48DA ^ 0x5B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
