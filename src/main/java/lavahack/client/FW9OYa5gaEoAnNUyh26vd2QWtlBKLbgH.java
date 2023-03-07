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

import lavahack.client.CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z;
import lavahack.client.lBrg2MUDA5p5lrnps5flXoe96O0snUin;
import lavahack.client.niKD96fZH1BJpHcWf49iWuSnWOb7YojO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class FW9OYa5gaEoAnNUyh26vd2QWtlBKLbgH
extends niKD96fZH1BJpHcWf49iWuSnWOb7YojO {
    private TextFormatting Field8429;
    private FontRenderer Field8430;
    private String Field8431 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public FW9OYa5gaEoAnNUyh26vd2QWtlBKLbgH(int n, int n2, int n3, FontRenderer fontRenderer, TextFormatting textFormatting) {
        super(n, n2, n3, (int)-179221113L ^ 0xF5514D87, (int)((long)257204007 ^ (long)257204007), null);
        this.Field8430 = fontRenderer;
        this.Field8429 = textFormatting;
        this.width = (int)-733409538L ^ 0xD4490EF9;
        this.height = (int)1798812233L ^ 0x6B37B24E;
    }

    public void Method854(Minecraft minecraft, int n, int n2, float f) {
        GlStateManager.pushMatrix();
        float f2 = Float.intBitsToFloat((int)((long)1342067721 ^ (long)1892509498));
        GlStateManager.scale((float)f2, (float)f2, (float)f2);
        int n3 = (int)((float)this.x / f2);
        int n4 = (int)((float)this.y / f2);
        int n5 = (int)((float)(this.x + this.width) / f2);
        int n6 = (int)((float)(this.y + this.height) / f2);
        if (this.Field8429.isColor()) {
            FW9OYa5gaEoAnNUyh26vd2QWtlBKLbgH.drawRect((int)n3, (int)n4, (int)n5, (int)n6, (int)((int)((long)654800254 ^ (long)-670599810) | this.Field8430.getColorCode(this.Field8429.toString().charAt((int)1650475097L ^ 0x62604058))));
        } else {
            this.Field8430.drawString(this.Field8429.toString().substring((int)((long)697149360 ^ (long)697149361)), n3 + ((int)((long)-1670715561 ^ (long)-1670715562) << 1), n4 + ((int)-1405993388L ^ 0xAC323E55), CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13882.Method339().Method3626());
        }
        if (CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13878.Method365()) {
            FW9OYa5gaEoAnNUyh26vd2QWtlBKLbgH.drawRect((int)n3, (int)n4, (int)n5, (int)(n4 + (int)((long)-1586499056 ^ (long)-1586499055)), (int)CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13879.Method339().Method3626());
            FW9OYa5gaEoAnNUyh26vd2QWtlBKLbgH.drawRect((int)n3, (int)n4, (int)(n3 + ((int)-1252551210L ^ 0xB55795D7)), (int)n6, (int)CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13879.Method339().Method3626());
            FW9OYa5gaEoAnNUyh26vd2QWtlBKLbgH.drawRect((int)n3, (int)(n6 - (int)((long)-118193913 ^ (long)-118193914)), (int)n5, (int)n6, (int)CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13879.Method339().Method3626());
            FW9OYa5gaEoAnNUyh26vd2QWtlBKLbgH.drawRect((int)(n5 - ((int)-1177709440L ^ 0xB9CD9481)), (int)n4, (int)n5, (int)n6, (int)CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13879.Method339().Method3626());
        }
        GlStateManager.popMatrix();
    }

    @Override
    public void onClick(GuiScreen guiScreen) {
        ((lBrg2MUDA5p5lrnps5flXoe96O0snUin)guiScreen).appendFormat(this.Field8429.toString());
    }
}

