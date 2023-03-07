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

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14618 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Style", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv.Field10794));
    private int Field14619;

    public Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU() {
        super("PvpResources", "PvpResources", ((int)-296545795L ^ 0xEE5311FC) != 0);
    }

    public static int Method5681(Item item) {
        int n;
        int n2 = Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.mainInventory.stream().filter(arg_0 -> Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU.Method5685(item, arg_0)).mapToInt(ItemStack::getCount).sum();
        if (Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHeldItemOffhand().getItem() == item) {
            n = Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHeldItemOffhand().getCount();
            return n2 + n;
        }
        n = (int)2107547205L ^ 0x7D9E9E45;
        return n2 + n;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5682(RenderGameOverlayEvent.Text text) {
        int n = (int)this.Method267();
        int n2 = (int)this.Method268();
        GL11.glEnable((int)((int)-1119147007L ^ 0xBD4B2770));
        if (this.Field14618.Method341() == X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv.Field10794) {
            this.Method5683(n, n2);
        } else {
            this.Method5684(n, n2);
        }
        GL11.glDisable((int)((int)1427760134L ^ 0x5519EF77));
        GL11.glDisable((int)((int)((long)-1865923642 ^ (long)-1865923725) << 4));
    }

    private void Method5683(int n, int n2) {
        int n3 = (int)((long)-514628633 ^ (long)-514628633);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)((int)((long)452546288 ^ (long)452546085) << 1)), (int)357943405L ^ 0x1555C86C), n, n2 + n3);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.renderItemOverlayIntoGUI(n, n2 + n3, "" + Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU.Method5681(Item.getItemById((int)((int)((long)-981777743 ^ (long)-981777820) << 1))));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)(((int)88195180L ^ 0x541C06F) << 7)), (int)((long)236809208 ^ (long)236809209)), n, n2 + (n3 += 20));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.renderItemOverlayIntoGUI(n, n2 + n3, "" + Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU.Method5681(Item.getItemById((int)((int)((long)1742470994 ^ (long)1742470993) << 7))));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)(((int)646075185L ^ 0x26825390) << 1)), (int)((long)-1238961176 ^ (long)-1238961175)), n, n2 + (n3 += 20));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.renderItemOverlayIntoGUI(n, n2 + n3, "" + Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU.Method5681(Item.getItemById((int)(((int)-2019720145L ^ 0x879D848E) << 1))));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)((int)((long)1203347327 ^ (long)1203347134))), (int)250854564L ^ 0xEF3BCA5), n, n2 + (n3 += 20));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.renderItemOverlayIntoGUI(n, n2 + n3, "" + Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU.Method5681(Item.getItemById((int)((int)-63114006L ^ 0xFC3CF52B))));
        this.Method273(Double.longBitsToDouble(0x6E23B49A56808AE7L ^ 0x2E17B49A56808AE7L));
        this.Method274(Double.longBitsToDouble((long)1822273291 ^ 0x405400006C9DAF0BL));
    }

    private void Method5684(int n, int n2) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)((int)((long)-570108627 ^ (long)-570108424) << 1)), (int)-718492291L ^ 0xD52CAD7C), n, n2);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.renderItemOverlayIntoGUI(n, n2, "" + Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU.Method5681(Item.getItemById((int)(((int)1797305886L ^ 0x6B20B6CB) << 1))));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)((int)((long)-676204502 ^ (long)-676204503) << 7)), (int)((long)214753065 ^ (long)214753064)), n, n2 + (((int)-1169816159L ^ 0xBA4605A4) << 2));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.renderItemOverlayIntoGUI(n, n2 + ((int)((long)-60562907 ^ (long)-60562912) << 2), "" + Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU.Method5681(Item.getItemById((int)((int)((long)1762578740 ^ (long)1762578743) << 7))));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)(((int)-397575748L ^ 0xE84D791D) << 1)), (int)-1417926396L ^ 0xAB7C2905), n + (((int)595381316L ^ 0x237CCC41) << 2), n2);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.renderItemOverlayIntoGUI(n + ((int)((long)1707197554 ^ (long)1707197559) << 2), n2, "" + Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU.Method5681(Item.getItemById((int)((int)((long)1765263022 ^ (long)1765262863) << 1))));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById((int)((int)1053109212L ^ 0x3EC52A1D)), (int)((long)2023931728 ^ (long)2023931729)), n + ((int)((long)-1600763849 ^ (long)-1600763854) << 2), n2 + ((int)((long)-1308225521 ^ (long)-1308225526) << 2));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.renderItemOverlayIntoGUI(n + (((int)-1192465243L ^ 0xB8EC6CA0) << 2), n2 + ((int)((long)695148016 ^ (long)695148021) << 2), "" + Yf3W3Q5sA4ONDZ0DpsytIoajFekAUogU.Method5681(Item.getItemById((int)((int)528480175L ^ 0x1F7FF66E))));
        this.Method273(Double.longBitsToDouble(0xA9A5CF0C7A6530AFL ^ 0xE9E1CF0C7A6530AFL));
        this.Method274(Double.longBitsToDouble(0x5DEFD72AB2AE9087L ^ 0x1DABD72AB2AE9087L));
    }

    private static boolean Method5685(Item item, ItemStack itemStack) {
        boolean bl;
        if (itemStack.getItem() == item) {
            bl = (int)-980482786L ^ 0xC58F051F;
            return bl;
        }
        bl = (int)1150679168L ^ 0x4495F880;
        return bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)674328005L ^ 0x28316DC5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-652958131L ^ 0xD914A6B2);
            int n2 = (int)((long)1661573750 ^ (long)1661573865);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1446787442 ^ (long)1446787571) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

