//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import net.minecraft.client.resources.*;
import net.minecraftforge.fml.client.config.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import java.io.*;

public class Class992 extends Class593
{
    private final Class1479 Field12251;
    private final Class415 Field12252;
    private int Field12253;
    private int Field12254;
    private Class1093 Field12255;
    private Class1093 Field12256;
    private Class1093 Field12257;
    private GuiButton Field12258;
    private GuiButton Field12259;
    private Class1093 Field12260;
    private GuiButton Field12261;
    private GuiButton Field12262;
    private GuiButton Field12263;
    private GuiButton Field12264;
    private GuiButton Field12265;
    private GuiButton Field12266;
    private GuiButton Field12267;
    private final String Field12268;
    private final String Field12269;
    private final String Field12270;
    private final String Field12271;
    private final String Field12272;
    private final String Field12273;
    private final String Field12274;
    private final String Field12275;
    private final String Field12276;
    private final String Field12277;
    private final String Field12278;
    private String Field12279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class992(final GuiScreen guiScreen) {
        super(guiScreen);
        this.Field12253 = 0;
        this.Field12254 = 0;
        this.Field12255 = null;
        this.Field12256 = null;
        this.Field12257 = null;
        this.Field12258 = null;
        this.Field12259 = null;
        this.Field12260 = null;
        this.Field12261 = null;
        this.Field12262 = null;
        this.Field12263 = null;
        this.Field12264 = null;
        this.Field12265 = null;
        this.Field12266 = null;
        this.Field12267 = null;
        this.Field12268 = I18n.format("schematica.gui.moveschematic", new Object[0]);
        this.Field12269 = I18n.format("schematica.gui.operations", new Object[0]);
        this.Field12270 = I18n.format("schematica.gui.unload", new Object[0]);
        this.Field12271 = I18n.format("schematica.gui.materials", new Object[0]);
        this.Field12272 = I18n.format("schematica.gui.hide", new Object[0]);
        this.Field12273 = I18n.format("schematica.gui.show", new Object[0]);
        this.Field12274 = I18n.format("schematica.gui.x", new Object[0]);
        this.Field12275 = I18n.format("schematica.gui.y", new Object[0]);
        this.Field12276 = I18n.format("schematica.gui.z", new Object[0]);
        this.Field12277 = I18n.format("schematica.gui.on", new Object[0]);
        this.Field12278 = I18n.format("schematica.gui.off", new Object[0]);
        this.Field12251 = Class46.Field8122;
        this.Field12252 = Class415.Field9718;
    }
    
