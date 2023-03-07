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
import lavahack.client.FW9OYa5gaEoAnNUyh26vd2QWtlBKLbgH;
import lavahack.client.niKD96fZH1BJpHcWf49iWuSnWOb7YojO;
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
public class lBrg2MUDA5p5lrnps5flXoe96O0snUin
extends GuiScreenBook {
    private int Field9785;
    private int Field9786;
    private Field Field9787;
    private Field Field9788;
    private Method Field9789;
    private String Field9790 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public lBrg2MUDA5p5lrnps5flXoe96O0snUin(EntityPlayer entityPlayer, ItemStack itemStack) {
        super(entityPlayer, itemStack, (boolean)((long)-1921957668 ^ (long)-1921957667));
        Class<GuiScreenBook> clazz = GuiScreenBook.class;
        this.Field9787 = clazz.getDeclaredField("bookGettingSigned");
        this.Field9787.setAccessible(((int)1090006715L ^ 0x40F82EBA) != 0);
        this.Field9788 = clazz.getDeclaredField("bookTitle");
        this.Field9788.setAccessible(((int)-1177592541L ^ 0xB9CF5D22) != 0);
        Class[] classArray = new Class[(int)373028732L ^ 0x163BF77D];
        classArray[(int)-1555005758L ^ 0xA3507EC2] = String.class;
        this.Field9789 = clazz.getDeclaredMethod("pageInsertIntoCurrent", classArray);
        this.Field9789.setAccessible(((int)1391325169L ^ 0x52EDEFF0) != 0);
    }

    public void initGui() {
        super.initGui();
        this.Field9785 = (this.width - ((int)((long)-1259737904 ^ (long)-1259737901) << 6)) / ((int)((long)1369062118 ^ (long)1369062119) << 1) - (((int)-511098065L ^ 0xE1894332) << 1);
        this.Field9786 = (int)813337028L ^ 0x307A89CD;
        GuiLabel guiLabel = new GuiLabel(this.fontRenderer, (int)((long)-2119821480 ^ (long)-2119821480), this.Field9785 + (((int)931686895L ^ 0x378869EE) << 1), this.Field9786 + ((int)((long)515684220 ^ (long)515684221) << 2), (int)((long)1748849424 ^ (long)1748849439) << 2, (int)((long)1505901314 ^ (long)1505901315) << 4, (int)((long)577951462 ^ (long)-577951463)).setCentered();
        guiLabel.addLine("Formatting");
        this.labelList.add(guiLabel);
        int n = (int)((long)-1083709201 ^ (long)-1083709201);
        while (true) {
            int cfr_ignored_0 = (int)((long)-1622395516 ^ (long)-1622395515) << 4;
            this.buttonList.add(new FW9OYa5gaEoAnNUyh26vd2QWtlBKLbgH(n, this.Field9785 + (((int)1169516344L ^ 0x45B56739) << 4) + n / ((int)((long)-896453091 ^ (long)-896453092) << 3) * ((int)((long)2091072982 ^ (long)2091072981) << 3), this.Field9786 + ((int)-1523989833L ^ 0xA529C2A2) + n % (((int)1511506895L ^ 0x5A17C3CE) << 3) * (((int)-281067218L ^ 0xEF3F412F) << 3), this.fontRenderer, TextFormatting.fromColorIndex((int)n)));
            ++n;
        }
    }

    public void drawScreen(int n, int n2, float f) {
        Gui.drawRect((int)this.Field9785, (int)this.Field9786, (int)(this.Field9785 + (((int)804512908L ^ 0x2FF3E48D) << 6)), (int)(this.Field9786 + ((int)((long)-1834152320 ^ (long)-1834152299) << 3)), (int)new Color((int)((long)-1143247581 ^ (long)-1143247581), (int)-71903120L ^ 0xFBB6D870, (int)1688904918L ^ 0x64AAA4D6, (int)-1664287930L ^ 0x9CCCFBB9).getRGB());
        Gui.drawRect((int)this.Field9785, (int)this.Field9786, (int)(this.Field9785 + ((int)((long)-666891070 ^ (long)-666891069) << 6)), (int)(this.Field9786 + (int)((long)-518333720 ^ (long)-518333719)), (int)((int)681616024L ^ 0xD75F5D67));
        Gui.drawRect((int)this.Field9785, (int)this.Field9786, (int)(this.Field9785 + (int)((long)459910323 ^ (long)459910322)), (int)(this.Field9786 + (((int)-1249518888L ^ 0xB585DACD) << 3)), (int)((int)365420475L ^ 0xEA382044));
        Gui.drawRect((int)this.Field9785, (int)(this.Field9786 + ((int)1963437697L ^ 0x7507AE26)), (int)(this.Field9785 + (((int)1161415063L ^ 0x4539C996) << 6)), (int)(this.Field9786 + ((int)((long)2126545843 ^ (long)2126545830) << 3)), (int)((int)79076748L ^ 0xFB496273));
        Gui.drawRect((int)(this.Field9785 + ((int)1526300365L ^ 0x5AF97EF2)), (int)this.Field9786, (int)(this.Field9785 + (((int)510103566L ^ 0x1E67900F) << 6)), (int)(this.Field9786 + ((int)((long)49159863 ^ (long)49159842) << 3)), (int)((int)565420450L ^ 0xDE4C5E5D));
        GlStateManager.pushMatrix();
        float f2 = Float.intBitsToFloat((int)1991539566L ^ 0x4987485D);
        GlStateManager.scale((float)f2, (float)f2, (float)f2);
        int n3 = this.Field9786 + (int)((long)-935915905 ^ (long)-935915934) + ((int)((long)-1780792354 ^ (long)-1780792353) << 6);
        Iterator iterator = TextFormatting.getValidValues((boolean)((long)302276345 ^ (long)302276345), (boolean)((long)781953265 ^ (long)781953264)).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                GlStateManager.popMatrix();
                super.drawScreen(n, n2, f);
                return;
            }
            String string = (String)iterator.next();
            TextFormatting textFormatting = TextFormatting.getValueByName((String)string);
            this.drawString(this.fontRenderer, textFormatting.toString() + string, (int)((float)(this.Field9785 + ((int)((long)-1724508568 ^ (long)-1724508561) << 1)) / f2), (int)((float)n3 / f2), (int)((long)-1447345887 ^ (long)1447345886));
            n3 += 12;
        }
    }

    public void keyTyped(char c, int n) {
        boolean bl = (Boolean)this.Field9787.get((Object)this);
        if (bl) {
            String string = (String)this.Field9788.get((Object)this);
            super.keyTyped(c, n);
            if (n == (int)((long)1782945010 ^ (long)1782945013) << 1) return;
            if (n == ((int)-1244350035L ^ 0xB5D4B9AA) << 2) return;
            if (n == (int)((long)696280551 ^ (long)696280512) << 2) return;
            if (string.length() >= (int)((long)1670990552 ^ (long)1670990553) << 5) return;
            this.Field9788.set((Object)this, string + c);
            return;
        }
        super.keyTyped(c, n);
    }

    public void appendFormat(String string) {
        boolean bl = (Boolean)this.Field9787.get((Object)this);
        if (bl) {
            String string2 = (String)this.Field9788.get((Object)this);
            if (string.length() + string2.length() > (int)((long)-1425744721 ^ (long)-1425744722) << 5) return;
            this.Field9788.set((Object)this, string2 + string);
            return;
        }
        Object[] objectArray = new Object[(int)1128054521L ^ 0x433CBEF8];
        objectArray[(int)((long)1786718525 ^ (long)1786718525)] = string;
        this.Field9789.invoke((Object)this, objectArray);
    }

    protected void actionPerformed(GuiButton guiButton) {
        if (guiButton instanceof niKD96fZH1BJpHcWf49iWuSnWOb7YojO) {
            ((niKD96fZH1BJpHcWf49iWuSnWOb7YojO)guiButton).onClick((GuiScreen)this);
        }
        super.actionPerformed(guiButton);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1756241123 ^ (long)-1756241123);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1191183684 ^ (long)1191183803);
            int n2 = (int)((long)466859584 ^ (long)466859657);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1694972169 ^ (long)1694968218) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

