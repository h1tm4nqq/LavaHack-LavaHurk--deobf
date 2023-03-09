//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.client.config.GuiUnicodeGlyphButton
 */
package lavahack.client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Formatter;
import java.util.List;
import lavahack.client.Class1081;
import lavahack.client.Class1342;
import lavahack.client.Class1470;
import lavahack.client.Class1479;
import lavahack.client.Class1947;
import lavahack.client.Class2101;
import lavahack.client.Class32;
import lavahack.client.Class46;
import lavahack.client.Class593;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.config.GuiUnicodeGlyphButton;
import org.apache.commons.io.IOUtils;

public class Class510
extends Class593 {
    private Class1470 Field10146;
    private Class1081 Field10147 = Class1081.Method4362(Class32.Field7992);
    private GuiUnicodeGlyphButton Field10148 = null;
    private GuiButton Field10149 = null;
    private GuiButton Field10150 = null;
    private final String Field10151 = I18n.format((String)"schematica.gui.materialname", (Object[])new Object[0]);
    private final String Field10152 = I18n.format((String)"schematica.gui.materialamount", (Object[])new Object[0]);
    protected final List Field10153;
    private int Field10154;

    public Class510(GuiScreen guiScreen) {
        super(guiScreen);
        Minecraft minecraft = Minecraft.getMinecraft();
        Class1479 class1479 = Class46.Field8122;
        this.Field10153 = new Class1342().Method5398((EntityPlayer)minecraft.player, class1479, (World)minecraft.world);
        this.Field10147.Method4360(this.Field10153);
    }

    @Override
    public void initGui() {
        int n = 0;
        this.Field10148 = new GuiUnicodeGlyphButton(++n, this.width / 2 - 154, this.height - 30, 100, 20, " " + I18n.format((String)("schematica.gui.material" + this.Field10147.Field12825), (Object[])new Object[0]), this.Field10147.Field12826, 2.0f);
        this.buttonList.add(this.Field10148);
        this.Field10149 = new GuiButton(++n, this.width / 2 - 50, this.height - 30, 100, 20, I18n.format((String)"schematica.gui.materialdump", (Object[])new Object[0]));
        this.buttonList.add(this.Field10149);
        this.Field10150 = new GuiButton(++n, this.width / 2 + 54, this.height - 30, 100, 20, I18n.format((String)"schematica.gui.done", (Object[])new Object[0]));
        this.buttonList.add(this.Field10150);
        this.Field10146 = new Class1470(this);
    }

    public void Method2353() throws IOException {
        super.handleMouseInput();
        this.Field10146.handleMouseInput();
    }

    protected void Method2354(GuiButton guiButton) {
        if (!guiButton.enabled) return;
        if (guiButton.id == this.Field10148.id) {
            this.Field10147 = this.Field10147.Method4361();
            this.Field10147.Method4360(this.Field10153);
            this.Field10148.displayString = " " + I18n.format((String)("schematica.gui.material" + this.Field10147.Field12825), (Object[])new Object[0]);
            this.Field10148.glyph = this.Field10147.Field12826;
            Class32.Field8015.set(String.valueOf((Object)this.Field10147));
            Class32.Method253();
            return;
        }
        if (guiButton.id == this.Field10149.id) {
            this.Method2356(this.Field10153);
            return;
        }
        if (guiButton.id == this.Field10150.id) {
            this.mc.displayGuiScreen(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            return;
        }
        this.Field10146.actionPerformed(guiButton);
    }

    public void Method2355(ItemStack itemStack, int n, int n2) {
        super.renderToolTip(itemStack, n, n2);
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        this.Field10146.drawScreen(n, n2, f);
        this.drawString(this.fontRenderer, this.Field10151, this.width / 2 - 108, 4, 0xFFFFFF);
        this.drawString(this.fontRenderer, this.Field10152, this.width / 2 + 108 - this.fontRenderer.getStringWidth(this.Field10152), 4, 0xFFFFFF);
        super.drawScreen(n, n2, f);
    }

    private void Method2356(List list) {
        Object object3;
        Object object22;
        if (list.size() <= 0) {
            return;
        }
        int n = 0;
        int n2 = 0;
        for (Object object22 : list) {
            n = Math.max(n, ((Class1947)object22).Method7229().length());
            n2 = Math.max(n2, ((Class1947)object22).Field16999);
        }
        int n3 = String.valueOf(n2).length();
        object22 = "%-" + n + "s";
        String string = "%" + n3 + "d";
        StringBuilder stringBuilder = new StringBuilder((n + 1 + n3) * list.size());
        Formatter formatter = new Formatter(stringBuilder);
        for (Object object3 : list) {
            formatter.format((String)object22, ((Class1947)object3).Method7229());
            stringBuilder.append(" ");
            formatter.format(string, ((Class1947)object3).Field16999);
            stringBuilder.append(System.lineSeparator());
        }
        File file = Class2101.Field17565.Method412("dumps");
        object3 = new FileOutputStream(new File(file, "schematica-materials.txt"));
        Object var11_12 = null;
        IOUtils.write(stringBuilder.toString(), (OutputStream)object3, Charset.forName("utf-8"));
        if (object3 == null) return;
        if (var11_12 != null) {
            ((FileOutputStream)object3).close();
            return;
        }
        ((FileOutputStream)object3).close();
    }

    private static String Method2357(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 151;
            cArray2[n] = (char)(cArray[n] ^ (0x21B2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

