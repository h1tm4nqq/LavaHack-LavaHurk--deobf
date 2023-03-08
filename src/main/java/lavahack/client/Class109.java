//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.client.renderer.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import java.awt.*;
import net.minecraft.client.gui.*;
import net.minecraft.util.*;
import net.minecraft.inventory.*;
import net.minecraft.nbt.*;
import org.lwjgl.input.*;

public class Class109 extends Class42
{
    public Class44 Field8379;
    public Class44 Field8380;
    private final Class1996 Field8381;
    private final Class44 Field8382;
    private final Class44 Field8383;
    public static Class109 Field8384;
    @Class1801
    private final Class618 Field8385;
    private String Field8386 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class109() {
        super("ContainerModifier", Class97.Field8342);
        this.Field8379 = this.Method23(new Class44("Container Shadow", this, false));
        this.Field8380 = this.Method23(new Class44("Item ESP", this, false));
        this.Field8381 = this.Method24(new Class1996(new Class44("Tool Tip", this)));
        this.Field8382 = this.Method23(this.Field8381.Method7405(new Class44("Shulkers", this, false)));
        this.Field8383 = this.Method23(this.Field8381.Method7405(new Class44("Scrollable", this, false)));
        this.Field8385 = new Class618(this::Method826, new Predicate[0]);
        Class109.Field8384 = this;
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field8385);
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field8385);
    }
    
    private void Method825(final ItemStack itemStack, final int n, final int n2) {
        final NBTTagCompound getTagCompound = itemStack.getTagCompound();
        GlStateManager.enableBlend();
        GlStateManager.disableRescaleNormal();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableLighting();
        GlStateManager.disableDepth();
        final float n3 = (float)Math.max(144, Class1178.Method4741(itemStack.getDisplayName()) + 3);
        final int n4 = n + 12;
        final int n5 = n2 - 12;
        final int n6 = 48 + Class1178.Method4748();
        Class109.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().zLevel = Float.intBitsToFloat(1133903872);
        final Color color = new Color(((BlockShulkerBox)((ItemShulkerBox)itemStack.getItem()).getBlock()).getColor().getColorValue());
        GuiScreen.drawRect(n4 - 3, n5 - 3, (int)(n4 + n3 + Float.intBitsToFloat(1077936128)), n5 + n6 + 3, new Color(color.getRed(), color.getGreen(), color.getBlue(), 150).getRGB());
        Class1178.Method4745(itemStack.getDisplayName(), n + 12, n2 - 12, -1);
        GlStateManager.enableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
        GlStateManager.enableLighting();
        GlStateManager.enableDepth();
        RenderHelper.enableGUIStandardItemLighting();
        if (getTagCompound != null) {
            final NBTTagCompound getCompoundTag = getTagCompound.getCompoundTag("BlockEntityTag");
            final NonNullList withSize = NonNullList.withSize(27, (Object)ItemStack.EMPTY);
            ItemStackHelper.loadAllItems(getCompoundTag, withSize);
            for (int i = 0; i < withSize.size(); ++i) {
                final int n7 = n + i % 9 * 16 + 11;
                final int n8 = n2 + i / 9 * 16 - 11 + 8;
                final ItemStack itemStack2 = (ItemStack)withSize.get(i);
                Class109.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().renderItemAndEffectIntoGUI(itemStack2, n7, n8);
                Class109.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().renderItemOverlayIntoGUI(Class109.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer, itemStack2, n7, n8, (String)null);
            }
        }
        RenderHelper.disableStandardItemLighting();
        Class109.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().zLevel = 0.0f;
        GlStateManager.enableLighting();
        GlStateManager.enableDepth();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enableRescaleNormal();
    }
    
    private void Method826(final Class272 class272) {
        if (this.Field8382.Method365() && class272.Field9200.getItem() instanceof ItemShulkerBox) {
            this.Method825(class272.Field9200, class272.Field9201, class272.Field9202);
            class272.Method158();
        }
        else if (this.Field8383.Method365() && class272.Field9202 < 0) {
            final int dWheel = Mouse.getDWheel();
            if (dWheel != 0) {
                if (null.Field11783.Method365() && Keyboard.isKeyDown(null.Field11784.Method337())) {
                    class272.Field9201 = ((dWheel < 0) ? (class272.Field9201 + 10) : (class272.Field9201 - 10));
                    return;
                }
                class272.Field9201 = ((dWheel < 0) ? (class272.Field9201 - 10) : (class272.Field9201 + 10));
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3A75 ^ 0xE7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
