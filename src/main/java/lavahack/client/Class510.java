//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.client.config.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.resources.*;
import net.minecraft.client.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.item.*;
import java.nio.charset.*;
import org.apache.commons.io.*;
import java.io.*;
import java.util.*;

public class Class510 extends Class593
{
    private Class1470 Field10146;
    private Class1081 Field10147;
    private GuiUnicodeGlyphButton Field10148;
    private GuiButton Field10149;
    private GuiButton Field10150;
    private final String Field10151;
    private final String Field10152;
    protected final List Field10153;
    private int Field10154;
    
    public Class510(final GuiScreen guiScreen) {
        super(guiScreen);
        this.Field10147 = Class1081.Method4362(Class32.Field7992);
        this.Field10148 = null;
        this.Field10149 = null;
        this.Field10150 = null;
        this.Field10151 = I18n.format("schematica.gui.materialname", new Object[0]);
        this.Field10152 = I18n.format("schematica.gui.materialamount", new Object[0]);
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        this.Field10153 = new Class1342().Method5398((EntityPlayer)getMinecraft.player, Class46.Field8122, (World)getMinecraft.world);
        this.Field10147.Method4360(this.Field10153);
    }
    
    @Override
    public void initGui() {
        int n = 0;
        this.Field10148 = new GuiUnicodeGlyphButton(++n, this.width / 2 - 154, this.height - 30, 100, 20, " " + I18n.format("schematica.gui.material" + this.Field10147.Field12825, new Object[0]), this.Field10147.Field12826, 2.0f);
        this.buttonList.add(this.Field10148);
        this.Field10149 = new GuiButton(++n, this.width / 2 - 50, this.height - 30, 100, 20, I18n.format("schematica.gui.materialdump", new Object[0]));
        this.buttonList.add(this.Field10149);
        this.Field10150 = new GuiButton(++n, this.width / 2 + 54, this.height - 30, 100, 20, I18n.format("schematica.gui.done", new Object[0]));
        this.buttonList.add(this.Field10150);
        this.Field10146 = new Class1470(this);
    }
    
    public void Method2353() throws IOException {
        super.handleMouseInput();
        this.Field10146.handleMouseInput();
    }
    
    protected void Method2354(final GuiButton guiButton) {
        if (guiButton.enabled) {
            if (guiButton.id == this.Field10148.id) {
                (this.Field10147 = this.Field10147.Method4361()).Method4360(this.Field10153);
                this.Field10148.displayString = " " + I18n.format("schematica.gui.material" + this.Field10147.Field12825, new Object[0]);
                this.Field10148.glyph = this.Field10147.Field12826;
                Class32.Field8015.set(String.valueOf(this.Field10147));
                Class32.Method253();
            }
            else if (guiButton.id == this.Field10149.id) {
                this.Method2356(this.Field10153);
            }
            else if (guiButton.id == this.Field10150.id) {
                this.mc.displayGuiScreen(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            }
            else {
                this.Field10146.actionPerformed(guiButton);
            }
        }
    }
    
    public void Method2355(final ItemStack itemStack, final int n, final int n2) {
        super.renderToolTip(itemStack, n, n2);
    }
    
    @Override
    public void drawScreen(final int n, final int n2, final float n3) {
        this.Field10146.drawScreen(n, n2, n3);
        this.drawString(this.fontRenderer, this.Field10151, this.width / 2 - 108, 4, 16777215);
        this.drawString(this.fontRenderer, this.Field10152, this.width / 2 + 108 - this.fontRenderer.getStringWidth(this.Field10152), 4, 16777215);
        super.drawScreen(n, n2, n3);
    }
    
    private void Method2356(final List list) {
        if (list.size() <= 0) {
            return;
        }
        int max = 0;
        int max2 = 0;
        for (final Class1947 class1947 : list) {
            max = Math.max(max, class1947.Method7229().length());
            max2 = Math.max(max2, class1947.Field16999);
        }
        final int length = String.valueOf(max2).length();
        final String string = "%-" + max + "s";
        final String string2 = "%" + length + "d";
        final StringBuilder a = new StringBuilder((max + 1 + length) * list.size());
        final Formatter formatter = new Formatter(a);
        for (final Class1947 class1948 : list) {
            formatter.format(string, class1948.Method7229());
            a.append(" ");
            formatter.format(string2, class1948.Field16999);
            a.append(System.lineSeparator());
        }
        final FileOutputStream fileOutputStream = new FileOutputStream(new File(Class2101.Field17565.Method412("dumps"), "schematica-materials.txt"));
        final Object o = null;
        IOUtils.write(a.toString(), (OutputStream)fileOutputStream, Charset.forName("utf-8"));
        if (fileOutputStream != null) {
            if (o != null) {
                fileOutputStream.close();
            }
            else {
                fileOutputStream.close();
            }
        }
    }
    
    private static String Method2357(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x21B2 ^ 0x97));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
