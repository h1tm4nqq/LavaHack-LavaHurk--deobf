//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.fml.client.config.GuiUnicodeGlyphButton
 */
package lavahack.client;

import java.io.IOException;
import lavahack.client.Class1093;
import lavahack.client.Class1479;
import lavahack.client.Class1764;
import lavahack.client.Class2101;
import lavahack.client.Class350;
import lavahack.client.Class415;
import lavahack.client.Class46;
import lavahack.client.Class510;
import lavahack.client.Class593;
import lavahack.client.Class617;
import lavahack.client.Class934;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.client.config.GuiUnicodeGlyphButton;

public class Class992
extends Class593 {
    private final Class1479 Field12251;
    private final Class415 Field12252;
    private int Field12253 = 0;
    private int Field12254 = 0;
    private Class1093 Field12255 = null;
    private Class1093 Field12256 = null;
    private Class1093 Field12257 = null;
    private GuiButton Field12258 = null;
    private GuiButton Field12259 = null;
    private Class1093 Field12260 = null;
    private GuiButton Field12261 = null;
    private GuiButton Field12262 = null;
    private GuiButton Field12263 = null;
    private GuiButton Field12264 = null;
    private GuiButton Field12265 = null;
    private GuiButton Field12266 = null;
    private GuiButton Field12267 = null;
    private final String Field12268 = I18n.format((String)"schematica.gui.moveschematic", (Object[])new Object[0]);
    private final String Field12269 = I18n.format((String)"schematica.gui.operations", (Object[])new Object[0]);
    private final String Field12270 = I18n.format((String)"schematica.gui.unload", (Object[])new Object[0]);
    private final String Field12271 = I18n.format((String)"schematica.gui.materials", (Object[])new Object[0]);
    private final String Field12272 = I18n.format((String)"schematica.gui.hide", (Object[])new Object[0]);
    private final String Field12273 = I18n.format((String)"schematica.gui.show", (Object[])new Object[0]);
    private final String Field12274 = I18n.format((String)"schematica.gui.x", (Object[])new Object[0]);
    private final String Field12275 = I18n.format((String)"schematica.gui.y", (Object[])new Object[0]);
    private final String Field12276 = I18n.format((String)"schematica.gui.z", (Object[])new Object[0]);
    private final String Field12277 = I18n.format((String)"schematica.gui.on", (Object[])new Object[0]);
    private final String Field12278 = I18n.format((String)"schematica.gui.off", (Object[])new Object[0]);
    private String Field12279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class992(GuiScreen guiScreen) {
        super(guiScreen);
        this.Field12251 = Class46.Field8122;
        this.Field12252 = Class415.Field9718;
    }

    @Override
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
        this.Field12259 = new GuiButton(n++, this.width - 90, this.height - 150 - 25, 80, 20, I18n.format((String)(this.Field12251 != null ? this.Field12251.Field14898 : Class617.Field10633).Field10636, (Object[])new Object[0]));
        this.buttonList.add(this.Field12259);
        this.Field12260 = new Class1093(this.fontRenderer, n++, this.width - 90, this.height - 150, 80, 20);
        this.buttonList.add(this.Field12260);
        this.Field12261 = new GuiButton(n++, this.width - 90, this.height - 105, 80, 20, this.Field12251 != null && this.Field12251.Field14897 ? this.Field12272 : this.Field12273);
        this.buttonList.add(this.Field12261);
        this.Field12262 = new GuiButton(n++, this.width - 90, this.height - 80, 80, 20, I18n.format((String)"schematica.gui.movehere", (Object[])new Object[0]));
        this.buttonList.add(this.Field12262);
        this.Field12263 = new GuiButton(n++, this.width - 180, this.height - 55, 80, 20, I18n.format((String)("schematica.gui." + Class46.Field8127.getName()), (Object[])new Object[0]));
        this.buttonList.add(this.Field12263);
        this.Field12264 = new GuiUnicodeGlyphButton(n++, this.width - 90, this.height - 55, 80, 20, " " + I18n.format((String)"schematica.gui.flip", (Object[])new Object[0]), "\u2194", 2.0f);
        this.buttonList.add(this.Field12264);
        this.Field12265 = new GuiButton(n++, this.width - 180, this.height - 30, 80, 20, I18n.format((String)("schematica.gui." + Class46.Field8128.getName()), (Object[])new Object[0]));
        this.buttonList.add(this.Field12265);
        this.Field12266 = new GuiUnicodeGlyphButton(n++, this.width - 90, this.height - 30, 80, 20, " " + I18n.format((String)"schematica.gui.rotate", (Object[])new Object[0]), "\u21bb", 2.0f);
        this.buttonList.add(this.Field12266);
        this.Field12267 = new GuiButton(n++, 10, this.height - 70, 80, 20, this.Field12271);
        this.buttonList.add(this.Field12267);
        this.Field12255.setEnabled(this.Field12251 != null);
        this.Field12256.setEnabled(this.Field12251 != null);
        this.Field12257.setEnabled(this.Field12251 != null);
        this.Field12258.enabled = this.Field12251 != null;
        this.Field12259.enabled = this.Field12251 != null;
        this.Field12260.setEnabled(this.Field12251 != null && this.Field12251.Field14898 != Class617.Field10633);
        this.Field12261.enabled = this.Field12251 != null;
        this.Field12262.enabled = this.Field12251 != null;
        this.Field12263.enabled = this.Field12251 != null;
        this.Field12264.enabled = this.Field12251 != null;
        this.Field12265.enabled = this.Field12251 != null;
        this.Field12266.enabled = this.Field12251 != null;
        this.Field12267.enabled = this.Field12251 != null;
        this.Method4017(this.Field12255);
        this.Method4017(this.Field12256);
        this.Method4017(this.Field12257);
        if (this.Field12251 != null) {
            this.Method4018(this.Field12255, this.Field12256, this.Field12257, this.Field12251.Field14896);
        }
        this.Field12260.setMinimum(0);
        this.Field12260.setMaximum(this.Field12251 != null ? this.Field12251.getHeight() - 1 : 0);
        if (this.Field12251 == null) return;
        this.Field12260.setValue(this.Field12251.Field14899);
    }

    private void Method4017(Class1093 class1093) {
        class1093.setMinimum(-30000000);
        class1093.setMaximum(30000000);
    }

    private void Method4018(Class1093 class1093, Class1093 class10932, Class1093 class10933, BlockPos blockPos) {
        class1093.setValue(blockPos.getX());
        class10932.setValue(blockPos.getY());
        class10933.setValue(blockPos.getZ());
    }

    protected void Method4019(GuiButton guiButton) {
        if (!guiButton.enabled) return;
        if (this.Field12251 == null) {
            return;
        }
        if (guiButton.id == this.Field12255.id) {
            this.Field12251.Field14896.Field7895 = this.Field12255.getValue();
            Class934.Field11944.refresh();
            return;
        }
        if (guiButton.id == this.Field12256.id) {
            this.Field12251.Field14896.Field7896 = this.Field12256.getValue();
            Class934.Field11944.refresh();
            return;
        }
        if (guiButton.id == this.Field12257.id) {
            this.Field12251.Field14896.Field7897 = this.Field12257.getValue();
            Class934.Field11944.refresh();
            return;
        }
        if (guiButton.id == this.Field12258.id) {
            Class2101.Field17565.Method414();
            this.mc.displayGuiScreen(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            return;
        }
        if (guiButton.id == this.Field12259.id) {
            this.Field12251.Field14898 = Class617.Method1105(this.Field12251.Field14898);
            this.Field12259.displayString = I18n.format((String)this.Field12251.Field14898.Field10636, (Object[])new Object[0]);
            this.Field12260.setEnabled(this.Field12251.Field14898 != Class617.Field10633);
            Class934.Field11944.refresh();
            return;
        }
        if (guiButton.id == this.Field12260.id) {
            this.Field12251.Field14899 = this.Field12260.getValue();
            Class934.Field11944.refresh();
            return;
        }
        if (guiButton.id == this.Field12261.id) {
            this.Field12261.displayString = this.Field12251.toggleRendering() ? this.Field12272 : this.Field12273;
            return;
        }
        if (guiButton.id == this.Field12262.id) {
            Class46.Method425(this.Field12251);
            Class934.Field11944.refresh();
            this.Method4018(this.Field12255, this.Field12256, this.Field12257, this.Field12251.Field14896);
            return;
        }
        if (guiButton.id == this.Field12263.id) {
            EnumFacing[] enumFacingArray = EnumFacing.VALUES;
            Class46.Field8127 = enumFacingArray[(Class46.Field8127.ordinal() + 2) % enumFacingArray.length];
            guiButton.displayString = I18n.format((String)("schematica.gui." + Class46.Field8127.getName()), (Object[])new Object[0]);
            return;
        }
        if (guiButton.id == this.Field12264.id) {
            if (!Class350.Field9447.Method1757(this.Field12251, Class46.Field8127, Class992.isShiftKeyDown())) return;
            Class934.Field11944.refresh();
            Class415.Field9718.Method2017();
            return;
        }
        if (guiButton.id == this.Field12265.id) {
            EnumFacing[] enumFacingArray = EnumFacing.VALUES;
            Class46.Field8128 = enumFacingArray[(Class46.Field8128.ordinal() + 1) % enumFacingArray.length];
            guiButton.displayString = I18n.format((String)("schematica.gui." + Class46.Field8128.getName()), (Object[])new Object[0]);
            return;
        }
        if (guiButton.id == this.Field12266.id) {
            if (!Class1764.Field16065.Method6701(this.Field12251, Class46.Field8128, Class992.isShiftKeyDown())) return;
            this.Method4018(this.Field12255, this.Field12256, this.Field12257, this.Field12251.Field14896);
            Class934.Field11944.refresh();
            Class415.Field9718.Method2017();
            return;
        }
        if (guiButton.id != this.Field12267.id) return;
        this.mc.displayGuiScreen((GuiScreen)new Class510(this));
    }

    public void Method4020() throws IOException {
        super.handleKeyboardInput();
        if (this.Field12264.enabled) {
            this.Field12264.packedFGColour = Class992.isShiftKeyDown() ? 0xFF0000 : 0;
        }
        if (!this.Field12266.enabled) return;
        this.Field12266.packedFGColour = Class992.isShiftKeyDown() ? 0xFF0000 : 0;
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        this.drawCenteredString(this.fontRenderer, this.Field12268, this.Field12253, this.Field12254 - 45, 0xFFFFFF);
        this.drawCenteredString(this.fontRenderer, this.Field12271, 50, this.height - 85, 0xFFFFFF);
        this.drawCenteredString(this.fontRenderer, this.Field12269, this.width - 50, this.height - 120, 0xFFFFFF);
        this.drawString(this.fontRenderer, this.Field12274, this.Field12253 - 65, this.Field12254 - 24, 0xFFFFFF);
        this.drawString(this.fontRenderer, this.Field12275, this.Field12253 - 65, this.Field12254 + 1, 0xFFFFFF);
        this.drawString(this.fontRenderer, this.Field12276, this.Field12253 - 65, this.Field12254 + 26, 0xFFFFFF);
        super.drawScreen(n, n2, f);
    }

    private static String Method4021(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 191;
            cArray2[n] = (char)(cArray[n] ^ (0x1A0A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

