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
import lavahack.client.Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
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

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
public class o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15193 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Health", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1971063238 ^ 0x40260000757C09C6L), 0.0, Double.longBitsToDouble(0x93DD3C458FBFD985L ^ 0xD39F3C458FBFD985L), ((int)2082311184L ^ 0x7C1D8C11) != 0));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field15194 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ.Field14145).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field15195 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Falling Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ.Field14145).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15196 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fall Distance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)529964251 ^ 0x402E00001F969CDBL), 0.0, Double.longBitsToDouble(0x5E2AC860C5013CBBL ^ 0x1E73C860C5013CBBL), ((int)1397837162L ^ 0x53514D6B) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15197 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Anti Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1097468072 ^ (long)-1097468072)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15198 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Totem On Elytra", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1018182964L ^ 0xC34FC2CD) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15199 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Gap On Sword", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-86278591L ^ 0xFADB7E40) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15200 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Right Click Gap", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-885711510 ^ (long)-885711510)).Method312(this.Field15199));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15201 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Totem If No Nearby Players", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1170937841 ^ (long)1170937841)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15202 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hotbar First", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1453166574L ^ 0xA9627012) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15203 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Use UpdateController", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-113766768L ^ 0xF9380E91) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15204 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Anti Totem Fail", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1338185309L ^ 0xB03CE9A2) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15205 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Terrain", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1741659330L ^ 0x9830633F) != 0));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15206 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Smart Switch Auto Rer Sync", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1971319038 ^ (long)-1971319038)));
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field15207 = this.Method54();
    private final AtomicBoolean Field15208 = new AtomicBoolean((boolean)((long)-1675652754 ^ (long)-1675652754));
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ Field15209;
    private String Field15210 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ() {
        super("OffHand", "gg", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        super.Method44(this::Method6102);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field15207.Method2004();
    }

    @Override
    public void Method45() {
        if (o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen != null && !(o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiInventory)) {
            return;
        }
        this.Field15207.Method2005(this::Method20);
        Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ = (Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ)this.Field15194.Method341();
        if (!this.Field15206.Method365()) {
            if (this.Field15208.get() || this.Field15193.Method367() > (double)(o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) || this.Field15194.Method359().equalsIgnoreCase("Totem") || this.Field15198.Method365() && o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying() || (double)o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance >= this.Field15196.Method367() && !o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) {
                hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ = Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ.Field14145;
            }
            if (o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemSword && this.Field15199.Method365() && !this.Field15200.Method365() || this.Field15199.Method365() && this.Field15200.Method365() && Mouse.isButtonDown((int)((int)-750620058L ^ 0xD3427267)) && o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemSword) {
                hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ = Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ.Field14141;
            }
        } else if (((Boolean)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Field14568.get()).booleanValue() && o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.TOTEM_OF_UNDYING) {
            hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ = Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ.Field14140;
        }
        this.Method6099(hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ.Method5415());
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6098(PlayerInteractEvent.RightClickBlock rightClickBlock) {
        if (!this.Field15197.Method365()) return;
        if (!(o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemFood)) {
            if (!(o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() instanceof ItemFood)) return;
        }
        rightClickBlock.setCanceled(((int)-766930508L ^ 0xD24991B5) != 0);
    }

    private void Method6099(Item item) {
        int n;
        if (o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() == item) return;
        int n2 = n = this.Field15202.Method365() ? PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6661(item) : PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6660(item);
        if (n == (int)((long)2098531115 ^ (long)-2098531116) && item != ((Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ)this.Field15195.Method341()).Method5415() && o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != ((Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ)this.Field15195.Method341()).Method5415() && ((n = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6661(((Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ)this.Field15195.Method341()).Method5415())) == (int)((long)-107966285 ^ (long)107966284) && ((Hw9qa6LkgOgrAJYU8Uj3cK0TIvfwflWZ)this.Field15195.Method341()).Method5415() != Items.TOTEM_OF_UNDYING || item != Items.TOTEM_OF_UNDYING && o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.TOTEM_OF_UNDYING)) {
            n = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6661(Items.TOTEM_OF_UNDYING);
        }
        if (n == (int)((long)2041308161 ^ (long)-2041308162)) return;
        o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, n, (int)-56452696L ^ 0xFCA299A8, ClickType.PICKUP, (EntityPlayer)o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, (int)1178610257L ^ 0x46402A7C, (int)339274885L ^ 0x1438EC85, ClickType.PICKUP, (EntityPlayer)o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, n, (int)((long)-1393338395 ^ (long)-1393338395), ClickType.PICKUP, (EntityPlayer)o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        if (!this.Field15203.Method365()) return;
        o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
    }

    private void Method20() {
        this.Field15208.set((this.Field15201.Method365() && !this.Field15194.Method359().equalsIgnoreCase("Totem") && o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.stream().noneMatch(o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ::Method6101) ? (int)((long)-861386897 ^ (long)-861386898) : (int)((long)1835239152 ^ (long)1835239152)) != 0);
        this.Field15208.set((this.Field15208.get() || this.Field15204.Method365() && !o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem().equals(Items.TOTEM_OF_UNDYING) && o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().anyMatch(this::Method6100) ? (int)((long)-895676146 ^ (long)-895676145) : (int)((long)463139781 ^ (long)463139781)) != 0);
    }

    private boolean Method6100(Entity entity) {
        int n;
        if (entity instanceof EntityEnderCrystal && o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(entity) <= Double.longBitsToDouble(0xD19A7F9BD4455658L ^ 0x91F87F9BD4455658L) && vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity.posX + Double.longBitsToDouble((long)442867984 ^ 0x3FE000001A65A110L), entity.posY, entity.posZ + Double.longBitsToDouble(0x2F3E5D38238405D7L ^ 0x10DE5D38238405D7L), (Entity)o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field15205.Method365()) >= o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) {
            n = (int)((long)-1651584383 ^ (long)-1651584384);
            return n != 0;
        }
        n = (int)((long)-1136944712 ^ (long)-1136944712);
        return n != 0;
    }

    private static boolean Method6101(EntityPlayer entityPlayer) {
        int n;
        if (entityPlayer != o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && !n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3042(entityPlayer) && !(o0UJ3ZHUnKZj801RvbweGY0QVL3B3BVZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) > Float.intBitsToFloat(0x7978309 ^ 0x46E78309))) {
            n = (int)357797450L ^ 0x15538E4B;
            return n != 0;
        }
        n = (int)((long)1910672943 ^ (long)1910672943);
        return n != 0;
    }

    private String Method6102() {
        return "[" + this.Field15194.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1630733034 ^ (long)-1630733034);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)467346830 ^ (long)467346801);
            int n2 = (int)-1011811933L ^ 0xC3B0F9F8;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1470195180 ^ (long)-1470185863) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

