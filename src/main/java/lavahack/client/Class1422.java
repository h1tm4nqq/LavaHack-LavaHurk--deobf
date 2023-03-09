//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import lavahack.client.Class1249;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class652;
import lavahack.client.Class753;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Class1422
extends Class1249 {
    private final Class44 Field14618 = this.Method23(new Class44("Style", (Class42)this, Class652.Field10794));
    private int Field14619;

    public Class1422() {
        super("PvpResources", "PvpResources", true);
    }

    public static int Method5681(Item item) {
        int n;
        int n2 = Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.mainInventory.stream().filter(arg_0 -> Class1422.Method5685(item, arg_0)).mapToInt(ItemStack::getCount).sum();
        if (Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHeldItemOffhand().getItem() == item) {
            n = Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHeldItemOffhand().getCount();
            return n2 + n;
        }
        n = 0;
        return n2 + n;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5682(RenderGameOverlayEvent.Text text) {
        int n = (int)this.Method267();
        int n2 = (int)this.Method268();
        GL11.glEnable((int)2929);
        if (this.Field14618.Method341() == Class652.Field10794) {
            this.Method5683(n, n2);
        } else {
            this.Method5684(n, n2);
        }
        GL11.glDisable((int)2929);
        GL11.glDisable((int)2896);
    }

    private void Method5683(int n, int n2) {
        int n3 = 0;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)426), 1), n, n2 + n3);
        Class753.renderItemOverlayIntoGUI(n, n2 + n3, "" + Class1422.Method5681(Item.getItemById((int)426)));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)384), 1), n, n2 + (n3 += 20));
        Class753.renderItemOverlayIntoGUI(n, n2 + n3, "" + Class1422.Method5681(Item.getItemById((int)384)));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)322), 1), n, n2 + (n3 += 20));
        Class753.renderItemOverlayIntoGUI(n, n2 + n3, "" + Class1422.Method5681(Item.getItemById((int)322)));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)449), 1), n, n2 + (n3 += 20));
        Class753.renderItemOverlayIntoGUI(n, n2 + n3, "" + Class1422.Method5681(Item.getItemById((int)449)));
        this.Method273(Double.longBitsToDouble(0x4034000000000000L));
        this.Method274(Double.longBitsToDouble((long)1822273291 ^ 0x405400006C9DAF0BL));
    }

    private void Method5684(int n, int n2) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)426), 1), n, n2);
        Class753.renderItemOverlayIntoGUI(n, n2, "" + Class1422.Method5681(Item.getItemById((int)426)));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)384), 1), n, n2 + 20);
        Class753.renderItemOverlayIntoGUI(n, n2 + 20, "" + Class1422.Method5681(Item.getItemById((int)384)));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)322), 1), n + 20, n2);
        Class753.renderItemOverlayIntoGUI(n + 20, n2, "" + Class1422.Method5681(Item.getItemById((int)322)));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)449), 1), n + 20, n2 + 20);
        Class753.renderItemOverlayIntoGUI(n + 20, n2 + 20, "" + Class1422.Method5681(Item.getItemById((int)449)));
        this.Method273(Double.longBitsToDouble(0x4044000000000000L));
        this.Method274(Double.longBitsToDouble(0x4044000000000000L));
    }

    private static boolean Method5685(Item item, ItemStack itemStack) {
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
            int n2 = 159;
            cArray2[n] = (char)(cArray[n] ^ (0x204 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

