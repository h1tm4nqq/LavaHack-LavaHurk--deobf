//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.resources.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import java.io.*;

public class Class1434 extends Class593
{
    private int Field14700;
    private int Field14701;
    private GuiButton Field14702;
    private Class1093 Field14703;
    private Class1093 Field14704;
    private Class1093 Field14705;
    private GuiButton Field14706;
    private Class1093 Field14707;
    private Class1093 Field14708;
    private Class1093 Field14709;
    private GuiButton Field14710;
    private GuiButton Field14711;
    private GuiButton Field14712;
    private GuiTextField Field14713;
    private String Field14714;
    private String Field14715;
    private Iterator Field14716;
    private final String Field14717;
    private final String Field14718;
    private final String Field14719;
    private final String Field14720;
    private final String Field14721;
    private final String Field14722;
    static final boolean Field14723;
    private String Field14724 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1434(final GuiScreen guiScreen) {
        super(guiScreen);
        this.Field14700 = 0;
        this.Field14701 = 0;
        this.Field14702 = null;
        this.Field14703 = null;
        this.Field14704 = null;
        this.Field14705 = null;
        this.Field14706 = null;
        this.Field14707 = null;
        this.Field14708 = null;
        this.Field14709 = null;
        this.Field14710 = null;
        this.Field14711 = null;
        this.Field14712 = null;
        this.Field14713 = null;
        this.Field14714 = "";
        this.Field14716 = null;
        this.Field14717 = I18n.format("schematica.gui.saveselection", new Object[0]);
        this.Field14718 = I18n.format("schematica.gui.x", new Object[0]);
        this.Field14719 = I18n.format("schematica.gui.y", new Object[0]);
        this.Field14720 = I18n.format("schematica.gui.z", new Object[0]);
        this.Field14721 = I18n.format("schematica.gui.on", new Object[0]);
        this.Field14722 = I18n.format("schematica.gui.off", new Object[0]);
        this.Field14715 = this.Method5742();
    }
    
