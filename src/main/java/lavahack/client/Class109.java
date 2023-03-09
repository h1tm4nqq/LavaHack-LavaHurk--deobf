//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockShulkerBox
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.inventory.ItemStackHelper
 *  net.minecraft.item.ItemShulkerBox
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.NonNullList
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import java.awt.Color;
import java.util.function.Predicate;
import lavahack.client.Class1178;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1996;
import lavahack.client.Class272;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.block.BlockShulkerBox;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemShulkerBox;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class Class109
extends Class42 {
    public Class44 Field8379 = this.Method23(new Class44("Container Shadow", (Class42)this, false));
    public Class44 Field8380 = this.Method23(new Class44("Item ESP", (Class42)this, false));
    private final Class1996 Field8381 = this.Method24(new Class1996(new Class44("Tool Tip", this)));
    private final Class44 Field8382 = this.Method23(this.Field8381.Method7405(new Class44("Shulkers", (Class42)this, false)));
    private final Class44 Field8383 = this.Method23(this.Field8381.Method7405(new Class44("Scrollable", (Class42)this, false)));
    public static Class109 Field8384;
    @Class1801
    private final Class618 Field8385 = new Class618(this::Method826, new Predicate[0]);
    private String Field8386 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class109() {
        super("ContainerModifier", Class97.Field8342);
        Field8384 = this;
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field8385);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field8385);
    }

    private void Method825(ItemStack itemStack, int n, int n2) {
        NBTTagCompound nBTTagCompound = itemStack.getTagCompound();
        GlStateManager.enableBlend();
        GlStateManager.disableRescaleNormal();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableLighting();
        GlStateManager.disableDepth();
        float f = Math.max(144, Class1178.Method4741(itemStack.getDisplayName()) + 3);
        int n3 = n + 12;
        int n4 = n2 - 12;
        int n5 = 48 + Class1178.Method4748();
        Class109.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().zLevel = Float.intBitsToFloat(1133903872);
        Color color = new Color(((BlockShulkerBox)((ItemShulkerBox)itemStack.getItem()).getBlock()).getColor().getColorValue());
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), 150);
        GuiScreen.drawRect((int)(n3 - 3), (int)(n4 - 3), (int)((int)((float)n3 + f + Float.intBitsToFloat(0x40400000))), (int)(n4 + n5 + 3), (int)color2.getRGB());
        Class1178.Method4745(itemStack.getDisplayName(), n + 12, n2 - 12, -1);
        GlStateManager.enableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
        GlStateManager.enableLighting();
        GlStateManager.enableDepth();
        RenderHelper.enableGUIStandardItemLighting();
        if (nBTTagCompound != null) {
            NBTTagCompound nBTTagCompound2 = nBTTagCompound.getCompoundTag("BlockEntityTag");
            NonNullList nonNullList = NonNullList.withSize((int)27, (Object)ItemStack.EMPTY);
            ItemStackHelper.loadAllItems((NBTTagCompound)nBTTagCompound2, (NonNullList)nonNullList);
            for (int i = 0; i < nonNullList.size(); ++i) {
                int n6 = n + i % 9 * 16 + 11;
                int n7 = n2 + i / 9 * 16 - 11 + 8;
                ItemStack itemStack2 = (ItemStack)nonNullList.get(i);
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().renderItemAndEffectIntoGUI(itemStack2, n6, n7);
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().renderItemOverlayIntoGUI(Class109.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer, itemStack2, n6, n7, null);
            }
        }
        RenderHelper.disableStandardItemLighting();
        Class109.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().zLevel = 0.0f;
        GlStateManager.enableLighting();
        GlStateManager.enableDepth();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enableRescaleNormal();
    }

    private void Method826(Class272 class272) {
        if (this.Field8382.Method365() && class272.Field9200.getItem() instanceof ItemShulkerBox) {
            this.Method825(class272.Field9200, class272.Field9201, class272.Field9202);
            class272.Method158();
            return;
        }
        if (!this.Field8383.Method365()) return;
        if (class272.Field9202 >= 0) return;
        int n = Mouse.getDWheel();
        if (n == 0) return;
        if (null.Field11783.Method365() && Keyboard.isKeyDown((int)null.Field11784.Method337())) {
            class272.Field9201 = n < 0 ? class272.Field9201 + 10 : class272.Field9201 - 10;
            return;
        }
        class272.Field9201 = n < 0 ? class272.Field9201 - 10 : class272.Field9201 + 10;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 231;
            cArray2[n] = (char)(cArray[n] ^ (0x3A75 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

