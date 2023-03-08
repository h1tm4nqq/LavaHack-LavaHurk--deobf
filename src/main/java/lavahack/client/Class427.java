//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.relauncher.*;
import java.lang.reflect.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.text.*;
import java.awt.*;
import net.minecraft.client.renderer.*;
import java.util.*;
import net.minecraft.client.gui.*;

@SideOnly(Side.CLIENT)
public class Class427 extends GuiScreenBook
{
    private int Field9785;
    private int Field9786;
    private Field Field9787;
    private Field Field9788;
    private Method Field9789;
    private String Field9790 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class427(final EntityPlayer entityPlayer, final ItemStack itemStack) {
        super(entityPlayer, itemStack, true);
        final Class<GuiScreenBook> clazz = GuiScreenBook.class;
        (this.Field9787 = clazz.getDeclaredField("bookGettingSigned")).setAccessible(true);
        (this.Field9788 = clazz.getDeclaredField("bookTitle")).setAccessible(true);
        (this.Field9789 = clazz.getDeclaredMethod("pageInsertIntoCurrent", String.class)).setAccessible(true);
    }
    
    public void initGui() {
        super.initGui();
        this.Field9785 = (this.width - 192) / 2 - 58;
        this.Field9786 = 9;
        final GuiLabel setCentered = new GuiLabel(this.fontRenderer, 0, this.Field9785 + 2, this.Field9786 + 4, 60, 16, -1).setCentered();
        setCentered.addLine("Formatting");
        this.labelList.add(setCentered);
        int n = 0;
        while (true) {
            this.buttonList.add(new Class123(n, this.Field9785 + 16 + n / 8 * 24, this.Field9786 + 21 + n % 8 * 8, this.fontRenderer, TextFormatting.fromColorIndex(n)));
            ++n;
        }
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        Gui.drawRect(this.Field9785, this.Field9786, this.Field9785 + 64, this.Field9786 + 168, new Color(0, 0, 0, 255).getRGB());
        Gui.drawRect(this.Field9785, this.Field9786, this.Field9785 + 64, this.Field9786 + 1, -1);
        Gui.drawRect(this.Field9785, this.Field9786, this.Field9785 + 1, this.Field9786 + 168, -1);
        Gui.drawRect(this.Field9785, this.Field9786 + 167, this.Field9785 + 64, this.Field9786 + 168, -1);
        Gui.drawRect(this.Field9785 + 63, this.Field9786, this.Field9785 + 64, this.Field9786 + 168, -1);
        GlStateManager.pushMatrix();
        final float intBitsToFloat = Float.intBitsToFloat(1060320051);
        GlStateManager.scale(intBitsToFloat, intBitsToFloat, intBitsToFloat);
        int n4 = this.Field9786 + 29 + 64;
        for (final String str : TextFormatting.getValidValues(false, true)) {
            this.drawString(this.fontRenderer, TextFormatting.getValueByName(str).toString() + str, (int)((this.Field9785 + 14) / intBitsToFloat), (int)(n4 / intBitsToFloat), -1);
            n4 += 12;
        }
        GlStateManager.popMatrix();
        super.drawScreen(n, n2, n3);
    }
    
    public void keyTyped(final char c, final int n) {
        if (this.Field9787.get(this)) {
            final String str = (String)this.Field9788.get(this);
            super.keyTyped(c, n);
            if (n != 14 && n != 28 && n != 156 && str.length() < 32) {
                this.Field9788.set(this, str + c);
            }
        }
        else {
            super.keyTyped(c, n);
        }
    }
    
    public void appendFormat(final String str) {
        if (this.Field9787.get(this)) {
            final String str2 = (String)this.Field9788.get(this);
            if (str.length() + str2.length() <= 32) {
                this.Field9788.set(this, str2 + str);
            }
        }
        else {
            this.Field9789.invoke(this, str);
        }
    }
    
    protected void actionPerformed(final GuiButton guiButton) {
        if (guiButton instanceof Class1806) {
            ((Class1806)guiButton).onClick((GuiScreen)this);
        }
        super.actionPerformed(guiButton);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1093 ^ 0xC9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