    @Override
    public void initGui() {
        this.Field14700 = this.width / 2;
        this.Field14701 = this.height / 2;
        this.buttonList.clear();
        int n = 0;
        this.Field14702 = new GuiButton(n++, this.Field14700 - 130, this.Field14701 - 55, 100, 20, I18n.format("schematica.gui.point.red", new Object[0]));
        this.buttonList.add(this.Field14702);
        this.Field14703 = new Class1093(this.fontRenderer, n++, this.Field14700 - 130, this.Field14701 - 30);
        this.buttonList.add(this.Field14703);
        this.Field14704 = new Class1093(this.fontRenderer, n++, this.Field14700 - 130, this.Field14701 - 5);
        this.buttonList.add(this.Field14704);
        this.Field14705 = new Class1093(this.fontRenderer, n++, this.Field14700 - 130, this.Field14701 + 20);
        this.buttonList.add(this.Field14705);
        this.Field14706 = new GuiButton(n++, this.Field14700 + 30, this.Field14701 - 55, 100, 20, I18n.format("schematica.gui.point.blue", new Object[0]));
        this.buttonList.add(this.Field14706);
        this.Field14707 = new Class1093(this.fontRenderer, n++, this.Field14700 + 30, this.Field14701 - 30);
        this.buttonList.add(this.Field14707);
        this.Field14708 = new Class1093(this.fontRenderer, n++, this.Field14700 + 30, this.Field14701 - 5);
        this.buttonList.add(this.Field14708);
        this.Field14709 = new Class1093(this.fontRenderer, n++, this.Field14700 + 30, this.Field14701 + 20);
        this.buttonList.add(this.Field14709);
        this.Field14710 = new GuiButton(n++, this.width - 210, this.height - 55, 50, 20, (Class46.Field8117 && Class2101.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro) ? this.Field14721 : this.Field14722);
        this.buttonList.add(this.Field14710);
        this.Field14713 = new GuiTextField(n++, this.fontRenderer, this.width - 209, this.height - 29, 153, 18);
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.add(this.Field14713);
        this.Field14712 = new GuiButton(n++, this.width - 50, this.height - 30, 40, 20, I18n.format("schematica.gui.save", new Object[0]));
        this.Field14712.enabled = ((Class46.Field8117 && Class2101.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro) || Class46.Field8122 != null);
        this.buttonList.add(this.Field14712);
        this.Field14711 = new GuiButton(n++, this.width - 155, this.height - 55, 145, 20, I18n.format("schematica.gui.format", new Object[] { I18n.format(Class153.Method999(this.Field14715), new Object[0]) }));
        this.Field14711.enabled = ((Class46.Field8117 && Class2101.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro) || Class46.Field8122 != null);
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
    
    private void Method5739(final Class1093 class1093) {
        class1093.setMinimum(-30000000);
        class1093.setMaximum(30000000);
    }
    
    private void Method5740(final Class1093 class1093, final Class1093 class1094, final Class1093 class1095, final BlockPos blockPos) {
        class1093.setValue(blockPos.getX());
        class1094.setValue(blockPos.getY());
        class1095.setValue(blockPos.getZ());
    }
    
    protected void Method5741(final GuiButton guiButton) {
        if (guiButton.enabled) {
            if (guiButton.id == this.Field14702.id) {
                Class46.Method424(Class46.Field8123);
                Class46.Method423();
                this.Method5740(this.Field14703, this.Field14704, this.Field14705, Class46.Field8123);
            }
            else if (guiButton.id == this.Field14703.id) {
                Class46.Field8123.Field7895 = this.Field14703.getValue();
                Class46.Method423();
            }
            else if (guiButton.id == this.Field14704.id) {
                Class46.Field8123.Field7896 = this.Field14704.getValue();
                Class46.Method423();
            }
            else if (guiButton.id == this.Field14705.id) {
                Class46.Field8123.Field7897 = this.Field14705.getValue();
                Class46.Method423();
            }
            else if (guiButton.id == this.Field14706.id) {
                Class46.Method424(Class46.Field8124);
                Class46.Method423();
                this.Method5740(this.Field14707, this.Field14708, this.Field14709, Class46.Field8124);
            }
            else if (guiButton.id == this.Field14707.id) {
                Class46.Field8124.Field7895 = this.Field14707.getValue();
                Class46.Method423();
            }
            else if (guiButton.id == this.Field14708.id) {
                Class46.Field8124.Field7896 = this.Field14708.getValue();
                Class46.Method423();
            }
            else if (guiButton.id == this.Field14709.id) {
                Class46.Field8124.Field7897 = this.Field14709.getValue();
                Class46.Method423();
            }
            else if (guiButton.id == this.Field14710.id) {
                Class46.Field8117 = (!Class46.Field8117 && Class2101.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro);
                this.Field14710.displayString = (Class46.Field8117 ? this.Field14721 : this.Field14722);
                this.Field14712.enabled = (Class46.Field8117 || Class46.Field8122 != null);
                this.Field14711.enabled = (Class46.Field8117 || Class46.Field8122 != null);
            }
            else if (guiButton.id == this.Field14711.id) {
                this.Field14715 = this.Method5742();
                this.Field14711.displayString = I18n.format("schematica.gui.format", new Object[] { I18n.format(Class153.Method999(this.Field14715), new Object[0]) });
            }
            else if (guiButton.id == this.Field14712.id) {
                final String string = this.Field14713.getText() + Class153.Method1000(this.Field14715);
                if (Class46.Field8117) {
                    if (Class2101.Field17565.Method416((EntityPlayer)this.mc.player, Class32.Field7990, string, (World)this.mc.world, this.Field14715, Class46.Field8125, Class46.Field8126)) {
                        this.Field14714 = "";
                        this.Field14713.setText(this.Field14714);
                    }
                }
                else {
                    Class153.Method998(new File(Class32.Field7990, string), this.Field14715, Class46.Field8122.getSchematic(), (EntityPlayer)this.mc.player);
                }
            }
        }
    }
    
    @Override
    protected void keyTyped(final char c, final int n) throws IOException {
        super.keyTyped(c, n);
        this.Field14714 = this.Field14713.getText();
    }
    
    @Override
    public void drawScreen(final int n, final int n2, final float n3) {
        this.drawString(this.fontRenderer, this.Field14717, this.width - 205, this.height - 70, 16777215);
        this.drawString(this.fontRenderer, this.Field14718, this.Field14700 - 145, this.Field14701 - 24, 16777215);
        this.drawString(this.fontRenderer, Integer.toString(Class46.Field8123.Field7895), this.Field14700 - 25, this.Field14701 - 24, 16777215);
        this.drawString(this.fontRenderer, this.Field14719, this.Field14700 - 145, this.Field14701 + 1, 16777215);
        this.drawString(this.fontRenderer, Integer.toString(Class46.Field8123.Field7896), this.Field14700 - 25, this.Field14701 + 1, 16777215);
        this.drawString(this.fontRenderer, this.Field14720, this.Field14700 - 145, this.Field14701 + 26, 16777215);
        this.drawString(this.fontRenderer, Integer.toString(Class46.Field8123.Field7897), this.Field14700 - 25, this.Field14701 + 26, 16777215);
        this.drawString(this.fontRenderer, this.Field14718, this.Field14700 + 15, this.Field14701 - 24, 16777215);
        this.drawString(this.fontRenderer, Integer.toString(Class46.Field8124.Field7895), this.Field14700 + 135, this.Field14701 - 24, 16777215);
        this.drawString(this.fontRenderer, this.Field14719, this.Field14700 + 15, this.Field14701 + 1, 16777215);
        this.drawString(this.fontRenderer, Integer.toString(Class46.Field8124.Field7896), this.Field14700 + 135, this.Field14701 + 1, 16777215);
        this.drawString(this.fontRenderer, this.Field14720, this.Field14700 + 15, this.Field14701 + 26, 16777215);
        this.drawString(this.fontRenderer, Integer.toString(Class46.Field8124.Field7897), this.Field14700 + 135, this.Field14701 + 26, 16777215);
        super.drawScreen(n, n2, n3);
    }
    
    private String Method5742() {
        if (this.Field14716 != null) {
            if (!this.Field14716.hasNext()) {
                this.Field14716 = Class153.Field8593.keySet().iterator();
            }
            return this.Field14716.next();
        }
        if (!Class1434.Field14723 && Class153.Field8593.size() <= 0) {
            throw new AssertionError((Object)"No formats are defined!");
        }
        if (!Class1434.Field14723 && !Class153.Field8593.containsKey(Class153.Field8594)) {
            throw new AssertionError((Object)"The default format does not exist!");
        }
        this.Field14716 = Class153.Field8593.keySet().iterator();
        while (!this.Field14716.next().equals(Class153.Field8594)) {}
        return Class153.Field8594;
    }
    
    static {
        Field14723 = !Class1434.class.desiredAssertionStatus();
    }
    
    private static String Method5743(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7869 ^ 0x3D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
