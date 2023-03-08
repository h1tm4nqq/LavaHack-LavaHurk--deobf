//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.text.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.gui.*;

@SideOnly(Side.CLIENT)
public class Class123 extends Class1806
{
    private TextFormatting Field8429;
    private FontRenderer Field8430;
    private String Field8431 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class123(final int n, final int n2, final int n3, final FontRenderer field8430, final TextFormatting field8431) {
        super(n, n2, n3, 0, 0, null);
        this.Field8430 = field8430;
        this.Field8429 = field8431;
        this.width = 7;
        this.height = 7;
    }
    
    public void Method854(final Minecraft minecraft, final int n, final int n2, final float n3) {
        GlStateManager.pushMatrix();
        final float intBitsToFloat = Float.intBitsToFloat(1060320051);
        GlStateManager.scale(intBitsToFloat, intBitsToFloat, intBitsToFloat);
        final int n4 = (int)(this.x / intBitsToFloat);
        final int n5 = (int)(this.y / intBitsToFloat);
        final int n6 = (int)((this.x + this.width) / intBitsToFloat);
        final int n7 = (int)((this.y + this.height) / intBitsToFloat);
        if (this.Field8429.isColor()) {
            drawRect(n4, n5, n6, n7, 0xFF000000 | this.Field8430.getColorCode(this.Field8429.toString().charAt(1)));
        }
        else {
            this.Field8430.drawString(this.Field8429.toString().substring(1), n4 + 2, n5 + 1, Class1288.Field13877.Field13882.Method339().Method3626());
        }
        if (Class1288.Field13877.Field13878.Method365()) {
            drawRect(n4, n5, n6, n5 + 1, Class1288.Field13877.Field13879.Method339().Method3626());
            drawRect(n4, n5, n4 + 1, n7, Class1288.Field13877.Field13879.Method339().Method3626());
            drawRect(n4, n7 - 1, n6, n7, Class1288.Field13877.Field13879.Method339().Method3626());
            drawRect(n6 - 1, n5, n6, n7, Class1288.Field13877.Field13879.Method339().Method3626());
        }
        GlStateManager.popMatrix();
    }
    
    @Override
    public void onClick(final GuiScreen guiScreen) {
        ((Class427)guiScreen).appendFormat(this.Field8429.toString());
    }
}
