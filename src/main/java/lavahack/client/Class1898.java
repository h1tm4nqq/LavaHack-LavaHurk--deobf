//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.RenderItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class42;
import lavahack.client.Class44;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1898
extends Class1249 {
    private int Field16730;
    private int Field16731;
    private int Field16732;
    private final Class44 Field16733 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private final Class44 Field16734 = this.Method23(new Class44("Extra Info", (Class42)this, false));
    private final Class44 Field16735 = this.Method23(new Class44("Damage", (Class42)this, true));
    private int Field16736;

    public Class1898() {
        super("ArmorHud", "ArmorHUD");
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7039(RenderGameOverlayEvent.Text text) {
        if (Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player == null && Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.world == null) {
            return;
        }
        ScaledResolution scaledResolution = text.getResolution();
        RenderItem renderItem = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem();
        int n = scaledResolution.getScaledWidth() / 2;
        int n2 = 0;
        int n3 = scaledResolution.getScaledHeight() - 55 - (Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.isInWater() ? 10 : 0);
        Iterator iterator = Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.armorInventory.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                GlStateManager.enableTexture2D();
                GlStateManager.enableDepth();
                GlStateManager.disableLighting();
                return;
            }
            ItemStack itemStack = (ItemStack)iterator.next();
            ++n2;
            if (itemStack.isEmpty()) continue;
            int n4 = n - 90 + (9 - n2) * this.Field16732 + this.Field16731;
            GlStateManager.enableDepth();
            renderItem.zLevel = Float.intBitsToFloat(1128792064);
            renderItem.renderItemAndEffectIntoGUI(itemStack, n4, n3);
            renderItem.renderItemOverlayIntoGUI(Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer, itemStack, n4, n3, "");
            renderItem.zLevel = 0.0f;
            GlStateManager.enableTexture2D();
            GlStateManager.disableLighting();
            GlStateManager.disableDepth();
            String string = itemStack.getCount() > 1 ? itemStack.getCount() + "" : "";
            int n5 = this.Field16733.Method365() ? Class1172.Method4709(100, 100) : -1;
            Class1178.Method4745(string, n4 + 19 - 2 - Class1178.Method4741(string), n3 + 9, n5);
            if (this.Field16735.Method365()) {
                float f = ((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / (float)itemStack.getMaxDamage();
                float f2 = 1.0f - f;
                int n6 = 100 - (int)(f2 * Float.intBitsToFloat(1120403456));
                Class1178.Method4745(n6 + "", n4 + 8 - Class1178.Method4741(n6 + "") / 2, n3 - 11, n5);
            }
            if (this.Field16734.Method365()) {
                ItemStack itemStack2 = Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHeldItemOffhand();
                Item item = Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHeldItemOffhand().getItem();
                this.Field16730 = this.Method7040(item);
                GlStateManager.pushMatrix();
                GlStateManager.disableAlpha();
                GlStateManager.clear((int)256);
                GlStateManager.enableBlend();
                GlStateManager.pushAttrib();
                RenderHelper.enableGUIStandardItemLighting();
                GlStateManager.disableDepth();
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(itemStack2, 572, n3);
                renderItem.renderItemOverlayIntoGUI(Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer, itemStack2, 572, n3, String.valueOf(this.Field16730));
                GlStateManager.enableDepth();
                RenderHelper.disableStandardItemLighting();
                GlStateManager.popAttrib();
                GlStateManager.disableBlend();
                GlStateManager.disableDepth();
                GlStateManager.disableLighting();
                GlStateManager.enableDepth();
                GlStateManager.enableAlpha();
                GlStateManager.popMatrix();
            }
            if (this.Field16734.Method365()) {
                Item item = Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.getCurrentItem().getItem();
                int n7 = Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.getCurrentItem().getCount();
                ItemStack itemStack3 = new ItemStack(item, 1);
                GlStateManager.pushMatrix();
                GlStateManager.disableAlpha();
                GlStateManager.clear((int)256);
                GlStateManager.enableBlend();
                GlStateManager.pushAttrib();
                RenderHelper.enableGUIStandardItemLighting();
                GlStateManager.disableDepth();
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(itemStack3, 556, n3);
                renderItem.renderItemOverlayIntoGUI(Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer, itemStack3, 556, n3, String.valueOf(n7));
                GlStateManager.enableDepth();
                RenderHelper.disableStandardItemLighting();
                GlStateManager.popAttrib();
                GlStateManager.disableBlend();
                GlStateManager.disableDepth();
                GlStateManager.disableLighting();
                GlStateManager.enableDepth();
                GlStateManager.enableAlpha();
                GlStateManager.popMatrix();
            }
            GlStateManager.enableDepth();
            GlStateManager.disableLighting();
            if (this.Field16734.Method365()) {
                this.Field16731 = 14;
                this.Field16732 = 17;
            } else {
                this.Field16731 = 2;
                this.Field16732 = 20;
            }
            GlStateManager.enableDepth();
            GlStateManager.disableLighting();
        }
    }

    private int Method7040(Item item) {
        return Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.offHandInventory.stream().filter(arg_0 -> Class1898.Method7041(item, arg_0)).mapToInt(ItemStack::getCount).sum();
    }

    private static boolean Method7041(Item item, ItemStack itemStack) {
        if (itemStack.getItem() != item) return false;
        return true;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 247;
            cArray2[n] = (char)(cArray[n] ^ (0x59B7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

