//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiLabel
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiScreenBook
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package lavahack.client;

import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import lavahack.client.Class123;
import lavahack.client.Class1806;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiLabel;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class Class427
extends GuiScreenBook {
    private int Field9785;
    private int Field9786;
    private Field Field9787;
    private Field Field9788;
    private Method Field9789;
    private String Field9790 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class427(EntityPlayer entityPlayer, ItemStack itemStack) {
        super(entityPlayer, itemStack, true);
        Class<GuiScreenBook> clazz = GuiScreenBook.class;
        this.Field9787 = clazz.getDeclaredField("bookGettingSigned");
        this.Field9787.setAccessible(true);
        this.Field9788 = clazz.getDeclaredField("bookTitle");
        this.Field9788.setAccessible(true);
        this.Field9789 = clazz.getDeclaredMethod("pageInsertIntoCurrent", String.class);
        this.Field9789.setAccessible(true);
    }

    public void initGui() {
        super.initGui();
        this.Field9785 = (this.width - 192) / 2 - 58;
        this.Field9786 = 9;
        GuiLabel guiLabel = new GuiLabel(this.fontRenderer, 0, this.Field9785 + 2, this.Field9786 + 4, 60, 16, -1).setCentered();
        guiLabel.addLine("Formatting");
        this.labelList.add(guiLabel);
        int n = 0;
        while (true) {
            this.buttonList.add(new Class123(n, this.Field9785 + 16 + n / 8 * 24, this.Field9786 + 21 + n % 8 * 8, this.fontRenderer, TextFormatting.fromColorIndex((int)n)));
            ++n;
        }
    }

    public void drawScreen(int n, int n2, float f) {
        Gui.drawRect((int)this.Field9785, (int)this.Field9786, (int)(this.Field9785 + 64), (int)(this.Field9786 + 168), (int)new Color(0, 0, 0, 255).getRGB());
        Gui.drawRect((int)this.Field9785, (int)this.Field9786, (int)(this.Field9785 + 64), (int)(this.Field9786 + 1), (int)-1);
        Gui.drawRect((int)this.Field9785, (int)this.Field9786, (int)(this.Field9785 + 1), (int)(this.Field9786 + 168), (int)-1);
        Gui.drawRect((int)this.Field9785, (int)(this.Field9786 + 167), (int)(this.Field9785 + 64), (int)(this.Field9786 + 168), (int)-1);
        Gui.drawRect((int)(this.Field9785 + 63), (int)this.Field9786, (int)(this.Field9785 + 64), (int)(this.Field9786 + 168), (int)-1);
        GlStateManager.pushMatrix();
        float f2 = Float.intBitsToFloat(0x3F333333);
        GlStateManager.scale((float)f2, (float)f2, (float)f2);
        int n3 = this.Field9786 + 29 + 64;
        Iterator iterator = TextFormatting.getValidValues((boolean)false, (boolean)true).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                GlStateManager.popMatrix();
                super.drawScreen(n, n2, f);
                return;
            }
            String string = (String)iterator.next();
            TextFormatting textFormatting = TextFormatting.getValueByName((String)string);
            this.drawString(this.fontRenderer, textFormatting.toString() + string, (int)((float)(this.Field9785 + 14) / f2), (int)((float)n3 / f2), -1);
            n3 += 12;
        }
    }

    public void keyTyped(char c, int n) {
        boolean bl = (Boolean)this.Field9787.get((Object)this);
        if (bl) {
            String string = (String)this.Field9788.get((Object)this);
            super.keyTyped(c, n);
            if (n == 14) return;
            if (n == 28) return;
            if (n == 156) return;
            if (string.length() >= 32) return;
            this.Field9788.set((Object)this, string + c);
            return;
        }
        super.keyTyped(c, n);
    }

    public void appendFormat(String string) {
        boolean bl = (Boolean)this.Field9787.get((Object)this);
        if (bl) {
            String string2 = (String)this.Field9788.get((Object)this);
            if (string.length() + string2.length() > 32) return;
            this.Field9788.set((Object)this, string2 + string);
            return;
        }
        this.Field9789.invoke((Object)this, string);
    }

    protected void actionPerformed(GuiButton guiButton) {
        if (guiButton instanceof Class1806) {
            ((Class1806)guiButton).onClick((GuiScreen)this);
        }
        super.actionPerformed(guiButton);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 201;
            cArray2[n] = (char)(cArray[n] ^ (0x1093 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

