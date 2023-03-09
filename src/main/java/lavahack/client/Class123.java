//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package lavahack.client;

import lavahack.client.Class1288;
import lavahack.client.Class1806;
import lavahack.client.Class427;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class Class123
extends Class1806 {
    private TextFormatting Field8429;
    private FontRenderer Field8430;
    private String Field8431 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class123(int n, int n2, int n3, FontRenderer fontRenderer, TextFormatting textFormatting) {
        super(n, n2, n3, 0, 0, null);
        this.Field8430 = fontRenderer;
        this.Field8429 = textFormatting;
        this.width = 7;
        this.height = 7;
    }

    public void Method854(Minecraft minecraft, int n, int n2, float f) {
        GlStateManager.pushMatrix();
        float f2 = Float.intBitsToFloat(0x3F333333);
        GlStateManager.scale((float)f2, (float)f2, (float)f2);
        int n3 = (int)((float)this.x / f2);
        int n4 = (int)((float)this.y / f2);
        int n5 = (int)((float)(this.x + this.width) / f2);
        int n6 = (int)((float)(this.y + this.height) / f2);
        if (this.Field8429.isColor()) {
            Class123.drawRect((int)n3, (int)n4, (int)n5, (int)n6, (int)(0xFF000000 | this.Field8430.getColorCode(this.Field8429.toString().charAt(1))));
        } else {
            this.Field8430.drawString(this.Field8429.toString().substring(1), n3 + 2, n4 + 1, Class1288.Field13877.Field13882.Method339().Method3626());
        }
        if (Class1288.Field13877.Field13878.Method365()) {
            Class123.drawRect((int)n3, (int)n4, (int)n5, (int)(n4 + 1), (int)Class1288.Field13877.Field13879.Method339().Method3626());
            Class123.drawRect((int)n3, (int)n4, (int)(n3 + 1), (int)n6, (int)Class1288.Field13877.Field13879.Method339().Method3626());
            Class123.drawRect((int)n3, (int)(n6 - 1), (int)n5, (int)n6, (int)Class1288.Field13877.Field13879.Method339().Method3626());
            Class123.drawRect((int)(n5 - 1), (int)n4, (int)n5, (int)n6, (int)Class1288.Field13877.Field13879.Method339().Method3626());
        }
        GlStateManager.popMatrix();
    }

    @Override
    public void onClick(GuiScreen guiScreen) {
        ((Class427)guiScreen).appendFormat(this.Field8429.toString());
    }
}

