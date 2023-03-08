//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.renderer.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.function.*;

public class Class1898 extends Class1249
{
    private int Field16730;
    private int Field16731;
    private int Field16732;
    private final Class44 Field16733;
    private final Class44 Field16734;
    private final Class44 Field16735;
    private int Field16736;
    
    public Class1898() {
        super("ArmorHud", "ArmorHUD");
        this.Field16733 = this.Method23(new Class44("Astolfo", (Class42)this, true));
        this.Field16734 = this.Method23(new Class44("Extra Info", (Class42)this, false));
        this.Field16735 = this.Method23(new Class44("Damage", (Class42)this, true));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7039(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        if (Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player == null && Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.world == null) {
            return;
        }
        final ScaledResolution resolution = renderGameOverlayEvent$Text.getResolution();
        final RenderItem getRenderItem = Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem();
        final int n = resolution.getScaledWidth() / 2;
        int n2 = 0;
        final int n3 = resolution.getScaledHeight() - 55 - (Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.isInWater() ? 10 : 0);
        for (final ItemStack itemStack : Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.armorInventory) {
            ++n2;
            if (itemStack.isEmpty()) {
                continue;
            }
            final int n4 = n - 90 + (9 - n2) * this.Field16732 + this.Field16731;
            GlStateManager.enableDepth();
            getRenderItem.zLevel = Float.intBitsToFloat(1128792064);
            getRenderItem.renderItemAndEffectIntoGUI(itemStack, n4, n3);
            getRenderItem.renderItemOverlayIntoGUI(Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer, itemStack, n4, n3, "");
            getRenderItem.zLevel = 0.0f;
            GlStateManager.enableTexture2D();
            GlStateManager.disableLighting();
            GlStateManager.disableDepth();
            final String s = (itemStack.getCount() > 1) ? (itemStack.getCount() + "") : "";
            final int n5 = this.Field16733.Method365() ? Class1172.Method4709(100, 100) : -1;
            Class1178.Method4745(s, (double)(n4 + 19 - 2 - Class1178.Method4741(s)), (double)(n3 + 9), n5);
            if (this.Field16735.Method365()) {
                final int n6 = 100 - (int)((1.0f - (itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / itemStack.getMaxDamage()) * Float.intBitsToFloat(1120403456));
                Class1178.Method4745(n6 + "", (double)(n4 + 8 - Class1178.Method4741(n6 + "") / 2), (double)(n3 - 11), n5);
            }
            if (this.Field16734.Method365()) {
                final ItemStack getHeldItemOffhand = Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHeldItemOffhand();
                this.Field16730 = this.Method7040(Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHeldItemOffhand().getItem());
                GlStateManager.pushMatrix();
                GlStateManager.disableAlpha();
                GlStateManager.clear(256);
                GlStateManager.enableBlend();
                GlStateManager.pushAttrib();
                RenderHelper.enableGUIStandardItemLighting();
                GlStateManager.disableDepth();
                Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(getHeldItemOffhand, 572, n3);
                getRenderItem.renderItemOverlayIntoGUI(Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer, getHeldItemOffhand, 572, n3, String.valueOf(this.Field16730));
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
                final Item getItem = Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.getCurrentItem().getItem();
                final int getCount = Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.getCurrentItem().getCount();
                final ItemStack itemStack2 = new ItemStack(getItem, 1);
                GlStateManager.pushMatrix();
                GlStateManager.disableAlpha();
                GlStateManager.clear(256);
                GlStateManager.enableBlend();
                GlStateManager.pushAttrib();
                RenderHelper.enableGUIStandardItemLighting();
                GlStateManager.disableDepth();
                Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(itemStack2, 556, n3);
                getRenderItem.renderItemOverlayIntoGUI(Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer, itemStack2, 556, n3, String.valueOf(getCount));
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
            }
            else {
                this.Field16731 = 2;
                this.Field16732 = 20;
            }
            GlStateManager.enableDepth();
            GlStateManager.disableLighting();
        }
        GlStateManager.enableTexture2D();
        GlStateManager.enableDepth();
        GlStateManager.disableLighting();
    }
    
    private int Method7040(final Item item) {
        return Class1898.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.offHandInventory.stream().filter(Class1898::Method7041).mapToInt(ItemStack::getCount).sum();
    }
    
    private static boolean Method7041(final Item item, final ItemStack itemStack) {
        return itemStack.getItem() == item;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x59B7 ^ 0xF7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
