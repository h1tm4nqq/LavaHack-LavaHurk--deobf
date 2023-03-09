//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package lavahack.client;

import lavahack.client.Class1288;
import lavahack.client.Class1806;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class Class2001
extends Class1806 {
    public FontRenderer Field17185;
    private int Field17186;

    public Class2001(int n, int n2, int n3, String string) {
        super(n, n2, n3, 0, 0, string);
        this.Field17185 = Minecraft.getMinecraft().fontRenderer;
        this.width = this.Field17185.getStringWidth(this.displayString) + 4;
        this.height = this.Field17185.FONT_HEIGHT + 4;
    }

    public void Method7423(Minecraft minecraft, int n, int n2, float f) {
        if (!this.enabled) return;
        int n3 = this.x + this.width;
        int n4 = this.y + this.height;
        if (Class1288.Field13877.Field13880.Method365()) {
            Class2001.drawRect((int)this.x, (int)this.y, (int)n3, (int)n4, (int)Class1288.Field13877.Field13881.Method339().Method3626());
        }
        if (Class1288.Field13877.Field13878.Method365()) {
            Class2001.drawRect((int)this.x, (int)this.y, (int)n3, (int)(this.y + 1), (int)Class1288.Field13877.Field13879.Method339().Method3626());
            Class2001.drawRect((int)this.x, (int)this.y, (int)(this.x + 1), (int)n4, (int)Class1288.Field13877.Field13879.Method339().Method3626());
            Class2001.drawRect((int)this.x, (int)(n4 - 1), (int)n3, (int)n4, (int)Class1288.Field13877.Field13879.Method339().Method3626());
            Class2001.drawRect((int)(n3 - 1), (int)this.y, (int)n3, (int)n4, (int)Class1288.Field13877.Field13879.Method339().Method3626());
        }
        this.Field17185.drawString(this.displayString, this.x + 2, this.y + 2, Class1288.Field13877.Field13882.Method339().Method3626());
    }

    @Override
    public void onClick(GuiScreen guiScreen) {
    }
}