    public void initGui() {
        this.Field12253 = this.width / 2;
        this.Field12254 = this.height / 2;
        this.buttonList.clear();
        int n = 0;
        this.Field12255 = new Class1093(this.fontRenderer, n++, this.Field12253 - 50, this.Field12254 - 30, 100, 20);
        this.buttonList.add(this.Field12255);
        this.Field12256 = new Class1093(this.fontRenderer, n++, this.Field12253 - 50, this.Field12254 - 5, 100, 20);
        this.buttonList.add(this.Field12256);
        this.Field12257 = new Class1093(this.fontRenderer, n++, this.Field12253 - 50, this.Field12254 + 20, 100, 20);
        this.buttonList.add(this.Field12257);
        this.Field12258 = new GuiButton(n++, this.width - 90, this.height - 200, 80, 20, this.Field12270);
        this.buttonList.add(this.Field12258);
        this.Field12259 = new GuiButton(n++, this.width - 90, this.height - 150 - 25, 80, 20, I18n.format(((this.Field12251 != null) ? this.Field12251.Field14898 : Class617.Field10633).Field10636, new Object[0]));
        this.buttonList.add(this.Field12259);
        this.Field12260 = new Class1093(this.fontRenderer, n++, this.width - 90, this.height - 150, 80, 20);
        this.buttonList.add(this.Field12260);
        this.Field12261 = new GuiButton(n++, this.width - 90, this.height - 105, 80, 20, (this.Field12251 != null && this.Field12251.Field14897) ? this.Field12272 : this.Field12273);
        this.buttonList.add(this.Field12261);
        this.Field12262 = new GuiButton(n++, this.width - 90, this.height - 80, 80, 20, I18n.format("schematica.gui.movehere", new Object[0]));
        this.buttonList.add(this.Field12262);
        this.Field12263 = new GuiButton(n++, this.width - 180, this.height - 55, 80, 20, I18n.format("schematica.gui." + Class46.Field8127.getName(), new Object[0]));
        this.buttonList.add(this.Field12263);
        this.Field12264 = (GuiButton)new GuiUnicodeGlyphButton(n++, this.width - 90, this.height - 55, 80, 20, " " + I18n.format("schematica.gui.flip", new Object[0]), "\u2194", 2.0f);
        this.buttonList.add(this.Field12264);
        this.Field12265 = new GuiButton(n++, this.width - 180, this.height - 30, 80, 20, I18n.format("schematica.gui." + Class46.Field8128.getName(), new Object[0]));
        this.buttonList.add(this.Field12265);
        this.Field12266 = (GuiButton)new GuiUnicodeGlyphButton(n++, this.width - 90, this.height - 30, 80, 20, " " + I18n.format("schematica.gui.rotate", new Object[0]), "\u21bb", 2.0f);
        this.buttonList.add(this.Field12266);
        this.Field12267 = new GuiButton(n++, 10, this.height - 70, 80, 20, this.Field12271);
        this.buttonList.add(this.Field12267);
        this.Field12255.setEnabled(this.Field12251 != null);
        this.Field12256.setEnabled(this.Field12251 != null);
        this.Field12257.setEnabled(this.Field12251 != null);
        this.Field12258.enabled = (this.Field12251 != null);
        this.Field12259.enabled = (this.Field12251 != null);
        this.Field12260.setEnabled(this.Field12251 != null && this.Field12251.Field14898 != Class617.Field10633);
        this.Field12261.enabled = (this.Field12251 != null);
        this.Field12262.enabled = (this.Field12251 != null);
        this.Field12263.enabled = (this.Field12251 != null);
        this.Field12264.enabled = (this.Field12251 != null);
        this.Field12265.enabled = (this.Field12251 != null);
        this.Field12266.enabled = (this.Field12251 != null);
        this.Field12267.enabled = (this.Field12251 != null);
        this.Method4017(this.Field12255);
        this.Method4017(this.Field12256);
        this.Method4017(this.Field12257);
        if (this.Field12251 != null) {
            this.Method4018(this.Field12255, this.Field12256, this.Field12257, (BlockPos)this.Field12251.Field14896);
        }
        this.Field12260.setMinimum(0);
        this.Field12260.setMaximum((this.Field12251 != null) ? (this.Field12251.getHeight() - 1) : 0);
        if (this.Field12251 != null) {
            this.Field12260.setValue(this.Field12251.Field14899);
        }
    }
    
    private void Method4017(final Class1093 class1093) {
        class1093.setMinimum(-30000000);
        class1093.setMaximum(30000000);
    }
    
    private void Method4018(final Class1093 class1093, final Class1093 class1094, final Class1093 class1095, final BlockPos blockPos) {
        class1093.setValue(blockPos.getX());
        class1094.setValue(blockPos.getY());
        class1095.setValue(blockPos.getZ());
    }
    
