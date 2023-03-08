//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;

public class Class1163 extends Class22
{
    public float Field13254;
    public Class340 Field13255;
    private String Field13256 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1163(final Class340 field13255, final Color color, final float field13256) {
        super(field13255.Method1672(), color, false, 1.0f);
        this.Field13255 = field13255;
        this.Field13254 = field13256;
    }
    
    @Override
    public void Method190() {
        super.Method190();
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        Class92.Field8312.Method783();
        Class92.Field8312.Method788("color", (float)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getRed(), (float)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getGreen(), (float)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getBlue(), (float)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getAlpha());
        Class92.Field8312.Method786("resolution", (float)Minecraft.getMinecraft().displayWidth, (float)Minecraft.getMinecraft().displayHeight);
        Class92.Field8312.Method786("center", (this.Field13255.Method1673() + (this.Field13255.Method1675() - this.Field13255.Method1673()) / 2.0f) * 2.0f, (this.Field13255.Method1674() + (this.Field13255.Method1676() - this.Field13255.Method1674()) / 2.0f) * 2.0f);
        Class92.Field8312.Method786("dst", (this.Field13255.Method1675() - this.Field13255.Method1673() - this.Field13254) * 2.0f, (this.Field13255.Method1675() - this.Field13255.Method1673() - this.Field13254) * 2.0f);
        Class92.Field8312.Method785("radius", this.Field13254);
        GL11.glBegin(7);
        this.Field13255.Method1677();
        GL11.glEnd();
        Class92.Field8312.Method789();
        GL11.glEnable(3008);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
    
    private static String Method4689(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x32B3 ^ 0xE8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
