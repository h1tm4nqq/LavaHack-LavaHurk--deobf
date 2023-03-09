//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import lavahack.client.Class1093;
import lavahack.client.Class153;
import lavahack.client.Class2101;
import lavahack.client.Class32;
import lavahack.client.Class46;
import lavahack.client.Class593;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class1434
extends Class593 {
    private int Field14700 = 0;
    private int Field14701 = 0;
    private GuiButton Field14702 = null;
    private Class1093 Field14703 = null;
    private Class1093 Field14704 = null;
    private Class1093 Field14705 = null;
    private GuiButton Field14706 = null;
    private Class1093 Field14707 = null;
    private Class1093 Field14708 = null;
    private Class1093 Field14709 = null;
    private GuiButton Field14710 = null;
    private GuiButton Field14711 = null;
    private GuiButton Field14712 = null;
    private GuiTextField Field14713 = null;
    private String Field14714 = "";
    private String Field14715;
    private Iterator Field14716 = null;
    private final String Field14717 = I18n.format((String)"schematica.gui.saveselection", (Object[])new Object[0]);
    private final String Field14718 = I18n.format((String)"schematica.gui.x", (Object[])new Object[0]);
    private final String Field14719 = I18n.format((String)"schematica.gui.y", (Object[])new Object[0]);
    private final String Field14720 = I18n.format((String)"schematica.gui.z", (Object[])new Object[0]);
    private final String Field14721 = I18n.format((String)"schematica.gui.on", (Object[])new Object[0]);
    private final String Field14722 = I18n.format((String)"schematica.gui.off", (Object[])new Object[0]);
    static final boolean Field14723 = !Class1434.class.desiredAssertionStatus();
    private String Field14724 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1434(GuiScreen guiScreen) {
        super(guiScreen);
        this.Field14715 = this.Method5742();
    }

    @Override
    public void initGui() {
        this.Field14700 = this.width / 2;
        this.Field14701 = this.height / 2;
        this.buttonList.clear();
        int n = 0;
        this.Field14702 = new GuiButton(n++, this.Field14700 - 130, this.Field14701 - 55, 100, 20, I18n.format((String)"schematica.gui.point.red", (Object[])new Object[0]));
        this.buttonList.add(this.Field14702);
        this.Field14703 = new Class1093(this.fontRenderer, n++, this.Field14700 - 130, this.Field14701 - 30);
        this.buttonList.add(this.Field14703);
        this.Field14704 = new Class1093(this.fontRenderer, n++, this.Field14700 - 130, this.Field14701 - 5);
        this.buttonList.add(this.Field14704);
        this.Field14705 = new Class1093(this.fontRenderer, n++, this.Field14700 - 130, this.Field14701 + 20);
        this.buttonList.add(this.Field14705);
        this.Field14706 = new GuiButton(n++, this.Field14700 + 30, this.Field14701 - 55, 100, 20, I18n.format((String)"schematica.gui.point.blue", (Object[])new Object[0]));
        this.buttonList.add(this.Field14706);
        this.Field14707 = new Class1093(this.fontRenderer, n++, this.Field14700 + 30, this.Field14701 - 30);
        this.buttonList.add(this.Field14707);
        this.Field14708 = new Class1093(this.fontRenderer, n++, this.Field14700 + 30, this.Field14701 - 5);
        this.buttonList.add(this.Field14708);
        this.Field14709 = new Class1093(this.fontRenderer, n++, this.Field14700 + 30, this.Field14701 + 20);
        this.buttonList.add(this.Field14709);
        this.Field14710 = new GuiButton(n++, this.width - 210, this.height - 55, 50, 20, Class46.Field8117 && Class2101.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro ? this.Field14721 : this.Field14722);
        this.buttonList.add(this.Field14710);
        this.Field14713 = new GuiTextField(n++, this.fontRenderer, this.width - 209, this.height - 29, 153, 18);
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.add(this.Field14713);
        this.Field14712 = new GuiButton(n++, this.width - 50, this.height - 30, 40, 20, I18n.format((String)"schematica.gui.save", (Object[])new Object[0]));
        this.Field14712.enabled = Class46.Field8117 && Class2101.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro || Class46.Field8122 != null;
        this.buttonList.add(this.Field14712);
        this.Field14711 = new GuiButton(n++, this.width - 155, this.height - 55, 145, 20, I18n.format((String)"schematica.gui.format", (Object[])new Object[]{I18n.format((String)Class153.Method999(this.Field14715), (Object[])new Object[0])}));
        this.Field14711.enabled = Class46.Field8117 && Class2101.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro || Class46.Field8122 != null;
        this.buttonList.add(this.Field14711);
        this.Field14713.setMaxStringLength(1024);
        this.Field14713.setText(this.Field14714);
        this.Method5739(this.Field14703);
        this.Method5739(this.Field14704);
        this.Method5739(this.Field14705);
        this.Method5739(this.Field14707);
        this.Method5739(this.Field14708);
        this.Method5739(this.Field14709);
        this.Method5740(this.Field14703, this.Field14704, this.Field14705, Class46.Field8123);
        this.Method5740(this.Field14707, this.Field14708, this.Field14709, Class46.Field8124);
    }

    private void Method5739(Class1093 class1093) {
        class1093.setMinimum(-30000000);
        class1093.setMaximum(30000000);
    }

    private void Method5740(Class1093 class1093, Class1093 class10932, Class1093 class10933, BlockPos blockPos) {
        class1093.setValue(blockPos.getX());
        class10932.setValue(blockPos.getY());
        class10933.setValue(blockPos.getZ());
    }

    protected void Method5741(GuiButton guiButton) {
        if (!guiButton.enabled) return;
        if (guiButton.id == this.Field14702.id) {
            Class46.Method424(Class46.Field8123);
            Class46.Method423();
            this.Method5740(this.Field14703, this.Field14704, this.Field14705, Class46.Field8123);
            return;
        }
        if (guiButton.id == this.Field14703.id) {
            Class46.Field8123.Field7895 = this.Field14703.getValue();
            Class46.Method423();
            return;
        }
        if (guiButton.id == this.Field14704.id) {
            Class46.Field8123.Field7896 = this.Field14704.getValue();
            Class46.Method423();
            return;
        }
        if (guiButton.id == this.Field14705.id) {
            Class46.Field8123.Field7897 = this.Field14705.getValue();
            Class46.Method423();
            return;
        }
        if (guiButton.id == this.Field14706.id) {
            Class46.Method424(Class46.Field8124);
            Class46.Method423();
            this.Method5740(this.Field14707, this.Field14708, this.Field14709, Class46.Field8124);
            return;
        }
        if (guiButton.id == this.Field14707.id) {
            Class46.Field8124.Field7895 = this.Field14707.getValue();
            Class46.Method423();
            return;
        }
        if (guiButton.id == this.Field14708.id) {
            Class46.Field8124.Field7896 = this.Field14708.getValue();
            Class46.Method423();
            return;
        }
        if (guiButton.id == this.Field14709.id) {
            Class46.Field8124.Field7897 = this.Field14709.getValue();
            Class46.Method423();
            return;
        }
        if (guiButton.id == this.Field14710.id) {
            Class46.Field8117 = !Class46.Field8117 && Class2101.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro;
            this.Field14710.displayString = Class46.Field8117 ? this.Field14721 : this.Field14722;
            this.Field14712.enabled = Class46.Field8117 || Class46.Field8122 != null;
            this.Field14711.enabled = Class46.Field8117 || Class46.Field8122 != null;
            return;
        }
        if (guiButton.id == this.Field14711.id) {
            this.Field14715 = this.Method5742();
            this.Field14711.displayString = I18n.format((String)"schematica.gui.format", (Object[])new Object[]{I18n.format((String)Class153.Method999(this.Field14715), (Object[])new Object[0])});
            return;
        }
        if (guiButton.id != this.Field14712.id) return;
        String string = this.Field14713.getText() + Class153.Method1000(this.Field14715);
        if (Class46.Field8117) {
            if (!Class2101.Field17565.Method416((EntityPlayer)this.mc.player, Class32.Field7990, string, (World)this.mc.world, this.Field14715, Class46.Field8125, Class46.Field8126)) return;
            this.Field14714 = "";
            this.Field14713.setText(this.Field14714);
            return;
        }
        Class153.Method998(new File(Class32.Field7990, string), this.Field14715, Class46.Field8122.getSchematic(), (EntityPlayer)this.mc.player);
    }

    @Override
    protected void keyTyped(char c, int n) throws IOException {
        super.keyTyped(c, n);
        this.Field14714 = this.Field14713.getText();
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        this.drawString(this.fontRenderer, this.Field14717, this.width - 205, this.height - 70, 0xFFFFFF);
        this.drawString(this.fontRenderer, this.Field14718, this.Field14700 - 145, this.Field14701 - 24, 0xFFFFFF);
        this.drawString(this.fontRenderer, Integer.toString(Class46.Field8123.Field7895), this.Field14700 - 25, this.Field14701 - 24, 0xFFFFFF);
        this.drawString(this.fontRenderer, this.Field14719, this.Field14700 - 145, this.Field14701 + 1, 0xFFFFFF);
        this.drawString(this.fontRenderer, Integer.toString(Class46.Field8123.Field7896), this.Field14700 - 25, this.Field14701 + 1, 0xFFFFFF);
        this.drawString(this.fontRenderer, this.Field14720, this.Field14700 - 145, this.Field14701 + 26, 0xFFFFFF);
        this.drawString(this.fontRenderer, Integer.toString(Class46.Field8123.Field7897), this.Field14700 - 25, this.Field14701 + 26, 0xFFFFFF);
        this.drawString(this.fontRenderer, this.Field14718, this.Field14700 + 15, this.Field14701 - 24, 0xFFFFFF);
        this.drawString(this.fontRenderer, Integer.toString(Class46.Field8124.Field7895), this.Field14700 + 135, this.Field14701 - 24, 0xFFFFFF);
        this.drawString(this.fontRenderer, this.Field14719, this.Field14700 + 15, this.Field14701 + 1, 0xFFFFFF);
        this.drawString(this.fontRenderer, Integer.toString(Class46.Field8124.Field7896), this.Field14700 + 135, this.Field14701 + 1, 0xFFFFFF);
        this.drawString(this.fontRenderer, this.Field14720, this.Field14700 + 15, this.Field14701 + 26, 0xFFFFFF);
        this.drawString(this.fontRenderer, Integer.toString(Class46.Field8124.Field7897), this.Field14700 + 135, this.Field14701 + 26, 0xFFFFFF);
        super.drawScreen(n, n2, f);
    }

    private String Method5742() {
        if (this.Field14716 != null) {
            if (this.Field14716.hasNext()) return (String)this.Field14716.next();
            this.Field14716 = Class153.Field8593.keySet().iterator();
            return (String)this.Field14716.next();
        }
        if (!Field14723 && Class153.Field8593.size() <= 0) {
            throw new AssertionError((Object)"No formats are defined!");
        }
        if (!Field14723 && !Class153.Field8593.containsKey(Class153.Field8594)) {
            throw new AssertionError((Object)"The default format does not exist!");
        }
        this.Field14716 = Class153.Field8593.keySet().iterator();
        while (!((String)this.Field14716.next()).equals(Class153.Field8594)) {
        }
        return Class153.Field8594;
    }

    private static String Method5743(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 61;
            cArray2[n] = (char)(cArray[n] ^ (0x7869 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