    protected void Method4019(final GuiButton guiButton) {
        if (guiButton.enabled) {
            if (this.Field12251 == null) {
                return;
            }
            if (guiButton.id == this.Field12255.id) {
                this.Field12251.Field14896.Field7895 = this.Field12255.getValue();
                Class934.Field11944.refresh();
            }
            else if (guiButton.id == this.Field12256.id) {
                this.Field12251.Field14896.Field7896 = this.Field12256.getValue();
                Class934.Field11944.refresh();
            }
            else if (guiButton.id == this.Field12257.id) {
                this.Field12251.Field14896.Field7897 = this.Field12257.getValue();
                Class934.Field11944.refresh();
            }
            else if (guiButton.id == this.Field12258.id) {
                Class2101.Field17565.Method414();
                this.mc.displayGuiScreen(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            }
            else if (guiButton.id == this.Field12259.id) {
                this.Field12251.Field14898 = Class617.Method1105(this.Field12251.Field14898);
                this.Field12259.displayString = I18n.format(this.Field12251.Field14898.Field10636, new Object[0]);
                this.Field12260.setEnabled(this.Field12251.Field14898 != Class617.Field10633);
                Class934.Field11944.refresh();
            }
            else if (guiButton.id == this.Field12260.id) {
                this.Field12251.Field14899 = this.Field12260.getValue();
                Class934.Field11944.refresh();
            }
            else if (guiButton.id == this.Field12261.id) {
                this.Field12261.displayString = (this.Field12251.toggleRendering() ? this.Field12272 : this.Field12273);
            }
            else if (guiButton.id == this.Field12262.id) {
                Class46.Method425(this.Field12251);
                Class934.Field11944.refresh();
                this.Method4018(this.Field12255, this.Field12256, this.Field12257, (BlockPos)this.Field12251.Field14896);
            }
            else if (guiButton.id == this.Field12263.id) {
                final EnumFacing[] VALUES = EnumFacing.VALUES;
                Class46.Field8127 = VALUES[(Class46.Field8127.ordinal() + 2) % VALUES.length];
                guiButton.displayString = I18n.format("schematica.gui." + Class46.Field8127.getName(), new Object[0]);
            }
            else if (guiButton.id == this.Field12264.id) {
                if (Class350.Field9447.Method1757(this.Field12251, Class46.Field8127, isShiftKeyDown())) {
                    Class934.Field11944.refresh();
                    Class415.Field9718.Method2017();
                }
            }
            else if (guiButton.id == this.Field12265.id) {
                final EnumFacing[] VALUES2 = EnumFacing.VALUES;
                Class46.Field8128 = VALUES2[(Class46.Field8128.ordinal() + 1) % VALUES2.length];
                guiButton.displayString = I18n.format("schematica.gui." + Class46.Field8128.getName(), new Object[0]);
            }
            else if (guiButton.id == this.Field12266.id) {
                if (Class1764.Field16065.Method6701(this.Field12251, Class46.Field8128, isShiftKeyDown())) {
                    this.Method4018(this.Field12255, this.Field12256, this.Field12257, (BlockPos)this.Field12251.Field14896);
                    Class934.Field11944.refresh();
                    Class415.Field9718.Method2017();
                }
            }
            else if (guiButton.id == this.Field12267.id) {
                this.mc.displayGuiScreen((GuiScreen)new Class510((GuiScreen)this));
            }
        }
    }
    
    public void Method4020() throws IOException {
        super.handleKeyboardInput();
        if (this.Field12264.enabled) {
            this.Field12264.packedFGColour = (isShiftKeyDown() ? 16711680 : 0);
        }
        if (this.Field12266.enabled) {
            this.Field12266.packedFGColour = (isShiftKeyDown() ? 16711680 : 0);
        }
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        this.drawCenteredString(this.fontRenderer, this.Field12268, this.Field12253, this.Field12254 - 45, 16777215);
        this.drawCenteredString(this.fontRenderer, this.Field12271, 50, this.height - 85, 16777215);
        this.drawCenteredString(this.fontRenderer, this.Field12269, this.width - 50, this.height - 120, 16777215);
        this.drawString(this.fontRenderer, this.Field12274, this.Field12253 - 65, this.Field12254 - 24, 16777215);
        this.drawString(this.fontRenderer, this.Field12275, this.Field12253 - 65, this.Field12254 + 1, 16777215);
        this.drawString(this.fontRenderer, this.Field12276, this.Field12253 - 65, this.Field12254 + 26, 16777215);
        super.drawScreen(n, n2, n3);
    }
    
    private static String Method4021(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1A0A ^ 0xBF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
