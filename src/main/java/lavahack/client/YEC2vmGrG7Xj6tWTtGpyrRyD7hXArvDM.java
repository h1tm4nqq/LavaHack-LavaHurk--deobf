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

import lavahack.client.CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z;
import lavahack.client.niKD96fZH1BJpHcWf49iWuSnWOb7YojO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class YEC2vmGrG7Xj6tWTtGpyrRyD7hXArvDM
extends niKD96fZH1BJpHcWf49iWuSnWOb7YojO {
    public FontRenderer Field17185;
    private int Field17186;

    public YEC2vmGrG7Xj6tWTtGpyrRyD7hXArvDM(int n, int n2, int n3, String string) {
        super(n, n2, n3, (int)-1931274105L ^ 0x8CE31887, (int)((long)-1660215280 ^ (long)-1660215280), string);
        this.Field17185 = Minecraft.getMinecraft().fontRenderer;
        this.width = this.Field17185.getStringWidth(this.displayString) + (((int)1769316057L ^ 0x69759ED8) << 2);
        this.height = this.Field17185.FONT_HEIGHT + (((int)-1532529605L ^ 0xA4A7743A) << 2);
    }

    public void Method7423(Minecraft minecraft, int n, int n2, float f) {
        if (!this.enabled) return;
        int n3 = this.x + this.width;
        int n4 = this.y + this.height;
        if (CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13880.Method365()) {
            YEC2vmGrG7Xj6tWTtGpyrRyD7hXArvDM.drawRect((int)this.x, (int)this.y, (int)n3, (int)n4, (int)CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13881.Method339().Method3626());
        }
        if (CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13878.Method365()) {
            YEC2vmGrG7Xj6tWTtGpyrRyD7hXArvDM.drawRect((int)this.x, (int)this.y, (int)n3, (int)(this.y + (int)((long)-278755621 ^ (long)-278755622)), (int)CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13879.Method339().Method3626());
            YEC2vmGrG7Xj6tWTtGpyrRyD7hXArvDM.drawRect((int)this.x, (int)this.y, (int)(this.x + (int)((long)-899365385 ^ (long)-899365386)), (int)n4, (int)CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13879.Method339().Method3626());
            YEC2vmGrG7Xj6tWTtGpyrRyD7hXArvDM.drawRect((int)this.x, (int)(n4 - (int)((long)2093857161 ^ (long)2093857160)), (int)n3, (int)n4, (int)CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13879.Method339().Method3626());
            YEC2vmGrG7Xj6tWTtGpyrRyD7hXArvDM.drawRect((int)(n3 - (int)((long)-1526330141 ^ (long)-1526330142)), (int)this.y, (int)n3, (int)n4, (int)CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13879.Method339().Method3626());
        }
        this.Field17185.drawString(this.displayString, this.x + ((int)((long)-1883137756 ^ (long)-1883137755) << 1), this.y + ((int)((long)993884075 ^ (long)993884074) << 1), CDeE2WCyZmbnGcFXCAWM9LCtfN476i6Z.Field13877.Field13882.Method339().Method3626());
    }

    @Override
    public void onClick(GuiScreen guiScreen) {
    }
}

