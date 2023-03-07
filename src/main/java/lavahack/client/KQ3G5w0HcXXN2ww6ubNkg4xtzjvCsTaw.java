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
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private int Field16730;
    private int Field16731;
    private int Field16732;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16733 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1212011401L ^ 0x483DD388) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16734 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Extra Info", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)914399200L ^ 0x36809FE0) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16735 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Damage", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1032601974 ^ (long)-1032601973)));
    private int Field16736;

    public KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw() {
        super("ArmorHud", "ArmorHUD");
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7039(RenderGameOverlayEvent.Text text) {
        if (KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player == null && KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.world == null) {
            return;
        }
        ScaledResolution scaledResolution = text.getResolution();
        RenderItem renderItem = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem();
        int n = scaledResolution.getScaledWidth() / ((int)((long)-1793984258 ^ (long)-1793984257) << 1);
        int n2 = (int)((long)-1011107879 ^ (long)-1011107879);
        int n3 = scaledResolution.getScaledHeight() - ((int)-939621055L ^ 0xC7FE8576) - (KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.isInWater() ? ((int)610014364L ^ 0x245C1499) << 1 : (int)((long)-1282388392 ^ (long)-1282388392));
        Iterator iterator = KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.armorInventory.iterator();
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
            int n4 = n - ((int)((long)1342516674 ^ (long)1342516719) << 1) + ((int)((long)35287097 ^ (long)35287088) - n2) * this.Field16732 + this.Field16731;
            GlStateManager.enableDepth();
            renderItem.zLevel = Float.intBitsToFloat((int)1465435882L ^ 0x1410C6EA);
            renderItem.renderItemAndEffectIntoGUI(itemStack, n4, n3);
            renderItem.renderItemOverlayIntoGUI(KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer, itemStack, n4, n3, "");
            renderItem.zLevel = 0.0f;
            GlStateManager.enableTexture2D();
            GlStateManager.disableLighting();
            GlStateManager.disableDepth();
            String string = itemStack.getCount() > (int)((long)-1384451171 ^ (long)-1384451172) ? itemStack.getCount() + "" : "";
            int n5 = this.Field16733.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)-981397091L ^ 0xC5811184) << 2, (int)((long)1923451728 ^ (long)1923451721) << 2) : (int)((long)1658464255 ^ (long)-1658464256);
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, n4 + ((int)-1206135162L ^ 0xB81BD695) - ((int)((long)-168904336 ^ (long)-168904335) << 1) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string), n3 + (int)((long)-771166231 ^ (long)-771166240), n5);
            if (this.Field16735.Method365()) {
                float f = ((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / (float)itemStack.getMaxDamage();
                float f2 = 1.0f - f;
                int n6 = ((int)((long)-2142812410 ^ (long)-2142812385) << 2) - (int)(f2 * Float.intBitsToFloat(0x27F14D7D ^ 0x65394D7D));
                fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(n6 + "", n4 + ((int)((long)374978294 ^ (long)374978295) << 3) - fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(n6 + "") / ((int)((long)1518320101 ^ (long)1518320100) << 1), n3 - ((int)-57814631L ^ 0xFC8DD192), n5);
            }
            if (this.Field16734.Method365()) {
                ItemStack itemStack2 = KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHeldItemOffhand();
                Item item = KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHeldItemOffhand().getItem();
                this.Field16730 = this.Method7040(item);
                GlStateManager.pushMatrix();
                GlStateManager.disableAlpha();
                GlStateManager.clear((int)(((int)535996761L ^ 0x1FF2A958) << 8));
                GlStateManager.enableBlend();
                GlStateManager.pushAttrib();
                RenderHelper.enableGUIStandardItemLighting();
                GlStateManager.disableDepth();
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(itemStack2, (int)((long)1854024895 ^ (long)1854024752) << 2, n3);
                renderItem.renderItemOverlayIntoGUI(KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer, itemStack2, ((int)1466601347L ^ 0x576A8F0C) << 2, n3, String.valueOf(this.Field16730));
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
                Item item = KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.getCurrentItem().getItem();
                int n7 = KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.getCurrentItem().getCount();
                ItemStack itemStack3 = new ItemStack(item, (int)((long)1616876944 ^ (long)1616876945));
                GlStateManager.pushMatrix();
                GlStateManager.disableAlpha();
                GlStateManager.clear((int)((int)((long)2097674997 ^ (long)2097674996) << 8));
                GlStateManager.enableBlend();
                GlStateManager.pushAttrib();
                RenderHelper.enableGUIStandardItemLighting();
                GlStateManager.disableDepth();
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(itemStack3, ((int)-1019028294L ^ 0xC342DC31) << 2, n3);
                renderItem.renderItemOverlayIntoGUI(KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer, itemStack3, ((int)1046246011L ^ 0x3E5C72F0) << 2, n3, String.valueOf(n7));
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
                this.Field16731 = (int)((long)302906805 ^ (long)302906802) << 1;
                this.Field16732 = (int)((long)885721067 ^ (long)885721082);
            } else {
                this.Field16731 = ((int)2049523631L ^ 0x7A293FAE) << 1;
                this.Field16732 = (int)((long)1451406469 ^ (long)1451406464) << 2;
            }
            GlStateManager.enableDepth();
            GlStateManager.disableLighting();
        }
    }

    private int Method7040(Item item) {
        return KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.offHandInventory.stream().filter(arg_0 -> KQ3G5w0HcXXN2ww6ubNkg4xtzjvCsTaw.Method7041(item, arg_0)).mapToInt(ItemStack::getCount).sum();
    }

    private static boolean Method7041(Item item, ItemStack itemStack) {
        int n;
        if (itemStack.getItem() == item) {
            n = (int)((long)-1498685746 ^ (long)-1498685745);
            return n != 0;
        }
        n = (int)((long)692849010 ^ (long)692849010);
        return n != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-177394876L ^ 0xF56D2B44;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1618678084L ^ 0x9F84EE43);
            int n2 = (int)((long)1863790213 ^ (long)1863790194);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-107766366 ^ (long)-107756523) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

