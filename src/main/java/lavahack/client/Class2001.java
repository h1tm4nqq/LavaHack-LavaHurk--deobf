//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.relauncher.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;

@SideOnly(Side.CLIENT)
public class Class2001 extends Class1806
{
    public FontRenderer Field17185;
    private int Field17186;
    
    public Class2001(final int n, final int n2, final int n3, final String s) {
        super(n, n2, n3, 0, 0, s);
        this.Field17185 = Minecraft.getMinecraft().fontRenderer;
        this.width = this.Field17185.getStringWidth(this.displayString) + 4;
        this.height = this.Field17185.FONT_HEIGHT + 4;
    }
    
    public void Method7423(final Minecraft minecraft, final int n, final int n2, final float n3) {
        if (this.enabled) {
            final int n4 = this.x + this.width;
            final int n5 = this.y + this.height;
            if (Class1288.Field13877.Field13880.Method365()) {
                drawRect(this.x, this.y, n4, n5, Class1288.Field13877.Field13881.Method339().Method3626());
            }
            if (Class1288.Field13877.Field13878.Method365()) {
                drawRect(this.x, this.y, n4, this.y + 1, Class1288.Field13877.Field13879.Method339().Method3626());
                drawRect(this.x, this.y, this.x + 1, n5, Class1288.Field13877.Field13879.Method339().Method3626());
                drawRect(this.x, n5 - 1, n4, n5, Class1288.Field13877.Field13879.Method339().Method3626());
                drawRect(n4 - 1, this.y, n4, n5, Class1288.Field13877.Field13879.Method339().Method3626());
            }
            this.Field17185.drawString(this.displayString, this.x + 2, this.y + 2, Class1288.Field13877.Field13882.Method339().Method3626());
        }
    }
    
    public void onClick(final GuiScreen guiScreen) {
    }
}
