//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.item.*;
import java.util.function.*;
import net.minecraftforge.client.event.*;
import org.lwjgl.opengl.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1422 extends Class1249
{
    private final Class44 Field14618;
    private int Field14619;
    
    public Class1422() {
        super("PvpResources", "PvpResources", true);
        this.Field14618 = this.Method23(new Class44("Style", (Class42)this, Class652.Field10794));
    }
    
    public static int Method5681(final Item item) {
        return Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.inventory.mainInventory.stream().filter(Class1422::Method5685).mapToInt(ItemStack::getCount).sum() + ((Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHeldItemOffhand().getItem() == item) ? Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHeldItemOffhand().getCount() : 0);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method5682(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        final int n = (int)this.Method267();
        final int n2 = (int)this.Method268();
        GL11.glEnable(2929);
        if (this.Field14618.Method341() == Class652.Field10794) {
            this.Method5683(n, n2);
        }
        else {
            this.Method5684(n, n2);
        }
        GL11.glDisable(2929);
        GL11.glDisable(2896);
    }
    
    private void Method5683(final int n, final int n2) {
        int n3 = 0;
        Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById(426), 1), n, n2 + n3);
        Class753.renderItemOverlayIntoGUI(n, n2 + n3, "" + Method5681(Item.getItemById(426)));
        n3 += 20;
        Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById(384), 1), n, n2 + n3);
        Class753.renderItemOverlayIntoGUI(n, n2 + n3, "" + Method5681(Item.getItemById(384)));
        n3 += 20;
        Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById(322), 1), n, n2 + n3);
        Class753.renderItemOverlayIntoGUI(n, n2 + n3, "" + Method5681(Item.getItemById(322)));
        n3 += 20;
        Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById(449), 1), n, n2 + n3);
        Class753.renderItemOverlayIntoGUI(n, n2 + n3, "" + Method5681(Item.getItemById(449)));
        this.Method273(Double.longBitsToDouble(4626322717216342016L));
        this.Method274(Double.longBitsToDouble((long)1822273291 ^ 0x405400006C9DAF0BL));
    }
    
    private void Method5684(final int n, final int n2) {
        Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById(426), 1), n, n2);
        Class753.renderItemOverlayIntoGUI(n, n2, "" + Method5681(Item.getItemById(426)));
        Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById(384), 1), n, n2 + 20);
        Class753.renderItemOverlayIntoGUI(n, n2 + 20, "" + Method5681(Item.getItemById(384)));
        Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById(322), 1), n + 20, n2);
        Class753.renderItemOverlayIntoGUI(n + 20, n2, "" + Method5681(Item.getItemById(322)));
        Class1422.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(new ItemStack(Item.getItemById(449), 1), n + 20, n2 + 20);
        Class753.renderItemOverlayIntoGUI(n + 20, n2 + 20, "" + Method5681(Item.getItemById(449)));
        this.Method273(Double.longBitsToDouble(4630826316843712512L));
        this.Method274(Double.longBitsToDouble(4630826316843712512L));
    }
    
    private static boolean Method5685(final Item item, final ItemStack itemStack) {
        return itemStack.getItem() == item;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x204 ^ 0x9F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
